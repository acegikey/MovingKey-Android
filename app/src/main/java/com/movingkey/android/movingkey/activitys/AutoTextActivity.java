package com.movingkey.android.movingkey.activitys;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.AutoTextAdapter;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.openLib.draglist.OnStartDragListener;
import com.movingkey.android.movingkey.openLib.draglist.SimpleItemTouchHelperCallback;

import java.util.ArrayList;

public class AutoTextActivity extends AppCompatActivity implements OnStartDragListener
{

    RecyclerView list_autoText;
    private ItemTouchHelper mItemTouchHelper;
    private AutoTextAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_text);


        /// 오토텍스트 추가 버튼 설정
        ImageButton topBackButton = (ImageButton)findViewById(R.id.btnAddAutoText);
        topBackButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showAddAutoTextPopUp(-20);
            }
        });



        /// 컨텐츠 부분 리스트 셋팅
        list_autoText = (RecyclerView)findViewById(R.id.list_autoText);


        adapter = new AutoTextAdapter(AutoTextActivity.this,AutoTextActivity.this);
        list_autoText.setHasFixedSize(true);
        list_autoText.setAdapter(adapter);
        list_autoText.setLayoutManager(new LinearLayoutManager(AutoTextActivity.this));

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(list_autoText);






    }


    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder)
    {
        mItemTouchHelper.startDrag(viewHolder);
    }



    void showAddAutoTextPopUp(final int positionOfEditing)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(AutoTextActivity.this);

        LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);

        RelativeLayout popupLayout = (RelativeLayout)inflater.inflate(R.layout.popup_add_auto_text,null);
        builder.setView(popupLayout);


        Button btnCancel = (Button)popupLayout.findViewById(R.id.btnCancel);
        Button btnSave = (Button)popupLayout.findViewById(R.id.btnSave);
        final EditText editTextAutoText = (EditText) popupLayout.findViewById(R.id.editTextAutoText);


        final AlertDialog dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        dialog.show();


        btnCancel.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                dialog.dismiss();
            }
        });


        btnSave.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String inputText = editTextAutoText.getText().toString();
                if(inputText.isEmpty())
                {
                    Toast.makeText(view.getContext(),"Please input Auto Text",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    ArrayList<String> autoTextArr = MovingKeyLib.getSharedObj().func01_getSharedSetting().setting10_autoTextArr;
                    /// 오토텍스트를 새로 만들려고 할 때
                    if(positionOfEditing < 0)
                    {

                        autoTextArr.add(inputText);

                    }
                    /// 오토텍스트가 기존의 것일때
                    else
                    {
                        autoTextArr.set(positionOfEditing,inputText);
                    }

                    MovingKeyLib.getSharedObj().func03_saveCurrentMemorySettingToFile(view.getContext());
                    dialog.dismiss();
                }
            }
        });

    }
}

package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.AutoTextAdapter;
import com.movingkey.android.movingkey.openLib.draglist.OnStartDragListener;
import com.movingkey.android.movingkey.openLib.draglist.SimpleItemTouchHelperCallback;

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

        list_autoText = (RecyclerView)findViewById(R.id.list_autoText);


        adapter = new AutoTextAdapter(AutoTextActivity.this,AutoTextActivity.this);
        list_autoText.setHasFixedSize(true);
        list_autoText.setAdapter(adapter);
        list_autoText.setLayoutManager(new LinearLayoutManager(AutoTextActivity.this));

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(list_autoText);

        /*
        final RecyclerView listview_selected = (RecyclerView)findViewById(R.id.listview_selected);
        adapterForSelectedLang = new LanguageAndLayoutDragListAdapter(LanguageAndLayoutActivity.this, LanguageAndLayoutActivity.this);
        listview_selected.setHasFixedSize(true);
        listview_selected.setAdapter(adapterForSelectedLang);
        listview_selected.setLayoutManager(new LinearLayoutManager(LanguageAndLayoutActivity.this));

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapterForSelectedLang);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(listview_selected);

        */


    }


    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder)
    {
        mItemTouchHelper.startDrag(viewHolder);
    }
}

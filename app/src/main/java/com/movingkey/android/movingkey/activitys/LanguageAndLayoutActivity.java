package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.LanguageAndLayoutListAdapter;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.woxthebox.draglistview.DragListView;

public class LanguageAndLayoutActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_and_layout);

        loadLanguageSettings();
    }


    void loadLanguageSettings()
    {
        /// 선택된 언어+레이아웃 데이터 불러와서 리스트뷰에 셋팅
        Log.d("HWI","loadLanguageSettings 호출 테스트");
        LanguageAndLayoutListAdapter selectedLangAdapter = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,true);

        final DragListView selectedListView = (DragListView)findViewById(R.id.listview_selected);
        selectedListView.getRecyclerView().setVerticalScrollBarEnabled(false);


        selectedListView.setAdapter(selectedLangAdapter);





        LanguageAndLayoutListAdapter unSelectedLangAdapater = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,false);
        final ListView listview_available = (ListView)findViewById(R.id.listview_available);
        listview_available.setAdapter(unSelectedLangAdapater);

        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(selectedListView);
        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(listview_available);



    }




}

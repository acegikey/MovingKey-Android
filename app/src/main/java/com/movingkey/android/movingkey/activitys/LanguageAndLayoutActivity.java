package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.ListView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.LangAndLayoutListDragAdapter;
import com.movingkey.android.movingkey.adapters.LanguageAndLayoutListAdapter;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.customLib.MovingKeySetting;
import com.woxthebox.draglistview.DragListView;

import java.util.ArrayList;

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




        final MovingKeyLib mvlib = MovingKeyLib.getSharedObj();


        /// 무빙키 셋팅정보가 메모리가 없으면 파일에서 불러옴
        if (mvlib.func01_getSharedSetting() == null)
        {
            mvlib.func02_loadMovingKeySettingFromFileAndLoadMemory(LanguageAndLayoutActivity.this);
        }


        MovingKeySetting curSetting = mvlib.func01_getSharedSetting();
        ArrayList<LangAndLayout> selectedGroup = curSetting.setting04_selectedSetGroup;


//        LanguageAndLayoutListAdapter selectedLangAdapter = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,true);
        DragListView selectedListView = (DragListView)findViewById(R.id.listview_selected);
        selectedListView.getRecyclerView().setVerticalScrollBarEnabled(false);


        ArrayList<Pair<Long, LangAndLayout>> mItemArray = new ArrayList<>();
        for (int i = 0; i < selectedGroup.size(); i++)
        {
            LangAndLayout oneObj = selectedGroup.get(i);
            mItemArray.add(new Pair<>(Long.valueOf(i), oneObj));
        }

        LangAndLayoutListDragAdapter selectedLangAdapter = new LangAndLayoutListDragAdapter(mItemArray,R.layout.list_lang_select01,true);
        selectedListView.setAdapter(selectedLangAdapter,true);
        selectedListView.setLayoutManager(new LinearLayoutManager(LanguageAndLayoutActivity.this));




        LanguageAndLayoutListAdapter unSelectedLangAdapater = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this);
        final ListView listview_available = (ListView)findViewById(R.id.listview_available);
        listview_available.setAdapter(unSelectedLangAdapater);

//        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(selectedListView);

        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(listview_available);



    }




}

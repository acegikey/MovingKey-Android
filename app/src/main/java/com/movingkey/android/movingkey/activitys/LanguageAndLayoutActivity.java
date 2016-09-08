package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.Log;
import android.widget.ListView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.LanguageAndLayoutDragListAdapter;
import com.movingkey.android.movingkey.adapters.LanguageAndLayoutListAdapter;
import com.movingkey.android.movingkey.customLib.HWILib;
import com.movingkey.android.movingkey.interfaces.AdapterEvent;
import com.movingkey.android.movingkey.openLib.draglist.OnStartDragListener;
import com.movingkey.android.movingkey.openLib.draglist.SimpleItemTouchHelperCallback;

public class LanguageAndLayoutActivity extends AppCompatActivity implements OnStartDragListener, AdapterEvent
{
    private ItemTouchHelper mItemTouchHelper;

    LanguageAndLayoutDragListAdapter adapterForSelectedLang;
    LanguageAndLayoutListAdapter unSelectedLangAdapater;


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
        /*
        LanguageAndLayoutListAdapter selectedLangAdapter = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,true);
        final ListView selectedListView = (ListView)findViewById(R.id.listview_selected);
        selectedListView.setAdapter(selectedLangAdapter);
        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(selectedListView);
        */

        /// 드래그 할 수 있는 뷰
        final RecyclerView listview_selected = (RecyclerView)findViewById(R.id.listview_selected);
        adapterForSelectedLang = new LanguageAndLayoutDragListAdapter(LanguageAndLayoutActivity.this, LanguageAndLayoutActivity.this);
        listview_selected.setHasFixedSize(true);
        listview_selected.setAdapter(adapterForSelectedLang);
        listview_selected.setLayoutManager(new LinearLayoutManager(LanguageAndLayoutActivity.this));

        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapterForSelectedLang);
        mItemTouchHelper = new ItemTouchHelper(callback);
        mItemTouchHelper.attachToRecyclerView(listview_selected);





        /// 하단에 선택되지 않은 리스트뷰
        unSelectedLangAdapater = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,false);
        ListView listview_available = (ListView)findViewById(R.id.listview_available);
        listview_available.setAdapter(unSelectedLangAdapater);


        HWILib.getSharedObj().func02_setListViewHeightBasedOnChildren(listview_available);




    }


    @Override
    public void onStartDrag(RecyclerView.ViewHolder viewHolder)
    {
        mItemTouchHelper.startDrag(viewHolder);
    }

    @Override
    public void OnNeedDataRefresh()
    {
        adapterForSelectedLang.refreshData();
        unSelectedLangAdapater.refreshData();
        adapterForSelectedLang.notifyDataSetChanged();
        unSelectedLangAdapater.notifyDataSetChanged();

    }
}

package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.adapters.LanguageAndLayoutListAdapter;

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
        LanguageAndLayoutListAdapter selectedLangAdapter = new LanguageAndLayoutListAdapter(LanguageAndLayoutActivity.this,true);

        ListView selectedListView = (ListView)findViewById(R.id.listview_selected);
        selectedListView.setAdapter(selectedLangAdapter);

    }




}

package com.movingkey.android.movingkey.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.customLib.MovingKeySetting;

import java.util.ArrayList;

/**
 * Created by iankim on 2016. 9. 5..
 */
public class LanguageAndLayoutListAdapter extends BaseAdapter
{
    private ArrayList<LangAndLayout> itemList;
    private Context context;
    private boolean isSelected;
    public LanguageAndLayoutListAdapter(Context context, boolean isSelected)
    {
        this.context = context;
        this.isSelected = isSelected;

        final MovingKeyLib mvlib = MovingKeyLib.getSharedObj();


        /// 무빙키 셋팅정보가 메모리가 없으면 파일에서 불러옴
        if (mvlib.func01_getSharedSetting() == null)
        {
            mvlib.func02_loadMovingKeySettingFromFileAndLoadMemory(context);
        }

        MovingKeySetting curSetting = mvlib.func01_getSharedSetting();
        this.itemList = curSetting.setting04_selectedSetGroup;


        /// 데이터 로그를 보기 위한 부분
        /*
        if( curSetting.setting04_selectedSetGroup.size() > 0 )
        {

            for(int i=0; i < curSetting.setting04_selectedSetGroup.size() ; i++)
            {
                LangAndLayout oneLangAndLayout = curSetting.setting04_selectedSetGroup.get(i);
                Log.d("HWI","언어 : "+oneLangAndLayout.language+" 레이아웃 : "+oneLangAndLayout.layout);

            }

        }
        else
        {
            Log.e("HWI","문제 발생 --> 선택한 언어+레이아웃 조합이 한개도 없는 경우는 있을 수 없습니다");
        }
        */

    }

    @Override
    public int getCount()
    {
        if(itemList != null)
        {
            return itemList.size();
        }
        else
        {
            return 0;
        }

    }

    @Override
    public Object getItem(int i)
    {
        if(itemList != null)
        {
            return itemList;
        }
        else
        {
            return null;
        }
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        /// 선택된 레이아웃일 경우
        if(isSelected)
        {
            convertView = inflater.inflate(R.layout.list_lang_select01,null);
        }
        /// 선택되지 않은 레이아웃일 경우
        else
        {
            convertView = inflater.inflate(R.layout.list_lang_select02,null);
        }



        return convertView;
    }
}

package com.movingkey.android.movingkey.adapters;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

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

    /**
     * 언어+레이아웃 조합 형태의 정보객체들로 이루어진 어댑터 생성
     *
     * @param context 컨텍스트
     * @param  isSelected 사용자가 선택한 언어+레이아웃 그룹 or 선택되지 않은 그룹인지 여부
     * */
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

        if(isSelected)
        {
            this.itemList = curSetting.setting04_selectedSetGroup;
        }
        else
        {

            this.itemList = mvlib.func11_getUnSelectedLangAndLayouts(context);
        }


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

        if(convertView == null)
        {
            convertView = inflater.inflate(R.layout.list_lang_select02,null);
        }


        final LangAndLayout oneItem = itemList.get(position);
        TextView textview_cur_lang_name = (TextView)convertView.findViewById(R.id.textview_cur_lang_name);
        textview_cur_lang_name.setText(MovingKeyLib.getSharedObj().func12_getLanguageFullNameFromCode(oneItem.language));

        TextView textview_cur_layout_name = (TextView)convertView.findViewById(R.id.textview_cur_layout_name);



        if(textview_cur_layout_name != null)
        {
            textview_cur_layout_name.setText(oneItem.layout);
        }

        TextView textview_select_keyboard_layout = (TextView)convertView.findViewById(R.id.textview_select_keyboard_layout);

        convertView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                showSelectLayoutPopup(oneItem);
            }
        });


        return convertView;
    }

    void showSelectLayoutPopup(LangAndLayout langAndLayoutModel)
    {
        AlertDialog.Builder alertDiaBuilder = new AlertDialog.Builder(context);

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);


        RelativeLayout dialogView = (RelativeLayout)inflater.inflate(R.layout.popup_keyboard_layout_select,null);



        ListView layoutSelectList = (ListView)dialogView.findViewById(R.id.list_select_layout);

        layoutSelectList.setAdapter(new SelectLayoutPopupListAdapter(context,langAndLayoutModel));


        alertDiaBuilder.setView(dialogView);
        alertDiaBuilder.setCancelable(true);

        AlertDialog dialog = alertDiaBuilder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialog.show();
    }


    class SelectLayoutPopupListAdapter extends BaseAdapter
    {
        Context context;
        LangAndLayout onelangAndLAyout;
        ArrayList<String> availableLayoutArr;

        public SelectLayoutPopupListAdapter(Context context, LangAndLayout onelangAndLAyout)
        {
            this.context = context;
            this.onelangAndLAyout = onelangAndLAyout;
            this.availableLayoutArr = MovingKeyLib.getSharedObj().func13_getSupportLayoutArr(onelangAndLAyout.language);
        }


        @Override
        public int getCount()
        {
            if(availableLayoutArr != null)
            {
                return availableLayoutArr.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int i)
        {
            if(availableLayoutArr != null)
            {
                return this.availableLayoutArr.get(i);
            }
            return null;
        }

        @Override
        public long getItemId(int position)
        {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup viewGroup)
        {

            if(convertView == null)
            {
                LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
                RelativeLayout itemView = (RelativeLayout)inflater.inflate(R.layout.popup_keyboard_list_item,null);
                convertView = itemView;
            }

            final String oneLayoutName = this.availableLayoutArr.get(position);

            TextView textview_layout_name =  (TextView)convertView.findViewById(R.id.textview_layout_name);
            RelativeLayout bottomline =  (RelativeLayout)convertView.findViewById(R.id.bottomline);

            textview_layout_name.setText(oneLayoutName);

            if(position == this.availableLayoutArr.size() - 1)
            {
                bottomline.setVisibility(View.GONE);
            }
            else
            {
                bottomline.setVisibility(View.VISIBLE);
            }


            convertView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View view)
                {

                    MovingKeyLib.getSharedObj().func14_changeLayoutWithLang(context,onelangAndLAyout,oneLayoutName);
                }
            });


            return convertView;
        }
    }

}
package com.movingkey.android.movingkey.adapters;

/**
 * Created by hwi on 2016. 9. 7..
 */

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;

import java.util.ArrayList;




public class SelectLayoutPopupListAdapter extends BaseAdapter
{
    Context context;
    LangAndLayout onelangAndLAyout;
    ArrayList<String> availableLayoutArr;
    Dialog dialog;
    public SelectLayoutPopupListAdapter(Context context, LangAndLayout onelangAndLAyout, Dialog dialog)
    {
        this.context = context;
        this.onelangAndLAyout = onelangAndLAyout;
        this.availableLayoutArr = MovingKeyLib.getSharedObj().func13_getSupportLayoutArr(onelangAndLAyout.language);
        this.dialog = dialog;
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
                dialog.dismiss();
            }
        });


        return convertView;
    }


}

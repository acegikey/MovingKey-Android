package com.movingkey.android.movingkey.adapters;


import android.support.v4.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.woxthebox.draglistview.DragItemAdapter;

import java.util.ArrayList;

/**
 * Created by iankim on 2016. 9. 6..
 */
public class LangAndLayoutListDragAdapter extends DragItemAdapter<Pair<Long, LangAndLayout>, LangAndLayoutListDragAdapter.ViewHolder>
{

    private int mLayoutId;


    public LangAndLayoutListDragAdapter(ArrayList<Pair<Long, LangAndLayout>> list, int layoutId, boolean dragOnLongPress)
    {
        super(dragOnLongPress);
        mLayoutId = layoutId;
        setHasStableIds(true);
        setItemList(list);
    }




    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(mLayoutId, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        super.onBindViewHolder(holder, position);

        String language = mItemList.get(position).second.language;
        holder.textview_cur_lang_name.setText(language);

        String layout = mItemList.get(position).second.layout;
        holder.textview_cur_layout_name.setText(layout);



//        holder.itemView.setTag(text);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class ViewHolder extends DragItemAdapter<Pair<Long, LangAndLayout>, LangAndLayoutListDragAdapter.ViewHolder>.ViewHolder {
        public TextView textview_cur_lang_name;
        public TextView textview_cur_layout_name;


        public ViewHolder(final View itemView)
        {
            super(itemView, R.id.grabImage);
            textview_cur_lang_name = (TextView) itemView.findViewById(R.id.textview_cur_lang_name);
            textview_cur_layout_name = (TextView) itemView.findViewById(R.id.textview_cur_layout_name);

        }

        @Override
        public void onItemClicked(View view) {
            Toast.makeText(view.getContext(), "Item clicked", Toast.LENGTH_SHORT).show();
        }

        @Override
        public boolean onItemLongClicked(View view) {
            Toast.makeText(view.getContext(), "Item long clicked", Toast.LENGTH_SHORT).show();
            return true;
        }
    }
}

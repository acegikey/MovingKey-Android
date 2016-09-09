package com.movingkey.android.movingkey.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.openLib.draglist.ItemTouchHelperAdapter;
import com.movingkey.android.movingkey.openLib.draglist.ItemTouchHelperViewHolder;
import com.movingkey.android.movingkey.openLib.draglist.OnStartDragListener;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by iankim on 2016. 9. 8..
 */
public class AutoTextAdapter extends RecyclerView.Adapter<AutoTextAdapter.ItemViewHolder> implements ItemTouchHelperAdapter
{

    private ArrayList<String> autoTextArr;


    private OnStartDragListener mDragStartListener;
    Context context;

    public AutoTextAdapter(Context context, OnStartDragListener dragStartListener)
    {
        autoTextArr = MovingKeyLib.getSharedObj().func01_getSharedSetting().setting10_autoTextArr;
        this.mDragStartListener = mDragStartListener;
    }

    @Override
    public AutoTextAdapter.ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_autotext01_content, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position)
    {
        holder.textview_content.setText(autoTextArr.get(position));


    }



    @Override
    public int getItemCount()
    {
        return autoTextArr.size();
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition)
    {
        Collections.swap(autoTextArr, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        MovingKeyLib.getSharedObj().func03_saveCurrentMemorySettingToFile(context);
        return true;
    }


    @Override
    public void onItemDismiss(int position)
    {
        autoTextArr.remove(position);
        notifyItemRemoved(position);

        MovingKeyLib.getSharedObj().func03_saveCurrentMemorySettingToFile(context);
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder implements ItemTouchHelperViewHolder
    {

        public final TextView textview_content;

        public final ImageView handleView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textview_content = (TextView) itemView.findViewById(R.id.textview_content);

            handleView = (ImageView) itemView.findViewById(R.id.grabImage);
        }

        @Override
        public void onItemSelected() {
            itemView.setBackgroundColor(Color.LTGRAY);
        }

        @Override
        public void onItemClear() {
            itemView.setBackgroundColor(0);
        }
    }


}

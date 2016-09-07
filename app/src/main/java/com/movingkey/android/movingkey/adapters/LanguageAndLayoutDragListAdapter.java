package com.movingkey.android.movingkey.adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.openLib.draglist.ItemTouchHelperAdapter;
import com.movingkey.android.movingkey.openLib.draglist.ItemTouchHelperViewHolder;
import com.movingkey.android.movingkey.openLib.draglist.OnStartDragListener;

import java.util.Collections;
import java.util.List;

/**
 * Created by hwi on 2016. 9. 7..
 */
public class LanguageAndLayoutDragListAdapter extends RecyclerView.Adapter<LanguageAndLayoutDragListAdapter.ItemViewHolder> implements ItemTouchHelperAdapter
{



    private final List<LangAndLayout> mItems;

    private final OnStartDragListener mDragStartListener;

    public LanguageAndLayoutDragListAdapter(Context context, OnStartDragListener dragStartListener)
    {
        mDragStartListener = dragStartListener;
        mItems = MovingKeyLib.getSharedObj().func01_getSharedSetting().setting04_selectedSetGroup;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_lang_select01, parent, false);
        ItemViewHolder itemViewHolder = new ItemViewHolder(view);
        return itemViewHolder;
    }

    @Override
    public void onBindViewHolder(final ItemViewHolder holder, int position) {

        holder.textview_cur_lang_name.setText(MovingKeyLib.getSharedObj().func12_getLanguageFullNameFromCode(mItems.get(position).language));
        holder.textview_cur_layout_name.setText(mItems.get(position).layout);


        // Start a drag whenever the handle view it touched
        holder.handleView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (MotionEventCompat.getActionMasked(event) == MotionEvent.ACTION_DOWN) {
                    mDragStartListener.onStartDrag(holder);
                }
                return false;
            }
        });
    }

    @Override
    public void onItemDismiss(int position) {
        mItems.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public boolean onItemMove(int fromPosition, int toPosition) {
        Collections.swap(mItems, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
        return true;
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder implements
            ItemTouchHelperViewHolder
    {

        public final TextView textview_cur_lang_name;
        public final TextView textview_cur_layout_name;

        public final ImageView handleView;

        public ItemViewHolder(View itemView) {
            super(itemView);
            textview_cur_lang_name = (TextView) itemView.findViewById(R.id.textview_cur_lang_name);
            textview_cur_layout_name = (TextView) itemView.findViewById(R.id.textview_cur_layout_name);

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

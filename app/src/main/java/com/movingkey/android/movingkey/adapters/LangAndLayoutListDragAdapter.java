package com.movingkey.android.movingkey.adapters;

import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.movingkey.android.movingkey.R;
import com.woxthebox.draglistview.DragItemAdapter;

/**
 * Created by iankim on 2016. 9. 6..
 */
public class LangAndLayoutListDragAdapter extends DragItemAdapter
{
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {

    }

    public class ViewHolder extends DragItemAdapter<Pair<Long, String>, ItemAdapter.ViewHolder>.ViewHolder {
        public TextView mText;

        public ViewHolder(final View itemView) {
            super(itemView, mGrabHandleId);
            mText = (TextView) itemView.findViewById(R.id.text);
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

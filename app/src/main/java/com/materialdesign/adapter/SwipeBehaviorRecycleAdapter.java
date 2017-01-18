package com.materialdesign.adapter;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.materialdesign.Constants;
import com.materialdesign.R;

/**
 * Created by Administrator on 2017/1/13.
 */

public class SwipeBehaviorRecycleAdapter extends RecyclerView.Adapter<SwipeBehaviorRecycleAdapter.ViewHolder> {

    private Context mContext;
    private int mCount;

    public SwipeBehaviorRecycleAdapter(Context context, int count) {
        this.mContext = context;
        this.mCount = count;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.view_empty_cardview, null, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        SwipeDismissBehavior behavior = new SwipeDismissBehavior();
        behavior.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);

        ((CoordinatorLayout.LayoutParams) holder.cardItem.getLayoutParams()).setBehavior(behavior);
        holder.cardItem.setCardBackgroundColor(mContext.getResources().getColor(Constants.MATERIAL_COLORS[position % Constants.MATERIAL_COLORS.length]));
    }

    @Override
    public int getItemCount() {
        return mCount;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View root;
        CardView cardItem;

        public ViewHolder(View itemView) {
            super(itemView);
            this.root = itemView;
            this.cardItem = (CardView) itemView.findViewById(R.id.view_cardView);
        }
    }
}

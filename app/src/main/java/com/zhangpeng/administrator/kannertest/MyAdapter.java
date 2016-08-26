package com.zhangpeng.administrator.kannertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2016/8/25.
 */
class MyAdapter extends RecyclerView.Adapter {
    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private View root;
        public ViewHolder(View root) {
            super(root);
            image = (ImageView) root.findViewById(R.id.image);

        }

        public ImageView getContent() {
            return image;
        }


    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,null));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
        int cd = data[position];

        vh.getContent().setImageResource(cd);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    private int[] data = new int[]{R.drawable.tuokou,R.drawable.qg,R.drawable.yy,R.drawable.yl,
            R.drawable.gd,R.drawable.lz,R.drawable.xs,R.drawable.xbt,};
}

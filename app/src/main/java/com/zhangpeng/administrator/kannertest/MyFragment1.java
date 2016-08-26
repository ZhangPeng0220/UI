package com.zhangpeng.administrator.kannertest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Administrator on 2016/8/9.
 */

    public class MyFragment1 extends Fragment {
    private Kanner kanner;
    private RecyclerView recyclerView;
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.tab01, container, false);
            kanner = (Kanner)view.findViewById(R.id.kanner);
            recyclerView =(RecyclerView) view.findViewById(R.id.rv);
            recyclerView.setLayoutManager(new GridLayoutManager(container.getContext(),2));
            recyclerView .addItemDecoration(new DividerGridItemDecoration(container.getContext() ));
            //recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
            recyclerView.setAdapter(new MyAdapter());
            int[] imagesRes = {R.drawable.a3,R.drawable.a1, R.drawable.a2
            };
            kanner.setImagesRes(imagesRes);
            return view;
        }
    }


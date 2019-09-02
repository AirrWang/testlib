package com.muheda.customtitleview.listener;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

public interface OnRecycleScrollChangeListener extends OnScrollChangeListener{

    void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState);

    void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy);
}

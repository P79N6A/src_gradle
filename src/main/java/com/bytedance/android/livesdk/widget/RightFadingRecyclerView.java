package com.bytedance.android.livesdk.widget;

import android.support.v7.widget.RecyclerView;

public class RightFadingRecyclerView extends RecyclerView {
    public float getLeftFadingEdgeStrength() {
        return 0.0f;
    }
}

package com.zhihu.matisse.internal.ui.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MediaGridInset extends RecyclerView.ItemDecoration {

    /* renamed from: a  reason: collision with root package name */
    private int f82723a;

    /* renamed from: b  reason: collision with root package name */
    private int f82724b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f82725c = false;

    public MediaGridInset(int i, int i2, boolean z) {
        this.f82723a = i;
        this.f82724b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = childAdapterPosition % this.f82723a;
        if (this.f82725c) {
            int i2 = this.f82724b;
            rect.left = i2 - ((i * i2) / this.f82723a);
            rect.right = ((i + 1) * this.f82724b) / this.f82723a;
            if (childAdapterPosition < this.f82723a) {
                rect.top = this.f82724b;
            }
            rect.bottom = this.f82724b;
            return;
        }
        rect.left = (this.f82724b * i) / this.f82723a;
        rect.right = this.f82724b - (((i + 1) * this.f82724b) / this.f82723a);
        if (childAdapterPosition >= this.f82723a) {
            rect.top = this.f82724b;
        }
    }
}

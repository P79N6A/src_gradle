package com.ss.android.ugc.aweme.profile.ui;

import android.support.v7.widget.GridLayoutManager;

public class DateStorySpanSizeLookup extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    private int[] f61781a;

    public int getSpanSize(int i) {
        if (this.f61781a == null || i < 0 || i >= this.f61781a.length) {
            return 1;
        }
        return this.f61781a[i];
    }
}

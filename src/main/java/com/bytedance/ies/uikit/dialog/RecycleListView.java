package com.bytedance.ies.uikit.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class RecycleListView extends ListView {
    boolean mRecycleOnMeasure = true;

    /* access modifiers changed from: protected */
    public boolean recycleOnMeasure() {
        return this.mRecycleOnMeasure;
    }

    public RecycleListView(Context context) {
        super(context);
    }

    public RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecycleListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

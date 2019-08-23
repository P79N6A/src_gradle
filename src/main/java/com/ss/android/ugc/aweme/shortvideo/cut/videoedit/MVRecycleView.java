package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class MVRecycleView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66536a;

    /* renamed from: b  reason: collision with root package name */
    private double f66537b;

    public MVRecycleView(Context context) {
        super(context);
    }

    public void setflingScale(double d2) {
        this.f66537b = d2;
    }

    public MVRecycleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fling(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66536a, false, 75887, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f66536a, false, 75887, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        double d2 = (double) i;
        double d3 = this.f66537b;
        Double.isNaN(d2);
        return super.fling((int) (d2 * d3), i2);
    }

    public MVRecycleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

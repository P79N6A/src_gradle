package com.ss.android.ugc.aweme.framework.fresco;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewConfiguration;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class FrescoRecycleViewScrollListener extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48514a;

    /* renamed from: b  reason: collision with root package name */
    private int f48515b;

    public FrescoRecycleViewScrollListener(Context context) {
        this.f48515b = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f48514a, false, 45912, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f48514a, false, 45912, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            Fresco.getImagePipeline().resume();
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48514a, false, 45913, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f48514a, false, 45913, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.f48515b) {
            Fresco.getImagePipeline().resume();
        } else if (recyclerView.getScrollState() != 1 || abs < this.f48515b) {
            if (recyclerView.getScrollState() == 2) {
                Fresco.getImagePipeline().pause();
            }
        } else {
            Fresco.getImagePipeline().pause();
        }
    }
}

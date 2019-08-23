package com.ss.android.ugc.aweme.poi.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.transfer.b;
import com.ss.android.ugc.aweme.shortvideo.ui.InfiniteLoopPagerAdapter;

public class InfiniteLoopPoiBannerAdapter extends InfiniteLoopPagerAdapter implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59414a;

    /* renamed from: f  reason: collision with root package name */
    private View f59415f;
    private int g;

    public final int b() {
        return this.g;
    }

    public final View a() {
        return this.f59415f;
    }

    private void a(View view) {
        this.f59415f = view;
    }

    public InfiniteLoopPoiBannerAdapter(PagerAdapter pagerAdapter, int i, boolean z) {
        super(pagerAdapter);
        this.g = i;
        if (this.g > 0) {
            this.f70511e = z;
            return;
        }
        throw new IllegalArgumentException("loopSize should be a positive value");
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), obj}, this, f59414a, false, 64738, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), obj}, this, f59414a, false, 64738, new Class[]{View.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        super.setPrimaryItem(view, i, obj);
        a(view);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (PatchProxy.isSupport(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f59414a, false, 64737, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup, Integer.valueOf(i), obj}, this, f59414a, false, 64737, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE);
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        a(viewGroup);
    }
}

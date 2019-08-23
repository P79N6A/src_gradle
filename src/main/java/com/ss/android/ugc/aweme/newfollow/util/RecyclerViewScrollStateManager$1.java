package com.ss.android.ugc.aweme.newfollow.util;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class RecyclerViewScrollStateManager$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57397a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l f57398b;

    RecyclerViewScrollStateManager$1(l lVar) {
        this.f57398b = lVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57397a, false, 61966, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f57397a, false, 61966, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        this.f57398b.f57436b = i;
        if (this.f57398b.f57438d != null) {
            this.f57398b.f57438d.b(recyclerView, i);
        }
        if (i == 0) {
            if (this.f57398b.f57437c) {
                this.f57398b.e();
            }
            this.f57398b.f57437c = false;
            return;
        }
        if (i == 2) {
            this.f57398b.f57437c = true;
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView recyclerView2 = recyclerView;
        if (PatchProxy.isSupport(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57397a, false, 61967, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f57397a, false, 61967, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        if (this.f57398b.f57438d != null) {
            this.f57398b.f57438d.a(recyclerView, i2);
        }
        if (this.f57398b.f57436b == 1) {
            this.f57398b.e();
        }
        this.f57398b.b();
        this.f57398b.a();
        this.f57398b.c();
    }
}

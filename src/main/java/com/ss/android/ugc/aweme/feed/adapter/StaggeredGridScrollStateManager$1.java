package com.ss.android.ugc.aweme.feed.adapter;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class StaggeredGridScrollStateManager$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z f44785b;

    StaggeredGridScrollStateManager$1(z zVar) {
        this.f44785b = zVar;
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f44784a, false, 40648, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f44784a, false, 40648, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        this.f44785b.f44977c = i;
        if (i == 0) {
            if (this.f44785b.f44978d) {
                this.f44785b.c();
            }
            this.f44785b.f44978d = false;
            return;
        }
        if (i == 2) {
            this.f44785b.f44978d = true;
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44784a, false, 40649, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f44784a, false, 40649, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        this.f44785b.b();
        this.f44785b.a();
    }
}

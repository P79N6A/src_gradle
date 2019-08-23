package com.ss.android.ugc.aweme.poi.search;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

class BasePoiSearchLayout$1 extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f60309b;

    BasePoiSearchLayout$1(a aVar) {
        this.f60309b = aVar;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60308a, false, 65707, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f60308a, false, 65707, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrolled(recyclerView, i, i2);
        this.f60309b.f();
    }
}

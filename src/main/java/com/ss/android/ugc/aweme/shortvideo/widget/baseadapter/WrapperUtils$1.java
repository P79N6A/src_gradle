package com.ss.android.ugc.aweme.shortvideo.widget.baseadapter;

import android.support.v7.widget.GridLayoutManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.widget.baseadapter.a;

class WrapperUtils$1 extends GridLayoutManager.SpanSizeLookup {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71422a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a.C0743a f71423b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ GridLayoutManager f71424c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ GridLayoutManager.SpanSizeLookup f71425d;

    public final int getSpanSize(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71422a, false, 81562, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return this.f71423b.a(this.f71424c, this.f71425d, i);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71422a, false, 81562, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    WrapperUtils$1(a.C0743a aVar, GridLayoutManager gridLayoutManager, GridLayoutManager.SpanSizeLookup spanSizeLookup) {
        this.f71423b = aVar;
        this.f71424c = gridLayoutManager;
        this.f71425d = spanSizeLookup;
    }
}

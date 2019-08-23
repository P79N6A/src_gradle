package com.ss.android.ugc.aweme.poi.ui;

import android.content.Context;
import android.support.v7.widget.LinearSmoothScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.ui.w;

class PoiPureAwemeFeedViewHolder$1$1 extends LinearSmoothScroller {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ w.AnonymousClass1 f60477b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PoiPureAwemeFeedViewHolder$1$1(w.AnonymousClass1 r1, Context context) {
        super(context);
        this.f60477b = r1;
    }

    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60476a, false, 66121, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f60476a, false, 66121, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        return super.calculateDtToFit(i, i2, i3, i4, -1) + w.this.t.offset;
    }
}

package com.ss.android.ugc.aweme.poi.ui.accelerate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60519a;

    /* renamed from: b  reason: collision with root package name */
    private final AcceleratedPoiAwemeFeedViewHolder f60520b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60521c;

    b(AcceleratedPoiAwemeFeedViewHolder acceleratedPoiAwemeFeedViewHolder, boolean z) {
        this.f60520b = acceleratedPoiAwemeFeedViewHolder;
        this.f60521c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60519a, false, 66220, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60519a, false, 66220, new Class[0], Void.TYPE);
            return;
        }
        this.f60520b.c(this.f60521c);
    }
}

package com.ss.android.ugc.aweme.poi.ui.accelerate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60522a;

    /* renamed from: b  reason: collision with root package name */
    private final AcceleratedPoiAwemeFeedViewHolder f60523b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f60524c;

    c(AcceleratedPoiAwemeFeedViewHolder acceleratedPoiAwemeFeedViewHolder, boolean z) {
        this.f60523b = acceleratedPoiAwemeFeedViewHolder;
        this.f60524c = z;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f60522a, false, 66221, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60522a, false, 66221, new Class[0], Void.TYPE);
            return;
        }
        this.f60523b.c(this.f60524c);
    }
}

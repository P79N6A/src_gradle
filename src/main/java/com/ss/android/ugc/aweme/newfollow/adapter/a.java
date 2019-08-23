package com.ss.android.ugc.aweme.newfollow.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57076a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedAdapter f57077b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57078c;

    a(FeedAdapter feedAdapter, int i) {
        this.f57077b = feedAdapter;
        this.f57078c = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f57076a, false, 61055, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57076a, false, 61055, new Class[0], Void.TYPE);
            return;
        }
        this.f57077b.c(this.f57078c);
    }
}

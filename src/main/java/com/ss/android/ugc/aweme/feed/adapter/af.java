package com.ss.android.ugc.aweme.feed.adapter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class af implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44876a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoViewHolder f44877b;

    af(VideoViewHolder videoViewHolder) {
        this.f44877b = videoViewHolder;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f44876a, false, 40852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44876a, false, 40852, new Class[0], Void.TYPE);
            return;
        }
        this.f44877b.Z();
    }
}

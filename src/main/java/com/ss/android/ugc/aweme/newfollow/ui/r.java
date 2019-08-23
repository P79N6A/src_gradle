package com.ss.android.ugc.aweme.newfollow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class r implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57329a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoFollowFeedDetailActivity f57330b;

    r(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity) {
        this.f57330b = videoFollowFeedDetailActivity;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57329a, false, 61732, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57329a, false, 61732, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f57330b.b(z);
    }
}

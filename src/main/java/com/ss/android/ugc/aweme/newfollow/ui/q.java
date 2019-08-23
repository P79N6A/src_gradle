package com.ss.android.ugc.aweme.newfollow.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class q implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57327a;

    /* renamed from: b  reason: collision with root package name */
    private final VideoFollowFeedDetailActivity f57328b;

    q(VideoFollowFeedDetailActivity videoFollowFeedDetailActivity) {
        this.f57328b = videoFollowFeedDetailActivity;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57327a, false, 61731, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57327a, false, 61731, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f57328b.c(z);
    }
}

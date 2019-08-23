package com.bytedance.android.livesdk.feed.fragment;

import com.bytedance.android.live.uikit.refresh.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements b.C0070b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14148a;

    /* renamed from: b  reason: collision with root package name */
    private final BaseTabFeedFragment f14149b;

    h(BaseTabFeedFragment baseTabFeedFragment) {
        this.f14149b = baseTabFeedFragment;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14148a, false, 8642, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14148a, false, 8642, new Class[0], Void.TYPE);
            return;
        }
        this.f14149b.m();
    }
}

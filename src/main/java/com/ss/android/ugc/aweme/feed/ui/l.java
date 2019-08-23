package com.ss.android.ugc.aweme.feed.ui;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class l implements Function0 {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46676a;

    /* renamed from: b  reason: collision with root package name */
    private final FeedFollowFragment f46677b;

    l(FeedFollowFragment feedFollowFragment) {
        this.f46677b = feedFollowFragment;
    }

    public final Object invoke() {
        if (PatchProxy.isSupport(new Object[0], this, f46676a, false, 42609, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f46676a, false, 42609, new Class[0], Object.class);
        }
        FeedFollowFragment feedFollowFragment = this.f46677b;
        feedFollowFragment.a(false, true, false);
        if (ag.d()) {
            feedFollowFragment.a((View) feedFollowFragment.mSkyLightStyleBTxt, true, true);
        }
        return null;
    }
}

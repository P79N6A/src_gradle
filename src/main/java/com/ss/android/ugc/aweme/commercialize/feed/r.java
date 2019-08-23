package com.ss.android.ugc.aweme.commercialize.feed;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38852a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38853b;

    public r(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38853b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38852a, false, 30697, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38852a, false, 30697, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38853b;
        Context context = commerceVideoDelegate.k;
        Aweme aweme = commerceVideoDelegate.f38688e;
        if (PatchProxy.isSupport(new Object[]{context, aweme}, null, g.f39316a, true, 31766, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, aweme}, null, g.f39316a, true, 31766, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            return;
        }
        g.b(context, "play_15s", aweme, g.f(context, aweme, "play_15s"));
    }
}

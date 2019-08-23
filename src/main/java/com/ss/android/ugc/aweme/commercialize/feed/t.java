package com.ss.android.ugc.aweme.commercialize.feed;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collection;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38857a;

    /* renamed from: b  reason: collision with root package name */
    private final CommerceVideoDelegate f38858b;

    public t(CommerceVideoDelegate commerceVideoDelegate) {
        this.f38858b = commerceVideoDelegate;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f38857a, false, 30699, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38857a, false, 30699, new Class[0], Void.TYPE);
            return;
        }
        CommerceVideoDelegate commerceVideoDelegate = this.f38858b;
        u uVar = new u(commerceVideoDelegate);
        Aweme aweme = commerceVideoDelegate.f38688e;
        if (PatchProxy.isSupport(new Object[]{aweme, 100, uVar}, null, g.f39316a, true, 31724, new Class[]{Aweme.class, Integer.TYPE, g.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, 100, uVar}, null, g.f39316a, true, 31724, new Class[]{Aweme.class, Integer.TYPE, g.a.class}, Void.TYPE);
            return;
        }
        if (aweme != null) {
            g.a((g.a) uVar, (Collection<String>) aweme.getRawAdPlayNodeTrackUrlList(100), false);
        }
    }
}

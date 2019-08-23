package com.ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.commercialize.model.l;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class z implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39841a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39842b;

    z(Aweme aweme) {
        this.f39842b = aweme;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f39841a, false, 32519, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f39841a, false, 32519, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Aweme aweme = this.f39842b;
        if (z) {
            Context a2 = d.a();
            if (PatchProxy.isSupport(new Object[]{a2, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31498, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a2, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31498, new Class[]{Context.class, Aweme.class}, Void.TYPE);
            } else {
                if (com.ss.android.ugc.aweme.commercialize.log.g.S(a2, aweme)) {
                    com.ss.android.ugc.aweme.commercialize.log.g.a(a2, "landing_deeplink_success", aweme, com.ss.android.ugc.aweme.commercialize.log.g.f(a2, aweme, "landing ad deeplink success"));
                    com.ss.android.ugc.aweme.commercialize.log.g.a(new l.a().a("landing_ad").a(System.currentTimeMillis() - 5000).a(aweme.getAwemeRawAd()).a());
                }
            }
        } else {
            Context a3 = d.a();
            if (PatchProxy.isSupport(new Object[]{a3, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31499, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{a3, aweme}, null, com.ss.android.ugc.aweme.commercialize.log.g.f39316a, true, 31499, new Class[]{Context.class, Aweme.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.log.g.a(a3, "landing_deeplink_failed", aweme, com.ss.android.ugc.aweme.commercialize.log.g.f(a3, aweme, "landing ad deeplink failed"));
        }
    }
}

package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39839a;

    /* renamed from: b  reason: collision with root package name */
    public static Aweme f39840b;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f39839a, true, 32516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f39839a, true, 32516, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = f39840b;
        if (aweme != null) {
            g.a(d.a(), aweme);
        }
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f39839a, true, 32517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f39839a, true, 32517, new Class[0], Void.TYPE);
            return;
        }
        Aweme aweme = f39840b;
        if (aweme != null) {
            g.a((g.a) new z(aweme));
        }
    }

    public static void a(Aweme aweme) {
        f39840b = aweme;
    }
}

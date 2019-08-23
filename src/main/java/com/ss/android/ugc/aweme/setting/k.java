package com.ss.android.ugc.aweme.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.playerkit.c.c;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63980a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f63981b;

    public static boolean b() {
        return f63981b;
    }

    public static c.a a() {
        if (PatchProxy.isSupport(new Object[0], null, f63980a, true, 72048, new Class[0], c.a.class)) {
            return (c.a) PatchProxy.accessDispatch(new Object[0], null, f63980a, true, 72048, new Class[0], c.a.class);
        }
        if (a.a()) {
            return c.a.values()[((j) com.ss.android.ugc.aweme.base.sharedpref.c.a(d.a(), j.class)).a()];
        }
        return c.a.Ijk;
    }

    public static void a(c.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, null, f63980a, true, 72049, new Class[]{c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, null, f63980a, true, 72049, new Class[]{c.a.class}, Void.TYPE);
            return;
        }
        f63981b = true;
        ((j) com.ss.android.ugc.aweme.base.sharedpref.c.a(d.a(), j.class)).a(aVar.ordinal());
    }
}

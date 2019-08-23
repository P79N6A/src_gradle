package com.ss.android.ugc.aweme.discover.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.sharedpref.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42108a;

    /* renamed from: b  reason: collision with root package name */
    public static a f42109b;

    static {
        try {
            f42109b = (a) c.a(k.a(), a.class);
        } catch (Throwable th) {
            com.ss.android.ugc.aweme.util.c.a("Get show discovery guide SP failed." + th.getMessage());
        }
    }
}

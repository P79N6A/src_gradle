package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class r implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39339a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39340b;

    r(Aweme aweme) {
        this.f39340b = aweme;
    }

    public final void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, this, f39339a, false, 31795, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, this, f39339a, false, 31795, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.a(this.f39340b, str3, str4, j2);
    }
}

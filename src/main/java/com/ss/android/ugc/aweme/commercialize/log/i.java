package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class i implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39319a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39320b;

    i(Aweme aweme) {
        this.f39320b = aweme;
    }

    public final void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, this, f39319a, false, 31786, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, this, f39319a, false, 31786, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.b(this.f39320b, str3, str4, j2);
    }
}

package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final /* synthetic */ class h implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39317a;

    /* renamed from: b  reason: collision with root package name */
    private final Aweme f39318b;

    public h(Aweme aweme) {
        this.f39318b = aweme;
    }

    public final void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, this, f39317a, false, 31785, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, this, f39317a, false, 31785, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.c(this.f39318b, str3, str4, j2);
    }
}

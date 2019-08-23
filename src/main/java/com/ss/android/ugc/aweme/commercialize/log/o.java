package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final /* synthetic */ class o implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39333a;

    /* renamed from: b  reason: collision with root package name */
    private final AwemeRawAd f39334b;

    o(AwemeRawAd awemeRawAd) {
        this.f39334b = awemeRawAd;
    }

    public final void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, this, f39333a, false, 31792, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, this, f39333a, false, 31792, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.a(this.f39334b, str3, str4, j2);
    }
}

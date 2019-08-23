package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.Map;

public final /* synthetic */ class k implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39323a;

    /* renamed from: b  reason: collision with root package name */
    private final Banner f39324b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f39325c;

    k(Banner banner, Map map) {
        this.f39324b = banner;
        this.f39325c = map;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f39323a, false, 31788, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f39323a, false, 31788, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.b(this.f39324b, this.f39325c, str, str2, j);
    }
}

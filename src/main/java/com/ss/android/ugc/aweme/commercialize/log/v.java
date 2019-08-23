package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.Category;

public final /* synthetic */ class v implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39350a;

    /* renamed from: b  reason: collision with root package name */
    private final Category f39351b;

    public v(Category category) {
        this.f39351b = category;
    }

    public final void a(String str, String str2, long j) {
        String str3 = str;
        String str4 = str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str3, str4, new Long(j2)}, this, f39350a, false, 31799, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, new Long(j2)}, this, f39350a, false, 31799, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.b(this.f39351b, str3, str4, j2);
    }
}

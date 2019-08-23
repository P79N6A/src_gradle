package com.ss.android.ugc.aweme.commercialize.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.Banner;
import java.util.Map;

public final /* synthetic */ class l implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39326a;

    /* renamed from: b  reason: collision with root package name */
    private final Banner f39327b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f39328c;

    public l(Banner banner, Map map) {
        this.f39327b = banner;
        this.f39328c = map;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f39326a, false, 31789, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f39326a, false, 31789, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        g.a(this.f39327b, this.f39328c, str, str2, j);
    }
}

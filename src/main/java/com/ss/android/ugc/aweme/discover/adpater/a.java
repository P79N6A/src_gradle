package com.ss.android.ugc.aweme.discover.adpater;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo;

public final /* synthetic */ class a implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42005a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryListAdInfo f42006b;

    a(CategoryListAdInfo categoryListAdInfo) {
        this.f42006b = categoryListAdInfo;
    }

    public final void a(String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, this, f42005a, false, 35965, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, this, f42005a, false, 35965, new Class[]{String.class, String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        d.a(str, str2, j).b("track_url").a("track_ad").f("show").a(this.f42006b).b();
    }
}

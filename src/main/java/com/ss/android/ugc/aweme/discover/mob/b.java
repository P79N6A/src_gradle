package com.ss.android.ugc.aweme.discover.mob;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.u.c;
import com.ss.android.ugc.aweme.u.o;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42655a;

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f42655a, true, 36954, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f42655a, true, 36954, new Class[0], Void.TYPE);
            return;
        }
        new o().a("discovery").e();
        z.a(z.c.DISCOVER);
    }

    public static void a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f42655a, true, 36953, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f42655a, true, 36953, new Class[]{String.class, String.class}, Void.TYPE);
        } else if (TextUtils.equals("homepage_hot", str3)) {
            r.a("enter_discovery_page", (Map) d.a().a("previous_page", str3).a("enter_method", str4).a("group_id", c.f75106a).a("author_id", c.f75107b).f34114b);
        } else {
            r.a("enter_discovery_page", (Map) d.a().a("previous_page", str3).a("enter_method", str4).f34114b);
        }
    }
}

package com.ss.android.ugc.aweme.utils;

import com.bytedance.ies.geckoclient.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.feed.b.a;
import com.ss.android.ugc.aweme.commercialize.log.d;
import java.util.HashMap;
import kotlin.text.StringsKt;

public final /* synthetic */ class by implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75648a;

    /* renamed from: b  reason: collision with root package name */
    private final a f75649b;

    by(a aVar) {
        this.f75649b = aVar;
    }

    public final void a(String str) {
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        boolean z;
        int i;
        Class[] clsArr;
        Class cls;
        by byVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f75648a, false, 88343, new Class[]{String.class}, Void.TYPE)) {
            objArr = new Object[]{str2};
            changeQuickRedirect = f75648a;
            z = false;
            i = 88343;
            clsArr = new Class[]{String.class};
            cls = Void.TYPE;
            byVar = this;
        } else {
            Object obj = this.f75649b;
            if (PatchProxy.isSupport(new Object[]{str2}, obj, a.f38809a, false, 30793, new Class[]{String.class}, Void.TYPE)) {
                objArr = new Object[]{str2};
                changeQuickRedirect = a.f38809a;
                z = false;
                i = 30793;
                clsArr = new Class[]{String.class};
                cls = Void.TYPE;
                byVar = obj;
            } else {
                if (str2 != null) {
                    HashMap hashMap = new HashMap();
                    if (StringsKt.startsWith$default(str2, "ad_landing_", false, 2, null)) {
                        str2 = StringsKt.replace$default(str, "ad_landing_", "", false, 4, (Object) null);
                    }
                    hashMap.put("site_id", str2);
                    d.a().b("ad_landing_cache_clear").a("ad_wap_stat").a((Object) hashMap).b();
                }
                return;
            }
        }
        PatchProxy.accessDispatch(objArr, byVar, changeQuickRedirect, z, i, clsArr, cls);
    }
}

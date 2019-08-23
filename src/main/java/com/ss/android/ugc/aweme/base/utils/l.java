package com.ss.android.ugc.aweme.base.utils;

import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35035a;

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f35035a, true, 25249, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f35035a, true, 25249, new Class[]{String.class}, Void.TYPE);
            return;
        }
        r.a(str2, (Map) d.a().a("mobile_model", Build.MODEL).a("mobile_brand", Build.BRAND).a("android_version", Build.VERSION.RELEASE).f34114b);
    }
}

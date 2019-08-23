package com.ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.k;
import java.util.List;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75493a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75493a, true, 88059, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75493a, true, 88059, new Class[]{String.class}, String.class);
        }
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str2.contains("challenge/detail")) {
            List<String> a2 = k.a(str);
            if (a2 != null && a2.size() > 0) {
                str3 = a2.get(a2.size() - 1);
            }
        }
        return str3;
    }
}

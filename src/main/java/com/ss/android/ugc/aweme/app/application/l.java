package com.ss.android.ugc.aweme.app.application;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.a.j;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33962a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f33962a, true, 23225, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f33962a, true, 23225, new Class[0], String.class);
        }
        try {
            if (j.a() == null) {
                return "";
            }
            String cookie = CookieManager.getInstance().getCookie(j.a().l);
            if (TextUtils.isEmpty(cookie)) {
                return "";
            }
            if (cookie.contains("sessionid=")) {
                for (String str : cookie.split(";")) {
                    if (str.trim().startsWith("sessionid=")) {
                        return str.substring(11);
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
        }
    }
}

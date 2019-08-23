package com.ss.android.ugc.aweme.account.util;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33088a;

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f33088a, true, 21308, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f33088a, true, 21308, new Class[0], String.class);
        }
        return CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
    }

    public static String b() {
        if (PatchProxy.isSupport(new Object[0], null, f33088a, true, 21309, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f33088a, true, 21309, new Class[0], String.class);
        }
        String a2 = a();
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String str = "";
        if (!TextUtils.isEmpty(a2)) {
            String[] split = a2.split(";");
            int length = split.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                String str2 = split[i];
                if (!TextUtils.isEmpty(str2)) {
                    String[] split2 = str2.split("=");
                    if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                        str = split2[1];
                        break;
                    }
                }
                i++;
            }
        }
        return str;
    }

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33088a, true, 21306, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f33088a, true, 21306, new Class[]{String.class}, Void.TYPE);
            return;
        }
        String cookie = CookieManager.getInstance().getCookie(NetworkUtils.getShareCookieHost());
        CookieManager.getInstance().setAcceptCookie(true);
        if (!TextUtils.isEmpty(cookie)) {
            for (String cookie2 : cookie.split("; ")) {
                CookieManager.getInstance().setCookie(str2, cookie2);
            }
        }
    }
}

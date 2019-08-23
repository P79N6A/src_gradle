package com.taobao.accs.antibrush;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import java.util.StringTokenizer;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static CookieManager f78887a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f78888b;

    private static boolean a() {
        if (!f78888b && GlobalClientInfo.f78903a != null) {
            a(GlobalClientInfo.f78903a);
        }
        return f78888b;
    }

    public static synchronized String a(String str) {
        String str2;
        synchronized (b.class) {
            if (!a()) {
                ALog.e("CookieMgr", "cookieMgr not setup", new Object[0]);
                return null;
            }
            try {
                str2 = b(f78887a.getCookie(str));
            } catch (Throwable th) {
                ALog.e("CookieMgr", "get cookie failed. url=" + str, th, new Object[0]);
                str2 = null;
            }
        }
        return str2;
    }

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            try {
                if (!GlobalConfig.enableCookie) {
                    ALog.i("CookieMgr", "disable cookie", new Object[0]);
                } else if (!f78888b) {
                    if (Build.VERSION.SDK_INT < 21) {
                        CookieSyncManager.createInstance(context);
                    }
                    CookieManager instance = CookieManager.getInstance();
                    f78887a = instance;
                    instance.setAcceptCookie(true);
                    if (Build.VERSION.SDK_INT < 21) {
                        f78887a.removeExpiredCookie();
                    }
                    f78888b = true;
                }
            } catch (Throwable th) {
                ALog.e("CookieMgr", "setup", th, new Object[0]);
            }
        }
    }

    public static String b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        do {
            try {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf != -1) {
                    String trim = nextToken.substring(0, indexOf).trim();
                    String trim2 = nextToken.substring(indexOf + 1).trim();
                    if ("sec".equals(trim)) {
                        str2 = c(trim2);
                    }
                } else {
                    throw new IllegalArgumentException("Invalid cookie name-value pair");
                }
            } catch (Throwable th) {
                ALog.e("CookieMgr", "parse", th, new Object[0]);
            }
        } while (stringTokenizer.hasMoreTokens());
        return str2;
    }

    private static String c(String str) {
        if (str != null && str.length() > 2 && str.charAt(0) == '\"' && str.charAt(str.length() - 1) == '\"') {
            return str.substring(1, str.length() - 1);
        }
        if (str == null || str.length() <= 2 || str.charAt(0) != '\'' || str.charAt(str.length() - 1) != '\'') {
            return str;
        }
        return str.substring(1, str.length() - 1);
    }
}

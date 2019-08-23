package com.ali.auth.third.core.a;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.ali.auth.third.core.WebViewProxy;
import com.ali.auth.third.core.context.KernelContext;

public class a implements WebViewProxy {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f4904a;

    private a() {
    }

    public static a a() {
        if (f4904a == null) {
            synchronized (a.class) {
                if (f4904a == null) {
                    f4904a = new a();
                }
            }
        }
        return f4904a;
    }

    public void flush() {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().flush();
        } else {
            CookieSyncManager.createInstance(KernelContext.getApplicationContext()).sync();
        }
    }

    public String getCookie(String str) {
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        return instance.getCookie(".taobao.com");
    }

    public void removeAllCookie() {
        CookieManager.getInstance().removeAllCookie();
    }

    public void removeExpiredCookie() {
        CookieManager.getInstance().removeExpiredCookie();
    }

    public void removeSessionCookie() {
        CookieManager.getInstance().removeSessionCookie();
    }

    public void setAcceptCookie(boolean z) {
        CookieManager.getInstance().setAcceptCookie(z);
    }

    public void setCookie(String str, String str2) {
        CookieManager.getInstance().setCookie(str, str2);
    }
}

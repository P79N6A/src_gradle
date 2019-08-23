package com.alimama.tunion.sdk.a;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alimama.tunion.trade.base.ITUnionCookie;

public class c implements ITUnionCookie {

    /* renamed from: a  reason: collision with root package name */
    private Context f5152a;

    private void a() {
        try {
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.getInstance().sync();
            } else {
                CookieManager.getInstance().flush();
            }
        } catch (Exception unused) {
        }
    }

    public String getCookie(String str) {
        try {
            return CookieManager.getInstance().getCookie(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public c(Context context) {
        if (context != null) {
            this.f5152a = context.getApplicationContext();
            CookieSyncManager.createInstance(context);
            return;
        }
        throw new RuntimeException("context is cannot null");
    }

    public void setCookie(String str, String str2) {
        try {
            CookieManager instance = CookieManager.getInstance();
            instance.setAcceptCookie(true);
            instance.setCookie(str, str2);
            a();
        } catch (Exception unused) {
        }
    }
}

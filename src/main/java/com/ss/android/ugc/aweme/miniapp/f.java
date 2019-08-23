package com.ss.android.ugc.aweme.miniapp;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.g.a;
import com.ss.android.ugc.aweme.miniapp.b.b;
import com.ss.android.ugc.aweme.miniapp.b.c;
import com.ss.android.ugc.aweme.miniapp.b.d;
import com.ss.android.ugc.aweme.miniapp.b.e;
import com.tt.frontendapiinterface.ApiHandler;
import com.tt.option.ext.ApiHandlerCallback;
import com.tt.option.ext.HostOptionApiDepend;

public final class f implements HostOptionApiDepend.ExtApiHandlerCreator {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55750a;

    public final ApiHandler create(String str, String str2, int i, ApiHandlerCallback apiHandlerCallback) {
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        ApiHandlerCallback apiHandlerCallback2 = apiHandlerCallback;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Integer.valueOf(i), apiHandlerCallback2}, this, f55750a, false, 59014, new Class[]{String.class, String.class, Integer.TYPE, ApiHandlerCallback.class}, ApiHandler.class)) {
            Object[] objArr = {str3, str4, Integer.valueOf(i), apiHandlerCallback2};
            return (ApiHandler) PatchProxy.accessDispatch(objArr, this, f55750a, false, 59014, new Class[]{String.class, String.class, Integer.TYPE, ApiHandlerCallback.class}, ApiHandler.class);
        } else if (TextUtils.equals(str3, "getUseDuration")) {
            return new e(str4, i2, apiHandlerCallback2);
        } else {
            if (TextUtils.equals(str3, "requestPayment")) {
                if (!a.a()) {
                    return new com.ss.android.ugc.aweme.miniapp.pay.a(str4, i2, apiHandlerCallback2);
                }
            } else if (TextUtils.equals(str3, "getLocation")) {
                if (!a.a()) {
                    return new b(str4, i2, apiHandlerCallback2);
                }
            } else if (TextUtils.equals(str3, "openLocation")) {
                if (!a.a()) {
                    return new d(str4, i2, apiHandlerCallback2);
                }
            } else if (TextUtils.equals(str3, "showActionSheet")) {
                return new com.ss.android.ugc.aweme.miniapp.b.a(str4, i2, apiHandlerCallback2);
            } else {
                if (TextUtils.equals(str3, "showModal")) {
                    return new c(str4, i2, apiHandlerCallback2);
                }
                if (TextUtils.equals(str3, "scanCode")) {
                    return new com.ss.android.ugc.aweme.miniapp.k.a(str4, i2, apiHandlerCallback2);
                }
                if (TextUtils.equals(str3, "requestWXPayment") && !a.a()) {
                    return new com.ss.android.ugc.aweme.miniapp.pay.b(str4, i2, apiHandlerCallback2);
                }
            }
            return null;
        }
    }
}

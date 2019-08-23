package com.ss.android.ugc.aweme.account.login.loginlog;

import android.webkit.CookieManager;
import com.alibaba.fastjson.JSONObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.LogManager;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32251a;

    /* renamed from: b  reason: collision with root package name */
    private static a f32252b;

    /* renamed from: c  reason: collision with root package name */
    private ArrayList<LoginLog> f32253c;

    public a() {
        if (PatchProxy.isSupport(new Object[0], this, f32251a, false, 20263, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32251a, false, 20263, new Class[0], Void.TYPE);
            return;
        }
        this.f32253c = new ArrayList<>();
    }

    public static a a() {
        if (PatchProxy.isSupport(new Object[0], null, f32251a, true, 20262, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f32251a, true, 20262, new Class[0], a.class);
        }
        if (f32252b == null) {
            synchronized (LogManager.class) {
                if (f32252b == null) {
                    f32252b = new a();
                }
            }
        }
        return f32252b;
    }

    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f32251a, false, 20268, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f32251a, false, 20268, new Class[0], String.class);
        }
        String str = "";
        try {
            str = JSONObject.toJSONString(this.f32253c);
        } catch (Exception unused) {
        }
        return str;
    }

    private static String a(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f32251a, true, 20264, new Class[]{Long.TYPE}, String.class)) {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j2));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f32251a, true, 20264, new Class[]{Long.TYPE}, String.class);
    }

    public final void a(String str, String str2, boolean z, String str3, boolean z2) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, (byte) 0, str6, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f32251a, false, 20265, new Class[]{String.class, String.class, Boolean.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5, (byte) 0, str6, Byte.valueOf(z2)}, this, f32251a, false, 20265, new Class[]{String.class, String.class, Boolean.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = str4;
        loginLog.errorUrl = str5;
        loginLog.isSuccess = false;
        loginLog.isLogin = z2;
        loginLog.platform = str6;
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str5);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = a(System.currentTimeMillis());
        if (this.f32253c != null) {
            this.f32253c.add(loginLog);
        }
    }

    public final void a(String str, String str2, boolean z, String str3, String str4, String str5) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if (PatchProxy.isSupport(new Object[]{str6, str7, Byte.valueOf(z ? (byte) 1 : 0), str8, str9, str10}, this, f32251a, false, 20267, new Class[]{String.class, String.class, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str6, str7, Byte.valueOf(z), str8, str9, str10}, this, f32251a, false, 20267, new Class[]{String.class, String.class, Boolean.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        LoginLog loginLog = new LoginLog();
        loginLog.errorDesc = str6;
        loginLog.errorUrl = str7;
        loginLog.isSuccess = z;
        loginLog.platform = str8;
        loginLog.postParams = str9;
        try {
            loginLog.cookie = CookieManager.getInstance().getCookie(str7);
        } catch (Exception unused) {
            loginLog.cookie = "";
        }
        loginLog.time = a(System.currentTimeMillis());
        loginLog.action = str10;
        if (this.f32253c != null) {
            this.f32253c.add(loginLog);
        }
    }
}

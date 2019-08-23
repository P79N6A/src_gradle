package com.unicom.xiaowo.login;

import android.content.Context;
import android.text.TextUtils;
import com.unicom.xiaowo.login.b.a;
import com.unicom.xiaowo.login.b.d;

public class UniAuthHelper {
    private static volatile UniAuthHelper s_instance;
    private a mAccountOpen = a.a(this.mContext);
    private Context mContext;

    private UniAuthHelper(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static UniAuthHelper getInstance(Context context) {
        if (s_instance == null) {
            synchronized (UniAuthHelper.class) {
                if (s_instance == null) {
                    s_instance = new UniAuthHelper(context);
                }
            }
        }
        return s_instance;
    }

    public void login(String str, String str2, ResultListener resultListener) {
        if (envCheck(str, str2, resultListener)) {
            try {
                a aVar = this.mAccountOpen;
                Context context = this.mContext;
                a.a(str, str2);
                aVar.a(context, 1);
            } catch (Exception unused) {
                d.a().a("sdk异常");
            }
        }
    }

    public void getAccesscode(String str, String str2, ResultListener resultListener) {
        if (envCheck(str, str2, resultListener)) {
            try {
                a aVar = this.mAccountOpen;
                Context context = this.mContext;
                a.a(str, str2);
                aVar.a(context, 2);
            } catch (Exception unused) {
                d.a().a("getAccesscode异常");
            }
        }
    }

    public void getToken(String str, String str2, String str3, ResultListener resultListener) {
        if (envCheck(str, str2, resultListener)) {
            if (TextUtils.isEmpty(str3)) {
                d.a().a("accessCode不能为空");
                return;
            }
            try {
                a aVar = this.mAccountOpen;
                Context context = this.mContext;
                a.a(str, str2);
                aVar.a(context, str3, "", 3);
            } catch (Exception unused) {
                d.a().a("getToken异常");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean envCheck(java.lang.String r6, java.lang.String r7, com.unicom.xiaowo.login.ResultListener r8) {
        /*
            r5 = this;
            android.content.Context r0 = r5.mContext
            r1 = 0
            if (r0 == 0) goto L_0x005d
            if (r8 != 0) goto L_0x0008
            goto L_0x005d
        L_0x0008:
            com.unicom.xiaowo.login.b.d r0 = com.unicom.xiaowo.login.b.d.a()
            r0.f81425a = r8
            android.content.Context r8 = r5.mContext
            java.lang.String r0 = "connectivity"
            java.lang.Object r8 = r8.getSystemService(r0)
            android.net.ConnectivityManager r8 = (android.net.ConnectivityManager) r8
            android.net.NetworkInfo[] r8 = r8.getAllNetworkInfo()
            r0 = 1
            if (r8 == 0) goto L_0x0035
            int r2 = r8.length
            if (r2 <= 0) goto L_0x0035
            r2 = 0
        L_0x0023:
            int r3 = r8.length
            if (r2 >= r3) goto L_0x0035
            r3 = r8[r2]
            android.net.NetworkInfo$State r3 = r3.getState()
            android.net.NetworkInfo$State r4 = android.net.NetworkInfo.State.CONNECTED
            if (r3 != r4) goto L_0x0032
            r8 = 1
            goto L_0x0036
        L_0x0032:
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0035:
            r8 = 0
        L_0x0036:
            if (r8 != 0) goto L_0x0042
            com.unicom.xiaowo.login.b.d r6 = com.unicom.xiaowo.login.b.d.a()
            java.lang.String r7 = "网络未连接"
        L_0x003e:
            r6.a(r7)
            return r1
        L_0x0042:
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x004f
            com.unicom.xiaowo.login.b.d r6 = com.unicom.xiaowo.login.b.d.a()
            java.lang.String r7 = "appId不能为空"
            goto L_0x003e
        L_0x004f:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x005c
            com.unicom.xiaowo.login.b.d r6 = com.unicom.xiaowo.login.b.d.a()
            java.lang.String r7 = "appSecret不能为空"
            goto L_0x003e
        L_0x005c:
            return r0
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.UniAuthHelper.envCheck(java.lang.String, java.lang.String, com.unicom.xiaowo.login.ResultListener):boolean");
    }
}

package com.ss.android.pushmanager.thirdparty;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.j;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30591a;

    /* renamed from: c  reason: collision with root package name */
    private static final String f30592c = IPushDepend.SEND_PUSH_TOKEN_URL;

    /* renamed from: b  reason: collision with root package name */
    public final ISendTokenCallBack f30593b;

    /* renamed from: d  reason: collision with root package name */
    private int f30594d = 10;

    /* renamed from: e  reason: collision with root package name */
    private Context f30595e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f30596f = new Handler(j.a().f2493b) {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f30597a;

        public final void handleMessage(Message message) {
            boolean z;
            String str;
            String str2;
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f30597a, false, 19310, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f30597a, false, 19310, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            b bVar = b.this;
            if (PatchProxy.isSupport(new Object[]{message2}, bVar, b.f30591a, false, 19306, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, bVar, b.f30591a, false, 19306, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            if (message2.what == 1) {
                if (PatchProxy.isSupport(new Object[]{message2}, bVar, b.f30591a, false, 19307, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message2}, bVar, b.f30591a, false, 19307, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                try {
                    switch (message2.arg1) {
                        case 11:
                            z = true;
                            break;
                        default:
                            z = false;
                            break;
                    }
                    StringBuilder sb = new StringBuilder("Send token ");
                    if (z) {
                        str = "success";
                    } else {
                        str = "fail";
                    }
                    sb.append(str);
                    Logger.d("SendTokenTask", sb.toString());
                    if (z) {
                        int i = message2.arg2;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, b.f30591a, true, 19301, new Class[]{Integer.TYPE}, String.class)) {
                            str2 = (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, b.f30591a, true, 19301, new Class[]{Integer.TYPE}, String.class);
                        } else {
                            str2 = "push_token_sent_" + i;
                        }
                        linkedHashMap.put(str2, Boolean.TRUE);
                        if (message2.obj instanceof String) {
                            linkedHashMap.put(b.a(i), message2.obj);
                        }
                        com.ss.android.pushmanager.setting.b.a().b((Map<String, ?>) linkedHashMap);
                    } else {
                        bVar.a((String) message2.obj);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    };
    private int g = 0;

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f30591a, false, 19308, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30591a, false, 19308, new Class[0], Void.TYPE);
        } else if (this.f30595e != null && this.f30593b != null) {
            a(this.f30593b);
        }
    }

    static String a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f30591a, true, 19302, new Class[]{Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f30591a, true, 19302, new Class[]{Integer.TYPE}, String.class);
        }
        return "push_token_" + i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00de A[Catch:{ Throwable -> 0x00ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.pushmanager.thirdparty.ISendTokenCallBack r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f30591a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.pushmanager.thirdparty.ISendTokenCallBack> r2 = com.ss.android.pushmanager.thirdparty.ISendTokenCallBack.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 19305(0x4b69, float:2.7052E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f30591a
            r4 = 0
            r5 = 19305(0x4b69, float:2.7052E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.ss.android.pushmanager.thirdparty.ISendTokenCallBack> r0 = com.ss.android.pushmanager.thirdparty.ISendTokenCallBack.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            if (r11 != 0) goto L_0x0033
            return
        L_0x0033:
            android.content.Context r1 = r10.f30595e
            if (r1 != 0) goto L_0x0038
            return
        L_0x0038:
            r1 = 0
            r2 = 10
            android.content.Context r3 = r10.f30595e     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = r11.getToken(r3)     // Catch:{ Throwable -> 0x00eb }
            int r1 = r11.getType()     // Catch:{ Throwable -> 0x00ec }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x00ed }
            if (r0 != 0) goto L_0x00e1
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00ed }
            com.ss.android.pushmanager.app.e r0 = com.ss.android.pushmanager.app.e.a()     // Catch:{ Throwable -> 0x00ed }
            java.util.Map r0 = r0.c()     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r4 = f30592c     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r0 = com.ss.android.message.b.k.a((java.lang.String) r4, (java.util.Map<java.lang.String, java.lang.String>) r0)     // Catch:{ Throwable -> 0x00ed }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00ed }
            r4.<init>()     // Catch:{ Throwable -> 0x00ed }
            android.util.Pair r5 = new android.util.Pair     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r6 = "token"
            r5.<init>(r6, r3)     // Catch:{ Throwable -> 0x00ed }
            r4.add(r5)     // Catch:{ Throwable -> 0x00ed }
            android.util.Pair r5 = new android.util.Pair     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r6 = "type"
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ Throwable -> 0x00ed }
            r5.<init>(r6, r7)     // Catch:{ Throwable -> 0x00ed }
            r4.add(r5)     // Catch:{ Throwable -> 0x00ed }
            java.lang.String r0 = com.ss.android.message.b.k.a((java.lang.String) r0, (java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) r4)     // Catch:{ Throwable -> 0x00ed }
            r5 = 103(0x67, float:1.44E-43)
            com.bytedance.common.utility.NetworkClient r6 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r0 = r6.post(r0, r4)     // Catch:{ Throwable -> 0x00ae }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00ae }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x00ae }
            java.lang.String r0 = "success"
            java.lang.String r6 = "message"
            java.lang.String r4 = r4.optString(r6)     // Catch:{ Throwable -> 0x00ae }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x00ae }
            if (r0 == 0) goto L_0x00a4
            r0 = 200(0xc8, float:2.8E-43)
            com.ss.android.pushmanager.a.d.b(r1)     // Catch:{ Throwable -> 0x00a1 }
            r9 = 1
            goto L_0x00b9
        L_0x00a1:
            r0 = move-exception
            r9 = 1
            goto L_0x00af
        L_0x00a4:
            r0 = -200(0xffffffffffffff38, float:NaN)
            java.lang.String r4 = "-200"
            java.lang.String r6 = "server 返回更新失败"
            com.ss.android.pushmanager.a.d.a(r1, r5, r4, r6)     // Catch:{ Throwable -> 0x00ae }
            goto L_0x00b9
        L_0x00ae:
            r0 = move-exception
        L_0x00af:
            java.lang.String r4 = "1"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ Throwable -> 0x00ed }
            com.ss.android.pushmanager.a.d.a(r1, r5, r4, r0)     // Catch:{ Throwable -> 0x00ed }
            r0 = 1
        L_0x00b9:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00d7 }
            r4.<init>()     // Catch:{ Throwable -> 0x00d7 }
            java.lang.String r5 = "label"
            java.lang.String r6 = "send_token"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00d7 }
            java.lang.String r5 = "status"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x00d7 }
            java.lang.String r0 = "token"
            r4.put(r0, r3)     // Catch:{ Throwable -> 0x00d7 }
            java.lang.String r0 = "type"
            r4.put(r0, r1)     // Catch:{ Throwable -> 0x00d7 }
            com.ss.android.pushmanager.f.a()     // Catch:{ Throwable -> 0x00d7 }
        L_0x00d7:
            if (r9 == 0) goto L_0x00de
            r0 = 11
            r10.f30594d = r0     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00ef
        L_0x00de:
            r10.f30594d = r2     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00ef
        L_0x00e1:
            r0 = 102(0x66, float:1.43E-43)
            java.lang.String r4 = "0"
            java.lang.String r5 = "token 为空"
            com.ss.android.pushmanager.a.d.a(r1, r0, r4, r5)     // Catch:{ Throwable -> 0x00ed }
            goto L_0x00ef
        L_0x00eb:
            r3 = r1
        L_0x00ec:
            r1 = 0
        L_0x00ed:
            r10.f30594d = r2
        L_0x00ef:
            android.os.Handler r0 = r10.f30596f
            int r2 = r10.f30594d
            android.os.Message r0 = r0.obtainMessage(r8, r2, r1, r3)
            r0.sendToTarget()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.pushmanager.thirdparty.b.a(com.ss.android.pushmanager.thirdparty.ISendTokenCallBack):void");
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f30591a, false, 19309, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f30591a, false, 19309, new Class[]{String.class}, Void.TYPE);
            return;
        }
        try {
            this.g++;
            if (this.g <= 3 && !TextUtils.isEmpty(str)) {
                j.a().a(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f30599a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f30599a, false, 19311, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f30599a, false, 19311, new Class[0], Void.TYPE);
                            return;
                        }
                        b.this.a(b.this.f30593b);
                    }
                }, TimeUnit.SECONDS.toMillis(4) * ((long) this.g));
            }
        } catch (Exception unused) {
        }
    }

    b(Context context, ISendTokenCallBack iSendTokenCallBack) {
        this.f30595e = context;
        this.f30593b = iSendTokenCallBack;
    }
}

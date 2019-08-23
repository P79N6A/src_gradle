package cn.com.chinatelecom.account.api;

import android.content.Context;
import android.net.Network;
import android.os.Build;
import cn.com.chinatelecom.account.api.b.c;
import cn.com.chinatelecom.account.api.b.d;
import cn.com.chinatelecom.account.api.b.e;
import cn.com.chinatelecom.account.api.b.f;
import cn.com.chinatelecom.account.api.c.d;
import cn.com.chinatelecom.account.api.c.f;
import cn.com.chinatelecom.account.api.c.g;
import cn.com.chinatelecom.account.api.c.h;
import com.ss.android.ugc.aweme.miniapp.k;
import java.util.concurrent.Future;
import org.json.JSONObject;

public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f1729a = "a";

    /* access modifiers changed from: private */
    public String a(Context context, String str, String str2, String str3, CtSetting ctSetting, Network network, String str4) {
        String str5;
        try {
            long a2 = cn.com.chinatelecom.account.api.c.a.a(context);
            String a3 = h.a(context);
            JSONObject jSONObject = new JSONObject(h.a(context, str, str2, str3, a2, ""));
            String optString = jSONObject.optString("p");
            String optString2 = jSONObject.optString(k.f55809b);
            e a4 = c.a(context, a3, optString, ctSetting, network, true, 0, "preAuth", str4);
            if (a4.f1782c) {
                return a(context, str4, str, str2, str3, ctSetting, network);
            }
            str5 = cn.com.chinatelecom.account.api.c.a.a(context, a4, optString2, network, true, str4);
            try {
                f.a(str4, str5, optString);
            } catch (Throwable th) {
                th = th;
            }
            return str5;
        } catch (Throwable th2) {
            th = th2;
            String str6 = str4;
            str5 = "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}";
            CtAuth.warn(f1729a, "AuthManager getPreMobile() exception", th);
            cn.com.chinatelecom.account.api.c.e a5 = f.a(str4);
            a5.f("AuthManager getPreMobile() exception ：" + th.getMessage()).a(-8001).e("请求网络异常");
            return str5;
        }
    }

    /* access modifiers changed from: private */
    public String a(Context context, String str, String str2, String str3, String str4, CtSetting ctSetting) {
        try {
            Context context2 = context;
            String str5 = str2;
            String str6 = str3;
            String str7 = str4;
            JSONObject jSONObject = new JSONObject(h.a(context2, str5, str6, str7, cn.com.chinatelecom.account.api.c.a.a(str4), cn.com.chinatelecom.account.api.c.a.a(context), ""));
            String optString = jSONObject.optString("p");
            String a2 = cn.com.chinatelecom.account.api.c.a.a(context, c.a(context, h.a(), optString, ctSetting, null, false, 0, "Auth", str).f1781b, jSONObject.optString(k.f55809b));
            f.a(str, a2, optString);
            return a2;
        } catch (Throwable th) {
            CtAuth.warn(f1729a, "AuthManager requestNetworkAuth() exception", th);
            cn.com.chinatelecom.account.api.c.e a3 = f.a(str);
            a3.f("AuthManager requestNetworkAuth() exception ：" + th.getMessage()).a(-8001).e("请求网络异常");
            return "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}";
        }
    }

    private String a(Context context, String str, String str2, String str3, String str4, CtSetting ctSetting, Network network) {
        try {
            long a2 = cn.com.chinatelecom.account.api.c.a.a(context);
            String a3 = h.a(context);
            JSONObject jSONObject = new JSONObject(h.a(context, str2, str3, str4, a2, ""));
            String optString = jSONObject.optString("p");
            String optString2 = jSONObject.optString(k.f55809b);
            String a4 = cn.com.chinatelecom.account.api.c.a.a(context, c.a(context, a3, optString, ctSetting, network, true, 0, "preAuth", str), optString2, network, true, str);
            try {
                f.a(str, a4, optString);
                return a4;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            String str5 = str;
            CtAuth.warn(f1729a, "AuthManager retryPreMobile() exception", th);
            cn.com.chinatelecom.account.api.c.e a5 = f.a(str);
            a5.f("AuthManager retryPreMobile() exception ：" + th.getMessage()).a(-8001).e("请求网络异常");
            return "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}";
        }
    }

    private void a(Context context, String str, f.a aVar, int i, ResultListener resultListener) {
        final Future b2 = cn.com.chinatelecom.account.api.b.f.b(aVar);
        final int i2 = i;
        final f.a aVar2 = aVar;
        final String str2 = str;
        final Context context2 = context;
        final ResultListener resultListener2 = resultListener;
        AnonymousClass4 r0 = new Runnable() {
            /* JADX INFO: finally extract failed */
            /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
                if (r2.isDone() == false) goto L_0x0017;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
                if (r2.isDone() == false) goto L_0x0017;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
                r2.cancel(true);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    r0 = 1
                    java.util.concurrent.Future r1 = r2     // Catch:{ Throwable -> 0x0020 }
                    int r2 = r3     // Catch:{ Throwable -> 0x0020 }
                    long r2 = (long) r2     // Catch:{ Throwable -> 0x0020 }
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x0020 }
                    r1.get(r2, r4)     // Catch:{ Throwable -> 0x0020 }
                    java.util.concurrent.Future r1 = r2
                    if (r1 == 0) goto L_0x0093
                    java.util.concurrent.Future r1 = r2
                    boolean r1 = r1.isDone()
                    if (r1 != 0) goto L_0x0093
                L_0x0017:
                    java.util.concurrent.Future r1 = r2
                    r1.cancel(r0)
                    return
                L_0x001d:
                    r1 = move-exception
                    goto L_0x0094
                L_0x0020:
                    r1 = move-exception
                    cn.com.chinatelecom.account.api.b.f$a r2 = r4     // Catch:{ all -> 0x001d }
                    r2.a(r0)     // Catch:{ all -> 0x001d }
                    boolean r2 = r1 instanceof java.util.concurrent.TimeoutException     // Catch:{ all -> 0x001d }
                    if (r2 == 0) goto L_0x004d
                    java.lang.String r1 = r5     // Catch:{ all -> 0x001d }
                    cn.com.chinatelecom.account.api.c.e r1 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r1)     // Catch:{ all -> 0x001d }
                    r2 = -8003(0xffffffffffffe0bd, float:NaN)
                    cn.com.chinatelecom.account.api.c.e r1 = r1.a((int) r2)     // Catch:{ all -> 0x001d }
                    java.lang.String r2 = "请求超时"
                    cn.com.chinatelecom.account.api.c.e r1 = r1.e(r2)     // Catch:{ all -> 0x001d }
                    java.lang.String r2 = "submitOnTimeoutInterrupted method TimeoutException"
                    r1.f(r2)     // Catch:{ all -> 0x001d }
                    android.content.Context r1 = r6     // Catch:{ all -> 0x001d }
                    java.lang.String r2 = r5     // Catch:{ all -> 0x001d }
                    java.lang.String r3 = "{\"result\":-8003,\"msg\":\"请求超时\"}"
                    cn.com.chinatelecom.account.api.ResultListener r4 = r7     // Catch:{ all -> 0x001d }
                L_0x0049:
                    cn.com.chinatelecom.account.api.CtAuth.postResultOnMainThread(r1, r2, r3, r4)     // Catch:{ all -> 0x001d }
                    goto L_0x0086
                L_0x004d:
                    java.lang.String r2 = cn.com.chinatelecom.account.api.a.f1729a     // Catch:{ all -> 0x001d }
                    java.lang.String r3 = "submitOnTimeoutInterrupted other exception"
                    cn.com.chinatelecom.account.api.CtAuth.warn(r2, r3, r1)     // Catch:{ all -> 0x001d }
                    java.lang.String r2 = r5     // Catch:{ all -> 0x001d }
                    cn.com.chinatelecom.account.api.c.e r2 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r2)     // Catch:{ all -> 0x001d }
                    r3 = -8001(0xffffffffffffe0bf, float:NaN)
                    cn.com.chinatelecom.account.api.c.e r2 = r2.a((int) r3)     // Catch:{ all -> 0x001d }
                    java.lang.String r3 = "请求网络异常"
                    cn.com.chinatelecom.account.api.c.e r2 = r2.e(r3)     // Catch:{ all -> 0x001d }
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
                    java.lang.String r4 = "submitOnTimeoutInterrupted other exception "
                    r3.<init>(r4)     // Catch:{ all -> 0x001d }
                    java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x001d }
                    r3.append(r1)     // Catch:{ all -> 0x001d }
                    java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x001d }
                    r2.f(r1)     // Catch:{ all -> 0x001d }
                    android.content.Context r1 = r6     // Catch:{ all -> 0x001d }
                    java.lang.String r2 = r5     // Catch:{ all -> 0x001d }
                    java.lang.String r3 = "{\"result\":\"-8001\",\"msg\":\"请求网络异常\"}"
                    cn.com.chinatelecom.account.api.ResultListener r4 = r7     // Catch:{ all -> 0x001d }
                    goto L_0x0049
                L_0x0086:
                    java.util.concurrent.Future r1 = r2
                    if (r1 == 0) goto L_0x0093
                    java.util.concurrent.Future r1 = r2
                    boolean r1 = r1.isDone()
                    if (r1 != 0) goto L_0x0093
                    goto L_0x0017
                L_0x0093:
                    return
                L_0x0094:
                    java.util.concurrent.Future r2 = r2
                    if (r2 == 0) goto L_0x00a5
                    java.util.concurrent.Future r2 = r2
                    boolean r2 = r2.isDone()
                    if (r2 != 0) goto L_0x00a5
                    java.util.concurrent.Future r2 = r2
                    r2.cancel(r0)
                L_0x00a5:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.a.AnonymousClass4.run():void");
            }
        };
        cn.com.chinatelecom.account.api.b.f.a(r0);
    }

    public final void a(Context context, String str, String str2, String str3, CtSetting ctSetting, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String a2 = d.a();
        cn.com.chinatelecom.account.api.c.f.a(a2).a(d.e(context)).c("pe").b(g.h(context));
        final Context context2 = context;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final CtSetting ctSetting2 = ctSetting;
        final String str7 = a2;
        final ResultListener resultListener2 = resultListener;
        AnonymousClass1 r5 = new f.a() {
            public void run() {
                String a2 = a.this.a(context2, str4, str5, str6, ctSetting2, (Network) null, str7);
                if (!a()) {
                    CtAuth.postResultOnMainThread(context2, str7, a2, resultListener2);
                }
            }
        };
        a(context, a2, r5, totalTimeout, resultListener);
    }

    public final void b(Context context, String str, String str2, String str3, CtSetting ctSetting, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String a2 = d.a();
        cn.com.chinatelecom.account.api.c.f.a(a2).a(d.e(context)).c("pe").b("BOTH");
        if (Build.VERSION.SDK_INT >= 21) {
            cn.com.chinatelecom.account.api.b.d dVar = new cn.com.chinatelecom.account.api.b.d();
            final Context context2 = context;
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final CtSetting ctSetting2 = ctSetting;
            final String str7 = a2;
            final ResultListener resultListener2 = resultListener;
            AnonymousClass2 r5 = new d.a() {
                private boolean i;
                private boolean j;

                public synchronized void a() {
                    this.i = true;
                    if (!this.j) {
                        cn.com.chinatelecom.account.api.c.f.a(str7).f("onTimeoutTip()").a(-8003).e("请求超时");
                        CtAuth.postResultOnMainThread(context2, str7, "{\"result\":-8003,\"msg\":\"请求超时\"}", resultListener2);
                    }
                }

                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public synchronized void a(int r4, java.lang.String r5, long r6) {
                    /*
                        r3 = this;
                        monitor-enter(r3)
                        boolean r0 = r3.i     // Catch:{ all -> 0x0052 }
                        if (r0 != 0) goto L_0x0050
                        boolean r0 = r3.j     // Catch:{ all -> 0x0052 }
                        if (r0 == 0) goto L_0x000a
                        goto L_0x0050
                    L_0x000a:
                        r0 = 1
                        r3.j = r0     // Catch:{ all -> 0x0052 }
                        java.lang.String r0 = r12     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.c.e r0 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r0)     // Catch:{ all -> 0x0052 }
                        java.lang.String r1 = "Switching network failed (L)"
                        cn.com.chinatelecom.account.api.c.e r0 = r0.f(r1)     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.c.e r0 = r0.a((int) r4)     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.c.e r0 = r0.e(r5)     // Catch:{ all -> 0x0052 }
                        r0.b((long) r6)     // Catch:{ all -> 0x0052 }
                        android.content.Context r0 = r7     // Catch:{ all -> 0x0052 }
                        java.lang.String r1 = r12     // Catch:{ all -> 0x0052 }
                        java.lang.String r4 = cn.com.chinatelecom.account.api.c.k.a(r4, r5)     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.ResultListener r2 = r13     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.CtAuth.postResultOnMainThread(r0, r1, r4, r2)     // Catch:{ all -> 0x0052 }
                        java.lang.String r4 = cn.com.chinatelecom.account.api.a.f1729a     // Catch:{ all -> 0x0052 }
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0052 }
                        java.lang.String r1 = "Switching network failed (L), errorMsg :"
                        r0.<init>(r1)     // Catch:{ all -> 0x0052 }
                        r0.append(r5)     // Catch:{ all -> 0x0052 }
                        java.lang.String r5 = " , expendTime ："
                        r0.append(r5)     // Catch:{ all -> 0x0052 }
                        r0.append(r6)     // Catch:{ all -> 0x0052 }
                        java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0052 }
                        cn.com.chinatelecom.account.api.CtAuth.info(r4, r5)     // Catch:{ all -> 0x0052 }
                        monitor-exit(r3)
                        return
                    L_0x0050:
                        monitor-exit(r3)
                        return
                    L_0x0052:
                        r4 = move-exception
                        monitor-exit(r3)
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.a.AnonymousClass2.a(int, java.lang.String, long):void");
                }

                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
                    return;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void a(android.net.Network r10, long r11) {
                    /*
                        r9 = this;
                        java.lang.String r0 = cn.com.chinatelecom.account.api.a.f1729a
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r2 = "Switching network successfully (L) , expendTime ："
                        r1.<init>(r2)
                        r1.append(r11)
                        java.lang.String r1 = r1.toString()
                        cn.com.chinatelecom.account.api.CtAuth.info(r0, r1)
                        boolean r0 = r9.i
                        if (r0 != 0) goto L_0x0057
                        boolean r0 = r9.j
                        if (r0 == 0) goto L_0x001e
                        goto L_0x0057
                    L_0x001e:
                        cn.com.chinatelecom.account.api.a r1 = cn.com.chinatelecom.account.api.a.this
                        android.content.Context r2 = r7
                        java.lang.String r3 = r8
                        java.lang.String r4 = r9
                        java.lang.String r5 = r10
                        cn.com.chinatelecom.account.api.CtSetting r6 = r11
                        java.lang.String r8 = r12
                        r7 = r10
                        java.lang.String r10 = r1.a((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (cn.com.chinatelecom.account.api.CtSetting) r6, (android.net.Network) r7, (java.lang.String) r8)
                        monitor-enter(r9)
                        boolean r0 = r9.i     // Catch:{ all -> 0x0054 }
                        if (r0 != 0) goto L_0x0052
                        boolean r0 = r9.j     // Catch:{ all -> 0x0054 }
                        if (r0 == 0) goto L_0x003b
                        goto L_0x0052
                    L_0x003b:
                        r0 = 1
                        r9.j = r0     // Catch:{ all -> 0x0054 }
                        java.lang.String r0 = r12     // Catch:{ all -> 0x0054 }
                        cn.com.chinatelecom.account.api.c.e r0 = cn.com.chinatelecom.account.api.c.f.a((java.lang.String) r0)     // Catch:{ all -> 0x0054 }
                        r0.b((long) r11)     // Catch:{ all -> 0x0054 }
                        android.content.Context r11 = r7     // Catch:{ all -> 0x0054 }
                        java.lang.String r12 = r12     // Catch:{ all -> 0x0054 }
                        cn.com.chinatelecom.account.api.ResultListener r0 = r13     // Catch:{ all -> 0x0054 }
                        cn.com.chinatelecom.account.api.CtAuth.postResultOnMainThread(r11, r12, r10, r0)     // Catch:{ all -> 0x0054 }
                        monitor-exit(r9)     // Catch:{ all -> 0x0054 }
                        return
                    L_0x0052:
                        monitor-exit(r9)     // Catch:{ all -> 0x0054 }
                        return
                    L_0x0054:
                        r10 = move-exception
                        monitor-exit(r9)     // Catch:{ all -> 0x0054 }
                        throw r10
                    L_0x0057:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.a.AnonymousClass2.a(android.net.Network, long):void");
                }
            };
            dVar.a(context, (d.a) r5);
            dVar.a(totalTimeout);
            return;
        }
        Context context3 = context;
        final Context context4 = context;
        final String str8 = str;
        final String str9 = str2;
        final String str10 = str3;
        final CtSetting ctSetting3 = ctSetting;
        final String str11 = a2;
        final ResultListener resultListener3 = resultListener;
        AnonymousClass3 r52 = new f.a() {
            public void run() {
                if (new cn.com.chinatelecom.account.api.b.d().a(context4, h.a(context4))) {
                    if (!a()) {
                        String a2 = a.this.a(context4, str8, str9, str10, ctSetting3, (Network) null, str11);
                        if (!a()) {
                            CtAuth.postResultOnMainThread(context4, str11, a2, resultListener3);
                        }
                    }
                } else if (!a()) {
                    cn.com.chinatelecom.account.api.c.f.a(str11).f("Switching network failed (4.x)").a(-720002).e("切换移动网络超时(4.x)");
                    CtAuth.postResultOnMainThread(context4, str11, cn.com.chinatelecom.account.api.c.k.a(-720002, "切换移动网络超时(4.x)"), resultListener3);
                }
            }
        };
        a(context, a2, r52, totalTimeout, resultListener);
    }

    public final void c(Context context, String str, String str2, String str3, CtSetting ctSetting, ResultListener resultListener) {
        int totalTimeout = CtSetting.getTotalTimeout(ctSetting);
        String a2 = cn.com.chinatelecom.account.api.c.d.a();
        cn.com.chinatelecom.account.api.c.f.a(a2).a(cn.com.chinatelecom.account.api.c.d.e(context)).c("nh").b(g.h(context));
        final Context context2 = context;
        final String str4 = a2;
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final CtSetting ctSetting2 = ctSetting;
        final ResultListener resultListener2 = resultListener;
        AnonymousClass5 r5 = new f.a() {
            public void run() {
                String a2 = a.this.a(context2, str4, str5, str6, str7, ctSetting2);
                if (!a()) {
                    CtAuth.postResultOnMainThread(context2, str4, a2, resultListener2);
                }
            }
        };
        a(context, a2, r5, totalTimeout, resultListener);
    }
}

package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.f;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.b.e;
import java.util.Arrays;
import java.util.List;
import org.apache.http.impl.client.DefaultHttpClient;

public class aj {

    /* renamed from: a  reason: collision with root package name */
    static b f79844a = n.c();

    /* renamed from: e  reason: collision with root package name */
    static Context f79845e = null;
    private static aj g = null;

    /* renamed from: b  reason: collision with root package name */
    DefaultHttpClient f79846b;

    /* renamed from: c  reason: collision with root package name */
    f f79847c;

    /* renamed from: d  reason: collision with root package name */
    StringBuilder f79848d = new StringBuilder(4096);

    /* renamed from: f  reason: collision with root package name */
    long f79849f = 0;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|(3:4|5|6)|7|8|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0065 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private aj(android.content.Context r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 4096(0x1000, float:5.74E-42)
            r0.<init>(r1)
            r4.f79848d = r0
            r0 = 0
            r4.f79849f = r0
            android.content.Context r5 = r5.getApplicationContext()     // Catch:{ Throwable -> 0x0087 }
            f79845e = r5     // Catch:{ Throwable -> 0x0087 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0087 }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r4.f79849f = r0     // Catch:{ Throwable -> 0x0087 }
            com.tencent.wxop.stat.a.f r5 = new com.tencent.wxop.stat.a.f     // Catch:{ Throwable -> 0x0087 }
            r5.<init>()     // Catch:{ Throwable -> 0x0087 }
            r4.f79847c = r5     // Catch:{ Throwable -> 0x0087 }
            boolean r5 = com.tencent.wxop.stat.d.b()     // Catch:{ Throwable -> 0x0087 }
            if (r5 == 0) goto L_0x0065
            java.lang.String r5 = "org.apache.http.wire"
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)     // Catch:{ Throwable -> 0x0065 }
            java.util.logging.Level r0 = java.util.logging.Level.FINER     // Catch:{ Throwable -> 0x0065 }
            r5.setLevel(r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.http.headers"
            java.util.logging.Logger r5 = java.util.logging.Logger.getLogger(r5)     // Catch:{ Throwable -> 0x0065 }
            java.util.logging.Level r0 = java.util.logging.Level.FINER     // Catch:{ Throwable -> 0x0065 }
            r5.setLevel(r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.commons.logging.Log"
            java.lang.String r0 = "org.apache.commons.logging.impl.SimpleLog"
            java.lang.System.setProperty(r5, r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.commons.logging.simplelog.showdatetime"
            java.lang.String r0 = "true"
            java.lang.System.setProperty(r5, r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.commons.logging.simplelog.log.httpclient.wire"
            java.lang.String r0 = "debug"
            java.lang.System.setProperty(r5, r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.commons.logging.simplelog.log.org.apache.http"
            java.lang.String r0 = "debug"
            java.lang.System.setProperty(r5, r0)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r5 = "org.apache.commons.logging.simplelog.log.org.apache.http.headers"
            java.lang.String r0 = "debug"
            java.lang.System.setProperty(r5, r0)     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            org.apache.http.params.BasicHttpParams r5 = new org.apache.http.params.BasicHttpParams     // Catch:{ Throwable -> 0x0087 }
            r5.<init>()     // Catch:{ Throwable -> 0x0087 }
            r0 = 0
            org.apache.http.params.HttpConnectionParams.setStaleCheckingEnabled(r5, r0)     // Catch:{ Throwable -> 0x0087 }
            r0 = 10000(0x2710, float:1.4013E-41)
            org.apache.http.params.HttpConnectionParams.setConnectionTimeout(r5, r0)     // Catch:{ Throwable -> 0x0087 }
            org.apache.http.params.HttpConnectionParams.setSoTimeout(r5, r0)     // Catch:{ Throwable -> 0x0087 }
            org.apache.http.impl.client.DefaultHttpClient r0 = new org.apache.http.impl.client.DefaultHttpClient     // Catch:{ Throwable -> 0x0087 }
            r0.<init>(r5)     // Catch:{ Throwable -> 0x0087 }
            r4.f79846b = r0     // Catch:{ Throwable -> 0x0087 }
            org.apache.http.impl.client.DefaultHttpClient r5 = r4.f79846b     // Catch:{ Throwable -> 0x0087 }
            com.tencent.wxop.stat.ak r0 = new com.tencent.wxop.stat.ak     // Catch:{ Throwable -> 0x0087 }
            r0.<init>(r4)     // Catch:{ Throwable -> 0x0087 }
            r5.setKeepAliveStrategy(r0)     // Catch:{ Throwable -> 0x0087 }
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.aj.<init>(android.content.Context):void");
    }

    static Context a() {
        return f79845e;
    }

    static aj a(Context context) {
        if (g == null) {
            synchronized (aj.class) {
                if (g == null) {
                    g = new aj(context);
                }
            }
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    public final void a(e eVar, ai aiVar) {
        a(Arrays.asList(new String[]{eVar.b()}), aiVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(List<?> list, ai aiVar) {
        if (this.f79847c != null) {
            this.f79847c.a(new al(this, list, aiVar));
        }
    }
}

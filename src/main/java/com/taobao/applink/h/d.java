package com.taobao.applink.h;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f79202a = "unkown";

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f79203b = "https://wgo.mmstat.com/ire.2.1";

    /* renamed from: c  reason: collision with root package name */
    private List f79204c = new ArrayList(30);

    /* renamed from: d  reason: collision with root package name */
    private CharSequence f79205d;

    public d(Context context, CharSequence charSequence) {
        try {
            this.f79205d = charSequence;
            this.f79202a = com.taobao.applink.util.d.a(context);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "logtype=2&wappkey="
            r0.append(r3)
            java.lang.CharSequence r3 = r5.f79205d
            r0.append(r3)
            java.lang.String r3 = "&packagename="
            r0.append(r3)
            android.app.Application r3 = com.taobao.applink.util.TBAppLinkUtil.getApplication()
            java.lang.String r3 = com.taobao.applink.b.a.a(r3)
            r0.append(r3)
            java.lang.String r3 = "&os="
            r0.append(r3)
            java.lang.String r3 = "android&"
            r0.append(r3)
            java.lang.String r3 = "imei="
            r0.append(r3)
            java.lang.CharSequence r3 = r5.f79202a
            r0.append(r3)
            java.lang.String r3 = "&t="
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = "&type="
            r0.append(r1)
            java.util.List r1 = r5.f79204c
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0058
            java.util.List r1 = r5.f79204c
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.append(r1)
        L_0x0058:
            java.util.List r1 = r5.f79204c
            r1.clear()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            java.lang.CharSequence r3 = r5.f79203b     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Throwable -> 0x00db, all -> 0x00d3 }
            java.lang.String r1 = "POST"
            r2.setRequestMethod(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1 = 1
            r2.setDoOutput(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r2.setDoInput(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r2.setReadTimeout(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.io.OutputStream r1 = r2.getOutputStream()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r3 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r3)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            byte[] r0 = r0.getBytes()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1.write(r0)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1.flush()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1.close()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.io.InputStream r3 = r2.getInputStream()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r1.<init>(r3)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r1 = ""
        L_0x00ae:
            java.lang.String r3 = r0.readLine()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            if (r3 == 0) goto L_0x00c9
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r4.<init>()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r4.append(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r1 = "\n"
            r4.append(r1)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            r4.append(r3)     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            java.lang.String r1 = r4.toString()     // Catch:{ Throwable -> 0x00d1, all -> 0x00cf }
            goto L_0x00ae
        L_0x00c9:
            if (r2 == 0) goto L_0x00e0
            r2.disconnect()
            return
        L_0x00cf:
            r0 = move-exception
            goto L_0x00d5
        L_0x00d1:
            r1 = r2
            goto L_0x00db
        L_0x00d3:
            r0 = move-exception
            r2 = r1
        L_0x00d5:
            if (r2 == 0) goto L_0x00da
            r2.disconnect()
        L_0x00da:
            throw r0
        L_0x00db:
            if (r1 == 0) goto L_0x00e0
            r1.disconnect()
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.h.d.a():void");
    }

    public void a(CharSequence charSequence) {
        synchronized (this) {
            this.f79204c.add(charSequence);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:1|2|3|4|5|6) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.CharSequence r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r1.a((java.lang.CharSequence) r2)     // Catch:{ all -> 0x0013 }
            java.lang.Thread r2 = new java.lang.Thread     // Catch:{ Exception -> 0x0011 }
            com.taobao.applink.h.e r0 = new com.taobao.applink.h.e     // Catch:{ Exception -> 0x0011 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0011 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0011 }
            r2.start()     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.h.d.b(java.lang.CharSequence):void");
    }
}

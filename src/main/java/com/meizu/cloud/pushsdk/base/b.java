package com.meizu.cloud.pushsdk.base;

import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class b implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public SimpleDateFormat f27050a = new SimpleDateFormat("MM-dd HH:mm:ss");
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public List<a> f27051b = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f27052c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private long f27053d = 60;

    /* renamed from: e  reason: collision with root package name */
    private int f27054e = 10;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public e f27055f = new e();
    /* access modifiers changed from: private */
    public String g = (Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/data/pushSdk/defaultLog");
    /* access modifiers changed from: private */
    public String h = String.valueOf(Process.myPid());
    private boolean i;

    class a {

        /* renamed from: a  reason: collision with root package name */
        String f27058a;

        /* renamed from: b  reason: collision with root package name */
        String f27059b;

        /* renamed from: c  reason: collision with root package name */
        String f27060c;

        public a(String str, String str2, String str3) {
            StringBuffer stringBuffer = new StringBuffer(b.this.f27050a.format(new Date()));
            stringBuffer.append(" ");
            stringBuffer.append(b.this.h);
            stringBuffer.append("-");
            stringBuffer.append(String.valueOf(Thread.currentThread().getId()));
            stringBuffer.append(" ");
            stringBuffer.append(str);
            stringBuffer.append("/");
            this.f27058a = stringBuffer.toString();
            this.f27059b = str2;
            this.f27060c = str3;
        }
    }

    private void a(a aVar) {
        try {
            this.f27051b.add(aVar);
        } catch (Exception unused) {
        }
    }

    private void b() {
        if (this.f27051b.size() == 0) {
            this.f27052c.postDelayed(new Runnable() {
                public void run() {
                    b.this.a(true);
                }
            }, this.f27053d * 1000);
        }
    }

    private void c() {
        if (this.f27051b.size() == this.f27054e) {
            a(true);
        }
    }

    public void a(String str) {
        this.g = str;
    }

    public void a(String str, String str2) {
        synchronized (this.f27051b) {
            b();
            a(new a("D", str, str2));
            c();
        }
    }

    public void a(String str, String str2, Throwable th) {
        synchronized (this.f27051b) {
            b();
            a(new a("E", str, str2 + "\n" + Log.getStackTraceString(th)));
            c();
        }
    }

    public void a(boolean z) {
        AnonymousClass2 r0 = new Runnable() {
            /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r5 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    com.meizu.cloud.pushsdk.base.b r1 = com.meizu.cloud.pushsdk.base.b.this
                    java.util.List r1 = r1.f27051b
                    monitor-enter(r1)
                    com.meizu.cloud.pushsdk.base.b r2 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ all -> 0x0077 }
                    android.os.Handler r2 = r2.f27052c     // Catch:{ all -> 0x0077 }
                    r3 = 0
                    r2.removeCallbacksAndMessages(r3)     // Catch:{ all -> 0x0077 }
                    com.meizu.cloud.pushsdk.base.b r2 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ all -> 0x0077 }
                    java.util.List r2 = r2.f27051b     // Catch:{ all -> 0x0077 }
                    r0.addAll(r2)     // Catch:{ all -> 0x0077 }
                    com.meizu.cloud.pushsdk.base.b r2 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ all -> 0x0077 }
                    java.util.List r2 = r2.f27051b     // Catch:{ all -> 0x0077 }
                    r2.clear()     // Catch:{ all -> 0x0077 }
                    monitor-exit(r1)     // Catch:{ all -> 0x0077 }
                    com.meizu.cloud.pushsdk.base.b r1 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    com.meizu.cloud.pushsdk.base.e r1 = r1.f27055f     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    com.meizu.cloud.pushsdk.base.b r2 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    java.lang.String r2 = r2.g     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    r1.a((java.lang.String) r2)     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                L_0x003c:
                    boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    if (r1 == 0) goto L_0x0058
                    java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    com.meizu.cloud.pushsdk.base.b$a r1 = (com.meizu.cloud.pushsdk.base.b.a) r1     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    com.meizu.cloud.pushsdk.base.b r2 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    com.meizu.cloud.pushsdk.base.e r2 = r2.f27055f     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    java.lang.String r3 = r1.f27058a     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    java.lang.String r4 = r1.f27059b     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    java.lang.String r1 = r1.f27060c     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    r2.a(r3, r4, r1)     // Catch:{ Exception -> 0x006d, all -> 0x0062 }
                    goto L_0x003c
                L_0x0058:
                    com.meizu.cloud.pushsdk.base.b r0 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x0061 }
                    com.meizu.cloud.pushsdk.base.e r0 = r0.f27055f     // Catch:{ Exception -> 0x0061 }
                    r0.a()     // Catch:{ Exception -> 0x0061 }
                L_0x0061:
                    return
                L_0x0062:
                    r0 = move-exception
                    com.meizu.cloud.pushsdk.base.b r1 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x006c }
                    com.meizu.cloud.pushsdk.base.e r1 = r1.f27055f     // Catch:{ Exception -> 0x006c }
                    r1.a()     // Catch:{ Exception -> 0x006c }
                L_0x006c:
                    throw r0
                L_0x006d:
                    com.meizu.cloud.pushsdk.base.b r0 = com.meizu.cloud.pushsdk.base.b.this     // Catch:{ Exception -> 0x0076 }
                    com.meizu.cloud.pushsdk.base.e r0 = r0.f27055f     // Catch:{ Exception -> 0x0076 }
                    r0.a()     // Catch:{ Exception -> 0x0076 }
                L_0x0076:
                    return
                L_0x0077:
                    r0 = move-exception
                    monitor-exit(r1)     // Catch:{ all -> 0x0077 }
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.base.b.AnonymousClass2.run():void");
            }
        };
        if (z) {
            f.a().execute(r0);
        } else {
            r0.run();
        }
    }

    public boolean a() {
        return this.i;
    }

    public void b(String str, String str2) {
        synchronized (this.f27051b) {
            b();
            a(new a("I", str, str2));
            c();
        }
    }

    public void b(boolean z) {
        this.i = z;
    }

    public void c(String str, String str2) {
        synchronized (this.f27051b) {
            b();
            a(new a("W", str, str2));
            c();
        }
    }

    public void d(String str, String str2) {
        synchronized (this.f27051b) {
            b();
            a(new a("E", str, str2));
            c();
        }
    }
}

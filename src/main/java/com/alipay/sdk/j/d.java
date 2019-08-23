package com.alipay.sdk.j;

import android.app.Activity;
import android.content.Intent;
import android.content.ServiceConnection;
import com.alipay.b.a.b;
import com.alipay.sdk.j.i;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public Activity f5525a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public com.alipay.b.a.a f5526b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Object f5527c = com.alipay.b.a.a.class;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5528d;

    /* renamed from: e  reason: collision with root package name */
    private a f5529e;

    /* renamed from: f  reason: collision with root package name */
    private ServiceConnection f5530f = new e(this);
    private b g = new f(this);

    public interface a {
        void a();
    }

    public final String a(String str) {
        try {
            i.a a2 = i.a(this.f5525a, "com.eg.android.AlipayGphone");
            if (a2.a()) {
                return "failed";
            }
            if (a2 != null) {
                if (a2.f5535b > 78) {
                    Intent intent = new Intent();
                    intent.setClassName("com.eg.android.AlipayGphone", "com.alipay.android.app.TransProcessPayActivity");
                    this.f5525a.startActivity(intent);
                    Thread.sleep(200);
                }
            }
            return b(str);
        } catch (Throwable th) {
            com.alipay.sdk.app.a.a.a("biz", "CheckClientSignEx", th);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00f1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x0111 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r8) {
        /*
            r7 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.eg.android.AlipayGphone"
            r0.setPackage(r1)
            java.lang.String r1 = "com.eg.android.AlipayGphone.IAlixPay"
            r0.setAction(r1)
            android.app.Activity r1 = r7.f5525a
            java.lang.String r1 = com.alipay.sdk.j.i.g(r1)
            android.app.Activity r2 = r7.f5525a     // Catch:{ Throwable -> 0x012d }
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ Throwable -> 0x012d }
            android.content.ServiceConnection r3 = r7.f5530f     // Catch:{ Throwable -> 0x012d }
            r4 = 1
            r2.bindService(r0, r3, r4)     // Catch:{ Throwable -> 0x012d }
            java.lang.Object r0 = r7.f5527c
            monitor-enter(r0)
            com.alipay.b.a.a r2 = r7.f5526b     // Catch:{ all -> 0x012a }
            if (r2 != 0) goto L_0x003f
            java.lang.Object r2 = r7.f5527c     // Catch:{ InterruptedException -> 0x0037 }
            com.alipay.sdk.c.a r3 = com.alipay.sdk.c.a.b()     // Catch:{ InterruptedException -> 0x0037 }
            int r3 = r3.a()     // Catch:{ InterruptedException -> 0x0037 }
            long r5 = (long) r3     // Catch:{ InterruptedException -> 0x0037 }
            r2.wait(r5)     // Catch:{ InterruptedException -> 0x0037 }
            goto L_0x003f
        L_0x0037:
            r2 = move-exception
            java.lang.String r3 = "biz"
            java.lang.String r5 = "BindWaitTimeoutEx"
            com.alipay.sdk.app.a.a.a((java.lang.String) r3, (java.lang.String) r5, (java.lang.Throwable) r2)     // Catch:{ all -> 0x012a }
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x012a }
            r0 = 0
            r2 = 0
            com.alipay.b.a.a r3 = r7.f5526b     // Catch:{ Throwable -> 0x00de }
            if (r3 != 0) goto L_0x0097
            android.app.Activity r8 = r7.f5525a     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = com.alipay.sdk.j.i.g(r8)     // Catch:{ Throwable -> 0x00de }
            android.app.Activity r3 = r7.f5525a     // Catch:{ Throwable -> 0x00de }
            java.lang.String r3 = com.alipay.sdk.j.i.h(r3)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r4 = "biz"
            java.lang.String r5 = "ClientBindFailed"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00de }
            r6.<init>()     // Catch:{ Throwable -> 0x00de }
            r6.append(r1)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r1 = "|"
            r6.append(r1)     // Catch:{ Throwable -> 0x00de }
            r6.append(r8)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = "|"
            r6.append(r8)     // Catch:{ Throwable -> 0x00de }
            r6.append(r3)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = r6.toString()     // Catch:{ Throwable -> 0x00de }
            com.alipay.sdk.app.a.a.a((java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r8)     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = "failed"
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x007e }
            com.alipay.b.a.b r3 = r7.g     // Catch:{ Throwable -> 0x007e }
            r1.b((com.alipay.b.a.b) r3)     // Catch:{ Throwable -> 0x007e }
        L_0x007e:
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x0085 }
            android.content.ServiceConnection r3 = r7.f5530f     // Catch:{ Throwable -> 0x0085 }
            r1.unbindService(r3)     // Catch:{ Throwable -> 0x0085 }
        L_0x0085:
            r7.g = r2
            r7.f5530f = r2
            r7.f5526b = r2
            boolean r1 = r7.f5528d
            if (r1 == 0) goto L_0x0096
            android.app.Activity r1 = r7.f5525a
            r1.setRequestedOrientation(r0)
            r7.f5528d = r0
        L_0x0096:
            return r8
        L_0x0097:
            com.alipay.sdk.j.d$a r1 = r7.f5529e     // Catch:{ Throwable -> 0x00de }
            if (r1 == 0) goto L_0x00a0
            com.alipay.sdk.j.d$a r1 = r7.f5529e     // Catch:{ Throwable -> 0x00de }
            r1.a()     // Catch:{ Throwable -> 0x00de }
        L_0x00a0:
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x00de }
            int r1 = r1.getRequestedOrientation()     // Catch:{ Throwable -> 0x00de }
            if (r1 != 0) goto L_0x00af
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x00de }
            r1.setRequestedOrientation(r4)     // Catch:{ Throwable -> 0x00de }
            r7.f5528d = r4     // Catch:{ Throwable -> 0x00de }
        L_0x00af:
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x00de }
            com.alipay.b.a.b r3 = r7.g     // Catch:{ Throwable -> 0x00de }
            r1.a((com.alipay.b.a.b) r3)     // Catch:{ Throwable -> 0x00de }
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x00de }
            java.lang.String r8 = r1.a((java.lang.String) r8)     // Catch:{ Throwable -> 0x00de }
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x00c3 }
            com.alipay.b.a.b r3 = r7.g     // Catch:{ Throwable -> 0x00c3 }
            r1.b((com.alipay.b.a.b) r3)     // Catch:{ Throwable -> 0x00c3 }
        L_0x00c3:
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x00ca }
            android.content.ServiceConnection r3 = r7.f5530f     // Catch:{ Throwable -> 0x00ca }
            r1.unbindService(r3)     // Catch:{ Throwable -> 0x00ca }
        L_0x00ca:
            r7.g = r2
            r7.f5530f = r2
            r7.f5526b = r2
            boolean r1 = r7.f5528d
            if (r1 == 0) goto L_0x00db
            android.app.Activity r1 = r7.f5525a
            r1.setRequestedOrientation(r0)
            r7.f5528d = r0
        L_0x00db:
            return r8
        L_0x00dc:
            r8 = move-exception
            goto L_0x010a
        L_0x00de:
            r8 = move-exception
            java.lang.String r1 = "biz"
            java.lang.String r3 = "ClientBindException"
            com.alipay.sdk.app.a.a.a((java.lang.String) r1, (java.lang.String) r3, (java.lang.Throwable) r8)     // Catch:{ all -> 0x00dc }
            java.lang.String r8 = com.alipay.sdk.app.j.a()     // Catch:{ all -> 0x00dc }
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x00f1 }
            com.alipay.b.a.b r3 = r7.g     // Catch:{ Throwable -> 0x00f1 }
            r1.b((com.alipay.b.a.b) r3)     // Catch:{ Throwable -> 0x00f1 }
        L_0x00f1:
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x00f8 }
            android.content.ServiceConnection r3 = r7.f5530f     // Catch:{ Throwable -> 0x00f8 }
            r1.unbindService(r3)     // Catch:{ Throwable -> 0x00f8 }
        L_0x00f8:
            r7.g = r2
            r7.f5530f = r2
            r7.f5526b = r2
            boolean r1 = r7.f5528d
            if (r1 == 0) goto L_0x0109
            android.app.Activity r1 = r7.f5525a
            r1.setRequestedOrientation(r0)
            r7.f5528d = r0
        L_0x0109:
            return r8
        L_0x010a:
            com.alipay.b.a.a r1 = r7.f5526b     // Catch:{ Throwable -> 0x0111 }
            com.alipay.b.a.b r3 = r7.g     // Catch:{ Throwable -> 0x0111 }
            r1.b((com.alipay.b.a.b) r3)     // Catch:{ Throwable -> 0x0111 }
        L_0x0111:
            android.app.Activity r1 = r7.f5525a     // Catch:{ Throwable -> 0x0118 }
            android.content.ServiceConnection r3 = r7.f5530f     // Catch:{ Throwable -> 0x0118 }
            r1.unbindService(r3)     // Catch:{ Throwable -> 0x0118 }
        L_0x0118:
            r7.g = r2
            r7.f5530f = r2
            r7.f5526b = r2
            boolean r1 = r7.f5528d
            if (r1 == 0) goto L_0x0129
            android.app.Activity r1 = r7.f5525a
            r1.setRequestedOrientation(r0)
            r7.f5528d = r0
        L_0x0129:
            throw r8
        L_0x012a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x012d:
            r8 = move-exception
            java.lang.String r0 = "biz"
            java.lang.String r1 = "ClientBindServiceFailed"
            com.alipay.sdk.app.a.a.a((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r8)
            java.lang.String r8 = "failed"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.j.d.b(java.lang.String):java.lang.String");
    }

    public d(Activity activity, a aVar) {
        this.f5525a = activity;
        this.f5529e = aVar;
    }
}

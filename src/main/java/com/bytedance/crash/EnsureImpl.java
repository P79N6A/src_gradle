package com.bytedance.crash;

import com.bytedance.crash.d.a;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.apm.api.IEnsure;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Map;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;

public class EnsureImpl implements IEnsure {
    public void ensureNotReachHere() {
        report(null, "EnsureNotReachHere", null);
    }

    public EnsureImpl() {
        c.a(IEnsure.class, this);
    }

    public void reportLogException(Throwable th) {
        ensureNotReachHere(th);
    }

    public boolean ensureFalse(boolean z) {
        if (z) {
            report(null, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            report(null, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str) {
        report(str, "EnsureNotReachHere", null);
    }

    public boolean ensureTrue(boolean z) {
        if (!z) {
            report(null, "EnsureTrue", null);
        }
        return z;
    }

    public boolean ensureNotEmpty(Collection collection) {
        boolean z;
        if (collection == null || collection.size() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            report(null, "EnsureNotEmpty", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th) {
        if (needReport(th)) {
            a.a(Thread.currentThread().getStackTrace(), 5, th, null, true);
        }
    }

    private boolean needReport(Throwable th) {
        boolean z;
        if (j.e().a()) {
            if (th != null && !(th instanceof ConnectTimeoutException) && !(th instanceof SocketTimeoutException) && !(th instanceof BindException) && !(th instanceof ConnectException) && !(th instanceof NoRouteToHostException) && !(th instanceof PortUnreachableException) && !(th instanceof SocketException) && !(th instanceof UnknownHostException) && !(th instanceof ProtocolException) && !(th instanceof SSLException)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public void reportLogException(Throwable th, String str) {
        ensureNotReachHere(th, str);
    }

    public boolean ensureFalse(boolean z, String str) {
        if (z) {
            report(str, "EnsureFalse", null);
        }
        return z;
    }

    public boolean ensureNotNull(Object obj, String str) {
        boolean z;
        if (obj != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            report(str, "EnsureNotNull", null);
        }
        return z;
    }

    public void ensureNotReachHere(String str, Map<String, String> map) {
        report(str, "EnsureNotReachHere", map);
    }

    public boolean ensureTrue(boolean z, String str) {
        if (!z) {
            report(str, "EnsureTrue", null);
        }
        return z;
    }

    public void ensureNotReachHere(Throwable th, String str) {
        if (needReport(th)) {
            a.a(Thread.currentThread().getStackTrace(), 5, th, str, true);
        }
    }

    public void reportLogException(int i, Throwable th, String str) {
        reportLogE(i, th, str);
    }

    public boolean ensureFalse(boolean z, String str, Map<String, String> map) {
        if (z) {
            report(str, "EnsureFalse", map);
        }
        return z;
    }

    public boolean ensureTrue(boolean z, String str, Map<String, String> map) {
        if (!z) {
            report(str, "EnsureTrue", map);
        }
        return z;
    }

    private void reportLogE(int i, Throwable th, String str) {
        if (needReport(th)) {
            a.a(Thread.currentThread().getStackTrace(), i + 2, th, str, false);
        }
    }

    private void report(String str, String str2, Map<String, String> map) {
        if (j.e().a()) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            com.bytedance.frameworks.core.b.a.a();
            a.AnonymousClass2 r1 = new com.bytedance.frameworks.core.b.c(stackTrace, 5, str, str2, map) {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ StackTraceElement[] f19404a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f19405b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ String f19406c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ String f19407d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ Map f19408e;

                /* JADX WARNING: Removed duplicated region for block: B:21:0x003a A[Catch:{ Throwable -> 0x0063 }, RETURN] */
                /* JADX WARNING: Removed duplicated region for block: B:22:0x003b A[Catch:{ Throwable -> 0x0063 }] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r10 = this;
                        java.lang.StackTraceElement[] r0 = r10.f19404a
                        int r1 = r10.f19405b
                        java.lang.String r8 = r10.f19406c
                        java.lang.String r7 = r10.f19407d
                        java.util.Map r9 = r10.f19408e
                        if (r0 == 0) goto L_0x0064
                        int r2 = r0.length     // Catch:{ Throwable -> 0x0063 }
                        int r3 = r1 + 1
                        if (r2 > r3) goto L_0x0012
                        goto L_0x0064
                    L_0x0012:
                        r2 = r0[r1]     // Catch:{ Throwable -> 0x0063 }
                        if (r2 != 0) goto L_0x0017
                        return
                    L_0x0017:
                        if (r0 == 0) goto L_0x0032
                        int r3 = r0.length     // Catch:{ Throwable -> 0x0063 }
                        if (r3 > 0) goto L_0x001d
                        goto L_0x0032
                    L_0x001d:
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
                        r3.<init>()     // Catch:{ Throwable -> 0x0063 }
                    L_0x0022:
                        int r4 = r0.length     // Catch:{ Throwable -> 0x0063 }
                        if (r1 >= r4) goto L_0x002d
                        r4 = r0[r1]     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.crash.i.m.a((java.lang.StackTraceElement) r4, (java.lang.StringBuilder) r3)     // Catch:{ Throwable -> 0x0063 }
                        int r1 = r1 + 1
                        goto L_0x0022
                    L_0x002d:
                        java.lang.String r0 = r3.toString()     // Catch:{ Throwable -> 0x0063 }
                        goto L_0x0033
                    L_0x0032:
                        r0 = 0
                    L_0x0033:
                        r3 = r0
                        boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0063 }
                        if (r0 == 0) goto L_0x003b
                        return
                    L_0x003b:
                        java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r5 = r0.getName()     // Catch:{ Throwable -> 0x0063 }
                        r6 = 1
                        r4 = r8
                        com.bytedance.crash.e.b r0 = com.bytedance.crash.e.b.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.crash.d.a.a(r9, r0)     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.crash.runtime.assembly.e r1 = com.bytedance.crash.runtime.assembly.e.a()     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.crash.d r2 = com.bytedance.crash.d.ENSURE     // Catch:{ Throwable -> 0x0063 }
                        r1.a(r2, r0)     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.crash.upload.c.a(r0)     // Catch:{ Throwable -> 0x0063 }
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = "[report] "
                        r0.<init>(r1)     // Catch:{ Throwable -> 0x0063 }
                        r0.append(r8)     // Catch:{ Throwable -> 0x0063 }
                        return
                    L_0x0063:
                        return
                    L_0x0064:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.d.a.AnonymousClass2.run():void");
                }

                {
                    this.f19404a = r1;
                    this.f19405b = r2;
                    this.f19406c = r3;
                    this.f19407d = r4;
                    this.f19408e = r5;
                }
            };
            com.bytedance.frameworks.core.b.a.a(r1);
        }
    }

    public void ensureNotReachHere(Throwable th, String str, Map<String, String> map) {
        if (needReport(th)) {
            a.a(Thread.currentThread().getStackTrace(), 5, th, str, true, map);
        }
    }
}

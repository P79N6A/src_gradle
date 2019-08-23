package com.ss.android.push.daemon;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.ss.android.push.daemon.b;
import com.ss.android.push.daemon.f;
import com.ss.android.ugc.aweme.q.c;
import java.io.BufferedReader;
import java.io.IOException;

public final class a implements b.C0368b, e {

    /* renamed from: a  reason: collision with root package name */
    private b f30396a;

    /* renamed from: b  reason: collision with root package name */
    private b.C0368b f30397b;

    /* renamed from: c  reason: collision with root package name */
    private Context f30398c;

    /* renamed from: d  reason: collision with root package name */
    private final String f30399d = "d_permit";

    /* renamed from: e  reason: collision with root package name */
    private final String f30400e = "permitted";

    /* renamed from: f  reason: collision with root package name */
    private BufferedReader f30401f;

    private void c() {
        if (this.f30401f != null) {
            try {
                this.f30401f.close();
            } catch (IOException unused) {
            }
            this.f30401f = null;
        }
    }

    public final void a() {
        if (this.f30398c != null) {
            d(this.f30398c);
        }
        if (this.f30397b != null) {
            this.f30397b.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A[SYNTHETIC, Splitter:B:17:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[SYNTHETIC, Splitter:B:25:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b() {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            int r5 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0050, all -> 0x0049 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.<init>()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
        L_0x002e:
            int r3 = r1.read()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            if (r3 <= 0) goto L_0x0039
            char r3 = (char) r3     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            goto L_0x002e
        L_0x0039:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0051, all -> 0x0044 }
            r1.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            return r2
        L_0x0044:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x004a
        L_0x0049:
            r1 = move-exception
        L_0x004a:
            if (r0 == 0) goto L_0x004f
            r0.close()     // Catch:{ Exception -> 0x004f }
        L_0x004f:
            throw r1
        L_0x0050:
            r1 = r0
        L_0x0051:
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0056:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.push.daemon.a.b():java.lang.String");
    }

    public final void a(Context context) {
        d(context);
    }

    private static boolean e(Context context) {
        return c.a(context, "d_permit", 0).getBoolean("permitted", true);
    }

    public final void b(Context context) {
        if (this.f30397b != null) {
            this.f30397b.b(context);
        }
    }

    public a(b bVar) {
        this.f30396a = bVar;
        if (bVar != null) {
            this.f30397b = this.f30396a.f30412c;
            this.f30396a.f30412c = this;
        }
    }

    public final void c(Context context) {
        if (this.f30397b != null) {
            this.f30397b.c(context);
        }
    }

    private void d(Context context) {
        try {
            Logger.debug();
            this.f30398c = context.getApplicationContext();
            if (e(context)) {
                if (this.f30396a != null) {
                    String b2 = b();
                    context.getPackageName();
                    Logger.debug();
                    if (b2.endsWith(this.f30396a.f30410a.f30413a)) {
                        f.a.a().a(context, this.f30396a);
                    } else if (b2.endsWith(this.f30396a.f30411b.f30413a)) {
                        f.a.a().b(context, this.f30396a);
                    }
                    c();
                }
            }
        } catch (Throwable unused) {
        }
    }
}

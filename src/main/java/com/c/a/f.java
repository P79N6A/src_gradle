package com.c.a;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public final class f implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadLocal<String> f22940a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f22941b = new ArrayList();

    f() {
    }

    public final void a(@NonNull b bVar) {
        this.f22941b.add(h.a(bVar));
    }

    public final void a(@NonNull String str, @Nullable Object... objArr) {
        a(3, (Throwable) null, str, objArr);
    }

    private synchronized void a(int i, @Nullable Throwable th, @NonNull String str, @Nullable Object... objArr) {
        h.a(str);
        String str2 = this.f22940a.get();
        if (str2 != null) {
            this.f22940a.remove();
        } else {
            str2 = null;
        }
        if (objArr != null) {
            if (objArr.length != 0) {
                str = String.format(str, objArr);
            }
        }
        a(3, str2, str, (Throwable) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036 A[Catch:{ all -> 0x001e }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044 A[Catch:{ all -> 0x001e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(int r3, @android.support.annotation.Nullable java.lang.String r4, @android.support.annotation.Nullable java.lang.String r5, @android.support.annotation.Nullable java.lang.Throwable r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r6 == 0) goto L_0x0020
            if (r5 == 0) goto L_0x0020
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x001e }
            r0.<init>()     // Catch:{ all -> 0x001e }
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = " : "
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = com.c.a.h.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x001e }
            r0.append(r5)     // Catch:{ all -> 0x001e }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r3 = move-exception
            goto L_0x0056
        L_0x0020:
            if (r6 == 0) goto L_0x0028
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = com.c.a.h.a((java.lang.Throwable) r6)     // Catch:{ all -> 0x001e }
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            int r6 = r5.length()     // Catch:{ all -> 0x001e }
            if (r6 != 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r6 = 0
            goto L_0x0034
        L_0x0033:
            r6 = 1
        L_0x0034:
            if (r6 == 0) goto L_0x0038
            java.lang.String r5 = "Empty/NULL log message"
        L_0x0038:
            java.util.List<com.c.a.b> r6 = r2.f22941b     // Catch:{ all -> 0x001e }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x001e }
        L_0x003e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x001e }
            com.c.a.b r0 = (com.c.a.b) r0     // Catch:{ all -> 0x001e }
            boolean r1 = r0.a()     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x003e
            r0.a(r3, r4, r5)     // Catch:{ all -> 0x001e }
            goto L_0x003e
        L_0x0054:
            monitor-exit(r2)
            return
        L_0x0056:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.c.a.f.a(int, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }
}

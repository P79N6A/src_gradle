package com.ss.android.ugc.playerkit.session;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import java.util.LinkedList;
import java.util.Queue;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final a f77728a = new a();

    /* renamed from: b  reason: collision with root package name */
    private volatile Session f77729b;

    /* renamed from: c  reason: collision with root package name */
    private final Queue<Session> f77730c = new LinkedList();

    public static a a() {
        return f77728a;
    }

    private a() {
    }

    @NonNull
    public final synchronized Session b() {
        if (this.f77729b != null) {
            return this.f77729b;
        }
        return Session.DEFAULT;
    }

    public final synchronized Session a(String str) {
        this.f77729b = b(str);
        if (this.f77729b == null) {
            this.f77729b = d(str);
        }
        return this.f77729b;
    }

    public final synchronized Session b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f77730c.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    public final synchronized Session c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f77730c.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].sourceId)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    public final synchronized Session d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session instance = Session.instance();
        instance.key = str;
        instance.uri = str;
        if (this.f77730c.size() + 1 > 5) {
            this.f77730c.poll();
        }
        this.f77730c.offer(instance);
        return instance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.ss.android.ugc.playerkit.session.Session> a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
            r0 = 3
            r5.<init>(r0)     // Catch:{ all -> 0x0056 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r4)
            return r5
        L_0x000f:
            java.util.Queue<com.ss.android.ugc.playerkit.session.Session> r1 = r4.f77730c     // Catch:{ all -> 0x0056 }
            r2 = 0
            com.ss.android.ugc.playerkit.session.Session[] r2 = new com.ss.android.ugc.playerkit.session.Session[r2]     // Catch:{ all -> 0x0056 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0056 }
            com.ss.android.ugc.playerkit.session.Session[] r1 = (com.ss.android.ugc.playerkit.session.Session[]) r1     // Catch:{ all -> 0x0056 }
            int r2 = r1.length     // Catch:{ all -> 0x0056 }
            int r2 = r2 + -1
        L_0x001d:
            if (r2 < 0) goto L_0x002d
            r3 = r1[r2]     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r3.key     // Catch:{ all -> 0x0056 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r2 = r2 + -1
            goto L_0x001d
        L_0x002d:
            r2 = -1
        L_0x002e:
            if (r2 <= 0) goto L_0x0041
            r6 = 2
        L_0x0031:
            if (r6 < 0) goto L_0x0054
            int r0 = r2 - r6
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x003e
            r0 = r1[r0]     // Catch:{ all -> 0x0056 }
            r5.add(r0)     // Catch:{ all -> 0x0056 }
        L_0x003e:
            int r6 = r6 + -1
            goto L_0x0031
        L_0x0041:
            int r6 = r1.length     // Catch:{ all -> 0x0056 }
            int r6 = r6 + -1
        L_0x0044:
            if (r6 < 0) goto L_0x0054
            int r2 = r5.size()     // Catch:{ all -> 0x0056 }
            if (r2 >= r0) goto L_0x0054
            r2 = r1[r6]     // Catch:{ all -> 0x0056 }
            r5.add(r2)     // Catch:{ all -> 0x0056 }
            int r6 = r6 + -1
            goto L_0x0044
        L_0x0054:
            monitor-exit(r4)
            return r5
        L_0x0056:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.session.a.a(int, java.lang.String):java.util.List");
    }
}

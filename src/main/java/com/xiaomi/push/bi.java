package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;

public class bi {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bi f81859a;

    /* renamed from: a  reason: collision with other field name */
    private Context f173a;

    private bi(Context context) {
        this.f173a = context;
    }

    public static bi a(Context context) {
        if (f81859a == null) {
            synchronized (bi.class) {
                try {
                    if (f81859a == null) {
                        f81859a = new bi(context);
                    }
                } catch (Throwable th) {
                    Class<bi> cls = bi.class;
                    throw th;
                }
            }
        }
        return f81859a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long a(java.lang.String r3, java.lang.String r4, long r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f173a     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            r1 = 4
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r1)     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            long r3 = r3.getLong(r4, r5)     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0010:
            r3 = r5
        L_0x0011:
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bi.a(java.lang.String, java.lang.String, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            android.content.Context r0 = r2.f173a     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            r1 = 4
            android.content.SharedPreferences r3 = com.ss.android.ugc.aweme.q.c.a(r0, r3, r1)     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            java.lang.String r3 = r3.getString(r4, r5)     // Catch:{ Throwable -> 0x0010, all -> 0x000d }
            goto L_0x0011
        L_0x000d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0010:
            r3 = r5
        L_0x0011:
            monitor-exit(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bi.a(java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m116a(String str, String str2, long j) {
        synchronized (this) {
            SharedPreferences.Editor edit = c.a(this.f173a, str, 4).edit();
            edit.putLong(str2, j);
            edit.commit();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m117a(String str, String str2, String str3) {
        synchronized (this) {
            SharedPreferences.Editor edit = c.a(this.f173a, str, 4).edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }
}

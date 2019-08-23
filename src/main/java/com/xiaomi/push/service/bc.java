package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.push.ag;
import com.xiaomi.push.aj;
import com.xiaomi.push.at;
import com.xiaomi.push.s;
import java.util.concurrent.ConcurrentHashMap;

public final class bc implements ae {

    /* renamed from: a  reason: collision with root package name */
    private static volatile bc f82539a;

    /* renamed from: a  reason: collision with other field name */
    private long f968a;

    /* renamed from: a  reason: collision with other field name */
    Context f969a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f970a;

    /* renamed from: a  reason: collision with other field name */
    private ConcurrentHashMap<String, a> f971a = new ConcurrentHashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public volatile boolean f972a;

    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        long f82540a;

        /* renamed from: a  reason: collision with other field name */
        String f973a;

        a(String str, long j) {
            this.f973a = str;
            this.f82540a = j;
        }

        /* access modifiers changed from: package-private */
        public abstract void a(bc bcVar);

        public void run() {
            if (bc.a() != null) {
                Context context = bc.a().f969a;
                if (at.c(context)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    SharedPreferences a2 = bc.a(bc.a());
                    if (currentTimeMillis - a2.getLong(":ts-" + this.f973a, 0) > this.f82540a || ag.a(context)) {
                        SharedPreferences.Editor edit = bc.a(bc.a()).edit();
                        s.a(edit.putLong(":ts-" + this.f973a, System.currentTimeMillis()));
                        a(bc.a());
                    }
                }
            }
        }
    }

    private bc(Context context) {
        this.f969a = context.getApplicationContext();
        this.f970a = c.a(context, "sync", 0);
    }

    public static bc a(Context context) {
        if (f82539a == null) {
            synchronized (bc.class) {
                try {
                    if (f82539a == null) {
                        f82539a = new bc(context);
                    }
                } catch (Throwable th) {
                    Class<bc> cls = bc.class;
                    throw th;
                }
            }
        }
        return f82539a;
    }

    public final String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f970a;
        return sharedPreferences.getString(str + ":" + str2, "");
    }

    public final void a() {
        if (!this.f972a) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f968a >= 3600000) {
                this.f968a = currentTimeMillis;
                this.f972a = true;
                aj.a(this.f969a).a((Runnable) new bd(this), (int) (Math.random() * 10.0d));
            }
        }
    }

    public final void a(a aVar) {
        if (this.f971a.putIfAbsent(aVar.f973a, aVar) == null) {
            aj.a(this.f969a).a((Runnable) aVar, ((int) (Math.random() * 30.0d)) + 10);
        }
    }

    public final void a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = f82539a.f970a.edit();
        s.a(edit.putString(str + ":" + str2, str3));
    }
}

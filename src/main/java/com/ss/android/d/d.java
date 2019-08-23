package com.ss.android.d;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.Logger;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.d.b.b;
import java.util.Map;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile d f2452a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f2453b;

    /* renamed from: c  reason: collision with root package name */
    public static Context f2454c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2455d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f2456e;
    public static volatile b g;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.d.b.b f2457f = new com.ss.android.d.b.b(f2454c, g);

    public interface a {
        void a(String str, String str2);

        void a(boolean z);

        void a(boolean z, boolean z2);
    }

    public interface b {
        String b(String str);
    }

    public static String a() {
        return e.a();
    }

    public static void a(Map map) {
        e.a(map);
    }

    public static String b() {
        return e.b();
    }

    public static boolean d() {
        return f2456e;
    }

    public static String c() {
        d dVar = f2452a;
        String str = "";
        if (dVar != null) {
            str = dVar.f2457f.d();
        }
        Logger.debug();
        return str;
    }

    private d() {
        com.ss.android.d.b.a.f28355d = f2455d;
        com.ss.android.d.a.d.h = this.f2457f;
        com.ss.android.d.b.b bVar = this.f2457f;
        bVar.l = new JSONObject();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences a2 = com.ss.android.d.a.a.a(bVar.j);
        bVar.h = a2.getInt("last_config_version", 0);
        bVar.q = a2.getString("install_id", "");
        if (bVar.h == com.ss.android.d.a.d.b()) {
            long j = a2.getLong("last_config_time", 0);
            currentTimeMillis = j <= currentTimeMillis ? j : currentTimeMillis;
            boolean isBadId = NetUtil.isBadId(bVar.a());
            boolean isBadId2 = NetUtil.isBadId(bVar.q);
            if (!isBadId && !isBadId2) {
                bVar.n = currentTimeMillis;
            }
        }
        if (com.ss.android.d.a.d.a(bVar.j, bVar.l) || !Logger.debug()) {
            bVar.t = new b.a();
            bVar.t.start();
            return;
        }
        throw new RuntimeException("init header error.");
    }

    public static void a(a aVar) {
        com.ss.android.d.b.b.a(aVar);
    }

    public static boolean b(Context context) {
        return f.b(context);
    }

    public static void a(boolean z) {
        com.ss.android.d.a.d.a(z);
    }

    public static void a(Context context) throws IllegalArgumentException {
        if (context != null) {
            f2453b = true;
            if (context instanceof Activity) {
                f2455d = true;
            }
            f2454c = context.getApplicationContext();
            if (f2452a == null) {
                synchronized (d.class) {
                    if (f2452a == null) {
                        f2452a = new d();
                    }
                }
            }
            Logger.debug();
            return;
        }
        throw new IllegalArgumentException("context = null");
    }
}

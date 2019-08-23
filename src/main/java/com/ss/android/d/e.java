package com.ss.android.d;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.d.a.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.q.c;
import java.lang.reflect.Field;
import java.util.Map;
import me.ele.lancet.base.annotations.Insert;
import me.ele.lancet.base.annotations.TargetClass;

public final class e {
    @Insert
    @TargetClass
    static void a(Map map) {
        try {
            Field declaredField = d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    SharedPreferences a3 = c.a(a2, a.a(), 0);
                    String string = a3.getString("device_id", "");
                    if (!TextUtils.isEmpty(string)) {
                        map.put("device_id", string);
                    }
                    String string2 = a3.getString("install_id", "");
                    if (!TextUtils.isEmpty(string2)) {
                        map.put("install_id", string2);
                    }
                    String string3 = c.a(a2, a.c(), 0).getString("openudid", null);
                    if (!TextUtils.isEmpty(string3)) {
                        map.put("openudid", string3);
                    }
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        b(map);
    }

    @Insert
    @TargetClass
    static String b() {
        try {
            Field declaredField = d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    return c.a(a2, a.a(), 0).getString("device_id", "");
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        return c();
    }

    @Insert
    @TargetClass
    static String a() {
        try {
            Field declaredField = d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    return c.a(a2, a.a(), 0).getString("install_id", "");
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        d dVar = d.f2452a;
        String str = "";
        if (dVar != null) {
            str = dVar.f2457f.q;
            Logger.debug();
        }
        return str;
    }

    @Insert
    @TargetClass
    private static String c() {
        try {
            Field declaredField = d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    return c.a(a2, a.a(), 0).getString("device_id", "");
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        d dVar = d.f2452a;
        String str = "";
        if (dVar != null) {
            str = dVar.f2457f.a();
        }
        Logger.debug();
        return str;
    }

    @Insert
    @TargetClass
    private static void b(Map map) {
        try {
            Field declaredField = d.class.getDeclaredField("a");
            if (declaredField != null) {
                declaredField.setAccessible(true);
                Object obj = declaredField.get(null);
                k a2 = k.a();
                if (obj == null && a2 != null) {
                    SharedPreferences a3 = c.a(a2, a.a(), 0);
                    String string = a3.getString("device_id", "");
                    if (!TextUtils.isEmpty(string)) {
                        map.put("device_id", string);
                    }
                    String string2 = a3.getString("install_id", "");
                    if (!TextUtils.isEmpty(string2)) {
                        map.put("install_id", string2);
                    }
                    String string3 = c.a(a2, a.c(), 0).getString("openudid", null);
                    if (!TextUtils.isEmpty(string3)) {
                        map.put("openudid", string3);
                    }
                }
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        d dVar = d.f2452a;
        if (map == null || dVar == null) {
            if (dVar == null && d.f2454c != null) {
                SharedPreferences a4 = c.a(d.f2454c, a.a(), 0);
                String string4 = a4.getString("device_id", "");
                if (!TextUtils.isEmpty(string4)) {
                    map.put("device_id", string4);
                }
                String string5 = a4.getString("install_id", "");
                if (!TextUtils.isEmpty(string5)) {
                    map.put("install_id", string5);
                }
                String string6 = c.a(d.f2454c, a.c(), 0).getString("openudid", null);
                if (!TextUtils.isEmpty(string6)) {
                    map.put("openudid", string6);
                }
            }
            return;
        }
        d dVar2 = d.f2452a;
        String str = "";
        if (dVar2 != null) {
            str = dVar2.f2457f.c();
        }
        Logger.debug();
        if (str != null) {
            map.put("openudid", str);
        }
        String c2 = d.c();
        if (c2 != null) {
            map.put("clientudid", c2);
        }
        String a5 = d.a();
        if (a5 != null) {
            map.put("install_id", a5);
        }
        String b2 = d.b();
        if (b2 != null) {
            map.put("device_id", b2);
        }
    }
}

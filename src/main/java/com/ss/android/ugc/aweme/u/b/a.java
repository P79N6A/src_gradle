package com.ss.android.ugc.aweme.u.b;

import a.i;
import android.content.Context;
import android.content.SharedPreferences;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.feed.z;
import com.ss.android.ugc.aweme.q.c;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.db;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75085a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f75086b = db.a().a(da.VIDEO_REQ);

    /* renamed from: c  reason: collision with root package name */
    private static volatile long f75087c = -1;

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f75088d = false;

    public static void b() {
        f75086b = false;
    }

    public static boolean a() {
        return f75086b;
    }

    private static void d() {
        if (PatchProxy.isSupport(new Object[0], null, f75085a, true, 58976, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f75085a, true, 58976, new Class[0], Void.TYPE);
            return;
        }
        Context context = GlobalContext.getContext();
        if (context != null) {
            c.a(context, "ies_log_flag", 0).edit().putLong("first_install_time_key", System.currentTimeMillis()).apply();
        }
    }

    public static boolean c() {
        long j;
        if (PatchProxy.isSupport(new Object[0], null, f75085a, true, 58975, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f75085a, true, 58975, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (f75088d) {
            return true;
        }
        Context context = GlobalContext.getContext();
        if (context == null) {
            return false;
        }
        if (f75087c <= 0) {
            SharedPreferences a2 = c.a(context, "ies_log_flag", 0);
            if (z.d()) {
                j = -1;
            } else {
                j = 1;
            }
            long j2 = a2.getLong("first_install_time_key", j);
            f75087c = j2;
            if (j2 <= 0) {
                f75087c = System.currentTimeMillis();
                d();
            }
        }
        if (f75087c + 172800000 > System.currentTimeMillis()) {
            return false;
        }
        if (!f75088d) {
            f75088d = true;
            c.a(context, "ies_log_flag", 0).edit().putLong("first_install_time_key", 1).apply();
        }
        return true;
    }

    public static void a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, null, f75085a, true, 58972, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, null, f75085a, true, 58972, new Class[]{String.class, JSONObject.class}, Void.TYPE);
        } else if (!c()) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                try {
                    jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                } catch (JSONException unused) {
                }
                c.a(context, str2, "low_retain", jSONObject2);
            }
        }
    }

    public static void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject, str2, str3}, null, f75085a, true, 58973, new Class[]{String.class, JSONObject.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {str, jSONObject, str2, str3};
            PatchProxy.accessDispatch(objArr, null, f75085a, true, 58973, new Class[]{String.class, JSONObject.class, String.class, String.class}, Void.TYPE);
        } else if (!c()) {
            Context context = GlobalContext.getContext();
            if (context != null) {
                b bVar = new b(jSONObject, str, str2, str3, context);
                i.a((Callable<TResult>) bVar);
            }
        }
    }

    static final /* synthetic */ Object a(JSONObject jSONObject, String str, String str2, String str3, Context context) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                jSONObject2.put(next, jSONObject.get(next));
            } catch (Exception unused) {
            }
        }
        jSONObject2.put("event", str);
        jSONObject2.put(str2, str3);
        jSONObject2.put("session_id", AwemeAppData.p().am);
        jSONObject2.put("scene", "low_retain");
        jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
        AppLog.recordMiscLog(context, "app_perf", jSONObject2);
        return null;
    }
}

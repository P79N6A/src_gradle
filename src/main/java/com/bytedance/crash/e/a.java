package com.bytedance.crash.e;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.d;
import com.bytedance.crash.i.m;
import com.bytedance.crash.runtime.assembly.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f19417a;

    /* renamed from: b  reason: collision with root package name */
    public String f19418b;

    public final a a(JSONObject jSONObject) {
        a("storage", (Object) jSONObject);
        return this;
    }

    public final void a(@NonNull String str, @Nullable Object obj) {
        try {
            this.f19417a.put(str, obj);
        } catch (Exception unused) {
        }
    }

    public a() {
        this.f19417a = new JSONObject();
    }

    public a(JSONObject jSONObject) {
        this.f19417a = jSONObject;
    }

    public final a a(c cVar) {
        a("header", (Object) cVar.f19421a);
        return this;
    }

    public final a a(b bVar) {
        a("activity_trace", (Object) bVar.a());
        a("running_tasks", (Object) bVar.b());
        return this;
    }

    public final a b(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        a("logcat", (Object) jSONArray);
        return this;
    }

    public final a b(Map<Integer, String> map) {
        if (map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            for (Integer next : map.keySet()) {
                try {
                    jSONObject.put(String.valueOf(next), map.get(next));
                } catch (JSONException unused) {
                }
            }
            try {
                this.f19417a.put("sdk_info", jSONObject);
            } catch (JSONException unused2) {
            }
        }
        return this;
    }

    public final a c(Map<? extends String, ? extends String> map) {
        if (map != null) {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (JSONException unused) {
                }
            }
            a("filters", (Object) jSONObject);
        }
        return this;
    }

    public final a a(long j) {
        try {
            a("app_start_time", (Object) Long.valueOf(j));
            a("app_start_time_readable", (Object) new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss", Locale.getDefault()).format(new Date(j)));
        } catch (Exception unused) {
        }
        return this;
    }

    public final a a(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            a("session_id", (Object) str);
        }
        return this;
    }

    public final a a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        if (list == null || list.isEmpty()) {
            a("patch_info", (Object) jSONArray);
            return this;
        }
        for (String put : list) {
            jSONArray.put(put);
        }
        a("patch_info", (Object) jSONArray);
        return this;
    }

    public final a a(Map<String, Integer> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null) {
            try {
                this.f19417a.put("plugin_info", jSONArray);
                return this;
            } catch (Exception unused) {
            }
        } else {
            for (String next : map.keySet()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("package_name", next);
                jSONObject.put("version_code", map.get(next));
                jSONArray.put(jSONObject);
            }
            this.f19417a.put("plugin_info", jSONArray);
            return this;
        }
    }

    public final a a(int i, String str) {
        try {
            this.f19417a.put("miniapp_id", i);
            this.f19417a.put("miniapp_version", str);
        } catch (JSONException unused) {
        }
        return this;
    }

    public static a a(long j, Context context, String str) {
        a aVar = new a();
        aVar.a("is_native_crash", (Object) 1);
        aVar.a("crash_time", (Object) Long.valueOf(j));
        aVar.a("process_name", (Object) com.bytedance.crash.i.a.d(context));
        aVar.a("remote_process", (Object) 0);
        aVar.a("data", (Object) null);
        com.bytedance.crash.i.a.a(context, aVar.f19417a);
        return aVar;
    }

    public static a a(long j, Context context, @Nullable Thread thread, @NonNull Throwable th) {
        String str;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        a aVar = new a();
        aVar.a("isJava", (Object) 1);
        aVar.a("data", (Object) m.a(th));
        aVar.a("isOOM", (Object) Boolean.valueOf(m.b(th)));
        aVar.a("crash_time", (Object) Long.valueOf(j));
        aVar.a("process_name", (Object) com.bytedance.crash.i.a.d(context));
        if (!com.bytedance.crash.i.a.b(context)) {
            aVar.a("remote_process", (Object) 1);
        }
        com.bytedance.crash.i.a.a(context, aVar.f19417a);
        if (thread == null) {
            str = null;
        } else {
            str = thread.getName();
        }
        if (str != null) {
            aVar.a("crash_thread_name", (Object) str);
        }
        aVar.a("all_thread_stacks", (Object) m.a(str));
        return aVar;
    }

    public static a b(long j, @NonNull Context context, Thread thread, Throwable th) {
        String str;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("stack", m.a(th));
            jSONObject.put("isOOM", m.b(th));
            jSONObject.put("launch_did", com.bytedance.crash.g.a.a(context));
            jSONObject.put("timestamp", j);
            jSONObject.put("crash_time", j);
            jSONObject.put("event_type", "start_crash");
            jSONObject.put("main_process", com.bytedance.crash.i.a.b(context));
            jSONObject.put("process_name", com.bytedance.crash.i.a.d(context));
            jSONObject.put("crash_type", d.JAVA);
            if (thread != null) {
                str = thread.getName();
            } else {
                str = "";
            }
            jSONObject.put("crash_thread_name", str);
            com.bytedance.crash.i.a.a(context, jSONObject);
        } catch (Throwable unused) {
        }
        return new a(jSONObject);
    }
}

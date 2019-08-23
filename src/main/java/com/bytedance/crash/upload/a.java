package com.bytedance.crash.upload;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.c;
import com.bytedance.crash.event.b;
import com.bytedance.crash.i.d;
import com.bytedance.crash.i.h;
import com.bytedance.crash.j;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f19559b;

    /* renamed from: a  reason: collision with root package name */
    public volatile Context f19560a;

    public static a a() {
        if (f19559b == null) {
            f19559b = new a(j.d());
        }
        return f19559b;
    }

    private a(@NonNull Context context) {
        this.f19560a = context;
    }

    @Nullable
    public final String b(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            String b2 = b.b((Map) j.a().a());
            return d.a(h.a(this.f19560a), String.format("launch_%s.npth", new Object[]{String.valueOf(System.nanoTime())}), b2, jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public final String a(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() <= 0) {
            return null;
        }
        try {
            String a2 = b.a((Map) j.a().a());
            return d.a(h.a(this.f19560a), String.format("java_%s.npth", new Object[]{String.valueOf(System.nanoTime())}), a2, jSONObject, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void b(com.bytedance.crash.e.a aVar, String str, boolean z) {
        com.bytedance.crash.event.a a2 = b.a(com.bytedance.crash.d.LAUNCH, c.a.f19382f, aVar);
        com.bytedance.crash.event.c.b(a2);
        com.bytedance.crash.event.a eventType = a2.clone().eventType(c.a.g);
        if (aVar == null) {
            com.bytedance.crash.event.c.b(eventType.state(200));
            return;
        }
        JSONObject jSONObject = aVar.f19417a;
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.bytedance.crash.event.c.b(eventType.state(200));
            return;
        }
        if (str == null) {
            str = b(jSONObject);
        }
        String str2 = str;
        try {
            String b2 = b.b((Map) j.a().a());
            if (z) {
                a(a2.getCrashTime(), this.f19560a, com.bytedance.crash.d.LAUNCH, b2, jSONObject.toString(), str2);
            } else {
                jSONObject.put("upload_scene", "direct");
                h a3 = b.a(b2, jSONObject.toString());
                if (a3.a()) {
                    com.bytedance.crash.event.c.b(eventType.state(0).errorInfo(a3.f19589c));
                    if (!d.a(str2)) {
                        com.bytedance.crash.db.a.a().a(com.bytedance.crash.db.a.a.a(str2));
                    }
                } else {
                    com.bytedance.crash.event.c.b(eventType.state(a3.f19587a).errorInfo(a3.f19588b));
                }
            }
        } catch (Throwable th) {
            com.bytedance.crash.event.c.b(eventType.state(208).errorInfo(th));
        }
    }

    public final void a(com.bytedance.crash.e.a aVar, String str, boolean z) {
        com.bytedance.crash.event.a a2 = b.a(com.bytedance.crash.d.JAVA, c.a.f19382f, aVar);
        com.bytedance.crash.event.c.b(a2);
        com.bytedance.crash.event.a eventType = a2.clone().eventType(c.a.g);
        if (aVar == null) {
            com.bytedance.crash.event.c.b(eventType.state(200));
            return;
        }
        JSONObject jSONObject = aVar.f19417a;
        if (jSONObject == null || jSONObject.length() <= 0) {
            com.bytedance.crash.event.c.b(eventType.state(200));
            return;
        }
        if (str == null) {
            str = a(jSONObject);
        }
        try {
            String a3 = b.a((Map) j.a().a());
            jSONObject.put("upload_scene", "direct");
            h b2 = b.b(a3, jSONObject.toString());
            if (b2.a()) {
                com.bytedance.crash.event.c.b(eventType.state(0).errorInfo(b2.f19589c));
                if (!d.a(str)) {
                    com.bytedance.crash.db.a.a().a(com.bytedance.crash.db.a.a.a(str));
                }
            } else {
                com.bytedance.crash.event.c.b(eventType.state(b2.f19587a).errorInfo(b2.f19588b));
            }
        } catch (Throwable th) {
            com.bytedance.crash.event.c.b(eventType.state(208).errorInfo(th));
        }
    }

    public static boolean a(String str, String str2, String str3, List<String> list) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || list == null || list.size() == 0) {
            return false;
        }
        try {
            return b.a(b.a(), str, str2, str3, list);
        } catch (Throwable unused) {
            return false;
        }
    }

    private static void a(long j, Context context, com.bytedance.crash.d dVar, String str, String str2, String str3) {
        a(j, context, dVar, str, str2, str3, null);
    }

    private static void a(long j, Context context, com.bytedance.crash.d dVar, String str, String str2, String str3, String str4) {
        Intent intent = new Intent(context, CrashUploadService.class);
        if (dVar != null) {
            intent.putExtra("crash_type", dVar);
        }
        intent.putExtra("upload_url", str);
        intent.putExtra("crash_json_value", str2);
        intent.putExtra("crash_info_file_path", str3);
        intent.putExtra("crash_time", j);
        context.startService(intent);
    }
}

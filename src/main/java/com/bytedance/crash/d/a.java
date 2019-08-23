package com.bytedance.crash.d;

import android.text.TextUtils;
import com.bytedance.crash.d;
import com.bytedance.crash.e.b;
import com.bytedance.crash.i.m;
import com.bytedance.crash.runtime.assembly.e;
import com.bytedance.frameworks.core.b.c;
import java.util.Map;
import org.json.JSONObject;

public final class a {
    static void a(Map<String, String> map, b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (map != null) {
                for (String next : map.keySet()) {
                    jSONObject.put(next, map.get(next));
                }
                bVar.a("custom", (Object) jSONObject);
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z) {
        a(stackTraceElementArr, i, th, str, z, null);
    }

    public static void a(StackTraceElement[] stackTraceElementArr, int i, Throwable th, String str, boolean z, Map<String, String> map) {
        com.bytedance.frameworks.core.b.a.a();
        final StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        final int i2 = i;
        final Throwable th2 = th;
        final String str2 = str;
        final boolean z2 = z;
        final Map<String, String> map2 = map;
        AnonymousClass1 r0 = new c() {
            public final void run() {
                StackTraceElement[] stackTraceElementArr = stackTraceElementArr2;
                int i = i2;
                Throwable th = th2;
                String str = str2;
                boolean z = z2;
                Map map = map2;
                if (stackTraceElementArr != null) {
                    try {
                        if (stackTraceElementArr.length > i + 1) {
                            if (th != null) {
                                StackTraceElement stackTraceElement = stackTraceElementArr[i];
                                if (stackTraceElement != null) {
                                    String a2 = m.a(th);
                                    if (!TextUtils.isEmpty(a2)) {
                                        b a3 = b.a(stackTraceElement, a2, str, Thread.currentThread().getName(), z, "EnsureNotReachHere");
                                        a.a(map, a3);
                                        e.a().a(d.ENSURE, a3);
                                        com.bytedance.crash.upload.c.a(a3);
                                        new StringBuilder("[reportException] ").append(str);
                                    }
                                }
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        };
        com.bytedance.frameworks.core.b.a.a(r0);
    }
}

package com.bytedance.apm.b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.apm.d.a.a;
import com.bytedance.apm.d.b.c;
import com.taobao.android.dexposed.ClassUtils;
import org.json.JSONObject;

public class b {

    /* renamed from: e  reason: collision with root package name */
    private static volatile b f18890e;

    /* renamed from: a  reason: collision with root package name */
    Handler f18891a;

    /* renamed from: b  reason: collision with root package name */
    public String f18892b;

    /* renamed from: c  reason: collision with root package name */
    Runnable f18893c = new Runnable() {
        public final void run() {
            try {
                StringBuilder sb = new StringBuilder();
                StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                if (!stackTrace[0].getClassName().startsWith(b.this.f18892b)) {
                    int i = 0;
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        i++;
                        sb.append("\tat " + stackTraceElement.getClassName());
                        sb.append(ClassUtils.PACKAGE_SEPARATOR);
                        sb.append(stackTraceElement.getMethodName());
                        sb.append("(");
                        sb.append(stackTraceElement.getFileName());
                        sb.append(":");
                        sb.append(stackTraceElement.getLineNumber());
                        sb.append(")\n");
                        if (i > 50) {
                            break;
                        }
                    }
                    String sb2 = sb.toString();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("stack", sb2);
                        jSONObject.put("event_type", "lag");
                        a.b().a(new c("block_monitor", jSONObject));
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public long f18894d = 1000;

    /* renamed from: f  reason: collision with root package name */
    private HandlerThread f18895f = new HandlerThread("caton_dump_stack", 10);

    public final void b() {
        try {
            this.f18891a.removeCallbacks(this.f18893c);
        } catch (Exception unused) {
        }
    }

    public static b a() {
        if (f18890e == null) {
            synchronized (b.class) {
                if (f18890e == null) {
                    f18890e = new b();
                }
            }
        }
        return f18890e;
    }

    private b() {
        this.f18895f.start();
        this.f18891a = new Handler(this.f18895f.getLooper());
        this.f18892b = a.class.getName();
    }
}

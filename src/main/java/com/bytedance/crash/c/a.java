package com.bytedance.crash.c;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Printer;
import com.bytedance.crash.d;
import com.bytedance.crash.e.b;
import com.bytedance.crash.i.m;
import com.bytedance.crash.j;
import com.bytedance.crash.runtime.assembly.e;
import com.bytedance.frameworks.core.b.c;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONObject;

public class a {
    private static a h;

    /* renamed from: a  reason: collision with root package name */
    public boolean f19383a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentLinkedQueue<C0151a> f19384b = new ConcurrentLinkedQueue<>();

    /* renamed from: c  reason: collision with root package name */
    public C0151a f19385c = null;

    /* renamed from: d  reason: collision with root package name */
    public Printer f19386d = new Printer() {
        public final void println(String str) {
            a.this.f19385c = new C0151a(a.this, (byte) 0);
            a.this.f19385c.f19394a = SystemClock.uptimeMillis();
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public Runnable f19387e = new Runnable() {
        public final void run() {
            if (a.this.f19385c != null) {
                a.this.f19385c.f19396c = Looper.getMainLooper().getThread().getStackTrace();
                a.this.f19384b.add(a.this.f19385c);
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public Runnable f19388f = new Runnable() {
        public final void run() {
            if (a.this.f19385c != null) {
                a.this.f19385c.f19395b = SystemClock.uptimeMillis();
                if (a.this.f19385c.f19396c != null) {
                    a aVar = a.this;
                    if (!aVar.f19384b.isEmpty()) {
                        com.bytedance.frameworks.core.b.a.a();
                        com.bytedance.frameworks.core.b.a.a(new c() {
                            public final void run() {
                                C0151a aVar;
                                try {
                                    aVar = a.this.f19384b.poll();
                                } catch (Throwable unused) {
                                    aVar = null;
                                }
                                if (aVar != null && aVar.f19396c != null && aVar.f19396c.length != 0) {
                                    StackTraceElement[] stackTraceElementArr = aVar.f19396c;
                                    new StringBuilder("[elements size] = ").append(stackTraceElementArr.length);
                                    m.a(stackTraceElementArr);
                                    String a2 = m.a(stackTraceElementArr);
                                    b bVar = new b("caton_monitor");
                                    bVar.a("event_type", (Object) "lag");
                                    bVar.a("log_type", (Object) "caton_monitor");
                                    bVar.a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
                                    bVar.a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
                                    bVar.a("process_name", (Object) com.bytedance.crash.i.a.d(j.d()));
                                    bVar.a("crash_thread_name", (Object) "main");
                                    bVar.a("stack", (Object) a2);
                                    com.bytedance.crash.i.a.a(j.d(), bVar.f19417a);
                                    bVar.a("block_duration", (Object) Long.valueOf(aVar.f19395b - aVar.f19394a));
                                    e.a().a(d.BLOCK, bVar);
                                    com.bytedance.crash.upload.c.a(bVar);
                                    JSONObject jSONObject = bVar.f19417a;
                                }
                            }
                        });
                    }
                }
            }
        }
    };
    public Printer g = new Printer() {
        public final void println(String str) {
            a.this.f19388f.run();
        }
    };

    /* renamed from: com.bytedance.crash.c.a$a  reason: collision with other inner class name */
    class C0151a {

        /* renamed from: a  reason: collision with root package name */
        long f19394a;

        /* renamed from: b  reason: collision with root package name */
        long f19395b;

        /* renamed from: c  reason: collision with root package name */
        StackTraceElement[] f19396c;

        private C0151a() {
            this.f19394a = -1;
            this.f19395b = -1;
        }

        /* synthetic */ C0151a(a aVar, byte b2) {
            this();
        }
    }

    public static a a() {
        if (h == null) {
            synchronized (a.class) {
                if (h == null) {
                    h = new a();
                }
            }
        }
        return h;
    }

    private a() {
    }
}

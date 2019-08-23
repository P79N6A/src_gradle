package com.bytedance.crash.a;

import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.bytedance.crash.i;
import com.bytedance.crash.i.h;
import com.bytedance.crash.j;
import com.bytedance.frameworks.core.b.c;
import java.io.File;
import java.util.List;
import java.util.Map;

public class a implements g {

    /* renamed from: d  reason: collision with root package name */
    private static volatile a f19332d;

    /* renamed from: a  reason: collision with root package name */
    public volatile String f19333a;

    /* renamed from: b  reason: collision with root package name */
    public volatile c f19334b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f19335c;

    private a() {
        i.a((g) this, d.ALL);
    }

    public static a a() {
        if (f19332d == null) {
            synchronized (a.class) {
                if (f19332d == null) {
                    f19332d = new a();
                }
            }
        }
        return f19332d;
    }

    public static boolean a(com.bytedance.crash.e.d dVar) {
        if (TextUtils.isEmpty(dVar.f19428f) || TextUtils.isEmpty(dVar.f19427e) || TextUtils.isEmpty(dVar.g) || dVar.h == null || dVar.h.size() == 0) {
            return false;
        }
        return true;
    }

    public static com.bytedance.crash.e.d a(List<String> list) {
        String str;
        com.bytedance.crash.e.d dVar = new com.bytedance.crash.e.d();
        Map a2 = j.a().a();
        if (a2 != null) {
            dVar.f19428f = (String) a2.get("aid");
        }
        dVar.f19427e = j.c().a();
        if (j.a().b().contains(":")) {
            str = j.a().b();
        } else {
            str = "main";
        }
        dVar.g = str;
        dVar.h = list;
        return dVar;
    }

    public final void a(@NonNull d dVar, @Nullable String str, @Nullable Thread thread) {
        if (!dVar.equals(d.NATIVE)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!TextUtils.isEmpty(this.f19333a) && new File(this.f19333a).exists()) {
                if (this.f19334b != null) {
                    this.f19334b.a();
                }
                List list = null;
                if (this.f19335c != null) {
                    list = this.f19335c.a(this.f19333a, currentTimeMillis);
                }
                if (list != null && list.size() > 0) {
                    final com.bytedance.crash.e.d a2 = a(list);
                    if (a(a2)) {
                        final String a3 = com.bytedance.crash.i.d.a(h.c(j.d()), h.a(), a2.f19427e, a2.f19428f, a2.g, a2.h);
                        AnonymousClass1 r9 = new c() {
                            public final void run() {
                                com.bytedance.crash.upload.a.a();
                                if (com.bytedance.crash.upload.a.a(a2.f19428f, a2.f19427e, a2.g, a2.h)) {
                                    com.bytedance.crash.i.d.a(a3);
                                }
                            }
                        };
                        if (Looper.getMainLooper() == Looper.myLooper()) {
                            com.bytedance.frameworks.core.b.a.a();
                            com.bytedance.frameworks.core.b.a.a(r9);
                            return;
                        }
                        r9.run();
                    }
                }
            }
        }
    }
}

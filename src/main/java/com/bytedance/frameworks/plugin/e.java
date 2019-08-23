package com.bytedance.frameworks.plugin;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.c.a;
import com.bytedance.frameworks.plugin.c.c;
import com.bytedance.frameworks.plugin.c.d;
import com.bytedance.frameworks.plugin.c.g;
import com.bytedance.frameworks.plugin.c.h;
import com.bytedance.frameworks.plugin.c.k;
import com.bytedance.frameworks.plugin.hook.HookFactory;

public class e extends Application {

    /* renamed from: a  reason: collision with root package name */
    private static Context f2246a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f2247b = true;

    public static Context a() {
        return f2246a;
    }

    public void onCreate() {
        super.onCreate();
        if (f2247b && (f.b(this) || f.c(this))) {
            try {
                k a2 = k.a();
                a2.a(new a());
                a2.a(new h());
                a2.a(new g());
                a2.a(new d());
                a2.a(new c());
                a2.a(new com.bytedance.frameworks.plugin.c.f());
                if (Build.VERSION.SDK_INT >= 21) {
                    a2.a(new com.bytedance.frameworks.plugin.c.e());
                }
                HookFactory.getInstance().installHook();
            } catch (Throwable th) {
                com.bytedance.frameworks.plugin.f.g.a("Mira installHook fail.", th);
            }
        }
    }

    public static void a(Context context) {
        f2246a = context;
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        f2246a = this;
        a(this);
        if (f2247b) {
            if (f.b(this) || f.c(this)) {
                try {
                    Mira.a(this);
                    HookFactory.getInstance().hookClassLoader();
                } catch (Throwable th) {
                    com.bytedance.frameworks.plugin.f.g.a("Mira init fail.", th);
                }
            }
            if (Mira.f2139a) {
                com.bytedance.frameworks.plugin.component.a.c.a();
            }
        }
    }
}

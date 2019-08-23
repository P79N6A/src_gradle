package com.bytedance.frameworks.plugin.core.res;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.IBinder;
import android.util.DisplayMetrics;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import java.lang.reflect.Constructor;

public final class c {

    protected static class a {
        protected a() {
        }

        /* access modifiers changed from: package-private */
        public Resources a(Resources resources, AssetManager assetManager) {
            String name = resources.getClass().getName();
            try {
                Constructor<?> declaredConstructor = Class.forName(name).getDeclaredConstructor(new Class[]{AssetManager.class, DisplayMetrics.class, Configuration.class});
                declaredConstructor.setAccessible(true);
                return (Resources) declaredConstructor.newInstance(new Object[]{assetManager, resources.getDisplayMetrics(), resources.getConfiguration()});
            } catch (Exception e2) {
                g.a("ResourcesFactory", "create adapted resources failed: " + name, e2);
                return null;
            }
        }
    }

    static class b extends a {
        private b() {
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final Resources a(Resources resources, AssetManager assetManager) {
            if (Build.VERSION.SDK_INT <= 23) {
                return super.a(resources, assetManager);
            }
            try {
                Class<?> cls = Class.forName("android.view.DisplayAdjustments");
                Constructor<?> declaredConstructor = Class.forName("android.content.res.HwResources").getDeclaredConstructor(new Class[]{AssetManager.class, DisplayMetrics.class, Configuration.class, cls, IBinder.class});
                declaredConstructor.setAccessible(true);
                return (Resources) declaredConstructor.newInstance(new Object[]{assetManager, resources.getDisplayMetrics(), resources.getConfiguration(), com.bytedance.frameworks.plugin.e.b.a((Object) resources, "getDisplayAdjustments", new Object[0]), null});
            } catch (Exception e2) {
                g.a("ResourcesFactory", "create adapted hwResources over android7 failed: " + resources.getClass().getName(), e2);
                return null;
            }
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.core.res.c$c  reason: collision with other inner class name */
    static class C0013c extends a {
        private C0013c() {
        }

        /* synthetic */ C0013c(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final Resources a(Resources resources, AssetManager assetManager) {
            Resources a2 = super.a(resources, assetManager);
            if (a2 != null) {
                try {
                    com.bytedance.frameworks.plugin.e.b.a((Object) a2, "init", e.a().getPackageName());
                    com.bytedance.frameworks.plugin.e.a.a((Object) a2, "mThemeValues", com.bytedance.frameworks.plugin.e.a.a((Object) resources, "mThemeValues"));
                } catch (Exception unused) {
                }
            }
            return a2;
        }
    }

    public static synchronized Resources a(Resources resources, AssetManager assetManager) {
        Resources resources2;
        synchronized (c.class) {
            String name = resources.getClass().getName();
            resources2 = null;
            if (!"android.content.res.Resources".equals(name)) {
                if ("android.content.res.HwResources".equals(name)) {
                    resources2 = new b((byte) 0).a(resources, assetManager);
                } else if ("android.content.res.VivoResources".equals(name)) {
                    resources2 = new C0013c((byte) 0).a(resources, assetManager);
                } else {
                    resources2 = new a().a(resources, assetManager);
                }
            }
            if (resources2 == null) {
                resources2 = new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration());
            }
        }
        return resources2;
    }
}

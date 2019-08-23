package com.bytedance.frameworks.plugin.core;

import android.os.Build;
import com.bytedance.frameworks.plugin.e.a;
import com.bytedance.frameworks.plugin.f.g;
import java.util.ArrayList;
import java.util.List;

public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f2196a;

    static {
        ArrayList arrayList = new ArrayList();
        f2196a = arrayList;
        arrayList.add("QIKU");
    }

    public final Class<?> a(String str) throws ClassNotFoundException {
        return super.findClass(str);
    }

    /* access modifiers changed from: protected */
    public final Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        if (Build.MANUFACTURER != null && f2196a.contains(Build.MANUFACTURER.toUpperCase())) {
            try {
                Class<?> findClass = findClass(str);
                if (findClass != null) {
                    return findClass;
                }
            } catch (ClassNotFoundException e2) {
                g.a("PluginClassLoader", "UCK QIKU:error", e2);
            }
        }
        return super.loadClass(str, z);
    }

    public e(String str, String str2, String str3, ClassLoader classLoader, boolean z) {
        super(str, str2, str3, classLoader, z);
        if (!z) {
            try {
                a.a(a.a((Object) this, "pathList"), "definingContext", (Object) com.bytedance.frameworks.plugin.e.a().getClassLoader());
                g.a("hook pathList definingContext success");
            } catch (IllegalAccessException e2) {
                g.a("hook pathList definingContext fail", (Throwable) e2);
            }
        }
    }
}

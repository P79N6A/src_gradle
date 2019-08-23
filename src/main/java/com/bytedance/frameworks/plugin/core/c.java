package com.bytedance.frameworks.plugin.core;

import android.text.TextUtils;
import com.bytedance.frameworks.plugin.b.a;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.d.d;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

public final class c extends ClassLoader {

    /* renamed from: a  reason: collision with root package name */
    private Method f2192a = b.a(ClassLoader.class, "findClass", (Class<?>[]) new Class[]{String.class});

    /* renamed from: b  reason: collision with root package name */
    private Method f2193b = b.a(ClassLoader.class, "findLoadedClass", (Class<?>[]) new Class[]{String.class});

    public c(ClassLoader classLoader) {
        super(classLoader);
    }

    /* access modifiers changed from: protected */
    public final Class<?> findClass(String str) throws ClassNotFoundException {
        Throwable th;
        Class<?> cls = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f2193b != null) {
            try {
                cls = (Class) this.f2193b.invoke(e.a().getClassLoader(), new Object[]{str});
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            th = null;
        }
        if (cls == null && this.f2192a != null) {
            try {
                cls = (Class) this.f2192a.invoke(e.a().getClassLoader(), new Object[]{str});
            } catch (Throwable th3) {
                th = th3;
            }
        }
        if (cls == null) {
            ArrayList<f> arrayList = new ArrayList<>();
            for (String str2 : new ArrayList(a.f2157c.keySet())) {
                if (!com.bytedance.frameworks.plugin.pm.c.i(str2)) {
                    f a2 = a.a(str2);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            if (arrayList.size() > 0) {
                for (f a3 : arrayList) {
                    try {
                        cls = a3.a(str);
                        continue;
                    } catch (Throwable th4) {
                        th = th4;
                        continue;
                    }
                    if (cls != null) {
                        break;
                    }
                }
            }
        }
        if (cls == null) {
            for (com.bytedance.frameworks.plugin.a.b bVar : com.bytedance.frameworks.plugin.d.b.a().c()) {
                String str3 = bVar.f2145a;
                if (a(str3, str)) {
                    if (a.a(str3) == null) {
                        d.a().b(str3);
                    }
                    f a4 = a.a(str3);
                    if (a4 != null) {
                        try {
                            Class<?> a5 = a4.a(str);
                            if (a5 != null) {
                                return a5;
                            }
                            cls = a5;
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (cls != null || th == null) {
            return cls;
        }
        if (("com.ss.android.video.VideoDependImpl".equals(str) || "com.ss.android.wenda.WendaDependImpl".equals(str)) && f.b(e.a())) {
            com.bytedance.frameworks.plugin.a.b a6 = com.bytedance.frameworks.plugin.d.b.a().a("com.ss.android.video");
            com.bytedance.frameworks.plugin.a.b a7 = com.bytedance.frameworks.plugin.d.b.a().a("com.ss.android.wenda");
            g.c("load " + str + " fail. videoAttribute =" + a6 + " wendaAttribute = " + a7);
        }
        throw new ClassNotFoundException(str + " not found in DelegateClassloader", th);
    }

    private static boolean a(String str, String str2) {
        com.bytedance.frameworks.plugin.a.b a2 = com.bytedance.frameworks.plugin.d.b.a().a(str);
        if (a2 == null || a2.h) {
            return false;
        }
        if (str2.startsWith(str + ClassUtils.PACKAGE_SEPARATOR)) {
            return true;
        }
        Iterator<String> it2 = a2.j.iterator();
        while (it2.hasNext()) {
            if (str2.startsWith(it2.next() + ClassUtils.PACKAGE_SEPARATOR)) {
                return true;
            }
        }
        return false;
    }
}

package com.bytedance.frameworks.plugin.core;

import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import dalvik.system.DexClassLoader;

public class f extends DexClassLoader {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2197a;

    public String toString() {
        return super.toString() + " standalone=" + this.f2197a;
    }

    public Class<?> a(String str) throws ClassNotFoundException {
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass == null) {
            return findClass(str);
        }
        return findLoadedClass;
    }

    public String findLibrary(String str) {
        ClassLoader classLoader;
        String str2;
        String findLibrary = super.findLibrary(str);
        if (this.f2197a) {
            return findLibrary;
        }
        if (TextUtils.isEmpty(findLibrary)) {
            try {
                i a2 = i.a();
                if (a2.f2209a == null) {
                    classLoader = e.class.getClassLoader();
                } else {
                    classLoader = a2.f2209a;
                }
                if (classLoader != null) {
                    if (classLoader instanceof f) {
                        str2 = (String) b.a((Object) classLoader, "findLibraryFromCurrent", str);
                    } else {
                        str2 = (String) b.a((Object) classLoader, "findLibrary", str);
                    }
                    findLibrary = str2;
                }
            } catch (Exception unused) {
            }
        }
        if (!TextUtils.isEmpty(findLibrary)) {
            return findLibrary;
        }
        try {
            return (String) b.a((Object) e.class.getClassLoader(), "findLibrary", str);
        } catch (Exception unused2) {
            return findLibrary;
        }
    }

    /* access modifiers changed from: protected */
    public Class<?> loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassNotFoundException e2;
        Class<?> cls = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f2197a) {
            try {
                Class<?> loadClass = getParent().loadClass(str);
                if (loadClass != null) {
                    return loadClass;
                }
                cls = loadClass;
                e2 = null;
            } catch (ClassNotFoundException e3) {
                e2 = e3;
            }
        } else {
            e2 = null;
        }
        try {
            cls = a(str);
        } catch (ClassNotFoundException e4) {
            e2 = e4;
        }
        if (!this.f2197a && cls == null) {
            ClassLoader classLoader = e.class.getClassLoader();
            if (classLoader != null) {
                try {
                    cls = classLoader.loadClass(str);
                } catch (ClassNotFoundException e5) {
                    e2 = e5;
                }
            }
        }
        if (cls != null || e2 == null) {
            return cls;
        }
        throw new ClassNotFoundException(str + " not found in PluginClassLoader", e2);
    }

    public f(String str, String str2, String str3, ClassLoader classLoader) {
        this(str, str2, str3, classLoader, false);
    }

    public f(String str, String str2, String str3, ClassLoader classLoader, boolean z) {
        super(str, str2, str3, classLoader);
        this.f2197a = z;
    }
}

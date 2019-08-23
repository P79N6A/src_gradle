package com.bytedance.frameworks.plugin.c;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

public final class h extends j {

    /* renamed from: a  reason: collision with root package name */
    public static Object f2173a;

    static class a extends i {
        a() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                ComponentName componentName = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof ComponentName)) {
                    componentName = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if (componentName != null && (16777216 & i) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.a(componentName, i);
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class b extends i {
        b() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (objArr != null) {
                String str = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    str = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if ((16777216 & i) == 0) {
                    if (com.bytedance.frameworks.plugin.pm.c.a(str)) {
                        return com.bytedance.frameworks.plugin.pm.c.b(str, i);
                    }
                    if (TextUtils.equals(str, com.bytedance.frameworks.plugin.e.a().getPackageName()) && (i & SearchJediMixFeedAdapter.f42517f) != 0) {
                        ApplicationInfo b2 = com.bytedance.frameworks.plugin.pm.c.b(str, i);
                        if (!(b2 == null || b2.metaData == null || b2.metaData.size() <= 0)) {
                            ApplicationInfo applicationInfo = (ApplicationInfo) obj2;
                            if (applicationInfo.metaData == null) {
                                applicationInfo.metaData = new Bundle();
                            }
                            applicationInfo.metaData.putAll(b2.metaData);
                        }
                    }
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class c extends i {
        c() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String) && com.bytedance.frameworks.plugin.pm.c.a(objArr[0])) {
                objArr[0] = com.bytedance.frameworks.plugin.e.a().getPackageName();
            }
            return super.a(obj, method, objArr);
        }
    }

    static class d extends i {
        d() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                String str = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    str = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if (str != null && (16777216 & i) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.a(str, i);
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class e extends i {
        e() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                ComponentName componentName = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof ComponentName)) {
                    componentName = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if (componentName != null && (16777216 & i) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.d(componentName, i);
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class f extends i {
        f() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                ComponentName componentName = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof ComponentName)) {
                    componentName = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if (componentName != null && (16777216 & i) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.b(componentName, i);
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class g extends i {
        g() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                ComponentName componentName = null;
                int i = 0;
                if (objArr.length > 0 && (objArr[0] instanceof ComponentName)) {
                    componentName = objArr[0];
                }
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    i = objArr[1].intValue();
                }
                if (componentName != null && (16777216 & i) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.c(componentName, i);
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.c.h$h  reason: collision with other inner class name */
    static class C0168h extends i {
        C0168h() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (h.a(obj2) && objArr != null) {
                Intent intent = null;
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = objArr[0];
                }
                Integer num = 0;
                if (objArr.length > 2 && (objArr[2] instanceof Integer)) {
                    num = objArr[2];
                }
                if (intent != null && (num.intValue() & 16777216) == 0) {
                    List b2 = com.bytedance.frameworks.plugin.pm.c.b(intent, num.intValue());
                    if (h.b(method)) {
                        return h.a(b2);
                    }
                    return b2;
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class i extends i {
        i() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (h.a(obj2) && objArr != null) {
                Intent intent = null;
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = objArr[0];
                }
                Integer num = 0;
                if (objArr.length > 2 && (objArr[2] instanceof Integer)) {
                    num = objArr[2];
                }
                if (intent != null && (num.intValue() & 16777216) == 0) {
                    List d2 = com.bytedance.frameworks.plugin.pm.c.d(intent, num.intValue());
                    if (h.b(method)) {
                        return h.a(d2);
                    }
                    return d2;
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class j extends i {
        j() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                String str = null;
                if (objArr.length > 0 && (objArr[0] instanceof String)) {
                    str = objArr[0];
                }
                Integer num = 0;
                if (objArr.length > 1 && (objArr[1] instanceof Integer)) {
                    num = objArr[1];
                }
                if (str != null && (num.intValue() & 16777216) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.c(str, num.intValue());
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class k extends i {
        k() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                Intent intent = null;
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = objArr[0];
                }
                Integer num = 0;
                if (objArr.length > 2 && (objArr[2] instanceof Integer)) {
                    num = objArr[2];
                }
                if (intent != null && (num.intValue() & 16777216) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.a(intent, num.intValue());
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static class l extends i {
        l() {
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            if (obj2 == null && objArr != null) {
                Intent intent = null;
                if (objArr.length > 0 && (objArr[0] instanceof Intent)) {
                    intent = objArr[0];
                }
                Integer num = 0;
                if (objArr.length > 2 && (objArr[2] instanceof Integer)) {
                    num = objArr[2];
                }
                if (intent != null && (num.intValue() & 16777216) == 0) {
                    return com.bytedance.frameworks.plugin.pm.c.c(intent, num.intValue());
                }
            }
            return super.a(obj, method, objArr, obj2);
        }
    }

    static {
        f2174b.put("getPackageInfo", new d());
        f2174b.put("getApplicationInfo", new b());
        f2174b.put("getActivityInfo", new a());
        f2174b.put("getReceiverInfo", new f());
        f2174b.put("getServiceInfo", new g());
        f2174b.put("getProviderInfo", new e());
        f2174b.put("queryIntentActivities", new C0168h());
        f2174b.put("queryIntentServices", new i());
        f2174b.put("resolveIntent", new k());
        f2174b.put("resolveService", new l());
        f2174b.put("resolveContentProvider", new j());
        f2174b.put("getInstallerPackageName", new c());
    }

    public final void a() {
        Object a2 = com.bytedance.frameworks.plugin.b.a.a();
        try {
            Object a3 = com.bytedance.frameworks.plugin.e.a.a(a2, "sPackageManager");
            if (a3 != null && (this.f2179f == null || a3 != this.f2179f)) {
                b(a3);
                f2173a = l.a(this.f2178e, (InvocationHandler) this);
                this.f2179f = f2173a;
                com.bytedance.frameworks.plugin.e.a.a(a2, "sPackageManager", f2173a);
                com.bytedance.frameworks.plugin.e.a.a((Object) com.bytedance.frameworks.plugin.e.a().getPackageManager(), "mPM", f2173a);
            }
        } catch (Exception e2) {
            com.bytedance.frameworks.plugin.f.g.a("Hook proxy PackageManager Failed!!!", (Throwable) e2);
        }
    }

    public static boolean b(Method method) {
        try {
            if (method.getReturnType() == Class.forName("android.content.pm.ParceledListSlice")) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static Object a(List list) {
        try {
            Constructor<?> declaredConstructor = Class.forName("android.content.pm.ParceledListSlice").getDeclaredConstructor(new Class[]{List.class});
            if (declaredConstructor != null) {
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(new Object[]{list});
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static boolean a(Object obj) {
        if (obj == null) {
            return true;
        }
        if (obj instanceof Collection) {
            return ((Collection) obj).isEmpty();
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.ParceledListSlice");
            if (obj.getClass() == cls) {
                Method a2 = com.bytedance.frameworks.plugin.e.b.a(cls, "getList", (Class<?>[]) new Class[0]);
                if (a2 != null) {
                    List list = (List) a2.invoke(obj, new Object[0]);
                    if (list == null || list.isEmpty()) {
                        return true;
                    }
                    return false;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}

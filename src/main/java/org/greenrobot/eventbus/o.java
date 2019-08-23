package org.greenrobot.eventbus;

import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.a.c;
import org.greenrobot.eventbus.a.d;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Class<?>, List<n>> f84139a = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final a[] f84140e = new a[4];

    /* renamed from: b  reason: collision with root package name */
    private List<d> f84141b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f84142c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84143d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final List<n> f84144a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Map<Class, Object> f84145b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        final Map<String, Class> f84146c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        final StringBuilder f84147d = new StringBuilder(SearchJediMixFeedAdapter.f42517f);

        /* renamed from: e  reason: collision with root package name */
        Class<?> f84148e;

        /* renamed from: f  reason: collision with root package name */
        Class<?> f84149f;
        boolean g;
        c h;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (!this.g) {
                this.f84149f = this.f84149f.getSuperclass();
                String name = this.f84149f.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f84149f = null;
        }

        /* access modifiers changed from: package-private */
        public final void a(Class<?> cls) {
            this.f84149f = cls;
            this.f84148e = cls;
            this.g = false;
            this.h = null;
        }

        private boolean b(Method method, Class<?> cls) {
            this.f84147d.setLength(0);
            this.f84147d.append(method.getName());
            StringBuilder sb = this.f84147d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f84147d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f84146c.put(sb2, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f84146c.put(sb2, put);
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(Method method, Class<?> cls) {
            Object put = this.f84145b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f84145b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }
    }

    private static a a() {
        synchronized (f84140e) {
            int i = 0;
            while (i < 4) {
                try {
                    a aVar = f84140e[i];
                    if (aVar != null) {
                        f84140e[i] = null;
                        return aVar;
                    }
                    i++;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            return new a();
        }
    }

    private List<n> c(Class<?> cls) {
        a a2 = a();
        a2.a(cls);
        while (a2.f84149f != null) {
            c(a2);
            a2.a();
        }
        return a(a2);
    }

    private static List<n> a(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f84144a);
        aVar.f84144a.clear();
        aVar.f84145b.clear();
        aVar.f84146c.clear();
        int i = 0;
        aVar.f84147d.setLength(0);
        aVar.f84148e = null;
        aVar.f84149f = null;
        aVar.g = false;
        aVar.h = null;
        synchronized (f84140e) {
            while (true) {
                if (i >= 4) {
                    break;
                }
                try {
                    if (f84140e[i] == null) {
                        f84140e[i] = aVar;
                        break;
                    }
                    i++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return arrayList;
    }

    private List<n> b(Class<?> cls) {
        a a2 = a();
        a2.a(cls);
        while (a2.f84149f != null) {
            a2.h = b(a2);
            if (a2.h != null) {
                for (n nVar : a2.h.c()) {
                    if (a2.a(nVar.f84133a, nVar.f84135c)) {
                        a2.f84144a.add(nVar);
                    }
                }
            } else {
                c(a2);
            }
            a2.a();
        }
        return a(a2);
    }

    private c b(a aVar) {
        if (!(aVar.h == null || aVar.h.b() == null)) {
            c b2 = aVar.h.b();
            if (aVar.f84149f == b2.a()) {
                return b2;
            }
        }
        if (this.f84141b != null) {
            for (d a2 : this.f84141b) {
                c a3 = a2.a(aVar.f84149f);
                if (a3 != null) {
                    return a3;
                }
            }
        }
        return null;
    }

    private void c(a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f84149f.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f84149f.getMethods();
            aVar.g = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & 5192) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    if (subscribe != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            ThreadMode a2 = subscribe.a();
                            List<n> list = aVar.f84144a;
                            n nVar = new n(method, cls, a2, subscribe.c(), subscribe.b());
                            list.add(nVar);
                        }
                    }
                } else if (this.f84142c && method.isAnnotationPresent(Subscribe.class)) {
                    String str = method.getDeclaringClass().getName() + ClassUtils.PACKAGE_SEPARATOR + method.getName();
                    throw new e("@Subscribe method " + str + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f84142c && method.isAnnotationPresent(Subscribe.class)) {
                String str2 = method.getDeclaringClass().getName() + ClassUtils.PACKAGE_SEPARATOR + method.getName();
                throw new e(str2 + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final List<n> a(Class<?> cls) {
        List<n> list;
        List<n> list2 = f84139a.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f84143d) {
            list = c(cls);
        } else {
            list = b(cls);
        }
        if (!list.isEmpty()) {
            f84139a.put(cls, list);
            return list;
        }
        throw new e("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    o(List<d> list, boolean z, boolean z2) {
        this.f84141b = list;
        this.f84142c = z;
        this.f84143d = z2;
    }
}

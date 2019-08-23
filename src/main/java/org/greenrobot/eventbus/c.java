package org.greenrobot.eventbus;

import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.h;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static String f84094a = "EventBus";

    /* renamed from: b  reason: collision with root package name */
    static volatile c f84095b;

    /* renamed from: e  reason: collision with root package name */
    private static final d f84096e = new d();

    /* renamed from: f  reason: collision with root package name */
    private static final Map<Class<?>, List<Class<?>>> f84097f = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f84098c;

    /* renamed from: d  reason: collision with root package name */
    public final g f84099d;
    private final Map<Class<?>, CopyOnWriteArrayList<p>> g;
    private final Map<Object, List<Class<?>>> h;
    private final Map<Class<?>, Object> i;
    private final ThreadLocal<a> j;
    private final h k;
    private final l l;
    private final b m;
    private final a n;
    private final o o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final int v;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<Object> f84102a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        boolean f84103b;

        /* renamed from: c  reason: collision with root package name */
        boolean f84104c;

        /* renamed from: d  reason: collision with root package name */
        p f84105d;

        /* renamed from: e  reason: collision with root package name */
        Object f84106e;

        /* renamed from: f  reason: collision with root package name */
        boolean f84107f;

        a() {
        }
    }

    public final void a(Object obj) {
        List<n> a2 = this.o.a(obj.getClass());
        synchronized (this) {
            for (n a3 : a2) {
                a(obj, a3);
            }
        }
    }

    public final <T> T a(Class<T> cls) {
        T cast;
        synchronized (this.i) {
            cast = cls.cast(this.i.remove(cls));
        }
        return cast;
    }

    /* access modifiers changed from: package-private */
    public final void a(j jVar) {
        Object obj = jVar.f84124a;
        p pVar = jVar.f84125b;
        j.a(jVar);
        if (pVar.f84152c) {
            b(pVar, obj);
        }
    }

    public c() {
        this(f84096e);
    }

    private boolean b() {
        if (this.k != null) {
            return this.k.a();
        }
        return true;
    }

    public static c a() {
        if (f84095b == null) {
            synchronized (c.class) {
                if (f84095b == null) {
                    f84095b = new c();
                }
            }
        }
        return f84095b;
    }

    public String toString() {
        return "EventBus[indexCount=" + this.v + ", eventInheritance=" + this.u + "]";
    }

    public final synchronized boolean b(Object obj) {
        return this.h.containsKey(obj);
    }

    public final void e(Object obj) {
        synchronized (this.i) {
            this.i.put(obj.getClass(), obj);
        }
        d(obj);
    }

    private static List<Class<?>> b(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f84097f) {
            list = f84097f.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f84097f.put(cls, list);
            }
        }
        return list;
    }

    public final boolean f(Object obj) {
        synchronized (this.i) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.i.get(cls))) {
                return false;
            }
            this.i.remove(cls);
            return true;
        }
    }

    public final synchronized void c(Object obj) {
        List<Class> list = this.h.get(obj);
        if (list != null) {
            for (Class cls : list) {
                List list2 = this.g.get(cls);
                if (list2 != null) {
                    int size = list2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        p pVar = (p) list2.get(i2);
                        if (pVar.f84150a == obj) {
                            pVar.f84152c = false;
                            list2.remove(i2);
                            i2--;
                            size--;
                        }
                        i2++;
                    }
                }
            }
            this.h.remove(obj);
            return;
        }
        this.f84099d.a(Level.WARNING, "Subscriber to unregister was not registered before: " + obj.getClass());
    }

    public final void d(Object obj) {
        a aVar = this.j.get();
        List<Object> list = aVar.f84102a;
        list.add(obj);
        if (!aVar.f84103b) {
            aVar.f84104c = b();
            aVar.f84103b = true;
            if (!aVar.f84107f) {
                while (!list.isEmpty()) {
                    try {
                        a(list.remove(0), aVar);
                    } finally {
                        aVar.f84103b = false;
                        aVar.f84104c = false;
                    }
                }
                return;
            }
            throw new e("Internal error. Abort state was not reset");
        }
    }

    c(d dVar) {
        g gVar;
        h hVar;
        int i2;
        this.j = new ThreadLocal<a>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object initialValue() {
                return new a();
            }
        };
        if (dVar.k != null) {
            gVar = dVar.k;
        } else if (!g.a.a() || d.a() == null) {
            gVar = new g.b();
        } else {
            gVar = new g.a("EventBus");
        }
        this.f84099d = gVar;
        this.g = new HashMap();
        this.h = new HashMap();
        this.i = new ConcurrentHashMap();
        l lVar = null;
        if (dVar.l != null) {
            hVar = dVar.l;
        } else {
            if (g.a.a()) {
                Object a2 = d.a();
                if (a2 != null) {
                    hVar = new h.a((Looper) a2);
                }
            }
            hVar = null;
        }
        this.k = hVar;
        this.l = this.k != null ? this.k.a(this) : lVar;
        this.m = new b(this);
        this.n = new a(this);
        if (dVar.j != null) {
            i2 = dVar.j.size();
        } else {
            i2 = 0;
        }
        this.v = i2;
        this.o = new o(dVar.j, dVar.h, dVar.g);
        this.q = dVar.f84108a;
        this.r = dVar.f84109b;
        this.s = dVar.f84110c;
        this.t = dVar.f84111d;
        this.p = dVar.f84112e;
        this.u = dVar.f84113f;
        this.f84098c = dVar.i;
    }

    private void a(p pVar, Object obj) {
        if (obj != null) {
            a(pVar, obj, b());
        }
    }

    private static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    private void a(Object obj, a aVar) throws Error {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.u) {
            List<Class<?>> b2 = b(cls);
            int size = b2.size();
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                z |= a(obj, aVar, b2.get(i2));
            }
        } else {
            z = a(obj, aVar, cls);
        }
        if (!z) {
            if (this.r) {
                g gVar = this.f84099d;
                Level level = Level.FINE;
                gVar.a(level, "No subscribers registered for event " + cls);
            }
            if (this.t && cls != i.class && cls != m.class) {
                d(new i(this, obj));
            }
        }
    }

    private void b(p pVar, Object obj) {
        try {
            pVar.f84151b.f84133a.invoke(pVar.f84150a, new Object[]{obj});
        } catch (InvocationTargetException e2) {
            a(pVar, obj, e2.getCause());
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Unexpected exception", e3);
        }
    }

    private void a(Object obj, n nVar) {
        Class<?> cls = nVar.f84135c;
        p pVar = new p(obj, nVar);
        CopyOnWriteArrayList copyOnWriteArrayList = this.g.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.g.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new e("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 > size) {
                break;
            } else if (i2 == size || nVar.f84136d > ((p) copyOnWriteArrayList.get(i2)).f84151b.f84136d) {
                copyOnWriteArrayList.add(i2, pVar);
            } else {
                i2++;
            }
        }
        copyOnWriteArrayList.add(i2, pVar);
        List list = this.h.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.h.put(obj, list);
        }
        list.add(cls);
        if (nVar.f84137e) {
            if (this.u) {
                for (Map.Entry next : this.i.entrySet()) {
                    if (cls.isAssignableFrom((Class) next.getKey())) {
                        a(pVar, next.getValue());
                    }
                }
                return;
            }
            a(pVar, this.i.get(cls));
        }
    }

    private void a(p pVar, Object obj, Throwable th) {
        if (obj instanceof m) {
            if (this.q) {
                g gVar = this.f84099d;
                Level level = Level.SEVERE;
                gVar.a(level, "SubscriberExceptionEvent subscriber " + pVar.f84150a.getClass() + " threw an exception", th);
                m mVar = (m) obj;
                g gVar2 = this.f84099d;
                Level level2 = Level.SEVERE;
                gVar2.a(level2, "Initial event " + mVar.f84131c + " caused exception in " + mVar.f84132d, mVar.f84130b);
            }
        } else if (!this.p) {
            if (this.q) {
                g gVar3 = this.f84099d;
                Level level3 = Level.SEVERE;
                gVar3.a(level3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f84150a.getClass(), th);
            }
            if (this.s) {
                d(new m(this, th, obj, pVar.f84150a));
            }
        } else {
            throw new e("Invoking subscriber failed", th);
        }
    }

    private void a(p pVar, Object obj, boolean z) {
        switch (pVar.f84151b.f84134b) {
            case POSTING:
                b(pVar, obj);
                return;
            case MAIN:
                if (z) {
                    b(pVar, obj);
                    return;
                } else {
                    this.l.a(pVar, obj);
                    return;
                }
            case MAIN_ORDERED:
                if (this.l != null) {
                    this.l.a(pVar, obj);
                    return;
                } else {
                    b(pVar, obj);
                    return;
                }
            case BACKGROUND:
                if (z) {
                    this.m.a(pVar, obj);
                    return;
                } else {
                    b(pVar, obj);
                    return;
                }
            case ASYNC:
                this.n.a(pVar, obj);
                return;
            default:
                throw new IllegalStateException("Unknown thread mode: " + pVar.f84151b.f84134b);
        }
    }

    private boolean a(Object obj, a aVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.g.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            aVar.f84106e = obj;
            aVar.f84105d = pVar;
            try {
                a(pVar, obj, aVar.f84104c);
                if (aVar.f84107f) {
                    break;
                }
            } finally {
                aVar.f84106e = null;
                aVar.f84105d = null;
                aVar.f84107f = false;
            }
        }
        return true;
    }
}

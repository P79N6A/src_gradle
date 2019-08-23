package com.bytedance.jedi.model.i;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class g {

    /* renamed from: e  reason: collision with root package name */
    static Class<?> f21719e;

    /* renamed from: f  reason: collision with root package name */
    static Class<?> f21720f;
    static Class<?> g;
    static Method h;
    static Method i;
    static Method j;

    /* renamed from: a  reason: collision with root package name */
    public final int f21721a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21722b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21723c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21724d;
    private final int k;
    private final Map<Class<?>, b> l = new IdentityHashMap();
    private final Map<Object, Object> m = new IdentityHashMap();
    private final Map<Class<?>, a> n = new IdentityHashMap();
    private final Deque<Object> o = new ArrayDeque(16384);
    private long p;
    private long q;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object[] f21725a;

        a(Object[] objArr) {
            this.f21725a = objArr;
        }

        public final void a(g gVar) {
            for (Object obj : this.f21725a) {
                if (obj != null) {
                    gVar.b(obj);
                }
            }
        }
    }

    class b {

        /* renamed from: b  reason: collision with root package name */
        private final long f21727b;

        /* renamed from: c  reason: collision with root package name */
        private final long f21728c;

        /* renamed from: d  reason: collision with root package name */
        private final Field[] f21729d;

        /* access modifiers changed from: package-private */
        public final void a(Object obj, g gVar) {
            gVar.a(obj.getClass(), this.f21727b);
            b(obj, gVar);
        }

        private void b(Object obj, g gVar) {
            Field[] fieldArr = this.f21729d;
            int length = fieldArr.length;
            int i = 0;
            while (i < length) {
                Field field = fieldArr[i];
                try {
                    gVar.c(field.get(obj));
                    i++;
                } catch (IllegalAccessException e2) {
                    AssertionError assertionError = new AssertionError("Unexpected denial of access to " + field);
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            }
        }

        public b(Class<?> cls) {
            LinkedList linkedList = new LinkedList();
            long j = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    Class<?> type = field.getType();
                    if (type.isPrimitive()) {
                        j += g.b(type);
                    } else {
                        field.setAccessible(true);
                        linkedList.add(field);
                        j += (long) g.this.f21723c;
                    }
                }
            }
            Class<? super T> superclass = cls.getSuperclass();
            if (!(superclass == null || superclass == Object.class)) {
                b a2 = g.this.a(superclass);
                j += g.a(a2.f21728c, g.this.f21724d);
                linkedList.addAll(Arrays.asList(a2.f21729d));
            }
            this.f21728c = j;
            this.f21727b = g.a(((long) g.this.f21721a) + j, g.this.f21722b);
            this.f21729d = (Field[]) linkedList.toArray(new Field[linkedList.size()]);
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f21730a;

        static {
            d dVar;
            if ("32".equals("64")) {
                dVar = new d() {
                    public final int a() {
                        return 20;
                    }

                    public final int b() {
                        return 12;
                    }

                    public final int c() {
                        return 4;
                    }

                    public final int d() {
                        return 4;
                    }

                    public final int e() {
                        return 4;
                    }
                };
            } else {
                dVar = new d() {
                    public final int a() {
                        return 40;
                    }

                    public final int b() {
                        return 24;
                    }

                    public final int c() {
                        return 8;
                    }

                    public final int d() {
                        return 8;
                    }

                    public final int e() {
                        return 8;
                    }
                };
            }
            f21730a = dVar;
        }
    }

    public interface d {
        int a();

        int b();

        int c();

        int d();

        int e();
    }

    static {
        try {
            f21719e = Class.forName("java.lang.management.ManagementFactory");
            f21720f = Class.forName("java.lang.management.MemoryPoolMXBean");
            g = Class.forName("java.lang.management.MemoryUsage");
            h = f21719e.getMethod("getMemoryPoolMXBeans", new Class[0]);
            i = f21720f.getMethod("getUsage", new Class[0]);
            j = g.getMethod("getMax", new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(Object obj) {
        if (obj != null) {
            this.o.addLast(obj);
        }
    }

    public static long[] a(Object obj) throws UnsupportedOperationException {
        if (obj == null) {
            return new long[]{0, 0};
        }
        return new g(c.f21730a).d(obj);
    }

    private void e(Object obj) {
        Class<?> cls = obj.getClass();
        Class<?> componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType.isPrimitive()) {
            a(cls, length, b(componentType));
            return;
        }
        a(cls, length, (long) this.f21723c);
        switch (length) {
            case 0:
                return;
            case 1:
                c(Array.get(obj, 0));
                return;
            default:
                c(new a((Object[]) obj));
                return;
        }
    }

    public final void b(Object obj) {
        if (!this.m.containsKey(obj)) {
            Class<?> cls = obj.getClass();
            if (cls == a.class) {
                ((a) obj).a(this);
                return;
            }
            this.m.put(obj, obj);
            if (cls.isArray()) {
                e(obj);
                return;
            }
            a(cls).a(obj, this);
        }
    }

    private g(d dVar) {
        dVar.getClass();
        this.k = dVar.a();
        this.f21721a = dVar.b();
        this.f21722b = dVar.c();
        this.f21723c = dVar.d();
        this.f21724d = dVar.e();
    }

    public static long b(Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Byte.TYPE) {
            return 1;
        }
        if (cls == Character.TYPE || cls == Short.TYPE) {
            return 2;
        }
        if (cls == Integer.TYPE || cls == Float.TYPE) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Double.TYPE) {
            return 8;
        }
        throw new AssertionError("Encountered unexpected primitive type " + cls.getName());
    }

    private synchronized long[] d(Object obj) {
        this.n.clear();
        while (true) {
            try {
                b(obj);
                if (this.o.isEmpty()) {
                } else {
                    if (this.q == 0) {
                        this.q = this.p;
                    }
                    obj = this.o.removeFirst();
                }
            } finally {
                this.m.clear();
                this.o.clear();
                this.p = 0;
                this.q = 0;
            }
        }
        return new long[]{this.p, this.q};
    }

    public final b a(Class<?> cls) {
        b bVar = this.l.get(cls);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(cls);
        this.l.put(cls, bVar2);
        return bVar2;
    }

    static long a(long j2, int i2) {
        long j3 = (long) i2;
        return (((j2 + j3) - 1) / j3) * j3;
    }

    /* access modifiers changed from: package-private */
    public final void a(Class<?> cls, long j2) {
        a aVar = this.n.get(cls);
        if (aVar == null) {
            aVar = new a(cls);
            this.n.put(cls, aVar);
        }
        aVar.a(j2);
        this.p += j2;
    }

    private void a(Class<?> cls, int i2, long j2) {
        a(cls, a(((long) this.k) + (((long) i2) * j2), this.f21722b));
    }
}

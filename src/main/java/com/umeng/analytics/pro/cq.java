package com.umeng.analytics.pro;

import com.umeng.analytics.pro.cn;
import com.umeng.analytics.pro.cq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class cq<T extends cq<?, ?>, F extends cn> implements cg<T, F> {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends dn>, Cdo> f80584c;

    /* renamed from: a  reason: collision with root package name */
    protected Object f80585a;

    /* renamed from: b  reason: collision with root package name */
    protected F f80586b;

    static class a extends dp<cq> {
        private a() {
        }

        /* renamed from: a */
        public void b(df dfVar, cq cqVar) throws cm {
            cqVar.f80586b = null;
            cqVar.f80585a = null;
            dfVar.j();
            da l = dfVar.l();
            cqVar.f80585a = cqVar.a(dfVar, l);
            if (cqVar.f80585a != null) {
                cqVar.f80586b = cqVar.a(l.f80617c);
            }
            dfVar.m();
            dfVar.l();
            dfVar.k();
        }

        /* renamed from: b */
        public void a(df dfVar, cq cqVar) throws cm {
            if (cqVar.a() == null || cqVar.c() == null) {
                throw new dg("Cannot write a TUnion with no set value!");
            }
            dfVar.a(cqVar.e());
            dfVar.a(cqVar.c(cqVar.f80586b));
            cqVar.c(dfVar);
            dfVar.c();
            dfVar.d();
            dfVar.b();
        }
    }

    static class b implements Cdo {
        private b() {
        }

        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    static class c extends dq<cq> {
        private c() {
        }

        /* renamed from: a */
        public void b(df dfVar, cq cqVar) throws cm {
            cqVar.f80586b = null;
            cqVar.f80585a = null;
            short v = dfVar.v();
            cqVar.f80585a = cqVar.a(dfVar, v);
            if (cqVar.f80585a != null) {
                cqVar.f80586b = cqVar.a(v);
            }
        }

        /* renamed from: b */
        public void a(df dfVar, cq cqVar) throws cm {
            if (cqVar.a() == null || cqVar.c() == null) {
                throw new dg("Cannot write a TUnion with no set value!");
            }
            dfVar.a(cqVar.f80586b.a());
            cqVar.d(dfVar);
        }
    }

    static class d implements Cdo {
        private d() {
        }

        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    /* access modifiers changed from: protected */
    public abstract F a(short s);

    /* access modifiers changed from: protected */
    public abstract Object a(df dfVar, da daVar) throws cm;

    /* access modifiers changed from: protected */
    public abstract Object a(df dfVar, short s) throws cm;

    /* access modifiers changed from: protected */
    public abstract void b(F f2, Object obj) throws ClassCastException;

    /* access modifiers changed from: protected */
    public abstract da c(F f2);

    /* access modifiers changed from: protected */
    public abstract void c(df dfVar) throws cm;

    /* access modifiers changed from: protected */
    public abstract void d(df dfVar) throws cm;

    /* access modifiers changed from: protected */
    public abstract dk e();

    protected cq() {
    }

    public F a() {
        return this.f80586b;
    }

    public void a(df dfVar) throws cm {
        f80584c.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(F f2, Object obj) {
        b(f2, obj);
        this.f80586b = f2;
        this.f80585a = obj;
    }

    public final void b() {
        this.f80586b = null;
        this.f80585a = null;
    }

    public Object c() {
        return this.f80585a;
    }

    public boolean d() {
        if (this.f80586b != null) {
            return true;
        }
        return false;
    }

    static {
        HashMap hashMap = new HashMap();
        f80584c = hashMap;
        hashMap.put(dp.class, new b());
        f80584c.put(dq.class, new d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object c2 = c();
            sb.append(c((F) a()).f80615a);
            sb.append(":");
            if (c2 instanceof ByteBuffer) {
                ch.a((ByteBuffer) c2, sb);
            } else {
                sb.append(c2.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public Object a(int i) {
        return a((F) a((short) i));
    }

    public boolean b(F f2) {
        if (this.f80586b == f2) {
            return true;
        }
        return false;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    public void b(df dfVar) throws cm {
        f80584c.get(dfVar.D()).b().a(dfVar, this);
    }

    public boolean c(int i) {
        return b((F) a((short) i));
    }

    protected cq(cq<T, F> cqVar) {
        if (cqVar.getClass().equals(getClass())) {
            this.f80586b = cqVar.f80586b;
            this.f80585a = a(cqVar.f80585a);
            return;
        }
        throw new ClassCastException();
    }

    private static Object a(Object obj) {
        if (obj instanceof cg) {
            return ((cg) obj).p();
        }
        if (obj instanceof ByteBuffer) {
            return ch.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        if (obj instanceof Map) {
            return a((Map) obj);
        }
        return obj;
    }

    private static Map a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put(a(next.getKey()), a(next.getValue()));
        }
        return hashMap;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        for (Object a2 : set) {
            hashSet.add(a(a2));
        }
        return hashSet;
    }

    public Object a(F f2) {
        if (f2 == this.f80586b) {
            return c();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f2 + " because union's set field is " + this.f80586b);
    }

    protected cq(F f2, Object obj) {
        a(f2, obj);
    }

    public void a(int i, Object obj) {
        a((F) a((short) i), obj);
    }
}

package com.umeng.commonsdk.proguard;

import com.umeng.commonsdk.proguard.q;
import com.umeng.commonsdk.proguard.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class t<T extends t<?, ?>, F extends q> implements j<T, F> {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends aq>, ar> f80859c;

    /* renamed from: a  reason: collision with root package name */
    protected Object f80860a;

    /* renamed from: b  reason: collision with root package name */
    protected F f80861b;

    static class a extends as<t> {
        private a() {
        }

        /* renamed from: a */
        public void b(ai aiVar, t tVar) throws p {
            tVar.f80861b = null;
            tVar.f80860a = null;
            aiVar.j();
            ad l = aiVar.l();
            tVar.f80860a = tVar.a(aiVar, l);
            if (tVar.f80860a != null) {
                tVar.f80861b = tVar.a(l.f80814c);
            }
            aiVar.m();
            aiVar.l();
            aiVar.k();
        }

        /* renamed from: b */
        public void a(ai aiVar, t tVar) throws p {
            if (tVar.a() == null || tVar.b() == null) {
                throw new aj("Cannot write a TUnion with no set value!");
            }
            aiVar.a(tVar.d());
            aiVar.a(tVar.c(tVar.f80861b));
            tVar.a(aiVar);
            aiVar.c();
            aiVar.d();
            aiVar.b();
        }
    }

    static class b implements ar {
        private b() {
        }

        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    static class c extends at<t> {
        private c() {
        }

        /* renamed from: a */
        public void b(ai aiVar, t tVar) throws p {
            tVar.f80861b = null;
            tVar.f80860a = null;
            short v = aiVar.v();
            tVar.f80860a = tVar.a(aiVar, v);
            if (tVar.f80860a != null) {
                tVar.f80861b = tVar.a(v);
            }
        }

        /* renamed from: b */
        public void a(ai aiVar, t tVar) throws p {
            if (tVar.a() == null || tVar.b() == null) {
                throw new aj("Cannot write a TUnion with no set value!");
            }
            aiVar.a(tVar.f80861b.a());
            tVar.b(aiVar);
        }
    }

    static class d implements ar {
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
    public abstract Object a(ai aiVar, ad adVar) throws p;

    /* access modifiers changed from: protected */
    public abstract Object a(ai aiVar, short s) throws p;

    /* access modifiers changed from: protected */
    public abstract void a(ai aiVar) throws p;

    /* access modifiers changed from: protected */
    public abstract void b(ai aiVar) throws p;

    /* access modifiers changed from: protected */
    public abstract void b(F f2, Object obj) throws ClassCastException;

    /* access modifiers changed from: protected */
    public abstract ad c(F f2);

    /* access modifiers changed from: protected */
    public abstract an d();

    protected t() {
    }

    public F a() {
        return this.f80861b;
    }

    public Object b() {
        return this.f80860a;
    }

    public void a(F f2, Object obj) {
        b(f2, obj);
        this.f80861b = f2;
        this.f80860a = obj;
    }

    public boolean c() {
        if (this.f80861b != null) {
            return true;
        }
        return false;
    }

    public final void clear() {
        this.f80861b = null;
        this.f80860a = null;
    }

    static {
        HashMap hashMap = new HashMap();
        f80859c = hashMap;
        hashMap.put(as.class, new b());
        f80859c.put(at.class, new d());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(getClass().getSimpleName());
        sb.append(" ");
        if (a() != null) {
            Object b2 = b();
            sb.append(c(a()).f80812a);
            sb.append(":");
            if (b2 instanceof ByteBuffer) {
                k.a((ByteBuffer) b2, sb);
            } else {
                sb.append(b2.toString());
            }
        }
        sb.append(">");
        return sb.toString();
    }

    public Object a(int i) {
        return a((F) a((short) i));
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object a2 : list) {
            arrayList.add(a(a2));
        }
        return arrayList;
    }

    public boolean b(int i) {
        return b((F) a((short) i));
    }

    public void read(ai aiVar) throws p {
        f80859c.get(aiVar.D()).b().b(aiVar, this);
    }

    public void write(ai aiVar) throws p {
        f80859c.get(aiVar.D()).b().a(aiVar, this);
    }

    protected t(t<T, F> tVar) {
        if (tVar.getClass().equals(getClass())) {
            this.f80861b = tVar.f80861b;
            this.f80860a = a(tVar.f80860a);
            return;
        }
        throw new ClassCastException();
    }

    private static Object a(Object obj) {
        if (obj instanceof j) {
            return ((j) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return k.d((ByteBuffer) obj);
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

    public boolean b(F f2) {
        if (this.f80861b == f2) {
            return true;
        }
        return false;
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
        if (f2 == this.f80861b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f2 + " because union's set field is " + this.f80861b);
    }

    protected t(F f2, Object obj) {
        a(f2, obj);
    }

    public void a(int i, Object obj) {
        a((F) a((short) i), obj);
    }
}

package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class bn implements cg<bn, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, cs> f80487d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final dk f80488f = new dk("Imprint");
    /* access modifiers changed from: private */
    public static final da g = new da("property", (byte) 13, 1);
    /* access modifiers changed from: private */
    public static final da h = new da("version", (byte) 8, 2);
    /* access modifiers changed from: private */
    public static final da i = new da("checksum", (byte) 11, 3);
    private static final Map<Class<? extends dn>, Cdo> j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, bo> f80489a;

    /* renamed from: b  reason: collision with root package name */
    public int f80490b;

    /* renamed from: c  reason: collision with root package name */
    public String f80491c;
    private byte l;

    static class a extends dp<bn> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bn bnVar) throws cm {
            bnVar.m();
            dfVar.a(bn.f80488f);
            if (bnVar.f80489a != null) {
                dfVar.a(bn.g);
                dfVar.a(new dc((byte) 11, (byte) 12, bnVar.f80489a.size()));
                for (Map.Entry next : bnVar.f80489a.entrySet()) {
                    dfVar.a((String) next.getKey());
                    ((bo) next.getValue()).b(dfVar);
                }
                dfVar.e();
                dfVar.c();
            }
            dfVar.a(bn.h);
            dfVar.a(bnVar.f80490b);
            dfVar.c();
            if (bnVar.f80491c != null) {
                dfVar.a(bn.i);
                dfVar.a(bnVar.f80491c);
                dfVar.c();
            }
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bn bnVar) throws cm {
            dfVar.j();
            while (true) {
                da l = dfVar.l();
                if (l.f80616b != 0) {
                    switch (l.f80617c) {
                        case 1:
                            if (l.f80616b != 13) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                dc n = dfVar.n();
                                bnVar.f80489a = new HashMap(n.f80622c * 2);
                                for (int i = 0; i < n.f80622c; i++) {
                                    String z = dfVar.z();
                                    bo boVar = new bo();
                                    boVar.a(dfVar);
                                    bnVar.f80489a.put(z, boVar);
                                }
                                dfVar.o();
                                bnVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bnVar.f80490b = dfVar.w();
                                bnVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bnVar.f80491c = dfVar.z();
                                bnVar.c(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (bnVar.i()) {
                        bnVar.m();
                        return;
                    }
                    throw new dg("Required field 'version' was not found in serialized data! Struct: " + toString());
                }
            }
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

    static class c extends dq<bn> {
        private c() {
        }

        public void a(df dfVar, bn bnVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(bnVar.f80489a.size());
            for (Map.Entry next : bnVar.f80489a.entrySet()) {
                dlVar.a((String) next.getKey());
                ((bo) next.getValue()).b((df) dlVar);
            }
            dlVar.a(bnVar.f80490b);
            dlVar.a(bnVar.f80491c);
        }

        public void b(df dfVar, bn bnVar) throws cm {
            dl dlVar = (dl) dfVar;
            dc dcVar = new dc((byte) 11, (byte) 12, dlVar.w());
            bnVar.f80489a = new HashMap(dcVar.f80622c * 2);
            for (int i = 0; i < dcVar.f80622c; i++) {
                String z = dlVar.z();
                bo boVar = new bo();
                boVar.a((df) dlVar);
                bnVar.f80489a.put(z, boVar);
            }
            bnVar.a(true);
            bnVar.f80490b = dlVar.w();
            bnVar.b(true);
            bnVar.f80491c = dlVar.z();
            bnVar.c(true);
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

    public enum e implements cn {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80495d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80496e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80497f;

        public final short a() {
            return this.f80496e;
        }

        public final String b() {
            return this.f80497f;
        }

        static {
            f80495d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80495d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80495d.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return PROPERTY;
                case 2:
                    return VERSION;
                case 3:
                    return CHECKSUM;
                default:
                    return null;
            }
        }

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        private e(short s, String str) {
            this.f80496e = s;
            this.f80497f = str;
        }
    }

    public void e() {
        this.f80489a = null;
    }

    public void k() {
        this.f80491c = null;
    }

    public bn() {
    }

    public Map<String, bo> d() {
        return this.f80489a;
    }

    public int g() {
        return this.f80490b;
    }

    public String j() {
        return this.f80491c;
    }

    /* renamed from: a */
    public bn p() {
        return new bn(this);
    }

    public boolean f() {
        if (this.f80489a != null) {
            return true;
        }
        return false;
    }

    public boolean i() {
        return cd.a(this.l, 0);
    }

    public boolean l() {
        if (this.f80491c != null) {
            return true;
        }
        return false;
    }

    public void b() {
        this.f80489a = null;
        b(false);
        this.f80490b = 0;
        this.f80491c = null;
    }

    public int c() {
        if (this.f80489a == null) {
            return 0;
        }
        return this.f80489a.size();
    }

    public void h() {
        this.l = cd.b(this.l, 0);
    }

    public void m() throws cm {
        if (this.f80489a == null) {
            throw new dg("Required field 'property' was not present! Struct: " + toString());
        } else if (this.f80491c == null) {
            throw new dg("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        if (this.f80489a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80489a);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f80490b);
        sb.append(", ");
        sb.append("checksum:");
        if (this.f80491c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80491c);
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(dp.class, new b());
        j.put(dq.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new cs("property", (byte) 1, new cv((byte) 13, new ct((byte) 11), new cx((byte) 12, bo.class))));
        enumMap.put(e.VERSION, new cs("version", (byte) 1, new ct((byte) 8)));
        enumMap.put(e.CHECKSUM, new cs("checksum", (byte) 1, new ct((byte) 11)));
        f80487d = Collections.unmodifiableMap(enumMap);
        cs.a(bn.class, f80487d);
    }

    public bn a(String str) {
        this.f80491c = str;
        return this;
    }

    /* renamed from: c */
    public e b(int i2) {
        return e.a(i2);
    }

    public bn a(int i2) {
        this.f80490b = i2;
        b(true);
        return this;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.l = 0;
            a((df) new cz(new dr((InputStream) objectInputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(df dfVar) throws cm {
        j.get(dfVar.D()).b().a(dfVar, this);
    }

    public void c(boolean z) {
        if (!z) {
            this.f80491c = null;
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b((df) new cz(new dr((OutputStream) objectOutputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(boolean z) {
        this.l = cd.a(this.l, 0, z);
    }

    public bn(bn bnVar) {
        this.l = bnVar.l;
        if (bnVar.f()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : bnVar.f80489a.entrySet()) {
                hashMap.put((String) next.getKey(), new bo((bo) next.getValue()));
            }
            this.f80489a = hashMap;
        }
        this.f80490b = bnVar.f80490b;
        if (bnVar.l()) {
            this.f80491c = bnVar.f80491c;
        }
    }

    public bn a(Map<String, bo> map) {
        this.f80489a = map;
        return this;
    }

    public void a(df dfVar) throws cm {
        j.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80489a = null;
        }
    }

    public void a(String str, bo boVar) {
        if (this.f80489a == null) {
            this.f80489a = new HashMap();
        }
        this.f80489a.put(str, boVar);
    }

    public bn(Map<String, bo> map, int i2, String str) {
        this();
        this.f80489a = map;
        this.f80490b = i2;
        b(true);
        this.f80491c = str;
    }
}

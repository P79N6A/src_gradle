package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.aa;
import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ad;
import com.umeng.commonsdk.proguard.af;
import com.umeng.commonsdk.proguard.ai;
import com.umeng.commonsdk.proguard.aj;
import com.umeng.commonsdk.proguard.al;
import com.umeng.commonsdk.proguard.an;
import com.umeng.commonsdk.proguard.ao;
import com.umeng.commonsdk.proguard.aq;
import com.umeng.commonsdk.proguard.ar;
import com.umeng.commonsdk.proguard.as;
import com.umeng.commonsdk.proguard.at;
import com.umeng.commonsdk.proguard.au;
import com.umeng.commonsdk.proguard.g;
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.q;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.w;
import com.umeng.commonsdk.proguard.y;
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

public class d implements j<d, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, v> f81031d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final an f81032f = new an("Imprint");
    /* access modifiers changed from: private */
    public static final ad g = new ad("property", (byte) 13, 1);
    /* access modifiers changed from: private */
    public static final ad h = new ad("version", (byte) 8, 2);
    /* access modifiers changed from: private */
    public static final ad i = new ad("checksum", (byte) 11, 3);
    private static final Map<Class<? extends aq>, ar> j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, e> f81033a;

    /* renamed from: b  reason: collision with root package name */
    public int f81034b;

    /* renamed from: c  reason: collision with root package name */
    public String f81035c;
    private byte l;

    static class a extends as<d> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, d dVar) throws p {
            dVar.l();
            aiVar.a(d.f81032f);
            if (dVar.f81033a != null) {
                aiVar.a(d.g);
                aiVar.a(new af((byte) 11, (byte) 12, dVar.f81033a.size()));
                for (Map.Entry next : dVar.f81033a.entrySet()) {
                    aiVar.a((String) next.getKey());
                    ((e) next.getValue()).write(aiVar);
                }
                aiVar.e();
                aiVar.c();
            }
            aiVar.a(d.h);
            aiVar.a(dVar.f81034b);
            aiVar.c();
            if (dVar.f81035c != null) {
                aiVar.a(d.i);
                aiVar.a(dVar.f81035c);
                aiVar.c();
            }
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, d dVar) throws p {
            aiVar.j();
            while (true) {
                ad l = aiVar.l();
                if (l.f80813b != 0) {
                    switch (l.f80814c) {
                        case 1:
                            if (l.f80813b != 13) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                af n = aiVar.n();
                                dVar.f81033a = new HashMap(n.f80819c * 2);
                                for (int i = 0; i < n.f80819c; i++) {
                                    String z = aiVar.z();
                                    e eVar = new e();
                                    eVar.read(aiVar);
                                    dVar.f81033a.put(z, eVar);
                                }
                                aiVar.o();
                                dVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                dVar.f81034b = aiVar.w();
                                dVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                dVar.f81035c = aiVar.z();
                                dVar.c(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (dVar.h()) {
                        dVar.l();
                        return;
                    }
                    throw new aj("Required field 'version' was not found in serialized data! Struct: " + toString());
                }
            }
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

    static class c extends at<d> {
        private c() {
        }

        public void a(ai aiVar, d dVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(dVar.f81033a.size());
            for (Map.Entry next : dVar.f81033a.entrySet()) {
                aoVar.a((String) next.getKey());
                ((e) next.getValue()).write(aoVar);
            }
            aoVar.a(dVar.f81034b);
            aoVar.a(dVar.f81035c);
        }

        public void b(ai aiVar, d dVar) throws p {
            ao aoVar = (ao) aiVar;
            af afVar = new af((byte) 11, (byte) 12, aoVar.w());
            dVar.f81033a = new HashMap(afVar.f80819c * 2);
            for (int i = 0; i < afVar.f80819c; i++) {
                String z = aoVar.z();
                e eVar = new e();
                eVar.read(aoVar);
                dVar.f81033a.put(z, eVar);
            }
            dVar.a(true);
            dVar.f81034b = aoVar.w();
            dVar.b(true);
            dVar.f81035c = aoVar.z();
            dVar.c(true);
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.d$d  reason: collision with other inner class name */
    static class C0867d implements ar {
        private C0867d() {
        }

        /* renamed from: a */
        public c b() {
            return new c();
        }
    }

    public enum e implements q {
        PROPERTY(1, "property"),
        VERSION(2, "version"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f81039d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f81040e;

        /* renamed from: f  reason: collision with root package name */
        private final String f81041f;

        public final short a() {
            return this.f81040e;
        }

        public final String b() {
            return this.f81041f;
        }

        static {
            f81039d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f81039d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f81039d.get(str);
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
            this.f81040e = s;
            this.f81041f = str;
        }
    }

    public void d() {
        this.f81033a = null;
    }

    public void j() {
        this.f81035c = null;
    }

    public d() {
    }

    public Map<String, e> c() {
        return this.f81033a;
    }

    public int f() {
        return this.f81034b;
    }

    public String i() {
        return this.f81035c;
    }

    /* renamed from: a */
    public d deepCopy() {
        return new d(this);
    }

    public boolean e() {
        if (this.f81033a != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return g.a(this.l, 0);
    }

    public boolean k() {
        if (this.f81035c != null) {
            return true;
        }
        return false;
    }

    public int b() {
        if (this.f81033a == null) {
            return 0;
        }
        return this.f81033a.size();
    }

    public void clear() {
        this.f81033a = null;
        b(false);
        this.f81034b = 0;
        this.f81035c = null;
    }

    public void g() {
        this.l = g.b(this.l, 0);
    }

    public void l() throws p {
        if (this.f81033a == null) {
            throw new aj("Required field 'property' was not present! Struct: " + toString());
        } else if (this.f81035c == null) {
            throw new aj("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Imprint(");
        sb.append("property:");
        if (this.f81033a == null) {
            sb.append("null");
        } else {
            sb.append(this.f81033a);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f81034b);
        sb.append(", ");
        sb.append("checksum:");
        if (this.f81035c == null) {
            sb.append("null");
        } else {
            sb.append(this.f81035c);
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(as.class, new b());
        j.put(at.class, new C0867d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.PROPERTY, new v("property", (byte) 1, new y((byte) 13, new w((byte) 11), new aa((byte) 12, e.class))));
        enumMap.put(e.VERSION, new v("version", (byte) 1, new w((byte) 8)));
        enumMap.put(e.CHECKSUM, new v("checksum", (byte) 1, new w((byte) 11)));
        f81031d = Collections.unmodifiableMap(enumMap);
        v.a(d.class, f81031d);
    }

    public d a(String str) {
        this.f81035c = str;
        return this;
    }

    /* renamed from: b */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public void c(boolean z) {
        if (!z) {
            this.f81035c = null;
        }
    }

    public d a(int i2) {
        this.f81034b = i2;
        b(true);
        return this;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.l = 0;
            read(new ac(new au((InputStream) objectInputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(boolean z) {
        this.l = g.a(this.l, 0, z);
    }

    public void read(ai aiVar) throws p {
        j.get(aiVar.D()).b().b(aiVar, this);
    }

    public void write(ai aiVar) throws p {
        j.get(aiVar.D()).b().a(aiVar, this);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ac(new au((OutputStream) objectOutputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public d(d dVar) {
        this.l = dVar.l;
        if (dVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : dVar.f81033a.entrySet()) {
                hashMap.put((String) next.getKey(), new e((e) next.getValue()));
            }
            this.f81033a = hashMap;
        }
        this.f81034b = dVar.f81034b;
        if (dVar.k()) {
            this.f81035c = dVar.f81035c;
        }
    }

    public d a(Map<String, e> map) {
        this.f81033a = map;
        return this;
    }

    public void a(boolean z) {
        if (!z) {
            this.f81033a = null;
        }
    }

    public void a(String str, e eVar) {
        if (this.f81033a == null) {
            this.f81033a = new HashMap();
        }
        this.f81033a.put(str, eVar);
    }

    public d(Map<String, e> map, int i2, String str) {
        this();
        this.f81033a = map;
        this.f81034b = i2;
        b(true);
        this.f81035c = str;
    }
}

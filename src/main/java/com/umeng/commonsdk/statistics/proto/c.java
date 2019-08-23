package com.umeng.commonsdk.statistics.proto;

import com.umeng.commonsdk.proguard.aa;
import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ad;
import com.umeng.commonsdk.proguard.ae;
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
import com.umeng.commonsdk.proguard.j;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.q;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.w;
import com.umeng.commonsdk.proguard.x;
import com.umeng.commonsdk.proguard.y;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c implements j<c, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, v> f81020d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final an f81021f = new an("IdTracking");
    /* access modifiers changed from: private */
    public static final ad g = new ad("snapshots", (byte) 13, 1);
    /* access modifiers changed from: private */
    public static final ad h = new ad("journals", (byte) 15, 2);
    /* access modifiers changed from: private */
    public static final ad i = new ad("checksum", (byte) 11, 3);
    private static final Map<Class<? extends aq>, ar> j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, b> f81022a;

    /* renamed from: b  reason: collision with root package name */
    public List<a> f81023b;

    /* renamed from: c  reason: collision with root package name */
    public String f81024c;
    private e[] k;

    static class a extends as<c> {
        private a() {
        }

        /* renamed from: a */
        public void b(ai aiVar, c cVar) throws p {
            aiVar.j();
            while (true) {
                ad l = aiVar.l();
                if (l.f80813b != 0) {
                    int i = 0;
                    switch (l.f80814c) {
                        case 1:
                            if (l.f80813b != 13) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                af n = aiVar.n();
                                cVar.f81022a = new HashMap(n.f80819c * 2);
                                while (i < n.f80819c) {
                                    String z = aiVar.z();
                                    b bVar = new b();
                                    bVar.read(aiVar);
                                    cVar.f81022a.put(z, bVar);
                                    i++;
                                }
                                aiVar.o();
                                cVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 15) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                ae p = aiVar.p();
                                cVar.f81023b = new ArrayList(p.f80816b);
                                while (i < p.f80816b) {
                                    a aVar = new a();
                                    aVar.read(aiVar);
                                    cVar.f81023b.add(aVar);
                                    i++;
                                }
                                aiVar.q();
                                cVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                cVar.f81024c = aiVar.z();
                                cVar.c(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    cVar.n();
                    return;
                }
            }
        }

        /* renamed from: b */
        public void a(ai aiVar, c cVar) throws p {
            cVar.n();
            aiVar.a(c.f81021f);
            if (cVar.f81022a != null) {
                aiVar.a(c.g);
                aiVar.a(new af((byte) 11, (byte) 12, cVar.f81022a.size()));
                for (Map.Entry next : cVar.f81022a.entrySet()) {
                    aiVar.a((String) next.getKey());
                    ((b) next.getValue()).write(aiVar);
                }
                aiVar.e();
                aiVar.c();
            }
            if (cVar.f81023b != null && cVar.j()) {
                aiVar.a(c.h);
                aiVar.a(new ae((byte) 12, cVar.f81023b.size()));
                for (a write : cVar.f81023b) {
                    write.write(aiVar);
                }
                aiVar.f();
                aiVar.c();
            }
            if (cVar.f81024c != null && cVar.m()) {
                aiVar.a(c.i);
                aiVar.a(cVar.f81024c);
                aiVar.c();
            }
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

    /* renamed from: com.umeng.commonsdk.statistics.proto.c$c  reason: collision with other inner class name */
    static class C0866c extends at<c> {
        private C0866c() {
        }

        public void b(ai aiVar, c cVar) throws p {
            ao aoVar = (ao) aiVar;
            af afVar = new af((byte) 11, (byte) 12, aoVar.w());
            cVar.f81022a = new HashMap(afVar.f80819c * 2);
            for (int i = 0; i < afVar.f80819c; i++) {
                String z = aoVar.z();
                b bVar = new b();
                bVar.read(aoVar);
                cVar.f81022a.put(z, bVar);
            }
            cVar.a(true);
            BitSet b2 = aoVar.b(2);
            if (b2.get(0)) {
                ae aeVar = new ae((byte) 12, aoVar.w());
                cVar.f81023b = new ArrayList(aeVar.f80816b);
                for (int i2 = 0; i2 < aeVar.f80816b; i2++) {
                    a aVar = new a();
                    aVar.read(aoVar);
                    cVar.f81023b.add(aVar);
                }
                cVar.b(true);
            }
            if (b2.get(1)) {
                cVar.f81024c = aoVar.z();
                cVar.c(true);
            }
        }

        public void a(ai aiVar, c cVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(cVar.f81022a.size());
            for (Map.Entry next : cVar.f81022a.entrySet()) {
                aoVar.a((String) next.getKey());
                ((b) next.getValue()).write(aoVar);
            }
            BitSet bitSet = new BitSet();
            if (cVar.j()) {
                bitSet.set(0);
            }
            if (cVar.m()) {
                bitSet.set(1);
            }
            aoVar.a(bitSet, 2);
            if (cVar.j()) {
                aoVar.a(cVar.f81023b.size());
                for (a write : cVar.f81023b) {
                    write.write(aoVar);
                }
            }
            if (cVar.m()) {
                aoVar.a(cVar.f81024c);
            }
        }
    }

    static class d implements ar {
        private d() {
        }

        /* renamed from: a */
        public C0866c b() {
            return new C0866c();
        }
    }

    public enum e implements q {
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f81028d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f81029e;

        /* renamed from: f  reason: collision with root package name */
        private final String f81030f;

        public final short a() {
            return this.f81029e;
        }

        public final String b() {
            return this.f81030f;
        }

        static {
            f81028d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f81028d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f81028d.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return SNAPSHOTS;
                case 2:
                    return JOURNALS;
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
            this.f81029e = s;
            this.f81030f = str;
        }
    }

    public void d() {
        this.f81022a = null;
    }

    public void i() {
        this.f81023b = null;
    }

    public void l() {
        this.f81024c = null;
    }

    public Map<String, b> c() {
        return this.f81022a;
    }

    public List<a> h() {
        return this.f81023b;
    }

    public String k() {
        return this.f81024c;
    }

    public void clear() {
        this.f81022a = null;
        this.f81023b = null;
        this.f81024c = null;
    }

    public boolean e() {
        if (this.f81022a != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f81023b != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.f81024c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public c deepCopy() {
        return new c(this);
    }

    public int b() {
        if (this.f81022a == null) {
            return 0;
        }
        return this.f81022a.size();
    }

    public int f() {
        if (this.f81023b == null) {
            return 0;
        }
        return this.f81023b.size();
    }

    public Iterator<a> g() {
        if (this.f81023b == null) {
            return null;
        }
        return this.f81023b.iterator();
    }

    public c() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public void n() throws p {
        if (this.f81022a == null) {
            throw new aj("Required field 'snapshots' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        if (this.f81022a == null) {
            sb.append("null");
        } else {
            sb.append(this.f81022a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("journals:");
            if (this.f81023b == null) {
                sb.append("null");
            } else {
                sb.append(this.f81023b);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("checksum:");
            if (this.f81024c == null) {
                sb.append("null");
            } else {
                sb.append(this.f81024c);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(as.class, new b());
        j.put(at.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.SNAPSHOTS, new v("snapshots", (byte) 1, new y((byte) 13, new w((byte) 11), new aa((byte) 12, b.class))));
        enumMap.put(e.JOURNALS, new v("journals", (byte) 2, new x((byte) 15, new aa((byte) 12, a.class))));
        enumMap.put(e.CHECKSUM, new v("checksum", (byte) 2, new w((byte) 11)));
        f81020d = Collections.unmodifiableMap(enumMap);
        v.a(c.class, f81020d);
    }

    public c a(String str) {
        this.f81024c = str;
        return this;
    }

    public c(Map<String, b> map) {
        this();
        this.f81022a = map;
    }

    /* renamed from: a */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public void b(boolean z) {
        if (!z) {
            this.f81023b = null;
        }
    }

    public void c(boolean z) {
        if (!z) {
            this.f81024c = null;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            read(new ac(new au((InputStream) objectInputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
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

    public c(c cVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (cVar.e()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : cVar.f81022a.entrySet()) {
                hashMap.put((String) next.getKey(), new b((b) next.getValue()));
            }
            this.f81022a = hashMap;
        }
        if (cVar.j()) {
            ArrayList arrayList = new ArrayList();
            for (a aVar : cVar.f81023b) {
                arrayList.add(new a(aVar));
            }
            this.f81023b = arrayList;
        }
        if (cVar.m()) {
            this.f81024c = cVar.f81024c;
        }
    }

    public c a(List<a> list) {
        this.f81023b = list;
        return this;
    }

    public c a(Map<String, b> map) {
        this.f81022a = map;
        return this;
    }

    public void a(a aVar) {
        if (this.f81023b == null) {
            this.f81023b = new ArrayList();
        }
        this.f81023b.add(aVar);
    }

    public void a(boolean z) {
        if (!z) {
            this.f81022a = null;
        }
    }

    public void a(String str, b bVar) {
        if (this.f81022a == null) {
            this.f81022a = new HashMap();
        }
        this.f81022a.put(str, bVar);
    }
}

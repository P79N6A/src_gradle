package com.umeng.analytics.pro;

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

public class bm implements cg<bm, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, cs> f80476d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final dk f80477f = new dk("IdTracking");
    /* access modifiers changed from: private */
    public static final da g = new da("snapshots", (byte) 13, 1);
    /* access modifiers changed from: private */
    public static final da h = new da("journals", (byte) 15, 2);
    /* access modifiers changed from: private */
    public static final da i = new da("checksum", (byte) 11, 3);
    private static final Map<Class<? extends dn>, Cdo> j;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, bl> f80478a;

    /* renamed from: b  reason: collision with root package name */
    public List<bk> f80479b;

    /* renamed from: c  reason: collision with root package name */
    public String f80480c;
    private e[] k;

    static class a extends dp<bm> {
        private a() {
        }

        /* renamed from: a */
        public void b(df dfVar, bm bmVar) throws cm {
            dfVar.j();
            while (true) {
                da l = dfVar.l();
                if (l.f80616b != 0) {
                    int i = 0;
                    switch (l.f80617c) {
                        case 1:
                            if (l.f80616b != 13) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                dc n = dfVar.n();
                                bmVar.f80478a = new HashMap(n.f80622c * 2);
                                while (i < n.f80622c) {
                                    String z = dfVar.z();
                                    bl blVar = new bl();
                                    blVar.a(dfVar);
                                    bmVar.f80478a.put(z, blVar);
                                    i++;
                                }
                                dfVar.o();
                                bmVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 15) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                db p = dfVar.p();
                                bmVar.f80479b = new ArrayList(p.f80619b);
                                while (i < p.f80619b) {
                                    bk bkVar = new bk();
                                    bkVar.a(dfVar);
                                    bmVar.f80479b.add(bkVar);
                                    i++;
                                }
                                dfVar.q();
                                bmVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bmVar.f80480c = dfVar.z();
                                bmVar.c(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    bmVar.o();
                    return;
                }
            }
        }

        /* renamed from: b */
        public void a(df dfVar, bm bmVar) throws cm {
            bmVar.o();
            dfVar.a(bm.f80477f);
            if (bmVar.f80478a != null) {
                dfVar.a(bm.g);
                dfVar.a(new dc((byte) 11, (byte) 12, bmVar.f80478a.size()));
                for (Map.Entry next : bmVar.f80478a.entrySet()) {
                    dfVar.a((String) next.getKey());
                    ((bl) next.getValue()).b(dfVar);
                }
                dfVar.e();
                dfVar.c();
            }
            if (bmVar.f80479b != null && bmVar.k()) {
                dfVar.a(bm.h);
                dfVar.a(new db((byte) 12, bmVar.f80479b.size()));
                for (bk b2 : bmVar.f80479b) {
                    b2.b(dfVar);
                }
                dfVar.f();
                dfVar.c();
            }
            if (bmVar.f80480c != null && bmVar.n()) {
                dfVar.a(bm.i);
                dfVar.a(bmVar.f80480c);
                dfVar.c();
            }
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

    static class c extends dq<bm> {
        private c() {
        }

        public void b(df dfVar, bm bmVar) throws cm {
            dl dlVar = (dl) dfVar;
            dc dcVar = new dc((byte) 11, (byte) 12, dlVar.w());
            bmVar.f80478a = new HashMap(dcVar.f80622c * 2);
            for (int i = 0; i < dcVar.f80622c; i++) {
                String z = dlVar.z();
                bl blVar = new bl();
                blVar.a((df) dlVar);
                bmVar.f80478a.put(z, blVar);
            }
            bmVar.a(true);
            BitSet b2 = dlVar.b(2);
            if (b2.get(0)) {
                db dbVar = new db((byte) 12, dlVar.w());
                bmVar.f80479b = new ArrayList(dbVar.f80619b);
                for (int i2 = 0; i2 < dbVar.f80619b; i2++) {
                    bk bkVar = new bk();
                    bkVar.a((df) dlVar);
                    bmVar.f80479b.add(bkVar);
                }
                bmVar.b(true);
            }
            if (b2.get(1)) {
                bmVar.f80480c = dlVar.z();
                bmVar.c(true);
            }
        }

        public void a(df dfVar, bm bmVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(bmVar.f80478a.size());
            for (Map.Entry next : bmVar.f80478a.entrySet()) {
                dlVar.a((String) next.getKey());
                ((bl) next.getValue()).b((df) dlVar);
            }
            BitSet bitSet = new BitSet();
            if (bmVar.k()) {
                bitSet.set(0);
            }
            if (bmVar.n()) {
                bitSet.set(1);
            }
            dlVar.a(bitSet, 2);
            if (bmVar.k()) {
                dlVar.a(bmVar.f80479b.size());
                for (bk b2 : bmVar.f80479b) {
                    b2.b((df) dlVar);
                }
            }
            if (bmVar.n()) {
                dlVar.a(bmVar.f80480c);
            }
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
        SNAPSHOTS(1, "snapshots"),
        JOURNALS(2, "journals"),
        CHECKSUM(3, "checksum");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80484d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80485e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80486f;

        public final short a() {
            return this.f80485e;
        }

        public final String b() {
            return this.f80486f;
        }

        static {
            f80484d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80484d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80484d.get(str);
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
            this.f80485e = s;
            this.f80486f = str;
        }
    }

    public void e() {
        this.f80478a = null;
    }

    public void j() {
        this.f80479b = null;
    }

    public void m() {
        this.f80480c = null;
    }

    public Map<String, bl> d() {
        return this.f80478a;
    }

    public List<bk> i() {
        return this.f80479b;
    }

    public String l() {
        return this.f80480c;
    }

    public boolean f() {
        if (this.f80478a != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f80479b != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.f80480c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public bm p() {
        return new bm(this);
    }

    public void b() {
        this.f80478a = null;
        this.f80479b = null;
        this.f80480c = null;
    }

    public int c() {
        if (this.f80478a == null) {
            return 0;
        }
        return this.f80478a.size();
    }

    public int g() {
        if (this.f80479b == null) {
            return 0;
        }
        return this.f80479b.size();
    }

    public Iterator<bk> h() {
        if (this.f80479b == null) {
            return null;
        }
        return this.f80479b.iterator();
    }

    public bm() {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
    }

    public void o() throws cm {
        if (this.f80478a == null) {
            throw new dg("Required field 'snapshots' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdTracking(");
        sb.append("snapshots:");
        if (this.f80478a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80478a);
        }
        if (k()) {
            sb.append(", ");
            sb.append("journals:");
            if (this.f80479b == null) {
                sb.append("null");
            } else {
                sb.append(this.f80479b);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("checksum:");
            if (this.f80480c == null) {
                sb.append("null");
            } else {
                sb.append(this.f80480c);
            }
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
        enumMap.put(e.SNAPSHOTS, new cs("snapshots", (byte) 1, new cv((byte) 13, new ct((byte) 11), new cx((byte) 12, bl.class))));
        enumMap.put(e.JOURNALS, new cs("journals", (byte) 2, new cu((byte) 15, new cx((byte) 12, bk.class))));
        enumMap.put(e.CHECKSUM, new cs("checksum", (byte) 2, new ct((byte) 11)));
        f80476d = Collections.unmodifiableMap(enumMap);
        cs.a(bm.class, f80476d);
    }

    public bm a(String str) {
        this.f80480c = str;
        return this;
    }

    public bm(Map<String, bl> map) {
        this();
        this.f80478a = map;
    }

    /* renamed from: a */
    public e b(int i2) {
        return e.a(i2);
    }

    public void c(boolean z) {
        if (!z) {
            this.f80480c = null;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            a((df) new cz(new dr((InputStream) objectInputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(df dfVar) throws cm {
        j.get(dfVar.D()).b().a(dfVar, this);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b((df) new cz(new dr((OutputStream) objectOutputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(boolean z) {
        if (!z) {
            this.f80479b = null;
        }
    }

    public bm(bm bmVar) {
        this.k = new e[]{e.JOURNALS, e.CHECKSUM};
        if (bmVar.f()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : bmVar.f80478a.entrySet()) {
                hashMap.put((String) next.getKey(), new bl((bl) next.getValue()));
            }
            this.f80478a = hashMap;
        }
        if (bmVar.k()) {
            ArrayList arrayList = new ArrayList();
            for (bk bkVar : bmVar.f80479b) {
                arrayList.add(new bk(bkVar));
            }
            this.f80479b = arrayList;
        }
        if (bmVar.n()) {
            this.f80480c = bmVar.f80480c;
        }
    }

    public bm a(List<bk> list) {
        this.f80479b = list;
        return this;
    }

    public bm a(Map<String, bl> map) {
        this.f80478a = map;
        return this;
    }

    public void a(bk bkVar) {
        if (this.f80479b == null) {
            this.f80479b = new ArrayList();
        }
        this.f80479b.add(bkVar);
    }

    public void a(df dfVar) throws cm {
        j.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80478a = null;
        }
    }

    public void a(String str, bl blVar) {
        if (this.f80478a == null) {
            this.f80478a = new HashMap();
        }
        this.f80478a.put(str, blVar);
    }
}

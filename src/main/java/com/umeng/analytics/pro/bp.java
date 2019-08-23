package com.umeng.analytics.pro;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class bp implements cg<bp, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, cs> f80509d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final dk f80510f = new dk("Response");
    /* access modifiers changed from: private */
    public static final da g = new da("resp_code", (byte) 8, 1);
    /* access modifiers changed from: private */
    public static final da h = new da("msg", (byte) 11, 2);
    /* access modifiers changed from: private */
    public static final da i = new da("imprint", (byte) 12, 3);
    private static final Map<Class<? extends dn>, Cdo> j;

    /* renamed from: a  reason: collision with root package name */
    public int f80511a;

    /* renamed from: b  reason: collision with root package name */
    public String f80512b;

    /* renamed from: c  reason: collision with root package name */
    public bn f80513c;
    private byte l;
    private e[] m;

    static class a extends dp<bp> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bp bpVar) throws cm {
            bpVar.l();
            dfVar.a(bp.f80510f);
            dfVar.a(bp.g);
            dfVar.a(bpVar.f80511a);
            dfVar.c();
            if (bpVar.f80512b != null && bpVar.h()) {
                dfVar.a(bp.h);
                dfVar.a(bpVar.f80512b);
                dfVar.c();
            }
            if (bpVar.f80513c != null && bpVar.k()) {
                dfVar.a(bp.i);
                bpVar.f80513c.b(dfVar);
                dfVar.c();
            }
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bp bpVar) throws cm {
            dfVar.j();
            while (true) {
                da l = dfVar.l();
                if (l.f80616b != 0) {
                    switch (l.f80617c) {
                        case 1:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bpVar.f80511a = dfVar.w();
                                bpVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bpVar.f80512b = dfVar.z();
                                bpVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 12) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bpVar.f80513c = new bn();
                                bpVar.f80513c.a(dfVar);
                                bpVar.c(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (bpVar.e()) {
                        bpVar.l();
                        return;
                    }
                    throw new dg("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
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

    static class c extends dq<bp> {
        private c() {
        }

        public void a(df dfVar, bp bpVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(bpVar.f80511a);
            BitSet bitSet = new BitSet();
            if (bpVar.h()) {
                bitSet.set(0);
            }
            if (bpVar.k()) {
                bitSet.set(1);
            }
            dlVar.a(bitSet, 2);
            if (bpVar.h()) {
                dlVar.a(bpVar.f80512b);
            }
            if (bpVar.k()) {
                bpVar.f80513c.b((df) dlVar);
            }
        }

        public void b(df dfVar, bp bpVar) throws cm {
            dl dlVar = (dl) dfVar;
            bpVar.f80511a = dlVar.w();
            bpVar.a(true);
            BitSet b2 = dlVar.b(2);
            if (b2.get(0)) {
                bpVar.f80512b = dlVar.z();
                bpVar.b(true);
            }
            if (b2.get(1)) {
                bpVar.f80513c = new bn();
                bpVar.f80513c.a((df) dlVar);
                bpVar.c(true);
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
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, "imprint");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80517d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80518e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80519f;

        public final short a() {
            return this.f80518e;
        }

        public final String b() {
            return this.f80519f;
        }

        static {
            f80517d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80517d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80517d.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return RESP_CODE;
                case 2:
                    return MSG;
                case 3:
                    return IMPRINT;
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
            this.f80518e = s;
            this.f80519f = str;
        }
    }

    public void g() {
        this.f80512b = null;
    }

    public void j() {
        this.f80513c = null;
    }

    public int c() {
        return this.f80511a;
    }

    public String f() {
        return this.f80512b;
    }

    public bn i() {
        return this.f80513c;
    }

    /* renamed from: a */
    public bp p() {
        return new bp(this);
    }

    public boolean e() {
        return cd.a(this.l, 0);
    }

    public boolean h() {
        if (this.f80512b != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f80513c != null) {
            return true;
        }
        return false;
    }

    public void b() {
        a(false);
        this.f80511a = 0;
        this.f80512b = null;
        this.f80513c = null;
    }

    public void d() {
        this.l = cd.b(this.l, 0);
    }

    public void l() throws cm {
        if (this.f80513c != null) {
            this.f80513c.m();
        }
    }

    public bp() {
        this.m = new e[]{e.MSG, e.IMPRINT};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Response(");
        sb.append("resp_code:");
        sb.append(this.f80511a);
        if (h()) {
            sb.append(", ");
            sb.append("msg:");
            if (this.f80512b == null) {
                sb.append("null");
            } else {
                sb.append(this.f80512b);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("imprint:");
            if (this.f80513c == null) {
                sb.append("null");
            } else {
                sb.append(this.f80513c);
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
        enumMap.put(e.RESP_CODE, new cs("resp_code", (byte) 1, new ct((byte) 8)));
        enumMap.put(e.MSG, new cs("msg", (byte) 2, new ct((byte) 11)));
        enumMap.put(e.IMPRINT, new cs("imprint", (byte) 2, new cx((byte) 12, bn.class)));
        f80509d = Collections.unmodifiableMap(enumMap);
        cs.a(bp.class, f80509d);
    }

    public bp a(bn bnVar) {
        this.f80513c = bnVar;
        return this;
    }

    /* renamed from: c */
    public e b(int i2) {
        return e.a(i2);
    }

    public bp(int i2) {
        this();
        this.f80511a = i2;
        a(true);
    }

    public bp a(int i2) {
        this.f80511a = i2;
        a(true);
        return this;
    }

    public void c(boolean z) {
        if (!z) {
            this.f80513c = null;
        }
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

    public bp(bp bpVar) {
        this.m = new e[]{e.MSG, e.IMPRINT};
        this.l = bpVar.l;
        this.f80511a = bpVar.f80511a;
        if (bpVar.h()) {
            this.f80512b = bpVar.f80512b;
        }
        if (bpVar.k()) {
            this.f80513c = new bn(bpVar.f80513c);
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
        if (!z) {
            this.f80512b = null;
        }
    }

    public bp a(String str) {
        this.f80512b = str;
        return this;
    }

    public void a(df dfVar) throws cm {
        j.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        this.l = cd.a(this.l, 0, z);
    }
}

package com.umeng.commonsdk.proguard;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class f implements j<f, e>, Serializable, Cloneable {
    public static final Map<e, v> k;
    /* access modifiers changed from: private */
    public static final an m = new an("UMEnvelope");
    /* access modifiers changed from: private */
    public static final ad n = new ad("version", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final ad o = new ad("address", (byte) 11, 2);
    /* access modifiers changed from: private */
    public static final ad p = new ad("signature", (byte) 11, 3);
    /* access modifiers changed from: private */
    public static final ad q = new ad("serial_num", (byte) 8, 4);
    /* access modifiers changed from: private */
    public static final ad r = new ad("ts_secs", (byte) 8, 5);
    /* access modifiers changed from: private */
    public static final ad s = new ad("length", (byte) 8, 6);
    /* access modifiers changed from: private */
    public static final ad t = new ad("entity", (byte) 11, 7);
    /* access modifiers changed from: private */
    public static final ad u = new ad("guid", (byte) 11, 8);
    /* access modifiers changed from: private */
    public static final ad v = new ad("checksum", (byte) 11, 9);
    /* access modifiers changed from: private */
    public static final ad w = new ad("codex", (byte) 8, 10);
    private static final Map<Class<? extends aq>, ar> x;
    private byte C;
    private e[] D;

    /* renamed from: a  reason: collision with root package name */
    public String f80839a;

    /* renamed from: b  reason: collision with root package name */
    public String f80840b;

    /* renamed from: c  reason: collision with root package name */
    public String f80841c;

    /* renamed from: d  reason: collision with root package name */
    public int f80842d;

    /* renamed from: e  reason: collision with root package name */
    public int f80843e;

    /* renamed from: f  reason: collision with root package name */
    public int f80844f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static class a extends as<f> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, f fVar) throws p {
            fVar.G();
            aiVar.a(f.m);
            if (fVar.f80839a != null) {
                aiVar.a(f.n);
                aiVar.a(fVar.f80839a);
                aiVar.c();
            }
            if (fVar.f80840b != null) {
                aiVar.a(f.o);
                aiVar.a(fVar.f80840b);
                aiVar.c();
            }
            if (fVar.f80841c != null) {
                aiVar.a(f.p);
                aiVar.a(fVar.f80841c);
                aiVar.c();
            }
            aiVar.a(f.q);
            aiVar.a(fVar.f80842d);
            aiVar.c();
            aiVar.a(f.r);
            aiVar.a(fVar.f80843e);
            aiVar.c();
            aiVar.a(f.s);
            aiVar.a(fVar.f80844f);
            aiVar.c();
            if (fVar.g != null) {
                aiVar.a(f.t);
                aiVar.a(fVar.g);
                aiVar.c();
            }
            if (fVar.h != null) {
                aiVar.a(f.u);
                aiVar.a(fVar.h);
                aiVar.c();
            }
            if (fVar.i != null) {
                aiVar.a(f.v);
                aiVar.a(fVar.i);
                aiVar.c();
            }
            if (fVar.F()) {
                aiVar.a(f.w);
                aiVar.a(fVar.j);
                aiVar.c();
            }
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, f fVar) throws p {
            aiVar.j();
            while (true) {
                ad l = aiVar.l();
                if (l.f80813b != 0) {
                    switch (l.f80814c) {
                        case 1:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80839a = aiVar.z();
                                fVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80840b = aiVar.z();
                                fVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80841c = aiVar.z();
                                fVar.c(true);
                                break;
                            }
                        case 4:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80842d = aiVar.w();
                                fVar.d(true);
                                break;
                            }
                        case 5:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80843e = aiVar.w();
                                fVar.e(true);
                                break;
                            }
                        case 6:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.f80844f = aiVar.w();
                                fVar.f(true);
                                break;
                            }
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.g = aiVar.A();
                                fVar.g(true);
                                break;
                            }
                        case 8:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.h = aiVar.z();
                                fVar.h(true);
                                break;
                            }
                        case 9:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.i = aiVar.z();
                                fVar.i(true);
                                break;
                            }
                        case 10:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                fVar.j = aiVar.w();
                                fVar.j(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (!fVar.m()) {
                        throw new aj("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!fVar.p()) {
                        throw new aj("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (fVar.s()) {
                        fVar.G();
                        return;
                    } else {
                        throw new aj("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
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

    static class c extends at<f> {
        private c() {
        }

        public void a(ai aiVar, f fVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(fVar.f80839a);
            aoVar.a(fVar.f80840b);
            aoVar.a(fVar.f80841c);
            aoVar.a(fVar.f80842d);
            aoVar.a(fVar.f80843e);
            aoVar.a(fVar.f80844f);
            aoVar.a(fVar.g);
            aoVar.a(fVar.h);
            aoVar.a(fVar.i);
            BitSet bitSet = new BitSet();
            if (fVar.F()) {
                bitSet.set(0);
            }
            aoVar.a(bitSet, 1);
            if (fVar.F()) {
                aoVar.a(fVar.j);
            }
        }

        public void b(ai aiVar, f fVar) throws p {
            ao aoVar = (ao) aiVar;
            fVar.f80839a = aoVar.z();
            fVar.a(true);
            fVar.f80840b = aoVar.z();
            fVar.b(true);
            fVar.f80841c = aoVar.z();
            fVar.c(true);
            fVar.f80842d = aoVar.w();
            fVar.d(true);
            fVar.f80843e = aoVar.w();
            fVar.e(true);
            fVar.f80844f = aoVar.w();
            fVar.f(true);
            fVar.g = aoVar.A();
            fVar.g(true);
            fVar.h = aoVar.z();
            fVar.h(true);
            fVar.i = aoVar.z();
            fVar.i(true);
            if (aoVar.b(1).get(0)) {
                fVar.j = aoVar.w();
                fVar.j(true);
            }
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

    public enum e implements q {
        VERSION(1, "version"),
        ADDRESS(2, "address"),
        SIGNATURE(3, "signature"),
        SERIAL_NUM(4, "serial_num"),
        TS_SECS(5, "ts_secs"),
        LENGTH(6, "length"),
        ENTITY(7, "entity"),
        GUID(8, "guid"),
        CHECKSUM(9, "checksum"),
        CODEX(10, "codex");
        
        private static final Map<String, e> k = null;
        private final short l;
        private final String m;

        public final short a() {
            return this.l;
        }

        public final String b() {
            return this.m;
        }

        static {
            k = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                k.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return k.get(str);
        }

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return VERSION;
                case 2:
                    return ADDRESS;
                case 3:
                    return SIGNATURE;
                case 4:
                    return SERIAL_NUM;
                case 5:
                    return TS_SECS;
                case 6:
                    return LENGTH;
                case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                    return ENTITY;
                case 8:
                    return GUID;
                case 9:
                    return CHECKSUM;
                case 10:
                    return CODEX;
                default:
                    return null;
            }
        }

        private e(short s, String str) {
            this.l = s;
            this.m = str;
        }
    }

    public void B() {
        this.i = null;
    }

    public void f() {
        this.f80840b = null;
    }

    public void i() {
        this.f80841c = null;
    }

    public void v() {
        this.g = null;
    }

    public void y() {
        this.h = null;
    }

    public String A() {
        return this.i;
    }

    public int D() {
        return this.j;
    }

    public String h() {
        return this.f80841c;
    }

    public int k() {
        return this.f80842d;
    }

    public int n() {
        return this.f80843e;
    }

    public int q() {
        return this.f80844f;
    }

    public ByteBuffer u() {
        return this.g;
    }

    public String x() {
        return this.h;
    }

    public boolean C() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public boolean F() {
        return g.a(this.C, 3);
    }

    /* renamed from: a */
    public f deepCopy() {
        return new f(this);
    }

    public boolean j() {
        if (this.f80841c != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return g.a(this.C, 0);
    }

    public boolean p() {
        return g.a(this.C, 1);
    }

    public boolean s() {
        return g.a(this.C, 2);
    }

    public boolean w() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public boolean z() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public f() {
        this.D = new e[]{e.CODEX};
    }

    public void E() {
        this.C = g.b(this.C, 3);
    }

    public String b() {
        return this.f80839a;
    }

    public void c() {
        this.f80839a = null;
    }

    public String e() {
        return this.f80840b;
    }

    public boolean g() {
        if (this.f80840b != null) {
            return true;
        }
        return false;
    }

    public void l() {
        this.C = g.b(this.C, 0);
    }

    public void o() {
        this.C = g.b(this.C, 1);
    }

    public void r() {
        this.C = g.b(this.C, 2);
    }

    public boolean d() {
        if (this.f80839a != null) {
            return true;
        }
        return false;
    }

    public byte[] t() {
        a(k.c(this.g));
        if (this.g == null) {
            return null;
        }
        return this.g.array();
    }

    public void clear() {
        this.f80839a = null;
        this.f80840b = null;
        this.f80841c = null;
        d(false);
        this.f80842d = 0;
        e(false);
        this.f80843e = 0;
        f(false);
        this.f80844f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public void G() throws p {
        if (this.f80839a == null) {
            throw new aj("Required field 'version' was not present! Struct: " + toString());
        } else if (this.f80840b == null) {
            throw new aj("Required field 'address' was not present! Struct: " + toString());
        } else if (this.f80841c == null) {
            throw new aj("Required field 'signature' was not present! Struct: " + toString());
        } else if (this.g == null) {
            throw new aj("Required field 'entity' was not present! Struct: " + toString());
        } else if (this.h == null) {
            throw new aj("Required field 'guid' was not present! Struct: " + toString());
        } else if (this.i == null) {
            throw new aj("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        if (this.f80839a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80839a);
        }
        sb.append(", ");
        sb.append("address:");
        if (this.f80840b == null) {
            sb.append("null");
        } else {
            sb.append(this.f80840b);
        }
        sb.append(", ");
        sb.append("signature:");
        if (this.f80841c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80841c);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f80842d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f80843e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f80844f);
        sb.append(", ");
        sb.append("entity:");
        if (this.g == null) {
            sb.append("null");
        } else {
            k.a(this.g, sb);
        }
        sb.append(", ");
        sb.append("guid:");
        if (this.h == null) {
            sb.append("null");
        } else {
            sb.append(this.h);
        }
        sb.append(", ");
        sb.append("checksum:");
        if (this.i == null) {
            sb.append("null");
        } else {
            sb.append(this.i);
        }
        if (F()) {
            sb.append(", ");
            sb.append("codex:");
            sb.append(this.j);
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        x = hashMap;
        hashMap.put(as.class, new b());
        x.put(at.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new v("version", (byte) 1, new w((byte) 11)));
        enumMap.put(e.ADDRESS, new v("address", (byte) 1, new w((byte) 11)));
        enumMap.put(e.SIGNATURE, new v("signature", (byte) 1, new w((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new v("serial_num", (byte) 1, new w((byte) 8)));
        enumMap.put(e.TS_SECS, new v("ts_secs", (byte) 1, new w((byte) 8)));
        enumMap.put(e.LENGTH, new v("length", (byte) 1, new w((byte) 8)));
        enumMap.put(e.ENTITY, new v("entity", (byte) 1, new w((byte) 11, true)));
        enumMap.put(e.GUID, new v("guid", (byte) 1, new w((byte) 11)));
        enumMap.put(e.CHECKSUM, new v("checksum", (byte) 1, new w((byte) 11)));
        enumMap.put(e.CODEX, new v("codex", (byte) 2, new w((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        v.a(f.class, k);
    }

    public f a(String str) {
        this.f80839a = str;
        return this;
    }

    public f b(String str) {
        this.f80840b = str;
        return this;
    }

    public f c(String str) {
        this.f80841c = str;
        return this;
    }

    public f d(String str) {
        this.h = str;
        return this;
    }

    public f e(String str) {
        this.i = str;
        return this;
    }

    public f b(int i2) {
        this.f80843e = i2;
        e(true);
        return this;
    }

    public f c(int i2) {
        this.f80844f = i2;
        f(true);
        return this;
    }

    public f d(int i2) {
        this.j = i2;
        j(true);
        return this;
    }

    /* renamed from: e */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public void g(boolean z) {
        if (!z) {
            this.g = null;
        }
    }

    public void h(boolean z) {
        if (!z) {
            this.h = null;
        }
    }

    public void i(boolean z) {
        if (!z) {
            this.i = null;
        }
    }

    public f a(int i2) {
        this.f80842d = i2;
        d(true);
        return this;
    }

    public void d(boolean z) {
        this.C = g.a(this.C, 0, z);
    }

    public void f(boolean z) {
        this.C = g.a(this.C, 2, z);
    }

    public void j(boolean z) {
        this.C = g.a(this.C, 3, z);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = 0;
            read(new ac(new au((InputStream) objectInputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(boolean z) {
        if (!z) {
            this.f80840b = null;
        }
    }

    public void c(boolean z) {
        if (!z) {
            this.f80841c = null;
        }
    }

    public void e(boolean z) {
        this.C = g.a(this.C, 1, z);
    }

    public void read(ai aiVar) throws p {
        x.get(aiVar.D()).b().b(aiVar, this);
    }

    public void write(ai aiVar) throws p {
        x.get(aiVar.D()).b().a(aiVar, this);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ac(new au((OutputStream) objectOutputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public f(f fVar) {
        this.D = new e[]{e.CODEX};
        this.C = fVar.C;
        if (fVar.d()) {
            this.f80839a = fVar.f80839a;
        }
        if (fVar.g()) {
            this.f80840b = fVar.f80840b;
        }
        if (fVar.j()) {
            this.f80841c = fVar.f80841c;
        }
        this.f80842d = fVar.f80842d;
        this.f80843e = fVar.f80843e;
        this.f80844f = fVar.f80844f;
        if (fVar.w()) {
            this.g = k.d(fVar.g);
        }
        if (fVar.z()) {
            this.h = fVar.h;
        }
        if (fVar.C()) {
            this.i = fVar.i;
        }
        this.j = fVar.j;
    }

    public f a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public f a(byte[] bArr) {
        ByteBuffer byteBuffer;
        if (bArr == null) {
            byteBuffer = null;
        } else {
            byteBuffer = ByteBuffer.wrap(bArr);
        }
        a(byteBuffer);
        return this;
    }

    public void a(boolean z) {
        if (!z) {
            this.f80839a = null;
        }
    }

    public f(String str, String str2, String str3, int i2, int i3, int i4, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f80839a = str;
        this.f80840b = str2;
        this.f80841c = str3;
        this.f80842d = i2;
        d(true);
        this.f80843e = i3;
        e(true);
        this.f80844f = i4;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }
}

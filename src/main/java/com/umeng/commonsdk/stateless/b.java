package com.umeng.commonsdk.stateless;

import com.umeng.commonsdk.proguard.ac;
import com.umeng.commonsdk.proguard.ad;
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
import com.umeng.commonsdk.proguard.k;
import com.umeng.commonsdk.proguard.p;
import com.umeng.commonsdk.proguard.q;
import com.umeng.commonsdk.proguard.v;
import com.umeng.commonsdk.proguard.w;
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

public class b implements j<b, e>, Serializable, Cloneable {
    public static final Map<e, v> k;
    /* access modifiers changed from: private */
    public static final an m = new an("UMSLEnvelope");
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
    public String f80887a;

    /* renamed from: b  reason: collision with root package name */
    public String f80888b;

    /* renamed from: c  reason: collision with root package name */
    public String f80889c;

    /* renamed from: d  reason: collision with root package name */
    public int f80890d;

    /* renamed from: e  reason: collision with root package name */
    public int f80891e;

    /* renamed from: f  reason: collision with root package name */
    public int f80892f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static class a extends as<b> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, b bVar) throws p {
            bVar.G();
            aiVar.a(b.m);
            if (bVar.f80887a != null) {
                aiVar.a(b.n);
                aiVar.a(bVar.f80887a);
                aiVar.c();
            }
            if (bVar.f80888b != null) {
                aiVar.a(b.o);
                aiVar.a(bVar.f80888b);
                aiVar.c();
            }
            if (bVar.f80889c != null) {
                aiVar.a(b.p);
                aiVar.a(bVar.f80889c);
                aiVar.c();
            }
            aiVar.a(b.q);
            aiVar.a(bVar.f80890d);
            aiVar.c();
            aiVar.a(b.r);
            aiVar.a(bVar.f80891e);
            aiVar.c();
            aiVar.a(b.s);
            aiVar.a(bVar.f80892f);
            aiVar.c();
            if (bVar.g != null) {
                aiVar.a(b.t);
                aiVar.a(bVar.g);
                aiVar.c();
            }
            if (bVar.h != null) {
                aiVar.a(b.u);
                aiVar.a(bVar.h);
                aiVar.c();
            }
            if (bVar.i != null) {
                aiVar.a(b.v);
                aiVar.a(bVar.i);
                aiVar.c();
            }
            if (bVar.F()) {
                aiVar.a(b.w);
                aiVar.a(bVar.j);
                aiVar.c();
            }
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, b bVar) throws p {
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
                                bVar.f80887a = aiVar.z();
                                bVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f80888b = aiVar.z();
                                bVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f80889c = aiVar.z();
                                bVar.c(true);
                                break;
                            }
                        case 4:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f80890d = aiVar.w();
                                bVar.d(true);
                                break;
                            }
                        case 5:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f80891e = aiVar.w();
                                bVar.e(true);
                                break;
                            }
                        case 6:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f80892f = aiVar.w();
                                bVar.f(true);
                                break;
                            }
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.g = aiVar.A();
                                bVar.g(true);
                                break;
                            }
                        case 8:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.h = aiVar.z();
                                bVar.h(true);
                                break;
                            }
                        case 9:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.i = aiVar.z();
                                bVar.i(true);
                                break;
                            }
                        case 10:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.j = aiVar.w();
                                bVar.j(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (!bVar.m()) {
                        throw new aj("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!bVar.p()) {
                        throw new aj("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (bVar.s()) {
                        bVar.G();
                        return;
                    } else {
                        throw new aj("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
                }
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.stateless.b$b  reason: collision with other inner class name */
    static class C0861b implements ar {
        private C0861b() {
        }

        /* renamed from: a */
        public a b() {
            return new a();
        }
    }

    static class c extends at<b> {
        private c() {
        }

        public void a(ai aiVar, b bVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(bVar.f80887a);
            aoVar.a(bVar.f80888b);
            aoVar.a(bVar.f80889c);
            aoVar.a(bVar.f80890d);
            aoVar.a(bVar.f80891e);
            aoVar.a(bVar.f80892f);
            aoVar.a(bVar.g);
            aoVar.a(bVar.h);
            aoVar.a(bVar.i);
            BitSet bitSet = new BitSet();
            if (bVar.F()) {
                bitSet.set(0);
            }
            aoVar.a(bitSet, 1);
            if (bVar.F()) {
                aoVar.a(bVar.j);
            }
        }

        public void b(ai aiVar, b bVar) throws p {
            ao aoVar = (ao) aiVar;
            bVar.f80887a = aoVar.z();
            bVar.a(true);
            bVar.f80888b = aoVar.z();
            bVar.b(true);
            bVar.f80889c = aoVar.z();
            bVar.c(true);
            bVar.f80890d = aoVar.w();
            bVar.d(true);
            bVar.f80891e = aoVar.w();
            bVar.e(true);
            bVar.f80892f = aoVar.w();
            bVar.f(true);
            bVar.g = aoVar.A();
            bVar.g(true);
            bVar.h = aoVar.z();
            bVar.h(true);
            bVar.i = aoVar.z();
            bVar.i(true);
            if (aoVar.b(1).get(0)) {
                bVar.j = aoVar.w();
                bVar.j(true);
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
        this.f80888b = null;
    }

    public void i() {
        this.f80889c = null;
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
        return this.f80889c;
    }

    public int k() {
        return this.f80890d;
    }

    public int n() {
        return this.f80891e;
    }

    public int q() {
        return this.f80892f;
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
    public b deepCopy() {
        return new b(this);
    }

    public boolean j() {
        if (this.f80889c != null) {
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

    public b() {
        this.D = new e[]{e.CODEX};
    }

    public void E() {
        this.C = g.b(this.C, 3);
    }

    public String b() {
        return this.f80887a;
    }

    public void c() {
        this.f80887a = null;
    }

    public String e() {
        return this.f80888b;
    }

    public boolean g() {
        if (this.f80888b != null) {
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
        if (this.f80887a != null) {
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
        this.f80887a = null;
        this.f80888b = null;
        this.f80889c = null;
        d(false);
        this.f80890d = 0;
        e(false);
        this.f80891e = 0;
        f(false);
        this.f80892f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public void G() throws p {
        if (this.f80887a == null) {
            throw new aj("Required field 'version' was not present! Struct: " + toString());
        } else if (this.f80888b == null) {
            throw new aj("Required field 'address' was not present! Struct: " + toString());
        } else if (this.f80889c == null) {
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
        StringBuilder sb = new StringBuilder("UMSLEnvelope(");
        sb.append("version:");
        if (this.f80887a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80887a);
        }
        sb.append(", ");
        sb.append("address:");
        if (this.f80888b == null) {
            sb.append("null");
        } else {
            sb.append(this.f80888b);
        }
        sb.append(", ");
        sb.append("signature:");
        if (this.f80889c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80889c);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f80890d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f80891e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f80892f);
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
        hashMap.put(as.class, new C0861b());
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
        v.a(b.class, k);
    }

    public b a(String str) {
        this.f80887a = str;
        return this;
    }

    public b b(String str) {
        this.f80888b = str;
        return this;
    }

    public b c(String str) {
        this.f80889c = str;
        return this;
    }

    public b d(String str) {
        this.h = str;
        return this;
    }

    public b e(String str) {
        this.i = str;
        return this;
    }

    public b b(int i2) {
        this.f80891e = i2;
        e(true);
        return this;
    }

    public b c(int i2) {
        this.f80892f = i2;
        f(true);
        return this;
    }

    public b d(int i2) {
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

    public b a(int i2) {
        this.f80890d = i2;
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
            this.f80888b = null;
        }
    }

    public void c(boolean z) {
        if (!z) {
            this.f80889c = null;
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

    public b(b bVar) {
        this.D = new e[]{e.CODEX};
        this.C = bVar.C;
        if (bVar.d()) {
            this.f80887a = bVar.f80887a;
        }
        if (bVar.g()) {
            this.f80888b = bVar.f80888b;
        }
        if (bVar.j()) {
            this.f80889c = bVar.f80889c;
        }
        this.f80890d = bVar.f80890d;
        this.f80891e = bVar.f80891e;
        this.f80892f = bVar.f80892f;
        if (bVar.w()) {
            this.g = k.d(bVar.g);
        }
        if (bVar.z()) {
            this.h = bVar.h;
        }
        if (bVar.C()) {
            this.i = bVar.i;
        }
        this.j = bVar.j;
    }

    public b a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public b a(byte[] bArr) {
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
            this.f80887a = null;
        }
    }

    public b(String str, String str2, String str3, int i2, int i3, int i4, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f80887a = str;
        this.f80888b = str2;
        this.f80889c = str3;
        this.f80890d = i2;
        d(true);
        this.f80891e = i3;
        e(true);
        this.f80892f = i4;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }
}

package com.umeng.analytics.pro;

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

public class bq implements cg<bq, e>, Serializable, Cloneable {
    public static final Map<e, cs> k;
    /* access modifiers changed from: private */
    public static final dk m = new dk("UMEnvelope");
    /* access modifiers changed from: private */
    public static final da n = new da("version", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final da o = new da("address", (byte) 11, 2);
    /* access modifiers changed from: private */
    public static final da p = new da("signature", (byte) 11, 3);
    /* access modifiers changed from: private */
    public static final da q = new da("serial_num", (byte) 8, 4);
    /* access modifiers changed from: private */
    public static final da r = new da("ts_secs", (byte) 8, 5);
    /* access modifiers changed from: private */
    public static final da s = new da("length", (byte) 8, 6);
    /* access modifiers changed from: private */
    public static final da t = new da("entity", (byte) 11, 7);
    /* access modifiers changed from: private */
    public static final da u = new da("guid", (byte) 11, 8);
    /* access modifiers changed from: private */
    public static final da v = new da("checksum", (byte) 11, 9);
    /* access modifiers changed from: private */
    public static final da w = new da("codex", (byte) 8, 10);
    private static final Map<Class<? extends dn>, Cdo> x;
    private byte C;
    private e[] D;

    /* renamed from: a  reason: collision with root package name */
    public String f80520a;

    /* renamed from: b  reason: collision with root package name */
    public String f80521b;

    /* renamed from: c  reason: collision with root package name */
    public String f80522c;

    /* renamed from: d  reason: collision with root package name */
    public int f80523d;

    /* renamed from: e  reason: collision with root package name */
    public int f80524e;

    /* renamed from: f  reason: collision with root package name */
    public int f80525f;
    public ByteBuffer g;
    public String h;
    public String i;
    public int j;

    static class a extends dp<bq> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bq bqVar) throws cm {
            bqVar.I();
            dfVar.a(bq.m);
            if (bqVar.f80520a != null) {
                dfVar.a(bq.n);
                dfVar.a(bqVar.f80520a);
                dfVar.c();
            }
            if (bqVar.f80521b != null) {
                dfVar.a(bq.o);
                dfVar.a(bqVar.f80521b);
                dfVar.c();
            }
            if (bqVar.f80522c != null) {
                dfVar.a(bq.p);
                dfVar.a(bqVar.f80522c);
                dfVar.c();
            }
            dfVar.a(bq.q);
            dfVar.a(bqVar.f80523d);
            dfVar.c();
            dfVar.a(bq.r);
            dfVar.a(bqVar.f80524e);
            dfVar.c();
            dfVar.a(bq.s);
            dfVar.a(bqVar.f80525f);
            dfVar.c();
            if (bqVar.g != null) {
                dfVar.a(bq.t);
                dfVar.a(bqVar.g);
                dfVar.c();
            }
            if (bqVar.h != null) {
                dfVar.a(bq.u);
                dfVar.a(bqVar.h);
                dfVar.c();
            }
            if (bqVar.i != null) {
                dfVar.a(bq.v);
                dfVar.a(bqVar.i);
                dfVar.c();
            }
            if (bqVar.H()) {
                dfVar.a(bq.w);
                dfVar.a(bqVar.j);
                dfVar.c();
            }
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bq bqVar) throws cm {
            dfVar.j();
            while (true) {
                da l = dfVar.l();
                if (l.f80616b != 0) {
                    switch (l.f80617c) {
                        case 1:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80520a = dfVar.z();
                                bqVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80521b = dfVar.z();
                                bqVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80522c = dfVar.z();
                                bqVar.c(true);
                                break;
                            }
                        case 4:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80523d = dfVar.w();
                                bqVar.d(true);
                                break;
                            }
                        case 5:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80524e = dfVar.w();
                                bqVar.e(true);
                                break;
                            }
                        case 6:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.f80525f = dfVar.w();
                                bqVar.f(true);
                                break;
                            }
                        case com.ss.android.ugc.aweme.commercialize.loft.model.e.l:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.g = dfVar.A();
                                bqVar.g(true);
                                break;
                            }
                        case 8:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.h = dfVar.z();
                                bqVar.h(true);
                                break;
                            }
                        case 9:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.i = dfVar.z();
                                bqVar.i(true);
                                break;
                            }
                        case 10:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bqVar.j = dfVar.w();
                                bqVar.j(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (!bqVar.n()) {
                        throw new dg("Required field 'serial_num' was not found in serialized data! Struct: " + toString());
                    } else if (!bqVar.r()) {
                        throw new dg("Required field 'ts_secs' was not found in serialized data! Struct: " + toString());
                    } else if (bqVar.u()) {
                        bqVar.I();
                        return;
                    } else {
                        throw new dg("Required field 'length' was not found in serialized data! Struct: " + toString());
                    }
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

    static class c extends dq<bq> {
        private c() {
        }

        public void a(df dfVar, bq bqVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(bqVar.f80520a);
            dlVar.a(bqVar.f80521b);
            dlVar.a(bqVar.f80522c);
            dlVar.a(bqVar.f80523d);
            dlVar.a(bqVar.f80524e);
            dlVar.a(bqVar.f80525f);
            dlVar.a(bqVar.g);
            dlVar.a(bqVar.h);
            dlVar.a(bqVar.i);
            BitSet bitSet = new BitSet();
            if (bqVar.H()) {
                bitSet.set(0);
            }
            dlVar.a(bitSet, 1);
            if (bqVar.H()) {
                dlVar.a(bqVar.j);
            }
        }

        public void b(df dfVar, bq bqVar) throws cm {
            dl dlVar = (dl) dfVar;
            bqVar.f80520a = dlVar.z();
            bqVar.a(true);
            bqVar.f80521b = dlVar.z();
            bqVar.b(true);
            bqVar.f80522c = dlVar.z();
            bqVar.c(true);
            bqVar.f80523d = dlVar.w();
            bqVar.d(true);
            bqVar.f80524e = dlVar.w();
            bqVar.e(true);
            bqVar.f80525f = dlVar.w();
            bqVar.f(true);
            bqVar.g = dlVar.A();
            bqVar.g(true);
            bqVar.h = dlVar.z();
            bqVar.h(true);
            bqVar.i = dlVar.z();
            bqVar.i(true);
            if (dlVar.b(1).get(0)) {
                bqVar.j = dlVar.w();
                bqVar.j(true);
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

    public void A() {
        this.h = null;
    }

    public void D() {
        this.i = null;
    }

    public void g() {
        this.f80521b = null;
    }

    public void j() {
        this.f80522c = null;
    }

    public void x() {
        this.g = null;
    }

    public String C() {
        return this.i;
    }

    public int F() {
        return this.j;
    }

    public String f() {
        return this.f80521b;
    }

    public String i() {
        return this.f80522c;
    }

    public int l() {
        return this.f80523d;
    }

    public int o() {
        return this.f80524e;
    }

    public int s() {
        return this.f80525f;
    }

    public ByteBuffer w() {
        return this.g;
    }

    public String z() {
        return this.h;
    }

    public boolean B() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public boolean E() {
        if (this.i != null) {
            return true;
        }
        return false;
    }

    public boolean H() {
        return cd.a(this.C, 3);
    }

    /* renamed from: a */
    public bq p() {
        return new bq(this);
    }

    public boolean k() {
        if (this.f80522c != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return cd.a(this.C, 0);
    }

    public boolean r() {
        return cd.a(this.C, 1);
    }

    public boolean u() {
        return cd.a(this.C, 2);
    }

    public boolean y() {
        if (this.g != null) {
            return true;
        }
        return false;
    }

    public bq() {
        this.D = new e[]{e.CODEX};
    }

    public void G() {
        this.C = cd.b(this.C, 3);
    }

    public String c() {
        return this.f80520a;
    }

    public void d() {
        this.f80520a = null;
    }

    public boolean h() {
        if (this.f80521b != null) {
            return true;
        }
        return false;
    }

    public void m() {
        this.C = cd.b(this.C, 0);
    }

    public void q() {
        this.C = cd.b(this.C, 1);
    }

    public void t() {
        this.C = cd.b(this.C, 2);
    }

    public boolean e() {
        if (this.f80520a != null) {
            return true;
        }
        return false;
    }

    public byte[] v() {
        a(ch.c(this.g));
        if (this.g == null) {
            return null;
        }
        return this.g.array();
    }

    public void b() {
        this.f80520a = null;
        this.f80521b = null;
        this.f80522c = null;
        d(false);
        this.f80523d = 0;
        e(false);
        this.f80524e = 0;
        f(false);
        this.f80525f = 0;
        this.g = null;
        this.h = null;
        this.i = null;
        j(false);
        this.j = 0;
    }

    public void I() throws cm {
        if (this.f80520a == null) {
            throw new dg("Required field 'version' was not present! Struct: " + toString());
        } else if (this.f80521b == null) {
            throw new dg("Required field 'address' was not present! Struct: " + toString());
        } else if (this.f80522c == null) {
            throw new dg("Required field 'signature' was not present! Struct: " + toString());
        } else if (this.g == null) {
            throw new dg("Required field 'entity' was not present! Struct: " + toString());
        } else if (this.h == null) {
            throw new dg("Required field 'guid' was not present! Struct: " + toString());
        } else if (this.i == null) {
            throw new dg("Required field 'checksum' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("UMEnvelope(");
        sb.append("version:");
        if (this.f80520a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80520a);
        }
        sb.append(", ");
        sb.append("address:");
        if (this.f80521b == null) {
            sb.append("null");
        } else {
            sb.append(this.f80521b);
        }
        sb.append(", ");
        sb.append("signature:");
        if (this.f80522c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80522c);
        }
        sb.append(", ");
        sb.append("serial_num:");
        sb.append(this.f80523d);
        sb.append(", ");
        sb.append("ts_secs:");
        sb.append(this.f80524e);
        sb.append(", ");
        sb.append("length:");
        sb.append(this.f80525f);
        sb.append(", ");
        sb.append("entity:");
        if (this.g == null) {
            sb.append("null");
        } else {
            ch.a(this.g, sb);
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
        if (H()) {
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
        hashMap.put(dp.class, new b());
        x.put(dq.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.VERSION, new cs("version", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.ADDRESS, new cs("address", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.SIGNATURE, new cs("signature", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.SERIAL_NUM, new cs("serial_num", (byte) 1, new ct((byte) 8)));
        enumMap.put(e.TS_SECS, new cs("ts_secs", (byte) 1, new ct((byte) 8)));
        enumMap.put(e.LENGTH, new cs("length", (byte) 1, new ct((byte) 8)));
        enumMap.put(e.ENTITY, new cs("entity", (byte) 1, new ct((byte) 11, true)));
        enumMap.put(e.GUID, new cs("guid", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.CHECKSUM, new cs("checksum", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.CODEX, new cs("codex", (byte) 2, new ct((byte) 8)));
        k = Collections.unmodifiableMap(enumMap);
        cs.a(bq.class, k);
    }

    public bq a(String str) {
        this.f80520a = str;
        return this;
    }

    public bq b(String str) {
        this.f80521b = str;
        return this;
    }

    public bq c(String str) {
        this.f80522c = str;
        return this;
    }

    public bq d(String str) {
        this.h = str;
        return this;
    }

    public bq e(String str) {
        this.i = str;
        return this;
    }

    public bq c(int i2) {
        this.f80524e = i2;
        e(true);
        return this;
    }

    public bq d(int i2) {
        this.f80525f = i2;
        f(true);
        return this;
    }

    public bq e(int i2) {
        this.j = i2;
        j(true);
        return this;
    }

    /* renamed from: f */
    public e b(int i2) {
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

    public bq a(int i2) {
        this.f80523d = i2;
        d(true);
        return this;
    }

    public void b(boolean z) {
        if (!z) {
            this.f80521b = null;
        }
    }

    public void e(boolean z) {
        this.C = cd.a(this.C, 1, z);
    }

    public void f(boolean z) {
        this.C = cd.a(this.C, 2, z);
    }

    public void j(boolean z) {
        this.C = cd.a(this.C, 3, z);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.C = 0;
            a((df) new cz(new dr((InputStream) objectInputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(df dfVar) throws cm {
        x.get(dfVar.D()).b().a(dfVar, this);
    }

    public void c(boolean z) {
        if (!z) {
            this.f80522c = null;
        }
    }

    public void d(boolean z) {
        this.C = cd.a(this.C, 0, z);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b((df) new cz(new dr((OutputStream) objectOutputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public bq(bq bqVar) {
        this.D = new e[]{e.CODEX};
        this.C = bqVar.C;
        if (bqVar.e()) {
            this.f80520a = bqVar.f80520a;
        }
        if (bqVar.h()) {
            this.f80521b = bqVar.f80521b;
        }
        if (bqVar.k()) {
            this.f80522c = bqVar.f80522c;
        }
        this.f80523d = bqVar.f80523d;
        this.f80524e = bqVar.f80524e;
        this.f80525f = bqVar.f80525f;
        if (bqVar.y()) {
            this.g = ch.d(bqVar.g);
        }
        if (bqVar.B()) {
            this.h = bqVar.h;
        }
        if (bqVar.E()) {
            this.i = bqVar.i;
        }
        this.j = bqVar.j;
    }

    public bq a(ByteBuffer byteBuffer) {
        this.g = byteBuffer;
        return this;
    }

    public bq a(byte[] bArr) {
        ByteBuffer byteBuffer;
        if (bArr == null) {
            byteBuffer = null;
        } else {
            byteBuffer = ByteBuffer.wrap(bArr);
        }
        a(byteBuffer);
        return this;
    }

    public void a(df dfVar) throws cm {
        x.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80520a = null;
        }
    }

    public bq(String str, String str2, String str3, int i2, int i3, int i4, ByteBuffer byteBuffer, String str4, String str5) {
        this();
        this.f80520a = str;
        this.f80521b = str2;
        this.f80522c = str3;
        this.f80523d = i2;
        d(true);
        this.f80524e = i3;
        e(true);
        this.f80525f = i4;
        f(true);
        this.g = byteBuffer;
        this.h = str4;
        this.i = str5;
    }
}

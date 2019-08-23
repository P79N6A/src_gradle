package com.umeng.commonsdk.statistics.proto;

import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
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
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a implements j<a, e>, Serializable, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<e, v> f80998e;
    /* access modifiers changed from: private */
    public static final an g = new an("IdJournal");
    /* access modifiers changed from: private */
    public static final ad h = new ad("domain", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final ad i = new ad("old_id", (byte) 11, 2);
    /* access modifiers changed from: private */
    public static final ad j = new ad("new_id", (byte) 11, 3);
    /* access modifiers changed from: private */
    public static final ad k = new ad(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 4);
    private static final Map<Class<? extends aq>, ar> l;

    /* renamed from: a  reason: collision with root package name */
    public String f80999a;

    /* renamed from: b  reason: collision with root package name */
    public String f81000b;

    /* renamed from: c  reason: collision with root package name */
    public String f81001c;

    /* renamed from: d  reason: collision with root package name */
    public long f81002d;
    private byte n;
    private e[] o;

    /* renamed from: com.umeng.commonsdk.statistics.proto.a$a  reason: collision with other inner class name */
    static class C0864a extends as<a> {
        private C0864a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, a aVar) throws p {
            aVar.n();
            aiVar.a(a.g);
            if (aVar.f80999a != null) {
                aiVar.a(a.h);
                aiVar.a(aVar.f80999a);
                aiVar.c();
            }
            if (aVar.f81000b != null && aVar.g()) {
                aiVar.a(a.i);
                aiVar.a(aVar.f81000b);
                aiVar.c();
            }
            if (aVar.f81001c != null) {
                aiVar.a(a.j);
                aiVar.a(aVar.f81001c);
                aiVar.c();
            }
            aiVar.a(a.k);
            aiVar.a(aVar.f81002d);
            aiVar.c();
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, a aVar) throws p {
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
                                aVar.f80999a = aiVar.z();
                                aVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                aVar.f81000b = aiVar.z();
                                aVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                aVar.f81001c = aiVar.z();
                                aVar.c(true);
                                break;
                            }
                        case 4:
                            if (l.f80813b != 10) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                aVar.f81002d = aiVar.x();
                                aVar.d(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (aVar.m()) {
                        aVar.n();
                        return;
                    }
                    throw new aj("Required field 'ts' was not found in serialized data! Struct: " + toString());
                }
            }
        }
    }

    static class b implements ar {
        private b() {
        }

        /* renamed from: a */
        public C0864a b() {
            return new C0864a();
        }
    }

    static class c extends at<a> {
        private c() {
        }

        public void a(ai aiVar, a aVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(aVar.f80999a);
            aoVar.a(aVar.f81001c);
            aoVar.a(aVar.f81002d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            aoVar.a(bitSet, 1);
            if (aVar.g()) {
                aoVar.a(aVar.f81000b);
            }
        }

        public void b(ai aiVar, a aVar) throws p {
            ao aoVar = (ao) aiVar;
            aVar.f80999a = aoVar.z();
            aVar.a(true);
            aVar.f81001c = aoVar.z();
            aVar.c(true);
            aVar.f81002d = aoVar.x();
            aVar.d(true);
            if (aoVar.b(1).get(0)) {
                aVar.f81000b = aoVar.z();
                aVar.b(true);
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
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, TimeDisplaySetting.TIME_DISPLAY_SETTING);
        

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, e> f81007e = null;

        /* renamed from: f  reason: collision with root package name */
        private final short f81008f;
        private final String g;

        public final short a() {
            return this.f81008f;
        }

        public final String b() {
            return this.g;
        }

        static {
            f81007e = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f81007e.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f81007e.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return DOMAIN;
                case 2:
                    return OLD_ID;
                case 3:
                    return NEW_ID;
                case 4:
                    return TS;
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
            this.f81008f = s;
            this.g = str;
        }
    }

    public void f() {
        this.f81000b = null;
    }

    public void i() {
        this.f81001c = null;
    }

    public String e() {
        return this.f81000b;
    }

    public String h() {
        return this.f81001c;
    }

    public long k() {
        return this.f81002d;
    }

    public String b() {
        return this.f80999a;
    }

    public void c() {
        this.f80999a = null;
    }

    public boolean d() {
        if (this.f80999a != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.f81000b != null) {
            return true;
        }
        return false;
    }

    public boolean j() {
        if (this.f81001c != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return g.a(this.n, 0);
    }

    public a() {
        this.o = new e[]{e.OLD_ID};
    }

    /* renamed from: a */
    public a deepCopy() {
        return new a(this);
    }

    public void clear() {
        this.f80999a = null;
        this.f81000b = null;
        this.f81001c = null;
        d(false);
        this.f81002d = 0;
    }

    public void l() {
        this.n = g.b(this.n, 0);
    }

    public void n() throws p {
        if (this.f80999a == null) {
            throw new aj("Required field 'domain' was not present! Struct: " + toString());
        } else if (this.f81001c == null) {
            throw new aj("Required field 'new_id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        if (this.f80999a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80999a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            if (this.f81000b == null) {
                sb.append("null");
            } else {
                sb.append(this.f81000b);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        if (this.f81001c == null) {
            sb.append("null");
        } else {
            sb.append(this.f81001c);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f81002d);
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put(as.class, new b());
        l.put(at.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new v("domain", (byte) 1, new w((byte) 11)));
        enumMap.put(e.OLD_ID, new v("old_id", (byte) 2, new w((byte) 11)));
        enumMap.put(e.NEW_ID, new v("new_id", (byte) 1, new w((byte) 11)));
        enumMap.put(e.TS, new v(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new w((byte) 10)));
        f80998e = Collections.unmodifiableMap(enumMap);
        v.a(a.class, f80998e);
    }

    public a a(String str) {
        this.f80999a = str;
        return this;
    }

    public a b(String str) {
        this.f81000b = str;
        return this;
    }

    public a c(String str) {
        this.f81001c = str;
        return this;
    }

    /* renamed from: a */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public void b(boolean z) {
        if (!z) {
            this.f81000b = null;
        }
    }

    public void c(boolean z) {
        if (!z) {
            this.f81001c = null;
        }
    }

    public void d(boolean z) {
        this.n = g.a(this.n, 0, z);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.n = 0;
            read(new ac(new au((InputStream) objectInputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void read(ai aiVar) throws p {
        l.get(aiVar.D()).b().b(aiVar, this);
    }

    public void write(ai aiVar) throws p {
        l.get(aiVar.D()).b().a(aiVar, this);
    }

    public a(a aVar) {
        this.o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.f80999a = aVar.f80999a;
        }
        if (aVar.g()) {
            this.f81000b = aVar.f81000b;
        }
        if (aVar.j()) {
            this.f81001c = aVar.f81001c;
        }
        this.f81002d = aVar.f81002d;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ac(new au((OutputStream) objectOutputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public a a(long j2) {
        this.f81002d = j2;
        d(true);
        return this;
    }

    public void a(boolean z) {
        if (!z) {
            this.f80999a = null;
        }
    }

    public a(String str, String str2, long j2) {
        this();
        this.f80999a = str;
        this.f81001c = str2;
        this.f81002d = j2;
        d(true);
    }
}

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

public class e implements j<e, C0868e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<C0868e, v> f81042d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final an f81043f = new an("ImprintValue");
    /* access modifiers changed from: private */
    public static final ad g = new ad("value", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final ad h = new ad(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 2);
    /* access modifiers changed from: private */
    public static final ad i = new ad("guid", (byte) 11, 3);
    private static final Map<Class<? extends aq>, ar> j;

    /* renamed from: a  reason: collision with root package name */
    public String f81044a;

    /* renamed from: b  reason: collision with root package name */
    public long f81045b;

    /* renamed from: c  reason: collision with root package name */
    public String f81046c;
    private byte l;
    private C0868e[] m;

    static class a extends as<e> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, e eVar) throws p {
            eVar.k();
            aiVar.a(e.f81043f);
            if (eVar.f81044a != null && eVar.d()) {
                aiVar.a(e.g);
                aiVar.a(eVar.f81044a);
                aiVar.c();
            }
            aiVar.a(e.h);
            aiVar.a(eVar.f81045b);
            aiVar.c();
            if (eVar.f81046c != null) {
                aiVar.a(e.i);
                aiVar.a(eVar.f81046c);
                aiVar.c();
            }
            aiVar.d();
            aiVar.b();
        }

        /* renamed from: a */
        public void b(ai aiVar, e eVar) throws p {
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
                                eVar.f81044a = aiVar.z();
                                eVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 10) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                eVar.f81045b = aiVar.x();
                                eVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 11) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                eVar.f81046c = aiVar.z();
                                eVar.c(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (eVar.g()) {
                        eVar.k();
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
        public a b() {
            return new a();
        }
    }

    static class c extends at<e> {
        private c() {
        }

        public void a(ai aiVar, e eVar) throws p {
            ao aoVar = (ao) aiVar;
            aoVar.a(eVar.f81045b);
            aoVar.a(eVar.f81046c);
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            aoVar.a(bitSet, 1);
            if (eVar.d()) {
                aoVar.a(eVar.f81044a);
            }
        }

        public void b(ai aiVar, e eVar) throws p {
            ao aoVar = (ao) aiVar;
            eVar.f81045b = aoVar.x();
            eVar.b(true);
            eVar.f81046c = aoVar.z();
            eVar.c(true);
            if (aoVar.b(1).get(0)) {
                eVar.f81044a = aoVar.z();
                eVar.a(true);
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

    /* renamed from: com.umeng.commonsdk.statistics.proto.e$e  reason: collision with other inner class name */
    public enum C0868e implements q {
        VALUE(1, "value"),
        TS(2, TimeDisplaySetting.TIME_DISPLAY_SETTING),
        GUID(3, "guid");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, C0868e> f81050d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f81051e;

        /* renamed from: f  reason: collision with root package name */
        private final String f81052f;

        public final short a() {
            return this.f81051e;
        }

        public final String b() {
            return this.f81052f;
        }

        static {
            f81050d = new HashMap();
            Iterator it2 = EnumSet.allOf(C0868e.class).iterator();
            while (it2.hasNext()) {
                C0868e eVar = (C0868e) it2.next();
                f81050d.put(eVar.b(), eVar);
            }
        }

        public static C0868e a(String str) {
            return f81050d.get(str);
        }

        public static C0868e a(int i) {
            switch (i) {
                case 1:
                    return VALUE;
                case 2:
                    return TS;
                case 3:
                    return GUID;
                default:
                    return null;
            }
        }

        public static C0868e b(int i) {
            C0868e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        private C0868e(short s, String str) {
            this.f81051e = s;
            this.f81052f = str;
        }
    }

    public void c() {
        this.f81044a = null;
    }

    public void i() {
        this.f81046c = null;
    }

    public long e() {
        return this.f81045b;
    }

    public String h() {
        return this.f81046c;
    }

    public String b() {
        return this.f81044a;
    }

    public boolean d() {
        if (this.f81044a != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return g.a(this.l, 0);
    }

    public boolean j() {
        if (this.f81046c != null) {
            return true;
        }
        return false;
    }

    public e() {
        this.m = new C0868e[]{C0868e.VALUE};
    }

    /* renamed from: a */
    public e deepCopy() {
        return new e(this);
    }

    public void clear() {
        this.f81044a = null;
        b(false);
        this.f81045b = 0;
        this.f81046c = null;
    }

    public void f() {
        this.l = g.b(this.l, 0);
    }

    public void k() throws p {
        if (this.f81046c == null) {
            throw new aj("Required field 'guid' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            if (this.f81044a == null) {
                sb.append("null");
            } else {
                sb.append(this.f81044a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f81045b);
        sb.append(", ");
        sb.append("guid:");
        if (this.f81046c == null) {
            sb.append("null");
        } else {
            sb.append(this.f81046c);
        }
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(as.class, new b());
        j.put(at.class, new d());
        EnumMap enumMap = new EnumMap(C0868e.class);
        enumMap.put(C0868e.VALUE, new v("value", (byte) 2, new w((byte) 11)));
        enumMap.put(C0868e.TS, new v(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new w((byte) 10)));
        enumMap.put(C0868e.GUID, new v("guid", (byte) 1, new w((byte) 11)));
        f81042d = Collections.unmodifiableMap(enumMap);
        v.a(e.class, f81042d);
    }

    public e a(String str) {
        this.f81044a = str;
        return this;
    }

    public e b(String str) {
        this.f81046c = str;
        return this;
    }

    /* renamed from: a */
    public C0868e fieldForId(int i2) {
        return C0868e.a(i2);
    }

    public void c(boolean z) {
        if (!z) {
            this.f81046c = null;
        }
    }

    public void b(boolean z) {
        this.l = g.a(this.l, 0, z);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.l = 0;
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

    public e(e eVar) {
        this.m = new C0868e[]{C0868e.VALUE};
        this.l = eVar.l;
        if (eVar.d()) {
            this.f81044a = eVar.f81044a;
        }
        this.f81045b = eVar.f81045b;
        if (eVar.j()) {
            this.f81046c = eVar.f81046c;
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new ac(new au((OutputStream) objectOutputStream)));
        } catch (p e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public e a(long j2) {
        this.f81045b = j2;
        b(true);
        return this;
    }

    public void a(boolean z) {
        if (!z) {
            this.f81044a = null;
        }
    }

    public e(long j2, String str) {
        this();
        this.f81045b = j2;
        b(true);
        this.f81046c = str;
    }
}

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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class b implements j<b, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, v> f81009d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final an f81010f = new an("IdSnapshot");
    /* access modifiers changed from: private */
    public static final ad g = new ad("identity", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final ad h = new ad(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 2);
    /* access modifiers changed from: private */
    public static final ad i = new ad("version", (byte) 8, 3);
    private static final Map<Class<? extends aq>, ar> j;

    /* renamed from: a  reason: collision with root package name */
    public String f81011a;

    /* renamed from: b  reason: collision with root package name */
    public long f81012b;

    /* renamed from: c  reason: collision with root package name */
    public int f81013c;
    private byte m;

    static class a extends as<b> {
        private a() {
        }

        /* renamed from: b */
        public void a(ai aiVar, b bVar) throws p {
            bVar.k();
            aiVar.a(b.f81010f);
            if (bVar.f81011a != null) {
                aiVar.a(b.g);
                aiVar.a(bVar.f81011a);
                aiVar.c();
            }
            aiVar.a(b.h);
            aiVar.a(bVar.f81012b);
            aiVar.c();
            aiVar.a(b.i);
            aiVar.a(bVar.f81013c);
            aiVar.c();
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
                                bVar.f81011a = aiVar.z();
                                bVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80813b != 10) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f81012b = aiVar.x();
                                bVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80813b != 8) {
                                al.a(aiVar, l.f80813b);
                                break;
                            } else {
                                bVar.f81013c = aiVar.w();
                                bVar.c(true);
                                break;
                            }
                        default:
                            al.a(aiVar, l.f80813b);
                            break;
                    }
                    aiVar.m();
                } else {
                    aiVar.k();
                    if (!bVar.g()) {
                        throw new aj("Required field 'ts' was not found in serialized data! Struct: " + toString());
                    } else if (bVar.j()) {
                        bVar.k();
                        return;
                    } else {
                        throw new aj("Required field 'version' was not found in serialized data! Struct: " + toString());
                    }
                }
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.b$b  reason: collision with other inner class name */
    static class C0865b implements ar {
        private C0865b() {
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
            aoVar.a(bVar.f81011a);
            aoVar.a(bVar.f81012b);
            aoVar.a(bVar.f81013c);
        }

        public void b(ai aiVar, b bVar) throws p {
            ao aoVar = (ao) aiVar;
            bVar.f81011a = aoVar.z();
            bVar.a(true);
            bVar.f81012b = aoVar.x();
            bVar.b(true);
            bVar.f81013c = aoVar.w();
            bVar.c(true);
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
        IDENTITY(1, "identity"),
        TS(2, TimeDisplaySetting.TIME_DISPLAY_SETTING),
        VERSION(3, "version");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f81017d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f81018e;

        /* renamed from: f  reason: collision with root package name */
        private final String f81019f;

        public final short a() {
            return this.f81018e;
        }

        public final String b() {
            return this.f81019f;
        }

        static {
            f81017d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f81017d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f81017d.get(str);
        }

        public static e a(int i) {
            switch (i) {
                case 1:
                    return IDENTITY;
                case 2:
                    return TS;
                case 3:
                    return VERSION;
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
            this.f81018e = s;
            this.f81019f = str;
        }
    }

    public void c() {
        this.f81011a = null;
    }

    public b() {
    }

    public String b() {
        return this.f81011a;
    }

    public long e() {
        return this.f81012b;
    }

    public int h() {
        return this.f81013c;
    }

    /* renamed from: a */
    public b deepCopy() {
        return new b(this);
    }

    public boolean d() {
        if (this.f81011a != null) {
            return true;
        }
        return false;
    }

    public boolean g() {
        return g.a(this.m, 0);
    }

    public boolean j() {
        return g.a(this.m, 1);
    }

    public void f() {
        this.m = g.b(this.m, 0);
    }

    public void i() {
        this.m = g.b(this.m, 1);
    }

    public void clear() {
        this.f81011a = null;
        b(false);
        this.f81012b = 0;
        c(false);
        this.f81013c = 0;
    }

    public void k() throws p {
        if (this.f81011a == null) {
            throw new aj("Required field 'identity' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        if (this.f81011a == null) {
            sb.append("null");
        } else {
            sb.append(this.f81011a);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f81012b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f81013c);
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(as.class, new C0865b());
        j.put(at.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new v("identity", (byte) 1, new w((byte) 11)));
        enumMap.put(e.TS, new v(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new w((byte) 10)));
        enumMap.put(e.VERSION, new v("version", (byte) 1, new w((byte) 8)));
        f81009d = Collections.unmodifiableMap(enumMap);
        v.a(b.class, f81009d);
    }

    public b a(String str) {
        this.f81011a = str;
        return this;
    }

    /* renamed from: b */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public b a(int i2) {
        this.f81013c = i2;
        c(true);
        return this;
    }

    public void b(boolean z) {
        this.m = g.a(this.m, 0, z);
    }

    public void c(boolean z) {
        this.m = g.a(this.m, 1, z);
    }

    public b(b bVar) {
        this.m = bVar.m;
        if (bVar.d()) {
            this.f81011a = bVar.f81011a;
        }
        this.f81012b = bVar.f81012b;
        this.f81013c = bVar.f81013c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.m = 0;
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

    public b a(long j2) {
        this.f81012b = j2;
        b(true);
        return this;
    }

    public void a(boolean z) {
        if (!z) {
            this.f81011a = null;
        }
    }

    public b(String str, long j2, int i2) {
        this();
        this.f81011a = str;
        this.f81012b = j2;
        b(true);
        this.f81013c = i2;
        c(true);
    }
}

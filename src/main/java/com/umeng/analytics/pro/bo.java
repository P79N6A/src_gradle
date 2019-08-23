package com.umeng.analytics.pro;

import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
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

public class bo implements cg<bo, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, cs> f80498d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final dk f80499f = new dk("ImprintValue");
    /* access modifiers changed from: private */
    public static final da g = new da("value", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final da h = new da(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 2);
    /* access modifiers changed from: private */
    public static final da i = new da("guid", (byte) 11, 3);
    private static final Map<Class<? extends dn>, Cdo> j;

    /* renamed from: a  reason: collision with root package name */
    public String f80500a;

    /* renamed from: b  reason: collision with root package name */
    public long f80501b;

    /* renamed from: c  reason: collision with root package name */
    public String f80502c;
    private byte l;
    private e[] m;

    static class a extends dp<bo> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bo boVar) throws cm {
            boVar.l();
            dfVar.a(bo.f80499f);
            if (boVar.f80500a != null && boVar.e()) {
                dfVar.a(bo.g);
                dfVar.a(boVar.f80500a);
                dfVar.c();
            }
            dfVar.a(bo.h);
            dfVar.a(boVar.f80501b);
            dfVar.c();
            if (boVar.f80502c != null) {
                dfVar.a(bo.i);
                dfVar.a(boVar.f80502c);
                dfVar.c();
            }
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bo boVar) throws cm {
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
                                boVar.f80500a = dfVar.z();
                                boVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 10) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                boVar.f80501b = dfVar.x();
                                boVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                boVar.f80502c = dfVar.z();
                                boVar.c(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (boVar.h()) {
                        boVar.l();
                        return;
                    }
                    throw new dg("Required field 'ts' was not found in serialized data! Struct: " + toString());
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

    static class c extends dq<bo> {
        private c() {
        }

        public void a(df dfVar, bo boVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(boVar.f80501b);
            dlVar.a(boVar.f80502c);
            BitSet bitSet = new BitSet();
            if (boVar.e()) {
                bitSet.set(0);
            }
            dlVar.a(bitSet, 1);
            if (boVar.e()) {
                dlVar.a(boVar.f80500a);
            }
        }

        public void b(df dfVar, bo boVar) throws cm {
            dl dlVar = (dl) dfVar;
            boVar.f80501b = dlVar.x();
            boVar.b(true);
            boVar.f80502c = dlVar.z();
            boVar.c(true);
            if (dlVar.b(1).get(0)) {
                boVar.f80500a = dlVar.z();
                boVar.a(true);
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
        VALUE(1, "value"),
        TS(2, TimeDisplaySetting.TIME_DISPLAY_SETTING),
        GUID(3, "guid");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80506d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80507e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80508f;

        public final short a() {
            return this.f80507e;
        }

        public final String b() {
            return this.f80508f;
        }

        static {
            f80506d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80506d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80506d.get(str);
        }

        public static e a(int i) {
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

        public static e b(int i) {
            e a2 = a(i);
            if (a2 != null) {
                return a2;
            }
            throw new IllegalArgumentException("Field " + i + " doesn't exist!");
        }

        private e(short s, String str) {
            this.f80507e = s;
            this.f80508f = str;
        }
    }

    public void d() {
        this.f80500a = null;
    }

    public void j() {
        this.f80502c = null;
    }

    public String c() {
        return this.f80500a;
    }

    public long f() {
        return this.f80501b;
    }

    public String i() {
        return this.f80502c;
    }

    public boolean e() {
        if (this.f80500a != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return cd.a(this.l, 0);
    }

    public boolean k() {
        if (this.f80502c != null) {
            return true;
        }
        return false;
    }

    public bo() {
        this.m = new e[]{e.VALUE};
    }

    /* renamed from: a */
    public bo p() {
        return new bo(this);
    }

    public void b() {
        this.f80500a = null;
        b(false);
        this.f80501b = 0;
        this.f80502c = null;
    }

    public void g() {
        this.l = cd.b(this.l, 0);
    }

    public void l() throws cm {
        if (this.f80502c == null) {
            throw new dg("Required field 'guid' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (e()) {
            sb.append("value:");
            if (this.f80500a == null) {
                sb.append("null");
            } else {
                sb.append(this.f80500a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.f80501b);
        sb.append(", ");
        sb.append("guid:");
        if (this.f80502c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80502c);
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
        enumMap.put(e.VALUE, new cs("value", (byte) 2, new ct((byte) 11)));
        enumMap.put(e.TS, new cs(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new ct((byte) 10)));
        enumMap.put(e.GUID, new cs("guid", (byte) 1, new ct((byte) 11)));
        f80498d = Collections.unmodifiableMap(enumMap);
        cs.a(bo.class, f80498d);
    }

    public bo a(String str) {
        this.f80500a = str;
        return this;
    }

    public bo b(String str) {
        this.f80502c = str;
        return this;
    }

    /* renamed from: a */
    public e b(int i2) {
        return e.a(i2);
    }

    public void c(boolean z) {
        if (!z) {
            this.f80502c = null;
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

    public bo(bo boVar) {
        this.m = new e[]{e.VALUE};
        this.l = boVar.l;
        if (boVar.e()) {
            this.f80500a = boVar.f80500a;
        }
        this.f80501b = boVar.f80501b;
        if (boVar.k()) {
            this.f80502c = boVar.f80502c;
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
        this.l = cd.a(this.l, 0, z);
    }

    public bo a(long j2) {
        this.f80501b = j2;
        b(true);
        return this;
    }

    public void a(df dfVar) throws cm {
        j.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80500a = null;
        }
    }

    public bo(long j2, String str) {
        this();
        this.f80501b = j2;
        b(true);
        this.f80502c = str;
    }
}

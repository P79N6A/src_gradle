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

public class bk implements cg<bk, e>, Serializable, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<e, cs> f80454e;
    /* access modifiers changed from: private */
    public static final dk g = new dk("IdJournal");
    /* access modifiers changed from: private */
    public static final da h = new da("domain", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final da i = new da("old_id", (byte) 11, 2);
    /* access modifiers changed from: private */
    public static final da j = new da("new_id", (byte) 11, 3);
    /* access modifiers changed from: private */
    public static final da k = new da(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 4);
    private static final Map<Class<? extends dn>, Cdo> l;

    /* renamed from: a  reason: collision with root package name */
    public String f80455a;

    /* renamed from: b  reason: collision with root package name */
    public String f80456b;

    /* renamed from: c  reason: collision with root package name */
    public String f80457c;

    /* renamed from: d  reason: collision with root package name */
    public long f80458d;
    private byte n;
    private e[] o;

    static class a extends dp<bk> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bk bkVar) throws cm {
            bkVar.o();
            dfVar.a(bk.g);
            if (bkVar.f80455a != null) {
                dfVar.a(bk.h);
                dfVar.a(bkVar.f80455a);
                dfVar.c();
            }
            if (bkVar.f80456b != null && bkVar.h()) {
                dfVar.a(bk.i);
                dfVar.a(bkVar.f80456b);
                dfVar.c();
            }
            if (bkVar.f80457c != null) {
                dfVar.a(bk.j);
                dfVar.a(bkVar.f80457c);
                dfVar.c();
            }
            dfVar.a(bk.k);
            dfVar.a(bkVar.f80458d);
            dfVar.c();
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bk bkVar) throws cm {
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
                                bkVar.f80455a = dfVar.z();
                                bkVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bkVar.f80456b = dfVar.z();
                                bkVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 11) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bkVar.f80457c = dfVar.z();
                                bkVar.c(true);
                                break;
                            }
                        case 4:
                            if (l.f80616b != 10) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                bkVar.f80458d = dfVar.x();
                                bkVar.d(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (bkVar.n()) {
                        bkVar.o();
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

    static class c extends dq<bk> {
        private c() {
        }

        public void a(df dfVar, bk bkVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(bkVar.f80455a);
            dlVar.a(bkVar.f80457c);
            dlVar.a(bkVar.f80458d);
            BitSet bitSet = new BitSet();
            if (bkVar.h()) {
                bitSet.set(0);
            }
            dlVar.a(bitSet, 1);
            if (bkVar.h()) {
                dlVar.a(bkVar.f80456b);
            }
        }

        public void b(df dfVar, bk bkVar) throws cm {
            dl dlVar = (dl) dfVar;
            bkVar.f80455a = dlVar.z();
            bkVar.a(true);
            bkVar.f80457c = dlVar.z();
            bkVar.c(true);
            bkVar.f80458d = dlVar.x();
            bkVar.d(true);
            if (dlVar.b(1).get(0)) {
                bkVar.f80456b = dlVar.z();
                bkVar.b(true);
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
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, TimeDisplaySetting.TIME_DISPLAY_SETTING);
        

        /* renamed from: e  reason: collision with root package name */
        private static final Map<String, e> f80463e = null;

        /* renamed from: f  reason: collision with root package name */
        private final short f80464f;
        private final String g;

        public final short a() {
            return this.f80464f;
        }

        public final String b() {
            return this.g;
        }

        static {
            f80463e = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80463e.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80463e.get(str);
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
            this.f80464f = s;
            this.g = str;
        }
    }

    public void d() {
        this.f80455a = null;
    }

    public void g() {
        this.f80456b = null;
    }

    public void j() {
        this.f80457c = null;
    }

    public String f() {
        return this.f80456b;
    }

    public String i() {
        return this.f80457c;
    }

    public long l() {
        return this.f80458d;
    }

    public String c() {
        return this.f80455a;
    }

    public boolean e() {
        if (this.f80455a != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.f80456b != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        if (this.f80457c != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        return cd.a(this.n, 0);
    }

    public bk() {
        this.o = new e[]{e.OLD_ID};
    }

    /* renamed from: a */
    public bk p() {
        return new bk(this);
    }

    public void b() {
        this.f80455a = null;
        this.f80456b = null;
        this.f80457c = null;
        d(false);
        this.f80458d = 0;
    }

    public void m() {
        this.n = cd.b(this.n, 0);
    }

    public void o() throws cm {
        if (this.f80455a == null) {
            throw new dg("Required field 'domain' was not present! Struct: " + toString());
        } else if (this.f80457c == null) {
            throw new dg("Required field 'new_id' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        if (this.f80455a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80455a);
        }
        if (h()) {
            sb.append(", ");
            sb.append("old_id:");
            if (this.f80456b == null) {
                sb.append("null");
            } else {
                sb.append(this.f80456b);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        if (this.f80457c == null) {
            sb.append("null");
        } else {
            sb.append(this.f80457c);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f80458d);
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        l = hashMap;
        hashMap.put(dp.class, new b());
        l.put(dq.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new cs("domain", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.OLD_ID, new cs("old_id", (byte) 2, new ct((byte) 11)));
        enumMap.put(e.NEW_ID, new cs("new_id", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.TS, new cs(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new ct((byte) 10)));
        f80454e = Collections.unmodifiableMap(enumMap);
        cs.a(bk.class, f80454e);
    }

    public bk a(String str) {
        this.f80455a = str;
        return this;
    }

    public bk b(String str) {
        this.f80456b = str;
        return this;
    }

    public bk c(String str) {
        this.f80457c = str;
        return this;
    }

    /* renamed from: a */
    public e b(int i2) {
        return e.a(i2);
    }

    public void c(boolean z) {
        if (!z) {
            this.f80457c = null;
        }
    }

    public void d(boolean z) {
        this.n = cd.a(this.n, 0, z);
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.n = 0;
            a((df) new cz(new dr((InputStream) objectInputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(df dfVar) throws cm {
        l.get(dfVar.D()).b().a(dfVar, this);
    }

    public bk(bk bkVar) {
        this.o = new e[]{e.OLD_ID};
        this.n = bkVar.n;
        if (bkVar.e()) {
            this.f80455a = bkVar.f80455a;
        }
        if (bkVar.h()) {
            this.f80456b = bkVar.f80456b;
        }
        if (bkVar.k()) {
            this.f80457c = bkVar.f80457c;
        }
        this.f80458d = bkVar.f80458d;
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
            this.f80456b = null;
        }
    }

    public bk a(long j2) {
        this.f80458d = j2;
        d(true);
        return this;
    }

    public void a(df dfVar) throws cm {
        l.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80455a = null;
        }
    }

    public bk(String str, String str2, long j2) {
        this();
        this.f80455a = str;
        this.f80457c = str2;
        this.f80458d = j2;
        d(true);
    }
}

package com.umeng.analytics.pro;

import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
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

public class bl implements cg<bl, e>, Serializable, Cloneable {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<e, cs> f80465d;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final dk f80466f = new dk("IdSnapshot");
    /* access modifiers changed from: private */
    public static final da g = new da("identity", (byte) 11, 1);
    /* access modifiers changed from: private */
    public static final da h = new da(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 10, 2);
    /* access modifiers changed from: private */
    public static final da i = new da("version", (byte) 8, 3);
    private static final Map<Class<? extends dn>, Cdo> j;

    /* renamed from: a  reason: collision with root package name */
    public String f80467a;

    /* renamed from: b  reason: collision with root package name */
    public long f80468b;

    /* renamed from: c  reason: collision with root package name */
    public int f80469c;
    private byte m;

    static class a extends dp<bl> {
        private a() {
        }

        /* renamed from: b */
        public void a(df dfVar, bl blVar) throws cm {
            blVar.l();
            dfVar.a(bl.f80466f);
            if (blVar.f80467a != null) {
                dfVar.a(bl.g);
                dfVar.a(blVar.f80467a);
                dfVar.c();
            }
            dfVar.a(bl.h);
            dfVar.a(blVar.f80468b);
            dfVar.c();
            dfVar.a(bl.i);
            dfVar.a(blVar.f80469c);
            dfVar.c();
            dfVar.d();
            dfVar.b();
        }

        /* renamed from: a */
        public void b(df dfVar, bl blVar) throws cm {
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
                                blVar.f80467a = dfVar.z();
                                blVar.a(true);
                                break;
                            }
                        case 2:
                            if (l.f80616b != 10) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                blVar.f80468b = dfVar.x();
                                blVar.b(true);
                                break;
                            }
                        case 3:
                            if (l.f80616b != 8) {
                                di.a(dfVar, l.f80616b);
                                break;
                            } else {
                                blVar.f80469c = dfVar.w();
                                blVar.c(true);
                                break;
                            }
                        default:
                            di.a(dfVar, l.f80616b);
                            break;
                    }
                    dfVar.m();
                } else {
                    dfVar.k();
                    if (!blVar.h()) {
                        throw new dg("Required field 'ts' was not found in serialized data! Struct: " + toString());
                    } else if (blVar.k()) {
                        blVar.l();
                        return;
                    } else {
                        throw new dg("Required field 'version' was not found in serialized data! Struct: " + toString());
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

    static class c extends dq<bl> {
        private c() {
        }

        public void a(df dfVar, bl blVar) throws cm {
            dl dlVar = (dl) dfVar;
            dlVar.a(blVar.f80467a);
            dlVar.a(blVar.f80468b);
            dlVar.a(blVar.f80469c);
        }

        public void b(df dfVar, bl blVar) throws cm {
            dl dlVar = (dl) dfVar;
            blVar.f80467a = dlVar.z();
            blVar.a(true);
            blVar.f80468b = dlVar.x();
            blVar.b(true);
            blVar.f80469c = dlVar.w();
            blVar.c(true);
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
        IDENTITY(1, "identity"),
        TS(2, TimeDisplaySetting.TIME_DISPLAY_SETTING),
        VERSION(3, "version");
        

        /* renamed from: d  reason: collision with root package name */
        private static final Map<String, e> f80473d = null;

        /* renamed from: e  reason: collision with root package name */
        private final short f80474e;

        /* renamed from: f  reason: collision with root package name */
        private final String f80475f;

        public final short a() {
            return this.f80474e;
        }

        public final String b() {
            return this.f80475f;
        }

        static {
            f80473d = new HashMap();
            Iterator it2 = EnumSet.allOf(e.class).iterator();
            while (it2.hasNext()) {
                e eVar = (e) it2.next();
                f80473d.put(eVar.b(), eVar);
            }
        }

        public static e a(String str) {
            return f80473d.get(str);
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
            this.f80474e = s;
            this.f80475f = str;
        }
    }

    public void d() {
        this.f80467a = null;
    }

    public bl() {
    }

    public String c() {
        return this.f80467a;
    }

    public long f() {
        return this.f80468b;
    }

    public int i() {
        return this.f80469c;
    }

    /* renamed from: a */
    public bl p() {
        return new bl(this);
    }

    public boolean e() {
        if (this.f80467a != null) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return cd.a(this.m, 0);
    }

    public boolean k() {
        return cd.a(this.m, 1);
    }

    public void g() {
        this.m = cd.b(this.m, 0);
    }

    public void j() {
        this.m = cd.b(this.m, 1);
    }

    public void b() {
        this.f80467a = null;
        b(false);
        this.f80468b = 0;
        c(false);
        this.f80469c = 0;
    }

    public void l() throws cm {
        if (this.f80467a == null) {
            throw new dg("Required field 'identity' was not present! Struct: " + toString());
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        if (this.f80467a == null) {
            sb.append("null");
        } else {
            sb.append(this.f80467a);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.f80468b);
        sb.append(", ");
        sb.append("version:");
        sb.append(this.f80469c);
        sb.append(")");
        return sb.toString();
    }

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put(dp.class, new b());
        j.put(dq.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new cs("identity", (byte) 1, new ct((byte) 11)));
        enumMap.put(e.TS, new cs(TimeDisplaySetting.TIME_DISPLAY_SETTING, (byte) 1, new ct((byte) 10)));
        enumMap.put(e.VERSION, new cs("version", (byte) 1, new ct((byte) 8)));
        f80465d = Collections.unmodifiableMap(enumMap);
        cs.a(bl.class, f80465d);
    }

    public bl a(String str) {
        this.f80467a = str;
        return this;
    }

    /* renamed from: c */
    public e b(int i2) {
        return e.a(i2);
    }

    public bl a(int i2) {
        this.f80469c = i2;
        c(true);
        return this;
    }

    public void b(boolean z) {
        this.m = cd.a(this.m, 0, z);
    }

    public void c(boolean z) {
        this.m = cd.a(this.m, 1, z);
    }

    public bl(bl blVar) {
        this.m = blVar.m;
        if (blVar.e()) {
            this.f80467a = blVar.f80467a;
        }
        this.f80468b = blVar.f80468b;
        this.f80469c = blVar.f80469c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.m = 0;
            a((df) new cz(new dr((InputStream) objectInputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            b((df) new cz(new dr((OutputStream) objectOutputStream)));
        } catch (cm e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public void b(df dfVar) throws cm {
        j.get(dfVar.D()).b().a(dfVar, this);
    }

    public bl a(long j2) {
        this.f80468b = j2;
        b(true);
        return this;
    }

    public void a(df dfVar) throws cm {
        j.get(dfVar.D()).b().b(dfVar, this);
    }

    public void a(boolean z) {
        if (!z) {
            this.f80467a = null;
        }
    }

    public bl(String str, long j2, int i2) {
        this();
        this.f80467a = str;
        this.f80468b = j2;
        b(true);
        this.f80469c = i2;
        c(true);
    }
}

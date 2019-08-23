package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

public class io implements jv<io, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82245a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f540a = new kl("ClientUploadDataItem");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82246b = new kd("", (byte) 11, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82247c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82248d = new kd("", (byte) 10, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82249e = new kd("", (byte) 10, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82250f = new kd("", (byte) 2, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 11, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 13, 10);
    private static final kd k = new kd("", (byte) 11, 11);

    /* renamed from: a  reason: collision with other field name */
    public long f541a;

    /* renamed from: a  reason: collision with other field name */
    public String f542a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f543a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f544a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f545a;

    /* renamed from: b  reason: collision with other field name */
    public long f546b;

    /* renamed from: b  reason: collision with other field name */
    public String f547b;

    /* renamed from: c  reason: collision with other field name */
    public String f548c;

    /* renamed from: d  reason: collision with other field name */
    public String f549d;

    /* renamed from: e  reason: collision with other field name */
    public String f550e;

    /* renamed from: f  reason: collision with other field name */
    public String f551f;

    /* renamed from: g  reason: collision with other field name */
    public String f552g;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c5, code lost:
        if (r5 == 0) goto L_0x01c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.io r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            int r5 = r0.compareTo(r5)
        L_0x0022:
            r0 = r5
            goto L_0x01c9
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f542a
            java.lang.String r1 = r5.f542a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r4.f547b
            java.lang.String r1 = r5.f547b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f548c
            java.lang.String r1 = r5.f548c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            long r0 = r4.f541a
            long r2 = r5.f541a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x01c9
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f546b
            long r2 = r5.f546b
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x01c9
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            boolean r0 = r4.f545a
            boolean r1 = r5.f545a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f549d
            java.lang.String r1 = r5.f549d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r4.f550e
            java.lang.String r1 = r5.f550e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f551f
            java.lang.String r1 = r5.f551f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f544a
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f544a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x01c9
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01c9
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r4.f552g
            java.lang.String r5 = r5.f552g
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x01c7:
            r5 = 0
            r0 = 0
        L_0x01c9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.io.compareTo(com.xiaomi.push.io):int");
    }

    public long a() {
        return this.f546b;
    }

    public io a(long j2) {
        this.f541a = j2;
        a(true);
        return this;
    }

    public io a(String str) {
        this.f542a = str;
        return this;
    }

    public io a(boolean z) {
        this.f545a = z;
        c(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m398a() {
        return this.f542a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m399a() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r7) {
        /*
            r6 = this;
            r7.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r7.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0012
            r7.f()
            r6.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 2
            r3 = 10
            r4 = 1
            r5 = 11
            switch(r1) {
                case 1: goto L_0x00c0;
                case 2: goto L_0x00b5;
                case 3: goto L_0x00aa;
                case 4: goto L_0x009c;
                case 5: goto L_0x008e;
                case 6: goto L_0x0080;
                case 7: goto L_0x0075;
                case 8: goto L_0x006a;
                case 9: goto L_0x005f;
                case 10: goto L_0x0030;
                case 11: goto L_0x0024;
                default: goto L_0x001d;
            }
        L_0x001d:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r7, r0)
            goto L_0x00ca
        L_0x0024:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f552g = r0
            goto L_0x00ca
        L_0x0030:
            byte r1 = r0.f82422a
            r3 = 13
            if (r1 != r3) goto L_0x001d
            com.xiaomi.push.kf r0 = r7.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f873a
            int r3 = r3 * 2
            r1.<init>(r3)
            r6.f544a = r1
            r1 = 0
        L_0x0046:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x005a
            java.lang.String r2 = r7.a()
            java.lang.String r3 = r7.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r6.f544a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0046
        L_0x005a:
            r7.h()
            goto L_0x00ca
        L_0x005f:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f551f = r0
            goto L_0x00ca
        L_0x006a:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f550e = r0
            goto L_0x00ca
        L_0x0075:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f549d = r0
            goto L_0x00ca
        L_0x0080:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001d
            boolean r0 = r7.a()
            r6.f545a = r0
            r6.c((boolean) r4)
            goto L_0x00ca
        L_0x008e:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001d
            long r0 = r7.a()
            r6.f546b = r0
            r6.b((boolean) r4)
            goto L_0x00ca
        L_0x009c:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001d
            long r0 = r7.a()
            r6.f541a = r0
            r6.a((boolean) r4)
            goto L_0x00ca
        L_0x00aa:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f548c = r0
            goto L_0x00ca
        L_0x00b5:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f547b = r0
            goto L_0x00ca
        L_0x00c0:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001d
            java.lang.String r0 = r7.a()
            r6.f542a = r0
        L_0x00ca:
            r7.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.io.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m400a(boolean z) {
        this.f543a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m401a() {
        return this.f542a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m402a(io ioVar) {
        if (ioVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = ioVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f542a.equals(ioVar.f542a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ioVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f547b.equals(ioVar.f547b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ioVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f548c.equals(ioVar.f548c))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ioVar.d();
        if ((d2 || d3) && (!d2 || !d3 || this.f541a != ioVar.f541a)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ioVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f546b != ioVar.f546b)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ioVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f545a != ioVar.f545a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ioVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f549d.equals(ioVar.f549d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ioVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f550e.equals(ioVar.f550e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ioVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f551f.equals(ioVar.f551f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ioVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f544a.equals(ioVar.f544a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ioVar.k();
        return (!k2 && !k3) || (k2 && k3 && this.f552g.equals(ioVar.f552g));
    }

    public io b(long j2) {
        this.f546b = j2;
        b(true);
        return this;
    }

    public io b(String str) {
        this.f547b = str;
        return this;
    }

    public String b() {
        return this.f548c;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f540a);
        if (this.f542a != null && a()) {
            kgVar.a(f82245a);
            kgVar.a(this.f542a);
            kgVar.b();
        }
        if (this.f547b != null && b()) {
            kgVar.a(f82246b);
            kgVar.a(this.f547b);
            kgVar.b();
        }
        if (this.f548c != null && c()) {
            kgVar.a(f82247c);
            kgVar.a(this.f548c);
            kgVar.b();
        }
        if (d()) {
            kgVar.a(f82248d);
            kgVar.a(this.f541a);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82249e);
            kgVar.a(this.f546b);
            kgVar.b();
        }
        if (f()) {
            kgVar.a(f82250f);
            kgVar.a(this.f545a);
            kgVar.b();
        }
        if (this.f549d != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f549d);
            kgVar.b();
        }
        if (this.f550e != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f550e);
            kgVar.b();
        }
        if (this.f551f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f551f);
            kgVar.b();
        }
        if (this.f544a != null && j()) {
            kgVar.a(j);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f544a.size()));
            for (Map.Entry next : this.f544a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (this.f552g != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f552g);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f543a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m403b() {
        return this.f547b != null;
    }

    public io c(String str) {
        this.f548c = str;
        return this;
    }

    public String c() {
        return this.f550e;
    }

    public void c(boolean z) {
        this.f543a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m404c() {
        return this.f548c != null;
    }

    public io d(String str) {
        this.f549d = str;
        return this;
    }

    public String d() {
        return this.f551f;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m405d() {
        return this.f543a.get(0);
    }

    public io e(String str) {
        this.f550e = str;
        return this;
    }

    public String e() {
        return this.f552g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m406e() {
        return this.f543a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof io)) {
            return compareTo((io) obj);
        }
        return false;
    }

    public io f(String str) {
        this.f551f = str;
        return this;
    }

    public boolean f() {
        return this.f543a.get(2);
    }

    public io g(String str) {
        this.f552g = str;
        return this;
    }

    public boolean g() {
        return this.f549d != null;
    }

    public boolean h() {
        return this.f550e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f551f != null;
    }

    public boolean j() {
        return this.f544a != null;
    }

    public boolean k() {
        return this.f552g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (a()) {
            sb.append("channel:");
            sb.append(this.f542a == null ? "null" : this.f542a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            sb.append(this.f547b == null ? "null" : this.f547b);
            z = false;
        }
        if (c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            sb.append(this.f548c == null ? "null" : this.f548c);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f541a);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f546b);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f545a);
            z = false;
        }
        if (g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            sb.append(this.f549d == null ? "null" : this.f549d);
            z = false;
        }
        if (h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            sb.append(this.f550e == null ? "null" : this.f550e);
            z = false;
        }
        if (i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            sb.append(this.f551f == null ? "null" : this.f551f);
            z = false;
        }
        if (j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            if (this.f544a == null) {
                sb.append("null");
            } else {
                sb.append(this.f544a);
            }
        } else {
            z2 = z;
        }
        if (k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            sb.append(this.f552g == null ? "null" : this.f552g);
        }
        sb.append(")");
        return sb.toString();
    }
}

package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jq implements jv<jq, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82384a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f814a = new kl("XmPushActionUnRegistration");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82385b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82386c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82387d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82388e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82389f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 11, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 11, 10);
    private static final kd k = new kd("", (byte) 2, 11);
    private static final kd l = new kd("", (byte) 10, 12);

    /* renamed from: a  reason: collision with other field name */
    public long f815a;

    /* renamed from: a  reason: collision with other field name */
    public iz f816a;

    /* renamed from: a  reason: collision with other field name */
    public String f817a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f818a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f819a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f820b;

    /* renamed from: c  reason: collision with other field name */
    public String f821c;

    /* renamed from: d  reason: collision with other field name */
    public String f822d;

    /* renamed from: e  reason: collision with other field name */
    public String f823e;

    /* renamed from: f  reason: collision with other field name */
    public String f824f;

    /* renamed from: g  reason: collision with other field name */
    public String f825g;

    /* renamed from: h  reason: collision with other field name */
    public String f826h;

    /* renamed from: i  reason: collision with other field name */
    public String f827i;

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01eb, code lost:
        if (r5 == 0) goto L_0x01ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jq r5) {
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
            goto L_0x01ef
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f817a
            java.lang.String r1 = r5.f817a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f816a
            com.xiaomi.push.iz r1 = r5.f816a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f820b
            java.lang.String r1 = r5.f820b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f821c
            java.lang.String r1 = r5.f821c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r4.f822d
            java.lang.String r1 = r5.f822d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f823e
            java.lang.String r1 = r5.f823e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f824f
            java.lang.String r1 = r5.f824f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r4.f825g
            java.lang.String r1 = r5.f825g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f826h
            java.lang.String r1 = r5.f826h
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r4.f827i
            java.lang.String r1 = r5.f827i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            boolean r0 = r4.f819a
            boolean r1 = r5.f819a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x01c7:
            boolean r0 = r4.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r4.l()
            if (r0 == 0) goto L_0x01ed
            long r0 = r4.f815a
            long r2 = r5.f815a
            int r5 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r5 != 0) goto L_0x0022
        L_0x01ed:
            r5 = 0
            r0 = 0
        L_0x01ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jq.compareTo(com.xiaomi.push.jq):int");
    }

    public jq a(String str) {
        this.f820b = str;
        return this;
    }

    public void a() {
        if (this.f820b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f821c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r5) {
        /*
            r4 = this;
            r5.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r5.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0012
            r5.f()
            r4.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 1
            r3 = 11
            switch(r1) {
                case 1: goto L_0x00ae;
                case 2: goto L_0x009b;
                case 3: goto L_0x0090;
                case 4: goto L_0x0085;
                case 5: goto L_0x007a;
                case 6: goto L_0x006f;
                case 7: goto L_0x0064;
                case 8: goto L_0x0059;
                case 9: goto L_0x004e;
                case 10: goto L_0x0042;
                case 11: goto L_0x0032;
                case 12: goto L_0x0021;
                default: goto L_0x001a;
            }
        L_0x001a:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x00b8
        L_0x0021:
            byte r1 = r0.f82422a
            r3 = 10
            if (r1 != r3) goto L_0x001a
            long r0 = r5.a()
            r4.f815a = r0
            r4.b((boolean) r2)
            goto L_0x00b8
        L_0x0032:
            byte r1 = r0.f82422a
            r3 = 2
            if (r1 != r3) goto L_0x001a
            boolean r0 = r5.a()
            r4.f819a = r0
            r4.a((boolean) r2)
            goto L_0x00b8
        L_0x0042:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f827i = r0
            goto L_0x00b8
        L_0x004e:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f826h = r0
            goto L_0x00b8
        L_0x0059:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f825g = r0
            goto L_0x00b8
        L_0x0064:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f824f = r0
            goto L_0x00b8
        L_0x006f:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f823e = r0
            goto L_0x00b8
        L_0x007a:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f822d = r0
            goto L_0x00b8
        L_0x0085:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f821c = r0
            goto L_0x00b8
        L_0x0090:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f820b = r0
            goto L_0x00b8
        L_0x009b:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x001a
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r4.f816a = r0
            com.xiaomi.push.iz r0 = r4.f816a
            r0.a((com.xiaomi.push.kg) r5)
            goto L_0x00b8
        L_0x00ae:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001a
            java.lang.String r0 = r5.a()
            r4.f817a = r0
        L_0x00b8:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jq.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f818a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m515a() {
        return this.f817a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m516a(jq jqVar) {
        if (jqVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jqVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f817a.equals(jqVar.f817a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jqVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f816a.compareTo(jqVar.f816a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jqVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f820b.equals(jqVar.f820b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jqVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f821c.equals(jqVar.f821c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jqVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f822d.equals(jqVar.f822d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jqVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f823e.equals(jqVar.f823e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jqVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f824f.equals(jqVar.f824f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jqVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f825g.equals(jqVar.f825g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jqVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f826h.equals(jqVar.f826h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jqVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f827i.equals(jqVar.f827i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jqVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f819a != jqVar.f819a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jqVar.l();
        return (!l2 && !l3) || (l2 && l3 && this.f815a == jqVar.f815a);
    }

    public jq b(String str) {
        this.f821c = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f814a);
        if (this.f817a != null && a()) {
            kgVar.a(f82384a);
            kgVar.a(this.f817a);
            kgVar.b();
        }
        if (this.f816a != null && b()) {
            kgVar.a(f82385b);
            this.f816a.b(kgVar);
            kgVar.b();
        }
        if (this.f820b != null) {
            kgVar.a(f82386c);
            kgVar.a(this.f820b);
            kgVar.b();
        }
        if (this.f821c != null) {
            kgVar.a(f82387d);
            kgVar.a(this.f821c);
            kgVar.b();
        }
        if (this.f822d != null && e()) {
            kgVar.a(f82388e);
            kgVar.a(this.f822d);
            kgVar.b();
        }
        if (this.f823e != null && f()) {
            kgVar.a(f82389f);
            kgVar.a(this.f823e);
            kgVar.b();
        }
        if (this.f824f != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f824f);
            kgVar.b();
        }
        if (this.f825g != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f825g);
            kgVar.b();
        }
        if (this.f826h != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f826h);
            kgVar.b();
        }
        if (this.f827i != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f827i);
            kgVar.b();
        }
        if (k()) {
            kgVar.a(k);
            kgVar.a(this.f819a);
            kgVar.b();
        }
        if (l()) {
            kgVar.a(l);
            kgVar.a(this.f815a);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f818a.set(1, z);
    }

    public boolean b() {
        return this.f816a != null;
    }

    public jq c(String str) {
        this.f822d = str;
        return this;
    }

    public boolean c() {
        return this.f820b != null;
    }

    public jq d(String str) {
        this.f824f = str;
        return this;
    }

    public boolean d() {
        return this.f821c != null;
    }

    public jq e(String str) {
        this.f825g = str;
        return this;
    }

    public boolean e() {
        return this.f822d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jq)) {
            return compareTo((jq) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f823e != null;
    }

    public boolean g() {
        return this.f824f != null;
    }

    public boolean h() {
        return this.f825g != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f826h != null;
    }

    public boolean j() {
        return this.f827i != null;
    }

    public boolean k() {
        return this.f818a.get(0);
    }

    public boolean l() {
        return this.f818a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistration(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f817a == null ? "null" : this.f817a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f816a == null) {
                sb.append("null");
            } else {
                sb.append(this.f816a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f820b == null ? "null" : this.f820b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f821c == null ? "null" : this.f821c);
        if (e()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f822d == null ? "null" : this.f822d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.f823e == null ? "null" : this.f823e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f824f == null ? "null" : this.f824f);
        }
        if (h()) {
            sb.append(", ");
            sb.append("token:");
            sb.append(this.f825g == null ? "null" : this.f825g);
        }
        if (i()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.f826h == null ? "null" : this.f826h);
        }
        if (j()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f827i == null ? "null" : this.f827i);
        }
        if (k()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f819a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f815a);
        }
        sb.append(")");
        return sb.toString();
    }
}

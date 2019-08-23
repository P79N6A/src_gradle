package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jr implements jv<jr, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82390a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f828a = new kl("XmPushActionUnRegistrationResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82391b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82392c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82393d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82394e = new kd("", (byte) 10, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82395f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 8);
    private static final kd h = new kd("", (byte) 10, 9);
    private static final kd i = new kd("", (byte) 10, 10);

    /* renamed from: a  reason: collision with other field name */
    public long f829a;

    /* renamed from: a  reason: collision with other field name */
    public iz f830a;

    /* renamed from: a  reason: collision with other field name */
    public String f831a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f832a = new BitSet(3);

    /* renamed from: b  reason: collision with other field name */
    public long f833b;

    /* renamed from: b  reason: collision with other field name */
    public String f834b;

    /* renamed from: c  reason: collision with other field name */
    public long f835c;

    /* renamed from: c  reason: collision with other field name */
    public String f836c;

    /* renamed from: d  reason: collision with other field name */
    public String f837d;

    /* renamed from: e  reason: collision with other field name */
    public String f838e;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        if (r5 == 0) goto L_0x017b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jr r5) {
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
            goto L_0x017d
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f831a
            java.lang.String r1 = r5.f831a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x017d
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f830a
            com.xiaomi.push.iz r1 = r5.f830a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x017d
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f834b
            java.lang.String r1 = r5.f834b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x017d
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f836c
            java.lang.String r1 = r5.f836c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x017d
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f829a
            long r2 = r5.f829a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x017d
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f837d
            java.lang.String r1 = r5.f837d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x017d
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f838e
            java.lang.String r1 = r5.f838e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x017d
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            long r0 = r4.f833b
            long r2 = r5.f833b
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x017d
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x017d
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            long r0 = r4.f835c
            long r2 = r5.f835c
            int r5 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r5 != 0) goto L_0x0022
        L_0x017b:
            r5 = 0
            r0 = 0
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jr.compareTo(com.xiaomi.push.jr):int");
    }

    public String a() {
        return this.f838e;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m517a() {
        if (this.f834b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f836c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r6) {
        /*
            r5 = this;
            r6.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r6.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0030
            r6.f()
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x0018
            r5.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r6 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0030:
            short r1 = r0.f871a
            r2 = 1
            r3 = 10
            r4 = 11
            switch(r1) {
                case 1: goto L_0x00aa;
                case 2: goto L_0x0097;
                case 3: goto L_0x008c;
                case 4: goto L_0x0081;
                case 5: goto L_0x003a;
                case 6: goto L_0x0073;
                case 7: goto L_0x0068;
                case 8: goto L_0x005d;
                case 9: goto L_0x004f;
                case 10: goto L_0x0041;
                default: goto L_0x003a;
            }
        L_0x003a:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x00b4
        L_0x0041:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003a
            long r0 = r6.a()
            r5.f835c = r0
            r5.c(r2)
            goto L_0x00b4
        L_0x004f:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003a
            long r0 = r6.a()
            r5.f833b = r0
            r5.b((boolean) r2)
            goto L_0x00b4
        L_0x005d:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003a
            java.lang.String r0 = r6.a()
            r5.f838e = r0
            goto L_0x00b4
        L_0x0068:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003a
            java.lang.String r0 = r6.a()
            r5.f837d = r0
            goto L_0x00b4
        L_0x0073:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003a
            long r0 = r6.a()
            r5.f829a = r0
            r5.a((boolean) r2)
            goto L_0x00b4
        L_0x0081:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003a
            java.lang.String r0 = r6.a()
            r5.f836c = r0
            goto L_0x00b4
        L_0x008c:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003a
            java.lang.String r0 = r6.a()
            r5.f834b = r0
            goto L_0x00b4
        L_0x0097:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x003a
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r5.f830a = r0
            com.xiaomi.push.iz r0 = r5.f830a
            r0.a((com.xiaomi.push.kg) r6)
            goto L_0x00b4
        L_0x00aa:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003a
            java.lang.String r0 = r6.a()
            r5.f831a = r0
        L_0x00b4:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jr.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f832a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m518a() {
        return this.f831a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m519a(jr jrVar) {
        if (jrVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jrVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f831a.equals(jrVar.f831a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jrVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f830a.compareTo(jrVar.f830a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jrVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f834b.equals(jrVar.f834b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jrVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f836c.equals(jrVar.f836c))) || this.f829a != jrVar.f829a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jrVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f837d.equals(jrVar.f837d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jrVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f838e.equals(jrVar.f838e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jrVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f833b != jrVar.f833b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jrVar.i();
        return (!i2 && !i3) || (i2 && i3 && this.f835c == jrVar.f835c);
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f828a);
        if (this.f831a != null && a()) {
            kgVar.a(f82390a);
            kgVar.a(this.f831a);
            kgVar.b();
        }
        if (this.f830a != null && b()) {
            kgVar.a(f82391b);
            this.f830a.b(kgVar);
            kgVar.b();
        }
        if (this.f834b != null) {
            kgVar.a(f82392c);
            kgVar.a(this.f834b);
            kgVar.b();
        }
        if (this.f836c != null) {
            kgVar.a(f82393d);
            kgVar.a(this.f836c);
            kgVar.b();
        }
        kgVar.a(f82394e);
        kgVar.a(this.f829a);
        kgVar.b();
        if (this.f837d != null && f()) {
            kgVar.a(f82395f);
            kgVar.a(this.f837d);
            kgVar.b();
        }
        if (this.f838e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f838e);
            kgVar.b();
        }
        if (h()) {
            kgVar.a(h);
            kgVar.a(this.f833b);
            kgVar.b();
        }
        if (i()) {
            kgVar.a(i);
            kgVar.a(this.f835c);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f832a.set(1, z);
    }

    public boolean b() {
        return this.f830a != null;
    }

    public void c(boolean z) {
        this.f832a.set(2, z);
    }

    public boolean c() {
        return this.f834b != null;
    }

    public boolean d() {
        return this.f836c != null;
    }

    public boolean e() {
        return this.f832a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jr)) {
            return compareTo((jr) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f837d != null;
    }

    public boolean g() {
        return this.f838e != null;
    }

    public boolean h() {
        return this.f832a.get(1);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f832a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnRegistrationResult(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f831a == null ? "null" : this.f831a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f830a == null) {
                sb.append("null");
            } else {
                sb.append(this.f830a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f834b == null ? "null" : this.f834b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f836c == null ? "null" : this.f836c);
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f829a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f837d == null ? "null" : this.f837d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f838e == null ? "null" : this.f838e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("unRegisteredAt:");
            sb.append(this.f833b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f835c);
        }
        sb.append(")");
        return sb.toString();
    }
}

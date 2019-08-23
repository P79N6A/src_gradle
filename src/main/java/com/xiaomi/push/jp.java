package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jp implements jv<jp, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82378a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f803a = new kl("XmPushActionSubscriptionResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82379b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82380c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82381d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82382e = new kd("", (byte) 10, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82383f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 8);
    private static final kd h = new kd("", (byte) 11, 9);
    private static final kd i = new kd("", (byte) 11, 10);

    /* renamed from: a  reason: collision with other field name */
    public long f804a;

    /* renamed from: a  reason: collision with other field name */
    public iz f805a;

    /* renamed from: a  reason: collision with other field name */
    public String f806a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f807a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f808b;

    /* renamed from: c  reason: collision with other field name */
    public String f809c;

    /* renamed from: d  reason: collision with other field name */
    public String f810d;

    /* renamed from: e  reason: collision with other field name */
    public String f811e;

    /* renamed from: f  reason: collision with other field name */
    public String f812f;

    /* renamed from: g  reason: collision with other field name */
    public String f813g;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        if (r5 == 0) goto L_0x017b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jp r5) {
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
            java.lang.String r0 = r4.f806a
            java.lang.String r1 = r5.f806a
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
            com.xiaomi.push.iz r0 = r4.f805a
            com.xiaomi.push.iz r1 = r5.f805a
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
            java.lang.String r0 = r4.f808b
            java.lang.String r1 = r5.f808b
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
            java.lang.String r0 = r4.f809c
            java.lang.String r1 = r5.f809c
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
            long r0 = r4.f804a
            long r2 = r5.f804a
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
            java.lang.String r0 = r4.f810d
            java.lang.String r1 = r5.f810d
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
            java.lang.String r0 = r4.f811e
            java.lang.String r1 = r5.f811e
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
            java.lang.String r0 = r4.f812f
            java.lang.String r1 = r5.f812f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r4.f813g
            java.lang.String r5 = r5.f813g
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x017b:
            r5 = 0
            r0 = 0
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jp.compareTo(com.xiaomi.push.jp):int");
    }

    public String a() {
        return this.f811e;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m511a() {
        if (this.f808b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r4) {
        /*
            r3 = this;
            r4.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r4.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0012
            r4.f()
            r3.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 11
            switch(r1) {
                case 1: goto L_0x0086;
                case 2: goto L_0x0073;
                case 3: goto L_0x0068;
                case 4: goto L_0x005d;
                case 5: goto L_0x0019;
                case 6: goto L_0x004c;
                case 7: goto L_0x0041;
                case 8: goto L_0x0036;
                case 9: goto L_0x002b;
                case 10: goto L_0x0020;
                default: goto L_0x0019;
            }
        L_0x0019:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r4, r0)
            goto L_0x0090
        L_0x0020:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f813g = r0
            goto L_0x0090
        L_0x002b:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f812f = r0
            goto L_0x0090
        L_0x0036:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f811e = r0
            goto L_0x0090
        L_0x0041:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f810d = r0
            goto L_0x0090
        L_0x004c:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0019
            long r0 = r4.a()
            r3.f804a = r0
            r0 = 1
            r3.a((boolean) r0)
            goto L_0x0090
        L_0x005d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f809c = r0
            goto L_0x0090
        L_0x0068:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f808b = r0
            goto L_0x0090
        L_0x0073:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r3.f805a = r0
            com.xiaomi.push.iz r0 = r3.f805a
            r0.a((com.xiaomi.push.kg) r4)
            goto L_0x0090
        L_0x0086:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f806a = r0
        L_0x0090:
            r4.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jp.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f807a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m512a() {
        return this.f806a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m513a(jp jpVar) {
        if (jpVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jpVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f806a.equals(jpVar.f806a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jpVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f805a.compareTo(jpVar.f805a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jpVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f808b.equals(jpVar.f808b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jpVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f809c.equals(jpVar.f809c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jpVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f804a != jpVar.f804a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jpVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f810d.equals(jpVar.f810d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jpVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f811e.equals(jpVar.f811e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jpVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f812f.equals(jpVar.f812f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jpVar.i();
        return (!i2 && !i3) || (i2 && i3 && this.f813g.equals(jpVar.f813g));
    }

    public String b() {
        return this.f813g;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f803a);
        if (this.f806a != null && a()) {
            kgVar.a(f82378a);
            kgVar.a(this.f806a);
            kgVar.b();
        }
        if (this.f805a != null && b()) {
            kgVar.a(f82379b);
            this.f805a.b(kgVar);
            kgVar.b();
        }
        if (this.f808b != null) {
            kgVar.a(f82380c);
            kgVar.a(this.f808b);
            kgVar.b();
        }
        if (this.f809c != null && d()) {
            kgVar.a(f82381d);
            kgVar.a(this.f809c);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82382e);
            kgVar.a(this.f804a);
            kgVar.b();
        }
        if (this.f810d != null && f()) {
            kgVar.a(f82383f);
            kgVar.a(this.f810d);
            kgVar.b();
        }
        if (this.f811e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f811e);
            kgVar.b();
        }
        if (this.f812f != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f812f);
            kgVar.b();
        }
        if (this.f813g != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f813g);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m514b() {
        return this.f805a != null;
    }

    public boolean c() {
        return this.f808b != null;
    }

    public boolean d() {
        return this.f809c != null;
    }

    public boolean e() {
        return this.f807a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jp)) {
            return compareTo((jp) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f810d != null;
    }

    public boolean g() {
        return this.f811e != null;
    }

    public boolean h() {
        return this.f812f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f813g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscriptionResult(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f806a == null ? "null" : this.f806a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f805a == null) {
                sb.append("null");
            } else {
                sb.append(this.f805a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f808b == null ? "null" : this.f808b);
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.f809c == null ? "null" : this.f809c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f804a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f810d == null ? "null" : this.f810d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f811e == null ? "null" : this.f811e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f812f == null ? "null" : this.f812f);
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f813g == null ? "null" : this.f813g);
        }
        sb.append(")");
        return sb.toString();
    }
}

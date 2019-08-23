package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jt implements jv<jt, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82402a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f848a = new kl("XmPushActionUnSubscriptionResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82403b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82404c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82405d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82406e = new kd("", (byte) 10, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82407f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 8);
    private static final kd h = new kd("", (byte) 11, 9);
    private static final kd i = new kd("", (byte) 11, 10);

    /* renamed from: a  reason: collision with other field name */
    public long f849a;

    /* renamed from: a  reason: collision with other field name */
    public iz f850a;

    /* renamed from: a  reason: collision with other field name */
    public String f851a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f852a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f853b;

    /* renamed from: c  reason: collision with other field name */
    public String f854c;

    /* renamed from: d  reason: collision with other field name */
    public String f855d;

    /* renamed from: e  reason: collision with other field name */
    public String f856e;

    /* renamed from: f  reason: collision with other field name */
    public String f857f;

    /* renamed from: g  reason: collision with other field name */
    public String f858g;

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0179, code lost:
        if (r5 == 0) goto L_0x017b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jt r5) {
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
            java.lang.String r0 = r4.f851a
            java.lang.String r1 = r5.f851a
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
            com.xiaomi.push.iz r0 = r4.f850a
            com.xiaomi.push.iz r1 = r5.f850a
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
            java.lang.String r0 = r4.f853b
            java.lang.String r1 = r5.f853b
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
            java.lang.String r0 = r4.f854c
            java.lang.String r1 = r5.f854c
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
            long r0 = r4.f849a
            long r2 = r5.f849a
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
            java.lang.String r0 = r4.f855d
            java.lang.String r1 = r5.f855d
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
            java.lang.String r0 = r4.f856e
            java.lang.String r1 = r5.f856e
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
            java.lang.String r0 = r4.f857f
            java.lang.String r1 = r5.f857f
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
            java.lang.String r0 = r4.f858g
            java.lang.String r5 = r5.f858g
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x017b:
            r5 = 0
            r0 = 0
        L_0x017d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jt.compareTo(com.xiaomi.push.jt):int");
    }

    public String a() {
        return this.f856e;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m522a() {
        if (this.f853b == null) {
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
            r3.f858g = r0
            goto L_0x0090
        L_0x002b:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f857f = r0
            goto L_0x0090
        L_0x0036:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f856e = r0
            goto L_0x0090
        L_0x0041:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f855d = r0
            goto L_0x0090
        L_0x004c:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0019
            long r0 = r4.a()
            r3.f849a = r0
            r0 = 1
            r3.a((boolean) r0)
            goto L_0x0090
        L_0x005d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f854c = r0
            goto L_0x0090
        L_0x0068:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f853b = r0
            goto L_0x0090
        L_0x0073:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r3.f850a = r0
            com.xiaomi.push.iz r0 = r3.f850a
            r0.a((com.xiaomi.push.kg) r4)
            goto L_0x0090
        L_0x0086:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r4.a()
            r3.f851a = r0
        L_0x0090:
            r4.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jt.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f852a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m523a() {
        return this.f851a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m524a(jt jtVar) {
        if (jtVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jtVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f851a.equals(jtVar.f851a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jtVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f850a.compareTo(jtVar.f850a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jtVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f853b.equals(jtVar.f853b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jtVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f854c.equals(jtVar.f854c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jtVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f849a != jtVar.f849a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jtVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f855d.equals(jtVar.f855d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jtVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f856e.equals(jtVar.f856e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jtVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f857f.equals(jtVar.f857f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jtVar.i();
        return (!i2 && !i3) || (i2 && i3 && this.f858g.equals(jtVar.f858g));
    }

    public String b() {
        return this.f858g;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f848a);
        if (this.f851a != null && a()) {
            kgVar.a(f82402a);
            kgVar.a(this.f851a);
            kgVar.b();
        }
        if (this.f850a != null && b()) {
            kgVar.a(f82403b);
            this.f850a.b(kgVar);
            kgVar.b();
        }
        if (this.f853b != null) {
            kgVar.a(f82404c);
            kgVar.a(this.f853b);
            kgVar.b();
        }
        if (this.f854c != null && d()) {
            kgVar.a(f82405d);
            kgVar.a(this.f854c);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82406e);
            kgVar.a(this.f849a);
            kgVar.b();
        }
        if (this.f855d != null && f()) {
            kgVar.a(f82407f);
            kgVar.a(this.f855d);
            kgVar.b();
        }
        if (this.f856e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f856e);
            kgVar.b();
        }
        if (this.f857f != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f857f);
            kgVar.b();
        }
        if (this.f858g != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f858g);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m525b() {
        return this.f850a != null;
    }

    public boolean c() {
        return this.f853b != null;
    }

    public boolean d() {
        return this.f854c != null;
    }

    public boolean e() {
        return this.f852a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jt)) {
            return compareTo((jt) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f855d != null;
    }

    public boolean g() {
        return this.f856e != null;
    }

    public boolean h() {
        return this.f857f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f858g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscriptionResult(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f851a == null ? "null" : this.f851a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f850a == null) {
                sb.append("null");
            } else {
                sb.append(this.f850a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f853b == null ? "null" : this.f853b);
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.f854c == null ? "null" : this.f854c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f849a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f855d == null ? "null" : this.f855d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f856e == null ? "null" : this.f856e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f857f == null ? "null" : this.f857f);
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f858g == null ? "null" : this.f858g);
        }
        sb.append(")");
        return sb.toString();
    }
}

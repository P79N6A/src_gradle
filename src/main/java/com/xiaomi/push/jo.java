package com.xiaomi.push;

import java.io.Serializable;
import java.util.List;

public class jo implements jv<jo, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82372a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f794a = new kl("XmPushActionSubscription");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82373b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82374c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82375d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82376e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82377f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 15, 8);

    /* renamed from: a  reason: collision with other field name */
    public iz f795a;

    /* renamed from: a  reason: collision with other field name */
    public String f796a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f797a;

    /* renamed from: b  reason: collision with other field name */
    public String f798b;

    /* renamed from: c  reason: collision with other field name */
    public String f799c;

    /* renamed from: d  reason: collision with other field name */
    public String f800d;

    /* renamed from: e  reason: collision with other field name */
    public String f801e;

    /* renamed from: f  reason: collision with other field name */
    public String f802f;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (r3 == 0) goto L_0x0155;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jo r3) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0025
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            int r3 = r0.compareTo(r3)
        L_0x0022:
            r0 = r3
            goto L_0x0157
        L_0x0025:
            boolean r0 = r2.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r2.f796a
            java.lang.String r1 = r3.f796a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x004b:
            boolean r0 = r2.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r2.f795a
            com.xiaomi.push.iz r1 = r3.f795a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0071:
            boolean r0 = r2.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r2.f798b
            java.lang.String r1 = r3.f798b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0097:
            boolean r0 = r2.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r2.f799c
            java.lang.String r1 = r3.f799c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x00bd:
            boolean r0 = r2.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r2.f800d
            java.lang.String r1 = r3.f800d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x00e3:
            boolean r0 = r2.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r2.f801e
            java.lang.String r1 = r3.f801e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0109:
            boolean r0 = r2.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r2.f802f
            java.lang.String r1 = r3.f802f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x012f:
            boolean r0 = r2.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0155
            java.util.List<java.lang.String> r0 = r2.f797a
            java.util.List<java.lang.String> r3 = r3.f797a
            int r3 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r3)
            if (r3 != 0) goto L_0x0022
        L_0x0155:
            r3 = 0
            r0 = 0
        L_0x0157:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jo.compareTo(com.xiaomi.push.jo):int");
    }

    public jo a(String str) {
        this.f798b = str;
        return this;
    }

    public void a() {
        if (this.f798b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f799c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f800d == null) {
            throw new kh("Required field 'topic' was not present! Struct: " + toString());
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
            r2 = 11
            switch(r1) {
                case 1: goto L_0x0092;
                case 2: goto L_0x007f;
                case 3: goto L_0x0074;
                case 4: goto L_0x0069;
                case 5: goto L_0x005e;
                case 6: goto L_0x0053;
                case 7: goto L_0x0048;
                case 8: goto L_0x0020;
                default: goto L_0x0019;
            }
        L_0x0019:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x009c
        L_0x0020:
            byte r1 = r0.f82422a
            r2 = 15
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.ke r0 = r5.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f872a
            r1.<init>(r2)
            r4.f797a = r1
            r1 = 0
        L_0x0034:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x0044
            java.lang.String r2 = r5.a()
            java.util.List<java.lang.String> r3 = r4.f797a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0034
        L_0x0044:
            r5.i()
            goto L_0x009c
        L_0x0048:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f802f = r0
            goto L_0x009c
        L_0x0053:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f801e = r0
            goto L_0x009c
        L_0x005e:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f800d = r0
            goto L_0x009c
        L_0x0069:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f799c = r0
            goto L_0x009c
        L_0x0074:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f798b = r0
            goto L_0x009c
        L_0x007f:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r4.f795a = r0
            com.xiaomi.push.iz r0 = r4.f795a
            r0.a((com.xiaomi.push.kg) r5)
            goto L_0x009c
        L_0x0092:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f796a = r0
        L_0x009c:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jo.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m509a() {
        return this.f796a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m510a(jo joVar) {
        if (joVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = joVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f796a.equals(joVar.f796a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = joVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f795a.compareTo(joVar.f795a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = joVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f798b.equals(joVar.f798b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = joVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f799c.equals(joVar.f799c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = joVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f800d.equals(joVar.f800d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = joVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f801e.equals(joVar.f801e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = joVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f802f.equals(joVar.f802f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = joVar.h();
        return (!h2 && !h3) || (h2 && h3 && this.f797a.equals(joVar.f797a));
    }

    public jo b(String str) {
        this.f799c = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f794a);
        if (this.f796a != null && a()) {
            kgVar.a(f82372a);
            kgVar.a(this.f796a);
            kgVar.b();
        }
        if (this.f795a != null && b()) {
            kgVar.a(f82373b);
            this.f795a.b(kgVar);
            kgVar.b();
        }
        if (this.f798b != null) {
            kgVar.a(f82374c);
            kgVar.a(this.f798b);
            kgVar.b();
        }
        if (this.f799c != null) {
            kgVar.a(f82375d);
            kgVar.a(this.f799c);
            kgVar.b();
        }
        if (this.f800d != null) {
            kgVar.a(f82376e);
            kgVar.a(this.f800d);
            kgVar.b();
        }
        if (this.f801e != null && f()) {
            kgVar.a(f82377f);
            kgVar.a(this.f801e);
            kgVar.b();
        }
        if (this.f802f != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f802f);
            kgVar.b();
        }
        if (this.f797a != null && h()) {
            kgVar.a(h);
            kgVar.a(new ke((byte) 11, this.f797a.size()));
            for (String a2 : this.f797a) {
                kgVar.a(a2);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f795a != null;
    }

    public jo c(String str) {
        this.f800d = str;
        return this;
    }

    public boolean c() {
        return this.f798b != null;
    }

    public jo d(String str) {
        this.f801e = str;
        return this;
    }

    public boolean d() {
        return this.f799c != null;
    }

    public jo e(String str) {
        this.f802f = str;
        return this;
    }

    public boolean e() {
        return this.f800d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jo)) {
            return compareTo((jo) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f801e != null;
    }

    public boolean g() {
        return this.f802f != null;
    }

    public boolean h() {
        return this.f797a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSubscription(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f796a == null ? "null" : this.f796a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f795a == null) {
                sb.append("null");
            } else {
                sb.append(this.f795a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f798b == null ? "null" : this.f798b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f799c == null ? "null" : this.f799c);
        sb.append(", ");
        sb.append("topic:");
        sb.append(this.f800d == null ? "null" : this.f800d);
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f801e == null ? "null" : this.f801e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f802f == null ? "null" : this.f802f);
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            if (this.f797a == null) {
                sb.append("null");
            } else {
                sb.append(this.f797a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

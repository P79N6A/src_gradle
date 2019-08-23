package com.xiaomi.push;

import java.io.Serializable;
import java.util.List;

public class js implements jv<js, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82396a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f839a = new kl("XmPushActionUnSubscription");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82397b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82398c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82399d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82400e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82401f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 15, 8);

    /* renamed from: a  reason: collision with other field name */
    public iz f840a;

    /* renamed from: a  reason: collision with other field name */
    public String f841a;

    /* renamed from: a  reason: collision with other field name */
    public List<String> f842a;

    /* renamed from: b  reason: collision with other field name */
    public String f843b;

    /* renamed from: c  reason: collision with other field name */
    public String f844c;

    /* renamed from: d  reason: collision with other field name */
    public String f845d;

    /* renamed from: e  reason: collision with other field name */
    public String f846e;

    /* renamed from: f  reason: collision with other field name */
    public String f847f;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (r3 == 0) goto L_0x0155;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.js r3) {
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
            java.lang.String r0 = r2.f841a
            java.lang.String r1 = r3.f841a
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
            com.xiaomi.push.iz r0 = r2.f840a
            com.xiaomi.push.iz r1 = r3.f840a
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
            java.lang.String r0 = r2.f843b
            java.lang.String r1 = r3.f843b
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
            java.lang.String r0 = r2.f844c
            java.lang.String r1 = r3.f844c
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
            java.lang.String r0 = r2.f845d
            java.lang.String r1 = r3.f845d
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
            java.lang.String r0 = r2.f846e
            java.lang.String r1 = r3.f846e
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
            java.lang.String r0 = r2.f847f
            java.lang.String r1 = r3.f847f
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
            java.util.List<java.lang.String> r0 = r2.f842a
            java.util.List<java.lang.String> r3 = r3.f842a
            int r3 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r3)
            if (r3 != 0) goto L_0x0022
        L_0x0155:
            r3 = 0
            r0 = 0
        L_0x0157:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.js.compareTo(com.xiaomi.push.js):int");
    }

    public js a(String str) {
        this.f843b = str;
        return this;
    }

    public void a() {
        if (this.f843b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f844c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f845d == null) {
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
            r4.f842a = r1
            r1 = 0
        L_0x0034:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x0044
            java.lang.String r2 = r5.a()
            java.util.List<java.lang.String> r3 = r4.f842a
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
            r4.f847f = r0
            goto L_0x009c
        L_0x0053:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f846e = r0
            goto L_0x009c
        L_0x005e:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f845d = r0
            goto L_0x009c
        L_0x0069:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f844c = r0
            goto L_0x009c
        L_0x0074:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f843b = r0
            goto L_0x009c
        L_0x007f:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r4.f840a = r0
            com.xiaomi.push.iz r0 = r4.f840a
            r0.a((com.xiaomi.push.kg) r5)
            goto L_0x009c
        L_0x0092:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f841a = r0
        L_0x009c:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.js.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m520a() {
        return this.f841a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m521a(js jsVar) {
        if (jsVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jsVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f841a.equals(jsVar.f841a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jsVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f840a.compareTo(jsVar.f840a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jsVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f843b.equals(jsVar.f843b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jsVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f844c.equals(jsVar.f844c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jsVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f845d.equals(jsVar.f845d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jsVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f846e.equals(jsVar.f846e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jsVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f847f.equals(jsVar.f847f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jsVar.h();
        return (!h2 && !h3) || (h2 && h3 && this.f842a.equals(jsVar.f842a));
    }

    public js b(String str) {
        this.f844c = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f839a);
        if (this.f841a != null && a()) {
            kgVar.a(f82396a);
            kgVar.a(this.f841a);
            kgVar.b();
        }
        if (this.f840a != null && b()) {
            kgVar.a(f82397b);
            this.f840a.b(kgVar);
            kgVar.b();
        }
        if (this.f843b != null) {
            kgVar.a(f82398c);
            kgVar.a(this.f843b);
            kgVar.b();
        }
        if (this.f844c != null) {
            kgVar.a(f82399d);
            kgVar.a(this.f844c);
            kgVar.b();
        }
        if (this.f845d != null) {
            kgVar.a(f82400e);
            kgVar.a(this.f845d);
            kgVar.b();
        }
        if (this.f846e != null && f()) {
            kgVar.a(f82401f);
            kgVar.a(this.f846e);
            kgVar.b();
        }
        if (this.f847f != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f847f);
            kgVar.b();
        }
        if (this.f842a != null && h()) {
            kgVar.a(h);
            kgVar.a(new ke((byte) 11, this.f842a.size()));
            for (String a2 : this.f842a) {
                kgVar.a(a2);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f840a != null;
    }

    public js c(String str) {
        this.f845d = str;
        return this;
    }

    public boolean c() {
        return this.f843b != null;
    }

    public js d(String str) {
        this.f846e = str;
        return this;
    }

    public boolean d() {
        return this.f844c != null;
    }

    public js e(String str) {
        this.f847f = str;
        return this;
    }

    public boolean e() {
        return this.f845d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof js)) {
            return compareTo((js) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f846e != null;
    }

    public boolean g() {
        return this.f847f != null;
    }

    public boolean h() {
        return this.f842a != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionUnSubscription(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f841a == null ? "null" : this.f841a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f840a == null) {
                sb.append("null");
            } else {
                sb.append(this.f840a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f843b == null ? "null" : this.f843b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f844c == null ? "null" : this.f844c);
        sb.append(", ");
        sb.append("topic:");
        sb.append(this.f845d == null ? "null" : this.f845d);
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f846e == null ? "null" : this.f846e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f847f == null ? "null" : this.f847f);
        }
        if (h()) {
            sb.append(", ");
            sb.append("aliases:");
            if (this.f842a == null) {
                sb.append("null");
            } else {
                sb.append(this.f842a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

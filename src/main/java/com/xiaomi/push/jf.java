package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

public class jf implements jv<jf, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82328a = new kd("", (byte) 12, 2);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f678a = new kl("XmPushActionCommandResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82329b = new kd("", (byte) 11, 3);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82330c = new kd("", (byte) 11, 4);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82331d = new kd("", (byte) 11, 5);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82332e = new kd("", (byte) 10, 7);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82333f = new kd("", (byte) 11, 8);
    private static final kd g = new kd("", (byte) 11, 9);
    private static final kd h = new kd("", (byte) 15, 10);
    private static final kd i = new kd("", (byte) 11, 12);
    private static final kd j = new kd("", (byte) 2, 13);

    /* renamed from: a  reason: collision with other field name */
    public long f679a;

    /* renamed from: a  reason: collision with other field name */
    public iz f680a;

    /* renamed from: a  reason: collision with other field name */
    public String f681a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f682a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public List<String> f683a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f684a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f685b;

    /* renamed from: c  reason: collision with other field name */
    public String f686c;

    /* renamed from: d  reason: collision with other field name */
    public String f687d;

    /* renamed from: e  reason: collision with other field name */
    public String f688e;

    /* renamed from: f  reason: collision with other field name */
    public String f689f;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r5 == 0) goto L_0x01a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jf r5) {
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
            goto L_0x01a3
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            com.xiaomi.push.iz r0 = r4.f680a
            com.xiaomi.push.iz r1 = r5.f680a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r4.f681a
            java.lang.String r1 = r5.f681a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f685b
            java.lang.String r1 = r5.f685b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f686c
            java.lang.String r1 = r5.f686c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f679a
            long r2 = r5.f679a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x01a3
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f687d
            java.lang.String r1 = r5.f687d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f688e
            java.lang.String r1 = r5.f688e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.util.List<java.lang.String> r0 = r4.f683a
            java.util.List<java.lang.String> r1 = r5.f683a
            int r0 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f689f
            java.lang.String r1 = r5.f689f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r4.f684a
            boolean r5 = r5.f684a
            int r5 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r5)
            if (r5 != 0) goto L_0x0022
        L_0x01a1:
            r5 = 0
            r0 = 0
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jf.compareTo(com.xiaomi.push.jf):int");
    }

    public String a() {
        return this.f686c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public List<String> m460a() {
        return this.f683a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m461a() {
        if (this.f681a == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f685b == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f686c == null) {
            throw new kh("Required field 'cmdName' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0030
            r5.f()
            boolean r5 = r4.e()
            if (r5 == 0) goto L_0x0018
            r4.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r5 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0030:
            short r1 = r0.f871a
            r2 = 1
            r3 = 11
            switch(r1) {
                case 2: goto L_0x00ca;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00b4;
                case 5: goto L_0x00a9;
                case 6: goto L_0x0038;
                case 7: goto L_0x0099;
                case 8: goto L_0x008e;
                case 9: goto L_0x0083;
                case 10: goto L_0x005b;
                case 11: goto L_0x0038;
                case 12: goto L_0x004f;
                case 13: goto L_0x003f;
                default: goto L_0x0038;
            }
        L_0x0038:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x00dc
        L_0x003f:
            byte r1 = r0.f82422a
            r3 = 2
            if (r1 != r3) goto L_0x0038
            boolean r0 = r5.a()
            r4.f684a = r0
            r4.b((boolean) r2)
            goto L_0x00dc
        L_0x004f:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f689f = r0
            goto L_0x00dc
        L_0x005b:
            byte r1 = r0.f82422a
            r2 = 15
            if (r1 != r2) goto L_0x0038
            com.xiaomi.push.ke r0 = r5.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f872a
            r1.<init>(r2)
            r4.f683a = r1
            r1 = 0
        L_0x006f:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x007f
            java.lang.String r2 = r5.a()
            java.util.List<java.lang.String> r3 = r4.f683a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x006f
        L_0x007f:
            r5.i()
            goto L_0x00dc
        L_0x0083:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f688e = r0
            goto L_0x00dc
        L_0x008e:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f687d = r0
            goto L_0x00dc
        L_0x0099:
            byte r1 = r0.f82422a
            r3 = 10
            if (r1 != r3) goto L_0x0038
            long r0 = r5.a()
            r4.f679a = r0
            r4.a((boolean) r2)
            goto L_0x00dc
        L_0x00a9:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f686c = r0
            goto L_0x00dc
        L_0x00b4:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f685b = r0
            goto L_0x00dc
        L_0x00bf:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0038
            java.lang.String r0 = r5.a()
            r4.f681a = r0
            goto L_0x00dc
        L_0x00ca:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0038
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r4.f680a = r0
            com.xiaomi.push.iz r0 = r4.f680a
            r0.a((com.xiaomi.push.kg) r5)
        L_0x00dc:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jf.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f682a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m462a() {
        return this.f680a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m463a(jf jfVar) {
        if (jfVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jfVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f680a.compareTo(jfVar.f680a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jfVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f681a.equals(jfVar.f681a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jfVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f685b.equals(jfVar.f685b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jfVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f686c.equals(jfVar.f686c))) || this.f679a != jfVar.f679a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jfVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f687d.equals(jfVar.f687d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jfVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f688e.equals(jfVar.f688e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jfVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f683a.equals(jfVar.f683a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jfVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f689f.equals(jfVar.f689f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jfVar.j();
        return (!j2 && !j3) || (j2 && j3 && this.f684a == jfVar.f684a);
    }

    public String b() {
        return this.f689f;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f678a);
        if (this.f680a != null && a()) {
            kgVar.a(f82328a);
            this.f680a.b(kgVar);
            kgVar.b();
        }
        if (this.f681a != null) {
            kgVar.a(f82329b);
            kgVar.a(this.f681a);
            kgVar.b();
        }
        if (this.f685b != null) {
            kgVar.a(f82330c);
            kgVar.a(this.f685b);
            kgVar.b();
        }
        if (this.f686c != null) {
            kgVar.a(f82331d);
            kgVar.a(this.f686c);
            kgVar.b();
        }
        kgVar.a(f82332e);
        kgVar.a(this.f679a);
        kgVar.b();
        if (this.f687d != null && f()) {
            kgVar.a(f82333f);
            kgVar.a(this.f687d);
            kgVar.b();
        }
        if (this.f688e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f688e);
            kgVar.b();
        }
        if (this.f683a != null && h()) {
            kgVar.a(h);
            kgVar.a(new ke((byte) 11, this.f683a.size()));
            for (String a2 : this.f683a) {
                kgVar.a(a2);
            }
            kgVar.e();
            kgVar.b();
        }
        if (this.f689f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f689f);
            kgVar.b();
        }
        if (j()) {
            kgVar.a(j);
            kgVar.a(this.f684a);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f682a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m464b() {
        return this.f681a != null;
    }

    public boolean c() {
        return this.f685b != null;
    }

    public boolean d() {
        return this.f686c != null;
    }

    public boolean e() {
        return this.f682a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jf)) {
            return compareTo((jf) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f687d != null;
    }

    public boolean g() {
        return this.f688e != null;
    }

    public boolean h() {
        return this.f683a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f689f != null;
    }

    public boolean j() {
        return this.f682a.get(1);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (a()) {
            sb.append("target:");
            if (this.f680a == null) {
                sb.append("null");
            } else {
                sb.append(this.f680a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f681a == null ? "null" : this.f681a);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f685b == null ? "null" : this.f685b);
        sb.append(", ");
        sb.append("cmdName:");
        sb.append(this.f686c == null ? "null" : this.f686c);
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f679a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f687d == null ? "null" : this.f687d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f688e == null ? "null" : this.f688e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            if (this.f683a == null) {
                sb.append("null");
            } else {
                sb.append(this.f683a);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f689f == null ? "null" : this.f689f);
        }
        if (j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f684a);
        }
        sb.append(")");
        return sb.toString();
    }
}

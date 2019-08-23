package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

public class jb implements jv<jb, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82313a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f648a = new kl("XmPushActionAckNotification");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82314b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82315c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82316d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82317e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82318f = new kd("", (byte) 10, 7);
    private static final kd g = new kd("", (byte) 11, 8);
    private static final kd h = new kd("", (byte) 13, 9);
    private static final kd i = new kd("", (byte) 11, 10);
    private static final kd j = new kd("", (byte) 11, 11);

    /* renamed from: a  reason: collision with other field name */
    public long f649a = 0;

    /* renamed from: a  reason: collision with other field name */
    public iz f650a;

    /* renamed from: a  reason: collision with other field name */
    public String f651a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f652a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f653a;

    /* renamed from: b  reason: collision with other field name */
    public String f654b;

    /* renamed from: c  reason: collision with other field name */
    public String f655c;

    /* renamed from: d  reason: collision with other field name */
    public String f656d;

    /* renamed from: e  reason: collision with other field name */
    public String f657e;

    /* renamed from: f  reason: collision with other field name */
    public String f658f;

    /* renamed from: g  reason: collision with other field name */
    public String f659g;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r5 == 0) goto L_0x01a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jb r5) {
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
            java.lang.String r0 = r4.f651a
            java.lang.String r1 = r5.f651a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            com.xiaomi.push.iz r0 = r4.f650a
            com.xiaomi.push.iz r1 = r5.f650a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
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
            java.lang.String r0 = r4.f654b
            java.lang.String r1 = r5.f654b
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
            java.lang.String r0 = r4.f655c
            java.lang.String r1 = r5.f655c
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
            java.lang.String r0 = r4.f656d
            java.lang.String r1 = r5.f656d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            long r0 = r4.f649a
            long r2 = r5.f649a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
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
            java.lang.String r0 = r4.f657e
            java.lang.String r1 = r5.f657e
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
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f653a
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f653a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
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
            java.lang.String r0 = r4.f658f
            java.lang.String r1 = r5.f658f
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
            java.lang.String r0 = r4.f659g
            java.lang.String r5 = r5.f659g
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x01a1:
            r5 = 0
            r0 = 0
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jb.compareTo(com.xiaomi.push.jb):int");
    }

    public String a() {
        return this.f654b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m448a() {
        return this.f653a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m449a() {
        if (this.f654b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0012
            r6.f()
            r5.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 11
            switch(r1) {
                case 1: goto L_0x00b6;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0098;
                case 4: goto L_0x008d;
                case 5: goto L_0x0082;
                case 6: goto L_0x0019;
                case 7: goto L_0x0071;
                case 8: goto L_0x0066;
                case 9: goto L_0x0038;
                case 10: goto L_0x002c;
                case 11: goto L_0x0020;
                default: goto L_0x0019;
            }
        L_0x0019:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x00c0
        L_0x0020:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f659g = r0
            goto L_0x00c0
        L_0x002c:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f658f = r0
            goto L_0x00c0
        L_0x0038:
            byte r1 = r0.f82422a
            r2 = 13
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.kf r0 = r6.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f873a
            int r2 = r2 * 2
            r1.<init>(r2)
            r5.f653a = r1
            r1 = 0
        L_0x004e:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x0062
            java.lang.String r2 = r6.a()
            java.lang.String r3 = r6.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f653a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0062:
            r6.h()
            goto L_0x00c0
        L_0x0066:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f657e = r0
            goto L_0x00c0
        L_0x0071:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0019
            long r0 = r6.a()
            r5.f649a = r0
            r0 = 1
            r5.a((boolean) r0)
            goto L_0x00c0
        L_0x0082:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f656d = r0
            goto L_0x00c0
        L_0x008d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f655c = r0
            goto L_0x00c0
        L_0x0098:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f654b = r0
            goto L_0x00c0
        L_0x00a3:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r5.f650a = r0
            com.xiaomi.push.iz r0 = r5.f650a
            r0.a((com.xiaomi.push.kg) r6)
            goto L_0x00c0
        L_0x00b6:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r6.a()
            r5.f651a = r0
        L_0x00c0:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jb.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f652a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m450a() {
        return this.f651a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m451a(jb jbVar) {
        if (jbVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jbVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f651a.equals(jbVar.f651a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jbVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f650a.compareTo(jbVar.f650a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jbVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f654b.equals(jbVar.f654b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jbVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f655c.equals(jbVar.f655c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jbVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f656d.equals(jbVar.f656d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jbVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f649a != jbVar.f649a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jbVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f657e.equals(jbVar.f657e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jbVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f653a.equals(jbVar.f653a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jbVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f658f.equals(jbVar.f658f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jbVar.j();
        return (!j2 && !j3) || (j2 && j3 && this.f659g.equals(jbVar.f659g));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f648a);
        if (this.f651a != null && a()) {
            kgVar.a(f82313a);
            kgVar.a(this.f651a);
            kgVar.b();
        }
        if (this.f650a != null && b()) {
            kgVar.a(f82314b);
            this.f650a.b(kgVar);
            kgVar.b();
        }
        if (this.f654b != null) {
            kgVar.a(f82315c);
            kgVar.a(this.f654b);
            kgVar.b();
        }
        if (this.f655c != null && d()) {
            kgVar.a(f82316d);
            kgVar.a(this.f655c);
            kgVar.b();
        }
        if (this.f656d != null && e()) {
            kgVar.a(f82317e);
            kgVar.a(this.f656d);
            kgVar.b();
        }
        if (f()) {
            kgVar.a(f82318f);
            kgVar.a(this.f649a);
            kgVar.b();
        }
        if (this.f657e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f657e);
            kgVar.b();
        }
        if (this.f653a != null && h()) {
            kgVar.a(h);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f653a.size()));
            for (Map.Entry next : this.f653a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (this.f658f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f658f);
            kgVar.b();
        }
        if (this.f659g != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f659g);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f650a != null;
    }

    public boolean c() {
        return this.f654b != null;
    }

    public boolean d() {
        return this.f655c != null;
    }

    public boolean e() {
        return this.f656d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jb)) {
            return compareTo((jb) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f652a.get(0);
    }

    public boolean g() {
        return this.f657e != null;
    }

    public boolean h() {
        return this.f653a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f658f != null;
    }

    public boolean j() {
        return this.f659g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckNotification(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f651a == null ? "null" : this.f651a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f650a == null) {
                sb.append("null");
            } else {
                sb.append(this.f650a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f654b == null ? "null" : this.f654b);
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.f655c == null ? "null" : this.f655c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            sb.append(this.f656d == null ? "null" : this.f656d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("errorCode:");
            sb.append(this.f649a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f657e == null ? "null" : this.f657e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f653a == null) {
                sb.append("null");
            } else {
                sb.append(this.f653a);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f658f == null ? "null" : this.f658f);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f659g == null ? "null" : this.f659g);
        }
        sb.append(")");
        return sb.toString();
    }
}

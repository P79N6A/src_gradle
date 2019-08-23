package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

public class jn implements jv<jn, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82366a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f780a = new kl("XmPushActionSendMessage");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82367b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82368c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82369d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82370e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82371f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 12, 8);
    private static final kd i = new kd("", (byte) 2, 9);
    private static final kd j = new kd("", (byte) 13, 10);
    private static final kd k = new kd("", (byte) 11, 11);
    private static final kd l = new kd("", (byte) 11, 12);

    /* renamed from: a  reason: collision with other field name */
    public iw f781a;

    /* renamed from: a  reason: collision with other field name */
    public iz f782a;

    /* renamed from: a  reason: collision with other field name */
    public String f783a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f784a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f785a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f786a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f787b;

    /* renamed from: c  reason: collision with other field name */
    public String f788c;

    /* renamed from: d  reason: collision with other field name */
    public String f789d;

    /* renamed from: e  reason: collision with other field name */
    public String f790e;

    /* renamed from: f  reason: collision with other field name */
    public String f791f;

    /* renamed from: g  reason: collision with other field name */
    public String f792g;

    /* renamed from: h  reason: collision with other field name */
    public String f793h;

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01eb, code lost:
        if (r3 == 0) goto L_0x01ed;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jn r3) {
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
            goto L_0x01ef
        L_0x0025:
            boolean r0 = r2.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r2.f783a
            java.lang.String r1 = r3.f783a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x004b:
            boolean r0 = r2.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r2.f782a
            com.xiaomi.push.iz r1 = r3.f782a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0071:
            boolean r0 = r2.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r2.f787b
            java.lang.String r1 = r3.f787b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0097:
            boolean r0 = r2.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r2.f788c
            java.lang.String r1 = r3.f788c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x00bd:
            boolean r0 = r2.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r2.f789d
            java.lang.String r1 = r3.f789d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x00e3:
            boolean r0 = r2.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r2.f790e
            java.lang.String r1 = r3.f790e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0109:
            boolean r0 = r2.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r2.f791f
            java.lang.String r1 = r3.f791f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x012f:
            boolean r0 = r2.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0155
            com.xiaomi.push.iw r0 = r2.f781a
            com.xiaomi.push.iw r1 = r3.f781a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x0155:
            boolean r0 = r2.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.i()
            if (r0 == 0) goto L_0x017b
            boolean r0 = r2.f786a
            boolean r1 = r3.f786a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x017b:
            boolean r0 = r2.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.j()
            if (r0 == 0) goto L_0x01a1
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f785a
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f785a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x01a1:
            boolean r0 = r2.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.k()
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r2.f792g
            java.lang.String r1 = r3.f792g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01ef
        L_0x01c7:
            boolean r0 = r2.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01ef
            boolean r0 = r2.l()
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r2.f793h
            java.lang.String r3 = r3.f793h
            int r3 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r3)
            if (r3 != 0) goto L_0x0022
        L_0x01ed:
            r3 = 0
            r0 = 0
        L_0x01ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jn.compareTo(com.xiaomi.push.jn):int");
    }

    public iw a() {
        return this.f781a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m500a() {
        return this.f787b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m501a() {
        if (this.f787b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f788c == null) {
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
            if (r1 != 0) goto L_0x0012
            r6.f()
            r5.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 2
            r3 = 12
            r4 = 11
            switch(r1) {
                case 1: goto L_0x00d2;
                case 2: goto L_0x00c1;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00ab;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0095;
                case 7: goto L_0x008a;
                case 8: goto L_0x0079;
                case 9: goto L_0x006a;
                case 10: goto L_0x003b;
                case 11: goto L_0x002f;
                case 12: goto L_0x0023;
                default: goto L_0x001c;
            }
        L_0x001c:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x00dc
        L_0x0023:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f793h = r0
            goto L_0x00dc
        L_0x002f:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f792g = r0
            goto L_0x00dc
        L_0x003b:
            byte r1 = r0.f82422a
            r3 = 13
            if (r1 != r3) goto L_0x001c
            com.xiaomi.push.kf r0 = r6.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f873a
            int r3 = r3 * 2
            r1.<init>(r3)
            r5.f785a = r1
            r1 = 0
        L_0x0051:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x0065
            java.lang.String r2 = r6.a()
            java.lang.String r3 = r6.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f785a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0051
        L_0x0065:
            r6.h()
            goto L_0x00dc
        L_0x006a:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001c
            boolean r0 = r6.a()
            r5.f786a = r0
            r0 = 1
            r5.a((boolean) r0)
            goto L_0x00dc
        L_0x0079:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001c
            com.xiaomi.push.iw r0 = new com.xiaomi.push.iw
            r0.<init>()
            r5.f781a = r0
            com.xiaomi.push.iw r0 = r5.f781a
            r0.a((com.xiaomi.push.kg) r6)
            goto L_0x00dc
        L_0x008a:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f791f = r0
            goto L_0x00dc
        L_0x0095:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f790e = r0
            goto L_0x00dc
        L_0x00a0:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f789d = r0
            goto L_0x00dc
        L_0x00ab:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f788c = r0
            goto L_0x00dc
        L_0x00b6:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f787b = r0
            goto L_0x00dc
        L_0x00c1:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001c
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r5.f782a = r0
            com.xiaomi.push.iz r0 = r5.f782a
            r0.a((com.xiaomi.push.kg) r6)
            goto L_0x00dc
        L_0x00d2:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001c
            java.lang.String r0 = r6.a()
            r5.f783a = r0
        L_0x00dc:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jn.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f784a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m502a() {
        return this.f783a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m503a(jn jnVar) {
        if (jnVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jnVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f783a.equals(jnVar.f783a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jnVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f782a.compareTo(jnVar.f782a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jnVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f787b.equals(jnVar.f787b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jnVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f788c.equals(jnVar.f788c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jnVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f789d.equals(jnVar.f789d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jnVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f790e.equals(jnVar.f790e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jnVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f791f.equals(jnVar.f791f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jnVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f781a.compareTo(jnVar.f781a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jnVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f786a != jnVar.f786a)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jnVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f785a.equals(jnVar.f785a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jnVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f792g.equals(jnVar.f792g))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jnVar.l();
        return (!l2 && !l3) || (l2 && l3 && this.f793h.equals(jnVar.f793h));
    }

    public String b() {
        return this.f788c;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f780a);
        if (this.f783a != null && a()) {
            kgVar.a(f82366a);
            kgVar.a(this.f783a);
            kgVar.b();
        }
        if (this.f782a != null && b()) {
            kgVar.a(f82367b);
            this.f782a.b(kgVar);
            kgVar.b();
        }
        if (this.f787b != null) {
            kgVar.a(f82368c);
            kgVar.a(this.f787b);
            kgVar.b();
        }
        if (this.f788c != null) {
            kgVar.a(f82369d);
            kgVar.a(this.f788c);
            kgVar.b();
        }
        if (this.f789d != null && e()) {
            kgVar.a(f82370e);
            kgVar.a(this.f789d);
            kgVar.b();
        }
        if (this.f790e != null && f()) {
            kgVar.a(f82371f);
            kgVar.a(this.f790e);
            kgVar.b();
        }
        if (this.f791f != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f791f);
            kgVar.b();
        }
        if (this.f781a != null && h()) {
            kgVar.a(h);
            this.f781a.b(kgVar);
            kgVar.b();
        }
        if (i()) {
            kgVar.a(i);
            kgVar.a(this.f786a);
            kgVar.b();
        }
        if (this.f785a != null && j()) {
            kgVar.a(j);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f785a.size()));
            for (Map.Entry next : this.f785a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (this.f792g != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f792g);
            kgVar.b();
        }
        if (this.f793h != null && l()) {
            kgVar.a(l);
            kgVar.a(this.f793h);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m504b() {
        return this.f782a != null;
    }

    public String c() {
        return this.f790e;
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m505c() {
        return this.f787b != null;
    }

    public String d() {
        return this.f791f;
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m506d() {
        return this.f788c != null;
    }

    public String e() {
        return this.f792g;
    }

    /* renamed from: e  reason: collision with other method in class */
    public boolean m507e() {
        return this.f789d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jn)) {
            return compareTo((jn) obj);
        }
        return false;
    }

    public String f() {
        return this.f793h;
    }

    /* renamed from: f  reason: collision with other method in class */
    public boolean m508f() {
        return this.f790e != null;
    }

    public boolean g() {
        return this.f791f != null;
    }

    public boolean h() {
        return this.f781a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f784a.get(0);
    }

    public boolean j() {
        return this.f785a != null;
    }

    public boolean k() {
        return this.f792g != null;
    }

    public boolean l() {
        return this.f793h != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendMessage(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f783a == null ? "null" : this.f783a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f782a == null) {
                sb.append("null");
            } else {
                sb.append(this.f782a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f787b == null ? "null" : this.f787b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f788c == null ? "null" : this.f788c);
        if (e()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f789d == null ? "null" : this.f789d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f790e == null ? "null" : this.f790e);
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f791f == null ? "null" : this.f791f);
        }
        if (h()) {
            sb.append(", ");
            sb.append("message:");
            if (this.f781a == null) {
                sb.append("null");
            } else {
                sb.append(this.f781a);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("needAck:");
            sb.append(this.f786a);
        }
        if (j()) {
            sb.append(", ");
            sb.append("params:");
            if (this.f785a == null) {
                sb.append("null");
            } else {
                sb.append(this.f785a);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f792g == null ? "null" : this.f792g);
        }
        if (l()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.f793h == null ? "null" : this.f793h);
        }
        sb.append(")");
        return sb.toString();
    }
}

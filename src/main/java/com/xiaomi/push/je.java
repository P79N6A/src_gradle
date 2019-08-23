package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class je implements jv<je, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82322a = new kd("", (byte) 12, 2);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f666a = new kl("XmPushActionCommand");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82323b = new kd("", (byte) 11, 3);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82324c = new kd("", (byte) 11, 4);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82325d = new kd("", (byte) 11, 5);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82326e = new kd("", (byte) 15, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82327f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 9);
    private static final kd h = new kd("", (byte) 2, 10);
    private static final kd i = new kd("", (byte) 2, 11);
    private static final kd j = new kd("", (byte) 10, 12);

    /* renamed from: a  reason: collision with other field name */
    public long f667a;

    /* renamed from: a  reason: collision with other field name */
    public iz f668a;

    /* renamed from: a  reason: collision with other field name */
    public String f669a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f670a = new BitSet(3);

    /* renamed from: a  reason: collision with other field name */
    public List<String> f671a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f672a = false;

    /* renamed from: b  reason: collision with other field name */
    public String f673b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f674b = true;

    /* renamed from: c  reason: collision with other field name */
    public String f675c;

    /* renamed from: d  reason: collision with other field name */
    public String f676d;

    /* renamed from: e  reason: collision with other field name */
    public String f677e;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r5 == 0) goto L_0x01a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.je r5) {
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
            com.xiaomi.push.iz r0 = r4.f668a
            com.xiaomi.push.iz r1 = r5.f668a
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
            java.lang.String r0 = r4.f669a
            java.lang.String r1 = r5.f669a
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
            java.lang.String r0 = r4.f673b
            java.lang.String r1 = r5.f673b
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
            java.lang.String r0 = r4.f675c
            java.lang.String r1 = r5.f675c
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
            java.util.List<java.lang.String> r0 = r4.f671a
            java.util.List<java.lang.String> r1 = r5.f671a
            int r0 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r1)
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
            java.lang.String r0 = r4.f676d
            java.lang.String r1 = r5.f676d
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
            java.lang.String r0 = r4.f677e
            java.lang.String r1 = r5.f677e
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
            boolean r0 = r4.f672a
            boolean r1 = r5.f672a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
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
            boolean r0 = r4.f674b
            boolean r1 = r5.f674b
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
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
            long r0 = r4.f667a
            long r2 = r5.f667a
            int r5 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r5 != 0) goto L_0x0022
        L_0x01a1:
            r5 = 0
            r0 = 0
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.je.compareTo(com.xiaomi.push.je):int");
    }

    public je a(String str) {
        this.f669a = str;
        return this;
    }

    public je a(List<String> list) {
        this.f671a = list;
        return this;
    }

    public String a() {
        return this.f675c;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m456a() {
        if (this.f669a == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f673b == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f675c == null) {
            throw new kh("Required field 'cmdName' was not present! Struct: " + toString());
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
            r3 = 1
            r4 = 11
            switch(r1) {
                case 2: goto L_0x00b0;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009a;
                case 5: goto L_0x008f;
                case 6: goto L_0x0067;
                case 7: goto L_0x005c;
                case 8: goto L_0x001b;
                case 9: goto L_0x0051;
                case 10: goto L_0x0042;
                case 11: goto L_0x0033;
                case 12: goto L_0x0022;
                default: goto L_0x001b;
            }
        L_0x001b:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x00c2
        L_0x0022:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x001b
            long r0 = r6.a()
            r5.f667a = r0
            r5.c((boolean) r3)
            goto L_0x00c2
        L_0x0033:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.a()
            r5.f674b = r0
            r5.b((boolean) r3)
            goto L_0x00c2
        L_0x0042:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.a()
            r5.f672a = r0
            r5.a((boolean) r3)
            goto L_0x00c2
        L_0x0051:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f677e = r0
            goto L_0x00c2
        L_0x005c:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f676d = r0
            goto L_0x00c2
        L_0x0067:
            byte r1 = r0.f82422a
            r2 = 15
            if (r1 != r2) goto L_0x001b
            com.xiaomi.push.ke r0 = r6.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f872a
            r1.<init>(r2)
            r5.f671a = r1
            r1 = 0
        L_0x007b:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x008b
            java.lang.String r2 = r6.a()
            java.util.List<java.lang.String> r3 = r5.f671a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x007b
        L_0x008b:
            r6.i()
            goto L_0x00c2
        L_0x008f:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f675c = r0
            goto L_0x00c2
        L_0x009a:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f673b = r0
            goto L_0x00c2
        L_0x00a5:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f669a = r0
            goto L_0x00c2
        L_0x00b0:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x001b
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r5.f668a = r0
            com.xiaomi.push.iz r0 = r5.f668a
            r0.a((com.xiaomi.push.kg) r6)
        L_0x00c2:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.je.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m457a(String str) {
        if (this.f671a == null) {
            this.f671a = new ArrayList();
        }
        this.f671a.add(str);
    }

    public void a(boolean z) {
        this.f670a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m458a() {
        return this.f668a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m459a(je jeVar) {
        if (jeVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jeVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f668a.compareTo(jeVar.f668a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jeVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f669a.equals(jeVar.f669a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jeVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f673b.equals(jeVar.f673b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jeVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f675c.equals(jeVar.f675c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jeVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f671a.equals(jeVar.f671a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jeVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f676d.equals(jeVar.f676d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jeVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f677e.equals(jeVar.f677e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jeVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f672a != jeVar.f672a)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jeVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f674b != jeVar.f674b)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jeVar.j();
        return (!j2 && !j3) || (j2 && j3 && this.f667a == jeVar.f667a);
    }

    public je b(String str) {
        this.f673b = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f666a);
        if (this.f668a != null && a()) {
            kgVar.a(f82322a);
            this.f668a.b(kgVar);
            kgVar.b();
        }
        if (this.f669a != null) {
            kgVar.a(f82323b);
            kgVar.a(this.f669a);
            kgVar.b();
        }
        if (this.f673b != null) {
            kgVar.a(f82324c);
            kgVar.a(this.f673b);
            kgVar.b();
        }
        if (this.f675c != null) {
            kgVar.a(f82325d);
            kgVar.a(this.f675c);
            kgVar.b();
        }
        if (this.f671a != null && e()) {
            kgVar.a(f82326e);
            kgVar.a(new ke((byte) 11, this.f671a.size()));
            for (String a2 : this.f671a) {
                kgVar.a(a2);
            }
            kgVar.e();
            kgVar.b();
        }
        if (this.f676d != null && f()) {
            kgVar.a(f82327f);
            kgVar.a(this.f676d);
            kgVar.b();
        }
        if (this.f677e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f677e);
            kgVar.b();
        }
        if (h()) {
            kgVar.a(h);
            kgVar.a(this.f672a);
            kgVar.b();
        }
        if (i()) {
            kgVar.a(i);
            kgVar.a(this.f674b);
            kgVar.b();
        }
        if (j()) {
            kgVar.a(j);
            kgVar.a(this.f667a);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f670a.set(1, z);
    }

    public boolean b() {
        return this.f669a != null;
    }

    public je c(String str) {
        this.f675c = str;
        return this;
    }

    public void c(boolean z) {
        this.f670a.set(2, z);
    }

    public boolean c() {
        return this.f673b != null;
    }

    public je d(String str) {
        this.f676d = str;
        return this;
    }

    public boolean d() {
        return this.f675c != null;
    }

    public je e(String str) {
        this.f677e = str;
        return this;
    }

    public boolean e() {
        return this.f671a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof je)) {
            return compareTo((je) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f676d != null;
    }

    public boolean g() {
        return this.f677e != null;
    }

    public boolean h() {
        return this.f670a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f670a.get(1);
    }

    public boolean j() {
        return this.f670a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (a()) {
            sb.append("target:");
            if (this.f668a == null) {
                sb.append("null");
            } else {
                sb.append(this.f668a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f669a == null ? "null" : this.f669a);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f673b == null ? "null" : this.f673b);
        sb.append(", ");
        sb.append("cmdName:");
        sb.append(this.f675c == null ? "null" : this.f675c);
        if (e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            if (this.f671a == null) {
                sb.append("null");
            } else {
                sb.append(this.f671a);
            }
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f676d == null ? "null" : this.f676d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f677e == null ? "null" : this.f677e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f672a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f674b);
        }
        if (j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f667a);
        }
        sb.append(")");
        return sb.toString();
    }
}

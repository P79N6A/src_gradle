package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class iv implements jv<iv, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82275a = new kd("", (byte) 8, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f571a = new kl("OnlineConfigItem");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82276b = new kd("", (byte) 8, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82277c = new kd("", (byte) 2, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82278d = new kd("", (byte) 8, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82279e = new kd("", (byte) 10, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82280f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 2, 7);

    /* renamed from: a  reason: collision with other field name */
    public int f572a;

    /* renamed from: a  reason: collision with other field name */
    public long f573a;

    /* renamed from: a  reason: collision with other field name */
    public String f574a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f575a = new BitSet(6);

    /* renamed from: a  reason: collision with other field name */
    public boolean f576a;

    /* renamed from: b  reason: collision with other field name */
    public int f577b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f578b;

    /* renamed from: c  reason: collision with other field name */
    public int f579c;

    public int a() {
        return this.f572a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r5 == 0) goto L_0x012f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.iv r5) {
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
            goto L_0x0131
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            int r0 = r4.f572a
            int r1 = r5.f572a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0131
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            int r0 = r4.f577b
            int r1 = r5.f577b
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0131
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            boolean r0 = r4.f576a
            boolean r1 = r5.f576a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x0131
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            int r0 = r4.f579c
            int r1 = r5.f579c
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0131
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f573a
            long r2 = r5.f573a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x0131
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f574a
            java.lang.String r1 = r5.f574a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0131
        L_0x0109:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x012f
            boolean r0 = r4.f578b
            boolean r5 = r5.f578b
            int r5 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r5)
            if (r5 != 0) goto L_0x0022
        L_0x012f:
            r5 = 0
            r0 = 0
        L_0x0131:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iv.compareTo(com.xiaomi.push.iv):int");
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m414a() {
        return this.f573a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m415a() {
        return this.f574a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m416a() {
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
            r3 = 8
            r4 = 1
            switch(r1) {
                case 1: goto L_0x0076;
                case 2: goto L_0x0068;
                case 3: goto L_0x005a;
                case 4: goto L_0x004c;
                case 5: goto L_0x003c;
                case 6: goto L_0x002f;
                case 7: goto L_0x0021;
                default: goto L_0x001b;
            }
        L_0x001b:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x0083
        L_0x0021:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.a()
            r5.f578b = r0
            r5.f(r4)
            goto L_0x0083
        L_0x002f:
            byte r1 = r0.f82422a
            r2 = 11
            if (r1 != r2) goto L_0x001b
            java.lang.String r0 = r6.a()
            r5.f574a = r0
            goto L_0x0083
        L_0x003c:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x001b
            long r0 = r6.a()
            r5.f573a = r0
            r5.e(r4)
            goto L_0x0083
        L_0x004c:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001b
            int r0 = r6.a()
            r5.f579c = r0
            r5.d(r4)
            goto L_0x0083
        L_0x005a:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001b
            boolean r0 = r6.a()
            r5.f576a = r0
            r5.c(r4)
            goto L_0x0083
        L_0x0068:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001b
            int r0 = r6.a()
            r5.f577b = r0
            r5.b((boolean) r4)
            goto L_0x0083
        L_0x0076:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001b
            int r0 = r6.a()
            r5.f572a = r0
            r5.a((boolean) r4)
        L_0x0083:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iv.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f575a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m417a() {
        return this.f575a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m418a(iv ivVar) {
        if (ivVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = ivVar.a();
        if ((a2 || a3) && (!a2 || !a3 || this.f572a != ivVar.f572a)) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ivVar.b();
        if ((b2 || b3) && (!b2 || !b3 || this.f577b != ivVar.f577b)) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ivVar.c();
        if ((c2 || c3) && (!c2 || !c3 || this.f576a != ivVar.f576a)) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ivVar.d();
        if ((d2 || d3) && (!d2 || !d3 || this.f579c != ivVar.f579c)) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ivVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f573a != ivVar.f573a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ivVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f574a.equals(ivVar.f574a))) {
            return false;
        }
        boolean h = h();
        boolean h2 = ivVar.h();
        return (!h && !h2) || (h && h2 && this.f578b == ivVar.f578b);
    }

    public int b() {
        return this.f577b;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f571a);
        if (a()) {
            kgVar.a(f82275a);
            kgVar.a(this.f572a);
            kgVar.b();
        }
        if (b()) {
            kgVar.a(f82276b);
            kgVar.a(this.f577b);
            kgVar.b();
        }
        if (c()) {
            kgVar.a(f82277c);
            kgVar.a(this.f576a);
            kgVar.b();
        }
        if (d()) {
            kgVar.a(f82278d);
            kgVar.a(this.f579c);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82279e);
            kgVar.a(this.f573a);
            kgVar.b();
        }
        if (this.f574a != null && f()) {
            kgVar.a(f82280f);
            kgVar.a(this.f574a);
            kgVar.b();
        }
        if (h()) {
            kgVar.a(g);
            kgVar.a(this.f578b);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f575a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m419b() {
        return this.f575a.get(1);
    }

    public int c() {
        return this.f579c;
    }

    public void c(boolean z) {
        this.f575a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m420c() {
        return this.f575a.get(2);
    }

    public void d(boolean z) {
        this.f575a.set(3, z);
    }

    public boolean d() {
        return this.f575a.get(3);
    }

    public void e(boolean z) {
        this.f575a.set(4, z);
    }

    public boolean e() {
        return this.f575a.get(4);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iv)) {
            return compareTo((iv) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f575a.set(5, z);
    }

    public boolean f() {
        return this.f574a != null;
    }

    public boolean g() {
        return this.f578b;
    }

    public boolean h() {
        return this.f575a.get(5);
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("OnlineConfigItem(");
        boolean z2 = false;
        if (a()) {
            sb.append("key:");
            sb.append(this.f572a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("type:");
            sb.append(this.f577b);
            z = false;
        }
        if (c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("clear:");
            sb.append(this.f576a);
            z = false;
        }
        if (d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("intValue:");
            sb.append(this.f579c);
            z = false;
        }
        if (e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("longValue:");
            sb.append(this.f573a);
            z = false;
        }
        if (f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("stringValue:");
            sb.append(this.f574a == null ? "null" : this.f574a);
        } else {
            z2 = z;
        }
        if (h()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("boolValue:");
            sb.append(this.f578b);
        }
        sb.append(")");
        return sb.toString();
    }
}

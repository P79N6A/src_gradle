package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jm implements jv<jm, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82360a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f771a = new kl("XmPushActionSendFeedbackResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82361b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82362c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82363d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82364e = new kd("", (byte) 10, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82365f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 8);

    /* renamed from: a  reason: collision with other field name */
    public long f772a;

    /* renamed from: a  reason: collision with other field name */
    public iz f773a;

    /* renamed from: a  reason: collision with other field name */
    public String f774a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f775a = new BitSet(1);

    /* renamed from: b  reason: collision with other field name */
    public String f776b;

    /* renamed from: c  reason: collision with other field name */
    public String f777c;

    /* renamed from: d  reason: collision with other field name */
    public String f778d;

    /* renamed from: e  reason: collision with other field name */
    public String f779e;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r5 == 0) goto L_0x012f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jm r5) {
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
            java.lang.String r0 = r4.f774a
            java.lang.String r1 = r5.f774a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            com.xiaomi.push.iz r0 = r4.f773a
            com.xiaomi.push.iz r1 = r5.f773a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
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
            java.lang.String r0 = r4.f776b
            java.lang.String r1 = r5.f776b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r4.f777c
            java.lang.String r1 = r5.f777c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            long r0 = r4.f772a
            long r2 = r5.f772a
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
            java.lang.String r0 = r4.f778d
            java.lang.String r1 = r5.f778d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0131
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0131
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f779e
            java.lang.String r5 = r5.f779e
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x012f:
            r5 = 0
            r0 = 0
        L_0x0131:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jm.compareTo(com.xiaomi.push.jm):int");
    }

    public void a() {
        if (this.f776b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f777c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0030
            r4.f()
            boolean r4 = r3.e()
            if (r4 == 0) goto L_0x0018
            r3.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r4 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0030:
            short r1 = r0.f871a
            r2 = 11
            switch(r1) {
                case 1: goto L_0x008d;
                case 2: goto L_0x007a;
                case 3: goto L_0x006f;
                case 4: goto L_0x0064;
                case 5: goto L_0x0037;
                case 6: goto L_0x0053;
                case 7: goto L_0x0048;
                case 8: goto L_0x003d;
                default: goto L_0x0037;
            }
        L_0x0037:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r4, r0)
            goto L_0x0097
        L_0x003d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            java.lang.String r0 = r4.a()
            r3.f779e = r0
            goto L_0x0097
        L_0x0048:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            java.lang.String r0 = r4.a()
            r3.f778d = r0
            goto L_0x0097
        L_0x0053:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0037
            long r0 = r4.a()
            r3.f772a = r0
            r0 = 1
            r3.a((boolean) r0)
            goto L_0x0097
        L_0x0064:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            java.lang.String r0 = r4.a()
            r3.f777c = r0
            goto L_0x0097
        L_0x006f:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            java.lang.String r0 = r4.a()
            r3.f776b = r0
            goto L_0x0097
        L_0x007a:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0037
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r3.f773a = r0
            com.xiaomi.push.iz r0 = r3.f773a
            r0.a((com.xiaomi.push.kg) r4)
            goto L_0x0097
        L_0x008d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            java.lang.String r0 = r4.a()
            r3.f774a = r0
        L_0x0097:
            r4.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jm.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f775a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m498a() {
        return this.f774a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m499a(jm jmVar) {
        if (jmVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jmVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f774a.equals(jmVar.f774a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jmVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f773a.compareTo(jmVar.f773a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jmVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f776b.equals(jmVar.f776b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jmVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f777c.equals(jmVar.f777c))) || this.f772a != jmVar.f772a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jmVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f778d.equals(jmVar.f778d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jmVar.g();
        return (!g2 && !g3) || (g2 && g3 && this.f779e.equals(jmVar.f779e));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f771a);
        if (this.f774a != null && a()) {
            kgVar.a(f82360a);
            kgVar.a(this.f774a);
            kgVar.b();
        }
        if (this.f773a != null && b()) {
            kgVar.a(f82361b);
            this.f773a.b(kgVar);
            kgVar.b();
        }
        if (this.f776b != null) {
            kgVar.a(f82362c);
            kgVar.a(this.f776b);
            kgVar.b();
        }
        if (this.f777c != null) {
            kgVar.a(f82363d);
            kgVar.a(this.f777c);
            kgVar.b();
        }
        kgVar.a(f82364e);
        kgVar.a(this.f772a);
        kgVar.b();
        if (this.f778d != null && f()) {
            kgVar.a(f82365f);
            kgVar.a(this.f778d);
            kgVar.b();
        }
        if (this.f779e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f779e);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f773a != null;
    }

    public boolean c() {
        return this.f776b != null;
    }

    public boolean d() {
        return this.f777c != null;
    }

    public boolean e() {
        return this.f775a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jm)) {
            return compareTo((jm) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f778d != null;
    }

    public boolean g() {
        return this.f779e != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionSendFeedbackResult(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f774a == null ? "null" : this.f774a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f773a == null) {
                sb.append("null");
            } else {
                sb.append(this.f773a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f776b == null ? "null" : this.f776b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f777c == null ? "null" : this.f777c);
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f772a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f778d == null ? "null" : this.f778d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f779e == null ? "null" : this.f779e);
        }
        sb.append(")");
        return sb.toString();
    }
}

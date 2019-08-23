package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class iz implements jv<iz, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82296a = new kd("", (byte) 10, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f617a = new kl("Target");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82297b = new kd("", (byte) 11, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82298c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82299d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82300e = new kd("", (byte) 2, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82301f = new kd("", (byte) 11, 7);

    /* renamed from: a  reason: collision with other field name */
    public long f618a = 5;

    /* renamed from: a  reason: collision with other field name */
    public String f619a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f620a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f621a = false;

    /* renamed from: b  reason: collision with other field name */
    public String f622b = "xiaomi.com";

    /* renamed from: c  reason: collision with other field name */
    public String f623c = "";

    /* renamed from: d  reason: collision with other field name */
    public String f624d;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0107, code lost:
        if (r5 == 0) goto L_0x0109;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.iz r5) {
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
            goto L_0x010b
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            long r0 = r4.f618a
            long r2 = r5.f618a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x010b
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = r4.f619a
            java.lang.String r1 = r5.f619a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x010b
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f622b
            java.lang.String r1 = r5.f622b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x010b
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f623c
            java.lang.String r1 = r5.f623c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x010b
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r4.f621a
            boolean r1 = r5.f621a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x010b
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x010b
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f624d
            java.lang.String r5 = r5.f624d
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x0109:
            r5 = 0
            r0 = 0
        L_0x010b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iz.compareTo(com.xiaomi.push.iz):int");
    }

    public void a() {
        if (this.f619a == null) {
            throw new kh("Required field 'userId' was not present! Struct: " + toString());
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
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x0018
            r4.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r5 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'channelId' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0030:
            short r1 = r0.f871a
            r2 = 7
            r3 = 11
            if (r1 == r2) goto L_0x0081
            r2 = 1
            switch(r1) {
                case 1: goto L_0x0071;
                case 2: goto L_0x0066;
                case 3: goto L_0x005b;
                case 4: goto L_0x0050;
                case 5: goto L_0x0041;
                default: goto L_0x003b;
            }
        L_0x003b:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x008b
        L_0x0041:
            byte r1 = r0.f82422a
            r3 = 2
            if (r1 != r3) goto L_0x003b
            boolean r0 = r5.a()
            r4.f621a = r0
            r4.b((boolean) r2)
            goto L_0x008b
        L_0x0050:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.a()
            r4.f623c = r0
            goto L_0x008b
        L_0x005b:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.a()
            r4.f622b = r0
            goto L_0x008b
        L_0x0066:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.a()
            r4.f619a = r0
            goto L_0x008b
        L_0x0071:
            byte r1 = r0.f82422a
            r3 = 10
            if (r1 != r3) goto L_0x003b
            long r0 = r5.a()
            r4.f618a = r0
            r4.a((boolean) r2)
            goto L_0x008b
        L_0x0081:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003b
            java.lang.String r0 = r5.a()
            r4.f624d = r0
        L_0x008b:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iz.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f620a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m440a() {
        return this.f620a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m441a(iz izVar) {
        if (izVar == null || this.f618a != izVar.f618a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = izVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f619a.equals(izVar.f619a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = izVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f622b.equals(izVar.f622b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = izVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f623c.equals(izVar.f623c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = izVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f621a != izVar.f621a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = izVar.f();
        return (!f2 && !f3) || (f2 && f3 && this.f624d.equals(izVar.f624d));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f617a);
        kgVar.a(f82296a);
        kgVar.a(this.f618a);
        kgVar.b();
        if (this.f619a != null) {
            kgVar.a(f82297b);
            kgVar.a(this.f619a);
            kgVar.b();
        }
        if (this.f622b != null && c()) {
            kgVar.a(f82298c);
            kgVar.a(this.f622b);
            kgVar.b();
        }
        if (this.f623c != null && d()) {
            kgVar.a(f82299d);
            kgVar.a(this.f623c);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82300e);
            kgVar.a(this.f621a);
            kgVar.b();
        }
        if (this.f624d != null && f()) {
            kgVar.a(f82301f);
            kgVar.a(this.f624d);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f620a.set(1, z);
    }

    public boolean b() {
        return this.f619a != null;
    }

    public boolean c() {
        return this.f622b != null;
    }

    public boolean d() {
        return this.f623c != null;
    }

    public boolean e() {
        return this.f620a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iz)) {
            return compareTo((iz) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f624d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(");
        sb.append("channelId:");
        sb.append(this.f618a);
        sb.append(", ");
        sb.append("userId:");
        sb.append(this.f619a == null ? "null" : this.f619a);
        if (c()) {
            sb.append(", ");
            sb.append("server:");
            sb.append(this.f622b == null ? "null" : this.f622b);
        }
        if (d()) {
            sb.append(", ");
            sb.append("resource:");
            sb.append(this.f623c == null ? "null" : this.f623c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f621a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("token:");
            sb.append(this.f624d == null ? "null" : this.f624d);
        }
        sb.append(")");
        return sb.toString();
    }
}

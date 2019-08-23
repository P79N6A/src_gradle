package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class gg implements jv<gg, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82098a = new kd("", (byte) 3, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f416a = new kl("StatsEvent");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82099b = new kd("", (byte) 8, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82100c = new kd("", (byte) 8, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82101d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82102e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82103f = new kd("", (byte) 8, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 11, 8);
    private static final kd i = new kd("", (byte) 8, 9);
    private static final kd j = new kd("", (byte) 8, 10);

    /* renamed from: a  reason: collision with other field name */
    public byte f417a;

    /* renamed from: a  reason: collision with other field name */
    public int f418a;

    /* renamed from: a  reason: collision with other field name */
    public String f419a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f420a = new BitSet(6);

    /* renamed from: b  reason: collision with other field name */
    public int f421b;

    /* renamed from: b  reason: collision with other field name */
    public String f422b;

    /* renamed from: c  reason: collision with other field name */
    public int f423c;

    /* renamed from: c  reason: collision with other field name */
    public String f424c;

    /* renamed from: d  reason: collision with other field name */
    public int f425d;

    /* renamed from: d  reason: collision with other field name */
    public String f426d;

    /* renamed from: e  reason: collision with other field name */
    public int f427e;

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x019f, code lost:
        if (r3 == 0) goto L_0x01a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.gg r3) {
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
            goto L_0x01a3
        L_0x0025:
            boolean r0 = r2.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x004b
            byte r0 = r2.f417a
            byte r1 = r3.f417a
            int r0 = com.xiaomi.push.jw.a((byte) r0, (byte) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x004b:
            boolean r0 = r2.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0071
            int r0 = r2.f418a
            int r1 = r3.f418a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0071:
            boolean r0 = r2.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.c()
            if (r0 == 0) goto L_0x0097
            int r0 = r2.f421b
            int r1 = r3.f421b
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0097:
            boolean r0 = r2.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r2.f419a
            java.lang.String r1 = r3.f419a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x00bd:
            boolean r0 = r2.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r2.f422b
            java.lang.String r1 = r3.f422b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x00e3:
            boolean r0 = r2.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.f()
            if (r0 == 0) goto L_0x0109
            int r0 = r2.f423c
            int r1 = r3.f423c
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0109:
            boolean r0 = r2.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r2.f424c
            java.lang.String r1 = r3.f424c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x012f:
            boolean r0 = r2.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r2.f426d
            java.lang.String r1 = r3.f426d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x0155:
            boolean r0 = r2.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.i()
            if (r0 == 0) goto L_0x017b
            int r0 = r2.f425d
            int r1 = r3.f425d
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x01a3
        L_0x017b:
            boolean r0 = r2.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x01a3
            boolean r0 = r2.j()
            if (r0 == 0) goto L_0x01a1
            int r0 = r2.f427e
            int r3 = r3.f427e
            int r3 = com.xiaomi.push.jw.a((int) r0, (int) r3)
            if (r3 != 0) goto L_0x0022
        L_0x01a1:
            r3 = 0
            r0 = 0
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gg.compareTo(com.xiaomi.push.gg):int");
    }

    public gg a(byte b2) {
        this.f417a = b2;
        a(true);
        return this;
    }

    public gg a(int i2) {
        this.f418a = i2;
        b(true);
        return this;
    }

    public gg a(String str) {
        this.f419a = str;
        return this;
    }

    public void a() {
        if (this.f419a == null) {
            throw new kh("Required field 'connpt' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x006c
            r6.f()
            boolean r6 = r5.a()
            if (r6 == 0) goto L_0x0054
            boolean r6 = r5.b()
            if (r6 == 0) goto L_0x003c
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0024
            r5.a()
            return
        L_0x0024:
            com.xiaomi.push.kh r6 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'value' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x003c:
            com.xiaomi.push.kh r6 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'type' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0054:
            com.xiaomi.push.kh r6 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'chid' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x006c:
            short r1 = r0.f871a
            r2 = 11
            r3 = 8
            r4 = 1
            switch(r1) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x00e2;
                case 3: goto L_0x00d4;
                case 4: goto L_0x00c9;
                case 5: goto L_0x00be;
                case 6: goto L_0x00b0;
                case 7: goto L_0x00a5;
                case 8: goto L_0x009a;
                case 9: goto L_0x008c;
                case 10: goto L_0x007d;
                default: goto L_0x0076;
            }
        L_0x0076:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x00fe
        L_0x007d:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0076
            int r0 = r6.a()
            r5.f427e = r0
            r5.f(r4)
            goto L_0x00fe
        L_0x008c:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0076
            int r0 = r6.a()
            r5.f425d = r0
            r5.e(r4)
            goto L_0x00fe
        L_0x009a:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0076
            java.lang.String r0 = r6.a()
            r5.f426d = r0
            goto L_0x00fe
        L_0x00a5:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0076
            java.lang.String r0 = r6.a()
            r5.f424c = r0
            goto L_0x00fe
        L_0x00b0:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0076
            int r0 = r6.a()
            r5.f423c = r0
            r5.d((boolean) r4)
            goto L_0x00fe
        L_0x00be:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0076
            java.lang.String r0 = r6.a()
            r5.f422b = r0
            goto L_0x00fe
        L_0x00c9:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0076
            java.lang.String r0 = r6.a()
            r5.f419a = r0
            goto L_0x00fe
        L_0x00d4:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0076
            int r0 = r6.a()
            r5.f421b = r0
            r5.c((boolean) r4)
            goto L_0x00fe
        L_0x00e2:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0076
            int r0 = r6.a()
            r5.f418a = r0
            r5.b((boolean) r4)
            goto L_0x00fe
        L_0x00f0:
            byte r1 = r0.f82422a
            r2 = 3
            if (r1 != r2) goto L_0x0076
            byte r0 = r6.a()
            r5.f417a = r0
            r5.a((boolean) r4)
        L_0x00fe:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gg.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f420a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m323a() {
        return this.f420a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m324a(gg ggVar) {
        if (ggVar == null || this.f417a != ggVar.f417a || this.f418a != ggVar.f418a || this.f421b != ggVar.f421b) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ggVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f419a.equals(ggVar.f419a))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ggVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f422b.equals(ggVar.f422b))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ggVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f423c != ggVar.f423c)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ggVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f424c.equals(ggVar.f424c))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ggVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f426d.equals(ggVar.f426d))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ggVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f425d != ggVar.f425d)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ggVar.j();
        return (!j2 && !j3) || (j2 && j3 && this.f427e == ggVar.f427e);
    }

    public gg b(int i2) {
        this.f421b = i2;
        c(true);
        return this;
    }

    public gg b(String str) {
        this.f422b = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f416a);
        kgVar.a(f82098a);
        kgVar.a(this.f417a);
        kgVar.b();
        kgVar.a(f82099b);
        kgVar.a(this.f418a);
        kgVar.b();
        kgVar.a(f82100c);
        kgVar.a(this.f421b);
        kgVar.b();
        if (this.f419a != null) {
            kgVar.a(f82101d);
            kgVar.a(this.f419a);
            kgVar.b();
        }
        if (this.f422b != null && e()) {
            kgVar.a(f82102e);
            kgVar.a(this.f422b);
            kgVar.b();
        }
        if (f()) {
            kgVar.a(f82103f);
            kgVar.a(this.f423c);
            kgVar.b();
        }
        if (this.f424c != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f424c);
            kgVar.b();
        }
        if (this.f426d != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f426d);
            kgVar.b();
        }
        if (i()) {
            kgVar.a(i);
            kgVar.a(this.f425d);
            kgVar.b();
        }
        if (j()) {
            kgVar.a(j);
            kgVar.a(this.f427e);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f420a.set(1, z);
    }

    public boolean b() {
        return this.f420a.get(1);
    }

    public gg c(int i2) {
        this.f423c = i2;
        d(true);
        return this;
    }

    public gg c(String str) {
        this.f424c = str;
        return this;
    }

    public void c(boolean z) {
        this.f420a.set(2, z);
    }

    public boolean c() {
        return this.f420a.get(2);
    }

    public gg d(int i2) {
        this.f425d = i2;
        e(true);
        return this;
    }

    public gg d(String str) {
        this.f426d = str;
        return this;
    }

    public void d(boolean z) {
        this.f420a.set(3, z);
    }

    public boolean d() {
        return this.f419a != null;
    }

    public void e(boolean z) {
        this.f420a.set(4, z);
    }

    public boolean e() {
        return this.f422b != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gg)) {
            return compareTo((gg) obj);
        }
        return false;
    }

    public void f(boolean z) {
        this.f420a.set(5, z);
    }

    public boolean f() {
        return this.f420a.get(3);
    }

    public boolean g() {
        return this.f424c != null;
    }

    public boolean h() {
        return this.f426d != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f420a.get(4);
    }

    public boolean j() {
        return this.f420a.get(5);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvent(");
        sb.append("chid:");
        sb.append(this.f417a);
        sb.append(", ");
        sb.append("type:");
        sb.append(this.f418a);
        sb.append(", ");
        sb.append("value:");
        sb.append(this.f421b);
        sb.append(", ");
        sb.append("connpt:");
        sb.append(this.f419a == null ? "null" : this.f419a);
        if (e()) {
            sb.append(", ");
            sb.append("host:");
            sb.append(this.f422b == null ? "null" : this.f422b);
        }
        if (f()) {
            sb.append(", ");
            sb.append("subvalue:");
            sb.append(this.f423c);
        }
        if (g()) {
            sb.append(", ");
            sb.append("annotation:");
            sb.append(this.f424c == null ? "null" : this.f424c);
        }
        if (h()) {
            sb.append(", ");
            sb.append("user:");
            sb.append(this.f426d == null ? "null" : this.f426d);
        }
        if (i()) {
            sb.append(", ");
            sb.append("time:");
            sb.append(this.f425d);
        }
        if (j()) {
            sb.append(", ");
            sb.append("clientIp:");
            sb.append(this.f427e);
        }
        sb.append(")");
        return sb.toString();
    }
}

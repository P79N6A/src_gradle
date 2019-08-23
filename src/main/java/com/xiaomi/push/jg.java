package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;

public class jg implements jv<jg, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82334a = new kd("", (byte) 8, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f690a = new kl("XmPushActionContainer");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82335b = new kd("", (byte) 2, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82336c = new kd("", (byte) 2, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82337d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82338e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82339f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 12, 7);
    private static final kd h = new kd("", (byte) 12, 8);

    /* renamed from: a  reason: collision with other field name */
    public ik f691a;

    /* renamed from: a  reason: collision with other field name */
    public ix f692a;

    /* renamed from: a  reason: collision with other field name */
    public iz f693a;

    /* renamed from: a  reason: collision with other field name */
    public String f694a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f695a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f696a = new BitSet(2);

    /* renamed from: a  reason: collision with other field name */
    public boolean f697a = true;

    /* renamed from: b  reason: collision with other field name */
    public String f698b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f699b = true;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (r3 == 0) goto L_0x0155;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jg r3) {
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
            com.xiaomi.push.ik r0 = r2.f691a
            com.xiaomi.push.ik r1 = r3.f691a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0157
        L_0x004b:
            boolean r0 = r2.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.c()
            if (r0 == 0) goto L_0x0071
            boolean r0 = r2.f697a
            boolean r1 = r3.f697a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0071:
            boolean r0 = r2.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.d()
            if (r0 == 0) goto L_0x0097
            boolean r0 = r2.f699b
            boolean r1 = r3.f699b
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0097:
            boolean r0 = r2.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.e()
            if (r0 == 0) goto L_0x00bd
            java.nio.ByteBuffer r0 = r2.f695a
            java.nio.ByteBuffer r1 = r3.f695a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0157
        L_0x00bd:
            boolean r0 = r2.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.f()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r2.f694a
            java.lang.String r1 = r3.f694a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x00e3:
            boolean r0 = r2.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.g()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r2.f698b
            java.lang.String r1 = r3.f698b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0157
        L_0x0109:
            boolean r0 = r2.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x012f
            com.xiaomi.push.iz r0 = r2.f693a
            com.xiaomi.push.iz r1 = r3.f693a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0157
        L_0x012f:
            boolean r0 = r2.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0157
            boolean r0 = r2.i()
            if (r0 == 0) goto L_0x0155
            com.xiaomi.push.ix r0 = r2.f692a
            com.xiaomi.push.ix r3 = r3.f692a
            int r3 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r3)
            if (r3 != 0) goto L_0x0022
        L_0x0155:
            r3 = 0
            r0 = 0
        L_0x0157:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jg.compareTo(com.xiaomi.push.jg):int");
    }

    public ik a() {
        return this.f691a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ix m465a() {
        return this.f692a;
    }

    public jg a(ik ikVar) {
        this.f691a = ikVar;
        return this;
    }

    public jg a(ix ixVar) {
        this.f692a = ixVar;
        return this;
    }

    public jg a(iz izVar) {
        this.f693a = izVar;
        return this;
    }

    public jg a(String str) {
        this.f694a = str;
        return this;
    }

    public jg a(ByteBuffer byteBuffer) {
        this.f695a = byteBuffer;
        return this;
    }

    public jg a(boolean z) {
        this.f697a = z;
        a(true);
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m466a() {
        return this.f694a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m467a() {
        if (this.f691a == null) {
            throw new kh("Required field 'action' was not present! Struct: " + toString());
        } else if (this.f695a == null) {
            throw new kh("Required field 'pushAction' was not present! Struct: " + toString());
        } else if (this.f693a == null) {
            throw new kh("Required field 'target' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r7) {
        /*
            r6 = this;
            r7.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r7.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x004e
            r7.f()
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x0036
            boolean r7 = r6.d()
            if (r7 == 0) goto L_0x001e
            r6.a()
            return
        L_0x001e:
            com.xiaomi.push.kh r7 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'isRequest' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0036:
            com.xiaomi.push.kh r7 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'encryptAction' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x004e:
            short r1 = r0.f871a
            r2 = 1
            r3 = 12
            r4 = 2
            r5 = 11
            switch(r1) {
                case 1: goto L_0x00bf;
                case 2: goto L_0x00b1;
                case 3: goto L_0x00a3;
                case 4: goto L_0x0098;
                case 5: goto L_0x008d;
                case 6: goto L_0x0082;
                case 7: goto L_0x0071;
                case 8: goto L_0x0060;
                default: goto L_0x0059;
            }
        L_0x0059:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r7, r0)
            goto L_0x00cf
        L_0x0060:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0059
            com.xiaomi.push.ix r0 = new com.xiaomi.push.ix
            r0.<init>()
            r6.f692a = r0
            com.xiaomi.push.ix r0 = r6.f692a
            r0.a((com.xiaomi.push.kg) r7)
            goto L_0x00cf
        L_0x0071:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0059
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r6.f693a = r0
            com.xiaomi.push.iz r0 = r6.f693a
            r0.a((com.xiaomi.push.kg) r7)
            goto L_0x00cf
        L_0x0082:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x0059
            java.lang.String r0 = r7.a()
            r6.f698b = r0
            goto L_0x00cf
        L_0x008d:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x0059
            java.lang.String r0 = r7.a()
            r6.f694a = r0
            goto L_0x00cf
        L_0x0098:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x0059
            java.nio.ByteBuffer r0 = r7.a()
            r6.f695a = r0
            goto L_0x00cf
        L_0x00a3:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0059
            boolean r0 = r7.a()
            r6.f699b = r0
            r6.b((boolean) r2)
            goto L_0x00cf
        L_0x00b1:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0059
            boolean r0 = r7.a()
            r6.f697a = r0
            r6.a((boolean) r2)
            goto L_0x00cf
        L_0x00bf:
            byte r1 = r0.f82422a
            r2 = 8
            if (r1 != r2) goto L_0x0059
            int r0 = r7.a()
            com.xiaomi.push.ik r0 = com.xiaomi.push.ik.a(r0)
            r6.f691a = r0
        L_0x00cf:
            r7.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jg.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m468a(boolean z) {
        this.f696a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m469a() {
        return this.f691a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m470a(jg jgVar) {
        if (jgVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jgVar.a();
        if (((a2 || a3) && (!a2 || !a3 || !this.f691a.equals(jgVar.f691a))) || this.f697a != jgVar.f697a || this.f699b != jgVar.f699b) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jgVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f695a.equals(jgVar.f695a))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jgVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f694a.equals(jgVar.f694a))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jgVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f698b.equals(jgVar.f698b))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jgVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f693a.compareTo(jgVar.f693a))) {
            return false;
        }
        boolean i = i();
        boolean i2 = jgVar.i();
        return (!i && !i2) || (i && i2 && this.f692a.compareTo(jgVar.f692a));
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m471a() {
        a(jw.a(this.f695a));
        return this.f695a.array();
    }

    public jg b(String str) {
        this.f698b = str;
        return this;
    }

    public jg b(boolean z) {
        this.f699b = z;
        b(true);
        return this;
    }

    public String b() {
        return this.f698b;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f690a);
        if (this.f691a != null) {
            kgVar.a(f82334a);
            kgVar.a(this.f691a.a());
            kgVar.b();
        }
        kgVar.a(f82335b);
        kgVar.a(this.f697a);
        kgVar.b();
        kgVar.a(f82336c);
        kgVar.a(this.f699b);
        kgVar.b();
        if (this.f695a != null) {
            kgVar.a(f82337d);
            kgVar.a(this.f695a);
            kgVar.b();
        }
        if (this.f694a != null && f()) {
            kgVar.a(f82338e);
            kgVar.a(this.f694a);
            kgVar.b();
        }
        if (this.f698b != null && g()) {
            kgVar.a(f82339f);
            kgVar.a(this.f698b);
            kgVar.b();
        }
        if (this.f693a != null) {
            kgVar.a(g);
            this.f693a.b(kgVar);
            kgVar.b();
        }
        if (this.f692a != null && i()) {
            kgVar.a(h);
            this.f692a.b(kgVar);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    /* renamed from: b  reason: collision with other method in class */
    public void m472b(boolean z) {
        this.f696a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m473b() {
        return this.f697a;
    }

    public boolean c() {
        return this.f696a.get(0);
    }

    public boolean d() {
        return this.f696a.get(1);
    }

    public boolean e() {
        return this.f695a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jg)) {
            return compareTo((jg) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f694a != null;
    }

    public boolean g() {
        return this.f698b != null;
    }

    public boolean h() {
        return this.f693a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f692a != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionContainer(");
        sb.append("action:");
        if (this.f691a == null) {
            sb.append("null");
        } else {
            sb.append(this.f691a);
        }
        sb.append(", ");
        sb.append("encryptAction:");
        sb.append(this.f697a);
        sb.append(", ");
        sb.append("isRequest:");
        sb.append(this.f699b);
        sb.append(", ");
        sb.append("pushAction:");
        if (this.f695a == null) {
            sb.append("null");
        } else {
            jw.a(this.f695a, sb);
        }
        if (f()) {
            sb.append(", ");
            sb.append("appid:");
            sb.append(this.f694a == null ? "null" : this.f694a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f698b == null ? "null" : this.f698b);
        }
        sb.append(", ");
        sb.append("target:");
        if (this.f693a == null) {
            sb.append("null");
        } else {
            sb.append(this.f693a);
        }
        if (i()) {
            sb.append(", ");
            sb.append("metaInfo:");
            if (this.f692a == null) {
                sb.append("null");
            } else {
                sb.append(this.f692a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

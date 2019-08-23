package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.List;

public class it implements jv<it, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82266a = new kd("", (byte) 8, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f564a = new kl("NormalConfig");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82267b = new kd("", (byte) 15, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82268c = new kd("", (byte) 8, 3);

    /* renamed from: a  reason: collision with other field name */
    public int f565a;

    /* renamed from: a  reason: collision with other field name */
    public iq f566a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f567a = new BitSet(1);

    /* renamed from: a  reason: collision with other field name */
    public List<iv> f568a;

    public int a() {
        return this.f565a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        if (r3 == 0) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.it r3) {
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
            goto L_0x0099
        L_0x0025:
            boolean r0 = r2.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x004b
            int r0 = r2.f565a
            int r1 = r3.f565a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0099
        L_0x004b:
            boolean r0 = r2.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x0071
            java.util.List<com.xiaomi.push.iv> r0 = r2.f568a
            java.util.List<com.xiaomi.push.iv> r1 = r3.f568a
            int r0 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r1)
            if (r0 != 0) goto L_0x0099
        L_0x0071:
            boolean r0 = r2.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r2.c()
            if (r0 == 0) goto L_0x0097
            com.xiaomi.push.iq r0 = r2.f566a
            com.xiaomi.push.iq r3 = r3.f566a
            int r3 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r3)
            if (r3 != 0) goto L_0x0022
        L_0x0097:
            r3 = 0
            r0 = 0
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.it.compareTo(com.xiaomi.push.it):int");
    }

    /* renamed from: a  reason: collision with other method in class */
    public iq m410a() {
        return this.f566a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m411a() {
        if (this.f568a == null) {
            throw new kh("Required field 'configItems' was not present! Struct: " + toString());
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
            java.lang.String r1 = "Required field 'version' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0030:
            short r1 = r0.f871a
            r2 = 8
            switch(r1) {
                case 1: goto L_0x0078;
                case 2: goto L_0x004c;
                case 3: goto L_0x003d;
                default: goto L_0x0037;
            }
        L_0x0037:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x0086
        L_0x003d:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            int r0 = r5.a()
            com.xiaomi.push.iq r0 = com.xiaomi.push.iq.a(r0)
            r4.f566a = r0
            goto L_0x0086
        L_0x004c:
            byte r1 = r0.f82422a
            r2 = 15
            if (r1 != r2) goto L_0x0037
            com.xiaomi.push.ke r0 = r5.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f872a
            r1.<init>(r2)
            r4.f568a = r1
            r1 = 0
        L_0x0060:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x0074
            com.xiaomi.push.iv r2 = new com.xiaomi.push.iv
            r2.<init>()
            r2.a((com.xiaomi.push.kg) r5)
            java.util.List<com.xiaomi.push.iv> r3 = r4.f568a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0060
        L_0x0074:
            r5.i()
            goto L_0x0086
        L_0x0078:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0037
            int r0 = r5.a()
            r4.f565a = r0
            r0 = 1
            r4.a((boolean) r0)
        L_0x0086:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.it.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f567a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m412a() {
        return this.f567a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m413a(it itVar) {
        if (itVar == null || this.f565a != itVar.f565a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = itVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f568a.equals(itVar.f568a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = itVar.c();
        return (!c2 && !c3) || (c2 && c3 && this.f566a.equals(itVar.f566a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f564a);
        kgVar.a(f82266a);
        kgVar.a(this.f565a);
        kgVar.b();
        if (this.f568a != null) {
            kgVar.a(f82267b);
            kgVar.a(new ke((byte) 12, this.f568a.size()));
            for (iv b2 : this.f568a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        if (this.f566a != null && c()) {
            kgVar.a(f82268c);
            kgVar.a(this.f566a.a());
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f568a != null;
    }

    public boolean c() {
        return this.f566a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof it)) {
            return compareTo((it) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(");
        sb.append("version:");
        sb.append(this.f565a);
        sb.append(", ");
        sb.append("configItems:");
        if (this.f568a == null) {
            sb.append("null");
        } else {
            sb.append(this.f568a);
        }
        if (c()) {
            sb.append(", ");
            sb.append("type:");
            if (this.f566a == null) {
                sb.append("null");
            } else {
                sb.append(this.f566a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

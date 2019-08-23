package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jc implements jv<jc, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82319a = new kd("", (byte) 8, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f660a = new kl("XmPushActionCheckClientInfo");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82320b = new kd("", (byte) 8, 2);

    /* renamed from: a  reason: collision with other field name */
    public int f661a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f662a = new BitSet(2);

    /* renamed from: b  reason: collision with other field name */
    public int f663b;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0047, code lost:
        if (r0 == 0) goto L_0x0049;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jc r3) {
        /*
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0023
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            int r3 = r0.compareTo(r3)
            goto L_0x0072
        L_0x0023:
            boolean r0 = r2.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0071
            boolean r0 = r2.a()
            if (r0 == 0) goto L_0x0049
            int r0 = r2.f661a
            int r1 = r3.f661a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0071
        L_0x0049:
            boolean r0 = r2.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r3.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0071
            boolean r0 = r2.b()
            if (r0 == 0) goto L_0x006f
            int r0 = r2.f663b
            int r3 = r3.f663b
            int r3 = com.xiaomi.push.jw.a((int) r0, (int) r3)
            if (r3 != 0) goto L_0x0072
        L_0x006f:
            r3 = 0
            goto L_0x0072
        L_0x0071:
            r3 = r0
        L_0x0072:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jc.compareTo(com.xiaomi.push.jc):int");
    }

    public jc a(int i) {
        this.f661a = i;
        a(true);
        return this;
    }

    public void a() {
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
            if (r1 != 0) goto L_0x004e
            r5.f()
            boolean r5 = r4.a()
            if (r5 == 0) goto L_0x0036
            boolean r5 = r4.b()
            if (r5 == 0) goto L_0x001e
            r4.a()
            return
        L_0x001e:
            com.xiaomi.push.kh r5 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'pluginConfigVersion' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0036:
            com.xiaomi.push.kh r5 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'miscConfigVersion' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r4.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x004e:
            short r1 = r0.f871a
            r2 = 1
            r3 = 8
            switch(r1) {
                case 1: goto L_0x006a;
                case 2: goto L_0x005c;
                default: goto L_0x0056;
            }
        L_0x0056:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x0077
        L_0x005c:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0056
            int r0 = r5.a()
            r4.f663b = r0
            r4.b((boolean) r2)
            goto L_0x0077
        L_0x006a:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0056
            int r0 = r5.a()
            r4.f661a = r0
            r4.a((boolean) r2)
        L_0x0077:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jc.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f662a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m452a() {
        return this.f662a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m453a(jc jcVar) {
        return jcVar != null && this.f661a == jcVar.f661a && this.f663b == jcVar.f663b;
    }

    public jc b(int i) {
        this.f663b = i;
        b(true);
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f660a);
        kgVar.a(f82319a);
        kgVar.a(this.f661a);
        kgVar.b();
        kgVar.a(f82320b);
        kgVar.a(this.f663b);
        kgVar.b();
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f662a.set(1, z);
    }

    public boolean b() {
        return this.f662a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jc)) {
            return compareTo((jc) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(" + "miscConfigVersion:" + this.f661a + ", " + "pluginConfigVersion:" + this.f663b + ")";
    }
}

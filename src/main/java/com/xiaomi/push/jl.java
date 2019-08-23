package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class jl implements jv<jl, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82354a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f751a = new kl("XmPushActionRegistrationResult");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82355b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82356c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82357d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82358e = new kd("", (byte) 10, 6);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82359f = new kd("", (byte) 11, 7);
    private static final kd g = new kd("", (byte) 11, 8);
    private static final kd h = new kd("", (byte) 11, 9);
    private static final kd i = new kd("", (byte) 11, 10);
    private static final kd j = new kd("", (byte) 10, 11);
    private static final kd k = new kd("", (byte) 11, 12);
    private static final kd l = new kd("", (byte) 11, 13);
    private static final kd m = new kd("", (byte) 10, 14);
    private static final kd n = new kd("", (byte) 11, 15);
    private static final kd o = new kd("", (byte) 8, 16);
    private static final kd p = new kd("", (byte) 11, 17);
    private static final kd q = new kd("", (byte) 8, 18);
    private static final kd r = new kd("", (byte) 11, 19);

    /* renamed from: a  reason: collision with other field name */
    public int f752a;

    /* renamed from: a  reason: collision with other field name */
    public long f753a;

    /* renamed from: a  reason: collision with other field name */
    public iz f754a;

    /* renamed from: a  reason: collision with other field name */
    public String f755a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f756a = new BitSet(5);

    /* renamed from: b  reason: collision with other field name */
    public int f757b;

    /* renamed from: b  reason: collision with other field name */
    public long f758b;

    /* renamed from: b  reason: collision with other field name */
    public String f759b;

    /* renamed from: c  reason: collision with other field name */
    public long f760c;

    /* renamed from: c  reason: collision with other field name */
    public String f761c;

    /* renamed from: d  reason: collision with other field name */
    public String f762d;

    /* renamed from: e  reason: collision with other field name */
    public String f763e;

    /* renamed from: f  reason: collision with other field name */
    public String f764f;

    /* renamed from: g  reason: collision with other field name */
    public String f765g;

    /* renamed from: h  reason: collision with other field name */
    public String f766h;

    /* renamed from: i  reason: collision with other field name */
    public String f767i;

    /* renamed from: j  reason: collision with other field name */
    public String f768j;

    /* renamed from: k  reason: collision with other field name */
    public String f769k;

    /* renamed from: l  reason: collision with other field name */
    public String f770l;

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02cf, code lost:
        if (r5 == 0) goto L_0x02d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jl r5) {
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
            goto L_0x02d3
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f755a
            java.lang.String r1 = r5.f755a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f754a
            com.xiaomi.push.iz r1 = r5.f754a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f759b
            java.lang.String r1 = r5.f759b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f761c
            java.lang.String r1 = r5.f761c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f753a
            long r2 = r5.f753a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x02d3
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f762d
            java.lang.String r1 = r5.f762d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f763e
            java.lang.String r1 = r5.f763e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r4.f764f
            java.lang.String r1 = r5.f764f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f765g
            java.lang.String r1 = r5.f765g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            long r0 = r4.f758b
            long r2 = r5.f758b
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x02d3
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r4.f766h
            java.lang.String r1 = r5.f766h
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x01c7:
            boolean r0 = r4.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.l()
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r4.f767i
            java.lang.String r1 = r5.f767i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x01ed:
            boolean r0 = r4.m()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x0213
            long r0 = r4.f760c
            long r2 = r5.f760c
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x02d3
        L_0x0213:
            boolean r0 = r4.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.n()
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = r4.f768j
            java.lang.String r1 = r5.f768j
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0239:
            boolean r0 = r4.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x025f
            int r0 = r4.f752a
            int r1 = r5.f752a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x025f:
            boolean r0 = r4.p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.p()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.p()
            if (r0 == 0) goto L_0x0285
            java.lang.String r0 = r4.f769k
            java.lang.String r1 = r5.f769k
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x0285:
            boolean r0 = r4.q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.q()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x02ab
            int r0 = r4.f757b
            int r1 = r5.f757b
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x02d3
        L_0x02ab:
            boolean r0 = r4.r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.r()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x02d3
            boolean r0 = r4.r()
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = r4.f770l
            java.lang.String r5 = r5.f770l
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x02d1:
            r5 = 0
            r0 = 0
        L_0x02d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jl.compareTo(com.xiaomi.push.jl):int");
    }

    public long a() {
        return this.f753a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m493a() {
        return this.f759b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m494a() {
        if (this.f759b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f761c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0030
            r7.f()
            boolean r7 = r6.e()
            if (r7 == 0) goto L_0x0018
            r6.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r7 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'errorCode' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0030:
            short r1 = r0.f871a
            r2 = 8
            r3 = 10
            r4 = 1
            r5 = 11
            switch(r1) {
                case 1: goto L_0x011e;
                case 2: goto L_0x010b;
                case 3: goto L_0x0100;
                case 4: goto L_0x00f5;
                case 5: goto L_0x003c;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00dc;
                case 8: goto L_0x00d1;
                case 9: goto L_0x00c6;
                case 10: goto L_0x00bb;
                case 11: goto L_0x00ac;
                case 12: goto L_0x00a0;
                case 13: goto L_0x0094;
                case 14: goto L_0x0085;
                case 15: goto L_0x0079;
                case 16: goto L_0x006a;
                case 17: goto L_0x005e;
                case 18: goto L_0x004f;
                case 19: goto L_0x0043;
                default: goto L_0x003c;
            }
        L_0x003c:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r7, r0)
            goto L_0x0128
        L_0x0043:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f770l = r0
            goto L_0x0128
        L_0x004f:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x003c
            int r0 = r7.a()
            r6.f757b = r0
            r6.e(r4)
            goto L_0x0128
        L_0x005e:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f769k = r0
            goto L_0x0128
        L_0x006a:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x003c
            int r0 = r7.a()
            r6.f752a = r0
            r6.d(r4)
            goto L_0x0128
        L_0x0079:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f768j = r0
            goto L_0x0128
        L_0x0085:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003c
            long r0 = r7.a()
            r6.f760c = r0
            r6.c(r4)
            goto L_0x0128
        L_0x0094:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f767i = r0
            goto L_0x0128
        L_0x00a0:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f766h = r0
            goto L_0x0128
        L_0x00ac:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003c
            long r0 = r7.a()
            r6.f758b = r0
            r6.b((boolean) r4)
            goto L_0x0128
        L_0x00bb:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f765g = r0
            goto L_0x0128
        L_0x00c6:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f764f = r0
            goto L_0x0128
        L_0x00d1:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f763e = r0
            goto L_0x0128
        L_0x00dc:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f762d = r0
            goto L_0x0128
        L_0x00e7:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003c
            long r0 = r7.a()
            r6.f753a = r0
            r6.a((boolean) r4)
            goto L_0x0128
        L_0x00f5:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f761c = r0
            goto L_0x0128
        L_0x0100:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f759b = r0
            goto L_0x0128
        L_0x010b:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x003c
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r6.f754a = r0
            com.xiaomi.push.iz r0 = r6.f754a
            r0.a((com.xiaomi.push.kg) r7)
            goto L_0x0128
        L_0x011e:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003c
            java.lang.String r0 = r7.a()
            r6.f755a = r0
        L_0x0128:
            r7.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jl.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f756a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m495a() {
        return this.f755a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m496a(jl jlVar) {
        if (jlVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jlVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f755a.equals(jlVar.f755a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jlVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f754a.compareTo(jlVar.f754a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jlVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f759b.equals(jlVar.f759b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jlVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f761c.equals(jlVar.f761c))) || this.f753a != jlVar.f753a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jlVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f762d.equals(jlVar.f762d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jlVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f763e.equals(jlVar.f763e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jlVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f764f.equals(jlVar.f764f))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jlVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f765g.equals(jlVar.f765g))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jlVar.j();
        if ((j2 || j3) && (!j2 || !j3 || this.f758b != jlVar.f758b)) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jlVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f766h.equals(jlVar.f766h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jlVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f767i.equals(jlVar.f767i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jlVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f760c != jlVar.f760c)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jlVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f768j.equals(jlVar.f768j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jlVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f752a != jlVar.f752a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jlVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f769k.equals(jlVar.f769k))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jlVar.q();
        if ((q2 || q3) && (!q2 || !q3 || this.f757b != jlVar.f757b)) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jlVar.r();
        return (!r2 && !r3) || (r2 && r3 && this.f770l.equals(jlVar.f770l));
    }

    public String b() {
        return this.f765g;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f751a);
        if (this.f755a != null && a()) {
            kgVar.a(f82354a);
            kgVar.a(this.f755a);
            kgVar.b();
        }
        if (this.f754a != null && b()) {
            kgVar.a(f82355b);
            this.f754a.b(kgVar);
            kgVar.b();
        }
        if (this.f759b != null) {
            kgVar.a(f82356c);
            kgVar.a(this.f759b);
            kgVar.b();
        }
        if (this.f761c != null) {
            kgVar.a(f82357d);
            kgVar.a(this.f761c);
            kgVar.b();
        }
        kgVar.a(f82358e);
        kgVar.a(this.f753a);
        kgVar.b();
        if (this.f762d != null && f()) {
            kgVar.a(f82359f);
            kgVar.a(this.f762d);
            kgVar.b();
        }
        if (this.f763e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f763e);
            kgVar.b();
        }
        if (this.f764f != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f764f);
            kgVar.b();
        }
        if (this.f765g != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f765g);
            kgVar.b();
        }
        if (j()) {
            kgVar.a(j);
            kgVar.a(this.f758b);
            kgVar.b();
        }
        if (this.f766h != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f766h);
            kgVar.b();
        }
        if (this.f767i != null && l()) {
            kgVar.a(l);
            kgVar.a(this.f767i);
            kgVar.b();
        }
        if (m()) {
            kgVar.a(m);
            kgVar.a(this.f760c);
            kgVar.b();
        }
        if (this.f768j != null && n()) {
            kgVar.a(n);
            kgVar.a(this.f768j);
            kgVar.b();
        }
        if (o()) {
            kgVar.a(o);
            kgVar.a(this.f752a);
            kgVar.b();
        }
        if (this.f769k != null && p()) {
            kgVar.a(p);
            kgVar.a(this.f769k);
            kgVar.b();
        }
        if (q()) {
            kgVar.a(q);
            kgVar.a(this.f757b);
            kgVar.b();
        }
        if (this.f770l != null && r()) {
            kgVar.a(r);
            kgVar.a(this.f770l);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f756a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m497b() {
        return this.f754a != null;
    }

    public void c(boolean z) {
        this.f756a.set(2, z);
    }

    public boolean c() {
        return this.f759b != null;
    }

    public void d(boolean z) {
        this.f756a.set(3, z);
    }

    public boolean d() {
        return this.f761c != null;
    }

    public void e(boolean z) {
        this.f756a.set(4, z);
    }

    public boolean e() {
        return this.f756a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jl)) {
            return compareTo((jl) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f762d != null;
    }

    public boolean g() {
        return this.f763e != null;
    }

    public boolean h() {
        return this.f764f != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f765g != null;
    }

    public boolean j() {
        return this.f756a.get(1);
    }

    public boolean k() {
        return this.f766h != null;
    }

    public boolean l() {
        return this.f767i != null;
    }

    public boolean m() {
        return this.f756a.get(2);
    }

    public boolean n() {
        return this.f768j != null;
    }

    public boolean o() {
        return this.f756a.get(3);
    }

    public boolean p() {
        return this.f769k != null;
    }

    public boolean q() {
        return this.f756a.get(4);
    }

    public boolean r() {
        return this.f770l != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f755a == null ? "null" : this.f755a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f754a == null) {
                sb.append("null");
            } else {
                sb.append(this.f754a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f759b == null ? "null" : this.f759b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f761c == null ? "null" : this.f761c);
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f753a);
        if (f()) {
            sb.append(", ");
            sb.append("reason:");
            sb.append(this.f762d == null ? "null" : this.f762d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f763e == null ? "null" : this.f763e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("regSecret:");
            sb.append(this.f764f == null ? "null" : this.f764f);
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f765g == null ? "null" : this.f765g);
        }
        if (j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f758b);
        }
        if (k()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f766h == null ? "null" : this.f766h);
        }
        if (l()) {
            sb.append(", ");
            sb.append("clientId:");
            sb.append(this.f767i == null ? "null" : this.f767i);
        }
        if (m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f760c);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.f768j == null ? "null" : this.f768j);
        }
        if (o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f752a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            sb.append(this.f769k == null ? "null" : this.f769k);
        }
        if (q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f757b);
        }
        if (r()) {
            sb.append(", ");
            sb.append("region:");
            sb.append(this.f770l == null ? "null" : this.f770l);
        }
        sb.append(")");
        return sb.toString();
    }
}

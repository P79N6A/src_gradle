package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

public class jk implements jv<jk, Object>, Serializable, Cloneable {
    private static final kd A = new kd("", (byte) 2, 101);
    private static final kd B = new kd("", (byte) 11, 102);

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82348a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f721a = new kl("XmPushActionRegistration");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82349b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82350c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82351d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82352e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82353f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 11, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 11, 10);
    private static final kd k = new kd("", (byte) 11, 11);
    private static final kd l = new kd("", (byte) 11, 12);
    private static final kd m = new kd("", (byte) 8, 13);
    private static final kd n = new kd("", (byte) 8, 14);
    private static final kd o = new kd("", (byte) 11, 15);
    private static final kd p = new kd("", (byte) 11, 16);
    private static final kd q = new kd("", (byte) 11, 17);
    private static final kd r = new kd("", (byte) 11, 18);
    private static final kd s = new kd("", (byte) 8, 19);
    private static final kd t = new kd("", (byte) 8, 20);
    private static final kd u = new kd("", (byte) 2, 21);
    private static final kd v = new kd("", (byte) 10, 22);
    private static final kd w = new kd("", (byte) 10, 23);
    private static final kd x = new kd("", (byte) 11, 24);
    private static final kd y = new kd("", (byte) 11, 25);
    private static final kd z = new kd("", (byte) 13, 100);

    /* renamed from: a  reason: collision with other field name */
    public int f722a;

    /* renamed from: a  reason: collision with other field name */
    public long f723a;

    /* renamed from: a  reason: collision with other field name */
    public iy f724a;

    /* renamed from: a  reason: collision with other field name */
    public iz f725a;

    /* renamed from: a  reason: collision with other field name */
    public String f726a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f727a = new BitSet(7);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f728a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f729a = true;

    /* renamed from: b  reason: collision with other field name */
    public int f730b;

    /* renamed from: b  reason: collision with other field name */
    public long f731b;

    /* renamed from: b  reason: collision with other field name */
    public String f732b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f733b = false;

    /* renamed from: c  reason: collision with other field name */
    public int f734c;

    /* renamed from: c  reason: collision with other field name */
    public String f735c;

    /* renamed from: d  reason: collision with other field name */
    public String f736d;

    /* renamed from: e  reason: collision with other field name */
    public String f737e;

    /* renamed from: f  reason: collision with other field name */
    public String f738f;

    /* renamed from: g  reason: collision with other field name */
    public String f739g;

    /* renamed from: h  reason: collision with other field name */
    public String f740h;

    /* renamed from: i  reason: collision with other field name */
    public String f741i;

    /* renamed from: j  reason: collision with other field name */
    public String f742j;

    /* renamed from: k  reason: collision with other field name */
    public String f743k;

    /* renamed from: l  reason: collision with other field name */
    public String f744l;

    /* renamed from: m  reason: collision with other field name */
    public String f745m;

    /* renamed from: n  reason: collision with other field name */
    public String f746n;

    /* renamed from: o  reason: collision with other field name */
    public String f747o;

    /* renamed from: p  reason: collision with other field name */
    public String f748p;

    /* renamed from: q  reason: collision with other field name */
    public String f749q;

    /* renamed from: r  reason: collision with other field name */
    public String f750r;

    public boolean A() {
        return this.f727a.get(6);
    }

    public boolean B() {
        return this.f750r != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:171:0x044b, code lost:
        if (r5 == 0) goto L_0x044d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jk r5) {
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
            goto L_0x044f
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f726a
            java.lang.String r1 = r5.f726a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f725a
            com.xiaomi.push.iz r1 = r5.f725a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f732b
            java.lang.String r1 = r5.f732b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f735c
            java.lang.String r1 = r5.f735c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r4.f736d
            java.lang.String r1 = r5.f736d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f737e
            java.lang.String r1 = r5.f737e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f738f
            java.lang.String r1 = r5.f738f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = r4.f739g
            java.lang.String r1 = r5.f739g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f740h
            java.lang.String r1 = r5.f740h
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r4.f741i
            java.lang.String r1 = r5.f741i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r4.f742j
            java.lang.String r1 = r5.f742j
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x01c7:
            boolean r0 = r4.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.l()
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r4.f743k
            java.lang.String r1 = r5.f743k
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x01ed:
            boolean r0 = r4.m()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x0213
            int r0 = r4.f722a
            int r1 = r5.f722a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0213:
            boolean r0 = r4.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.n()
            if (r0 == 0) goto L_0x0239
            int r0 = r4.f730b
            int r1 = r5.f730b
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0239:
            boolean r0 = r4.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x025f
            java.lang.String r0 = r4.f744l
            java.lang.String r1 = r5.f744l
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x025f:
            boolean r0 = r4.p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.p()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.p()
            if (r0 == 0) goto L_0x0285
            java.lang.String r0 = r4.f745m
            java.lang.String r1 = r5.f745m
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0285:
            boolean r0 = r4.q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.q()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x02ab
            java.lang.String r0 = r4.f746n
            java.lang.String r1 = r5.f746n
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x02ab:
            boolean r0 = r4.r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.r()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.r()
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = r4.f747o
            java.lang.String r1 = r5.f747o
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x02d1:
            boolean r0 = r4.s()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.s()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.s()
            if (r0 == 0) goto L_0x02f7
            int r0 = r4.f734c
            int r1 = r5.f734c
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x044f
        L_0x02f7:
            boolean r0 = r4.t()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.t()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.t()
            if (r0 == 0) goto L_0x031d
            com.xiaomi.push.iy r0 = r4.f724a
            com.xiaomi.push.iy r1 = r5.f724a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x044f
        L_0x031d:
            boolean r0 = r4.u()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.u()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.u()
            if (r0 == 0) goto L_0x0343
            boolean r0 = r4.f729a
            boolean r1 = r5.f729a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0343:
            boolean r0 = r4.v()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.v()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.v()
            if (r0 == 0) goto L_0x0369
            long r0 = r4.f723a
            long r2 = r5.f723a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x044f
        L_0x0369:
            boolean r0 = r4.w()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.w()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.w()
            if (r0 == 0) goto L_0x038f
            long r0 = r4.f731b
            long r2 = r5.f731b
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x044f
        L_0x038f:
            boolean r0 = r4.x()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.x()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.x()
            if (r0 == 0) goto L_0x03b5
            java.lang.String r0 = r4.f748p
            java.lang.String r1 = r5.f748p
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x03b5:
            boolean r0 = r4.y()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.y()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.y()
            if (r0 == 0) goto L_0x03db
            java.lang.String r0 = r4.f749q
            java.lang.String r1 = r5.f749q
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x044f
        L_0x03db:
            boolean r0 = r4.z()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.z()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.z()
            if (r0 == 0) goto L_0x0401
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f728a
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f728a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0401:
            boolean r0 = r4.A()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.A()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.A()
            if (r0 == 0) goto L_0x0427
            boolean r0 = r4.f733b
            boolean r1 = r5.f733b
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x044f
        L_0x0427:
            boolean r0 = r4.B()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.B()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x044f
            boolean r0 = r4.B()
            if (r0 == 0) goto L_0x044d
            java.lang.String r0 = r4.f750r
            java.lang.String r5 = r5.f750r
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x044d:
            r5 = 0
            r0 = 0
        L_0x044f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jk.compareTo(com.xiaomi.push.jk):int");
    }

    public jk a(int i2) {
        this.f722a = i2;
        a(true);
        return this;
    }

    public jk a(iy iyVar) {
        this.f724a = iyVar;
        return this;
    }

    public jk a(String str) {
        this.f732b = str;
        return this;
    }

    public String a() {
        return this.f732b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m488a() {
        if (this.f732b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f735c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f738f == null) {
            throw new kh("Required field 'token' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r8) {
        /*
            r7 = this;
            r8.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r8.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0012
            r8.f()
            r7.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 10
            r3 = 2
            r4 = 8
            r5 = 1
            r6 = 11
            switch(r1) {
                case 1: goto L_0x01a9;
                case 2: goto L_0x0196;
                case 3: goto L_0x018b;
                case 4: goto L_0x0180;
                case 5: goto L_0x0175;
                case 6: goto L_0x016a;
                case 7: goto L_0x015f;
                case 8: goto L_0x0154;
                case 9: goto L_0x0149;
                case 10: goto L_0x013d;
                case 11: goto L_0x0131;
                case 12: goto L_0x0125;
                case 13: goto L_0x0116;
                case 14: goto L_0x0107;
                case 15: goto L_0x00fb;
                case 16: goto L_0x00ef;
                case 17: goto L_0x00e3;
                case 18: goto L_0x00d7;
                case 19: goto L_0x00c8;
                case 20: goto L_0x00b8;
                case 21: goto L_0x00a9;
                case 22: goto L_0x009a;
                case 23: goto L_0x008b;
                case 24: goto L_0x007f;
                case 25: goto L_0x0073;
                default: goto L_0x001f;
            }
        L_0x001f:
            switch(r1) {
                case 100: goto L_0x0044;
                case 101: goto L_0x0035;
                case 102: goto L_0x0029;
                default: goto L_0x0022;
            }
        L_0x0022:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r8, r0)
            goto L_0x01b3
        L_0x0029:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f750r = r0
            goto L_0x01b3
        L_0x0035:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0022
            boolean r0 = r8.a()
            r7.f733b = r0
            r7.g((boolean) r5)
            goto L_0x01b3
        L_0x0044:
            byte r1 = r0.f82422a
            r2 = 13
            if (r1 != r2) goto L_0x0022
            com.xiaomi.push.kf r0 = r8.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f873a
            int r2 = r2 * 2
            r1.<init>(r2)
            r7.f728a = r1
            r1 = 0
        L_0x005a:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x006e
            java.lang.String r2 = r8.a()
            java.lang.String r3 = r8.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f728a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x005a
        L_0x006e:
            r8.h()
            goto L_0x01b3
        L_0x0073:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f749q = r0
            goto L_0x01b3
        L_0x007f:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f748p = r0
            goto L_0x01b3
        L_0x008b:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0022
            long r0 = r8.a()
            r7.f731b = r0
            r7.f((boolean) r5)
            goto L_0x01b3
        L_0x009a:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0022
            long r0 = r8.a()
            r7.f723a = r0
            r7.e((boolean) r5)
            goto L_0x01b3
        L_0x00a9:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0022
            boolean r0 = r8.a()
            r7.f729a = r0
            r7.d((boolean) r5)
            goto L_0x01b3
        L_0x00b8:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0022
            int r0 = r8.a()
            com.xiaomi.push.iy r0 = com.xiaomi.push.iy.a(r0)
            r7.f724a = r0
            goto L_0x01b3
        L_0x00c8:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0022
            int r0 = r8.a()
            r7.f734c = r0
            r7.c((boolean) r5)
            goto L_0x01b3
        L_0x00d7:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f747o = r0
            goto L_0x01b3
        L_0x00e3:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f746n = r0
            goto L_0x01b3
        L_0x00ef:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f745m = r0
            goto L_0x01b3
        L_0x00fb:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f744l = r0
            goto L_0x01b3
        L_0x0107:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0022
            int r0 = r8.a()
            r7.f730b = r0
            r7.b((boolean) r5)
            goto L_0x01b3
        L_0x0116:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x0022
            int r0 = r8.a()
            r7.f722a = r0
            r7.a((boolean) r5)
            goto L_0x01b3
        L_0x0125:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f743k = r0
            goto L_0x01b3
        L_0x0131:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f742j = r0
            goto L_0x01b3
        L_0x013d:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f741i = r0
            goto L_0x01b3
        L_0x0149:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f740h = r0
            goto L_0x01b3
        L_0x0154:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f739g = r0
            goto L_0x01b3
        L_0x015f:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f738f = r0
            goto L_0x01b3
        L_0x016a:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f737e = r0
            goto L_0x01b3
        L_0x0175:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f736d = r0
            goto L_0x01b3
        L_0x0180:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f735c = r0
            goto L_0x01b3
        L_0x018b:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f732b = r0
            goto L_0x01b3
        L_0x0196:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0022
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r7.f725a = r0
            com.xiaomi.push.iz r0 = r7.f725a
            r0.a((com.xiaomi.push.kg) r8)
            goto L_0x01b3
        L_0x01a9:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x0022
            java.lang.String r0 = r8.a()
            r7.f726a = r0
        L_0x01b3:
            r8.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jk.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z2) {
        this.f727a.set(0, z2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m489a() {
        return this.f726a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m490a(jk jkVar) {
        if (jkVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jkVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f726a.equals(jkVar.f726a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jkVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f725a.compareTo(jkVar.f725a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jkVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f732b.equals(jkVar.f732b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jkVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f735c.equals(jkVar.f735c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jkVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f736d.equals(jkVar.f736d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jkVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f737e.equals(jkVar.f737e))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jkVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f738f.equals(jkVar.f738f))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jkVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f739g.equals(jkVar.f739g))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jkVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f740h.equals(jkVar.f740h))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jkVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f741i.equals(jkVar.f741i))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jkVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f742j.equals(jkVar.f742j))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jkVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f743k.equals(jkVar.f743k))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jkVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f722a != jkVar.f722a)) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jkVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f730b != jkVar.f730b)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jkVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f744l.equals(jkVar.f744l))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jkVar.p();
        if ((p2 || p3) && (!p2 || !p3 || !this.f745m.equals(jkVar.f745m))) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jkVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f746n.equals(jkVar.f746n))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jkVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f747o.equals(jkVar.f747o))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jkVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f734c != jkVar.f734c)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jkVar.t();
        if ((t2 || t3) && (!t2 || !t3 || !this.f724a.equals(jkVar.f724a))) {
            return false;
        }
        boolean u2 = u();
        boolean u3 = jkVar.u();
        if ((u2 || u3) && (!u2 || !u3 || this.f729a != jkVar.f729a)) {
            return false;
        }
        boolean v2 = v();
        boolean v3 = jkVar.v();
        if ((v2 || v3) && (!v2 || !v3 || this.f723a != jkVar.f723a)) {
            return false;
        }
        boolean w2 = w();
        boolean w3 = jkVar.w();
        if ((w2 || w3) && (!w2 || !w3 || this.f731b != jkVar.f731b)) {
            return false;
        }
        boolean x2 = x();
        boolean x3 = jkVar.x();
        if ((x2 || x3) && (!x2 || !x3 || !this.f748p.equals(jkVar.f748p))) {
            return false;
        }
        boolean y2 = y();
        boolean y3 = jkVar.y();
        if ((y2 || y3) && (!y2 || !y3 || !this.f749q.equals(jkVar.f749q))) {
            return false;
        }
        boolean z2 = z();
        boolean z3 = jkVar.z();
        if ((z2 || z3) && (!z2 || !z3 || !this.f728a.equals(jkVar.f728a))) {
            return false;
        }
        boolean A2 = A();
        boolean A3 = jkVar.A();
        if ((A2 || A3) && (!A2 || !A3 || this.f733b != jkVar.f733b)) {
            return false;
        }
        boolean B2 = B();
        boolean B3 = jkVar.B();
        return (!B2 && !B3) || (B2 && B3 && this.f750r.equals(jkVar.f750r));
    }

    public jk b(int i2) {
        this.f730b = i2;
        b(true);
        return this;
    }

    public jk b(String str) {
        this.f735c = str;
        return this;
    }

    public String b() {
        return this.f735c;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f721a);
        if (this.f726a != null && a()) {
            kgVar.a(f82348a);
            kgVar.a(this.f726a);
            kgVar.b();
        }
        if (this.f725a != null && b()) {
            kgVar.a(f82349b);
            this.f725a.b(kgVar);
            kgVar.b();
        }
        if (this.f732b != null) {
            kgVar.a(f82350c);
            kgVar.a(this.f732b);
            kgVar.b();
        }
        if (this.f735c != null) {
            kgVar.a(f82351d);
            kgVar.a(this.f735c);
            kgVar.b();
        }
        if (this.f736d != null && e()) {
            kgVar.a(f82352e);
            kgVar.a(this.f736d);
            kgVar.b();
        }
        if (this.f737e != null && f()) {
            kgVar.a(f82353f);
            kgVar.a(this.f737e);
            kgVar.b();
        }
        if (this.f738f != null) {
            kgVar.a(g);
            kgVar.a(this.f738f);
            kgVar.b();
        }
        if (this.f739g != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f739g);
            kgVar.b();
        }
        if (this.f740h != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f740h);
            kgVar.b();
        }
        if (this.f741i != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f741i);
            kgVar.b();
        }
        if (this.f742j != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f742j);
            kgVar.b();
        }
        if (this.f743k != null && l()) {
            kgVar.a(l);
            kgVar.a(this.f743k);
            kgVar.b();
        }
        if (m()) {
            kgVar.a(m);
            kgVar.a(this.f722a);
            kgVar.b();
        }
        if (n()) {
            kgVar.a(n);
            kgVar.a(this.f730b);
            kgVar.b();
        }
        if (this.f744l != null && o()) {
            kgVar.a(o);
            kgVar.a(this.f744l);
            kgVar.b();
        }
        if (this.f745m != null && p()) {
            kgVar.a(p);
            kgVar.a(this.f745m);
            kgVar.b();
        }
        if (this.f746n != null && q()) {
            kgVar.a(q);
            kgVar.a(this.f746n);
            kgVar.b();
        }
        if (this.f747o != null && r()) {
            kgVar.a(r);
            kgVar.a(this.f747o);
            kgVar.b();
        }
        if (s()) {
            kgVar.a(s);
            kgVar.a(this.f734c);
            kgVar.b();
        }
        if (this.f724a != null && t()) {
            kgVar.a(t);
            kgVar.a(this.f724a.a());
            kgVar.b();
        }
        if (u()) {
            kgVar.a(u);
            kgVar.a(this.f729a);
            kgVar.b();
        }
        if (v()) {
            kgVar.a(v);
            kgVar.a(this.f723a);
            kgVar.b();
        }
        if (w()) {
            kgVar.a(w);
            kgVar.a(this.f731b);
            kgVar.b();
        }
        if (this.f748p != null && x()) {
            kgVar.a(x);
            kgVar.a(this.f748p);
            kgVar.b();
        }
        if (this.f749q != null && y()) {
            kgVar.a(y);
            kgVar.a(this.f749q);
            kgVar.b();
        }
        if (this.f728a != null && z()) {
            kgVar.a(z);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f728a.size()));
            for (Map.Entry next : this.f728a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (A()) {
            kgVar.a(A);
            kgVar.a(this.f733b);
            kgVar.b();
        }
        if (this.f750r != null && B()) {
            kgVar.a(B);
            kgVar.a(this.f750r);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z2) {
        this.f727a.set(1, z2);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m491b() {
        return this.f725a != null;
    }

    public jk c(int i2) {
        this.f734c = i2;
        c(true);
        return this;
    }

    public jk c(String str) {
        this.f736d = str;
        return this;
    }

    public String c() {
        return this.f738f;
    }

    public void c(boolean z2) {
        this.f727a.set(2, z2);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m492c() {
        return this.f732b != null;
    }

    public jk d(String str) {
        this.f737e = str;
        return this;
    }

    public void d(boolean z2) {
        this.f727a.set(3, z2);
    }

    public boolean d() {
        return this.f735c != null;
    }

    public jk e(String str) {
        this.f738f = str;
        return this;
    }

    public void e(boolean z2) {
        this.f727a.set(4, z2);
    }

    public boolean e() {
        return this.f736d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jk)) {
            return compareTo((jk) obj);
        }
        return false;
    }

    public jk f(String str) {
        this.f739g = str;
        return this;
    }

    public void f(boolean z2) {
        this.f727a.set(5, z2);
    }

    public boolean f() {
        return this.f737e != null;
    }

    public jk g(String str) {
        this.f743k = str;
        return this;
    }

    public void g(boolean z2) {
        this.f727a.set(6, z2);
    }

    public boolean g() {
        return this.f738f != null;
    }

    public jk h(String str) {
        this.f744l = str;
        return this;
    }

    public boolean h() {
        return this.f739g != null;
    }

    public int hashCode() {
        return 0;
    }

    public jk i(String str) {
        this.f745m = str;
        return this;
    }

    public boolean i() {
        return this.f740h != null;
    }

    public jk j(String str) {
        this.f746n = str;
        return this;
    }

    public boolean j() {
        return this.f741i != null;
    }

    public jk k(String str) {
        this.f747o = str;
        return this;
    }

    public boolean k() {
        return this.f742j != null;
    }

    public boolean l() {
        return this.f743k != null;
    }

    public boolean m() {
        return this.f727a.get(0);
    }

    public boolean n() {
        return this.f727a.get(1);
    }

    public boolean o() {
        return this.f744l != null;
    }

    public boolean p() {
        return this.f745m != null;
    }

    public boolean q() {
        return this.f746n != null;
    }

    public boolean r() {
        return this.f747o != null;
    }

    public boolean s() {
        return this.f727a.get(2);
    }

    public boolean t() {
        return this.f724a != null;
    }

    public String toString() {
        boolean z2;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z3 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f726a == null ? "null" : this.f726a);
            z2 = false;
        } else {
            z2 = true;
        }
        if (b()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f725a == null) {
                sb.append("null");
            } else {
                sb.append(this.f725a);
            }
        } else {
            z3 = z2;
        }
        if (!z3) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f732b == null ? "null" : this.f732b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f735c == null ? "null" : this.f735c);
        if (e()) {
            sb.append(", ");
            sb.append("appVersion:");
            sb.append(this.f736d == null ? "null" : this.f736d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f737e == null ? "null" : this.f737e);
        }
        sb.append(", ");
        sb.append("token:");
        sb.append(this.f738f == null ? "null" : this.f738f);
        if (h()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.f739g == null ? "null" : this.f739g);
        }
        if (i()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f740h == null ? "null" : this.f740h);
        }
        if (j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            sb.append(this.f741i == null ? "null" : this.f741i);
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f742j == null ? "null" : this.f742j);
        }
        if (l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            sb.append(this.f743k == null ? "null" : this.f743k);
        }
        if (m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f722a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f730b);
        }
        if (o()) {
            sb.append(", ");
            sb.append("androidId:");
            sb.append(this.f744l == null ? "null" : this.f744l);
        }
        if (p()) {
            sb.append(", ");
            sb.append("imei:");
            sb.append(this.f745m == null ? "null" : this.f745m);
        }
        if (q()) {
            sb.append(", ");
            sb.append("serial:");
            sb.append(this.f746n == null ? "null" : this.f746n);
        }
        if (r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            sb.append(this.f747o == null ? "null" : this.f747o);
        }
        if (s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f734c);
        }
        if (t()) {
            sb.append(", ");
            sb.append("reason:");
            if (this.f724a == null) {
                sb.append("null");
            } else {
                sb.append(this.f724a);
            }
        }
        if (u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f729a);
        }
        if (v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f723a);
        }
        if (w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f731b);
        }
        if (x()) {
            sb.append(", ");
            sb.append("subImei:");
            sb.append(this.f748p == null ? "null" : this.f748p);
        }
        if (y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            sb.append(this.f749q == null ? "null" : this.f749q);
        }
        if (z()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            if (this.f728a == null) {
                sb.append("null");
            } else {
                sb.append(this.f728a);
            }
        }
        if (A()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f733b);
        }
        if (B()) {
            sb.append(", ");
            sb.append("oldRegId:");
            sb.append(this.f750r == null ? "null" : this.f750r);
        }
        sb.append(")");
        return sb.toString();
    }

    public boolean u() {
        return this.f727a.get(3);
    }

    public boolean v() {
        return this.f727a.get(4);
    }

    public boolean w() {
        return this.f727a.get(5);
    }

    public boolean x() {
        return this.f748p != null;
    }

    public boolean y() {
        return this.f749q != null;
    }

    public boolean z() {
        return this.f728a != null;
    }
}

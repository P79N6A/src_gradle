package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class iw implements jv<iw, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82281a = new kd("", (byte) 12, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f580a = new kl("PushMessage");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82282b = new kd("", (byte) 11, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82283c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82284d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82285e = new kd("", (byte) 10, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82286f = new kd("", (byte) 10, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 11, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 11, 10);
    private static final kd k = new kd("", (byte) 11, 11);
    private static final kd l = new kd("", (byte) 12, 12);
    private static final kd m = new kd("", (byte) 11, 13);
    private static final kd n = new kd("", (byte) 2, 14);
    private static final kd o = new kd("", (byte) 11, 15);
    private static final kd p = new kd("", (byte) 10, 16);
    private static final kd q = new kd("", (byte) 11, 20);
    private static final kd r = new kd("", (byte) 11, 21);

    /* renamed from: a  reason: collision with other field name */
    public long f581a;

    /* renamed from: a  reason: collision with other field name */
    public ix f582a;

    /* renamed from: a  reason: collision with other field name */
    public iz f583a;

    /* renamed from: a  reason: collision with other field name */
    public String f584a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f585a = new BitSet(4);

    /* renamed from: a  reason: collision with other field name */
    public boolean f586a = false;

    /* renamed from: b  reason: collision with other field name */
    public long f587b;

    /* renamed from: b  reason: collision with other field name */
    public String f588b;

    /* renamed from: c  reason: collision with other field name */
    public long f589c;

    /* renamed from: c  reason: collision with other field name */
    public String f590c;

    /* renamed from: d  reason: collision with other field name */
    public String f591d;

    /* renamed from: e  reason: collision with other field name */
    public String f592e;

    /* renamed from: f  reason: collision with other field name */
    public String f593f;

    /* renamed from: g  reason: collision with other field name */
    public String f594g;

    /* renamed from: h  reason: collision with other field name */
    public String f595h;

    /* renamed from: i  reason: collision with other field name */
    public String f596i;

    /* renamed from: j  reason: collision with other field name */
    public String f597j;

    /* renamed from: k  reason: collision with other field name */
    public String f598k;

    /* renamed from: l  reason: collision with other field name */
    public String f599l;

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02cf, code lost:
        if (r5 == 0) goto L_0x02d1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.iw r5) {
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
            com.xiaomi.push.iz r0 = r4.f583a
            com.xiaomi.push.iz r1 = r5.f583a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
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
            java.lang.String r0 = r4.f584a
            java.lang.String r1 = r5.f584a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r4.f588b
            java.lang.String r1 = r5.f588b
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
            java.lang.String r0 = r4.f590c
            java.lang.String r1 = r5.f590c
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
            long r0 = r4.f581a
            long r2 = r5.f581a
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
            long r0 = r4.f587b
            long r2 = r5.f587b
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
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
            java.lang.String r0 = r4.f591d
            java.lang.String r1 = r5.f591d
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
            java.lang.String r0 = r4.f592e
            java.lang.String r1 = r5.f592e
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
            java.lang.String r0 = r4.f593f
            java.lang.String r1 = r5.f593f
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
            java.lang.String r0 = r4.f594g
            java.lang.String r1 = r5.f594g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r4.f595h
            java.lang.String r1 = r5.f595h
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
            com.xiaomi.push.ix r0 = r4.f582a
            com.xiaomi.push.ix r1 = r5.f582a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
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
            java.lang.String r0 = r4.f596i
            java.lang.String r1 = r5.f596i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            boolean r0 = r4.f586a
            boolean r1 = r5.f586a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
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
            java.lang.String r0 = r4.f597j
            java.lang.String r1 = r5.f597j
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            long r0 = r4.f589c
            long r2 = r5.f589c
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
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
            java.lang.String r0 = r4.f598k
            java.lang.String r1 = r5.f598k
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r4.f599l
            java.lang.String r5 = r5.f599l
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x02d1:
            r5 = 0
            r0 = 0
        L_0x02d3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iw.compareTo(com.xiaomi.push.iw):int");
    }

    public long a() {
        return this.f581a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m421a() {
        return this.f584a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m422a() {
        if (this.f584a == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f588b == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
        } else if (this.f590c == null) {
            throw new kh("Required field 'payload' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0012
            r7.f()
            r6.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 12
            r3 = 10
            r4 = 1
            r5 = 11
            switch(r1) {
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f1;
                case 3: goto L_0x00e6;
                case 4: goto L_0x00db;
                case 5: goto L_0x00cd;
                case 6: goto L_0x00bf;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00a9;
                case 9: goto L_0x009e;
                case 10: goto L_0x0092;
                case 11: goto L_0x0086;
                case 12: goto L_0x0074;
                case 13: goto L_0x0068;
                case 14: goto L_0x0058;
                case 15: goto L_0x004c;
                case 16: goto L_0x003d;
                case 17: goto L_0x001e;
                case 18: goto L_0x001e;
                case 19: goto L_0x001e;
                case 20: goto L_0x0031;
                case 21: goto L_0x0025;
                default: goto L_0x001e;
            }
        L_0x001e:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r7, r0)
            goto L_0x010c
        L_0x0025:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f599l = r0
            goto L_0x010c
        L_0x0031:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f598k = r0
            goto L_0x010c
        L_0x003d:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001e
            long r0 = r7.a()
            r6.f589c = r0
            r6.d(r4)
            goto L_0x010c
        L_0x004c:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f597j = r0
            goto L_0x010c
        L_0x0058:
            byte r1 = r0.f82422a
            r2 = 2
            if (r1 != r2) goto L_0x001e
            boolean r0 = r7.a()
            r6.f586a = r0
            r6.c(r4)
            goto L_0x010c
        L_0x0068:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f596i = r0
            goto L_0x010c
        L_0x0074:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001e
            com.xiaomi.push.ix r0 = new com.xiaomi.push.ix
            r0.<init>()
            r6.f582a = r0
            com.xiaomi.push.ix r0 = r6.f582a
            r0.a((com.xiaomi.push.kg) r7)
            goto L_0x010c
        L_0x0086:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f595h = r0
            goto L_0x010c
        L_0x0092:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f594g = r0
            goto L_0x010c
        L_0x009e:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f593f = r0
            goto L_0x010c
        L_0x00a9:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f592e = r0
            goto L_0x010c
        L_0x00b4:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f591d = r0
            goto L_0x010c
        L_0x00bf:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001e
            long r0 = r7.a()
            r6.f587b = r0
            r6.b((boolean) r4)
            goto L_0x010c
        L_0x00cd:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x001e
            long r0 = r7.a()
            r6.f581a = r0
            r6.a((boolean) r4)
            goto L_0x010c
        L_0x00db:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f590c = r0
            goto L_0x010c
        L_0x00e6:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f588b = r0
            goto L_0x010c
        L_0x00f1:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x001e
            java.lang.String r0 = r7.a()
            r6.f584a = r0
            goto L_0x010c
        L_0x00fc:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x001e
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r6.f583a = r0
            com.xiaomi.push.iz r0 = r6.f583a
            r0.a((com.xiaomi.push.kg) r7)
        L_0x010c:
            r7.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.iw.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f585a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m423a() {
        return this.f583a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m424a(iw iwVar) {
        if (iwVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = iwVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f583a.compareTo(iwVar.f583a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = iwVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f584a.equals(iwVar.f584a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = iwVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f588b.equals(iwVar.f588b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = iwVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f590c.equals(iwVar.f590c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = iwVar.e();
        if ((e2 || e3) && (!e2 || !e3 || this.f581a != iwVar.f581a)) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = iwVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f587b != iwVar.f587b)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = iwVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f591d.equals(iwVar.f591d))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = iwVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f592e.equals(iwVar.f592e))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = iwVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f593f.equals(iwVar.f593f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = iwVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f594g.equals(iwVar.f594g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = iwVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f595h.equals(iwVar.f595h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = iwVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f582a.compareTo(iwVar.f582a))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = iwVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f596i.equals(iwVar.f596i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = iwVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f586a != iwVar.f586a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = iwVar.o();
        if ((o2 || o3) && (!o2 || !o3 || !this.f597j.equals(iwVar.f597j))) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = iwVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f589c != iwVar.f589c)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = iwVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f598k.equals(iwVar.f598k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = iwVar.r();
        return (!r2 && !r3) || (r2 && r3 && this.f599l.equals(iwVar.f599l));
    }

    public String b() {
        return this.f588b;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f580a);
        if (this.f583a != null && a()) {
            kgVar.a(f82281a);
            this.f583a.b(kgVar);
            kgVar.b();
        }
        if (this.f584a != null) {
            kgVar.a(f82282b);
            kgVar.a(this.f584a);
            kgVar.b();
        }
        if (this.f588b != null) {
            kgVar.a(f82283c);
            kgVar.a(this.f588b);
            kgVar.b();
        }
        if (this.f590c != null) {
            kgVar.a(f82284d);
            kgVar.a(this.f590c);
            kgVar.b();
        }
        if (e()) {
            kgVar.a(f82285e);
            kgVar.a(this.f581a);
            kgVar.b();
        }
        if (f()) {
            kgVar.a(f82286f);
            kgVar.a(this.f587b);
            kgVar.b();
        }
        if (this.f591d != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f591d);
            kgVar.b();
        }
        if (this.f592e != null && h()) {
            kgVar.a(h);
            kgVar.a(this.f592e);
            kgVar.b();
        }
        if (this.f593f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f593f);
            kgVar.b();
        }
        if (this.f594g != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f594g);
            kgVar.b();
        }
        if (this.f595h != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f595h);
            kgVar.b();
        }
        if (this.f582a != null && l()) {
            kgVar.a(l);
            this.f582a.b(kgVar);
            kgVar.b();
        }
        if (this.f596i != null && m()) {
            kgVar.a(m);
            kgVar.a(this.f596i);
            kgVar.b();
        }
        if (n()) {
            kgVar.a(n);
            kgVar.a(this.f586a);
            kgVar.b();
        }
        if (this.f597j != null && o()) {
            kgVar.a(o);
            kgVar.a(this.f597j);
            kgVar.b();
        }
        if (p()) {
            kgVar.a(p);
            kgVar.a(this.f589c);
            kgVar.b();
        }
        if (this.f598k != null && q()) {
            kgVar.a(q);
            kgVar.a(this.f598k);
            kgVar.b();
        }
        if (this.f599l != null && r()) {
            kgVar.a(r);
            kgVar.a(this.f599l);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f585a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m425b() {
        return this.f584a != null;
    }

    public String c() {
        return this.f590c;
    }

    public void c(boolean z) {
        this.f585a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m426c() {
        return this.f588b != null;
    }

    public void d(boolean z) {
        this.f585a.set(3, z);
    }

    public boolean d() {
        return this.f590c != null;
    }

    public boolean e() {
        return this.f585a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof iw)) {
            return compareTo((iw) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f585a.get(1);
    }

    public boolean g() {
        return this.f591d != null;
    }

    public boolean h() {
        return this.f592e != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f593f != null;
    }

    public boolean j() {
        return this.f594g != null;
    }

    public boolean k() {
        return this.f595h != null;
    }

    public boolean l() {
        return this.f582a != null;
    }

    public boolean m() {
        return this.f596i != null;
    }

    public boolean n() {
        return this.f585a.get(2);
    }

    public boolean o() {
        return this.f597j != null;
    }

    public boolean p() {
        return this.f585a.get(3);
    }

    public boolean q() {
        return this.f598k != null;
    }

    public boolean r() {
        return this.f599l != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (a()) {
            sb.append("to:");
            if (this.f583a == null) {
                sb.append("null");
            } else {
                sb.append(this.f583a);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f584a == null ? "null" : this.f584a);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f588b == null ? "null" : this.f588b);
        sb.append(", ");
        sb.append("payload:");
        sb.append(this.f590c == null ? "null" : this.f590c);
        if (e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f581a);
        }
        if (f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f587b);
        }
        if (g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            sb.append(this.f591d == null ? "null" : this.f591d);
        }
        if (h()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f592e == null ? "null" : this.f592e);
        }
        if (i()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f593f == null ? "null" : this.f593f);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f594g == null ? "null" : this.f594g);
        }
        if (k()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f595h == null ? "null" : this.f595h);
        }
        if (l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            if (this.f582a == null) {
                sb.append("null");
            } else {
                sb.append(this.f582a);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f596i == null ? "null" : this.f596i);
        }
        if (n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f586a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.f597j == null ? "null" : this.f597j);
        }
        if (p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f589c);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            sb.append(this.f598k == null ? "null" : this.f598k);
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.f599l == null ? "null" : this.f599l);
        }
        sb.append(")");
        return sb.toString();
    }
}

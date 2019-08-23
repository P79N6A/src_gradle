package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.Map;

public class ja implements jv<ja, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82307a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f626a = new kl("XmPushActionAckMessage");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82308b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82309c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82310d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82311e = new kd("", (byte) 10, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82312f = new kd("", (byte) 11, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 12, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 11, 10);
    private static final kd k = new kd("", (byte) 2, 11);
    private static final kd l = new kd("", (byte) 11, 12);
    private static final kd m = new kd("", (byte) 11, 13);
    private static final kd n = new kd("", (byte) 11, 14);
    private static final kd o = new kd("", (byte) 6, 15);
    private static final kd p = new kd("", (byte) 6, 16);
    private static final kd q = new kd("", (byte) 11, 20);
    private static final kd r = new kd("", (byte) 11, 21);
    private static final kd s = new kd("", (byte) 8, 22);
    private static final kd t = new kd("", (byte) 13, 23);

    /* renamed from: a  reason: collision with other field name */
    public int f627a;

    /* renamed from: a  reason: collision with other field name */
    public long f628a;

    /* renamed from: a  reason: collision with other field name */
    public iz f629a;

    /* renamed from: a  reason: collision with other field name */
    public jn f630a;

    /* renamed from: a  reason: collision with other field name */
    public String f631a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f632a = new BitSet(5);

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f633a;

    /* renamed from: a  reason: collision with other field name */
    public short f634a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f635a = false;

    /* renamed from: b  reason: collision with other field name */
    public String f636b;

    /* renamed from: b  reason: collision with other field name */
    public short f637b;

    /* renamed from: c  reason: collision with other field name */
    public String f638c;

    /* renamed from: d  reason: collision with other field name */
    public String f639d;

    /* renamed from: e  reason: collision with other field name */
    public String f640e;

    /* renamed from: f  reason: collision with other field name */
    public String f641f;

    /* renamed from: g  reason: collision with other field name */
    public String f642g;

    /* renamed from: h  reason: collision with other field name */
    public String f643h;

    /* renamed from: i  reason: collision with other field name */
    public String f644i;

    /* renamed from: j  reason: collision with other field name */
    public String f645j;

    /* renamed from: k  reason: collision with other field name */
    public String f646k;

    /* renamed from: l  reason: collision with other field name */
    public String f647l;

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x031b, code lost:
        if (r5 == 0) goto L_0x031d;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.ja r5) {
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
            goto L_0x031f
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f631a
            java.lang.String r1 = r5.f631a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f629a
            com.xiaomi.push.iz r1 = r5.f629a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f636b
            java.lang.String r1 = r5.f636b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f638c
            java.lang.String r1 = r5.f638c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            long r0 = r4.f628a
            long r2 = r5.f628a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x031f
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = r4.f639d
            java.lang.String r1 = r5.f639d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f640e
            java.lang.String r1 = r5.f640e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            com.xiaomi.push.jn r0 = r4.f630a
            com.xiaomi.push.jn r1 = r5.f630a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f641f
            java.lang.String r1 = r5.f641f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r4.f642g
            java.lang.String r1 = r5.f642g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            boolean r0 = r4.f635a
            boolean r1 = r5.f635a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x031f
        L_0x01c7:
            boolean r0 = r4.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.l()
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r4.f643h
            java.lang.String r1 = r5.f643h
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x01ed:
            boolean r0 = r4.m()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x0213
            java.lang.String r0 = r4.f644i
            java.lang.String r1 = r5.f644i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0213:
            boolean r0 = r4.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.n()
            if (r0 == 0) goto L_0x0239
            java.lang.String r0 = r4.f645j
            java.lang.String r1 = r5.f645j
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0239:
            boolean r0 = r4.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x025f
            short r0 = r4.f634a
            short r1 = r5.f634a
            int r0 = com.xiaomi.push.jw.a((short) r0, (short) r1)
            if (r0 != 0) goto L_0x031f
        L_0x025f:
            boolean r0 = r4.p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.p()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.p()
            if (r0 == 0) goto L_0x0285
            short r0 = r4.f637b
            short r1 = r5.f637b
            int r0 = com.xiaomi.push.jw.a((short) r0, (short) r1)
            if (r0 != 0) goto L_0x031f
        L_0x0285:
            boolean r0 = r4.q()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.q()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.q()
            if (r0 == 0) goto L_0x02ab
            java.lang.String r0 = r4.f646k
            java.lang.String r1 = r5.f646k
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x02ab:
            boolean r0 = r4.r()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.r()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.r()
            if (r0 == 0) goto L_0x02d1
            java.lang.String r0 = r4.f647l
            java.lang.String r1 = r5.f647l
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x031f
        L_0x02d1:
            boolean r0 = r4.s()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.s()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.s()
            if (r0 == 0) goto L_0x02f7
            int r0 = r4.f627a
            int r1 = r5.f627a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x031f
        L_0x02f7:
            boolean r0 = r4.t()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.t()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x031f
            boolean r0 = r4.t()
            if (r0 == 0) goto L_0x031d
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f633a
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f633a
            int r5 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r5)
            if (r5 != 0) goto L_0x0022
        L_0x031d:
            r5 = 0
            r0 = 0
        L_0x031f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ja.compareTo(com.xiaomi.push.ja):int");
    }

    public ja a(long j2) {
        this.f628a = j2;
        a(true);
        return this;
    }

    public ja a(String str) {
        this.f636b = str;
        return this;
    }

    public ja a(short s2) {
        this.f634a = s2;
        c(true);
        return this;
    }

    public void a() {
        if (this.f636b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        } else if (this.f638c == null) {
            throw new kh("Required field 'appId' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0030
            r8.f()
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x0018
            r7.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r8 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'messageTs' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r7.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            short r1 = r0.f871a
            r2 = 6
            r3 = 2
            r4 = 12
            r5 = 1
            r6 = 11
            switch(r1) {
                case 1: goto L_0x0162;
                case 2: goto L_0x0151;
                case 3: goto L_0x0146;
                case 4: goto L_0x013b;
                case 5: goto L_0x012b;
                case 6: goto L_0x0120;
                case 7: goto L_0x0115;
                case 8: goto L_0x0104;
                case 9: goto L_0x00f8;
                case 10: goto L_0x00ec;
                case 11: goto L_0x00dd;
                case 12: goto L_0x00d1;
                case 13: goto L_0x00c5;
                case 14: goto L_0x00b9;
                case 15: goto L_0x00aa;
                case 16: goto L_0x009b;
                case 17: goto L_0x003c;
                case 18: goto L_0x003c;
                case 19: goto L_0x003c;
                case 20: goto L_0x008f;
                case 21: goto L_0x0083;
                case 22: goto L_0x0072;
                case 23: goto L_0x0043;
                default: goto L_0x003c;
            }
        L_0x003c:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r8, r0)
            goto L_0x016c
        L_0x0043:
            byte r1 = r0.f82422a
            r2 = 13
            if (r1 != r2) goto L_0x003c
            com.xiaomi.push.kf r0 = r8.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f873a
            int r2 = r2 * 2
            r1.<init>(r2)
            r7.f633a = r1
            r1 = 0
        L_0x0059:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x006d
            java.lang.String r2 = r8.a()
            java.lang.String r3 = r8.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f633a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0059
        L_0x006d:
            r8.h()
            goto L_0x016c
        L_0x0072:
            byte r1 = r0.f82422a
            r2 = 8
            if (r1 != r2) goto L_0x003c
            int r0 = r8.a()
            r7.f627a = r0
            r7.e(r5)
            goto L_0x016c
        L_0x0083:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f647l = r0
            goto L_0x016c
        L_0x008f:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f646k = r0
            goto L_0x016c
        L_0x009b:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x003c
            short r0 = r8.a()
            r7.f637b = r0
            r7.d((boolean) r5)
            goto L_0x016c
        L_0x00aa:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x003c
            short r0 = r8.a()
            r7.f634a = r0
            r7.c((boolean) r5)
            goto L_0x016c
        L_0x00b9:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f645j = r0
            goto L_0x016c
        L_0x00c5:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f644i = r0
            goto L_0x016c
        L_0x00d1:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f643h = r0
            goto L_0x016c
        L_0x00dd:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003c
            boolean r0 = r8.a()
            r7.f635a = r0
            r7.b((boolean) r5)
            goto L_0x016c
        L_0x00ec:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f642g = r0
            goto L_0x016c
        L_0x00f8:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f641f = r0
            goto L_0x016c
        L_0x0104:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003c
            com.xiaomi.push.jn r0 = new com.xiaomi.push.jn
            r0.<init>()
            r7.f630a = r0
            com.xiaomi.push.jn r0 = r7.f630a
            r0.a((com.xiaomi.push.kg) r8)
            goto L_0x016c
        L_0x0115:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f640e = r0
            goto L_0x016c
        L_0x0120:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f639d = r0
            goto L_0x016c
        L_0x012b:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x003c
            long r0 = r8.a()
            r7.f628a = r0
            r7.a((boolean) r5)
            goto L_0x016c
        L_0x013b:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f638c = r0
            goto L_0x016c
        L_0x0146:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f636b = r0
            goto L_0x016c
        L_0x0151:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003c
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r7.f629a = r0
            com.xiaomi.push.iz r0 = r7.f629a
            r0.a((com.xiaomi.push.kg) r8)
            goto L_0x016c
        L_0x0162:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003c
            java.lang.String r0 = r8.a()
            r7.f631a = r0
        L_0x016c:
            r8.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ja.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f632a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m446a() {
        return this.f631a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m447a(ja jaVar) {
        if (jaVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jaVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f631a.equals(jaVar.f631a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jaVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f629a.compareTo(jaVar.f629a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jaVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f636b.equals(jaVar.f636b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jaVar.d();
        if (((d2 || d3) && (!d2 || !d3 || !this.f638c.equals(jaVar.f638c))) || this.f628a != jaVar.f628a) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = jaVar.f();
        if ((f2 || f3) && (!f2 || !f3 || !this.f639d.equals(jaVar.f639d))) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jaVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f640e.equals(jaVar.f640e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jaVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f630a.compareTo(jaVar.f630a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jaVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f641f.equals(jaVar.f641f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jaVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f642g.equals(jaVar.f642g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jaVar.k();
        if ((k2 || k3) && (!k2 || !k3 || this.f635a != jaVar.f635a)) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jaVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f643h.equals(jaVar.f643h))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jaVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f644i.equals(jaVar.f644i))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jaVar.n();
        if ((n2 || n3) && (!n2 || !n3 || !this.f645j.equals(jaVar.f645j))) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jaVar.o();
        if ((o2 || o3) && (!o2 || !o3 || this.f634a != jaVar.f634a)) {
            return false;
        }
        boolean p2 = p();
        boolean p3 = jaVar.p();
        if ((p2 || p3) && (!p2 || !p3 || this.f637b != jaVar.f637b)) {
            return false;
        }
        boolean q2 = q();
        boolean q3 = jaVar.q();
        if ((q2 || q3) && (!q2 || !q3 || !this.f646k.equals(jaVar.f646k))) {
            return false;
        }
        boolean r2 = r();
        boolean r3 = jaVar.r();
        if ((r2 || r3) && (!r2 || !r3 || !this.f647l.equals(jaVar.f647l))) {
            return false;
        }
        boolean s2 = s();
        boolean s3 = jaVar.s();
        if ((s2 || s3) && (!s2 || !s3 || this.f627a != jaVar.f627a)) {
            return false;
        }
        boolean t2 = t();
        boolean t3 = jaVar.t();
        return (!t2 && !t3) || (t2 && t3 && this.f633a.equals(jaVar.f633a));
    }

    public ja b(String str) {
        this.f638c = str;
        return this;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f626a);
        if (this.f631a != null && a()) {
            kgVar.a(f82307a);
            kgVar.a(this.f631a);
            kgVar.b();
        }
        if (this.f629a != null && b()) {
            kgVar.a(f82308b);
            this.f629a.b(kgVar);
            kgVar.b();
        }
        if (this.f636b != null) {
            kgVar.a(f82309c);
            kgVar.a(this.f636b);
            kgVar.b();
        }
        if (this.f638c != null) {
            kgVar.a(f82310d);
            kgVar.a(this.f638c);
            kgVar.b();
        }
        kgVar.a(f82311e);
        kgVar.a(this.f628a);
        kgVar.b();
        if (this.f639d != null && f()) {
            kgVar.a(f82312f);
            kgVar.a(this.f639d);
            kgVar.b();
        }
        if (this.f640e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f640e);
            kgVar.b();
        }
        if (this.f630a != null && h()) {
            kgVar.a(h);
            this.f630a.b(kgVar);
            kgVar.b();
        }
        if (this.f641f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f641f);
            kgVar.b();
        }
        if (this.f642g != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f642g);
            kgVar.b();
        }
        if (k()) {
            kgVar.a(k);
            kgVar.a(this.f635a);
            kgVar.b();
        }
        if (this.f643h != null && l()) {
            kgVar.a(l);
            kgVar.a(this.f643h);
            kgVar.b();
        }
        if (this.f644i != null && m()) {
            kgVar.a(m);
            kgVar.a(this.f644i);
            kgVar.b();
        }
        if (this.f645j != null && n()) {
            kgVar.a(n);
            kgVar.a(this.f645j);
            kgVar.b();
        }
        if (o()) {
            kgVar.a(o);
            kgVar.a(this.f634a);
            kgVar.b();
        }
        if (p()) {
            kgVar.a(p);
            kgVar.a(this.f637b);
            kgVar.b();
        }
        if (this.f646k != null && q()) {
            kgVar.a(q);
            kgVar.a(this.f646k);
            kgVar.b();
        }
        if (this.f647l != null && r()) {
            kgVar.a(r);
            kgVar.a(this.f647l);
            kgVar.b();
        }
        if (s()) {
            kgVar.a(s);
            kgVar.a(this.f627a);
            kgVar.b();
        }
        if (this.f633a != null && t()) {
            kgVar.a(t);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f633a.size()));
            for (Map.Entry next : this.f633a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f632a.set(1, z);
    }

    public boolean b() {
        return this.f629a != null;
    }

    public ja c(String str) {
        this.f639d = str;
        return this;
    }

    public void c(boolean z) {
        this.f632a.set(2, z);
    }

    public boolean c() {
        return this.f636b != null;
    }

    public ja d(String str) {
        this.f640e = str;
        return this;
    }

    public void d(boolean z) {
        this.f632a.set(3, z);
    }

    public boolean d() {
        return this.f638c != null;
    }

    public void e(boolean z) {
        this.f632a.set(4, z);
    }

    public boolean e() {
        return this.f632a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ja)) {
            return compareTo((ja) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f639d != null;
    }

    public boolean g() {
        return this.f640e != null;
    }

    public boolean h() {
        return this.f630a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f641f != null;
    }

    public boolean j() {
        return this.f642g != null;
    }

    public boolean k() {
        return this.f632a.get(1);
    }

    public boolean l() {
        return this.f643h != null;
    }

    public boolean m() {
        return this.f644i != null;
    }

    public boolean n() {
        return this.f645j != null;
    }

    public boolean o() {
        return this.f632a.get(2);
    }

    public boolean p() {
        return this.f632a.get(3);
    }

    public boolean q() {
        return this.f646k != null;
    }

    public boolean r() {
        return this.f647l != null;
    }

    public boolean s() {
        return this.f632a.get(4);
    }

    public boolean t() {
        return this.f633a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionAckMessage(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f631a == null ? "null" : this.f631a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f629a == null) {
                sb.append("null");
            } else {
                sb.append(this.f629a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f636b == null ? "null" : this.f636b);
        sb.append(", ");
        sb.append("appId:");
        sb.append(this.f638c == null ? "null" : this.f638c);
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f628a);
        if (f()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f639d == null ? "null" : this.f639d);
        }
        if (g()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f640e == null ? "null" : this.f640e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("request:");
            if (this.f630a == null) {
                sb.append("null");
            } else {
                sb.append(this.f630a);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f641f == null ? "null" : this.f641f);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f642g == null ? "null" : this.f642g);
        }
        if (k()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f635a);
        }
        if (l()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f643h == null ? "null" : this.f643h);
        }
        if (m()) {
            sb.append(", ");
            sb.append("callbackUrl:");
            sb.append(this.f644i == null ? "null" : this.f644i);
        }
        if (n()) {
            sb.append(", ");
            sb.append("userAccount:");
            sb.append(this.f645j == null ? "null" : this.f645j);
        }
        if (o()) {
            sb.append(", ");
            sb.append("deviceStatus:");
            sb.append(this.f634a);
        }
        if (p()) {
            sb.append(", ");
            sb.append("geoMsgStatus:");
            sb.append(this.f637b);
        }
        if (q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            sb.append(this.f646k == null ? "null" : this.f646k);
        }
        if (r()) {
            sb.append(", ");
            sb.append("deviceId:");
            sb.append(this.f647l == null ? "null" : this.f647l);
        }
        if (s()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f627a);
        }
        if (t()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f633a == null) {
                sb.append("null");
            } else {
                sb.append(this.f633a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

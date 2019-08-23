package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class jj implements jv<jj, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82342a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f704a = new kl("XmPushActionNotification");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82343b = new kd("", (byte) 12, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82344c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82345d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82346e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82347f = new kd("", (byte) 2, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 13, 8);
    private static final kd i = new kd("", (byte) 11, 9);
    private static final kd j = new kd("", (byte) 11, 10);
    private static final kd k = new kd("", (byte) 11, 12);
    private static final kd l = new kd("", (byte) 11, 13);
    private static final kd m = new kd("", (byte) 11, 14);
    private static final kd n = new kd("", (byte) 10, 15);
    private static final kd o = new kd("", (byte) 2, 20);

    /* renamed from: a  reason: collision with other field name */
    public long f705a;

    /* renamed from: a  reason: collision with other field name */
    public iz f706a;

    /* renamed from: a  reason: collision with other field name */
    public String f707a;

    /* renamed from: a  reason: collision with other field name */
    public ByteBuffer f708a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f709a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f710a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f711a;

    /* renamed from: b  reason: collision with other field name */
    public String f712b;

    /* renamed from: b  reason: collision with other field name */
    public boolean f713b;

    /* renamed from: c  reason: collision with other field name */
    public String f714c;

    /* renamed from: d  reason: collision with other field name */
    public String f715d;

    /* renamed from: e  reason: collision with other field name */
    public String f716e;

    /* renamed from: f  reason: collision with other field name */
    public String f717f;

    /* renamed from: g  reason: collision with other field name */
    public String f718g;

    /* renamed from: h  reason: collision with other field name */
    public String f719h;

    /* renamed from: i  reason: collision with other field name */
    public String f720i;

    public jj() {
        this.f709a = new BitSet(3);
        this.f711a = true;
        this.f713b = false;
    }

    public jj(String str, boolean z) {
        this();
        this.f712b = str;
        this.f711a = z;
        a(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025d, code lost:
        if (r5 == 0) goto L_0x025f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.jj r5) {
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
            goto L_0x0261
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f707a
            java.lang.String r1 = r5.f707a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.iz r0 = r4.f706a
            com.xiaomi.push.iz r1 = r5.f706a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0261
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f712b
            java.lang.String r1 = r5.f712b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f714c
            java.lang.String r1 = r5.f714c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r4.f715d
            java.lang.String r1 = r5.f715d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            boolean r0 = r4.f711a
            boolean r1 = r5.f711a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x0261
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f716e
            java.lang.String r1 = r5.f716e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f710a
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f710a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x0261
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = r4.f717f
            java.lang.String r1 = r5.f717f
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.lang.String r0 = r4.f718g
            java.lang.String r1 = r5.f718g
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = r4.f719h
            java.lang.String r1 = r5.f719h
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x01c7:
            boolean r0 = r4.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.l()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.l()
            if (r0 == 0) goto L_0x01ed
            java.lang.String r0 = r4.f720i
            java.lang.String r1 = r5.f720i
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0261
        L_0x01ed:
            boolean r0 = r4.m()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x0213
            java.nio.ByteBuffer r0 = r4.f708a
            java.nio.ByteBuffer r1 = r5.f708a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0261
        L_0x0213:
            boolean r0 = r4.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.n()
            if (r0 == 0) goto L_0x0239
            long r0 = r4.f705a
            long r2 = r5.f705a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x0261
        L_0x0239:
            boolean r0 = r4.o()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.o()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0261
            boolean r0 = r4.o()
            if (r0 == 0) goto L_0x025f
            boolean r0 = r4.f713b
            boolean r5 = r5.f713b
            int r5 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r5)
            if (r5 != 0) goto L_0x0022
        L_0x025f:
            r5 = 0
            r0 = 0
        L_0x0261:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jj.compareTo(com.xiaomi.push.jj):int");
    }

    public jj a(String str) {
        this.f712b = str;
        return this;
    }

    public jj a(ByteBuffer byteBuffer) {
        this.f708a = byteBuffer;
        return this;
    }

    public jj a(Map<String, String> map) {
        this.f710a = map;
        return this;
    }

    public jj a(boolean z) {
        this.f711a = z;
        a(true);
        return this;
    }

    public jj a(byte[] bArr) {
        a(ByteBuffer.wrap(bArr));
        return this;
    }

    public String a() {
        return this.f712b;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m480a() {
        return this.f710a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m481a() {
        if (this.f712b == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0030
            r6.f()
            boolean r6 = r5.f()
            if (r6 == 0) goto L_0x0018
            r5.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r6 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'requireAck' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r5.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0030:
            short r1 = r0.f871a
            r2 = 20
            r3 = 2
            r4 = 1
            if (r1 == r2) goto L_0x011a
            r2 = 11
            switch(r1) {
                case 1: goto L_0x010f;
                case 2: goto L_0x00fc;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00e6;
                case 5: goto L_0x00db;
                case 6: goto L_0x00cd;
                case 7: goto L_0x00c2;
                case 8: goto L_0x0094;
                case 9: goto L_0x0088;
                case 10: goto L_0x007c;
                default: goto L_0x003d;
            }
        L_0x003d:
            switch(r1) {
                case 12: goto L_0x0070;
                case 13: goto L_0x0064;
                case 14: goto L_0x0058;
                case 15: goto L_0x0047;
                default: goto L_0x0040;
            }
        L_0x0040:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r6, r0)
            goto L_0x0127
        L_0x0047:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0040
            long r0 = r6.a()
            r5.f705a = r0
            r5.b((boolean) r4)
            goto L_0x0127
        L_0x0058:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.nio.ByteBuffer r0 = r6.a()
            r5.f708a = r0
            goto L_0x0127
        L_0x0064:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f720i = r0
            goto L_0x0127
        L_0x0070:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f719h = r0
            goto L_0x0127
        L_0x007c:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f718g = r0
            goto L_0x0127
        L_0x0088:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f717f = r0
            goto L_0x0127
        L_0x0094:
            byte r1 = r0.f82422a
            r2 = 13
            if (r1 != r2) goto L_0x0040
            com.xiaomi.push.kf r0 = r6.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r2 = r0.f873a
            int r2 = r2 * 2
            r1.<init>(r2)
            r5.f710a = r1
            r1 = 0
        L_0x00aa:
            int r2 = r0.f873a
            if (r1 >= r2) goto L_0x00be
            java.lang.String r2 = r6.a()
            java.lang.String r3 = r6.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r5.f710a
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x00aa
        L_0x00be:
            r6.h()
            goto L_0x0127
        L_0x00c2:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f716e = r0
            goto L_0x0127
        L_0x00cd:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0040
            boolean r0 = r6.a()
            r5.f711a = r0
            r5.a((boolean) r4)
            goto L_0x0127
        L_0x00db:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f715d = r0
            goto L_0x0127
        L_0x00e6:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f714c = r0
            goto L_0x0127
        L_0x00f1:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f712b = r0
            goto L_0x0127
        L_0x00fc:
            byte r1 = r0.f82422a
            r2 = 12
            if (r1 != r2) goto L_0x0040
            com.xiaomi.push.iz r0 = new com.xiaomi.push.iz
            r0.<init>()
            r5.f706a = r0
            com.xiaomi.push.iz r0 = r5.f706a
            r0.a((com.xiaomi.push.kg) r6)
            goto L_0x0127
        L_0x010f:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0040
            java.lang.String r0 = r6.a()
            r5.f707a = r0
            goto L_0x0127
        L_0x011a:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x0040
            boolean r0 = r6.a()
            r5.f713b = r0
            r5.c((boolean) r4)
        L_0x0127:
            r6.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.jj.a(com.xiaomi.push.kg):void");
    }

    public void a(String str, String str2) {
        if (this.f710a == null) {
            this.f710a = new HashMap();
        }
        this.f710a.put(str, str2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m482a(boolean z) {
        this.f709a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m483a() {
        return this.f707a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m484a(jj jjVar) {
        if (jjVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = jjVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f707a.equals(jjVar.f707a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = jjVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f706a.compareTo(jjVar.f706a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = jjVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f712b.equals(jjVar.f712b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = jjVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f714c.equals(jjVar.f714c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = jjVar.e();
        if (((e2 || e3) && (!e2 || !e3 || !this.f715d.equals(jjVar.f715d))) || this.f711a != jjVar.f711a) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = jjVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f716e.equals(jjVar.f716e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = jjVar.h();
        if ((h2 || h3) && (!h2 || !h3 || !this.f710a.equals(jjVar.f710a))) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = jjVar.i();
        if ((i2 || i3) && (!i2 || !i3 || !this.f717f.equals(jjVar.f717f))) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = jjVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f718g.equals(jjVar.f718g))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = jjVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f719h.equals(jjVar.f719h))) {
            return false;
        }
        boolean l2 = l();
        boolean l3 = jjVar.l();
        if ((l2 || l3) && (!l2 || !l3 || !this.f720i.equals(jjVar.f720i))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = jjVar.m();
        if ((m2 || m3) && (!m2 || !m3 || !this.f708a.equals(jjVar.f708a))) {
            return false;
        }
        boolean n2 = n();
        boolean n3 = jjVar.n();
        if ((n2 || n3) && (!n2 || !n3 || this.f705a != jjVar.f705a)) {
            return false;
        }
        boolean o2 = o();
        boolean o3 = jjVar.o();
        return (!o2 && !o3) || (o2 && o3 && this.f713b == jjVar.f713b);
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m485a() {
        a(jw.a(this.f708a));
        return this.f708a.array();
    }

    public jj b(String str) {
        this.f714c = str;
        return this;
    }

    public String b() {
        return this.f714c;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f704a);
        if (this.f707a != null && a()) {
            kgVar.a(f82342a);
            kgVar.a(this.f707a);
            kgVar.b();
        }
        if (this.f706a != null && b()) {
            kgVar.a(f82343b);
            this.f706a.b(kgVar);
            kgVar.b();
        }
        if (this.f712b != null) {
            kgVar.a(f82344c);
            kgVar.a(this.f712b);
            kgVar.b();
        }
        if (this.f714c != null && d()) {
            kgVar.a(f82345d);
            kgVar.a(this.f714c);
            kgVar.b();
        }
        if (this.f715d != null && e()) {
            kgVar.a(f82346e);
            kgVar.a(this.f715d);
            kgVar.b();
        }
        kgVar.a(f82347f);
        kgVar.a(this.f711a);
        kgVar.b();
        if (this.f716e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f716e);
            kgVar.b();
        }
        if (this.f710a != null && h()) {
            kgVar.a(h);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f710a.size()));
            for (Map.Entry next : this.f710a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (this.f717f != null && i()) {
            kgVar.a(i);
            kgVar.a(this.f717f);
            kgVar.b();
        }
        if (this.f718g != null && j()) {
            kgVar.a(j);
            kgVar.a(this.f718g);
            kgVar.b();
        }
        if (this.f719h != null && k()) {
            kgVar.a(k);
            kgVar.a(this.f719h);
            kgVar.b();
        }
        if (this.f720i != null && l()) {
            kgVar.a(l);
            kgVar.a(this.f720i);
            kgVar.b();
        }
        if (this.f708a != null && m()) {
            kgVar.a(m);
            kgVar.a(this.f708a);
            kgVar.b();
        }
        if (n()) {
            kgVar.a(n);
            kgVar.a(this.f705a);
            kgVar.b();
        }
        if (o()) {
            kgVar.a(o);
            kgVar.a(this.f713b);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(boolean z) {
        this.f709a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m486b() {
        return this.f706a != null;
    }

    public jj c(String str) {
        this.f715d = str;
        return this;
    }

    public String c() {
        return this.f717f;
    }

    public void c(boolean z) {
        this.f709a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m487c() {
        return this.f712b != null;
    }

    public jj d(String str) {
        this.f717f = str;
        return this;
    }

    public boolean d() {
        return this.f714c != null;
    }

    public boolean e() {
        return this.f715d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof jj)) {
            return compareTo((jj) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f709a.get(0);
    }

    public boolean g() {
        return this.f716e != null;
    }

    public boolean h() {
        return this.f710a != null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f717f != null;
    }

    public boolean j() {
        return this.f718g != null;
    }

    public boolean k() {
        return this.f719h != null;
    }

    public boolean l() {
        return this.f720i != null;
    }

    public boolean m() {
        return this.f708a != null;
    }

    public boolean n() {
        return this.f709a.get(1);
    }

    public boolean o() {
        return this.f709a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (a()) {
            sb.append("debug:");
            sb.append(this.f707a == null ? "null" : this.f707a);
            z = false;
        } else {
            z = true;
        }
        if (b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            if (this.f706a == null) {
                sb.append("null");
            } else {
                sb.append(this.f706a);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        sb.append(this.f712b == null ? "null" : this.f712b);
        if (d()) {
            sb.append(", ");
            sb.append("appId:");
            sb.append(this.f714c == null ? "null" : this.f714c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("type:");
            sb.append(this.f715d == null ? "null" : this.f715d);
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f711a);
        if (g()) {
            sb.append(", ");
            sb.append("payload:");
            sb.append(this.f716e == null ? "null" : this.f716e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f710a == null) {
                sb.append("null");
            } else {
                sb.append(this.f710a);
            }
        }
        if (i()) {
            sb.append(", ");
            sb.append("packageName:");
            sb.append(this.f717f == null ? "null" : this.f717f);
        }
        if (j()) {
            sb.append(", ");
            sb.append("category:");
            sb.append(this.f718g == null ? "null" : this.f718g);
        }
        if (k()) {
            sb.append(", ");
            sb.append("regId:");
            sb.append(this.f719h == null ? "null" : this.f719h);
        }
        if (l()) {
            sb.append(", ");
            sb.append("aliasName:");
            sb.append(this.f720i == null ? "null" : this.f720i);
        }
        if (m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            if (this.f708a == null) {
                sb.append("null");
            } else {
                jw.a(this.f708a, sb);
            }
        }
        if (n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f705a);
        }
        if (o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f713b);
        }
        sb.append(")");
        return sb.toString();
    }
}

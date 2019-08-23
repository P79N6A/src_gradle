package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

public class ix implements jv<ix, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82287a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f600a = new kl("PushMetaInfo");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82288b = new kd("", (byte) 10, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82289c = new kd("", (byte) 11, 3);

    /* renamed from: d  reason: collision with root package name */
    private static final kd f82290d = new kd("", (byte) 11, 4);

    /* renamed from: e  reason: collision with root package name */
    private static final kd f82291e = new kd("", (byte) 11, 5);

    /* renamed from: f  reason: collision with root package name */
    private static final kd f82292f = new kd("", (byte) 8, 6);
    private static final kd g = new kd("", (byte) 11, 7);
    private static final kd h = new kd("", (byte) 8, 8);
    private static final kd i = new kd("", (byte) 8, 9);
    private static final kd j = new kd("", (byte) 13, 10);
    private static final kd k = new kd("", (byte) 13, 11);
    private static final kd l = new kd("", (byte) 2, 12);
    private static final kd m = new kd("", (byte) 13, 13);

    /* renamed from: a  reason: collision with other field name */
    public int f601a;

    /* renamed from: a  reason: collision with other field name */
    public long f602a;

    /* renamed from: a  reason: collision with other field name */
    public String f603a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f604a;

    /* renamed from: a  reason: collision with other field name */
    public Map<String, String> f605a;

    /* renamed from: a  reason: collision with other field name */
    public boolean f606a;

    /* renamed from: b  reason: collision with other field name */
    public int f607b;

    /* renamed from: b  reason: collision with other field name */
    public String f608b;

    /* renamed from: b  reason: collision with other field name */
    public Map<String, String> f609b;

    /* renamed from: c  reason: collision with other field name */
    public int f610c;

    /* renamed from: c  reason: collision with other field name */
    public String f611c;

    /* renamed from: c  reason: collision with other field name */
    public Map<String, String> f612c;

    /* renamed from: d  reason: collision with other field name */
    public String f613d;

    /* renamed from: e  reason: collision with other field name */
    public String f614e;

    public ix() {
        this.f604a = new BitSet(5);
        this.f606a = false;
    }

    public ix(ix ixVar) {
        this.f604a = new BitSet(5);
        this.f604a.clear();
        this.f604a.or(ixVar.f604a);
        if (ixVar.a()) {
            this.f603a = ixVar.f603a;
        }
        this.f602a = ixVar.f602a;
        if (ixVar.c()) {
            this.f608b = ixVar.f608b;
        }
        if (ixVar.d()) {
            this.f611c = ixVar.f611c;
        }
        if (ixVar.e()) {
            this.f613d = ixVar.f613d;
        }
        this.f601a = ixVar.f601a;
        if (ixVar.g()) {
            this.f614e = ixVar.f614e;
        }
        this.f607b = ixVar.f607b;
        this.f610c = ixVar.f610c;
        if (ixVar.j()) {
            HashMap hashMap = new HashMap();
            for (Map.Entry next : ixVar.f605a.entrySet()) {
                hashMap.put((String) next.getKey(), (String) next.getValue());
            }
            this.f605a = hashMap;
        }
        if (ixVar.k()) {
            HashMap hashMap2 = new HashMap();
            for (Map.Entry next2 : ixVar.f609b.entrySet()) {
                hashMap2.put((String) next2.getKey(), (String) next2.getValue());
            }
            this.f609b = hashMap2;
        }
        this.f606a = ixVar.f606a;
        if (ixVar.n()) {
            HashMap hashMap3 = new HashMap();
            for (Map.Entry next3 : ixVar.f612c.entrySet()) {
                hashMap3.put((String) next3.getKey(), (String) next3.getValue());
            }
            this.f612c = hashMap3;
        }
    }

    public int a() {
        return this.f601a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0211, code lost:
        if (r5 == 0) goto L_0x0213;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.ix r5) {
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
            goto L_0x0215
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r4.f603a
            java.lang.String r1 = r5.f603a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0215
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            long r0 = r4.f602a
            long r2 = r5.f602a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x0215
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f608b
            java.lang.String r1 = r5.f608b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0215
        L_0x0097:
            boolean r0 = r4.d()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.d()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.d()
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = r4.f611c
            java.lang.String r1 = r5.f611c
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0215
        L_0x00bd:
            boolean r0 = r4.e()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.e()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.e()
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = r4.f613d
            java.lang.String r1 = r5.f613d
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0215
        L_0x00e3:
            boolean r0 = r4.f()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.f()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.f()
            if (r0 == 0) goto L_0x0109
            int r0 = r4.f601a
            int r1 = r5.f601a
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0215
        L_0x0109:
            boolean r0 = r4.g()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.g()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.g()
            if (r0 == 0) goto L_0x012f
            java.lang.String r0 = r4.f614e
            java.lang.String r1 = r5.f614e
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x0215
        L_0x012f:
            boolean r0 = r4.h()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.h()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.h()
            if (r0 == 0) goto L_0x0155
            int r0 = r4.f607b
            int r1 = r5.f607b
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0215
        L_0x0155:
            boolean r0 = r4.i()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.i()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.i()
            if (r0 == 0) goto L_0x017b
            int r0 = r4.f610c
            int r1 = r5.f610c
            int r0 = com.xiaomi.push.jw.a((int) r0, (int) r1)
            if (r0 != 0) goto L_0x0215
        L_0x017b:
            boolean r0 = r4.j()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.j()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.j()
            if (r0 == 0) goto L_0x01a1
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f605a
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f605a
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x0215
        L_0x01a1:
            boolean r0 = r4.k()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.k()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.k()
            if (r0 == 0) goto L_0x01c7
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f609b
            java.util.Map<java.lang.String, java.lang.String> r1 = r5.f609b
            int r0 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r1)
            if (r0 != 0) goto L_0x0215
        L_0x01c7:
            boolean r0 = r4.m()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.m()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.m()
            if (r0 == 0) goto L_0x01ed
            boolean r0 = r4.f606a
            boolean r1 = r5.f606a
            int r0 = com.xiaomi.push.jw.a((boolean) r0, (boolean) r1)
            if (r0 != 0) goto L_0x0215
        L_0x01ed:
            boolean r0 = r4.n()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.n()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0215
            boolean r0 = r4.n()
            if (r0 == 0) goto L_0x0213
            java.util.Map<java.lang.String, java.lang.String> r0 = r4.f612c
            java.util.Map<java.lang.String, java.lang.String> r5 = r5.f612c
            int r5 = com.xiaomi.push.jw.a((java.util.Map) r0, (java.util.Map) r5)
            if (r5 != 0) goto L_0x0022
        L_0x0213:
            r5 = 0
            r0 = 0
        L_0x0215:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ix.compareTo(com.xiaomi.push.ix):int");
    }

    /* renamed from: a  reason: collision with other method in class */
    public long m427a() {
        return this.f602a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public ix m428a() {
        return new ix(this);
    }

    public ix a(int i2) {
        this.f601a = i2;
        b(true);
        return this;
    }

    public ix a(String str) {
        this.f603a = str;
        return this;
    }

    public ix a(Map<String, String> map) {
        this.f605a = map;
        return this;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m429a() {
        return this.f603a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public Map<String, String> m430a() {
        return this.f605a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m431a() {
        if (this.f603a == null) {
            throw new kh("Required field 'id' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r9.h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r9) {
        /*
            r8 = this;
            r9.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r9.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0030
            r9.f()
            boolean r9 = r8.b()
            if (r9 == 0) goto L_0x0018
            r8.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r9 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'messageTs' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r8.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L_0x0030:
            short r1 = r0.f871a
            r2 = 0
            r3 = 13
            r4 = 8
            r5 = 2
            r6 = 11
            r7 = 1
            switch(r1) {
                case 1: goto L_0x0134;
                case 2: goto L_0x0124;
                case 3: goto L_0x0119;
                case 4: goto L_0x010e;
                case 5: goto L_0x0103;
                case 6: goto L_0x00f5;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00ce;
                case 10: goto L_0x00a2;
                case 11: goto L_0x007b;
                case 12: goto L_0x006c;
                case 13: goto L_0x0045;
                default: goto L_0x003e;
            }
        L_0x003e:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r9, r0)
            goto L_0x013e
        L_0x0045:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003e
            com.xiaomi.push.kf r0 = r9.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f873a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f612c = r1
        L_0x0058:
            int r1 = r0.f873a
            if (r2 >= r1) goto L_0x00c9
            java.lang.String r1 = r9.a()
            java.lang.String r3 = r9.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f612c
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x0058
        L_0x006c:
            byte r1 = r0.f82422a
            if (r1 != r5) goto L_0x003e
            boolean r0 = r9.a()
            r8.f606a = r0
            r8.e(r7)
            goto L_0x013e
        L_0x007b:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003e
            com.xiaomi.push.kf r0 = r9.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f873a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f609b = r1
        L_0x008e:
            int r1 = r0.f873a
            if (r2 >= r1) goto L_0x00c9
            java.lang.String r1 = r9.a()
            java.lang.String r3 = r9.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f609b
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x008e
        L_0x00a2:
            byte r1 = r0.f82422a
            if (r1 != r3) goto L_0x003e
            com.xiaomi.push.kf r0 = r9.a()
            java.util.HashMap r1 = new java.util.HashMap
            int r3 = r0.f873a
            int r3 = r3 * 2
            r1.<init>(r3)
            r8.f605a = r1
        L_0x00b5:
            int r1 = r0.f873a
            if (r2 >= r1) goto L_0x00c9
            java.lang.String r1 = r9.a()
            java.lang.String r3 = r9.a()
            java.util.Map<java.lang.String, java.lang.String> r4 = r8.f605a
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00c9:
            r9.h()
            goto L_0x013e
        L_0x00ce:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003e
            int r0 = r9.a()
            r8.f610c = r0
            r8.d((boolean) r7)
            goto L_0x013e
        L_0x00dc:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003e
            int r0 = r9.a()
            r8.f607b = r0
            r8.c((boolean) r7)
            goto L_0x013e
        L_0x00ea:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003e
            java.lang.String r0 = r9.a()
            r8.f614e = r0
            goto L_0x013e
        L_0x00f5:
            byte r1 = r0.f82422a
            if (r1 != r4) goto L_0x003e
            int r0 = r9.a()
            r8.f601a = r0
            r8.b((boolean) r7)
            goto L_0x013e
        L_0x0103:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003e
            java.lang.String r0 = r9.a()
            r8.f613d = r0
            goto L_0x013e
        L_0x010e:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003e
            java.lang.String r0 = r9.a()
            r8.f611c = r0
            goto L_0x013e
        L_0x0119:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003e
            java.lang.String r0 = r9.a()
            r8.f608b = r0
            goto L_0x013e
        L_0x0124:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x003e
            long r0 = r9.a()
            r8.f602a = r0
            r8.a((boolean) r7)
            goto L_0x013e
        L_0x0134:
            byte r1 = r0.f82422a
            if (r1 != r6) goto L_0x003e
            java.lang.String r0 = r9.a()
            r8.f603a = r0
        L_0x013e:
            r9.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ix.a(com.xiaomi.push.kg):void");
    }

    public void a(String str, String str2) {
        if (this.f605a == null) {
            this.f605a = new HashMap();
        }
        this.f605a.put(str, str2);
    }

    public void a(boolean z) {
        this.f604a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m432a() {
        return this.f603a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m433a(ix ixVar) {
        if (ixVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = ixVar.a();
        if (((a2 || a3) && (!a2 || !a3 || !this.f603a.equals(ixVar.f603a))) || this.f602a != ixVar.f602a) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ixVar.c();
        if ((c2 || c3) && (!c2 || !c3 || !this.f608b.equals(ixVar.f608b))) {
            return false;
        }
        boolean d2 = d();
        boolean d3 = ixVar.d();
        if ((d2 || d3) && (!d2 || !d3 || !this.f611c.equals(ixVar.f611c))) {
            return false;
        }
        boolean e2 = e();
        boolean e3 = ixVar.e();
        if ((e2 || e3) && (!e2 || !e3 || !this.f613d.equals(ixVar.f613d))) {
            return false;
        }
        boolean f2 = f();
        boolean f3 = ixVar.f();
        if ((f2 || f3) && (!f2 || !f3 || this.f601a != ixVar.f601a)) {
            return false;
        }
        boolean g2 = g();
        boolean g3 = ixVar.g();
        if ((g2 || g3) && (!g2 || !g3 || !this.f614e.equals(ixVar.f614e))) {
            return false;
        }
        boolean h2 = h();
        boolean h3 = ixVar.h();
        if ((h2 || h3) && (!h2 || !h3 || this.f607b != ixVar.f607b)) {
            return false;
        }
        boolean i2 = i();
        boolean i3 = ixVar.i();
        if ((i2 || i3) && (!i2 || !i3 || this.f610c != ixVar.f610c)) {
            return false;
        }
        boolean j2 = j();
        boolean j3 = ixVar.j();
        if ((j2 || j3) && (!j2 || !j3 || !this.f605a.equals(ixVar.f605a))) {
            return false;
        }
        boolean k2 = k();
        boolean k3 = ixVar.k();
        if ((k2 || k3) && (!k2 || !k3 || !this.f609b.equals(ixVar.f609b))) {
            return false;
        }
        boolean m2 = m();
        boolean m3 = ixVar.m();
        if ((m2 || m3) && (!m2 || !m3 || this.f606a != ixVar.f606a)) {
            return false;
        }
        boolean n = n();
        boolean n2 = ixVar.n();
        return (!n && !n2) || (n && n2 && this.f612c.equals(ixVar.f612c));
    }

    public int b() {
        return this.f607b;
    }

    public ix b(int i2) {
        this.f607b = i2;
        c(true);
        return this;
    }

    public ix b(String str) {
        this.f608b = str;
        return this;
    }

    /* renamed from: b  reason: collision with other method in class */
    public String m434b() {
        return this.f608b;
    }

    /* renamed from: b  reason: collision with other method in class */
    public Map<String, String> m435b() {
        return this.f609b;
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f600a);
        if (this.f603a != null) {
            kgVar.a(f82287a);
            kgVar.a(this.f603a);
            kgVar.b();
        }
        kgVar.a(f82288b);
        kgVar.a(this.f602a);
        kgVar.b();
        if (this.f608b != null && c()) {
            kgVar.a(f82289c);
            kgVar.a(this.f608b);
            kgVar.b();
        }
        if (this.f611c != null && d()) {
            kgVar.a(f82290d);
            kgVar.a(this.f611c);
            kgVar.b();
        }
        if (this.f613d != null && e()) {
            kgVar.a(f82291e);
            kgVar.a(this.f613d);
            kgVar.b();
        }
        if (f()) {
            kgVar.a(f82292f);
            kgVar.a(this.f601a);
            kgVar.b();
        }
        if (this.f614e != null && g()) {
            kgVar.a(g);
            kgVar.a(this.f614e);
            kgVar.b();
        }
        if (h()) {
            kgVar.a(h);
            kgVar.a(this.f607b);
            kgVar.b();
        }
        if (i()) {
            kgVar.a(i);
            kgVar.a(this.f610c);
            kgVar.b();
        }
        if (this.f605a != null && j()) {
            kgVar.a(j);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f605a.size()));
            for (Map.Entry next : this.f605a.entrySet()) {
                kgVar.a((String) next.getKey());
                kgVar.a((String) next.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (this.f609b != null && k()) {
            kgVar.a(k);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f609b.size()));
            for (Map.Entry next2 : this.f609b.entrySet()) {
                kgVar.a((String) next2.getKey());
                kgVar.a((String) next2.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        if (m()) {
            kgVar.a(l);
            kgVar.a(this.f606a);
            kgVar.b();
        }
        if (this.f612c != null && n()) {
            kgVar.a(m);
            kgVar.a(new kf((byte) 11, (byte) 11, this.f612c.size()));
            for (Map.Entry next3 : this.f612c.entrySet()) {
                kgVar.a((String) next3.getKey());
                kgVar.a((String) next3.getValue());
            }
            kgVar.d();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public void b(String str, String str2) {
        if (this.f609b == null) {
            this.f609b = new HashMap();
        }
        this.f609b.put(str, str2);
    }

    public void b(boolean z) {
        this.f604a.set(1, z);
    }

    /* renamed from: b  reason: collision with other method in class */
    public boolean m436b() {
        return this.f604a.get(0);
    }

    public int c() {
        return this.f610c;
    }

    public ix c(int i2) {
        this.f610c = i2;
        d(true);
        return this;
    }

    public ix c(String str) {
        this.f611c = str;
        return this;
    }

    /* renamed from: c  reason: collision with other method in class */
    public String m437c() {
        return this.f611c;
    }

    public void c(boolean z) {
        this.f604a.set(2, z);
    }

    /* renamed from: c  reason: collision with other method in class */
    public boolean m438c() {
        return this.f608b != null;
    }

    public ix d(String str) {
        this.f613d = str;
        return this;
    }

    public String d() {
        return this.f613d;
    }

    public void d(boolean z) {
        this.f604a.set(3, z);
    }

    /* renamed from: d  reason: collision with other method in class */
    public boolean m439d() {
        return this.f611c != null;
    }

    public void e(boolean z) {
        this.f604a.set(4, z);
    }

    public boolean e() {
        return this.f613d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ix)) {
            return compareTo((ix) obj);
        }
        return false;
    }

    public boolean f() {
        return this.f604a.get(1);
    }

    public boolean g() {
        return this.f614e != null;
    }

    public boolean h() {
        return this.f604a.get(2);
    }

    public int hashCode() {
        return 0;
    }

    public boolean i() {
        return this.f604a.get(3);
    }

    public boolean j() {
        return this.f605a != null;
    }

    public boolean k() {
        return this.f609b != null;
    }

    public boolean l() {
        return this.f606a;
    }

    public boolean m() {
        return this.f604a.get(4);
    }

    public boolean n() {
        return this.f612c != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMetaInfo(");
        sb.append("id:");
        sb.append(this.f603a == null ? "null" : this.f603a);
        sb.append(", ");
        sb.append("messageTs:");
        sb.append(this.f602a);
        if (c()) {
            sb.append(", ");
            sb.append("topic:");
            sb.append(this.f608b == null ? "null" : this.f608b);
        }
        if (d()) {
            sb.append(", ");
            sb.append("title:");
            sb.append(this.f611c == null ? "null" : this.f611c);
        }
        if (e()) {
            sb.append(", ");
            sb.append("description:");
            sb.append(this.f613d == null ? "null" : this.f613d);
        }
        if (f()) {
            sb.append(", ");
            sb.append("notifyType:");
            sb.append(this.f601a);
        }
        if (g()) {
            sb.append(", ");
            sb.append("url:");
            sb.append(this.f614e == null ? "null" : this.f614e);
        }
        if (h()) {
            sb.append(", ");
            sb.append("passThrough:");
            sb.append(this.f607b);
        }
        if (i()) {
            sb.append(", ");
            sb.append("notifyId:");
            sb.append(this.f610c);
        }
        if (j()) {
            sb.append(", ");
            sb.append("extra:");
            if (this.f605a == null) {
                sb.append("null");
            } else {
                sb.append(this.f605a);
            }
        }
        if (k()) {
            sb.append(", ");
            sb.append("internal:");
            if (this.f609b == null) {
                sb.append("null");
            } else {
                sb.append(this.f609b);
            }
        }
        if (m()) {
            sb.append(", ");
            sb.append("ignoreRegInfo:");
            sb.append(this.f606a);
        }
        if (n()) {
            sb.append(", ");
            sb.append("apsProperFields:");
            if (this.f612c == null) {
                sb.append("null");
            } else {
                sb.append(this.f612c);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

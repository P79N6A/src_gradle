package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;

public class is implements jv<is, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82263a = new kd("", (byte) 10, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f559a = new kl("DataCollectionItem");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82264b = new kd("", (byte) 8, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82265c = new kd("", (byte) 11, 3);

    /* renamed from: a  reason: collision with other field name */
    public long f560a;

    /* renamed from: a  reason: collision with other field name */
    public im f561a;

    /* renamed from: a  reason: collision with other field name */
    public String f562a;

    /* renamed from: a  reason: collision with other field name */
    private BitSet f563a = new BitSet(1);

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        if (r5 == 0) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.is r5) {
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
            goto L_0x0099
        L_0x0025:
            boolean r0 = r4.a()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r4.a()
            if (r0 == 0) goto L_0x004b
            long r0 = r4.f560a
            long r2 = r5.f560a
            int r0 = com.xiaomi.push.jw.a((long) r0, (long) r2)
            if (r0 != 0) goto L_0x0099
        L_0x004b:
            boolean r0 = r4.b()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.b()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r4.b()
            if (r0 == 0) goto L_0x0071
            com.xiaomi.push.im r0 = r4.f561a
            com.xiaomi.push.im r1 = r5.f561a
            int r0 = com.xiaomi.push.jw.a((java.lang.Comparable) r0, (java.lang.Comparable) r1)
            if (r0 != 0) goto L_0x0099
        L_0x0071:
            boolean r0 = r4.c()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r5.c()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            int r0 = r0.compareTo(r1)
            if (r0 != 0) goto L_0x0099
            boolean r0 = r4.c()
            if (r0 == 0) goto L_0x0097
            java.lang.String r0 = r4.f562a
            java.lang.String r5 = r5.f562a
            int r5 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r5)
            if (r5 != 0) goto L_0x0022
        L_0x0097:
            r5 = 0
            r0 = 0
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.is.compareTo(com.xiaomi.push.is):int");
    }

    public is a(long j) {
        this.f560a = j;
        a(true);
        return this;
    }

    public is a(im imVar) {
        this.f561a = imVar;
        return this;
    }

    public is a(String str) {
        this.f562a = str;
        return this;
    }

    public String a() {
        return this.f562a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m407a() {
        if (this.f561a == null) {
            throw new kh("Required field 'collectionType' was not present! Struct: " + toString());
        } else if (this.f562a == null) {
            throw new kh("Required field 'content' was not present! Struct: " + toString());
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.xiaomi.push.kg r4) {
        /*
            r3 = this;
            r4.a()
        L_0x0003:
            com.xiaomi.push.kd r0 = r4.a()
            byte r1 = r0.f82422a
            if (r1 != 0) goto L_0x0030
            r4.f()
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x0018
            r3.a()
            return
        L_0x0018:
            com.xiaomi.push.kh r4 = new com.xiaomi.push.kh
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Required field 'collectedAt' was not found in serialized data! Struct: "
            r0.<init>(r1)
            java.lang.String r1 = r3.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x0030:
            short r1 = r0.f871a
            switch(r1) {
                case 1: goto L_0x0059;
                case 2: goto L_0x0048;
                case 3: goto L_0x003b;
                default: goto L_0x0035;
            }
        L_0x0035:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r4, r0)
            goto L_0x0069
        L_0x003b:
            byte r1 = r0.f82422a
            r2 = 11
            if (r1 != r2) goto L_0x0035
            java.lang.String r0 = r4.a()
            r3.f562a = r0
            goto L_0x0069
        L_0x0048:
            byte r1 = r0.f82422a
            r2 = 8
            if (r1 != r2) goto L_0x0035
            int r0 = r4.a()
            com.xiaomi.push.im r0 = com.xiaomi.push.im.a(r0)
            r3.f561a = r0
            goto L_0x0069
        L_0x0059:
            byte r1 = r0.f82422a
            r2 = 10
            if (r1 != r2) goto L_0x0035
            long r0 = r4.a()
            r3.f560a = r0
            r0 = 1
            r3.a((boolean) r0)
        L_0x0069:
            r4.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.is.a(com.xiaomi.push.kg):void");
    }

    public void a(boolean z) {
        this.f563a.set(0, z);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m408a() {
        return this.f563a.get(0);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m409a(is isVar) {
        if (isVar == null || this.f560a != isVar.f560a) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = isVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f561a.equals(isVar.f561a))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = isVar.c();
        return (!c2 && !c3) || (c2 && c3 && this.f562a.equals(isVar.f562a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f559a);
        kgVar.a(f82263a);
        kgVar.a(this.f560a);
        kgVar.b();
        if (this.f561a != null) {
            kgVar.a(f82264b);
            kgVar.a(this.f561a.a());
            kgVar.b();
        }
        if (this.f562a != null) {
            kgVar.a(f82265c);
            kgVar.a(this.f562a);
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f561a != null;
    }

    public boolean c() {
        return this.f562a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof is)) {
            return compareTo((is) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(");
        sb.append("collectedAt:");
        sb.append(this.f560a);
        sb.append(", ");
        sb.append("collectionType:");
        if (this.f561a == null) {
            sb.append("null");
        } else {
            sb.append(this.f561a);
        }
        sb.append(", ");
        sb.append("content:");
        sb.append(this.f562a == null ? "null" : this.f562a);
        sb.append(")");
        return sb.toString();
    }
}

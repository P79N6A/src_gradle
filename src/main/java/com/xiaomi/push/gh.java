package com.xiaomi.push;

import java.io.Serializable;
import java.util.List;

public class gh implements jv<gh, Object>, Serializable, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final kd f82104a = new kd("", (byte) 11, 1);

    /* renamed from: a  reason: collision with other field name */
    private static final kl f428a = new kl("StatsEvents");

    /* renamed from: b  reason: collision with root package name */
    private static final kd f82105b = new kd("", (byte) 11, 2);

    /* renamed from: c  reason: collision with root package name */
    private static final kd f82106c = new kd("", (byte) 15, 3);

    /* renamed from: a  reason: collision with other field name */
    public String f429a;

    /* renamed from: a  reason: collision with other field name */
    public List<gg> f430a;

    /* renamed from: b  reason: collision with other field name */
    public String f431b;

    public gh() {
    }

    public gh(String str, List<gg> list) {
        this();
        this.f429a = str;
        this.f430a = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0095, code lost:
        if (r3 == 0) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(com.xiaomi.push.gh r3) {
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
            java.lang.String r0 = r2.f429a
            java.lang.String r1 = r3.f429a
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.lang.String r0 = r2.f431b
            java.lang.String r1 = r3.f431b
            int r0 = com.xiaomi.push.jw.a((java.lang.String) r0, (java.lang.String) r1)
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
            java.util.List<com.xiaomi.push.gg> r0 = r2.f430a
            java.util.List<com.xiaomi.push.gg> r3 = r3.f430a
            int r3 = com.xiaomi.push.jw.a((java.util.List) r0, (java.util.List) r3)
            if (r3 != 0) goto L_0x0022
        L_0x0097:
            r3 = 0
            r0 = 0
        L_0x0099:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gh.compareTo(com.xiaomi.push.gh):int");
    }

    public gh a(String str) {
        this.f431b = str;
        return this;
    }

    public void a() {
        if (this.f429a == null) {
            throw new kh("Required field 'uuid' was not present! Struct: " + toString());
        } else if (this.f430a == null) {
            throw new kh("Required field 'events' was not present! Struct: " + toString());
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
            if (r1 != 0) goto L_0x0012
            r5.f()
            r4.a()
            return
        L_0x0012:
            short r1 = r0.f871a
            r2 = 11
            switch(r1) {
                case 1: goto L_0x0056;
                case 2: goto L_0x004b;
                case 3: goto L_0x001f;
                default: goto L_0x0019;
            }
        L_0x0019:
            byte r0 = r0.f82422a
            com.xiaomi.push.kj.a(r5, r0)
            goto L_0x0060
        L_0x001f:
            byte r1 = r0.f82422a
            r2 = 15
            if (r1 != r2) goto L_0x0019
            com.xiaomi.push.ke r0 = r5.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.f872a
            r1.<init>(r2)
            r4.f430a = r1
            r1 = 0
        L_0x0033:
            int r2 = r0.f872a
            if (r1 >= r2) goto L_0x0047
            com.xiaomi.push.gg r2 = new com.xiaomi.push.gg
            r2.<init>()
            r2.a((com.xiaomi.push.kg) r5)
            java.util.List<com.xiaomi.push.gg> r3 = r4.f430a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0033
        L_0x0047:
            r5.i()
            goto L_0x0060
        L_0x004b:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f431b = r0
            goto L_0x0060
        L_0x0056:
            byte r1 = r0.f82422a
            if (r1 != r2) goto L_0x0019
            java.lang.String r0 = r5.a()
            r4.f429a = r0
        L_0x0060:
            r5.g()
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.gh.a(com.xiaomi.push.kg):void");
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m325a() {
        return this.f429a != null;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m326a(gh ghVar) {
        if (ghVar == null) {
            return false;
        }
        boolean a2 = a();
        boolean a3 = ghVar.a();
        if ((a2 || a3) && (!a2 || !a3 || !this.f429a.equals(ghVar.f429a))) {
            return false;
        }
        boolean b2 = b();
        boolean b3 = ghVar.b();
        if ((b2 || b3) && (!b2 || !b3 || !this.f431b.equals(ghVar.f431b))) {
            return false;
        }
        boolean c2 = c();
        boolean c3 = ghVar.c();
        return (!c2 && !c3) || (c2 && c3 && this.f430a.equals(ghVar.f430a));
    }

    public void b(kg kgVar) {
        a();
        kgVar.a(f428a);
        if (this.f429a != null) {
            kgVar.a(f82104a);
            kgVar.a(this.f429a);
            kgVar.b();
        }
        if (this.f431b != null && b()) {
            kgVar.a(f82105b);
            kgVar.a(this.f431b);
            kgVar.b();
        }
        if (this.f430a != null) {
            kgVar.a(f82106c);
            kgVar.a(new ke((byte) 12, this.f430a.size()));
            for (gg b2 : this.f430a) {
                b2.b(kgVar);
            }
            kgVar.e();
            kgVar.b();
        }
        kgVar.c();
        kgVar.a();
    }

    public boolean b() {
        return this.f431b != null;
    }

    public boolean c() {
        return this.f430a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof gh)) {
            return compareTo((gh) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(");
        sb.append("uuid:");
        sb.append(this.f429a == null ? "null" : this.f429a);
        if (b()) {
            sb.append(", ");
            sb.append("operator:");
            sb.append(this.f431b == null ? "null" : this.f431b);
        }
        sb.append(", ");
        sb.append("events:");
        if (this.f430a == null) {
            sb.append("null");
        } else {
            sb.append(this.f430a);
        }
        sb.append(")");
        return sb.toString();
    }
}

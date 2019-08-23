package com.ss.android.linkselector;

import com.ss.android.linkselector.d.b;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public final class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    List<com.ss.android.linkselector.b.b> f2478a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    com.ss.android.linkselector.a.a f2479b;

    /* renamed from: c  reason: collision with root package name */
    private Pattern f2480c = Pattern.compile(".*(?=://)");

    /* renamed from: d  reason: collision with root package name */
    private Pattern f2481d = Pattern.compile("(?<=://)([^/]*)");

    /* renamed from: e  reason: collision with root package name */
    private List<com.ss.android.linkselector.b.b> f2482e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private b f2483f;

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.f2482e.size() != 1) {
            this.f2483f.a(this.f2482e);
        }
    }

    a(List<com.ss.android.linkselector.b.b> list) {
        this.f2482e.clear();
        this.f2482e.addAll(list);
        this.f2483f = new b(this);
        this.f2479b = new com.ss.android.linkselector.a.a();
    }

    public final void a(List<com.ss.android.linkselector.b.b> list) {
        StringBuilder sb = new StringBuilder("on sort done = ");
        sb.append(list.size());
        sb.append(" selector:");
        sb.append(this);
        sb.append(" thread:");
        sb.append(Thread.currentThread());
        this.f2478a.clear();
        this.f2478a.addAll(list);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00cd A[LOOP:0: B:1:0x0002->B:16:0x00cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r14) {
        /*
            r13 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            java.util.List<com.ss.android.linkselector.b.b> r2 = r13.f2478a
            int r2 = r2.size()
            r3 = 1
            if (r1 >= r2) goto L_0x00d1
            java.util.List<com.ss.android.linkselector.b.b> r2 = r13.f2478a
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.linkselector.b.b r2 = (com.ss.android.linkselector.b.b) r2
            com.ss.android.linkselector.a.a r4 = r13.f2479b
            if (r2 != 0) goto L_0x001a
        L_0x0017:
            r4 = 0
            goto L_0x00c2
        L_0x001a:
            boolean r5 = r2.a()
            if (r5 != 0) goto L_0x0034
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r2.g()
            r4.append(r5)
            java.lang.String r5 = " is available"
            r4.append(r5)
        L_0x0031:
            r4 = 1
            goto L_0x00c2
        L_0x0034:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r2.d()
            long r5 = r5 - r7
            int r7 = r2.e()
            long r7 = r4.a((int) r7)
            r9 = 60000(0xea60, double:2.9644E-319)
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0089
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "unlock "
            r7.<init>(r8)
            java.lang.String r8 = r2.g()
            r7.append(r8)
            java.lang.String r8 = ", locked count = "
            r7.append(r8)
            int r8 = r2.e()
            r7.append(r8)
            java.lang.String r8 = ", should lock "
            r7.append(r8)
            int r8 = r2.e()
            long r11 = r4.a((int) r8)
            long r11 = r11 / r9
            r7.append(r11)
            java.lang.String r4 = " min, already locked "
            r7.append(r4)
            long r5 = r5 / r9
            r7.append(r5)
            java.lang.String r4 = " min"
            r7.append(r4)
            r2.c()
            goto L_0x0031
        L_0x0089:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r2.g()
            r7.append(r8)
            java.lang.String r8 = " is locked, locked count = "
            r7.append(r8)
            int r8 = r2.e()
            r7.append(r8)
            java.lang.String r8 = ", should lock "
            r7.append(r8)
            int r8 = r2.e()
            long r11 = r4.a((int) r8)
            long r11 = r11 / r9
            r7.append(r11)
            java.lang.String r4 = " min, already locked "
            r7.append(r4)
            long r5 = r5 / r9
            r7.append(r5)
            java.lang.String r4 = " min"
            r7.append(r4)
            goto L_0x0017
        L_0x00c2:
            if (r4 == 0) goto L_0x00cd
            java.util.List<com.ss.android.linkselector.b.b> r4 = r13.f2478a
            int r4 = r4.size()
            int r1 = r4 - r1
            goto L_0x00d3
        L_0x00cd:
            int r1 = r1 + 1
            goto L_0x0002
        L_0x00d1:
            r2 = 0
            r1 = 0
        L_0x00d3:
            if (r2 != 0) goto L_0x00e7
            java.util.List<com.ss.android.linkselector.b.b> r4 = r13.f2482e
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x00e7
            java.util.List<com.ss.android.linkselector.b.b> r1 = r13.f2482e
            java.lang.Object r1 = r1.get(r0)
            r2 = r1
            com.ss.android.linkselector.b.b r2 = (com.ss.android.linkselector.b.b) r2
            goto L_0x00e8
        L_0x00e7:
            r0 = r1
        L_0x00e8:
            if (r0 > r3) goto L_0x00ed
            r13.a()
        L_0x00ed:
            if (r2 == 0) goto L_0x0107
            java.util.regex.Pattern r0 = r13.f2480c
            java.util.regex.Matcher r14 = r0.matcher(r14)
            java.lang.String r0 = r2.f29293e
            java.lang.String r14 = r14.replaceFirst(r0)
            java.util.regex.Pattern r0 = r13.f2481d
            java.util.regex.Matcher r14 = r0.matcher(r14)
            java.lang.String r0 = r2.f29292d
            java.lang.String r14 = r14.replaceFirst(r0)
        L_0x0107:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.linkselector.a.a(java.lang.String):java.lang.String");
    }
}

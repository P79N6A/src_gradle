package com.ss.android.ugc.aweme.festival.christmas.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.b;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.festival.christmas.c.e;
import com.ss.android.ugc.aweme.utils.bg;

public final class a extends b<com.ss.android.ugc.aweme.common.a<e>, o> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47250a;

    /* renamed from: b  reason: collision with root package name */
    public String f47251b;

    /* renamed from: c  reason: collision with root package name */
    public int f47252c;

    public a() {
        if (PatchProxy.isSupport(new Object[0], this, f47250a, false, 43918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47250a, false, 43918, new Class[0], Void.TYPE);
            return;
        }
        a(new com.ss.android.ugc.aweme.common.a<e>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47253a;

            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(Object... objArr) {
                if (PatchProxy.isSupport(new Object[]{objArr}, this, f47253a, false, 43921, new Class[]{Object[].class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{objArr}, this, f47253a, false, 43921, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
                } else if (!super.sendRequest(objArr)) {
                    return false;
                } else {
                    a.this.f47251b = objArr[0];
                    a.this.f47252c = objArr[1].intValue();
                    m.a().a(this.mHandler, new b(this), 0);
                    return true;
                }
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f47250a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 43919(0xab8f, float:6.1544E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f47250a
            r5 = 0
            r6 = 43919(0xab8f, float:6.1544E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r11
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.common.a r1 = r11.f2978e
            if (r1 == 0) goto L_0x0032
            com.ss.android.ugc.aweme.common.a r1 = r11.f2978e
            java.lang.Object r1 = r1.getData()
            com.ss.android.ugc.aweme.festival.christmas.c.e r1 = (com.ss.android.ugc.aweme.festival.christmas.c.e) r1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            int r2 = r11.f47252c
            r3 = 1
            if (r2 != r3) goto L_0x00a8
            if (r1 == 0) goto L_0x00a8
            com.ss.android.ugc.aweme.festival.christmas.a.a r2 = new com.ss.android.ugc.aweme.festival.christmas.a.a
            java.lang.String r4 = r11.f47251b
            r2.<init>(r4, r1)
            com.ss.android.ugc.aweme.utils.bg.a(r2)
            long[] r1 = r1.getDonationItemCount()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r7 = 1
            r8 = 43900(0xab7c, float:6.1517E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<long[]> r2 = long[].class
            r9[r0] = r2
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L_0x0078
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r0] = r1
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.festival.christmas.a.f47225a
            r7 = 1
            r8 = 43900(0xab7c, float:6.1517E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<long[]> r1 = long[].class
            r9[r0] = r1
            java.lang.Class r10 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0078:
            if (r1 == 0) goto L_0x00a7
            int r2 = r1.length
            if (r2 > 0) goto L_0x007e
            goto L_0x00a7
        L_0x007e:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
        L_0x0084:
            if (r0 >= r3) goto L_0x0092
            r4 = r1[r0]
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.add(r4)
            int r0 = r0 + 1
            goto L_0x0084
        L_0x0092:
            com.ss.android.ugc.aweme.app.x r0 = com.ss.android.ugc.aweme.app.x.a()
            com.ss.android.ugc.aweme.app.an r0 = r0.ac()
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.String r1 = r1.toJson((java.lang.Object) r2)
            r0.a(r1)
            goto L_0x00a8
        L_0x00a7:
            return
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.festival.christmas.d.a.b():void");
    }

    public final void a(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f47250a, false, 43920, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f47250a, false, 43920, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.f47252c == 1) {
            e eVar = new e();
            eVar.setValidDonation(false);
            bg.a(new com.ss.android.ugc.aweme.festival.christmas.a.a(this.f47251b, eVar));
        }
    }
}

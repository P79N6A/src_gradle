package com.ss.android.ugc.aweme.app;

import android.app.ActivityManager;
import com.facebook.common.internal.Supplier;
import com.facebook.imagepipeline.cache.MemoryCacheParams;
import com.meituan.robust.ChangeQuickRedirect;

public final class ac implements Supplier<MemoryCacheParams> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33677a;

    /* renamed from: b  reason: collision with root package name */
    private ActivityManager f33678b;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object get() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33677a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.facebook.imagepipeline.cache.MemoryCacheParams> r7 = com.facebook.imagepipeline.cache.MemoryCacheParams.class
            r4 = 0
            r5 = 22519(0x57f7, float:3.1556E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f33677a
            r5 = 0
            r6 = 22519(0x57f7, float:3.1556E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.facebook.imagepipeline.cache.MemoryCacheParams> r8 = com.facebook.imagepipeline.cache.MemoryCacheParams.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = (com.facebook.imagepipeline.cache.MemoryCacheParams) r0
            return r0
        L_0x0026:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33677a
            r4 = 0
            r5 = 22520(0x57f8, float:3.1557E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0050
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f33677a
            r5 = 0
            r6 = 22520(0x57f8, float:3.1557E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Integer.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x004e:
            r2 = r0
            goto L_0x0076
        L_0x0050:
            android.app.ActivityManager r0 = r9.f33678b
            int r0 = r0.getMemoryClass()
            r1 = 1048576(0x100000, float:1.469368E-39)
            int r0 = r0 * r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 33554432(0x2000000, float:9.403955E-38)
            if (r0 >= r1) goto L_0x006a
            r0 = 4194304(0x400000, float:5.877472E-39)
            r2 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x0076
        L_0x006a:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            if (r0 >= r1) goto L_0x0073
            r0 = 6291456(0x600000, float:8.816208E-39)
            r2 = 6291456(0x600000, float:8.816208E-39)
            goto L_0x0076
        L_0x0073:
            int r0 = r0 / 4
            goto L_0x004e
        L_0x0076:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x008d
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = new com.facebook.imagepipeline.cache.MemoryCacheParams
            r3 = 128(0x80, float:1.794E-43)
            int r4 = r2 / 12
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        L_0x008d:
            com.facebook.imagepipeline.cache.MemoryCacheParams r0 = new com.facebook.imagepipeline.cache.MemoryCacheParams
            r3 = 256(0x100, float:3.59E-43)
            int r4 = r2 / 8
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.app.ac.get():java.lang.Object");
    }

    public ac(ActivityManager activityManager) {
        this.f33678b = activityManager;
    }
}

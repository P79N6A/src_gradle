package com.bytedance.frameworks.plugin.core.res;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.frameworks.plugin.core.h;
import com.bytedance.frameworks.plugin.e.a;

public final class b {
    public static void a(Object obj) {
        Object obj2;
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                Object obj3 = a.a(Resources.class, "mTypedArrayPool").get(obj);
                do {
                } while (com.bytedance.frameworks.plugin.e.b.a(obj3.getClass(), "acquire", (Class<?>[]) new Class[0]).invoke(obj3, new Object[0]) != null);
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT > 23) {
            try {
                obj = a.a(Resources.class, "mResourcesImpl").get(obj);
            } catch (Throwable unused2) {
            }
        }
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                obj2 = a.a(obj.getClass(), "mAccessLock").get(obj);
            } catch (Throwable unused3) {
                obj2 = null;
            }
        } else {
            obj2 = a.a(Resources.class, "mTmpValue").get(obj);
        }
        if (obj2 == null) {
            obj2 = h.class;
        }
        synchronized (obj2) {
            a(obj, "mDrawableCache");
            a(obj, "mColorDrawableCache");
            a(obj, "mColorStateListCache");
            if (Build.VERSION.SDK_INT >= 23) {
                a(obj, "mAnimatorCache");
                a(obj, "mStateListAnimatorCache");
            }
            if (obj.getClass().getName().equals("com.huawei.android.content.res.ResourcesEx") || obj.getClass().getName().equals("android.content.res.ResourcesEx")) {
                a(obj, "mCacheColorInfoList");
                a(obj, "mDrawableCacheEx");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:38|39|40|42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        return true;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c8 */
    @android.annotation.SuppressLint({"NewApi"})
    @android.annotation.TargetApi(16)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.Object r8, java.lang.String r9) {
        /*
            r0 = 0
            java.lang.Class r1 = r8.getClass()     // Catch:{ Throwable -> 0x00cd }
            java.lang.reflect.Field r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Class<?>) r1, (java.lang.String) r9)     // Catch:{ Throwable -> 0x00cd }
            if (r1 != 0) goto L_0x0011
            java.lang.Class<android.content.res.Resources> r1 = android.content.res.Resources.class
            java.lang.reflect.Field r1 = com.bytedance.frameworks.plugin.e.a.a((java.lang.Class<?>) r1, (java.lang.String) r9)     // Catch:{ Throwable -> 0x00cd }
        L_0x0011:
            java.lang.Object r2 = r1.get(r8)     // Catch:{ Throwable -> 0x00cd }
            java.lang.Class r1 = r1.getType()     // Catch:{ Throwable -> 0x00cd }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00cd }
            r4 = 16
            r5 = 1
            if (r3 >= r4) goto L_0x003a
            boolean r8 = r2 instanceof android.util.SparseArray     // Catch:{ Throwable -> 0x00cd }
            if (r8 == 0) goto L_0x002a
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ Throwable -> 0x00cd }
            r2.clear()     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x002a:
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00cd }
            r9 = 14
            if (r8 < r9) goto L_0x00cd
            boolean r8 = r2 instanceof android.util.LongSparseArray     // Catch:{ Throwable -> 0x00cd }
            if (r8 == 0) goto L_0x00cd
            android.util.LongSparseArray r2 = (android.util.LongSparseArray) r2     // Catch:{ Throwable -> 0x00cd }
            r2.clear()     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x003a:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x00cd }
            r4 = 23
            r6 = -1
            if (r3 >= r4) goto L_0x00ae
            java.lang.String r3 = "mColorStateListCache"
            boolean r9 = r3.equals(r9)     // Catch:{ Throwable -> 0x00cd }
            if (r9 == 0) goto L_0x0053
            boolean r8 = r2 instanceof android.util.LongSparseArray     // Catch:{ Throwable -> 0x00cd }
            if (r8 == 0) goto L_0x00cd
            android.util.LongSparseArray r2 = (android.util.LongSparseArray) r2     // Catch:{ Throwable -> 0x00cd }
            r2.clear()     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x0053:
            java.lang.Class<android.util.ArrayMap> r9 = android.util.ArrayMap.class
            boolean r9 = r1.isAssignableFrom(r9)     // Catch:{ Throwable -> 0x00cd }
            r3 = 2
            if (r9 == 0) goto L_0x007c
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.String r1 = "clearDrawableCachesLocked"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x00cd }
            java.lang.Class<android.util.ArrayMap> r7 = android.util.ArrayMap.class
            r4[r0] = r7     // Catch:{ Throwable -> 0x00cd }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x00cd }
            r4[r5] = r7     // Catch:{ Throwable -> 0x00cd }
            java.lang.reflect.Method r9 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<?>) r9, (java.lang.String) r1, (java.lang.Class<?>[]) r4)     // Catch:{ Throwable -> 0x00cd }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00cd }
            r1[r0] = r2     // Catch:{ Throwable -> 0x00cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00cd }
            r1[r5] = r2     // Catch:{ Throwable -> 0x00cd }
            r9.invoke(r8, r1)     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x007c:
            java.lang.Class<android.util.LongSparseArray> r9 = android.util.LongSparseArray.class
            boolean r9 = r1.isAssignableFrom(r9)     // Catch:{ Throwable -> 0x00cd }
            if (r9 == 0) goto L_0x00a4
            java.lang.Class<android.content.res.Resources> r9 = android.content.res.Resources.class
            java.lang.String r1 = "clearDrawableCacheLocked"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ Throwable -> 0x00cd }
            java.lang.Class<android.util.LongSparseArray> r7 = android.util.LongSparseArray.class
            r4[r0] = r7     // Catch:{ Throwable -> 0x00cd }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x00cd }
            r4[r5] = r7     // Catch:{ Throwable -> 0x00cd }
            java.lang.reflect.Method r9 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<?>) r9, (java.lang.String) r1, (java.lang.Class<?>[]) r4)     // Catch:{ Throwable -> 0x00cd }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ Throwable -> 0x00cd }
            r1[r0] = r2     // Catch:{ Throwable -> 0x00cd }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00cd }
            r1[r5] = r2     // Catch:{ Throwable -> 0x00cd }
            r9.invoke(r8, r1)     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x00a4:
            boolean r8 = r2 instanceof java.util.Map     // Catch:{ Throwable -> 0x00cd }
            if (r8 == 0) goto L_0x00cd
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Throwable -> 0x00cd }
            r2.clear()     // Catch:{ Throwable -> 0x00cd }
            return r5
        L_0x00ae:
            if (r1 == 0) goto L_0x00cd
            java.lang.String r8 = "onConfigurationChange"
            java.lang.Class[] r9 = new java.lang.Class[r5]     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x00c8 }
            r9[r0] = r3     // Catch:{ Throwable -> 0x00c8 }
            java.lang.reflect.Method r8 = com.bytedance.frameworks.plugin.e.b.a((java.lang.Class<?>) r1, (java.lang.String) r8, (java.lang.Class<?>[]) r9)     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ Throwable -> 0x00c8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00c8 }
            r9[r0] = r3     // Catch:{ Throwable -> 0x00c8 }
            r8.invoke(r2, r9)     // Catch:{ Throwable -> 0x00c8 }
            return r5
        L_0x00c8:
            java.lang.Class r1 = r1.getSuperclass()     // Catch:{ Throwable -> 0x00cd }
            goto L_0x00ae
        L_0x00cd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.core.res.b.a(java.lang.Object, java.lang.String):boolean");
    }
}

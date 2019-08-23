package com.ss.android.ugc.aweme.services.publish;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u001c\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00030\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0007\u001a?\u0010\b\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u001c\u0012\u0018\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0007¨\u0006\t"}, d2 = {"findExtension", "T", "", "Landroid/support/v4/util/Pair;", "Ljava/lang/Class;", "Lcom/ss/android/ugc/aweme/services/publish/IAVPublishExtension;", "clazz", "(Ljava/util/List;Ljava/lang/Class;)Ljava/lang/Object;", "findModel", "tools.service_release"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class AVPublishExtensionUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.support.v4.util.Pair} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        if (r10 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findExtension(@org.jetbrains.annotations.NotNull java.util.List<? extends android.support.v4.util.Pair<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r19, @org.jetbrains.annotations.NotNull java.lang.Class<?> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r10] = r4
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8[r11] = r4
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r4 = 0
            r6 = 1
            r7 = 71539(0x11773, float:1.00247E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 71539(0x11773, float:1.00247E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r10] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r11] = r1
            java.lang.Class<java.lang.Object> r18 = java.lang.Object.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0048:
            java.lang.String r2 = "$this$findExtension"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L_0x005a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r0.next()
            r5 = r4
            android.support.v4.util.Pair r5 = (android.support.v4.util.Pair) r5
            F r5 = r5.first
            if (r5 != 0) goto L_0x006e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006e:
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            if (r5 == 0) goto L_0x005a
            if (r10 == 0) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r3 = r4
            r10 = 1
            goto L_0x005a
        L_0x007c:
            if (r10 != 0) goto L_0x007f
        L_0x007e:
            r3 = r2
        L_0x007f:
            android.support.v4.util.Pair r3 = (android.support.v4.util.Pair) r3
            if (r3 == 0) goto L_0x0088
            S r0 = r3.second
            r2 = r0
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r2 = (com.ss.android.ugc.aweme.services.publish.IAVPublishExtension) r2
        L_0x0088:
            java.lang.Object r2 = (java.lang.Object) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findExtension(java.util.List, java.lang.Class):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: android.support.v4.util.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: android.support.v4.util.Pair} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x007c, code lost:
        if (r10 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    @org.jetbrains.annotations.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T findModel(@org.jetbrains.annotations.NotNull java.util.List<? extends android.support.v4.util.Pair<java.lang.Class<?>, com.ss.android.ugc.aweme.services.publish.IAVPublishExtension<?>>> r19, @org.jetbrains.annotations.NotNull java.lang.Class<T> r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = changeQuickRedirect
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r8[r10] = r4
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            r8[r11] = r4
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r4 = 0
            r6 = 1
            r7 = 71540(0x11774, float:1.00249E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = changeQuickRedirect
            r15 = 1
            r16 = 71540(0x11774, float:1.00249E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r10] = r1
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r0[r11] = r1
            java.lang.Class<java.lang.Object> r18 = java.lang.Object.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = (java.lang.Object) r0
            return r0
        L_0x0048:
            java.lang.String r2 = "$this$findModel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
            java.lang.String r2 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = r2
        L_0x005a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r0.next()
            r5 = r4
            android.support.v4.util.Pair r5 = (android.support.v4.util.Pair) r5
            F r5 = r5.first
            if (r5 != 0) goto L_0x006e
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x006e:
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r1)
            if (r5 == 0) goto L_0x005a
            if (r10 == 0) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r3 = r4
            r10 = 1
            goto L_0x005a
        L_0x007c:
            if (r10 != 0) goto L_0x007f
        L_0x007e:
            r3 = r2
        L_0x007f:
            android.support.v4.util.Pair r3 = (android.support.v4.util.Pair) r3
            if (r3 == 0) goto L_0x008e
            S r0 = r3.second
            com.ss.android.ugc.aweme.services.publish.IAVPublishExtension r0 = (com.ss.android.ugc.aweme.services.publish.IAVPublishExtension) r0
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r0.provideExtensionData()
            return r0
        L_0x008e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils.findModel(java.util.List, java.lang.Class):java.lang.Object");
    }
}

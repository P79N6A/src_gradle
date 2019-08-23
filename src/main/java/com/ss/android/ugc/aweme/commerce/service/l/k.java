package com.ss.android.ugc.aweme.commerce.service.l;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/service/utils/StockPlus;", "", "()V", "plus", "", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/SkuItem;", "skuInfoMap", "skuImageMap", "noneId", "serverLinkSymbol", "commerce.service_release"}, k = 1, mv = {1, 1, 15})
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38037a;

    /* renamed from: b  reason: collision with root package name */
    public static final k f38038b = new k();

    private k() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0218 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> a(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, com.ss.android.ugc.aweme.commerce.service.models.z> r26, @org.jetbrains.annotations.NotNull java.util.Map<java.lang.String, java.lang.String> r27, @org.jetbrains.annotations.NotNull java.lang.String r28, @org.jetbrains.annotations.NotNull java.lang.String r29) {
        /*
            r25 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            r13 = 1
            r5[r13] = r1
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f38037a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r10[r12] = r6
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r10[r13] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r14] = r6
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r10[r15] = r6
            java.lang.Class<java.util.Map> r11 = java.util.Map.class
            r8 = 0
            r9 = 30016(0x7540, float:4.2061E-41)
            r6 = r25
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0069
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            r5[r13] = r1
            r5[r14] = r2
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r18 = f38037a
            r19 = 0
            r20 = 30016(0x7540, float:4.2061E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r12] = r1
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            r0[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r15] = r1
            java.lang.Class<java.util.Map> r22 = java.util.Map.class
            r16 = r5
            r17 = r25
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0069:
            java.lang.String r4 = "skuInfoMap"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r4)
            java.lang.String r4 = "skuImageMap"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r4)
            java.lang.String r4 = "noneId"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r4)
            java.lang.String r4 = "serverLinkSymbol"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Map r4 = (java.util.Map) r4
            java.util.Set r0 = r26.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x008c:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0220
            java.lang.Object r5 = r0.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            com.ss.android.ugc.aweme.commerce.service.models.z r5 = (com.ss.android.ugc.aweme.commerce.service.models.z) r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            kotlin.text.Regex r7 = new kotlin.text.Regex
            r7.<init>((java.lang.String) r3)
            java.util.List r7 = r7.split(r6, r12)
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x00e2
            int r8 = r7.size()
            java.util.ListIterator r8 = r7.listIterator(r8)
        L_0x00bd:
            boolean r9 = r8.hasPrevious()
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r9 = r8.previous()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            int r9 = r9.length()
            if (r9 != 0) goto L_0x00d3
            r9 = 1
            goto L_0x00d4
        L_0x00d3:
            r9 = 0
        L_0x00d4:
            if (r9 != 0) goto L_0x00bd
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            int r8 = r8.nextIndex()
            int r8 = r8 + r13
            java.util.List r7 = kotlin.collections.CollectionsKt.take(r7, r8)
            goto L_0x00e6
        L_0x00e2:
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00e6:
            java.util.Collection r7 = (java.util.Collection) r7
            if (r7 == 0) goto L_0x0218
            java.lang.String[] r8 = new java.lang.String[r12]
            java.lang.Object[] r7 = r7.toArray(r8)
            if (r7 == 0) goto L_0x0210
            java.lang.String[] r7 = (java.lang.String[]) r7
            int r8 = r7.length
            int r9 = r13 << r8
            r10 = 0
        L_0x00f8:
            if (r10 >= r9) goto L_0x008c
            r11 = 0
            java.lang.String r14 = ""
            r15 = r11
            r11 = 0
        L_0x00ff:
            if (r11 >= r8) goto L_0x0144
            int r16 = r10 >> r11
            r16 = r16 & 1
            if (r16 != 0) goto L_0x011b
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            r13.append(r2)
            r13.append(r3)
            java.lang.String r13 = r13.toString()
        L_0x0119:
            r14 = r13
            goto L_0x0140
        L_0x011b:
            if (r11 != 0) goto L_0x011f
            r15 = r7[r12]
        L_0x011f:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            r14 = r7[r11]
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r3)
            java.lang.String r13 = r14.toString()
            goto L_0x0119
        L_0x0140:
            int r11 = r11 + 1
            r13 = 1
            goto L_0x00ff
        L_0x0144:
            int r11 = r14.length()
            r13 = 1
            int r11 = r11 - r13
            if (r14 == 0) goto L_0x0208
            java.lang.String r11 = r14.substring(r12, r11)
            java.lang.String r14 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r11, r14)
            java.lang.Object r14 = r4.get(r11)
            com.ss.android.ugc.aweme.commerce.service.models.z r14 = (com.ss.android.ugc.aweme.commerce.service.models.z) r14
            r16 = 30
            if (r14 == 0) goto L_0x018b
            int r11 = r14.getStockNum()
            int r15 = r5.getStockNum()
            int r11 = r11 + r15
            r14.setStockNum(r11)
            boolean r11 = r14.getCanSelect()
            if (r11 != 0) goto L_0x0203
            int r11 = r5.getStockNum()
            if (r11 <= 0) goto L_0x0185
            java.lang.Integer r11 = r5.getUserLimit()
            if (r11 == 0) goto L_0x0181
            int r16 = r11.intValue()
        L_0x0181:
            if (r16 <= 0) goto L_0x0185
            r11 = 1
            goto L_0x0186
        L_0x0185:
            r11 = 0
        L_0x0186:
            r14.setCanSelect(r11)
            goto L_0x0203
        L_0x018b:
            r14 = r11
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = android.text.TextUtils.equals(r14, r6)
            if (r14 == 0) goto L_0x01ae
            int r14 = r5.getStockNum()
            if (r14 <= 0) goto L_0x01a8
            java.lang.Integer r14 = r5.getUserLimit()
            if (r14 == 0) goto L_0x01a4
            int r16 = r14.intValue()
        L_0x01a4:
            if (r16 <= 0) goto L_0x01a8
            r14 = 1
            goto L_0x01a9
        L_0x01a8:
            r14 = 0
        L_0x01a9:
            r5.setCanSelect(r14)
            r14 = r5
            goto L_0x01e4
        L_0x01ae:
            com.ss.android.ugc.aweme.commerce.service.models.z r14 = new com.ss.android.ugc.aweme.commerce.service.models.z
            java.lang.String r18 = ""
            int r19 = r5.getStockNum()
            r20 = -1
            r21 = 0
            r22 = 0
            r23 = 24
            r24 = 0
            r17 = r14
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            int r12 = r5.getStockNum()
            r14.setStockNum(r12)
            int r12 = r5.getStockNum()
            if (r12 <= 0) goto L_0x01e0
            java.lang.Integer r12 = r5.getUserLimit()
            if (r12 == 0) goto L_0x01dc
            int r16 = r12.intValue()
        L_0x01dc:
            if (r16 <= 0) goto L_0x01e0
            r12 = 1
            goto L_0x01e1
        L_0x01e0:
            r12 = 0
        L_0x01e1:
            r14.setCanSelect(r12)
        L_0x01e4:
            r12 = r15
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x01fb
            if (r14 != 0) goto L_0x01f2
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01f2:
            java.lang.Object r12 = r1.get(r15)
            java.lang.String r12 = (java.lang.String) r12
            r14.setImageUrl(r12)
        L_0x01fb:
            if (r14 != 0) goto L_0x0200
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0200:
            r4.put(r11, r14)
        L_0x0203:
            int r10 = r10 + 1
            r12 = 0
            goto L_0x00f8
        L_0x0208:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x0210:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0218:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.util.Collection<T>"
            r0.<init>(r1)
            throw r0
        L_0x0220:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.k.a(java.util.Map, java.util.Map, java.lang.String, java.lang.String):java.util.Map");
    }
}

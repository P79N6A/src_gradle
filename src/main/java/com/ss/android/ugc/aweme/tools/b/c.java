package com.ss.android.ugc.aweme.tools.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.ap;
import com.ss.android.ugc.aweme.shortvideo.cut.model.h;
import com.ss.android.vesdk.al;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a*\u0010\f\u001a\u00020\u0007*\u00020\b2\u0006\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010\u001a:\u0010\u0011\u001a\u00020\u0007*\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005¨\u0006\u0017"}, d2 = {"getVideoFileInfoWithRotation", "", "strInVideo", "", "outInfo", "", "selectSegment", "", "Lcom/ss/android/vesdk/VETimelineParams;", "playIndex", "segment", "Lcom/ss/android/ugc/aweme/shortvideo/cut/model/VideoSegment;", "unselect", "preSelectIndex", "preSelectSegment", "segmentList", "", "update", "vTrimInArray", "vTrimOutArray", "speedArray", "", "rotateArray", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74648a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int a(@org.jetbrains.annotations.NotNull java.lang.String r19, @org.jetbrains.annotations.NotNull int[] r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f74648a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<int[]> r4 = int[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 87042(0x15402, float:1.21972E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x004c
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f74648a
            r15 = 1
            r16 = 87042(0x15402, float:1.21972E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x004c:
            java.lang.String r3 = "strInVideo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "outInfo"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            com.ss.android.ugc.aweme.shortvideo.hm r3 = new com.ss.android.ugc.aweme.shortvideo.hm
            r3.<init>()
            com.ss.android.vesdk.i r3 = r3.a()
            com.ss.android.ugc.aweme.port.in.a.a((com.ss.android.vesdk.i) r3)
            com.ss.android.ugc.aweme.utils.co r3 = com.ss.android.ugc.aweme.utils.co.VIDEO
            java.lang.String r0 = com.ss.android.ugc.aweme.utils.g.a((java.lang.String) r0, (com.ss.android.ugc.aweme.utils.co) r3)
            int r0 = com.ss.android.vesdk.VEUtils.getVideoFileInfo(r0, r1)
            if (r0 != 0) goto L_0x007c
            r2 = r1[r2]
            int r2 = r2 % 180
            if (r2 == 0) goto L_0x007c
            r2 = r1[r11]
            r3 = r1[r10]
            r1[r11] = r3
            r1[r10] = r2
        L_0x007c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.b.c.a(java.lang.String, int[]):int");
    }

    public static final void a(@NotNull al alVar, int i, @NotNull h hVar) {
        boolean z;
        al alVar2 = alVar;
        int i2 = i;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{alVar2, Integer.valueOf(i), hVar2}, null, f74648a, true, 87044, new Class[]{al.class, Integer.TYPE, h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{alVar2, Integer.valueOf(i), hVar2}, null, f74648a, true, 87044, new Class[]{al.class, Integer.TYPE, h.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(alVar2, "$this$selectSegment");
        Intrinsics.checkParameterIsNotNull(hVar2, "segment");
        boolean[] zArr = alVar2.j;
        Intrinsics.checkExpressionValueIsNotNull(zArr, "enable");
        int length = zArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i4 + 1;
            boolean[] zArr2 = alVar2.j;
            if (i2 == i4) {
                z = true;
            } else {
                z = false;
            }
            zArr2[i4] = z;
            i3++;
            i4 = i5;
        }
        alVar2.i[i2] = (double) hVar2.f66499f;
        alVar2.f77896e[i2] = 0;
        alVar2.f77897f[i2] = (int) hVar2.f66496c;
        alVar2.k[i2] = ap.a.a(hVar2.k);
    }

    public static final void a(@NotNull al alVar, int i, @NotNull h hVar, @Nullable List<? extends h> list) {
        al alVar2 = alVar;
        h hVar2 = hVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{alVar2, Integer.valueOf(i), hVar2, list}, null, f74648a, true, 87045, new Class[]{al.class, Integer.TYPE, h.class, List.class}, Void.TYPE)) {
            Object[] objArr = {alVar2, Integer.valueOf(i), hVar2, list};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f74648a, true, 87045, new Class[]{al.class, Integer.TYPE, h.class, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(alVar2, "$this$unselect");
        Intrinsics.checkParameterIsNotNull(hVar2, "preSelectSegment");
        alVar2.i[i] = (double) hVar2.f66499f;
        alVar2.f77896e[i] = (int) hVar2.f66497d;
        alVar2.f77897f[i] = (int) hVar2.f66498e;
        alVar2.k[i] = ap.a.a(hVar2.k);
        if (list != null) {
            for (Object next : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                alVar2.j[i2] = !((h) next).j;
                i2 = i3;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(@org.jetbrains.annotations.NotNull com.ss.android.vesdk.al r27, @org.jetbrains.annotations.Nullable java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.cut.model.h> r28, @org.jetbrains.annotations.NotNull int[] r29, @org.jetbrains.annotations.NotNull int[] r30, @org.jetbrains.annotations.NotNull float[] r31, @org.jetbrains.annotations.NotNull int[] r32) {
        /*
            r0 = r27
            r2 = r29
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = 6
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r14 = 0
            r7[r14] = r0
            r15 = 1
            r7[r15] = r28
            r16 = 2
            r7[r16] = r2
            r17 = 3
            r7[r17] = r3
            r18 = 4
            r7[r18] = r4
            r19 = 5
            r7[r19] = r5
            com.meituan.robust.ChangeQuickRedirect r9 = f74648a
            java.lang.Class[] r12 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.vesdk.al> r8 = com.ss.android.vesdk.al.class
            r12[r14] = r8
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r12[r15] = r8
            java.lang.Class<int[]> r8 = int[].class
            r12[r16] = r8
            java.lang.Class<int[]> r8 = int[].class
            r12[r17] = r8
            java.lang.Class<float[]> r8 = float[].class
            r12[r18] = r8
            java.lang.Class<int[]> r8 = int[].class
            r12[r19] = r8
            java.lang.Class r13 = java.lang.Void.TYPE
            r8 = 0
            r10 = 1
            r11 = 87043(0x15403, float:1.21973E-40)
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r7, r8, r9, r10, r11, r12, r13)
            if (r7 == 0) goto L_0x0087
            java.lang.Object[] r7 = new java.lang.Object[r6]
            r7[r14] = r0
            r7[r15] = r28
            r7[r16] = r2
            r7[r17] = r3
            r7[r18] = r4
            r7[r19] = r5
            r21 = 0
            com.meituan.robust.ChangeQuickRedirect r22 = f74648a
            r23 = 1
            r24 = 87043(0x15403, float:1.21973E-40)
            java.lang.Class[] r0 = new java.lang.Class[r6]
            java.lang.Class<com.ss.android.vesdk.al> r1 = com.ss.android.vesdk.al.class
            r0[r14] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r0[r15] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r16] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r17] = r1
            java.lang.Class<float[]> r1 = float[].class
            r0[r18] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r19] = r1
            java.lang.Class r26 = java.lang.Void.TYPE
            r20 = r7
            r25 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r20, r21, r22, r23, r24, r25, r26)
            return
        L_0x0087:
            java.lang.String r6 = "$this$update"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r6)
            java.lang.String r6 = "vTrimInArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r6)
            java.lang.String r6 = "vTrimOutArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r6)
            java.lang.String r6 = "speedArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r6)
            java.lang.String r6 = "rotateArray"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r6)
            if (r28 == 0) goto L_0x00ef
            boolean r6 = r28.isEmpty()
            r6 = r6 ^ r15
            if (r6 == 0) goto L_0x00ac
            r1 = r28
            goto L_0x00ad
        L_0x00ac:
            r1 = 0
        L_0x00ad:
            if (r1 == 0) goto L_0x00ef
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00b5:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00ee
            java.lang.Object r6 = r1.next()
            int r7 = r14 + 1
            if (r14 >= 0) goto L_0x00c6
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x00c6:
            com.ss.android.ugc.aweme.shortvideo.cut.model.h r6 = (com.ss.android.ugc.aweme.shortvideo.cut.model.h) r6
            boolean[] r8 = r0.j
            boolean r6 = r6.j
            r6 = r6 ^ r15
            r8[r14] = r6
            int[] r6 = r0.f77896e
            r8 = r2[r14]
            r6[r14] = r8
            int[] r6 = r0.f77897f
            r8 = r3[r14]
            r6[r14] = r8
            double[] r6 = r0.i
            r8 = r4[r14]
            double r8 = (double) r8
            r6[r14] = r8
            com.ss.android.vesdk.c[] r6 = r0.k
            r8 = r5[r14]
            com.ss.android.vesdk.c r8 = com.ss.android.ugc.aweme.shortvideo.cut.ap.a.a(r8)
            r6[r14] = r8
            r14 = r7
            goto L_0x00b5
        L_0x00ee:
            return
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.b.c.a(com.ss.android.vesdk.al, java.util.List, int[], int[], float[], int[]):void");
    }
}

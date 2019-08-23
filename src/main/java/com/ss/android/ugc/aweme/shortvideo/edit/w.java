package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0007¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/edit/StickerModel;", "", "()V", "TAG", "", "needExpandVideo", "", "veEditor", "Lcom/ss/android/vesdk/VEEditor;", "sizeProvider", "Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", "controllers", "", "Lcom/ss/android/ugc/aweme/shortvideo/edit/IStickerController;", "(Lcom/ss/android/vesdk/VEEditor;Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;[Lcom/ss/android/ugc/aweme/shortvideo/edit/IStickerController;)Z", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67494a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final w f67495b = new w();

    /* renamed from: c  reason: collision with root package name */
    private static final String f67496c = f67496c;

    private w() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(@org.jetbrains.annotations.NotNull com.ss.android.vesdk.p r21, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.edit.ce r22, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.shortvideo.edit.p... r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f67494a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.vesdk.p> r5 = com.ss.android.vesdk.p.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.ce> r5 = com.ss.android.ugc.aweme.shortvideo.edit.ce.class
            r9[r12] = r5
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.p[]> r5 = com.ss.android.ugc.aweme.shortvideo.edit.p[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r5 = 0
            r7 = 1
            r8 = 76310(0x12a16, float:1.06933E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x005c
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            r15 = 0
            com.meituan.robust.ChangeQuickRedirect r16 = f67494a
            r17 = 1
            r18 = 76310(0x12a16, float:1.06933E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<com.ss.android.vesdk.p> r1 = com.ss.android.vesdk.p.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.ce> r1 = com.ss.android.ugc.aweme.shortvideo.edit.ce.class
            r0[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.edit.p[]> r1 = com.ss.android.ugc.aweme.shortvideo.edit.p[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Boolean.TYPE
            r19 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x005c:
            java.lang.String r3 = "veEditor"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "sizeProvider"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "controllers"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            int r3 = r22.d()
            int r4 = r22.b()
            if (r3 != r4) goto L_0x0080
            int r3 = r22.e()
            int r4 = r22.c()
            if (r3 != r4) goto L_0x0080
            return r11
        L_0x0080:
            com.ss.android.vesdk.aj r0 = r21.d()
            int r3 = r22.b()
            int r4 = r22.c()
            r22.d()
            r22.e()
            float r1 = (float) r4
            int r4 = r0.f77890a
            float r4 = (float) r4
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 * r5
            float r3 = (float) r3
            float r4 = r4 / r3
            float r1 = r1 * r4
            int r3 = r0.f77891b
            float r3 = (float) r3
            float r3 = r3 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r4 = 0
            int r5 = r0.f77890a
            float r5 = (float) r5
            int r0 = r0.f77891b
            float r0 = (float) r0
            float r0 = r0 - r3
            r1.set(r4, r3, r5, r0)
            int r0 = r2.length
            r3 = 0
        L_0x00b7:
            if (r11 >= r0) goto L_0x00c5
            r4 = r2[r11]
            if (r4 == 0) goto L_0x00c2
            boolean r4 = r4.a(r1)
            r3 = r3 | r4
        L_0x00c2:
            int r11 = r11 + 1
            goto L_0x00b7
        L_0x00c5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.edit.w.a(com.ss.android.vesdk.p, com.ss.android.ugc.aweme.shortvideo.edit.ce, com.ss.android.ugc.aweme.shortvideo.edit.p[]):boolean");
    }
}

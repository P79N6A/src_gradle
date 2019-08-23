package com.ss.android.ugc.aweme.newfollow.vh;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardVideoViewHolderPlanB;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardVideoViewHolderPlanA;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/feed/DialogController;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "calNewMediaItemSize", "", "screenWidth", "", "screenHeight", "padding", "", "ratioHW", "dstSize", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsForwardVideoViewHolderPlanB extends InsForwardVideoViewHolderPlanA {
    public static ChangeQuickRedirect y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r25, int r26, float r27, float r28, @org.jetbrains.annotations.NotNull int[] r29) {
        /*
            r24 = this;
            r0 = r25
            r3 = r29
            r4 = 5
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r25)
            r12 = 0
            r5[r12] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r26)
            r13 = 1
            r5[r13] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r27)
            r14 = 2
            r5[r14] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r28)
            r15 = 3
            r5[r15] = r6
            r16 = 4
            r5[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = y
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            r10[r14] = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            r10[r15] = r6
            java.lang.Class<int[]> r6 = int[].class
            r10[r16] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r8 = 0
            r9 = 62586(0xf47a, float:8.7702E-41)
            r6 = r24
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x0092
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r5[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r26)
            r5[r13] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r27)
            r5[r14] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r28)
            r5[r15] = r0
            r5[r16] = r3
            com.meituan.robust.ChangeQuickRedirect r19 = y
            r20 = 0
            r21 = 62586(0xf47a, float:8.7702E-41)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r14] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r15] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r16] = r1
            java.lang.Class r23 = java.lang.Void.TYPE
            r17 = r5
            r18 = r24
            r22 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0092:
            java.lang.String r4 = "dstSize"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r4)
            r4 = r26
            float r4 = (float) r4
            r5 = 1057971241(0x3f0f5c29, float:0.56)
            float r4 = r4 * r5
            r5 = 1068149419(0x3faaaaab, float:1.3333334)
            int r5 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00c3
            int r2 = (int) r4
            r3[r13] = r2
            r2 = r3[r13]
            float r2 = (float) r2
            r4 = 1070330457(0x3fcbf259, float:1.5933334)
            float r2 = r2 / r4
            int r2 = (int) r2
            r3[r12] = r2
            r2 = r3[r12]
            float r0 = (float) r0
            r4 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r4
            float r0 = r0 - r27
            int r0 = (int) r0
            if (r2 <= r0) goto L_0x00e6
            r3[r12] = r0
            return
        L_0x00c3:
            float r0 = (float) r0
            r5 = 1073741824(0x40000000, float:2.0)
            float r1 = r27 * r5
            float r0 = r0 - r1
            int r0 = (int) r0
            r3[r12] = r0
            r0 = r3[r12]
            float r0 = (float) r0
            float r0 = r0 * r28
            int r0 = (int) r0
            r3[r13] = r0
            r0 = r3[r13]
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e6
            int r0 = (int) r4
            r3[r13] = r0
            r0 = r3[r13]
            float r0 = (float) r0
            float r0 = r0 / r28
            int r0 = (int) r0
            r3[r12] = r0
        L_0x00e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanB.a(int, int, float, float, int[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsForwardVideoViewHolderPlanB(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull d dVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
    }
}

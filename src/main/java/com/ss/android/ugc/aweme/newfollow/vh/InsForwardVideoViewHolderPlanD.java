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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0012H\u0014¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardVideoViewHolderPlanD;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardVideoViewHolderPlanA;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/feed/DialogController;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "calNewMediaItemSize", "", "screenWidth", "", "ratioHW", "", "dstSize", "", "updateOriginContentLayoutParams", "view", "Landroid/view/View;", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsForwardVideoViewHolderPlanD extends InsForwardVideoViewHolderPlanA {
    public static ChangeQuickRedirect y;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.Nullable android.view.View r20, int r21, int r22) {
        /*
            r19 = this;
            r0 = r20
            r1 = 3
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r21)
            r10 = 1
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r11 = 2
            r2[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = y
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.view.View> r3 = android.view.View.class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 62589(0xf47d, float:8.7706E-41)
            r3 = r19
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0062
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r12[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r12[r11] = r0
            com.meituan.robust.ChangeQuickRedirect r14 = y
            r15 = 0
            r16 = 62589(0xf47d, float:8.7706E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0062:
            if (r0 == 0) goto L_0x0069
            android.view.ViewGroup$LayoutParams r2 = r20.getLayoutParams()
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            if (r2 == 0) goto L_0x013a
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            int[] r3 = new int[r11]
            android.content.Context r4 = r19.c()
            int r4 = com.bytedance.common.utility.UIUtils.getScreenWidth(r4)
            r5 = r22
            float r5 = (float) r5
            r6 = r21
            float r6 = (float) r6
            float r5 = r5 / r6
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r12[r9] = r6
            java.lang.Float r6 = java.lang.Float.valueOf(r5)
            r12[r10] = r6
            r12[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = y
            r15 = 0
            r16 = 62590(0xf47e, float:8.7707E-41)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class r7 = java.lang.Integer.TYPE
            r6[r9] = r7
            java.lang.Class r7 = java.lang.Float.TYPE
            r6[r10] = r7
            java.lang.Class<int[]> r7 = int[].class
            r6[r11] = r7
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r6
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            r7 = 1098907648(0x41800000, float:16.0)
            if (r6 == 0) goto L_0x00df
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r12[r9] = r4
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            r12[r10] = r4
            r12[r11] = r3
            com.meituan.robust.ChangeQuickRedirect r14 = y
            r15 = 0
            r16 = 62590(0xf47e, float:8.7707E-41)
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            r1[r9] = r4
            java.lang.Class r4 = java.lang.Float.TYPE
            r1[r10] = r4
            java.lang.Class<int[]> r4 = int[].class
            r1[r11] = r4
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x010b
        L_0x00df:
            r1 = 1067478330(0x3fa06d3a, float:1.2533333)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f7
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            r3[r10] = r1
            r1 = r3[r10]
            float r1 = (float) r1
            r4 = 1070330457(0x3fcbf259, float:1.5933334)
            float r1 = r1 / r4
            int r1 = (int) r1
            r3[r9] = r1
            goto L_0x010b
        L_0x00f7:
            float r1 = (float) r4
            float r1 = r1 * r5
            int r1 = (int) r1
            r3[r10] = r1
            android.content.Context r1 = r19.c()
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r7)
            int r1 = (int) r1
            int r1 = r1 * 2
            int r4 = r4 - r1
            r3[r9] = r4
        L_0x010b:
            r1 = r3[r9]
            r2.width = r1
            r1 = r3[r10]
            r2.height = r1
            android.content.Context r1 = r19.c()
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r7)
            int r1 = (int) r1
            r2.topMargin = r1
            android.content.Context r1 = r19.c()
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r7)
            int r1 = (int) r1
            r2.leftMargin = r1
            android.content.Context r1 = r19.c()
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r7)
            int r1 = (int) r1
            r2.rightMargin = r1
            android.view.ViewGroup$LayoutParams r2 = (android.view.ViewGroup.LayoutParams) r2
            r0.setLayoutParams(r2)
            return
        L_0x013a:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsForwardVideoViewHolderPlanD.a(android.view.View, int, int):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsForwardVideoViewHolderPlanD(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull d dVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, dVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(dVar, "dialogController");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
    }
}

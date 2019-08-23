package com.ss.android.ugc.aweme.newfollow.vh;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.vh.BaseFollowViewHolder;
import com.ss.android.ugc.aweme.utils.dp;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J0\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\u0006\u0010\u001b\u001a\u00020\u000eJ\"\u0010\u001c\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0014¨\u0006 "}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardImageViewHolderPlanA;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsForwardImageViewHolder;", "itemView", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "itemViewInteractListener", "Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/vh/BaseFollowViewHolder$ItemViewInteractListener;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "bindViews", "", "calNewMediaItemSize", "screenWidth", "", "screenHeight", "padding", "", "ratioHW", "dstSize", "", "inflateStub", "root", "Landroid/view/View;", "setRoundCorner", "updateOriginContentLayoutParams", "contentView", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsForwardImageViewHolderPlanA extends InsForwardImageViewHolder {
    public static ChangeQuickRedirect x;

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, x, false, 62556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, x, false, 62556, new Class[0], Void.TYPE);
            return;
        }
        super.u();
        if (PatchProxy.isSupport(new Object[0], this, x, false, 62557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, x, false, 62557, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            ViewGroup viewGroup = this.mImageLayout;
            if (viewGroup == null) {
                Intrinsics.throwNpe();
            }
            ViewGroup viewGroup2 = this.mImageLayout;
            if (viewGroup2 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup.setOutlineProvider(new dp(viewGroup2.getResources().getDimensionPixelOffset(C0906R.dimen.gh)));
            ViewGroup viewGroup3 = this.mImageLayout;
            if (viewGroup3 == null) {
                Intrinsics.throwNpe();
            }
            viewGroup3.setClipToOutline(true);
        }
    }

    public final void b(@NotNull View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, x, false, 62555, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, x, false, 62555, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "root");
        ViewStub viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        Intrinsics.checkExpressionValueIsNotNull(viewStub, "headStub");
        viewStub.setLayoutResource(C0906R.layout.a5b);
        a(viewStub.inflate(), 4.0f);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        Intrinsics.checkExpressionValueIsNotNull(viewStub2, "descStub");
        viewStub2.setLayoutResource(C0906R.layout.a4g);
        a(viewStub2.inflate(), 12.0f);
        ViewStub viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        Intrinsics.checkExpressionValueIsNotNull(viewStub3, "contentStub");
        viewStub3.setLayoutResource(C0906R.layout.a5d);
        a(viewStub3.inflate(), 12.0f, 0.0f, 0.0f, 16.0f);
        ViewStub viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwk);
        Intrinsics.checkExpressionValueIsNotNull(viewStub4, "bottomStub");
        viewStub4.setLayoutResource(C0906R.layout.a5a);
        a(viewStub4.inflate(), 16.0f);
        ViewStub viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwg);
        Intrinsics.checkExpressionValueIsNotNull(viewStub5, "commentStub");
        viewStub5.setLayoutResource(C0906R.layout.a57);
        a(viewStub5.inflate(), 0.0f, 4.0f);
    }

    public void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, x, false, 62558, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, x, false, 62558, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            int screenWidth = UIUtils.getScreenWidth(c());
            int screenHeight = UIUtils.getScreenHeight(c());
            float dip2Px = UIUtils.dip2Px(c(), 16.0f);
            a(screenWidth, screenHeight, dip2Px, ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            int i3 = (int) dip2Px;
            layoutParams2.setMargins(i3, i3, 0, 0);
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsForwardImageViewHolderPlanA(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull BaseFollowViewHolder.a aVar2, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar3) {
        super(followFeedLayout, aVar, lVar, aVar2, aVar3);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "itemView");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "itemViewInteractListener");
        Intrinsics.checkParameterIsNotNull(aVar3, "diggAwemeListener");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(int r25, int r26, float r27, float r28, @org.jetbrains.annotations.NotNull int[] r29) {
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
            com.meituan.robust.ChangeQuickRedirect r7 = x
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
            r9 = 62559(0xf45f, float:8.7664E-41)
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
            com.meituan.robust.ChangeQuickRedirect r19 = x
            r20 = 0
            r21 = 62559(0xf45f, float:8.7664E-41)
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
            int r6 = (r28 > r5 ? 1 : (r28 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c0
            int r2 = (int) r4
            r3[r13] = r2
            r2 = r3[r13]
            float r2 = (float) r2
            float r2 = r2 / r5
            int r2 = (int) r2
            r3[r12] = r2
            r2 = r3[r12]
            float r0 = (float) r0
            r4 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r4
            float r0 = r0 - r27
            int r0 = (int) r0
            if (r2 <= r0) goto L_0x00e3
            r3[r12] = r0
            return
        L_0x00c0:
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
            if (r0 <= 0) goto L_0x00e3
            int r0 = (int) r4
            r3[r13] = r0
            r0 = r3[r13]
            float r0 = (float) r0
            float r0 = r0 / r28
            int r0 = (int) r0
            r3[r12] = r0
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsForwardImageViewHolderPlanA.a(int, int, float, float, int[]):void");
    }
}

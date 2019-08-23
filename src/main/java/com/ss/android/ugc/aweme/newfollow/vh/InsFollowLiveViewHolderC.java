package com.ss.android.ugc.aweme.newfollow.vh;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0011H\u0016J\"\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0002\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderC;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowLiveViewHolderB;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "dialogController", "Lcom/ss/android/ugc/aweme/feed/DialogController;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;Lcom/ss/android/ugc/aweme/feed/DialogController;)V", "adjustMediaItemLayout", "", "calNewMediaItemSize", "screenWidth", "", "ratioHW", "", "dstSize", "", "inflateStub", "root", "Landroid/view/View;", "onLiveSizeChanged", "width", "height", "updateMediaItemLayoutParams", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class InsFollowLiveViewHolderC extends InsFollowLiveViewHolderB {
    public static ChangeQuickRedirect aa;

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, aa, false, 62502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, aa, false, 62502, new Class[0], Void.TYPE);
        } else if (ag() != null) {
            View view = this.g;
            UrlModel urlModel = ag().roomCover;
            Intrinsics.checkExpressionValueIsNotNull(urlModel, "mRoom.roomCover");
            int width = urlModel.getWidth();
            UrlModel urlModel2 = ag().roomCover;
            Intrinsics.checkExpressionValueIsNotNull(urlModel2, "mRoom.roomCover");
            a(view, width, urlModel2.getHeight());
        }
    }

    public final void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        if (PatchProxy.isSupport(new Object[]{view}, this, aa, false, 62500, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, aa, false, 62500, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view4 = null;
        if (view != null) {
            viewStub = (ViewStub) view.findViewById(C0906R.id.cwo);
        } else {
            viewStub = null;
        }
        if (viewStub != null) {
            viewStub.setLayoutResource(C0906R.layout.a5b);
        }
        if (viewStub != null) {
            view2 = viewStub.inflate();
        } else {
            view2 = null;
        }
        a(view2, 4.0f);
        if (view != null) {
            viewStub2 = (ViewStub) view.findViewById(C0906R.id.cwh);
        } else {
            viewStub2 = null;
        }
        if (viewStub2 != null) {
            viewStub2.setLayoutResource(C0906R.layout.a4g);
        }
        if (viewStub2 != null) {
            view3 = viewStub2.inflate();
        } else {
            view3 = null;
        }
        a(view3, 12.0f);
        if (view != null) {
            viewStub3 = (ViewStub) view.findViewById(C0906R.id.cwl);
        } else {
            viewStub3 = null;
        }
        if (viewStub3 != null) {
            viewStub3.setLayoutResource(C0906R.layout.a48);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        }
        a(view4, 16.0f, 16.0f, 0.0f, 0.0f);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62501, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62501, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(this.g, i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r22, float r23, @org.jetbrains.annotations.NotNull int[] r24) {
        /*
            r21 = this;
            r0 = r22
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r22)
            r11 = 0
            r4[r11] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r23)
            r12 = 1
            r4[r12] = r5
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = aa
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Float.TYPE
            r9[r12] = r5
            java.lang.Class<int[]> r5 = int[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 62504(0xf428, float:8.7587E-41)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0065
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r14[r11] = r0
            java.lang.Float r0 = java.lang.Float.valueOf(r23)
            r14[r12] = r0
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = aa
            r17 = 0
            r18 = 62504(0xf428, float:8.7587E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Float.TYPE
            r0[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0065:
            java.lang.String r3 = "dstSize"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            r2[r11] = r0
            r3 = 1067478330(0x3fa06d3a, float:1.2533333)
            int r4 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x007a
            float r0 = (float) r0
            float r0 = r0 * r3
            int r0 = (int) r0
            r2[r12] = r0
            return
        L_0x007a:
            float r0 = (float) r0
            float r0 = r0 * r23
            int r0 = (int) r0
            r2[r12] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsFollowLiveViewHolderC.a(int, float, int[]):void");
    }

    public final void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62503, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, aa, false, 62503, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (view2 != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            a(UIUtils.getScreenWidth(X()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}

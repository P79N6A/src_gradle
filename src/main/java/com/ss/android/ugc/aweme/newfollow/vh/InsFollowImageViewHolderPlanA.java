package com.ss.android.ugc.aweme.newfollow.vh;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.a.a;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedLayout;
import com.ss.android.ugc.aweme.newfollow.ui.FollowFeedTagLayout2;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.utils.dp;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\b\u0010\r\u001a\u00020\fH\u0014J\b\u0010\u000e\u001a\u00020\fH\u0016J0\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\fH\u0014J\"\u0010\u001c\u001a\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0011H\u0014¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowImageViewHolderPlanA;", "Lcom/ss/android/ugc/aweme/newfollow/vh/InsFollowImageViewHolder;", "view", "Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;", "provider", "Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;", "scrollStateManager", "Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;", "diggAwemeListener", "Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;", "(Lcom/ss/android/ugc/aweme/newfollow/ui/FollowFeedLayout;Lcom/ss/android/ugc/aweme/forward/callback/IContainerStatusProvider;Lcom/ss/android/ugc/aweme/newfollow/util/RecyclerViewScrollStateManager;Lcom/ss/android/ugc/aweme/newfollow/callback/DiggAwemeListener;)V", "bindPoiTagView", "", "bindShoppingView", "bindTagLayout", "calNewMediaItemSize", "screenWidth", "", "screenHeight", "padding", "", "ratioHW", "dstSize", "", "inflateStub", "root", "Landroid/view/View;", "setRoundCorner", "updateMediaItemLayoutParams", "mediaWidth", "mediaHeight", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class InsFollowImageViewHolderPlanA extends InsFollowImageViewHolder {
    public static ChangeQuickRedirect V;

    public final void ae() {
    }

    public final void H() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 62424, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 62424, new Class[0], Void.TYPE);
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

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 62425, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 62425, new Class[0], Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Aweme aweme = this.j;
            Intrinsics.checkExpressionValueIsNotNull(aweme, "mAweme");
            jSONObject.put("request_id", aweme.getRequestId());
        } catch (JSONException unused) {
        }
        FollowFeedTagLayout2 followFeedTagLayout2 = this.mFeedTagLayout2;
        if (followFeedTagLayout2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(followFeedTagLayout2, "mFeedTagLayout2!!");
        followFeedTagLayout2.setVisibility(0);
        FollowFeedTagLayout2 followFeedTagLayout22 = this.mFeedTagLayout2;
        if (followFeedTagLayout22 == null) {
            Intrinsics.throwNpe();
        }
        followFeedTagLayout22.setPageType(this.s);
        FollowFeedTagLayout2 followFeedTagLayout23 = this.mFeedTagLayout2;
        if (followFeedTagLayout23 == null) {
            Intrinsics.throwNpe();
        }
        followFeedTagLayout23.setFollowPageType(this.t);
        FollowFeedTagLayout2 followFeedTagLayout24 = this.mFeedTagLayout2;
        if (followFeedTagLayout24 == null) {
            Intrinsics.throwNpe();
        }
        Aweme aweme2 = this.j;
        Context X = X();
        if (X != null) {
            followFeedTagLayout24.a(aweme2, (Activity) X, this.r, jSONObject);
            if (StringsKt.equals("poi_page", this.r, true)) {
                FollowFeedTagLayout2 followFeedTagLayout25 = this.mFeedTagLayout2;
                if (followFeedTagLayout25 == null) {
                    Intrinsics.throwNpe();
                }
                followFeedTagLayout25.b();
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0149  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = V
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 62426(0xf3da, float:8.7477E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = V
            r5 = 0
            r6 = 62426(0xf3da, float:8.7477E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = r1.getStatus()
            if (r1 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r1 = r1.getStatus()
            java.lang.String r2 = "mAweme.status"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r1 = r1.isWithGoods()
            if (r1 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.x r1 = r1.getPromotion()
            if (r1 == 0) goto L_0x0057
            r1 = 1
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 == 0) goto L_0x0149
            android.widget.TextView r1 = r9.mShoppingView
            if (r1 != 0) goto L_0x0061
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0061:
            java.lang.String r2 = "mShoppingView!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r0)
            android.widget.TextView r0 = r9.mShoppingView
            if (r0 != 0) goto L_0x0070
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0070:
            java.lang.String r1 = "mShoppingView!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commerce.service.models.x r1 = r1.getPromotion()
            if (r1 != 0) goto L_0x0085
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0085:
            java.lang.String r1 = r1.getShortTitle()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = r0.getPromotion()
            if (r0 == 0) goto L_0x015a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.j
            java.lang.String r1 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            com.ss.android.ugc.aweme.commerce.service.models.x r0 = r0.getPromotion()
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = new com.ss.android.ugc.aweme.commerce.service.logs.ak
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.e(r2)
            java.lang.String r2 = "video_cart_tag"
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.a((java.lang.String) r2)
            if (r0 != 0) goto L_0x00c5
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00c5:
            java.lang.String r2 = r0.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.b(r2)
            int r2 = r0.getPromotionSource()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.a((java.lang.Integer) r2)
            java.lang.String r2 = r9.r
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.d(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.commerce.service.logs.ak r1 = r1.c(r2)
            r1.b()
            com.ss.android.ugc.aweme.commerce.service.logs.al r1 = new com.ss.android.ugc.aweme.commerce.service.logs.al
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.j
            java.lang.String r3 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.commerce.service.logs.al r1 = r1.f(r2)
            java.lang.String r2 = "video_cart_tag"
            com.ss.android.ugc.aweme.commerce.service.logs.al r1 = r1.b((java.lang.String) r2)
            java.lang.String r2 = r0.getPromotionId()
            com.ss.android.ugc.aweme.commerce.service.logs.al r1 = r1.c((java.lang.String) r2)
            int r0 = r0.getPromotionSource()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r1.a((java.lang.Integer) r0)
            java.lang.String r1 = r9.r
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.g(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r9.j
            java.lang.String r2 = "mAweme"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.d(r1)
            java.lang.String r1 = "video_play"
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.e(r1)
            r1 = 0
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.h(r1)
            java.lang.String r1 = r9.r
            com.ss.android.ugc.aweme.commerce.service.logs.al r0 = r0.a((java.lang.String) r1)
            r0.b()
            return
        L_0x0149:
            android.widget.TextView r0 = r9.mShoppingView
            if (r0 != 0) goto L_0x0150
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0150:
            java.lang.String r1 = "mShoppingView!!"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanA.t():void");
    }

    public final void a(@Nullable View view) {
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        View view3;
        ViewStub viewStub3;
        View view4;
        ViewStub viewStub4;
        ViewStub viewStub5;
        View view5;
        ViewStub viewStub6;
        if (PatchProxy.isSupport(new Object[]{view}, this, V, false, 62423, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, V, false, 62423, new Class[]{View.class}, Void.TYPE);
            return;
        }
        View view6 = null;
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
            viewStub3.setLayoutResource(C0906R.layout.a41);
        }
        if (viewStub3 != null) {
            view4 = viewStub3.inflate();
        } else {
            view4 = null;
        }
        a(view4, 12.0f, 0.0f, 16.0f, 16.0f);
        if (view != null) {
            viewStub4 = (ViewStub) view.findViewById(C0906R.id.cwz);
        } else {
            viewStub4 = null;
        }
        if (viewStub4 != null) {
            viewStub4.setLayoutResource(C0906R.layout.a4a);
        }
        if (viewStub4 != null) {
            viewStub4.inflate();
        }
        if (view != null) {
            viewStub5 = (ViewStub) view.findViewById(C0906R.id.cwk);
        } else {
            viewStub5 = null;
        }
        if (viewStub5 != null) {
            viewStub5.setLayoutResource(C0906R.layout.a5a);
        }
        if (viewStub5 != null) {
            view5 = viewStub5.inflate();
        } else {
            view5 = null;
        }
        a(view5, 16.0f);
        if (view != null) {
            viewStub6 = (ViewStub) view.findViewById(C0906R.id.cwg);
        } else {
            viewStub6 = null;
        }
        if (viewStub6 != null) {
            viewStub6.setLayoutResource(C0906R.layout.a57);
        }
        if (viewStub6 != null) {
            view6 = viewStub6.inflate();
        }
        a(view6, 0.0f, 4.0f);
    }

    public void a(@Nullable View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, V, false, 62427, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Integer.valueOf(i), Integer.valueOf(i2)}, this, V, false, 62427, new Class[]{View.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
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
            a(UIUtils.getScreenWidth(X()), UIUtils.getScreenHeight(X()), UIUtils.dip2Px(X(), 16.0f), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InsFollowImageViewHolderPlanA(@NotNull FollowFeedLayout followFeedLayout, @NotNull a aVar, @NotNull l lVar, @NotNull com.ss.android.ugc.aweme.newfollow.b.a aVar2) {
        super(followFeedLayout, aVar, lVar, aVar2);
        Intrinsics.checkParameterIsNotNull(followFeedLayout, "view");
        Intrinsics.checkParameterIsNotNull(aVar, "provider");
        Intrinsics.checkParameterIsNotNull(lVar, "scrollStateManager");
        Intrinsics.checkParameterIsNotNull(aVar2, "diggAwemeListener");
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
            com.meituan.robust.ChangeQuickRedirect r7 = V
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
            r9 = 62428(0xf3dc, float:8.748E-41)
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
            com.meituan.robust.ChangeQuickRedirect r19 = V
            r20 = 0
            r21 = 62428(0xf3dc, float:8.748E-41)
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanA.a(int, int, float, float, int[]):void");
    }
}

package com.ss.android.ugc.aweme.commercialize.symphony;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ad.symphony.c.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.adapter.BaseFeedViewHolder;
import com.ss.android.ugc.aweme.feed.adapter.IFeedPlayerView;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.g;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;
import com.ss.android.ugc.aweme.longvideo.feature.VolumeController;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.u.l;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.TypeCastException;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BQ\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0002\u0010\u0014J\u001a\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u001c2\u0006\u0010+\u001a\u00020\u001eH\u0016J\b\u0010,\u001a\u00020)H\u0016J\n\u0010-\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010.\u001a\u00020\u0007H\u0016J\n\u0010/\u001a\u0004\u0018\u00010\u0005H\u0016J\n\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020)H\u0016J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\u0012\u00106\u001a\u00020)2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020)H\u0016J\b\u0010:\u001a\u00020)H\u0016J\b\u0010;\u001a\u00020)H\u0016J\b\u0010<\u001a\u00020)H\u0016J\b\u0010=\u001a\u00020)H\u0016J\b\u0010>\u001a\u00020)H\u0016J\b\u0010?\u001a\u00020)H\u0016J\u0010\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020\u0007H\u0016J\b\u0010B\u001a\u00020)H\u0016J\u0010\u0010C\u001a\u00020)2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\b\u0010D\u001a\u00020)H\u0016J(\u0010E\u001a\u0002HF\"\u0004\b\u0000\u0010F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00020I\u0012\u0004\u0012\u0002HF0HH\b¢\u0006\u0002\u0010JR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006K"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoViewHolder;", "Lcom/ss/android/ugc/aweme/feed/adapter/BaseFeedViewHolder;", "Lcom/bytedance/ad/symphony/listener/nativead/NativeAdListener;", "Lcom/ss/android/ugc/aweme/commercialize/symphony/AdDislikeLayout$IDislikeClick;", "mContext", "Landroid/content/Context;", "fromPage", "", "view", "Landroid/view/View;", "onVideoEvent", "Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "Lcom/ss/android/ugc/aweme/feed/event/VideoEvent;", "eventType", "", "tapTouchListener", "Landroid/view/View$OnTouchListener;", "fragment", "Landroid/support/v4/app/Fragment;", "pageType", "(Landroid/content/Context;ILandroid/view/View;Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;Ljava/lang/String;Landroid/view/View$OnTouchListener;Landroid/support/v4/app/Fragment;I)V", "getEventType", "()Ljava/lang/String;", "getFragment", "()Landroid/support/v4/app/Fragment;", "getFromPage", "()I", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mSelected", "", "mSymphonyAd", "Lcom/ss/android/ugc/aweme/commercialize/symphony/model/SymphonyAd;", "getOnVideoEvent", "()Lcom/ss/android/ugc/aweme/feed/event/OnInternalEventListener;", "getPageType", "getTapTouchListener", "()Landroid/view/View$OnTouchListener;", "getView", "()Landroid/view/View;", "bind", "", "aweme", "loadDirectly", "doAdaptation", "getAweme", "getAwemeType", "getContext", "getFeedPlayerView", "Lcom/ss/android/ugc/aweme/feed/adapter/IFeedPlayerView;", "getViewType", "lazyBindView", "onAdClick", "onAdShow", "onChanged", "t", "Lcom/ss/android/ugc/aweme/arch/widgets/base/KVData;", "onClickDislike", "onPause", "onResume", "onToggleAutoPlay", "onVideoComplete", "onVideoPause", "onVideoPlay", "onViewHolderSelected", "position", "onViewHolderUnSelected", "postAction", "unBind", "withView", "R", "f", "Lkotlin/Function1;", "Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonyVideoView;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends BaseFeedViewHolder implements a, AdDislikeLayout.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39606a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39607b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final View f39608c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final aa<ar> f39609d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public final String f39610e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final View.OnTouchListener f39611f;
    @NotNull
    public final Fragment g;
    public final int h;
    private Aweme m;
    private boolean n;
    private final Context o;

    public final void f() {
        this.m = null;
    }

    public final void g() {
    }

    public final void i() {
    }

    @Nullable
    public final IFeedPlayerView k() {
        return null;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
    }

    @Nullable
    public final Aweme d() {
        return this.m;
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0474  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x099f  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x09c2  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x09c7  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x09f4  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x09f9  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0a18  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0a65  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r26) {
        /*
            r25 = this;
            r7 = r25
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r9 = 0
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39606a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 32195(0x7dc3, float:4.5115E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003c
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f39606a
            r3 = 0
            r4 = 32195(0x7dc3, float:4.5115E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r25
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003c:
            r7.n = r8
            android.view.View r0 = r7.f39608c
            if (r0 == 0) goto L_0x0bc3
            com.ss.android.ugc.aweme.commercialize.symphony.d r0 = (com.ss.android.ugc.aweme.commercialize.symphony.d) r0
            com.ss.android.ugc.aweme.commercialize.symphony.c r1 = com.ss.android.ugc.aweme.commercialize.symphony.c.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r25.d()
            com.bytedance.ad.symphony.ad.nativead.INativeAd r1 = r1.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            java.lang.String r2 = "SymphonyAdManager.getInstance().getNativeAd(aweme)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r25.d()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r25.d()
            java.lang.String r3 = com.ss.android.ugc.aweme.commercialize.utils.c.M(r3)
            java.lang.String r4 = "AdDataUtils.getSymphonyMusicDesc(aweme)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r25.d()
            java.lang.String r4 = com.ss.android.ugc.aweme.commercialize.utils.c.N(r4)
            java.lang.String r5 = "AdDataUtils.getSymphonyLabel(aweme)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r5 = r7
            com.bytedance.ad.symphony.c.a.a r5 = (com.bytedance.ad.symphony.c.a.a) r5
            r6 = r7
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b r6 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.b) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r25.d()
            int r15 = com.ss.android.ugc.aweme.commercialize.utils.c.O(r10)
            r14 = 7
            java.lang.Object[] r10 = new java.lang.Object[r14]
            r10[r9] = r1
            r10[r8] = r2
            r17 = 2
            r10[r17] = r3
            r13 = 3
            r10[r13] = r4
            r18 = 4
            r10[r18] = r5
            r12 = 5
            r10[r12] = r6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            r19 = 6
            r10[r19] = r11
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r20 = 0
            r21 = 32136(0x7d88, float:4.5032E-41)
            java.lang.Class[] r11 = new java.lang.Class[r14]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r22 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r11[r9] = r22
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r22 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r11[r8] = r22
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            r11[r17] = r22
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            r11[r13] = r22
            java.lang.Class<com.bytedance.ad.symphony.c.a.a> r22 = com.bytedance.ad.symphony.c.a.a.class
            r11[r18] = r22
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b> r22 = com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.b.class
            r11[r12] = r22
            java.lang.Class r22 = java.lang.Integer.TYPE
            r11[r19] = r22
            java.lang.Class r22 = java.lang.Void.TYPE
            r23 = r11
            r11 = r0
            r12 = r16
            r13 = r20
            r8 = 7
            r14 = r21
            r24 = r15
            r15 = r23
            r16 = r22
            boolean r10 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r10 == 0) goto L_0x011f
            java.lang.Object[] r10 = new java.lang.Object[r8]
            r10[r9] = r1
            r1 = 1
            r10[r1] = r2
            r10[r17] = r3
            r15 = 3
            r10[r15] = r4
            r10[r18] = r5
            r14 = 5
            r10[r14] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r10[r19] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r1 = 32136(0x7d88, float:4.5032E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r3 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r2[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r4 = 1
            r2[r4] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r17] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r15] = r3
            java.lang.Class<com.bytedance.ad.symphony.c.a.a> r3 = com.bytedance.ad.symphony.c.a.a.class
            r2[r18] = r3
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b> r3 = com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.b.class
            r2[r14] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r19] = r3
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r14 = r1
            r15 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0ba5
        L_0x011f:
            r14 = 5
            r15 = 3
            java.lang.String r8 = "soundDesc"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r8)
            java.lang.String r8 = "adLabel"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r4, r8)
            r0.f39561d = r1
            r0.f39562e = r3
            r0.f39563f = r4
            r0.f39560c = r5
            r0.h = r6
            r1 = r24
            r0.j = r1
            r0.m = r2
            r0.i = r9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r1 = 32141(0x7d8d, float:4.5039E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            r3 = 5
            r14 = r1
            r1 = 3
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r4 = 2131170223(0x7f0713af, float:1.7954798E38)
            r5 = 2131168383(0x7f070c7f, float:1.7951066E38)
            if (r2 == 0) goto L_0x016a
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32141(0x7d8d, float:4.5039E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0285
        L_0x016a:
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 != 0) goto L_0x0170
            goto L_0x0285
        L_0x0170:
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x017d
            boolean r2 = r2.i()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x017e
        L_0x017d:
            r2 = 0
        L_0x017e:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r8)
            if (r2 == 0) goto L_0x01a1
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x0190
            r2 = 2131165255(0x7f070047, float:1.7944722E38)
            r0.a(r2)
        L_0x0190:
            r2 = 2131165255(0x7f070047, float:1.7944722E38)
            android.view.View r2 = r0.a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            java.lang.String r8 = "adVideoTypeView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r8)
            r2.setVisibility(r9)
        L_0x01a1:
            r2 = 2131168757(0x7f070df5, float:1.7951825E38)
            android.view.View r2 = r0.a(r2)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.removeAllViews()
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x01da
            android.view.ViewGroup[] r2 = new android.view.ViewGroup[r1]
            r8 = 2131168757(0x7f070df5, float:1.7951825E38)
            android.view.View r8 = r0.a(r8)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r2[r9] = r8
            android.view.View r8 = r0.a(r4)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r8 = (com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r8
            android.view.ViewGroup r8 = r8.getAddOtherLayout()
            r10 = 1
            r2[r10] = r8
            r8 = 2131168387(0x7f070c83, float:1.7951074E38)
            android.view.View r8 = r0.a(r8)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r2[r17] = r8
        L_0x01da:
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x027c
            r2 = 2131165248(0x7f070040, float:1.7944708E38)
            r0.a(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r8 = 2131165249(0x7f070041, float:1.794471E38)
            android.view.View r8 = r0.a(r8)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r8 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r8
            r2.add(r8)
            r8 = 2131165247(0x7f07003f, float:1.7944706E38)
            android.view.View r8 = r0.a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
            r2.add(r8)
            r8 = 2131165252(0x7f070044, float:1.7944716E38)
            android.view.View r8 = r0.a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
            r2.add(r8)
            r8 = 2131168379(0x7f070c7b, float:1.7951058E38)
            android.view.View r8 = r0.a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
            r2.add(r8)
            boolean r8 = r0.e()
            if (r8 == 0) goto L_0x027c
            r8 = 2131165827(0x7f070283, float:1.7945882E38)
            android.view.View r8 = r0.a(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2.add(r8)
            r8 = 2131165828(0x7f070284, float:1.7945884E38)
            android.view.View r8 = r0.a(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r8
            r2.add(r8)
            r8 = 2131165829(0x7f070285, float:1.7945886E38)
            android.view.View r8 = r0.a(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2.add(r8)
            r8 = 2131165826(0x7f070282, float:1.794588E38)
            android.view.View r8 = r0.a(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r2.add(r8)
            r8 = 2131168380(0x7f070c7c, float:1.795106E38)
            android.view.View r8 = r0.a(r8)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r8
            r2.add(r8)
            r8 = 2131168382(0x7f070c7e, float:1.7951064E38)
            android.view.View r8 = r0.a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
            r2.add(r8)
            android.view.View r8 = r0.a(r5)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r8 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r8
            r2.add(r8)
            r8 = 2131168378(0x7f070c7a, float:1.7951056E38)
            android.view.View r8 = r0.a(r8)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r8
            r2.add(r8)
        L_0x027c:
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x0285
            com.ss.android.ugc.aweme.commercialize.symphony.d$k r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$k
            r2.<init>(r0)
        L_0x0285:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32137(0x7d89, float:4.5034E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            r8 = 8
            if (r2 == 0) goto L_0x02aa
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32137(0x7d89, float:4.5034E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0483
        L_0x02aa:
            android.view.View r2 = r0.a(r4)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r2 = (com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r2
            r2.a()
            android.view.View r2 = r0.a(r4)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r2 = (com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r2
            com.bytedance.ad.symphony.ad.nativead.INativeAd r15 = r0.f39561d
            java.lang.String r14 = r0.f39563f
            com.ss.android.ugc.aweme.commercialize.symphony.d$l r10 = new com.ss.android.ugc.aweme.commercialize.symphony.d$l
            r11 = 240(0xf0, double:1.186E-321)
            r10.<init>(r0, r11)
            r13 = r10
            kotlin.jvm.functions.Function0 r13 = (kotlin.jvm.functions.Function0) r13
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r15
            r11 = 1
            r10[r11] = r14
            r10[r17] = r13
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.f39519a
            r16 = 0
            r18 = 32116(0x7d74, float:4.5004E-41)
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r19 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r6[r9] = r19
            java.lang.Class<java.lang.String> r19 = java.lang.String.class
            r6[r11] = r19
            java.lang.Class<kotlin.jvm.functions.Function0> r11 = kotlin.jvm.functions.Function0.class
            r6[r17] = r11
            java.lang.Class r19 = java.lang.Void.TYPE
            r11 = r2
            r3 = r13
            r13 = r16
            r5 = r14
            r14 = r18
            r18 = r15
            r15 = r6
            r16 = r19
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r6 == 0) goto L_0x031c
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            r6 = 1
            r10[r6] = r5
            r10[r17] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.f39519a
            r13 = 0
            r14 = 32116(0x7d74, float:4.5004E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r1 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r15[r9] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r15[r6] = r1
            java.lang.Class<kotlin.jvm.functions.Function0> r1 = kotlin.jvm.functions.Function0.class
            r15[r17] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0437
        L_0x031c:
            java.lang.String r1 = "sponsor"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r1)
            java.lang.String r1 = "closeAction"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            r1 = 2131165828(0x7f070284, float:1.7945884E38)
            android.view.View r1 = r2.a(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r6.<init>()
            r10 = 1
            java.lang.String[] r11 = new java.lang.String[r10]
            if (r18 == 0) goto L_0x033e
            java.lang.String r10 = r18.f()
            goto L_0x033f
        L_0x033e:
            r10 = 0
        L_0x033f:
            r11[r9] = r10
            java.util.List r10 = kotlin.collections.CollectionsKt.mutableListOf(r11)
            r6.setUrlList(r10)
            com.ss.android.ugc.aweme.base.c.b(r1, r6)
            if (r18 == 0) goto L_0x0352
            java.lang.String r6 = r18.c()
            goto L_0x0353
        L_0x0352:
            r6 = 0
        L_0x0353:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0360
            int r1 = r6.length()
            if (r1 != 0) goto L_0x035e
            goto L_0x0360
        L_0x035e:
            r1 = 0
            goto L_0x0361
        L_0x0360:
            r1 = 1
        L_0x0361:
            if (r1 != 0) goto L_0x037e
            r1 = 2131165829(0x7f070285, float:1.7945886E38)
            android.view.View r1 = r2.a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r6 = "cardAdTitle"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            if (r18 == 0) goto L_0x0378
            java.lang.String r6 = r18.c()
            goto L_0x0379
        L_0x0378:
            r6 = 0
        L_0x0379:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
        L_0x037e:
            if (r18 == 0) goto L_0x0385
            java.lang.String r6 = r18.d()
            goto L_0x0386
        L_0x0385:
            r6 = 0
        L_0x0386:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0393
            int r1 = r6.length()
            if (r1 != 0) goto L_0x0391
            goto L_0x0393
        L_0x0391:
            r1 = 0
            goto L_0x0394
        L_0x0393:
            r1 = 1
        L_0x0394:
            if (r1 != 0) goto L_0x03b1
            r1 = 2131165826(0x7f070282, float:1.794588E38)
            android.view.View r1 = r2.a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r6 = "cardAdDesc"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            if (r18 == 0) goto L_0x03ab
            java.lang.String r6 = r18.d()
            goto L_0x03ac
        L_0x03ab:
            r6 = 0
        L_0x03ac:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
        L_0x03b1:
            if (r18 == 0) goto L_0x03b8
            java.lang.String r6 = r18.g()
            goto L_0x03b9
        L_0x03b8:
            r6 = 0
        L_0x03b9:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x03c6
            int r1 = r6.length()
            if (r1 != 0) goto L_0x03c4
            goto L_0x03c6
        L_0x03c4:
            r1 = 0
            goto L_0x03c7
        L_0x03c6:
            r1 = 1
        L_0x03c7:
            if (r1 != 0) goto L_0x03e4
            r1 = 2131165827(0x7f070283, float:1.7945882E38)
            android.view.View r1 = r2.a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r6 = "cardAdDownload"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            if (r18 == 0) goto L_0x03de
            java.lang.String r6 = r18.g()
            goto L_0x03df
        L_0x03de:
            r6 = 0
        L_0x03df:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
        L_0x03e4:
            r1 = 2131165832(0x7f070288, float:1.7945892E38)
            android.view.View r1 = r2.a(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r6 = "cardSponsorText"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r6)
            r14 = r5
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r1.setText(r14)
            r1 = 2131165830(0x7f070286, float:1.7945888E38)
            android.view.View r1 = r2.a(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$a
            r5.<init>(r3)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
            r1 = 2131165831(0x7f070287, float:1.794589E38)
            android.view.View r1 = r2.a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.String r3 = "cardOthersTagLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            int r1 = r1.getChildCount()
            if (r1 != 0) goto L_0x0430
            r1 = 2131165831(0x7f070287, float:1.794589E38)
            android.view.View r1 = r2.a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.String r3 = "cardOthersTagLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            r1.setVisibility(r8)
        L_0x0430:
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard$b r1 = com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard.b.f39526b
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r2.setOnClickListener(r1)
        L_0x0437:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.m
            if (r1 == 0) goto L_0x0446
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0446
            int r1 = r1.getCardInteractionSeconds()
            goto L_0x0447
        L_0x0446:
            r1 = 0
        L_0x0447:
            if (r1 <= 0) goto L_0x0483
            boolean r1 = r0.e()
            if (r1 == 0) goto L_0x0483
            android.view.View r1 = r0.a(r4)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard r1 = (com.ss.android.ugc.aweme.commercialize.symphony.SymphonyCard) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$m r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$m
            r3 = 240(0xf0, double:1.186E-321)
            r2.<init>(r0, r3)
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r0.m
            if (r3 == 0) goto L_0x0471
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0471
            int r3 = r3.getCardInteractionSeconds()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            goto L_0x0472
        L_0x0471:
            r6 = 0
        L_0x0472:
            if (r6 != 0) goto L_0x0477
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0477:
            int r3 = r6.intValue()
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r1.postDelayed(r2, r3)
        L_0x0483:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32144(0x7d90, float:4.5043E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x04a6
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32144(0x7d90, float:4.5043E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x06cc
        L_0x04a6:
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r1 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r1
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x04b8
            java.lang.String r6 = r2.f()
            goto L_0x04b9
        L_0x04b8:
            r6 = 0
        L_0x04b9:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r6)
            r1 = 2131165800(0x7f070268, float:1.7945827E38)
            android.view.View r2 = r0.a(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.b r3 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r3.<init>()
            android.view.View$OnTouchListener r3 = (android.view.View.OnTouchListener) r3
            r2.setOnTouchListener(r3)
            android.view.View r2 = r0.a(r1)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            com.ss.android.ugc.aweme.commercialize.symphony.d$e r3 = new com.ss.android.ugc.aweme.commercialize.symphony.d$e
            r3.<init>(r0)
            android.view.View$OnClickListener r3 = (android.view.View.OnClickListener) r3
            r2.setOnClickListener(r3)
            r2 = 2131165797(0x7f070265, float:1.7945821E38)
            android.view.View r3 = r0.a(r2)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.ss.android.ugc.aweme.commercialize.symphony.b r4 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r4.<init>()
            android.view.View$OnTouchListener r4 = (android.view.View.OnTouchListener) r4
            r3.setOnTouchListener(r4)
            android.view.View r3 = r0.a(r2)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            com.ss.android.ugc.aweme.commercialize.symphony.d$f r4 = new com.ss.android.ugc.aweme.commercialize.symphony.d$f
            r4.<init>(r0)
            android.view.View$OnClickListener r4 = (android.view.View.OnClickListener) r4
            r3.setOnClickListener(r4)
            r3 = 2131165802(0x7f07026a, float:1.7945831E38)
            android.view.View r4 = r0.a(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.ss.android.ugc.aweme.commercialize.symphony.b r5 = new com.ss.android.ugc.aweme.commercialize.symphony.b
            r5.<init>()
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r4.setOnTouchListener(r5)
            android.view.View r4 = r0.a(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.ss.android.ugc.aweme.commercialize.symphony.d$g r5 = new com.ss.android.ugc.aweme.commercialize.symphony.d$g
            r5.<init>(r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            android.view.View r4 = r0.a(r3)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.ss.android.ugc.aweme.framework.services.ServiceManager r5 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r6 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r5 = r5.getService(r6)
            java.lang.String r6 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r5 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r5
            int r5 = r5.getShareIconResource()
            r4.setImageResource(r5)
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32145(0x7d91, float:4.5045E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r4 == 0) goto L_0x0566
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32145(0x7d91, float:4.5045E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x06cc
        L_0x0566:
            boolean r4 = com.ss.android.ugc.aweme.utils.u.a()
            if (r4 == 0) goto L_0x06bb
            r4 = 2131165799(0x7f070267, float:1.7945825E38)
            android.view.View r4 = r0.a(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r5 = "buttonDownload"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            r4.setVisibility(r9)
            com.ss.android.ugc.aweme.framework.services.ServiceManager r4 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.bridgeservice.IBridgeService> r5 = com.ss.android.ugc.aweme.bridgeservice.IBridgeService.class
            java.lang.Object r4 = r4.getService(r5)
            java.lang.String r5 = "ServiceManager.get().get…ridgeService::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r4 = (com.ss.android.ugc.aweme.bridgeservice.IBridgeService) r4
            int r4 = r4.getVideoViewDownloadItemIcon()
            r5 = -1
            if (r4 == r5) goto L_0x06bb
            r5 = 2131165799(0x7f070267, float:1.7945825E38)
            android.view.View r5 = r0.a(r5)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r5.setImageResource(r4)
            r4 = 2131165799(0x7f070267, float:1.7945825E38)
            android.view.View r4 = r0.a(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            com.ss.android.ugc.aweme.commercialize.symphony.d$n r5 = new com.ss.android.ugc.aweme.commercialize.symphony.d$n
            r5.<init>(r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r4.setOnClickListener(r5)
            android.content.Context r4 = com.ss.android.common.applog.GlobalContext.getContext()
            r5 = 1098907648(0x41800000, float:16.0)
            int r4 = com.ss.android.ugc.aweme.framework.e.b.a(r4, r5)
            android.content.Context r5 = com.ss.android.common.applog.GlobalContext.getContext()
            r6 = 1108344832(0x42100000, float:36.0)
            int r5 = com.ss.android.ugc.aweme.framework.e.b.a(r5, r6)
            android.content.Context r6 = com.ss.android.common.applog.GlobalContext.getContext()
            r10 = 1110704128(0x42340000, float:45.0)
            int r6 = com.ss.android.ugc.aweme.framework.e.b.a(r6, r10)
            r10 = 2131165250(0x7f070042, float:1.7944712E38)
            android.view.View r10 = r0.a(r10)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            java.lang.String r11 = "adLayout"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            if (r10 == 0) goto L_0x06b3
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r10.bottomMargin = r4
            android.view.View r10 = r0.a(r1)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r11 = "buttonLike"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            if (r10 == 0) goto L_0x06ab
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r10.bottomMargin = r4
            android.view.View r10 = r0.a(r2)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            java.lang.String r11 = "buttonComment"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r10, r11)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            if (r10 == 0) goto L_0x06a3
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r10.bottomMargin = r4
            android.view.View r4 = r0.a(r1)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.lang.String r10 = "buttonLike"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r10)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            r4.width = r5
            android.view.View r1 = r0.a(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r4 = "buttonLike"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r5
            android.view.View r1 = r0.a(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r4 = "buttonComment"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r4)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r5
            android.view.View r1 = r0.a(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "buttonComment"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r5
            android.view.View r1 = r0.a(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "buttonShare"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r5
            android.view.View r1 = r0.a(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "buttonShare"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r5
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r1 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r1
            java.lang.String r2 = "adIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.width = r6
            r1 = 2131165249(0x7f070041, float:1.794471E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r1 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r1
            java.lang.String r2 = "adIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            r1.height = r6
            goto L_0x06cc
        L_0x06a3:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x06ab:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x06b3:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x06bb:
            r1 = 2131165799(0x7f070267, float:1.7945825E38)
            android.view.View r1 = r0.a(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            java.lang.String r2 = "buttonDownload"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
        L_0x06cc:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32143(0x7d8f, float:4.5042E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x06ee
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32143(0x7d8f, float:4.5042E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0717
        L_0x06ee:
            r1 = 2131168741(0x7f070de5, float:1.7951792E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r1 = (com.ss.android.ugc.aweme.base.ui.CircleImageView) r1
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x0700
            java.lang.String r6 = r2.f()
            goto L_0x0701
        L_0x0700:
            r6 = 0
        L_0x0701:
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1, (java.lang.String) r6)
            r1 = 2131168478(0x7f070cde, float:1.7951259E38)
            android.view.View r1 = r0.a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$h r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$h
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
        L_0x0717:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32151(0x7d97, float:4.5053E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x073a
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32151(0x7d97, float:4.5053E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0875
        L_0x073a:
            r1 = 2131165248(0x7f070040, float:1.7944708E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "adDescButton"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x0751
            java.lang.String r6 = r2.g()
            goto L_0x0752
        L_0x0751:
            r6 = 0
        L_0x0752:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            r1 = 2131165253(0x7f070045, float:1.7944718E38)
            android.view.View r1 = r0.a(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "adTagIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commercialize.ad.c r2 = new com.ss.android.ugc.aweme.commercialize.ad.c
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r3)
            float r3 = (float) r3
            android.content.Context r4 = r0.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131624992(0x7f0e0420, float:1.887718E38)
            int r4 = r4.getColor(r5)
            r2.<init>(r3, r4)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            r1 = 2131165254(0x7f070046, float:1.794472E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "adTagLabel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = r0.f39563f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2131165254(0x7f070046, float:1.794472E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$c r2 = com.ss.android.ugc.aweme.commercialize.symphony.d.c.f39572b
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r1 = 2131165252(0x7f070044, float:1.7944716E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "adName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "@"
            r2.<init>(r3)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r0.f39561d
            if (r3 == 0) goto L_0x07cd
            java.lang.String r6 = r3.c()
            goto L_0x07ce
        L_0x07cd:
            r6 = 0
        L_0x07ce:
            r2.append(r6)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2131165252(0x7f070044, float:1.7944716E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = com.bytedance.ies.dmt.ui.widget.util.c.g
            r1.setFontType(r2)
            r1 = 2131165247(0x7f07003f, float:1.7944706E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "adDesc"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x07ff
            java.lang.String r6 = r2.d()
            goto L_0x0800
        L_0x07ff:
            r6 = 0
        L_0x0800:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            r1 = 2131165247(0x7f07003f, float:1.7944706E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = com.bytedance.ies.dmt.ui.widget.util.c.f20594a
            r1.setFontType(r2)
            r1 = 2131165251(0x7f070043, float:1.7944714E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r1 = (com.ss.android.ugc.aweme.feed.widget.MarqueeView) r1
            java.lang.String r2 = r0.f39562e
            r1.setText((java.lang.String) r2)
            r1 = 2131165248(0x7f070040, float:1.7944708E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = com.bytedance.ies.dmt.ui.widget.util.c.f20594a
            r1.setFontType(r2)
            r1 = 2131165248(0x7f070040, float:1.7944708E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "adDescButton"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.commercialize.ad.c r2 = new com.ss.android.ugc.aweme.commercialize.ad.c
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r3 = com.ss.android.ugc.aweme.base.utils.u.a((double) r3)
            float r3 = (float) r3
            android.content.Context r4 = r0.getContext()
            java.lang.String r5 = "context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131624634(0x7f0e02ba, float:1.8876453E38)
            int r4 = r4.getColor(r5)
            r2.<init>(r3, r4)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r1.setBackground(r2)
            r1 = 2131165251(0x7f070043, float:1.7944714E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.feed.widget.MarqueeView r1 = (com.ss.android.ugc.aweme.feed.widget.MarqueeView) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$d r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$d
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
        L_0x0875:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32142(0x7d8e, float:4.504E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0897
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32142(0x7d8e, float:4.504E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x08de
        L_0x0897:
            r1 = 2131166384(0x7f0704b0, float:1.7947012E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r1 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$a r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$a
            r2.<init>()
            android.view.View$OnLongClickListener r2 = (android.view.View.OnLongClickListener) r2
            r1.setOnLongClickListener(r2)
            r1 = 2131166384(0x7f0704b0, float:1.7947012E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r1 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$i r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$i
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r1 = 2131166384(0x7f0704b0, float:1.7947012E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r1 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$j r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$j
            r2.<init>(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$a r2 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout.a) r2
            r1.setIDislike(r2)
            r1 = 2131166384(0x7f0704b0, float:1.7947012E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout r1 = (com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.AdDislikeLayout$b r2 = r0.h
            r1.setIDislikeClick(r2)
        L_0x08de:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32147(0x7d93, float:4.5048E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0901
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32147(0x7d93, float:4.5048E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0b43
        L_0x0901:
            r1 = 2131168380(0x7f070c7c, float:1.795106E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = new com.ss.android.ugc.aweme.base.model.UrlModel
            r2.<init>()
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]
            com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r0.f39561d
            if (r3 == 0) goto L_0x091b
            java.lang.String r6 = r3.f()
            goto L_0x091c
        L_0x091b:
            r6 = 0
        L_0x091c:
            r4[r9] = r6
            java.util.List r3 = kotlin.collections.CollectionsKt.mutableListOf(r4)
            r2.setUrlList(r3)
            com.ss.android.ugc.aweme.base.c.b(r1, r2)
            r1 = 2131168382(0x7f070c7e, float:1.7951064E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x093f
            java.lang.String r6 = r2.c()
            goto L_0x0940
        L_0x093f:
            r6 = 0
        L_0x0940:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r1 = r0.f39561d
            if (r1 == 0) goto L_0x097a
            float r1 = r1.h()
            java.lang.Float r6 = java.lang.Float.valueOf(r1)
            r1 = r6
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 1082130432(0x40800000, float:4.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0960
            r1 = 1
            goto L_0x0961
        L_0x0960:
            r1 = 0
        L_0x0961:
            if (r1 == 0) goto L_0x0964
            goto L_0x0965
        L_0x0964:
            r6 = 0
        L_0x0965:
            if (r6 == 0) goto L_0x097a
            java.lang.Number r6 = (java.lang.Number) r6
            float r1 = r6.floatValue()
            r2 = 2131168383(0x7f070c7f, float:1.7951066E38)
            android.view.View r3 = r0.a(r2)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r3 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r3
            r3.setRatingProgress(r1)
            goto L_0x098b
        L_0x097a:
            r2 = 2131168383(0x7f070c7f, float:1.7951066E38)
            android.view.View r1 = r0.a(r2)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r1
            java.lang.String r2 = "maskAdRatingView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
        L_0x098b:
            r1 = 2131168387(0x7f070c83, float:1.7951074E38)
            android.view.View r1 = r0.a(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            java.lang.String r2 = "maskOthers"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            int r1 = r1.getChildCount()
            if (r1 != 0) goto L_0x09b0
            r1 = 2131168386(0x7f070c82, float:1.7951072E38)
            android.view.View r1 = r0.a(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "maskGroup"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
        L_0x09b0:
            r1 = 2131168378(0x7f070c7a, float:1.7951056E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdDescView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x09c7
            java.lang.String r6 = r2.d()
            goto L_0x09c8
        L_0x09c7:
            r6 = 0
        L_0x09c8:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            r1 = 2131168388(0x7f070c84, float:1.7951076E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskTagLabel"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.String r2 = r0.f39563f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2131168379(0x7f070c7b, float:1.7951058E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdDownload"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r2 = r0.f39561d
            if (r2 == 0) goto L_0x09f9
            java.lang.String r6 = r2.g()
            goto L_0x09fa
        L_0x09f9:
            r6 = 0
        L_0x09fa:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            r1.setText(r6)
            r1 = 2131168381(0x7f070c7d, float:1.7951062E38)
            android.view.View r1 = r0.a(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            com.ss.android.ugc.aweme.commercialize.symphony.d$b r2 = new com.ss.android.ugc.aweme.commercialize.symphony.d$b
            r2.<init>(r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            boolean r1 = r0.e()
            if (r1 == 0) goto L_0x0a2b
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.m
            if (r1 == 0) goto L_0x0a2b
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r1 = r1.getAwemeRawAd()
            if (r1 == 0) goto L_0x0a2b
            int r1 = r1.getNativeCardType()
            r2 = 5
            if (r1 != r2) goto L_0x0a2b
            r1 = 1
            goto L_0x0a2c
        L_0x0a2b:
            r1 = 0
        L_0x0a2c:
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            r10[r9] = r3
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32146(0x7d92, float:4.5046E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r15[r9] = r2
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r2 == 0) goto L_0x0a65
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r10[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32146(0x7d92, float:4.5046E-41)
            java.lang.Class[] r15 = new java.lang.Class[r2]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r15[r9] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0b43
        L_0x0a65:
            if (r1 != 0) goto L_0x0ace
            r1 = 2131168380(0x7f070c7c, float:1.795106E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            java.lang.String r2 = "maskAdIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            r1 = 2131168382(0x7f070c7e, float:1.7951064E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            r1 = 2131168383(0x7f070c7f, float:1.7951066E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r1
            java.lang.String r2 = "maskAdRatingView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            r1 = 2131168386(0x7f070c82, float:1.7951072E38)
            android.view.View r1 = r0.a(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "maskGroup"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            r1 = 2131168378(0x7f070c7a, float:1.7951056E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdDescView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            r1 = 2131168385(0x7f070c81, float:1.795107E38)
            android.view.View r1 = r0.a(r1)
            android.widget.Space r1 = (android.widget.Space) r1
            java.lang.String r2 = "maskDivide"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            goto L_0x0b43
        L_0x0ace:
            r1 = 2131168380(0x7f070c7c, float:1.795106E38)
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            java.lang.String r2 = "maskAdIcon"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
            r1 = 2131168382(0x7f070c7e, float:1.7951064E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdName"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
            r1 = 2131168383(0x7f070c7f, float:1.7951066E38)
            android.view.View r2 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r2 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r2
            float r2 = r2.getRatingProgress()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0b10
            android.view.View r1 = r0.a(r1)
            com.ss.android.ugc.aweme.commercialize.ad.AdRatingView r1 = (com.ss.android.ugc.aweme.commercialize.ad.AdRatingView) r1
            java.lang.String r2 = "maskAdRatingView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
        L_0x0b10:
            r1 = 2131168386(0x7f070c82, float:1.7951072E38)
            android.view.View r1 = r0.a(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            java.lang.String r2 = "maskGroup"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
            r1 = 2131168378(0x7f070c7a, float:1.7951056E38)
            android.view.View r1 = r0.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            java.lang.String r2 = "maskAdDescView"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
            r1 = 2131168385(0x7f070c81, float:1.795107E38)
            android.view.View r1 = r0.a(r1)
            android.widget.Space r1 = (android.widget.Space) r1
            java.lang.String r2 = "maskDivide"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r9)
        L_0x0b43:
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32138(0x7d8a, float:4.5035E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
            if (r1 == 0) goto L_0x0b66
            java.lang.Object[] r10 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.commercialize.symphony.d.f39558a
            r13 = 0
            r14 = 32138(0x7d8a, float:4.5035E-41)
            java.lang.Class[] r15 = new java.lang.Class[r9]
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
        L_0x0b64:
            r1 = 1
            goto L_0x0b9e
        L_0x0b66:
            android.content.Context r1 = r0.getContext()
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r1 == 0) goto L_0x0b64
            android.content.Context r1 = r0.getContext()
            if (r1 == 0) goto L_0x0b96
            com.ss.android.ugc.aweme.main.MainActivity r1 = (com.ss.android.ugc.aweme.main.MainActivity) r1
            com.ss.android.ugc.aweme.longvideo.feature.VolumeController r2 = new com.ss.android.ugc.aweme.longvideo.feature.VolumeController
            r3 = r1
            android.support.v4.app.FragmentActivity r3 = (android.support.v4.app.FragmentActivity) r3
            r4 = 2131165463(0x7f070117, float:1.7945144E38)
            android.view.View r4 = r0.a(r4)
            com.ss.android.ugc.aweme.base.ui.AudioControlView r4 = (com.ss.android.ugc.aweme.base.ui.AudioControlView) r4
            r2.<init>(r3, r4)
            r0.f39559b = r2
            com.ss.android.ugc.aweme.longvideo.feature.VolumeController r2 = r0.f39559b
            if (r2 != 0) goto L_0x0b90
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0b90:
            com.ss.android.ugc.aweme.base.activity.a r2 = (com.ss.android.ugc.aweme.base.activity.a) r2
            r1.registerActivityOnKeyDownListener(r2)
            goto L_0x0b64
        L_0x0b96:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity"
            r0.<init>(r1)
            throw r0
        L_0x0b9e:
            r0.k = r1
            r0.i = r9
            r0.a()
        L_0x0ba5:
            com.ss.android.ugc.aweme.commercialize.symphony.f r0 = (com.ss.android.ugc.aweme.commercialize.symphony.f) r0
            com.ss.android.ugc.aweme.commercialize.symphony.g.a(r0)
            com.ss.android.ugc.aweme.commercialize.symphony.h r0 = new com.ss.android.ugc.aweme.commercialize.symphony.h
            r0.<init>()
            com.ss.android.ugc.aweme.utils.bg.a(r0)
            android.content.Context r0 = r7.o
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.commercialize.symphony.a
            if (r0 == 0) goto L_0x0bc2
            com.ss.android.ugc.aweme.feed.f.ac r0 = new com.ss.android.ugc.aweme.feed.f.ac
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r7.m
            r0.<init>(r1)
            com.ss.android.ugc.aweme.utils.bg.a(r0)
        L_0x0bc2:
            return
        L_0x0bc3:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.symphony.e.a(int):void");
    }

    public final int c() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32193, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32193, new Class[0], Integer.TYPE)).intValue();
        }
        Aweme aweme = this.m;
        if (aweme != null) {
            i = aweme.getAwemeType();
        }
        return i;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32194, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32194, new Class[0], Void.TYPE);
            return;
        }
        View view = this.f39608c;
        if (view != null) {
            ((d) view).b();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32196, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32196, new Class[0], Void.TYPE);
            return;
        }
        if (this.n) {
            View view = this.f39608c;
            if (view != null) {
                g.a((d) view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
            }
        }
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        String str4;
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32201, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32201, new Class[0], Void.TYPE);
            return;
        }
        String str5 = null;
        if (com.ss.android.g.a.c()) {
            MobClick labelName = MobClick.obtain().setEventName("dislike").setLabelName("tap");
            Aweme aweme = this.m;
            if (aweme != null) {
                str4 = aweme.getAid();
            } else {
                str4 = null;
            }
            r.onEvent(labelName.setValue(str4));
        }
        l a2 = new l().a(this.f39610e);
        Aweme aweme2 = this.m;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        l b2 = a2.b(str);
        Aweme aweme3 = this.m;
        if (aweme3 != null) {
            str2 = aweme3.getAuthorUid();
        } else {
            str2 = null;
        }
        l e2 = b2.c(str2).e(this.f39610e);
        Aweme aweme4 = this.m;
        if (aweme4 != null) {
            str3 = aweme4.getRequestId();
        } else {
            str3 = null;
        }
        e2.f(str3).e();
        Aweme aweme5 = this.m;
        if (aweme5 != null) {
            str5 = aweme5.getAid();
        }
        bg.a(new g(str5));
    }

    public final void b() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32202, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32202, new Class[0], Void.TYPE);
            return;
        }
        Context context = this.o;
        String str3 = null;
        if (!(context instanceof a)) {
            context = null;
        }
        a aVar = (a) context;
        if (aVar != null) {
            AwemeAppData p = AwemeAppData.p();
            Intrinsics.checkExpressionValueIsNotNull(p, "AwemeAppData.inst()");
            if (!p.ap) {
                com.bytedance.ies.dmt.ui.d.a.c(this.o, (int) C0906R.string.eq).a();
                aVar.changeAutoPlayTabVisibility(0);
                Pair[] pairArr = new Pair[3];
                Aweme aweme = this.m;
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                pairArr[0] = TuplesKt.to("group_id", str2);
                pairArr[1] = TuplesKt.to("enter_from", this.f39610e);
                Aweme aweme2 = this.m;
                if (aweme2 != null) {
                    str3 = aweme2.getAuthorUid();
                }
                pairArr[2] = TuplesKt.to("author_id", str3);
                r.a("click_auto_play", MapsKt.mutableMapOf(pairArr));
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(this.o, (int) C0906R.string.ep).a();
                Pair[] pairArr2 = new Pair[4];
                Aweme aweme3 = this.m;
                if (aweme3 != null) {
                    str = aweme3.getAid();
                } else {
                    str = null;
                }
                pairArr2[0] = TuplesKt.to("group_id", str);
                pairArr2[1] = TuplesKt.to("enter_from", this.f39610e);
                pairArr2[2] = TuplesKt.to("enter_method", "click_long_press_button");
                Aweme aweme4 = this.m;
                if (aweme4 != null) {
                    str3 = aweme4.getAuthorUid();
                }
                pairArr2[3] = TuplesKt.to("author_id", str3);
                r.a("exit_auto_play", MapsKt.mutableMapOf(pairArr2));
            }
            AwemeAppData p2 = AwemeAppData.p();
            Intrinsics.checkExpressionValueIsNotNull(p2, "AwemeAppData.inst()");
            aVar.exitMaskLayer(p2.ap);
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f39606a, false, 32197, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39606a, false, 32197, new Class[0], Void.TYPE);
            return;
        }
        this.n = false;
        View view = this.f39608c;
        if (view != null) {
            d dVar = (d) view;
            if (PatchProxy.isSupport(new Object[0], dVar, d.f39558a, false, 32139, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], dVar, d.f39558a, false, 32139, new Class[0], Void.TYPE);
            } else {
                dVar.k = false;
                if (dVar.l) {
                    ((AdDislikeLayout) dVar.a(C0906R.id.a5j)).b();
                }
                if (PatchProxy.isSupport(new Object[0], dVar, d.f39558a, false, 32140, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dVar, d.f39558a, false, 32140, new Class[0], Void.TYPE);
                } else if ((dVar.getContext() instanceof MainActivity) && dVar.f39559b != null) {
                    Context context = dVar.getContext();
                    if (context != null) {
                        MainActivity mainActivity = (MainActivity) context;
                        VolumeController volumeController = dVar.f39559b;
                        if (volumeController == null) {
                            Intrinsics.throwNpe();
                        }
                        mainActivity.unRegisterActivityOnKeyDownListener(volumeController);
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.main.MainActivity");
                    }
                }
                dVar.b();
                if (PatchProxy.isSupport(new Object[0], dVar, d.f39558a, false, 32155, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], dVar, d.f39558a, false, 32155, new Class[0], Void.TYPE);
                } else {
                    ((PeriscopeLayout) dVar.a(C0906R.id.bre)).b();
                    ((MarqueeView) dVar.a(C0906R.id.b5)).b();
                    ((FrameLayout) dVar.a(C0906R.id.bo8)).animate().cancel();
                }
                ((SymphonyCard) dVar.a(C0906R.id.cyf)).a();
                ((SymphonyCard) dVar.a(C0906R.id.cyf)).b();
                dVar.d();
            }
            if (Intrinsics.areEqual((Object) g.c(), (Object) dVar)) {
                g.a(null);
            }
            bg.a(new h());
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.symphony.SymphonyVideoView");
    }

    public final void a(@Nullable Aweme aweme, boolean z) {
        this.m = aweme;
    }

    public e(@Nullable Context context, int i, @NotNull View view, @Nullable aa<ar> aaVar, @Nullable String str, @NotNull View.OnTouchListener onTouchListener, @NotNull Fragment fragment, int i2) {
        Intrinsics.checkParameterIsNotNull(view, "view");
        Intrinsics.checkParameterIsNotNull(onTouchListener, "tapTouchListener");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        this.o = context;
        this.f39607b = i;
        this.f39608c = view;
        this.f39609d = aaVar;
        this.f39610e = str;
        this.f39611f = onTouchListener;
        this.g = fragment;
        this.h = i2;
    }
}

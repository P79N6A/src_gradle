package com.ss.android.ugc.aweme.commercialize.symphony;

import android.app.Activity;
import android.support.design.widget.BottomSheetDialog;
import android.view.View;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001c\u0010\f\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/symphony/SymphonySharePanel;", "Landroid/support/design/widget/BottomSheetDialog;", "activity", "Landroid/app/Activity;", "iNativeAd", "Lcom/bytedance/ad/symphony/ad/nativead/INativeAd;", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "(Landroid/app/Activity;Lcom/bytedance/ad/symphony/ad/nativead/INativeAd;Lcom/ss/android/ugc/aweme/feed/model/Aweme;)V", "fitWindow", "", "initCancel", "initReportItem", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SymphonySharePanel extends BottomSheetDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39533a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f39534b;

    /* renamed from: c  reason: collision with root package name */
    private final INativeAd f39535c;

    /* renamed from: d  reason: collision with root package name */
    private final Aweme f39536d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SymphonySharePanel f39538b;

        a(SymphonySharePanel symphonySharePanel) {
            this.f39538b = symphonySharePanel;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f39537a, false, 32131, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f39537a, false, 32131, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f39538b.dismiss();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f39539a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SymphonySharePanel f39540b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Aweme f39541c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ INativeAd f39542d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HashMap f39543e;

        b(SymphonySharePanel symphonySharePanel, Aweme aweme, INativeAd iNativeAd, HashMap hashMap) {
            this.f39540b = symphonySharePanel;
            this.f39541c = aweme;
            this.f39542d = iNativeAd;
            this.f39543e = hashMap;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00af  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r10) {
            /*
                r9 = this;
                r7 = 1
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r8 = 0
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f39539a
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 32132(0x7d84, float:4.5027E-41)
                r1 = r9
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0030
                java.lang.Object[] r0 = new java.lang.Object[r7]
                r0[r8] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f39539a
                r3 = 0
                r4 = 32132(0x7d84, float:4.5027E-41)
                java.lang.Class[] r5 = new java.lang.Class[r7]
                java.lang.Class<android.view.View> r1 = android.view.View.class
                r5[r8] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0030:
                com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r10)
                com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f39541c
                if (r0 == 0) goto L_0x00e9
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel r0 = r9.f39540b
                android.app.Activity r0 = r0.f39534b
                android.net.Uri$Builder r1 = new android.net.Uri$Builder
                r1.<init>()
                java.lang.String r2 = "is_symphony"
                java.lang.String r3 = "1"
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "ad_provider_id"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                r4 = 0
                if (r3 == 0) goto L_0x005c
                com.bytedance.ad.symphony.model.b r3 = r3.a()
                if (r3 == 0) goto L_0x005c
                int r3 = r3.f7647c
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L_0x005d
            L_0x005c:
                r3 = r4
            L_0x005d:
                java.lang.String r3 = java.lang.String.valueOf(r3)
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "ad_placement_id"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x0074
                com.bytedance.ad.symphony.model.b r3 = r3.a()
                if (r3 == 0) goto L_0x0074
                java.lang.String r3 = r3.f7645a
                goto L_0x0075
            L_0x0074:
                r3 = r4
            L_0x0075:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_image_url"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x0084
                java.lang.String r3 = r3.e()
                goto L_0x0085
            L_0x0084:
                r3 = r4
            L_0x0085:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_icon_url"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x0094
                java.lang.String r3 = r3.f()
                goto L_0x0095
            L_0x0094:
                r3 = r4
            L_0x0095:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_title"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x00a4
                java.lang.String r3 = r3.c()
                goto L_0x00a5
            L_0x00a4:
                r3 = r4
            L_0x00a5:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_description"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x00b4
                java.lang.String r3 = r3.d()
                goto L_0x00b5
            L_0x00b4:
                r3 = r4
            L_0x00b5:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r3)
                java.lang.String r2 = "sdk_cta"
                com.bytedance.ad.symphony.ad.nativead.INativeAd r3 = r9.f39542d
                if (r3 == 0) goto L_0x00c3
                java.lang.String r4 = r3.g()
            L_0x00c3:
                android.net.Uri$Builder r1 = r1.appendQueryParameter(r2, r4)
                java.lang.String r2 = "Uri.Builder().appendQuer… iNativeAd?.callToAction)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f39541c
                java.lang.String r3 = "symphony"
                java.lang.String r4 = "ad"
                com.google.gson.Gson r5 = new com.google.gson.Gson
                r5.<init>()
                java.util.HashMap r6 = r9.f39543e
                java.lang.String r5 = r5.toJson((java.lang.Object) r6)
                java.lang.String r6 = "Gson().toJson(extraMap)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r5, r6)
                android.net.Uri$Builder r1 = com.ss.android.ugc.aweme.commercialize.utils.t.a(r1, r2, r3, r4, r5)
                com.ss.android.ugc.aweme.report.a.a(r0, r1)
            L_0x00e9:
                com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel r0 = r9.f39540b
                r0.dismiss()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel.b.onClick(android.view.View):void");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0097, code lost:
        if (r3 == null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ac, code lost:
        if (r3 == null) goto L_0x00ae;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r13) {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 32127(0x7d7f, float:4.502E-41)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32127(0x7d7f, float:4.502E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            super.onCreate(r13)
            android.app.Activity r0 = r12.f39534b
            r12.setOwnerActivity(r0)
            r0 = 2131689888(0x7f0f01a0, float:1.9008804E38)
            r12.setContentView((int) r0)
            com.bytedance.ad.symphony.ad.nativead.INativeAd r7 = r12.f39535c
            com.ss.android.ugc.aweme.feed.model.Aweme r10 = r12.f39536d
            r11 = 2
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r9] = r7
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32128(0x7d80, float:4.5021E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r1 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r9] = r7
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32128(0x7d80, float:4.5021E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<com.bytedance.ad.symphony.ad.nativead.INativeAd> r1 = com.bytedance.ad.symphony.ad.nativead.INativeAd.class
            r5[r9] = r1
            java.lang.Class<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = com.ss.android.ugc.aweme.feed.model.Aweme.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00d6
        L_0x007d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
            java.lang.String r2 = "log_extra"
            if (r7 == 0) goto L_0x0099
            com.bytedance.ad.symphony.model.b r3 = r7.a()
            if (r3 == 0) goto L_0x0099
            org.json.JSONObject r3 = r3.f7649e
            if (r3 == 0) goto L_0x0099
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L_0x009b
        L_0x0099:
            java.lang.String r3 = ""
        L_0x009b:
            r1.put(r2, r3)
            java.lang.String r2 = "cid"
            if (r10 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r10.getAwemeRawAd()
            if (r3 == 0) goto L_0x00ae
            java.lang.String r3 = r3.getCreativeIdStr()
            if (r3 != 0) goto L_0x00b0
        L_0x00ae:
            java.lang.String r3 = ""
        L_0x00b0:
            r1.put(r2, r3)
            r1 = 2131170224(0x7f0713b0, float:1.79548E38)
            android.view.View r1 = r12.findViewById(r1)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.content.Context r2 = r12.getContext()
            r3 = 2131562131(0x7f0d0e93, float:1.8749682E38)
            r4 = 2130839623(0x7f020847, float:1.7284262E38)
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$b r5 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$b
            r5.<init>(r12, r10, r7, r0)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            com.ss.android.ugc.aweme.share.seconditem.j r0 = com.ss.android.ugc.aweme.share.seconditem.j.a((android.content.Context) r2, (int) r3, (int) r4, (android.view.View.OnClickListener) r5)
            android.view.View r0 = (android.view.View) r0
            r1.addView(r0)
        L_0x00d6:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32129(0x7d81, float:4.5022E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f8
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32129(0x7d81, float:4.5022E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x010b
        L_0x00f8:
            r0 = 2131165813(0x7f070275, float:1.7945854E38)
            android.view.View r0 = r12.findViewById(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$a r1 = new com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel$a
            r1.<init>(r12)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x010b:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32130(0x7d82, float:4.5024E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x012d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f39533a
            r3 = 0
            r4 = 32130(0x7d82, float:4.5024E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x015b
        L_0x012d:
            android.app.Activity r0 = r12.getOwnerActivity()
            android.content.Context r0 = (android.content.Context) r0
            int r0 = com.bytedance.common.utility.UIUtils.getScreenHeight(r0)
            android.content.Context r1 = r12.getContext()
            int r1 = com.bytedance.common.utility.UIUtils.getStatusBarHeight(r1)
            int r0 = r0 - r1
            android.view.Window r1 = r12.getWindow()
            if (r1 == 0) goto L_0x015b
            r2 = -1
            if (r0 != 0) goto L_0x014a
            r0 = -1
        L_0x014a:
            r1.setLayout(r2, r0)
            r0 = 80
            r1.setGravity(r0)
            android.view.WindowManager$LayoutParams r2 = r1.getAttributes()
            r2.gravity = r0
            r1.setAttributes(r2)
        L_0x015b:
            r12.setCanceledOnTouchOutside(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.symphony.SymphonySharePanel.onCreate(android.os.Bundle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SymphonySharePanel(@NotNull Activity activity, @Nullable INativeAd iNativeAd, @Nullable Aweme aweme) {
        super(activity, C0906R.style.re);
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        this.f39534b = activity;
        this.f39535c = iNativeAd;
        this.f39536d = aweme;
    }
}

package com.ss.android.ugc.aweme.commerce.portfolio.search;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0003J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0012\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0014R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/search/PortfolioSearchResultActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mKeyWord", "", "mResultFragment", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioResultFragment;", "mUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "adjustStatusBar", "", "view", "Landroid/view/View;", "finish", "initData", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setResultAndFinish", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioSearchResultActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37106a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37107b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private ImmersionBar f37108c;

    /* renamed from: d  reason: collision with root package name */
    private String f37109d;

    /* renamed from: e  reason: collision with root package name */
    private PortfolioResultFragment f37110e;

    /* renamed from: f  reason: collision with root package name */
    private CommerceUser f37111f;
    private List<t> g;
    private HashMap h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/search/PortfolioSearchResultActivity$Companion;", "", "()V", "KEY_WORD", "", "SHOP_COLUMNS", "USER", "start", "", "activity", "Landroid/app/Activity;", "keyWord", "user", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "shopColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "requestId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37112a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37113a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchResultActivity f37114b;

        b(PortfolioSearchResultActivity portfolioSearchResultActivity) {
            this.f37114b = portfolioSearchResultActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37113a, false, 28504, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37113a, false, 28504, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37114b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37115a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchResultActivity f37116b;

        c(PortfolioSearchResultActivity portfolioSearchResultActivity) {
            this.f37116b = portfolioSearchResultActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37115a, false, 28505, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37115a, false, 28505, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37116b.finish();
        }
    }

    private View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37106a, false, 28499, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37106a, false, 28499, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.h == null) {
            this.h = new HashMap();
        }
        View view = (View) this.h.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28501, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28501, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37106a, false, 28502, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37106a, false, 28502, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28494, new Class[0], Void.TYPE);
            return;
        }
        setResult(-1);
        finish();
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28498, new Class[0], Void.TYPE);
            return;
        }
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28493, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28497, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28497, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.f37108c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f37106a, false, 28495, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37106a, false, 28495, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.f37108c = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.f37108c;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
            if (statusBarDarkFont != null) {
                statusBarDarkFont.init();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bc, code lost:
        if (r0 == null) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28490(0x6f4a, float:3.9923E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28490(0x6f4a, float:3.9923E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r11)
            r0 = 2131689619(0x7f0f0093, float:1.9008258E38)
            r10.setContentView((int) r0)
            r0 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r7 = r10.a(r0)
            java.lang.String r0 = "status_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28496(0x6f50, float:3.9931E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007a
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28496(0x6f50, float:3.9931E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x008e
        L_0x007a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x008e
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            android.content.Context r1 = r7.getContext()
            int r1 = com.bytedance.ies.uikit.statusbar.StatusBarUtils.getStatusBarHeight(r1)
            r0.height = r1
        L_0x008e:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28491(0x6f4b, float:3.9924E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28491(0x6f4b, float:3.9924E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f3
        L_0x00b0:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00be
            java.lang.String r1 = "key_word"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x00c0
        L_0x00be:
            java.lang.String r0 = ""
        L_0x00c0:
            r10.f37109d = r0
            android.content.Intent r0 = r10.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x00d0
            java.lang.String r2 = "user"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto L_0x00d1
        L_0x00d0:
            r0 = r1
        L_0x00d1:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.commerce.service.models.CommerceUser
            if (r2 != 0) goto L_0x00d6
            r0 = r1
        L_0x00d6:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = (com.ss.android.ugc.aweme.commerce.service.models.CommerceUser) r0
            if (r0 != 0) goto L_0x00df
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = new com.ss.android.ugc.aweme.commerce.service.models.CommerceUser
            r0.<init>()
        L_0x00df:
            r10.f37111f = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = "shopColumns"
            java.io.Serializable r1 = r0.getSerializableExtra(r1)
        L_0x00ed:
            if (r1 == 0) goto L_0x01bf
            java.util.List r1 = (java.util.List) r1
            r10.g = r1
        L_0x00f3:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28492(0x6f4c, float:3.9926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0116
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37106a
            r3 = 0
            r4 = 28492(0x6f4c, float:3.9926E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01af
        L_0x0116:
            r0 = 2131166072(0x7f070378, float:1.794638E38)
            android.view.View r0 = r10.a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity$b r1 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity$b
            r1.<init>(r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131166071(0x7f070377, float:1.7946377E38)
            android.view.View r1 = r10.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r1
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity$c r2 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity$c
            r2.<init>(r10)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            android.view.View r0 = r10.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "commerce_portfolio_search_input"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r10.f37109d
            if (r1 != 0) goto L_0x0150
            java.lang.String r2 = "mKeyWord"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0150:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "key_word"
            java.lang.String r2 = r10.f37109d
            if (r2 != 0) goto L_0x0165
            java.lang.String r3 = "mKeyWord"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0165:
            r0.putString(r1, r2)
            java.lang.String r1 = "user"
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r10.f37111f
            if (r2 != 0) goto L_0x0173
            java.lang.String r3 = "mUser"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0173:
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r1, r2)
            java.lang.String r1 = "columns"
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r2 = r10.g
            if (r2 == 0) goto L_0x01b7
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r1, r2)
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r1 = new com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment
            r1.<init>()
            r10.f37110e = r1
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r1 = r10.f37110e
            if (r1 != 0) goto L_0x0191
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0191:
            r1.setArguments(r0)
            android.support.v4.app.FragmentManager r0 = r10.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131169081(0x7f070f39, float:1.7952482E38)
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r2 = r10.f37110e
            if (r2 != 0) goto L_0x01a6
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x01a6:
            android.support.v4.app.Fragment r2 = (android.support.v4.app.Fragment) r2
            android.support.v4.app.FragmentTransaction r0 = r0.replace(r1, r2)
            r0.commit()
        L_0x01af:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x01b7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.io.Serializable"
            r0.<init>(r1)
            throw r0
        L_0x01bf:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.commerce.service.models.ShopColumn>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity.onCreate(android.os.Bundle):void");
    }
}

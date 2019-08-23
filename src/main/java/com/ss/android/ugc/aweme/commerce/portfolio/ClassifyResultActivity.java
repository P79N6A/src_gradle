package com.ss.android.ugc.aweme.commerce.portfolio;

import android.app.Activity;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J\b\u0010\u0014\u001a\u00020\u0011H\u0002J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0011H\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/ClassifyResultActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mCategoryId", "", "mCategoryName", "", "mColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mResultFragment", "Lcom/ss/android/ugc/aweme/commerce/portfolio/PortfolioResultFragment;", "mUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "adjustStatusBar", "", "view", "Landroid/view/View;", "initData", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ClassifyResultActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36966a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f36967b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private ImmersionBar f36968c;

    /* renamed from: d  reason: collision with root package name */
    private CommerceUser f36969d;

    /* renamed from: e  reason: collision with root package name */
    private List<t> f36970e;

    /* renamed from: f  reason: collision with root package name */
    private PortfolioResultFragment f36971f;
    private long g = -1;
    private String h = "";
    private HashMap i;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/ClassifyResultActivity$Companion;", "", "()V", "CATEGORY_ID", "", "CATEGORY_NAME", "SHOP_COLUMNS", "USER", "start", "", "activity", "Landroid/app/Activity;", "categoryId", "", "categoryName", "user", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "shopColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36972a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36973a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ClassifyResultActivity f36974b;

        b(ClassifyResultActivity classifyResultActivity) {
            this.f36974b = classifyResultActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f36973a, false, 28321, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f36973a, false, 28321, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f36974b.finish();
        }
    }

    private View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36966a, false, 28316, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36966a, false, 28316, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.i == null) {
            this.i = new HashMap();
        }
        View view = (View) this.i.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.i.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f36966a, false, 28318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36966a, false, 28318, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36966a, false, 28319, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36966a, false, 28319, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f36966a, false, 28312, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36966a, false, 28312, new Class[0], Void.TYPE);
            return;
        }
        finish();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f36966a, false, 28315, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36966a, false, 28315, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.f36968c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f36966a, false, 28313, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36966a, false, 28313, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.f36968c = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.f36968c;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
            if (statusBarDarkFont != null) {
                statusBarDarkFont.init();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fd, code lost:
        if (r0 == null) goto L_0x00ff;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28309(0x6e95, float:3.967E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28309(0x6e95, float:3.967E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r11)
            r0 = 2131689526(0x7f0f0036, float:1.900807E38)
            r10.setContentView((int) r0)
            r0 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r7 = r10.a(r0)
            java.lang.String r0 = "status_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28314(0x6e9a, float:3.9676E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007a
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28314(0x6e9a, float:3.9676E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28310(0x6e96, float:3.9671E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28310(0x6e96, float:3.9671E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0103
        L_0x00b0:
            android.content.Intent r0 = r10.getIntent()
            r1 = -1
            if (r0 == 0) goto L_0x00be
            java.lang.String r3 = "category_id"
            long r1 = r0.getLongExtra(r3, r1)
        L_0x00be:
            r10.g = r1
            android.content.Intent r0 = r10.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x00ce
            java.lang.String r2 = "user"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto L_0x00cf
        L_0x00ce:
            r0 = r1
        L_0x00cf:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.commerce.service.models.CommerceUser
            if (r2 != 0) goto L_0x00d4
            r0 = r1
        L_0x00d4:
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = (com.ss.android.ugc.aweme.commerce.service.models.CommerceUser) r0
            if (r0 != 0) goto L_0x00dd
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = new com.ss.android.ugc.aweme.commerce.service.models.CommerceUser
            r0.<init>()
        L_0x00dd:
            r10.f36969d = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00eb
            java.lang.String r1 = "shopColumns"
            java.io.Serializable r1 = r0.getSerializableExtra(r1)
        L_0x00eb:
            if (r1 == 0) goto L_0x01b1
            java.util.List r1 = (java.util.List) r1
            r10.f36970e = r1
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = "category_name"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0101
        L_0x00ff:
            java.lang.String r0 = ""
        L_0x0101:
            r10.h = r0
        L_0x0103:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28311(0x6e97, float:3.9672E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0126
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f36966a
            r3 = 0
            r4 = 28311(0x6e97, float:3.9672E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01a1
        L_0x0126:
            r0 = 2131166040(0x7f070358, float:1.7946314E38)
            android.view.View r0 = r10.a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity$b r1 = new com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity$b
            r1.<init>(r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131166041(0x7f070359, float:1.7946316E38)
            android.view.View r0 = r10.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            java.lang.String r1 = "commerce_classify_result_title"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            java.lang.String r1 = r10.h
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "category_id"
            long r2 = r10.g
            r0.putLong(r1, r2)
            java.lang.String r1 = "user"
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r2 = r10.f36969d
            if (r2 != 0) goto L_0x0165
            java.lang.String r3 = "mUser"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x0165:
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r1, r2)
            java.lang.String r1 = "columns"
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r2 = r10.f36970e
            if (r2 == 0) goto L_0x01a9
            java.io.Serializable r2 = (java.io.Serializable) r2
            r0.putSerializable(r1, r2)
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r1 = new com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment
            r1.<init>()
            r10.f36971f = r1
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r1 = r10.f36971f
            if (r1 != 0) goto L_0x0183
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0183:
            r1.setArguments(r0)
            android.support.v4.app.FragmentManager r0 = r10.getSupportFragmentManager()
            android.support.v4.app.FragmentTransaction r0 = r0.beginTransaction()
            r1 = 2131169081(0x7f070f39, float:1.7952482E38)
            com.ss.android.ugc.aweme.commerce.portfolio.PortfolioResultFragment r2 = r10.f36971f
            if (r2 != 0) goto L_0x0198
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0198:
            android.support.v4.app.Fragment r2 = (android.support.v4.app.Fragment) r2
            android.support.v4.app.FragmentTransaction r0 = r0.replace(r1, r2)
            r0.commit()
        L_0x01a1:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x01a9:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type java.io.Serializable"
            r0.<init>(r1)
            throw r0
        L_0x01b1:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.commerce.service.models.ShopColumn>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.ClassifyResultActivity.onCreate(android.os.Bundle):void");
    }
}

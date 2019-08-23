package com.ss.android.ugc.aweme.commerce.portfolio.search;

import android.app.Activity;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.commerce.service.models.CommerceUser;
import com.ss.android.ugc.aweme.commerce.service.models.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\b\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\rH\u0002J\b\u0010\u0012\u001a\u00020\rH\u0002J\"\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\rH\u0016J\u0012\u0010\u001a\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\rH\u0014J\b\u0010\u001e\u001a\u00020\rH\u0014J\b\u0010\u001f\u001a\u00020\rH\u0014R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/search/PortfolioSearchActivity;", "Lcom/ss/android/ugc/aweme/base/AmeActivity;", "()V", "mColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "mImmersionBar", "Lcom/gyf/barlibrary/ImmersionBar;", "mUser", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "searchHint", "", "adjustStatusBar", "", "view", "Landroid/view/View;", "handleSearchViewAction", "initData", "initViews", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "setStatusBarColor", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class PortfolioSearchActivity extends AmeActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f37087a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f37088b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private ImmersionBar f37089c;

    /* renamed from: d  reason: collision with root package name */
    private CommerceUser f37090d;

    /* renamed from: e  reason: collision with root package name */
    private List<t> f37091e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private String f37092f = "";
    private HashMap g;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/ugc/aweme/commerce/portfolio/search/PortfolioSearchActivity$Companion;", "", "()V", "CLEAR_KEY_WORD", "", "SEARCH_HINT", "", "SHOP_COLUMNS", "USER", "start", "", "activity", "Landroid/app/Activity;", "user", "Lcom/ss/android/ugc/aweme/commerce/service/models/CommerceUser;", "shopColumns", "", "Lcom/ss/android/ugc/aweme/commerce/service/models/ShopColumn;", "searchHint", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37093a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"com/ss/android/ugc/aweme/commerce/portfolio/search/PortfolioSearchActivity$initViews$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "text", "before", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37095b;

        public final void afterTextChanged(@Nullable Editable editable) {
        }

        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        b(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37095b = portfolioSearchActivity;
        }

        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
            if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37094a, false, 28484, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f37094a, false, 28484, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                ImageView imageView = (ImageView) this.f37095b.a(C0906R.id.x1);
                Intrinsics.checkExpressionValueIsNotNull(imageView, "commerce_portfolio_search_close");
                if (imageView.getVisibility() == 8) {
                    ImageView imageView2 = (ImageView) this.f37095b.a(C0906R.id.x1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView2, "commerce_portfolio_search_close");
                    imageView2.setVisibility(0);
                    return;
                }
            }
            if (TextUtils.isEmpty(charSequence)) {
                ImageView imageView3 = (ImageView) this.f37095b.a(C0906R.id.x1);
                Intrinsics.checkExpressionValueIsNotNull(imageView3, "commerce_portfolio_search_close");
                if (imageView3.getVisibility() == 0) {
                    ImageView imageView4 = (ImageView) this.f37095b.a(C0906R.id.x1);
                    Intrinsics.checkExpressionValueIsNotNull(imageView4, "commerce_portfolio_search_close");
                    imageView4.setVisibility(8);
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37096a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37097b;

        c(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37097b = portfolioSearchActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37096a, false, 28485, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37096a, false, 28485, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((DmtEditText) this.f37097b.a(C0906R.id.x3)).setText("");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "actionId", "", "<anonymous parameter 2>", "Landroid/view/KeyEvent;", "onEditorAction"}, k = 3, mv = {1, 1, 15})
    static final class d implements TextView.OnEditorActionListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37098a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37099b;

        d(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37099b = portfolioSearchActivity;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (PatchProxy.isSupport(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f37098a, false, 28486, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{textView, Integer.valueOf(i), keyEvent}, this, f37098a, false, 28486, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            }
            if (i == 3) {
                this.f37099b.a();
            }
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37100a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37101b;

        e(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37101b = portfolioSearchActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37100a, false, 28487, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37100a, false, 28487, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37101b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37103b;

        f(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37103b = portfolioSearchActivity;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f37102a, false, 28488, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f37102a, false, 28488, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f37103b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f37104a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PortfolioSearchActivity f37105b;

        g(PortfolioSearchActivity portfolioSearchActivity) {
            this.f37105b = portfolioSearchActivity;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f37104a, false, 28489, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f37104a, false, 28489, new Class[0], Void.TYPE);
                return;
            }
            ((DmtEditText) this.f37105b.a(C0906R.id.x3)).requestFocus();
            Object systemService = this.f37105b.getSystemService("input_method");
            if (systemService != null) {
                ((InputMethodManager) systemService).showSoftInput((DmtEditText) this.f37105b.a(C0906R.id.x3), 0);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public final View a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f37087a, false, 28480, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f37087a, false, 28480, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.g == null) {
            this.g = new HashMap();
        }
        View view = (View) this.g.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f37087a, false, 28482, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f37087a, false, 28482, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f37087a, false, 28472, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37087a, false, 28472, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        finish();
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f37087a, false, 28479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37087a, false, 28479, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        ImmersionBar immersionBar = this.f37089c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        if (PatchProxy.isSupport(new Object[0], this, f37087a, false, 28473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37087a, false, 28473, new Class[0], Void.TYPE);
            return;
        }
        super.setStatusBarColor();
        this.f37089c = ImmersionBar.with((Activity) this);
        ImmersionBar immersionBar = this.f37089c;
        if (immersionBar != null) {
            ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
            if (statusBarDarkFont != null) {
                statusBarDarkFont.init();
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f37087a, false, 28471, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f37087a, false, 28471, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity", "onResume", true);
        super.onResume();
        ((DmtEditText) a(C0906R.id.x3)).postDelayed(new g(this), 300);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity", "onResume", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r19 = this;
            r7 = r19
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28477(0x6f3d, float:3.9905E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28477(0x6f3d, float:3.9905E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            r0 = 2131166071(0x7f070377, float:1.7946377E38)
            android.view.View r1 = r7.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r1 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r1
            java.lang.String r2 = "commerce_portfolio_search_input"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            android.text.Editable r1 = r1.getText()
            r2 = 0
            if (r1 == 0) goto L_0x0057
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0057
            if (r1 == 0) goto L_0x004f
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.CharSequence r1 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r1)
            java.lang.String r1 = r1.toString()
            goto L_0x0058
        L_0x004f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0057:
            r1 = r2
        L_0x0058:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 1
            if (r3 == 0) goto L_0x0093
            android.view.View r3 = r7.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r3 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r3
            java.lang.String r5 = "commerce_portfolio_search_input"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r5)
            java.lang.CharSequence r3 = r3.getHint()
            if (r3 == 0) goto L_0x0077
            java.lang.String r2 = r3.toString()
        L_0x0077:
            r3 = r2
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0093
            android.content.res.Resources r3 = r19.getResources()
            r5 = 2131559392(0x7f0d03e0, float:1.8744127E38)
            java.lang.String r3 = r3.getString(r5)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r2)
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0093
            r1 = r2
        L_0x0093:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0162
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity$a r1 = com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity.f37107b
            r2 = r7
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.View r0 = r7.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r0
            java.lang.String r3 = "commerce_portfolio_search_input"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r3)
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r3 = r7.f37090d
            if (r3 != 0) goto L_0x00bc
            java.lang.String r5 = "mUser"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
        L_0x00bc:
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r5 = r7.f37091e
            r6 = 5
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r2
            r9[r4] = r0
            r16 = 2
            r9[r16] = r3
            r17 = 3
            r9[r17] = r5
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            r18 = 4
            r9[r18] = r10
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity.a.f37112a
            r12 = 0
            r13 = 28503(0x6f57, float:3.9941E-41)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<android.app.Activity> r10 = android.app.Activity.class
            r14[r8] = r10
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r14[r4] = r10
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.CommerceUser> r10 = com.ss.android.ugc.aweme.commerce.service.models.CommerceUser.class
            r14[r16] = r10
            java.lang.Class<java.util.List> r10 = java.util.List.class
            r14[r17] = r10
            java.lang.Class r10 = java.lang.Integer.TYPE
            r14[r18] = r10
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x012b
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r9[r8] = r2
            r9[r4] = r0
            r9[r16] = r3
            r9[r17] = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r9[r18] = r0
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity.a.f37112a
            r12 = 0
            r13 = 28503(0x6f57, float:3.9941E-41)
            java.lang.Class[] r14 = new java.lang.Class[r6]
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r14[r8] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r14[r4] = r0
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.models.CommerceUser> r0 = com.ss.android.ugc.aweme.commerce.service.models.CommerceUser.class
            r14[r16] = r0
            java.lang.Class<java.util.List> r0 = java.util.List.class
            r14[r17] = r0
            java.lang.Class r0 = java.lang.Integer.TYPE
            r14[r18] = r0
            java.lang.Class r15 = java.lang.Void.TYPE
            r10 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
            return
        L_0x012b:
            java.lang.String r1 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
            java.lang.String r1 = "keyWord"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            java.lang.String r1 = "user"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r1)
            java.lang.String r1 = "shopColumns"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r5, r1)
            android.content.Intent r1 = new android.content.Intent
            r6 = r2
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Class<com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity> r9 = com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchResultActivity.class
            r1.<init>(r6, r9)
            java.lang.String r6 = "key_word"
            r1.putExtra(r6, r0)
            java.lang.String r0 = "user"
            java.io.Serializable r3 = (java.io.Serializable) r3
            r1.putExtra(r0, r3)
            java.lang.String r0 = "shopColumns"
            java.io.Serializable r5 = (java.io.Serializable) r5
            r1.putExtra(r0, r5)
            r2.startActivityForResult(r1, r4)
            r2.overridePendingTransition(r8, r8)
        L_0x0162:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ef, code lost:
        if (r0 == null) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 28470(0x6f36, float:3.9895E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28470(0x6f36, float:3.9895E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            super.onCreate(r11)
            r0 = 2131689618(0x7f0f0092, float:1.9008256E38)
            r10.setContentView((int) r0)
            r0 = 2131170096(0x7f071330, float:1.795454E38)
            android.view.View r7 = r10.a(r0)
            java.lang.String r0 = "status_bar"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28474(0x6f3a, float:3.99E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007a
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r7
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28474(0x6f3a, float:3.99E-41)
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
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28475(0x6f3b, float:3.9902E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28475(0x6f3b, float:3.9902E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00f5
        L_0x00b0:
            android.content.Intent r0 = r10.getIntent()
            r1 = 0
            if (r0 == 0) goto L_0x00be
            java.lang.String r2 = "user"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto L_0x00bf
        L_0x00be:
            r0 = r1
        L_0x00bf:
            if (r0 == 0) goto L_0x0197
            com.ss.android.ugc.aweme.commerce.service.models.CommerceUser r0 = (com.ss.android.ugc.aweme.commerce.service.models.CommerceUser) r0
            r10.f37090d = r0
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r2 = "shopColumns"
            java.io.Serializable r0 = r0.getSerializableExtra(r2)
            goto L_0x00d3
        L_0x00d2:
            r0 = r1
        L_0x00d3:
            boolean r2 = r0 instanceof java.util.List
            if (r2 != 0) goto L_0x00d8
            r0 = r1
        L_0x00d8:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x00e3
            java.util.List<com.ss.android.ugc.aweme.commerce.service.models.t> r1 = r10.f37091e
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
        L_0x00e3:
            android.content.Intent r0 = r10.getIntent()
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = "search_hint"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x00f3
        L_0x00f1:
            java.lang.String r0 = ""
        L_0x00f3:
            r10.f37092f = r0
        L_0x00f5:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28476(0x6f3c, float:3.9903E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f37087a
            r3 = 0
            r4 = 28476(0x6f3c, float:3.9903E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x018f
        L_0x0117:
            java.lang.String r0 = r10.f37092f
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 2131166071(0x7f070377, float:1.7946377E38)
            if (r0 != 0) goto L_0x0136
            android.view.View r0 = r10.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r0
            java.lang.String r2 = "commerce_portfolio_search_input"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            java.lang.String r2 = r10.f37092f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setHint(r2)
        L_0x0136:
            android.view.View r0 = r10.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$b r2 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$b
            r2.<init>(r10)
            android.text.TextWatcher r2 = (android.text.TextWatcher) r2
            r0.addTextChangedListener(r2)
            r0 = 2131166069(0x7f070375, float:1.7946373E38)
            android.view.View r0 = r10.a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$c r2 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$c
            r2.<init>(r10)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r0.setOnClickListener(r2)
            android.view.View r0 = r10.a(r1)
            com.bytedance.ies.dmt.ui.widget.DmtEditText r0 = (com.bytedance.ies.dmt.ui.widget.DmtEditText) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$d r1 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$d
            r1.<init>(r10)
            android.widget.TextView$OnEditorActionListener r1 = (android.widget.TextView.OnEditorActionListener) r1
            r0.setOnEditorActionListener(r1)
            r0 = 2131166075(0x7f07037b, float:1.7946385E38)
            android.view.View r0 = r10.a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.ui.widget.DmtTextView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$e r1 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$e
            r1.<init>(r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131166073(0x7f070379, float:1.7946381E38)
            android.view.View r0 = r10.a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$f r1 = new com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity$f
            r1.<init>(r10)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x018f:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r9)
            return
        L_0x0197:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commerce.service.models.CommerceUser"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.portfolio.search.PortfolioSearchActivity.onCreate(android.os.Bundle):void");
    }

    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f37087a, false, 28478, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f37087a, false, 28478, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            ((DmtEditText) a(C0906R.id.x3)).setText("");
        }
    }
}

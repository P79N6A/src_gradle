package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.commercialize.c.f;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 92\u00020\u00012\u00020\u0002:\u00019B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0018H\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0012\u0010,\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0012\u0010-\u001a\u00020\u001c2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J&\u00100\u001a\u0004\u0018\u00010\u00182\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u0001042\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00105\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00182\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00106\u001a\u00020\u001eH\u0016J\f\u00107\u001a\u000208*\u00020\u0016H\u0002R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/cards/AdHalfWebPageFragmentV2;", "Lcom/bytedance/ies/uikit/base/AbsFragment;", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/IAdHalfWebPageFragment;", "()V", "value", "", "closeBtnRes", "getCloseBtnRes", "()I", "setCloseBtnRes", "(I)V", "halfWebPageAction", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/IHalfWebPageAction;", "loadListener", "Lcom/ss/android/ugc/aweme/commercialize/listener/AdHalfWebPageLoadListener;", "getLoadListener", "()Lcom/ss/android/ugc/aweme/commercialize/listener/AdHalfWebPageLoadListener;", "setLoadListener", "(Lcom/ss/android/ugc/aweme/commercialize/listener/AdHalfWebPageLoadListener;)V", "mCloseBtn", "Landroid/widget/ImageView;", "mWebView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "mWebViewCover", "Landroid/view/View;", "url", "", "enableScrollWebViewInside", "", "enable", "", "enableTouchWebViewInside", "getFragment", "Landroid/support/v4/app/Fragment;", "getWebView", "Landroid/webkit/WebView;", "initAdHalfPageLoadListener", "simplePageLoadListener", "Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;", "initCloseBtnRes", "initHalfWebPageAction", "initViews", "view", "loadSuccess", "loadUrl", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "renderSuccess", "getRawWebView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdHalfWebPageFragmentV2 extends AbsFragment implements j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40021a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f40022e = new a((byte) 0);
    @IdRes

    /* renamed from: b  reason: collision with root package name */
    public int f40023b = 2130839475;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.c.a f40024c;

    /* renamed from: d  reason: collision with root package name */
    public k f40025d;

    /* renamed from: f  reason: collision with root package name */
    private CrossPlatformWebView f40026f;
    private View g;
    private ImageView h;
    private String i = "";
    private HashMap j;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/cards/AdHalfWebPageFragmentV2$Companion;", "", "()V", "newInstance", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/AdHalfWebPageFragmentV2;", "args", "Landroid/os/Bundle;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40027a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AdHalfWebPageFragmentV2 a(@NotNull Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, f40027a, false, 33069, new Class[]{Bundle.class}, AdHalfWebPageFragmentV2.class)) {
                return (AdHalfWebPageFragmentV2) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f40027a, false, 33069, new Class[]{Bundle.class}, AdHalfWebPageFragmentV2.class);
            }
            Intrinsics.checkParameterIsNotNull(bundle2, "args");
            AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2 = new AdHalfWebPageFragmentV2();
            adHalfWebPageFragmentV2.setArguments(bundle2);
            return adHalfWebPageFragmentV2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageFragmentV2 f40029b;

        b(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f40029b = adHalfWebPageFragmentV2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40028a, false, 33074, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40028a, false, 33074, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            k kVar = this.f40029b.f40025d;
            if (kVar != null) {
                kVar.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdHalfWebPageFragmentV2 f40031b;

        c(AdHalfWebPageFragmentV2 adHalfWebPageFragmentV2) {
            this.f40031b = adHalfWebPageFragmentV2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40030a, false, 33075, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40030a, false, 33075, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            k kVar = this.f40031b.f40025d;
            if (kVar != null) {
                kVar.b();
            }
        }
    }

    @JvmStatic
    @NotNull
    public static final AdHalfWebPageFragmentV2 a(@NotNull Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, null, f40021a, true, 33068, new Class[]{Bundle.class}, AdHalfWebPageFragmentV2.class)) {
            return f40022e.a(bundle2);
        }
        return (AdHalfWebPageFragmentV2) PatchProxy.accessDispatch(new Object[]{bundle2}, null, f40021a, true, 33068, new Class[]{Bundle.class}, AdHalfWebPageFragmentV2.class);
    }

    @NotNull
    public final Fragment f() {
        return this;
    }

    @NotNull
    public final WebView b() {
        if (PatchProxy.isSupport(new Object[0], this, f40021a, false, 33059, new Class[0], WebView.class)) {
            return (WebView) PatchProxy.accessDispatch(new Object[0], this, f40021a, false, 33059, new Class[0], WebView.class);
        }
        CrossPlatformWebView crossPlatformWebView = this.f40026f;
        if (crossPlatformWebView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        return a(crossPlatformWebView);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (PatchProxy.isSupport(new Object[0], this, f40021a, false, 33067, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40021a, false, 33067, new Class[0], Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.clear();
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f40021a, false, 33060, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40021a, false, 33060, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f40024c == null) {
            return false;
        } else {
            com.ss.android.ugc.aweme.commercialize.c.a aVar = this.f40024c;
            if (aVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadListener");
            }
            if (!aVar.f38523b || aVar.f38524c) {
                return false;
            }
            return true;
        }
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f40021a, false, 33061, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f40021a, false, 33061, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!(this.f40025d instanceof AbsAdCardAction)) {
            return g();
        } else {
            k kVar = this.f40025d;
            if (kVar != null) {
                return ((AbsAdCardAction) kVar).c();
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction");
        }
    }

    private final SingleWebView a(@NotNull CrossPlatformWebView crossPlatformWebView) {
        CrossPlatformWebView crossPlatformWebView2 = crossPlatformWebView;
        if (PatchProxy.isSupport(new Object[]{crossPlatformWebView2}, this, f40021a, false, 33065, new Class[]{CrossPlatformWebView.class}, SingleWebView.class)) {
            return (SingleWebView) PatchProxy.accessDispatch(new Object[]{crossPlatformWebView2}, this, f40021a, false, 33065, new Class[]{CrossPlatformWebView.class}, SingleWebView.class);
        }
        SingleWebView b2 = ((h) crossPlatformWebView2.a(h.class)).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "getViewWrap(WebViewWrap::class.java).webView");
        return b2;
    }

    public final void b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f40021a, false, 33058, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f40021a, false, 33058, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i3 != 0) {
            this.f40023b = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0053, code lost:
        if (r0 == null) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r18) {
        /*
            r17 = this;
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r4 = f40021a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 33052(0x811c, float:4.6316E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0034
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r18
            com.meituan.robust.ChangeQuickRedirect r12 = f40021a
            r13 = 0
            r14 = 33052(0x811c, float:4.6316E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0034:
            super.onCreate(r18)
            android.os.Bundle r0 = r17.getArguments()
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = "url"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 == 0) goto L_0x005e
            if (r0 == 0) goto L_0x0056
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0060
            goto L_0x005e
        L_0x0056:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = ""
        L_0x0060:
            r1 = r0
            r0 = r17
            r0.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.cards.AdHalfWebPageFragmentV2.onCreate(android.os.Bundle):void");
    }

    public final void a(@NotNull f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f40021a, false, 33056, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f40021a, false, 33056, new Class[]{f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "simplePageLoadListener");
        this.f40024c = new com.ss.android.ugc.aweme.commercialize.c.a(fVar2, false);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40021a, false, 33063, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40021a, false, 33063, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            CrossPlatformWebView crossPlatformWebView = this.f40026f;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            a(crossPlatformWebView).setCanScrollVertically(z);
        }
    }

    public final void a(@NotNull k kVar) {
        k kVar2 = kVar;
        if (PatchProxy.isSupport(new Object[]{kVar2}, this, f40021a, false, 33057, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar2}, this, f40021a, false, 33057, new Class[]{k.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(kVar2, "halfWebPageAction");
        this.f40025d = kVar2;
    }

    public final void a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f40021a, false, 33064, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f40021a, false, 33064, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            g.a(b(), str2);
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f40021a, false, 33062, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f40021a, false, 33062, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (isViewValid()) {
            if (z) {
                View view = this.g;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWebViewCover");
                }
                view.setVisibility(8);
                return;
            }
            View view2 = this.g;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewCover");
            }
            view2.setVisibility(0);
        }
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f40021a, false, 33054, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f40021a, false, 33054, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, f40021a, false, 33055, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f40021a, false, 33055, new Class[]{View.class}, Void.TYPE);
        } else {
            View findViewById = view.findViewById(C0906R.id.dx6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.webview)");
            this.f40026f = (CrossPlatformWebView) findViewById;
            FragmentActivity activity = getActivity();
            if (!(activity == null || this.f40024c == null)) {
                CrossPlatformWebView crossPlatformWebView = this.f40026f;
                if (crossPlatformWebView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                }
                com.ss.android.ugc.aweme.crossplatform.view.a aVar = crossPlatformWebView;
                com.ss.android.ugc.aweme.commercialize.c.a aVar2 = this.f40024c;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadListener");
                }
                CommercializeWebViewHelper.a(aVar, aVar2, this, activity, getArguments());
            }
            CrossPlatformWebView crossPlatformWebView2 = this.f40026f;
            if (crossPlatformWebView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            a(crossPlatformWebView2).setEnableScrollControl(true);
            CrossPlatformWebView crossPlatformWebView3 = this.f40026f;
            if (crossPlatformWebView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            a(crossPlatformWebView3).setCanScrollVertically(false);
            CrossPlatformWebView crossPlatformWebView4 = this.f40026f;
            if (crossPlatformWebView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            WebSettings settings = a(crossPlatformWebView4).getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "mWebView.getRawWebView().settings");
            settings.setTextZoom(100);
            View findViewById2 = view.findViewById(C0906R.id.dx9);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.webview_cover)");
            this.g = findViewById2;
            View view2 = this.g;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebViewCover");
            }
            view2.setOnClickListener(new b(this));
            View findViewById3 = view.findViewById(C0906R.id.ti);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.close)");
            this.h = (ImageView) findViewById3;
            ImageView imageView = this.h;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            imageView.setImageResource(this.f40023b);
            if (this.f40023b == 2130839477) {
                ImageView imageView2 = this.h;
                if (imageView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
                }
                imageView2.setPadding(u.a(12.0d), u.a(4.0d), u.a(4.0d), u.a(7.0d));
            }
            ImageView imageView3 = this.h;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            imageView3.setOnClickListener(new c(this));
            ImageView imageView4 = this.h;
            if (imageView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            com.ss.android.ugc.aweme.utils.c.a(imageView4);
        }
        CrossPlatformWebView crossPlatformWebView5 = this.f40026f;
        if (crossPlatformWebView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        crossPlatformWebView5.b(this.i, false);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f40021a, false, 33053, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f40021a, false, 33053, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.mu, viewGroup2, false);
    }
}

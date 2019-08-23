package com.ss.android.ugc.aweme.commercialize.views.form;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.o;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001cH\u0002J\u0012\u0010!\u001a\u00020\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J&\u0010$\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016J\b\u0010)\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020,H\u0007J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020.H\u0007J\u0010\u0010*\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0007J\u001a\u00101\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\f\u00102\u001a\u000203*\u00020\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskFragment;", "Lcom/bytedance/ies/uikit/base/AbsFragment;", "()V", "commitSuccess", "", "cssInjectionFinish", "loadFailed", "mAdBtn", "Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;", "mAdFormBrowserInternalListener", "Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskInternalListener;", "getMAdFormBrowserInternalListener", "()Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskInternalListener;", "setMAdFormBrowserInternalListener", "(Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskInternalListener;)V", "mAdViewController", "Lcom/ss/android/ugc/aweme/commercialize/feed/AdViewController;", "mAweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "mReplayBtn", "mRootView", "Landroid/view/ViewGroup;", "mWebView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "url", "", "useCssInjection", "cssInject", "", "initView", "view", "Landroid/view/View;", "mobForm", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onDestroyView", "onEvent", "event", "Lcom/ss/android/ugc/aweme/commercialize/event/CloseAdFormDialogEvent;", "adCardClose", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/AbsAdCardAction$AdCardClose;", "adCardStatus", "Lcom/ss/android/ugc/aweme/commercialize/views/cards/AbsAdCardAction$AdCardStatus;", "onViewCreated", "getRawWebView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class AdFormMaskFragment extends AbsFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2958a;
    public static final a h = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public CrossPlatformWebView f2959b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f2960c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.feed.e f2961d = new com.ss.android.ugc.aweme.commercialize.feed.e();
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public c f2962e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2963f;
    public boolean g;
    private ViewGroup i;
    private DmtTextView j;
    private DmtTextView k;
    private String l = "";
    private boolean m;
    private boolean n;
    private HashMap o;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J(\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskFragment$Companion;", "", "()V", "AD_FORM_MASK_CSS_URL", "", "create", "Lcom/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskFragment;", "args", "Landroid/os/Bundle;", "hide", "", "fragmentManager", "Landroid/support/v4/app/FragmentManager;", "containerLayout", "Landroid/view/ViewGroup;", "containerId", "", "needResumePlay", "", "show", "fragment", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40076a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public final AdFormMaskFragment a(@NotNull Bundle bundle) {
            Bundle bundle2 = bundle;
            if (PatchProxy.isSupport(new Object[]{bundle2}, this, f40076a, false, 33148, new Class[]{Bundle.class}, AdFormMaskFragment.class)) {
                return (AdFormMaskFragment) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f40076a, false, 33148, new Class[]{Bundle.class}, AdFormMaskFragment.class);
            }
            Intrinsics.checkParameterIsNotNull(bundle2, "args");
            AdFormMaskFragment adFormMaskFragment = new AdFormMaskFragment();
            adFormMaskFragment.setArguments(bundle2);
            return adFormMaskFragment;
        }

        @JvmStatic
        public final void a(@NotNull FragmentManager fragmentManager, @NotNull ViewGroup viewGroup, int i, @NotNull AdFormMaskFragment adFormMaskFragment) {
            FragmentManager fragmentManager2 = fragmentManager;
            ViewGroup viewGroup2 = viewGroup;
            int i2 = i;
            AdFormMaskFragment adFormMaskFragment2 = adFormMaskFragment;
            if (PatchProxy.isSupport(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), adFormMaskFragment2}, this, f40076a, false, 33149, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, AdFormMaskFragment.class}, Void.TYPE)) {
                Object[] objArr = {fragmentManager2, viewGroup2, Integer.valueOf(i), adFormMaskFragment2};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f40076a, false, 33149, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, AdFormMaskFragment.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragmentManager2, "fragmentManager");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "containerLayout");
            Intrinsics.checkParameterIsNotNull(adFormMaskFragment2, "fragment");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(i2);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(frameLayout);
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
            if (!o.v()) {
                o.b().h();
            }
            beginTransaction.add(i2, (Fragment) adFormMaskFragment2);
            beginTransaction.commitAllowingStateLoss();
        }

        @JvmStatic
        public final void a(@NotNull FragmentManager fragmentManager, @NotNull ViewGroup viewGroup, int i, boolean z) {
            FragmentManager fragmentManager2 = fragmentManager;
            ViewGroup viewGroup2 = viewGroup;
            if (PatchProxy.isSupport(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f40076a, false, 33150, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{fragmentManager2, viewGroup2, Integer.valueOf(i), Byte.valueOf(z)}, this, f40076a, false, 33150, new Class[]{FragmentManager.class, ViewGroup.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(fragmentManager2, "fragmentManager");
            Intrinsics.checkParameterIsNotNull(viewGroup2, "containerLayout");
            Fragment findFragmentById = fragmentManager2.findFragmentById(i);
            if (findFragmentById != null) {
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                Intrinsics.checkExpressionValueIsNotNull(beginTransaction, "fragmentManager.beginTransaction()");
                beginTransaction.remove(findFragmentById);
                beginTransaction.commitAllowingStateLoss();
            }
            viewGroup2.removeView((FrameLayout) viewGroup.findViewById(i));
            if (z && !o.v()) {
                o.b().f();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 1, 15})
    static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40077a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdFormMaskFragment f40078b;

        b(AdFormMaskFragment adFormMaskFragment) {
            this.f40078b = adFormMaskFragment;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f40077a, false, 33151, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f40077a, false, 33151, new Class[0], Void.TYPE);
                return;
            }
            CrossPlatformWebView crossPlatformWebView = this.f40078b.f2959b;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            crossPlatformWebView.setVisibility(0);
            this.f40078b.a();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdFormMaskFragment f40080b;

        c(AdFormMaskFragment adFormMaskFragment) {
            this.f40080b = adFormMaskFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40079a, false, 33152, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40079a, false, 33152, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            g.o(this.f40080b.getContext(), this.f40080b.f2960c);
            c cVar = this.f40080b.f2962e;
            if (cVar != null) {
                cVar.c();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 1, 15})
    static final class d implements View.OnFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdFormMaskFragment f40082b;

        d(AdFormMaskFragment adFormMaskFragment) {
            this.f40082b = adFormMaskFragment;
        }

        public final void onFocusChange(View view, boolean z) {
            if (PatchProxy.isSupport(new Object[]{view, Byte.valueOf(z ? (byte) 1 : 0)}, this, f40081a, false, 33153, new Class[]{View.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, Byte.valueOf(z)}, this, f40081a, false, 33153, new Class[]{View.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.commercialize.b.f fVar = new com.ss.android.ugc.aweme.commercialize.b.f(z);
            FragmentActivity activity = this.f40082b.getActivity();
            if (activity != null) {
                fVar.f38514b = activity.hashCode();
                bg.a(fVar);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdFormMaskFragment f40084b;

        e(AdFormMaskFragment adFormMaskFragment) {
            this.f40084b = adFormMaskFragment;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40083a, false, 33154, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40083a, false, 33154, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f40084b.f2961d.a(3);
            if (!this.f40084b.f2961d.c() || !com.ss.android.ugc.aweme.commercialize.utils.g.b(this.f40084b.getContext(), this.f40084b.f2960c)) {
                com.ss.android.ugc.aweme.commercialize.utils.g.c(this.f40084b.getContext(), this.f40084b.f2960c);
                c cVar = this.f40084b.f2962e;
                if (cVar != null) {
                    cVar.c();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/form/AdFormMaskFragment$initView$webViewStatus$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class f implements com.ss.android.ugc.aweme.crossplatform.platform.webview.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40085a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdFormMaskFragment f40086b;

        public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        }

        public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        }

        public final void b(@Nullable WebView webView, @Nullable String str) {
        }

        f(AdFormMaskFragment adFormMaskFragment) {
            this.f40086b = adFormMaskFragment;
        }

        public final void a(@Nullable WebView webView, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40085a, false, 33155, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40085a, false, 33155, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            c cVar = this.f40086b.f2962e;
            if (cVar != null && this.f40086b.f2963f) {
                AdFormMaskFragment adFormMaskFragment = this.f40086b;
                if (PatchProxy.isSupport(new Object[0], adFormMaskFragment, AdFormMaskFragment.f2958a, false, 33137, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], adFormMaskFragment, AdFormMaskFragment.f2958a, false, 33137, new Class[0], Void.TYPE);
                } else {
                    CrossPlatformWebView crossPlatformWebView = adFormMaskFragment.f2959b;
                    if (crossPlatformWebView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                    }
                    adFormMaskFragment.a(crossPlatformWebView).loadUrl("javascript:(function extra(){" + "var aa =document.createElement(\"link\");aa.type='text/css'; aa.rel='stylesheet'; aa.href='https://s3b.bytecdn.cn/ies/static/style/douyin/form.css?=12344567771';document.getElementsByTagName(\"head\")[0].appendChild(aa);" + "})();");
                    CrossPlatformWebView crossPlatformWebView2 = adFormMaskFragment.f2959b;
                    if (crossPlatformWebView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                    }
                    crossPlatformWebView2.postDelayed(new b(adFormMaskFragment), 3000);
                }
                cVar.a();
            }
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceError}, this, f40085a, false, 33156, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceError}, this, f40085a, false, 33156, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                return;
            }
            this.f40086b.g = true;
            c cVar = this.f40086b.f2962e;
            if (cVar != null) {
                cVar.b();
            }
        }

        public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f40085a, false, 33157, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f40085a, false, 33157, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            this.f40086b.g = true;
            c cVar = this.f40086b.f2962e;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2958a, false, 33136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2958a, false, 33136, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        bg.d(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(18);
            }
        }
    }

    public final void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2958a, false, 33135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2958a, false, 33135, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        c cVar = this.f2962e;
        if (cVar != null && !this.g) {
            cVar.a(this.n);
        }
        if (PatchProxy.isSupport(new Object[0], this, f2958a, false, 33144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2958a, false, 33144, new Class[0], Void.TYPE);
            return;
        }
        if (this.o != null) {
            this.o.clear();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2958a, false, 33138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2958a, false, 33138, new Class[0], Void.TYPE);
            return;
        }
        if (!this.g && !this.m) {
            g.b(getContext(), this.f2960c, (Map<String, String>) null);
            g.J(getContext(), this.f2960c);
            this.m = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final SingleWebView a(@NotNull CrossPlatformWebView crossPlatformWebView) {
        CrossPlatformWebView crossPlatformWebView2 = crossPlatformWebView;
        if (PatchProxy.isSupport(new Object[]{crossPlatformWebView2}, this, f2958a, false, 33139, new Class[]{CrossPlatformWebView.class}, SingleWebView.class)) {
            return (SingleWebView) PatchProxy.accessDispatch(new Object[]{crossPlatformWebView2}, this, f2958a, false, 33139, new Class[]{CrossPlatformWebView.class}, SingleWebView.class);
        }
        SingleWebView b2 = ((h) crossPlatformWebView2.a(h.class)).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "getViewWrap(WebViewWrap::class.java).webView");
        return b2;
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.commercialize.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2958a, false, 33140, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2958a, false, 33140, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "event");
        if (getActivity() != null) {
            com.bytedance.ies.dmt.ui.d.a.a((Context) getActivity(), getString(C0906R.string.cgc)).a();
        }
        this.n = true;
        c cVar = this.f2962e;
        if (cVar != null) {
            cVar.c();
        }
    }

    public final void onCreate(@Nullable Bundle bundle) {
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2958a, false, 33131, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2958a, false, 33131, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                window.setSoftInputMode(32);
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(PushConstants.WEB_URL, "");
            Intrinsics.checkExpressionValueIsNotNull(string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
            if (string != null) {
                this.l = StringsKt.trim((CharSequence) string).toString();
                this.f2963f = arguments.getBoolean("use_css_injection", false);
                String string2 = arguments.getString("aweme_id", "");
                if (j.a().a(string2) != null) {
                    aweme = j.a().a(string2);
                } else {
                    aweme = com.ss.android.ugc.aweme.feed.a.a().b(string2);
                }
                this.f2960c = aweme;
                this.f2961d = new com.ss.android.ugc.aweme.commercialize.feed.e();
                this.f2961d.a(getContext(), this.f2960c);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        bg.c(this);
    }

    @Subscribe
    public final void onEvent(@NotNull AbsAdCardAction.b bVar) {
        AbsAdCardAction.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f2958a, false, 33142, new Class[]{AbsAdCardAction.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f2958a, false, 33142, new Class[]{AbsAdCardAction.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "adCardClose");
        c cVar = this.f2962e;
        if (cVar != null) {
            cVar.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0057, code lost:
        return;
     */
    @org.greenrobot.eventbus.Subscribe
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEvent(@org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.d r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2958a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$d> r1 = com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 33141(0x8175, float:4.644E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2958a
            r3 = 0
            r4 = 33141(0x8175, float:4.644E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$d> r1 = com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.d.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "adCardStatus"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r10, r0)
            com.ss.android.ugc.aweme.commercialize.views.form.c r0 = r9.f2962e
            if (r0 == 0) goto L_0x0058
            int r1 = r10.f40018a
            switch(r1) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0057
        L_0x0041:
            r0.a()
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.f2959b
            if (r0 != 0) goto L_0x004d
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x004d:
            r0.setVisibility(r8)
            r9.a()
            goto L_0x0058
        L_0x0054:
            r0.b()
        L_0x0057:
            return
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.views.form.AdFormMaskFragment.onEvent(com.ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction$d):void");
    }

    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2958a, false, 33133, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2958a, false, 33133, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view, "view");
        super.onViewCreated(view, bundle);
        if (PatchProxy.isSupport(new Object[]{view}, this, f2958a, false, 33134, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f2958a, false, 33134, new Class[]{View.class}, Void.TYPE);
        } else if (view != null) {
            this.i = (ViewGroup) view;
            ViewGroup viewGroup = this.i;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mRootView");
            }
            viewGroup.setOnClickListener(new c(this));
            View findViewById = view.findViewById(C0906R.id.dx6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "view.findViewById(R.id.webview)");
            this.f2959b = (CrossPlatformWebView) findViewById;
            CrossPlatformWebView crossPlatformWebView = this.f2959b;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            crossPlatformWebView.setOnFocusChangeListener(new d(this));
            f fVar = new f(this);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                CrossPlatformWebView crossPlatformWebView2 = this.f2959b;
                if (crossPlatformWebView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                }
                CommercializeWebViewHelper.a(crossPlatformWebView2, fVar, this, activity, getArguments());
            }
            CrossPlatformWebView crossPlatformWebView3 = this.f2959b;
            if (crossPlatformWebView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            a(crossPlatformWebView3).setEnableScrollControl(true);
            CrossPlatformWebView crossPlatformWebView4 = this.f2959b;
            if (crossPlatformWebView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            a(crossPlatformWebView4).setCanScrollVertically(false);
            if (this.f2963f) {
                CrossPlatformWebView crossPlatformWebView5 = this.f2959b;
                if (crossPlatformWebView5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mWebView");
                }
                WebSettings settings = a(crossPlatformWebView5).getSettings();
                String userAgentString = settings.getUserAgentString();
                settings.setUserAgentString(userAgentString + "/RevealType/Dialog");
            }
            View findViewById2 = view.findViewById(C0906R.id.bm);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "view.findViewById(R.id.ad_button)");
            this.j = (DmtTextView) findViewById2;
            DmtTextView dmtTextView = this.j;
            if (dmtTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdBtn");
            }
            dmtTextView.setOnClickListener(new e(this));
            DmtTextView dmtTextView2 = this.j;
            if (dmtTextView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAdBtn");
            }
            com.ss.android.ugc.aweme.utils.c.a(dmtTextView2);
            View findViewById3 = view.findViewById(C0906R.id.cde);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "view.findViewById(R.id.replay_button)");
            this.k = (DmtTextView) findViewById3;
            DmtTextView dmtTextView3 = this.k;
            if (dmtTextView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mReplayBtn");
            }
            com.ss.android.ugc.aweme.utils.c.a(dmtTextView3);
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        CrossPlatformWebView crossPlatformWebView6 = this.f2959b;
        if (crossPlatformWebView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mWebView");
        }
        crossPlatformWebView6.b(this.l, false);
    }

    @Nullable
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2958a, false, 33132, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f2958a, false, 33132, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        Intrinsics.checkParameterIsNotNull(layoutInflater2, "inflater");
        return layoutInflater2.inflate(C0906R.layout.ms, viewGroup2, false);
    }
}

package com.ss.android.ugc.aweme.crossplatform.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Space;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.f;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.DownloadBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.OpenUrlHintBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.ReportBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.ShareBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.WalletBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.params.base.CrossPlatformConstants;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformTitleBar;
import com.ss.android.ugc.aweme.crossplatform.view.GradualChangeLinearLayout;
import com.ss.android.ugc.aweme.crossplatform.view.d;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.cs;
import com.ss.android.ugc.aweme.utils.dv;
import com.ss.android.ugc.aweme.utils.ea;
import com.ss.android.ugc.aweme.utils.eb;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

public class MixActivityContainer extends AbsActivityContainer implements DefaultHardwareBackBtnHandler, d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2981a;
    @NonNull

    /* renamed from: b  reason: collision with root package name */
    public final Activity f2982b;
    @NonNull

    /* renamed from: c  reason: collision with root package name */
    public final a f2983c;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    public final j f2984d = j.a.a(this);

    /* renamed from: e  reason: collision with root package name */
    public e f2985e;

    /* renamed from: f  reason: collision with root package name */
    public c f2986f;
    public String g;
    public h h;
    public CrossPlatformTitleBar i;
    public Space j;
    @Nullable
    private com.ss.android.ugc.aweme.crossplatform.view.a k;
    private c l;
    private String m;
    private ImmersionBar n;
    private OpenURLHintLayout o;
    private View p;
    private long q;

    public final String g() {
        return null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
    }

    @NonNull
    public final com.ss.android.ugc.aweme.crossplatform.view.a c() {
        return this.k;
    }

    public final c d() {
        return this.l;
    }

    @NonNull
    public /* bridge */ /* synthetic */ Context getContext() {
        return this.f2982b;
    }

    @NotNull
    public final j getCrossPlatformBusiness() {
        return this.f2984d;
    }

    @NonNull
    public final a getCrossPlatformParams() {
        return this.f2983c;
    }

    private void A() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34150, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34150, new Class[0], Void.TYPE);
            return;
        }
        c().setFullScreen(new b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40681a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f40681a, false, 34182, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40681a, false, 34182, new Class[0], Void.TYPE);
                    return;
                }
                MixActivityContainer.this.e();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f40681a, false, 34183, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40681a, false, 34183, new Class[0], Void.TYPE);
                    return;
                }
                MixActivityContainer mixActivityContainer = MixActivityContainer.this;
                if (PatchProxy.isSupport(new Object[0], mixActivityContainer, MixActivityContainer.f2981a, false, 34155, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], mixActivityContainer, MixActivityContainer.f2981a, false, 34155, new Class[0], Void.TYPE);
                } else if (!mixActivityContainer.f2983c.f40808d.l) {
                    mixActivityContainer.n();
                } else {
                    if (!mixActivityContainer.getCrossPlatformParams().f40808d.p) {
                        mixActivityContainer.i.setVisibility(0);
                        mixActivityContainer.j.setVisibility(0);
                    }
                }
            }
        });
    }

    private boolean D() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34164, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34164, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return g.b().s().getEnableDynamicNavbar().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    private void s() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34131, new Class[0], Void.TYPE);
            return;
        }
        this.k = (com.ss.android.ugc.aweme.crossplatform.view.a) a((int) C0906R.id.a1o);
        this.k.setCrossPlatformActivityContainer(this);
        t();
        u();
    }

    private void t() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34132, new Class[0], Void.TYPE);
            return;
        }
        this.l = new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40677a;

            public final void a(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable String str, @org.jetbrains.annotations.Nullable Bitmap bitmap) {
                WebView webView2 = webView;
                String str2 = str;
                Bitmap bitmap2 = bitmap;
                if (PatchProxy.isSupport(new Object[]{webView2, str2, bitmap2}, this, f40677a, false, 34174, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, str2, bitmap2}, this, f40677a, false, 34174, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView2, str2, bitmap2);
                }
            }

            public final void b(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40677a, false, 34176, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40677a, false, 34176, new Class[]{WebView.class, String.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.b(webView, str);
                }
            }

            public final void a(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40677a, false, 34170, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40677a, false, 34170, new Class[]{WebView.class, String.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView, str);
                }
            }

            public final void a(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable SslErrorHandler sslErrorHandler, @org.jetbrains.annotations.Nullable SslError sslError) {
                WebView webView2 = webView;
                SslErrorHandler sslErrorHandler2 = sslErrorHandler;
                SslError sslError2 = sslError;
                if (PatchProxy.isSupport(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f40677a, false, 34173, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f40677a, false, 34173, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView2, sslErrorHandler2, sslError2);
                }
            }

            @TargetApi(23)
            public final void a(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable WebResourceRequest webResourceRequest, @org.jetbrains.annotations.Nullable WebResourceError webResourceError) {
                WebView webView2 = webView;
                WebResourceRequest webResourceRequest2 = webResourceRequest;
                WebResourceError webResourceError2 = webResourceError;
                if (PatchProxy.isSupport(new Object[]{webView2, webResourceRequest2, webResourceError2}, this, f40677a, false, 34171, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, webResourceRequest2, webResourceError2}, this, f40677a, false, 34171, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                    return;
                }
                if (webResourceRequest2 != null && webResourceRequest.isForMainFrame() && MixActivityContainer.this.getCrossPlatformParams().f40808d.p) {
                    if (!MixActivityContainer.this.f2983c.f40808d.l) {
                        MixActivityContainer.this.n();
                        return;
                    } else {
                        MixActivityContainer.this.i.setVisibility(0);
                        MixActivityContainer.this.j.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView2, webResourceRequest2, webResourceError2);
                }
            }

            public final void a(@org.jetbrains.annotations.Nullable WebView webView, @org.jetbrains.annotations.Nullable WebResourceRequest webResourceRequest, @org.jetbrains.annotations.Nullable WebResourceResponse webResourceResponse) {
                WebView webView2 = webView;
                WebResourceRequest webResourceRequest2 = webResourceRequest;
                WebResourceResponse webResourceResponse2 = webResourceResponse;
                if (PatchProxy.isSupport(new Object[]{webView2, webResourceRequest2, webResourceResponse2}, this, f40677a, false, 34172, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, webResourceRequest2, webResourceResponse2}, this, f40677a, false, 34172, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView2, webResourceRequest2, webResourceResponse2);
                }
            }

            public final void a(@org.jetbrains.annotations.Nullable WebView webView, int i, @org.jetbrains.annotations.Nullable String str, @org.jetbrains.annotations.Nullable String str2) {
                WebView webView2 = webView;
                String str3 = str;
                String str4 = str2;
                if (PatchProxy.isSupport(new Object[]{webView2, Integer.valueOf(i), str3, str4}, this, f40677a, false, 34175, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, Integer.valueOf(i), str3, str4}, this, f40677a, false, 34175, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.getCrossPlatformParams().f40808d.p) {
                    if (!MixActivityContainer.this.f2983c.f40808d.l) {
                        MixActivityContainer.this.n();
                        return;
                    } else {
                        MixActivityContainer.this.i.setVisibility(0);
                        MixActivityContainer.this.j.setVisibility(0);
                    }
                }
                if (MixActivityContainer.this.f2986f != null) {
                    MixActivityContainer.this.f2986f.a(webView2, i, str3, str4);
                }
            }
        };
    }

    private void v() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34134, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34134, new Class[0], Void.TYPE);
            return;
        }
        this.p = a((int) C0906R.id.cv1);
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        layoutParams.height = eb.b();
        this.p.setLayoutParams(layoutParams);
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34136, new Class[0], Void.TYPE);
            return;
        }
        if (getCrossPlatformParams().f40808d.j) {
            this.h.a("copylink", 4);
        }
    }

    private int z() {
        if (!PatchProxy.isSupport(new Object[0], this, f2981a, false, 34145, new Class[0], Integer.TYPE)) {
            return com.ss.android.ugc.aweme.crossplatform.base.b.a(this.f2982b);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34145, new Class[0], Integer.TYPE)).intValue();
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f2981a, false, 34148, new Class[0], Boolean.TYPE)) {
            return this.k.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34148, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34149, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34149, new Class[0], Void.TYPE);
            return;
        }
        this.k.b();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34154, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34154, new Class[0], Void.TYPE);
            return;
        }
        this.i.setVisibility(8);
        this.j.setVisibility(8);
    }

    public final void invokeDefaultOnBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34167, new Class[0], Void.TYPE);
            return;
        }
        this.f2982b.finish();
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34130, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34130, new Class[0], Void.TYPE);
            return;
        }
        s();
        c().a(this.f2982b);
        y();
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34160, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34160, new Class[0], Void.TYPE);
            return;
        }
        if (!c().c()) {
            C();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34129, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34129, new Class[0], Void.TYPE);
            return;
        }
        bg.c(this);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34140, new Class[0], Void.TYPE);
            return;
        }
        if (this.n != null) {
            this.n.destroy();
        }
        if (this.k != null) {
            this.k.d(this.f2982b);
        }
        bg.d(this);
    }

    public final void p() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34165, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34165, new Class[0], Void.TYPE);
            return;
        }
        ((ShareBusiness) getCrossPlatformBusiness().a(ShareBusiness.class)).a(c().getCurrentUrl());
    }

    private void B() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34152, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34152, new Class[0], Void.TYPE);
            return;
        }
        this.m = PushConstants.PUSH_TYPE_UPLOAD_LOG;
        this.j.setVisibility(0);
        GradualChangeLinearLayout gradualChangeLinearLayout = (GradualChangeLinearLayout) a((int) C0906R.id.bgq);
        gradualChangeLinearLayout.setTitleBar(this.i);
        gradualChangeLinearLayout.setGradualChangeMode(true);
        this.i.b();
    }

    private void C() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34161, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34161, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        a2.a(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.g);
        r.a("h5_leave_detail", (Map) a2.f34114b);
        if (this.f2985e != null) {
            this.f2985e.a();
        }
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34135, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34135, new Class[0], Void.TYPE);
            return;
        }
        this.i = (CrossPlatformTitleBar) a((int) C0906R.id.a1q);
        this.j = (Space) a((int) C0906R.id.bpv);
        this.i.setCrossPlatformParams(getCrossPlatformParams());
        this.i.setTitleWrap(new CrossPlatformTitleBar.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40679a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f40679a, false, 34177, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40679a, false, 34177, new Class[0], Void.TYPE);
                    return;
                }
                MixActivityContainer.this.g = "click_button";
                MixActivityContainer.this.o();
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f40679a, false, 34178, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40679a, false, 34178, new Class[0], Void.TYPE);
                    return;
                }
                ((ReportBusiness) MixActivityContainer.this.f2984d.a(ReportBusiness.class)).a(MixActivityContainer.this.f2982b);
            }

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f40679a, false, 34181, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40679a, false, 34181, new Class[0], Void.TYPE);
                    return;
                }
                if (MixActivityContainer.this.f2985e != null) {
                    MixActivityContainer.this.f2985e.a();
                }
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f40679a, false, 34179, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f40679a, false, 34179, new Class[0], Void.TYPE);
                } else if (MixActivityContainer.this.a()) {
                    ((ShareBusiness) MixActivityContainer.this.f2984d.a(ShareBusiness.class)).b((WebView) ((h) MixActivityContainer.this.c().a(h.class)).b());
                } else {
                    ((ShareBusiness) MixActivityContainer.this.f2984d.a(ShareBusiness.class)).c();
                }
            }

            public final void a(@NonNull View view) {
                boolean z;
                View view2 = view;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{view2}, this, f40679a, false, 34180, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view2}, this, f40679a, false, 34180, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                h hVar = MixActivityContainer.this.h;
                if (PatchProxy.isSupport(new Object[0], hVar, h.f40698a, false, 34186, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], hVar, h.f40698a, false, 34186, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (hVar.f40702e == null || hVar.f40702e.isEmpty()) {
                    hVar.f40699b.setVisibility(0);
                    hVar.f40700c.setVisibility(0);
                    hVar.f40701d.setVisibility(0);
                } else {
                    if (hVar.f40702e.contains(Integer.valueOf(CrossPlatformConstants.a.refresh.id))) {
                        v.a(hVar.f40699b, 8);
                        z = false;
                    } else {
                        v.a(hVar.f40699b, 0);
                        z = true;
                    }
                    if (hVar.f40702e.contains(Integer.valueOf(CrossPlatformConstants.a.copylink.id))) {
                        hVar.f40700c.setVisibility(8);
                    } else {
                        hVar.f40700c.setVisibility(0);
                        z = true;
                    }
                    if (hVar.f40702e.contains(Integer.valueOf(CrossPlatformConstants.a.openwithbrowser.id))) {
                        hVar.f40701d.setVisibility(8);
                        z2 = z;
                    } else {
                        hVar.f40701d.setVisibility(0);
                    }
                }
                if (z2) {
                    MixActivityContainer.this.h.a().showAsDropDown(view2, 0, -12);
                }
            }
        });
    }

    private void y() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34137, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34137, new Class[0], Void.TYPE);
        } else if (!getCrossPlatformParams().f40805a.l) {
            if (getCrossPlatformParams().f40805a.f40794b.intValue() == 2) {
                c().setDefaultHardwareBackBtnHandler(this);
                ((com.ss.android.ugc.aweme.crossplatform.view.c) c().a(com.ss.android.ugc.aweme.crossplatform.view.c.class)).a(getCrossPlatformParams());
                return;
            }
            ((h) c().a(h.class)).a(com.ss.android.ugc.aweme.crossplatform.base.b.a(getCrossPlatformParams().f40805a.f40796d, z()));
        }
    }

    public final boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34125, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34125, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(this.f2983c.f40805a.f40796d)) {
            return false;
        } else {
            boolean r = r();
            this.f2984d.a(this.f2983c);
            return r;
        }
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34159, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34159, new Class[0], Void.TYPE);
        } else if (getCrossPlatformParams().f40805a.f40794b.intValue() == 1) {
            this.g = "phone_press";
            o();
        } else {
            if (!c().c() && this.f2985e != null) {
                this.f2985e.a();
            }
        }
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34143, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.ae.c.a(this.f2982b);
        Activity activity = this.f2982b;
        if (PatchProxy.isSupport(new Object[]{activity}, null, com.ss.android.ugc.aweme.crossplatform.base.b.f40715b, true, 34211, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, null, com.ss.android.ugc.aweme.crossplatform.base.b.f40715b, true, 34211, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(com.ss.android.ugc.aweme.miniapp_api.a.a().f55980e)) {
            try {
                activity.startActivity(new Intent(activity, Class.forName(com.ss.android.ugc.aweme.miniapp_api.a.a().f55980e)));
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34141, new Class[0], Void.TYPE);
            return;
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f2984d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            if (PatchProxy.isSupport(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34273, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34273, new Class[0], Void.TYPE);
                return;
            }
            playableBusiness.f40751b = false;
            playableBusiness.a(false, true);
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34142, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34142, new Class[0], Void.TYPE);
            return;
        }
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f2984d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(true);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f2984d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            if (PatchProxy.isSupport(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34274, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34274, new Class[0], Void.TYPE);
                return;
            }
            playableBusiness.f40751b = true;
            playableBusiness.a(true, false);
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34151, new Class[0], Void.TYPE);
            return;
        }
        this.m = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
        this.j.setVisibility(8);
        ((GradualChangeLinearLayout) a((int) C0906R.id.bgq)).setGradualChangeMode(false);
        this.i.a();
    }

    private boolean r() {
        JSONObject jSONObject;
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34126, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34126, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (getCrossPlatformParams().f40805a.f40794b.intValue() == 1) {
            if (getCrossPlatformParams().f40805a.j) {
                com.ss.android.common.lib.a.a(this.f2982b, f.f34168b, "push");
            }
            if (!StringUtils.isEmpty(getCrossPlatformParams().f40806b.k)) {
                if (!StringUtils.isEmpty(getCrossPlatformParams().f40806b.l)) {
                    try {
                        jSONObject = new JSONObject(getCrossPlatformParams().f40806b.l);
                    } catch (Exception unused) {
                    }
                    com.ss.android.common.lib.a.a(this.f2982b.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f40806b.k, 0, 0, jSONObject);
                }
                jSONObject = null;
                com.ss.android.common.lib.a.a(this.f2982b.getApplicationContext(), "wap_stat", "wap_enter", getCrossPlatformParams().f40806b.k, 0, 0, jSONObject);
            }
            if (TextUtils.isEmpty(getCrossPlatformParams().f40805a.f40796d)) {
                return false;
            }
            return e.a(getCrossPlatformParams().f40805a.f40796d);
        } else if (getCrossPlatformParams().f40807c.k != null) {
            return true;
        } else {
            return false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34138, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34138, new Class[0], Void.TYPE);
            return;
        }
        c().c(this.f2982b);
        long currentTimeMillis = System.currentTimeMillis() - this.q;
        this.q = 0;
        com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
        a2.a("duration", currentTimeMillis);
        r.a("h5_stay_time", (Map) a2.f34114b);
        ((DownloadBusiness) this.f2984d.a(DownloadBusiness.class)).a(this.f2982b);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f2984d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a(false);
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f2984d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            if (PatchProxy.isSupport(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34272, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34272, new Class[0], Void.TYPE);
            } else if (!playableBusiness.f40751b) {
                playableBusiness.a(true, false);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34139, new Class[0], Void.TYPE);
            return;
        }
        c().b(this.f2982b);
        this.f2984d.a();
        this.q = System.currentTimeMillis();
        ((DownloadBusiness) this.f2984d.a(DownloadBusiness.class)).a(this.f2982b, (h) c().a(h.class));
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f2984d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a();
        }
        PlayableBusiness playableBusiness = (PlayableBusiness) this.f2984d.a(PlayableBusiness.class);
        if (playableBusiness != null) {
            if (PatchProxy.isSupport(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34271, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], playableBusiness, PlayableBusiness.f40750a, false, 34271, new Class[0], Void.TYPE);
            } else if (!playableBusiness.f40751b) {
                playableBusiness.a(false, true);
            }
        }
    }

    public final void q() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34166, new Class[0], Void.TYPE);
        } else if (!this.f2982b.isFinishing()) {
            this.o.setBackgroundColor(this.f2983c.f40808d.x);
            if (((h) c().a(h.class)).b().canGoBack()) {
                CrossPlatformTitleBar crossPlatformTitleBar = this.i;
                if (PatchProxy.isSupport(new Object[0], crossPlatformTitleBar, CrossPlatformTitleBar.f40990a, false, 34535, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], crossPlatformTitleBar, CrossPlatformTitleBar.f40990a, false, 34535, new Class[0], Void.TYPE);
                } else {
                    AutoRTLImageView autoRTLImageView = (AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.tk);
                    Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView, "close_all_webpage");
                    autoRTLImageView.setVisibility(0);
                }
            } else {
                CrossPlatformTitleBar crossPlatformTitleBar2 = this.i;
                if (PatchProxy.isSupport(new Object[0], crossPlatformTitleBar2, CrossPlatformTitleBar.f40990a, false, 34536, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], crossPlatformTitleBar2, CrossPlatformTitleBar.f40990a, false, 34536, new Class[0], Void.TYPE);
                    return;
                }
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) crossPlatformTitleBar2.a(C0906R.id.tk);
                Intrinsics.checkExpressionValueIsNotNull(autoRTLImageView2, "close_all_webpage");
                autoRTLImageView2.setVisibility(8);
            }
        }
    }

    private void u() {
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34133, new Class[0], Void.TYPE);
            return;
        }
        this.o = (OpenURLHintLayout) a((int) C0906R.id.a1p);
        if (this.f2983c.f40808d.f40827f != -2) {
            this.o.setBackgroundColor(this.f2983c.f40808d.f40827f);
        } else {
            this.o.setBackgroundColor(this.f2982b.getResources().getColor(C0906R.color.a17));
        }
        w();
        this.h = new h(this.f2982b, this);
        new k(this.f2982b, this).a();
        new b(this.f2982b, this).a();
        ((ShareBusiness) this.f2984d.a(ShareBusiness.class)).a((WebView) ((h) c().a(h.class)).b());
        if (this.f2983c.f40808d.t) {
            a.C0185a aVar = new a.C0185a(this.f2982b);
            aVar.b((int) C0906R.string.bim).b((int) C0906R.string.a13, g.f40697b);
            aVar.a().a();
        }
        x();
        c().getViewStatusRegistry().a((d) this);
        ((OpenUrlHintBusiness) this.f2984d.a(OpenUrlHintBusiness.class)).a(this.o, this.f2983c.f40805a.k);
        A();
        if (getCrossPlatformParams().f40808d.p) {
            e();
        }
        if (this.f2983c.f40808d.m == null || com.ss.android.g.a.a() || !D()) {
            if (!this.f2983c.f40808d.l) {
                n();
            }
        } else if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(this.f2983c.f40808d.m)) {
            n();
        } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(this.f2983c.f40808d.m)) {
            B();
        }
        v();
        if (getCrossPlatformParams().f40808d.n) {
            this.p.setVisibility(0);
            a((int) C0906R.id.a1p).setPadding(0, eb.b(), 0, 0);
        }
    }

    public final void f() {
        ImmersionBar immersionBar;
        if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34127, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34127, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.crossplatform.params.base.a crossPlatformParams = getCrossPlatformParams();
        Activity activity = this.f2982b;
        if (PatchProxy.isSupport(new Object[]{crossPlatformParams, activity}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34193, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class, Activity.class}, ImmersionBar.class)) {
            immersionBar = (ImmersionBar) PatchProxy.accessDispatch(new Object[]{crossPlatformParams, activity}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34193, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class, Activity.class}, ImmersionBar.class);
        } else if (!eb.a()) {
            immersionBar = null;
        } else {
            if (crossPlatformParams.f40805a.f40794b.intValue() != 2) {
                activity.findViewById(C0906R.id.a1p).setPadding(0, eb.b(), 0, 0);
                activity.findViewById(C0906R.id.cv1).setVisibility(0);
            }
            int statusBarColor = activity.getWindow().getStatusBarColor();
            eb.a(activity.getWindow());
            ImmersionBar keyboardEnable = ImmersionBar.with(activity).keyboardEnable(true, 32);
            keyboardEnable.init();
            if (crossPlatformParams.f40808d.p) {
                eb.a(activity, 0);
            }
            ea.f75806b.a(activity, activity.getWindow(), crossPlatformParams.f40808d.f40822a);
            if ((crossPlatformParams.f40808d.o && crossPlatformParams.f40808d.q) || (crossPlatformParams.f40808d.q && !com.ss.android.ugc.aweme.app.a.a.a(activity))) {
                eb.a(activity);
                activity.findViewById(C0906R.id.a1p).setPadding(0, 0, 0, 0);
                activity.findViewById(C0906R.id.cv1).setVisibility(8);
                crossPlatformParams.f40808d.r = activity.getWindow().getStatusBarColor();
            } else if (crossPlatformParams.f40808d.r != -2) {
                eb.a(activity, crossPlatformParams.f40808d.r);
            } else {
                crossPlatformParams.f40808d.r = statusBarColor;
            }
            immersionBar = keyboardEnable;
        }
        this.n = immersionBar;
        if (com.ss.android.g.a.b()) {
            Activity activity2 = this.f2982b;
            int color = this.f2982b.getResources().getColor(C0906R.color.a0i);
            if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(color)}, null, cs.f75695a, true, 88408, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(color)}, null, cs.f75695a, true, 88408, new Class[]{Activity.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            v.a(activity2, color);
            v.c(activity2);
        }
    }

    public final void a(e eVar) {
        this.f2985e = eVar;
    }

    private <T extends View> T a(@IdRes int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2981a, false, 34144, new Class[]{Integer.TYPE}, View.class)) {
            return this.f2982b.findViewById(i2);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2981a, false, 34144, new Class[]{Integer.TYPE}, View.class);
    }

    @Subscribe
    public final void onEvent(com.ss.android.ugc.aweme.im.service.model.g gVar) {
        if (PatchProxy.isSupport(new Object[]{gVar}, this, f2981a, false, 34162, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{gVar}, this, f2981a, false, 34162, new Class[]{com.ss.android.ugc.aweme.im.service.model.g.class}, Void.TYPE);
            return;
        }
        if (TextUtils.equals("web", gVar.itemType)) {
            dv.a(this.f2982b, this.i, gVar);
        }
    }

    @NotNull
    public final <T extends com.ss.android.ugc.aweme.crossplatform.view.g> T a(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f2981a, false, 34147, new Class[]{Class.class}, com.ss.android.ugc.aweme.crossplatform.view.g.class)) {
            return c().a(cls2);
        }
        return (com.ss.android.ugc.aweme.crossplatform.view.g) PatchProxy.accessDispatch(new Object[]{cls2}, this, f2981a, false, 34147, new Class[]{Class.class}, com.ss.android.ugc.aweme.crossplatform.view.g.class);
    }

    public final void a(Configuration configuration) {
        if (PatchProxy.isSupport(new Object[]{configuration}, this, f2981a, false, 34158, new Class[]{Configuration.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{configuration}, this, f2981a, false, 34158, new Class[]{Configuration.class}, Void.TYPE);
            return;
        }
        this.o.setLayoutParams(new FrameLayout.LayoutParams(Double.valueOf((double) UIUtils.dip2Px(this.f2982b, (float) configuration.screenWidthDp)).intValue(), Double.valueOf((double) UIUtils.dip2Px(this.f2982b, (float) configuration.screenHeightDp)).intValue()));
    }

    @Subscribe
    public final void onEvent(com.ss.android.ugc.aweme.crossplatform.a.a aVar) {
        com.ss.android.ugc.aweme.crossplatform.a.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2981a, false, 34163, new Class[]{com.ss.android.ugc.aweme.crossplatform.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2981a, false, 34163, new Class[]{com.ss.android.ugc.aweme.crossplatform.a.a.class}, Void.TYPE);
        } else if (aVar2 != null && aVar2.f40664a != null && D()) {
            String str = aVar2.f40664a;
            char c2 = 65535;
            if (str.hashCode() == 51 && str.equals("3")) {
                c2 = 0;
            }
            if (c2 == 0 && PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(this.m)) {
                if (PatchProxy.isSupport(new Object[0], this, f2981a, false, 34153, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f2981a, false, 34153, new Class[0], Void.TYPE);
                    return;
                }
                this.m = "3";
                if (getCrossPlatformParams().f40808d.p) {
                    e();
                    return;
                }
                ((GradualChangeLinearLayout) a((int) C0906R.id.bgq)).setGradualChangeMode(false);
                this.j.setVisibility(0);
                CrossPlatformTitleBar crossPlatformTitleBar = this.i;
                if (PatchProxy.isSupport(new Object[0], crossPlatformTitleBar, CrossPlatformTitleBar.f40990a, false, 34533, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], crossPlatformTitleBar, CrossPlatformTitleBar.f40990a, false, 34533, new Class[0], Void.TYPE);
                    return;
                }
                crossPlatformTitleBar.setBackgroundResource(2130838252);
                View a2 = crossPlatformTitleBar.a(C0906R.id.k9);
                Intrinsics.checkExpressionValueIsNotNull(a2, "bg_browser_title");
                a2.setVisibility(8);
                DmtTextView dmtTextView = (DmtTextView) crossPlatformTitleBar.a(C0906R.id.title);
                Intrinsics.checkExpressionValueIsNotNull(dmtTextView, PushConstants.TITLE);
                dmtTextView.setVisibility(0);
                ((AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.to)).setImageResource(2130839443);
                ((AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.tk)).setImageResource(2130839445);
                ((AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.p3)).setImageResource(2130839451);
                ((AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.cdp)).setImageResource(2130839449);
                ((AutoRTLImageView) crossPlatformTitleBar.a(C0906R.id.cep)).setImageResource(2130839447);
            }
        }
    }

    public final void a(CharSequence charSequence) {
        boolean z;
        CharSequence charSequence2 = charSequence;
        if (PatchProxy.isSupport(new Object[]{charSequence2}, this, f2981a, false, 34156, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence2}, this, f2981a, false, 34156, new Class[]{CharSequence.class}, Void.TYPE);
        } else if (this.i != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                if (PatchProxy.isSupport(new Object[]{charSequence2}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34201, new Class[]{CharSequence.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{charSequence2}, null, com.ss.android.ugc.aweme.crossplatform.base.a.f40714a, true, 34201, new Class[]{CharSequence.class}, Boolean.TYPE)).booleanValue();
                } else {
                    String charSequence3 = charSequence.toString();
                    if (charSequence3.startsWith("http") || charSequence3.startsWith("https") || charSequence3.startsWith("about:")) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    return;
                }
            }
            if (this.f2983c.f40805a.f40794b.intValue() == 1 && this.f2983c.f40808d.u) {
                this.i.setTitle(charSequence2);
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2981a, false, 34157, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2981a, false, 34157, new Class[]{String.class}, Void.TYPE);
            return;
        }
        ((h) c().a(h.class)).a(str2);
        AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) this.f2984d.a(AdWebStatBusiness.class);
        if (adWebStatBusiness != null) {
            adWebStatBusiness.a();
        }
    }

    MixActivityContainer(@NonNull Activity activity, @NonNull com.ss.android.ugc.aweme.crossplatform.params.base.a aVar) {
        this.f2982b = activity;
        this.f2983c = aVar;
    }

    public final boolean a(int i2, int i3, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f2981a, false, 34168, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f2981a, false, 34168, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        WalletBusiness walletBusiness = (WalletBusiness) this.f2984d.a(WalletBusiness.class);
        String currentUrl = c().getCurrentUrl();
        if (PatchProxy.isSupport(new Object[]{currentUrl, Integer.valueOf(i2), Integer.valueOf(i3), intent2}, walletBusiness, WalletBusiness.f40754a, false, 34282, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            WalletBusiness walletBusiness2 = walletBusiness;
            PatchProxy.accessDispatch(new Object[]{currentUrl, Integer.valueOf(i2), Integer.valueOf(i3), intent2}, walletBusiness2, WalletBusiness.f40754a, false, 34282, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
        } else if (com.ss.android.g.a.a() && currentUrl != null && currentUrl.contains("wallet/home")) {
            com.ss.android.sdk.b.a aVar = new com.ss.android.sdk.b.a();
            aVar.f30686a = i2;
            aVar.f30687b = i3;
            aVar.f30688c = intent2;
            bg.a(aVar);
        }
        return false;
    }
}

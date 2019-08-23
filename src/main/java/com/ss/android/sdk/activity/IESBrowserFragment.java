package com.ss.android.sdk.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.util.HoneyCombV11Compat;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.bytedance.ies.uikit.layout.FullscreenVideoFrame;
import com.gyf.barlibrary.ImmersionBar;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.h;
import com.ss.android.image.j;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.app.LargeImageDialog;
import com.ss.android.newmedia.app.f;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.sdk.activity.AbsBrowserFragment;
import com.ss.android.sdk.app.e;
import com.ss.android.sdk.c.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.commercialize.utils.g;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybrid.monitor.q;
import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.ss.android.ugc.aweme.utils.eb;
import java.io.File;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class IESBrowserFragment extends AbsBrowserFragment implements WeakHandler.IHandler {
    protected String A;
    public boolean B = true;
    protected boolean C;
    public BaseAppData D;
    boolean E;
    public boolean F;
    public boolean G = true;
    j H;
    LargeImageDialog I;
    h J;
    b K;
    boolean L;
    boolean M;
    List<String> N;
    List<String> O;
    String P;
    int Q;
    long R;
    String S;
    int T;
    public boolean U;
    public f V;
    final long W = 3000;
    public a X;
    public com.ss.android.sdk.c.f Y;
    public String Z;
    private boolean aA;
    private View aB;
    private com.ss.android.ugc.aweme.hybrid.monitor.f aC;
    public com.ss.android.newmedia.d aa = new com.ss.android.newmedia.d();
    public com.ss.android.sdk.c.c ab;
    public boolean ac = false;
    public boolean ad = false;
    public com.ss.android.sdk.activity.a.a ae;
    public String af;
    public long ag = -1;
    private boolean ah = true;
    private boolean ai = true;
    private com.ss.android.download.api.b.d aj;
    private boolean ak;
    private int al;
    private Resources am;
    private boolean an;
    private long ao;
    private int ap;
    private String aq;
    private String ar;
    private JSONObject as;
    private boolean at;
    private com.ss.android.sdk.c.b au;
    private String av;
    private JSONObject aw;
    private String ax;
    private boolean ay = true;
    private boolean az = true;

    /* renamed from: f  reason: collision with root package name */
    FullscreenVideoFrame f2552f;
    View g;
    WebChromeClient.CustomViewCallback h;
    public SSWebView i;
    ProgressBar j;
    View k;
    TextView l;
    DmtStatusView m;
    String n;
    String o;
    String p;
    String q;
    com.ss.android.sdk.activity.a.b r;
    boolean s;
    String t;
    public com.ss.android.download.api.b.b u;
    public com.ss.android.downloadad.api.a.a v;
    boolean w;
    Handler x;
    Runnable y;
    Context z;

    final class a {
        a() {
        }

        @JavascriptInterface
        public final void showSource(String str, String str2) {
            if (IESBrowserFragment.this.f2551e != null) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        new JSONObject(str2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    class b extends e {
        public final void onGeolocationPermissionsHidePrompt() {
            com.ss.android.sdk.c.f fVar = IESBrowserFragment.this.Y;
            if (fVar != null) {
                fVar.f();
            }
        }

        public final void onHideCustomView() {
            if (IESBrowserFragment.this.g == null) {
                IESBrowserFragment.this.h = null;
                return;
            }
            if (IESBrowserFragment.this.getActivity() != null && (IESBrowserFragment.this.getActivity() instanceof BaseActivity)) {
                ((BaseActivity) IESBrowserFragment.this.getActivity()).a();
            }
            IESBrowserFragment.this.f2552f.setVisibility(8);
            IESBrowserFragment.this.f2552f.removeView(IESBrowserFragment.this.g);
            IESBrowserFragment.this.g = null;
            IESBrowserFragment.this.h.onCustomViewHidden();
        }

        b() {
            super(IESBrowserFragment.this);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            com.ss.android.sdk.c.f fVar = IESBrowserFragment.this.Y;
            if (fVar != null) {
                fVar.a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            IESBrowserFragment iESBrowserFragment = IESBrowserFragment.this;
            iESBrowserFragment.F = true;
            if (!iESBrowserFragment.f2550d) {
                iESBrowserFragment.j.setVisibility(8);
            } else if (iESBrowserFragment.j != null) {
                iESBrowserFragment.j.setProgress(i);
                iESBrowserFragment.x.removeCallbacks(iESBrowserFragment.y);
                if (iESBrowserFragment.j.getVisibility() != 0) {
                    iESBrowserFragment.j.setVisibility(0);
                }
            }
            if (i >= 100) {
                IESBrowserFragment.this.c();
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            if (IESBrowserFragment.this.w && IESBrowserFragment.this.getActivity() != null && !StringUtils.isEmpty(str) && !IESBrowserFragment.b(str).equals(IESBrowserFragment.b(IESBrowserFragment.this.A))) {
                IESBrowserFragment.this.getActivity().setTitle(str);
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (IESBrowserFragment.this.B) {
                if (IESBrowserFragment.this.g != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                if (IESBrowserFragment.this.getActivity() != null && (IESBrowserFragment.this.getActivity() instanceof BaseActivity)) {
                    ((BaseActivity) IESBrowserFragment.this.getActivity()).b();
                }
                IESBrowserFragment.this.h = customViewCallback;
                IESBrowserFragment.this.f2552f.addView(view);
                IESBrowserFragment.this.g = view;
                IESBrowserFragment.this.f2552f.setVisibility(0);
                IESBrowserFragment.this.f2552f.requestFocus();
            }
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            Logger.debug();
            try {
                com.ss.android.sdk.c.f fVar = IESBrowserFragment.this.Y;
                if (fVar != null) {
                    fVar.d(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    class c extends com.ss.android.sdk.c.e {
        c() {
        }

        public final void onLoadResource(WebView webView, String str) {
            if (Logger.debug()) {
                com.ss.android.newmedia.e.a(str);
            }
            super.onLoadResource(webView, str);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (IESBrowserFragment.this.ab != null) {
                WebResourceResponse a2 = IESBrowserFragment.this.ab.a(str);
                if (a2 != null) {
                    return a2;
                }
            }
            WebResourceResponse a3 = i.a.a().a(IESBrowserFragment.this.A, str);
            if (a3 != null) {
                return a3;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.debug();
            IMiniAppService iMiniAppService = (IMiniAppService) ServiceManager.get().getService(IMiniAppService.class);
            if (TextUtils.equals("qr_code", IESBrowserFragment.this.af) && iMiniAppService.isAppBrandSchema(str)) {
                str = str + str + "&schema_from=" + IESBrowserFragment.this.af;
            }
            if (!TextUtils.isEmpty(str) && str.contains("__back_url__")) {
                str = str.replace("__back_url__", Uri.encode("snssdk1128://adx"));
            }
            if (str.length() > 7) {
                boolean z = false;
                if (str.substring(0, 7).equalsIgnoreCase("intent:")) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        if (TextUtils.equals(parseUri.getPackage(), "com.google.android.gms")) {
                            if (g.a((Context) IESBrowserFragment.this.getActivity())) {
                                return a(webView, str);
                            }
                            return true;
                        } else if (TextUtils.equals("android.intent.action.VIEW", parseUri.getAction())) {
                            String dataString = parseUri.getDataString();
                            if (dataString != null && dataString.startsWith("market://")) {
                                z = true;
                            }
                            if (z) {
                                return a(webView, str);
                            }
                            String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                return a(webView, stringExtra);
                            }
                            Uri data = parseUri.getData();
                            if (data != null) {
                                return a(webView, data.toString());
                            }
                        }
                    } catch (URISyntaxException unused) {
                    }
                }
            }
            return a(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            WebView webView2 = webView;
            String str2 = str;
            Logger.debug();
            CookieManager.getInstance().getCookie(str2);
            if (IESBrowserFragment.this.V != null) {
                f fVar = IESBrowserFragment.this.V;
                if (PatchProxy.isSupport(new Object[]{webView2, str2}, fVar, f.f30170a, false, 18583, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    f fVar2 = fVar;
                    PatchProxy.accessDispatch(new Object[]{webView2, str2}, fVar2, f.f30170a, false, 18583, new Class[]{WebView.class, String.class}, Void.TYPE);
                } else if (webView2 != null && !TextUtils.isEmpty(str) && !fVar.f30175f) {
                    fVar.f30174e = System.currentTimeMillis();
                    fVar.g = true;
                }
            }
            if (IESBrowserFragment.this.X != null) {
                a aVar = IESBrowserFragment.this.X;
                com.ss.android.ugc.aweme.crossplatform.business.a.a aVar2 = aVar.f30637b;
                long j = aVar.f30636a.f40800b;
                JSONObject a2 = a.a(aVar.f30636a);
                if (PatchProxy.isSupport(new Object[]{webView2, str2, new Long(j), a2}, aVar2, com.ss.android.ugc.aweme.crossplatform.business.a.a.f40759a, false, 34286, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.crossplatform.business.a.a aVar3 = aVar2;
                    PatchProxy.accessDispatch(new Object[]{webView2, str2, new Long(j), a2}, aVar3, com.ss.android.ugc.aweme.crossplatform.business.a.a.f40759a, false, 34286, new Class[]{WebView.class, String.class, Long.TYPE, JSONObject.class}, Void.TYPE);
                } else {
                    aVar2.a(webView, str, j, a2, (JSONObject) null);
                }
            }
            if (IESBrowserFragment.this.f2548b != null) {
                IESBrowserFragment.this.f2548b.b();
            }
            if (!(IESBrowserFragment.this.R <= 0 || webView2 == null || IESBrowserFragment.this.D == null)) {
                String a3 = com.ss.android.newmedia.ui.webview.a.a(IESBrowserFragment.this.Z, IESBrowserFragment.this.R);
                if (!StringUtils.isEmpty(a3)) {
                    com.ss.android.ugc.aweme.lancet.c.a(a3);
                    webView2.loadUrl(a3);
                }
            }
            super.onPageFinished(webView, str);
            if (!IESBrowserFragment.this.U) {
                IESBrowserFragment.this.m.b();
                if (com.ss.android.newmedia.e.a(str)) {
                    a(0, "", str2, true);
                }
            }
            IESBrowserFragment.this.U = false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:126:0x01fa A[Catch:{ Exception -> 0x0248 }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0150 A[Catch:{ Exception -> 0x0248 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean a(android.webkit.WebView r12, java.lang.String r13) {
            /*
                r11 = this;
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                boolean r0 = r0.ad
                r1 = 1
                if (r0 == 0) goto L_0x0008
                return r1
            L_0x0008:
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.newmedia.d r0 = r0.aa
                com.ss.android.sdk.activity.IESBrowserFragment r2 = com.ss.android.sdk.activity.IESBrowserFragment.this
                android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                boolean r0 = r0.a(r2, r13)
                if (r0 == 0) goto L_0x0019
                return r1
            L_0x0019:
                boolean r0 = com.ss.android.newmedia.e.a((java.lang.String) r13)
                r2 = 2
                r3 = 0
                if (r0 == 0) goto L_0x00ac
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.newmedia.app.f r0 = r0.V
                if (r0 == 0) goto L_0x008f
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.newmedia.app.f r0 = r0.V
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r4[r3] = r12
                r4[r1] = r13
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.newmedia.app.f.f30170a
                r7 = 0
                r8 = 18584(0x4898, float:2.6042E-41)
                java.lang.Class[] r9 = new java.lang.Class[r2]
                java.lang.Class<android.webkit.WebView> r5 = android.webkit.WebView.class
                r9[r3] = r5
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                r9[r1] = r5
                java.lang.Class r10 = java.lang.Void.TYPE
                r5 = r0
                boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
                if (r4 == 0) goto L_0x0065
                java.lang.Object[] r4 = new java.lang.Object[r2]
                r4[r3] = r12
                r4[r1] = r13
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.newmedia.app.f.f30170a
                r7 = 0
                r8 = 18584(0x4898, float:2.6042E-41)
                java.lang.Class[] r9 = new java.lang.Class[r2]
                java.lang.Class<android.webkit.WebView> r2 = android.webkit.WebView.class
                r9[r3] = r2
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                r9[r1] = r2
                java.lang.Class r10 = java.lang.Void.TYPE
                r5 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x008f
            L_0x0065:
                if (r12 == 0) goto L_0x008f
                boolean r2 = android.text.TextUtils.isEmpty(r13)
                if (r2 == 0) goto L_0x006e
                goto L_0x008f
            L_0x006e:
                java.util.List<java.lang.String> r2 = r0.k
                r2.add(r13)
                java.lang.String r2 = r12.getOriginalUrl()
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 != 0) goto L_0x008c
                java.lang.String r2 = r12.getOriginalUrl()
                boolean r2 = r2.equals(r13)
                if (r2 != 0) goto L_0x008c
                boolean r2 = r0.g
                if (r2 != 0) goto L_0x008c
                goto L_0x008d
            L_0x008c:
                r1 = 0
            L_0x008d:
                r0.f30175f = r1
            L_0x008f:
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.sdk.activity.a r0 = r0.X
                if (r0 == 0) goto L_0x00ab
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.sdk.activity.a r0 = r0.X
                com.ss.android.ugc.aweme.crossplatform.business.a.a r4 = r0.f30637b
                com.ss.android.ugc.aweme.crossplatform.params.b r1 = r0.f30636a
                long r7 = r1.f40800b
                com.ss.android.ugc.aweme.crossplatform.params.b r0 = r0.f30636a
                org.json.JSONObject r9 = com.ss.android.sdk.activity.a.a(r0)
                r10 = 0
                r5 = r12
                r6 = r13
                r4.b(r5, r6, r7, r9, r10)
            L_0x00ab:
                return r3
            L_0x00ac:
                boolean r0 = super.shouldOverrideUrlLoading(r12, r13)
                if (r0 == 0) goto L_0x00b3
                return r1
            L_0x00b3:
                android.net.Uri r0 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x0248 }
                java.lang.String r4 = r0.getScheme()     // Catch:{ Exception -> 0x0248 }
                java.lang.String r4 = r4.toLowerCase()     // Catch:{ Exception -> 0x0248 }
                boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0248 }
                if (r5 == 0) goto L_0x00c6
                return r3
            L_0x00c6:
                java.lang.String r5 = "about"
                boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r5 == 0) goto L_0x00cf
                return r3
            L_0x00cf:
                com.ss.android.sdk.activity.IESBrowserFragment r5 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.newmedia.ui.webview.SSWebView r5 = r5.i     // Catch:{ Exception -> 0x0248 }
                boolean r5 = r5.a()     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.IESBrowserFragment r6 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r6 = r6.ae     // Catch:{ Exception -> 0x0248 }
                r7 = 0
                if (r6 != 0) goto L_0x00e0
                r6 = r7
                goto L_0x00e8
            L_0x00e0:
                com.ss.android.sdk.activity.IESBrowserFragment r6 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r6 = r6.ae     // Catch:{ Exception -> 0x0248 }
                java.util.List r6 = r6.getClickJumpAllowList()     // Catch:{ Exception -> 0x0248 }
            L_0x00e8:
                boolean r6 = com.ss.android.newmedia.q.a((java.lang.String) r13, (java.lang.String) r4, (java.util.List<java.lang.String>) r6)     // Catch:{ Exception -> 0x0248 }
                if (r6 != 0) goto L_0x0107
                com.ss.android.sdk.activity.IESBrowserFragment r6 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r6 = r6.ae     // Catch:{ Exception -> 0x0248 }
                if (r6 != 0) goto L_0x00f6
                r6 = r7
                goto L_0x00fe
            L_0x00f6:
                com.ss.android.sdk.activity.IESBrowserFragment r6 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r6 = r6.ae     // Catch:{ Exception -> 0x0248 }
                java.util.List r6 = r6.getAutoJumpAllowList()     // Catch:{ Exception -> 0x0248 }
            L_0x00fe:
                boolean r6 = com.ss.android.newmedia.q.a((java.lang.String) r13, (java.lang.String) r4, (java.util.List<java.lang.String>) r6)     // Catch:{ Exception -> 0x0248 }
                if (r6 == 0) goto L_0x0105
                goto L_0x0107
            L_0x0105:
                r6 = 0
                goto L_0x0108
            L_0x0107:
                r6 = 1
            L_0x0108:
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.newmedia.BaseAppData r8 = r8.D     // Catch:{ Exception -> 0x0248 }
                boolean r8 = r8.a((java.lang.String) r13)     // Catch:{ Exception -> 0x0248 }
                if (r8 != 0) goto L_0x0147
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r8 = r8.ae     // Catch:{ Exception -> 0x0248 }
                if (r8 == 0) goto L_0x012e
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                boolean r8 = r8.ac     // Catch:{ Exception -> 0x0248 }
                if (r8 == 0) goto L_0x012e
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                boolean r8 = r8.L     // Catch:{ Exception -> 0x0248 }
                if (r8 == 0) goto L_0x012e
                if (r6 != 0) goto L_0x012e
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.newmedia.ui.webview.SSWebView r8 = r8.i     // Catch:{ Exception -> 0x0248 }
                if (r8 == 0) goto L_0x012e
                if (r5 == 0) goto L_0x0147
            L_0x012e:
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.sdk.activity.a.a r8 = r8.ae     // Catch:{ Exception -> 0x0248 }
                if (r8 != 0) goto L_0x0145
                com.ss.android.sdk.activity.IESBrowserFragment r8 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                boolean r8 = r8.ac     // Catch:{ Exception -> 0x0248 }
                if (r8 == 0) goto L_0x0145
                if (r6 != 0) goto L_0x0145
                com.ss.android.sdk.activity.IESBrowserFragment r6 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.newmedia.ui.webview.SSWebView r6 = r6.i     // Catch:{ Exception -> 0x0248 }
                if (r6 == 0) goto L_0x0145
                if (r5 != 0) goto L_0x0145
                goto L_0x0147
            L_0x0145:
                r6 = 0
                goto L_0x0148
            L_0x0147:
                r6 = 1
            L_0x0148:
                java.lang.String r8 = "http"
                boolean r8 = r8.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r8 != 0) goto L_0x01f8
                java.lang.String r8 = "https"
                boolean r8 = r8.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r8 != 0) goto L_0x01f8
                if (r6 == 0) goto L_0x015e
                com.ss.android.ugc.aweme.crossplatform.platform.a.a(r13, r5)     // Catch:{ Exception -> 0x0248 }
                return r1
            L_0x015e:
                com.ss.android.sdk.activity.IESBrowserFragment r2 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                com.ss.android.newmedia.ui.webview.SSWebView r2 = r2.i     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x0178
                com.ss.android.sdk.activity.IESBrowserFragment r2 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                boolean r2 = r2.M     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x0178
                if (r5 != 0) goto L_0x0178
                java.lang.String r2 = ".apk"
                boolean r2 = r13.endsWith(r2)     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x0178
                com.ss.android.ugc.aweme.crossplatform.platform.a.b(r13, r5)     // Catch:{ Exception -> 0x0248 }
                return r1
            L_0x0178:
                com.ss.android.ugc.aweme.crossplatform.platform.a.c(r13, r5)     // Catch:{ Exception -> 0x0248 }
                java.lang.String r2 = "sslocal"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r2 != 0) goto L_0x018b
                java.lang.String r2 = "localsdk"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x018f
            L_0x018b:
                java.lang.String r13 = com.ss.android.newmedia.a.b.a(r13)     // Catch:{ Exception -> 0x0248 }
            L_0x018f:
                java.lang.String r2 = "market"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r2 != 0) goto L_0x01c7
                java.lang.String r2 = "intent"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x01a0
                goto L_0x01c7
            L_0x01a0:
                com.ss.android.sdk.activity.IESBrowserFragment r12 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                android.support.v4.app.FragmentActivity r12 = r12.getActivity()     // Catch:{ Exception -> 0x0248 }
                android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0248 }
                java.lang.String r2 = "android.intent.action.VIEW"
                android.net.Uri r4 = android.net.Uri.parse(r13)     // Catch:{ Exception -> 0x0248 }
                r0.<init>(r2, r4)     // Catch:{ Exception -> 0x0248 }
                boolean r12 = com.ss.android.common.util.ToolUtils.isInstalledApp((android.content.Context) r12, (android.content.Intent) r0)     // Catch:{ Exception -> 0x0248 }
                if (r12 == 0) goto L_0x01bd
                com.ss.android.ugc.aweme.commercialize.utils.y.b()     // Catch:{ Exception -> 0x0248 }
                com.ss.android.ugc.aweme.commercialize.utils.y.a()     // Catch:{ Exception -> 0x0248 }
            L_0x01bd:
                com.ss.android.sdk.activity.IESBrowserFragment r12 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x01c6 }
                android.support.v4.app.FragmentActivity r12 = r12.getActivity()     // Catch:{ Exception -> 0x01c6 }
                com.ss.android.newmedia.e.b(r12, r13)     // Catch:{ Exception -> 0x01c6 }
            L_0x01c6:
                return r1
            L_0x01c7:
                java.lang.String r2 = "market"
                boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r2 == 0) goto L_0x01da
                android.content.Intent r7 = new android.content.Intent     // Catch:{ Exception -> 0x0248 }
                java.lang.String r13 = "android.intent.action.VIEW"
                r7.<init>(r13)     // Catch:{ Exception -> 0x0248 }
                r7.setData(r0)     // Catch:{ Exception -> 0x0248 }
                goto L_0x01e9
            L_0x01da:
                java.lang.String r0 = "intent"
                boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x0248 }
                if (r0 == 0) goto L_0x01e9
                android.content.Intent r13 = android.content.Intent.parseUri(r13, r1)     // Catch:{ URISyntaxException -> 0x01e8 }
                r7 = r13
                goto L_0x01e9
            L_0x01e8:
            L_0x01e9:
                if (r7 == 0) goto L_0x01f7
                r13 = 268435456(0x10000000, float:2.5243549E-29)
                r7.addFlags(r13)     // Catch:{ Exception -> 0x0248 }
                android.content.Context r12 = r12.getContext()     // Catch:{ Exception -> 0x0248 }
                r12.startActivity(r7)     // Catch:{ Exception -> 0x0248 }
            L_0x01f7:
                return r1
            L_0x01f8:
                if (r6 != 0) goto L_0x0248
                com.ss.android.sdk.activity.IESBrowserFragment r12 = com.ss.android.sdk.activity.IESBrowserFragment.this     // Catch:{ Exception -> 0x0248 }
                android.content.Context r12 = r12.getContext()     // Catch:{ Exception -> 0x0248 }
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0248 }
                r4[r3] = r12     // Catch:{ Exception -> 0x0248 }
                r4[r1] = r0     // Catch:{ Exception -> 0x0248 }
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.utils.g.f39783a     // Catch:{ Exception -> 0x0248 }
                r7 = 1
                r8 = 32330(0x7e4a, float:4.5304E-41)
                java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0248 }
                java.lang.Class<android.content.Context> r13 = android.content.Context.class
                r9[r3] = r13     // Catch:{ Exception -> 0x0248 }
                java.lang.Class<android.net.Uri> r13 = android.net.Uri.class
                r9[r1] = r13     // Catch:{ Exception -> 0x0248 }
                java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0248 }
                boolean r13 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0248 }
                if (r13 == 0) goto L_0x0241
                java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0248 }
                r4[r3] = r12     // Catch:{ Exception -> 0x0248 }
                r4[r1] = r0     // Catch:{ Exception -> 0x0248 }
                r5 = 0
                com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.commercialize.utils.g.f39783a     // Catch:{ Exception -> 0x0248 }
                r7 = 1
                r8 = 32330(0x7e4a, float:4.5304E-41)
                java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0248 }
                java.lang.Class<android.content.Context> r12 = android.content.Context.class
                r9[r3] = r12     // Catch:{ Exception -> 0x0248 }
                java.lang.Class<android.net.Uri> r12 = android.net.Uri.class
                r9[r1] = r12     // Catch:{ Exception -> 0x0248 }
                java.lang.Class r10 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x0248 }
                java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0248 }
                java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ Exception -> 0x0248 }
                boolean r12 = r12.booleanValue()     // Catch:{ Exception -> 0x0248 }
                goto L_0x0245
            L_0x0241:
                boolean r12 = com.ss.android.ugc.aweme.commercialize.utils.a.b.b(r12, r0)     // Catch:{ Exception -> 0x0248 }
            L_0x0245:
                if (r12 == 0) goto L_0x0248
                return r1
            L_0x0248:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.activity.IESBrowserFragment.c.a(android.webkit.WebView, java.lang.String):boolean");
        }

        private static void a(JSONObject jSONObject, String str, Object obj) {
            if (!StringUtils.isEmpty(str) && obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (Exception unused) {
                }
            }
        }

        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (IESBrowserFragment.this.f2548b != null) {
                if (IESBrowserFragment.this.f2548b instanceof AbsBrowserFragment.b) {
                    ((AbsBrowserFragment.b) IESBrowserFragment.this.f2548b).a(webResourceRequest, webResourceResponse);
                } else {
                    IESBrowserFragment.this.f2548b.a(webResourceResponse);
                }
            }
            if (IESBrowserFragment.this.X != null && Build.VERSION.SDK_INT >= 21) {
                IESBrowserFragment.this.X.a(webView, webResourceRequest.getUrl().toString());
            }
            f.a(webResourceRequest, webResourceResponse);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
            if (r0.f30171b != false) goto L_0x00a2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void doUpdateVisitedHistory(android.webkit.WebView r13, java.lang.String r14, boolean r15) {
            /*
                r12 = this;
                com.bytedance.common.utility.Logger.debug()
                super.doUpdateVisitedHistory(r13, r14, r15)
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                r1 = 1
                r0.E = r1
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                long r2 = r0.R
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x00a2
                com.ss.android.sdk.activity.IESBrowserFragment r0 = com.ss.android.sdk.activity.IESBrowserFragment.this
                com.ss.android.newmedia.app.f r0 = r0.V
                r9 = 3
                java.lang.Object[] r2 = new java.lang.Object[r9]
                r10 = 0
                r2[r10] = r13
                r2[r1] = r14
                java.lang.Byte r3 = java.lang.Byte.valueOf(r15)
                r11 = 2
                r2[r11] = r3
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.app.f.f30170a
                r5 = 0
                r6 = 18590(0x489e, float:2.605E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
                r7[r10] = r3
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r1] = r3
                java.lang.Class r3 = java.lang.Boolean.TYPE
                r7[r11] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r0
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x006a
                java.lang.Object[] r2 = new java.lang.Object[r9]
                r2[r10] = r13
                r2[r1] = r14
                java.lang.Byte r13 = java.lang.Byte.valueOf(r15)
                r2[r11] = r13
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.app.f.f30170a
                r5 = 0
                r6 = 18590(0x489e, float:2.605E-41)
                java.lang.Class[] r7 = new java.lang.Class[r9]
                java.lang.Class<android.webkit.WebView> r13 = android.webkit.WebView.class
                r7[r10] = r13
                java.lang.Class<java.lang.String> r13 = java.lang.String.class
                r7[r1] = r13
                java.lang.Class r13 = java.lang.Boolean.TYPE
                r7[r11] = r13
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x006a:
                boolean r15 = com.bytedance.common.utility.StringUtils.isEmpty(r14)
                if (r15 != 0) goto L_0x00a2
                java.lang.String r13 = r13.getUrl()
                boolean r13 = r14.equals(r13)
                if (r13 == 0) goto L_0x00a2
                java.lang.String r13 = "about:blank"
                boolean r13 = r14.equals(r13)
                if (r13 != 0) goto L_0x00a2
                java.lang.String r13 = "file://"
                boolean r13 = r14.startsWith(r13)
                if (r13 == 0) goto L_0x0091
                boolean r13 = r0.f30171b
                if (r13 != 0) goto L_0x0091
                r0.f30171b = r1
                goto L_0x009d
            L_0x0091:
                java.lang.String r13 = "file://"
                boolean r13 = r14.startsWith(r13)
                if (r13 == 0) goto L_0x009d
                boolean r13 = r0.f30171b
                if (r13 != 0) goto L_0x00a2
            L_0x009d:
                int r13 = r0.f30172c
                int r13 = r13 + r1
                r0.f30172c = r13
            L_0x00a2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.activity.IESBrowserFragment.c.doUpdateVisitedHistory(android.webkit.WebView, java.lang.String, boolean):void");
        }

        @TargetApi(21)
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (!webResourceRequest.isForMainFrame()) {
                if (webResourceRequest.getUrl().getPath() == null || !webResourceRequest.getUrl().getPath().endsWith("favicon.ico")) {
                    f.a(webResourceRequest, webResourceError);
                } else {
                    return;
                }
            }
            if (IESBrowserFragment.this.f2548b != null) {
                if (IESBrowserFragment.this.f2548b instanceof AbsBrowserFragment.b) {
                    ((AbsBrowserFragment.b) IESBrowserFragment.this.f2548b).a(webResourceRequest, webResourceError);
                } else if (Build.VERSION.SDK_INT >= 23) {
                    IESBrowserFragment.this.f2548b.a(webResourceError.getErrorCode());
                }
            }
            if (IESBrowserFragment.this.X != null) {
                a aVar = IESBrowserFragment.this.X;
                if (webView != null && webResourceRequest != null && Build.VERSION.SDK_INT >= 23 && webResourceRequest.isForMainFrame()) {
                    aVar.a(webView, webResourceRequest.getUrl().toString());
                }
            }
            String uri = webResourceRequest.getUrl().toString();
            if (!com.ss.android.g.a.a()) {
                Logger.debug();
                if (!TextUtils.isEmpty(uri) && uri.contains("m.mwee.cn")) {
                    boolean contains = uri.contains("dyBook");
                    boolean contains2 = uri.contains("dyQueue");
                    com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a().a("service", "poi_service").a("provider_name", "meiwei");
                    if (contains) {
                        str = "reserve";
                    } else if (contains2) {
                        str = "queue";
                    } else {
                        str = "";
                    }
                    n.a("service_monitor", a2.a("page_type", str).b());
                }
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            String str2;
            WebView webView2 = webView;
            String str3 = str;
            super.onPageStarted(webView, str, bitmap);
            IESBrowserFragment iESBrowserFragment = IESBrowserFragment.this;
            if (iESBrowserFragment.G && iESBrowserFragment.m != null) {
                iESBrowserFragment.m.d();
            }
            Logger.debug();
            if (IESBrowserFragment.this.f2548b != null) {
                IESBrowserFragment.this.f2548b.a();
            }
            if (IESBrowserFragment.this.V != null) {
                f fVar = IESBrowserFragment.this.V;
                String str4 = IESBrowserFragment.this.A;
                boolean z = false;
                if (PatchProxy.isSupport(new Object[]{webView2, str3, (byte) 1, str4}, fVar, f.f30170a, false, 18582, new Class[]{WebView.class, String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
                    f fVar2 = fVar;
                    PatchProxy.accessDispatch(new Object[]{webView2, str3, (byte) 1, str4}, fVar2, f.f30170a, false, 18582, new Class[]{WebView.class, String.class, Boolean.TYPE, String.class}, Void.TYPE);
                } else if (webView2 != null && !TextUtils.isEmpty(str)) {
                    if (PatchProxy.isSupport(new Object[]{str4, str3}, null, com.ss.android.newmedia.e.f2507a, true, 18281, new Class[]{String.class, String.class}, Boolean.TYPE)) {
                        Object[] objArr = {str4, str3};
                        z = ((Boolean) PatchProxy.accessDispatch(objArr, null, com.ss.android.newmedia.e.f2507a, true, 18281, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
                    } else if (!(str4 == null || str3 == null)) {
                        if (str4.equals(str3)) {
                            z = true;
                        } else {
                            int indexOf = str4.indexOf(35);
                            if (indexOf > 0) {
                                str4 = str4.substring(0, indexOf);
                            }
                            int indexOf2 = str3.indexOf(35);
                            if (indexOf2 > 0) {
                                str2 = str3.substring(0, indexOf2);
                            } else {
                                str2 = str3;
                            }
                            z = str4.equals(str2);
                        }
                    }
                    if (z && fVar.f30173d == 0) {
                        fVar.f30173d = System.currentTimeMillis();
                    }
                }
            }
            if (IESBrowserFragment.this.X != null) {
                IESBrowserFragment.this.X.f30637b.a(webView2, str3, null);
            }
            IESBrowserFragment.this.m.setVisibility(4);
            if (IESBrowserFragment.this.m.i() || IESBrowserFragment.this.G) {
                IESBrowserFragment.this.m.d();
            }
        }

        private void a(int i, String str, String str2, boolean z) {
            JSONObject jSONObject = new JSONObject();
            a(jSONObject, "errorCode", Integer.valueOf(i));
            if (!TextUtils.isEmpty(str)) {
                a(jSONObject, "errorDesc", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                Uri parse = Uri.parse(str2);
                a(jSONObject, PushConstants.WEB_URL, str2);
                a(jSONObject, "host", parse.getHost());
                a(jSONObject, "path", parse.getPath());
            }
            if (IESBrowserFragment.this.R > 0) {
                a(jSONObject, "creativeId", Long.valueOf(IESBrowserFragment.this.R));
                if (!z) {
                    com.ss.android.ugc.aweme.base.n.a("aweme_ad_landingpage_open_error", 1, jSONObject);
                } else if (IESBrowserFragment.this.ag > 0) {
                    a(jSONObject, "duration", Long.valueOf(SystemClock.elapsedRealtime() - IESBrowserFragment.this.ag));
                }
                com.ss.android.ugc.aweme.base.n.a("aweme_ad_landingpage_open_error_rate", z ^ true ? 1 : 0, jSONObject);
            }
            f.a(jSONObject, z);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            IESBrowserFragment.this.U = true;
            IESBrowserFragment.this.c();
            if (IESBrowserFragment.this.f2548b != null) {
                if (IESBrowserFragment.this.f2548b instanceof AbsBrowserFragment.b) {
                    ((AbsBrowserFragment.b) IESBrowserFragment.this.f2548b).a(i, str, str2);
                } else {
                    IESBrowserFragment.this.f2548b.a(i);
                }
            }
            if (IESBrowserFragment.this.V != null) {
                f fVar = IESBrowserFragment.this.V;
                fVar.h = true;
                fVar.i = i;
            }
            if (IESBrowserFragment.this.X != null) {
                IESBrowserFragment.this.X.a(webView, str2);
            }
            if (com.ss.android.newmedia.e.a(str2)) {
                a(i, str, str2, false);
            }
            IESBrowserFragment.this.m.f();
        }
    }

    class d implements com.ss.android.download.api.b.d {

        /* renamed from: b  reason: collision with root package name */
        private int f30630b;

        public final void a() {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getResources().getString(C0906R.string.a53));
                IESBrowserFragment.this.l.setBackgroundResource(2130838570);
            }
        }

        private d() {
        }

        private boolean a(int i) {
            if (i - this.f30630b < 20 && (this.f30630b != 0 || i < 3)) {
                return false;
            }
            this.f30630b = i;
            return true;
        }

        public final void b(com.ss.android.download.api.c.e eVar) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getResources().getString(C0906R.string.a55));
                IESBrowserFragment.this.l.setBackgroundResource(2130838570);
            }
            if (!TextUtils.isEmpty(IESBrowserFragment.this.t) && IESBrowserFragment.this.Y != null) {
                IESBrowserFragment.this.Y.b(IESBrowserFragment.this.t);
            }
        }

        public final void c(com.ss.android.download.api.c.e eVar) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getResources().getString(C0906R.string.a54));
                IESBrowserFragment.this.l.setBackgroundResource(2130838570);
                IESBrowserFragment.this.l.setTextColor(IESBrowserFragment.this.getResources().getColor(C0906R.color.jl));
            }
            if (!TextUtils.isEmpty(IESBrowserFragment.this.t) && IESBrowserFragment.this.Y != null) {
                IESBrowserFragment.this.Y.b(IESBrowserFragment.this.t);
            }
        }

        public final void a(com.ss.android.download.api.c.e eVar) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getResources().getString(C0906R.string.a57));
                IESBrowserFragment.this.l.setBackgroundResource(2130838569);
            }
        }

        /* synthetic */ d(IESBrowserFragment iESBrowserFragment, byte b2) {
            this();
        }

        public final void a(@NonNull com.ss.android.download.api.b.c cVar, @Nullable com.ss.android.download.api.b.a aVar) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
            }
            if (!TextUtils.isEmpty(IESBrowserFragment.this.t) && IESBrowserFragment.this.Y != null) {
                IESBrowserFragment.this.Y.a(IESBrowserFragment.this.t);
            }
        }

        public final void b(com.ss.android.download.api.c.e eVar, int i) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getResources().getString(C0906R.string.a5a));
                IESBrowserFragment.this.l.setBackgroundResource(2130838570);
            }
            if (!TextUtils.isEmpty(IESBrowserFragment.this.t) && IESBrowserFragment.this.Y != null && a(i)) {
                IESBrowserFragment.this.Y.a(IESBrowserFragment.this.t, i);
            }
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i) {
            if (IESBrowserFragment.this.isAdded()) {
                IESBrowserFragment.this.a(0);
                IESBrowserFragment.this.l.setBackgroundResource(2130838570);
                IESBrowserFragment.this.l.setText(IESBrowserFragment.this.getString(C0906R.string.a7x, Integer.valueOf(i)));
            }
            if (!TextUtils.isEmpty(IESBrowserFragment.this.t) && IESBrowserFragment.this.Y != null && a(i)) {
                IESBrowserFragment.this.Y.a(IESBrowserFragment.this.t, i);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        return C0906R.layout.gt;
    }

    public final com.ss.android.downloadlib.h d() {
        return com.ss.android.downloadlib.h.a(this.z);
    }

    @NonNull
    private com.ss.android.download.api.b.d f() {
        if (this.aj == null) {
            this.aj = new d(this, (byte) 0);
        }
        return this.aj;
    }

    public final com.ss.android.downloadad.api.b e() {
        return d().b();
    }

    public void onStop() {
        super.onStop();
        if (this.H != null) {
            this.H.b();
        }
    }

    public final void c() {
        this.x.removeCallbacks(this.y);
        this.x.postDelayed(this.y, 500);
    }

    public WebView b() {
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(com.ss.android.ugc.aweme.framework.core.a.b().f3306d);
        }
        return this.i;
    }

    public void onResume() {
        if (this.i != null) {
            this.i.getSettings().setBlockNetworkLoads(false);
            if (this.x != null) {
                this.x.removeMessages(10011);
            }
        }
        this.ao = System.currentTimeMillis();
        super.onResume();
        HoneyCombV11Compat.resumeWebView(this.i);
        if (this.H != null) {
            this.H.a();
        }
        if (f2547a) {
            this.i.setBackgroundColor(-1);
            f2547a = false;
        } else if (this.al == 0 && this.C) {
            this.i.setBackgroundColor(this.am.getColor(C0906R.color.dq));
        }
        if (this.Y != null) {
            this.Y.g();
        }
        if (this.R > 0) {
            if (this.s && this.r != null) {
                com.ss.android.downloadlib.h.a(this.z).a((Activity) getActivity(), this.k.hashCode(), f(), (com.ss.android.download.api.b.c) com.ss.android.sdk.activity.a.b.a(this.r));
            }
            if (e().b(this.R)) {
                e().a(this.R, this.q, f(), this.k.hashCode());
            }
        }
        if (this.X != null) {
            this.X.a();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.H != null) {
            this.H.c();
            this.H = null;
        }
        if (this.J != null) {
            this.J.a();
            this.J = null;
        }
        this.I = null;
        if (this.at && this.V != null) {
            f fVar = this.V;
            FragmentActivity activity = getActivity();
            long j2 = this.R;
            if (PatchProxy.isSupport(new Object[]{activity, new Long(j2)}, fVar, f.f30170a, false, 18591, new Class[]{Context.class, Long.TYPE}, Void.TYPE)) {
                f fVar2 = fVar;
                PatchProxy.accessDispatch(new Object[]{activity, new Long(j2)}, fVar2, f.f30170a, false, 18591, new Class[]{Context.class, Long.TYPE}, Void.TYPE);
            } else {
                if (j2 > 0 && fVar.f30172c > 1) {
                    long j3 = (long) (fVar.f30172c - 1);
                    Object[] objArr = {activity, "wap_stat", "jump_count", null, new Long(j3), new Long(j2)};
                    if (PatchProxy.isSupport(objArr, null, com.ss.android.common.lib.a.f28314a, true, 15813, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                        Object[] objArr2 = {activity, "wap_stat", "jump_count", null, new Long(j3), new Long(j2)};
                        Object[] objArr3 = objArr2;
                        PatchProxy.accessDispatch(objArr3, null, com.ss.android.common.lib.a.f28314a, true, 15813, new Class[]{Context.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE}, Void.TYPE);
                    } else {
                        com.ss.android.common.lib.a.a(activity, "wap_stat", "jump_count", null, j3, j2, null);
                    }
                }
                fVar.f30172c = 0;
            }
        }
        if (this.V != null) {
            this.V.a(getActivity(), this.R, this.q);
        }
        if (this.Y != null) {
            this.Y.d();
            this.Y.h();
        }
        com.ss.android.newmedia.app.g.a(this.i);
        if (this.aC != null && this.aC.f49969c && !TextUtils.isEmpty(this.aC.f49968b)) {
            com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a(this.aC.f49968b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x021d, code lost:
        if (r6 >= r8) goto L_0x022b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022f A[Catch:{ Exception -> 0x0262 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0233 A[Catch:{ Exception -> 0x0262 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r44 = this;
            r0 = r44
            super.onPause()
            android.support.v4.app.FragmentActivity r10 = r44.getActivity()
            boolean r1 = r0.at
            r11 = 0
            r12 = 0
            if (r1 == 0) goto L_0x0263
            com.ss.android.newmedia.app.f r1 = r0.V
            if (r1 == 0) goto L_0x0263
            if (r10 == 0) goto L_0x0263
            r1 = 0
            java.lang.String r2 = r0.ar
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0028
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0028 }
            java.lang.String r3 = r0.ar     // Catch:{ Exception -> 0x0028 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0028 }
            r14 = r2
            goto L_0x0029
        L_0x0028:
            r14 = r1
        L_0x0029:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.ao
            long r5 = r1 - r3
            r15 = 3000(0xbb8, double:1.482E-320)
            r17 = 3
            r9 = 5
            r18 = 4
            r19 = 2
            r20 = 1
            int r1 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x00cf
            com.ss.android.newmedia.app.f r1 = r0.V
            long r7 = r0.R
            java.lang.String r4 = r0.aq
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r11] = r10
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r5)
            r2[r20] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r7)
            r2[r19] = r3
            r2[r17] = r4
            r2[r18] = r14
            com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.newmedia.app.f.f30170a
            r24 = 0
            r25 = 18589(0x489d, float:2.6049E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r21 = android.content.Context.class
            r3[r11] = r21
            java.lang.Class r21 = java.lang.Long.TYPE
            r3[r20] = r21
            java.lang.Class r21 = java.lang.Long.TYPE
            r3[r19] = r21
            java.lang.Class<java.lang.String> r21 = java.lang.String.class
            r3[r17] = r21
            java.lang.Class<org.json.JSONObject> r21 = org.json.JSONObject.class
            r3[r18] = r21
            java.lang.Class r27 = java.lang.Void.TYPE
            r21 = r2
            r22 = r1
            r26 = r3
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r21, r22, r23, r24, r25, r26, r27)
            if (r2 == 0) goto L_0x00c4
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r11] = r10
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r5)
            r2[r20] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r7)
            r2[r19] = r3
            r2[r17] = r4
            r2[r18] = r14
            com.meituan.robust.ChangeQuickRedirect r23 = com.ss.android.newmedia.app.f.f30170a
            r24 = 0
            r25 = 18589(0x489d, float:2.6049E-41)
            java.lang.Class[] r3 = new java.lang.Class[r9]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r3[r11] = r4
            java.lang.Class r4 = java.lang.Long.TYPE
            r3[r20] = r4
            java.lang.Class r4 = java.lang.Long.TYPE
            r3[r19] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r17] = r4
            java.lang.Class<org.json.JSONObject> r4 = org.json.JSONObject.class
            r3[r18] = r4
            java.lang.Class r27 = java.lang.Void.TYPE
            r21 = r2
            r22 = r1
            r26 = r3
            com.meituan.robust.PatchProxy.accessDispatch(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x00cf
        L_0x00c4:
            java.lang.String r2 = "wap_stat"
            java.lang.String r3 = "stay_page"
            r1 = r10
            r15 = 5
            r9 = r14
            com.ss.android.common.lib.a.a(r1, r2, r3, r4, r5, r7, r9)
            goto L_0x00d0
        L_0x00cf:
            r15 = 5
        L_0x00d0:
            boolean r1 = r10.isFinishing()
            if (r1 == 0) goto L_0x0263
            com.ss.android.newmedia.app.f r1 = r0.V
            com.ss.android.newmedia.ui.webview.SSWebView r9 = r0.i
            com.ss.android.sdk.b r8 = new com.ss.android.sdk.b
            r8.<init>(r12)
            long r6 = r0.R
            java.lang.String r5 = r0.aq
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r11] = r9
            r2[r20] = r8
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r6)
            r2[r19] = r3
            r2[r17] = r5
            r2[r18] = r14
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.app.f.f30170a
            r16 = 0
            r21 = 18587(0x489b, float:2.6046E-41)
            java.lang.Class[] r3 = new java.lang.Class[r15]
            java.lang.Class<android.webkit.WebView> r22 = android.webkit.WebView.class
            r3[r11] = r22
            java.lang.Class<com.ss.android.sdk.b> r22 = com.ss.android.sdk.b.class
            r3[r20] = r22
            java.lang.Class r22 = java.lang.Long.TYPE
            r3[r19] = r22
            java.lang.Class<java.lang.String> r22 = java.lang.String.class
            r3[r17] = r22
            java.lang.Class<org.json.JSONObject> r22 = org.json.JSONObject.class
            r3[r18] = r22
            java.lang.Class r22 = java.lang.Void.TYPE
            r23 = r3
            r3 = r1
            r24 = r5
            r5 = r16
            r12 = r6
            r6 = r21
            r7 = r23
            r41 = r8
            r8 = r22
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x015e
            java.lang.Object[] r2 = new java.lang.Object[r15]
            r2[r11] = r9
            r3 = r41
            r2[r20] = r3
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r12)
            r2[r19] = r3
            r2[r17] = r24
            r2[r18] = r14
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.newmedia.app.f.f30170a
            r5 = 0
            r6 = 18587(0x489b, float:2.6046E-41)
            java.lang.Class[] r7 = new java.lang.Class[r15]
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            r7[r11] = r3
            java.lang.Class<com.ss.android.sdk.b> r3 = com.ss.android.sdk.b.class
            r7[r20] = r3
            java.lang.Class r3 = java.lang.Long.TYPE
            r7[r19] = r3
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r7[r17] = r3
            java.lang.Class<org.json.JSONObject> r3 = org.json.JSONObject.class
            r7[r18] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0263
        L_0x015e:
            r3 = r41
            if (r9 == 0) goto L_0x0263
            long r4 = r1.f30173d
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x016c
            goto L_0x0263
        L_0x016c:
            boolean r2 = r1.f30175f
            if (r2 != 0) goto L_0x017c
            boolean r2 = r1.g
            if (r2 == 0) goto L_0x017c
            boolean r2 = r1.h
            if (r2 == 0) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            java.lang.String r2 = "load_finish"
            goto L_0x017e
        L_0x017c:
            java.lang.String r2 = "load"
        L_0x017e:
            android.content.Context r30 = r9.getContext()     // Catch:{ Exception -> 0x0262 }
            com.ss.android.common.util.NetworkUtils$h r4 = com.ss.android.common.util.NetworkUtils.getNetworkType(r30)     // Catch:{ Exception -> 0x0262 }
            com.ss.android.common.util.NetworkUtils$h r5 = com.ss.android.common.util.NetworkUtils.h.NONE     // Catch:{ Exception -> 0x0262 }
            if (r4 != r5) goto L_0x018c
            goto L_0x0263
        L_0x018c:
            com.ss.android.newmedia.BaseAppData r5 = com.ss.android.newmedia.BaseAppData.a()     // Catch:{ Exception -> 0x0262 }
            if (r14 != 0) goto L_0x0197
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0262 }
            r14.<init>()     // Catch:{ Exception -> 0x0262 }
        L_0x0197:
            java.lang.String r6 = "ac"
            java.lang.String r7 = com.ss.android.common.util.NetworkUtils.getNetworkAccessType((com.ss.android.common.util.NetworkUtils.h) r4)     // Catch:{ Exception -> 0x0262 }
            r14.put(r6, r7)     // Catch:{ Exception -> 0x0262 }
            boolean r6 = r1.h     // Catch:{ Exception -> 0x0262 }
            if (r6 == 0) goto L_0x01cd
            java.lang.String r2 = "load_fail"
            int r1 = r1.i     // Catch:{ Exception -> 0x0262 }
            r4 = -2
            if (r1 == r4) goto L_0x01be
            switch(r1) {
                case -9: goto L_0x01b9;
                case -8: goto L_0x01b7;
                case -7: goto L_0x01b5;
                case -6: goto L_0x01b0;
                default: goto L_0x01ae;
            }     // Catch:{ Exception -> 0x0262 }
        L_0x01ae:
            r1 = 1
            goto L_0x01c2
        L_0x01b0:
            r18 = 8
            r1 = 8
            goto L_0x01c2
        L_0x01b5:
            r1 = 4
            goto L_0x01c2
        L_0x01b7:
            r1 = 2
            goto L_0x01c2
        L_0x01b9:
            r18 = 21
            r1 = 21
            goto L_0x01c2
        L_0x01be:
            r18 = 11
            r1 = 11
        L_0x01c2:
            java.lang.String r4 = "error"
            r14.put(r4, r1)     // Catch:{ Exception -> 0x0262 }
            r32 = r2
            r42 = r12
            goto L_0x0241
        L_0x01cd:
            long r6 = r1.f30174e     // Catch:{ Exception -> 0x0262 }
            r8 = 0
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x01d6
            goto L_0x01d8
        L_0x01d6:
            java.lang.String r2 = "load"
        L_0x01d8:
            long r6 = r1.f30174e     // Catch:{ Exception -> 0x0262 }
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x01e5
            long r6 = r1.f30174e     // Catch:{ Exception -> 0x0262 }
            long r8 = r1.f30173d     // Catch:{ Exception -> 0x0262 }
            r1 = 0
        L_0x01e3:
            long r6 = r6 - r8
            goto L_0x01ed
        L_0x01e5:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0262 }
            long r8 = r1.f30173d     // Catch:{ Exception -> 0x0262 }
            r1 = 0
            goto L_0x01e3
        L_0x01ed:
            long r8 = r5.L     // Catch:{ Exception -> 0x0262 }
            r42 = r12
            long r11 = r5.M     // Catch:{ Exception -> 0x0262 }
            r15 = 1
            r39 = 0
            int r1 = (r42 > r39 ? 1 : (r42 == r39 ? 0 : -1))
            if (r1 <= 0) goto L_0x01fe
            r28 = r15
            goto L_0x0200
        L_0x01fe:
            r28 = 3000(0xbb8, double:1.482E-320)
        L_0x0200:
            int r1 = (r42 > r39 ? 1 : (r42 == r39 ? 0 : -1))
            if (r1 <= 0) goto L_0x0205
            goto L_0x0207
        L_0x0205:
            r15 = 5000(0x1388, double:2.4703E-320)
        L_0x0207:
            int r1 = (r8 > r39 ? 1 : (r8 == r39 ? 0 : -1))
            if (r1 >= 0) goto L_0x020d
            r8 = r28
        L_0x020d:
            int r1 = (r11 > r39 ? 1 : (r11 == r39 ? 0 : -1))
            if (r1 >= 0) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r15 = r11
        L_0x0213:
            com.ss.android.common.util.NetworkUtils$h r1 = com.ss.android.common.util.NetworkUtils.h.WIFI     // Catch:{ Exception -> 0x0262 }
            if (r4 != r1) goto L_0x0222
            int r1 = (r8 > r39 ? 1 : (r8 == r39 ? 0 : -1))
            if (r1 == 0) goto L_0x021f
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x022b
        L_0x021f:
            r6 = r39
            goto L_0x022b
        L_0x0222:
            int r1 = (r15 > r39 ? 1 : (r15 == r39 ? 0 : -1))
            if (r1 == 0) goto L_0x021f
            int r1 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x022b
            goto L_0x021f
        L_0x022b:
            int r1 = (r6 > r39 ? 1 : (r6 == r39 ? 0 : -1))
            if (r1 > 0) goto L_0x0233
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0262 }
            goto L_0x0263
        L_0x0233:
            r4 = 90000(0x15f90, double:4.4466E-319)
            long r4 = java.lang.Math.min(r6, r4)     // Catch:{ Exception -> 0x0262 }
            java.lang.String r1 = "load_time"
            r14.put(r1, r4)     // Catch:{ Exception -> 0x0262 }
            r32 = r2
        L_0x0241:
            java.lang.String r1 = "item_id"
            long r4 = r3.f30684b     // Catch:{ Exception -> 0x0262 }
            r14.put(r1, r4)     // Catch:{ Exception -> 0x0262 }
            java.lang.String r1 = "aggr_type"
            int r2 = r3.f30685c     // Catch:{ Exception -> 0x0262 }
            r14.put(r1, r2)     // Catch:{ Exception -> 0x0262 }
            java.lang.String r31 = "wap_stat"
            long r1 = r3.f30683a     // Catch:{ Exception -> 0x0262 }
            r33 = r24
            r34 = r1
            r36 = r42
            r38 = r14
            com.ss.android.common.applog.AppLog.onEvent((android.content.Context) r30, (java.lang.String) r31, (java.lang.String) r32, (java.lang.String) r33, (long) r34, (long) r36, (org.json.JSONObject) r38)     // Catch:{ Exception -> 0x0262 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x0262 }
            goto L_0x0263
        L_0x0262:
        L_0x0263:
            long r1 = r0.R
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0275
            com.ss.android.sdk.activity.a r1 = r0.X
            if (r1 == 0) goto L_0x0275
            com.ss.android.sdk.activity.a r1 = r0.X
            r2 = 0
            r1.a((android.content.Context) r10, (boolean) r2)
        L_0x0275:
            com.ss.android.newmedia.ui.webview.SSWebView r1 = r0.i
            com.bytedance.common.util.HoneyCombV11Compat.pauseWebView(r1)
            android.support.v4.app.FragmentActivity r1 = r44.getActivity()
            com.ss.android.newmedia.ui.webview.SSWebView r2 = r0.i
            com.ss.android.newmedia.app.g.a(r1, r2)
            android.os.Handler r1 = r0.x
            if (r1 == 0) goto L_0x02a3
            if (r10 == 0) goto L_0x02a3
            boolean r1 = r10.isFinishing()
            if (r1 != 0) goto L_0x02a3
            com.ss.android.sdk.c.f r1 = r0.Y
            java.lang.String r2 = r0.A
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L_0x02a3
            android.os.Handler r1 = r0.x
            r2 = 10011(0x271b, float:1.4028E-41)
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendEmptyMessageDelayed(r2, r3)
        L_0x02a3:
            long r1 = r0.R
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x02dd
            boolean r1 = r0.s
            if (r1 == 0) goto L_0x02ce
            com.ss.android.sdk.activity.a.b r1 = r0.r
            if (r1 == 0) goto L_0x02ce
            com.ss.android.sdk.activity.a.b r1 = r0.r
            java.lang.String r1 = r1.f30645f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x02ce
            com.ss.android.downloadlib.h r1 = r44.d()
            com.ss.android.sdk.activity.a.b r2 = r0.r
            java.lang.String r2 = r2.f30645f
            android.view.View r3 = r0.k
            int r3 = r3.hashCode()
            r1.a(r2, r3)
        L_0x02ce:
            com.ss.android.downloadad.api.b r1 = r44.e()
            long r2 = r0.R
            android.view.View r4 = r0.k
            int r4 = r4.hashCode()
            r1.a(r2, r4)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.activity.IESBrowserFragment.onPause():void");
    }

    public final void a(int i2) {
        if (this.ah) {
            UIUtils.setViewVisibility(this.k, i2);
            UIUtils.setViewVisibility(this.l, i2);
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("http://", "").replace("https://", "");
    }

    public void handleMsg(Message message) {
        if (message.what == 10011 && !isActive() && this.i != null) {
            try {
                this.i.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
        this.aC = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a();
    }

    public void a(String str) {
        com.ss.android.ugc.aweme.framework.a.a.a("IESBrowerFragment load url is " + str);
        a(str, false);
        this.ag = SystemClock.elapsedRealtime();
        if (this.X != null) {
            this.X.a();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        boolean z4;
        boolean z5;
        int i2;
        boolean z6;
        String str3;
        boolean z7;
        String str4;
        boolean z8;
        super.onActivityCreated(bundle);
        this.i.getSettings().setJavaScriptEnabled(true);
        this.x = new WeakHandler(this);
        this.y = new Runnable() {
            public final void run() {
                IESBrowserFragment iESBrowserFragment = IESBrowserFragment.this;
                iESBrowserFragment.F = false;
                if (iESBrowserFragment.j != null && iESBrowserFragment.j.getVisibility() == 0) {
                    iESBrowserFragment.j.setVisibility(8);
                }
            }
        };
        this.z = getActivity();
        this.D = BaseAppData.a();
        this.am = this.z.getResources();
        this.B = this.D.l;
        this.Y = this.D.a(this.z);
        Bundle arguments = getArguments();
        int i3 = 0;
        if (arguments != null) {
            z4 = arguments.getBoolean("bundle_no_hw_acceleration", false);
            this.an = arguments.getBoolean("bundle_enable_app_cache", false);
            str2 = arguments.getString(PushConstants.WEB_URL, "").trim();
            str = arguments.getString("webview_track_key");
            this.ae = com.ss.android.ugc.aweme.commercialize.utils.f.a();
            if (this.ae != null) {
                this.L = this.ae.isJumpControlEnabled();
                this.M = this.ae.isClickControlEnabled();
                this.N = this.ae.getAutoJumpAllowList();
                this.O = this.ae.getAutoJumpInterceptList();
                this.Q = this.ae.getAutoJumpInterval();
                this.P = this.ae.getAutoJumpIntervalTips();
                this.i.setTimeInterval(this.Q);
            }
            this.n = arguments.getString("bundle_ad_quick_app_url");
            this.o = arguments.getString("bundle_download_url");
            this.p = arguments.getString("bundle_download_app_name");
            this.ai = arguments.getBoolean("bundle_disable_download_dialog", true);
            this.s = arguments.getBoolean("bundle_is_from_app_ad");
            z3 = arguments.getBoolean("bundle_auto_play_audio", false);
            this.q = arguments.getString("bundle_download_app_log_extra");
            z2 = arguments.getBoolean("bundle_is_ad_fake");
            this.C = arguments.getBoolean("bundle_use_day_night", false);
            this.R = arguments.getLong("ad_id", 0);
            this.S = arguments.getString("ad_type", "");
            this.T = arguments.getInt("ad_system_origin", 0);
            this.w = arguments.getBoolean("bundle_user_webview_title", false);
            this.ap = arguments.getInt("bundle_app_ad_from", 0);
            this.aq = arguments.getString("gd_label");
            this.ar = arguments.getString("gd_ext_json");
            if (arguments.getInt("is_load_cache") == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.ak = z8;
            this.G = arguments.getBoolean("show_load_dialog", true);
            this.Z = arguments.getString("ad_js_url");
            this.ac = arguments.getBoolean("bundle_forbidden_jump", false);
            this.aA = arguments.getBoolean("is_adjust_pan", false);
            this.al = arguments.getInt("bundle_webview_background");
            this.ad = arguments.getBoolean("bundle_webview_forbidden_jump_primary", false);
            String string = arguments.getString("wap_headers");
            this.ah = arguments.getBoolean("bundle_show_download_status_bar", true);
            if (this.s && !TextUtils.isEmpty(this.o)) {
                this.r = new com.ss.android.sdk.activity.a.b();
                this.r.a(arguments);
            }
            try {
                if (!StringUtils.isEmpty(string)) {
                    this.as = new JSONObject(string);
                }
            } catch (JSONException unused) {
            }
            this.av = arguments.getString("aweme_group_id", PushConstants.PUSH_TYPE_NOTIFY);
            this.ax = arguments.getString("aweme_creative_id");
            this.az = arguments.getBoolean("bundle_can_touch_webview", true);
            try {
                this.aw = new JSONObject(arguments.getString("aweme_json_extra", ""));
            } catch (Exception unused2) {
                this.aw = null;
            }
            this.ay = arguments.getBoolean("bundle_fix_webview", true);
            if (this.ay && !(getActivity() instanceof CrossPlatformActivity)) {
                new b(this.aB);
            }
            if (this.aA) {
                getActivity().getWindow().setSoftInputMode(32);
            }
            this.af = arguments.getString("enter_from");
        } else {
            str2 = "";
            str = null;
            z4 = false;
            z3 = false;
            z2 = false;
        }
        if (!z4) {
            z4 = false;
        }
        if (this.al == 0) {
            this.i.setBackgroundColor(this.am.getColor(C0906R.color.dq));
        } else if (TextUtils.equals(arguments.getString("bundle_bg_transparent"), "transparent")) {
            this.i.setBackgroundColor(0);
            this.i.getBackground().setAlpha(0);
        } else {
            this.i.setBackgroundColor(this.al);
        }
        if (this.r == null || StringUtils.isEmpty(this.r.f30645f) || !BaseAppData.a().m() || !this.ah) {
            this.k.setVisibility(8);
        } else {
            com.ss.android.sdk.activity.a.b bVar = this.r;
            if (this.i != null) {
                str4 = this.i.getUrl();
            } else {
                str4 = "";
            }
            bVar.i = new JSONObject();
            try {
                bVar.i.put("download_app_extra", bVar.h);
                bVar.i.put("referer_url", str4);
                if (!TextUtils.isEmpty(str4) && !str4.equals(str2)) {
                    bVar.i.put("init_url", str2);
                }
            } catch (JSONException unused3) {
            }
            this.v = com.ss.android.sdk.activity.a.b.b(this.r);
            this.u = com.ss.android.sdk.activity.a.b.a(this.r.g);
            try {
                Context context = this.z;
                if (this.r != null) {
                    a(context, this.r.g, "detail_show", this.ax, this.av, this.aw);
                }
            } catch (Exception unused4) {
            }
            this.k.setVisibility(0);
        }
        CookieManager.getInstance().setAcceptCookie(true);
        this.i.setDownloadListener(new c(this));
        this.i.setCanTouch(this.az);
        if (this.ak) {
            this.i.getSettings().setCacheMode(2);
        }
        com.ss.android.newmedia.ui.webview.a a2 = com.ss.android.newmedia.ui.webview.a.a((Context) getActivity());
        if (!z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        a2.a(z5).a((WebView) this.i);
        com.ss.android.ugc.aweme.framework.a.a.a("enableHardwareAcceleration: " + z4);
        this.K = new b();
        if (Build.VERSION.SDK_INT < 19) {
            this.i.setLayerType(1, null);
        }
        WebSettings settings = this.i.getSettings();
        if (this.an) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        settings.setCacheMode(i2);
        if (Build.VERSION.SDK_INT >= 17) {
            WebSettings settings2 = this.i.getSettings();
            if (!z3) {
                z7 = true;
            } else {
                z7 = false;
            }
            settings2.setMediaPlaybackRequiresUserGesture(z7);
        }
        this.i.addJavascriptInterface(new a(), "local_obj");
        if (this.Y == null) {
            this.i.setWebChromeClient(this.K);
            this.i.setWebViewClient(new WebViewClient());
        } else {
            c cVar = new c();
            com.ss.android.sdk.c.g o2 = this.D.o();
            if (o2 != null) {
                this.ab = new com.ss.android.sdk.c.c(o2.a()).a(d.f30653a).a(this.D.f2499b).a(o2.b()).a(this.f2549c);
            }
            this.au = b.a.a(this.i).a((WebChromeClient) this.K).a((WebViewClient) cVar).a((com.ss.android.sdk.c.a) this.Y).a(com.ss.android.ugc.aweme.poi.e.e.c()).b();
            this.Y.a(this.au);
            this.Y.a(this.aC);
            this.Y.a(this.R, this.S, this.T, this.q, this.o);
        }
        this.A = str2;
        this.V = new f();
        com.ss.android.ugc.aweme.crossplatform.params.b bVar2 = new com.ss.android.ugc.aweme.crossplatform.params.b();
        bVar2.f40800b = this.R;
        bVar2.f40801c = this.S;
        bVar2.f40802d = this.T;
        bVar2.j = this.q;
        bVar2.l = this.ar;
        this.X = new a(bVar2);
        if (this.R > 0 || !StringUtils.isEmpty(this.aq)) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.at = z6;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f.f30170a, true, 18585, new Class[]{String.class}, String.class)) {
            str3 = (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f.f30170a, true, 18585, new Class[]{String.class}, String.class);
        } else if (StringUtils.isEmpty(str2)) {
            str3 = null;
        } else {
            str3 = Uri.parse(str2).getQueryParameter("webview_track_key");
        }
        if (StringUtils.isEmpty(str3)) {
            str3 = str;
        }
        if (!StringUtils.isEmpty(str3)) {
            this.V.j = str3;
        }
        if (str2 != null && com.ss.android.newmedia.e.a(str2) && this.au != null && this.au.a(str2)) {
            StringBuilder sb = new StringBuilder(str2);
            if (!str2.contains("?")) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            if (eb.a()) {
                i3 = ImmersionBar.getStatusBarHeight(getActivity());
            }
            sb.append("status_bar_height=" + i3);
            str2 = sb.toString();
        }
        if (this.as == null || this.as.length() <= 0) {
            com.ss.android.newmedia.e.a(str2, (WebView) this.i, (HashMap<String, String>) null);
        } else {
            HashMap hashMap = new HashMap();
            com.ss.android.newmedia.e.a(hashMap, (String) null, this.as);
            com.ss.android.newmedia.e.a(str2, (WebView) this.i, hashMap);
        }
        if (this.R > 0 && z2) {
            this.i.setOnTouchListener(new View.OnTouchListener() {
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    switch (motionEvent.getAction()) {
                        case 0:
                            view.clearFocus();
                            break;
                        case 1:
                            view.requestFocus();
                            break;
                    }
                    return false;
                }
            });
        }
    }

    public final void a(String str, boolean z2) {
        if (this.i != null) {
            if (this.as == null || this.as.length() <= 0) {
                com.ss.android.newmedia.e.a(str, (WebView) this.i);
            } else {
                HashMap hashMap = new HashMap();
                com.ss.android.newmedia.e.a(hashMap, (String) null, this.as);
                com.ss.android.newmedia.e.a(str, (WebView) this.i, hashMap);
            }
            if (this.aC != null && this.aC.f49969c && !TextUtils.isEmpty(str)) {
                this.aC.a(q.f49996b.a(str));
            }
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Uri uri;
        super.onActivityResult(i2, i3, intent);
        if (this.K != null) {
            b bVar = this.K;
            if (i2 != 2048) {
                return;
            }
            if (bVar.f30673b != null || bVar.f30674c != null) {
                if (i3 != 0 || !bVar.f30676e) {
                    if (intent == null || i3 != -1) {
                        uri = null;
                    } else {
                        uri = intent.getData();
                    }
                    if (uri == null && intent == null && i3 == -1) {
                        File file = new File(bVar.f30675d);
                        if (file.exists()) {
                            uri = Uri.fromFile(file);
                            bVar.a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                    if (bVar.f30673b != null) {
                        bVar.f30673b.onReceiveValue(uri);
                        bVar.f30673b = null;
                    }
                    if (bVar.f30674c != null) {
                        bVar.f30674c.onReceiveValue(uri == null ? null : new Uri[]{uri});
                        bVar.f30674c = null;
                    }
                }
                bVar.f30676e = false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0053 A[Catch:{ Exception -> 0x00fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ea A[Catch:{ Exception -> 0x00fb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void a(final java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            r14 = this;
            r0 = r14
            r8 = r15
            android.support.v4.app.FragmentActivity r10 = r14.getActivity()     // Catch:{ Exception -> 0x00fb }
            if (r10 != 0) goto L_0x0009
            return
        L_0x0009:
            r1 = 0
            com.ss.android.newmedia.ui.webview.SSWebView r2 = r0.i     // Catch:{ Exception -> 0x00fb }
            if (r2 == 0) goto L_0x0014
            com.ss.android.newmedia.ui.webview.SSWebView r1 = r0.i     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = r1.getUrl()     // Catch:{ Exception -> 0x00fb }
        L_0x0014:
            r6 = r1
            long r1 = r0.R     // Catch:{ Exception -> 0x00fb }
            r11 = 0
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x002f
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00fb }
            if (r1 != 0) goto L_0x002f
            com.ss.android.newmedia.BaseAppData r1 = r0.D     // Catch:{ Exception -> 0x00fb }
            boolean r1 = r1.d((java.lang.String) r6)     // Catch:{ Exception -> 0x00fb }
            if (r1 != 0) goto L_0x002f
            com.ss.android.sdk.activity.e.a(r10, r15, r6)     // Catch:{ Exception -> 0x00fb }
            return
        L_0x002f:
            long r2 = r0.R     // Catch:{ Exception -> 0x00fb }
            java.lang.String r4 = r0.q     // Catch:{ Exception -> 0x00fb }
            java.lang.String r7 = r0.A     // Catch:{ Exception -> 0x00fb }
            r1 = r10
            r5 = r15
            org.json.JSONObject r9 = com.ss.android.sdk.activity.e.a((android.content.Context) r1, (long) r2, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x00fb }
            boolean r1 = r0.ai     // Catch:{ Exception -> 0x00fb }
            if (r1 != 0) goto L_0x004b
            com.ss.android.newmedia.BaseAppData r1 = r0.D     // Catch:{ Exception -> 0x00fb }
            boolean r1 = r1.b((java.lang.String) r15)     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x0048
            goto L_0x004b
        L_0x0048:
            r1 = 0
            r13 = 0
            goto L_0x004d
        L_0x004b:
            r1 = 1
            r13 = 1
        L_0x004d:
            long r1 = r0.R     // Catch:{ Exception -> 0x00fb }
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00ea
            r0.t = r8     // Catch:{ Exception -> 0x00fb }
            boolean r1 = r0.s     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x00be
            com.ss.android.sdk.activity.a.b r1 = r0.r     // Catch:{ Exception -> 0x00fb }
            if (r1 == 0) goto L_0x00be
            if (r10 == 0) goto L_0x00ad
            if (r13 != 0) goto L_0x00ad
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = new com.bytedance.ies.uikit.dialog.AlertDialog$Builder     // Catch:{ Exception -> 0x00fb }
            android.support.v4.app.FragmentActivity r2 = r14.getActivity()     // Catch:{ Exception -> 0x00fb }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00fb }
            com.ss.android.sdk.activity.a.b r2 = r0.r     // Catch:{ Exception -> 0x00fb }
            java.lang.String r2 = r2.f30644e     // Catch:{ Exception -> 0x00fb }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setTitle((java.lang.CharSequence) r2)     // Catch:{ Exception -> 0x00fb }
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ Exception -> 0x00fb }
            r3 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x00fb }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setMessage((java.lang.CharSequence) r2)     // Catch:{ Exception -> 0x00fb }
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ Exception -> 0x00fb }
            r3 = 2131560943(0x7f0d09ef, float:1.8747273E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x00fb }
            com.ss.android.sdk.activity.IESBrowserFragment$6 r3 = new com.ss.android.sdk.activity.IESBrowserFragment$6     // Catch:{ Exception -> 0x00fb }
            r3.<init>()     // Catch:{ Exception -> 0x00fb }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setPositiveButton((java.lang.CharSequence) r2, (android.content.DialogInterface.OnClickListener) r3)     // Catch:{ Exception -> 0x00fb }
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ Exception -> 0x00fb }
            r3 = 2131560942(0x7f0d09ee, float:1.874727E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ Exception -> 0x00fb }
            com.ss.android.sdk.activity.IESBrowserFragment$5 r3 = new com.ss.android.sdk.activity.IESBrowserFragment$5     // Catch:{ Exception -> 0x00fb }
            r3.<init>()     // Catch:{ Exception -> 0x00fb }
            com.bytedance.ies.uikit.dialog.AlertDialog$Builder r1 = r1.setNegativeButton((java.lang.CharSequence) r2, (android.content.DialogInterface.OnClickListener) r3)     // Catch:{ Exception -> 0x00fb }
            r1.show()     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00ad:
            com.ss.android.downloadlib.h r1 = r14.d()     // Catch:{ Exception -> 0x00fb }
            com.ss.android.sdk.activity.a.b r2 = r0.r     // Catch:{ Exception -> 0x00fb }
            java.lang.String r2 = r2.f30645f     // Catch:{ Exception -> 0x00fb }
            r3 = 2
            com.ss.android.download.api.b.b r4 = r0.u     // Catch:{ Exception -> 0x00fb }
            com.ss.android.downloadad.api.a.a r5 = r0.v     // Catch:{ Exception -> 0x00fb }
            r1.a((java.lang.String) r2, (int) r3, (com.ss.android.download.api.b.b) r4, (com.ss.android.download.api.b.a) r5)     // Catch:{ Exception -> 0x00fb }
            return
        L_0x00be:
            com.ss.android.downloadad.api.b r11 = r14.e()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = r0.ax     // Catch:{ Exception -> 0x00fb }
            java.lang.String r2 = r0.av     // Catch:{ Exception -> 0x00fb }
            java.lang.String r3 = r0.q     // Catch:{ Exception -> 0x00fb }
            java.lang.String r4 = r0.p     // Catch:{ Exception -> 0x00fb }
            java.lang.String r12 = r0.n     // Catch:{ Exception -> 0x00fb }
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r9
            r9 = r12
            com.ss.android.downloadad.api.a.c r5 = com.ss.android.sdk.activity.a.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00fb }
            com.ss.android.download.api.b.d r6 = r14.f()     // Catch:{ Exception -> 0x00fb }
            android.view.View r1 = r0.k     // Catch:{ Exception -> 0x00fb }
            int r7 = r1.hashCode()     // Catch:{ Exception -> 0x00fb }
            r1 = r11
            r2 = r10
            r3 = r16
            r4 = r13
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00fb }
            goto L_0x00fb
        L_0x00ea:
            com.ss.android.sdk.activity.IESBrowserFragment$4 r7 = new com.ss.android.sdk.activity.IESBrowserFragment$4     // Catch:{ Exception -> 0x00fb }
            r7.<init>(r15)     // Catch:{ Exception -> 0x00fb }
            r1 = r10
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r9
            r6 = r13
            com.ss.android.sdk.activity.e.a(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00fb }
            return
        L_0x00fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.activity.IESBrowserFragment.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(a(), viewGroup, false);
        this.aB = inflate;
        this.j = (ProgressBar) inflate.findViewById(C0906R.id.cu1);
        if (this.f2550d) {
            this.j.setVisibility(8);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(com.ss.android.ugc.aweme.framework.core.a.b().f3306d);
        }
        this.i = (SSWebView) inflate.findViewById(C0906R.id.cu3);
        this.i.setScrollBarStyle(0);
        this.f2552f = (FullscreenVideoFrame) inflate.findViewById(C0906R.id.a26);
        this.f2552f.setListener(new FullscreenVideoFrame.Listener() {
            public final void onHideFullscreenVideoFrame() {
                if (IESBrowserFragment.this.K != null) {
                    IESBrowserFragment.this.K.onHideCustomView();
                }
            }
        });
        this.k = inflate.findViewById(C0906R.id.a7c);
        this.l = (TextView) inflate.findViewById(C0906R.id.a7b);
        a(8);
        this.k.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!IESBrowserFragment.this.s || IESBrowserFragment.this.r == null) {
                    if (IESBrowserFragment.this.e().b(IESBrowserFragment.this.R)) {
                        IESBrowserFragment.this.e().a(IESBrowserFragment.this.R);
                    }
                    return;
                }
                IESBrowserFragment.this.d().a(IESBrowserFragment.this.r.f30645f, 2, IESBrowserFragment.this.u, (com.ss.android.download.api.b.a) IESBrowserFragment.this.v);
            }
        });
        this.m = (DmtStatusView) inflate.findViewById(C0906R.id.cvd);
        com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                IESBrowserFragment.this.i.reload();
            }
        }).f20493a;
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(cVar);
        if (com.bytedance.ies.dmt.ui.common.b.b()) {
            dmtDefaultView.setBackgroundColor(getContext().getResources().getColor(C0906R.color.als));
        } else {
            dmtDefaultView.setBackgroundColor(getContext().getResources().getColor(C0906R.color.alt));
        }
        this.m.setBuilder(DmtStatusView.a.a(getContext()).c((View) dmtDefaultView));
        return inflate;
    }

    private static void a(Context context, String str, String str2, String str3, String str4, JSONObject jSONObject) {
        if (context != null && str3 != null && jSONObject != null && str4 != null) {
            try {
                r.a(context, str, str2, str3, Long.valueOf(str4).longValue(), jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}

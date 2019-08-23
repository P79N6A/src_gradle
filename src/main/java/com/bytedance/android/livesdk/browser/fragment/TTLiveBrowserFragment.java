package com.bytedance.android.livesdk.browser.fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.PopupMenu;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.ui.BaseFragment;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.uikit.dialog.b;
import com.bytedance.android.live.uikit.layout.FullscreenVideoFrame;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.browser.jsbridge.c.d;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.aa;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ad;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae;
import com.bytedance.android.livesdk.browser.view.SSWebView;
import com.bytedance.android.livesdk.chatroom.api.UploadApi;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.m.f;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.util.HoneyCombV11Compat;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.android.ClipboardCompat;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.f.b.c;
import com.bytedance.retrofit2.mime.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.a;
import org.json.JSONException;
import org.json.JSONObject;

public class TTLiveBrowserFragment extends BaseFragment implements View.OnClickListener, com.bytedance.android.livesdk.browser.jsbridge.a, d.a, aa.a, com.bytedance.android.livesdkapi.b.b, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9357a;
    private static final /* synthetic */ a.C0900a ax;
    aa A = new aa(this);
    boolean B = false;
    b C;
    public com.bytedance.android.livesdkapi.host.b D;
    ad E;
    ae F;
    public List<com.bytedance.android.livesdk.browser.e.c> G = new LinkedList();
    public int H = -1;
    public boolean I = true;
    public long J = 0;
    boolean K = false;
    public boolean L = true;
    public com.bytedance.android.livesdk.browser.jsbridge.b M;
    public boolean N;
    public com.bytedance.android.livesdk.browser.h.c O;
    public long P = 0;
    public long Q = 0;
    public long R = 0;
    public long S = 0;
    public Map<String, Object> T = new HashMap();
    public PopupMenu.OnMenuItemClickListener U = new TTLiveBrowserFragment$$Lambda$0(this);
    private boolean V;
    private int W = 1;
    private boolean X;
    private boolean Y;
    private View Z;
    private ViewGroup aa;
    private final CompositeDisposable ab = new CompositeDisposable();
    private boolean ac = false;
    private boolean ad = true;
    private boolean ae = false;
    private int af;
    private int ag = -1;
    private com.bytedance.android.live.uikit.toast.a ah;
    private com.bytedance.android.livesdk.browser.g.b ai;
    private com.bytedance.android.livesdk.user.e aj;
    private com.bytedance.android.livesdk.browser.b.a ak;
    private com.bytedance.android.livesdk.browser.jsbridge.c.d al;
    private boolean am;
    private boolean an = false;
    private Handler ao;
    private Runnable ap;
    private JSONObject aq;
    private com.bytedance.android.livesdk.browser.h.b ar;
    private boolean as;
    private String at;
    private String au;
    private String av = null;
    private View.OnClickListener aw = new View.OnClickListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9362a;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ a.C0900a f9363c;

        static {
            if (PatchProxy.isSupport(new Object[0], null, f9362a, true, 3547, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], null, f9362a, true, 3547, new Class[0], Void.TYPE);
                return;
            }
            org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("TTLiveBrowserFragment.java", AnonymousClass1.class);
            f9363c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 225);
        }

        public void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f9362a, false, 3546, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f9362a, false, 3546, new Class[]{View.class}, Void.TYPE);
                return;
            }
            com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f9363c, this, this, view));
            int id = view.getId();
            if (id == C0906R.id.cex) {
                try {
                    PopupMenu popupMenu = new PopupMenu(TTLiveBrowserFragment.this.getActivity(), TTLiveBrowserFragment.this.t);
                    popupMenu.inflate(C0906R.menu.f4513c);
                    popupMenu.setOnMenuItemClickListener(TTLiveBrowserFragment.this.U);
                    if (popupMenu.getMenu().hasVisibleItems()) {
                        popupMenu.show();
                    }
                } catch (Throwable unused) {
                }
                return;
            }
            if (id == C0906R.id.iu) {
                TTLiveBrowserFragment.this.p = true;
                TTLiveBrowserFragment.this.c();
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public String f9358b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9359c;
    protected String h = "";
    protected long i;
    protected boolean j;
    protected boolean k = true;
    public d l;
    public e m;
    public a n;
    public com.bytedance.android.live.b.b o;
    public boolean p;
    public boolean q = true;
    protected View r;
    View s;
    public TextView t;
    TextView u;
    public FullscreenVideoFrame v;
    public View w;
    public WebChromeClient.CustomViewCallback x;
    public WebView y;
    ProgressBar z;

    public interface a {
        void a(com.bytedance.android.livesdk.browser.jsbridge.b bVar);
    }

    class b extends com.bytedance.android.livesdk.browser.a.b {

        /* renamed from: f  reason: collision with root package name */
        public static ChangeQuickRedirect f9365f;

        public final void onGeolocationPermissionsHidePrompt() {
            if (PatchProxy.isSupport(new Object[0], this, f9365f, false, 3554, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9365f, false, 3554, new Class[0], Void.TYPE);
                return;
            }
            if (TTLiveBrowserFragment.this.M != null) {
                TTLiveBrowserFragment.this.M.d();
            }
        }

        public final void onHideCustomView() {
            if (PatchProxy.isSupport(new Object[0], this, f9365f, false, 3551, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9365f, false, 3551, new Class[0], Void.TYPE);
            } else if (TTLiveBrowserFragment.this.w == null) {
                TTLiveBrowserFragment.this.x = null;
            } else {
                TTLiveBrowserFragment tTLiveBrowserFragment = TTLiveBrowserFragment.this;
                if (PatchProxy.isSupport(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3507, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3507, new Class[0], Void.TYPE);
                } else if (tTLiveBrowserFragment.s != null && !tTLiveBrowserFragment.B) {
                    tTLiveBrowserFragment.s.setVisibility(0);
                }
                TTLiveBrowserFragment.this.v.setVisibility(8);
                TTLiveBrowserFragment.this.v.removeView(TTLiveBrowserFragment.this.w);
                UIUtils.requestOrienation(TTLiveBrowserFragment.this.getActivity(), false);
                TTLiveBrowserFragment.this.w = null;
                TTLiveBrowserFragment.this.x.onCustomViewHidden();
            }
        }

        b() {
            super(TTLiveBrowserFragment.this);
        }

        public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (PatchProxy.isSupport(new Object[]{str, callback}, this, f9365f, false, 3553, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, callback}, this, f9365f, false, 3553, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE);
                return;
            }
            if (TTLiveBrowserFragment.this.M != null) {
                TTLiveBrowserFragment.this.M.a(str, callback);
            }
        }

        public final void onProgressChanged(WebView webView, int i) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i)}, this, f9365f, false, 3548, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i)}, this, f9365f, false, 3548, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onProgressChanged(webView, i);
            TTLiveBrowserFragment.this.a(i);
            if (i >= 100) {
                TTLiveBrowserFragment.this.d();
            }
        }

        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (PatchProxy.isSupport(new Object[]{view, customViewCallback}, this, f9365f, false, 3550, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, customViewCallback}, this, f9365f, false, 3550, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE);
            } else if (TTLiveBrowserFragment.this.L) {
                if (TTLiveBrowserFragment.this.w != null) {
                    customViewCallback.onCustomViewHidden();
                    return;
                }
                TTLiveBrowserFragment.this.e();
                TTLiveBrowserFragment.this.x = customViewCallback;
                TTLiveBrowserFragment.this.v.addView(view);
                TTLiveBrowserFragment.this.w = view;
                UIUtils.requestOrienation(TTLiveBrowserFragment.this.getActivity(), true);
                TTLiveBrowserFragment.this.v.setVisibility(0);
                TTLiveBrowserFragment.this.v.requestFocus();
            }
        }

        public final void onReceivedTitle(WebView webView, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{webView, str2}, this, f9365f, false, 3549, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str2}, this, f9365f, false, 3549, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            super.onReceivedTitle(webView, str);
            if (TTLiveBrowserFragment.this.I && TTLiveBrowserFragment.this.getActivity() != null && !StringUtils.isEmpty(str) && !TextUtils.equals("about:blank", str2)) {
                TTLiveBrowserFragment tTLiveBrowserFragment = TTLiveBrowserFragment.this;
                if (PatchProxy.isSupport(new Object[]{str2}, tTLiveBrowserFragment, TTLiveBrowserFragment.f9357a, false, 3509, new Class[]{CharSequence.class}, Void.TYPE)) {
                    TTLiveBrowserFragment tTLiveBrowserFragment2 = tTLiveBrowserFragment;
                    PatchProxy.accessDispatch(new Object[]{str2}, tTLiveBrowserFragment2, TTLiveBrowserFragment.f9357a, false, 3509, new Class[]{CharSequence.class}, Void.TYPE);
                } else if (tTLiveBrowserFragment.u != null) {
                    tTLiveBrowserFragment.u.setText(str2);
                }
                if (TTLiveBrowserFragment.this.m != null) {
                    TTLiveBrowserFragment.this.m.a(str2);
                }
            }
        }

        public final void onConsoleMessage(String str, int i, String str2) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2}, this, f9365f, false, 3552, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2}, this, f9365f, false, 3552, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE);
                return;
            }
            Logger.debug();
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!PatchProxy.isSupport(new Object[]{webView, str, str2, str3, jsPromptResult}, this, f9365f, false, 3555, new Class[]{WebView.class, String.class, String.class, String.class, JsPromptResult.class}, Boolean.TYPE)) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str, str2, str3, jsPromptResult}, this, f9365f, false, 3555, new Class[]{WebView.class, String.class, String.class, String.class, JsPromptResult.class}, Boolean.TYPE)).booleanValue();
        }
    }

    class c extends com.bytedance.android.livesdk.browser.a.a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f9366b;

        c(WebViewClient webViewClient) {
            super(null);
        }

        public final void onLoadResource(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9366b, false, 3557, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9366b, false, 3557, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            if (Logger.debug()) {
                com.bytedance.android.livesdk.utils.a.a(str);
            }
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9366b, false, 3561, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9366b, false, 3561, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            TTLiveBrowserFragment.this.J = System.currentTimeMillis();
            Logger.debug();
            if (TTLiveBrowserFragment.this.l != null) {
                TTLiveBrowserFragment.this.l.b();
            }
            if (TTLiveBrowserFragment.this.q) {
                webView.clearHistory();
                TTLiveBrowserFragment.this.q = false;
            }
            super.onPageFinished(webView, str);
            if (TTLiveBrowserFragment.this.N && TTLiveBrowserFragment.this.y != null) {
                WebView webView2 = TTLiveBrowserFragment.this.y;
                if (PatchProxy.isSupport(new Object[]{webView2, "about:blank"}, null, m.f9394a, true, 3568, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, "about:blank"}, null, m.f9394a, true, 3568, new Class[]{WebView.class, String.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.lancet.c.a("about:blank");
                    webView2.loadUrl("about:blank");
                }
                TTLiveBrowserFragment.this.N = false;
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9366b, false, 3556, new Class[]{WebView.class, String.class}, WebResourceResponse.class)) {
                return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9366b, false, 3556, new Class[]{WebView.class, String.class}, WebResourceResponse.class);
            }
            if (!TextUtils.isEmpty(str) && ((Boolean) LiveConfigSettingKeys.WEB_OFFLINE_ENABLED.a()).booleanValue()) {
                WebResourceResponse c2 = TTLiveSDKContext.getHostService().l().c(str);
                if (c2 != null) {
                    if (TextUtils.equals("text/html", c2.getMimeType())) {
                        TTLiveBrowserFragment.this.S = System.currentTimeMillis();
                        TTLiveBrowserFragment.this.T.put("intercept_delay", Long.valueOf((TTLiveBrowserFragment.this.S - TTLiveBrowserFragment.this.R) / 1000));
                    }
                    return c2;
                }
            }
            WebResourceResponse a2 = j.q().h().e().a(str, TTLiveBrowserFragment.this.G, webView);
            if (a2 != null) {
                return a2;
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9366b, false, 3558, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9366b, false, 3558, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
            }
            Logger.debug();
            if (TTLiveBrowserFragment.this.H == 1) {
                if (TTLiveBrowserFragment.this.D == null) {
                    return false;
                }
                return super.shouldOverrideUrlLoading(webView, str);
            } else if (j.q().f().a(webView, str) || super.shouldOverrideUrlLoading(webView, str)) {
                return true;
            } else {
                try {
                    Uri parse = Uri.parse(str);
                    String lowerCase = parse.getScheme().toLowerCase();
                    if (!TextUtils.isEmpty(lowerCase) && !"about".equals(lowerCase) && !"http".equals(lowerCase) && !"https".equals(lowerCase)) {
                        return j.q().m().a(TTLiveBrowserFragment.this.getContext(), parse);
                    }
                } catch (Exception unused) {
                }
                return false;
            }
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            if (PatchProxy.isSupport(new Object[]{webView, str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f9366b, false, 3560, new Class[]{WebView.class, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str, Byte.valueOf(z)}, this, f9366b, false, 3560, new Class[]{WebView.class, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            Logger.debug();
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (PatchProxy.isSupport(new Object[]{webView, str, bitmap}, this, f9366b, false, 3562, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str, bitmap}, this, f9366b, false, 3562, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                return;
            }
            super.onPageStarted(webView, str, bitmap);
            TTLiveBrowserFragment.this.Q = System.currentTimeMillis();
            Logger.debug();
            TTLiveBrowserFragment.this.T.put("constrution_duration", Long.valueOf((TTLiveBrowserFragment.this.Q - TTLiveBrowserFragment.this.P) / 1000));
            if (TTLiveBrowserFragment.this.l != null) {
                TTLiveBrowserFragment.this.l.a();
            }
        }

        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            SslErrorHandler sslErrorHandler2 = sslErrorHandler;
            if (PatchProxy.isSupport(new Object[]{webView, sslErrorHandler2, sslError}, this, f9366b, false, 3563, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, sslErrorHandler2, sslError}, this, f9366b, false, 3563, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
                return;
            }
            b.a aVar = new b.a(webView.getContext());
            aVar.b((CharSequence) "notification error ssl cert invalid");
            aVar.a((CharSequence) "continue", (DialogInterface.OnClickListener) new k(sslErrorHandler2));
            aVar.b((CharSequence) "cancel", (DialogInterface.OnClickListener) new l(sslErrorHandler2));
            aVar.a().show();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            String str3 = str;
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str3, str2}, this, f9366b, false, 3559, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str3, str2}, this, f9366b, false, 3559, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            TTLiveBrowserFragment.this.J = System.currentTimeMillis();
            Logger.debug();
            TTLiveBrowserFragment.this.d();
            if (TTLiveBrowserFragment.this.l != null) {
                TTLiveBrowserFragment.this.l.c();
                TTLiveBrowserFragment.this.N = true;
            }
            if (TTLiveBrowserFragment.this.O != null) {
                com.bytedance.android.livesdk.browser.h.c cVar = TTLiveBrowserFragment.this.O;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3}, cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3804, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                    com.bytedance.android.livesdk.browser.h.c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str3}, cVar2, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3804, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                } else {
                    cVar.a(2, i, str3);
                }
            }
            TTLiveBrowserFragment.this.b(1);
        }
    }

    public interface d {
        void a();

        void b();

        void c();
    }

    public interface e {
        void a(String str);
    }

    public final Fragment f() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(MenuItem menuItem) {
        if (this.y == null) {
            return true;
        }
        int itemId = menuItem.getItemId();
        String url = this.y.getUrl();
        if (itemId == C0906R.id.bv5) {
            if (PatchProxy.isSupport(new Object[]{url}, this, f9357a, false, 3499, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{url}, this, f9357a, false, 3499, new Class[]{String.class}, Void.TYPE);
            } else if (!StringUtils.isEmpty(url)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(url));
                    intent.setAction("android.intent.action.VIEW");
                    startActivity(intent);
                } catch (Exception unused) {
                }
            }
        } else if (itemId == C0906R.id.zw) {
            if (PatchProxy.isSupport(new Object[]{url}, this, f9357a, false, 3500, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{url}, this, f9357a, false, 3500, new Class[]{String.class}, Void.TYPE);
            } else if (!StringUtils.isEmpty(url)) {
                ClipboardCompat.setText(getContext(), "", url);
                if (PatchProxy.isSupport(new Object[]{2130841021, Integer.valueOf(C0906R.string.dkr)}, this, f9357a, false, 3501, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{2130841021, Integer.valueOf(C0906R.string.dkr)}, this, f9357a, false, 3501, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                } else if (getContext() != null) {
                    UIUtils.displayToastWithIcon(getContext(), 2130841021, (int) C0906R.string.dkr);
                }
            }
        } else if (itemId == C0906R.id.cct) {
            if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3497, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3497, new Class[0], Void.TYPE);
            } else if (this.f8192e) {
                b();
            }
        }
        return true;
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f9357a, false, 3514, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f9357a, false, 3514, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (this.M != null) {
            this.M.a().a(str, jSONObject);
        }
    }

    public final void a(String str, Object obj) {
        String str2 = str;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{str2, obj2}, this, f9357a, false, 3532, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, obj2}, this, f9357a, false, 3532, new Class[]{String.class, Object.class}, Void.TYPE);
            return;
        }
        this.T.put(str2, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void h() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3504, new Class[0], Void.TYPE);
            return;
        }
        if (this.i > 0) {
            a(this.p);
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof com.bytedance.android.livesdkapi.b.a) {
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3498, new Class[0], Void.TYPE);
        } else if (!this.K || this.y == null) {
            j();
        } else {
            this.y.stopLoading();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3502, new Class[0], Void.TYPE);
        } else if (this.y == null || !this.y.canGoBack()) {
            h();
        } else {
            this.y.goBack();
            this.p = false;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3503, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3503, new Class[0], Void.TYPE);
            return;
        }
        this.ao.removeCallbacks(this.ap);
        this.ao.postDelayed(this.ap, 500);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3506, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.s.setVisibility(8);
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3530, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3530, new Class[0], Void.TYPE);
            return;
        }
        this.T.put("first_loaded", Long.valueOf((System.currentTimeMillis() - this.P) / 1000));
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f9357a, true, 3534, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f9357a, true, 3534, new Class[0], Void.TYPE);
            return;
        }
        org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("TTLiveBrowserFragment.java", TTLiveBrowserFragment.class);
        ax = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment", "android.view.View", NotifyType.VIBRATE, "", "void"), 827);
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3522, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3522, new Class[0], Void.TYPE);
            return;
        }
        if (this.y != null) {
            if (this.aq == null || this.aq.length() <= 0) {
                com.bytedance.android.livesdk.utils.a.a(this.au, this.y, this.at, true);
            } else {
                HashMap hashMap = new HashMap();
                com.bytedance.android.livesdk.utils.a.a(hashMap, (String) null, this.aq);
                com.bytedance.android.livesdk.utils.a.a(this.au, this.y, (Map<String, String>) hashMap);
            }
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3491, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3491, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.y != null) {
            this.y.getSettings().setBlockNetworkLoads(false);
            if (this.ao != null) {
                this.ao.removeMessages(10011);
            }
        }
        super.onResume();
        HoneyCombV11Compat.resumeWebView(this.y);
        if (this.ah != null) {
            this.ah.g = false;
        }
        if (!(this.y == null || this.ag == -1)) {
            this.y.reload();
        }
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3494, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (this.ab != null) {
            this.ab.clear();
        }
        if (this.O != null && this.J == 0) {
            com.bytedance.android.livesdk.browser.h.c cVar = this.O;
            if (PatchProxy.isSupport(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3805, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3805, new Class[0], Void.TYPE);
            } else {
                cVar.a(3, 0, "");
            }
        }
        b(0);
        j.q().f().b((com.bytedance.android.livesdk.browser.jsbridge.a) this);
        j.q().h().b().a(getActivity());
        if (this.M != null) {
            this.M.b();
        }
        if (this.y != null) {
            try {
                j.q().f().a(this.y);
            } catch (Exception unused) {
            }
        }
        if (this.ao != null) {
            this.ao.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009a, code lost:
        if (r2 > 0) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPause() {
        /*
            r17 = this;
            r7 = r17
            r8 = 0
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f9357a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 3492(0xda4, float:4.893E-42)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0027
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f9357a
            r3 = 0
            r4 = 3492(0xda4, float:4.893E-42)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0027:
            super.onPause()
            android.support.v4.app.FragmentActivity r0 = r17.getActivity()
            android.webkit.WebView r1 = r7.y
            com.bytedance.common.util.HoneyCombV11Compat.pauseWebView(r1)
            android.support.v4.app.FragmentActivity r1 = r17.getActivity()
            com.bytedance.android.livesdk.browser.b.a r2 = r7.ak
            android.webkit.WebView r3 = r7.y
            r4 = 3
            java.lang.Object[] r9 = new java.lang.Object[r4]
            r9[r8] = r1
            r5 = 1
            r9[r5] = r2
            r6 = 2
            r9[r6] = r3
            r10 = 0
            com.meituan.robust.ChangeQuickRedirect r11 = com.bytedance.android.livesdk.browser.b.f9296a
            r12 = 1
            r13 = 3384(0xd38, float:4.742E-42)
            java.lang.Class[] r14 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r15 = android.content.Context.class
            r14[r8] = r15
            java.lang.Class<com.bytedance.android.livesdk.browser.b.a> r15 = com.bytedance.android.livesdk.browser.b.a.class
            r14[r5] = r15
            java.lang.Class<android.webkit.WebView> r15 = android.webkit.WebView.class
            r14[r6] = r15
            java.lang.Class r15 = java.lang.Void.TYPE
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
            if (r9 == 0) goto L_0x0084
            java.lang.Object[] r10 = new java.lang.Object[r4]
            r10[r8] = r1
            r10[r5] = r2
            r10[r6] = r3
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = com.bytedance.android.livesdk.browser.b.f9296a
            r13 = 1
            r14 = 3384(0xd38, float:4.742E-42)
            java.lang.Class[] r15 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r15[r8] = r1
            java.lang.Class<com.bytedance.android.livesdk.browser.b.a> r1 = com.bytedance.android.livesdk.browser.b.a.class
            r15[r5] = r1
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r15[r6] = r1
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x00e7
        L_0x0084:
            if (r1 == 0) goto L_0x00e7
            if (r3 == 0) goto L_0x00e7
            if (r2 != 0) goto L_0x008b
            goto L_0x00e7
        L_0x008b:
            int r2 = r2.a()
            if (r2 != 0) goto L_0x009c
            int r2 = com.bytedance.android.livesdk.browser.b.f9298c
            if (r2 >= 0) goto L_0x009a
            boolean r4 = com.bytedance.android.livesdk.browser.b.f9297b
            if (r4 == 0) goto L_0x009a
            r2 = 1
        L_0x009a:
            if (r2 <= 0) goto L_0x00e7
        L_0x009c:
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00e7
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r1.isFinishing()
            if (r2 == 0) goto L_0x00e7
            java.lang.String r2 = "about:blank"
            com.bytedance.android.live.core.utils.u.a(r3, r2)     // Catch:{ Exception -> 0x00e4 }
            int r2 = com.bytedance.android.livesdk.browser.b.f9299d     // Catch:{ Exception -> 0x00e4 }
            if (r2 <= 0) goto L_0x00e4
            android.view.View r2 = r3.getRootView()     // Catch:{ Exception -> 0x00e4 }
            boolean r3 = r2 instanceof android.view.ViewGroup     // Catch:{ Exception -> 0x00e4 }
            if (r3 == 0) goto L_0x00e4
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3     // Catch:{ Exception -> 0x00e4 }
            android.view.View r3 = r3.getChildAt(r8)     // Catch:{ Exception -> 0x00e4 }
            r3.setDrawingCacheEnabled(r5)     // Catch:{ Exception -> 0x00e4 }
            android.graphics.Bitmap r4 = r3.getDrawingCache()     // Catch:{ Exception -> 0x00e4 }
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4)     // Catch:{ Exception -> 0x00e4 }
            r3.setDrawingCacheEnabled(r8)     // Catch:{ Exception -> 0x00e4 }
            android.widget.ImageView r3 = new android.widget.ImageView     // Catch:{ Exception -> 0x00e4 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00e4 }
            r3.setImageBitmap(r4)     // Catch:{ Exception -> 0x00e4 }
            r3.setVisibility(r8)     // Catch:{ Exception -> 0x00e4 }
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2     // Catch:{ Exception -> 0x00e4 }
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams     // Catch:{ Exception -> 0x00e4 }
            r4 = -1
            r1.<init>(r4, r4)     // Catch:{ Exception -> 0x00e4 }
            r2.addView(r3, r1)     // Catch:{ Exception -> 0x00e4 }
        L_0x00e4:
            com.bytedance.common.utility.Logger.debug()
        L_0x00e7:
            android.os.Handler r1 = r7.ao
            if (r1 == 0) goto L_0x00fd
            if (r0 == 0) goto L_0x00fd
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x00fd
            android.os.Handler r0 = r7.ao
            r1 = 10011(0x271b, float:1.4028E-41)
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r0.sendEmptyMessageDelayed(r1, r2)
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment.onPause():void");
    }

    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3493, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3493, new Class[0], Void.TYPE);
            return;
        }
        super.onStop();
        if (this.ah != null) {
            com.bytedance.android.live.uikit.toast.a aVar = this.ah;
            if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.live.uikit.toast.a.f8696a, false, 2419, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.live.uikit.toast.a.f8696a, false, 2419, new Class[0], Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[0], aVar, com.bytedance.android.live.uikit.toast.a.f8696a, false, 2420, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], aVar, com.bytedance.android.live.uikit.toast.a.f8696a, false, 2420, new Class[0], Void.TYPE);
                } else {
                    aVar.dismiss();
                    aVar.f8699d.clearAnimation();
                    aVar.f8697b = null;
                    com.bytedance.android.live.uikit.toast.b a2 = com.bytedance.android.live.uikit.toast.b.a();
                    if (PatchProxy.isSupport(new Object[]{aVar}, a2, com.bytedance.android.live.uikit.toast.b.f8704a, false, 2428, new Class[]{com.bytedance.android.live.uikit.toast.a.class}, Void.TYPE)) {
                        com.bytedance.android.live.uikit.toast.b bVar = a2;
                        PatchProxy.accessDispatch(new Object[]{aVar}, bVar, com.bytedance.android.live.uikit.toast.b.f8704a, false, 2428, new Class[]{com.bytedance.android.live.uikit.toast.a.class}, Void.TYPE);
                    } else {
                        a2.f8706b.remove(aVar);
                        while (a2.f8706b.contains(aVar)) {
                            a2.f8706b.remove(aVar);
                        }
                    }
                }
            }
            this.ah = null;
        }
    }

    public final void a(String str) {
        this.av = str;
    }

    public final void a(com.bytedance.android.livesdk.browser.g.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f9357a, false, 3528, new Class[]{com.bytedance.android.livesdk.browser.g.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f9357a, false, 3528, new Class[]{com.bytedance.android.livesdk.browser.g.b.class}, Void.TYPE);
            return;
        }
        this.ai = bVar;
        this.Z.setVisibility(0);
    }

    private void a(boolean z2) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f9357a, false, 3505, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f9357a, false, 3505, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z2) {
            str = "top_tab";
        } else {
            str = "back";
        }
        String str2 = str;
        boolean z3 = this.Y;
        HashMap hashMap = new HashMap();
        hashMap.put("is_loaded", String.valueOf(z3 ? 1 : 0));
        com.bytedance.android.livesdk.j.a.a().a("ad_exit", hashMap, new com.bytedance.android.livesdk.j.c.j().b("video").f("click").a("add").c(str2));
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9357a, false, 3533, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9357a, false, 3533, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(this.av)) {
            com.bytedance.android.live.core.d.e.a(this.av, i2, this.T);
            this.av = null;
            this.T = null;
        }
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f9357a, false, 3519, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f9357a, false, 3519, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 10011 && !this.f8192e && this.y != null) {
            try {
                this.y.getSettings().setBlockNetworkLoads(true);
            } catch (Exception unused) {
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f9357a, false, 3517, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f9357a, false, 3517, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.K = true;
        if (!this.k) {
            this.z.setVisibility(8);
        } else if (this.z != null) {
            this.z.setProgress(i2);
            this.ao.removeCallbacks(this.ap);
            if (this.z.getVisibility() != 0 && !this.V) {
                this.z.setVisibility(0);
            }
        }
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f9357a, false, 3516, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f9357a, false, 3516, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(ax, this, this, view));
        int id = view.getId();
        if (id == C0906R.id.p3 || id == C0906R.id.cex || id == C0906R.id.p_) {
            if (this.ai != null) {
                TTLiveSDKContext.getHostService().g().a((Activity) getActivity(), com.bytedance.android.livesdkapi.depend.h.b.a().c(this.ai.f9404d).a(this.ai.f9402b).b(this.ai.f9403c).a());
            }
        } else if (id == C0906R.id.p9) {
            c();
        }
    }

    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f9357a, false, 3531, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f9357a, false, 3531, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.browser.h.c cVar = this.O;
        if (PatchProxy.isSupport(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3803, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3803, new Class[0], Void.TYPE);
            return;
        }
        cVar.a(1, 0, "");
    }

    public void onCreate(Bundle bundle) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f9357a, false, 3488, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f9357a, false, 3488, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        if (TTLiveSDKContext.getHostService() == null) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.aj = TTLiveSDKContext.getHostService().k();
        this.ak = j.q().h().a();
        this.D = TTLiveSDKContext.getHostService().m();
        if (Build.VERSION.SDK_INT >= 19 && ((Boolean) com.bytedance.android.livesdk.browser.a.i.a()).booleanValue()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        a(TTLiveSDKContext.getHostService().k().g().subscribe((Consumer<? super T>) new b<Object>(this)));
        Bundle arguments = getArguments();
        if (PatchProxy.isSupport(new Object[]{arguments}, this, f9357a, false, 3495, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{arguments}, this, f9357a, false, 3495, new Class[]{Bundle.class}, Void.TYPE);
        } else {
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.getBoolean("from_notification", false);
            String string = arguments.getString(PushConstants.WEB_URL);
            if (!TextUtils.isEmpty(string)) {
                Uri parse = Uri.parse(string);
                this.j = !arguments.getBoolean("bundle_disable_full_screen_web", false);
                if (this.i == 0) {
                    this.ad = false;
                }
                if (parse != null) {
                    try {
                        if (parse.getQueryParameter("hide_nav_bar") != null) {
                            if (Integer.parseInt(parse.getQueryParameter("hide_nav_bar")) == 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            this.B = z5;
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                if (!(parse == null || parse.getQueryParameter("hide_status_bar") == null)) {
                    if (Integer.parseInt(parse.getQueryParameter("hide_status_bar")) == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.ac = z4;
                }
                if (!(parse == null || parse.getQueryParameter("hide_more") == null)) {
                    if (Integer.parseInt(parse.getQueryParameter("hide_more")) == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.ad = z3;
                }
                if (!(parse == null || parse.getQueryParameter("trans_status_bar") == null)) {
                    if (Integer.parseInt(parse.getQueryParameter("trans_status_bar")) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.ae = z2;
                }
                if (!this.ac) {
                    this.ac = arguments.getBoolean("hide_status_bar", false);
                }
                if (!this.B) {
                    this.B = arguments.getBoolean("hide_nav_bar", false);
                }
                if (!this.ad) {
                    this.ad = arguments.getBoolean("hide_more", false);
                }
                if (!this.ae) {
                    this.ae = arguments.getBoolean("trans_status_bar", false);
                }
                this.V = !arguments.getBoolean("show_progress", false);
                this.af = arguments.getInt("bundle_web_view_background_color", Color.parseColor("#ffffff"));
                Bundle arguments2 = getArguments();
                if (arguments2 == null) {
                    arguments2 = new Bundle();
                }
                if (arguments2 != null) {
                    arguments2.getString(PushConstants.WEB_URL);
                    boolean z6 = arguments2.getBoolean("bundle_is_direct_jump", false);
                    this.at = arguments2.getString("referer");
                    this.W = arguments2.getInt("orientation", 1);
                    this.i = arguments2.getLong("ad_id", 0);
                    if (this.i > 0 && !z6) {
                        this.W = 0;
                    }
                    this.X = arguments2.getBoolean("hide_more", false);
                    arguments2.getInt("bundle_commodity_type", -1);
                }
                String str = null;
                if (arguments2 != null) {
                    str = arguments2.getString(PushConstants.TITLE);
                }
                if (!(!StringUtils.isEmpty(str) || getActivity() == null || getActivity().getResources() == null)) {
                    try {
                        str = getActivity().getResources().getString(C0906R.string.dk4);
                    } catch (Exception unused2) {
                        if (com.bytedance.android.live.uikit.a.a.f()) {
                            str = "网页浏览";
                        }
                    }
                }
                this.h = str;
                if (!(parse == null || parse.getQueryParameter("bundle_sale_show_status") == null)) {
                    this.ag = Integer.parseInt(parse.getQueryParameter("bundle_sale_show_status"));
                }
            }
        }
        this.ao = new WeakHandler(this);
        this.ap = new d(this);
        this.L = ((Boolean) com.bytedance.android.livesdk.browser.a.f9281d.a()).booleanValue();
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            this.as = arguments3.getBoolean("bundle_no_hw_acceleration", false);
            this.an = arguments3.getBoolean("bundle_enable_app_cache", false);
            this.au = arguments3.getString(PushConstants.WEB_URL);
            if (this.au == null) {
                this.au = "";
            }
            this.at = arguments3.getString("referer");
            this.I = arguments3.getBoolean("bundle_user_webview_title", false);
            String string2 = arguments3.getString("wap_headers");
            try {
                if (!StringUtils.isEmpty(string2)) {
                    this.aq = new JSONObject(string2);
                }
            } catch (JSONException unused3) {
            }
            this.H = arguments3.getInt("bundle_commodity_type", -1);
            this.am = arguments3.getBoolean("bundle_load_no_cache", false);
        }
        if (!this.as) {
            this.as = false;
        }
    }

    public final void a(Disposable disposable) {
        Disposable disposable2 = disposable;
        if (PatchProxy.isSupport(new Object[]{disposable2}, this, f9357a, false, 3510, new Class[]{Disposable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{disposable2}, this, f9357a, false, 3510, new Class[]{Disposable.class}, Void.TYPE);
            return;
        }
        this.ab.add(disposable2);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9357a, false, 3518, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f9357a, false, 3518, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.z != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.z.getLayoutParams();
            marginLayoutParams.leftMargin = i2;
            marginLayoutParams.rightMargin = i3;
            this.z.setLayoutParams(marginLayoutParams);
        }
    }

    public void onActivityResult(int i2, int i3, @Nullable Intent intent) {
        Throwable th;
        Throwable th2;
        Uri uri;
        int i4 = i2;
        int i5 = i3;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f9357a, false, 3496, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f9357a, false, 3496, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i2, i3, intent);
        String str = null;
        if (this.C != null) {
            b bVar = this.C;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, bVar, com.bytedance.android.livesdk.browser.a.b.f9286a, false, 3402, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, bVar, com.bytedance.android.livesdk.browser.a.b.f9286a, false, 3402, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            } else if ((i4 == 2048 && bVar.f9287b != null) || bVar.f9288c != null) {
                if (i5 != 0 || !bVar.f9290e) {
                    if (intent2 == null || i5 != -1) {
                        uri = null;
                    } else {
                        uri = intent.getData();
                    }
                    if (uri == null && intent2 == null && i5 == -1) {
                        File file = new File(bVar.f9289d);
                        if (file.exists()) {
                            uri = Uri.fromFile(file);
                            bVar.a().sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", uri));
                        }
                    }
                    if (bVar.f9287b != null) {
                        bVar.f9287b.onReceiveValue(uri);
                    }
                    if (bVar.f9288c != null) {
                        bVar.f9288c.onReceiveValue(uri == null ? null : new Uri[]{uri});
                    }
                    bVar.f9290e = false;
                    bVar.f9287b = null;
                    bVar.f9288c = null;
                } else {
                    bVar.f9290e = false;
                }
            }
        }
        if (this.E != null) {
            ad adVar = this.E;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, adVar, ad.f9514a, false, 3717, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, adVar, ad.f9514a, false, 3717, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            } else if (adVar.f9515b != null) {
                adVar.f9515b.a(i4, i5, intent2);
            }
        }
        if (this.F != null) {
            ae aeVar = this.F;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, aeVar, ae.f9529a, false, 3724, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, aeVar, ae.f9529a, false, 3724, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
                return;
            } else if (9001 == i4) {
                if (-1 != i5 || intent2 == null || intent.getData() == null) {
                    aeVar.b();
                    return;
                }
                FragmentActivity activity = aeVar.f9531c.getActivity();
                if (activity == null) {
                    aeVar.b();
                    return;
                }
                Uri data = intent.getData();
                if (TextUtils.equals(PushConstants.CONTENT, data.getScheme())) {
                    Cursor query = activity.getContentResolver().query(data, new String[]{"_data"}, null, null, null);
                    if (query != null) {
                        try {
                            query.moveToFirst();
                            str = query.getString(0);
                        } catch (Throwable th3) {
                            com.google.a.a.a.a.a.a.a(th, th3);
                        }
                    }
                    if (query != null) {
                        query.close();
                    }
                } else {
                    str = intent.getData().getPath();
                }
                if (TextUtils.isEmpty(str)) {
                    aeVar.b();
                    return;
                }
                File file2 = new File(str);
                if (!file2.exists()) {
                    aeVar.b();
                    return;
                }
                aeVar.f9532d = ProgressDialog.show(activity, ac.a((int) C0906R.string.db2), ac.a((int) C0906R.string.db1), true, false);
                if (!file2.exists()) {
                    aeVar.b();
                    return;
                }
                f.a(aeVar.f9531c.getActivity()).a(new com.bytedance.android.livesdk.m.b.d(file2) {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f9538a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ File f9539b;

                    public final void b(String... strArr) {
                    }

                    public final void a(String... strArr) {
                        if (PatchProxy.isSupport(new Object[]{strArr}, this, f9538a, false, 3730, new Class[]{String[].class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{strArr}, this, f9538a, false, 3730, new Class[]{String[].class}, Void.TYPE);
                            return;
                        }
                        ae aeVar = ae.this;
                        File file = this.f9539b;
                        if (PatchProxy.isSupport(new Object[]{file}, aeVar, ae.f9529a, false, 3725, new Class[]{File.class}, Void.TYPE)) {
                            Object[] objArr = {file};
                            ae aeVar2 = aeVar;
                            ChangeQuickRedirect changeQuickRedirect = ae.f9529a;
                            PatchProxy.accessDispatch(objArr, aeVar2, changeQuickRedirect, false, 3725, new Class[]{File.class}, Void.TYPE);
                            return;
                        }
                        com.bytedance.retrofit2.mime.d dVar = new com.bytedance.retrofit2.mime.d();
                        dVar.a("data", new e("multipart/form-data", file));
                        ((UploadApi) j.q().d().a(UploadApi.class)).upload(dVar).compose(i.a()).subscribe((SingleObserver<? super T>) new SingleObserver<com.bytedance.android.live.core.network.response.d<com.bytedance.android.live.base.model.user.j>>(file.getAbsolutePath()) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f9541a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ String f9542b;

                            public final void onSubscribe(Disposable disposable) {
                                ae.this.f9530b = disposable;
                            }

                            public final void onError(Throwable th) {
                                if (PatchProxy.isSupport(new Object[]{th}, this, f9541a, false, 3732, new Class[]{Throwable.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{th}, this, f9541a, false, 3732, new Class[]{Throwable.class}, Void.TYPE);
                                    return;
                                }
                                if (ae.this.f9531c != null) {
                                    Context context = ae.this.f9531c.getContext();
                                    if (context != null) {
                                        com.bytedance.android.live.core.network.b.a.a(context, th);
                                    }
                                }
                                ae.this.b();
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                com.bytedance.android.live.core.network.response.d dVar = (com.bytedance.android.live.core.network.response.d) obj;
                                if (PatchProxy.isSupport(new Object[]{dVar}, this, f9541a, false, 3731, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{dVar}, this, f9541a, false, 3731, new Class[]{com.bytedance.android.live.core.network.response.d.class}, Void.TYPE);
                                    return;
                                }
                                ae aeVar = ae.this;
                                com.bytedance.android.live.base.model.user.j jVar = (com.bytedance.android.live.base.model.user.j) dVar.f7871b;
                                String str = this.f9542b;
                                if (PatchProxy.isSupport(new Object[]{jVar, str}, aeVar, ae.f9529a, false, 3726, new Class[]{com.bytedance.android.live.base.model.user.j.class, String.class}, Void.TYPE)) {
                                    Object[] objArr = {jVar, str};
                                    ae aeVar2 = aeVar;
                                    ChangeQuickRedirect changeQuickRedirect = ae.f9529a;
                                    PatchProxy.accessDispatch(objArr, aeVar2, changeQuickRedirect, false, 3726, new Class[]{com.bytedance.android.live.base.model.user.j.class, String.class}, Void.TYPE);
                                    return;
                                }
                                if (aeVar.f9532d != null) {
                                    aeVar.f9532d.dismiss();
                                    aeVar.f9532d = null;
                                }
                                try {
                                    a aVar = new a(1, jVar.f7770a, j.q().h().e().a(str), (byte) 0);
                                    aeVar.f9533e.f20643d.a("H5_uploadVideoStatus", aVar);
                                    aeVar.a(aVar);
                                } catch (Exception unused) {
                                }
                            }

                            {
                                this.f9542b = r2;
                            }
                        });
                    }

                    {
                        this.f9539b = r2;
                    }
                }, "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
            }
        }
        return;
        throw th2;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        WebSettings webSettings;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        int i2 = 2;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f9357a, false, 3490, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f9357a, false, 3490, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.aeu, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f9357a, false, 3489, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f9357a, false, 3489, new Class[]{View.class}, Void.TYPE);
        } else {
            this.r = inflate.findViewById(C0906R.id.ci4);
            this.s = inflate.findViewById(C0906R.id.d3m);
            View findViewById = inflate.findViewById(C0906R.id.d3p);
            View findViewById2 = inflate.findViewById(C0906R.id.d6n);
            findViewById2.setVisibility(8);
            View findViewById3 = this.s.findViewById(C0906R.id.iu);
            this.t = (TextView) this.s.findViewById(C0906R.id.cex);
            this.u = (TextView) this.s.findViewById(C0906R.id.title);
            if (findViewById3 != null) {
                findViewById3.setOnClickListener(new e(this));
            }
            this.u.setText(this.h);
            this.t.setOnClickListener(this.aw);
            this.aa = (ViewGroup) inflate.findViewById(C0906R.id.dx3);
            this.z = (ProgressBar) inflate.findViewById(C0906R.id.cu0);
            if (this.V) {
                this.z.setVisibility(8);
            }
            this.v = (FullscreenVideoFrame) inflate.findViewById(C0906R.id.a26);
            this.v.setListener(new f(this));
            findViewById3.setOnClickListener(this.aw);
            if (this.X) {
                this.t.setVisibility(4);
            }
            if (!this.j || this.i <= 0) {
                this.Z = inflate.findViewById(C0906R.id.p3);
            } else {
                this.Z = inflate.findViewById(C0906R.id.p_);
                if (g.a(getContext())) {
                    if (Build.VERSION.SDK_INT >= 21 && getActivity() != null) {
                        getActivity().getWindow().setStatusBarColor(-16777216);
                    }
                } else if (getActivity() != null) {
                    getActivity().getWindow().setFlags(1024, 1024);
                }
                e();
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                ((ImageView) inflate.findViewById(C0906R.id.p9)).setOnClickListener(this);
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.u.getLayoutParams();
            marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(getContext(), 50.0f);
            marginLayoutParams.rightMargin = (int) UIUtils.dip2Px(getContext(), 50.0f);
            this.u.setLayoutParams(marginLayoutParams);
            this.u.setSingleLine(true);
            this.u.setEllipsize(TextUtils.TruncateAt.END);
            if (this.B) {
                this.s.setVisibility(8);
                findViewById.setVisibility(8);
                this.u.setVisibility(8);
            }
            TextView textView = (TextView) inflate.findViewById(C0906R.id.cex);
            textView.setVisibility(8);
            if (this.ag != -1) {
                switch (this.ag) {
                    case 0:
                        textView.setText(C0906R.string.cw4);
                        textView.setTextColor(getResources().getColor(C0906R.color.aej));
                        textView.setVisibility(0);
                        break;
                    case 1:
                        this.Z.setBackgroundResource(2130841338);
                        this.Z.setVisibility(0);
                        break;
                    case 2:
                        textView.setText(C0906R.string.cw5);
                        textView.setTextColor(getResources().getColor(C0906R.color.aej));
                        textView.setVisibility(0);
                        break;
                }
            }
            textView.setOnClickListener(this);
            this.Z.setOnClickListener(this);
            if (this.aj != null) {
                a(this.aj.d().onBackpressureLatest().filter(g.f9383b).subscribe((Consumer<? super T>) new h<Object>(this)));
            }
        }
        j.q().f().a((com.bytedance.android.livesdk.browser.jsbridge.a) this);
        this.P = System.currentTimeMillis();
        this.T.put("webview_cache", Integer.valueOf(j.q().f().a() ? 1 : 0));
        try {
            this.y = j.q().f().a(getContext());
        } catch (Exception unused) {
        }
        if (this.y == null) {
            return inflate;
        }
        this.aa.addView(this.y);
        this.y.setScrollBarStyle(0);
        this.y.setBackgroundColor(this.af);
        CookieManager.getInstance().setAcceptCookie(true);
        this.y.setVerticalScrollBarEnabled(false);
        com.bytedance.android.livesdk.browser.view.a.a((Context) getActivity()).a(!this.as).a(this.y);
        this.C = new b();
        if (this.am) {
            webSettings = this.y.getSettings();
        } else {
            webSettings = this.y.getSettings();
            if (this.an) {
                i2 = 1;
            } else {
                i2 = -1;
            }
        }
        webSettings.setCacheMode(i2);
        this.T.put("page_cache", Integer.valueOf(this.y.getSettings().getCacheMode()));
        this.M = com.bytedance.android.livesdk.browser.jsbridge.b.a(getActivity(), this.y, new c(null), this.C);
        if (this.n != null) {
            this.n.a(this.M);
        }
        if (PatchProxy.isSupport(new Object[0], this, f9357a, false, 3529, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9357a, false, 3529, new Class[0], Void.TYPE);
        } else {
            if (this.f9359c) {
                this.M.a().a("shareInfo", (c.b) new i(this));
            }
            this.M.a().a("uploadPhoto", (c.b) new j(this));
            this.M.a().a("uploadVideo", (c.b) new c(this));
            this.al = new com.bytedance.android.livesdk.browser.jsbridge.c.d(new WeakReference(this));
            this.M.c().a("ttliveMonitorPage", (com.bytedance.ies.f.a.d) this.al);
        }
        this.R = System.currentTimeMillis();
        if (this.aq == null || this.aq.length() <= 0) {
            com.bytedance.android.livesdk.utils.a.a(this.au, this.y, this.at, true);
        } else {
            HashMap hashMap = new HashMap();
            com.bytedance.android.livesdk.utils.a.a(hashMap, (String) null, this.aq);
            com.bytedance.android.livesdk.utils.a.a(this.au, this.y, (Map<String, String>) hashMap);
        }
        if (this.y instanceof SSWebView) {
            this.ar = ((SSWebView) this.y).getClickHelper();
        }
        this.O = new com.bytedance.android.livesdk.browser.h.c(this.f9358b, this.au, this.o);
        com.bytedance.android.livesdk.browser.h.c cVar = this.O;
        if (PatchProxy.isSupport(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3802, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], cVar, com.bytedance.android.livesdk.browser.h.c.f9414a, false, 3802, new Class[0], Void.TYPE);
        } else {
            cVar.a(0, 0, "");
        }
        return inflate;
    }
}

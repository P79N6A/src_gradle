package com.ss.android.ugc.aweme.commercialize.c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.support.annotation.RequiresApi;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0003J\u001c\u0010\u001d\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0016J&\u0010\u001e\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0017J.\u0010!\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\b2\b\u0010'\u001a\u0004\u0018\u00010\bH\u0016J&\u0010(\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J&\u0010+\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010\"\u001a\u0004\u0018\u00010.H\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\fR\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/listener/AdHalfWebPageLoadListener;", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "listener", "Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;", "strictMode", "", "(Lcom/ss/android/ugc/aweme/commercialize/listener/SimplePageLoadListener;Z)V", "TAG", "", "kotlin.jvm.PlatformType", "loadError", "getLoadError", "()Z", "setLoadError", "(Z)V", "loadFinished", "getLoadFinished", "setLoadFinished", "loadSuccess", "getLoadSuccess", "simplePageLoadListener", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "isFavIcon", "request", "Landroid/webkit/WebResourceRequest;", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38522a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38523b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38524c;

    /* renamed from: d  reason: collision with root package name */
    private final String f38525d = getClass().getClass().getSimpleName();

    /* renamed from: e  reason: collision with root package name */
    private f f38526e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38527f = false;

    public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
    }

    public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
    }

    public final void b(@Nullable WebView webView, @Nullable String str) {
    }

    public a(@Nullable f fVar, boolean z) {
        this.f38526e = fVar;
    }

    public final void a(@Nullable WebView webView, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f38522a, false, 30962, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f38522a, false, 30962, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        if (!this.f38523b) {
            this.f38523b = true;
            f fVar = this.f38526e;
            if (fVar != null) {
                fVar.k();
            }
        }
    }

    @RequiresApi(23)
    public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceError}, this, f38522a, false, 30964, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceError}, this, f38522a, false, 30964, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
            return;
        }
        f fVar = this.f38526e;
        if (fVar != null) {
            fVar.j();
        }
        this.f38524c = true;
    }

    @RequiresApi(21)
    public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f38522a, false, 30965, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f38522a, false, 30965, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
            return;
        }
        if (this.f38527f) {
            if (PatchProxy.isSupport(new Object[]{webResourceRequest}, this, f38522a, false, 30966, new Class[]{WebResourceRequest.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{webResourceRequest}, this, f38522a, false, 30966, new Class[]{WebResourceRequest.class}, Boolean.TYPE)).booleanValue();
            } else if (webResourceRequest != null) {
                Uri url = webResourceRequest.getUrl();
                if (url != null) {
                    String path = url.getPath();
                    if (path != null) {
                        z = StringsKt.endsWith$default(path, "favicon.ico", false, 2, null);
                    }
                }
            }
            if (!z) {
                f fVar = this.f38526e;
                if (fVar != null) {
                    fVar.j();
                }
                this.f38524c = true;
            }
        }
    }

    public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
        if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f38522a, false, 30963, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f38522a, false, 30963, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        f fVar = this.f38526e;
        if (fVar != null) {
            fVar.j();
        }
        this.f38524c = true;
    }
}

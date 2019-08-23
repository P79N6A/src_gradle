package com.ss.sys.ck;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.webkit.JsPromptResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ss.sys.ck.a.e;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class SCWebView extends WebView {

    /* renamed from: a  reason: collision with root package name */
    Context f78522a;

    /* renamed from: b  reason: collision with root package name */
    private int f78523b;

    /* renamed from: c  reason: collision with root package name */
    private int f78524c;

    /* renamed from: d  reason: collision with root package name */
    private int f78525d;

    /* renamed from: e  reason: collision with root package name */
    private int f78526e;

    /* renamed from: f  reason: collision with root package name */
    private float[] f78527f = {4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f};

    public class a extends WebChromeClient {

        /* renamed from: b  reason: collision with root package name */
        private SCWebView f78529b;

        a(SCWebView sCWebView) {
            this.f78529b = sCWebView;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!str2.equals(b.f78565a)) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            jsPromptResult.confirm();
            new e.a(str3).start();
            return true;
        }
    }

    public class b extends WebViewClient {

        /* renamed from: b  reason: collision with root package name */
        private SCWebView f78531b;

        b(SCWebView sCWebView) {
            this.f78531b = sCWebView;
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            SCCheckListener listener = SCCheckUtils.getInstance().getListener();
            if (listener != null) {
                listener.dialogOnReady();
            }
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            try {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (Throwable unused) {
            }
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            try {
                if (Build.VERSION.SDK_INT >= 21 && !webResourceRequest.isForMainFrame() && webResourceRequest.getUrl().getPath().endsWith("/favicon.ico")) {
                    return new WebResourceResponse("image/png", null, null);
                }
            } catch (Exception unused) {
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|(1:7)|8|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0010  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onReceivedError(android.webkit.WebView r1, int r2, java.lang.String r3, java.lang.String r4) {
            /*
                r0 = this;
                r1.stopLoading()     // Catch:{ Exception -> 0x0003 }
            L_0x0003:
                r1.clearView()     // Catch:{ Exception -> 0x0006 }
            L_0x0006:
                com.ss.sys.ck.SCCheckUtils r3 = com.ss.sys.ck.SCCheckUtils.getInstance()
                com.ss.sys.ck.SCCheckListener r3 = r3.getListener()
                if (r3 == 0) goto L_0x001f
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r3.dialogOnError(r2)
            L_0x001f:
                java.lang.String r2 = "about:blank"
                com.ss.android.ugc.aweme.lancet.c.a(r2)
                r1.loadUrl(r2)
                com.ss.sys.ck.SCCheckUtils r1 = com.ss.sys.ck.SCCheckUtils.getInstance()
                r1.netWorkError()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ck.SCWebView.b.onReceivedError(android.webkit.WebView, int, java.lang.String, java.lang.String):void");
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            }
            if (!str.startsWith("jsbridge://")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            c.a(webView, str);
            return true;
        }
    }

    public SCWebView(Context context) {
        super(context);
        this.f78522a = context;
        a();
        b();
    }

    public SCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78522a = context;
        a();
        b();
    }

    public SCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f78522a = context;
        a();
        b();
    }

    private void b() {
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
    }

    public final void a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        onResume();
        setWebChromeClient(new a(this));
        setWebViewClient(new b(this));
        clearCache(true);
        clearHistory();
    }

    public void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT <= 26) {
            this.f78525d = getScrollX();
            this.f78526e = getScrollY();
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, (float) this.f78526e, (float) (this.f78525d + this.f78523b), (float) (this.f78526e + this.f78524c)), this.f78527f, Path.Direction.CW);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != 0) {
            this.f78523b = getMeasuredWidth();
        }
        if (getMeasuredHeight() != 0) {
            this.f78524c = getMeasuredHeight();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }
}

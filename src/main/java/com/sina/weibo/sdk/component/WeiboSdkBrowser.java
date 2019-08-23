package com.sina.weibo.sdk.component;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sina.weibo.sdk.auth.AuthInfo;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.component.view.LoadingBar;
import com.sina.weibo.sdk.exception.WeiboException;
import com.sina.weibo.sdk.net.AsyncWeiboRunner;
import com.sina.weibo.sdk.net.RequestListener;
import com.sina.weibo.sdk.net.WeiboParameters;
import com.sina.weibo.sdk.utils.LogUtil;
import com.sina.weibo.sdk.utils.NetworkHelper;
import com.sina.weibo.sdk.utils.ResourceManager;
import com.sina.weibo.sdk.utils.Utility;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class WeiboSdkBrowser extends Activity implements BrowserRequestCallBack {
    public static final String TAG = "com.sina.weibo.sdk.component.WeiboSdkBrowser";
    public boolean isErrorPage;
    public boolean isLoading;
    public String mHtmlTitle;
    private TextView mLeftBtn;
    private Button mLoadErrorRetryBtn;
    private LinearLayout mLoadErrorView;
    public LoadingBar mLoadingBar;
    public BrowserRequestParamBase mRequestParam;
    private String mSpecifyTitle;
    private TextView mTitleText;
    public String mUrl;
    private WebView mWebView;
    private WeiboWebViewClient mWeiboWebViewClient;

    class WeiboChromeClient extends WebChromeClient {
        private WeiboChromeClient() {
        }

        /* synthetic */ WeiboChromeClient(WeiboSdkBrowser weiboSdkBrowser, WeiboChromeClient weiboChromeClient) {
            this();
        }

        public void onReceivedTitle(WebView webView, String str) {
            if (!WeiboSdkBrowser.this.isWeiboCustomScheme(WeiboSdkBrowser.this.mUrl)) {
                WeiboSdkBrowser.this.mHtmlTitle = str;
                WeiboSdkBrowser.this.updateTitleName();
            }
        }

        public void onProgressChanged(WebView webView, int i) {
            WeiboSdkBrowser.this.mLoadingBar.drawProgress(i);
            if (i == 100) {
                WeiboSdkBrowser.this.isLoading = false;
                WeiboSdkBrowser.this.refreshAllViews();
                return;
            }
            if (!WeiboSdkBrowser.this.isLoading) {
                WeiboSdkBrowser.this.isLoading = true;
                WeiboSdkBrowser.this.refreshAllViews();
            }
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            c.a(str);
            webView.loadUrl(str);
        }
    }

    public static void startShared(Context context, String str, AuthInfo authInfo, WeiboAuthListener weiboAuthListener) {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        NetworkHelper.clearCookies(this);
        super.onDestroy();
    }

    private void hiddenErrorPrompt() {
        this.mLoadErrorView.setVisibility(8);
        this.mWebView.setVisibility(0);
    }

    private void promptError() {
        this.mLoadErrorView.setVisibility(0);
        this.mWebView.setVisibility(8);
    }

    private void setViewNormal() {
        updateTitleName();
        this.mLoadingBar.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void refreshAllViews() {
        if (this.isLoading) {
            setViewLoading();
        } else {
            setViewNormal();
        }
    }

    private void setTopNavTitle() {
        this.mTitleText.setText(this.mSpecifyTitle);
        this.mLeftBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WeiboSdkBrowser.this.mRequestParam.execRequest(WeiboSdkBrowser.this, 3);
                WeiboSdkBrowser.this.finish();
            }
        });
    }

    private void setViewLoading() {
        this.mTitleText.setText(ResourceManager.getString(this, "Loading....", "加载中....", "載入中...."));
        this.mLoadingBar.setVisibility(0);
    }

    public void updateTitleName() {
        String str = "";
        if (!TextUtils.isEmpty(this.mHtmlTitle)) {
            str = this.mHtmlTitle;
        } else if (!TextUtils.isEmpty(this.mSpecifyTitle)) {
            str = this.mSpecifyTitle;
        }
        this.mTitleText.setText(str);
    }

    private void startShare() {
        LogUtil.d(TAG, "Enter startShare()............");
        final ShareRequestParam shareRequestParam = (ShareRequestParam) this.mRequestParam;
        if (shareRequestParam.hasImage()) {
            LogUtil.d(TAG, "loadUrl hasImage............");
            new AsyncWeiboRunner(this).requestAsync("http://service.weibo.com/share/mobilesdk_uppic.php", shareRequestParam.buildUploadPicParam(new WeiboParameters(shareRequestParam.getAppKey())), "POST", new RequestListener() {
                public void onWeiboException(WeiboException weiboException) {
                    String str = WeiboSdkBrowser.TAG;
                    LogUtil.d(str, "post onWeiboException " + weiboException.getMessage());
                    shareRequestParam.sendSdkErrorResponse(WeiboSdkBrowser.this, weiboException.getMessage());
                    WeiboSdkBrowser.this.finish();
                }

                public void onComplete(String str) {
                    LogUtil.d(WeiboSdkBrowser.TAG, "post onComplete : ".concat(String.valueOf(str)));
                    ShareRequestParam.UploadPicResult parse = ShareRequestParam.UploadPicResult.parse(str);
                    if (parse == null || parse.getCode() != 1 || TextUtils.isEmpty(parse.getPicId())) {
                        shareRequestParam.sendSdkErrorResponse(WeiboSdkBrowser.this, "upload pic faild");
                        WeiboSdkBrowser.this.finish();
                        return;
                    }
                    WeiboSdkBrowser.this.openUrl(shareRequestParam.buildUrl(parse.getPicId()));
                }
            });
            return;
        }
        openUrl(this.mUrl);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void initWebView() {
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        if (isWeiboShareRequestParam(this.mRequestParam)) {
            this.mWebView.getSettings().setUserAgentString(Utility.generateUA(this));
        }
        this.mWebView.getSettings().setSavePassword(false);
        this.mWebView.setWebViewClient(this.mWeiboWebViewClient);
        this.mWebView.setWebChromeClient(new WeiboChromeClient(this, null));
        this.mWebView.requestFocus();
        this.mWebView.setScrollBarStyle(0);
    }

    private void setContentView() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        relativeLayout.setBackgroundColor(-1);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        RelativeLayout relativeLayout2 = new RelativeLayout(this);
        relativeLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, ResourceManager.dp2px(this, 45)));
        relativeLayout2.setBackgroundDrawable(ResourceManager.getNinePatchDrawable(this, "weibosdk_navigationbar_background.9.png"));
        this.mLeftBtn = new TextView(this);
        this.mLeftBtn.setClickable(true);
        this.mLeftBtn.setTextSize(2, 17.0f);
        this.mLeftBtn.setTextColor(ResourceManager.createColorStateList(-32256, 1728020992));
        this.mLeftBtn.setText(ResourceManager.getString(this, "Close", "关闭", "关闭"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(5);
        layoutParams.addRule(15);
        layoutParams.leftMargin = ResourceManager.dp2px(this, 10);
        layoutParams.rightMargin = ResourceManager.dp2px(this, 10);
        this.mLeftBtn.setLayoutParams(layoutParams);
        relativeLayout2.addView(this.mLeftBtn);
        this.mTitleText = new TextView(this);
        this.mTitleText.setTextSize(2, 18.0f);
        this.mTitleText.setTextColor(-11382190);
        this.mTitleText.setEllipsize(TextUtils.TruncateAt.END);
        this.mTitleText.setSingleLine(true);
        this.mTitleText.setGravity(17);
        this.mTitleText.setMaxWidth(ResourceManager.dp2px(this, 160));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.mTitleText.setLayoutParams(layoutParams2);
        relativeLayout2.addView(this.mTitleText);
        TextView textView = new TextView(this);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, ResourceManager.dp2px(this, 2)));
        textView.setBackgroundDrawable(ResourceManager.getNinePatchDrawable(this, "weibosdk_common_shadow_top.9.png"));
        this.mLoadingBar = new LoadingBar(this);
        this.mLoadingBar.setBackgroundColor(0);
        this.mLoadingBar.drawProgress(0);
        this.mLoadingBar.setLayoutParams(new LinearLayout.LayoutParams(-1, ResourceManager.dp2px(this, 3)));
        linearLayout.addView(relativeLayout2);
        linearLayout.addView(textView);
        linearLayout.addView(this.mLoadingBar);
        this.mWebView = new WebView(this);
        this.mWebView.setBackgroundColor(-1);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.addRule(3, 1);
        this.mWebView.setLayoutParams(layoutParams3);
        this.mLoadErrorView = new LinearLayout(this);
        this.mLoadErrorView.setVisibility(8);
        this.mLoadErrorView.setOrientation(1);
        this.mLoadErrorView.setGravity(17);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams4.addRule(3, 1);
        this.mLoadErrorView.setLayoutParams(layoutParams4);
        ImageView imageView = new ImageView(this);
        imageView.setImageDrawable(ResourceManager.getDrawable(this, "weibosdk_empty_failed.png"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        int dp2px = ResourceManager.dp2px(this, 8);
        layoutParams5.bottomMargin = dp2px;
        layoutParams5.rightMargin = dp2px;
        layoutParams5.topMargin = dp2px;
        layoutParams5.leftMargin = dp2px;
        imageView.setLayoutParams(layoutParams5);
        this.mLoadErrorView.addView(imageView);
        TextView textView2 = new TextView(this);
        textView2.setGravity(1);
        textView2.setTextColor(-4342339);
        textView2.setTextSize(2, 14.0f);
        textView2.setText(ResourceManager.getString(this, "A network error occurs, please tap the button to reload", "网络出错啦，请点击按钮重新加载", "網路出錯啦，請點擊按鈕重新載入"));
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.mLoadErrorView.addView(textView2);
        this.mLoadErrorRetryBtn = new Button(this);
        this.mLoadErrorRetryBtn.setGravity(17);
        this.mLoadErrorRetryBtn.setTextColor(-8882056);
        this.mLoadErrorRetryBtn.setTextSize(2, 16.0f);
        this.mLoadErrorRetryBtn.setText(ResourceManager.getString(this, "channel_data_error", "重新加载", "重新載入"));
        this.mLoadErrorRetryBtn.setBackgroundDrawable(ResourceManager.createStateListDrawable(this, "weibosdk_common_button_alpha.9.png", "weibosdk_common_button_alpha_highlighted.9.png"));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(ResourceManager.dp2px(this, 142), ResourceManager.dp2px(this, 46));
        layoutParams6.topMargin = ResourceManager.dp2px(this, 10);
        this.mLoadErrorRetryBtn.setLayoutParams(layoutParams6);
        this.mLoadErrorRetryBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                WeiboSdkBrowser.this.openUrl(WeiboSdkBrowser.this.mUrl);
                WeiboSdkBrowser.this.isErrorPage = false;
            }
        });
        this.mLoadErrorView.addView(this.mLoadErrorRetryBtn);
        relativeLayout.addView(linearLayout);
        relativeLayout.addView(this.mWebView);
        relativeLayout.addView(this.mLoadErrorView);
        setContentView(relativeLayout);
        setTopNavTitle();
    }

    public void openUrl(String str) {
        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.mWebView, str);
    }

    private void installAuthWeiboWebViewClient(AuthRequestParam authRequestParam) {
        this.mWeiboWebViewClient = new AuthWeiboWebViewClient(this, authRequestParam);
        this.mWeiboWebViewClient.setBrowserRequestCallBack(this);
    }

    private void installShareWeiboWebViewClient(ShareRequestParam shareRequestParam) {
        ShareWeiboWebViewClient shareWeiboWebViewClient = new ShareWeiboWebViewClient(this, shareRequestParam);
        shareWeiboWebViewClient.setBrowserRequestCallBack(this);
        this.mWeiboWebViewClient = shareWeiboWebViewClient;
    }

    private void installWidgetWeiboWebViewClient(WidgetRequestParam widgetRequestParam) {
        WidgetWeiboWebViewClient widgetWeiboWebViewClient = new WidgetWeiboWebViewClient(this, widgetRequestParam);
        widgetWeiboWebViewClient.setBrowserRequestCallBack(this);
        this.mWeiboWebViewClient = widgetWeiboWebViewClient;
    }

    private boolean isWeiboShareRequestParam(BrowserRequestParamBase browserRequestParamBase) {
        if (browserRequestParamBase.getLauncher() == BrowserLauncher.SHARE) {
            return true;
        }
        return false;
    }

    public boolean isWeiboCustomScheme(String str) {
        if (!TextUtils.isEmpty(str) && "sinaweibo".equalsIgnoreCase(Uri.parse(str).getAuthority())) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.sina.weibo.sdk.component.WidgetRequestParam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.sina.weibo.sdk.component.WidgetRequestParam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.sina.weibo.sdk.component.ShareRequestParam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.sina.weibo.sdk.component.WidgetRequestParam} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.sina.weibo.sdk.component.WidgetRequestParam} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.sina.weibo.sdk.component.BrowserRequestParamBase createBrowserRequestParam(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key_launcher"
            java.io.Serializable r0 = r3.getSerializable(r0)
            com.sina.weibo.sdk.component.BrowserLauncher r0 = (com.sina.weibo.sdk.component.BrowserLauncher) r0
            com.sina.weibo.sdk.component.BrowserLauncher r1 = com.sina.weibo.sdk.component.BrowserLauncher.AUTH
            if (r0 != r1) goto L_0x0018
            com.sina.weibo.sdk.component.AuthRequestParam r0 = new com.sina.weibo.sdk.component.AuthRequestParam
            r0.<init>(r2)
            r0.setupRequestParam(r3)
            r2.installAuthWeiboWebViewClient(r0)
            return r0
        L_0x0018:
            com.sina.weibo.sdk.component.BrowserLauncher r1 = com.sina.weibo.sdk.component.BrowserLauncher.SHARE
            if (r0 != r1) goto L_0x0028
            com.sina.weibo.sdk.component.ShareRequestParam r0 = new com.sina.weibo.sdk.component.ShareRequestParam
            r0.<init>(r2)
            r0.setupRequestParam(r3)
            r2.installShareWeiboWebViewClient(r0)
            goto L_0x0039
        L_0x0028:
            com.sina.weibo.sdk.component.BrowserLauncher r1 = com.sina.weibo.sdk.component.BrowserLauncher.WIDGET
            if (r0 != r1) goto L_0x0038
            com.sina.weibo.sdk.component.WidgetRequestParam r0 = new com.sina.weibo.sdk.component.WidgetRequestParam
            r0.<init>(r2)
            r0.setupRequestParam(r3)
            r2.installWidgetWeiboWebViewClient(r0)
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sina.weibo.sdk.component.WeiboSdkBrowser.createBrowserRequestParam(android.os.Bundle):com.sina.weibo.sdk.component.BrowserRequestParamBase");
    }

    private boolean initDataFromIntent(Intent intent) {
        this.mRequestParam = createBrowserRequestParam(intent.getExtras());
        if (this.mRequestParam == null) {
            return false;
        }
        this.mUrl = this.mRequestParam.getUrl();
        if (TextUtils.isEmpty(this.mUrl)) {
            return false;
        }
        String str = TAG;
        LogUtil.d(str, "LOAD URL : " + this.mUrl);
        this.mSpecifyTitle = this.mRequestParam.getSpecifyTitle();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!initDataFromIntent(getIntent())) {
            finish();
            return;
        }
        setContentView();
        initWebView();
        if (isWeiboShareRequestParam(this.mRequestParam)) {
            startShare();
        } else {
            openUrl(this.mUrl);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        this.mRequestParam.execRequest(this, 3);
        finish();
        return true;
    }

    public void onPageFinishedCallBack(WebView webView, String str) {
        LogUtil.d(TAG, "onPageFinished URL: ".concat(String.valueOf(str)));
        if (this.isErrorPage) {
            promptError();
            return;
        }
        this.isErrorPage = false;
        hiddenErrorPrompt();
    }

    public boolean shouldOverrideUrlLoadingCallBack(WebView webView, String str) {
        LogUtil.i(TAG, "shouldOverrideUrlLoading URL: ".concat(String.valueOf(str)));
        return false;
    }

    public void onReceivedSslErrorCallBack(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        LogUtil.d(TAG, "onReceivedSslErrorCallBack.........");
    }

    public void onPageStartedCallBack(WebView webView, String str, Bitmap bitmap) {
        LogUtil.d(TAG, "onPageStarted URL: ".concat(String.valueOf(str)));
        this.mUrl = str;
        if (!isWeiboCustomScheme(str)) {
            this.mHtmlTitle = "";
        }
    }

    public static void closeBrowser(Activity activity, String str, String str2) {
        WeiboCallbackManager instance = WeiboCallbackManager.getInstance(activity.getApplicationContext());
        if (!TextUtils.isEmpty(str)) {
            instance.removeWeiboAuthListener(str);
            activity.finish();
        }
        if (!TextUtils.isEmpty(str2)) {
            instance.removeWidgetRequestCallback(str2);
            activity.finish();
        }
    }

    private void handleReceivedError(WebView webView, int i, String str, String str2) {
        if (!str2.startsWith("sinaweibo")) {
            this.isErrorPage = true;
            promptError();
        }
    }

    public static void startAuth(Context context, String str, AuthInfo authInfo, WeiboAuthListener weiboAuthListener) {
        AuthRequestParam authRequestParam = new AuthRequestParam(context);
        authRequestParam.setLauncher(BrowserLauncher.AUTH);
        authRequestParam.setUrl(str);
        authRequestParam.setAuthInfo(authInfo);
        authRequestParam.setAuthListener(weiboAuthListener);
        Intent intent = new Intent(context, WeiboSdkBrowser.class);
        intent.putExtras(authRequestParam.createRequestParamBundle());
        context.startActivity(intent);
    }

    public void onReceivedErrorCallBack(WebView webView, int i, String str, String str2) {
        String str3 = TAG;
        LogUtil.d(str3, "onReceivedError: errorCode = " + i + ", description = " + str + ", failingUrl = " + str2);
        handleReceivedError(webView, i, str, str2);
    }
}

package com.facebook.react.views.webview;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.ContentSizeChangeEvent;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.views.webview.events.TopLoadingErrorEvent;
import com.facebook.react.views.webview.events.TopLoadingFinishEvent;
import com.facebook.react.views.webview.events.TopLoadingStartEvent;
import com.facebook.react.views.webview.events.TopMessageEvent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.lancet.c;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import javax.annotation.Nullable;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;
import org.json.JSONException;
import org.json.JSONObject;

@ReactModule(name = "RCTWebView")
public class ReactWebViewManager extends SimpleViewManager<WebView> {
    @Nullable
    protected WebView.PictureListener mPictureListener;
    protected WebViewConfig mWebViewConfig;

    protected static class ReactWebView extends WebView implements LifecycleEventListener {
        @Nullable
        protected String injectedJS;
        @Nullable
        protected ReactWebViewClient mReactWebViewClient;
        protected boolean messagingEnabled;

        protected class ReactWebViewBridge {
            ReactWebView mContext;

            @JavascriptInterface
            public void postMessage(String str) {
                this.mContext.onMessage(str);
            }

            ReactWebViewBridge(ReactWebView reactWebView) {
                this.mContext = reactWebView;
            }
        }

        public void onHostPause() {
        }

        public void onHostResume() {
        }

        @Nullable
        public ReactWebViewClient getReactWebViewClient() {
            return this.mReactWebViewClient;
        }

        public void onHostDestroy() {
            cleanupCallbacksAndDestroy();
        }

        /* access modifiers changed from: protected */
        public void cleanupCallbacksAndDestroy() {
            setWebViewClient(null);
            destroy();
        }

        public void linkBridge() {
            if (this.messagingEnabled) {
                loadUrl("javascript:(window.originalPostMessage = window.postMessage,window.postMessage = function(data) {__REACT_WEB_VIEW_BRIDGE.postMessage(String(data));})");
            }
        }

        public void callInjectedJavaScript() {
            if (getSettings().getJavaScriptEnabled() && this.injectedJS != null && !TextUtils.isEmpty(this.injectedJS)) {
                loadUrl("javascript:(function() {\n" + this.injectedJS + ";\n})();");
            }
        }

        public ReactWebView(ThemedReactContext themedReactContext) {
            super(themedReactContext);
        }

        public void setInjectedJavaScript(@Nullable String str) {
            this.injectedJS = str;
        }

        /* access modifiers changed from: protected */
        public ReactWebViewBridge createReactWebViewBridge(ReactWebView reactWebView) {
            return new ReactWebViewBridge(reactWebView);
        }

        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.mReactWebViewClient = (ReactWebViewClient) webViewClient;
        }

        public void onMessage(String str) {
            ReactWebViewManager.dispatchEvent(this, new TopMessageEvent(getId(), str));
        }

        public void setMessagingEnabled(boolean z) {
            if (this.messagingEnabled != z) {
                this.messagingEnabled = z;
                if (z) {
                    addJavascriptInterface(createReactWebViewBridge(this), "__REACT_WEB_VIEW_BRIDGE");
                    linkBridge();
                    return;
                }
                removeJavascriptInterface("__REACT_WEB_VIEW_BRIDGE");
            }
        }
    }

    protected static class ReactWebViewClient extends WebViewClient {
        protected boolean mLastLoadFailed;
        @Nullable
        protected ReadableArray mUrlPrefixesForDefaultIntent;

        protected ReactWebViewClient() {
        }

        public void setUrlPrefixesForDefaultIntent(ReadableArray readableArray) {
            this.mUrlPrefixesForDefaultIntent = readableArray;
        }

        /* access modifiers changed from: protected */
        public void emitFinishEvent(WebView webView, String str) {
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingFinishEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (!this.mLastLoadFailed) {
                ReactWebView reactWebView = (ReactWebView) webView;
                reactWebView.callInjectedJavaScript();
                reactWebView.linkBridge();
                emitFinishEvent(webView, str);
            }
        }

        /* access modifiers changed from: protected */
        public WritableMap createWebViewEvent(WebView webView, String str) {
            boolean z;
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble("target", (double) webView.getId());
            createMap.putString(PushConstants.WEB_URL, str);
            if (this.mLastLoadFailed || webView.getProgress() == 100) {
                z = false;
            } else {
                z = true;
            }
            createMap.putBoolean("loading", z);
            createMap.putString(PushConstants.TITLE, webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean z;
            if (this.mUrlPrefixesForDefaultIntent != null && this.mUrlPrefixesForDefaultIntent.size() > 0) {
                Iterator<Object> it2 = this.mUrlPrefixesForDefaultIntent.toArrayList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (str.startsWith((String) it2.next())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (!z && (str.startsWith("http://") || str.startsWith("https://") || str.startsWith("file://") || str.equals("about:blank"))) {
                return false;
            }
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                webView.getContext().startActivity(intent);
            } catch (ActivityNotFoundException e2) {
                FLog.w("ReactNative", "activity not found to handle uri scheme for: " + str, (Throwable) e2);
            }
            return true;
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.mLastLoadFailed = false;
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingStartEvent(webView.getId(), createWebViewEvent(webView, str)));
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.mLastLoadFailed = true;
            emitFinishEvent(webView, str2);
            WritableMap createWebViewEvent = createWebViewEvent(webView, str2);
            createWebViewEvent.putDouble("code", (double) i);
            createWebViewEvent.putString("description", str);
            ReactWebViewManager.dispatchEvent(webView, new TopLoadingErrorEvent(webView.getId(), createWebViewEvent));
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

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str, Map map) {
            c.a(str);
            webView.loadUrl(str, map);
        }
    }

    public String getName() {
        return "RCTWebView";
    }

    public ReactWebViewManager() {
        this.mWebViewConfig = new WebViewConfig() {
            public void configWebView(WebView webView) {
            }
        };
    }

    /* access modifiers changed from: protected */
    public WebView.PictureListener getPictureListener() {
        if (this.mPictureListener == null) {
            this.mPictureListener = new WebView.PictureListener() {
                public void onNewPicture(WebView webView, Picture picture) {
                    ReactWebViewManager.dispatchEvent(webView, new ContentSizeChangeEvent(webView.getId(), webView.getWidth(), webView.getContentHeight()));
                }
            };
        }
        return this.mPictureListener;
    }

    @Nullable
    public Map<String, Integer> getCommandsMap() {
        return MapBuilder.of("goBack", 1, "goForward", 2, "reload", 3, "stopLoading", 4, "postMessage", 5, "injectJavaScript", 6);
    }

    public ReactWebViewManager(WebViewConfig webViewConfig) {
        this.mWebViewConfig = webViewConfig;
    }

    /* access modifiers changed from: protected */
    public ReactWebView createReactWebViewInstance(ThemedReactContext themedReactContext) {
        return new ReactWebView(themedReactContext);
    }

    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance(webView);
        ReactWebView reactWebView = (ReactWebView) webView;
        ((ThemedReactContext) webView.getContext()).removeLifecycleEventListener(reactWebView);
        reactWebView.cleanupCallbacksAndDestroy();
    }

    /* access modifiers changed from: protected */
    public WebView createViewInstance(ThemedReactContext themedReactContext) {
        ReactWebView createReactWebViewInstance = createReactWebViewInstance(themedReactContext);
        createReactWebViewInstance.setWebChromeClient(new WebChromeClient() {
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }

            public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
                callback.invoke(str, true, false);
            }
        });
        themedReactContext.addLifecycleEventListener(createReactWebViewInstance);
        this.mWebViewConfig.configWebView(createReactWebViewInstance);
        createReactWebViewInstance.getSettings().setBuiltInZoomControls(true);
        createReactWebViewInstance.getSettings().setDisplayZoomControls(false);
        createReactWebViewInstance.getSettings().setDomStorageEnabled(true);
        createReactWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return createReactWebViewInstance;
    }

    @ReactProp(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z);
    }

    @ReactProp(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z) {
        webView.getSettings().setDomStorageEnabled(z);
    }

    @ReactProp(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, @Nullable String str) {
        ((ReactWebView) webView).setInjectedJavaScript(str);
    }

    @ReactProp(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z) {
        webView.getSettings().setJavaScriptEnabled(z);
    }

    @ReactProp(name = "mediaPlaybackRequiresUserAction")
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z);
    }

    @ReactProp(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z) {
        ((ReactWebView) webView).setMessagingEnabled(z);
    }

    /* access modifiers changed from: protected */
    public void addEventEmitters(ThemedReactContext themedReactContext, WebView webView) {
        webView.setWebViewClient(new ReactWebViewClient());
    }

    @ReactProp(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z) {
        if (z) {
            webView.setPictureListener(getPictureListener());
        } else {
            webView.setPictureListener(null);
        }
    }

    @ReactProp(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z) {
        webView.getSettings().setSaveFormData(!z);
    }

    @ReactProp(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z) {
        webView.getSettings().setUseWideViewPort(!z);
    }

    @ReactProp(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z);
        }
    }

    @ReactProp(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, @Nullable ReadableArray readableArray) {
        ReactWebViewClient reactWebViewClient = ((ReactWebView) webView).getReactWebViewClient();
        if (reactWebViewClient != null && readableArray != null) {
            reactWebViewClient.setUrlPrefixesForDefaultIntent(readableArray);
        }
    }

    @ReactProp(name = "userAgent")
    public void setUserAgent(WebView webView, @Nullable String str) {
        if (str != null) {
            webView.getSettings().setUserAgentString(str);
        }
    }

    protected static void dispatchEvent(WebView webView, Event event) {
        ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(event);
    }

    @ReactProp(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (str == null || "never".equals(str)) {
                webView.getSettings().setMixedContentMode(1);
            } else if ("always".equals(str)) {
                webView.getSettings().setMixedContentMode(0);
            } else if ("compatibility".equals(str)) {
                webView.getSettings().setMixedContentMode(2);
            }
        }
    }

    @ReactProp(name = "source")
    public void setSource(WebView webView, @Nullable ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                String string = readableMap.getString("html");
                if (readableMap.hasKey("baseUrl")) {
                    webView.loadDataWithBaseURL(readableMap.getString("baseUrl"), string, "text/html", "UTF-8", null);
                    return;
                }
                webView.loadData(string, "text/html", "UTF-8");
                return;
            } else if (readableMap.hasKey("uri")) {
                String string2 = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url != null && url.equals(string2)) {
                    return;
                }
                if (!readableMap.hasKey(PushConstants.MZ_PUSH_MESSAGE_METHOD) || !readableMap.getString(PushConstants.MZ_PUSH_MESSAGE_METHOD).equals("POST")) {
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if (!"user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                hashMap.put(nextKey, map.getString(nextKey));
                            } else if (webView.getSettings() != null) {
                                webView.getSettings().setUserAgentString(map.getString(nextKey));
                            }
                        }
                    }
                    _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, string2, hashMap);
                    return;
                }
                byte[] bArr = null;
                if (readableMap.hasKey("body")) {
                    String string3 = readableMap.getString("body");
                    try {
                        bArr = string3.getBytes("UTF-8");
                    } catch (UnsupportedEncodingException unused) {
                        bArr = string3.getBytes();
                    }
                }
                if (bArr == null) {
                    bArr = new byte[0];
                }
                webView.postUrl(string2, bArr);
                return;
            }
        }
        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, "about:blank");
    }

    public void receiveCommand(WebView webView, int i, @Nullable ReadableArray readableArray) {
        switch (i) {
            case 1:
                webView.goBack();
                return;
            case 2:
                webView.goForward();
                return;
            case 3:
                webView.reload();
                return;
            case 4:
                webView.stopLoading();
                return;
            case 5:
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, "javascript:(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    return;
                } catch (JSONException e2) {
                    throw new RuntimeException(e2);
                }
            case 6:
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, "javascript:" + readableArray.getString(0));
                break;
        }
    }
}

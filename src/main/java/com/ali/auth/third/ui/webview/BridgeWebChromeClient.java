package com.ali.auth.third.ui.webview;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import com.ali.auth.third.core.message.Message;
import com.ali.auth.third.core.message.MessageUtils;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ss.android.ugc.aweme.lancet.c;
import com.ss.android.ugc.aweme.utils.eq;
import java.lang.reflect.Method;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class BridgeWebChromeClient extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5068a = "BridgeWebChromeClient";
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5069b = (Build.VERSION.SDK_INT >= 19);

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
            if (Build.VERSION.SDK_INT == 25) {
                eq.a(toast);
            }
            toast.show();
        }
    }

    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public WebView f5070a;

        /* renamed from: b  reason: collision with root package name */
        public String f5071b;

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

        public a(WebView webView, String str) {
            this.f5070a = webView;
            this.f5071b = str;
        }

        @TargetApi(19)
        public void run() {
            try {
                if (BridgeWebChromeClient.f5069b) {
                    try {
                        this.f5070a.evaluateJavascript(this.f5071b, null);
                        return;
                    } catch (Exception e2) {
                        SDKLogger.e("ui", "fail to evaluate the script " + e2.getMessage(), e2);
                    }
                }
                String str = "javascript:" + this.f5071b;
                if (this.f5070a instanceof AuthWebView) {
                    ((AuthWebView) this.f5070a).loadUrl(str);
                } else {
                    _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f5070a, str);
                }
            } catch (Exception unused) {
            }
        }
    }

    private d a(String str) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        int port = parse.getPort();
        String lastPathSegment = parse.getLastPathSegment();
        parse.getQuery();
        int indexOf = str.indexOf("?");
        String substring = indexOf == -1 ? null : str.substring(indexOf + 1);
        d dVar = new d();
        dVar.f5076b = lastPathSegment;
        dVar.f5075a = host;
        dVar.f5077c = substring;
        dVar.f5078d = port;
        return dVar;
    }

    private void a(WebView webView, String str) {
        try {
            int indexOf = str.indexOf(58, 9);
            webView.post(new a(webView, String.format("window.WindVane&&window.WindVane.onFailure(%s,'{\"ret\":\"HY_NO_HANDLER\"');", new Object[]{str.substring(indexOf + 1, str.indexOf(47, indexOf))})));
        } catch (Exception e2) {
            SDKLogger.e("ui", "fail to handler windvane request, the error message is " + e2.getMessage(), e2);
        }
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return false;
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        String str4;
        Message message;
        String str5;
        StringBuilder sb;
        int i;
        Object[] objArr;
        if (str3 == null) {
            return false;
        }
        if (str3.equals("wv_hybrid:")) {
            a(webView, str2);
        } else if (!TextUtils.equals(str3, "hv_hybrid:") || !(webView instanceof AuthWebView)) {
            return false;
        } else {
            AuthWebView authWebView = (AuthWebView) webView;
            d a2 = a(str2);
            com.ali.auth.third.ui.context.a aVar = new com.ali.auth.third.ui.context.a();
            aVar.f5054b = a2.f5078d;
            aVar.f5053a = authWebView;
            Object bridgeObj = authWebView.getBridgeObj(a2.f5075a);
            if (bridgeObj == null) {
                i = 10000;
                objArr = new Object[]{a2.f5075a};
            } else {
                try {
                    Method method = bridgeObj.getClass().getMethod(a2.f5076b, new Class[]{com.ali.auth.third.ui.context.a.class, String.class});
                    if (method.isAnnotationPresent(BridgeMethod.class)) {
                        try {
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = aVar;
                            objArr2[1] = TextUtils.isEmpty(a2.f5077c) ? "{}" : a2.f5077c;
                            method.invoke(bridgeObj, objArr2);
                        } catch (Exception e2) {
                            message = MessageUtils.createMessage(10010, e2.getMessage());
                            str4 = f5068a;
                            sb = new StringBuilder();
                            sb.append(message.toString());
                            sb.append(",");
                            str5 = e2.toString();
                            sb.append(str5);
                            SDKLogger.e(str4, sb.toString());
                            aVar.a(message.code, message.message);
                            jsPromptResult.confirm("");
                            return true;
                        }
                    } else {
                        i = 952;
                        objArr = new Object[]{a2.f5075a, a2.f5076b};
                    }
                } catch (NoSuchMethodException e3) {
                    message = MessageUtils.createMessage(951, a2.f5075a, a2.f5076b);
                    str4 = f5068a;
                    sb = new StringBuilder();
                    sb.append(message);
                    sb.append(",");
                    str5 = e3.toString();
                    sb.append(str5);
                    SDKLogger.e(str4, sb.toString());
                    aVar.a(message.code, message.message);
                    jsPromptResult.confirm("");
                    return true;
                }
            }
            Message createMessage = MessageUtils.createMessage(i, objArr);
            SDKLogger.e(f5068a, createMessage.toString());
            aVar.a(createMessage.code, createMessage.message);
        }
        jsPromptResult.confirm("");
        return true;
    }
}

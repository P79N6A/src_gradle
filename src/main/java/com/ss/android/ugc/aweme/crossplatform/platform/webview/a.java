package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\f\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J0\u0010\r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J:\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/BlockJsPopupChromeClient;", "Landroid/webkit/WebChromeClient;", "()V", "onJsAlert", "", "view", "Landroid/webkit/WebView;", "url", "", "message", "result", "Landroid/webkit/JsResult;", "onJsBeforeUnload", "onJsConfirm", "onJsPrompt", "defaultValue", "Landroid/webkit/JsPromptResult;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class a extends WebChromeClient {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f40970f;

    public boolean onJsAlert(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
        if (PatchProxy.isSupport(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34428, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34428, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)).booleanValue();
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsBeforeUnload(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
        if (PatchProxy.isSupport(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34431, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34431, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)).booleanValue();
        }
        if (jsResult != null) {
            jsResult.confirm();
        }
        return true;
    }

    public boolean onJsConfirm(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable JsResult jsResult) {
        if (PatchProxy.isSupport(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34429, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str, str2, jsResult}, this, f40970f, false, 34429, new Class[]{WebView.class, String.class, String.class, JsResult.class}, Boolean.TYPE)).booleanValue();
        }
        if (jsResult != null) {
            jsResult.cancel();
        }
        return true;
    }

    public boolean onJsPrompt(@Nullable WebView webView, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable JsPromptResult jsPromptResult) {
        if (PatchProxy.isSupport(new Object[]{webView, str, str2, str3, jsPromptResult}, this, f40970f, false, 34430, new Class[]{WebView.class, String.class, String.class, String.class, JsPromptResult.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str, str2, str3, jsPromptResult}, this, f40970f, false, 34430, new Class[]{WebView.class, String.class, String.class, String.class, JsPromptResult.class}, Boolean.TYPE)).booleanValue();
        }
        if (jsPromptResult != null) {
            jsPromptResult.cancel();
        }
        return true;
    }
}

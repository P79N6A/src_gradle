package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.support.annotation.Keep;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.c.f;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\n\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J$\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020 H\u0016J\u0018\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020 H\u0016J\u001c\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u00032\b\u0010.\u001a\u0004\u0018\u00010\"H\u0016J\u001c\u0010/\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u001e2\b\u0010)\u001a\u0004\u0018\u000100H\u0016J2\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u00032\u0014\u00104\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020706\u0018\u0001052\b\u00108\u001a\u0004\u0018\u000109H\u0017J\u0016\u0010:\u001a\u00020 2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020705H\u0007J\u001e\u0010:\u001a\u00020 2\f\u0010;\u001a\b\u0012\u0004\u0012\u000207052\u0006\u0010<\u001a\u00020\"H\u0007J&\u0010:\u001a\u00020 2\f\u0010;\u001a\b\u0012\u0004\u0012\u000207052\u0006\u0010<\u001a\u00020\"2\u0006\u0010=\u001a\u00020\"H\u0007R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006>"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebChromeClient;", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/BlockJsPopupChromeClient;", "targetWebView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "baseJsMessageHandler", "Lcom/ss/android/sdk/webview/IJsMsgHandler;", "getBaseJsMessageHandler", "()Lcom/ss/android/sdk/webview/IJsMsgHandler;", "setBaseJsMessageHandler", "(Lcom/ss/android/sdk/webview/IJsMsgHandler;)V", "fileFragment", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/UploadFileFragment;", "iCrossPlatformActivityContainer", "Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "getICrossPlatformActivityContainer", "()Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "setICrossPlatformActivityContainer", "(Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;)V", "iWebChromeStatus", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "getIWebChromeStatus", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "setIWebChromeStatus", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;)V", "getActivity", "Landroid/support/v7/app/AppCompatActivity;", "context", "Landroid/content/Context;", "getVideoLoadingProgressView", "Landroid/view/View;", "onConsoleMessage", "", "message", "", "lineNumber", "", "sourceID", "onGeolocationPermissionsHidePrompt", "onGeolocationPermissionsShowPrompt", "origin", "callback", "Landroid/webkit/GeolocationPermissions$Callback;", "onHideCustomView", "onReceivedTitle", "view", "title", "onShowCustomView", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "onShowFileChooser", "", "webView", "filePathCallback", "Landroid/webkit/ValueCallback;", "", "Landroid/net/Uri;", "fileChooserParams", "Landroid/webkit/WebChromeClient$FileChooserParams;", "openFileChooser", "uploadMsg", "acceptType", "capture", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SingleWebChromeClient extends a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40948a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public f f40949b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.activity.f f40950c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public d f40951d;

    /* renamed from: e  reason: collision with root package name */
    private UploadFileFragment f40952e;

    public final void onGeolocationPermissionsHidePrompt() {
        if (PatchProxy.isSupport(new Object[0], this, f40948a, false, 34433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40948a, false, 34433, new Class[0], Void.TYPE);
            return;
        }
        f fVar = this.f40949b;
        if (fVar != null) {
            fVar.f();
        }
    }

    public final void onHideCustomView() {
        if (PatchProxy.isSupport(new Object[0], this, f40948a, false, 34436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40948a, false, 34436, new Class[0], Void.TYPE);
            return;
        }
        super.onHideCustomView();
        d dVar = this.f40951d;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Nullable
    public final View getVideoLoadingProgressView() {
        Context context;
        if (PatchProxy.isSupport(new Object[0], this, f40948a, false, 34442, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f40948a, false, 34442, new Class[0], View.class);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f40950c;
        Context context2 = null;
        if (fVar != null) {
            context = fVar.getContext();
        } else {
            context = null;
        }
        if (context == null) {
            return null;
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar2 = this.f40950c;
        if (fVar2 != null) {
            context2 = fVar2.getContext();
        }
        if (context2 == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(context2, "iCrossPlatformActivityContainer?.context!!");
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        return frameLayout;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SingleWebChromeClient(@org.jetbrains.annotations.NotNull android.webkit.WebView r3) {
        /*
            r2 = this;
            java.lang.String r0 = "targetWebView"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r3, r0)
            r2.<init>()
            android.content.Context r3 = r3.getContext()
            android.support.v7.app.AppCompatActivity r3 = r2.a(r3)
            if (r3 == 0) goto L_0x001f
            android.support.v4.app.FragmentManager r0 = r3.getSupportFragmentManager()
            if (r0 == 0) goto L_0x001f
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment
            if (r1 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = new com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment
            r0.<init>()
            r2.f40952e = r0
            if (r3 == 0) goto L_0x0049
            android.support.v4.app.FragmentManager r3 = r3.getSupportFragmentManager()
            if (r3 == 0) goto L_0x0049
            android.support.v4.app.FragmentTransaction r3 = r3.beginTransaction()
            if (r3 == 0) goto L_0x0049
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = r2.f40952e
            android.support.v4.app.Fragment r0 = (android.support.v4.app.Fragment) r0
            java.lang.String r1 = "web_view_upload_file"
            android.support.v4.app.FragmentTransaction r3 = r3.add((android.support.v4.app.Fragment) r0, (java.lang.String) r1)
            if (r3 == 0) goto L_0x0049
            r3.commitAllowingStateLoss()
            goto L_0x004e
        L_0x0049:
            return
        L_0x004a:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.UploadFileFragment) r0
            r2.f40952e = r0
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebChromeClient.<init>(android.webkit.WebView):void");
    }

    private final AppCompatActivity a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f40948a, false, 34443, new Class[]{Context.class}, AppCompatActivity.class)) {
            return (AppCompatActivity) PatchProxy.accessDispatch(new Object[]{context}, this, f40948a, false, 34443, new Class[]{Context.class}, AppCompatActivity.class);
        } else if (context == null) {
            return null;
        } else {
            for (Context context2 = context; context2 instanceof ContextWrapper; context2 = ((ContextWrapper) context2).getBaseContext()) {
                if (context2 instanceof AppCompatActivity) {
                    return (AppCompatActivity) context2;
                }
            }
            return null;
        }
    }

    @Keep
    public final void openFileChooser(@NotNull ValueCallback<Uri> valueCallback) {
        if (PatchProxy.isSupport(new Object[]{valueCallback}, this, f40948a, false, 34441, new Class[]{ValueCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueCallback}, this, f40948a, false, 34441, new Class[]{ValueCallback.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        this.f40952e.f40962b = valueCallback;
        this.f40952e.a("", "");
    }

    public final void onGeolocationPermissionsShowPrompt(@NotNull String str, @NotNull GeolocationPermissions.Callback callback) {
        String str2 = str;
        GeolocationPermissions.Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, callback2}, this, f40948a, false, 34432, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, callback2}, this, f40948a, false, 34432, new Class[]{String.class, GeolocationPermissions.Callback.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "origin");
        Intrinsics.checkParameterIsNotNull(callback2, "callback");
        f fVar = this.f40949b;
        if (fVar != null) {
            fVar.a(str2, callback2);
        }
    }

    public final void onReceivedTitle(@Nullable WebView webView, @Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40948a, false, 34434, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40948a, false, 34434, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        super.onReceivedTitle(webView, str);
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f40950c;
        if (fVar != null) {
            fVar.a((CharSequence) str);
        }
    }

    public final void onShowCustomView(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback) {
        View view2 = view;
        WebChromeClient.CustomViewCallback customViewCallback2 = customViewCallback;
        if (PatchProxy.isSupport(new Object[]{view2, customViewCallback2}, this, f40948a, false, 34435, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, customViewCallback2}, this, f40948a, false, 34435, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE);
            return;
        }
        super.onShowCustomView(view, customViewCallback);
        d dVar = this.f40951d;
        if (dVar != null) {
            dVar.a(view2, customViewCallback2);
        }
    }

    @Keep
    public final void openFileChooser(@NotNull ValueCallback<Uri> valueCallback, @NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{valueCallback, str}, this, f40948a, false, 34440, new Class[]{ValueCallback.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueCallback, str}, this, f40948a, false, 34440, new Class[]{ValueCallback.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(valueCallback, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str, "acceptType");
        this.f40952e.f40962b = valueCallback;
        this.f40952e.a(str, "");
    }

    public final void onConsoleMessage(@Nullable String str, int i, @Nullable String str2) {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, Integer.valueOf(i), str2}, this, f40948a, false, 34437, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Integer.valueOf(i), str2}, this, f40948a, false, 34437, new Class[]{String.class, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        Logger.debug();
        try {
            f fVar = this.f40949b;
            if (fVar != null) {
                fVar.d(str3);
            }
        } catch (Exception unused) {
        }
    }

    @TargetApi(21)
    public final boolean onShowFileChooser(@Nullable WebView webView, @Nullable ValueCallback<Uri[]> valueCallback, @Nullable WebChromeClient.FileChooserParams fileChooserParams) {
        Context context;
        Context context2;
        boolean z;
        String str;
        ValueCallback<Uri[]> valueCallback2 = valueCallback;
        WebChromeClient.FileChooserParams fileChooserParams2 = fileChooserParams;
        if (PatchProxy.isSupport(new Object[]{webView, valueCallback2, fileChooserParams2}, this, f40948a, false, 34438, new Class[]{WebView.class, ValueCallback.class, WebChromeClient.FileChooserParams.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, valueCallback2, fileChooserParams2}, this, f40948a, false, 34438, new Class[]{WebView.class, ValueCallback.class, WebChromeClient.FileChooserParams.class}, Boolean.TYPE)).booleanValue();
        } else if (fileChooserParams2 == null) {
            return false;
        } else {
            Context context3 = null;
            if (webView != null) {
                context = webView.getContext();
            } else {
                context = null;
            }
            if (a(context) == null) {
                return false;
            }
            UploadFileFragment uploadFileFragment = this.f40952e;
            if (PatchProxy.isSupport(new Object[]{webView, valueCallback2, fileChooserParams2}, uploadFileFragment, UploadFileFragment.f40960a, false, 34505, new Class[]{WebView.class, ValueCallback.class, WebChromeClient.FileChooserParams.class}, Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, valueCallback2, fileChooserParams2}, uploadFileFragment, UploadFileFragment.f40960a, false, 34505, new Class[]{WebView.class, ValueCallback.class, WebChromeClient.FileChooserParams.class}, Boolean.TYPE)).booleanValue();
            } else if (fileChooserParams2 != null) {
                if (webView != null) {
                    context2 = webView.getContext();
                } else {
                    context2 = null;
                }
                if (com.ss.android.ugc.aweme.utils.permission.f.a(context2) == 0) {
                    if (webView != null) {
                        context3 = webView.getContext();
                    }
                    if (com.ss.android.ugc.aweme.utils.permission.f.c(context3) == 0) {
                        uploadFileFragment.f40963c = valueCallback2;
                        String[] acceptTypes = fileChooserParams.getAcceptTypes();
                        Intrinsics.checkExpressionValueIsNotNull(acceptTypes, "fileChooserParams.acceptTypes");
                        if (acceptTypes.length == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            str = fileChooserParams.getAcceptTypes()[0];
                        } else {
                            str = "";
                        }
                        uploadFileFragment.a(str, "");
                    }
                }
                b.a(uploadFileFragment.getActivity(), new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new UploadFileFragment.b(uploadFileFragment, valueCallback2, fileChooserParams2));
            }
            return true;
        }
    }

    @Keep
    public final void openFileChooser(@NotNull ValueCallback<Uri> valueCallback, @NotNull String str, @NotNull String str2) {
        ValueCallback<Uri> valueCallback2 = valueCallback;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{valueCallback2, str3, str4}, this, f40948a, false, 34439, new Class[]{ValueCallback.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{valueCallback2, str3, str4}, this, f40948a, false, 34439, new Class[]{ValueCallback.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(valueCallback2, "uploadMsg");
        Intrinsics.checkParameterIsNotNull(str3, "acceptType");
        Intrinsics.checkParameterIsNotNull(str4, "capture");
        this.f40952e.f40962b = valueCallback2;
        this.f40952e.a(str3, str4);
    }
}

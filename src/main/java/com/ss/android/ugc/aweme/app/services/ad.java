package com.ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.app.g;
import com.ss.android.ugc.aweme.main.h.w;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/WebViewTweakerService;", "Lcom/ss/android/ugc/aweme/main/service/IWebViewTweaker;", "()V", "clearWebviewOnDestroy", "", "webview", "Landroid/webkit/WebView;", "tweakPauseIfFinishing", "context", "Landroid/content/Context;", "webView", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ad implements w {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34270a;

    public final void a(@Nullable WebView webView) {
        if (PatchProxy.isSupport(new Object[]{webView}, this, f34270a, false, 23678, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView}, this, f34270a, false, 23678, new Class[]{WebView.class}, Void.TYPE);
            return;
        }
        g.a(webView);
    }

    public final void a(@Nullable Context context, @Nullable WebView webView) {
        if (PatchProxy.isSupport(new Object[]{context, webView}, this, f34270a, false, 23677, new Class[]{Context.class, WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, webView}, this, f34270a, false, 23677, new Class[]{Context.class, WebView.class}, Void.TYPE);
            return;
        }
        g.a(context, webView);
    }
}

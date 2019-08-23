package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.ui.webview.SSWebView;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.web.j;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76462a;

    private static SSWebView a(View view) {
        View view2 = view;
        if (!PatchProxy.isSupport(new Object[]{view2}, null, f76462a, true, 89476, new Class[]{View.class}, SSWebView.class)) {
            return (SSWebView) view2.findViewById(C0906R.id.dx2);
        }
        return (SSWebView) PatchProxy.accessDispatch(new Object[]{view2}, null, f76462a, true, 89476, new Class[]{View.class}, SSWebView.class);
    }

    public static RemoteImageView a(String str, Context context) {
        String str2 = str;
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{str2, context2}, null, f76462a, true, 89479, new Class[]{String.class, Context.class}, RemoteImageView.class)) {
            return (RemoteImageView) PatchProxy.accessDispatch(new Object[]{str2, context2}, null, f76462a, true, 89479, new Class[]{String.class, Context.class}, RemoteImageView.class);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        ((GenericDraweeHierarchy) remoteImageView.getHierarchy()).setFailureImage(2130840200);
        c.a(remoteImageView, str2);
        return remoteImageView;
    }

    public static View a(Context context, String str, String str2) {
        Context context2 = context;
        String str3 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, null, str3}, null, f76462a, true, 89475, new Class[]{Context.class, String.class, String.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{context2, null, str3}, null, f76462a, true, 89475, new Class[]{Context.class, String.class, String.class}, View.class);
        }
        View inflate = View.inflate(context2, C0906R.layout.asm, null);
        SSWebView a2 = a(inflate);
        WebSettings settings = a2.getSettings();
        settings.setLoadsImagesAutomatically(true);
        settings.setDefaultTextEncodingName("utf-8");
        a2.setBackgroundColor(0);
        a2.setWebViewClient(new j() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76463a;

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (PatchProxy.isSupport(new Object[]{webView, str}, this, f76463a, false, 89481, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str}, this, f76463a, false, 89481, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
                }
                Intent webUriIntent = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getWebUriIntent(webView.getContext(), Uri.parse(str));
                if (webUriIntent != null) {
                    webView.getContext().startActivity(webUriIntent);
                }
                return true;
            }
        });
        if (!TextUtils.isEmpty(str2)) {
            a2.loadData(str3, "text/html;charset=UTF-8", null);
        }
        return inflate;
    }
}

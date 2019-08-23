package com.ss.android.newmedia.eplatform;

import a.g;
import a.i;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.q;
import com.ss.android.newmedia.r;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import kotlin.jvm.internal.Intrinsics;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30197a;

    public static boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, null, f30197a, true, 18638, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, null, f30197a, true, 18638, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return TextUtils.equals(Uri.parse(str).getQueryParameter("bbb815f4751d8b93e7f52e43a9a5c429"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static Boolean a(WebView webView, String str, Boolean bool) {
        boolean z;
        i iVar;
        WebView webView2 = webView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{webView2, str2, bool}, null, f30197a, true, 18639, new Class[]{WebView.class, String.class, Boolean.class}, Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[]{webView2, str2, bool}, null, f30197a, true, 18639, new Class[]{WebView.class, String.class, Boolean.class}, Boolean.class);
        }
        if (bool.booleanValue()) {
            if (com.ss.android.ugc.aweme.i.a.e() == 1 && q.a(str)) {
                q.a(webView);
                return Boolean.TRUE;
            } else if (com.ss.android.ugc.aweme.i.a.e() == 2) {
                if (!TextUtils.isEmpty(str) && (str2.startsWith("http://") || str2.startsWith("https://"))) {
                    SingleWebView singleWebView = (SingleWebView) webView2;
                    if (PatchProxy.isSupport(new Object[]{str2}, singleWebView, SingleWebView.f2987c, false, 34447, new Class[]{String.class}, Boolean.TYPE)) {
                        SingleWebView singleWebView2 = singleWebView;
                        z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, singleWebView2, SingleWebView.f2987c, false, 34447, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
                    } else {
                        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
                        z = singleWebView.f2990f.contains(str2);
                    }
                    if (!z) {
                        if (PatchProxy.isSupport(new Object[]{webView2, str2}, null, q.f30263a, true, 18478, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{webView2, str2}, null, q.f30263a, true, 18478, new Class[]{WebView.class, String.class}, Void.TYPE);
                        } else if (webView2 != null) {
                            if (PatchProxy.isSupport(new Object[]{str2}, null, com.ss.android.newmedia.eplatform.api.a.f30200a, true, 18640, new Class[]{String.class}, i.class)) {
                                iVar = (i) PatchProxy.accessDispatch(new Object[]{str2}, null, com.ss.android.newmedia.eplatform.api.a.f30200a, true, 18640, new Class[]{String.class}, i.class);
                            } else {
                                Intrinsics.checkParameterIsNotNull(str2, "schema");
                                iVar = com.ss.android.newmedia.eplatform.api.a.f30201b.hostVerify(str2);
                            }
                            iVar.a((g<TResult, TContinuationResult>) new r<TResult,TContinuationResult>(webView2, str2), i.f1052b);
                        }
                        return Boolean.TRUE;
                    }
                }
                if (q.a(str)) {
                    q.a(webView);
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }
}

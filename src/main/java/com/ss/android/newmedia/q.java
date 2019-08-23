package com.ss.android.newmedia;

import a.i;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.eplatform.api.b;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.i.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30263a;

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f30263a, true, 18476, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f30263a, true, 18476, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        for (String startsWith : a.b()) {
            if (str2.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    public static void a(WebView webView) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2}, null, f30263a, true, 18477, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, null, f30263a, true, 18477, new Class[]{WebView.class}, Void.TYPE);
        } else if (webView2 != null) {
            if (TextUtils.isEmpty(a.d())) {
                if (!TextUtils.isEmpty(a.c())) {
                    com.bytedance.ies.dmt.ui.d.a.c(webView.getContext(), a.c()).a();
                } else {
                    com.bytedance.ies.dmt.ui.d.a.c(webView.getContext(), webView.getContext().getString(C0906R.string.bga)).a();
                }
                r.a("enter_blacklist_page", (Map) d.a().a("black_list_type", "toast").f34114b);
                return;
            }
            s.a(webView2, a.d());
            r.a("enter_blacklist_page", (Map) d.a().a("black_list_type", "intercept_page").f34114b);
        }
    }

    static final /* synthetic */ Void a(WebView webView, String str, i iVar) throws Exception {
        if (iVar.d() || iVar.e() == null) {
            com.bytedance.ies.dmt.ui.d.a.c(webView.getContext(), webView.getContext().getString(C0906R.string.bga)).a();
            return null;
        }
        if (!((b) iVar.e()).f30203a) {
            SingleWebView singleWebView = (SingleWebView) webView;
            if (PatchProxy.isSupport(new Object[]{str}, singleWebView, SingleWebView.f2987c, false, 34446, new Class[]{String.class}, Void.TYPE)) {
                SingleWebView singleWebView2 = singleWebView;
                PatchProxy.accessDispatch(new Object[]{str}, singleWebView2, SingleWebView.f2987c, false, 34446, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
                singleWebView.f2990f.add(str);
            }
            s.a(webView, str);
        } else if (TextUtils.isEmpty(a.d())) {
            if (!TextUtils.isEmpty(a.c())) {
                com.bytedance.ies.dmt.ui.d.a.c(webView.getContext(), a.c()).a();
            } else {
                com.bytedance.ies.dmt.ui.d.a.c(webView.getContext(), webView.getContext().getString(C0906R.string.bga)).a();
            }
            return null;
        } else {
            s.a(webView, Uri.parse(a.d()).buildUpon().appendQueryParameter("forbidden_url", str).appendQueryParameter("risk_level", String.valueOf(((b) iVar.e()).f30204b)).toString());
            r.a("enter_blacklist_page", (Map) d.a().a("black_list_type", "intercept_page").f34114b);
        }
        return null;
    }

    public static boolean a(String str, String str2, List<String> list) {
        String str3;
        boolean z;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{str4, str2, list}, null, f30263a, true, 18474, new Class[]{String.class, String.class, List.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str2, list}, null, f30263a, true, 18474, new Class[]{String.class, String.class, List.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        } else {
            if (str2 == null) {
                str3 = Uri.parse(str).getScheme();
            } else {
                str3 = str2;
            }
            if (TextUtils.equals(str3, e.f34152b)) {
                return true;
            }
            for (String next : list) {
                if (PatchProxy.isSupport(new Object[]{str4, str3, next}, null, f30263a, true, 18475, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str4, str3, next}, null, f30263a, true, 18475, new Class[]{String.class, String.class, String.class}, Boolean.TYPE)).booleanValue();
                    continue;
                } else if (str4 == null || str3 == null || next == null) {
                    z = false;
                    continue;
                } else if (!next.contains(":")) {
                    z = TextUtils.equals(str3, next);
                    continue;
                } else {
                    z = str4.startsWith(next);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
    }
}

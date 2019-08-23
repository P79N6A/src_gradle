package com.bytedance.android.livesdk.browser.e;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9345a;

    /* renamed from: b  reason: collision with root package name */
    private List<c> f9346b;

    public static final class a implements h.b<d> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9347a;

        @NonNull
        public final h.b.a<d> a(h.b.a<d> aVar) {
            h.b.a<d> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f9347a, false, 3786, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new d((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9347a, false, 3786, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private d() {
        this.f9346b = new LinkedList();
        this.f9346b.add(new e());
        this.f9346b.add(new b());
    }

    /* synthetic */ d(byte b2) {
        this();
    }

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f9345a, false, 3784, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f9345a, false, 3784, new Class[]{String.class}, String.class);
        }
        Uri.Builder buildUpon = Uri.parse("liveresource://file").buildUpon();
        buildUpon.scheme("liveresource").appendQueryParameter("path", str2);
        return buildUpon.build().toString();
    }

    public final WebResourceResponse a(String str, List<c> list, WebView webView) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{str, list, webView2}, this, f9345a, false, 3783, new Class[]{String.class, List.class, WebView.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str, list, webView2}, this, f9345a, false, 3783, new Class[]{String.class, List.class, WebView.class}, WebResourceResponse.class);
        }
        Uri parse = Uri.parse(str);
        if (!TextUtils.equals(parse.getScheme(), "liveresource")) {
            return null;
        }
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return null;
        }
        for (c next : list) {
            if (TextUtils.equals(host, next.a())) {
                return next.a(parse, webView2);
            }
        }
        for (c next2 : this.f9346b) {
            if (TextUtils.equals(host, next2.a())) {
                return next2.a(parse, webView2);
            }
        }
        return null;
    }
}

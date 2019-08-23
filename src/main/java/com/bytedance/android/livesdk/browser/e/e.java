package com.bytedance.android.livesdk.browser.e;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayInputStream;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9348a;

    public final String a() {
        return "sample";
    }

    e() {
    }

    public final WebResourceResponse a(Uri uri, WebView webView) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, webView}, this, f9348a, false, 3787, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{uri2, webView}, this, f9348a, false, 3787, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class);
        } else if (!TextUtils.isEmpty(uri2.getQueryParameter("data"))) {
            return new WebResourceResponse("", "", new ByteArrayInputStream("sample".getBytes()));
        } else {
            return null;
        }
    }
}

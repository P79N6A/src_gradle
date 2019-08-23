package com.bytedance.android.livesdk.browser.e;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9344a;

    public final String a() {
        return "file";
    }

    b() {
    }

    public final WebResourceResponse a(Uri uri, WebView webView) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2, webView}, this, f9344a, false, 3782, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{uri2, webView}, this, f9344a, false, 3782, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class);
        }
        String queryParameter = uri2.getQueryParameter("path");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        File file = new File(queryParameter);
        if (!file.exists()) {
            return null;
        }
        try {
            return new WebResourceResponse("", "", new FileInputStream(file));
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}

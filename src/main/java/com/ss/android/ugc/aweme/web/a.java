package com.ss.android.ugc.aweme.web;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public final class a extends com.ss.android.ugc.aweme.web.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76614a;

    /* renamed from: c  reason: collision with root package name */
    private String f76615c;

    public a(String str) {
        this.f76615c = str;
    }

    public final WebResourceResponse a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f76614a, false, 89828, new Class[]{String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str}, this, f76614a, false, 89828, new Class[]{String.class}, WebResourceResponse.class);
        }
        try {
            Uri parse = Uri.parse(str);
            String queryParameter = parse.getQueryParameter("ad_landing_channel");
            if (!TextUtils.isEmpty(queryParameter)) {
                if (!queryParameter.contains("/")) {
                    String path = parse.getPath();
                    if (path == null) {
                        return null;
                    }
                    if (path.endsWith("/")) {
                        path = path.substring(0, path.length() - 1);
                    }
                    File file = new File(this.f76615c + "/" + queryParameter + path);
                    if (!file.exists()) {
                        return null;
                    }
                    try {
                        return a(b(path), "", new BufferedInputStream(new FileInputStream(file)));
                    } catch (FileNotFoundException unused) {
                        return null;
                    } catch (Exception unused2) {
                        return null;
                    }
                }
            }
            return null;
        } catch (UnsupportedOperationException unused3) {
            return null;
        } catch (Exception unused4) {
            return null;
        }
    }
}

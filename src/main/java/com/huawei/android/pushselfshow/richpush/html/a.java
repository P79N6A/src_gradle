package com.huawei.android.pushselfshow.richpush.html;

import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.huawei.android.pushagent.utils.a.e;

public class a implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25268a;

    a(HtmlViewer htmlViewer) {
        this.f25268a = htmlViewer;
    }

    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            e.a("PushSelfShowLog", "url=" + str);
            e.a("PushSelfShowLog", "userAgent=" + str2);
            e.a("PushSelfShowLog", "contentDisposition=" + str3);
            e.a("PushSelfShowLog", "mimetype=" + str4);
            e.a("PushSelfShowLog", "contentLength=" + j);
            this.f25268a.f25260d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "onDownloadStart err", (Throwable) e2);
        }
    }
}

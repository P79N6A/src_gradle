package com.alipay.sdk.j;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

public final class k implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f5536a;

    k(Activity activity) {
        this.f5536a = activity;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        try {
            this.f5536a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Throwable unused) {
        }
    }
}

package com.ss.sys.ck;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import java.lang.ref.WeakReference;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private static Handler f78575a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private String f78576b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<WebView> f78577c;

    public d(WebView webView, String str) {
        this.f78577c = new WeakReference<>(webView);
        this.f78576b = str;
    }
}

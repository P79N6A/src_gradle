package com.ss.android.sdk.activity;

import android.webkit.DownloadListener;

public final /* synthetic */ class c implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    private final IESBrowserFragment f30652a;

    c(IESBrowserFragment iESBrowserFragment) {
        this.f30652a = iESBrowserFragment;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        this.f30652a.a(str, str2, str4);
    }
}

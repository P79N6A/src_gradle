package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import java.lang.ref.WeakReference;

public class IndependentProcessDownloadService extends DownloadService {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30896a = "IndependentProcessDownloadService";

    public void onCreate() {
        super.onCreate();
        b.a((Context) this);
        this.downloadServiceHandler = b.k();
        this.downloadServiceHandler.a(new WeakReference<>(this));
    }
}

package com.ss.android.socialbase.downloader.impls;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.downloader.a;

public class h extends a {

    /* renamed from: c  reason: collision with root package name */
    private static final String f31026c = "h";

    public final void b() {
        this.f30899b = true;
        d();
    }

    public final void a(Context context, ServiceConnection serviceConnection) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Throwable unused) {
        }
    }
}

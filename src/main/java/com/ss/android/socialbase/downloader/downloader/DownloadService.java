package com.ss.android.socialbase.downloader.downloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;

public class DownloadService extends Service {
    private static final String TAG = "DownloadService";
    protected n downloadServiceHandler;

    public void onDestroy() {
        if (this.downloadServiceHandler != null) {
            this.downloadServiceHandler.c();
            this.downloadServiceHandler = null;
        }
        super.onDestroy();
    }

    public void onCreate() {
        super.onCreate();
        b.a((Context) this);
        this.downloadServiceHandler = b.j();
        this.downloadServiceHandler.a(new WeakReference<>(this));
    }

    public IBinder onBind(Intent intent) {
        boolean z;
        StringBuilder sb = new StringBuilder("onBind downloadServiceHandler != null:");
        if (this.downloadServiceHandler != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (this.downloadServiceHandler != null) {
            return this.downloadServiceHandler.a();
        }
        return null;
    }

    public int onStartCommand(final Intent intent, final int i, final int i2) {
        ExecutorService e2 = b.e();
        if (e2 != null) {
            e2.execute(new Runnable() {
                public final void run() {
                    if (DownloadService.this.downloadServiceHandler != null) {
                        DownloadService.this.downloadServiceHandler.b();
                    }
                }
            });
        }
        return 3;
    }
}

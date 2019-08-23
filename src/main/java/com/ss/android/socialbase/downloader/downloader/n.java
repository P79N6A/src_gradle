package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.os.IBinder;
import com.ss.android.socialbase.downloader.downloader.DownloadService;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

public interface n<T extends DownloadService> {
    IBinder a();

    void a(int i);

    void a(int i, Notification notification);

    void a(m mVar);

    void a(WeakReference<T> weakReference);

    void a(boolean z);

    void b();

    void b(DownloadTask downloadTask);

    void c();

    void c(DownloadTask downloadTask);

    void e();
}

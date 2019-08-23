package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

public class DownloadNotificationService extends Service {
    private static final String TAG = "DownloadNotificationService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        b.a((Context) this);
    }

    private void handleIntent(final Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                ExecutorService f2 = b.f();
                if (f2 != null) {
                    f2.execute(new Runnable() {
                        public final void run() {
                            long j;
                            final NotificationManager notificationManager = (NotificationManager) DownloadNotificationService.this.getSystemService("notification");
                            final int intExtra = intent.getIntExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", 0);
                            if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY")) {
                                final Notification notification = (Notification) intent.getParcelableExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA");
                                int intExtra2 = intent.getIntExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", 0);
                                if (!(intExtra == 0 || notification == null || notificationManager == null)) {
                                    if (intExtra2 == 4) {
                                        if (Downloader.getInstance(b.q()).isDownloading(intExtra)) {
                                            DownloadInfo downloadInfo = Downloader.getInstance(b.q()).getDownloadInfo(intExtra);
                                            if (downloadInfo.canNotifyProgress()) {
                                                notificationManager.notify(intExtra, notification);
                                                downloadInfo.setLastNotifyProgressTime();
                                            }
                                        }
                                    } else if (intExtra2 == -2 || intExtra2 == -3) {
                                        Handler handler = new Handler(Looper.getMainLooper());
                                        AnonymousClass1 r6 = new Runnable() {
                                            public final void run() {
                                                notificationManager.notify(intExtra, notification);
                                            }
                                        };
                                        if (intExtra2 == -2) {
                                            j = 50;
                                        } else {
                                            j = 100;
                                        }
                                        handler.postDelayed(r6, j);
                                    } else {
                                        notificationManager.notify(intExtra, notification);
                                    }
                                }
                            } else if (action.equals("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL")) {
                                if (intExtra != 0) {
                                    notificationManager.cancel(intExtra);
                                }
                            } else if (action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                                try {
                                    if (d.a((Context) DownloadNotificationService.this, "android.permission.ACCESS_NETWORK_STATE")) {
                                        ConnectivityManager connectivityManager = (ConnectivityManager) DownloadNotificationService.this.getSystemService("connectivity");
                                        if (connectivityManager != null) {
                                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                                            if (activeNetworkInfo != null) {
                                                if (activeNetworkInfo.isConnected()) {
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add("application/vnd.android.package-archive");
                                                    arrayList.add("mime_type_plugin");
                                                    Context applicationContext = DownloadNotificationService.this.getApplicationContext();
                                                    if (applicationContext != null) {
                                                        Downloader.getInstance(applicationContext).restartAllFailedDownloadTasks(arrayList);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } catch (Exception unused) {
                                }
                            } else if (action.equals("android.intent.action.MEDIA_UNMOUNTED") || action.equals("android.intent.action.MEDIA_REMOVED") || action.equals("android.intent.action.MEDIA_BAD_REMOVAL") || action.equals("android.intent.action.MEDIA_EJECT")) {
                                try {
                                    Downloader.getInstance(DownloadNotificationService.this).pauseAll();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        handleIntent(intent);
        return 3;
    }
}

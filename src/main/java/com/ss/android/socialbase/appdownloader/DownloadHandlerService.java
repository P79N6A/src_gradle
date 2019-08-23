package com.ss.android.socialbase.appdownloader;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.IBinder;
import android.text.TextUtils;
import android.widget.Toast;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.appdownloader.view.DownloadTaskDeleteActivity;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import java.io.File;
import java.util.ArrayList;

public class DownloadHandlerService extends Service {

    /* renamed from: a  reason: collision with root package name */
    private static final String f30762a = "DownloadHandlerService";

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        b.a((Context) this);
    }

    private static void a(Context context, int i) {
        boolean z;
        x d2 = c.a().d(i);
        if (d2 != null) {
            try {
                DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(i);
                if (downloadInfo != null) {
                    z = d2.b(downloadInfo);
                    if (!z && AppDownloadUtils.startViewIntent(context, i, true) == 0) {
                        b.a(Toast.makeText(context, "Open Fail!", 0));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        z = false;
        b.a(Toast.makeText(context, "Open Fail!", 0));
    }

    private void a(final IAppDownloadEventHandler iAppDownloadEventHandler, final DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            final u downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(downloadInfo.getId());
            if (iAppDownloadEventHandler != null || downloadNotificationEventListener != null) {
                b.f().execute(new Runnable() {
                    public final void run() {
                        try {
                            File file = new File(downloadInfo.getSavePath(), downloadInfo.getName());
                            if (file.exists()) {
                                String str = "";
                                try {
                                    Context q = b.q();
                                    if (q != null) {
                                        PackageInfo packageArchiveInfo = q.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), AppDownloadUtils.getPackageInfoFlag());
                                        if (packageArchiveInfo != null) {
                                            str = packageArchiveInfo.packageName;
                                        }
                                    }
                                    if (iAppDownloadEventHandler != null) {
                                        iAppDownloadEventHandler.handleDownloadEvent(downloadInfo.getId(), 3, str, -3, downloadInfo.getDownloadTime());
                                    }
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.a(3, downloadInfo, str, "");
                                    }
                                } catch (Exception unused) {
                                }
                            }
                        } catch (Exception unused2) {
                        }
                    }
                });
            }
        }
    }

    private void a(Context context, Intent intent) {
        String action = intent.getAction();
        boolean z = false;
        try {
            int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
            if ("android.ss.intent.action.DOWNLOAD_DELETE".equals(action)) {
                x d2 = c.a().d(intExtra);
                if (d2 != null) {
                    try {
                        DownloadInfo downloadInfo = Downloader.getInstance(context).getDownloadInfo(intExtra);
                        if (downloadInfo != null) {
                            z = d2.a(downloadInfo);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (!z) {
                    Intent intent2 = new Intent(context, DownloadTaskDeleteActivity.class);
                    intent2.putExtra("extra_click_download_ids", intExtra);
                    intent2.addFlags(268435456);
                    context.startActivity(intent2);
                    DownloadNotificationManager.getInstance().hideNotification(intExtra);
                }
            } else if ("android.ss.intent.action.DOWNLOAD_OPEN".equals(action)) {
                a(context, intExtra);
                IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                u downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
                if (!(appDownloadEventHandler == null && downloadNotificationEventListener == null)) {
                    DownloadInfo downloadInfo2 = Downloader.getInstance(this).getDownloadInfo(intExtra);
                    if (downloadInfo2 != null) {
                        a(appDownloadEventHandler, downloadInfo2);
                    }
                }
                DownloadNotificationManager.getInstance().hideNotification(intExtra);
            } else {
                if ("android.ss.intent.action.DOWNLOAD_HIDE".equals(action)) {
                    DownloadNotificationManager.getInstance().hideNotification(intExtra);
                }
            }
        } catch (Exception unused2) {
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                int intExtra = intent.getIntExtra("extra_click_download_ids", 0);
                int intExtra2 = intent.getIntExtra("extra_click_download_type", 0);
                u downloadNotificationEventListener = Downloader.getInstance(this).getDownloadNotificationEventListener(intExtra);
                if (action.equals("android.ss.intent.action.DOWNLOAD_OPEN") || action.equals("android.ss.intent.action.DOWNLOAD_DELETE") || action.equals("android.ss.intent.action.DOWNLOAD_HIDE")) {
                    a((Context) this, intent);
                    if (action.equals("android.ss.intent.action.DOWNLOAD_DELETE")) {
                        DownloadInfo downloadInfo = Downloader.getInstance(this).getDownloadInfo(intExtra);
                        if (downloadInfo != null) {
                            downloadInfo.updateDownloadTime();
                            if (appDownloadEventHandler != null) {
                                appDownloadEventHandler.handleDownloadEvent(intExtra, 7, "", downloadInfo.getStatus(), downloadInfo.getDownloadTime());
                            }
                            if (downloadNotificationEventListener != null) {
                                downloadNotificationEventListener.a(7, downloadInfo, "", "");
                            }
                        }
                    }
                } else if (action.equals("android.ss.intent.action.DOWNLOAD_CLICK")) {
                    DownloadInfo downloadInfo2 = Downloader.getInstance(this).getDownloadInfo(intExtra);
                    if (downloadInfo2 != null) {
                        int status = downloadInfo2.getStatus();
                        if (status != 0) {
                            if (intExtra2 != 1 && intExtra2 != 4) {
                                if (intExtra2 != 2) {
                                    if (intExtra2 != 3) {
                                        int id = downloadInfo2.getId();
                                        switch (downloadInfo2.getStatus()) {
                                            case -4:
                                            case -1:
                                                Downloader.getInstance(this).restart(id);
                                                break;
                                            case -3:
                                                AppDownloadUtils.startViewIntent(this, id, true);
                                                a(appDownloadEventHandler, downloadInfo2);
                                                break;
                                            case -2:
                                                Downloader.getInstance(this).resume(id);
                                                if (appDownloadEventHandler != null) {
                                                    appDownloadEventHandler.handleDownloadEvent(id, 6, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                                                }
                                                if (downloadNotificationEventListener != null) {
                                                    downloadNotificationEventListener.a(6, downloadInfo2, "", "");
                                                    break;
                                                }
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                                Downloader.getInstance(this).pause(id);
                                                if (appDownloadEventHandler != null) {
                                                    appDownloadEventHandler.handleDownloadEvent(id, 5, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                                                }
                                                if (downloadNotificationEventListener != null) {
                                                    downloadNotificationEventListener.a(5, downloadInfo2, "", "");
                                                    break;
                                                }
                                                break;
                                        }
                                    } else if (status == -1 || status == -4) {
                                        Downloader.getInstance(this).restart(intExtra);
                                    } else if (status == -3) {
                                        AppDownloadUtils.startViewIntent(this, intExtra, true);
                                        a(appDownloadEventHandler, downloadInfo2);
                                    }
                                } else if (status == -3) {
                                    AppDownloadUtils.startViewIntent(this, intExtra, true);
                                    a(appDownloadEventHandler, downloadInfo2);
                                } else {
                                    Downloader.getInstance(this).resume(intExtra);
                                    if (appDownloadEventHandler != null) {
                                        appDownloadEventHandler.handleDownloadEvent(intExtra, 6, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                                    }
                                    if (downloadNotificationEventListener != null) {
                                        downloadNotificationEventListener.a(6, downloadInfo2, "", "");
                                    }
                                }
                            } else if (f.b(status)) {
                                Downloader.getInstance(this).pause(intExtra);
                                if (appDownloadEventHandler != null) {
                                    appDownloadEventHandler.handleDownloadEvent(intExtra, 5, "", downloadInfo2.getStatus(), downloadInfo2.getDownloadTime());
                                }
                                if (downloadNotificationEventListener != null) {
                                    downloadNotificationEventListener.a(5, downloadInfo2, "", "");
                                }
                            } else if (status == -3) {
                                AppDownloadUtils.startViewIntent(this, intExtra, true);
                                a(appDownloadEventHandler, downloadInfo2);
                            }
                            if (downloadInfo2.isDownloadOverStatus()) {
                                DownloadNotificationManager.getInstance().hideNotification(intExtra);
                                DownloadNotificationManager.getInstance().cancelNotification(intExtra);
                            }
                        }
                    }
                } else if (action.equals("android.intent.action.BOOT_COMPLETED") || action.equals("android.intent.action.MEDIA_MOUNTED")) {
                    b.f().execute(new Runnable() {
                        public final void run() {
                            try {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add("application/vnd.android.package-archive");
                                arrayList.add("mime_type_plugin");
                                Downloader.getInstance(b.q()).restartAllFailedDownloadTasks(arrayList);
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        }
        stopSelf();
        return 2;
    }
}

package com.ss.android.socialbase.appdownloader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadEventHandler;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import java.util.List;

public class DownloadReceiver extends BroadcastReceiver {
    private static final String TAG = "DownloadReceiver";

    private void autoRefreshUnsuccessDownloadTask(Context context, String str) {
        try {
            Intent intent = new Intent(context, DownloadHandlerService.class);
            intent.setAction(str);
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onReceive(final Context context, final Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                IAppDownloadDepend appDownloadDepend = AppDownloader.getInstance().getAppDownloadDepend();
                if (action.equals("android.intent.action.BOOT_COMPLETED") && (appDownloadDepend == null || appDownloadDepend.getAllowBootReceiver())) {
                    autoRefreshUnsuccessDownloadTask(context, action);
                } else if (action.equals("android.intent.action.MEDIA_MOUNTED")) {
                    autoRefreshUnsuccessDownloadTask(context, action);
                } else {
                    if (action.equals("android.intent.action.PACKAGE_ADDED") || action.equals("android.intent.action.PACKAGE_REPLACED")) {
                        b.f().execute(new Runnable() {
                            public final void run() {
                                Uri data = intent.getData();
                                if (data != null) {
                                    String schemeSpecificPart = data.getSchemeSpecificPart();
                                    IAppDownloadEventHandler appDownloadEventHandler = AppDownloader.getInstance().getAppDownloadEventHandler();
                                    if (appDownloadEventHandler != null) {
                                        appDownloadEventHandler.handleAppInstalled(context, schemeSpecificPart);
                                    }
                                    List<DownloadInfo> successedDownloadInfosWithMimeType = Downloader.getInstance(context).getSuccessedDownloadInfosWithMimeType("application/vnd.android.package-archive");
                                    if (successedDownloadInfosWithMimeType != null) {
                                        Iterator<DownloadInfo> it2 = successedDownloadInfosWithMimeType.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            DownloadInfo next = it2.next();
                                            if (next != null && AppDownloadUtils.isPackageNameValid(next, schemeSpecificPart)) {
                                                u downloadNotificationEventListener = Downloader.getInstance(context).getDownloadNotificationEventListener(next.getId());
                                                if (downloadNotificationEventListener != null) {
                                                    String a2 = downloadNotificationEventListener.a();
                                                    boolean z = true;
                                                    if (!TextUtils.isEmpty(a2)) {
                                                        String b2 = d.b(b.q());
                                                        if (b2 == null || !b2.equals(a2)) {
                                                            z = false;
                                                        }
                                                    }
                                                    if (z) {
                                                        downloadNotificationEventListener.a(9, next, schemeSpecificPart, "");
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        });
                    }
                }
            }
        }
    }
}

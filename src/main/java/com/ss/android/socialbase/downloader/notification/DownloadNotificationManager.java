package com.ss.android.socialbase.downloader.notification;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.HashSet;
import java.util.Set;

public class DownloadNotificationManager {
    private static volatile DownloadNotificationManager instance;
    private static final Object sLock = new Object();
    private final SparseArray<a> notificationItemArray = new SparseArray<>();
    private final Set<String> notificationTagSet = new HashSet();

    static boolean isCompleteVisibility(int i) {
        return i == 1 || i == 3;
    }

    private DownloadNotificationManager() {
    }

    public static DownloadNotificationManager getInstance() {
        if (instance == null) {
            synchronized (DownloadNotificationManager.class) {
                if (instance == null) {
                    instance = new DownloadNotificationManager();
                }
            }
        }
        return instance;
    }

    public void clearNotification() {
        SparseArray<a> clone;
        synchronized (this.notificationItemArray) {
            clone = this.notificationItemArray.clone();
            this.notificationItemArray.clear();
        }
        for (int i = 0; i < clone.size(); i++) {
            a aVar = clone.get(clone.keyAt(i));
            if (aVar.f31094a != 0) {
                getInstance().cancel(aVar.f31094a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void cancelCompleteNotification(DownloadInfo downloadInfo) {
        if (isCompleteAndVisible(downloadInfo)) {
            cancelNotification(downloadInfo.getId());
        }
    }

    public void cancelNotification(int i) {
        removeNotification(i);
        if (i != 0) {
            getInstance().cancel(i);
        }
    }

    static boolean isCompleteAndVisible(DownloadInfo downloadInfo) {
        if (!downloadInfo.isDownloadOverStatus() || !isCompleteVisibility(downloadInfo.getNotificationVisibility())) {
            return false;
        }
        return true;
    }

    public void addNotification(a aVar) {
        if (aVar != null) {
            synchronized (this.notificationItemArray) {
                this.notificationItemArray.put(aVar.f31094a, aVar);
            }
        }
    }

    public void cancel(int i) {
        Context q = b.q();
        if (q != null && i != 0) {
            try {
                Intent intent = new Intent(q, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_CANCEL");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                q.startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    public a getNotificationItem(int i) {
        a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.notificationItemArray) {
            aVar = this.notificationItemArray.get(i);
        }
        return aVar;
    }

    public void hideNotification(int i) {
        DownloadInfo downloadInfo = Downloader.getInstance(b.q()).getDownloadInfo(i);
        if (downloadInfo != null) {
            updateNotificationState(downloadInfo);
            cancelCompleteNotification(downloadInfo);
        }
    }

    /* access modifiers changed from: package-private */
    public void updateNotificationState(DownloadInfo downloadInfo) {
        i i = b.i();
        if (i != null && downloadInfo.isDownloadOverStatus()) {
            downloadInfo.setNotificationVisibility(3);
            try {
                i.a(downloadInfo);
            } catch (SQLiteException unused) {
            }
        }
    }

    public a removeNotification(int i) {
        a aVar;
        if (i == 0) {
            return null;
        }
        synchronized (this.notificationItemArray) {
            aVar = this.notificationItemArray.get(i);
            if (aVar != null) {
                this.notificationItemArray.remove(i);
                new StringBuilder("removeNotificationId ").append(i);
            }
        }
        return aVar;
    }

    public void notifyByService(int i, int i2, Notification notification) {
        Context q = b.q();
        if (q != null && i != 0 && notification != null) {
            try {
                Intent intent = new Intent(q, DownloadNotificationService.class);
                intent.setAction("android.ss.intent.action.DOWNLOAD_NOTIFICATION_NOTIFY");
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA", notification);
                intent.putExtra("DOWNLOAD_NOTIFICATION_EXTRA_STATUS", i2);
                intent.putExtra("DOWNLOAD_NOTIFICATION_BUNDLE_EXTRA_ID", i);
                q.startService(intent);
            } catch (Throwable unused) {
            }
        }
    }
}

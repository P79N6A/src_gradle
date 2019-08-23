package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.i;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.v;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;

public class Downloader {
    private static volatile Downloader instance;

    private void createDownloadProxy() {
    }

    public void setDownloadInMultiProcess() {
        b.a();
    }

    private Downloader() {
        b.a((DownloaderBuilder) null);
    }

    public boolean isHttpServiceInit() {
        c.a();
        return b.r();
    }

    public boolean isDownloadCacheSyncSuccess() {
        c.a();
        l a2 = l.a(false);
        if (a2 != null) {
            return a2.d();
        }
        return false;
    }

    public void destoryDownloader() {
        try {
            if (!(!b.f30906f || b.f30903c == null || b.f30901a == null)) {
                b.f30901a.unregisterReceiver(b.f30903c);
            }
        } catch (Exception unused) {
        }
    }

    public void pauseAll() {
        c.a();
        l a2 = l.a(false);
        if (a2 != null) {
            a2.a();
        }
        l a3 = l.a(true);
        if (a3 != null) {
            a3.a();
        }
    }

    Downloader(DownloaderBuilder downloaderBuilder) {
        b.a(downloaderBuilder);
        createDownloadProxy();
    }

    public static DownloadTask with(Context context) {
        getInstance(context);
        return new DownloadTask();
    }

    public void clearDownloadData(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.k(i);
        }
    }

    public void forceDownloadIngoreRecommendSize(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.l(i);
        }
    }

    public void pause(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.a(i);
        }
    }

    @Deprecated
    public void removeTaskMainListener(int i) {
        c.a().a(i, null, g.MAIN, true);
    }

    @Deprecated
    public void removeTaskNotificationListener(int i) {
        c.a().a(i, null, g.NOTIFICATION, true);
    }

    @Deprecated
    public void removeTaskSubListener(int i) {
        c.a().a(i, null, g.SUB, true);
    }

    public void restart(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.e(i);
        }
    }

    public void resume(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.d(i);
        }
    }

    public static Downloader getInstance(Context context) {
        if (instance == null) {
            synchronized (Downloader.class) {
                if (instance == null) {
                    b.a(context);
                    instance = new Downloader();
                }
            }
        }
        return instance;
    }

    public static synchronized void init(DownloaderBuilder downloaderBuilder) {
        synchronized (Downloader.class) {
            if (downloaderBuilder != null) {
                instance = new Downloader(downloaderBuilder);
            }
        }
    }

    public boolean canResume(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return false;
        }
        return c2.c(i);
    }

    public void cancel(int i) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.b(i);
            c2.a(i, false);
        }
    }

    public long getCurBytes(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return 0;
        }
        return c2.f(i);
    }

    public n getDownloadFileUriProvider(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return null;
        }
        return c2.u(i);
    }

    public DownloadInfo getDownloadInfo(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return null;
        }
        return c2.i(i);
    }

    public u getDownloadNotificationEventListener(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return null;
        }
        return c2.s(i);
    }

    public int getStatus(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return 0;
        }
        return c2.g(i);
    }

    public boolean isDownloadSuccessAndFileNotExist(DownloadInfo downloadInfo) {
        c a2 = c.a();
        if (downloadInfo == null) {
            return false;
        }
        l c2 = a2.c(downloadInfo.getId());
        if (c2 == null) {
            return false;
        }
        return c2.a(downloadInfo);
    }

    public boolean isDownloading(int i) {
        l c2 = c.a().c(i);
        if (c2 == null) {
            return false;
        }
        return c2.h(i);
    }

    public void registerDownloadCacheSyncListener(i iVar) {
        c.a();
        if (iVar != null && !b.h.contains(iVar)) {
            b.h.add(iVar);
        }
    }

    public void restartAllFailedDownloadTasks(List<String> list) {
        c.a();
        l a2 = l.a(false);
        if (a2 != null) {
            a2.a(list);
        }
        l a3 = l.a(true);
        if (a3 != null) {
            a3.a(list);
        }
    }

    public void setLogLevel(int i) {
        c.a();
        l a2 = l.a(false);
        if (a2 != null) {
            a2.m(i);
        }
        l a3 = l.a(true);
        if (a3 != null) {
            a3.m(i);
        }
    }

    public void unRegisterDownloadCacheSyncListener(i iVar) {
        c.a();
        if (iVar != null && b.h.contains(iVar)) {
            b.h.remove(iVar);
        }
    }

    public void unRegisterDownloaderProcessConnectedListener(v vVar) {
        c a2 = c.a();
        if (vVar != null) {
            synchronized (a2.f30909b) {
                if (a2.f30909b.contains(vVar)) {
                    a2.f30909b.remove(vVar);
                }
            }
        }
    }

    public List<DownloadInfo> getDownloadingDownloadInfosWithMimeType(String str) {
        List list;
        c.a();
        SparseArray sparseArray = new SparseArray();
        l a2 = l.a(false);
        List list2 = null;
        if (a2 != null) {
            list = a2.d(str);
        } else {
            list = null;
        }
        l a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.d(str);
        }
        return c.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getFailedDownloadInfosWithMimeType(String str) {
        List list;
        c.a();
        SparseArray sparseArray = new SparseArray();
        l a2 = l.a(false);
        List list2 = null;
        if (a2 != null) {
            list = a2.a(str);
        } else {
            list = null;
        }
        l a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.a(str);
        }
        return c.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getSuccessedDownloadInfosWithMimeType(String str) {
        List list;
        c.a();
        SparseArray sparseArray = new SparseArray();
        l a2 = l.a(false);
        List list2 = null;
        if (a2 != null) {
            list = a2.b(str);
        } else {
            list = null;
        }
        l a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.b(str);
        }
        return c.a(list, list2, sparseArray);
    }

    public List<DownloadInfo> getUnCompletedDownloadInfosWithMimeType(String str) {
        List list;
        c.a();
        SparseArray sparseArray = new SparseArray();
        l a2 = l.a(false);
        List list2 = null;
        if (a2 != null) {
            list = a2.c(str);
        } else {
            list = null;
        }
        l a3 = l.a(true);
        if (a3 != null) {
            list2 = a3.c(str);
        }
        return c.a(list, list2, sparseArray);
    }

    public void registerDownloaderProcessConnectedListener(v vVar) {
        c a2 = c.a();
        if (vVar != null && !d.c()) {
            l.a(true);
            synchronized (a2.f30909b) {
                if (!a2.f30909b.contains(vVar)) {
                    a2.f30909b.add(vVar);
                }
            }
        }
    }

    public int getDownloadId(String str, String str2) {
        c.a();
        return c.a(str, str2);
    }

    public void addMainThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.MAIN, false);
    }

    public void addNotificationListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.NOTIFICATION, false);
    }

    public void addSubThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.SUB, false);
    }

    public void removeMainThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().a(i, iDownloadListener, g.MAIN, false);
    }

    public void removeNotificationListener(int i, IDownloadListener iDownloadListener) {
        c.a().a(i, iDownloadListener, g.NOTIFICATION, false);
    }

    public void removeSubThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().a(i, iDownloadListener, g.SUB, false);
    }

    public void setDownloadNotificationEventListener(int i, u uVar) {
        l c2 = c.a().c(i);
        if (c2 != null) {
            c2.a(i, uVar);
        }
    }

    @Deprecated
    public void setMainThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.MAIN, true);
    }

    @Deprecated
    public void setNotificationListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.NOTIFICATION, true);
    }

    @Deprecated
    public void setSubThreadListener(int i, IDownloadListener iDownloadListener) {
        c.a().b(i, iDownloadListener, g.SUB, true);
    }

    public DownloadInfo getDownloadInfo(String str, String str2) {
        c a2 = c.a();
        int a3 = c.a(str, str2);
        l c2 = a2.c(a3);
        if (c2 == null) {
            return null;
        }
        return c2.i(a3);
    }
}

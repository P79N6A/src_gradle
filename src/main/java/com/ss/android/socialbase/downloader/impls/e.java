package com.ss.android.socialbase.downloader.impls;

import com.ss.android.socialbase.downloader.c.a;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.d.c;
import com.ss.android.socialbase.downloader.d.d;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class e extends a {

    /* renamed from: b  reason: collision with root package name */
    private static d f31017b;

    public final List<Integer> a() {
        return f31017b.b();
    }

    public e() {
        f31017b = new d();
    }

    public final void b(int i) {
        if (f31017b != null) {
            f31017b.b(i);
        }
    }

    public final boolean a(int i) {
        if (f31017b == null || !f31017b.a(i)) {
            return false;
        }
        DownloadInfo d2 = d(i);
        if (d2 == null) {
            return false;
        }
        if (f.b(d2.getStatus())) {
            return true;
        }
        b(i);
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c(int i) {
        if (f31017b != null) {
            d dVar = f31017b;
            dVar.a();
            synchronized (d.class) {
                c cVar = dVar.f30873a.get(i);
                if (cVar != null) {
                    cVar.b();
                    d.a(cVar);
                    dVar.f30873a.remove(i);
                }
            }
        }
    }

    public final void a(DownloadTask downloadTask) {
        int i;
        int i2;
        int i3;
        if (downloadTask != null) {
            c cVar = new c(downloadTask, this.f30994a);
            d dVar = f31017b;
            cVar.f30867c.a();
            synchronized (d.class) {
                dVar.f30873a.put(cVar.e(), cVar);
            }
            DownloadTask downloadTask2 = cVar.f30865a;
            try {
                ExecutorService e2 = b.e();
                if (e2 != null) {
                    e2.execute(cVar);
                } else {
                    IDownloadMonitorDepend monitorDepend = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo = downloadTask2.getDownloadInfo();
                    BaseException baseException = new BaseException(1003, "execute failed cpu thread executor service is null");
                    if (downloadTask2.getDownloadInfo() != null) {
                        i3 = downloadTask2.getDownloadInfo().getStatus();
                    } else {
                        i3 = 0;
                    }
                    a.a(monitorDepend, downloadInfo, baseException, i3);
                }
            } catch (Exception e3) {
                if (downloadTask2 != null) {
                    IDownloadMonitorDepend monitorDepend2 = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo2 = downloadTask2.getDownloadInfo();
                    BaseException baseException2 = new BaseException(1003, com.ss.android.socialbase.downloader.e.d.b((Throwable) e3, "DownloadThreadPoolExecute"));
                    if (downloadTask2.getDownloadInfo() != null) {
                        i = downloadTask2.getDownloadInfo().getStatus();
                    } else {
                        i = 0;
                    }
                    a.a(monitorDepend2, downloadInfo2, baseException2, i);
                }
            } catch (OutOfMemoryError unused) {
                if (downloadTask2 != null) {
                    IDownloadMonitorDepend monitorDepend3 = downloadTask2.getMonitorDepend();
                    DownloadInfo downloadInfo3 = downloadTask2.getDownloadInfo();
                    BaseException baseException3 = new BaseException(1003, "execute OOM");
                    if (downloadTask2.getDownloadInfo() != null) {
                        i2 = downloadTask2.getDownloadInfo().getStatus();
                    } else {
                        i2 = 0;
                    }
                    a.a(monitorDepend3, downloadInfo3, baseException3, i2);
                }
            }
            if (dVar.f30874b >= 500) {
                dVar.a();
                dVar.f30874b = 0;
                return;
            }
            dVar.f30874b++;
        }
    }
}

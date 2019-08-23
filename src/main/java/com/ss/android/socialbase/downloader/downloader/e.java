package com.ss.android.socialbase.downloader.downloader;

import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.constants.a;
import com.ss.android.socialbase.downloader.constants.b;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.constants.i;
import com.ss.android.socialbase.downloader.depend.IDownloadDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.e.c;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f30921a = "e";

    /* renamed from: b  reason: collision with root package name */
    public DownloadInfo f30922b;

    /* renamed from: c  reason: collision with root package name */
    public final i f30923c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f30924d;

    /* renamed from: e  reason: collision with root package name */
    private DownloadTask f30925e;

    /* renamed from: f  reason: collision with root package name */
    private List<IDownloadListener> f30926f;
    private List<IDownloadListener> g;
    private List<IDownloadListener> h;
    private boolean i;
    private volatile long j;
    private final AtomicLong k = new AtomicLong();
    private boolean l = false;
    private int m;
    private long n;
    private IDownloadDepend o;
    private IDownloadMonitorDepend p;

    public final void b() {
        a(-4, (BaseException) null);
    }

    public final void a() {
        if (!this.f30922b.canSkipStatusHandler()) {
            this.f30922b.setStatus(1);
            ExecutorService f2 = b.f();
            if (f2 != null) {
                f2.execute(new Runnable() {
                    public final void run() {
                        e.this.f30923c.h(e.this.f30922b.getId());
                        e.this.a(1, (BaseException) null);
                    }
                });
            }
        }
    }

    public final void c() {
        this.f30922b.setStatus(-2);
        try {
            this.f30923c.d(this.f30922b.getId(), this.f30922b.getCurBytes());
        } catch (SQLiteException unused) {
        }
        a(-2, (BaseException) null);
    }

    public final void d() {
        this.f30922b.setStatus(8);
        this.f30922b.setAsyncHandleStatus(a.ASYNC_HANDLE_WAITING);
        com.ss.android.socialbase.downloader.impls.a m2 = b.m();
        if (m2 != null) {
            m2.a(this.f30922b.getId(), 8);
        }
    }

    private void e() {
        if (this.f30925e != null) {
            this.f30922b = this.f30925e.getDownloadInfo();
            this.f30926f = this.f30925e.getDownloadListeners(g.MAIN);
            this.h = this.f30925e.getDownloadListeners(g.NOTIFICATION);
            this.g = this.f30925e.getDownloadListeners(g.SUB);
            this.o = this.f30925e.getDepend();
            this.p = this.f30925e.getMonitorDepend();
        }
    }

    private boolean a(boolean z) {
        boolean z2 = false;
        if (this.f30922b.getCurBytes() == this.f30922b.getTotalBytes()) {
            try {
                this.f30923c.a(this.f30922b.getId(), this.f30922b.getCurBytes());
            } catch (Exception unused) {
            }
            return false;
        }
        if (this.i) {
            this.i = false;
            this.f30922b.setStatus(4);
        }
        if (this.f30922b.isNeedPostProgress() && z) {
            z2 = true;
        }
        a(4, (BaseException) null, z2);
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.socialbase.downloader.exception.BaseException r5) {
        /*
            r4 = this;
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r4.f30922b
            r1 = 0
            r0.setFirstDownload(r1)
            if (r5 == 0) goto L_0x0022
            java.lang.Throwable r0 = r5.getCause()
            if (r0 == 0) goto L_0x0022
            java.lang.Throwable r0 = r5.getCause()
            boolean r0 = r0 instanceof android.database.sqlite.SQLiteFullException
            if (r0 == 0) goto L_0x0022
            com.ss.android.socialbase.downloader.downloader.i r0 = r4.f30923c     // Catch:{ SQLiteException -> 0x003f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f30922b     // Catch:{ SQLiteException -> 0x003f }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x003f }
            r0.f(r1)     // Catch:{ SQLiteException -> 0x003f }
            goto L_0x003f
        L_0x0022:
            com.ss.android.socialbase.downloader.downloader.i r0 = r4.f30923c     // Catch:{ SQLiteException -> 0x0034 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f30922b     // Catch:{ SQLiteException -> 0x0034 }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x0034 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r4.f30922b     // Catch:{ SQLiteException -> 0x0034 }
            long r2 = r2.getCurBytes()     // Catch:{ SQLiteException -> 0x0034 }
            r0.b((int) r1, (long) r2)     // Catch:{ SQLiteException -> 0x0034 }
            goto L_0x003f
        L_0x0034:
            com.ss.android.socialbase.downloader.downloader.i r0 = r4.f30923c     // Catch:{ SQLiteException -> 0x003f }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r4.f30922b     // Catch:{ SQLiteException -> 0x003f }
            int r1 = r1.getId()     // Catch:{ SQLiteException -> 0x003f }
            r0.f(r1)     // Catch:{ SQLiteException -> 0x003f }
        L_0x003f:
            r0 = -1
            r4.a((int) r0, (com.ss.android.socialbase.downloader.exception.BaseException) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.e.a(com.ss.android.socialbase.downloader.exception.BaseException):void");
    }

    public final synchronized boolean a(long j2) {
        boolean z;
        this.k.addAndGet(j2);
        this.f30922b.increaseCurBytes(j2);
        long uptimeMillis = SystemClock.uptimeMillis();
        z = true;
        if (!this.l) {
            this.l = true;
        } else {
            long j3 = uptimeMillis - this.j;
            if (this.k.get() < this.n) {
                if (j3 < ((long) this.m)) {
                    z = false;
                }
            }
            if (z) {
                this.j = uptimeMillis;
                this.k.set(0);
            }
        }
        return a(z);
    }

    public final void a(int i2, BaseException baseException) {
        a(i2, baseException, true);
    }

    public e(DownloadTask downloadTask, Handler handler) {
        this.f30925e = downloadTask;
        e();
        this.f30924d = handler;
        this.f30923c = b.i();
    }

    public final void a(BaseException baseException, boolean z) {
        int i2;
        this.f30922b.setFirstDownload(false);
        this.k.set(0);
        this.f30923c.g(this.f30922b.getId());
        if (z) {
            i2 = 7;
        } else {
            i2 = 5;
        }
        a(i2, baseException);
    }

    public final void a(long j2, String str, String str2) {
        this.f30922b.setTotalBytes(j2);
        this.f30922b.seteTag(str);
        if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(this.f30922b.getName())) {
            this.f30922b.setName(str2);
        }
        try {
            this.f30923c.a(this.f30922b.getId(), j2, str, str2);
        } catch (Exception unused) {
        }
        a(3, (BaseException) null);
        this.n = this.f30922b.getMinByteIntervalForPostToMainThread(j2);
        this.m = this.f30922b.getMinProgressTimeMsInterval();
        this.i = true;
    }

    private void a(int i2, BaseException baseException, boolean z) {
        if (this.f30922b.getStatus() != -3 || i2 != 4) {
            e();
            if (f.d(i2)) {
                this.f30922b.updateDownloadTime();
            }
            if (this.o != null && f.c(i2)) {
                try {
                    this.o.monitorLogSend(this.f30922b, baseException, i2);
                } catch (Throwable unused) {
                }
            }
            if (f.c(i2)) {
                com.ss.android.socialbase.downloader.c.a.a(this.p, this.f30922b, baseException, i2);
            }
            if (i2 == 6) {
                this.f30922b.setStatus(2);
            } else if (i2 == -6) {
                this.f30922b.setStatus(-3);
            } else {
                this.f30922b.setStatus(i2);
            }
            if (this.f30922b.getStatus() == -3 || this.f30922b.getStatus() == -1) {
                if (this.f30922b.getRetryDelayStatus() == i.DELAY_RETRY_DOWNLOADING) {
                    this.f30922b.setRetryDelayStatus(i.DELAY_RETRY_DOWNLOADED);
                }
                if (this.f30922b.getAsyncHandleStatus() == a.ASYNC_HANDLE_DOWNLOADING) {
                    this.f30922b.setAsyncHandleStatus(a.ASYNC_HANDLE_DOWNLOADED);
                }
                if (this.f30922b.getByteInvalidRetryStatus() == b.BYTE_INVALID_RETRY_STATUS_DOWNLOADING) {
                    this.f30922b.setByteInvalidRetryStatus(b.BYTE_INVALID_RETRY_STATUS_DOWNLOADED);
                }
            }
            c.a(i2, this.g, true, this.f30922b, baseException);
            if (i2 != -4) {
                if (!z || ((this.f30926f == null && (this.h == null || !this.f30922b.canShowNotification())) || this.f30924d == null)) {
                    com.ss.android.socialbase.downloader.impls.a m2 = b.m();
                    if (m2 != null) {
                        m2.a(this.f30922b.getId(), i2);
                    }
                    return;
                }
                this.f30924d.obtainMessage(i2, this.f30922b.getId(), 0, baseException).sendToTarget();
            }
        }
    }
}

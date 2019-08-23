package com.ss.android.socialbase.downloader.impls;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.EnqueueType;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.d.f;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend;
import com.ss.android.socialbase.downloader.depend.n;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.e;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.e.c;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;

public abstract class a implements f.a {

    /* renamed from: a  reason: collision with root package name */
    protected final f f30994a = new f(Looper.getMainLooper(), this);

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<DownloadTask> f30995b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<DownloadTask> f30996c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<DownloadTask> f30997d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final SparseArray<DownloadTask> f30998e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    private final SparseArray<DownloadTask> f30999f = new SparseArray<>();
    private final LinkedBlockingDeque<DownloadTask> g = new LinkedBlockingDeque<>();
    private final i h = b.i();

    /* access modifiers changed from: protected */
    public abstract List<Integer> a();

    /* access modifiers changed from: protected */
    public abstract void a(DownloadTask downloadTask);

    public abstract boolean a(int i);

    /* access modifiers changed from: protected */
    public abstract void b(int i);

    /* access modifiers changed from: protected */
    public abstract void c(int i);

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.util.List<java.lang.String> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = 0
        L_0x0002:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r1 = r4.f30997d     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            int r1 = r1.size()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            if (r0 >= r1) goto L_0x0037
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r1 = r4.f30997d     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            int r1 = r1.keyAt(r0)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r2 = r4.f30997d     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            if (r1 == 0) goto L_0x0034
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.getDownloadInfo()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            if (r2 == 0) goto L_0x0034
            java.lang.String r3 = r2.getMimeType()     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            boolean r3 = r5.contains(r3)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            if (r3 == 0) goto L_0x0034
            r3 = 1
            r2.setAutoResumed(r3)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r2.setShowNotificationForNetworkResumed(r3)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
            r4.b((com.ss.android.socialbase.downloader.model.DownloadTask) r1)     // Catch:{ Exception -> 0x003c, all -> 0x0039 }
        L_0x0034:
            int r0 = r0 + 1
            goto L_0x0002
        L_0x0037:
            monitor-exit(r4)
            return
        L_0x0039:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x003c:
            monitor-exit(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.a(java.util.List):void");
    }

    public final void b() {
        List<Integer> a2 = a();
        if (a2 != null) {
            for (Integer intValue : a2) {
                e(intValue.intValue());
            }
        }
    }

    protected a() {
    }

    public final synchronized boolean g(int i) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            b(downloadTask);
        } else {
            h(i);
        }
        return true;
    }

    public final synchronized void p(int i) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                downloadInfo.setForceIgnoreRecommendSize(true);
                b(downloadTask);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r(int r3) {
        /*
            r2 = this;
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r2.g
            monitor-enter(r0)
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r1 = r2.g     // Catch:{ all -> 0x003b }
            java.lang.Object r1 = r1.getFirst()     // Catch:{ all -> 0x003b }
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = (com.ss.android.socialbase.downloader.model.DownloadTask) r1     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x0021
            int r1 = r1.getDownloadId()     // Catch:{ all -> 0x003b }
            if (r1 != r3) goto L_0x0021
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.g     // Catch:{ all -> 0x003b }
            r3.poll()     // Catch:{ all -> 0x003b }
        L_0x0021:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.g     // Catch:{ all -> 0x003b }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x002b
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x002b:
            java.util.concurrent.LinkedBlockingDeque<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r2.g     // Catch:{ all -> 0x003b }
            java.lang.Object r3 = r3.getFirst()     // Catch:{ all -> 0x003b }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0039
            r1 = 1
            r2.a((com.ss.android.socialbase.downloader.model.DownloadTask) r3, (boolean) r1)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.r(int):void");
    }

    public final List<DownloadInfo> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer intValue : a()) {
            DownloadInfo d2 = d(intValue.intValue());
            if (d2 != null && str.equals(d2.getMimeType())) {
                arrayList.add(d2);
            }
        }
        return arrayList;
    }

    public final DownloadInfo d(int i) {
        DownloadInfo b2 = this.h.b(i);
        if (b2 == null && this.f30995b != null) {
            synchronized (this.f30995b) {
                DownloadTask downloadTask = this.f30995b.get(i);
                if (downloadTask != null) {
                    b2 = downloadTask.getDownloadInfo();
                }
            }
        }
        return b2;
    }

    public final boolean f(int i) {
        synchronized (this.f30995b) {
            final DownloadTask downloadTask = this.f30995b.get(i);
            if (downloadTask != null) {
                new e(downloadTask, this.f30994a).b();
                this.f30994a.post(new Runnable() {
                    public final void run() {
                        List<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(g.MAIN);
                        List<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(g.NOTIFICATION);
                        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                        if (downloadListeners != null) {
                            synchronized (downloadListeners) {
                                for (IDownloadListener next : downloadListeners) {
                                    if (next != null) {
                                        next.onCanceled(downloadInfo);
                                    }
                                }
                            }
                        }
                        if (downloadInfo != null && downloadInfo.canShowNotification() && downloadListeners2 != null) {
                            synchronized (downloadListeners2) {
                                for (IDownloadListener next2 : downloadListeners2) {
                                    if (next2 != null) {
                                        next2.onCanceled(downloadInfo);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
        DownloadInfo b2 = this.h.b(i);
        if (b2 != null && com.ss.android.socialbase.downloader.constants.f.b(b2.getStatus())) {
            b2.setStatus(-4);
        }
        n(i);
        return true;
    }

    public final synchronized boolean h(int i) {
        DownloadTask downloadTask = this.f30997d.get(i);
        if (downloadTask != null) {
            b(downloadTask);
        } else {
            DownloadTask downloadTask2 = this.f30998e.get(i);
            if (downloadTask2 == null) {
                return false;
            }
            b(downloadTask2);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean l(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r3.f30998e     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = (com.ss.android.socialbase.downloader.model.DownloadTask) r0     // Catch:{ all -> 0x0036 }
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r0.getDownloadInfo()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x001e
            boolean r4 = r2.canStartRetryDelayTask()     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x001b
            r3.a((com.ss.android.socialbase.downloader.model.DownloadTask) r0, (boolean) r1)     // Catch:{ all -> 0x0036 }
        L_0x001b:
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001e:
            com.ss.android.socialbase.downloader.downloader.i r0 = r3.h     // Catch:{ all -> 0x0036 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.b((int) r4)     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x0034
            boolean r0 = r4.canStartRetryDelayTask()     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = new com.ss.android.socialbase.downloader.model.DownloadTask     // Catch:{ all -> 0x0036 }
            r0.<init>(r4)     // Catch:{ all -> 0x0036 }
            r3.a((com.ss.android.socialbase.downloader.model.DownloadTask) r0, (boolean) r1)     // Catch:{ all -> 0x0036 }
        L_0x0034:
            monitor-exit(r3)
            return r1
        L_0x0036:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.l(int):boolean");
    }

    public final synchronized boolean m(int i) {
        DownloadTask downloadTask = this.f30999f.get(i);
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                if (downloadInfo.canReStartAsyncTask()) {
                    b(downloadTask);
                }
                return true;
            }
        }
        return false;
    }

    public final void n(final int i) {
        DownloadInfo b2 = this.h.b(i);
        if (b2 != null) {
            a(b2);
        }
        c(i);
        this.f30994a.post(new Runnable() {
            public final void run() {
                DownloadNotificationManager.getInstance().cancelNotification(i);
            }
        });
        if (d.d()) {
            AnonymousClass3 r0 = new Runnable() {
                public final void run() {
                    a.this.o(i);
                }
            };
            ExecutorService f2 = b.f();
            if (f2 != null) {
                f2.execute(r0);
            }
            return;
        }
        o(i);
    }

    public final synchronized boolean q(int i) {
        boolean z;
        if (i != 0) {
            if (!((this.f30995b == null || this.f30995b.get(i) == null) && (this.f30997d == null || this.f30997d.get(i) == null))) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    private static void a(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            try {
                if (downloadInfo.getStatus() == 7 || downloadInfo.getRetryDelayStatus() != com.ss.android.socialbase.downloader.constants.i.DELAY_RETRY_NONE) {
                    downloadInfo.setStatus(5);
                    downloadInfo.setRetryDelayStatus(com.ss.android.socialbase.downloader.constants.i.DELAY_RETRY_NONE);
                    AlarmManager d2 = b.d();
                    Intent intent = new Intent("com.ss.android.downloader.action.DOWNLOAD_WAKEUP");
                    intent.putExtra("extra_download_id", downloadInfo.getId());
                    intent.setClass(b.q(), DownloadHandleService.class);
                    d2.cancel(PendingIntent.getService(b.q(), downloadInfo.getId(), intent, 1073741824));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_NONE) {
                    c(downloadTask);
                } else {
                    a(downloadTask, true);
                }
            }
        }
    }

    public final boolean e(int i) {
        b(i);
        DownloadInfo b2 = this.h.b(i);
        if (b2 == null) {
            synchronized (this.f30995b) {
                DownloadTask downloadTask = this.f30995b.get(i);
                if (downloadTask != null) {
                    new e(downloadTask, this.f30994a).c();
                    return true;
                }
            }
        } else {
            a(b2);
            if (b2.getStatus() == 1) {
                synchronized (this.f30995b) {
                    DownloadTask downloadTask2 = this.f30995b.get(i);
                    if (downloadTask2 != null) {
                        new e(downloadTask2, this.f30994a).c();
                        return true;
                    }
                }
            } else if (com.ss.android.socialbase.downloader.constants.f.b(b2.getStatus())) {
                b2.setStatus(-2);
                return true;
            }
        }
        return false;
    }

    public final synchronized x i(int i) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationClickCallback();
        }
        DownloadTask downloadTask2 = this.f30996c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationClickCallback();
        }
        DownloadTask downloadTask3 = this.f30997d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationClickCallback();
        }
        DownloadTask downloadTask4 = this.f30998e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationClickCallback();
        }
        DownloadTask downloadTask5 = this.f30999f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationClickCallback();
    }

    public final synchronized u j(int i) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            return downloadTask.getNotificationEventListener();
        }
        DownloadTask downloadTask2 = this.f30996c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getNotificationEventListener();
        }
        DownloadTask downloadTask3 = this.f30997d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getNotificationEventListener();
        }
        DownloadTask downloadTask4 = this.f30998e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getNotificationEventListener();
        }
        DownloadTask downloadTask5 = this.f30999f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getNotificationEventListener();
    }

    public final synchronized n k(int i) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            return downloadTask.getFileUriProvider();
        }
        DownloadTask downloadTask2 = this.f30996c.get(i);
        if (downloadTask2 != null) {
            return downloadTask2.getFileUriProvider();
        }
        DownloadTask downloadTask3 = this.f30997d.get(i);
        if (downloadTask3 != null) {
            return downloadTask3.getFileUriProvider();
        }
        DownloadTask downloadTask4 = this.f30998e.get(i);
        if (downloadTask4 != null) {
            return downloadTask4.getFileUriProvider();
        }
        DownloadTask downloadTask5 = this.f30999f.get(i);
        if (downloadTask5 == null) {
            return null;
        }
        return downloadTask5.getFileUriProvider();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:1|2|(1:4)|5|6|7|8|(1:10)|11|(1:13)|14|(1:16)|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ Throwable -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[Catch:{ Throwable -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[Catch:{ Throwable -> 0x0043 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void o(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.ss.android.socialbase.downloader.downloader.i r0 = r1.h     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.b((int) r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            if (r0 == 0) goto L_0x000c
            com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r0)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
        L_0x000c:
            com.ss.android.socialbase.downloader.downloader.i r0 = r1.h     // Catch:{ SQLiteException -> 0x0011 }
            r0.f(r2)     // Catch:{ SQLiteException -> 0x0011 }
        L_0x0011:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30997d     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            if (r0 == 0) goto L_0x001e
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30997d     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            r0.remove(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
        L_0x001e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30996c     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            if (r0 == 0) goto L_0x002b
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30996c     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            r0.remove(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
        L_0x002b:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30995b     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = (com.ss.android.socialbase.downloader.model.DownloadTask) r0     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            if (r0 == 0) goto L_0x003e
            r0 = -4
            r1.a((int) r2, (int) r0)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30995b     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
            r0.remove(r2)     // Catch:{ Throwable -> 0x0043, all -> 0x0040 }
        L_0x003e:
            monitor-exit(r1)
            return
        L_0x0040:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0043:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.o(int):void");
    }

    private void c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                try {
                    synchronized (this.g) {
                        if (this.g.isEmpty()) {
                            a(downloadTask, true);
                            this.g.put(downloadTask);
                        } else if (downloadInfo.getEnqueueType() != EnqueueType.ENQUEUE_TAIL) {
                            DownloadTask first = this.g.getFirst();
                            if (first.getDownloadId() != downloadTask.getDownloadId() || !a(downloadTask.getDownloadId())) {
                                e(first.getDownloadId());
                                a(downloadTask, true);
                                if (first.getDownloadId() != downloadTask.getDownloadId()) {
                                    this.g.putFirst(downloadTask);
                                }
                            }
                        } else if (this.g.getFirst().getDownloadId() != downloadTask.getDownloadId() || !a(downloadTask.getDownloadId())) {
                            Iterator<DownloadTask> it2 = this.g.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                DownloadTask next = it2.next();
                                if (next != null && next.getDownloadId() == downloadTask.getDownloadId()) {
                                    it2.remove();
                                    break;
                                }
                            }
                            this.g.put(downloadTask);
                            new e(downloadTask, this.f30994a).a();
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public final void a(Message message) {
        BaseException baseException;
        int i = message.arg1;
        if (message.obj instanceof Exception) {
            baseException = (BaseException) message.obj;
        } else {
            baseException = null;
        }
        synchronized (a.class) {
            DownloadTask downloadTask = this.f30995b.get(i);
            if (downloadTask != null) {
                int i2 = message.what;
                if (downloadTask != null) {
                    DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
                    List<IDownloadListener> downloadListeners = downloadTask.getDownloadListeners(g.MAIN);
                    List<IDownloadListener> downloadListeners2 = downloadTask.getDownloadListeners(g.NOTIFICATION);
                    boolean canShowNotification = downloadTask.canShowNotification();
                    c.a(i2, downloadListeners, true, downloadInfo, baseException);
                    c.a(i2, downloadListeners2, canShowNotification, downloadInfo, baseException);
                }
                a(i, message.what);
            }
        }
    }

    private void a(DownloadTask downloadTask, boolean z) {
        if (downloadTask != null) {
            DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null) {
                int i = 0;
                if (downloadInfo.isEntityInvalid()) {
                    IDownloadMonitorDepend monitorDepend = downloadTask.getMonitorDepend();
                    BaseException baseException = new BaseException(1003, "downloadInfo is Invalid, url is " + downloadInfo.getUrl() + " name is " + downloadInfo.getName() + " savePath is " + downloadInfo.getSavePath());
                    if (downloadInfo != null) {
                        i = downloadInfo.getStatus();
                    }
                    com.ss.android.socialbase.downloader.c.a.a(monitorDepend, downloadInfo, baseException, i);
                    return;
                }
                int id = downloadInfo.getId();
                if (z) {
                    a(downloadInfo);
                }
                synchronized (this.f30997d) {
                    if (this.f30997d.get(id) != null) {
                        this.f30997d.remove(id);
                    }
                }
                synchronized (this.f30996c) {
                    if (this.f30996c.get(id) != null) {
                        this.f30996c.remove(id);
                    }
                }
                synchronized (this.f30998e) {
                    if (this.f30998e.get(id) != null) {
                        this.f30998e.remove(id);
                    }
                }
                synchronized (this.f30999f) {
                    if (this.f30999f.get(id) != null) {
                        this.f30999f.remove(id);
                    }
                }
                if (!a(id) || downloadInfo.canReStartAsyncTask()) {
                    if (downloadInfo.canReStartAsyncTask()) {
                        downloadInfo.setAsyncHandleStatus(com.ss.android.socialbase.downloader.constants.a.ASYNC_HANDLE_RESTART);
                    }
                    synchronized (this.f30995b) {
                        if (this.f30995b.get(id) != null) {
                            this.f30995b.remove(id);
                        }
                        this.f30995b.put(id, downloadTask);
                    }
                    a(downloadTask);
                    return;
                }
                IDownloadMonitorDepend monitorDepend2 = downloadTask.getMonitorDepend();
                BaseException baseException2 = new BaseException(1003, "downloadInfo is isDownloading");
                if (downloadInfo != null) {
                    i = downloadInfo.getStatus();
                }
                com.ss.android.socialbase.downloader.c.a.a(monitorDepend2, downloadInfo, baseException2, i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(int r2, int r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            switch(r3) {
                case -7: goto L_0x006f;
                case -6: goto L_0x005b;
                case -4: goto L_0x0052;
                case -3: goto L_0x003f;
                case -1: goto L_0x006f;
                case 7: goto L_0x001e;
                case 8: goto L_0x0006;
                default: goto L_0x0004;
            }
        L_0x0004:
            goto L_0x0093
        L_0x0006:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x0057
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30999f     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0057
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30999f     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            goto L_0x0057
        L_0x001e:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x003a
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30998e     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0035
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30998e     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
        L_0x0035:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x003a:
            r1.r(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x003f:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30996c     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0057
        L_0x0052:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x0057:
            r1.r(r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x005b:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30996c     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x006f:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x0090 }
            com.ss.android.socialbase.downloader.model.DownloadTask r3 = (com.ss.android.socialbase.downloader.model.DownloadTask) r3     // Catch:{ all -> 0x0090 }
            if (r3 == 0) goto L_0x008b
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30997d     // Catch:{ all -> 0x0090 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0090 }
            if (r0 != 0) goto L_0x0086
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r0 = r1.f30997d     // Catch:{ all -> 0x0090 }
            r0.put(r2, r3)     // Catch:{ all -> 0x0090 }
        L_0x0086:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadTask> r3 = r1.f30995b     // Catch:{ all -> 0x0090 }
            r3.remove(r2)     // Catch:{ all -> 0x0090 }
        L_0x008b:
            r1.r(r2)     // Catch:{ all -> 0x0090 }
            monitor-exit(r1)
            return
        L_0x0090:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0093:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.a.a(int, int):void");
    }

    public final synchronized void a(int i, u uVar) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            downloadTask.setNotificationEventListener(uVar);
        }
    }

    public final synchronized void a(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            downloadTask.removeDownloadListener(iDownloadListener, gVar, z);
        }
    }

    public final synchronized void b(int i, final IDownloadListener iDownloadListener, g gVar, boolean z) {
        DownloadTask downloadTask = this.f30995b.get(i);
        if (downloadTask != null) {
            downloadTask.addDownloadListener(iDownloadListener, gVar, z);
            final DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
            if (downloadInfo != null && !a(i) && (gVar == g.MAIN || gVar == g.NOTIFICATION)) {
                boolean z2 = true;
                if (gVar == g.NOTIFICATION && !downloadInfo.canShowNotification()) {
                    z2 = false;
                }
                if (z2) {
                    this.f30994a.post(new Runnable() {
                        public final void run() {
                            if (!(downloadInfo == null || iDownloadListener == null)) {
                                if (downloadInfo.getStatus() == -3) {
                                    iDownloadListener.onSuccessed(downloadInfo);
                                } else if (downloadInfo.getStatus() == -1) {
                                    iDownloadListener.onFailed(downloadInfo, null);
                                }
                            }
                        }
                    });
                }
            }
        }
    }
}

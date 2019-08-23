package com.ss.android.socialbase.downloader.downloader;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.lang.ref.WeakReference;

public abstract class a implements n {

    /* renamed from: c  reason: collision with root package name */
    private static final String f30897c = "a";

    /* renamed from: a  reason: collision with root package name */
    protected final SparseArray<DownloadTask> f30898a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    protected volatile boolean f30899b = false;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<Service> f30900d;

    public IBinder a() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void a(Context context, ServiceConnection serviceConnection) {
    }

    public void a(m mVar) {
    }

    public void b() {
    }

    public final void c() {
        this.f30899b = false;
    }

    public void c(DownloadTask downloadTask) {
    }

    public void e() {
        if (!this.f30899b) {
            a(b.q(), (ServiceConnection) null);
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        new StringBuilder("resumePendingTask pendingTasks.size:").append(this.f30898a.size());
        synchronized (this.f30898a) {
            SparseArray<DownloadTask> clone = this.f30898a.clone();
            this.f30898a.clear();
            com.ss.android.socialbase.downloader.impls.a m = b.m();
            if (m != null) {
                for (int i = 0; i < clone.size(); i++) {
                    DownloadTask downloadTask = clone.get(clone.keyAt(i));
                    if (downloadTask != null) {
                        m.b(downloadTask);
                    }
                }
            }
        }
    }

    public void a(int i) {
        com.ss.android.socialbase.downloader.b.a.a(i);
    }

    public final void a(DownloadTask downloadTask) {
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("pendDownloadTask pendingTasks.size:");
            sb.append(this.f30898a.size());
            sb.append(" downloadTask.getDownloadId():");
            sb.append(downloadTask.getDownloadId());
            if (this.f30898a.get(downloadTask.getDownloadId()) == null) {
                synchronized (this.f30898a) {
                    if (this.f30898a.get(downloadTask.getDownloadId()) == null) {
                        this.f30898a.put(downloadTask.getDownloadId(), downloadTask);
                    }
                }
            }
            new StringBuilder("after pendDownloadTask pendingTasks.size:").append(this.f30898a.size());
        }
    }

    public void b(DownloadTask downloadTask) {
        if (downloadTask != null) {
            if (!this.f30899b) {
                a(downloadTask);
                a(b.q(), (ServiceConnection) null);
                return;
            }
            if (this.f30898a.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f30898a) {
                    if (this.f30898a.get(downloadTask.getDownloadId()) != null) {
                        this.f30898a.remove(downloadTask.getDownloadId());
                    }
                }
            }
            com.ss.android.socialbase.downloader.impls.a m = b.m();
            if (m != null) {
                m.b(downloadTask);
            }
            d();
        }
    }

    public final void a(WeakReference weakReference) {
        this.f30900d = weakReference;
    }

    public final void a(boolean z) {
        if (!this.f30899b) {
            if (com.ss.android.socialbase.downloader.b.a.a()) {
            }
        } else if (!(this.f30900d == null || this.f30900d.get() == null)) {
            ((Service) this.f30900d.get()).stopForeground(z);
        }
    }

    public final void a(int i, Notification notification) {
        if (!this.f30899b) {
            if (com.ss.android.socialbase.downloader.b.a.a()) {
            }
        } else if (!(this.f30900d == null || this.f30900d.get() == null)) {
            ((Service) this.f30900d.get()).startForeground(i, notification);
        }
    }
}

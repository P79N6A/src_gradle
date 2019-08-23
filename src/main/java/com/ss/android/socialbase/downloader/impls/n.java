package com.ss.android.socialbase.downloader.impls;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.IndependentProcessDownloadService;
import com.ss.android.socialbase.downloader.downloader.a;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.h;
import com.ss.android.socialbase.downloader.downloader.m;
import com.ss.android.socialbase.downloader.e.e;
import com.ss.android.socialbase.downloader.model.DownloadTask;

public class n extends a implements ServiceConnection {

    /* renamed from: c  reason: collision with root package name */
    private static final String f31034c = "n";

    /* renamed from: d  reason: collision with root package name */
    private h f31035d;

    /* renamed from: e  reason: collision with root package name */
    private m f31036e;

    /* renamed from: f  reason: collision with root package name */
    private int f31037f = -1;

    public final IBinder a() {
        return new m();
    }

    public final void e() {
        if (this.f31035d == null) {
            a(b.q(), this);
        }
    }

    public final void a(m mVar) {
        this.f31036e = mVar;
    }

    public void onBindingDied(ComponentName componentName) {
        this.f31035d = null;
        if (this.f31036e != null) {
            this.f31036e.g();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f31035d = null;
        this.f30899b = false;
        if (this.f31036e != null) {
            this.f31036e.g();
        }
    }

    public final void a(int i) {
        if (this.f31035d == null) {
            this.f31037f = i;
            a(b.q(), this);
            return;
        }
        try {
            this.f31035d.n(i);
        } catch (RemoteException unused) {
        }
    }

    public final void c(DownloadTask downloadTask) {
        if (downloadTask != null) {
            c.a().a(downloadTask.getDownloadId(), true);
            a m = b.m();
            if (m != null) {
                m.b(downloadTask);
            }
        }
    }

    public final void b(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask != null) {
            StringBuilder sb = new StringBuilder("tryDownload aidlService == null:");
            if (this.f31035d == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            if (this.f31035d == null) {
                a(downloadTask);
                a(b.q(), this);
                return;
            }
            if (this.f30898a.get(downloadTask.getDownloadId()) != null) {
                synchronized (this.f30898a) {
                    if (this.f30898a.get(downloadTask.getDownloadId()) != null) {
                        this.f30898a.remove(downloadTask.getDownloadId());
                    }
                }
            }
            try {
                this.f31035d.a(e.a(downloadTask));
            } catch (RemoteException unused) {
            }
            synchronized (this.f30898a) {
                SparseArray clone = this.f30898a.clone();
                this.f30898a.clear();
                if (b.m() != null) {
                    for (int i = 0; i < clone.size(); i++) {
                        if (((DownloadTask) clone.get(clone.keyAt(i))) != null) {
                            try {
                                this.f31035d.a(e.a(downloadTask));
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                }
            }
        }
    }

    public final void a(Context context, ServiceConnection serviceConnection) {
        try {
            Intent intent = new Intent(context, IndependentProcessDownloadService.class);
            if (serviceConnection != null) {
                context.bindService(intent, serviceConnection, 1);
            }
            context.startService(intent);
        } catch (Throwable unused) {
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z;
        this.f31035d = h.a.a(iBinder);
        if (this.f31036e != null) {
            this.f31036e.a(iBinder);
        }
        StringBuilder sb = new StringBuilder("onServiceConnected aidlService!=null");
        if (this.f31035d != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append(" pendingTasks.size:");
        sb.append(this.f30898a.size());
        if (this.f31035d != null) {
            c.a().b();
            this.f30899b = true;
            if (this.f31037f != -1) {
                try {
                    this.f31035d.n(this.f31037f);
                } catch (RemoteException unused) {
                }
            }
            synchronized (this.f30898a) {
                if (this.f31035d != null) {
                    SparseArray clone = this.f30898a.clone();
                    this.f30898a.clear();
                    for (int i = 0; i < clone.size(); i++) {
                        DownloadTask downloadTask = (DownloadTask) clone.get(clone.keyAt(i));
                        if (downloadTask != null) {
                            try {
                                this.f31035d.a(e.a(downloadTask));
                            } catch (RemoteException unused2) {
                            }
                        }
                    }
                }
            }
        }
    }
}

package com.ss.android.socialbase.downloader.impls;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.a.c;
import com.ss.android.socialbase.downloader.d.f;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.downloader.k;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.util.ArrayList;
import java.util.List;

public final class d implements i {

    /* renamed from: a  reason: collision with root package name */
    public final k f31009a;

    /* renamed from: b  reason: collision with root package name */
    public final c f31010b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f31011c;

    /* renamed from: d  reason: collision with root package name */
    private f.a f31012d;

    /* renamed from: e  reason: collision with root package name */
    private f f31013e;

    public final boolean d() {
        return this.f31011c;
    }

    public final void a(b bVar) {
        this.f31009a.a(bVar);
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.a(bVar);
            } else {
                this.f31010b.a(bVar);
            }
        } else {
            this.f31010b.a(bVar);
        }
    }

    public final void a(int i, int i2, long j) {
        this.f31009a.a(i, i2, j);
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.a(i, i2, j);
            } else {
                this.f31010b.a(i, i2, j);
            }
        } else {
            this.f31010b.a(i, i2, j);
        }
    }

    public final boolean a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return false;
        }
        boolean a2 = this.f31009a.a(downloadInfo);
        b(downloadInfo);
        return a2;
    }

    public final void a(int i, List<b> list) {
        if (list != null && list.size() != 0) {
            this.f31009a.a(i, list);
            if (com.ss.android.socialbase.downloader.e.d.c()) {
                this.f31010b.b(i, list);
            }
        }
    }

    public d() {
        this.f31012d = new f.a() {
            public final void a(Message message) {
                if (message.what == 1) {
                    com.ss.android.socialbase.downloader.downloader.b.f().execute(new Runnable() {
                        public final void run() {
                            try {
                                d.this.c();
                            } catch (Exception unused) {
                            }
                        }
                    });
                }
            }
        };
        this.f31013e = null;
        this.f31009a = new k();
        this.f31010b = new c();
        this.f31011c = false;
        this.f31013e = new f(Looper.getMainLooper(), this.f31012d);
        com.ss.android.socialbase.downloader.downloader.b.a(com.ss.android.socialbase.downloader.constants.d.SYNC_START);
        this.f31010b.a(this.f31009a.f31027a, this.f31009a.f31028b, (com.ss.android.socialbase.downloader.a.b) new com.ss.android.socialbase.downloader.a.b() {
            public final void a() {
                d.this.f31011c = true;
                d.this.a();
                com.ss.android.socialbase.downloader.downloader.b.a(com.ss.android.socialbase.downloader.constants.d.SYNC_SUCCESS);
            }
        });
    }

    public final void b() {
        try {
            this.f31009a.b();
        } catch (SQLiteException unused) {
        }
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.e();
            } else {
                this.f31010b.b();
            }
        } else {
            this.f31010b.b();
        }
    }

    public final void c() {
        if (this.f31011c) {
            k kVar = com.ss.android.socialbase.downloader.downloader.b.f30902b;
            if (kVar != null) {
                List<String> a2 = kVar.a();
                if (!a2.isEmpty()) {
                    SparseArray<DownloadInfo> sparseArray = this.f31009a.f31027a;
                    if (sparseArray != null) {
                        ArrayList arrayList = new ArrayList();
                        synchronized (sparseArray) {
                            for (int i = 0; i < sparseArray.size(); i++) {
                                int keyAt = sparseArray.keyAt(i);
                                if (keyAt != 0) {
                                    DownloadInfo downloadInfo = sparseArray.get(keyAt);
                                    if (!(downloadInfo == null || !a2.contains(downloadInfo.getMimeType()) || downloadInfo.getRealStatus() == -3 || downloadInfo.getRealStatus() == -2)) {
                                        arrayList.add(downloadInfo);
                                    }
                                }
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            kVar.a(arrayList);
                        }
                    }
                }
            }
        }
    }

    public final void a() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f31013e.sendMessageDelayed(this.f31013e.obtainMessage(1), 1000);
            return;
        }
        this.f31013e.sendMessageDelayed(this.f31013e.obtainMessage(1), 5000);
    }

    private void b(DownloadInfo downloadInfo) {
        a(downloadInfo, true);
    }

    public final List<DownloadInfo> a(String str) {
        return this.f31009a.a(str);
    }

    public final List<b> c(int i) {
        return this.f31009a.c(i);
    }

    public final DownloadInfo a(int i) {
        DownloadInfo a2 = this.f31009a.a(i);
        b(a2);
        return a2;
    }

    public final DownloadInfo b(int i) {
        return this.f31009a.b(i);
    }

    public final DownloadInfo g(int i) {
        DownloadInfo g = this.f31009a.g(i);
        b(g);
        return g;
    }

    public final DownloadInfo h(int i) {
        DownloadInfo h = this.f31009a.h(i);
        b(h);
        return h;
    }

    public final DownloadInfo i(int i) {
        DownloadInfo i2 = this.f31009a.i(i);
        b(i2);
        return i2;
    }

    public final List<DownloadInfo> c(String str) {
        return this.f31009a.c(str);
    }

    public final List<DownloadInfo> b(String str) {
        return this.f31009a.b(str);
    }

    public final void c(DownloadInfo downloadInfo) {
        if (downloadInfo != null) {
            this.f31009a.a(downloadInfo);
        }
    }

    public final void d(int i) {
        this.f31009a.d(i);
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.q(i);
            } else {
                this.f31010b.d(i);
            }
        } else {
            this.f31010b.d(i);
        }
    }

    public final boolean e(int i) {
        try {
            if (com.ss.android.socialbase.downloader.e.d.b()) {
                l a2 = l.a(true);
                if (a2 != null) {
                    a2.p(i);
                } else {
                    this.f31010b.e(i);
                }
            } else {
                this.f31010b.e(i);
            }
        } catch (SQLiteException unused) {
        }
        return this.f31009a.e(i);
    }

    public final boolean f(int i) {
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.r(i);
            } else {
                this.f31010b.f(i);
            }
        } else {
            this.f31010b.f(i);
        }
        return this.f31009a.f(i);
    }

    public final void b(b bVar) {
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.a(bVar);
            } else {
                this.f31010b.a(bVar);
            }
        } else {
            this.f31010b.a(bVar);
        }
    }

    public final DownloadInfo c(int i, long j) {
        DownloadInfo c2 = this.f31009a.c(i, j);
        b(i, (List<b>) null);
        return c2;
    }

    public final DownloadInfo d(int i, long j) {
        DownloadInfo d2 = this.f31009a.d(i, j);
        b(i, (List<b>) null);
        return d2;
    }

    public final DownloadInfo a(int i, int i2) {
        DownloadInfo a2 = this.f31009a.a(i, i2);
        b(a2);
        return a2;
    }

    public final DownloadInfo b(int i, long j) {
        DownloadInfo b2 = this.f31009a.b(i, j);
        b(i, (List<b>) null);
        return b2;
    }

    private void a(DownloadInfo downloadInfo, boolean z) {
        if (downloadInfo != null) {
            if (!com.ss.android.socialbase.downloader.e.d.b()) {
                this.f31010b.a(downloadInfo);
            } else if (z) {
                l a2 = l.a(true);
                if (a2 != null) {
                    a2.c(downloadInfo);
                } else {
                    this.f31010b.a(downloadInfo);
                }
            }
        }
    }

    public final DownloadInfo a(int i, long j) {
        DownloadInfo a2 = this.f31009a.a(i, j);
        a(a2, false);
        return a2;
    }

    public final void b(int i, List<b> list) {
        try {
            a(this.f31009a.b(i));
            if (list == null) {
                list = this.f31009a.c(i);
            }
            if (com.ss.android.socialbase.downloader.e.d.b()) {
                l a2 = l.a(true);
                if (a2 != null) {
                    a2.b(i, list);
                } else {
                    this.f31010b.b(i, list);
                }
            } else {
                this.f31010b.b(i, list);
            }
        } catch (Exception unused) {
        }
    }

    public final DownloadInfo a(int i, long j, String str, String str2) {
        DownloadInfo a2 = this.f31009a.a(i, j, str, str2);
        b(a2);
        return a2;
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.a(i, i2, i3, i4);
            } else {
                this.f31010b.a(i, i2, i3, i4);
            }
        } else {
            this.f31010b.a(i, i2, i3, i4);
        }
    }

    public final void a(int i, int i2, int i3, long j) {
        if (com.ss.android.socialbase.downloader.e.d.b()) {
            l a2 = l.a(true);
            if (a2 != null) {
                a2.a(i, i2, i3, j);
            } else {
                this.f31010b.a(i, i2, i3, j);
            }
        } else {
            this.f31010b.a(i, i2, i3, j);
        }
    }
}

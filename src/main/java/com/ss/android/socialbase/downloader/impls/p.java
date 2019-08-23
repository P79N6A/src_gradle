package com.ss.android.socialbase.downloader.impls;

import android.app.Notification;
import com.ss.android.socialbase.downloader.c.a;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.u;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.downloader.l;
import com.ss.android.socialbase.downloader.downloader.n;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.b;
import java.util.List;

public final class p implements l {

    /* renamed from: a  reason: collision with root package name */
    private final a f31043a;

    /* renamed from: b  reason: collision with root package name */
    private final i f31044b;

    /* renamed from: c  reason: collision with root package name */
    private final n f31045c;

    public final void c() {
    }

    public final boolean f() {
        return false;
    }

    public final void a(List<String> list) {
        if (this.f31043a != null) {
            this.f31043a.a((List) list);
        }
    }

    public final void a(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        if (this.f31043a != null) {
            this.f31043a.b(i, iDownloadListener, gVar, z);
        }
    }

    public final boolean a(DownloadInfo downloadInfo) {
        boolean z = false;
        if (downloadInfo == null) {
            return false;
        }
        int status = downloadInfo.getStatus();
        String savePath = downloadInfo.getSavePath();
        String name = downloadInfo.getName();
        if (status == -3 && !d.c(savePath, name)) {
            z = true;
        }
        if (z) {
            k(downloadInfo.getId());
        }
        return z;
    }

    public final void a(boolean z, boolean z2) {
        if (this.f31045c != null) {
            this.f31045c.a(z2);
        }
    }

    public final void a(DownloadTask downloadTask) {
        if (this.f31045c != null) {
            this.f31045c.b(downloadTask);
            return;
        }
        if (downloadTask != null) {
            a.a(downloadTask.getMonitorDepend(), downloadTask.getDownloadInfo(), new BaseException(1003, "downloadServiceHandler is null"), downloadTask.getDownloadInfo() != null ? downloadTask.getDownloadInfo().getStatus() : 0);
        }
    }

    public final void a(int i, List<b> list) {
        this.f31044b.a(i, list);
    }

    public final void a(int i, boolean z) {
        c.a().a(i, z);
    }

    public final void a(b bVar) {
        this.f31044b.a(bVar);
    }

    public final void a(int i, u uVar) {
        if (this.f31043a != null) {
            this.f31043a.a(i, uVar);
        }
    }

    public final void a(aa aaVar) {
        if (aaVar != null) {
            com.ss.android.socialbase.downloader.downloader.b.f30905e.add(aaVar);
        }
    }

    public p() {
        this(false);
    }

    public final boolean d() {
        return this.f31044b.d();
    }

    public final void e() {
        this.f31044b.b();
    }

    public final void a() {
        if (this.f31043a != null) {
            this.f31043a.b();
        }
    }

    public final boolean b() {
        return com.ss.android.socialbase.downloader.downloader.b.r();
    }

    public final void m(int i) {
        com.ss.android.socialbase.downloader.b.a.a(i);
    }

    public final boolean c(DownloadInfo downloadInfo) {
        return this.f31044b.a(downloadInfo);
    }

    public final List<b> j(int i) {
        return this.f31044b.c(i);
    }

    public final boolean p(int i) {
        return this.f31044b.e(i);
    }

    public final void q(int i) {
        this.f31044b.d(i);
    }

    public final boolean r(int i) {
        return this.f31044b.f(i);
    }

    public final List<DownloadInfo> a(String str) {
        if (this.f31044b != null) {
            this.f31044b.a(str);
        }
        return null;
    }

    public final List<DownloadInfo> c(String str) {
        if (this.f31044b != null) {
            return this.f31044b.c(str);
        }
        return null;
    }

    public final List<DownloadInfo> d(String str) {
        if (this.f31043a != null) {
            return this.f31043a.a(str);
        }
        return null;
    }

    public final void e(int i) {
        if (this.f31043a != null) {
            this.f31043a.h(i);
        }
    }

    public final boolean h(int i) {
        if (this.f31043a != null) {
            return this.f31043a.a(i);
        }
        return false;
    }

    public final DownloadInfo i(int i) {
        if (this.f31043a != null) {
            return this.f31043a.d(i);
        }
        return null;
    }

    public final void k(int i) {
        if (this.f31043a != null) {
            this.f31043a.n(i);
        }
    }

    public final void l(int i) {
        if (this.f31043a != null) {
            this.f31043a.p(i);
        }
    }

    public final boolean n(int i) {
        if (this.f31043a != null) {
            return this.f31043a.l(i);
        }
        return false;
    }

    public final int o(int i) {
        return c.a().a(i);
    }

    public final u s(int i) {
        if (this.f31043a != null) {
            return this.f31043a.j(i);
        }
        return null;
    }

    public final x t(int i) {
        if (this.f31043a != null) {
            return this.f31043a.i(i);
        }
        return null;
    }

    public final com.ss.android.socialbase.downloader.depend.n u(int i) {
        if (this.f31043a != null) {
            return this.f31043a.k(i);
        }
        return null;
    }

    public p(boolean z) {
        this.f31043a = com.ss.android.socialbase.downloader.downloader.b.m();
        this.f31044b = com.ss.android.socialbase.downloader.downloader.b.i();
        if (!z) {
            this.f31045c = com.ss.android.socialbase.downloader.downloader.b.j();
        } else {
            this.f31045c = com.ss.android.socialbase.downloader.downloader.b.k();
        }
    }

    public final List<DownloadInfo> b(String str) {
        if (this.f31044b != null) {
            return this.f31044b.b(str);
        }
        return null;
    }

    public final boolean c(int i) {
        if (this.f31043a != null) {
            return this.f31043a.q(i);
        }
        return false;
    }

    public final void d(int i) {
        if (this.f31043a != null) {
            this.f31043a.g(i);
        }
    }

    public final int g(int i) {
        if (this.f31043a == null) {
            return 0;
        }
        DownloadInfo d2 = this.f31043a.d(i);
        if (d2 == null) {
            return 0;
        }
        return d2.getStatus();
    }

    public final void a(int i) {
        if (this.f31043a != null) {
            this.f31043a.e(i);
        }
    }

    public final void b(int i) {
        if (this.f31043a != null) {
            this.f31043a.f(i);
        }
    }

    public final long f(int i) {
        if (this.f31044b == null) {
            return 0;
        }
        DownloadInfo b2 = this.f31044b.b(i);
        if (b2 == null) {
            return 0;
        }
        int chunkCount = b2.getChunkCount();
        if (chunkCount <= 1) {
            return b2.getCurBytes();
        }
        List<b> c2 = this.f31044b.c(i);
        if (c2 == null || c2.size() != chunkCount) {
            return 0;
        }
        return d.b(c2);
    }

    public final void b(DownloadInfo downloadInfo) {
        this.f31044b.c(downloadInfo);
    }

    public final void b(DownloadTask downloadTask) {
        if (this.f31045c != null) {
            this.f31045c.c(downloadTask);
        }
    }

    public final int a(String str, String str2) {
        return com.ss.android.socialbase.downloader.downloader.b.a(str, str2);
    }

    public final void b(int i, List<b> list) {
        this.f31044b.b(i, list);
    }

    public final DownloadInfo b(String str, String str2) {
        return i(com.ss.android.socialbase.downloader.downloader.b.a(str, str2));
    }

    public final void a(int i, int i2) {
        if (com.ss.android.socialbase.downloader.downloader.b.c() != null && i == 1) {
            for (aa next : com.ss.android.socialbase.downloader.downloader.b.c()) {
                if (next != null) {
                    next.a(i2);
                }
            }
        }
    }

    public final void a(int i, Notification notification) {
        if (this.f31045c != null) {
            this.f31045c.a(i, notification);
        }
    }

    public final void a(int i, int i2, long j) {
        this.f31044b.a(i, i2, j);
    }

    public final void b(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        if (this.f31043a != null) {
            this.f31043a.a(i, iDownloadListener, gVar, z);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.f31044b.a(i, i2, i3, i4);
    }

    public final void a(int i, int i2, int i3, long j) {
        this.f31044b.a(i, i2, i3, j);
    }
}

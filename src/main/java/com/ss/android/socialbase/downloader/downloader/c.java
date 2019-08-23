package com.ss.android.socialbase.downloader.downloader;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.g;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.depend.v;
import com.ss.android.socialbase.downloader.depend.x;
import com.ss.android.socialbase.downloader.e.d;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.impls.l;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f30907c;

    /* renamed from: a  reason: collision with root package name */
    public Handler f30908a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    volatile List<v> f30909b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private volatile SparseArray<Boolean> f30910d = new SparseArray<>();

    public static c a() {
        if (f30907c == null) {
            synchronized (c.class) {
                f30907c = new c();
            }
        }
        return f30907c;
    }

    public final void b() {
        synchronized (this.f30909b) {
            Iterator<v> it2 = this.f30909b.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    public final x d(int i) {
        l c2 = c(i);
        if (c2 == null) {
            return null;
        }
        return c2.t(i);
    }

    public final l c(int i) {
        boolean z = true;
        if (a(i) != 1 || d.c()) {
            z = false;
        }
        return l.a(z);
    }

    public final int a(int i) {
        if (d.c() || !l.a(true).f()) {
            return b(i);
        }
        return l.a(true).o(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int b(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f30910d     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x001f }
            if (r0 != 0) goto L_0x000c
            r2 = -1
            monitor-exit(r1)
            return r2
        L_0x000c:
            android.util.SparseArray<java.lang.Boolean> r0 = r1.f30910d     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001f }
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch:{ all -> 0x001f }
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            r2 = 1
        L_0x001b:
            monitor-exit(r1)
            return r2
        L_0x001d:
            r2 = 0
            goto L_0x001b
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.c.b(int):int");
    }

    public l a(DownloadTask downloadTask) {
        boolean z;
        if (downloadTask == null) {
            return null;
        }
        DownloadInfo downloadInfo = downloadTask.getDownloadInfo();
        if (downloadInfo == null) {
            return null;
        }
        boolean isNeedIndependentProcess = downloadInfo.isNeedIndependentProcess();
        boolean z2 = true;
        if (d.c() || !d.a()) {
            isNeedIndependentProcess = true;
        }
        int a2 = a(downloadInfo.getId());
        if (a2 >= 0 && a2 != isNeedIndependentProcess) {
            if (a2 == 1) {
                try {
                    if (d.a()) {
                        l.a(true).a(downloadInfo.getId());
                        DownloadInfo i = l.a(true).i(downloadInfo.getId());
                        if (i != null) {
                            l.a(false).b(i);
                        }
                        if (i.getChunkCount() > 1) {
                            List j = l.a(true).j(downloadInfo.getId());
                            if (j != null) {
                                l.a(false).a(downloadInfo.getId(), d.a(j));
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            } else if (d.a()) {
                l.a(false).a(downloadInfo.getId());
                List j2 = l.a(false).j(downloadInfo.getId());
                if (j2 != null) {
                    l.a(true).a(downloadInfo.getId(), d.a(j2));
                }
            } else {
                downloadTask.setNeedDelayForCacheSync(true);
                l.a(true).a(1, downloadInfo.getId());
            }
        }
        int id = downloadInfo.getId();
        if (isNeedIndependentProcess) {
            z = true;
        } else {
            z = false;
        }
        a(id, z);
        if (!isNeedIndependentProcess) {
            z2 = false;
        }
        return l.a(z2);
    }

    public static int a(String str, String str2) {
        return b.a(str, str2);
    }

    public final synchronized void b(int i, boolean z) {
        Boolean bool;
        SparseArray<Boolean> sparseArray = this.f30910d;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        sparseArray.put(i, bool);
    }

    public final void a(int i, boolean z) {
        b(i, z);
        if (!d.c() && l.a(true).f()) {
            l.a(true).a(i, z);
        }
        if (!b.b() && !d.c() && !d.a()) {
            try {
                Intent intent = new Intent(b.q(), DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.PROCESS_NOTIFY");
                intent.putExtra("extra_download_id", i);
                b.q().startService(intent);
            } catch (Throwable unused) {
            }
        }
    }

    static List<DownloadInfo> a(List<DownloadInfo> list, List<DownloadInfo> list2, SparseArray<DownloadInfo> sparseArray) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (DownloadInfo next : list) {
                if (next != null && sparseArray.get(next.getId()) == null) {
                    sparseArray.put(next.getId(), next);
                }
            }
        }
        if (list2 != null) {
            for (DownloadInfo next2 : list2) {
                if (next2 != null && sparseArray.get(next2.getId()) == null) {
                    sparseArray.put(next2.getId(), next2);
                }
            }
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            arrayList.add(sparseArray.get(sparseArray.keyAt(i)));
        }
        return arrayList;
    }

    public final void a(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        l c2 = c(i);
        if (c2 != null) {
            c2.b(i, iDownloadListener, gVar, z);
        }
    }

    public final void b(int i, IDownloadListener iDownloadListener, g gVar, boolean z) {
        l c2 = c(i);
        if (c2 != null) {
            c2.a(i, iDownloadListener, gVar, z);
        }
    }
}

package com.ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import android.util.SparseArray;
import com.ss.android.socialbase.downloader.constants.f;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<DownloadInfo> f31027a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<List<b>> f31028b = new SparseArray<>();

    public final void a(int i, int i2, int i3, int i4) {
    }

    public final void b(int i, List<b> list) {
    }

    public final void b(b bVar) {
    }

    public final boolean d() {
        return false;
    }

    public final synchronized void a(b bVar) {
        int i = bVar.f31053a;
        List list = this.f31028b.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f31028b.put(i, list);
        }
        list.add(bVar);
    }

    public final boolean a(DownloadInfo downloadInfo) {
        boolean z = true;
        if (downloadInfo == null) {
            return true;
        }
        synchronized (this.f31027a) {
            if (this.f31027a.get(downloadInfo.getId()) == null) {
                z = false;
            }
            this.f31027a.put(downloadInfo.getId(), downloadInfo);
        }
        return z;
    }

    public final void b() {
        synchronized (this.f31027a) {
            this.f31027a.clear();
            this.f31028b.clear();
        }
    }

    public final void c(DownloadInfo downloadInfo) {
        a(downloadInfo);
    }

    public final boolean f(int i) {
        e(i);
        d(i);
        return true;
    }

    public final DownloadInfo a(int i) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setStatus(2);
        }
        return b2;
    }

    public final List<b> c(int i) {
        return this.f31028b.get(i);
    }

    public final boolean e(int i) {
        synchronized (this.f31027a) {
            this.f31027a.remove(i);
        }
        return true;
    }

    public final DownloadInfo g(int i) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setStatus(5);
            b2.setFirstDownload(false);
        }
        return b2;
    }

    public final DownloadInfo h(int i) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setStatus(1);
        }
        return b2;
    }

    public final DownloadInfo i(int i) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setStatus(-7);
        }
        return b2;
    }

    public final DownloadInfo b(int i) {
        DownloadInfo downloadInfo;
        synchronized (this.f31027a) {
            try {
                downloadInfo = this.f31027a.get(i);
            } catch (Exception unused) {
                downloadInfo = null;
            }
        }
        return downloadInfo;
    }

    public final synchronized void d(int i) {
        this.f31028b.remove(i);
    }

    public final List<DownloadInfo> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f31027a) {
            if (this.f31027a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f31027a.size(); i++) {
                DownloadInfo downloadInfo = this.f31027a.get(this.f31027a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && downloadInfo.getStatus() == -3) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0064 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.ss.android.socialbase.downloader.model.DownloadInfo> c(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r0 = r7.f31027a
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r2 = r7.f31027a     // Catch:{ all -> 0x0069 }
            int r2 = r2.size()     // Catch:{ all -> 0x0069 }
            if (r2 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r1
        L_0x0015:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            r2 = 0
            r3 = 0
        L_0x001c:
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = r7.f31027a     // Catch:{ all -> 0x0069 }
            int r4 = r4.size()     // Catch:{ all -> 0x0069 }
            if (r3 >= r4) goto L_0x0067
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r4 = r7.f31027a     // Catch:{ all -> 0x0069 }
            int r4 = r4.keyAt(r3)     // Catch:{ all -> 0x0069 }
            android.util.SparseArray<com.ss.android.socialbase.downloader.model.DownloadInfo> r5 = r7.f31027a     // Catch:{ all -> 0x0069 }
            java.lang.Object r4 = r5.get(r4)     // Catch:{ all -> 0x0069 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = (com.ss.android.socialbase.downloader.model.DownloadInfo) r4     // Catch:{ all -> 0x0069 }
            if (r4 == 0) goto L_0x0064
            java.lang.String r5 = r4.getMimeType()     // Catch:{ all -> 0x0069 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0069 }
            if (r5 != 0) goto L_0x0064
            java.lang.String r5 = r4.getMimeType()     // Catch:{ all -> 0x0069 }
            boolean r5 = r5.equals(r8)     // Catch:{ all -> 0x0069 }
            if (r5 == 0) goto L_0x0064
            int r5 = r4.getStatus()     // Catch:{ all -> 0x0069 }
            r6 = -1
            if (r5 == r6) goto L_0x005e
            r6 = -2
            if (r5 == r6) goto L_0x005e
            r6 = -7
            if (r5 == r6) goto L_0x005e
            r6 = -4
            if (r5 == r6) goto L_0x005e
            r6 = -5
            if (r5 != r6) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r5 = 0
            goto L_0x005f
        L_0x005e:
            r5 = 1
        L_0x005f:
            if (r5 == 0) goto L_0x0064
            r1.add(r4)     // Catch:{ all -> 0x0069 }
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0067:
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return r1
        L_0x0069:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.impls.k.c(java.lang.String):java.util.List");
    }

    public final List<DownloadInfo> a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f31027a) {
            if (this.f31027a.size() == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f31027a.size(); i++) {
                DownloadInfo downloadInfo = this.f31027a.get(this.f31027a.keyAt(i));
                if (downloadInfo != null && !TextUtils.isEmpty(downloadInfo.getMimeType()) && downloadInfo.getMimeType().equals(str) && f.e(downloadInfo.getStatus())) {
                    arrayList.add(downloadInfo);
                }
            }
            return arrayList;
        }
    }

    public final DownloadInfo d(int i, long j) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setCurBytes(j, false);
            b2.setStatus(-2);
        }
        return b2;
    }

    public final DownloadInfo a(int i, int i2) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setChunkCount(i2);
        }
        return b2;
    }

    public final DownloadInfo c(int i, long j) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setCurBytes(j, false);
            b2.setStatus(-3);
            b2.setFirstDownload(false);
            b2.setFirstSuccess(false);
        }
        return b2;
    }

    public final DownloadInfo a(int i, long j) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setCurBytes(j, false);
            if (!(b2.getStatus() == -3 || b2.getStatus() == -2 || f.e(b2.getStatus()) || b2.getStatus() == -4)) {
                b2.setStatus(4);
            }
        }
        return b2;
    }

    public final DownloadInfo b(int i, long j) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setCurBytes(j, false);
            b2.setStatus(-1);
            b2.setFirstDownload(false);
        }
        return b2;
    }

    public final void a(int i, List<b> list) {
        if (list != null) {
            d(i);
            for (b next : list) {
                if (next != null) {
                    a(next);
                    if (next.d()) {
                        for (b a2 : next.g) {
                            a(a2);
                        }
                    }
                }
            }
        }
    }

    public final void a(int i, int i2, long j) {
        List<b> c2 = c(i);
        if (c2 != null) {
            for (b next : c2) {
                if (next != null && next.f31057e == i2) {
                    next.a(j);
                    return;
                }
            }
        }
    }

    public final DownloadInfo a(int i, long j, String str, String str2) {
        DownloadInfo b2 = b(i);
        if (b2 != null) {
            b2.setTotalBytes(j);
            b2.seteTag(str);
            if (TextUtils.isEmpty(b2.getName()) && !TextUtils.isEmpty(str2)) {
                b2.setName(str2);
            }
            b2.setStatus(3);
        }
        return b2;
    }

    public final void a(int i, int i2, int i3, long j) {
        List<b> c2 = c(i);
        if (c2 != null) {
            Iterator<b> it2 = c2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                b next = it2.next();
                if (next != null && next.f31057e == i3 && !next.d()) {
                    if (next.g != null) {
                        for (b next2 : next.g) {
                            if (next2 != null && next2.f31057e == i2) {
                                next2.a(j);
                            }
                        }
                        return;
                    }
                }
            }
        }
    }
}

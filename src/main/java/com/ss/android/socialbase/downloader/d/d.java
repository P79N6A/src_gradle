package com.ss.android.socialbase.downloader.d;

import android.util.SparseArray;
import com.ss.android.socialbase.downloader.downloader.b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public volatile SparseArray<c> f30873a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    public int f30874b;

    public void a() {
        synchronized (d.class) {
            SparseArray<c> sparseArray = new SparseArray<>();
            int size = this.f30873a.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f30873a.keyAt(i);
                c cVar = this.f30873a.get(keyAt);
                if (cVar.d()) {
                    sparseArray.put(keyAt, cVar);
                }
            }
            this.f30873a = sparseArray;
        }
    }

    public final List<Integer> b() {
        ArrayList arrayList;
        a();
        synchronized (d.class) {
            arrayList = new ArrayList();
            for (int i = 0; i < this.f30873a.size(); i++) {
                c cVar = this.f30873a.get(this.f30873a.keyAt(i));
                if (cVar != null) {
                    arrayList.add(Integer.valueOf(cVar.e()));
                }
            }
        }
        return arrayList;
    }

    public static void a(c cVar) {
        try {
            ExecutorService e2 = b.e();
            if (e2 != null && (e2 instanceof ThreadPoolExecutor)) {
                ((ThreadPoolExecutor) e2).remove(cVar);
            }
        } catch (Exception unused) {
        }
    }

    public final void b(int i) {
        a();
        synchronized (d.class) {
            c cVar = this.f30873a.get(i);
            if (cVar != null) {
                cVar.a();
                a(cVar);
                this.f30873a.remove(i);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r4) {
        /*
            r3 = this;
            java.lang.Class<com.ss.android.socialbase.downloader.d.d> r0 = com.ss.android.socialbase.downloader.d.d.class
            monitor-enter(r0)
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f30873a     // Catch:{ all -> 0x0026 }
            r2 = 0
            if (r1 == 0) goto L_0x0024
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f30873a     // Catch:{ all -> 0x0026 }
            int r1 = r1.size()     // Catch:{ all -> 0x0026 }
            if (r1 > 0) goto L_0x0011
            goto L_0x0024
        L_0x0011:
            android.util.SparseArray<com.ss.android.socialbase.downloader.d.c> r1 = r3.f30873a     // Catch:{ all -> 0x0026 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ all -> 0x0026 }
            com.ss.android.socialbase.downloader.d.c r4 = (com.ss.android.socialbase.downloader.d.c) r4     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            boolean r4 = r4.d()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r2
        L_0x0026:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.d.a(int):boolean");
    }
}

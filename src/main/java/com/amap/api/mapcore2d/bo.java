package com.amap.api.mapcore2d;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class bo<T> {

    /* renamed from: a  reason: collision with root package name */
    protected LinkedList<T> f5766a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Semaphore f5767b = new Semaphore(0, false);

    /* renamed from: c  reason: collision with root package name */
    protected boolean f5768c = true;

    public void a() {
        this.f5768c = false;
        this.f5767b.release(100);
    }

    public void b() {
        if (this.f5766a != null) {
            this.f5766a.clear();
        }
    }

    bo() {
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[Catch:{ Throwable -> 0x0024, all -> 0x001d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<T> a(int r3, boolean r4) {
        /*
            r2 = this;
            java.util.LinkedList<T> r0 = r2.f5766a
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.util.LinkedList<T> r0 = r2.f5766a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x000e
            goto L_0x002a
        L_0x000e:
            java.util.concurrent.Semaphore r0 = r2.f5767b     // Catch:{ InterruptedException -> 0x0013 }
            r0.acquire()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            boolean r0 = r2.f5768c     // Catch:{ Throwable -> 0x0024, all -> 0x001d }
            if (r0 == 0) goto L_0x0024
            java.util.ArrayList r3 = r2.b(r3, r4)     // Catch:{ Throwable -> 0x0024, all -> 0x001d }
            r1 = r3
            goto L_0x0024
        L_0x001d:
            r3 = move-exception
            java.util.concurrent.Semaphore r4 = r2.f5767b
            r4.release()
            throw r3
        L_0x0024:
            java.util.concurrent.Semaphore r3 = r2.f5767b
            r3.release()
            return r1
        L_0x002a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.bo.a(int, boolean):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    public synchronized ArrayList<T> b(int i, boolean z) {
        if (this.f5766a == null) {
            return null;
        }
        int size = this.f5766a.size();
        if (i > size) {
            i = size;
        }
        ArrayList<T> arrayList = new ArrayList<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(this.f5766a.get(0));
            this.f5766a.removeFirst();
        }
        return arrayList;
    }

    public synchronized void a(List<T> list, boolean z) {
        if (this.f5766a != null) {
            if (z) {
                try {
                    this.f5766a.clear();
                } catch (Throwable unused) {
                    return;
                }
            }
            if (list != null) {
                this.f5766a.addAll(list);
            }
            this.f5767b.release();
        }
    }
}

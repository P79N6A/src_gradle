package com.amap.api.mapcore2d;

import com.amap.api.maps2d.AMapException;
import java.util.ArrayList;
import java.util.List;

public class bv extends f<bs, bs> implements cc {

    /* renamed from: c  reason: collision with root package name */
    private an f5793c;

    /* renamed from: d  reason: collision with root package name */
    private am f5794d = new am();

    /* access modifiers changed from: protected */
    public int f() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public int g() {
        return 1;
    }

    public void i() {
        a(false, false);
    }

    public void b() {
        super.b();
        this.f5794d.clear();
        if (!(this.f5653b == null || this.f5653b.f5665c == null)) {
            this.f5653b.f5665c.b((cc) this);
        }
        this.f5653b = null;
    }

    private boolean j() {
        if (this.f5653b == null || this.f5653b.f5667e == null || this.f5653b.f5667e.f5669a == null || this.f5653b.f5667e.f5669a.size() <= 0) {
            return false;
        }
        return this.f5793c.a();
    }

    private boolean a(bs bsVar) {
        if (bsVar == null || bsVar.h < 0) {
            return true;
        }
        return false;
    }

    private void c(ArrayList<bs> arrayList) {
        if (arrayList != null && this.f5794d != null) {
            int size = arrayList.size();
            if (size != 0) {
                for (int i = 0; i < size; i++) {
                    this.f5794d.a(arrayList.get(i));
                }
            }
        }
    }

    public void a(List<bs> list) {
        if (list != null) {
            int size = list.size();
            if (size != 0) {
                int i = 0;
                while (i < size) {
                    if (!this.f5794d.b(list.get(i))) {
                        list.remove(i);
                        i--;
                        size--;
                    }
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public ArrayList<bs> a(ArrayList<bs> arrayList) throws AMapException {
        ArrayList<bs> arrayList2 = null;
        if (arrayList == null || arrayList.size() == 0 || this.f5653b == null || this.f5653b.f5667e == null || this.f5653b.f5667e.f5669a == null) {
            return null;
        }
        a((List<bs>) arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        if (!(this.f5793c.j == null && this.f5793c.k == null)) {
            bw bwVar = new bw(arrayList, this.f5793c.k);
            bwVar.a(this.f5793c);
            bwVar.a((an) null);
            arrayList2 = (ArrayList) bwVar.a();
        }
        c(arrayList);
        if (this.f5653b == null || this.f5653b.f5667e == null) {
            return arrayList2;
        }
        this.f5653b.f5667e.b();
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057 A[SYNTHETIC, Splitter:B:30:0x0057] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008b A[Catch:{ Throwable -> 0x00a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.amap.api.mapcore2d.bs> b(java.util.ArrayList<com.amap.api.mapcore2d.bs> r12) {
        /*
            r11 = this;
            r0 = 0
            if (r12 != 0) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r12.size()
            if (r1 != 0) goto L_0x000b
            return r0
        L_0x000b:
            r2 = 0
            r3 = -1
            r4 = r0
            r5 = -1
        L_0x000f:
            if (r2 >= r1) goto L_0x00a3
            java.lang.Object r6 = r12.get(r2)     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.bs r6 = (com.amap.api.mapcore2d.bs) r6     // Catch:{ Throwable -> 0x00a3 }
            if (r6 == 0) goto L_0x009f
            com.amap.api.mapcore2d.az r7 = r11.f5653b     // Catch:{ Throwable -> 0x00a3 }
            if (r7 == 0) goto L_0x009e
            com.amap.api.mapcore2d.az r7 = r11.f5653b     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.az$a r7 = r7.f5667e     // Catch:{ Throwable -> 0x00a3 }
            if (r7 == 0) goto L_0x009e
            com.amap.api.mapcore2d.az r7 = r11.f5653b     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.az$a r7 = r7.f5667e     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.bn<com.amap.api.mapcore2d.an> r7 = r7.f5669a     // Catch:{ Throwable -> 0x00a3 }
            if (r7 != 0) goto L_0x002d
            goto L_0x009e
        L_0x002d:
            com.amap.api.mapcore2d.az r7 = r11.f5653b     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.az$a r7 = r7.f5667e     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.bn<com.amap.api.mapcore2d.an> r7 = r7.f5669a     // Catch:{ Throwable -> 0x00a3 }
            r7.size()     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.an r7 = r11.f5793c     // Catch:{ Throwable -> 0x00a3 }
            boolean r7 = r7.f5602f     // Catch:{ Throwable -> 0x00a3 }
            if (r7 == 0) goto L_0x009f
            boolean r7 = com.amap.api.maps2d.MapsInitializer.getUpdateDataActiveEnable()     // Catch:{ Throwable -> 0x0054 }
            if (r7 == 0) goto L_0x004a
            boolean r7 = com.amap.api.mapcore2d.q.b()     // Catch:{ Throwable -> 0x0054 }
            if (r7 == 0) goto L_0x004a
            r5 = -1
            goto L_0x0055
        L_0x004a:
            com.amap.api.mapcore2d.an r7 = r11.f5793c     // Catch:{ Throwable -> 0x0054 }
            com.amap.api.mapcore2d.u r7 = r7.o     // Catch:{ Throwable -> 0x0054 }
            int r7 = r7.a((com.amap.api.mapcore2d.bs) r6)     // Catch:{ Throwable -> 0x0054 }
            r5 = r7
            goto L_0x0055
        L_0x0054:
        L_0x0055:
            if (r5 < 0) goto L_0x008b
            r12.remove(r2)     // Catch:{ Throwable -> 0x00a3 }
            int r1 = r1 + -1
            int r2 = r2 + -1
            com.amap.api.mapcore2d.an r7 = r11.f5793c     // Catch:{ Throwable -> 0x00a3 }
            com.amap.api.mapcore2d.bn<com.amap.api.mapcore2d.bs> r7 = r7.p     // Catch:{ Throwable -> 0x00a3 }
            if (r7 == 0) goto L_0x009f
            monitor-enter(r7)     // Catch:{ Throwable -> 0x00a3 }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x0088 }
        L_0x0069:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0088 }
            if (r9 == 0) goto L_0x0086
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0088 }
            com.amap.api.mapcore2d.bs r9 = (com.amap.api.mapcore2d.bs) r9     // Catch:{ all -> 0x0088 }
            if (r9 == 0) goto L_0x0069
            boolean r10 = r9.equals(r6)     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x0069
            r9.h = r5     // Catch:{ all -> 0x0088 }
            com.amap.api.mapcore2d.az r6 = r11.f5653b     // Catch:{ all -> 0x0088 }
            com.amap.api.mapcore2d.az$a r6 = r6.f5667e     // Catch:{ all -> 0x0088 }
            r6.b()     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r7)     // Catch:{ all -> 0x0088 }
            goto L_0x009f
        L_0x0088:
            r12 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0088 }
            throw r12     // Catch:{ Throwable -> 0x00a3 }
        L_0x008b:
            if (r4 != 0) goto L_0x0093
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Throwable -> 0x00a3 }
            r7.<init>()     // Catch:{ Throwable -> 0x00a3 }
            r4 = r7
        L_0x0093:
            com.amap.api.mapcore2d.bs r7 = new com.amap.api.mapcore2d.bs     // Catch:{ Throwable -> 0x00a3 }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x00a3 }
            r7.f5776a = r3     // Catch:{ Throwable -> 0x00a3 }
            r4.add(r7)     // Catch:{ Throwable -> 0x00a3 }
            goto L_0x009f
        L_0x009e:
            return r0
        L_0x009f:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x00a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.bv.b(java.util.ArrayList):java.util.ArrayList");
    }

    public bv(az azVar, an anVar) {
        super(azVar);
        this.f5793c = anVar;
        this.f6103a = new br();
        this.f5653b.f5665c.a((cc) this);
        a();
    }

    private void a(ArrayList<bs> arrayList, boolean z) {
        if (!(this.f6103a == null || arrayList == null || arrayList.size() == 0)) {
            this.f6103a.a((List<T>) arrayList, z);
        }
    }

    public void a(boolean z, boolean z2) {
        try {
            if (j()) {
                ArrayList<bs> a2 = this.f5653b.h.a(this.f5653b.h.l, this.f5653b.h.b(), this.f5653b.f5665c.c(), this.f5653b.f5665c.d());
                if (a2 != null && a2.size() > 0) {
                    ArrayList<bs> a3 = a(a2, this.f5793c, this.f5653b.f5665c.e(), z2);
                    if (a3 != null) {
                        a(a3, true);
                        a3.clear();
                    }
                    a2.clear();
                    this.f5653b.f5665c.g().invalidate();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private ArrayList<bs> a(ArrayList<bs> arrayList, an anVar, float f2, boolean z) {
        ArrayList<bs> arrayList2 = new ArrayList<>();
        if (arrayList == null || anVar == null || !anVar.a() || anVar.p == null) {
            return null;
        }
        anVar.p.clear();
        if (f2 > ((float) anVar.f5599c) || f2 < ((float) anVar.f5600d)) {
            return null;
        }
        int size = arrayList.size();
        if (size <= 0) {
            return null;
        }
        int i = 0;
        while (i < size) {
            try {
                bs bsVar = arrayList.get(i);
                if (bsVar != null) {
                    int a2 = anVar.n.a(bsVar.c());
                    bs bsVar2 = new bs(bsVar.f5777b, bsVar.f5778c, bsVar.f5779d, anVar.l);
                    bsVar2.h = a2;
                    bsVar2.g = bsVar.g;
                    anVar.p.add(bsVar2);
                    if (a(bsVar2) && !z && !this.f5794d.contains(bsVar2)) {
                        if (!anVar.f5602f) {
                            bsVar2.f5776a = -1;
                        }
                        arrayList2.add(bsVar2);
                    }
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return arrayList2;
    }
}

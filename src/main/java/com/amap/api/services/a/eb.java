package com.amap.api.services.a;

public class eb extends ec {

    /* renamed from: b  reason: collision with root package name */
    private int f6860b;

    /* renamed from: c  reason: collision with root package name */
    private long f6861c;

    /* renamed from: d  reason: collision with root package name */
    private String f6862d;

    /* access modifiers changed from: protected */
    public boolean a() {
        if (this.f6861c == 0) {
            this.f6861c = a(this.f6862d);
        }
        if (System.currentTimeMillis() - this.f6861c < ((long) this.f6860b)) {
            return false;
        }
        return true;
    }

    public void a(boolean z) {
        super.a(z);
        if (z) {
            a(this.f6862d, System.currentTimeMillis());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[Catch:{ Throwable -> 0x0043 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0045 A[SYNTHETIC, Splitter:B:26:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004c A[SYNTHETIC, Splitter:B:32:0x004c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long a(java.lang.String r8) {
        /*
            r7 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            r1 = 0
            if (r8 != 0) goto L_0x000e
            return r1
        L_0x000e:
            r8 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x002f, all -> 0x002b }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x002f, all -> 0x002b }
            int r8 = r3.available()     // Catch:{ Throwable -> 0x0029 }
            byte[] r8 = new byte[r8]     // Catch:{ Throwable -> 0x0029 }
            r3.read(r8)     // Catch:{ Throwable -> 0x0029 }
            java.lang.String r8 = com.amap.api.services.a.bo.a((byte[]) r8)     // Catch:{ Throwable -> 0x0029 }
            long r4 = java.lang.Long.parseLong(r8)     // Catch:{ Throwable -> 0x0029 }
            r3.close()     // Catch:{ Throwable -> 0x0028 }
        L_0x0028:
            return r4
        L_0x0029:
            r8 = move-exception
            goto L_0x0033
        L_0x002b:
            r0 = move-exception
            r3 = r8
            r8 = r0
            goto L_0x004a
        L_0x002f:
            r3 = move-exception
            r6 = r3
            r3 = r8
            r8 = r6
        L_0x0033:
            java.lang.String r4 = "tus"
            java.lang.String r5 = "gut"
            com.amap.api.services.a.ca.c(r8, r4, r5)     // Catch:{ all -> 0x0049 }
            boolean r8 = r0.exists()     // Catch:{ Throwable -> 0x0043 }
            if (r8 == 0) goto L_0x0043
            r0.delete()     // Catch:{ Throwable -> 0x0043 }
        L_0x0043:
            if (r3 == 0) goto L_0x0048
            r3.close()     // Catch:{ Throwable -> 0x0048 }
        L_0x0048:
            return r1
        L_0x0049:
            r8 = move-exception
        L_0x004a:
            if (r3 == 0) goto L_0x004f
            r3.close()     // Catch:{ Throwable -> 0x004f }
        L_0x004f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.eb.a(java.lang.String):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003f A[SYNTHETIC, Splitter:B:21:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0046 A[SYNTHETIC, Splitter:B:27:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r3, long r4) {
        /*
            r2 = this;
            r2.f6861c = r4
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            java.io.File r3 = r0.getParentFile()
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0018
            java.io.File r3 = r0.getParentFile()
            r3.mkdirs()
        L_0x0018:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0033, all -> 0x002f }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0033, all -> 0x002f }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x002d }
            byte[] r3 = com.amap.api.services.a.bo.a((java.lang.String) r3)     // Catch:{ Throwable -> 0x002d }
            r1.write(r3)     // Catch:{ Throwable -> 0x002d }
            r1.close()     // Catch:{ Throwable -> 0x002c }
        L_0x002c:
            return
        L_0x002d:
            r3 = move-exception
            goto L_0x0036
        L_0x002f:
            r4 = move-exception
            r1 = r3
            r3 = r4
            goto L_0x0044
        L_0x0033:
            r4 = move-exception
            r1 = r3
            r3 = r4
        L_0x0036:
            java.lang.String r4 = "tus"
            java.lang.String r5 = "uut"
            com.amap.api.services.a.ca.c(r3, r4, r5)     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x0042
            r1.close()     // Catch:{ Throwable -> 0x0042 }
        L_0x0042:
            return
        L_0x0043:
            r3 = move-exception
        L_0x0044:
            if (r1 == 0) goto L_0x0049
            r1.close()     // Catch:{ Throwable -> 0x0049 }
        L_0x0049:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.eb.a(java.lang.String, long):void");
    }

    public eb(int i, String str, ec ecVar) {
        super(ecVar);
        this.f6860b = i;
        this.f6862d = str;
    }
}

package com.amap.api.mapcore2d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

public class ba {

    /* renamed from: a  reason: collision with root package name */
    protected final a[] f5703a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f5704b;

    /* renamed from: c  reason: collision with root package name */
    protected final int f5705c;

    /* renamed from: d  reason: collision with root package name */
    protected final a[] f5706d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5707e;

    /* renamed from: f  reason: collision with root package name */
    private long f5708f;
    private an g;
    /* access modifiers changed from: private */
    public Paint h;
    /* access modifiers changed from: private */
    public Path i;

    class a {

        /* renamed from: a  reason: collision with root package name */
        Bitmap f5711a;

        /* renamed from: b  reason: collision with root package name */
        String f5712b = "";

        /* renamed from: c  reason: collision with root package name */
        boolean f5713c;

        /* renamed from: d  reason: collision with root package name */
        long f5714d;

        /* renamed from: e  reason: collision with root package name */
        int f5715e = -1;

        /* renamed from: f  reason: collision with root package name */
        long f5716f;
        List<bx> g;

        public a() {
        }
    }

    private long d() {
        return System.nanoTime();
    }

    /* access modifiers changed from: protected */
    public int b() {
        int i2 = -1;
        for (int i3 = 0; i3 < this.f5704b; i3++) {
            if (this.f5703a[i3] == null) {
                this.f5703a[i3] = new a();
                this.f5703a[i3].f5715e = i3;
                return i3;
            }
            if (!this.f5703a[i3].f5713c && i2 < 0) {
                i2 = i3;
            }
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void c() {
        for (int i2 = 0; i2 < this.f5704b; i2++) {
            if (this.f5703a[i2] != null) {
                if (this.f5703a[i2].f5711a != null && !this.f5703a[i2].f5711a.isRecycled()) {
                    this.f5703a[i2].f5711a.recycle();
                }
                this.f5703a[i2].f5711a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public int a() {
        for (int i2 = 0; i2 < this.f5705c; i2++) {
            this.f5706d[i2] = null;
        }
        for (int i3 = 0; i3 < this.f5704b; i3++) {
            a aVar = this.f5703a[i3];
            int i4 = 0;
            while (true) {
                if (i4 >= this.f5705c) {
                    break;
                } else if (this.f5706d[i4] == null) {
                    this.f5706d[i4] = aVar;
                    break;
                } else {
                    if (this.f5706d[i4].f5714d > aVar.f5714d) {
                        a aVar2 = this.f5706d[i4];
                        this.f5706d[i4] = aVar;
                        aVar = aVar2;
                    }
                    i4++;
                }
            }
        }
        int i5 = -1;
        for (int i6 = 0; i6 < this.f5705c; i6++) {
            if (this.f5706d[i6] != null) {
                this.f5706d[i6].f5713c = false;
                if (i5 < 0) {
                    i5 = this.f5706d[i6].f5715e;
                }
            }
        }
        return i5;
    }

    /* access modifiers changed from: protected */
    public Bitmap a(int i2) {
        if (i2 < 0 || i2 >= this.f5704b || this.f5703a[i2] == null) {
            return null;
        }
        return this.f5703a[i2].f5711a;
    }

    /* access modifiers changed from: protected */
    public int a(String str) {
        if (str == null || str.equals("")) {
            return -1;
        }
        int i2 = 0;
        while (i2 < this.f5704b) {
            if (this.f5703a[i2] == null || this.f5703a[i2].f5712b == null || !this.f5703a[i2].f5712b.equals(str)) {
                i2++;
            } else if (!this.f5703a[i2].f5713c) {
                return -1;
            } else {
                if (this.f5707e && d() - this.f5703a[i2].f5716f > this.f5708f) {
                    this.f5703a[i2].f5713c = false;
                    return -1;
                } else if (this.f5703a[i2].f5711a == null) {
                    return -1;
                } else {
                    this.f5703a[i2].f5714d = d();
                    return i2;
                }
            }
        }
        return -1;
    }

    private void a(Bitmap bitmap, final List<bx> list) {
        AnonymousClass1 r0 = new j() {
            public void a(Canvas canvas) {
                if (ba.this.h == null) {
                    Paint unused = ba.this.h = new Paint();
                    ba.this.h.setStyle(Paint.Style.STROKE);
                    ba.this.h.setDither(true);
                    ba.this.h.setAntiAlias(true);
                    ba.this.h.setStrokeJoin(Paint.Join.ROUND);
                    ba.this.h.setStrokeCap(Paint.Cap.ROUND);
                }
                if (ba.this.i == null) {
                    Path unused2 = ba.this.i = new Path();
                }
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bx bxVar = (bx) list.get(i);
                    if (bxVar != null) {
                        ba.this.h.setStrokeWidth(3.0f);
                        int b2 = bxVar.b();
                        if (b2 == 1) {
                            ba.this.h.setColor(-65536);
                        } else if (b2 == 2) {
                            ba.this.h.setColor(-256);
                        } else if (b2 == 3) {
                            ba.this.h.setColor(-16711936);
                        }
                        List a2 = bxVar.a();
                        int size2 = a2.size();
                        boolean z = true;
                        for (int i2 = 0; i2 < size2; i2++) {
                            PointF pointF = (PointF) a2.get(i2);
                            if (pointF != null) {
                                if (z) {
                                    ba.this.i.moveTo(pointF.x, pointF.y);
                                    z = false;
                                } else {
                                    ba.this.i.lineTo(pointF.x, pointF.y);
                                }
                            }
                        }
                        canvas.drawPath(ba.this.i, ba.this.h);
                        ba.this.i.reset();
                    }
                }
            }
        };
        i iVar = new i(null);
        iVar.a(bitmap);
        iVar.a((j) r0);
    }

    public ba(int i2, int i3, boolean z, long j, an anVar) {
        this.f5704b = i2;
        this.f5705c = i3;
        this.g = anVar;
        this.f5707e = z;
        this.f5708f = j * 1000000;
        if (this.f5704b > 0) {
            this.f5703a = new a[this.f5704b];
            this.f5706d = new a[this.f5705c];
            return;
        }
        this.f5703a = null;
        this.f5706d = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008f, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        com.amap.api.mapcore2d.cm.a(r5, "BitmapManager", "setBitmapData");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:36:0x006a, B:44:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[ExcHandler: OutOfMemoryError (unused java.lang.OutOfMemoryError), SYNTHETIC, Splitter:B:36:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int a(byte[] r5, byte[] r6, boolean r7, java.util.List<com.amap.api.mapcore2d.bx> r8, java.lang.String r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            r0 = -1
            if (r5 != 0) goto L_0x000a
            if (r6 != 0) goto L_0x000a
            if (r8 != 0) goto L_0x000a
            monitor-exit(r4)
            return r0
        L_0x000a:
            int r1 = r4.b()     // Catch:{ Throwable -> 0x00f9 }
            if (r1 >= 0) goto L_0x0019
            int r2 = r4.a()     // Catch:{ Throwable -> 0x0016 }
            r1 = r2
            goto L_0x0019
        L_0x0016:
            r5 = move-exception
            goto L_0x00fb
        L_0x0019:
            if (r1 >= 0) goto L_0x001d
            monitor-exit(r4)
            return r0
        L_0x001d:
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            if (r2 != 0) goto L_0x0023
            monitor-exit(r4)
            return r0
        L_0x0023:
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            r3 = 0
            if (r2 == 0) goto L_0x004d
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r2 = r2.f5711a     // Catch:{ Throwable -> 0x0016 }
            if (r2 == 0) goto L_0x004d
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r2 = r2.f5711a     // Catch:{ Throwable -> 0x0016 }
            boolean r2 = r2.isRecycled()     // Catch:{ Throwable -> 0x0016 }
            if (r2 != 0) goto L_0x004d
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r2 = r2.f5711a     // Catch:{ Throwable -> 0x0016 }
            r2.recycle()     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            r2.f5711a = r3     // Catch:{ Throwable -> 0x0016 }
        L_0x004d:
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            java.util.List<com.amap.api.mapcore2d.bx> r2 = r2.g     // Catch:{ Throwable -> 0x0016 }
            if (r2 == 0) goto L_0x0064
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            java.util.List<com.amap.api.mapcore2d.bx> r2 = r2.g     // Catch:{ Throwable -> 0x0016 }
            r2.clear()     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.ba$a[] r2 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r2 = r2[r1]     // Catch:{ Throwable -> 0x0016 }
            r2.g = r3     // Catch:{ Throwable -> 0x0016 }
        L_0x0064:
            r2 = 0
            r3 = 1
            if (r7 != r3) goto L_0x0081
            if (r5 == 0) goto L_0x0081
            com.amap.api.mapcore2d.ba$a[] r6 = r4.f5703a     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x0076 }
            r6 = r6[r1]     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x0076 }
            int r7 = r5.length     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x0076 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeByteArray(r5, r2, r7)     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x0076 }
            r6.f5711a = r5     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x0076 }
            goto L_0x0097
        L_0x0076:
            r5 = move-exception
            java.lang.String r6 = "BitmapManager"
            java.lang.String r7 = "setBitmapData"
            com.amap.api.mapcore2d.cm.a(r5, r6, r7)     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0097
        L_0x007f:
            goto L_0x0097
        L_0x0081:
            if (r6 == 0) goto L_0x0097
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x008f }
            r5 = r5[r1]     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x008f }
            int r7 = r6.length     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x008f }
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeByteArray(r6, r2, r7)     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x008f }
            r5.f5711a = r6     // Catch:{ OutOfMemoryError -> 0x007f, Throwable -> 0x008f }
            goto L_0x0097
        L_0x008f:
            r5 = move-exception
            java.lang.String r6 = "BitmapManager"
            java.lang.String r7 = "setBitmapData"
            com.amap.api.mapcore2d.cm.a(r5, r6, r7)     // Catch:{ Throwable -> 0x0016 }
        L_0x0097:
            if (r8 == 0) goto L_0x00ba
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.an r6 = r4.g     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.av r6 = r6.f5597a     // Catch:{ Throwable -> 0x0016 }
            int r6 = r6.f5643a     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.an r7 = r4.g     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.av r7 = r7.f5597a     // Catch:{ Throwable -> 0x0016 }
            int r7 = r7.f5643a     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r7, r2)     // Catch:{ Throwable -> 0x0016 }
            r5.f5711a = r6     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r5 = r5.f5711a     // Catch:{ Throwable -> 0x0016 }
            r4.a((android.graphics.Bitmap) r5, (java.util.List<com.amap.api.mapcore2d.bx>) r8)     // Catch:{ Throwable -> 0x0016 }
        L_0x00ba:
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            android.graphics.Bitmap r5 = r5.f5711a     // Catch:{ Throwable -> 0x0016 }
            if (r5 != 0) goto L_0x00cc
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            java.util.List<com.amap.api.mapcore2d.bx> r5 = r5.g     // Catch:{ Throwable -> 0x0016 }
            if (r5 != 0) goto L_0x00cc
            monitor-exit(r4)
            return r0
        L_0x00cc:
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            if (r5 == 0) goto L_0x0102
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            r5.f5713c = r3     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            r5.f5712b = r9     // Catch:{ Throwable -> 0x0016 }
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            long r6 = r4.d()     // Catch:{ Throwable -> 0x0016 }
            r5.f5714d = r6     // Catch:{ Throwable -> 0x0016 }
            boolean r5 = r4.f5707e     // Catch:{ Throwable -> 0x0016 }
            if (r5 != r3) goto L_0x0102
            com.amap.api.mapcore2d.ba$a[] r5 = r4.f5703a     // Catch:{ Throwable -> 0x0016 }
            r5 = r5[r1]     // Catch:{ Throwable -> 0x0016 }
            long r6 = r4.d()     // Catch:{ Throwable -> 0x0016 }
            r5.f5716f = r6     // Catch:{ Throwable -> 0x0016 }
            goto L_0x0102
        L_0x00f7:
            r5 = move-exception
            goto L_0x0104
        L_0x00f9:
            r5 = move-exception
            r1 = -1
        L_0x00fb:
            java.lang.String r6 = "BitmapManager"
            java.lang.String r7 = "setBitmapData"
            com.amap.api.mapcore2d.cm.a(r5, r6, r7)     // Catch:{ all -> 0x00f7 }
        L_0x0102:
            monitor-exit(r4)
            return r1
        L_0x0104:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.ba.a(byte[], byte[], boolean, java.util.List, java.lang.String):int");
    }
}

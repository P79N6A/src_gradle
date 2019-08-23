package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.i;
import com.squareup.picasso.q;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements Runnable {
    private static final Object t = new Object();
    private static final ThreadLocal<StringBuilder> u = new ThreadLocal<StringBuilder>() {
        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger v = new AtomicInteger();
    private static final x w = new x() {
        public final boolean a(v vVar) {
            return true;
        }

        public final x.a b(v vVar) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + vVar);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final int f27401a = v.incrementAndGet();

    /* renamed from: b  reason: collision with root package name */
    public final s f27402b;

    /* renamed from: c  reason: collision with root package name */
    final Dispatcher f27403c;

    /* renamed from: d  reason: collision with root package name */
    final d f27404d;

    /* renamed from: e  reason: collision with root package name */
    final z f27405e;

    /* renamed from: f  reason: collision with root package name */
    public final String f27406f;
    public final v g;
    public final int h;
    int i;
    final x j;
    public a k;
    public List<a> l;
    public Bitmap m;
    Future<?> n;
    public s.d o;
    public Exception p;
    int q;
    int r;
    public s.e s;

    private static boolean a(boolean z, int i2, int i3, int i4, int i5) {
        return !z || i2 > i4 || i3 > i5;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        if (this.n == null || !this.n.isCancelled()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.k != null || ((this.l != null && !this.l.isEmpty()) || this.n == null || !this.n.cancel(false))) {
            return false;
        }
        return true;
    }

    public final void run() {
        String str;
        try {
            v vVar = this.g;
            if (vVar.f27464d != null) {
                str = String.valueOf(vVar.f27464d.getPath());
            } else {
                str = Integer.toHexString(vVar.f27465e);
            }
            StringBuilder sb = u.get();
            sb.ensureCapacity(str.length() + 8);
            sb.replace(8, sb.length(), str);
            Thread.currentThread().setName(sb.toString());
            if (this.f27402b.m) {
                ad.a(this);
            }
            this.m = c();
            if (this.m == null) {
                this.f27403c.b(this);
            } else {
                Dispatcher dispatcher = this.f27403c;
                dispatcher.i.sendMessage(dispatcher.i.obtainMessage(4, this));
            }
        } catch (i.b e2) {
            if (!e2.localCacheOnly || e2.responseCode != 504) {
                this.p = e2;
            }
            this.f27403c.b(this);
        } catch (q.a e3) {
            this.p = e3;
            this.f27403c.a(this);
        } catch (IOException e4) {
            this.p = e4;
            this.f27403c.a(this);
        } catch (OutOfMemoryError e5) {
            StringWriter stringWriter = new StringWriter();
            z zVar = this.f27405e;
            int b2 = zVar.f27485b.b();
            int a2 = zVar.f27485b.a();
            long j2 = zVar.f27487d;
            long j3 = zVar.f27488e;
            long j4 = zVar.f27489f;
            long j5 = zVar.g;
            OutOfMemoryError outOfMemoryError = e5;
            long j6 = zVar.h;
            long j7 = zVar.i;
            long j8 = zVar.j;
            long j9 = zVar.k;
            int i2 = zVar.l;
            StringWriter stringWriter2 = stringWriter;
            int i3 = zVar.m;
            aa aaVar = r4;
            long j10 = j6;
            long j11 = j7;
            long j12 = j8;
            long j13 = j9;
            aa aaVar2 = new aa(b2, a2, j2, j3, j4, j5, j10, j11, j12, j13, i2, i3, zVar.n, System.currentTimeMillis());
            StringWriter stringWriter3 = stringWriter2;
            PrintWriter printWriter = new PrintWriter(stringWriter3);
            printWriter.println("===============BEGIN PICASSO STATS ===============");
            printWriter.println("Memory Cache Stats");
            printWriter.print("  Max Cache Size: ");
            aa aaVar3 = aaVar;
            printWriter.println(aaVar3.f27388a);
            printWriter.print("  Cache Size: ");
            printWriter.println(aaVar3.f27389b);
            printWriter.print("  Cache % Full: ");
            printWriter.println((int) Math.ceil((double) ((((float) aaVar3.f27389b) / ((float) aaVar3.f27388a)) * 100.0f)));
            printWriter.print("  Cache Hits: ");
            printWriter.println(aaVar3.f27390c);
            printWriter.print("  Cache Misses: ");
            printWriter.println(aaVar3.f27391d);
            printWriter.println("Network Stats");
            printWriter.print("  Download Count: ");
            printWriter.println(aaVar3.k);
            printWriter.print("  Total Download Size: ");
            printWriter.println(aaVar3.f27392e);
            printWriter.print("  Average Download Size: ");
            printWriter.println(aaVar3.h);
            printWriter.println("Bitmap Stats");
            printWriter.print("  Total Bitmaps Decoded: ");
            printWriter.println(aaVar3.l);
            printWriter.print("  Total Bitmap Size: ");
            printWriter.println(aaVar3.f27393f);
            printWriter.print("  Total Transformed Bitmaps: ");
            printWriter.println(aaVar3.m);
            printWriter.print("  Total Transformed Bitmap Size: ");
            printWriter.println(aaVar3.g);
            printWriter.print("  Average Bitmap Size: ");
            printWriter.println(aaVar3.i);
            printWriter.print("  Average Transformed Bitmap Size: ");
            printWriter.println(aaVar3.j);
            printWriter.println("===============END PICASSO STATS ===============");
            printWriter.flush();
            RuntimeException runtimeException = new RuntimeException(stringWriter3.toString(), outOfMemoryError);
            this.p = runtimeException;
            this.f27403c.b(this);
        } catch (Exception e6) {
            this.p = e6;
            this.f27403c.b(this);
        } catch (Throwable th) {
            th = th;
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Bitmap c() throws java.io.IOException {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.h
            boolean r0 = com.squareup.picasso.o.shouldReadFromMemoryCache(r0)
            r2 = 0
            if (r0 == 0) goto L_0x002a
            com.squareup.picasso.d r0 = r1.f27404d
            java.lang.String r3 = r1.f27406f
            android.graphics.Bitmap r0 = r0.a(r3)
            if (r0 == 0) goto L_0x002b
            com.squareup.picasso.z r2 = r1.f27405e
            r2.a()
            com.squareup.picasso.s$d r2 = com.squareup.picasso.s.d.MEMORY
            r1.o = r2
            com.squareup.picasso.s r2 = r1.f27402b
            boolean r2 = r2.m
            if (r2 == 0) goto L_0x0029
            com.squareup.picasso.v r2 = r1.g
            r2.a()
        L_0x0029:
            return r0
        L_0x002a:
            r0 = r2
        L_0x002b:
            com.squareup.picasso.v r3 = r1.g
            int r4 = r1.r
            if (r4 != 0) goto L_0x0036
            com.squareup.picasso.p r4 = com.squareup.picasso.p.OFFLINE
            int r4 = r4.index
            goto L_0x0038
        L_0x0036:
            int r4 = r1.i
        L_0x0038:
            r3.f27463c = r4
            com.squareup.picasso.x r3 = r1.j
            com.squareup.picasso.v r4 = r1.g
            com.squareup.picasso.x$a r3 = r3.b(r4)
            r5 = 0
            if (r3 == 0) goto L_0x00d8
            com.squareup.picasso.s$d r0 = r3.f27479a
            r1.o = r0
            int r0 = r3.f27482d
            r1.q = r0
            android.graphics.Bitmap r0 = r3.f27480b
            if (r0 != 0) goto L_0x00d8
            java.io.InputStream r3 = r3.f27481c
            com.squareup.picasso.v r0 = r1.g     // Catch:{ all -> 0x00d3 }
            com.squareup.picasso.m r6 = new com.squareup.picasso.m     // Catch:{ all -> 0x00d3 }
            r6.<init>(r3)     // Catch:{ all -> 0x00d3 }
            r7 = 65536(0x10000, float:9.18355E-41)
            long r7 = r6.a((int) r7)     // Catch:{ all -> 0x00d3 }
            android.graphics.BitmapFactory$Options r9 = com.squareup.picasso.x.d(r0)     // Catch:{ all -> 0x00d3 }
            boolean r10 = com.squareup.picasso.x.a((android.graphics.BitmapFactory.Options) r9)     // Catch:{ all -> 0x00d3 }
            r11 = 12
            byte[] r12 = new byte[r11]     // Catch:{ all -> 0x00d3 }
            int r13 = r6.read(r12, r5, r11)     // Catch:{ all -> 0x00d3 }
            if (r13 != r11) goto L_0x0095
            java.lang.String r11 = "RIFF"
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x00d3 }
            java.lang.String r14 = "US-ASCII"
            r15 = 4
            r13.<init>(r12, r5, r15, r14)     // Catch:{ all -> 0x00d3 }
            boolean r11 = r11.equals(r13)     // Catch:{ all -> 0x00d3 }
            if (r11 == 0) goto L_0x0095
            java.lang.String r11 = "WEBP"
            java.lang.String r13 = new java.lang.String     // Catch:{ all -> 0x00d3 }
            r14 = 8
            java.lang.String r4 = "US-ASCII"
            r13.<init>(r12, r14, r15, r4)     // Catch:{ all -> 0x00d3 }
            boolean r4 = r11.equals(r13)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x0095
            r4 = 1
            goto L_0x0096
        L_0x0095:
            r4 = 0
        L_0x0096:
            r6.a((long) r7)     // Catch:{ all -> 0x00d3 }
            if (r4 == 0) goto L_0x00b2
            byte[] r2 = com.squareup.picasso.ad.b((java.io.InputStream) r6)     // Catch:{ all -> 0x00d3 }
            if (r10 == 0) goto L_0x00ac
            int r4 = r2.length     // Catch:{ all -> 0x00d3 }
            android.graphics.BitmapFactory.decodeByteArray(r2, r5, r4, r9)     // Catch:{ all -> 0x00d3 }
            int r4 = r0.h     // Catch:{ all -> 0x00d3 }
            int r6 = r0.i     // Catch:{ all -> 0x00d3 }
            com.squareup.picasso.x.a(r4, r6, r9, r0)     // Catch:{ all -> 0x00d3 }
        L_0x00ac:
            int r0 = r2.length     // Catch:{ all -> 0x00d3 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeByteArray(r2, r5, r0, r9)     // Catch:{ all -> 0x00d3 }
            goto L_0x00c7
        L_0x00b2:
            if (r10 == 0) goto L_0x00c1
            android.graphics.BitmapFactory.decodeStream(r6, r2, r9)     // Catch:{ all -> 0x00d3 }
            int r4 = r0.h     // Catch:{ all -> 0x00d3 }
            int r10 = r0.i     // Catch:{ all -> 0x00d3 }
            com.squareup.picasso.x.a(r4, r10, r9, r0)     // Catch:{ all -> 0x00d3 }
            r6.a((long) r7)     // Catch:{ all -> 0x00d3 }
        L_0x00c1:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r6, r2, r9)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cb
        L_0x00c7:
            com.squareup.picasso.ad.a((java.io.InputStream) r3)
            goto L_0x00d8
        L_0x00cb:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = "Failed to decode stream."
            r0.<init>(r2)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            com.squareup.picasso.ad.a((java.io.InputStream) r3)
            throw r0
        L_0x00d8:
            if (r0 == 0) goto L_0x021c
            com.squareup.picasso.s r2 = r1.f27402b
            boolean r2 = r2.m
            if (r2 == 0) goto L_0x00e5
            com.squareup.picasso.v r2 = r1.g
            r2.a()
        L_0x00e5:
            com.squareup.picasso.z r2 = r1.f27405e
            r3 = 2
            r2.a((android.graphics.Bitmap) r0, (int) r3)
            com.squareup.picasso.v r2 = r1.g
            boolean r4 = r2.d()
            if (r4 != 0) goto L_0x00fd
            boolean r2 = r2.e()
            if (r2 == 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            r16 = 0
            goto L_0x00ff
        L_0x00fd:
            r16 = 1
        L_0x00ff:
            if (r16 != 0) goto L_0x0105
            int r2 = r1.q
            if (r2 == 0) goto L_0x021c
        L_0x0105:
            java.lang.Object r2 = t
            monitor-enter(r2)
            com.squareup.picasso.v r4 = r1.g     // Catch:{ all -> 0x0219 }
            boolean r4 = r4.d()     // Catch:{ all -> 0x0219 }
            if (r4 != 0) goto L_0x0114
            int r4 = r1.q     // Catch:{ all -> 0x0219 }
            if (r4 == 0) goto L_0x01f4
        L_0x0114:
            com.squareup.picasso.v r4 = r1.g     // Catch:{ all -> 0x0219 }
            int r6 = r1.q     // Catch:{ all -> 0x0219 }
            int r7 = r0.getWidth()     // Catch:{ all -> 0x0219 }
            int r8 = r0.getHeight()     // Catch:{ all -> 0x0219 }
            boolean r9 = r4.l     // Catch:{ all -> 0x0219 }
            android.graphics.Matrix r10 = new android.graphics.Matrix     // Catch:{ all -> 0x0219 }
            r10.<init>()     // Catch:{ all -> 0x0219 }
            boolean r11 = r4.d()     // Catch:{ all -> 0x0219 }
            if (r11 == 0) goto L_0x01d0
            int r11 = r4.h     // Catch:{ all -> 0x0219 }
            int r12 = r4.i     // Catch:{ all -> 0x0219 }
            float r13 = r4.m     // Catch:{ all -> 0x0219 }
            r14 = 0
            int r14 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r14 == 0) goto L_0x0147
            boolean r14 = r4.p     // Catch:{ all -> 0x0219 }
            if (r14 == 0) goto L_0x0144
            float r14 = r4.n     // Catch:{ all -> 0x0219 }
            float r15 = r4.o     // Catch:{ all -> 0x0219 }
            r10.setRotate(r13, r14, r15)     // Catch:{ all -> 0x0219 }
            goto L_0x0147
        L_0x0144:
            r10.setRotate(r13)     // Catch:{ all -> 0x0219 }
        L_0x0147:
            boolean r13 = r4.j     // Catch:{ all -> 0x0219 }
            if (r13 == 0) goto L_0x0193
            float r4 = (float) r11     // Catch:{ all -> 0x0219 }
            float r13 = (float) r7     // Catch:{ all -> 0x0219 }
            float r14 = r4 / r13
            float r15 = (float) r12     // Catch:{ all -> 0x0219 }
            float r5 = (float) r8     // Catch:{ all -> 0x0219 }
            float r16 = r15 / r5
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 <= 0) goto L_0x016f
            float r16 = r16 / r14
            float r5 = r5 * r16
            double r4 = (double) r5     // Catch:{ all -> 0x0219 }
            double r4 = java.lang.Math.ceil(r4)     // Catch:{ all -> 0x0219 }
            int r4 = (int) r4     // Catch:{ all -> 0x0219 }
            int r5 = r8 - r4
            int r5 = r5 / r3
            float r3 = (float) r4     // Catch:{ all -> 0x0219 }
            float r16 = r15 / r3
            r13 = r4
            r17 = r5
            r4 = r7
            r3 = r16
            r5 = 0
            goto L_0x0187
        L_0x016f:
            float r14 = r14 / r16
            float r13 = r13 * r14
            double r13 = (double) r13     // Catch:{ all -> 0x0219 }
            double r13 = java.lang.Math.ceil(r13)     // Catch:{ all -> 0x0219 }
            int r5 = (int) r13     // Catch:{ all -> 0x0219 }
            int r13 = r7 - r5
            int r3 = r13 / 2
            float r13 = (float) r5     // Catch:{ all -> 0x0219 }
            float r14 = r4 / r13
            r4 = r5
            r13 = r8
            r17 = 0
            r5 = r3
            r3 = r16
        L_0x0187:
            boolean r7 = a((boolean) r9, (int) r7, (int) r8, (int) r11, (int) r12)     // Catch:{ all -> 0x0219 }
            if (r7 == 0) goto L_0x0190
            r10.preScale(r14, r3)     // Catch:{ all -> 0x0219 }
        L_0x0190:
            r7 = r4
            r8 = r13
            goto L_0x01d3
        L_0x0193:
            boolean r3 = r4.k     // Catch:{ all -> 0x0219 }
            if (r3 == 0) goto L_0x01ad
            float r3 = (float) r11     // Catch:{ all -> 0x0219 }
            float r4 = (float) r7     // Catch:{ all -> 0x0219 }
            float r3 = r3 / r4
            float r4 = (float) r12     // Catch:{ all -> 0x0219 }
            float r5 = (float) r8     // Catch:{ all -> 0x0219 }
            float r4 = r4 / r5
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r3 = r4
        L_0x01a3:
            boolean r4 = a((boolean) r9, (int) r7, (int) r8, (int) r11, (int) r12)     // Catch:{ all -> 0x0219 }
            if (r4 == 0) goto L_0x01d0
            r10.preScale(r3, r3)     // Catch:{ all -> 0x0219 }
            goto L_0x01d0
        L_0x01ad:
            if (r11 != 0) goto L_0x01b1
            if (r12 == 0) goto L_0x01d0
        L_0x01b1:
            if (r11 != r7) goto L_0x01b5
            if (r12 == r8) goto L_0x01d0
        L_0x01b5:
            if (r11 == 0) goto L_0x01bb
            float r3 = (float) r11     // Catch:{ all -> 0x0219 }
            float r4 = (float) r7     // Catch:{ all -> 0x0219 }
        L_0x01b9:
            float r3 = r3 / r4
            goto L_0x01be
        L_0x01bb:
            float r3 = (float) r12     // Catch:{ all -> 0x0219 }
            float r4 = (float) r8     // Catch:{ all -> 0x0219 }
            goto L_0x01b9
        L_0x01be:
            if (r12 == 0) goto L_0x01c4
            float r4 = (float) r12     // Catch:{ all -> 0x0219 }
            float r5 = (float) r8     // Catch:{ all -> 0x0219 }
        L_0x01c2:
            float r4 = r4 / r5
            goto L_0x01c7
        L_0x01c4:
            float r4 = (float) r11     // Catch:{ all -> 0x0219 }
            float r5 = (float) r7     // Catch:{ all -> 0x0219 }
            goto L_0x01c2
        L_0x01c7:
            boolean r5 = a((boolean) r9, (int) r7, (int) r8, (int) r11, (int) r12)     // Catch:{ all -> 0x0219 }
            if (r5 == 0) goto L_0x01d0
            r10.preScale(r3, r4)     // Catch:{ all -> 0x0219 }
        L_0x01d0:
            r5 = 0
            r17 = 0
        L_0x01d3:
            if (r6 == 0) goto L_0x01d9
            float r3 = (float) r6     // Catch:{ all -> 0x0219 }
            r10.preRotate(r3)     // Catch:{ all -> 0x0219 }
        L_0x01d9:
            r3 = 1
            r4 = r0
            r6 = r17
            r9 = r10
            r10 = r3
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0219 }
            if (r3 == r0) goto L_0x01e9
            r0.recycle()     // Catch:{ all -> 0x0219 }
            r0 = r3
        L_0x01e9:
            com.squareup.picasso.s r3 = r1.f27402b     // Catch:{ all -> 0x0219 }
            boolean r3 = r3.m     // Catch:{ all -> 0x0219 }
            if (r3 == 0) goto L_0x01f4
            com.squareup.picasso.v r3 = r1.g     // Catch:{ all -> 0x0219 }
            r3.a()     // Catch:{ all -> 0x0219 }
        L_0x01f4:
            com.squareup.picasso.v r3 = r1.g     // Catch:{ all -> 0x0219 }
            boolean r3 = r3.e()     // Catch:{ all -> 0x0219 }
            if (r3 == 0) goto L_0x020f
            com.squareup.picasso.v r3 = r1.g     // Catch:{ all -> 0x0219 }
            java.util.List<com.squareup.picasso.ab> r3 = r3.g     // Catch:{ all -> 0x0219 }
            android.graphics.Bitmap r0 = a(r3, r0)     // Catch:{ all -> 0x0219 }
            com.squareup.picasso.s r3 = r1.f27402b     // Catch:{ all -> 0x0219 }
            boolean r3 = r3.m     // Catch:{ all -> 0x0219 }
            if (r3 == 0) goto L_0x020f
            com.squareup.picasso.v r3 = r1.g     // Catch:{ all -> 0x0219 }
            r3.a()     // Catch:{ all -> 0x0219 }
        L_0x020f:
            monitor-exit(r2)     // Catch:{ all -> 0x0219 }
            if (r0 == 0) goto L_0x021c
            com.squareup.picasso.z r2 = r1.f27405e
            r3 = 3
            r2.a((android.graphics.Bitmap) r0, (int) r3)
            goto L_0x021c
        L_0x0219:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0219 }
            throw r0
        L_0x021c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.c():android.graphics.Bitmap");
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        boolean z = this.f27402b.m;
        v vVar = aVar.f27382b;
        if (this.k == null) {
            this.k = aVar;
            if (z) {
                if (this.l == null || this.l.isEmpty()) {
                    vVar.a();
                    return;
                } else {
                    vVar.a();
                    ad.a(this, "to ");
                }
            }
            return;
        }
        if (this.l == null) {
            this.l = new ArrayList(3);
        }
        this.l.add(aVar);
        if (z) {
            vVar.a();
            ad.a(this, "to ");
        }
        s.e d2 = aVar.d();
        if (d2.ordinal() > this.s.ordinal()) {
            this.s = d2;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(a aVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (this.k == aVar) {
            this.k = null;
            z = true;
        } else if (this.l != null) {
            z = this.l.remove(aVar);
        } else {
            z = false;
        }
        if (z && aVar.d() == this.s) {
            s.e eVar = s.e.LOW;
            if (this.l == null || this.l.isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (this.k == null && !z2) {
                z3 = false;
            }
            if (z3) {
                if (this.k != null) {
                    eVar = this.k.d();
                }
                if (z2) {
                    int size = this.l.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        s.e d2 = this.l.get(i2).d();
                        if (d2.ordinal() > eVar.ordinal()) {
                            eVar = d2;
                        }
                    }
                }
            }
            this.s = eVar;
        }
        if (this.f27402b.m) {
            aVar.f27382b.a();
            ad.a(this, "from ");
        }
    }

    private static Bitmap a(List<ab> list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            final ab abVar = list.get(i2);
            try {
                Bitmap a2 = abVar.a(bitmap);
                if (a2 == null) {
                    final StringBuilder sb = new StringBuilder("Transformation ");
                    sb.append(abVar.a());
                    sb.append(" returned null after ");
                    sb.append(i2);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (ab a3 : list) {
                        sb.append(a3.a());
                        sb.append(10);
                    }
                    s.f27437a.post(new Runnable() {
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (a2 == bitmap && bitmap.isRecycled()) {
                    s.f27437a.post(new Runnable() {
                        public final void run() {
                            throw new IllegalStateException("Transformation " + abVar.a() + " returned input Bitmap but recycled it.");
                        }
                    });
                    return null;
                } else if (a2 == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = a2;
                } else {
                    s.f27437a.post(new Runnable() {
                        public final void run() {
                            throw new IllegalStateException("Transformation " + abVar.a() + " mutated input Bitmap but failed to recycle the original.");
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e2) {
                s.f27437a.post(new Runnable() {
                    public final void run() {
                        throw new RuntimeException("Transformation " + abVar.a() + " crashed with exception.", e2);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    static c a(s sVar, Dispatcher dispatcher, d dVar, z zVar, a aVar) {
        v vVar = aVar.f27382b;
        List<x> list = sVar.f27439c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            x xVar = list.get(i2);
            if (xVar.a(vVar)) {
                c cVar = new c(sVar, dispatcher, dVar, zVar, aVar, xVar);
                return cVar;
            }
        }
        c cVar2 = new c(sVar, dispatcher, dVar, zVar, aVar, w);
        return cVar2;
    }

    private c(s sVar, Dispatcher dispatcher, d dVar, z zVar, a aVar, x xVar) {
        this.f27402b = sVar;
        this.f27403c = dispatcher;
        this.f27404d = dVar;
        this.f27405e = zVar;
        this.k = aVar;
        this.f27406f = aVar.i;
        this.g = aVar.f27382b;
        this.s = aVar.d();
        this.h = aVar.f27385e;
        this.i = aVar.f27386f;
        this.j = xVar;
        this.r = xVar.a();
    }
}

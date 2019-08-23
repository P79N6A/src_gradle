package com.ss.android.ugc.aweme.shortvideo;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.upload.e;
import com.ss.android.ugc.aweme.shortvideo.upload.f;
import com.ss.android.ugc.aweme.shortvideo.upload.h;
import com.ss.android.ugc.aweme.shortvideo.upload.i;
import com.ss.android.ugc.aweme.shortvideo.upload.l;
import com.ss.android.ugc.aweme.shortvideo.upload.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class am implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65594a = null;
    private static int m = 30;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f65595b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final Condition f65596c = this.f65595b.newCondition();

    /* renamed from: d  reason: collision with root package name */
    public final Lock f65597d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    public final Condition f65598e = this.f65597d.newCondition();

    /* renamed from: f  reason: collision with root package name */
    public l f65599f = new l();
    public RandomAccessFile g;
    public volatile int h = 0;
    public volatile boolean i;
    public LinkedList<r> j = new LinkedList<>();
    public File k;
    private volatile e.c l;
    private com.ss.android.ugc.aweme.shortvideo.upload.b.a<Long> n = new com.ss.android.ugc.aweme.shortvideo.upload.b.a<>(-1L);

    class a implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65601a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f65602b;

        /* renamed from: c  reason: collision with root package name */
        public Exception f65603c;

        /* renamed from: d  reason: collision with root package name */
        public volatile e.a f65604d;

        /* renamed from: f  reason: collision with root package name */
        private int f65606f;
        private volatile int g;
        private byte[] h;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v62, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: com.ss.android.ugc.aweme.shortvideo.upload.r} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r10 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 74009(0x12119, float:1.03709E-40)
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                r4 = 0
                r5 = 74009(0x12119, float:1.03709E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r10
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0025:
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                r4 = 0
                r5 = 74008(0x12118, float:1.03707E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.upload.r> r7 = com.ss.android.ugc.aweme.shortvideo.upload.r.class
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                r8 = 0
                r9 = 1
                if (r1 == 0) goto L_0x0050
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                r4 = 0
                r5 = 74008(0x12118, float:1.03707E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.upload.r> r7 = com.ss.android.ugc.aweme.shortvideo.upload.r.class
                r2 = r10
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                r8 = r1
                com.ss.android.ugc.aweme.shortvideo.upload.r r8 = (com.ss.android.ugc.aweme.shortvideo.upload.r) r8
                goto L_0x00f9
            L_0x0050:
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                r4 = 0
                r5 = 74011(0x1211b, float:1.03712E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.upload.r> r7 = com.ss.android.ugc.aweme.shortvideo.upload.r.class
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0077
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f65601a
                r4 = 0
                r5 = 74011(0x1211b, float:1.03712E-40)
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class<com.ss.android.ugc.aweme.shortvideo.upload.r> r7 = com.ss.android.ugc.aweme.shortvideo.upload.r.class
                r2 = r10
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                com.ss.android.ugc.aweme.shortvideo.upload.r r1 = (com.ss.android.ugc.aweme.shortvideo.upload.r) r1
                goto L_0x0094
            L_0x0077:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.util.LinkedList<com.ss.android.ugc.aweme.shortvideo.upload.r> r1 = r1.j
                java.util.Iterator r1 = r1.iterator()
            L_0x007f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x0093
                java.lang.Object r2 = r1.next()
                com.ss.android.ugc.aweme.shortvideo.upload.r r2 = (com.ss.android.ugc.aweme.shortvideo.upload.r) r2
                int r3 = r10.f65606f
                int r4 = r2.f71040a
                if (r3 != r4) goto L_0x007f
                r1 = r2
                goto L_0x0094
            L_0x0093:
                r1 = r8
            L_0x0094:
                if (r1 == 0) goto L_0x0098
                r8 = r1
                goto L_0x00f9
            L_0x0098:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.util.LinkedList<com.ss.android.ugc.aweme.shortvideo.upload.r> r1 = r1.j
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L_0x00c0
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.lang.String r2 = "[SliceConsume] createSliceIfNeed mMp4HeaderSize:%d"
                java.lang.Object[] r3 = new java.lang.Object[r9]
                com.ss.android.ugc.aweme.shortvideo.am r4 = com.ss.android.ugc.aweme.shortvideo.am.this
                int r4 = r4.h
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3[r0] = r4
                r1.b((java.lang.String) r2, (java.lang.Object[]) r3)
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                int r1 = r1.h
                if (r1 <= 0) goto L_0x00f9
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                int r1 = r1.h
                goto L_0x00f0
            L_0x00c0:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.util.LinkedList<com.ss.android.ugc.aweme.shortvideo.upload.r> r1 = r1.j
                java.lang.Object r1 = r1.getLast()
                com.ss.android.ugc.aweme.shortvideo.upload.r r1 = (com.ss.android.ugc.aweme.shortvideo.upload.r) r1
                int r1 = r1.a()
                com.ss.android.ugc.aweme.shortvideo.am r2 = com.ss.android.ugc.aweme.shortvideo.am.this
                boolean r2 = r2.i
                if (r2 == 0) goto L_0x00f0
                int r2 = r10.f65606f
                if (r2 != 0) goto L_0x00e0
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                int r1 = r1.h
                r10.g = r1
            L_0x00de:
                r1 = 0
                goto L_0x00f0
            L_0x00e0:
                long r2 = (long) r1
                com.ss.android.ugc.aweme.shortvideo.am r4 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.io.File r4 = r4.k
                long r4 = r4.length()
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00f0
                r10.g = r0
                goto L_0x00de
            L_0x00f0:
                com.ss.android.ugc.aweme.shortvideo.upload.r r8 = new com.ss.android.ugc.aweme.shortvideo.upload.r
                int r2 = r10.f65606f
                int r3 = r10.g
                r8.<init>(r2, r1, r3)
            L_0x00f9:
                if (r8 != 0) goto L_0x0109
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this
                java.lang.String r2 = "[SliceConsume] sliceModel=null consume wait"
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r1.b((java.lang.String) r2, (java.lang.Object[]) r0)
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_WAIT_DATA
                r10.f65604d = r0
                return
            L_0x0109:
                int r1 = r8.a()     // Catch:{ IOException -> 0x01d5 }
                long r1 = (long) r1     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.am r3 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.io.File r3 = r3.k     // Catch:{ IOException -> 0x01d5 }
                long r3 = r3.length()     // Catch:{ IOException -> 0x01d5 }
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 <= 0) goto L_0x0133
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                boolean r1 = r1.i     // Catch:{ IOException -> 0x01d5 }
                if (r1 != 0) goto L_0x0125
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_WAIT_DATA     // Catch:{ IOException -> 0x01d5 }
                r10.f65604d = r0     // Catch:{ IOException -> 0x01d5 }
                return
            L_0x0125:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.io.File r1 = r1.k     // Catch:{ IOException -> 0x01d5 }
                long r1 = r1.length()     // Catch:{ IOException -> 0x01d5 }
                int r1 = (int) r1     // Catch:{ IOException -> 0x01d5 }
                int r2 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                int r1 = r1 - r2
                r8.f71042c = r1     // Catch:{ IOException -> 0x01d5 }
            L_0x0133:
                int r1 = r8.f71042c     // Catch:{ IOException -> 0x01d5 }
                r10.f65602b = r1     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.io.RandomAccessFile r1 = r1.g     // Catch:{ IOException -> 0x01d5 }
                int r2 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                long r2 = (long) r2     // Catch:{ IOException -> 0x01d5 }
                r1.seek(r2)     // Catch:{ IOException -> 0x01d5 }
                int r1 = r8.f71042c     // Catch:{ IOException -> 0x01d5 }
                if (r1 >= 0) goto L_0x0173
                java.lang.Exception r0 = new java.lang.Exception     // Catch:{ IOException -> 0x01d5 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01d5 }
                java.lang.String r2 = "ArrayIndexOutOfBoundsException sliceModel.getOffset():"
                r1.<init>(r2)     // Catch:{ IOException -> 0x01d5 }
                int r2 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                r1.append(r2)     // Catch:{ IOException -> 0x01d5 }
                java.lang.String r2 = "  mOutputFile.length():"
                r1.append(r2)     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.am r2 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.io.File r2 = r2.k     // Catch:{ IOException -> 0x01d5 }
                long r2 = r2.length()     // Catch:{ IOException -> 0x01d5 }
                r1.append(r2)     // Catch:{ IOException -> 0x01d5 }
                java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x01d5 }
                r0.<init>(r1)     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_FAIL     // Catch:{ IOException -> 0x01d5 }
                r10.a(r0)     // Catch:{ IOException -> 0x01d5 }
                return
            L_0x0173:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.io.RandomAccessFile r1 = r1.g     // Catch:{ IOException -> 0x01d5 }
                byte[] r2 = r10.h     // Catch:{ IOException -> 0x01d5 }
                int r3 = r8.f71042c     // Catch:{ IOException -> 0x01d5 }
                r1.read(r2, r0, r3)     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.util.LinkedList<com.ss.android.ugc.aweme.shortvideo.upload.r> r1 = r1.j     // Catch:{ IOException -> 0x01d5 }
                r1.add(r8)     // Catch:{ IOException -> 0x01d5 }
                int r1 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                if (r1 != 0) goto L_0x018f
                int r1 = r8.f71042c     // Catch:{ IOException -> 0x01d5 }
                if (r1 != 0) goto L_0x018f
                r1 = 1
                goto L_0x0190
            L_0x018f:
                r1 = 0
            L_0x0190:
                if (r1 == 0) goto L_0x0198
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r1 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_END     // Catch:{ IOException -> 0x01d5 }
                r10.a(r1)     // Catch:{ IOException -> 0x01d5 }
                goto L_0x019d
            L_0x0198:
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r1 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_DONE     // Catch:{ IOException -> 0x01d5 }
                r10.a(r1)     // Catch:{ IOException -> 0x01d5 }
            L_0x019d:
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.lang.String r2 = "consume execute %d-%d"
                r3 = 2
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01d5 }
                int r5 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x01d5 }
                r4[r0] = r5     // Catch:{ IOException -> 0x01d5 }
                int r5 = r8.a()     // Catch:{ IOException -> 0x01d5 }
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x01d5 }
                r4[r9] = r5     // Catch:{ IOException -> 0x01d5 }
                r1.a((java.lang.String) r2, (java.lang.Object[]) r4)     // Catch:{ IOException -> 0x01d5 }
                com.ss.android.ugc.aweme.shortvideo.am r1 = com.ss.android.ugc.aweme.shortvideo.am.this     // Catch:{ IOException -> 0x01d5 }
                java.lang.String r2 = "consume execute %d-%d"
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x01d5 }
                int r4 = r8.f71041b     // Catch:{ IOException -> 0x01d5 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x01d5 }
                r3[r0] = r4     // Catch:{ IOException -> 0x01d5 }
                int r0 = r8.a()     // Catch:{ IOException -> 0x01d5 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x01d5 }
                r3[r9] = r0     // Catch:{ IOException -> 0x01d5 }
                r1.b((java.lang.String) r2, (java.lang.Object[]) r3)     // Catch:{ IOException -> 0x01d5 }
                return
            L_0x01d5:
                r0 = move-exception
                r10.f65603c = r0
                com.ss.android.ugc.aweme.shortvideo.upload.e$a r0 = com.ss.android.ugc.aweme.shortvideo.upload.e.a.CONSUME_FAIL
                r10.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.am.a.a():void");
        }

        private void a(e.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f65601a, false, 74010, new Class[]{e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f65601a, false, 74010, new Class[]{e.a.class}, Void.TYPE);
                return;
            }
            am.this.f65597d.lock();
            this.f65604d = aVar;
            am.this.f65598e.signalAll();
            am.this.f65597d.unlock();
        }

        private a(int i, byte[] bArr, int i2) {
            this.f65606f = i;
            this.h = bArr;
            this.g = i2;
        }

        /* synthetic */ a(am amVar, int i, byte[] bArr, int i2, byte b2) {
            this(i, bArr, i2);
        }
    }

    class b implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65607a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f65607a, false, 74012, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65607a, false, 74012, new Class[0], Void.TYPE);
                return;
            }
            am.this.f65597d.lock();
            am.this.f65598e.signalAll();
            am.this.f65597d.unlock();
            am.this.f65595b.lock();
            am.this.f65596c.signalAll();
            am.this.f65595b.unlock();
            try {
                am.this.g.close();
            } catch (IOException unused) {
            }
            if (am.this.k.exists()) {
                am.this.k.delete();
            }
            l lVar = am.this.f65599f;
            if (PatchProxy.isSupport(new Object[0], lVar, l.f71021a, false, 80784, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], lVar, l.f71021a, false, 80784, new Class[0], Void.TYPE);
                return;
            }
            lVar.f71022b.quit();
        }

        private b() {
        }

        /* synthetic */ b(am amVar, byte b2) {
            this();
        }
    }

    class c implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65609a;

        /* renamed from: b  reason: collision with root package name */
        public volatile e.b f65610b;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f65609a, false, 74013, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65609a, false, 74013, new Class[0], Void.TYPE);
                return;
            }
            if (am.this.h > 0) {
                e.b bVar = e.b.GET_HEADER_SIZE_DONE;
                if (PatchProxy.isSupport(new Object[]{bVar}, this, f65609a, false, 74014, new Class[]{e.b.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bVar}, this, f65609a, false, 74014, new Class[]{e.b.class}, Void.TYPE);
                } else {
                    am.this.f65597d.lock();
                    this.f65610b = bVar;
                    am.this.f65598e.signalAll();
                    am.this.f65597d.unlock();
                }
            } else {
                this.f65610b = e.b.GET_HEADER_SIZE_WAIT;
            }
        }

        private c() {
        }

        /* synthetic */ c(am amVar, byte b2) {
            this();
        }
    }

    class d implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65612a;

        /* renamed from: b  reason: collision with root package name */
        public volatile Exception f65613b;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f65615d;

        /* renamed from: e  reason: collision with root package name */
        private int f65616e;

        /* renamed from: f  reason: collision with root package name */
        private int f65617f;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f65612a, false, 74015, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65612a, false, 74015, new Class[0], Void.TYPE);
                return;
            }
            try {
                if (am.this.g.length() == 0) {
                    am.this.h = this.f65616e;
                    am.this.b("Produce on empty file, mMp4HeaderSize:%d", Integer.valueOf(am.this.h));
                    am.this.g.write(new byte[this.f65616e], 0, this.f65616e);
                }
                am.this.g.seek((long) this.f65616e);
                am.this.g.write(this.f65615d, 0, this.f65617f);
                am.this.a("write offset:%d size:%d", Integer.valueOf(this.f65616e), Integer.valueOf(this.f65617f));
            } catch (IOException e2) {
                this.f65613b = e2;
            }
            am.this.f65595b.lock();
            am.this.f65596c.signalAll();
            am.this.f65595b.unlock();
        }

        public d(byte[] bArr, @NonNull int i, int i2) {
            this.f65615d = bArr;
            this.f65616e = i;
            this.f65617f = i2;
        }
    }

    class e implements i {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f65618a;

        /* renamed from: b  reason: collision with root package name */
        public volatile int f65619b;

        /* renamed from: c  reason: collision with root package name */
        public Exception f65620c;

        /* renamed from: d  reason: collision with root package name */
        public volatile e.a f65621d;

        /* renamed from: f  reason: collision with root package name */
        private final long f65623f;
        private final byte[] g;
        private final long h;
        private final long i;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f65618a, false, 74016, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f65618a, false, 74016, new Class[0], Void.TYPE);
                return;
            }
            int length = (int) am.this.k.length();
            if (!am.this.i) {
                if (this.h > ((long) length)) {
                    this.f65621d = e.a.CONSUME_WAIT_DATA;
                } else {
                    a(length);
                }
            } else if (this.f65623f < ((long) length)) {
                a(length);
            } else {
                a(e.a.CONSUME_END);
            }
        }

        private void a(int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f65618a, false, 74017, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f65618a, false, 74017, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            this.f65619b = (int) (Math.min(this.i, (long) i2) - this.f65623f);
            try {
                am.this.g.seek(this.f65623f);
                am.this.g.read(this.g, 0, this.f65619b);
                a(e.a.CONSUME_DONE);
            } catch (IOException e2) {
                this.f65620c = e2;
                a(e.a.CONSUME_FAIL);
            }
        }

        private void a(e.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f65618a, false, 74018, new Class[]{e.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f65618a, false, 74018, new Class[]{e.a.class}, Void.TYPE);
                return;
            }
            am.this.f65597d.lock();
            this.f65621d = aVar;
            am.this.f65598e.signalAll();
            am.this.f65597d.unlock();
        }

        private e(long j, byte[] bArr, int i2, int i3) {
            this.f65623f = j;
            this.g = bArr;
            this.i = ((long) i2) + j;
            this.h = j + ((long) i3);
        }

        /* synthetic */ e(am amVar, long j, byte[] bArr, int i2, int i3, byte b2) {
            this(j, bArr, i2, i3);
        }
    }

    public final boolean d() {
        return this.i;
    }

    public final void a(byte[] bArr, int i2, int i3, boolean z) {
        Object obj = bArr;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65594a, false, 73992, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i2), Integer.valueOf(i3), Byte.valueOf(z)}, this, f65594a, false, 73992, new Class[]{byte[].class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a("produce offset:%d size:%d isFinish:%b", Integer.valueOf(i2), Integer.valueOf(i3), Boolean.valueOf(z));
        if (h() >= 0) {
            d dVar = new d(bArr, i2, i3);
            this.f65595b.lock();
            try {
                this.f65599f.a(dVar);
                this.f65596c.await();
                if (dVar.f65613b == null) {
                    this.f65595b.unlock();
                    this.i = z;
                    this.f65597d.lock();
                    this.f65598e.signalAll();
                    this.f65597d.unlock();
                    return;
                }
                throw new f((Throwable) dVar.f65613b);
            } catch (InterruptedException e2) {
                throw new f((Throwable) e2);
            } catch (Throwable th) {
                this.f65595b.unlock();
                throw th;
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 74001, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 74001, new Class[0], Void.TYPE);
        } else if (this.l == e.c.UPLOADING) {
            this.l = e.c.UPLOAD_FINISH;
            try {
                this.f65599f.a(new b(this, (byte) 0));
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 74002, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 74002, new Class[0], Void.TYPE);
        } else if (this.l == e.c.UPLOADING) {
            this.l = e.c.UPLOAD_CANCEL;
            try {
                this.f65599f.a(new b(this, (byte) 0));
            } catch (InterruptedException unused) {
            }
        }
    }

    public final long e() {
        if (!PatchProxy.isSupport(new Object[0], this, f65594a, false, 74004, new Class[0], Long.TYPE)) {
            return ((Long) this.n.f71005b).longValue();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 74004, new Class[0], Long.TYPE)).longValue();
    }

    public final long f() {
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 74005, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 74005, new Class[0], Long.TYPE)).longValue();
        } else if (this.i) {
            return this.k.length();
        } else {
            return -1;
        }
    }

    private int h() {
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 74003, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 74003, new Class[0], Integer.TYPE)).intValue();
        } else if (e.c.UPLOAD_FINISH.equals(this.l)) {
            return -1;
        } else {
            if (e.c.UPLOAD_CANCEL.equals(this.l)) {
                return -2;
            }
            return 1;
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 73997, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 73997, new Class[0], Integer.TYPE)).intValue();
        }
        a("StartGetHeaderSize", new Object[0]);
        int g2 = g();
        a("EndGetHeaderSize result:%d", Integer.valueOf(g2));
        return g2;
    }

    private int g() {
        boolean await;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 73998, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 73998, new Class[0], Integer.TYPE)).intValue();
        }
        int h2 = h();
        if (h2 < 0) {
            return h2;
        }
        if (this.h > 0) {
            return this.h;
        }
        c cVar = new c(this, (byte) 0);
        this.f65597d.lock();
        do {
            try {
                this.f65599f.a(cVar);
                do {
                    await = this.f65598e.await((long) m, TimeUnit.SECONDS);
                    if (cVar.f65610b != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int h3 = h();
                    if (h3 < 0) {
                        this.f65597d.unlock();
                        return h3;
                    }
                } else {
                    throw new f("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new f((Throwable) e2);
            } catch (Throwable th) {
                this.f65597d.unlock();
                throw th;
            }
        } while (cVar.f65610b == e.b.GET_HEADER_SIZE_WAIT);
        this.f65597d.unlock();
        if (this.h <= 0) {
            return -1;
        }
        return this.h;
    }

    public am(String str) {
        this.k = new File(str);
        this.l = e.c.UPLOADING;
        try {
            com.ss.android.ugc.aweme.video.b.e(this.k.getParent());
            new File(this.k.getParent()).mkdirs();
            this.k.createNewFile();
            this.g = new RandomAccessFile(this.k, "rw");
        } catch (FileNotFoundException e2) {
            throw new f((Throwable) e2);
        } catch (IOException e3) {
            throw new f((Throwable) e3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(java.lang.String r20, java.lang.Object... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f65594a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 74007(0x12117, float:1.03706E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f65594a
            r15 = 0
            r16 = 74007(0x12117, float:1.03706E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "ConcurrentUploadByFile:"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.ss.android.ugc.aweme.shortvideo.util.ai.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.am.b(java.lang.String, java.lang.Object[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb A[SYNTHETIC, Splitter:B:30:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1 A[SYNTHETIC, Splitter:B:36:0x00c1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private long b(long r17, long r19) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r11 = r19
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r13 = 0
            r1[r13] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r11)
            r14 = 1
            r1[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f65594a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r13] = r2
            java.lang.Class r2 = java.lang.Long.TYPE
            r6[r14] = r2
            java.lang.Class r7 = java.lang.Long.TYPE
            r4 = 0
            r5 = 74000(0x12110, float:1.03696E-40)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0062
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r9)
            r1[r13] = r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r11)
            r1[r14] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f65594a
            r4 = 0
            r5 = 74000(0x12110, float:1.03696E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r13] = r0
            java.lang.Class r0 = java.lang.Long.TYPE
            r6[r14] = r0
            java.lang.Class r7 = java.lang.Long.TYPE
            r2 = r16
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
        L_0x0062:
            int r0 = r16.h()
            if (r0 >= 0) goto L_0x006a
            long r0 = (long) r0
            return r0
        L_0x006a:
            java.io.File r0 = r8.k
            long r0 = r0.length()
            int r0 = (int) r0
            long r0 = (long) r0
            long r2 = r9 + r11
            r4 = -1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x007b
            return r4
        L_0x007b:
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
            java.io.File r3 = r8.k     // Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
            java.lang.String r6 = "r"
            r2.<init>(r3, r6)     // Catch:{ IOException -> 0x00bf, all -> 0x00b7 }
            r2.seek(r9)     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r1]     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            r6 = 0
            r9 = r6
        L_0x0094:
            int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r14 >= 0) goto L_0x00ab
            r2.read(r3)     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            r14 = 2048(0x800, double:1.0118E-320)
            long r9 = r9 + r14
            long r14 = r9 - r11
            long r14 = java.lang.Math.max(r6, r14)     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            int r14 = (int) r14     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            int r14 = 2048 - r14
            r0.update(r3, r13, r14)     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            goto L_0x0094
        L_0x00ab:
            long r0 = r0.getValue()     // Catch:{ IOException -> 0x00b5, all -> 0x00b3 }
            r2.close()     // Catch:{ IOException -> 0x00b2 }
        L_0x00b2:
            return r0
        L_0x00b3:
            r0 = move-exception
            goto L_0x00b9
        L_0x00b5:
            r1 = r2
            goto L_0x00bf
        L_0x00b7:
            r0 = move-exception
            r2 = r1
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            r2.close()     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            throw r0
        L_0x00bf:
            if (r1 == 0) goto L_0x00c4
            r1.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00c4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.am.b(long, long):long");
    }

    public final long a(long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{new Long(j4), new Long(j5)}, this, f65594a, false, 73999, new Class[]{Long.TYPE, Long.TYPE}, Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[]{new Long(j4), new Long(j5)}, this, f65594a, false, 73999, new Class[]{Long.TYPE, Long.TYPE}, Long.TYPE)).longValue();
        }
        long b2 = b(j2, j3);
        a("GetCrc32 offset:%d length:%d result:%d", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(b2));
        return b2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r20, java.lang.Object... r21) {
        /*
            r19 = this;
            r0 = r20
            r1 = r21
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f65594a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Void.TYPE
            r6 = 0
            r7 = 74006(0x12116, float:1.03704E-40)
            r4 = r19
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0047
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = f65594a
            r15 = 0
            r16 = 74006(0x12116, float:1.03704E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<java.lang.Object[]> r1 = java.lang.Object[].class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r19
            r17 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x0047:
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r2, r0, r1)
            com.ss.android.ugc.aweme.shortvideo.upload.o r1 = com.ss.android.ugc.aweme.shortvideo.upload.o.a()
            r1.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.am.a(java.lang.String, java.lang.Object[]):void");
    }

    public final int a(int i2, byte[] bArr, int i3) {
        boolean await;
        boolean z;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), bArr, Integer.valueOf(i3)}, this, f65594a, false, 73993, new Class[]{Integer.TYPE, byte[].class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), bArr, Integer.valueOf(i3)}, this, f65594a, false, 73993, new Class[]{Integer.TYPE, byte[].class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        a("consume sliceId:%d size:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (PatchProxy.isSupport(new Object[0], this, f65594a, false, 73994, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f65594a, false, 73994, new Class[0], Void.TYPE);
        } else if (this.j == null || this.j.isEmpty()) {
            this.n.a(0L);
        } else {
            this.n.a(Long.valueOf((long) this.j.getLast().a()));
        }
        int h2 = h();
        if (h2 < 0) {
            return h2;
        }
        a aVar = new a(this, i2, bArr, i3, (byte) 0);
        this.f65597d.lock();
        do {
            try {
                aVar.f65604d = null;
                this.f65599f.a(aVar);
                do {
                    await = this.f65598e.await((long) m, TimeUnit.SECONDS);
                    if (aVar.f65604d != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int h3 = h();
                    if (h3 < 0) {
                        this.f65597d.unlock();
                        return h3;
                    }
                } else {
                    throw new f("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new f((Throwable) e2);
            } catch (Throwable th) {
                this.f65597d.unlock();
                throw th;
            }
        } while (aVar.f65604d == e.a.CONSUME_WAIT_DATA);
        this.f65597d.unlock();
        switch (aVar.f65604d) {
            case CONSUME_FAIL:
                throw new f((Throwable) aVar.f65603c);
            case CONSUME_END:
                return 0;
            default:
                return aVar.f65602b;
        }
    }

    public final int a(long j2, byte[] bArr, int i2, int i3) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65594a, false, 73995, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65594a, false, 73995, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        a("StartStreamConsume offset:%d maxSize:%d minSize:%d", Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3));
        this.n.a(Long.valueOf(j2));
        int b2 = b(j2, bArr, i2, i3);
        a("EndStreamConsume offset:%d maxSize:%d minSize:%d result:%d", Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(b2));
        return b2;
    }

    private int b(long j2, byte[] bArr, int i2, int i3) {
        boolean await;
        boolean z;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65594a, false, 73996, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j3), bArr, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f65594a, false, 73996, new Class[]{Long.TYPE, byte[].class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        int h2 = h();
        if (h2 < 0) {
            return h2;
        }
        e eVar = new e(this, j2, bArr, i2, i3, (byte) 0);
        this.f65597d.lock();
        do {
            try {
                eVar.f65621d = null;
                this.f65599f.a(eVar);
                do {
                    await = this.f65598e.await((long) m, TimeUnit.SECONDS);
                    if (eVar.f65621d != null) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                } while (!z);
                if (await) {
                    int h3 = h();
                    if (h3 < 0) {
                        this.f65597d.unlock();
                        return h3;
                    }
                } else {
                    throw new f("upload timeout");
                }
            } catch (InterruptedException e2) {
                throw new f((Throwable) e2);
            } catch (Throwable th) {
                this.f65597d.unlock();
                throw th;
            }
        } while (eVar.f65621d == e.a.CONSUME_WAIT_DATA);
        this.f65597d.unlock();
        switch (eVar.f65621d) {
            case CONSUME_FAIL:
                throw new f((Throwable) eVar.f65620c);
            case CONSUME_END:
                return 0;
            default:
                return eVar.f65619b;
        }
    }
}

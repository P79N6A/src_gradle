package com.ss.android.ugc.aweme.livewallpaper.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.livewallpaper.b.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class s implements n.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53661a;

    /* renamed from: b  reason: collision with root package name */
    public final int f53662b;

    /* renamed from: c  reason: collision with root package name */
    public final int f53663c;

    /* renamed from: d  reason: collision with root package name */
    public String f53664d = "TextureQueue";

    /* renamed from: e  reason: collision with root package name */
    private final int f53665e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f53666f;
    private List<h> g;
    private List<h> h;

    static class a extends n implements n.b {

        /* renamed from: c  reason: collision with root package name */
        public static ChangeQuickRedirect f53667c;

        public final void e() {
            if (PatchProxy.isSupport(new Object[0], this, f53667c, false, 56209, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53667c, false, 56209, new Class[0], Void.TYPE);
                return;
            }
            super.e();
        }

        public final void a(h hVar) {
            this.f53643b = null;
        }

        private a(int i, int i2, int i3, n.b bVar) {
            super(i, i2, i3, bVar);
        }

        public static h a(int i, int i2, int i3, n.b bVar) {
            n.b bVar2 = bVar;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, null, f53667c, true, 56212, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, n.b.class}, h.class)) {
                return (h) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), bVar2}, null, f53667c, true, 56212, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, n.b.class}, h.class);
            }
            return new a(i3, i, i2, bVar2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53661a, false, 56207, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53661a, false, 56207, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this) {
            a(this.g);
            a(this.h);
            synchronized (this.g) {
                Iterator<h> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).e();
                }
                this.g.clear();
            }
            synchronized (this.h) {
                this.h.clear();
                this.h.notifyAll();
            }
        }
    }

    private int a(List<h> list) {
        int size;
        if (PatchProxy.isSupport(new Object[]{list}, this, f53661a, false, 56202, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, f53661a, false, 56202, new Class[]{List.class}, Integer.TYPE)).intValue();
        }
        synchronized (list) {
            size = list.size();
        }
        return size;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x017b */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0183  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.ugc.aweme.livewallpaper.b.h a(int r19) {
        /*
            r18 = this;
            r8 = r18
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r9 = 1000(0x3e8, float:1.401E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f53661a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r10] = r2
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r7 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r4 = 0
            r5 = 56203(0xdb8b, float:7.8757E-41)
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0043
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f53661a
            r4 = 0
            r5 = 56203(0xdb8b, float:7.8757E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r10] = r0
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r7 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r2 = r18
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r0
            return r0
        L_0x0043:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r1 = r8.h
            monitor-enter(r1)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r2 = r8.h     // Catch:{ all -> 0x0196 }
            int r2 = r2.size()     // Catch:{ all -> 0x0196 }
            r3 = 0
            if (r2 <= 0) goto L_0x0058
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r2 = r8.h     // Catch:{ all -> 0x0196 }
            java.lang.Object r2 = r2.remove(r10)     // Catch:{ all -> 0x0196 }
            com.ss.android.ugc.aweme.livewallpaper.b.h r2 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r2     // Catch:{ all -> 0x0196 }
            goto L_0x0059
        L_0x0058:
            r2 = r3
        L_0x0059:
            monitor-exit(r1)     // Catch:{ all -> 0x0196 }
            if (r2 != 0) goto L_0x016b
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r1 = r8.g
            monitor-enter(r1)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r4 = r8.g     // Catch:{ all -> 0x0168 }
            int r4 = r4.size()     // Catch:{ all -> 0x0168 }
            int r5 = r8.f53665e     // Catch:{ all -> 0x0168 }
            if (r4 >= r5) goto L_0x0166
            boolean r2 = r8.f53666f     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x0078
            int r0 = r8.f53662b     // Catch:{ all -> 0x0168 }
            int r2 = r8.f53663c     // Catch:{ all -> 0x0168 }
            r3 = -1
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.a(r0, r2, r3, r8)     // Catch:{ all -> 0x0168 }
            goto L_0x015d
        L_0x0078:
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ all -> 0x0168 }
            r11[r10] = r8     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.f53667c     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56210(0xdb92, float:7.8767E-41)
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.s> r4 = com.ss.android.ugc.aweme.livewallpaper.b.s.class
            r2[r10] = r4     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r17 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            if (r2 == 0) goto L_0x00b0
            java.lang.Object[] r11 = new java.lang.Object[r0]     // Catch:{ all -> 0x0168 }
            r11[r10] = r8     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.f53667c     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56210(0xdb92, float:7.8767E-41)
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.s> r2 = com.ss.android.ugc.aweme.livewallpaper.b.s.class
            r0[r10] = r2     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r17 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r0     // Catch:{ all -> 0x0168 }
            goto L_0x015d
        L_0x00b0:
            int r2 = r8.f53662b     // Catch:{ all -> 0x0168 }
            int r4 = r8.f53663c     // Catch:{ all -> 0x0168 }
            r5 = 3
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0168 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0168 }
            r11[r10] = r6     // Catch:{ all -> 0x0168 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0168 }
            r11[r0] = r6     // Catch:{ all -> 0x0168 }
            r6 = 2
            r11[r6] = r8     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.f53667c     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56211(0xdb93, float:7.8768E-41)
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0168 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r7[r10] = r9     // Catch:{ all -> 0x0168 }
            java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r7[r0] = r9     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.n$b> r9 = com.ss.android.ugc.aweme.livewallpaper.b.n.b.class
            r7[r6] = r9     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r17 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r16 = r7
            boolean r7 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            if (r7 == 0) goto L_0x0115
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0168 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0168 }
            r11[r10] = r2     // Catch:{ all -> 0x0168 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0168 }
            r11[r0] = r2     // Catch:{ all -> 0x0168 }
            r11[r6] = r8     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.f53667c     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56211(0xdb93, float:7.8768E-41)
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ all -> 0x0168 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r2[r10] = r3     // Catch:{ all -> 0x0168 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r2[r0] = r3     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.n$b> r0 = com.ss.android.ugc.aweme.livewallpaper.b.n.b.class
            r2[r6] = r0     // Catch:{ all -> 0x0168 }
            java.lang.Class<com.ss.android.ugc.aweme.livewallpaper.b.h> r17 = com.ss.android.ugc.aweme.livewallpaper.b.h.class
            r16 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r0     // Catch:{ all -> 0x0168 }
            goto L_0x015d
        L_0x0115:
            if (r2 != 0) goto L_0x0150
            if (r4 != 0) goto L_0x0150
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.i.f53625a     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56126(0xdb3e, float:7.8649E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]     // Catch:{ all -> 0x0168 }
            java.lang.Class r17 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r16 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            if (r5 == 0) goto L_0x0148
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch:{ all -> 0x0168 }
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.livewallpaper.b.i.f53625a     // Catch:{ all -> 0x0168 }
            r14 = 1
            r15 = 56126(0xdb3e, float:7.8649E-41)
            java.lang.Class[] r0 = new java.lang.Class[r10]     // Catch:{ all -> 0x0168 }
            java.lang.Class r17 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0168 }
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0168 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0168 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0168 }
            goto L_0x0156
        L_0x0148:
            int[] r5 = new int[r0]     // Catch:{ all -> 0x0168 }
            android.opengl.GLES20.glGenTextures(r0, r5, r10)     // Catch:{ all -> 0x0168 }
            r0 = r5[r10]     // Catch:{ all -> 0x0168 }
            goto L_0x0156
        L_0x0150:
            r0 = 6408(0x1908, float:8.98E-42)
            int r0 = com.ss.android.ugc.aweme.livewallpaper.b.i.a(r3, r2, r4, r0)     // Catch:{ all -> 0x0168 }
        L_0x0156:
            if (r0 <= 0) goto L_0x015c
            com.ss.android.ugc.aweme.livewallpaper.b.h r3 = com.ss.android.ugc.aweme.livewallpaper.b.s.a.a(r2, r4, r0, r8)     // Catch:{ all -> 0x0168 }
        L_0x015c:
            r0 = r3
        L_0x015d:
            if (r0 == 0) goto L_0x0164
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r2 = r8.g     // Catch:{ all -> 0x0168 }
            r2.add(r0)     // Catch:{ all -> 0x0168 }
        L_0x0164:
            r2 = r0
            r0 = 0
        L_0x0166:
            monitor-exit(r1)     // Catch:{ all -> 0x0168 }
            goto L_0x016c
        L_0x0168:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0168 }
            throw r0
        L_0x016b:
            r0 = 0
        L_0x016c:
            if (r0 == 0) goto L_0x0190
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r1 = r8.h
            monitor-enter(r1)
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r0 = r8.h     // Catch:{ InterruptedException -> 0x017b }
            r3 = 1000(0x3e8, double:4.94E-321)
            r0.wait(r3)     // Catch:{ InterruptedException -> 0x017b }
            goto L_0x017b
        L_0x0179:
            r0 = move-exception
            goto L_0x018e
        L_0x017b:
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r0 = r8.h     // Catch:{ all -> 0x0179 }
            int r0 = r0.size()     // Catch:{ all -> 0x0179 }
            if (r0 <= 0) goto L_0x018c
            java.util.List<com.ss.android.ugc.aweme.livewallpaper.b.h> r0 = r8.h     // Catch:{ all -> 0x0179 }
            java.lang.Object r0 = r0.remove(r10)     // Catch:{ all -> 0x0179 }
            com.ss.android.ugc.aweme.livewallpaper.b.h r0 = (com.ss.android.ugc.aweme.livewallpaper.b.h) r0     // Catch:{ all -> 0x0179 }
            r2 = r0
        L_0x018c:
            monitor-exit(r1)     // Catch:{ all -> 0x0179 }
            goto L_0x0190
        L_0x018e:
            monitor-exit(r1)     // Catch:{ all -> 0x0179 }
            throw r0
        L_0x0190:
            if (r2 == 0) goto L_0x0195
            r2.a()
        L_0x0195:
            return r2
        L_0x0196:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0196 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.livewallpaper.b.s.a(int):com.ss.android.ugc.aweme.livewallpaper.b.h");
    }

    public final void a(h hVar) {
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f53661a, false, 56208, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f53661a, false, 56208, new Class[]{h.class}, Void.TYPE);
            return;
        }
        synchronized (this.h) {
            this.h.add(hVar);
            this.h.notifyAll();
        }
    }

    public s(int i, int i2, int i3, boolean z) {
        this.f53662b = i2;
        this.f53663c = i3;
        this.f53665e = i;
        this.f53666f = false;
        this.g = new ArrayList();
        this.h = new ArrayList();
    }
}

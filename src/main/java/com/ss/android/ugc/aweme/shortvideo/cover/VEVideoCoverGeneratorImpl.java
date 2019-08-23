package com.ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.photomovie.edit.cover.b;
import com.ss.android.vesdk.p;

public class VEVideoCoverGeneratorImpl implements LifecycleObserver, b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3909a;

    /* renamed from: b  reason: collision with root package name */
    int f3910b;

    /* renamed from: c  reason: collision with root package name */
    p f3911c;

    /* renamed from: d  reason: collision with root package name */
    private String f3912d;

    /* renamed from: e  reason: collision with root package name */
    private int f3913e;

    /* renamed from: f  reason: collision with root package name */
    private int[] f3914f;
    private final String g = "VEVideoCoverGeneratorImpl";

    public final long b() {
        return (long) this.f3913e;
    }

    public final int a() {
        return this.f3910b;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3909a, false, 75384, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3909a, false, 75384, new Class[0], Void.TYPE);
            return;
        }
        this.f3911c.x();
    }

    private static int[] a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r15, int r16, @android.support.annotation.NonNull com.ss.android.ugc.aweme.photomovie.edit.cover.b.a r17) {
        /*
            r14 = this;
            r7 = r14
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r9 = 0
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r10 = 1
            r0[r10] = r1
            r11 = 2
            r0[r11] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.edit.cover.b$a> r1 = com.ss.android.ugc.aweme.photomovie.edit.cover.b.a.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 75379(0x12673, float:1.05628E-40)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r9] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r10] = r1
            r0[r11] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            r3 = 0
            r4 = 75379(0x12673, float:1.05628E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.edit.cover.b$a> r1 = com.ss.android.ugc.aweme.photomovie.edit.cover.b.a.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005d:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            r3 = 0
            r4 = 75382(0x12676, float:1.05633E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0081
            java.lang.Object[] r0 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            r3 = 0
            r4 = 75382(0x12676, float:1.05633E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x009b
        L_0x0081:
            int r0 = r7.f3913e
            if (r0 > 0) goto L_0x008d
            com.ss.android.vesdk.p r0 = r7.f3911c
            int r0 = r0.t()
            r7.f3913e = r0
        L_0x008d:
            int[] r0 = r7.f3914f
            if (r0 != 0) goto L_0x009b
            int r0 = r7.f3913e
            int r1 = r7.f3910b
            int[] r0 = a(r0, r1)
            r7.f3914f = r0
        L_0x009b:
            int[] r12 = r7.f3914f
            r13 = 4
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r9] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r11] = r1
            r0[r8] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            r3 = 0
            r4 = 75380(0x12674, float:1.0563E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<int[]> r1 = int[].class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.edit.cover.b$a> r1 = com.ss.android.ugc.aweme.photomovie.edit.cover.b.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0102
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r9] = r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            r0[r11] = r1
            r0[r8] = r17
            com.meituan.robust.ChangeQuickRedirect r2 = f3909a
            r3 = 0
            r4 = 75380(0x12674, float:1.0563E-40)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<int[]> r1 = int[].class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.photomovie.edit.cover.b$a> r1 = com.ss.android.ugc.aweme.photomovie.edit.cover.b.a.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r14
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0102:
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.cover.d r8 = new com.ss.android.ugc.aweme.shortvideo.cover.d
            r0 = r8
            r1 = r14
            r2 = r12
            r3 = r15
            r4 = r16
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            a.i.a((java.util.concurrent.Callable<TResult>) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl.a(int, int, com.ss.android.ugc.aweme.photomovie.edit.cover.b$a):void");
    }

    public VEVideoCoverGeneratorImpl(@NonNull p pVar, @NonNull LifecycleOwner lifecycleOwner, @NonNull String str, int i) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.f3911c = pVar;
        this.f3910b = i;
        this.f3912d = str;
    }
}

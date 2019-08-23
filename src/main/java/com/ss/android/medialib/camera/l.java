package com.ss.android.medialib.camera;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Build;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.common.a;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29613a;

    /* renamed from: b  reason: collision with root package name */
    public int f29614b;

    /* renamed from: c  reason: collision with root package name */
    public SurfaceTexture f29615c;

    /* renamed from: d  reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f29616d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f29617e = new float[16];

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29613a, false, 17043, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29613a, false, 17043, new Class[0], Void.TYPE);
            return;
        }
        this.f29615c.updateTexImage();
        this.f29615c.getTransformMatrix(this.f29617e);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29613a, false, 17042, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29613a, false, 17042, new Class[0], Void.TYPE);
            return;
        }
        if (this.f29615c != null) {
            this.f29615c.release();
            this.f29615c = null;
        }
        if (this.f29614b != 0) {
            int i = this.f29614b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, a.f29620a, true, 17065, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, a.f29620a, true, 17065, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
            this.f29614b = 0;
        }
    }

    public final void a() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f29613a, false, 17041, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29613a, false, 17041, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], null, a.f29620a, true, 17064, new Class[0], Integer.TYPE)) {
            i = ((Integer) PatchProxy.accessDispatch(new Object[0], null, a.f29620a, true, 17064, new Class[0], Integer.TYPE)).intValue();
        } else {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(36197, iArr[0]);
            if (PatchProxy.isSupport(new Object[]{36197, 9729, 33071}, null, a.f29620a, true, 17059, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{36197, 9729, 33071}, null, a.f29620a, true, 17059, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            } else {
                GLES20.glTexParameteri(36197, 10241, 9729);
                GLES20.glTexParameteri(36197, 10240, 9729);
                GLES20.glTexParameteri(36197, 10242, 33071);
                GLES20.glTexParameteri(36197, 10243, 33071);
            }
            i = iArr[0];
        }
        this.f29614b = i;
        this.f29615c = new com.ss.android.vesdk.c.a(this.f29614b);
        this.f29615c.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f29618a;

            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (PatchProxy.isSupport(new Object[]{surfaceTexture}, this, f29618a, false, 17045, new Class[]{SurfaceTexture.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{surfaceTexture}, this, f29618a, false, 17045, new Class[]{SurfaceTexture.class}, Void.TYPE);
                    return;
                }
                if (l.this.f29616d != null) {
                    l.this.f29616d.onFrameAvailable(surfaceTexture);
                }
            }
        });
    }

    public final double d() {
        long j;
        if (PatchProxy.isSupport(new Object[0], this, f29613a, false, 17044, new Class[0], Double.TYPE)) {
            return ((Double) PatchProxy.accessDispatch(new Object[0], this, f29613a, false, 17044, new Class[0], Double.TYPE)).doubleValue();
        } else if (this.f29615c == null) {
            return -1.0d;
        } else {
            long nanoTime = System.nanoTime();
            long abs = Math.abs(nanoTime - this.f29615c.getTimestamp());
            if (Build.VERSION.SDK_INT >= 17) {
                j = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f29615c.getTimestamp());
            } else {
                j = Long.MAX_VALUE;
            }
            double min = (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f29615c.getTimestamp())));
            Double.isNaN(min);
            return min / 1000000.0d;
        }
    }
}

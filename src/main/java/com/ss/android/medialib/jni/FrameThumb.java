package com.ss.android.medialib.jni;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

@Keep
public class FrameThumb {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long handle = nativeCreate();

    private native long nativeCreate();

    private native int[] nativeGetOldFrameThumbnail(long j, int i, int i2);

    private native int[] nativeInitVideoToGraph(long j, String str, int i, int i2, boolean z);

    private native int nativeStart(long j);

    private native void nativeStop(long j);

    private native void nativeStopGetFrameThumbnail(long j);

    private native int nativeUninitVideoToGraph(long j);

    static {
        b.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect     // Catch:{ all -> 0x0034 }
            r4 = 0
            r5 = 17455(0x442f, float:2.446E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0034 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0034 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0034 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0034 }
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect     // Catch:{ all -> 0x0034 }
            r5 = 0
            r6 = 17455(0x442f, float:2.446E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0034 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0034 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0034 }
            monitor-exit(r9)
            return
        L_0x0025:
            long r0 = r9.handle     // Catch:{ all -> 0x0034 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0032
            long r0 = r9.handle     // Catch:{ all -> 0x0034 }
            r9.nativeStop(r0)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r9)
            return
        L_0x0034:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.jni.FrameThumb.stop():void");
    }

    public void stopGetFrameThumbnail() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17453, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17453, new Class[0], Void.TYPE);
            return;
        }
        nativeStopGetFrameThumbnail(this.handle);
    }

    public synchronized int start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17454, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17454, new Class[0], Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            return nativeStart(this.handle);
        }
    }

    public int unInitVideoToGraph() {
        int nativeUninitVideoToGraph;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17450, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17450, new Class[0], Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            nativeStopGetFrameThumbnail(this.handle);
            synchronized (this) {
                nativeUninitVideoToGraph = nativeUninitVideoToGraph(this.handle);
                this.handle = 0;
            }
            return nativeUninitVideoToGraph;
        }
    }

    public int[] initVideoToGraph(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 17449, new Class[]{String.class}, int[].class)) {
            return initVideoToGraph(str2, -1, -1);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 17449, new Class[]{String.class}, int[].class);
    }

    public int[] getFrameThumbnail(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17452, new Class[]{Integer.TYPE}, int[].class)) {
            return getFrameThumbnail(i, 1);
        }
        return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17452, new Class[]{Integer.TYPE}, int[].class);
    }

    public synchronized int[] getFrameThumbnail(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17451, new Class[]{Integer.TYPE, Integer.TYPE}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17451, new Class[]{Integer.TYPE, Integer.TYPE}, int[].class);
        } else if (this.handle == 0) {
            return null;
        } else {
            return nativeGetOldFrameThumbnail(this.handle, i, i2);
        }
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2) {
        String str2 = str;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17447, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, int[].class)) {
                int[] iArr = (int[]) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17447, new Class[]{String.class, Integer.TYPE, Integer.TYPE}, int[].class);
                return iArr;
            }
            int i3 = i;
            int[] initVideoToGraph = initVideoToGraph(str, i, i2, false);
            return initVideoToGraph;
        }
    }

    public synchronized int[] initVideoToGraph(String str, int i, int i2, boolean z) {
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17448, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, int[].class)) {
                int[] iArr = (int[]) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, changeQuickRedirect, false, 17448, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, int[].class);
                return iArr;
            } else if (this.handle == 0) {
                int[] iArr2 = new int[9];
                iArr2[0] = -10000;
                return iArr2;
            } else {
                int[] nativeInitVideoToGraph = nativeInitVideoToGraph(this.handle, str, i, i2, z);
                return nativeInitVideoToGraph;
            }
        }
    }
}

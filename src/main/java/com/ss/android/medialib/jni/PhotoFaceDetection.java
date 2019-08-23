package com.ss.android.medialib.jni;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

@Keep
public class PhotoFaceDetection {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long handle = nativeCreate();
    private a listener;

    public interface a {
    }

    private native long nativeCreate();

    private native int nativeStartDetect(long j, String[] strArr, String str);

    private native void nativeStop(long j);

    static {
        b.a();
    }

    public synchronized void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17457, new Class[0], Void.TYPE);
        } else if (this.handle != 0) {
            nativeStop(this.handle);
            this.handle = 0;
        }
    }

    public void setListener(a aVar) {
        this.listener = aVar;
    }

    public int startDetect(@NonNull String[] strArr, @NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{strArr, str}, this, changeQuickRedirect, false, 17456, new Class[]{String[].class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{strArr, str}, this, changeQuickRedirect, false, 17456, new Class[]{String[].class, String.class}, Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            return nativeStartDetect(this.handle, strArr, str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImage(int[] r21, int r22, int r23, int r24) {
        /*
            r20 = this;
            r0 = r21
            r1 = 4
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)
            r10 = 1
            r2[r10] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r23)
            r11 = 2
            r2[r11] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r24)
            r12 = 3
            r2[r12] = r3
            com.meituan.robust.ChangeQuickRedirect r4 = changeQuickRedirect
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<int[]> r3 = int[].class
            r7[r9] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r11] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r7[r12] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 17458(0x4432, float:2.4464E-41)
            r3 = r20
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0076
            java.lang.Object[] r13 = new java.lang.Object[r1]
            r13[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            r13[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r23)
            r13[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r13[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r15 = changeQuickRedirect
            r16 = 0
            r17 = 17458(0x4432, float:2.4464E-41)
            java.lang.Class[] r0 = new java.lang.Class[r1]
            java.lang.Class<int[]> r1 = int[].class
            r0[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r12] = r1
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r20
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            return
        L_0x0076:
            r1 = r20
            com.ss.android.medialib.jni.PhotoFaceDetection$a r2 = r1.listener
            if (r2 == 0) goto L_0x0085
            com.ss.android.medialib.model.CoverInfo r2 = new com.ss.android.medialib.model.CoverInfo
            r3 = r22
            r4 = r23
            r2.<init>(r3, r4, r0)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.jni.PhotoFaceDetection.onImage(int[], int, int, int):void");
    }
}

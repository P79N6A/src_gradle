package com.ss.android.medialib.jni;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.medialib.player.EffectConfig;
import com.ss.android.ttve.nativePort.b;
import java.util.ArrayList;
import java.util.List;

@Keep
public class EffectThumb {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long handle = nativeCreate();
    private List<CoverInfo> mCovers = new ArrayList();
    private int mMaxSize;
    private float mSpeed;
    private long mTrimIn;
    private long mTrimOut;
    boolean stopped;
    private a thumbListener;

    public interface a {
    }

    private native long nativeCreate();

    private native long nativeGetDuration(long j);

    private native int nativeInit(long j, String str);

    private native int nativeRenderVideo(long j, long[] jArr, EffectConfig effectConfig, int i, int i2);

    private native void nativeStop(long j);

    @Deprecated
    public CoverInfo getThumb() {
        return null;
    }

    static {
        b.a();
    }

    public long getDuration() {
        return (long) (((float) (this.mTrimOut - this.mTrimIn)) / this.mSpeed);
    }

    public long getSourceVideoDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17441, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17441, new Class[0], Long.TYPE)).longValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            return nativeGetDuration(this.handle);
        }
    }

    public void stopRender() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17444, new Class[0], Void.TYPE);
        } else if (this.handle != 0) {
            this.stopped = true;
            nativeStop(this.handle);
            this.handle = 0;
        }
    }

    public void setThumbListener(a aVar) {
        this.thumbListener = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|14|(3:16|17|18)|19|20|(1:22)(2:33|24)) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0071, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061 A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0063 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.ss.android.medialib.model.CoverInfo getThumb(int r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r9 = 0
            r1[r9] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r6[r9] = r2
            java.lang.Class<com.ss.android.medialib.model.CoverInfo> r7 = com.ss.android.medialib.model.CoverInfo.class
            r4 = 0
            r5 = 17445(0x4425, float:2.4446E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x003b
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = changeQuickRedirect
            r4 = 0
            r5 = 17445(0x4425, float:2.4446E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class r0 = java.lang.Integer.TYPE
            r6[r9] = r0
            java.lang.Class<com.ss.android.medialib.model.CoverInfo> r7 = com.ss.android.medialib.model.CoverInfo.class
            r2 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.medialib.model.CoverInfo r0 = (com.ss.android.medialib.model.CoverInfo) r0
            return r0
        L_0x003b:
            r1 = 0
            if (r11 < 0) goto L_0x0077
            int r2 = r10.mMaxSize
            if (r11 >= r2) goto L_0x0077
            java.util.List<com.ss.android.medialib.model.CoverInfo> r2 = r10.mCovers
            if (r2 != 0) goto L_0x0047
            goto L_0x0077
        L_0x0047:
            boolean r2 = r10.stopped
            if (r2 != 0) goto L_0x0076
            monitor-enter(r10)
            java.util.List<com.ss.android.medialib.model.CoverInfo> r2 = r10.mCovers     // Catch:{ all -> 0x0073 }
            int r2 = r2.size()     // Catch:{ all -> 0x0073 }
            if (r2 > r11) goto L_0x0059
            r2 = 10
            r10.wait(r2)     // Catch:{ InterruptedException -> 0x0059 }
        L_0x0059:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r2 = r10.mCovers     // Catch:{ all -> 0x0073 }
            int r2 = r2.size()     // Catch:{ all -> 0x0073 }
            if (r2 > r11) goto L_0x0063
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            goto L_0x0047
        L_0x0063:
            java.util.List<com.ss.android.medialib.model.CoverInfo> r2 = r10.mCovers     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = r2.get(r11)     // Catch:{ all -> 0x0073 }
            com.ss.android.medialib.model.CoverInfo r2 = (com.ss.android.medialib.model.CoverInfo) r2     // Catch:{ all -> 0x0073 }
            java.util.List<com.ss.android.medialib.model.CoverInfo> r3 = r10.mCovers     // Catch:{ all -> 0x0073 }
            r3.set(r11, r1)     // Catch:{ all -> 0x0073 }
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            r1 = r2
            goto L_0x0076
        L_0x0073:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r0
        L_0x0076:
            return r1
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.jni.EffectThumb.getThumb(int):com.ss.android.medialib.model.CoverInfo");
    }

    public int init(@NonNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 17439, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 17439, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            int nativeInit = nativeInit(this.handle, str);
            if (nativeInit >= 0) {
                this.mTrimIn = 0;
                this.mTrimOut = getSourceVideoDuration();
                this.mSpeed = 1.0f;
            }
            return nativeInit;
        }
    }

    public void onThumb(int[] iArr, int i, int i2) {
        Object obj = iArr;
        if (PatchProxy.isSupport(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17446, new Class[]{int[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17446, new Class[]{int[].class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i3 = i;
        CoverInfo coverInfo = new CoverInfo(i, i2, iArr);
        synchronized (this) {
            if (!this.stopped) {
                this.mCovers.add(coverInfo);
                notify();
            }
        }
    }

    public int init(@NonNull String str, long j, long j2, float f2) {
        String str2 = str;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j3), new Long(j4), Float.valueOf(f2)}, this, changeQuickRedirect, false, 17440, new Class[]{String.class, Long.TYPE, Long.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, new Long(j3), new Long(j4), Float.valueOf(f2)}, this, changeQuickRedirect, false, 17440, new Class[]{String.class, Long.TYPE, Long.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            int nativeInit = nativeInit(this.handle, str2);
            if (nativeInit >= 0) {
                this.mTrimIn = j3;
                this.mTrimOut = j4;
                this.mSpeed = f2;
            }
            return nativeInit;
        }
    }

    public int renderVideo(long j, EffectConfig effectConfig, int i, int i2) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), effectConfig, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17443, new Class[]{Long.TYPE, EffectConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2), effectConfig, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17443, new Class[]{Long.TYPE, EffectConfig.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.handle == 0) {
            return -1;
        } else {
            this.mMaxSize = 1;
            long j3 = ((long) (((float) j2) * this.mSpeed)) + this.mTrimIn;
            return nativeRenderVideo(this.handle, new long[]{j3}, effectConfig, i, i2);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int renderVideo(@android.support.annotation.NonNull long[] r15, com.ss.android.medialib.player.EffectConfig r16, int r17, int r18) {
        /*
            r14 = this;
            r7 = r14
            r8 = r15
            r9 = 4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            r11 = 1
            r0[r11] = r16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r12 = 2
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r13 = 3
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<long[]> r1 = long[].class
            r5[r10] = r1
            java.lang.Class<com.ss.android.medialib.player.EffectConfig> r1 = com.ss.android.medialib.player.EffectConfig.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r3 = 0
            r4 = 17442(0x4422, float:2.4441E-41)
            r1 = r14
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            r0[r11] = r16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)
            r0[r12] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r18)
            r0[r13] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = changeQuickRedirect
            r3 = 0
            r4 = 17442(0x4422, float:2.4441E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<long[]> r1 = long[].class
            r5[r10] = r1
            java.lang.Class<com.ss.android.medialib.player.EffectConfig> r1 = com.ss.android.medialib.player.EffectConfig.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r13] = r1
            java.lang.Class r6 = java.lang.Integer.TYPE
            r1 = r14
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0070:
            long r0 = r7.handle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x007a
            r0 = -1
            return r0
        L_0x007a:
            int r0 = r8.length
            r7.mMaxSize = r0
        L_0x007d:
            int r0 = r8.length
            if (r10 >= r0) goto L_0x0090
            r0 = r8[r10]
            float r0 = (float) r0
            float r1 = r7.mSpeed
            float r0 = r0 * r1
            long r0 = (long) r0
            long r2 = r7.mTrimIn
            long r0 = r0 + r2
            r8[r10] = r0
            int r10 = r10 + 1
            goto L_0x007d
        L_0x0090:
            long r1 = r7.handle
            r0 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            int r0 = r0.nativeRenderVideo(r1, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.medialib.jni.EffectThumb.renderVideo(long[], com.ss.android.medialib.player.EffectConfig, int, int):int");
    }
}

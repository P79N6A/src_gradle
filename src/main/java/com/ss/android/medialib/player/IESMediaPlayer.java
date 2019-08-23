package com.ss.android.medialib.player;

import android.content.Context;
import android.support.annotation.Keep;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f.d;
import com.ss.android.medialib.model.Point;
import com.ss.android.medialib.player.a;
import com.ss.android.ttve.nativePort.b;
import java.util.ArrayList;
import java.util.List;

@Keep
public class IESMediaPlayer {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Context context;
    private long mHandle = nativeCreatePlayer();
    private a.C0358a mInfoListener;

    private native long nativeCreatePlayer();

    private native long nativeCurrentPosition(long j);

    private native int nativeDeleteSeg(long j, int i);

    private native int nativeFillBackgroundColor(long j, int i);

    private native long nativeGetDuration(long j);

    private native long[] nativeGetDurations(long j);

    private native boolean nativeIsMultiSpeedSupported(long j, int i);

    private native boolean nativeIsPlaying(long j);

    private native boolean nativeIsSeeking(long j);

    private native int nativePause(long j);

    private native int nativePrepare(long j, String[] strArr, int i, int i2);

    private static native int nativeRegister();

    private native void nativeRelease(long j);

    private native int nativeResume(long j);

    private native int nativeSeek(long j, long j2, int i);

    private native int nativeSelect(long j, int i);

    private native void nativeSetBoundary(long j, int i, long j2, long j3);

    private native void nativeSetLoop(long j, boolean z);

    private native int nativeSetSegPoints(long j, int i, long[] jArr);

    private native int nativeSetSegRotation(long j, int i, int i2);

    private native void nativeSetSpeed(long j, int i, double d2);

    private native void nativeSetVolume(long j, double d2);

    private native int nativeStart(long j, Surface surface);

    private native void nativeStop(long j);

    public void onInfo(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17547, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17547, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        }
    }

    static {
        b.a();
        nativeRegister();
    }

    public long getCurrentPosition() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17543, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17543, new Class[0], Long.TYPE)).longValue();
        } else if (this.mHandle == 0) {
            return 0;
        } else {
            return nativeCurrentPosition(this.mHandle);
        }
    }

    public long getDuration() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17541, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17541, new Class[0], Long.TYPE)).longValue();
        } else if (this.mHandle == 0) {
            return 0;
        } else {
            return nativeGetDuration(this.mHandle);
        }
    }

    public boolean isPlaying() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17545, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17545, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mHandle == 0) {
            return false;
        } else {
            return nativeIsPlaying(this.mHandle);
        }
    }

    public boolean isSeeking() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17546, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17546, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mHandle == 0) {
            return false;
        } else {
            return nativeIsSeeking(this.mHandle);
        }
    }

    public int pause() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17523, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17523, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativePause(this.mHandle);
        }
    }

    public void release() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17525, new Class[0], Void.TYPE);
        } else if (this.mHandle != 0) {
            nativeRelease(this.mHandle);
            this.mHandle = 0;
        }
    }

    public int resume() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17522, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17522, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativeResume(this.mHandle);
        }
    }

    public void stop() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17524, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17524, new Class[0], Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            nativeStop(this.mHandle);
        }
    }

    public int unSelect() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17528, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17528, new Class[0], Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativeSelect(this.mHandle, -1);
        }
    }

    public List<Long> getDurations() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17542, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17542, new Class[0], List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (this.mHandle == 0) {
            return arrayList;
        }
        long[] nativeGetDurations = nativeGetDurations(this.mHandle);
        if (nativeGetDurations != null) {
            for (long valueOf : nativeGetDurations) {
                arrayList.add(Long.valueOf(valueOf));
            }
        }
        return arrayList;
    }

    public void setMessageListener(a.C0358a aVar) {
        this.mInfoListener = aVar;
    }

    public IESMediaPlayer(Context context2) {
        this.context = context2;
    }

    public int deleteSeg(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17544, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17544, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            if (i < 0) {
                return -2;
            }
            return nativeDeleteSeg(this.mHandle, i);
        }
    }

    public int fillBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17538, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17538, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativeFillBackgroundColor(this.mHandle, i);
        }
    }

    public boolean isSegMultiSpeedSupported(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17539, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17539, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (this.mHandle == 0) {
            return false;
        } else {
            return nativeIsMultiSpeedSupported(this.mHandle, i);
        }
    }

    public int prepare(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 17519, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 17519, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        return prepare((List<String>) arrayList);
    }

    public int seekLeft(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17530, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return seek(j2, -1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17530, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int seekRight(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17531, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return seek(j2, 1);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17531, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
    }

    public int select(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17527, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17527, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            if (i < 0) {
                return -2;
            }
            return nativeSelect(this.mHandle, i);
        }
    }

    public void setLoop(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 17526, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 17526, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            nativeSetLoop(this.mHandle, z);
        }
    }

    public void setSpeed(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 17535, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 17535, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        setSegSpeed(-1, d2);
    }

    public void setVolume(double d2) {
        if (PatchProxy.isSupport(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 17548, new Class[]{Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Double.valueOf(d2)}, this, changeQuickRedirect, false, 17548, new Class[]{Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            nativeSetVolume(this.mHandle, d2);
        }
    }

    public int start(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, changeQuickRedirect, false, 17521, new Class[]{Surface.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{surface}, this, changeQuickRedirect, false, 17521, new Class[]{Surface.class}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativeStart(this.mHandle, surface);
        }
    }

    public int prepare(List<String> list) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{list}, this, changeQuickRedirect, false, 17520, new Class[]{List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list}, this, changeQuickRedirect, false, 17520, new Class[]{List.class}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            if (list == null || list.isEmpty()) {
                return -2;
            }
            if (this.context != null) {
                Pair<Integer, Integer> a2 = d.a(this.context);
                int intValue = ((Integer) a2.first).intValue();
                i = ((Integer) a2.second).intValue();
                i2 = intValue;
            } else {
                i2 = 0;
                i = 0;
            }
            return nativePrepare(this.mHandle, (String[]) list.toArray(new String[list.size()]), i2, i);
        }
    }

    public int seek(long j) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17529, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return seek(j2, 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, changeQuickRedirect, false, 17529, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
    }

    private int seek(long j, int i) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 17532, new Class[]{Long.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j), Integer.valueOf(i)}, this, changeQuickRedirect, false, 17532, new Class[]{Long.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            return nativeSeek(this.mHandle, j, i);
        }
    }

    public void setBoundary(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 17533, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 17533, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            nativeSetBoundary(this.mHandle, -1, j, j2);
        }
    }

    public void setSegRotation(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17537, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 17537, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i >= 0 && this.mHandle != 0) {
            nativeSetSegRotation(this.mHandle, i, i2);
        }
    }

    public void setSegSpeed(int i, double d2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 17536, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Double.valueOf(d2)}, this, changeQuickRedirect, false, 17536, new Class[]{Integer.TYPE, Double.TYPE}, Void.TYPE);
            return;
        }
        if (this.mHandle != 0) {
            nativeSetSpeed(this.mHandle, i, d2);
        }
    }

    public int setSegPoints(int i, List<Point> list) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), list}, this, changeQuickRedirect, false, 17540, new Class[]{Integer.TYPE, List.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), list}, this, changeQuickRedirect, false, 17540, new Class[]{Integer.TYPE, List.class}, Integer.TYPE)).intValue();
        } else if (this.mHandle == 0) {
            return -1;
        } else {
            if (list == null || list.isEmpty()) {
                return -2;
            }
            long[] jArr = new long[list.size()];
            int size = list.size();
            for (int i2 = 0; i2 < size; i2 += 2) {
                Point point = list.get(i2);
                if (point == null) {
                    jArr[i2] = -1;
                    jArr[i2 + 1] = -1;
                } else {
                    jArr[i2] = point.getLeft();
                    jArr[i2 + 1] = point.getRight();
                }
            }
            return nativeSetSegPoints(this.mHandle, i, jArr);
        }
    }

    public void setSegBoundary(int i, long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 17534, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4)}, this, changeQuickRedirect, false, 17534, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (i >= 0 && this.mHandle != 0) {
            nativeSetBoundary(this.mHandle, i, j, j2);
        }
    }
}

package com.ss.android.medialib.photomovie;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.model.CoverInfo;
import com.ss.android.ttve.nativePort.b;

@Keep
public class MovieCover {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long mHandle;

    private native long nativeCreate(int i, int i2, int i3);

    private native void nativeDestroy(long j);

    private native CoverInfo nativeGetCover(long j, String[] strArr, String str, String str2, float f2, int i, long j2, int i2, int i3);

    static {
        b.a();
    }

    public MovieCover() {
        this(new a(1, 2500, 500));
    }

    public void destroy() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 17477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 17477, new Class[0], Void.TYPE);
            return;
        }
        nativeDestroy(this.mHandle);
        this.mHandle = 0;
    }

    public MovieCover(a aVar) {
        this.mHandle = nativeCreate(aVar.f29718a, aVar.f29719b, aVar.f29720c);
    }

    public CoverInfo getCover(String[] strArr, String str, int i, long j, int i2, int i3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{strArr, str, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 17474, new Class[]{String[].class, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class)) {
            return (CoverInfo) PatchProxy.accessDispatch(new Object[]{strArr, str, Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 17474, new Class[]{String[].class, String.class, Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class);
        }
        return nativeGetCover(this.mHandle, strArr, str, null, 1.0f, i, j, i2, i3);
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f2, int i, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{strArr, str, str2, Float.valueOf(f2), Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 17475, new Class[]{String[].class, String.class, String.class, Float.TYPE, Integer.TYPE, Long.TYPE}, CoverInfo.class)) {
            return (CoverInfo) PatchProxy.accessDispatch(new Object[]{strArr, str, str2, Float.valueOf(f2), Integer.valueOf(i), new Long(j2)}, this, changeQuickRedirect, false, 17475, new Class[]{String[].class, String.class, String.class, Float.TYPE, Integer.TYPE, Long.TYPE}, CoverInfo.class);
        }
        return nativeGetCover(this.mHandle, strArr, str, str2, f2, i, j, 720, 1280);
    }

    public CoverInfo getCover(String[] strArr, String str, String str2, float f2, int i, long j, int i2, int i3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{strArr, str, str2, Float.valueOf(f2), Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 17476, new Class[]{String[].class, String.class, String.class, Float.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class)) {
            return (CoverInfo) PatchProxy.accessDispatch(new Object[]{strArr, str, str2, Float.valueOf(f2), Integer.valueOf(i), new Long(j2), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 17476, new Class[]{String[].class, String.class, String.class, Float.TYPE, Integer.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE}, CoverInfo.class);
        }
        return nativeGetCover(this.mHandle, strArr, str, str2, f2, i, j, i2, i3);
    }
}

package com.ss.android.medialib.photomovie;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.f.d;
import com.ss.android.ttve.nativePort.b;
import java.util.List;

public class PhotoMoviePlayer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29715a;

    /* renamed from: b  reason: collision with root package name */
    public long f29716b = nativeCreatePlayer();

    /* renamed from: c  reason: collision with root package name */
    private Context f29717c;

    private native long nativeCreatePlayer();

    private native long nativeGetDuration(long j);

    private native int nativePause(long j);

    private native void nativePlayCover(long j, int i, int i2);

    private native int nativePrepare(long j, String[] strArr, String str, int i, int i2, int i3, int i4, int i5);

    private static native int nativeRegister();

    private native void nativeRelease(long j);

    private native int nativeReset(long j);

    private native void nativeSeekTo(long j, long j2);

    private native void nativeSetLoop(long j, boolean z);

    private native void nativeSetOrientation(long j, int i);

    private native int nativeStart(long j, Surface surface, int i, int i2);

    private native void nativeStop(long j);

    private native void nativeSwitchPlayMode(long j, int i);

    public native void nativeOnSizeChanged(long j, int i, int i2);

    public native int nativeResume(long j);

    public native void nativeSetFilter(long j, String str, String str2, float f2);

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f29715a, false, 17502, new Class[]{String.class}, Void.TYPE)) {
            Object[] objArr = {str};
            PatchProxy.accessDispatch(objArr, this, f29715a, false, 17502, new Class[]{String.class}, Void.TYPE);
            return;
        }
        nativeSetFilter(this.f29716b, str, null, 1.0f);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f29715a, false, 17511, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f29715a, false, 17511, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        nativeSetLoop(this.f29716b, true);
    }

    static {
        b.a();
        nativeRegister();
    }

    public final int a() {
        if (!PatchProxy.isSupport(new Object[0], this, f29715a, false, 17508, new Class[0], Integer.TYPE)) {
            return nativePause(this.f29716b);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f29715a, false, 17508, new Class[0], Integer.TYPE)).intValue();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f29715a, false, 17509, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29715a, false, 17509, new Class[0], Void.TYPE);
            return;
        }
        nativeStop(this.f29716b);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f29715a, false, 17510, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f29715a, false, 17510, new Class[0], Void.TYPE);
            return;
        }
        b();
        nativeRelease(this.f29716b);
        this.f29716b = 0;
    }

    public final long d() {
        if (!PatchProxy.isSupport(new Object[0], this, f29715a, false, 17516, new Class[0], Long.TYPE)) {
            return nativeGetDuration(this.f29716b);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f29715a, false, 17516, new Class[0], Long.TYPE)).longValue();
    }

    public PhotoMoviePlayer(Context context) {
        this.f29717c = context;
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29715a, false, 17513, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29715a, false, 17513, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSwitchPlayMode(this.f29716b, i);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f29715a, false, 17512, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f29715a, false, 17512, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        nativeSetOrientation(this.f29716b, i);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f29715a, false, 17514, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f29715a, false, 17514, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        nativeSeekTo(this.f29716b, j);
    }

    public final int a(List<String> list, String str) {
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, str}, this, f29715a, false, 17499, new Class[]{List.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, str}, this, f29715a, false, 17499, new Class[]{List.class, String.class}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{list2, str, null}, this, f29715a, false, 17501, new Class[]{List.class, String.class, a.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, str, null}, this, f29715a, false, 17501, new Class[]{List.class, String.class, a.class}, Integer.TYPE)).intValue();
        }
        String[] strArr = new String[list.size()];
        list2.toArray(strArr);
        a aVar = new a();
        aVar.f29718a = 1;
        aVar.f29719b = 2500;
        aVar.f29720c = 500;
        Pair a2 = d.a(this.f29717c);
        return nativePrepare(this.f29716b, strArr, str, ((Integer) a2.first).intValue(), ((Integer) a2.second).intValue(), aVar.f29718a, aVar.f29719b, aVar.f29720c);
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f29715a, false, 17515, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f29715a, false, 17515, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        nativePlayCover(this.f29716b, i, i2);
    }

    public final int a(Surface surface, int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{surface, Integer.valueOf(i), Integer.valueOf(i2)}, this, f29715a, false, 17504, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            Object[] objArr = {surface, Integer.valueOf(i), Integer.valueOf(i2)};
            return ((Integer) PatchProxy.accessDispatch(objArr, this, f29715a, false, 17504, new Class[]{Surface.class, Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        return nativeStart(this.f29716b, surface, i, i2);
    }
}

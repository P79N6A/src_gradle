package com.ss.android.medialib.NativePort;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ttve.nativePort.b;

public class NativeRenderWrapper {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29324a;

    /* renamed from: b  reason: collision with root package name */
    public long f29325b;

    private native int nativeSetFilter(long j, String str, float f2);

    private native int nativeSetFilter2(long j, String str, String str2, float f2, float f3);

    public native long nativeCreate();

    public native void nativeDestroy(long j);

    public native int nativeInit(long j, int i, int i2, String str);

    public native int nativeProcessTexture(long j, int i, int i2, double d2);

    static {
        b.a();
    }

    public final boolean a() {
        if (this.f29325b != 0) {
            return true;
        }
        return false;
    }

    public final void a(String str, String str2, float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f29324a, false, 16584, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Float.valueOf(f2), Float.valueOf(f3)}, this, f29324a, false, 16584, new Class[]{String.class, String.class, Float.TYPE, Float.TYPE}, Void.TYPE);
        } else if (this.f29325b != 0) {
            nativeSetFilter2(this.f29325b, str, str2, f2, f3);
        }
    }
}

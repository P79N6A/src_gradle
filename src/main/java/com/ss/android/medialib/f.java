package com.ss.android.medialib;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Deprecated
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29650a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f29651c = "f";

    /* renamed from: d  reason: collision with root package name */
    private static volatile f f29652d;

    /* renamed from: b  reason: collision with root package name */
    public FaceBeautyInvoker f29653b;

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f29650a, false, 16426, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f29650a, false, 16426, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.f29653b != null) {
            this.f29653b.updateReactionBGAlpha(f2);
        }
    }

    public final int a(String str, String str2, String str3, String str4) {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4}, this, f29650a, false, 16471, new Class[]{String.class, String.class, String.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4}, this, f29650a, false, 16471, new Class[]{String.class, String.class, String.class, String.class}, Integer.TYPE)).intValue();
        } else if (this.f29653b == null) {
            return -1;
        } else {
            return this.f29653b.concat(str, str2, 0, str3, str4, false);
        }
    }

    public static f a() {
        if (PatchProxy.isSupport(new Object[0], null, f29650a, true, 16409, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], null, f29650a, true, 16409, new Class[0], f.class);
        }
        synchronized (f.class) {
            if (f29652d == null) {
                synchronized (f.class) {
                    if (f29652d == null) {
                        f29652d = new f();
                    }
                }
            }
        }
        return f29652d;
    }

    public final int a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(6.0f)}, this, f29650a, false, 16498, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(6.0f)}, this, f29650a, false, 16498, new Class[]{Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f29653b == null) {
            return -1;
        } else {
            return this.f29653b.slamProcessRotationEvent(f2, 6.0f);
        }
    }

    public final int a(String str, float f2, float f3) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Float.valueOf(0.2f), Float.valueOf(0.2f)}, this, f29650a, false, 16455, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2, Float.valueOf(0.2f), Float.valueOf(0.2f)}, this, f29650a, false, 16455, new Class[]{String.class, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f29653b == null) {
            return -1;
        } else {
            return this.f29653b.setReshape(str, 0.2f, 0.2f);
        }
    }

    public final int a(int i, float f2, float f3, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f29650a, false, 16495, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i2)}, this, f29650a, false, 16495, new Class[]{Integer.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f29653b == null) {
            return -1;
        } else {
            int i3 = i;
            float f4 = f2;
            return this.f29653b.slamProcessTouchEventByType(i, f2, f3, i2);
        }
    }

    public final int a(float f2, float f3, float f4, float f5, float f6) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(1.0f)}, this, f29650a, false, 16496, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5), Float.valueOf(1.0f)}, this, f29650a, false, 16496, new Class[]{Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE}, Integer.TYPE)).intValue();
        } else if (this.f29653b == null) {
            return -1;
        } else {
            return this.f29653b.slamProcessPanEvent(f2, f3, f4, f5, 1.0f);
        }
    }
}

package com.ss.android.ugc.aweme.shortvideo.e;

import android.hardware.Camera;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.property.e;

public class d implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66815a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f66816b = -1;

    public e.a b() {
        return e.a.CameraPosition;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f66815a, false, 75287, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f66815a, false, 75287, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (a() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private int d() {
        if (PatchProxy.isSupport(new Object[0], this, f66815a, false, 75285, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66815a, false, 75285, new Class[0], Integer.TYPE)).intValue();
        }
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                for (int i = 0; i < numberOfCameras; i++) {
                    Camera.getCameraInfo(i, cameraInfo);
                    if (cameraInfo.facing == 1) {
                        return 1;
                    }
                }
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f66815a, false, 75284, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66815a, false, 75284, new Class[0], Integer.TYPE)).intValue();
        } else if (a.L.f(b())) {
            return a.L.b(b());
        } else {
            if (f66816b == -1) {
                f66816b = d();
            }
            if (f66816b == -1) {
                return 0;
            }
            return f66816b;
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f66815a, false, 75286, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f66815a, false, 75286, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a.L.a(b(), i);
    }
}

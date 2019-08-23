package com.ss.android.ttvecamera.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b;
import com.ss.android.ttvecamera.b.e;
import com.ss.android.ttvecamera.f.c;
import java.util.ArrayList;

@TargetApi(21)
public class d extends b {

    /* renamed from: c  reason: collision with root package name */
    private static final String f31327c = "d";

    public int f() throws Exception {
        c cVar = this.g.n;
        if (this.f31317b == null || cVar == null) {
            ad.b(f31327c, "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        this.n = this.f31317b.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        this.n.addTarget(cVar.b());
        this.f31317b.createCaptureSession(arrayList, this.r, this.j);
        return 0;
    }

    public final int h() {
        if (this.n == null || this.q == null) {
            return -112;
        }
        this.n.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 3);
        this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
        this.m = this.n.build();
        try {
            this.q.setRepeatingRequest(this.m, this.s, this.j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    public final void b(int i) {
        if (this.n == null || this.q == null) {
            String str = f31327c;
            ad.d(str, "switchFlashMode: " + "Capture Session is null");
            return;
        }
        if (i == 0) {
            this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.n.set(CaptureRequest.FLASH_MODE, 0);
        } else if (i != 2) {
            String str2 = f31327c;
            ad.c(str2, "Video Mode not support this mode : " + i);
            return;
        } else {
            this.n.set(CaptureRequest.CONTROL_AE_MODE, 1);
            this.n.set(CaptureRequest.FLASH_MODE, 2);
        }
        try {
            this.h.y = i;
            this.m = this.n.build();
            this.q.setRepeatingRequest(this.m, null, this.j);
        } catch (CameraAccessException unused) {
        }
    }

    public d(b bVar, Context context, CameraManager cameraManager, Handler handler) {
        super(bVar, context, cameraManager, handler);
        this.p = new e(this);
    }
}

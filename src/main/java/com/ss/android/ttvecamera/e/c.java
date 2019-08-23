package com.ss.android.ttvecamera.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.ss.android.ttvecamera.a.d;
import com.ss.android.ttvecamera.ad;
import com.ss.android.ttvecamera.b;
import java.util.ArrayList;

@TargetApi(21)
public final class c extends d {
    public final int f() throws Exception {
        com.ss.android.ttvecamera.f.c cVar = this.g.n;
        if (this.f31317b == null || cVar == null) {
            ad.b("TEOppoVideoMode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        this.n = this.f31317b.createCaptureRequest(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        if (this.h.w) {
            ((a) this.g).f(arrayList.size());
        }
        this.n.addTarget(cVar.b());
        this.f31317b.createCaptureSession(arrayList, this.r, this.j);
        return 0;
    }

    public c(b bVar, Context context, CameraManager cameraManager, Handler handler) {
        super(bVar, context, cameraManager, handler);
    }
}

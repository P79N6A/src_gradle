package com.ss.android.ttvecamera.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.support.annotation.NonNull;
import com.ss.android.ttvecamera.a.c;
import com.ss.android.ttvecamera.ad;
import java.util.ArrayList;

@TargetApi(21)
public final class b extends c {
    public final int f() throws Exception {
        g();
        com.ss.android.ttvecamera.f.c cVar = this.g.n;
        if (this.f31317b == null || cVar == null) {
            ad.b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int j = super.j();
        if (j != 0) {
            return j;
        }
        a(this.h.k.f31335a, this.h.k.f31336b);
        this.n = this.f31317b.createCaptureRequest(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.b());
        arrayList.add(this.f31319d.getSurface());
        if (this.h.w) {
            ((a) this.g).f(arrayList.size());
        }
        this.n.addTarget(cVar.b());
        this.n.set(CaptureRequest.CONTROL_AF_MODE, 4);
        this.f31317b.createCaptureSession(arrayList, this.r, this.j);
        return 0;
    }

    public b(@NonNull com.ss.android.ttvecamera.b bVar, @NonNull Context context, @NonNull CameraManager cameraManager, Handler handler) {
        super(bVar, context, cameraManager, handler);
    }
}

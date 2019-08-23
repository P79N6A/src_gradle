package com.ss.android.ttvecamera.f;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.Surface;
import com.ss.android.ttvecamera.aa;
import com.ss.android.ttvecamera.ac;
import com.ss.android.ttvecamera.e;
import com.ss.android.ttvecamera.f.c;
import java.util.List;

public final class e extends b {

    /* renamed from: a  reason: collision with root package name */
    SurfaceTexture f31444a;
    Surface g;
    float[] h = new float[16];
    int i;

    public final int c() {
        return 1;
    }

    public final Surface a() {
        return this.g;
    }

    public final SurfaceTexture b() {
        return this.f31444a;
    }

    public final void d() {
        super.d();
        if (this.g != null) {
            this.g.release();
            this.g = null;
        }
    }

    @RequiresApi(api = 21)
    public final int a(@NonNull StreamConfigurationMap streamConfigurationMap, ac acVar) {
        return a(a(streamConfigurationMap.getOutputSizes(SurfaceTexture.class)), acVar);
    }

    public e(c.a aVar, com.ss.android.ttvecamera.c cVar) {
        super(aVar, cVar);
        this.f31444a = aVar.f31439d;
        this.i = aVar.f31440e;
        this.g = new Surface(this.f31444a);
    }

    @RequiresApi(api = 15)
    public final int a(List<ac> list, ac acVar) {
        if (list != null && list.size() > 0) {
            this.f31430d = aa.a(list, acVar, this.f31430d);
        }
        this.f31444a.setDefaultBufferSize(this.f31430d.f31335a, this.f31430d.f31336b);
        AnonymousClass1 r2 = new SurfaceTexture.OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (e.this.f31431e != null) {
                    surfaceTexture.getTransformMatrix(e.this.h);
                    com.ss.android.ttvecamera.e eVar = new com.ss.android.ttvecamera.e(e.this.f31430d.f31335a, e.this.f31430d.f31336b, surfaceTexture.getTimestamp());
                    e.c cVar = new e.c(eVar.f31399a, eVar.f31400b, eVar.f31401c, e.this.i, e.this.f31431e.m(), e.this.h, e.this.f31429c, e.this.f31431e.o);
                    eVar.f31402d = cVar;
                    e.this.a(eVar);
                }
            }
        };
        if (Build.VERSION.SDK_INT >= 21) {
            this.f31444a.setOnFrameAvailableListener(r2, this.f31431e.k);
        } else {
            this.f31444a.setOnFrameAvailableListener(r2);
        }
        return 0;
    }
}

package com.ss.android.ttvecamera;

import com.ss.android.ttvecamera.TECameraSettings;

public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31501a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31502b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31503c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31504d;

    /* renamed from: e  reason: collision with root package name */
    private final TECameraSettings.e f31505e;

    y(f fVar, d dVar, int i, int i2, TECameraSettings.e eVar) {
        this.f31501a = fVar;
        this.f31502b = dVar;
        this.f31503c = i;
        this.f31504d = i2;
        this.f31505e = eVar;
    }

    public final void run() {
        this.f31501a.lambda$takePicture$8$TECameraServer(this.f31502b, this.f31503c, this.f31504d, this.f31505e);
    }
}

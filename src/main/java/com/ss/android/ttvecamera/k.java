package com.ss.android.ttvecamera;

import com.ss.android.ttvecamera.TECameraSettings;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31465a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31466b;

    /* renamed from: c  reason: collision with root package name */
    private final float f31467c;

    /* renamed from: d  reason: collision with root package name */
    private final TECameraSettings.f f31468d;

    k(f fVar, d dVar, float f2, TECameraSettings.f fVar2) {
        this.f31465a = fVar;
        this.f31466b = dVar;
        this.f31467c = f2;
        this.f31468d = fVar2;
    }

    public final void run() {
        this.f31465a.lambda$startZoom$12$TECameraServer(this.f31466b, this.f31467c, this.f31468d);
    }
}

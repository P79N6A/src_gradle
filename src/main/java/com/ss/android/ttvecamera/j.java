package com.ss.android.ttvecamera;

import com.ss.android.ttvecamera.TECameraSettings;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31462a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31463b;

    /* renamed from: c  reason: collision with root package name */
    private final TECameraSettings.f f31464c;

    j(f fVar, d dVar, TECameraSettings.f fVar2) {
        this.f31462a = fVar;
        this.f31463b = dVar;
        this.f31464c = fVar2;
    }

    public final void run() {
        this.f31462a.lambda$queryZoomAbility$11$TECameraServer(this.f31463b, this.f31464c);
    }
}

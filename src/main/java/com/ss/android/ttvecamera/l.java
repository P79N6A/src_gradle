package com.ss.android.ttvecamera;

import com.ss.android.ttvecamera.TECameraSettings;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31469a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31470b;

    /* renamed from: c  reason: collision with root package name */
    private final TECameraSettings.f f31471c;

    l(f fVar, d dVar, TECameraSettings.f fVar2) {
        this.f31469a = fVar;
        this.f31470b = dVar;
        this.f31471c = fVar2;
    }

    public final void run() {
        this.f31469a.lambda$stopZoom$13$TECameraServer(this.f31470b, this.f31471c);
    }
}

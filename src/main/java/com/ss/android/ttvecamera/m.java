package com.ss.android.ttvecamera;

import com.ss.android.ttvecamera.TECameraSettings;

public final /* synthetic */ class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31472a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31473b;

    /* renamed from: c  reason: collision with root package name */
    private final TECameraSettings.c f31474c;

    m(f fVar, d dVar, TECameraSettings.c cVar) {
        this.f31472a = fVar;
        this.f31473b = dVar;
        this.f31474c = cVar;
    }

    public final void run() {
        this.f31472a.lambda$process$14$TECameraServer(this.f31473b, this.f31474c);
    }
}

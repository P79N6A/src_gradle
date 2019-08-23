package com.ss.android.ttvecamera;

public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31498a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31499b;

    /* renamed from: c  reason: collision with root package name */
    private final TECameraSettings f31500c;

    x(f fVar, d dVar, TECameraSettings tECameraSettings) {
        this.f31498a = fVar;
        this.f31499b = dVar;
        this.f31500c = tECameraSettings;
    }

    public final void run() {
        this.f31498a.lambda$switchCamera$7$TECameraServer(this.f31499b, this.f31500c);
    }
}

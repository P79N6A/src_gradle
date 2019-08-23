package com.ss.android.ttvecamera;

public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31446a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31447b;

    /* renamed from: c  reason: collision with root package name */
    private final TECameraSettings f31448c;

    /* renamed from: d  reason: collision with root package name */
    private final long f31449d;

    g(f fVar, d dVar, TECameraSettings tECameraSettings, long j) {
        this.f31446a = fVar;
        this.f31447b = dVar;
        this.f31448c = tECameraSettings;
        this.f31449d = j;
    }

    public final void run() {
        this.f31446a.lambda$open$0$TECameraServer(this.f31447b, this.f31448c, this.f31449d);
    }
}

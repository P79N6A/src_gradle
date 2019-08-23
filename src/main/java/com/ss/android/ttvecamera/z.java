package com.ss.android.ttvecamera;

public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final f f31506a;

    /* renamed from: b  reason: collision with root package name */
    private final d f31507b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31508c;

    /* renamed from: d  reason: collision with root package name */
    private final int f31509d;

    /* renamed from: e  reason: collision with root package name */
    private final float f31510e;

    /* renamed from: f  reason: collision with root package name */
    private final int f31511f;
    private final int g;

    z(f fVar, d dVar, int i, int i2, float f2, int i3, int i4) {
        this.f31506a = fVar;
        this.f31507b = dVar;
        this.f31508c = i;
        this.f31509d = i2;
        this.f31510e = f2;
        this.f31511f = i3;
        this.g = i4;
    }

    public final void run() {
        this.f31506a.lambda$focusAtPoint$9$TECameraServer(this.f31507b, this.f31508c, this.f31509d, this.f31510e, this.f31511f, this.g);
    }
}

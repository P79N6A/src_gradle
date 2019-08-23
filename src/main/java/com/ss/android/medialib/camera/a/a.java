package com.ss.android.medialib.camera.a;

import com.ss.android.medialib.camera.IESCameraInterface;
import com.ss.android.medialib.camera.a.b;
import com.ss.android.medialib.presenter.c;

public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    protected c f29470a;

    /* renamed from: b  reason: collision with root package name */
    protected IESCameraInterface f29471b;

    /* renamed from: c  reason: collision with root package name */
    protected b.a f29472c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f29473d;

    /* renamed from: e  reason: collision with root package name */
    protected Object f29474e = new Object();

    /* renamed from: f  reason: collision with root package name */
    protected int f29475f = 0;
    protected int g = -1;

    public final void a(b.a aVar) {
        this.f29472c = aVar;
    }

    public final void a(c cVar) {
        this.f29470a = cVar;
    }

    public a(IESCameraInterface iESCameraInterface) {
        this.f29471b = iESCameraInterface;
    }
}

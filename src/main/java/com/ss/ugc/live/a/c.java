package com.ss.ugc.live.a;

import android.content.Context;
import android.view.SurfaceView;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.filter.IFilterManager;
import com.ss.avframework.livestreamv2.filter.ITTVideoEffectProcessor;
import com.ss.render.EffectRender;
import com.ss.ugc.live.a.a.a;
import com.ss.ugc.live.a.e;
import javax.microedition.khronos.egl.EGLContext;

public final class c extends a implements ILiveStream.ILiveStreamErrorListener, ILiveStream.ITextureFrameAvailableListener, ITTVideoEffectProcessor.EffectMsgListener, ITTVideoEffectProcessor.FaceDetectListener {

    /* renamed from: d  reason: collision with root package name */
    private com.ss.ugc.live.a.a.c f78598d;

    /* renamed from: e  reason: collision with root package name */
    private Context f78599e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f78600f;
    private com.ss.ugc.live.c.a.c g;

    public final int a(int i) {
        return 0;
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
        this.g.i();
    }

    public final void d() {
        this.g.j();
    }

    public final void e() {
        this.g.k();
    }

    public final int f() {
        return this.g.g().startEffectAudio();
    }

    public final int g() {
        return this.g.g().stopEffectAudio();
    }

    public final void a(a aVar) {
        aVar.a(this.f78599e, this.f78598d);
    }

    public final void onFaceDetectResultCallback(int i) {
        if (this.f78585b != null) {
            for (int size = this.f78585b.size() - 1; size >= 0; size--) {
                ((EffectRender.OnRefreshFaceDataListener) this.f78585b.get(size)).onRefreshFaceData(i);
            }
        }
    }

    public final void a(e.a aVar) {
        this.f78600f = aVar;
    }

    public c(SurfaceView surfaceView, com.ss.ugc.live.c.a.c cVar) {
        this.g = cVar;
        this.f78599e = surfaceView.getContext();
        this.g.a(surfaceView);
        this.g.a((ILiveStream.ITextureFrameAvailableListener) this);
        cVar.j = this;
        IFilterManager g2 = this.g.g();
        g2.enable(true);
        g2.setFaceDetectListener(this);
        g2.setEffectMsgListener(this);
        this.f78598d = new g(g2);
        this.g.h();
    }

    public final void onError(int i, int i2, Exception exc) {
        if (this.f78600f != null) {
            this.f78600f.a(i, i2, null);
        }
    }

    public final int a(int i, int i2, int i3, String str) {
        return this.g.g().sendEffectMsg(i, i2, i3, str);
    }

    public final void onMessage(int i, int i2, int i3, String str) {
        if (i == 2139095041) {
            if (this.f78600f != null) {
                this.f78600f.b(1, i2, str);
            }
        } else if (this.f78586c != null) {
            this.f78586c.a(i, i2, i3, str);
        }
    }

    public final void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr) {
        synchronized (this) {
            if (this.f78584a != null) {
                for (i a2 : this.f78584a) {
                    a2.a(eGLContext, i, 0, i2, i3, j / 1000000, null);
                }
            }
        }
    }
}

package com.ss.ugc.live.c.a;

import android.view.SurfaceView;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.livestreamv2.filter.IFilterManager;

public final class c extends b {
    public ILiveStream.ILiveStreamInfoListener i;
    public ILiveStream.ILiveStreamErrorListener j;
    private boolean k;

    public final IFilterManager g() {
        return this.f78715d.getVideoFilterMgr();
    }

    public final void h() {
        this.f78715d.startVideoCapture();
    }

    public final void i() {
        this.f78715d.stopVideoCapture();
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.f78715d.startAudioCapture();
        this.f78715d.enableMixer(true, true);
    }

    public final void k() {
        this.k = !this.k;
        this.f78715d.enableMirror(this.k, true);
    }

    public final void a() {
        if (this.h != 2) {
            this.h = 0;
        }
        this.f78715d.stop();
        this.f78715d.stopAudioCapture();
        this.f78715d.enableMixer(true, false);
    }

    public final void j() {
        int i2 = 1;
        if (((LiveStream) this.f78715d).getLiveStreamBuilder().getVideoCaptureDevice() == 1) {
            i2 = 2;
        }
        this.f78715d.switchVideoCapture(i2);
    }

    /* access modifiers changed from: protected */
    public final LiveStreamBuilder f() {
        LiveStreamBuilder f2 = super.f();
        f2.setAssetManager(this.f78712a.E).setEffectModePath(this.f78712a.G).setEffectResourceFinder(this.f78712a.F).setVideoCaptureWidth(this.f78712a.h).setVideoCaptureHeight(this.f78712a.i);
        return f2;
    }

    public c(e eVar) {
        super(eVar);
    }

    public final void a(ILiveStream.ITextureFrameAvailableListener iTextureFrameAvailableListener) {
        this.f78715d.setTextureFrameAvailableListener(iTextureFrameAvailableListener);
    }

    public final void a(SurfaceView surfaceView) {
        this.f78715d.setRenderSink(new RenderView(surfaceView));
    }

    public final void onError(int i2, int i3, Exception exc) {
        super.onError(i2, i3, exc);
        if (this.j != null) {
            this.j.onError(i2, i3, exc);
        }
    }

    public final void onInfo(int i2, int i3, int i4) {
        super.onInfo(i2, i3, i4);
        if (this.i != null) {
            this.i.onInfo(i2, i3, i4);
        }
    }
}

package com.ss.android.ad.splash.core.video2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Surface;
import com.ss.android.ad.splash.utils.l;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.VideoEngineListener;
import com.ss.ttvideoengine.VideoInfoListener;
import com.ss.ttvideoengine.model.VideoModel;
import com.ss.ttvideoengine.utils.Error;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.Iterator;

public final class a implements e, g, l.a, VideoEngineListener, VideoInfoListener {

    /* renamed from: a  reason: collision with root package name */
    protected Context f27802a;

    /* renamed from: b  reason: collision with root package name */
    protected f f27803b;

    /* renamed from: c  reason: collision with root package name */
    protected TTVideoEngine f27804c;

    /* renamed from: d  reason: collision with root package name */
    protected l f27805d = new l(this);

    /* renamed from: e  reason: collision with root package name */
    private b f27806e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27807f;
    private ArrayList<Runnable> g = new ArrayList<>();
    private boolean h;
    private boolean i = false;

    public final void a(Message message) {
    }

    public final void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i2) {
    }

    public final boolean onFetchedVideoInfo(VideoModel videoModel) {
        return false;
    }

    public final void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i2) {
    }

    public final void onPrepare(TTVideoEngine tTVideoEngine) {
    }

    public final void onPrepared(TTVideoEngine tTVideoEngine) {
    }

    public final void onRenderStart(TTVideoEngine tTVideoEngine) {
    }

    public final void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i2, int i3) {
    }

    private int g() {
        if (this.f27804c != null) {
            return this.f27804c.getDuration();
        }
        return 0;
    }

    public final int c() {
        if (this.f27804c != null) {
            return this.f27804c.getCurrentPlaybackTime();
        }
        return 0;
    }

    public final void d() {
        if (this.f27804c != null && b()) {
            this.f27804c.pause();
        }
    }

    public final void e() {
        if (this.f27804c != null) {
            this.f27804c.release();
            this.f27804c = null;
        }
    }

    public final void f() {
        try {
            this.f27804c.setLooping(false);
            this.f27804c.play();
        } catch (Exception unused) {
        }
    }

    public final void a() {
        if (this.f27804c != null && !this.i) {
            this.f27804c.stop();
            this.i = true;
            this.f27806e.a(c(), g());
        }
    }

    public final boolean b() {
        if (this.f27804c == null || this.f27804c.getPlaybackState() != 1) {
            return false;
        }
        return true;
    }

    private void h() {
        if (!this.h && !this.g.isEmpty()) {
            this.h = true;
            Iterator it2 = new ArrayList(this.g).iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
            this.g.clear();
            this.h = false;
        }
    }

    public final void a(b bVar) {
        this.f27806e = bVar;
    }

    public final void onCompletion(TTVideoEngine tTVideoEngine) {
        if (this.f27806e != null) {
            this.f27806e.a(g());
        }
    }

    public final void onError(Error error) {
        if (this.f27806e != null) {
            this.f27806e.b();
        }
    }

    public final void onVideoStatusException(int i2) {
        if (this.f27806e != null) {
            this.f27806e.b();
        }
    }

    public a(f fVar) {
        if (fVar != null) {
            TTVideoEngineLog.turnOn(1, 1);
            this.f27803b = fVar;
            this.f27803b.setVideoViewCallback(this);
            this.f27802a = this.f27803b.getApplicationContext();
            return;
        }
        throw new IllegalArgumentException("IBDASplashVideoView can not be null");
    }

    public final void a(SurfaceTexture surfaceTexture) {
        this.f27807f = true;
        Surface surface = this.f27803b.getSurface();
        if (surface == null) {
            surface = new Surface(surfaceTexture);
        }
        if (this.f27804c != null) {
            this.f27804c.setSurface(surface);
            h();
        }
    }

    public final void a(boolean z) {
        if (this.f27804c != null) {
            this.f27804c.setIsMute(z);
        }
    }

    public final boolean a(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f27804c != null) {
            this.f27804c.release();
        }
        this.f27804c = new TTVideoEngine(this.f27802a, 0);
        this.f27804c.setListener(this);
        this.f27804c.setVideoInfoListener(this);
        this.f27804c.setIntOption(4, 2);
        this.f27804c.setLocalURL(str);
        this.f27804c.setStartTime(0);
        Surface surface = this.f27803b.getSurface();
        if (surface == null || !surface.isValid()) {
            this.f27803b.setSurfaceViewVisibility(8);
            this.f27803b.setSurfaceViewVisibility(0);
            AnonymousClass1 r5 = new Runnable() {
                public final void run() {
                    a.this.f();
                }
            };
            if (this.f27807f) {
                r5.run();
            } else {
                this.g.add(r5);
            }
        } else {
            this.f27804c.setSurface(surface);
            f();
        }
        this.i = false;
        return true;
    }

    public final void a(float f2, float f3) {
        if (this.f27804c != null) {
            this.f27804c.setVolume(f2, f3);
        }
    }

    public final void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i2) {
        if (i2 == 1 && this.f27806e != null) {
            this.f27806e.a();
        }
    }
}

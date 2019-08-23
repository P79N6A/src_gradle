package com.ss.android.ad.splash.core.video.a;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.lang.ref.WeakReference;

public final class b extends a {
    public final MediaPlayer g;
    private final a h;
    private MediaDataSource i;
    private final Object j = new Object();
    private boolean k;

    class a implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<b> f27749a;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27744b != null) {
                    bVar.f27744b.d();
                }
            }
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27743a != null) {
                    bVar.f27743a.e();
                }
            }
        }

        public final void onSeekComplete(MediaPlayer mediaPlayer) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27746d != null) {
                    bVar.f27746d.f();
                }
            }
        }

        public a(b bVar) {
            this.f27749a = new WeakReference<>(bVar);
        }

        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27745c != null) {
                    bVar.f27745c.a(bVar, i);
                }
            }
        }

        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            if (((b) this.f27749a.get()) != null) {
            }
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27747e != null) {
                    bVar.f27747e.a(i, i2);
                }
            }
            return false;
        }

        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (((b) this.f27749a.get()) != null) {
                b bVar = b.this;
                if (bVar.f27748f != null) {
                    bVar.f27748f.a(bVar, i, i2);
                }
            }
            return false;
        }
    }

    public final void b() throws IllegalStateException {
        this.g.start();
    }

    public final void c() throws IllegalStateException {
        this.g.stop();
    }

    public final void d() throws IllegalStateException {
        this.g.pause();
    }

    private void i() {
        if (this.i != null) {
            try {
                this.i.close();
            } catch (IOException unused) {
            }
            this.i = null;
        }
    }

    public final long e() {
        try {
            return (long) this.g.getCurrentPosition();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    public final long f() {
        try {
            return (long) this.g.getDuration();
        } catch (IllegalStateException unused) {
            return 0;
        }
    }

    public final void h() {
        try {
            this.g.reset();
        } catch (IllegalStateException unused) {
        }
        i();
        a();
        j();
    }

    public final void g() {
        this.k = true;
        this.g.release();
        i();
        a();
        j();
    }

    public b() {
        synchronized (this.j) {
            this.g = new MediaPlayer();
        }
        this.g.setAudioStreamType(3);
        this.h = new a(this);
        j();
    }

    private void j() {
        this.g.setOnPreparedListener(this.h);
        this.g.setOnBufferingUpdateListener(this.h);
        this.g.setOnCompletionListener(this.h);
        this.g.setOnSeekCompleteListener(this.h);
        this.g.setOnVideoSizeChangedListener(this.h);
        this.g.setOnErrorListener(this.h);
        this.g.setOnInfoListener(this.h);
    }

    public final void a(long j2) throws IllegalStateException {
        this.g.seekTo((int) j2);
    }

    public final void b(boolean z) {
        this.g.setLooping(z);
    }

    @TargetApi(14)
    public final void a(Surface surface) {
        this.g.setSurface(surface);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        synchronized (this.j) {
            if (!this.k) {
                this.g.setDisplay(surfaceHolder);
            }
        }
    }

    public final void a(String str) throws IOException, IllegalArgumentException, SecurityException, IllegalStateException {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equalsIgnoreCase("file")) {
            this.g.setDataSource(str);
        } else {
            this.g.setDataSource(parse.getPath());
        }
    }

    public final void a(boolean z) {
        this.g.setScreenOnWhilePlaying(true);
    }

    public final void a(float f2, float f3) {
        this.g.setVolume(f2, f3);
    }

    public final void a(Context context, int i2) {
        this.g.setWakeMode(context, 10);
    }
}

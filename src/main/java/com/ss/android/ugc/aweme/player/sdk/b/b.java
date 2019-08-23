package com.ss.android.ugc.aweme.player.sdk.b;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.android.ugc.playerkit.a.a;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f59120b;

    /* renamed from: c  reason: collision with root package name */
    public IPlayer.c f59121c = new IPlayer.a();

    /* renamed from: d  reason: collision with root package name */
    public long f59122d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f59123e;

    /* renamed from: f  reason: collision with root package name */
    long f59124f = 0;
    private Context g;
    private boolean h;
    private IjkMediaPlayer i;
    private String j;

    public final void a(IPlayer.b bVar) {
    }

    public final void a(d dVar) {
    }

    public final void a(a aVar) {
    }

    public final void a(String str, com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
    }

    public final void b(Surface surface) {
    }

    public final boolean h() {
        return false;
    }

    public final boolean j() {
        return true;
    }

    public final String o() {
        return "";
    }

    public final boolean f() {
        return this.h;
    }

    public final boolean g() {
        return this.h;
    }

    public final String n() {
        return this.j;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f59120b, false, 64237, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f59120b, false, 64237, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.i.setLooping(true);
    }

    public final void a(String str, Map<String, Object> map) throws IOException {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f59120b, false, 64239, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f59120b, false, 64239, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        if (str == null || str.startsWith("http")) {
            str2 = "ijkhttphook:" + str;
            this.i.setDataSource(this.g, Uri.parse(str2));
        } else {
            this.i.setDataSource(str);
            str2 = str;
        }
        if (map.get("init_start_time_ms") != null) {
            this.i.setOption(4, "seek-at-start", (long) ((Integer) map.get("init_start_time_ms")).intValue());
        }
        this.j = str2;
        this.i.prepareAsync();
    }

    public final void a(IPlayer.c cVar) {
        IPlayer.a aVar;
        b bVar;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f59120b, false, 64242, new Class[]{IPlayer.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f59120b, false, 64242, new Class[]{IPlayer.c.class}, Void.TYPE);
            return;
        }
        if (cVar == null) {
            aVar = new IPlayer.a();
            bVar = this;
        } else {
            bVar = this;
            aVar = cVar;
        }
        bVar.f59121c = aVar;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64234, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64234, new Class[0], Void.TYPE);
            return;
        }
        this.i.start();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64231, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64231, new Class[0], Void.TYPE);
            return;
        }
        this.i.pause();
        this.f59123e = false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64230, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64230, new Class[0], Void.TYPE);
            return;
        }
        this.i.stop();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64232, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64232, new Class[0], Void.TYPE);
            return;
        }
        this.i.release();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64233, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64233, new Class[0], Void.TYPE);
            return;
        }
        this.i.reset();
    }

    public final boolean k() {
        if (!PatchProxy.isSupport(new Object[0], this, f59120b, false, 64236, new Class[0], Boolean.TYPE)) {
            return this.i.isPlaying();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64236, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final long l() {
        if (!PatchProxy.isSupport(new Object[0], this, f59120b, false, 64228, new Class[0], Long.TYPE)) {
            return this.i.getCurrentPosition();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64228, new Class[0], Long.TYPE)).longValue();
    }

    public final long m() {
        if (!PatchProxy.isSupport(new Object[0], this, f59120b, false, 64229, new Class[0], Long.TYPE)) {
            return this.i.getDuration();
        }
        return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64229, new Class[0], Long.TYPE)).longValue();
    }

    public final IPlayer.e p() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64247, new Class[0], IPlayer.e.class)) {
            return (IPlayer.e) PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64247, new Class[0], IPlayer.e.class);
        }
        IPlayer.e eVar = new IPlayer.e();
        eVar.f59118b = this.i.getMediaMeta();
        return eVar;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64243, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64243, new Class[0], Void.TYPE);
            return;
        }
        this.i.setOption(4, "fast_prepared", 1);
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64244, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64244, new Class[0], Void.TYPE);
        } else {
            if (this.h) {
                this.i.setOption(4, "mediacodec", 1);
            }
            this.i.setOption(4, "start-on-prepared", 0);
        }
        this.i.setOption(4, "enable-accurate-seek", 1);
        this.i.setOption(4, "framedrop", 1);
        this.i.setOption(4, "async-init-decoder", 1);
        this.i.setOption(4, "video-mime-type", "video/avc");
        this.i.setOption(4, "mediacodec-default-name", IjkMediaPlayer.DefaultMediaCodecSelector.getCachedMediaCodec());
        if (f() && this.f59123e && this.f59124f >= 0) {
            this.i.setOption(4, "seek-at-start", this.f59124f);
        }
        this.i.setOption(1, "reconnect", 1);
        if (Build.VERSION.SDK_INT >= 26) {
            this.i.setOption(4, "overlay-format", 844318047);
        }
    }

    public final boolean b(boolean z) {
        return this.h;
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59120b, false, 64238, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59120b, false, 64238, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            IjkMediaPlayer ijkMediaPlayer = this.i;
            double d2 = (double) f2;
            Double.isNaN(d2);
            double duration = (double) this.i.getDuration();
            Double.isNaN(duration);
            ijkMediaPlayer.seekTo((long) (d2 * 0.01d * duration));
        }
    }

    public final float a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59120b, false, 64245, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59120b, false, 64245, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        float f2 = -1.0f;
        if (this.i == null) {
            return -1.0f;
        }
        switch (i2) {
            case 0:
                f2 = (float) this.i.getCurrentPosition();
                break;
            case 1:
                f2 = (float) this.i.getDuration();
                break;
            case 2:
                f2 = this.i.getVideoOutputFramesPerSecond();
                break;
            case 3:
                f2 = this.i.getVideoDecodeFramesPerSecond();
                break;
            case 4:
                f2 = (float) this.i.getVideoCachedDuration();
                break;
            case 5:
                f2 = (float) this.i.getAudioCachedDuration();
                break;
            case 6:
                f2 = (float) this.i.getVideoCachedBytes();
                break;
            case e.l:
                f2 = (float) this.i.getAudioCachedBytes();
                break;
            case 8:
                f2 = (float) this.i.getBitRate();
                break;
            case 10:
                Bundle mediaMeta = this.i.getMediaMeta();
                if (mediaMeta.containsKey("fps_num") && mediaMeta.containsKey("fps_den")) {
                    f2 = ((Float) mediaMeta.get("fps_num")).floatValue() / ((Float) mediaMeta.get("fps_den")).floatValue();
                    break;
                }
        }
        return f2;
    }

    public final int b(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59120b, false, 64241, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59120b, false, 64241, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f59120b, true, 64240, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f59120b, true, 64240, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (i3 == 3) {
            return 3;
        } else {
            switch (i3) {
                case 701:
                    return 701;
                case 702:
                    return 702;
                default:
                    throw new IllegalArgumentException("code not supported");
            }
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f59120b, false, 64235, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f59120b, false, 64235, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (f()) {
            this.f59123e = true;
            this.f59124f = j2;
        }
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f59120b, false, 64226, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f59120b, false, 64226, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.i.setSurface(surface2);
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59120b, false, 64227, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59120b, false, 64227, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        this.i.setVolume(f2, f3);
    }

    public b(Context context, boolean z, final com.ss.android.ugc.playerkit.a.b bVar) {
        this.f59119a.f59113a = 3;
        this.g = context;
        this.h = z;
        IjkMediaPlayer.loadLibrariesOnce(new IjkLibLoader() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59125a;

            public final void loadLibrary(String str) throws UnsatisfiedLinkError, SecurityException {
                if (PatchProxy.isSupport(new Object[]{str}, this, f59125a, false, 64248, new Class[]{String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str}, this, f59125a, false, 64248, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (bVar != null) {
                    bVar.a(str);
                }
            }
        });
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");
        this.i = new IjkMediaPlayer();
        IjkMediaPlayer.native_setLogLevel(6);
        if (PatchProxy.isSupport(new Object[0], this, f59120b, false, 64225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59120b, false, 64225, new Class[0], Void.TYPE);
            return;
        }
        this.i.setOnInfoListener(new IMediaPlayer.OnInfoListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59128a;

            public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                int i3 = i;
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59128a, false, 64249, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59128a, false, 64249, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                }
                if (i3 == b.this.b(3)) {
                    if (b.this.f59123e) {
                        return false;
                    }
                    b.this.f59121c.b();
                } else if (i3 == b.this.b(701)) {
                    b.this.f59121c.a(true);
                } else if (i3 == b.this.b(702)) {
                    b.this.f59121c.a(false);
                } else if (i3 == 222) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - b.this.f59122d;
                    b.this.f59122d = elapsedRealtime;
                    if (b.this.m() == 0) {
                        b.this.f59121c.a(-10000, -3000, 2);
                    } else if (j < 1000) {
                        b.this.f59121c.a(-10000, -1000, 2);
                    } else {
                        b.this.f59121c.c();
                    }
                }
                return false;
            }
        });
        this.i.setOnPreparedListener(new IMediaPlayer.OnPreparedListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59130a;

            public final void onPrepared(IMediaPlayer iMediaPlayer) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer}, this, f59130a, false, 64250, new Class[]{IMediaPlayer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer}, this, f59130a, false, 64250, new Class[]{IMediaPlayer.class}, Void.TYPE);
                    return;
                }
                b.this.f59121c.a();
            }
        });
        this.i.setOnErrorListener(new IMediaPlayer.OnErrorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59132a;

            public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59132a, false, 64251, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{iMediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f59132a, false, 64251, new Class[]{IMediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
                }
                b.this.f59121c.a(i, i2, null);
                return true;
            }
        });
        this.i.setOnCompletionListener(new IMediaPlayer.OnCompletionListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59134a;

            public final void onCompletion(IMediaPlayer iMediaPlayer) {
                if (PatchProxy.isSupport(new Object[]{iMediaPlayer}, this, f59134a, false, 64252, new Class[]{IMediaPlayer.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{iMediaPlayer}, this, f59134a, false, 64252, new Class[]{IMediaPlayer.class}, Void.TYPE);
                    return;
                }
                b.this.f59121c.c();
            }
        });
    }
}

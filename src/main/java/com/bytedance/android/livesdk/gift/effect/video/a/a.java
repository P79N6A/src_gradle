package com.bytedance.android.livesdk.gift.effect.video.a;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttm.player.MediaPlayer;
import com.ss.ttm.player.TTPlayerConfiger;
import java.io.IOException;

public class a extends com.ss.android.ugc.aweme.live.alphaplayer.b.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14970a = null;
    private static final String k = "a";

    /* renamed from: b  reason: collision with root package name */
    MediaPlayer f14971b;

    /* renamed from: c  reason: collision with root package name */
    MediaPlayer.OnPreparedListener f14972c = new MediaPlayer.OnPreparedListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14975a;

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f14975a, false, 9642, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f14975a, false, 9642, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            if (a.this.i != null) {
                a.this.i.a(a.this.f53228f);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    MediaPlayer.OnErrorListener f14973d = new MediaPlayer.OnErrorListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14977a;

        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14977a, false, 9643, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{mediaPlayer, Integer.valueOf(i), Integer.valueOf(i2)}, this, f14977a, false, 9643, new Class[]{MediaPlayer.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
            }
            if (a.this.j != null) {
                int i3 = i;
                int i4 = i2;
                a.this.j.a(a.this.f53228f, i, i2, "TTMediaPlayer on error");
            }
            return false;
        }
    };

    /* renamed from: e  reason: collision with root package name */
    MediaPlayer.OnCompletionListener f14974e = new MediaPlayer.OnCompletionListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14979a;

        public final void onCompletion(MediaPlayer mediaPlayer) {
            if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f14979a, false, 9644, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f14979a, false, 9644, new Class[]{MediaPlayer.class}, Void.TYPE);
                return;
            }
            if (a.this.h != null) {
                a.this.h.a(a.this.f53228f);
            }
        }
    };
    private final Context l;

    /* access modifiers changed from: package-private */
    public MediaPlayer a() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9630, new Class[0], MediaPlayer.class)) {
            return (MediaPlayer) PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9630, new Class[0], MediaPlayer.class);
        }
        TTPlayerConfiger.setValue(2, false);
        TTPlayerConfiger.setValue(1, true);
        TTPlayerConfiger.setValue(11, true);
        return d.a(this.l);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9633, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.f14971b.prepareAsync();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9634, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9634, new Class[0], Void.TYPE);
            return;
        }
        this.f14971b.start();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9635, new Class[0], Void.TYPE);
            return;
        }
        this.f14971b.pause();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9636, new Class[0], Void.TYPE);
            return;
        }
        this.f14971b.stop();
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9637, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9637, new Class[0], Void.TYPE);
            return;
        }
        this.f14971b.reset();
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f14970a, false, 9638, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9638, new Class[0], Void.TYPE);
            return;
        }
        this.f14971b.release();
    }

    public final com.ss.android.ugc.aweme.live.alphaplayer.a.a h() throws Exception {
        if (!PatchProxy.isSupport(new Object[0], this, f14970a, false, 9641, new Class[0], com.ss.android.ugc.aweme.live.alphaplayer.a.a.class)) {
            return new com.ss.android.ugc.aweme.live.alphaplayer.a.a(this.f14971b.getVideoWidth(), this.f14971b.getVideoHeight());
        }
        return (com.ss.android.ugc.aweme.live.alphaplayer.a.a) PatchProxy.accessDispatch(new Object[0], this, f14970a, false, 9641, new Class[0], com.ss.android.ugc.aweme.live.alphaplayer.a.a.class);
    }

    public a(Context context) {
        super(context);
        this.l = context;
    }

    public final void a(Surface surface) {
        Surface surface2 = surface;
        if (PatchProxy.isSupport(new Object[]{surface2}, this, f14970a, false, 9631, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface2}, this, f14970a, false, 9631, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        this.f14971b.setSurface(surface2);
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14970a, false, 9640, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14970a, false, 9640, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.b(z);
        this.f14971b.setScreenOnWhilePlaying(true);
    }

    public final void a(String str) throws IOException {
        if (PatchProxy.isSupport(new Object[]{str}, this, f14970a, false, 9632, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f14970a, false, 9632, new Class[]{String.class}, Void.TYPE);
            return;
        }
        super.a(str);
        if (this.f14971b.isPlaying()) {
            this.f14971b.stop();
        }
        this.f14971b.reset();
        this.f14971b.setDataSource(this.l, Uri.parse(str));
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 0}, this, f14970a, false, 9639, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 0}, this, f14970a, false, 9639, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f14971b.setLooping(false);
    }
}

package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.util.c;

public class RepeatMusicPlayer implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3927a;

    /* renamed from: b  reason: collision with root package name */
    public MediaPlayer f3928b;

    /* renamed from: c  reason: collision with root package name */
    public int f3929c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f3930d = new Handler(Looper.getMainLooper());

    /* renamed from: e  reason: collision with root package name */
    public Runnable f3931e = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66654a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f66654a, false, 76134, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f66654a, false, 76134, new Class[0], Void.TYPE);
                return;
            }
            if (RepeatMusicPlayer.this.f3928b != null && RepeatMusicPlayer.this.f3928b.isPlaying()) {
                int currentPosition = RepeatMusicPlayer.this.f3928b.getCurrentPosition();
                if (currentPosition <= RepeatMusicPlayer.this.f3928b.getDuration()) {
                    if (RepeatMusicPlayer.this.f3932f != null) {
                        RepeatMusicPlayer.this.f3932f.a(currentPosition);
                    }
                    RepeatMusicPlayer.this.f3930d.post(RepeatMusicPlayer.this.f3931e);
                }
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public a f3932f;
    private int g;
    private Runnable h;
    private Handler i = new Handler(Looper.getMainLooper());

    public interface a {
        void a(int i);
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3927a, false, 76133, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3927a, false, 76133, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeCallbacksAndMessages(null);
        this.f3930d.removeCallbacksAndMessages(null);
        a();
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void pause() {
        if (PatchProxy.isSupport(new Object[0], this, f3927a, false, 76132, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3927a, false, 76132, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3928b != null && this.f3928b.isPlaying()) {
            this.f3928b.pause();
        }
        this.f3930d.removeCallbacksAndMessages(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3927a, false, 76131, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3927a, false, 76131, new Class[0], Void.TYPE);
            return;
        }
        c.a("stopMusic() called");
        if (this.f3928b != null) {
            if (this.f3928b.isPlaying()) {
                this.f3928b.pause();
            }
            this.f3928b.stop();
            this.f3928b.release();
            this.f3928b = null;
        }
        this.f3930d.removeCallbacksAndMessages(null);
    }

    private Runnable b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3927a, false, 76128, new Class[]{Integer.TYPE}, Runnable.class)) {
            return (Runnable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3927a, false, 76128, new Class[]{Integer.TYPE}, Runnable.class);
        }
        final int i3 = i2;
        return new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66656a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f66656a, false, 76135, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f66656a, false, 76135, new Class[0], Void.TYPE);
                } else if (RepeatMusicPlayer.this.f3928b != null) {
                    if (RepeatMusicPlayer.this.f3928b.isPlaying()) {
                        RepeatMusicPlayer.this.f3928b.pause();
                    }
                    RepeatMusicPlayer.this.a(i3);
                }
            }
        };
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3927a, false, 76130, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3927a, false, 76130, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f3929c = i2;
        c.a("playMusic() called");
        if (this.f3928b != null) {
            if (this.f3928b.isPlaying()) {
                this.f3928b.pause();
            }
            if (this.h != null) {
                this.i.removeCallbacks(this.h);
            }
            this.h = b(i2);
            this.f3928b.seekTo(i2);
            this.i.postDelayed(this.h, (long) this.g);
            this.f3928b.start();
            if (this.f3931e != null) {
                this.f3930d.removeCallbacks(this.f3931e);
            }
            this.f3930d.post(this.f3931e);
        }
    }

    public RepeatMusicPlayer(@NonNull AmeActivity ameActivity, @NonNull String str, int i2) {
        AmeActivity ameActivity2 = ameActivity;
        this.g = i2;
        ameActivity.getLifecycle().addObserver(this);
        Uri parse = Uri.parse(str);
        if (PatchProxy.isSupport(new Object[]{ameActivity2, parse}, this, f3927a, false, 76129, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{ameActivity2, parse}, this, f3927a, false, 76129, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        this.f3928b = MediaPlayer.create(ameActivity, parse);
        if (this.f3928b != null) {
            this.f3928b.setAudioStreamType(3);
            this.f3928b.setDisplay(null);
            this.f3928b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f66659a;

                public final void onCompletion(MediaPlayer mediaPlayer) {
                    if (PatchProxy.isSupport(new Object[]{mediaPlayer}, this, f66659a, false, 76136, new Class[]{MediaPlayer.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{mediaPlayer}, this, f66659a, false, 76136, new Class[]{MediaPlayer.class}, Void.TYPE);
                        return;
                    }
                    RepeatMusicPlayer.this.a(RepeatMusicPlayer.this.f3929c);
                }
            });
        }
    }
}

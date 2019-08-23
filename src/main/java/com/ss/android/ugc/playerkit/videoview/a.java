package com.ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<VideoViewComponent> f77748a;

    /* renamed from: b  reason: collision with root package name */
    private Set<LifecycleOwner> f77749b;

    /* renamed from: com.ss.android.ugc.playerkit.videoview.a$a  reason: collision with other inner class name */
    static final class C0824a {

        /* renamed from: a  reason: collision with root package name */
        static final a f77750a = new a((byte) 0);
    }

    public static a a() {
        return C0824a.f77750a;
    }

    private a() {
        this.f77748a = new WeakReference<>(null);
        this.f77749b = Collections.newSetFromMap(new WeakHashMap());
    }

    public final void P() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.P();
            }
        }
    }

    public final void Q() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.Q();
            }
        }
    }

    public final void R() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.R();
            }
        }
    }

    public final void S() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.S();
            }
        }
    }

    public final void T() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.T();
            }
        }
    }

    public final void U() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.U();
            }
        }
    }

    public final long V() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.V();
            }
        }
        return 0;
    }

    public final void W() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.W();
            }
        }
    }

    public final IPlayer.e X() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.X();
            }
        }
        return null;
    }

    public final void c() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.a();
            }
        }
    }

    public final long d() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.b();
            }
        }
        return 0;
    }

    public final boolean b() {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                return videoViewComponent.c();
            }
        }
        return false;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Video video) {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.a(video);
            }
        }
    }

    public final void b(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.b(aVar);
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.a(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(VideoViewComponent videoViewComponent) {
        VideoViewComponent videoViewComponent2 = (VideoViewComponent) this.f77748a.get();
        if (videoViewComponent2 != null) {
            for (LifecycleOwner next : this.f77749b) {
                if (next != null) {
                    next.getLifecycle().removeObserver(videoViewComponent2);
                }
            }
        }
        this.f77748a = new WeakReference<>(videoViewComponent);
    }

    public final void a(Video video, boolean z, int i) {
        if (this.f77748a != null) {
            VideoViewComponent videoViewComponent = (VideoViewComponent) this.f77748a.get();
            if (videoViewComponent != null) {
                videoViewComponent.a(video, z, i);
            }
        }
    }
}

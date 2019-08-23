package com.ss.android.ugc.aweme.story.player.view;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.graphics.SurfaceTexture;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.metrics.o;
import com.ss.android.ugc.aweme.story.player.c;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.e;

public class VideoPlayView implements LifecycleObserver, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4166a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f4167b;

    /* renamed from: c  reason: collision with root package name */
    public b f4168c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.story.player.a f4169d;

    /* renamed from: e  reason: collision with root package name */
    public View f4170e;

    /* renamed from: f  reason: collision with root package name */
    private KeepSurfaceTextureView f4171f;
    private final c g;
    private boolean h;
    private boolean i;
    private long j = -1;

    public final void a(float f2) {
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
    }

    public final void a(e eVar) {
    }

    public final void a(String str) {
    }

    public final void b(e eVar) {
    }

    public final void b(String str) {
    }

    public final void b(boolean z) {
    }

    public final void c(String str) {
    }

    public final void c(boolean z) {
    }

    public final void d(String str) {
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84881, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84881, new Class[0], Void.TYPE);
        } else if (this.f4168c != null) {
            this.g.e();
            this.g.g();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84874, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84874, new Class[0], Void.TYPE);
            return;
        }
        i();
        this.f4169d.f73260a = 2;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84875, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84875, new Class[0], Void.TYPE);
            return;
        }
        if (f()) {
            d();
            this.f4169d.f73260a = 1;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84870, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84870, new Class[0], Void.TYPE);
            return;
        }
        this.g.b((a) this);
        c cVar = this.g;
        if (cVar.f73263c == this.f4171f.getSurface()) {
            cVar.f73263c = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84867, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84867, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4167b != null && this.f4167b.getUserVisibleHint() && a()) {
            d();
        }
    }

    private boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84876, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84876, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f4171f != null && this.f4171f.f73271d && this.f4167b != null && this.f4167b.getUserVisibleHint() && g()) {
            z = true;
        }
        return z;
    }

    private boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84877, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84877, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4167b == null || this.f4167b.getActivity() == null) {
            return false;
        } else {
            Lifecycle lifecycle = this.f4167b.getActivity().getLifecycle();
            if (lifecycle == null || !lifecycle.getCurrentState().equals(Lifecycle.State.RESUMED)) {
                return false;
            }
            return true;
        }
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84880, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84880, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4167b == null || this.f4167b.getActivity() == null || !(this.f4167b.getActivity() instanceof StoryDetailActivity)) {
            return true;
        } else {
            return ((StoryDetailActivity) this.f4167b.getActivity()).c();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84879, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84879, new Class[0], Void.TYPE);
        } else if (this.f4168c != null && this.f4168c.getLifeStory() != null && this.f4168c.getLifeStory().getVideo() != null && h()) {
            Video video = this.f4168c.getLifeStory().getVideo();
            video.setRationAndSourceId(this.f4168c.getStoryId());
            this.g.f73263c = this.f4171f.getSurface();
            this.g.f();
            this.g.c(video);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84882, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84882, new Class[0], Void.TYPE);
        } else if (this.f4168c != null && this.f4168c.getLifeStory() != null && this.f4168c.getLifeStory().getVideo() != null && h()) {
            Video video = this.f4168c.getLifeStory().getVideo();
            if (this.f4171f.f73271d) {
                video.setRationAndSourceId(this.f4168c.getStoryId());
                this.g.f73263c = this.f4171f.getSurface();
                this.g.f();
                this.g.b(video);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84868, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84868, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4167b != null && this.f4167b.getUserVisibleHint() && a() && this.f4169d.f73260a == 1) {
            i();
        }
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84869, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84869, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f4167b != null && g.a(StoryChange.b(this.f4167b.getActivity()), this.f4168c)) {
            z = true;
        }
        return z;
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f4166a, false, 84884, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f4166a, false, 84884, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        if (f(aVar.f76010a) && this.f4170e != null) {
            this.f4170e.setVisibility(8);
        }
    }

    private boolean f(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f4166a, false, 84885, new Class[]{String.class}, Boolean.TYPE)) {
            return TextUtils.equals(str2, g.b(this.f4168c));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f4166a, false, 84885, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4166a, false, 84886, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f4166a, false, 84886, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (f(str)) {
            new o().a(this.i).a("homepage_story").b(com.ss.android.ugc.aweme.story.feed.c.e.b(this.f4167b.getActivity())).b(this.h).a(com.ss.android.ugc.aweme.story.metrics.a.a.a(StoryChange.a(this.f4167b.getActivity(), g.a(this.f4168c)))).a(this.f4168c).post();
        }
    }

    public VideoPlayView(Fragment fragment, KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f4167b = fragment;
        this.f4171f = keepSurfaceTextureView;
        this.f4167b.getLifecycle().addObserver(this);
        this.f4169d = new com.ss.android.ugc.aweme.story.player.a();
        this.g = c.d();
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84871, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84871, new Class[0], Void.TYPE);
        } else {
            this.f4171f.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73275a;

                public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                    return false;
                }

                public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                }

                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                }

                public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                    if (PatchProxy.isSupport(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73275a, false, 84887, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, f73275a, false, 84887, new Class[]{SurfaceTexture.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    if (VideoPlayView.this.f4168c != null && VideoPlayView.this.f4167b != null && VideoPlayView.this.f4167b.getUserVisibleHint() && VideoPlayView.this.a()) {
                        if (VideoPlayView.this.f4169d.f73260a == 0) {
                            VideoPlayView.this.e();
                            VideoPlayView.this.f4169d.f73260a = 1;
                            VideoPlayView.this.f4168c.setRead(true);
                            if (VideoPlayView.this.f4167b.getActivity() instanceof StoryDetailActivity) {
                                VideoPlayView.this.f4167b.getActivity();
                            }
                        } else if (VideoPlayView.this.f4169d.f73260a == 1) {
                            VideoPlayView.this.d();
                        }
                    }
                }
            });
        }
        this.g.a((a) this);
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4166a, false, 84872, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f4166a, false, 84872, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.h = z;
        this.i = z2;
        if (PatchProxy.isSupport(new Object[0], this, f4166a, false, 84873, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4166a, false, 84873, new Class[0], Void.TYPE);
            return;
        }
        if (f()) {
            e();
            this.f4169d.f73260a = 1;
        }
    }
}

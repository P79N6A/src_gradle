package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.support.v4.app.Fragment;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.detail.b.d;
import com.ss.android.ugc.aweme.story.detail.view.StoryDetailActivity;
import com.ss.android.ugc.aweme.story.feed.view.a;
import com.ss.android.ugc.aweme.story.feed.view.widget.VideoPlayWidget;
import com.ss.android.ugc.aweme.story.friends.a.e;
import com.ss.android.ugc.aweme.story.player.view.VideoPlayView;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.c;

public final class f extends a {
    public static ChangeQuickRedirect o;
    private VideoPlayWidget p;
    private boolean q;

    public final b j() {
        return this.f4141b;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84024, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84024, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        this.q = q();
        if (this.q) {
            this.p.a(this.h, this.g);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84026, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        if (this.n != null) {
            ((com.ss.android.ugc.aweme.sticker.a) this.n).f();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84033, new Class[0], Void.TYPE);
            return;
        }
        c.a().c(this);
    }

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, o, false, 84034, new Class[0], String.class)) {
            return this.f4141b.getStoryId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, o, false, 84034, new Class[0], String.class);
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84027, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.a(this.h, this.g);
        }
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84028, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84028, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.h();
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84029, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84029, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.g();
        }
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84030, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84030, new Class[0], Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.p.h();
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84031, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84031, new Class[0], Void.TYPE);
            return;
        }
        if (!com.ss.android.ugc.aweme.story.feed.a.c.f72456b && this.p != null) {
            this.p.g();
        }
    }

    private boolean q() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84025, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, o, false, 84025, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4144e == null || this.f4144e.getActivity() == null || !(this.f4144e.getActivity() instanceof StoryDetailActivity)) {
            return true;
        } else {
            return ((StoryDetailActivity) this.f4144e.getActivity()).c();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84021, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 84021, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.p = new VideoPlayWidget(this.f4144e);
        this.p.q = this.n;
        this.f4142c.b(C0906R.id.dt9, this.p);
    }

    public final View p() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 84032, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, o, false, 84032, new Class[0], View.class);
        } else if (this.p == null) {
            return null;
        } else {
            AnimatedImageView animatedImageView = this.p.m;
            if (animatedImageView == null || animatedImageView.getVisibility() != 0) {
                return this.p.l;
            }
            return animatedImageView;
        }
    }

    @Subscribe
    public final void onTransitionEnd(d dVar) {
        if (PatchProxy.isSupport(new Object[]{dVar}, this, o, false, 84023, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, o, false, 84023, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (c() && !this.q && this.p != null) {
            this.q = true;
            this.p.a(this.h, this.g);
        }
    }

    public final void a(b bVar) {
        UrlModel urlModel;
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, o, false, 84022, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, o, false, 84022, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        if (PatchProxy.isSupport(new Object[]{bVar2}, null, e.f73054a, true, 84638, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, null, e.f73054a, true, 84638, new Class[]{b.class}, Void.TYPE);
        } else {
            e.f73056c.a(bVar2);
        }
        this.f4141b = bVar2;
        this.p.s = b(bVar);
        VideoPlayWidget videoPlayWidget = this.p;
        b bVar3 = this.f4141b;
        if (PatchProxy.isSupport(new Object[]{bVar3}, videoPlayWidget, VideoPlayWidget.k, false, 84367, new Class[]{b.class}, Void.TYPE)) {
            VideoPlayWidget videoPlayWidget2 = videoPlayWidget;
            PatchProxy.accessDispatch(new Object[]{bVar3}, videoPlayWidget2, VideoPlayWidget.k, false, 84367, new Class[]{b.class}, Void.TYPE);
        } else if (bVar3 != null) {
            videoPlayWidget.o = bVar3;
            if (PatchProxy.isSupport(new Object[0], videoPlayWidget, VideoPlayWidget.k, false, 84364, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], videoPlayWidget, VideoPlayWidget.k, false, 84364, new Class[0], Void.TYPE);
            } else if (videoPlayWidget.i) {
                VideoPlayView videoPlayView = videoPlayWidget.n;
                if (videoPlayView != null) {
                    videoPlayView.f4168c = videoPlayWidget.o;
                    videoPlayView.f4169d.f73260a = 0;
                }
                AnimatedImageView animatedImageView = videoPlayWidget.m;
                if (animatedImageView != null) {
                    animatedImageView.setVisibility(0);
                }
                RemoteImageView remoteImageView = videoPlayWidget.m;
                b bVar4 = videoPlayWidget.o;
                if (bVar4 != null) {
                    LifeStory lifeStory = bVar4.getLifeStory();
                    if (lifeStory != null) {
                        Video video = lifeStory.getVideo();
                        if (video != null) {
                            urlModel = video.getOriginCover();
                            com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
                        }
                    }
                }
                urlModel = null;
                com.ss.android.ugc.aweme.base.c.b(remoteImageView, urlModel);
            }
            View view = videoPlayWidget.p;
            if (view != null) {
                view.addOnLayoutChangeListener(new VideoPlayWidget.a(videoPlayWidget));
            }
        }
        c.a().a((Object) this);
        if (g()) {
            d();
        }
    }

    public f(View view, Fragment fragment, StoryFeedPagerAdapter storyFeedPagerAdapter) {
        super(view, fragment, storyFeedPagerAdapter);
    }
}

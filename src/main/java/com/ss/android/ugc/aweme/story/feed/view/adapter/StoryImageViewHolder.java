package com.ss.android.ugc.aweme.story.feed.view.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.feed.c.d;
import com.ss.android.ugc.aweme.story.feed.c.e;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.a;
import com.ss.android.ugc.aweme.story.feed.viewmodel.StoryChange;
import com.ss.android.ugc.aweme.story.metrics.o;
import com.ss.android.ugc.aweme.story.player.c;
import java.util.ArrayList;

public class StoryImageViewHolder extends a implements LifecycleObserver {
    public static ChangeQuickRedirect o;
    public AnimatedImageView p;
    private ValueAnimator q;
    private View r;

    public final void k() {
    }

    public final b j() {
        return this.f4141b;
    }

    public final View p() {
        return this.p;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83915, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83915, new Class[0], Void.TYPE);
            return;
        }
        super.a();
        this.f4142c.a((int) C0906R.id.av6, this.n);
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83927, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83927, new Class[0], Void.TYPE);
            return;
        }
        super.d();
        if (this.q == null || this.q.getListeners() == null) {
            q();
        }
        r();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83928, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83928, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        this.q.cancel();
        if (this.n != null) {
            ((com.ss.android.ugc.aweme.sticker.a) this.n).f();
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83933, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83933, new Class[0], Void.TYPE);
            return;
        }
        this.q.removeAllListeners();
        this.q.removeAllUpdateListeners();
        this.q.cancel();
    }

    public final String i() {
        if (!PatchProxy.isSupport(new Object[0], this, o, false, 83935, new Class[0], String.class)) {
            return this.f4141b.getStoryId();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, o, false, 83935, new Class[0], String.class);
    }

    public final void l() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83929, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83929, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.q.pause();
        }
        c.d().c(g.b(this.f4141b));
    }

    public final void n() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83931, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83931, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.q.pause();
        }
        c.d().c(g.b(this.f4141b));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83937, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83937, new Class[0], Void.TYPE);
            return;
        }
        l();
    }

    private void q() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83916, new Class[0], Void.TYPE);
            return;
        }
        this.q = ValueAnimator.ofFloat(new float[]{0.0f, 25.0f});
        this.q.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72702a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f72702a, false, 83941, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f72702a, false, 83941, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                c.d().a(((Float) valueAnimator.getAnimatedValue()).floatValue() * 4.0f);
                c.d().f73264d = (long) (valueAnimator.getAnimatedFraction() * 5000.0f);
            }
        });
        this.q.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72704a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f72704a, false, 83942, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f72704a, false, 83942, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationStart(animator);
                c.d().a(new com.ss.android.ugc.aweme.video.b.a(g.b(StoryImageViewHolder.this.f4141b), false, 5000));
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f72704a, false, 83943, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f72704a, false, 83943, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                c.d().f73264d = 0;
                if (((Float) ((ValueAnimator) animator).getAnimatedValue()).floatValue() >= 25.0f) {
                    new o().a(StoryImageViewHolder.this.g).a("homepage_story").b(e.b(StoryImageViewHolder.this.f4144e.getActivity())).b(StoryImageViewHolder.this.h).a(com.ss.android.ugc.aweme.story.metrics.a.a.a(StoryChange.c(StoryImageViewHolder.this.f4144e.getActivity()))).a(StoryImageViewHolder.this.f4141b).post();
                    c.d().e(g.b(StoryImageViewHolder.this.f4141b));
                }
            }
        });
        this.q.setDuration(5000);
        this.q.setTarget(this.p);
    }

    private void r() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83921, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83921, new Class[0], Void.TYPE);
        } else if (this.f4141b != null && this.f4141b.getLifeStory() != null && this.f4141b.getLifeStory().getImageInfo() != null) {
            final UrlModel labelLarge = this.f4141b.getLifeStory().getImageInfo().getLabelLarge();
            if (com.ss.android.ugc.aweme.base.c.a(Uri.parse(a(labelLarge)))) {
                a(this.p, labelLarge);
            } else {
                com.ss.android.ugc.aweme.base.c.a(labelLarge, (c.a) new c.a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f72710a;

                    public final void a(Exception exc) {
                    }

                    public final void a(DataSource<CloseableReference<CloseableImage>> dataSource) {
                        if (PatchProxy.isSupport(new Object[]{dataSource}, this, f72710a, false, 83947, new Class[]{DataSource.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{dataSource}, this, f72710a, false, 83947, new Class[]{DataSource.class}, Void.TYPE);
                            return;
                        }
                        StoryImageViewHolder.this.a(StoryImageViewHolder.this.p, labelLarge);
                    }
                });
            }
        }
    }

    private boolean s() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83934, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, o, false, 83934, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f4144e == null || this.f4144e.getActivity() == null) {
            return false;
        } else {
            Lifecycle lifecycle = this.f4144e.getActivity().getLifecycle();
            if (lifecycle == null || !lifecycle.getCurrentState().equals(Lifecycle.State.RESUMED)) {
                return false;
            }
            return true;
        }
    }

    public final void m() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83930, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83930, new Class[0], Void.TYPE);
            return;
        }
        if (s() && this.q != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.q.resume();
            }
            com.ss.android.ugc.aweme.story.player.c.d().b(g.b(this.f4141b));
        }
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83932, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83932, new Class[0], Void.TYPE);
            return;
        }
        if (s() && !com.ss.android.ugc.aweme.story.feed.a.c.f72456b) {
            com.ss.android.ugc.aweme.story.player.c.d().b(g.b(this.f4141b));
            if (Build.VERSION.SDK_INT >= 19) {
                this.q.resume();
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 83936, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 83936, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f4144e == null || this.f4144e.getActivity() == null)) {
            b b2 = StoryChange.b(this.f4144e.getActivity());
            if (!(b2 == null || this.f4141b == null || !TextUtils.equals(b2.getStoryId(), this.f4141b.getStoryId()))) {
                m();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(b bVar) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.r.getLayoutParams();
        layoutParams.width = this.p.getWidth();
        layoutParams.height = this.p.getHeight();
        this.r.setLayoutParams(layoutParams);
        com.ss.android.ugc.aweme.story.c.a.a(bVar, this.f4143d, new com.ss.android.ugc.aweme.sticker.a.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72708a;

            public final void a() {
            }

            public final void a(int i, boolean z) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f72708a, false, 83946, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f72708a, false, 83946, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.story.base.a.a.a().a("on_show_sticker_pop_up_window").postValue(Boolean.valueOf(z));
            }

            public final void a(int i, View view, float f2, float f3, InteractStickerStruct interactStickerStruct, boolean z) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z ? (byte) 1 : 0)}, this, f72708a, false, 83945, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), view, Float.valueOf(f2), Float.valueOf(f3), interactStickerStruct, Byte.valueOf(z)}, this, f72708a, false, 83945, new Class[]{Integer.TYPE, View.class, Float.TYPE, Float.TYPE, InteractStickerStruct.class, Boolean.TYPE}, Void.TYPE);
                } else if (z) {
                    StoryImageViewHolder.this.l();
                } else {
                    StoryImageViewHolder.this.m();
                }
            }
        }, new com.ss.android.ugc.aweme.story.feed.view.b(this.p.getWidth(), this.p.getHeight()), b(bVar));
    }

    private String a(UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{urlModel}, this, o, false, 83925, new Class[]{UrlModel.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{urlModel}, this, o, false, 83925, new Class[]{UrlModel.class}, String.class);
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        } else {
            return urlModel.getUrlList().get(0);
        }
    }

    private boolean d(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, o, false, 83924, new Class[]{b.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, o, false, 83924, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
        } else if (bVar == null || bVar.getLifeStory() == null || bVar.getLifeStory().getImageInfo() == null) {
            return false;
        } else {
            ImageInfo imageInfo = bVar.getLifeStory().getImageInfo();
            if (imageInfo.getWidth() <= 1200 || imageInfo.getHeight() <= 2000) {
                return false;
            }
            return true;
        }
    }

    public final void a(b bVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, o, false, 83917, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, o, false, 83917, new Class[]{b.class}, Void.TYPE);
            return;
        }
        super.a(bVar);
        this.f4141b = bVar;
        this.f4145f.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72706a;

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9;
                int i10;
                if (PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72706a, false, 83944, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)}, this, f72706a, false, 83944, new Class[]{View.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                    return;
                }
                StoryImageViewHolder.this.f4145f.removeOnLayoutChangeListener(this);
                ImageInfo e2 = g.e(StoryImageViewHolder.this.f4141b);
                if (e2 != null) {
                    int width = e2.getWidth();
                    int height = e2.getHeight();
                    StoryImageViewHolder storyImageViewHolder = StoryImageViewHolder.this;
                    if (PatchProxy.isSupport(new Object[0], storyImageViewHolder, StoryImageViewHolder.o, false, 83919, new Class[0], Integer.TYPE)) {
                        i9 = ((Integer) PatchProxy.accessDispatch(new Object[0], storyImageViewHolder, StoryImageViewHolder.o, false, 83919, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        int measuredWidth = storyImageViewHolder.f4145f.getMeasuredWidth();
                        if (measuredWidth == 0) {
                            i9 = UIUtils.getScreenWidth(storyImageViewHolder.f4144e.getContext());
                        } else {
                            i9 = measuredWidth;
                        }
                    }
                    StoryImageViewHolder storyImageViewHolder2 = StoryImageViewHolder.this;
                    if (PatchProxy.isSupport(new Object[0], storyImageViewHolder2, StoryImageViewHolder.o, false, 83920, new Class[0], Integer.TYPE)) {
                        i10 = ((Integer) PatchProxy.accessDispatch(new Object[0], storyImageViewHolder2, StoryImageViewHolder.o, false, 83920, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        int measuredHeight = storyImageViewHolder2.f4145f.getMeasuredHeight();
                        if (measuredHeight == 0) {
                            i10 = UIUtils.getScreenHeight(storyImageViewHolder2.f4144e.getContext());
                        } else {
                            i10 = measuredHeight;
                        }
                    }
                    d.a(width, height, i9, i10, StoryImageViewHolder.this.p);
                }
            }
        });
        q();
        ImageInfo e2 = g.e(this.f4141b);
        if (e2 != null) {
            b(this.p, e2.getLabelLarge());
        }
        b bVar2 = this.f4141b;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, o, false, 83926, new Class[]{b.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{bVar2}, this, o, false, 83926, new Class[]{b.class}, String.class);
        } else if (bVar2 == null || bVar2.getLifeStory() == null || bVar2.getLifeStory().getImageInfo() == null) {
            str = "";
        } else {
            str = a(bVar2.getLifeStory().getImageInfo().getLabelLarge());
        }
        com.ss.android.ugc.aweme.base.c.b(str);
        if (g()) {
            d();
        }
        if (PatchProxy.isSupport(new Object[]{bVar}, this, o, false, 83918, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, o, false, 83918, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (bVar != null) {
            this.p.post(new b(this, bVar));
        }
    }

    private void b(AnimatedImageView animatedImageView, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{animatedImageView, urlModel}, this, o, false, 83923, new Class[]{AnimatedImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView, urlModel}, this, o, false, 83923, new Class[]{AnimatedImageView.class, UrlModel.class}, Void.TYPE);
        } else if (d(this.f4141b)) {
            a((RemoteImageView) animatedImageView, urlModel, Priority.HIGH, (ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) null);
        } else {
            com.ss.android.ugc.aweme.base.c.b(animatedImageView, urlModel);
        }
    }

    public final void a(AnimatedImageView animatedImageView, UrlModel urlModel) {
        if (PatchProxy.isSupport(new Object[]{animatedImageView, urlModel}, this, o, false, 83922, new Class[]{AnimatedImageView.class, UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView, urlModel}, this, o, false, 83922, new Class[]{AnimatedImageView.class, UrlModel.class}, Void.TYPE);
        } else if (this.f4144e != null && this.f4144e.getActivity() != null && !this.f4144e.getActivity().isFinishing() && this.f4141b != null && this.f4141b.getLifeStory() != null && this.f4141b.getLifeStory().getImageInfo() != null) {
            b(animatedImageView, urlModel);
            if (this.f4144e != null && g.a(this.f4141b, StoryChange.b(this.f4144e.getActivity()))) {
                if (this.q.isRunning()) {
                    this.q.cancel();
                }
                this.q.start();
                if (!s()) {
                    l();
                }
            }
        }
    }

    public StoryImageViewHolder(View view, Fragment fragment, StoryFeedPagerAdapter storyFeedPagerAdapter) {
        super(view, fragment, storyFeedPagerAdapter);
        this.p = (AnimatedImageView) view.findViewById(C0906R.id.b2e);
        this.r = view.findViewById(C0906R.id.av6);
        if (this.f4144e != null && this.f4144e.getActivity() != null) {
            this.f4144e.getActivity().getLifecycle().addObserver(this);
        }
    }

    private static void a(RemoteImageView remoteImageView, UrlModel urlModel, Priority priority, ControllerListener<com.facebook.imagepipeline.image.ImageInfo> controllerListener) {
        Context context;
        RemoteImageView remoteImageView2 = remoteImageView;
        UrlModel urlModel2 = urlModel;
        Priority priority2 = priority;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, urlModel2, priority2, null}, null, o, true, 83938, new Class[]{RemoteImageView.class, UrlModel.class, Priority.class, ControllerListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, urlModel2, priority2, null}, null, o, true, 83938, new Class[]{RemoteImageView.class, UrlModel.class, Priority.class, ControllerListener.class}, Void.TYPE);
        } else if (remoteImageView2 != null && urlModel2 != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                context = remoteImageView.getContext().getApplicationContext();
            } else {
                context = null;
            }
            ImageRequest[] a2 = a(urlModel2, (ResizeOptions) null, priority2, (Postprocessor) null);
            if (a2 != null && a2.length != 0) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(remoteImageView.getController())).setFirstAvailableImageRequests(a2);
                pipelineDraweeControllerBuilder.setControllerListener(com.ss.android.ugc.aweme.base.c.a((ControllerListener<com.facebook.imagepipeline.image.ImageInfo>) null, a2[0].getSourceUri(), context, urlModel2));
                remoteImageView2.setController(pipelineDraweeControllerBuilder.build());
            }
        }
    }

    private static ImageRequest[] a(UrlModel urlModel, ResizeOptions resizeOptions, Priority priority, Postprocessor postprocessor) {
        Priority priority2 = priority;
        if (PatchProxy.isSupport(new Object[]{urlModel, null, priority2, null}, null, o, true, 83939, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class}, ImageRequest[].class)) {
            return (ImageRequest[]) PatchProxy.accessDispatch(new Object[]{urlModel, null, priority2, null}, null, o, true, 83939, new Class[]{UrlModel.class, ResizeOptions.class, Priority.class, Postprocessor.class}, ImageRequest[].class);
        } else if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new ImageRequest[0];
        } else {
            ArrayList arrayList = new ArrayList();
            for (String next : urlModel.getUrlList()) {
                if (!StringUtils.isEmpty(next)) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                    imageDecodeOptionsBuilder.setDecodeAllFrames(false);
                    arrayList.add(ImageRequestBuilder.newBuilderWithSource(Uri.parse(next)).setRequestPriority(priority2).setImageDecodeOptions(new ImageDecodeOptions(imageDecodeOptionsBuilder)).build());
                }
            }
            if (arrayList.size() == 0) {
                return new ImageRequest[0];
            }
            return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
        }
    }
}

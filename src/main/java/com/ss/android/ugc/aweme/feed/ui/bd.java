package com.ss.android.ugc.aweme.feed.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Message;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.feed.model.UserPreferVideo;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBarView;
import com.ss.android.ugc.aweme.profile.a;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bd extends FrameLayout implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46566a;

    /* renamed from: b  reason: collision with root package name */
    public Context f46567b;

    /* renamed from: c  reason: collision with root package name */
    public AnimatedImageView[] f46568c = new AnimatedImageView[9];

    /* renamed from: d  reason: collision with root package name */
    public View[] f46569d = new View[9];

    /* renamed from: e  reason: collision with root package name */
    public boolean[] f46570e = new boolean[9];

    /* renamed from: f  reason: collision with root package name */
    public List<UserPreferVideo> f46571f;
    public int g;
    public int h = -1;
    public WeakHandler i = new WeakHandler(this);
    public boolean j = false;
    public AnimatorSet k;
    public View l;
    public View m;
    public View n;
    private int[] o = {C0906R.id.arv, C0906R.id.arw, C0906R.id.arx, C0906R.id.ary, C0906R.id.arz, C0906R.id.as0, C0906R.id.as1, C0906R.id.as2, C0906R.id.as3};
    private int[] p = {0, 200, 400, 200, 400, 600, 400, 600, 800};
    private List<UserPreferVideo> q;
    private LineProgressBarView r;
    private View s;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43106, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            this.i.sendEmptyMessageDelayed(3, 20);
        }
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43100, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43100, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        if (this.g == 0) {
            d();
        }
    }

    private List<UserPreferVideo> getCurrentShowDatas() {
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43107, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43107, new Class[0], List.class);
        }
        this.h++;
        int i2 = this.h * 9;
        if (i2 + 9 >= this.f46571f.size()) {
            this.h = 0;
            i2 = this.h * 9;
        }
        List<UserPreferVideo> subList = this.f46571f.subList(i2, i2 + 9);
        if (this.h == 0) {
            Collections.shuffle(subList);
        }
        return subList;
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43101, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43101, new Class[0], Void.TYPE);
            return;
        }
        this.g = 0;
        d();
        if (this.f46571f != null) {
            this.q = getCurrentShowDatas();
            this.r.setProgress(0);
            for (final int i2 = 0; i2 < this.f46568c.length; i2++) {
                this.f46570e[i2] = false;
                if (this.j) {
                    this.f46568c[i2].animate().alpha(0.0f).setDuration(200).setListener(new Animator.AnimatorListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46574a;

                        public final void onAnimationCancel(Animator animator) {
                        }

                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f46574a, false, 43114, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f46574a, false, 43114, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            bd.this.a(bd.this.f46568c[i2], i2);
                        }
                    }).start();
                } else {
                    a(this.f46568c[i2], i2);
                }
            }
        }
    }

    private void c() {
        View view;
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43098, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43098, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(this.f46567b).inflate(C0906R.layout.a8d, this);
        for (int i2 = 0; i2 < this.o.length; i2++) {
            this.f46568c[i2] = (AnimatedImageView) findViewById(this.o[i2]);
            this.f46568c[i2].setOnClickListener(this);
            View[] viewArr = this.f46569d;
            if (this.f46568c[i2].getParent() instanceof View) {
                view = (View) this.f46568c[i2].getParent();
            } else {
                view = null;
            }
            viewArr[i2] = view;
        }
        this.r = (LineProgressBarView) findViewById(C0906R.id.c7k);
        this.r.setMaxProgress(BuildConfig.VERSION_CODE);
        this.r.setColor(Color.parseColor("#57FFFFFF"));
        this.l = findViewById(C0906R.id.baa);
        this.m = findViewById(C0906R.id.b8y);
        this.n = findViewById(C0906R.id.cmj);
        this.s = inflate;
        inflate.setOnClickListener(be.f46586b);
        if (a.a().l) {
            ((FrameLayout.LayoutParams) this.r.getLayoutParams()).bottomMargin = 0;
            ((FrameLayout.LayoutParams) this.n.getLayoutParams()).bottomMargin = 0;
        }
        post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46572a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f46572a, false, 43113, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46572a, false, 43113, new Class[0], Void.TYPE);
                    return;
                }
                int measuredHeight = bd.this.n.getMeasuredHeight();
                int measuredHeight2 = bd.this.l.getMeasuredHeight();
                int dip2Px = ((int) UIUtils.dip2Px(bd.this.f46567b, 6.0f)) * 2;
                int measuredWidth = bd.this.n.getMeasuredWidth() - dip2Px;
                int i = (measuredHeight - measuredHeight2) - dip2Px;
                int dip2Px2 = (int) UIUtils.dip2Px(bd.this.f46567b, 29.0f);
                int i2 = (dip2Px2 * 3) / 2;
                int i3 = (int) ((((float) measuredWidth) - ((((float) (((i - dip2Px2) - i2) / 3)) * 0.694f) * 3.0f)) / 2.0f);
                int dip2Px3 = (int) UIUtils.dip2Px(bd.this.f46567b, 18.0f);
                if (i3 < dip2Px3) {
                    int i4 = (i - (((((measuredWidth - (dip2Px3 * 2)) / 3) * SearchJediMixFeedAdapter.g) / 100) * 3)) / 5;
                    dip2Px2 = i4 * 2;
                    i2 = i4 * 3;
                    i3 = dip2Px3;
                }
                bd.this.n.setPadding(0, dip2Px2, 0, i2);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) bd.this.m.getLayoutParams();
                layoutParams.leftMargin = i3;
                layoutParams.rightMargin = i3;
                bd.this.requestLayout();
            }
        });
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f46566a, false, 43110, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46566a, false, 43110, new Class[0], Void.TYPE);
        } else if (this.k == null || !this.k.isRunning()) {
            int color = getResources().getColor(C0906R.color.anx);
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder builder = null;
            for (final int i2 = 0; i2 < this.f46568c.length; i2++) {
                this.f46569d[i2].setBackgroundColor(color);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f});
                ofFloat.setDuration(1000).setStartDelay((long) this.p[i2]);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f46582a;

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f46582a, false, 43117, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f46582a, false, 43117, new Class[]{ValueAnimator.class}, Void.TYPE);
                            return;
                        }
                        bd.this.f46569d[i2].getBackground().setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                    }
                });
                ofFloat.setRepeatCount(-1);
                ofFloat.setRepeatMode(2);
                if (builder == null) {
                    builder = animatorSet.play(ofFloat);
                } else {
                    builder.with(ofFloat);
                }
            }
            animatorSet.start();
            this.k = animatorSet;
        }
    }

    public bd(@NonNull Context context) {
        super(context);
        this.f46567b = context;
        c();
    }

    public void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f46566a, false, 43111, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f46566a, false, 43111, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        if (message.what == 3) {
            this.r.setProgress(this.r.getProgress() + 1);
            this.i.removeMessages(3);
            if (this.r.getProgress() < 750) {
                this.i.sendEmptyMessageDelayed(3, 20);
            }
            if (this.r.getProgress() == 750) {
                a();
            }
        }
    }

    public void onClick(View view) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f46566a, false, 43108, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f46566a, false, 43108, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        AnimatedImageView animatedImageView = (AnimatedImageView) view;
        if (PatchProxy.isSupport(new Object[]{animatedImageView}, this, f46566a, false, 43109, new Class[]{View.class}, Integer.TYPE)) {
            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{animatedImageView}, this, f46566a, false, 43109, new Class[]{View.class}, Integer.TYPE)).intValue();
        } else {
            if (animatedImageView != null) {
                int i3 = 0;
                while (true) {
                    if (i2 >= this.f46568c.length) {
                        break;
                    } else if (animatedImageView.equals(this.f46568c[i2])) {
                        break;
                    } else {
                        i3 = i2 + 1;
                    }
                }
            } else {
                i2 = 0;
                while (true) {
                    if (i2 >= this.f46568c.length) {
                        break;
                    } else if (this.f46568c[i2] == null) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            i2 = -1;
        }
        if (i2 >= 0 && i2 < this.o.length && this.q.size() > i2 && this.f46570e[i2]) {
            UserPreferVideo userPreferVideo = this.q.get(i2);
            h.a().a(j.a("aweme://aweme/detail/1234").a("related_gid", userPreferVideo.gid).a("refer", "preference_pop_up").a("video_from", "from_user_perfer").a());
            r.a("click_preferred_video", (Map) d.a().a("group_id", userPreferVideo.gid).a("page", this.h).a("position", i2).f34114b);
        }
    }

    public final void a(AnimatedImageView animatedImageView, final int i2) {
        if (PatchProxy.isSupport(new Object[]{animatedImageView, Integer.valueOf(i2)}, this, f46566a, false, 43102, new Class[]{AnimatedImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{animatedImageView, Integer.valueOf(i2)}, this, f46566a, false, 43102, new Class[]{AnimatedImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        ImageRequest[] a2 = c.a(this.q.get(i2).dynamicCover, (ResizeOptions) null, (Postprocessor) null);
        if (a2 != null && a2.length != 0) {
            PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = (PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) ((PipelineDraweeControllerBuilder) Fresco.newDraweeControllerBuilder().setOldController(this.f46568c[i2].getController())).setFirstAvailableImageRequests(a2)).setAutoPlayAnimations(true);
            pipelineDraweeControllerBuilder.setControllerListener(new ControllerListener<ImageInfo>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f46577a;

                public final void onFailure(String str, Throwable th) {
                }

                public final void onIntermediateImageFailed(String str, Throwable th) {
                }

                public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
                }

                public final void onRelease(String str) {
                }

                public final void onSubmit(String str, Object obj) {
                }

                public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
                    ImageInfo imageInfo = (ImageInfo) obj;
                    if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f46577a, false, 43115, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f46577a, false, 43115, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                        return;
                    }
                    bd.this.f46570e[i2] = true;
                    bd.this.f46568c[i2].animate().alpha(1.0f).setDuration(200).setListener(new AnimatorListenerAdapter() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f46580a;

                        public final void onAnimationEnd(Animator animator) {
                            if (PatchProxy.isSupport(new Object[]{animator}, this, f46580a, false, 43116, new Class[]{Animator.class}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{animator}, this, f46580a, false, 43116, new Class[]{Animator.class}, Void.TYPE);
                                return;
                            }
                            super.onAnimationEnd(animator);
                            bd.this.f46568c[i2].setAlpha(1.0f);
                            bd.this.f46568c[i2].b();
                        }
                    }).start();
                    bd.this.f46568c[i2].setUserVisibleHint(true);
                    bd.this.f46568c[i2].setAttached(true);
                    bd.this.g++;
                    if (bd.this.g == 9) {
                        if (bd.this.k != null) {
                            bd.this.k.cancel();
                            bd.this.k = null;
                        }
                        bd.this.i.sendEmptyMessageDelayed(3, 20);
                    }
                    bd.this.j = true;
                }
            });
            this.f46568c[i2].setController(pipelineDraweeControllerBuilder.build());
        }
    }
}

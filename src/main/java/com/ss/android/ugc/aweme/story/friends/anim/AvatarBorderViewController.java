package com.ss.android.ugc.aweme.story.friends.anim;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.story.friends.LiveCircleView;
import com.ss.android.ugc.aweme.story.friends.adapter.LiveStoryViewHolder;
import java.util.ArrayList;
import java.util.List;

public class AvatarBorderViewController implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4161a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4162b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4163c;

    /* renamed from: d  reason: collision with root package name */
    public List<LiveStoryViewHolder> f4164d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private AnimatorSet f4165e;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4161a, false, 84624, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4161a, false, 84624, new Class[0], Void.TYPE);
            return;
        }
        if (this.f4165e != null) {
            this.f4165e.cancel();
            this.f4165e = null;
            this.f4162b = false;
            this.f4163c = false;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f4161a, false, 84622, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4161a, false, 84622, new Class[0], Void.TYPE);
            return;
        }
        b();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f4161a, false, 84621, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4161a, false, 84621, new Class[0], Void.TYPE);
            return;
        }
        a();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4161a, false, 84623, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4161a, false, 84623, new Class[0], Void.TYPE);
        } else if (this.f4164d != null && !this.f4164d.isEmpty() && !this.f4162b) {
            this.f4162b = true;
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 1200});
            final ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{0, 1200});
            ofInt2.setRepeatCount(-1);
            ofInt2.setRepeatMode(1);
            ofInt2.setDuration(1200);
            ofInt.setRepeatCount(-1);
            ofInt.setRepeatMode(1);
            this.f4165e = new AnimatorSet();
            this.f4165e.setDuration(1200);
            this.f4165e.play(ofInt);
            this.f4165e.start();
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73108a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f73108a, false, 84627, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f73108a, false, 84627, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 1000) {
                        float f2 = (((float) intValue) * 1.0f) / 1000.0f;
                        for (LiveStoryViewHolder liveStoryViewHolder : AvatarBorderViewController.this.f4164d) {
                            LiveCircleView liveCircleView = liveStoryViewHolder.g;
                            if (liveCircleView != null) {
                                liveCircleView.setFraction(f2);
                            }
                        }
                    }
                }
            });
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73110a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f73110a, false, 84628, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f73110a, false, 84628, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - ((animatedFraction / 0.5f) * 0.1f);
                    } else {
                        f2 = 0.9f + (((animatedFraction - 0.5f) / 0.5f) * 0.1f);
                    }
                    for (LiveStoryViewHolder liveStoryViewHolder : AvatarBorderViewController.this.f4164d) {
                        AnimatedImageView animatedImageView = liveStoryViewHolder.f73081b;
                        if (animatedImageView != null) {
                            animatedImageView.setScaleX(f2);
                            animatedImageView.setScaleY(f2);
                        }
                    }
                    if (intValue >= 1070 && intValue < 1090 && !AvatarBorderViewController.this.f4163c) {
                        ofInt2.start();
                        AvatarBorderViewController.this.f4163c = true;
                    }
                }
            });
            this.f4165e.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f73113a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f73113a, false, 84629, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f73113a, false, 84629, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    ofInt2.cancel();
                    AvatarBorderViewController.this.f4162b = false;
                    AvatarBorderViewController.this.f4163c = false;
                }
            });
        }
    }

    public AvatarBorderViewController(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
    }

    public final void a(LiveStoryViewHolder liveStoryViewHolder) {
        if (PatchProxy.isSupport(new Object[]{liveStoryViewHolder}, this, f4161a, false, 84625, new Class[]{LiveStoryViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveStoryViewHolder}, this, f4161a, false, 84625, new Class[]{LiveStoryViewHolder.class}, Void.TYPE);
        } else if (liveStoryViewHolder != null && !this.f4164d.contains(liveStoryViewHolder)) {
            this.f4164d.add(liveStoryViewHolder);
        }
    }

    public final void b(LiveStoryViewHolder liveStoryViewHolder) {
        LiveStoryViewHolder liveStoryViewHolder2 = liveStoryViewHolder;
        if (PatchProxy.isSupport(new Object[]{liveStoryViewHolder2}, this, f4161a, false, 84626, new Class[]{LiveStoryViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{liveStoryViewHolder2}, this, f4161a, false, 84626, new Class[]{LiveStoryViewHolder.class}, Void.TYPE);
            return;
        }
        this.f4164d.remove(liveStoryViewHolder2);
    }
}

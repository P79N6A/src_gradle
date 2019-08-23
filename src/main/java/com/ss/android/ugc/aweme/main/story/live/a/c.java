package com.ss.android.ugc.aweme.main.story.live.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import java.util.ArrayList;
import java.util.List;

public class c implements a {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f54965d;

    /* renamed from: a  reason: collision with root package name */
    private ValueAnimator f54966a;

    /* renamed from: e  reason: collision with root package name */
    protected LiveCircleView f54967e;

    /* renamed from: f  reason: collision with root package name */
    public AvatarImageView f54968f;
    public boolean g;
    public int h;
    public int i;
    public ValueAnimator j;
    public List<UrlModel> k = new ArrayList();

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f54965d, false, 58283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54965d, false, 58283, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54966a != null) {
            this.f54966a.cancel();
            this.f54966a = null;
            this.g = false;
        }
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f54965d, false, 58284, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54965d, false, 58284, new Class[0], Void.TYPE);
            return;
        }
        if (this.f54966a != null) {
            this.f54966a.cancel();
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f54965d, false, 58282, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f54965d, false, 58282, new Class[0], Void.TYPE);
        } else if (this.f54968f != null && this.f54967e != null && !this.g) {
            if (this.f54966a != null) {
                this.f54966a.start();
                return;
            }
            this.h = 1;
            this.f54966a = ValueAnimator.ofInt(new int[]{0, 800});
            this.j = ValueAnimator.ofInt(new int[]{0, 800});
            this.j.setRepeatCount(-1);
            this.j.setRepeatMode(1);
            this.j.setDuration(800);
            this.f54966a.setRepeatCount(-1);
            this.f54966a.setRepeatMode(1);
            this.f54966a.setDuration(800);
            this.f54966a.start();
            this.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54969a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54969a, false, 58286, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54969a, false, 58286, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        c.this.f54967e.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f54966a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54971a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    float f3;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f54971a, false, 58287, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f54971a, false, 58287, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (c.this.h % 5 == 0) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.08f;
                    }
                    if (c.this.h % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && c.this.k.size() != 0) {
                        com.ss.android.ugc.aweme.base.c.b(c.this.f54968f, c.this.k.get(c.this.i));
                        c.this.i = (c.this.i + 1) % c.this.k.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f3 = 1.0f - (f2 * (animatedFraction / 0.5f));
                    } else {
                        f3 = (1.0f - f2) + (f2 * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    c.this.f54968f.setScaleX(f3);
                    c.this.f54968f.setScaleY(f3);
                    if (intValue >= 730 && intValue < 740 && !c.this.g) {
                        c.this.g = true;
                        c.this.j.start();
                    }
                }
            });
            this.f54966a.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f54973a;

                public final void onAnimationRepeat(Animator animator) {
                    c.this.h = (c.this.h + 1) % 5;
                }

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f54973a, false, 58288, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f54973a, false, 58288, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    c.this.j.cancel();
                    c.this.g = false;
                }
            });
        }
    }

    public void a(AbsLiveStoryItemView absLiveStoryItemView) {
        if (PatchProxy.isSupport(new Object[]{absLiveStoryItemView}, this, f54965d, false, 58280, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{absLiveStoryItemView}, this, f54965d, false, 58280, new Class[]{AbsLiveStoryItemView.class}, Void.TYPE);
            return;
        }
        View rootView = absLiveStoryItemView.getRootView();
        this.f54968f = (AvatarImageView) rootView.findViewById(C0906R.id.awd);
        this.f54967e = (LiveCircleView) rootView.findViewById(C0906R.id.awh);
    }

    public final void a(List<UrlModel> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f54965d, false, 58281, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f54965d, false, 58281, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && list.size() != 0) {
            this.k.addAll(list);
            com.ss.android.ugc.aweme.base.c.b(this.f54968f, this.k.get(0));
        }
    }
}

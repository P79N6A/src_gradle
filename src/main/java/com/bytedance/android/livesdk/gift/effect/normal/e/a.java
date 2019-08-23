package com.bytedance.android.livesdk.gift.effect.normal.e;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.bytedance.android.livesdk.utils.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14913a;

    /* renamed from: b  reason: collision with root package name */
    private static final Interpolator f14914b = new Interpolator() {

        /* renamed from: a  reason: collision with root package name */
        private final float f14915a = 2.0f;

        public final float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * ((f3 * 3.0f) + 2.0f)) + 1.0f;
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.effect.normal.e.a$a  reason: collision with other inner class name */
    public static class C0106a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14929a;

        /* renamed from: b  reason: collision with root package name */
        private d f14930b;

        /* renamed from: c  reason: collision with root package name */
        private b f14931c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            if (PatchProxy.isSupport(new Object[]{animator}, this, f14929a, false, 9553, new Class[]{Animator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{animator}, this, f14929a, false, 9553, new Class[]{Animator.class}, Void.TYPE);
            } else if (this.f14930b != null) {
                switch (this.f14931c) {
                    case entry:
                        this.f14930b.a();
                        return;
                    case comb:
                        this.f14930b.b();
                        return;
                    case show:
                        this.f14930b.c();
                        return;
                    default:
                        this.f14930b.d();
                        this.f14930b = null;
                        return;
                }
            }
        }

        public C0106a(b bVar, d dVar) {
            this.f14930b = dVar;
            this.f14931c = bVar;
        }
    }

    public enum b {
        entry,
        comb,
        show,
        exit;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public float f14932a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f14933b = 0.0f;

        c(float f2, float f3) {
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();
    }

    public static AnimatorSet a(View view, d dVar) {
        View view2 = view;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{view2, dVar2}, null, f14913a, true, 9542, new Class[]{View.class, d.class}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, dVar2}, null, f14913a, true, 9542, new Class[]{View.class, d.class}, AnimatorSet.class);
        } else if (com.bytedance.android.live.uikit.a.a.a()) {
            if (PatchProxy.isSupport(new Object[]{view2, dVar2}, null, f14913a, true, 9543, new Class[]{View.class, d.class}, AnimatorSet.class)) {
                return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, dVar2}, null, f14913a, true, 9543, new Class[]{View.class, d.class}, AnimatorSet.class);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            final TextView textView = (TextView) view2.findViewById(C0906R.id.um);
            final TextView textView2 = (TextView) view2.findViewById(C0906R.id.un);
            final TextView textView3 = (TextView) view2.findViewById(C0906R.id.uo);
            if (textView == null || textView2 == null || textView3 == null) {
                return animatorSet;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            c cVar = new c(0.0f, 0.0f);
            c cVar2 = new c(0.0f, 0.0f);
            final c cVar3 = cVar;
            final c cVar4 = cVar2;
            final View view3 = view;
            final float x = textView3.getX();
            final float y = textView3.getY();
            AnonymousClass2 r0 = new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14916a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    float f3;
                    float f4;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f14916a, false, 9547, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f14916a, false, 9547, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (animatedFraction <= 0.5f) {
                        f2 = (3.2f * animatedFraction) + 1.0f;
                    } else {
                        f2 = (-3.2f * animatedFraction) + 4.2f;
                    }
                    textView.setScaleX(f2);
                    textView.setScaleY(f2);
                    textView2.setScaleX(f2);
                    textView2.setScaleY(f2);
                    textView3.setScaleX(f2);
                    textView3.setScaleY(f2);
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(animatedFraction)}, this, f14916a, false, 9548, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(animatedFraction)}, this, f14916a, false, 9548, new Class[]{Float.TYPE}, Void.TYPE);
                    } else {
                        float a2 = ak.a(view3.getContext(), 1.0f);
                        if (animatedFraction <= 0.5f) {
                            f4 = a2 * animatedFraction * 2.0f;
                        } else {
                            f4 = a2 - (((animatedFraction - 0.5f) * a2) * 2.0f);
                        }
                        cVar3.f14932a = x - f4;
                        cVar3.f14933b = x + f4;
                    }
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(animatedFraction)}, this, f14916a, false, 9549, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(animatedFraction)}, this, f14916a, false, 9549, new Class[]{Float.TYPE}, Void.TYPE);
                    } else {
                        float a3 = ak.a(view3.getContext(), 1.0f);
                        if (animatedFraction <= 0.5f) {
                            f3 = a3 * animatedFraction * 2.0f;
                        } else {
                            f3 = a3 - (((animatedFraction - 0.5f) * a3) * 2.0f);
                        }
                        cVar4.f14932a = y - f3;
                        cVar4.f14933b = y + f3;
                    }
                    textView.setX(cVar3.f14932a);
                    textView.setY(cVar4.f14932a);
                    textView2.setX(cVar3.f14933b);
                    textView2.setY(cVar4.f14933b);
                }
            };
            ofFloat.addUpdateListener(r0);
            ofFloat.setInterpolator(f14914b);
            ofFloat.setDuration(300);
            animatorSet.play(ofFloat);
            animatorSet.addListener(new C0106a(b.comb, dVar2));
            return animatorSet;
        } else if (com.bytedance.android.live.uikit.a.a.b() || com.bytedance.android.live.uikit.a.a.d()) {
            if (PatchProxy.isSupport(new Object[]{view2, dVar2}, null, f14913a, true, 9544, new Class[]{View.class, d.class}, AnimatorSet.class)) {
                return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, dVar2}, null, f14913a, true, 9544, new Class[]{View.class, d.class}, AnimatorSet.class);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (view2 == null) {
                return animatorSet2;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            final c cVar5 = new c(0.0f, 0.0f);
            c cVar6 = new c(0.0f, 0.0f);
            final float x2 = view.getX();
            final View view4 = view;
            final c cVar7 = cVar6;
            final float y2 = view.getY();
            AnonymousClass3 r02 = new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f14922a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    float f3;
                    float f4;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f14922a, false, 9550, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f14922a, false, 9550, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (animatedFraction <= 0.5f) {
                        f2 = (3.2f * animatedFraction) + 1.0f;
                    } else {
                        f2 = (-3.2f * animatedFraction) + 4.2f;
                    }
                    view4.setScaleX(f2);
                    view4.setScaleY(f2);
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(animatedFraction)}, this, f14922a, false, 9551, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(animatedFraction)}, this, f14922a, false, 9551, new Class[]{Float.TYPE}, Void.TYPE);
                    } else {
                        float a2 = ak.a(view4.getContext(), 1.0f);
                        if (animatedFraction <= 0.5f) {
                            f4 = a2 * animatedFraction * 2.0f;
                        } else {
                            f4 = a2 - (((animatedFraction - 0.5f) * a2) * 2.0f);
                        }
                        cVar5.f14932a = x2 - f4;
                        cVar5.f14933b = x2 + f4;
                    }
                    if (PatchProxy.isSupport(new Object[]{Float.valueOf(animatedFraction)}, this, f14922a, false, 9552, new Class[]{Float.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Float.valueOf(animatedFraction)}, this, f14922a, false, 9552, new Class[]{Float.TYPE}, Void.TYPE);
                        return;
                    }
                    float a3 = ak.a(view4.getContext(), 1.0f);
                    if (animatedFraction <= 0.5f) {
                        f3 = a3 * animatedFraction * 2.0f;
                    } else {
                        f3 = a3 - (((animatedFraction - 0.5f) * a3) * 2.0f);
                    }
                    cVar7.f14932a = y2 - f3;
                    cVar7.f14933b = y2 + f3;
                }
            };
            ofFloat2.addUpdateListener(r02);
            ofFloat2.setInterpolator(f14914b);
            ofFloat2.setDuration(300);
            animatorSet2.play(ofFloat2);
            animatorSet2.addListener(new C0106a(b.comb, dVar2));
            return animatorSet2;
        } else {
            if (PatchProxy.isSupport(new Object[]{view2, dVar2}, null, f14913a, true, 9545, new Class[]{View.class, d.class}, AnimatorSet.class)) {
                return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, dVar2}, null, f14913a, true, 9545, new Class[]{View.class, d.class}, AnimatorSet.class);
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{4.0f, 1.0f}).setDuration(300);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{4.0f, 1.0f}).setDuration(300);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f}).setDuration(100);
            ObjectAnimator duration4 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 1.5f}).setDuration(100);
            ObjectAnimator duration5 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 1.5f}).setDuration(100);
            ObjectAnimator duration6 = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.5f, 1.0f}).setDuration(100);
            ObjectAnimator duration7 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.5f, 1.0f}).setDuration(100);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(new Animator[]{duration, duration2, duration3});
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(new Animator[]{duration4, duration5});
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.playTogether(new Animator[]{duration6, duration7});
            AnimatorSet animatorSet6 = new AnimatorSet();
            animatorSet6.playSequentially(new Animator[]{animatorSet3, animatorSet4, animatorSet5});
            animatorSet6.addListener(new C0106a(b.comb, dVar2));
            return animatorSet6;
        }
    }

    public static AnimatorSet a(View view, boolean z, d dVar) {
        int i;
        View view2 = view;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), dVar2}, null, f14913a, true, 9541, new Class[]{View.class, Boolean.TYPE, d.class}, AnimatorSet.class)) {
            return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), dVar2}, null, f14913a, true, 9541, new Class[]{View.class, Boolean.TYPE, d.class}, AnimatorSet.class);
        }
        float x = view.getX();
        view.getY();
        if (z) {
            i = -1;
        } else {
            i = 1;
        }
        float f2 = (float) i;
        float f3 = 100.0f * f2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view2, "translationX", new float[]{x * f2, f3}).setDuration(500);
        float f4 = f2 * 25.0f;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f3, f4}).setDuration(200);
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f4, f4}).setDuration(200);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(new C0106a(b.entry, dVar2));
        return animatorSet;
    }
}

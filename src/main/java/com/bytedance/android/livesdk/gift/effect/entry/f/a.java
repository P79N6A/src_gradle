package com.bytedance.android.livesdk.gift.effect.entry.f;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14852a;

    public static AnimatorSet a(View view, com.bytedance.android.livesdk.gift.effect.entry.a.a aVar) {
        View view2 = view;
        com.bytedance.android.livesdk.gift.effect.entry.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{view2, aVar2}, null, f14852a, true, 9466, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class}, AnimatorSet.class)) {
            return a(view2, aVar2, -1);
        }
        return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, aVar2}, null, f14852a, true, 9466, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class}, AnimatorSet.class);
    }

    public static AnimatorSet a(View view, com.bytedance.android.livesdk.gift.effect.entry.a.a aVar, int i) {
        View view2 = view;
        com.bytedance.android.livesdk.gift.effect.entry.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{view2, aVar2, Integer.valueOf(i)}, null, f14852a, true, 9467, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Integer.TYPE}, AnimatorSet.class)) {
            return a(view2, aVar2, 80.0f, 40.0f, i);
        }
        return (AnimatorSet) PatchProxy.accessDispatch(new Object[]{view2, aVar2, Integer.valueOf(i)}, null, f14852a, true, 9467, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Integer.TYPE}, AnimatorSet.class);
    }

    public static AnimatorSet a(View view, com.bytedance.android.livesdk.gift.effect.entry.a.a aVar, float f2, float f3) {
        View view2 = view;
        com.bytedance.android.livesdk.gift.effect.entry.a.a aVar2 = aVar;
        if (!PatchProxy.isSupport(new Object[]{view2, aVar2, Float.valueOf(40.0f), Float.valueOf(-40.0f)}, null, f14852a, true, 9468, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Float.TYPE, Float.TYPE}, AnimatorSet.class)) {
            return a(view2, aVar2, 40.0f, -40.0f, -1);
        }
        Object[] objArr = {view2, aVar2, Float.valueOf(40.0f), Float.valueOf(-40.0f)};
        return (AnimatorSet) PatchProxy.accessDispatch(objArr, null, f14852a, true, 9468, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Float.TYPE, Float.TYPE}, AnimatorSet.class);
    }

    private static AnimatorSet a(View view, com.bytedance.android.livesdk.gift.effect.entry.a.a aVar, float f2, float f3, int i) {
        View view2 = view;
        final com.bytedance.android.livesdk.gift.effect.entry.a.a aVar2 = aVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{view2, aVar2, Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i)}, null, f14852a, true, 9469, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Float.TYPE, Float.TYPE, Integer.TYPE}, AnimatorSet.class)) {
            Object[] objArr = {view2, aVar2, Float.valueOf(f2), Float.valueOf(f3), Integer.valueOf(i)};
            return (AnimatorSet) PatchProxy.accessDispatch(objArr, null, f14852a, true, 9469, new Class[]{View.class, com.bytedance.android.livesdk.gift.effect.entry.a.a.class, Float.TYPE, Float.TYPE, Integer.TYPE}, AnimatorSet.class);
        }
        float x = view.getX();
        view.getY();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", new float[]{x, f2});
        long j = 500;
        ObjectAnimator duration = ofFloat.setDuration(500);
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f2, f3}).setDuration(2000);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationX", new float[]{f3, -x});
        if (i2 > 0) {
            j = (long) i2;
        }
        ObjectAnimator duration3 = ofFloat2.setDuration(j);
        duration.addListener(new Animator.AnimatorListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14853a;

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f14853a, false, 9471, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f14853a, false, 9471, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (aVar2 != null) {
                    aVar2.a(animator);
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{duration, duration2, duration3});
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.addListener(aVar2);
        return animatorSet;
    }
}

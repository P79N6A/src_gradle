package com.ss.android.ugc.aweme.effect;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.a;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43750a;

    public static void a(View view, boolean z, int i, View view2, a<Void> aVar) {
        float f2;
        float f3;
        float f4;
        final View view3 = view;
        final boolean z2 = z;
        int i2 = i;
        final View view4 = view2;
        final a<Void> aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view3, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), view4, aVar2}, null, f43750a, true, 38590, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, View.class, a.class}, Void.TYPE)) {
            Object[] objArr = {view3, Byte.valueOf(z), Integer.valueOf(i), view4, aVar2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f43750a, true, 38590, new Class[]{View.class, Boolean.TYPE, Integer.TYPE, View.class, a.class}, Void.TYPE);
            return;
        }
        if (z2) {
            view4.setVisibility(0);
        }
        view2.bringToFront();
        float[] fArr = new float[2];
        float f5 = 0.0f;
        if (!z2) {
            f2 = 0.0f;
        } else {
            f2 = (float) i2;
        }
        fArr[0] = f2;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = (float) i2;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "translationY", fArr);
        ofFloat.setDuration(300);
        float[] fArr2 = new float[2];
        if (!z2) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[0] = f4;
        if (z2) {
            f5 = 1.0f;
        }
        fArr2[1] = f5;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view3, "alpha", fArr2);
        ofFloat2.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43751a;

            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43751a, false, 38595, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43751a, false, 38595, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                view3.setVisibility(0);
            }

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43751a, false, 38596, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43751a, false, 38596, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (!z2) {
                    view4.setVisibility(4);
                }
                if (aVar2 != null) {
                    aVar2.run(null);
                }
            }
        });
        animatorSet.start();
    }

    public static void a(View view, boolean z, View view2, boolean z2, boolean z3) {
        float f2;
        final View view3 = view;
        if (PatchProxy.isSupport(new Object[]{view3, Byte.valueOf(z ? (byte) 1 : 0), null, (byte) 0, (byte) 0}, null, f43750a, true, 38592, new Class[]{View.class, Boolean.TYPE, View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            Object[] objArr = {view3, Byte.valueOf(z), null, (byte) 0, (byte) 0};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f43750a, true, 38592, new Class[]{View.class, Boolean.TYPE, View.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        float[] fArr = new float[2];
        float f3 = 1.0f;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 1.0f;
        }
        fArr[0] = f2;
        if (!z) {
            f3 = 0.0f;
        }
        fArr[1] = f3;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view3, "alpha", fArr);
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.start();
        ofFloat.addListener(new AnimatorListenerAdapter(null, false, false) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f43756a;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f43758c;

            public final void onAnimationEnd(Animator animator) {
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{animator}, this, f43756a, false, 38597, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f43756a, false, 38597, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                if (null != null) {
                    View view = null;
                    if (!this.f43758c) {
                        i = 8;
                    }
                    view.setVisibility(i);
                }
                if (false) {
                    view3.setVisibility(4);
                }
            }

            {
                this.f43758c = r2;
            }
        });
    }
}

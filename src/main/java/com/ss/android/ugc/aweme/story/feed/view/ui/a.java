package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72830a;

    /* renamed from: b  reason: collision with root package name */
    private Animator f72831b;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72830a, false, 84140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72830a, false, 84140, new Class[0], Void.TYPE);
            return;
        }
        if (this.f72831b != null && this.f72831b.isRunning()) {
            this.f72831b.cancel();
        }
    }

    public static void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, null, f72830a, true, 84136, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, null, f72830a, true, 84136, new Class[]{View.class}, Void.TYPE);
            return;
        }
        a(view2, 0.75f, 150);
    }

    public static void a(View view, float f2, long j) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(f2), 150L}, null, f72830a, true, 84137, new Class[]{View.class, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(f2), 150L}, null, f72830a, true, 84137, new Class[]{View.class, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        view2.setOnTouchListener(new b(f2, 150));
    }

    public final boolean a(View view, boolean z, long j) {
        final View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Byte.valueOf(z ? (byte) 1 : 0), 200L}, this, f72830a, false, 84139, new Class[]{View.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view2, Byte.valueOf(z), 200L}, this, f72830a, false, 84139, new Class[]{View.class, Boolean.TYPE, Long.TYPE}, Boolean.TYPE)).booleanValue();
        }
        a();
        if (z && view.getVisibility() == 8) {
            this.f72831b = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
            view2.setAlpha(0.0f);
            view2.setVisibility(0);
            this.f72831b.setDuration(200);
            this.f72831b.start();
            return true;
        } else if (z || view.getVisibility() != 0) {
            return false;
        } else {
            this.f72831b = ObjectAnimator.ofFloat(view2, "alpha", new float[]{1.0f, 0.0f});
            this.f72831b.setDuration(200);
            this.f72831b.addListener(new AnimatorListenerAdapter() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72832a;

                public final void onAnimationCancel(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f72832a, false, 84143, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f72832a, false, 84143, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationCancel(animator);
                    view2.setVisibility(8);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f72832a, false, 84142, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f72832a, false, 84142, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    super.onAnimationEnd(animator);
                    view2.setVisibility(8);
                    view2.setAlpha(1.0f);
                }
            });
            this.f72831b.start();
            return true;
        }
    }

    static void a(boolean z, View view, float f2, long j) {
        float f3;
        View view2 = view;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), view2, Float.valueOf(f2), new Long(j2)}, null, f72830a, true, 84138, new Class[]{Boolean.TYPE, View.class, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {Byte.valueOf(z), view2, Float.valueOf(f2), new Long(j2)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f72830a, true, 84138, new Class[]{Boolean.TYPE, View.class, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        float[] fArr = new float[2];
        float f4 = 1.0f;
        if (z) {
            f3 = 1.0f;
        } else {
            f3 = f2;
        }
        fArr[0] = f3;
        if (z) {
            f4 = f2;
        }
        fArr[1] = f4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", fArr);
        ofFloat.setDuration(j2);
        ofFloat.start();
    }
}

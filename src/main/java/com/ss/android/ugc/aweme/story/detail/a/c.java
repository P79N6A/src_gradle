package com.ss.android.ugc.aweme.story.detail.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72360a;

    /* renamed from: b  reason: collision with root package name */
    private final a f72361b;

    /* renamed from: c  reason: collision with root package name */
    private final View f72362c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f72363d;

    /* renamed from: e  reason: collision with root package name */
    private final View f72364e;

    /* renamed from: f  reason: collision with root package name */
    private final int f72365f;
    private final Animator.AnimatorListener g;

    public c(a aVar, View view, int[] iArr, View view2, int i, Animator.AnimatorListener animatorListener) {
        this.f72361b = aVar;
        this.f72362c = view;
        this.f72363d = iArr;
        this.f72364e = view2;
        this.f72365f = i;
        this.g = animatorListener;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f72360a, false, 83140, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72360a, false, 83140, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f72361b;
        View view = this.f72362c;
        int[] iArr = this.f72363d;
        View view2 = this.f72364e;
        int i = this.f72365f;
        Animator.AnimatorListener animatorListener = this.g;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0f, 0.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", new float[]{0.0f, (float) (iArr[0] - aVar.a(view))});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", new float[]{0.0f, (float) (iArr[1] - aVar.b(view))});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{view2.getAlpha(), 0.0f});
        aVar.f72352b = new AnimatorSet();
        aVar.f72352b.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        aVar.f72352b.setDuration((long) i);
        if (animatorListener != null) {
            aVar.f72352b.addListener(animatorListener);
        }
        aVar.f72352b.setInterpolator(new com.bytedance.ies.dmt.ui.c.c());
        aVar.f72352b.start();
    }
}

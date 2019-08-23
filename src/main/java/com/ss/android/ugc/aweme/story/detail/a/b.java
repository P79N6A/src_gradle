package com.ss.android.ugc.aweme.story.detail.a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.ies.dmt.ui.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72354a;

    /* renamed from: b  reason: collision with root package name */
    private final a f72355b;

    /* renamed from: c  reason: collision with root package name */
    private final View f72356c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f72357d;

    /* renamed from: e  reason: collision with root package name */
    private final View f72358e;

    /* renamed from: f  reason: collision with root package name */
    private final int f72359f;

    public b(a aVar, View view, int[] iArr, View view2, int i) {
        this.f72355b = aVar;
        this.f72356c = view;
        this.f72357d = iArr;
        this.f72358e = view2;
        this.f72359f = i;
    }

    public final void run() {
        if (PatchProxy.isSupport(new Object[0], this, f72354a, false, 83139, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72354a, false, 83139, new Class[0], Void.TYPE);
            return;
        }
        a aVar = this.f72355b;
        View view = this.f72356c;
        int[] iArr = this.f72357d;
        View view2 = this.f72358e;
        int i = this.f72359f;
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", new float[]{0.0f, 1.0f});
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "translationX", new float[]{(float) (iArr[0] - aVar.a(view)), 0.0f});
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationY", new float[]{(float) (iArr[1] - aVar.b(view)), 0.0f});
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.0f, 1.0f});
        aVar.f72352b = new AnimatorSet();
        aVar.f72352b.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        aVar.f72352b.setDuration((long) i);
        aVar.f72352b.setInterpolator(new c());
        aVar.f72352b.start();
    }
}

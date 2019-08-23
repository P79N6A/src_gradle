package com.ss.android.ugc.aweme.commercialize.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ScaleFadeCircleView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39987a;

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f39987a, false, 32965, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39987a, false, 32965, new Class[0], Void.TYPE);
            return;
        }
        a(this, 0.7f, 0.0f, 1500);
        a(this, 1.0f, 1.0f, 1.5f, 1.5f, 1500);
    }

    public ScaleFadeCircleView(Context context) {
        this(context, null);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleFadeCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(ContextCompat.getDrawable(context, 2130837607));
    }

    private void a(View view, float f2, float f3, long j) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(0.7f), Float.valueOf(0.0f), 1500L}, this, f39987a, false, 32966, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {view2, Float.valueOf(0.7f), Float.valueOf(0.0f), 1500L};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f39987a, false, 32966, new Class[]{View.class, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        view2.setAlpha(0.7f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "alpha", new float[]{0.7f, 0.0f});
        ofFloat.setDuration(1500);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    private void a(View view, float f2, float f3, float f4, float f5, long j) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2, Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(1.5f), 1500L}, this, f39987a, false, 32967, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(1.5f), 1500L}, this, f39987a, false, 32967, new Class[]{View.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        view2.setScaleX(1.0f);
        view2.setScaleY(1.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "scaleX", new float[]{1.0f, 1.5f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "scaleY", new float[]{1.0f, 1.5f});
        ofFloat.setRepeatCount(-1);
        ofFloat2.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.setDuration(1500);
        animatorSet.start();
    }
}

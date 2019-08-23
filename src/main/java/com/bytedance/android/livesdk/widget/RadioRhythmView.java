package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class RadioRhythmView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18316a;

    /* renamed from: b  reason: collision with root package name */
    final float f18317b;

    /* renamed from: c  reason: collision with root package name */
    final float f18318c;

    /* renamed from: d  reason: collision with root package name */
    final float f18319d;

    /* renamed from: e  reason: collision with root package name */
    final float f18320e;

    /* renamed from: f  reason: collision with root package name */
    final float f18321f;
    final int g;
    private AnimatorSet h;

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18316a, false, 14636, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18316a, false, 14636, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.h.end();
    }

    public void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18316a, false, 14635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18316a, false, 14635, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        View findViewById = findViewById(C0906R.id.avk);
        View findViewById2 = findViewById(C0906R.id.avl);
        View findViewById3 = findViewById(C0906R.id.avm);
        View findViewById4 = findViewById(C0906R.id.avn);
        View findViewById5 = findViewById(C0906R.id.avo);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById2, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById3, "scaleY", new float[]{1.0f, 0.4f, 1.0f});
        ofFloat3.setRepeatCount(-1);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(findViewById4, "scaleY", new float[]{1.0f, 1.47f, 1.0f, 0.588f, 1.0f});
        ofFloat4.setRepeatCount(-1);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(findViewById5, "scaleY", new float[]{1.0f, 2.5f, 1.0f});
        ofFloat5.setRepeatCount(-1);
        this.h = new AnimatorSet();
        this.h.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5});
        this.h.setInterpolator(linearInterpolator);
        this.h.setDuration(800);
        this.h.start();
    }

    public RadioRhythmView(@NonNull Context context) {
        this(context, null);
    }

    public RadioRhythmView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadioRhythmView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18317b = 1.0f;
        this.f18318c = 1.47f;
        this.f18319d = 2.5f;
        this.f18320e = 0.4f;
        this.f18321f = 0.588f;
        this.g = 800;
        inflate(context, C0906R.layout.anr, this);
    }
}

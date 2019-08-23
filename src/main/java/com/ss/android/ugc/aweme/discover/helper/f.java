package com.ss.android.ugc.aweme.discover.helper;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.transition.ChangeBounds;
import android.support.transition.Fade;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.au;

public final class f extends a {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f42337e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42338f;
    public boolean g = true;
    public boolean h;
    public boolean i;
    private View j;
    private View k;
    private View l;
    private View m;
    private View n;
    private View o;

    public final void a(Animator animator) {
    }

    public final void a(ValueAnimator valueAnimator) {
    }

    public final void b(Animator animator) {
    }

    public final void b(ValueAnimator valueAnimator) {
    }

    public final void c(Animator animator) {
    }

    public final void d(Animator animator) {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42337e, false, 36354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42337e, false, 36354, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
        marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(this.f42313b, 0.0f);
        this.o.setLayoutParams(marginLayoutParams);
        b(false);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42337e, false, 36355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42337e, false, 36355, new Class[0], Void.TYPE);
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
        if ((!this.f42338f || this.g) && (!this.h || this.i)) {
            marginLayoutParams.leftMargin = (int) UIUtils.dip2Px(this.f42313b, 16.0f);
        } else {
            marginLayoutParams.leftMargin = 0;
        }
        b(true);
    }

    private void b(boolean z) {
        int i2;
        int i3;
        int i4;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f42337e, false, 36353, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f42337e, false, 36353, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f42315d = z ^ true ? 1 : 0;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new Fade().addTarget(this.n).addTarget(this.k).addTarget(this.l).addTarget(this.m));
        transitionSet.addTransition(new ChangeBounds().addTarget((int) C0906R.id.cfk));
        transitionSet.setInterpolator((TimeInterpolator) new au(0.32f, 0.94f, 0.6f, 1.0f));
        transitionSet.setDuration(200);
        TransitionManager.beginDelayedTransition((ViewGroup) this.j, transitionSet);
        View view = this.l;
        int i5 = 8;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (!this.f42338f || this.g) {
            View view2 = this.m;
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            view2.setVisibility(i3);
            if (this.g) {
                View view3 = this.n;
                if (!z) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                view3.setVisibility(i4);
            }
        }
        if (this.h) {
            View view4 = this.k;
            if (z) {
                i5 = 0;
            }
            view4.setVisibility(i5);
        }
    }

    public f(Context context, View view, View view2, View view3, View view4, View view5, View view6) {
        super(context);
        this.j = view;
        this.k = view2;
        this.m = view3;
        this.n = view4;
        this.l = view5;
        this.o = view6;
    }
}

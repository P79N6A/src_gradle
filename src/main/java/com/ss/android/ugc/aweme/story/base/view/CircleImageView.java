package com.ss.android.ugc.aweme.story.base.view;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageView;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71960a;

    /* renamed from: b  reason: collision with root package name */
    int f71961b;

    /* renamed from: c  reason: collision with root package name */
    public ShapeDrawable f71962c;

    /* renamed from: d  reason: collision with root package name */
    private Animation.AnimationListener f71963d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f71964e;

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        if (PatchProxy.isSupport(new Object[0], this, f71960a, false, 82350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71960a, false, 82350, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationEnd();
        if (this.f71963d != null) {
            this.f71963d.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        if (PatchProxy.isSupport(new Object[0], this, f71960a, false, 82349, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71960a, false, 82349, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationStart();
        if (this.f71963d != null) {
            this.f71963d.onAnimationStart(getAnimation());
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f71963d = animationListener;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f71960a, false, 82354, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f71960a, false, 82354, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (!this.f71964e) {
            super.draw(canvas);
        }
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71960a, false, 82352, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71960a, false, 82352, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public void setBackgroundColorRes(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f71960a, false, 82351, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f71960a, false, 82351, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setDisabled(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f71960a, false, 82353, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f71960a, false, 82353, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f71964e != z) {
            this.f71964e = z;
            if (z) {
                ViewCompat.setBackground(this, new ColorDrawable(0));
            } else {
                ViewCompat.setBackground(this, this.f71962c);
            }
            if (a()) {
                float f3 = getContext().getResources().getDisplayMetrics().density;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = f3 * 4.0f;
                }
                ViewCompat.setElevation(this, f2);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71960a, false, 82348, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f71960a, false, 82348, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f71961b * 2), getMeasuredHeight() + (this.f71961b * 2));
        }
    }
}

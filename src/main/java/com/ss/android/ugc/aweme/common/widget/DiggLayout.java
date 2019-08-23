package com.ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class DiggLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40327a;
    private static Drawable g;

    /* renamed from: b  reason: collision with root package name */
    Queue<ImageView> f40328b;

    /* renamed from: c  reason: collision with root package name */
    int f40329c;

    /* renamed from: d  reason: collision with root package name */
    int f40330d;

    /* renamed from: e  reason: collision with root package name */
    Random f40331e;

    /* renamed from: f  reason: collision with root package name */
    private Context f40332f;

    public DiggLayout(Context context) {
        this(context, null, 0);
    }

    public DiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(float f2, float f3) {
        ImageView poll;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f40327a, false, 33578, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f40327a, false, 33578, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f40328b.isEmpty()) {
            poll = new ImageView(this.f40332f);
            if (g == null) {
                g = ContextCompat.getDrawable(this.f40332f, 2130838950);
            }
        } else {
            poll = this.f40328b.poll();
        }
        final ImageView imageView = poll;
        imageView.setImageDrawable(g);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f40330d, this.f40329c);
        layoutParams.setMargins((int) (f2 - ((float) (this.f40330d / 2))), (int) (f3 - ((float) this.f40329c)), 0, 0);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            addView(imageView);
        }
        if (PatchProxy.isSupport(new Object[]{imageView}, this, f40327a, false, 33579, new Class[]{ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView}, this, f40327a, false, 33579, new Class[]{ImageView.class}, Void.TYPE);
            return;
        }
        float nextInt = (float) (this.f40331e.nextInt(40) - 20);
        imageView.setRotation(nextInt);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(500);
        animationSet2.setStartOffset(500);
        animationSet2.setFillAfter(true);
        animationSet2.setInterpolator(new DecelerateInterpolator());
        float nextInt2 = (((float) this.f40331e.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int dip2Px = (int) UIUtils.dip2Px(this.f40332f, 50.0f);
        float f4 = (float) (-(this.f40331e.nextInt(dip2Px) + dip2Px));
        double d2 = (double) f4;
        double d3 = (double) nextInt;
        Double.isNaN(d3);
        double tan = Math.tan((d3 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d2);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d2 * tan), 0.0f, f4);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        imageView.startAnimation(animationSet);
        animationSet.setAnimationListener(new Animation.AnimationListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f40333a;

            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                if (PatchProxy.isSupport(new Object[]{animation}, this, f40333a, false, 33580, new Class[]{Animation.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animation}, this, f40333a, false, 33580, new Class[]{Animation.class}, Void.TYPE);
                    return;
                }
                DiggLayout.this.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f40336a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f40336a, false, 33581, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f40336a, false, 33581, new Class[0], Void.TYPE);
                            return;
                        }
                        if (DiggLayout.this.f40328b.size() < 3) {
                            DiggLayout.this.f40328b.add(imageView);
                        }
                        imageView.setImageDrawable(null);
                        imageView.clearAnimation();
                        DiggLayout.this.removeView(imageView);
                    }
                });
            }
        });
    }

    public DiggLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40328b = new LinkedList();
        this.f40329c = -1;
        this.f40330d = -1;
        if (PatchProxy.isSupport(new Object[]{context}, this, f40327a, false, 33577, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f40327a, false, 33577, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f40332f = context;
        this.f40331e = new Random();
        this.f40330d = (int) UIUtils.dip2Px(context, 72.0f);
        this.f40329c = (int) UIUtils.dip2Px(context, 79.0f);
    }
}

package com.ss.android.ugc.aweme.feed.widget;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PeriscopeLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47018a;

    /* renamed from: b  reason: collision with root package name */
    int f47019b;

    /* renamed from: c  reason: collision with root package name */
    int f47020c;

    /* renamed from: d  reason: collision with root package name */
    FrameLayout.LayoutParams f47021d;

    /* renamed from: e  reason: collision with root package name */
    Drawable[] f47022e;

    /* renamed from: f  reason: collision with root package name */
    public Random f47023f = new Random();
    Queue<ImageView> g;
    int h;
    int i;
    public int j;
    public int k;
    public Handler l = new Handler(Looper.getMainLooper());
    public Runnable m = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47024a;

        public final void run() {
            boolean z;
            ImageView imageView;
            ValueAnimator valueAnimator;
            float f2;
            float f3;
            if (PatchProxy.isSupport(new Object[0], this, f47024a, false, 43739, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f47024a, false, 43739, new Class[0], Void.TYPE);
                return;
            }
            PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
            if (PatchProxy.isSupport(new Object[0], periscopeLayout, PeriscopeLayout.f47018a, false, 43724, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], periscopeLayout, PeriscopeLayout.f47018a, false, 43724, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                Context context = periscopeLayout.getContext();
                if (context instanceof AbsActivity) {
                    z = ((AbsActivity) context).isViewValid();
                } else {
                    z = false;
                }
            }
            if (z && PeriscopeLayout.this.j != 0) {
                PeriscopeLayout periscopeLayout2 = PeriscopeLayout.this;
                if (PatchProxy.isSupport(new Object[0], periscopeLayout2, PeriscopeLayout.f47018a, false, 43730, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], periscopeLayout2, PeriscopeLayout.f47018a, false, 43730, new Class[0], Void.TYPE);
                } else {
                    if (PatchProxy.isSupport(new Object[0], periscopeLayout2, PeriscopeLayout.f47018a, false, 43727, new Class[0], ImageView.class)) {
                        imageView = (ImageView) PatchProxy.accessDispatch(new Object[0], periscopeLayout2, PeriscopeLayout.f47018a, false, 43727, new Class[0], ImageView.class);
                    } else if (periscopeLayout2.g.isEmpty()) {
                        imageView = new ImageView(periscopeLayout2.getContext());
                        imageView.setLayoutParams(periscopeLayout2.f47021d);
                        periscopeLayout2.addView(imageView);
                    } else {
                        imageView = periscopeLayout2.g.poll();
                    }
                    Drawable[] drawableArr = periscopeLayout2.f47022e;
                    int i = periscopeLayout2.o;
                    periscopeLayout2.o = i + 1;
                    imageView.setImageDrawable(drawableArr[i % 2]);
                    if (PatchProxy.isSupport(new Object[]{imageView}, periscopeLayout2, PeriscopeLayout.f47018a, false, 43737, new Class[]{View.class}, ValueAnimator.class)) {
                        PeriscopeLayout periscopeLayout3 = periscopeLayout2;
                        valueAnimator = (ValueAnimator) PatchProxy.accessDispatch(new Object[]{imageView}, periscopeLayout3, PeriscopeLayout.f47018a, false, 43737, new Class[]{View.class}, ValueAnimator.class);
                    } else {
                        float dip2Px = UIUtils.dip2Px(periscopeLayout2.getContext(), 48.0f);
                        float dip2Px2 = UIUtils.dip2Px(periscopeLayout2.getContext(), 20.0f);
                        float dip2Px3 = UIUtils.dip2Px(periscopeLayout2.getContext(), 20.0f);
                        if (periscopeLayout2.n) {
                            dip2Px = (((float) periscopeLayout2.f47020c) - dip2Px) - dip2Px3;
                            dip2Px2 = (((float) periscopeLayout2.f47020c) - dip2Px2) - dip2Px3;
                        }
                        b bVar = new b(new PointF(dip2Px, ((float) (periscopeLayout2.f47019b - periscopeLayout2.h)) - UIUtils.dip2Px(periscopeLayout2.getContext(), 8.0f)), new PointF(dip2Px2, UIUtils.dip2Px(periscopeLayout2.getContext(), 51.0f)));
                        Object[] objArr = new Object[2];
                        if (periscopeLayout2.n) {
                            f2 = ((float) periscopeLayout2.i) - dip2Px3;
                        } else {
                            f2 = (float) (periscopeLayout2.f47020c - periscopeLayout2.i);
                        }
                        objArr[0] = new PointF(f2, ((float) (periscopeLayout2.f47019b - periscopeLayout2.h)) - UIUtils.dip2Px(periscopeLayout2.getContext(), 2.0f));
                        if (periscopeLayout2.n) {
                            f3 = (((float) periscopeLayout2.f47020c) - dip2Px3) - UIUtils.dip2Px(periscopeLayout2.getContext(), (float) (periscopeLayout2.f47023f.nextInt(30) + 12));
                        } else {
                            f3 = UIUtils.dip2Px(periscopeLayout2.getContext(), (float) (periscopeLayout2.f47023f.nextInt(30) + 12));
                        }
                        objArr[1] = new PointF(f3, 0.0f);
                        ValueAnimator ofObject = ValueAnimator.ofObject(bVar, objArr);
                        a aVar = new a(imageView);
                        ofObject.addUpdateListener(aVar);
                        ofObject.setTarget(imageView);
                        imageView.setTag(C0906R.id.cza, aVar);
                        ofObject.setDuration((long) periscopeLayout2.k);
                        valueAnimator = ofObject;
                    }
                    imageView.setTag(valueAnimator);
                    valueAnimator.start();
                }
                if (PeriscopeLayout.this.l != null) {
                    PeriscopeLayout.this.l.postDelayed(this, (long) PeriscopeLayout.this.j);
                }
            }
        }
    };
    boolean n;
    int o = 0;
    private final float p = 0.3f;
    private final int q = 48;
    private final int r = 51;

    class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47026a;

        /* renamed from: b  reason: collision with root package name */
        public View f47027b;

        /* renamed from: d  reason: collision with root package name */
        private final float f47029d = 0.1f;

        /* renamed from: e  reason: collision with root package name */
        private final float f47030e = 0.2f;

        /* renamed from: f  reason: collision with root package name */
        private final float f47031f = 0.3f;
        private final float g = 0.5f;
        private final float h = 0.7f;
        private final float i = 0.8f;
        private final double j = 1.0E-10d;
        private final float k = 0.6f;
        private final float l = 0.7f;
        private int m;
        private int n;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f47026a, false, 43740, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f47026a, false, 43740, new Class[]{ValueAnimator.class}, Void.TYPE);
            } else if (this.f47027b != null && this.f47027b.getTag() != null) {
                PointF pointF = (PointF) valueAnimator.getAnimatedValue();
                this.f47027b.setX(pointF.x);
                this.f47027b.setY(pointF.y);
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.7f) {
                    float f2 = animatedFraction / 0.7f;
                    this.f47027b.setAlpha(0.7f * f2);
                    float f3 = (f2 * 0.3f) + 0.3f;
                    this.f47027b.setScaleX(f3);
                    this.f47027b.setScaleY(f3);
                } else if (animatedFraction <= 0.8f) {
                    this.f47027b.setAlpha(0.7f);
                    this.f47027b.setScaleX(0.6f);
                    this.f47027b.setScaleY(0.6f);
                } else if (animatedFraction <= 1.0f) {
                    float f4 = (animatedFraction - 0.8f) / 0.2f;
                    this.f47027b.setAlpha((1.0f - f4) * 0.7f);
                    float f5 = (f4 * 0.1f) + 0.6f;
                    this.f47027b.setScaleX(f5);
                    this.f47027b.setScaleY(f5);
                    if (((double) (1.0f - animatedFraction)) < 1.0E-10d) {
                        PeriscopeLayout.this.a(this.f47027b);
                        return;
                    }
                }
                if (animatedFraction <= 0.5f) {
                    this.f47027b.setRotation((animatedFraction / 0.5f) * 20.0f * ((float) this.m));
                } else {
                    this.f47027b.setRotation((((animatedFraction - 0.5f) / 0.5f) * 20.0f * ((float) this.n)) + ((float) (this.m * 20)));
                }
            }
        }

        a(View view) {
            int i2;
            this.f47027b = view;
            int i3 = -1;
            if (PeriscopeLayout.this.f47023f.nextBoolean()) {
                i2 = 1;
            } else {
                i2 = -1;
            }
            this.m = i2;
            this.n = PeriscopeLayout.this.f47023f.nextBoolean() ? 1 : i3;
        }
    }

    private void d() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43729, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43729, new Class[0], Void.TYPE);
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            a(getChildAt(i2));
        }
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43735, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43735, new Class[0], Void.TYPE);
            return;
        }
        this.j = 0;
        this.l.removeCallbacksAndMessages(null);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43732, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43732, new Class[0], Void.TYPE);
            return;
        }
        e();
        this.l.removeCallbacks(this.m);
        d();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43733, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43733, new Class[0], Void.TYPE);
            return;
        }
        d();
        e();
        this.l.removeCallbacks(this.m);
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43738, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.l.removeCallbacksAndMessages(null);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f47018a, false, 43725, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47018a, false, 43725, new Class[0], Void.TYPE);
            return;
        }
        this.g = new LinkedList();
        this.f47022e = new Drawable[2];
        Drawable a2 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838962);
        Drawable a3 = com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130838963);
        this.f47022e[0] = a2;
        this.f47022e[1] = a3;
        this.h = a2.getIntrinsicHeight();
        this.i = a2.getIntrinsicWidth();
        this.f47021d = new FrameLayout.LayoutParams(this.i, this.h);
    }

    public PeriscopeLayout(Context context) {
        super(context);
        c();
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f47018a, false, 43728, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f47018a, false, 43728, new Class[]{View.class}, Void.TYPE);
        } else if (view.getTag() != null) {
            this.g.add((ImageView) view2);
            ValueAnimator valueAnimator = (ValueAnimator) view.getTag();
            if (valueAnimator != null) {
                valueAnimator.setTarget(null);
                valueAnimator.cancel();
                valueAnimator.removeAllUpdateListeners();
            }
            if (view2.getTag(C0906R.id.cza) instanceof a) {
                a aVar = (a) view2.getTag(C0906R.id.cza);
                if (aVar != null) {
                    aVar.f47027b = null;
                }
            }
            view2.setAlpha(0.0f);
            view2.setScaleX(0.3f);
            view2.setScaleY(0.3f);
            view2.setRotation(0.0f);
            view2.setTag(null);
        }
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public void onMeasure(int i2, int i3) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f47018a, false, 43726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f47018a, false, 43726, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i2, i3);
        this.f47020c = getMeasuredWidth();
        this.f47019b = getMeasuredHeight();
        if (ViewCompat.getLayoutDirection(this) == 1) {
            z = true;
        }
        this.n = z;
    }

    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        c();
    }

    @TargetApi(21)
    public PeriscopeLayout(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        c();
    }
}

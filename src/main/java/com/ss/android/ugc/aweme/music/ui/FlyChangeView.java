package com.ss.android.ugc.aweme.music.ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.RelativeLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.LinkedList;
import java.util.List;

public class FlyChangeView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56437a;

    /* renamed from: b  reason: collision with root package name */
    public float f56438b;

    /* renamed from: c  reason: collision with root package name */
    public int f56439c;

    /* renamed from: d  reason: collision with root package name */
    public List<View> f56440d = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    private ValueAnimator f56441e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f56442f;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f56437a, false, 60124, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56437a, false, 60124, new Class[0], Void.TYPE);
            return;
        }
        this.f56442f = new Paint();
        this.f56442f.setAntiAlias(true);
        a();
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        if (PatchProxy.isSupport(new Object[0], this, f56437a, false, 60129, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f56437a, false, 60129, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f56440d.size() > 1) {
            return true;
        } else {
            return false;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f56437a, false, 60128, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56437a, false, 60128, new Class[0], Void.TYPE);
        } else if (b()) {
            if (this.f56441e != null) {
                this.f56441e.cancel();
                this.f56441e = null;
            }
            this.f56441e = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.f56441e.setDuration(200);
            this.f56441e.setInterpolator(new LinearInterpolator());
            this.f56441e.setStartDelay(2500);
            this.f56441e.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56443a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    View view;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f56443a, false, 60130, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f56443a, false, 60130, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    FlyChangeView.this.f56438b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    FlyChangeView flyChangeView = FlyChangeView.this;
                    if (PatchProxy.isSupport(new Object[0], flyChangeView, FlyChangeView.f56437a, false, 60127, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], flyChangeView, FlyChangeView.f56437a, false, 60127, new Class[0], Void.TYPE);
                        return;
                    }
                    if (flyChangeView.b() && flyChangeView.f56439c < flyChangeView.f56440d.size()) {
                        View view2 = flyChangeView.f56440d.get(flyChangeView.f56439c);
                        if (flyChangeView.f56439c == flyChangeView.f56440d.size() - 1) {
                            view = flyChangeView.f56440d.get(0);
                        } else {
                            view = flyChangeView.f56440d.get(flyChangeView.f56439c + 1);
                        }
                        int height = (int) (((float) flyChangeView.getHeight()) * flyChangeView.f56438b);
                        view2.setTranslationY((float) (-height));
                        view.setTranslationY((float) (flyChangeView.getHeight() - height));
                        view2.setVisibility(0);
                        view.setVisibility(0);
                    }
                }
            });
            this.f56441e.addListener(new Animator.AnimatorListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f56445a;

                public final void onAnimationCancel(Animator animator) {
                }

                public final void onAnimationRepeat(Animator animator) {
                }

                public final void onAnimationEnd(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f56445a, false, 60132, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f56445a, false, 60132, new Class[]{Animator.class}, Void.TYPE);
                        return;
                    }
                    FlyChangeView.this.a();
                }

                public final void onAnimationStart(Animator animator) {
                    if (PatchProxy.isSupport(new Object[]{animator}, this, f56445a, false, 60131, new Class[]{Animator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{animator}, this, f56445a, false, 60131, new Class[]{Animator.class}, Void.TYPE);
                    } else if (FlyChangeView.this.f56439c == FlyChangeView.this.f56440d.size() - 1) {
                        FlyChangeView.this.f56439c = 0;
                    } else {
                        FlyChangeView.this.f56439c++;
                    }
                }
            });
            this.f56441e.start();
        }
    }

    public FlyChangeView(Context context) {
        super(context);
        c();
    }

    public void onDraw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f56437a, false, 60126, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f56437a, false, 60126, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.onDraw(canvas);
    }

    public final void a(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f56437a, false, 60125, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56437a, false, 60125, new Class[]{View.class}, Void.TYPE);
            return;
        }
        addView(view);
        if (this.f56440d.isEmpty()) {
            view.setVisibility(4);
        }
        this.f56440d.add(view);
        if (b()) {
            a();
        }
    }

    public FlyChangeView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public FlyChangeView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }
}

package com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageView;
import android.view.animation.Animation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class CircleImageView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34800a;

    /* renamed from: b  reason: collision with root package name */
    int f34801b;

    /* renamed from: c  reason: collision with root package name */
    public ShapeDrawable f34802c;

    /* renamed from: d  reason: collision with root package name */
    private Animation.AnimationListener f34803d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34804e;

    class a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f34805a;

        /* renamed from: c  reason: collision with root package name */
        private RadialGradient f34807c;

        /* renamed from: d  reason: collision with root package name */
        private Paint f34808d = new Paint();

        private void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34805a, false, 24719, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34805a, false, 24719, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            float f2 = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f2, f2, (float) CircleImageView.this.f34801b, new int[]{1023410176, 0}, null, Shader.TileMode.CLAMP);
            this.f34807c = radialGradient;
            this.f34808d.setShader(this.f34807c);
        }

        a(int i) {
            CircleImageView.this.f34801b = i;
            a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            if (PatchProxy.isSupport(new Object[]{canvas, paint}, this, f34805a, false, 24718, new Class[]{Canvas.class, Paint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, paint}, this, f34805a, false, 24718, new Class[]{Canvas.class, Paint.class}, Void.TYPE);
                return;
            }
            int width = CircleImageView.this.getWidth();
            int height = CircleImageView.this.getHeight();
            int i = width / 2;
            if (i >= 0 && i - CircleImageView.this.f34801b >= 0) {
                float f2 = (float) i;
                float f3 = (float) (height / 2);
                canvas.drawCircle(f2, f3, f2, this.f34808d);
                canvas.drawCircle(f2, f3, (float) (i - CircleImageView.this.f34801b), paint);
            }
        }

        public final void onResize(float f2, float f3) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f34805a, false, 24717, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f34805a, false, 24717, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
                return;
            }
            super.onResize(f2, f3);
            a((int) f2);
        }
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public void onAnimationEnd() {
        if (PatchProxy.isSupport(new Object[0], this, f34800a, false, 24712, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34800a, false, 24712, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationEnd();
        if (this.f34803d != null) {
            this.f34803d.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        if (PatchProxy.isSupport(new Object[0], this, f34800a, false, 24711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f34800a, false, 24711, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationStart();
        if (this.f34803d != null) {
            this.f34803d.onAnimationStart(getAnimation());
        }
    }

    public void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f34803d = animationListener;
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, f34800a, false, 24716, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, f34800a, false, 24716, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        if (!this.f34804e) {
            super.draw(canvas);
        }
    }

    public void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34800a, false, 24714, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34800a, false, 24714, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public void setBackgroundColorRes(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f34800a, false, 24713, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f34800a, false, 24713, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    public void setDisabled(boolean z) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f34800a, false, 24715, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f34800a, false, 24715, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.f34804e != z) {
            this.f34804e = z;
            if (z) {
                ViewCompat.setBackground(this, new ColorDrawable(0));
            } else {
                ViewCompat.setBackground(this, this.f34802c);
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

    CircleImageView(Context context, int i) {
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f2);
        int i3 = (int) (0.0f * f2);
        this.f34801b = (int) (3.5f * f2);
        if (a()) {
            this.f34802c = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f2 * 4.0f);
        } else {
            this.f34802c = new ShapeDrawable(new a(this.f34801b));
            ViewCompat.setLayerType(this, 1, this.f34802c.getPaint());
            this.f34802c.getPaint().setShadowLayer((float) this.f34801b, (float) i3, (float) i2, 503316480);
            int i4 = this.f34801b;
            setPadding(i4, i4, i4, i4);
        }
        this.f34802c.getPaint().setColor(-328966);
        ViewCompat.setBackground(this, this.f34802c);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34800a, false, 24710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f34800a, false, 24710, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f34801b * 2), getMeasuredHeight() + (this.f34801b * 2));
        }
    }
}

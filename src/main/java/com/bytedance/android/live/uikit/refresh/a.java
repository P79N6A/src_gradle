package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class a extends ImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8616a;

    /* renamed from: b  reason: collision with root package name */
    private Animation.AnimationListener f8617b;

    /* renamed from: c  reason: collision with root package name */
    private int f8618c;

    /* renamed from: com.bytedance.android.live.uikit.refresh.a$a  reason: collision with other inner class name */
    class C0069a extends OvalShape {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f8619a;

        /* renamed from: c  reason: collision with root package name */
        private RadialGradient f8621c;

        /* renamed from: d  reason: collision with root package name */
        private int f8622d;

        /* renamed from: e  reason: collision with root package name */
        private Paint f8623e = new Paint();

        /* renamed from: f  reason: collision with root package name */
        private int f8624f;

        public final void draw(Canvas canvas, Paint paint) {
            if (PatchProxy.isSupport(new Object[]{canvas, paint}, this, f8619a, false, 2150, new Class[]{Canvas.class, Paint.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas, paint}, this, f8619a, false, 2150, new Class[]{Canvas.class, Paint.class}, Void.TYPE);
                return;
            }
            float width = (float) (a.this.getWidth() / 2);
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(width, height, (float) ((this.f8624f / 2) + this.f8622d), this.f8623e);
            canvas.drawCircle(width, height, (float) (this.f8624f / 2), paint);
        }

        public C0069a(int i, int i2) {
            this.f8622d = i;
            this.f8624f = i2;
            RadialGradient radialGradient = new RadialGradient((float) (this.f8624f / 2), (float) (this.f8624f / 2), (float) this.f8622d, new int[]{1023410176, 0}, null, Shader.TileMode.CLAMP);
            this.f8621c = radialGradient;
            this.f8623e.setShader(this.f8621c);
        }
    }

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        if (PatchProxy.isSupport(new Object[0], this, f8616a, false, 2148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8616a, false, 2148, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationEnd();
        if (this.f8617b != null) {
            this.f8617b.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        if (PatchProxy.isSupport(new Object[0], this, f8616a, false, 2147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f8616a, false, 2147, new Class[0], Void.TYPE);
            return;
        }
        super.onAnimationStart();
        if (this.f8617b != null) {
            this.f8617b.onAnimationStart(getAnimation());
        }
    }

    public final void setAnimationListener(Animation.AnimationListener animationListener) {
        this.f8617b = animationListener;
    }

    public final void setBackgroundColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f8616a, false, 2149, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f8616a, false, 2149, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i));
        }
    }

    public final void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8616a, false, 2146, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f8616a, false, 2146, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f8618c * 2), getMeasuredHeight() + (this.f8618c * 2));
        }
    }

    public a(Context context, int i, float f2) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f3 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (20.0f * f3 * 2.0f);
        int i3 = (int) (1.75f * f3);
        int i4 = (int) (0.0f * f3);
        this.f8618c = (int) (3.5f * f3);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            ViewCompat.setElevation(this, f3 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C0069a(this.f8618c, i2));
            ViewCompat.setLayerType(this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f8618c, (float) i4, (float) i3, 503316480);
            int i5 = this.f8618c;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackgroundDrawable(shapeDrawable);
    }
}

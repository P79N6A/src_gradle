package com.ss.android.ugc.aweme.profile.ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class PreviewBoxView extends View {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63046a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f63047b;

    /* renamed from: c  reason: collision with root package name */
    public float f63048c;

    /* renamed from: d  reason: collision with root package name */
    public a f63049d;

    /* renamed from: e  reason: collision with root package name */
    private Paint f63050e;

    /* renamed from: f  reason: collision with root package name */
    private ValueAnimator f63051f;
    private int g;
    private int h;
    private float i = 0.5625f;
    private RectF j;
    private Bitmap k;
    private int l = -1;

    public interface a {
        void a();

        void a(float f2);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f63046a, false, 69770, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63046a, false, 69770, new Class[0], Void.TYPE);
            return;
        }
        if (this.f63051f != null && this.f63051f.isStarted()) {
            this.f63051f.cancel();
        }
        if (Math.abs(this.f63048c - 0.34f) >= Float.MIN_NORMAL) {
            this.f63048c = 0.34f;
            setAlpha(this.f63048c);
            if (this.f63049d != null) {
                this.f63049d.a();
            }
        }
    }

    public Rect getVisibleRect() {
        if (PatchProxy.isSupport(new Object[0], this, f63046a, false, 69771, new Class[0], Rect.class)) {
            return (Rect) PatchProxy.accessDispatch(new Object[0], this, f63046a, false, 69771, new Class[0], Rect.class);
        }
        Rect rect = new Rect();
        rect.set((int) this.j.left, (int) this.j.top, (int) this.j.right, (int) this.j.bottom);
        return rect;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f63046a, false, 69769, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63046a, false, 69769, new Class[0], Void.TYPE);
        } else if (Math.abs(this.f63048c - 0.5f) >= Float.MIN_NORMAL && !this.f63047b) {
            this.f63047b = true;
            this.f63051f = ValueAnimator.ofFloat(new float[]{0.34f, 0.5f});
            this.f63051f.setEvaluator(new FloatEvaluator());
            this.f63051f.setDuration(300);
            this.f63051f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63052a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f63052a, false, 69772, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f63052a, false, 69772, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    PreviewBoxView.this.f63048c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    PreviewBoxView.this.setAlpha(PreviewBoxView.this.f63048c);
                    if (PreviewBoxView.this.f63049d != null) {
                        PreviewBoxView.this.f63049d.a(valueAnimator.getAnimatedFraction());
                    }
                }
            });
            this.f63051f.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    PreviewBoxView.this.f63048c = 0.5f;
                    PreviewBoxView.this.f63047b = false;
                }
            });
            this.f63051f.setStartDelay(300);
            this.f63051f.start();
        }
    }

    public final PreviewBoxView a(float f2) {
        this.i = f2;
        return this;
    }

    public final PreviewBoxView b(int i2) {
        this.g = i2;
        return this;
    }

    public void setTopOffset(int i2) {
        this.l = i2;
    }

    public final PreviewBoxView a(int i2) {
        this.h = i2;
        return this;
    }

    public PreviewBoxView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f63046a, false, 69763, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f63046a, false, 69763, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f63050e = new Paint();
        this.f63050e.setAntiAlias(true);
        this.g = (int) UIUtils.dip2Px(context, 16.0f);
        this.f63048c = 0.34f;
        setAlpha(this.f63048c);
    }

    public void onDraw(Canvas canvas) {
        byte b2;
        Bitmap bitmap;
        Canvas canvas2 = canvas;
        if (PatchProxy.isSupport(new Object[]{canvas2}, this, f63046a, false, 69766, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas2}, this, f63046a, false, 69766, new Class[]{Canvas.class}, Void.TYPE);
        } else if (this.j != null) {
            if (PatchProxy.isSupport(new Object[]{canvas2}, this, f63046a, false, 69768, new Class[]{Canvas.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{canvas2}, this, f63046a, false, 69768, new Class[]{Canvas.class}, Void.TYPE);
                return;
            }
            if (this.k == null) {
                int width = getWidth();
                int height = getHeight();
                RectF rectF = this.j;
                if (this.h == 1) {
                    b2 = 1;
                } else {
                    b2 = 0;
                }
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(width), Integer.valueOf(height), rectF, -16777216, Byte.valueOf(b2)}, this, f63046a, false, 69767, new Class[]{Integer.TYPE, Integer.TYPE, RectF.class, Integer.TYPE, Boolean.TYPE}, Bitmap.class)) {
                    bitmap = (Bitmap) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(width), Integer.valueOf(height), rectF, -16777216, Byte.valueOf(b2)}, this, f63046a, false, 69767, new Class[]{Integer.TYPE, Integer.TYPE, RectF.class, Integer.TYPE, Boolean.TYPE}, Bitmap.class);
                } else {
                    bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
                    Canvas canvas3 = new Canvas(bitmap);
                    canvas3.drawColor(-16777216);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    if (b2 != 0) {
                        canvas3.drawOval(rectF, paint);
                    } else {
                        canvas3.drawRect(rectF, paint);
                    }
                }
                this.k = bitmap;
            }
            canvas2.drawBitmap(this.k, 0.0f, 0.0f, this.f63050e);
        }
    }

    public PreviewBoxView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PreviewBoxView(Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a(context);
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f63046a, false, 69764, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f63046a, false, 69764, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onSizeChanged(i2, i3, i4, i5);
        if (PatchProxy.isSupport(new Object[0], this, f63046a, false, 69765, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63046a, false, 69765, new Class[0], Void.TYPE);
            return;
        }
        int width = getWidth() - (this.g * 2);
        int i6 = (int) (((float) width) * this.i);
        int i7 = this.l;
        if (i7 < 0) {
            i7 = Math.max(0, (getHeight() - i6) / 2);
        }
        this.j = new RectF((float) this.g, (float) i7, (float) (this.g + width), (float) (i7 + i6));
    }
}

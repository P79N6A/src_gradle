package com.bytedance.android.livesdk.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.core.utils.ac;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;

@Keep
public class SpecialCombView extends View {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int bgColor;
    private RectF bordRectF;
    private LinearGradient bordShader;
    private ValueAnimator borderAnimator;
    private float borderWidth;
    private Bitmap combBitmap;
    private Rect combBmRect;
    private RectF combDrawRectF;
    private Paint mPaint;
    private float progress;
    private float radius;
    private TextPaint textPaint;
    private int time;
    private String timeStr = "1s";
    private int totalTimeCount;
    private float viewHeight;
    private LinearGradient viewShader;
    private float viewWidth;

    public float getProgress() {
        return this.progress;
    }

    private float measureHeight() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14656, new Class[0], Float.TYPE)) {
            return getResources().getDimension(C0906R.dimen.q3);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14656, new Class[0], Float.TYPE)).floatValue();
    }

    private float measureWidth() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14655, new Class[0], Float.TYPE)) {
            return getResources().getDimension(C0906R.dimen.q4);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14655, new Class[0], Float.TYPE)).floatValue();
    }

    public void endScaleAnim() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14660, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14660, new Class[0], Void.TYPE);
            return;
        }
        if (this.borderAnimator != null && this.borderAnimator.isRunning()) {
            this.borderAnimator.end();
        }
    }

    private void init() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 14651, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 14651, new Class[0], Void.TYPE);
            return;
        }
        this.viewWidth = measureWidth();
        this.viewHeight = measureHeight();
        this.borderWidth = getResources().getDimension(C0906R.dimen.q1);
        this.radius = (this.viewWidth - (this.borderWidth * 2.0f)) / 2.0f;
        float f2 = this.borderWidth / 2.0f;
        this.bordRectF = new RectF(f2, f2, this.viewWidth - f2, this.viewWidth - f2);
        this.combBitmap = BitmapFactory.decodeResource(getResources(), 2130841133);
        this.combBmRect = new Rect(0, 0, this.combBitmap.getWidth(), this.combBitmap.getHeight());
        float a2 = (float) ac.a(11.0f);
        this.combDrawRectF = new RectF(a2, a2, this.viewWidth - a2, this.viewHeight - a2);
        this.mPaint = new Paint();
        this.textPaint = new TextPaint();
        this.textPaint.setAntiAlias(true);
        this.textPaint.setTextAlign(Paint.Align.CENTER);
        this.textPaint.setColor(getResources().getColor(C0906R.color.aho));
        this.textPaint.setTextSize(getResources().getDimension(C0906R.dimen.q2));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, getResources().getColor(C0906R.color.ahi), getResources().getColor(C0906R.color.ahg), Shader.TileMode.CLAMP);
        this.bordShader = linearGradient;
        float f3 = this.viewWidth;
        LinearGradient linearGradient2 = new LinearGradient(f3, 0.0f, 0.0f, this.viewHeight, getResources().getColor(C0906R.color.ahm), getResources().getColor(C0906R.color.ahk), Shader.TileMode.CLAMP);
        this.viewShader = linearGradient2;
        this.bgColor = getResources().getColor(C0906R.color.ahf);
    }

    public void setCountDownTime(int i) {
        this.totalTimeCount = i;
    }

    public SpecialCombView(Context context) {
        super(context);
        init();
    }

    public void setProgress(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 14654, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, changeQuickRedirect, false, 14654, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        this.progress = f2;
        this.time = ((int) ((f2 / 360.0f) * ((float) this.totalTimeCount))) + 1;
        this.timeStr = String.valueOf(this.time) + NotifyType.SOUND;
        invalidate();
    }

    public void draw(Canvas canvas) {
        if (PatchProxy.isSupport(new Object[]{canvas}, this, changeQuickRedirect, false, 14658, new Class[]{Canvas.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{canvas}, this, changeQuickRedirect, false, 14658, new Class[]{Canvas.class}, Void.TYPE);
            return;
        }
        super.draw(canvas);
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setColor(this.bgColor);
        canvas.drawCircle(this.viewWidth / 2.0f, this.viewHeight / 2.0f, this.viewWidth / 2.0f, this.mPaint);
        this.mPaint.reset();
        this.mPaint.setAntiAlias(true);
        this.mPaint.setShader(this.bordShader);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        this.mPaint.setStrokeWidth(this.borderWidth);
        canvas.drawArc(this.bordRectF, -90.0f, -this.progress, false, this.mPaint);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setShader(this.viewShader);
        canvas.drawCircle(this.viewWidth / 2.0f, this.viewHeight / 2.0f, this.radius, this.mPaint);
        canvas.drawBitmap(this.combBitmap, this.combBmRect, this.combDrawRectF, this.mPaint);
    }

    public SpecialCombView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14657, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14657, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension((int) measureWidth(), (int) measureHeight());
    }

    public void setCircleBackgroundColor(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14652, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14652, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearGradient linearGradient = new LinearGradient(this.viewWidth, 0.0f, 0.0f, this.viewHeight, i, i2, Shader.TileMode.CLAMP);
        this.viewShader = linearGradient;
    }

    public void setProgressColor(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14653, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14653, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, i, i2, Shader.TileMode.CLAMP);
        this.bordShader = linearGradient;
    }

    public void startScaleAnim(long j, Animator.AnimatorListener animatorListener) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), animatorListener}, this, changeQuickRedirect, false, 14659, new Class[]{Long.TYPE, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), animatorListener}, this, changeQuickRedirect, false, 14659, new Class[]{Long.TYPE, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        animateBorderView(j, animatorListener);
    }

    private void animateBorderView(long j, Animator.AnimatorListener animatorListener) {
        long j2 = j;
        Animator.AnimatorListener animatorListener2 = animatorListener;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), animatorListener2}, this, changeQuickRedirect, false, 14661, new Class[]{Long.TYPE, Animator.AnimatorListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2), animatorListener2}, this, changeQuickRedirect, false, 14661, new Class[]{Long.TYPE, Animator.AnimatorListener.class}, Void.TYPE);
            return;
        }
        if (this.borderAnimator == null) {
            this.borderAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            if (animatorListener2 != null) {
                this.borderAnimator.addListener(animatorListener2);
            }
            this.borderAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18342a;

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f2;
                    if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f18342a, false, 14662, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f18342a, false, 14662, new Class[]{ValueAnimator.class}, Void.TYPE);
                        return;
                    }
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    double d2 = (double) animatedFraction;
                    if (d2 <= 0.1d) {
                        f2 = (-animatedFraction) + 1.1f;
                    } else if (d2 <= 0.3333d) {
                        f2 = (animatedFraction * 0.4286f) + 0.9571f;
                    } else if (d2 <= 0.4333d) {
                        f2 = (-animatedFraction) + 1.4333f;
                    } else if (d2 <= 0.6667d) {
                        f2 = (animatedFraction * 0.4286f) + 0.8143f;
                    } else if (d2 <= 0.7667d) {
                        f2 = (-animatedFraction) + 1.76667f;
                    } else {
                        f2 = (animatedFraction * 0.4286f) + 0.6714f;
                    }
                    SpecialCombView.this.setScaleX(f2);
                    SpecialCombView.this.setScaleY(f2);
                    SpecialCombView.this.invalidate();
                }
            });
            this.borderAnimator.setDuration(j2);
        }
        if (this.borderAnimator.isRunning()) {
            this.borderAnimator.cancel();
            setScaleX(1.0f);
            setScaleY(1.0f);
        }
        this.borderAnimator.start();
    }

    public SpecialCombView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}

package android.support.v4.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.util.Preconditions;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularProgressDrawable extends Drawable implements Animatable {
    private static final int[] COLORS = {-16777216};
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    private static final Interpolator MATERIAL_INTERPOLATOR = new FastOutSlowInInterpolator();
    private Animator mAnimator;
    boolean mFinishing;
    private Resources mResources;
    private final Ring mRing = new Ring();
    private float mRotation;
    float mRotationCount;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProgressDrawableSize {
    }

    static class Ring {
        int mAlpha = 255;
        Path mArrow;
        int mArrowHeight;
        final Paint mArrowPaint = new Paint();
        float mArrowScale = 1.0f;
        int mArrowWidth;
        final Paint mCirclePaint = new Paint();
        int mColorIndex;
        int[] mColors;
        int mCurrentColor;
        float mEndTrim = 0.0f;
        final Paint mPaint = new Paint();
        float mRingCenterRadius;
        float mRotation = 0.0f;
        boolean mShowArrow;
        float mStartTrim = 0.0f;
        float mStartingEndTrim;
        float mStartingRotation;
        float mStartingStartTrim;
        float mStrokeWidth = 5.0f;
        final RectF mTempBounds = new RectF();

        /* access modifiers changed from: package-private */
        public float getArrowHeight() {
            return (float) this.mArrowHeight;
        }

        /* access modifiers changed from: package-private */
        public float getArrowWidth() {
            return (float) this.mArrowWidth;
        }

        /* access modifiers changed from: package-private */
        public int getAlpha() {
            return this.mAlpha;
        }

        /* access modifiers changed from: package-private */
        public float getArrowScale() {
            return this.mArrowScale;
        }

        /* access modifiers changed from: package-private */
        public float getCenterRadius() {
            return this.mRingCenterRadius;
        }

        /* access modifiers changed from: package-private */
        public int[] getColors() {
            return this.mColors;
        }

        /* access modifiers changed from: package-private */
        public float getEndTrim() {
            return this.mEndTrim;
        }

        /* access modifiers changed from: package-private */
        public float getRotation() {
            return this.mRotation;
        }

        /* access modifiers changed from: package-private */
        public boolean getShowArrow() {
            return this.mShowArrow;
        }

        /* access modifiers changed from: package-private */
        public float getStartTrim() {
            return this.mStartTrim;
        }

        /* access modifiers changed from: package-private */
        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        /* access modifiers changed from: package-private */
        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        /* access modifiers changed from: package-private */
        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        /* access modifiers changed from: package-private */
        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        /* access modifiers changed from: package-private */
        public int getBackgroundColor() {
            return this.mCirclePaint.getColor();
        }

        /* access modifiers changed from: package-private */
        public int getStartingColor() {
            return this.mColors[this.mColorIndex];
        }

        /* access modifiers changed from: package-private */
        public Paint.Cap getStrokeCap() {
            return this.mPaint.getStrokeCap();
        }

        /* access modifiers changed from: package-private */
        public void goToNextColor() {
            setColorIndex(getNextColorIndex());
        }

        /* access modifiers changed from: package-private */
        public int getNextColor() {
            return this.mColors[getNextColorIndex()];
        }

        /* access modifiers changed from: package-private */
        public int getNextColorIndex() {
            return (this.mColorIndex + 1) % this.mColors.length;
        }

        /* access modifiers changed from: package-private */
        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        /* access modifiers changed from: package-private */
        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        Ring() {
            this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mArrowPaint.setStyle(Paint.Style.FILL);
            this.mArrowPaint.setAntiAlias(true);
            this.mCirclePaint.setColor(0);
        }

        /* access modifiers changed from: package-private */
        public void setAlpha(int i) {
            this.mAlpha = i;
        }

        /* access modifiers changed from: package-private */
        public void setCenterRadius(float f2) {
            this.mRingCenterRadius = f2;
        }

        /* access modifiers changed from: package-private */
        public void setColor(int i) {
            this.mCurrentColor = i;
        }

        /* access modifiers changed from: package-private */
        public void setEndTrim(float f2) {
            this.mEndTrim = f2;
        }

        /* access modifiers changed from: package-private */
        public void setRotation(float f2) {
            this.mRotation = f2;
        }

        /* access modifiers changed from: package-private */
        public void setStartTrim(float f2) {
            this.mStartTrim = f2;
        }

        /* access modifiers changed from: package-private */
        public void setBackgroundColor(int i) {
            this.mCirclePaint.setColor(i);
        }

        /* access modifiers changed from: package-private */
        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        /* access modifiers changed from: package-private */
        public void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
            }
        }

        /* access modifiers changed from: package-private */
        public void setStrokeCap(Paint.Cap cap) {
            this.mPaint.setStrokeCap(cap);
        }

        /* access modifiers changed from: package-private */
        public void setStrokeWidth(float f2) {
            this.mStrokeWidth = f2;
            this.mPaint.setStrokeWidth(f2);
        }

        /* access modifiers changed from: package-private */
        public void setArrowScale(float f2) {
            if (f2 != this.mArrowScale) {
                this.mArrowScale = f2;
            }
        }

        /* access modifiers changed from: package-private */
        public void setColorIndex(int i) {
            this.mColorIndex = i;
            this.mCurrentColor = this.mColors[this.mColorIndex];
        }

        /* access modifiers changed from: package-private */
        public void setArrowDimensions(float f2, float f3) {
            this.mArrowWidth = (int) f2;
            this.mArrowHeight = (int) f3;
        }

        /* access modifiers changed from: package-private */
        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            float f2 = this.mRingCenterRadius + (this.mStrokeWidth / 2.0f);
            if (this.mRingCenterRadius <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f, this.mStrokeWidth / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = (this.mStartTrim + this.mRotation) * 360.0f;
            float f4 = ((this.mEndTrim + this.mRotation) * 360.0f) - f3;
            this.mPaint.setColor(this.mCurrentColor);
            this.mPaint.setAlpha(this.mAlpha);
            float f5 = this.mStrokeWidth / 2.0f;
            rectF.inset(f5, f5);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.mCirclePaint);
            float f6 = -f5;
            rectF.inset(f6, f6);
            canvas.drawArc(rectF, f3, f4, false, this.mPaint);
            drawTriangle(canvas, f3, f4, rectF);
        }

        /* access modifiers changed from: package-private */
        public void drawTriangle(Canvas canvas, float f2, float f3, RectF rectF) {
            if (this.mShowArrow) {
                if (this.mArrow == null) {
                    this.mArrow = new Path();
                    this.mArrow.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    this.mArrow.reset();
                }
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(((float) this.mArrowWidth) * this.mArrowScale, 0.0f);
                this.mArrow.lineTo((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f, ((float) this.mArrowHeight) * this.mArrowScale);
                this.mArrow.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f), rectF.centerY() + (this.mStrokeWidth / 2.0f));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mCurrentColor);
                this.mArrowPaint.setAlpha(this.mAlpha);
                canvas.save();
                canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
                canvas.restore();
            }
        }
    }

    private int evaluateColorChange(float f2, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & 255) - i6)))));
    }

    public int getOpacity() {
        return -3;
    }

    private float getRotation() {
        return this.mRotation;
    }

    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    public boolean getArrowEnabled() {
        return this.mRing.getShowArrow();
    }

    public float getArrowHeight() {
        return this.mRing.getArrowHeight();
    }

    public float getArrowScale() {
        return this.mRing.getArrowScale();
    }

    public float getArrowWidth() {
        return this.mRing.getArrowWidth();
    }

    public int getBackgroundColor() {
        return this.mRing.getBackgroundColor();
    }

    public float getCenterRadius() {
        return this.mRing.getCenterRadius();
    }

    @NonNull
    public int[] getColorSchemeColors() {
        return this.mRing.getColors();
    }

    public float getEndTrim() {
        return this.mRing.getEndTrim();
    }

    public float getProgressRotation() {
        return this.mRing.getRotation();
    }

    public float getStartTrim() {
        return this.mRing.getStartTrim();
    }

    @NonNull
    public Paint.Cap getStrokeCap() {
        return this.mRing.getStrokeCap();
    }

    public float getStrokeWidth() {
        return this.mRing.getStrokeWidth();
    }

    public boolean isRunning() {
        return this.mAnimator.isRunning();
    }

    public void stop() {
        this.mAnimator.cancel();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        invalidateSelf();
    }

    private void setupAnimators() {
        final Ring ring = this.mRing;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CircularProgressDrawable.this.updateRingColor(floatValue, ring);
                CircularProgressDrawable.this.applyTransformation(floatValue, ring, false);
                CircularProgressDrawable.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(LINEAR_INTERPOLATOR);
        ofFloat.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                CircularProgressDrawable.this.mRotationCount = 0.0f;
            }

            public void onAnimationRepeat(Animator animator) {
                CircularProgressDrawable.this.applyTransformation(1.0f, ring, true);
                ring.storeOriginals();
                ring.goToNextColor();
                if (CircularProgressDrawable.this.mFinishing) {
                    CircularProgressDrawable.this.mFinishing = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    ring.setShowArrow(false);
                    return;
                }
                CircularProgressDrawable.this.mRotationCount += 1.0f;
            }
        });
        this.mAnimator = ofFloat;
    }

    public void start() {
        this.mAnimator.cancel();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimator.setDuration(666);
            this.mAnimator.start();
            return;
        }
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        this.mAnimator.setDuration(1332);
        this.mAnimator.start();
    }

    private void setRotation(float f2) {
        this.mRotation = f2;
    }

    public void setAlpha(int i) {
        this.mRing.setAlpha(i);
        invalidateSelf();
    }

    public void setArrowEnabled(boolean z) {
        this.mRing.setShowArrow(z);
        invalidateSelf();
    }

    public void setArrowScale(float f2) {
        this.mRing.setArrowScale(f2);
        invalidateSelf();
    }

    public void setBackgroundColor(int i) {
        this.mRing.setBackgroundColor(i);
        invalidateSelf();
    }

    public void setCenterRadius(float f2) {
        this.mRing.setCenterRadius(f2);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setColorSchemeColors(@NonNull int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
        invalidateSelf();
    }

    public void setProgressRotation(float f2) {
        this.mRing.setRotation(f2);
        invalidateSelf();
    }

    public void setStrokeCap(@NonNull Paint.Cap cap) {
        this.mRing.setStrokeCap(cap);
        invalidateSelf();
    }

    public void setStrokeWidth(float f2) {
        this.mRing.setStrokeWidth(f2);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restore();
    }

    public void setStyle(int i) {
        if (i == 0) {
            setSizeParameters(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            setSizeParameters(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public CircularProgressDrawable(@NonNull Context context) {
        this.mResources = ((Context) Preconditions.checkNotNull(context)).getResources();
        this.mRing.setColors(COLORS);
        setStrokeWidth(2.5f);
        setupAnimators();
    }

    public void setArrowDimensions(float f2, float f3) {
        this.mRing.setArrowDimensions(f2, f3);
        invalidateSelf();
    }

    public void setStartEndTrim(float f2, float f3) {
        this.mRing.setStartTrim(f2);
        this.mRing.setEndTrim(f3);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public void updateRingColor(float f2, Ring ring) {
        if (f2 > 0.75f) {
            ring.setColor(evaluateColorChange((f2 - 0.75f) / 0.25f, ring.getStartingColor(), ring.getNextColor()));
        } else {
            ring.setColor(ring.getStartingColor());
        }
    }

    private void applyFinishTranslation(float f2, Ring ring) {
        updateRingColor(f2, ring);
        ring.setStartTrim(ring.getStartingStartTrim() + (((ring.getStartingEndTrim() - 0.01f) - ring.getStartingStartTrim()) * f2));
        ring.setEndTrim(ring.getStartingEndTrim());
        ring.setRotation(ring.getStartingRotation() + ((((float) (Math.floor((double) (ring.getStartingRotation() / 0.8f)) + 1.0d)) - ring.getStartingRotation()) * f2));
    }

    /* access modifiers changed from: package-private */
    public void applyTransformation(float f2, Ring ring, boolean z) {
        float f3;
        float f4;
        if (this.mFinishing) {
            applyFinishTranslation(f2, ring);
            return;
        }
        if (f2 != 1.0f || z) {
            float startingRotation = ring.getStartingRotation();
            if (f2 < 0.5f) {
                float startingStartTrim = ring.getStartingStartTrim();
                float f5 = startingStartTrim;
                f3 = (MATERIAL_INTERPOLATOR.getInterpolation(f2 / 0.5f) * 0.79f) + 0.01f + startingStartTrim;
                f4 = f5;
            } else {
                f3 = ring.getStartingStartTrim() + 0.79f;
                f4 = f3 - (((1.0f - MATERIAL_INTERPOLATOR.getInterpolation((f2 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            ring.setStartTrim(f4);
            ring.setEndTrim(f3);
            ring.setRotation(startingRotation + (0.20999998f * f2));
            setRotation((f2 + this.mRotationCount) * 216.0f);
        }
    }

    private void setSizeParameters(float f2, float f3, float f4, float f5) {
        Ring ring = this.mRing;
        float f6 = this.mResources.getDisplayMetrics().density;
        ring.setStrokeWidth(f3 * f6);
        ring.setCenterRadius(f2 * f6);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f4 * f6, f5 * f6);
    }
}

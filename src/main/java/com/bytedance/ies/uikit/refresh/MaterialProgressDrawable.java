package com.bytedance.ies.uikit.refresh;

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
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

public class MaterialProgressDrawable extends Drawable implements Animatable {
    private static final Interpolator EASE_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    public static final Interpolator END_CURVE_INTERPOLATOR = new EndCurveInterpolator();
    private static final Interpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final Interpolator START_CURVE_INTERPOLATOR = new StartCurveInterpolator();
    private final int[] COLORS = {-16777216};
    private Animation mAnimation;
    private final ArrayList<Animation> mAnimators = new ArrayList<>();
    private final Drawable.Callback mCallback = new Drawable.Callback() {
        public void invalidateDrawable(Drawable drawable) {
            MaterialProgressDrawable.this.invalidateSelf();
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            MaterialProgressDrawable.this.unscheduleSelf(runnable);
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            MaterialProgressDrawable.this.scheduleSelf(runnable, j);
        }
    };
    boolean mFinishing;
    private double mHeight;
    private View mParent;
    private Resources mResources;
    private final Ring mRing;
    private float mRotation;
    public float mRotationCount;
    private double mWidth;

    @Retention(RetentionPolicy.CLASS)
    public @interface ProgressDrawableSize {
    }

    static class EndCurveInterpolator extends AccelerateDecelerateInterpolator {
        private EndCurveInterpolator() {
        }

        public float getInterpolation(float f2) {
            return super.getInterpolation(Math.max(0.0f, (f2 - 0.5f) * 2.0f));
        }
    }

    static class Ring {
        private int mAlpha;
        private Path mArrow;
        private int mArrowHeight;
        private final Paint mArrowPaint = new Paint();
        private float mArrowScale;
        private int mArrowWidth;
        private int mBackgroundColor;
        private final Drawable.Callback mCallback;
        private final Paint mCirclePaint = new Paint();
        private int mColorIndex;
        private int[] mColors;
        private float mEndTrim = 0.0f;
        private final Paint mPaint = new Paint();
        private double mRingCenterRadius;
        private float mRotation = 0.0f;
        private boolean mShowArrow;
        private float mStartTrim = 0.0f;
        private float mStartingEndTrim;
        private float mStartingRotation;
        private float mStartingStartTrim;
        private float mStrokeInset = 2.5f;
        private float mStrokeWidth = 5.0f;
        private final RectF mTempBounds = new RectF();

        public int getAlpha() {
            return this.mAlpha;
        }

        public double getCenterRadius() {
            return this.mRingCenterRadius;
        }

        public float getEndTrim() {
            return this.mEndTrim;
        }

        public float getInsets() {
            return this.mStrokeInset;
        }

        public float getRotation() {
            return this.mRotation;
        }

        public float getStartTrim() {
            return this.mStartTrim;
        }

        public float getStartingEndTrim() {
            return this.mStartingEndTrim;
        }

        public float getStartingRotation() {
            return this.mStartingRotation;
        }

        public float getStartingStartTrim() {
            return this.mStartingStartTrim;
        }

        public float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        private void invalidateSelf() {
            this.mCallback.invalidateDrawable(null);
        }

        public void goToNextColor() {
            this.mColorIndex = (this.mColorIndex + 1) % this.mColors.length;
        }

        public void storeOriginals() {
            this.mStartingStartTrim = this.mStartTrim;
            this.mStartingEndTrim = this.mEndTrim;
            this.mStartingRotation = this.mRotation;
        }

        public void resetOriginals() {
            this.mStartingStartTrim = 0.0f;
            this.mStartingEndTrim = 0.0f;
            this.mStartingRotation = 0.0f;
            setStartTrim(0.0f);
            setEndTrim(0.0f);
            setRotation(0.0f);
        }

        public void setAlpha(int i) {
            this.mAlpha = i;
        }

        public void setBackgroundColor(int i) {
            this.mBackgroundColor = i;
        }

        public void setCenterRadius(double d2) {
            this.mRingCenterRadius = d2;
        }

        public void setColorIndex(int i) {
            this.mColorIndex = i;
        }

        public void setColors(@NonNull int[] iArr) {
            this.mColors = iArr;
            setColorIndex(0);
        }

        public void setEndTrim(float f2) {
            this.mEndTrim = f2;
            invalidateSelf();
        }

        public void setRotation(float f2) {
            this.mRotation = f2;
            invalidateSelf();
        }

        public void setStartTrim(float f2) {
            this.mStartTrim = f2;
            invalidateSelf();
        }

        public void setArrowScale(float f2) {
            if (f2 != this.mArrowScale) {
                this.mArrowScale = f2;
                invalidateSelf();
            }
        }

        public void setColorFilter(ColorFilter colorFilter) {
            this.mPaint.setColorFilter(colorFilter);
            invalidateSelf();
        }

        public void setShowArrow(boolean z) {
            if (this.mShowArrow != z) {
                this.mShowArrow = z;
                invalidateSelf();
            }
        }

        public void setStrokeWidth(float f2) {
            this.mStrokeWidth = f2;
            this.mPaint.setStrokeWidth(f2);
            invalidateSelf();
        }

        public Ring(Drawable.Callback callback) {
            this.mCallback = callback;
            this.mPaint.setStrokeCap(Paint.Cap.SQUARE);
            this.mPaint.setAntiAlias(true);
            this.mPaint.setStyle(Paint.Style.STROKE);
            this.mArrowPaint.setStyle(Paint.Style.FILL);
            this.mArrowPaint.setAntiAlias(true);
        }

        public void setArrowDimensions(float f2, float f3) {
            this.mArrowWidth = (int) f2;
            this.mArrowHeight = (int) f3;
        }

        public void setInsets(int i, int i2) {
            float f2;
            float min = (float) Math.min(i, i2);
            if (this.mRingCenterRadius <= 0.0d || min < 0.0f) {
                f2 = (float) Math.ceil((double) (this.mStrokeWidth / 2.0f));
            } else {
                double d2 = (double) (min / 2.0f);
                double d3 = this.mRingCenterRadius;
                Double.isNaN(d2);
                f2 = (float) (d2 - d3);
            }
            this.mStrokeInset = f2;
        }

        public void draw(Canvas canvas, Rect rect) {
            RectF rectF = this.mTempBounds;
            rectF.set(rect);
            rectF.inset(this.mStrokeInset, this.mStrokeInset);
            float f2 = (this.mStartTrim + this.mRotation) * 360.0f;
            float f3 = ((this.mEndTrim + this.mRotation) * 360.0f) - f2;
            this.mPaint.setColor(this.mColors[this.mColorIndex]);
            canvas.drawArc(rectF, f2, f3, false, this.mPaint);
            drawTriangle(canvas, f2, f3, rect);
            if (this.mAlpha < 255) {
                this.mCirclePaint.setColor(this.mBackgroundColor);
                this.mCirclePaint.setAlpha(255 - this.mAlpha);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), (float) (rect.width() / 2), this.mCirclePaint);
            }
        }

        private void drawTriangle(Canvas canvas, float f2, float f3, Rect rect) {
            if (this.mShowArrow) {
                if (this.mArrow == null) {
                    this.mArrow = new Path();
                    this.mArrow.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    this.mArrow.reset();
                }
                float f4 = ((float) (((int) this.mStrokeInset) / 2)) * this.mArrowScale;
                double cos = this.mRingCenterRadius * Math.cos(0.0d);
                double exactCenterX = (double) rect.exactCenterX();
                Double.isNaN(exactCenterX);
                double sin = this.mRingCenterRadius * Math.sin(0.0d);
                double exactCenterY = (double) rect.exactCenterY();
                Double.isNaN(exactCenterY);
                this.mArrow.moveTo(0.0f, 0.0f);
                this.mArrow.lineTo(((float) this.mArrowWidth) * this.mArrowScale, 0.0f);
                this.mArrow.lineTo((((float) this.mArrowWidth) * this.mArrowScale) / 2.0f, ((float) this.mArrowHeight) * this.mArrowScale);
                this.mArrow.offset(((float) (cos + exactCenterX)) - f4, (float) (sin + exactCenterY));
                this.mArrow.close();
                this.mArrowPaint.setColor(this.mColors[this.mColorIndex]);
                canvas.rotate((f2 + f3) - 5.0f, rect.exactCenterX(), rect.exactCenterY());
                canvas.drawPath(this.mArrow, this.mArrowPaint);
            }
        }
    }

    static class StartCurveInterpolator extends AccelerateDecelerateInterpolator {
        private StartCurveInterpolator() {
        }

        public float getInterpolation(float f2) {
            return super.getInterpolation(Math.min(1.0f, f2 * 2.0f));
        }
    }

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return (int) this.mHeight;
    }

    public int getIntrinsicWidth() {
        return (int) this.mWidth;
    }

    private float getRotation() {
        return this.mRotation;
    }

    public int getAlpha() {
        return this.mRing.getAlpha();
    }

    private void setupAnimators() {
        final Ring ring = this.mRing;
        AnonymousClass1 r1 = new Animation() {
            public void applyTransformation(float f2, Transformation transformation) {
                if (MaterialProgressDrawable.this.mFinishing) {
                    MaterialProgressDrawable.this.applyFinishTranslation(f2, ring);
                    return;
                }
                double strokeWidth = (double) ring.getStrokeWidth();
                Double.isNaN(strokeWidth);
                float radians = (float) Math.toRadians(strokeWidth / (ring.getCenterRadius() * 6.283185307179586d));
                float startingEndTrim = ring.getStartingEndTrim();
                float startingStartTrim = ring.getStartingStartTrim();
                float startingRotation = ring.getStartingRotation();
                ring.setEndTrim(startingEndTrim + ((0.8f - radians) * MaterialProgressDrawable.START_CURVE_INTERPOLATOR.getInterpolation(f2)));
                ring.setStartTrim(startingStartTrim + (MaterialProgressDrawable.END_CURVE_INTERPOLATOR.getInterpolation(f2) * 0.8f));
                ring.setRotation(startingRotation + (0.25f * f2));
                MaterialProgressDrawable.this.setRotation((f2 * 144.0f) + ((MaterialProgressDrawable.this.mRotationCount / 5.0f) * 720.0f));
            }
        };
        r1.setRepeatCount(-1);
        r1.setRepeatMode(1);
        r1.setInterpolator(LINEAR_INTERPOLATOR);
        r1.setAnimationListener(new Animation.AnimationListener() {
            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
                MaterialProgressDrawable.this.mRotationCount = 0.0f;
            }

            public void onAnimationRepeat(Animation animation) {
                ring.storeOriginals();
                ring.goToNextColor();
                ring.setStartTrim(ring.getEndTrim());
                if (MaterialProgressDrawable.this.mFinishing) {
                    MaterialProgressDrawable.this.mFinishing = false;
                    animation.setDuration(1333);
                    ring.setShowArrow(false);
                    return;
                }
                MaterialProgressDrawable.this.mRotationCount = (MaterialProgressDrawable.this.mRotationCount + 1.0f) % 5.0f;
            }
        });
        this.mAnimation = r1;
    }

    public void stop() {
        this.mParent.clearAnimation();
        setRotation(0.0f);
        this.mRing.setShowArrow(false);
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
    }

    public boolean isRunning() {
        ArrayList<Animation> arrayList = this.mAnimators;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public void start() {
        this.mAnimation.reset();
        this.mRing.storeOriginals();
        if (this.mRing.getEndTrim() != this.mRing.getStartTrim()) {
            this.mFinishing = true;
            this.mAnimation.setDuration(666);
            this.mParent.startAnimation(this.mAnimation);
            return;
        }
        this.mRing.setColorIndex(0);
        this.mRing.resetOriginals();
        this.mAnimation.setDuration(1333);
        this.mParent.startAnimation(this.mAnimation);
    }

    public void setAlpha(int i) {
        this.mRing.setAlpha(i);
    }

    public void setArrowScale(float f2) {
        this.mRing.setArrowScale(f2);
    }

    public void setBackgroundColor(int i) {
        this.mRing.setBackgroundColor(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.mRing.setColorFilter(colorFilter);
    }

    public void setProgressRotation(float f2) {
        this.mRing.setRotation(f2);
    }

    /* access modifiers changed from: package-private */
    public void setRotation(float f2) {
        this.mRotation = f2;
        invalidateSelf();
    }

    public void showArrow(boolean z) {
        this.mRing.setShowArrow(z);
    }

    public void setColorSchemeColors(int... iArr) {
        this.mRing.setColors(iArr);
        this.mRing.setColorIndex(0);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.mRotation, bounds.exactCenterX(), bounds.exactCenterY());
        this.mRing.draw(canvas, bounds);
        canvas.restoreToCount(save);
    }

    public void updateSizes(@ProgressDrawableSize int i) {
        if (i == 0) {
            setSizeParameters(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            setSizeParameters(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public void setStartEndTrim(float f2, float f3) {
        this.mRing.setStartTrim(f2);
        this.mRing.setEndTrim(f3);
    }

    public MaterialProgressDrawable(Context context, View view) {
        this.mParent = view;
        this.mResources = context.getResources();
        this.mRing = new Ring(this.mCallback);
        this.mRing.setColors(this.COLORS);
        updateSizes(1);
        setupAnimators();
    }

    public void applyFinishTranslation(float f2, Ring ring) {
        ring.setStartTrim(ring.getStartingStartTrim() + ((ring.getStartingEndTrim() - ring.getStartingStartTrim()) * f2));
        ring.setRotation(ring.getStartingRotation() + ((((float) (Math.floor((double) (ring.getStartingRotation() / 0.8f)) + 1.0d)) - ring.getStartingRotation()) * f2));
    }

    private void setSizeParameters(double d2, double d3, double d4, double d5, float f2, float f3) {
        Ring ring = this.mRing;
        float f4 = this.mResources.getDisplayMetrics().density;
        double d6 = (double) f4;
        Double.isNaN(d6);
        this.mWidth = d2 * d6;
        Double.isNaN(d6);
        this.mHeight = d3 * d6;
        ring.setStrokeWidth(((float) d5) * f4);
        Double.isNaN(d6);
        ring.setCenterRadius(d4 * d6);
        ring.setColorIndex(0);
        ring.setArrowDimensions(f2 * f4, f3 * f4);
        ring.setInsets((int) this.mWidth, (int) this.mHeight);
    }
}

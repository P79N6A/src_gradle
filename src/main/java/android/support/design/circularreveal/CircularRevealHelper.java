package android.support.design.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.design.circularreveal.CircularRevealWidget;
import android.support.design.widget.MathUtils;
import android.view.View;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularRevealHelper {
    public static final int STRATEGY;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    @Nullable
    private Drawable overlayDrawable;
    @Nullable
    private CircularRevealWidget.RevealInfo revealInfo;
    private final Paint revealPaint = new Paint(7);
    private final Path revealPath = new Path();
    private final Paint scrimPaint = new Paint(1);
    private final View view;

    public interface Delegate {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.overlayDrawable;
    }

    @ColorInt
    public int getCircularRevealScrimColor() {
        return this.scrimPaint.getColor();
    }

    private boolean shouldDrawOverlayDrawable() {
        if (this.buildingCircularRevealCache || this.overlayDrawable == null || this.revealInfo == null) {
            return false;
        }
        return true;
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            STRATEGY = 2;
        } else if (Build.VERSION.SDK_INT >= 18) {
            STRATEGY = 1;
        } else {
            STRATEGY = 0;
        }
    }

    private boolean shouldDrawScrim() {
        if (this.buildingCircularRevealCache || Color.alpha(this.scrimPaint.getColor()) == 0) {
            return false;
        }
        return true;
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.hasCircularRevealCache = false;
            this.view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            this.view.invalidate();
        }
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        if (this.revealInfo == null) {
            return null;
        }
        CircularRevealWidget.RevealInfo revealInfo2 = new CircularRevealWidget.RevealInfo(this.revealInfo);
        if (revealInfo2.isInvalid()) {
            revealInfo2.radius = getDistanceToFurthestCorner(revealInfo2);
        }
        return revealInfo2;
    }

    public boolean isOpaque() {
        if (!this.delegate.actualIsOpaque() || shouldDrawCircularReveal()) {
            return false;
        }
        return true;
    }

    private void invalidateRevealInfo() {
        if (STRATEGY == 1) {
            this.revealPath.rewind();
            if (this.revealInfo != null) {
                this.revealPath.addCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, Path.Direction.CW);
            }
        }
        this.view.invalidate();
    }

    private boolean shouldDrawCircularReveal() {
        boolean z;
        if (this.revealInfo == null || this.revealInfo.isInvalid()) {
            z = true;
        } else {
            z = false;
        }
        if (STRATEGY == 0) {
            if (z || !this.hasCircularRevealCache) {
                return false;
            }
            return true;
        } else if (!z) {
            return true;
        } else {
            return false;
        }
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.buildingCircularRevealCache = true;
            this.hasCircularRevealCache = false;
            this.view.buildDrawingCache();
            Bitmap drawingCache = this.view.getDrawingCache();
            if (!(drawingCache != null || this.view.getWidth() == 0 || this.view.getHeight() == 0)) {
                drawingCache = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Bitmap.Config.ARGB_8888);
                this.view.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.revealPaint;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = true;
        }
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.overlayDrawable = drawable;
        this.view.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.scrimPaint.setColor(i);
        this.view.invalidate();
    }

    private float getDistanceToFurthestCorner(CircularRevealWidget.RevealInfo revealInfo2) {
        return MathUtils.distanceToFurthestCorner(revealInfo2.centerX, revealInfo2.centerY, 0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight());
    }

    public CircularRevealHelper(Delegate delegate2) {
        this.delegate = delegate2;
        this.view = (View) delegate2;
        this.view.setWillNotDraw(false);
        this.scrimPaint.setColor(0);
    }

    private void drawDebugMode(Canvas canvas) {
        this.delegate.actualDraw(canvas);
        if (shouldDrawScrim()) {
            canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
        }
        if (shouldDrawCircularReveal()) {
            drawDebugCircle(canvas, -16777216, 10.0f);
            drawDebugCircle(canvas, -65536, 5.0f);
        }
        drawOverlayDrawable(canvas);
    }

    private void drawOverlayDrawable(Canvas canvas) {
        if (shouldDrawOverlayDrawable()) {
            Rect bounds = this.overlayDrawable.getBounds();
            float width = this.revealInfo.centerX - (((float) bounds.width()) / 2.0f);
            float height = this.revealInfo.centerY - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.overlayDrawable.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo2) {
        if (revealInfo2 == null) {
            this.revealInfo = null;
        } else {
            if (this.revealInfo == null) {
                this.revealInfo = new CircularRevealWidget.RevealInfo(revealInfo2);
            } else {
                this.revealInfo.set(revealInfo2);
            }
            if (MathUtils.geq(revealInfo2.radius, getDistanceToFurthestCorner(revealInfo2), 1.0E-4f)) {
                this.revealInfo.radius = Float.MAX_VALUE;
            }
        }
        invalidateRevealInfo();
    }

    public void draw(Canvas canvas) {
        if (shouldDrawCircularReveal()) {
            switch (STRATEGY) {
                case 0:
                    canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.revealPaint);
                    if (shouldDrawScrim()) {
                        canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
                        break;
                    }
                    break;
                case 1:
                    int save = canvas.save();
                    canvas.clipPath(this.revealPath);
                    this.delegate.actualDraw(canvas);
                    if (shouldDrawScrim()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.scrimPaint);
                    }
                    canvas.restoreToCount(save);
                    break;
                case 2:
                    this.delegate.actualDraw(canvas);
                    if (shouldDrawScrim()) {
                        canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.scrimPaint);
                        break;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unsupported strategy " + STRATEGY);
            }
        } else {
            this.delegate.actualDraw(canvas);
            if (shouldDrawScrim()) {
                canvas.drawRect(0.0f, 0.0f, (float) this.view.getWidth(), (float) this.view.getHeight(), this.scrimPaint);
            }
        }
        drawOverlayDrawable(canvas);
    }

    private void drawDebugCircle(Canvas canvas, int i, float f2) {
        this.debugPaint.setColor(i);
        this.debugPaint.setStrokeWidth(f2);
        canvas.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius - (f2 / 2.0f), this.debugPaint);
    }
}

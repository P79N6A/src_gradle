package android.support.design.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.design.internal.ViewUtils;
import android.support.design.resources.MaterialResources;
import android.support.design.ripple.RippleUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.ViewCompat;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP;
    @Nullable
    private GradientDrawable backgroundDrawableLollipop;
    private boolean backgroundOverwritten = false;
    @Nullable
    private ColorStateList backgroundTint;
    @Nullable
    private PorterDuff.Mode backgroundTintMode;
    private final Rect bounds = new Rect();
    private final Paint buttonStrokePaint = new Paint(1);
    @Nullable
    private GradientDrawable colorableBackgroundDrawableCompat;
    private int cornerRadius;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    @Nullable
    private GradientDrawable maskDrawableLollipop;
    private final MaterialButton materialButton;
    private final RectF rectF = new RectF();
    @Nullable
    private ColorStateList rippleColor;
    @Nullable
    private GradientDrawable rippleDrawableCompat;
    @Nullable
    private ColorStateList strokeColor;
    @Nullable
    private GradientDrawable strokeDrawableLollipop;
    private int strokeWidth;
    @Nullable
    private Drawable tintableBackgroundDrawableCompat;
    @Nullable
    private Drawable tintableRippleDrawableCompat;

    /* access modifiers changed from: package-private */
    public int getCornerRadius() {
        return this.cornerRadius;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    /* access modifiers changed from: package-private */
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    /* access modifiers changed from: package-private */
    public ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    /* access modifiers changed from: package-private */
    public boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        IS_LOLLIPOP = z;
    }

    private void updateStroke() {
        if (!IS_LOLLIPOP || this.strokeDrawableLollipop == null) {
            if (!IS_LOLLIPOP) {
                this.materialButton.invalidate();
            }
            return;
        }
        this.materialButton.setInternalBackground(createBackgroundLollipop());
    }

    private void updateTintAndTintModeLollipop() {
        if (this.backgroundDrawableLollipop != null) {
            DrawableCompat.setTintList(this.backgroundDrawableLollipop, this.backgroundTint);
            if (this.backgroundTintMode != null) {
                DrawableCompat.setTintMode(this.backgroundDrawableLollipop, this.backgroundTintMode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    @Nullable
    private GradientDrawable unwrapBackgroundDrawable() {
        if (!IS_LOLLIPOP || this.materialButton.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
    }

    @Nullable
    private GradientDrawable unwrapStrokeDrawable() {
        if (!IS_LOLLIPOP || this.materialButton.getBackground() == null) {
            return null;
        }
        return (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) this.materialButton.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
    }

    private Drawable createBackgroundCompat() {
        this.colorableBackgroundDrawableCompat = new GradientDrawable();
        this.colorableBackgroundDrawableCompat.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.colorableBackgroundDrawableCompat.setColor(-1);
        this.tintableBackgroundDrawableCompat = DrawableCompat.wrap(this.colorableBackgroundDrawableCompat);
        DrawableCompat.setTintList(this.tintableBackgroundDrawableCompat, this.backgroundTint);
        if (this.backgroundTintMode != null) {
            DrawableCompat.setTintMode(this.tintableBackgroundDrawableCompat, this.backgroundTintMode);
        }
        this.rippleDrawableCompat = new GradientDrawable();
        this.rippleDrawableCompat.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.rippleDrawableCompat.setColor(-1);
        this.tintableRippleDrawableCompat = DrawableCompat.wrap(this.rippleDrawableCompat);
        DrawableCompat.setTintList(this.tintableRippleDrawableCompat, this.rippleColor);
        return wrapDrawableWithInset(new LayerDrawable(new Drawable[]{this.tintableBackgroundDrawableCompat, this.tintableRippleDrawableCompat}));
    }

    @TargetApi(21)
    private Drawable createBackgroundLollipop() {
        this.backgroundDrawableLollipop = new GradientDrawable();
        this.backgroundDrawableLollipop.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.backgroundDrawableLollipop.setColor(-1);
        updateTintAndTintModeLollipop();
        this.strokeDrawableLollipop = new GradientDrawable();
        this.strokeDrawableLollipop.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.strokeDrawableLollipop.setColor(0);
        this.strokeDrawableLollipop.setStroke(this.strokeWidth, this.strokeColor);
        InsetDrawable wrapDrawableWithInset = wrapDrawableWithInset(new LayerDrawable(new Drawable[]{this.backgroundDrawableLollipop, this.strokeDrawableLollipop}));
        this.maskDrawableLollipop = new GradientDrawable();
        this.maskDrawableLollipop.setCornerRadius(((float) this.cornerRadius) + 1.0E-5f);
        this.maskDrawableLollipop.setColor(-1);
        return new MaterialButtonBackgroundDrawable(RippleUtils.convertToRippleDrawableColor(this.rippleColor), wrapDrawableWithInset, this.maskDrawableLollipop);
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        InsetDrawable insetDrawable = new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
        return insetDrawable;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(int i) {
        if (this.strokeWidth != i) {
            this.strokeWidth = i;
            this.buttonStrokePaint.setStrokeWidth((float) i);
            updateStroke();
        }
    }

    public MaterialButtonHelper(MaterialButton materialButton2) {
        this.materialButton = materialButton2;
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundColor(int i) {
        if (!IS_LOLLIPOP || this.backgroundDrawableLollipop == null) {
            if (!IS_LOLLIPOP && this.colorableBackgroundDrawableCompat != null) {
                this.colorableBackgroundDrawableCompat.setColor(i);
            }
            return;
        }
        this.backgroundDrawableLollipop.setColor(i);
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.strokeColor != colorStateList) {
            this.strokeColor = colorStateList;
            Paint paint = this.buttonStrokePaint;
            int i = 0;
            if (colorStateList != null) {
                i = colorStateList.getColorForState(this.materialButton.getDrawableState(), 0);
            }
            paint.setColor(i);
            updateStroke();
        }
    }

    /* access modifiers changed from: package-private */
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (this.backgroundTint != colorStateList) {
            this.backgroundTint = colorStateList;
            if (IS_LOLLIPOP) {
                updateTintAndTintModeLollipop();
            } else if (this.tintableBackgroundDrawableCompat != null) {
                DrawableCompat.setTintList(this.tintableBackgroundDrawableCompat, this.backgroundTint);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (IS_LOLLIPOP) {
                updateTintAndTintModeLollipop();
            } else if (!(this.tintableBackgroundDrawableCompat == null || this.backgroundTintMode == null)) {
                DrawableCompat.setTintMode(this.tintableBackgroundDrawableCompat, this.backgroundTintMode);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            if (IS_LOLLIPOP && (this.materialButton.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(colorStateList);
            } else if (!IS_LOLLIPOP && this.tintableRippleDrawableCompat != null) {
                DrawableCompat.setTintList(this.tintableRippleDrawableCompat, colorStateList);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void drawStroke(@Nullable Canvas canvas) {
        if (canvas != null && this.strokeColor != null && this.strokeWidth > 0) {
            this.bounds.set(this.materialButton.getBackground().getBounds());
            this.rectF.set(((float) this.bounds.left) + (((float) this.strokeWidth) / 2.0f) + ((float) this.insetLeft), ((float) this.bounds.top) + (((float) this.strokeWidth) / 2.0f) + ((float) this.insetTop), (((float) this.bounds.right) - (((float) this.strokeWidth) / 2.0f)) - ((float) this.insetRight), (((float) this.bounds.bottom) - (((float) this.strokeWidth) / 2.0f)) - ((float) this.insetBottom));
            float f2 = ((float) this.cornerRadius) - (((float) this.strokeWidth) / 2.0f);
            canvas.drawRoundRect(this.rectF, f2, f2, this.buttonStrokePaint);
        }
    }

    /* access modifiers changed from: package-private */
    public void setCornerRadius(int i) {
        if (this.cornerRadius != i) {
            this.cornerRadius = i;
            if (IS_LOLLIPOP && this.backgroundDrawableLollipop != null && this.strokeDrawableLollipop != null && this.maskDrawableLollipop != null) {
                if (Build.VERSION.SDK_INT == 21) {
                    float f2 = ((float) i) + 1.0E-5f;
                    unwrapBackgroundDrawable().setCornerRadius(f2);
                    unwrapStrokeDrawable().setCornerRadius(f2);
                }
                float f3 = ((float) i) + 1.0E-5f;
                this.backgroundDrawableLollipop.setCornerRadius(f3);
                this.strokeDrawableLollipop.setCornerRadius(f3);
                this.maskDrawableLollipop.setCornerRadius(f3);
            } else if (!(IS_LOLLIPOP || this.colorableBackgroundDrawableCompat == null || this.rippleDrawableCompat == null)) {
                float f4 = ((float) i) + 1.0E-5f;
                this.colorableBackgroundDrawableCompat.setCornerRadius(f4);
                this.rippleDrawableCompat.setCornerRadius(f4);
                this.materialButton.invalidate();
            }
        }
    }

    public void loadFromAttributes(TypedArray typedArray) {
        Drawable drawable;
        int i = 0;
        this.insetLeft = typedArray.getDimensionPixelOffset(0, 0);
        this.insetRight = typedArray.getDimensionPixelOffset(1, 0);
        this.insetTop = typedArray.getDimensionPixelOffset(2, 0);
        this.insetBottom = typedArray.getDimensionPixelOffset(3, 0);
        this.cornerRadius = typedArray.getDimensionPixelSize(6, 0);
        this.strokeWidth = typedArray.getDimensionPixelSize(15, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(typedArray.getInt(5, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, 4);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, 14);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), typedArray, 13);
        this.buttonStrokePaint.setStyle(Paint.Style.STROKE);
        this.buttonStrokePaint.setStrokeWidth((float) this.strokeWidth);
        Paint paint = this.buttonStrokePaint;
        if (this.strokeColor != null) {
            i = this.strokeColor.getColorForState(this.materialButton.getDrawableState(), 0);
        }
        paint.setColor(i);
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        MaterialButton materialButton2 = this.materialButton;
        if (IS_LOLLIPOP) {
            drawable = createBackgroundLollipop();
        } else {
            drawable = createBackgroundCompat();
        }
        materialButton2.setInternalBackground(drawable);
        ViewCompat.setPaddingRelative(this.materialButton, paddingStart + this.insetLeft, paddingTop + this.insetTop, paddingEnd + this.insetRight, paddingBottom + this.insetBottom);
    }

    /* access modifiers changed from: package-private */
    public void updateMaskBounds(int i, int i2) {
        if (this.maskDrawableLollipop != null) {
            this.maskDrawableLollipop.setBounds(this.insetLeft, this.insetTop, i2 - this.insetRight, i - this.insetBottom);
        }
    }
}

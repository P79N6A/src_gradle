package android.support.design.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.annotation.AnimatorRes;
import android.support.annotation.AttrRes;
import android.support.annotation.BoolRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.annotation.XmlRes;
import android.support.design.R$styleable;
import android.support.design.animation.MotionSpec;
import android.support.design.canvas.CanvasCompat;
import android.support.design.drawable.DrawableUtils;
import android.support.design.internal.ThemeEnforcement;
import android.support.design.resources.MaterialResources;
import android.support.design.resources.TextAppearance;
import android.support.design.ripple.RippleUtils;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.graphics.drawable.TintAwareDrawable;
import android.support.v4.text.BidiFormatter;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.ss.android.ugc.aweme.C0906R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

public class ChipDrawable extends Drawable implements Drawable.Callback, TintAwareDrawable {
    private static final int[] DEFAULT_STATE = {16842910};
    private int alpha = 255;
    private boolean checkable;
    @Nullable
    private Drawable checkedIcon;
    private boolean checkedIconVisible;
    @Nullable
    private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    @Nullable
    private Drawable chipIcon;
    private float chipIconSize;
    @Nullable
    private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint = new Paint(1);
    private float chipStartPadding;
    @Nullable
    private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    @Nullable
    private Drawable closeIcon;
    @Nullable
    private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    @Nullable
    private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    @Nullable
    private ColorFilter colorFilter;
    @Nullable
    private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    @ColorInt
    private int currentChipBackgroundColor;
    @ColorInt
    private int currentChipStrokeColor;
    @ColorInt
    private int currentCompatRippleColor;
    @ColorInt
    private int currentTextColor;
    @ColorInt
    private int currentTint;
    @Nullable
    private final Paint debugPaint;
    private WeakReference<Delegate> delegate = new WeakReference<>(null);
    private final ResourcesCompat.FontCallback fontCallback = new ResourcesCompat.FontCallback() {
        public void onFontRetrievalFailed(int i) {
        }

        public void onFontRetrieved(@NonNull Typeface typeface) {
            ChipDrawable.this.textWidthDirty = true;
            ChipDrawable.this.onSizeChange();
            ChipDrawable.this.invalidateSelf();
        }
    };
    private final Paint.FontMetrics fontMetrics = new Paint.FontMetrics();
    @Nullable
    private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private int maxWidth;
    private final PointF pointF = new PointF();
    @Nullable
    private CharSequence rawText;
    private final RectF rectF = new RectF();
    @Nullable
    private ColorStateList rippleColor;
    private boolean shouldDrawText;
    @Nullable
    private MotionSpec showMotionSpec;
    @Nullable
    private TextAppearance textAppearance;
    private float textEndPadding;
    private final TextPaint textPaint = new TextPaint(1);
    private float textStartPadding;
    private float textWidth;
    public boolean textWidthDirty = true;
    @Nullable
    private ColorStateList tint;
    @Nullable
    private PorterDuffColorFilter tintFilter;
    @Nullable
    private PorterDuff.Mode tintMode = PorterDuff.Mode.SRC_IN;
    private TextUtils.TruncateAt truncateAt;
    @Nullable
    private CharSequence unicodeWrappedText;
    private boolean useCompatRipple;

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    public int getOpacity() {
        return -3;
    }

    public int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    public int getAlpha() {
        return this.alpha;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @NonNull
    public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    @Nullable
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @Nullable
    public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    @Px
    public int getMaxWidth() {
        return this.maxWidth;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable
    public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @NonNull
    public CharSequence getText() {
        return this.rawText;
    }

    @Nullable
    public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    @Deprecated
    public boolean isCheckedIconEnabled() {
        return isCheckedIconVisible();
    }

    @Deprecated
    public boolean isChipIconEnabled() {
        return isChipIconVisible();
    }

    @Deprecated
    public boolean isCloseIconEnabled() {
        return isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return isStateful(this.closeIcon);
    }

    private boolean canShowCheckedIcon() {
        if (!this.checkedIconVisible || this.checkedIcon == null || !this.checkable) {
            return false;
        }
        return true;
    }

    @Nullable
    private ColorFilter getTintColorFilter() {
        if (this.colorFilter != null) {
            return this.colorFilter;
        }
        return this.tintFilter;
    }

    private boolean showsCheckedIcon() {
        if (!this.checkedIconVisible || this.checkedIcon == null || !this.currentChecked) {
            return false;
        }
        return true;
    }

    private boolean showsChipIcon() {
        if (!this.chipIconVisible || this.chipIcon == null) {
            return false;
        }
        return true;
    }

    private boolean showsCloseIcon() {
        if (!this.closeIconVisible || this.closeIcon == null) {
            return false;
        }
        return true;
    }

    private void updateCompatRippleColor() {
        ColorStateList colorStateList;
        if (this.useCompatRipple) {
            colorStateList = RippleUtils.convertToRippleDrawableColor(this.rippleColor);
        } else {
            colorStateList = null;
        }
        this.compatRippleColor = colorStateList;
    }

    @Nullable
    public Drawable getChipIcon() {
        if (this.chipIcon != null) {
            return DrawableCompat.unwrap(this.chipIcon);
        }
        return null;
    }

    @Nullable
    public Drawable getCloseIcon() {
        if (this.closeIcon != null) {
            return DrawableCompat.unwrap(this.closeIcon);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onSizeChange() {
        Delegate delegate2 = (Delegate) this.delegate.get();
        if (delegate2 != null) {
            delegate2.onChipDrawableSizeChange();
        }
    }

    private float calculateCloseIconWidth() {
        if (showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }
        return 0.0f;
    }

    private float calculateTextCenterFromBaseline() {
        this.textPaint.getFontMetrics(this.fontMetrics);
        return (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
    }

    private float getTextWidth() {
        if (!this.textWidthDirty) {
            return this.textWidth;
        }
        this.textWidth = calculateTextWidth(this.unicodeWrappedText);
        this.textWidthDirty = false;
        return this.textWidth;
    }

    /* access modifiers changed from: package-private */
    public float calculateChipIconWidth() {
        if (showsChipIcon() || showsCheckedIcon()) {
            return this.iconStartPadding + this.chipIconSize + this.iconEndPadding;
        }
        return 0.0f;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding + getTextWidth() + this.textEndPadding + calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    public boolean isStateful() {
        if (isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor) || ((this.useCompatRipple && isStateful(this.compatRippleColor)) || isStateful(this.textAppearance) || canShowCheckedIcon() || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint))) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i) {
        setChipIconVisible(i);
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i) {
        setCloseIconVisible(i);
    }

    public void setEllipsize(@Nullable TextUtils.TruncateAt truncateAt2) {
        this.truncateAt = truncateAt2;
    }

    public void setHideMotionSpec(@Nullable MotionSpec motionSpec) {
        this.hideMotionSpec = motionSpec;
    }

    public void setMaxWidth(@Px int i) {
        this.maxWidth = i;
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawText(boolean z) {
        this.shouldDrawText = z;
    }

    public void setShowMotionSpec(@Nullable MotionSpec motionSpec) {
        this.showMotionSpec = motionSpec;
    }

    private void unapplyChildDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void getChipTouchBounds(RectF rectF2) {
        calculateChipTouchBounds(getBounds(), rectF2);
    }

    public void getCloseIconTouchBounds(RectF rectF2) {
        calculateCloseIconTouchBounds(getBounds(), rectF2);
    }

    public void setDelegate(@Nullable Delegate delegate2) {
        this.delegate = new WeakReference<>(delegate2);
    }

    private float calculateTextWidth(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textPaint.measureText(charSequence, 0, charSequence.length());
    }

    private static boolean isStateful(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return onStateChange(iArr, getCloseIconState());
    }

    public void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    public void setCheckableResource(@BoolRes int i) {
        setCheckable(this.context.getResources().getBoolean(i));
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setCheckedIconResource(@DrawableRes int i) {
        setCheckedIcon(AppCompatResources.getDrawable(this.context, i));
    }

    public void setCheckedIconVisible(@BoolRes int i) {
        setCheckedIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        if (this.chipBackgroundColor != colorStateList) {
            this.chipBackgroundColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i) {
        setChipBackgroundColor(AppCompatResources.getColorStateList(this.context, i));
    }

    public void setChipCornerRadius(float f2) {
        if (this.chipCornerRadius != f2) {
            this.chipCornerRadius = f2;
            invalidateSelf();
        }
    }

    public void setChipCornerRadiusResource(@DimenRes int i) {
        setChipCornerRadius(this.context.getResources().getDimension(i));
    }

    public void setChipEndPadding(float f2) {
        if (this.chipEndPadding != f2) {
            this.chipEndPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i) {
        setChipEndPadding(this.context.getResources().getDimension(i));
    }

    public void setChipIconResource(@DrawableRes int i) {
        setChipIcon(AppCompatResources.getDrawable(this.context, i));
    }

    public void setChipIconSizeResource(@DimenRes int i) {
        setChipIconSize(this.context.getResources().getDimension(i));
    }

    public void setChipIconTintResource(@ColorRes int i) {
        setChipIconTint(AppCompatResources.getColorStateList(this.context, i));
    }

    public void setChipIconVisible(@BoolRes int i) {
        setChipIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setChipMinHeight(float f2) {
        if (this.chipMinHeight != f2) {
            this.chipMinHeight = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int i) {
        setChipMinHeight(this.context.getResources().getDimension(i));
    }

    public void setChipStartPadding(float f2) {
        if (this.chipStartPadding != f2) {
            this.chipStartPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i) {
        setChipStartPadding(this.context.getResources().getDimension(i));
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            onStateChange(getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i) {
        setChipStrokeColor(AppCompatResources.getColorStateList(this.context, i));
    }

    public void setChipStrokeWidthResource(@DimenRes int i) {
        setChipStrokeWidth(this.context.getResources().getDimension(i));
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i) {
        setCloseIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setCloseIconResource(@DrawableRes int i) {
        setCloseIcon(AppCompatResources.getDrawable(this.context, i));
    }

    public void setCloseIconSizeResource(@DimenRes int i) {
        setCloseIconSize(this.context.getResources().getDimension(i));
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i) {
        setCloseIconStartPadding(this.context.getResources().getDimension(i));
    }

    public void setCloseIconTintResource(@ColorRes int i) {
        setCloseIconTint(AppCompatResources.getColorStateList(this.context, i));
    }

    public void setCloseIconVisible(@BoolRes int i) {
        setCloseIconVisible(this.context.getResources().getBoolean(i));
    }

    public void setColorFilter(@Nullable ColorFilter colorFilter2) {
        if (this.colorFilter != colorFilter2) {
            this.colorFilter = colorFilter2;
            invalidateSelf();
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i) {
        setHideMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setIconEndPaddingResource(@DimenRes int i) {
        setIconEndPadding(this.context.getResources().getDimension(i));
    }

    public void setIconStartPaddingResource(@DimenRes int i) {
        setIconStartPadding(this.context.getResources().getDimension(i));
    }

    public void setRippleColorResource(@ColorRes int i) {
        setRippleColor(AppCompatResources.getColorStateList(this.context, i));
    }

    public void setShowMotionSpecResource(@AnimatorRes int i) {
        setShowMotionSpec(MotionSpec.createFromResource(this.context, i));
    }

    public void setTextAppearanceResource(@StyleRes int i) {
        setTextAppearance(new TextAppearance(this.context, i));
    }

    public void setTextEndPadding(float f2) {
        if (this.textEndPadding != f2) {
            this.textEndPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i) {
        setTextEndPadding(this.context.getResources().getDimension(i));
    }

    public void setTextResource(@StringRes int i) {
        setText(this.context.getResources().getString(i));
    }

    public void setTextStartPadding(float f2) {
        if (this.textStartPadding != f2) {
            this.textStartPadding = f2;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i) {
        setTextStartPadding(this.context.getResources().getDimension(i));
    }

    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    private static boolean isStateful(@Nullable Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public void setChipIconSize(float f2) {
        if (this.chipIconSize != f2) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f2;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setChipStrokeWidth(float f2) {
        if (this.chipStrokeWidth != f2) {
            this.chipStrokeWidth = f2;
            this.chipPaint.setStrokeWidth(f2);
            invalidateSelf();
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        if (this.closeIconContentDescription != charSequence) {
            this.closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    public void setCloseIconEndPadding(float f2) {
        if (this.closeIconEndPadding != f2) {
            this.closeIconEndPadding = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconSize(float f2) {
        if (this.closeIconSize != f2) {
            this.closeIconSize = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconStartPadding(float f2) {
        if (this.closeIconStartPadding != f2) {
            this.closeIconStartPadding = f2;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public boolean setCloseIconState(@NonNull int[] iArr) {
        if (!Arrays.equals(this.closeIconStateSet, iArr)) {
            this.closeIconStateSet = iArr;
            if (showsCloseIcon()) {
                return onStateChange(getState(), iArr);
            }
        }
        return false;
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                DrawableCompat.setTintList(this.closeIcon, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void setIconEndPadding(float f2) {
        if (this.iconEndPadding != f2) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f2;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setIconStartPadding(float f2) {
        if (this.iconStartPadding != f2) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f2;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    public void setText(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (this.rawText != charSequence) {
            this.rawText = charSequence;
            this.unicodeWrappedText = BidiFormatter.getInstance().unicodeWrap(charSequence);
            this.textWidthDirty = true;
            invalidateSelf();
            onSizeChange();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance textAppearance2) {
        if (this.textAppearance != textAppearance2) {
            this.textAppearance = textAppearance2;
            if (textAppearance2 != null) {
                textAppearance2.updateMeasureState(this.context, this.textPaint, this.fontCallback);
                this.textWidthDirty = true;
            }
            onStateChange(getState());
            onSizeChange();
        }
    }

    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            this.tintFilter = DrawableUtils.updateTintFilter(this, this.tint, mode);
            invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean z) {
        if (this.useCompatRipple != z) {
            this.useCompatRipple = z;
            updateCompatRippleColor();
            onStateChange(getState());
        }
    }

    private void applyChildDrawable(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.closeIcon) {
                if (drawable.isStateful()) {
                    drawable.setState(getCloseIconState());
                }
                DrawableCompat.setTintList(drawable, this.closeIconTint);
            } else if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    private static boolean isStateful(@Nullable TextAppearance textAppearance2) {
        if (textAppearance2 == null || textAppearance2.textColor == null || !textAppearance2.textColor.isStateful()) {
            return false;
        }
        return true;
    }

    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.chipCornerRadius);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.chipCornerRadius);
        }
        outline.setAlpha(((float) getAlpha()) / 255.0f);
    }

    @TargetApi(23)
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (showsChipIcon()) {
            onLayoutDirectionChanged |= this.chipIcon.setLayoutDirection(i);
        }
        if (showsCheckedIcon()) {
            onLayoutDirectionChanged |= this.checkedIcon.setLayoutDirection(i);
        }
        if (showsCloseIcon()) {
            onLayoutDirectionChanged |= this.closeIcon.setLayoutDirection(i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (showsChipIcon()) {
            onLevelChange |= this.chipIcon.setLevel(i);
        }
        if (showsCheckedIcon()) {
            onLevelChange |= this.checkedIcon.setLevel(i);
        }
        if (showsCloseIcon()) {
            onLevelChange |= this.closeIcon.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            float calculateChipIconWidth = calculateChipIconWidth();
            if (!z && this.currentChecked) {
                this.currentChecked = false;
            }
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCheckedIconVisible(boolean z) {
        boolean z2;
        if (this.checkedIconVisible != z) {
            boolean showsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z;
            boolean showsCheckedIcon2 = showsCheckedIcon();
            if (showsCheckedIcon != showsCheckedIcon2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (showsCheckedIcon2) {
                    applyChildDrawable(this.checkedIcon);
                } else {
                    unapplyChildDrawable(this.checkedIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable chipIcon2 = getChipIcon();
        if (chipIcon2 != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.chipIcon = drawable2;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(chipIcon2);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setChipIconVisible(boolean z) {
        boolean z2;
        if (this.chipIconVisible != z) {
            boolean showsChipIcon = showsChipIcon();
            this.chipIconVisible = z;
            boolean showsChipIcon2 = showsChipIcon();
            if (showsChipIcon != showsChipIcon2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (showsChipIcon2) {
                    applyChildDrawable(this.chipIcon);
                } else {
                    unapplyChildDrawable(this.chipIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        Drawable drawable2;
        Drawable closeIcon2 = getCloseIcon();
        if (closeIcon2 != drawable) {
            float calculateCloseIconWidth = calculateCloseIconWidth();
            if (drawable != null) {
                drawable2 = DrawableCompat.wrap(drawable).mutate();
            } else {
                drawable2 = null;
            }
            this.closeIcon = drawable2;
            float calculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(closeIcon2);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (calculateCloseIconWidth != calculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public void setCloseIconVisible(boolean z) {
        boolean z2;
        if (this.closeIconVisible != z) {
            boolean showsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z;
            boolean showsCloseIcon2 = showsCloseIcon();
            if (showsCloseIcon != showsCloseIcon2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (showsCloseIcon2) {
                    applyChildDrawable(this.closeIcon);
                } else {
                    unapplyChildDrawable(this.closeIcon);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    private ChipDrawable(Context context2) {
        this.context = context2;
        this.rawText = "";
        this.textPaint.density = context2.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        if (this.debugPaint != null) {
            this.debugPaint.setStyle(Paint.Style.STROKE);
        }
        setState(DEFAULT_STATE);
        setCloseIconState(DEFAULT_STATE);
        this.shouldDrawText = true;
    }

    public void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && getAlpha() != 0) {
            int i = 0;
            if (this.alpha < 255) {
                i = CanvasCompat.saveLayerAlpha(canvas, (float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.alpha);
            }
            drawChipBackground(canvas, bounds);
            drawChipStroke(canvas, bounds);
            drawCompatRipple(canvas, bounds);
            drawChipIcon(canvas, bounds);
            drawCheckedIcon(canvas, bounds);
            if (this.shouldDrawText) {
                drawText(canvas, bounds);
            }
            drawCloseIcon(canvas, bounds);
            drawDebug(canvas, bounds);
            if (this.alpha < 255) {
                canvas.restoreToCount(i);
            }
        }
    }

    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    private void drawCompatRipple(@NonNull Canvas canvas, Rect rect) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, this.chipCornerRadius, this.chipCornerRadius, this.chipPaint);
    }

    private static boolean hasState(@Nullable int[] iArr, @AttrRes int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void calculateChipTouchBounds(Rect rect, RectF rectF2) {
        rectF2.set(rect);
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF2.right = ((float) rect.right) - f2;
                return;
            }
            rectF2.left = ((float) rect.left) + f2;
        }
    }

    private void calculateCloseIconTouchBounds(Rect rect, RectF rectF2) {
        rectF2.setEmpty();
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF2.right = (float) rect.right;
                rectF2.left = rectF2.right - f2;
            } else {
                rectF2.left = (float) rect.left;
                rectF2.right = ((float) rect.left) + f2;
            }
            rectF2.top = (float) rect.top;
            rectF2.bottom = (float) rect.bottom;
        }
    }

    private void drawCheckedIcon(@NonNull Canvas canvas, Rect rect) {
        if (showsCheckedIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.checkedIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.checkedIcon.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void drawChipBackground(@NonNull Canvas canvas, Rect rect) {
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint.Style.FILL);
        this.chipPaint.setColorFilter(getTintColorFilter());
        this.rectF.set(rect);
        canvas.drawRoundRect(this.rectF, this.chipCornerRadius, this.chipCornerRadius, this.chipPaint);
    }

    private void drawChipIcon(@NonNull Canvas canvas, Rect rect) {
        if (showsChipIcon()) {
            calculateChipIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.chipIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.chipIcon.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void drawCloseIcon(@NonNull Canvas canvas, Rect rect) {
        if (showsCloseIcon()) {
            calculateCloseIconBounds(rect, this.rectF);
            float f2 = this.rectF.left;
            float f3 = this.rectF.top;
            canvas.translate(f2, f3);
            this.closeIcon.setBounds(0, 0, (int) this.rectF.width(), (int) this.rectF.height());
            this.closeIcon.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    /* access modifiers changed from: package-private */
    public Paint.Align calculateTextOriginAndAlignment(Rect rect, PointF pointF2) {
        pointF2.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.unicodeWrappedText != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF2.x = ((float) rect.left) + calculateChipIconWidth;
                align = Paint.Align.LEFT;
            } else {
                pointF2.x = ((float) rect.right) - calculateChipIconWidth;
                align = Paint.Align.RIGHT;
            }
            pointF2.y = ((float) rect.centerY()) - calculateTextCenterFromBaseline();
        }
        return align;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z, z2);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z, z2);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    private void calculateChipIconBounds(Rect rect, RectF rectF2) {
        rectF2.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f2 = this.chipStartPadding + this.iconStartPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF2.left = ((float) rect.left) + f2;
                rectF2.right = rectF2.left + this.chipIconSize;
            } else {
                rectF2.right = ((float) rect.right) - f2;
                rectF2.left = rectF2.right - this.chipIconSize;
            }
            rectF2.top = rect.exactCenterY() - (this.chipIconSize / 2.0f);
            rectF2.bottom = rectF2.top + this.chipIconSize;
        }
    }

    private void calculateCloseIconBounds(Rect rect, RectF rectF2) {
        rectF2.setEmpty();
        if (showsCloseIcon()) {
            float f2 = this.chipEndPadding + this.closeIconEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF2.right = ((float) rect.right) - f2;
                rectF2.left = rectF2.right - this.closeIconSize;
            } else {
                rectF2.left = ((float) rect.left) + f2;
                rectF2.right = rectF2.left + this.closeIconSize;
            }
            rectF2.top = rect.exactCenterY() - (this.closeIconSize / 2.0f);
            rectF2.bottom = rectF2.top + this.closeIconSize;
        }
    }

    private void calculateTextBounds(Rect rect, RectF rectF2) {
        rectF2.setEmpty();
        if (this.unicodeWrappedText != null) {
            float calculateChipIconWidth = this.chipStartPadding + calculateChipIconWidth() + this.textStartPadding;
            float calculateCloseIconWidth = this.chipEndPadding + calculateCloseIconWidth() + this.textEndPadding;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF2.left = ((float) rect.left) + calculateChipIconWidth;
                rectF2.right = ((float) rect.right) - calculateCloseIconWidth;
            } else {
                rectF2.left = ((float) rect.left) + calculateCloseIconWidth;
                rectF2.right = ((float) rect.right) - calculateChipIconWidth;
            }
            rectF2.top = (float) rect.top;
            rectF2.bottom = (float) rect.bottom;
        }
    }

    public static ChipDrawable createFromResource(Context context2, @XmlRes int i) {
        int next;
        try {
            XmlResourceParser xml = context2.getResources().getXml(i);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            } else if (TextUtils.equals(xml.getName(), "chip")) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                int styleAttribute = asAttributeSet.getStyleAttribute();
                if (styleAttribute == 0) {
                    styleAttribute = C0906R.style.pn;
                }
                return createFromAttributes(context2, asAttributeSet, C0906R.attr.ep, styleAttribute);
            } else {
                throw new XmlPullParserException("Must have a <chip> start tag");
            }
        } catch (IOException | XmlPullParserException e2) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load chip resource ID #0x" + Integer.toHexString(i));
            notFoundException.initCause(e2);
            throw notFoundException;
        }
    }

    private void drawChipStroke(@NonNull Canvas canvas, Rect rect) {
        if (this.chipStrokeWidth > 0.0f) {
            this.chipPaint.setColor(this.currentChipStrokeColor);
            this.chipPaint.setStyle(Paint.Style.STROKE);
            this.chipPaint.setColorFilter(getTintColorFilter());
            this.rectF.set(((float) rect.left) + (this.chipStrokeWidth / 2.0f), ((float) rect.top) + (this.chipStrokeWidth / 2.0f), ((float) rect.right) - (this.chipStrokeWidth / 2.0f), ((float) rect.bottom) - (this.chipStrokeWidth / 2.0f));
            float f2 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
            canvas.drawRoundRect(this.rectF, f2, f2, this.chipPaint);
        }
    }

    private void drawText(@NonNull Canvas canvas, Rect rect) {
        boolean z;
        if (this.unicodeWrappedText != null) {
            Paint.Align calculateTextOriginAndAlignment = calculateTextOriginAndAlignment(rect, this.pointF);
            calculateTextBounds(rect, this.rectF);
            if (this.textAppearance != null) {
                this.textPaint.drawableState = getState();
                this.textAppearance.updateDrawState(this.context, this.textPaint, this.fontCallback);
            }
            this.textPaint.setTextAlign(calculateTextOriginAndAlignment);
            int i = 0;
            if (Math.round(getTextWidth()) > Math.round(this.rectF.width())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = canvas.save();
                canvas.clipRect(this.rectF);
            }
            CharSequence charSequence = this.unicodeWrappedText;
            if (z && this.truncateAt != null) {
                charSequence = TextUtils.ellipsize(this.unicodeWrappedText, this.textPaint, this.rectF.width(), this.truncateAt);
            }
            CharSequence charSequence2 = charSequence;
            canvas.drawText(charSequence2, 0, charSequence2.length(), this.pointF.x, this.pointF.y, this.textPaint);
            if (z) {
                canvas.restoreToCount(i);
            }
        }
    }

    private void drawDebug(@NonNull Canvas canvas, Rect rect) {
        if (this.debugPaint != null) {
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
            canvas.drawRect(rect, this.debugPaint);
            if (showsChipIcon() || showsCheckedIcon()) {
                calculateChipIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            if (this.unicodeWrappedText != null) {
                canvas.drawLine((float) rect.left, rect.exactCenterY(), (float) rect.right, rect.exactCenterY(), this.debugPaint);
            }
            if (showsCloseIcon()) {
                calculateCloseIconBounds(rect, this.rectF);
                canvas.drawRect(this.rectF, this.debugPaint);
            }
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-65536, 127));
            calculateChipTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            calculateCloseIconTouchBounds(rect, this.rectF);
            canvas.drawRect(this.rectF, this.debugPaint);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean onStateChange(int[] r6, int[] r7) {
        /*
            r5 = this;
            boolean r0 = super.onStateChange(r6)
            android.content.res.ColorStateList r1 = r5.chipBackgroundColor
            r2 = 0
            if (r1 == 0) goto L_0x0012
            android.content.res.ColorStateList r1 = r5.chipBackgroundColor
            int r3 = r5.currentChipBackgroundColor
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            int r3 = r5.currentChipBackgroundColor
            r4 = 1
            if (r3 == r1) goto L_0x001b
            r5.currentChipBackgroundColor = r1
            r0 = 1
        L_0x001b:
            android.content.res.ColorStateList r1 = r5.chipStrokeColor
            if (r1 == 0) goto L_0x0028
            android.content.res.ColorStateList r1 = r5.chipStrokeColor
            int r3 = r5.currentChipStrokeColor
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x0029
        L_0x0028:
            r1 = 0
        L_0x0029:
            int r3 = r5.currentChipStrokeColor
            if (r3 == r1) goto L_0x0030
            r5.currentChipStrokeColor = r1
            r0 = 1
        L_0x0030:
            android.content.res.ColorStateList r1 = r5.compatRippleColor
            if (r1 == 0) goto L_0x003d
            android.content.res.ColorStateList r1 = r5.compatRippleColor
            int r3 = r5.currentCompatRippleColor
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            int r3 = r5.currentCompatRippleColor
            if (r3 == r1) goto L_0x0049
            r5.currentCompatRippleColor = r1
            boolean r1 = r5.useCompatRipple
            if (r1 == 0) goto L_0x0049
            r0 = 1
        L_0x0049:
            android.support.design.resources.TextAppearance r1 = r5.textAppearance
            if (r1 == 0) goto L_0x005e
            android.support.design.resources.TextAppearance r1 = r5.textAppearance
            android.content.res.ColorStateList r1 = r1.textColor
            if (r1 == 0) goto L_0x005e
            android.support.design.resources.TextAppearance r1 = r5.textAppearance
            android.content.res.ColorStateList r1 = r1.textColor
            int r3 = r5.currentTextColor
            int r1 = r1.getColorForState(r6, r3)
            goto L_0x005f
        L_0x005e:
            r1 = 0
        L_0x005f:
            int r3 = r5.currentTextColor
            if (r3 == r1) goto L_0x0066
            r5.currentTextColor = r1
            r0 = 1
        L_0x0066:
            int[] r1 = r5.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            boolean r1 = hasState(r1, r3)
            if (r1 == 0) goto L_0x0079
            boolean r1 = r5.checkable
            if (r1 == 0) goto L_0x0079
            r1 = 1
            goto L_0x007a
        L_0x0079:
            r1 = 0
        L_0x007a:
            boolean r3 = r5.currentChecked
            if (r3 == r1) goto L_0x0094
            android.graphics.drawable.Drawable r3 = r5.checkedIcon
            if (r3 == 0) goto L_0x0094
            float r0 = r5.calculateChipIconWidth()
            r5.currentChecked = r1
            float r1 = r5.calculateChipIconWidth()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0093
            r0 = 1
            r1 = 1
            goto L_0x0095
        L_0x0093:
            r0 = 1
        L_0x0094:
            r1 = 0
        L_0x0095:
            android.content.res.ColorStateList r3 = r5.tint
            if (r3 == 0) goto L_0x00a1
            android.content.res.ColorStateList r2 = r5.tint
            int r3 = r5.currentTint
            int r2 = r2.getColorForState(r6, r3)
        L_0x00a1:
            int r3 = r5.currentTint
            if (r3 == r2) goto L_0x00b2
            r5.currentTint = r2
            android.content.res.ColorStateList r0 = r5.tint
            android.graphics.PorterDuff$Mode r2 = r5.tintMode
            android.graphics.PorterDuffColorFilter r0 = android.support.design.drawable.DrawableUtils.updateTintFilter(r5, r0, r2)
            r5.tintFilter = r0
            r0 = 1
        L_0x00b2:
            android.graphics.drawable.Drawable r2 = r5.chipIcon
            boolean r2 = isStateful((android.graphics.drawable.Drawable) r2)
            if (r2 == 0) goto L_0x00c1
            android.graphics.drawable.Drawable r2 = r5.chipIcon
            boolean r2 = r2.setState(r6)
            r0 = r0 | r2
        L_0x00c1:
            android.graphics.drawable.Drawable r2 = r5.checkedIcon
            boolean r2 = isStateful((android.graphics.drawable.Drawable) r2)
            if (r2 == 0) goto L_0x00d0
            android.graphics.drawable.Drawable r2 = r5.checkedIcon
            boolean r6 = r2.setState(r6)
            r0 = r0 | r6
        L_0x00d0:
            android.graphics.drawable.Drawable r6 = r5.closeIcon
            boolean r6 = isStateful((android.graphics.drawable.Drawable) r6)
            if (r6 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r6 = r5.closeIcon
            boolean r6 = r6.setState(r7)
            r0 = r0 | r6
        L_0x00df:
            if (r0 == 0) goto L_0x00e4
            r5.invalidateSelf()
        L_0x00e4:
            if (r1 == 0) goto L_0x00e9
            r5.onSizeChange()
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.chip.ChipDrawable.onStateChange(int[], int[]):boolean");
    }

    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    private void loadFromAttributes(AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, R$styleable.Chip, i, i2, new int[0]);
        setChipBackgroundColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, 8));
        setChipMinHeight(obtainStyledAttributes.getDimension(16, 0.0f));
        setChipCornerRadius(obtainStyledAttributes.getDimension(9, 0.0f));
        setChipStrokeColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, 18));
        setChipStrokeWidth(obtainStyledAttributes.getDimension(19, 0.0f));
        setRippleColor(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, 30));
        setText(obtainStyledAttributes.getText(3));
        setTextAppearance(MaterialResources.getTextAppearance(this.context, obtainStyledAttributes, 0));
        switch (obtainStyledAttributes.getInt(1, 0)) {
            case 1:
                setEllipsize(TextUtils.TruncateAt.START);
                break;
            case 2:
                setEllipsize(TextUtils.TruncateAt.MIDDLE);
                break;
            case 3:
                setEllipsize(TextUtils.TruncateAt.END);
                break;
        }
        setChipIconVisible(obtainStyledAttributes.getBoolean(15, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") != null)) {
            setChipIconVisible(obtainStyledAttributes.getBoolean(12, false));
        }
        setChipIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, 11));
        setChipIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, 14));
        setChipIconSize(obtainStyledAttributes.getDimension(13, 0.0f));
        setCloseIconVisible(obtainStyledAttributes.getBoolean(26, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") != null)) {
            setCloseIconVisible(obtainStyledAttributes.getBoolean(21, false));
        }
        setCloseIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, 20));
        setCloseIconTint(MaterialResources.getColorStateList(this.context, obtainStyledAttributes, 25));
        setCloseIconSize(obtainStyledAttributes.getDimension(23, 0.0f));
        setCheckable(obtainStyledAttributes.getBoolean(4, false));
        setCheckedIconVisible(obtainStyledAttributes.getBoolean(7, false));
        if (!(attributeSet == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") == null || attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") != null)) {
            setCheckedIconVisible(obtainStyledAttributes.getBoolean(6, false));
        }
        setCheckedIcon(MaterialResources.getDrawable(this.context, obtainStyledAttributes, 5));
        setShowMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, 31));
        setHideMotionSpec(MotionSpec.createFromAttribute(this.context, obtainStyledAttributes, 27));
        setChipStartPadding(obtainStyledAttributes.getDimension(17, 0.0f));
        setIconStartPadding(obtainStyledAttributes.getDimension(29, 0.0f));
        setIconEndPadding(obtainStyledAttributes.getDimension(28, 0.0f));
        setTextStartPadding(obtainStyledAttributes.getDimension(33, 0.0f));
        setTextEndPadding(obtainStyledAttributes.getDimension(32, 0.0f));
        setCloseIconStartPadding(obtainStyledAttributes.getDimension(24, 0.0f));
        setCloseIconEndPadding(obtainStyledAttributes.getDimension(22, 0.0f));
        setChipEndPadding(obtainStyledAttributes.getDimension(10, 0.0f));
        setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, Integer.MAX_VALUE));
        obtainStyledAttributes.recycle();
    }

    public static ChipDrawable createFromAttributes(Context context2, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        ChipDrawable chipDrawable = new ChipDrawable(context2);
        chipDrawable.loadFromAttributes(attributeSet, i, i2);
        return chipDrawable;
    }
}

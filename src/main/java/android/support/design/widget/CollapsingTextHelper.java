package android.support.design.widget;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.design.animation.AnimationUtils;
import android.support.v4.math.MathUtils;
import android.support.v4.text.TextDirectionHeuristicCompat;
import android.support.v4.text.TextDirectionHeuristicsCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.appcompat.R$styleable;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class CollapsingTextHelper {
    private static final Paint DEBUG_DRAW_PAINT = null;
    private static final boolean USE_SCALING_TEXTURE;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private int collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity = 16;
    private float collapsedTextSize = 15.0f;
    private Typeface collapsedTypeface;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private float expandedFraction;
    private int expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity = 16;
    private float expandedTextSize = 15.0f;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private CharSequence text;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private float textureAscent;
    private float textureDescent;
    private Paint texturePaint;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    public final ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public final int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public final float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public final ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public final int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public final float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public final float getExpansionFraction() {
        return this.expandedFraction;
    }

    public final CharSequence getText() {
        return this.text;
    }

    private void calculateCurrentOffsets() {
        calculateOffsets(this.expandedFraction);
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT < 18) {
            z = true;
        } else {
            z = false;
        }
        USE_SCALING_TEXTURE = z;
    }

    private void clearTexture() {
        if (this.expandedTitleTexture != null) {
            this.expandedTitleTexture.recycle();
            this.expandedTitleTexture = null;
        }
    }

    public final float getCollapsedTextHeight() {
        getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public final Typeface getCollapsedTypeface() {
        if (this.collapsedTypeface != null) {
            return this.collapsedTypeface;
        }
        return Typeface.DEFAULT;
    }

    public final Typeface getExpandedTypeface() {
        if (this.expandedTypeface != null) {
            return this.expandedTypeface;
        }
        return Typeface.DEFAULT;
    }

    @ColorInt
    private int getCurrentExpandedTextColor() {
        if (this.state != null) {
            return this.expandedTextColor.getColorForState(this.state, 0);
        }
        return this.expandedTextColor.getDefaultColor();
    }

    public final float calculateCollapsedTextWidth() {
        if (this.text == null) {
            return 0.0f;
        }
        getTextPaintCollapsed(this.tmpPaint);
        return this.tmpPaint.measureText(this.text, 0, this.text.length());
    }

    @ColorInt
    @VisibleForTesting
    public final int getCurrentCollapsedTextColor() {
        if (this.state != null) {
            return this.collapsedTextColor.getColorForState(this.state, 0);
        }
        return this.collapsedTextColor.getDefaultColor();
    }

    public final boolean isStateful() {
        if ((this.collapsedTextColor == null || !this.collapsedTextColor.isStateful()) && (this.expandedTextColor == null || !this.expandedTextColor.isStateful())) {
            return false;
        }
        return true;
    }

    public final void recalculate() {
        if (this.view.getHeight() > 0 && this.view.getWidth() > 0) {
            calculateBaseOffsets();
            calculateCurrentOffsets();
        }
    }

    /* access modifiers changed from: package-private */
    public final void onBoundsChanged() {
        boolean z;
        if (this.collapsedBounds.width() <= 0 || this.collapsedBounds.height() <= 0 || this.expandedBounds.width() <= 0 || this.expandedBounds.height() <= 0) {
            z = false;
        } else {
            z = true;
        }
        this.drawTitle = z;
    }

    private void ensureExpandedTexture() {
        if (this.expandedTitleTexture == null && !this.expandedBounds.isEmpty() && !TextUtils.isEmpty(this.textToDraw)) {
            calculateOffsets(0.0f);
            this.textureAscent = this.textPaint.ascent();
            this.textureDescent = this.textPaint.descent();
            int round = Math.round(this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length()));
            int round2 = Math.round(this.textureDescent - this.textureAscent);
            if (round > 0 && round2 > 0) {
                this.expandedTitleTexture = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
                new Canvas(this.expandedTitleTexture).drawText(this.textToDraw, 0, this.textToDraw.length(), 0.0f, ((float) round2) - this.textPaint.descent(), this.textPaint);
                if (this.texturePaint == null) {
                    this.texturePaint = new Paint(3);
                }
            }
        }
    }

    private void calculateBaseOffsets() {
        float f2;
        float f3 = this.currentTextSize;
        calculateUsingTextSize(this.collapsedTextSize);
        float f4 = 0.0f;
        if (this.textToDraw != null) {
            f2 = this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length());
        } else {
            f2 = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl ? 1 : 0);
        int i = absoluteGravity & SearchJediMixFeedAdapter.f42516e;
        if (i == 48) {
            this.collapsedDrawY = ((float) this.collapsedBounds.top) - this.textPaint.ascent();
        } else if (i != 80) {
            this.collapsedDrawY = ((float) this.collapsedBounds.centerY()) + (((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f) - this.textPaint.descent());
        } else {
            this.collapsedDrawY = (float) this.collapsedBounds.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.collapsedDrawX = ((float) this.collapsedBounds.centerX()) - (f2 / 2.0f);
        } else if (i2 != 5) {
            this.collapsedDrawX = (float) this.collapsedBounds.left;
        } else {
            this.collapsedDrawX = ((float) this.collapsedBounds.right) - f2;
        }
        calculateUsingTextSize(this.expandedTextSize);
        if (this.textToDraw != null) {
            f4 = this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length());
        }
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl ? 1 : 0);
        int i3 = absoluteGravity2 & SearchJediMixFeedAdapter.f42516e;
        if (i3 == 48) {
            this.expandedDrawY = ((float) this.expandedBounds.top) - this.textPaint.ascent();
        } else if (i3 != 80) {
            this.expandedDrawY = ((float) this.expandedBounds.centerY()) + (((this.textPaint.descent() - this.textPaint.ascent()) / 2.0f) - this.textPaint.descent());
        } else {
            this.expandedDrawY = (float) this.expandedBounds.bottom;
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.expandedDrawX = ((float) this.expandedBounds.centerX()) - (f4 / 2.0f);
        } else if (i4 != 5) {
            this.expandedDrawX = (float) this.expandedBounds.left;
        } else {
            this.expandedDrawX = ((float) this.expandedBounds.right) - f4;
        }
        clearTexture();
        setInterpolatedTextSize(f3);
    }

    public final void setPositionInterpolator(TimeInterpolator timeInterpolator) {
        this.positionInterpolator = timeInterpolator;
        recalculate();
    }

    public final void setTextSizeInterpolator(TimeInterpolator timeInterpolator) {
        this.textSizeInterpolator = timeInterpolator;
        recalculate();
    }

    public final void setTypefaces(Typeface typeface) {
        this.expandedTypeface = typeface;
        this.collapsedTypeface = typeface;
        recalculate();
    }

    private void getTextPaintCollapsed(TextPaint textPaint2) {
        textPaint2.setTextSize(this.collapsedTextSize);
        textPaint2.setTypeface(this.collapsedTypeface);
    }

    public final void setCollapsedTextColor(ColorStateList colorStateList) {
        if (this.collapsedTextColor != colorStateList) {
            this.collapsedTextColor = colorStateList;
            recalculate();
        }
    }

    public final void setCollapsedTextGravity(int i) {
        if (this.collapsedTextGravity != i) {
            this.collapsedTextGravity = i;
            recalculate();
        }
    }

    public final void setCollapsedTextSize(float f2) {
        if (this.collapsedTextSize != f2) {
            this.collapsedTextSize = f2;
            recalculate();
        }
    }

    public final void setCollapsedTypeface(Typeface typeface) {
        if (this.collapsedTypeface != typeface) {
            this.collapsedTypeface = typeface;
            recalculate();
        }
    }

    public final void setExpandedTextColor(ColorStateList colorStateList) {
        if (this.expandedTextColor != colorStateList) {
            this.expandedTextColor = colorStateList;
            recalculate();
        }
    }

    public final void setExpandedTextGravity(int i) {
        if (this.expandedTextGravity != i) {
            this.expandedTextGravity = i;
            recalculate();
        }
    }

    public final void setExpandedTextSize(float f2) {
        if (this.expandedTextSize != f2) {
            this.expandedTextSize = f2;
            recalculate();
        }
    }

    public final void setExpandedTypeface(Typeface typeface) {
        if (this.expandedTypeface != typeface) {
            this.expandedTypeface = typeface;
            recalculate();
        }
    }

    public final boolean setState(int[] iArr) {
        this.state = iArr;
        if (!isStateful()) {
            return false;
        }
        recalculate();
        return true;
    }

    private boolean calculateIsRtl(CharSequence charSequence) {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat;
        boolean z = true;
        if (ViewCompat.getLayoutDirection(this.view) != 1) {
            z = false;
        }
        if (z) {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL;
        } else {
            textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        }
        return textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public final void setExpansionFraction(float f2) {
        float clamp = MathUtils.clamp(f2, 0.0f, 1.0f);
        if (clamp != this.expandedFraction) {
            this.expandedFraction = clamp;
            calculateCurrentOffsets();
        }
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence == null || !charSequence.equals(this.text)) {
            this.text = charSequence;
            this.textToDraw = null;
            clearTexture();
            recalculate();
        }
    }

    public CollapsingTextHelper(View view2) {
        this.view = view2;
        this.textPaint = new TextPaint(129);
        this.tmpPaint = new TextPaint(this.textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
    }

    private Typeface readFontFamilyTypeface(int i) {
        TypedArray obtainStyledAttributes = this.view.getContext().obtainStyledAttributes(i, new int[]{16843692});
        try {
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                return Typeface.create(string, 0);
            }
            obtainStyledAttributes.recycle();
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void setInterpolatedTextSize(float f2) {
        boolean z;
        calculateUsingTextSize(f2);
        if (!USE_SCALING_TEXTURE || this.scale == 1.0f) {
            z = false;
        } else {
            z = true;
        }
        this.useTexture = z;
        if (this.useTexture) {
            ensureExpandedTexture();
        }
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public final void getCollapsedTextActualBounds(RectF rectF) {
        float f2;
        float f3;
        boolean calculateIsRtl = calculateIsRtl(this.text);
        if (!calculateIsRtl) {
            f2 = (float) this.collapsedBounds.left;
        } else {
            f2 = ((float) this.collapsedBounds.right) - calculateCollapsedTextWidth();
        }
        rectF.left = f2;
        rectF.top = (float) this.collapsedBounds.top;
        if (!calculateIsRtl) {
            f3 = rectF.left + calculateCollapsedTextWidth();
        } else {
            f3 = (float) this.collapsedBounds.right;
        }
        rectF.right = f3;
        rectF.bottom = ((float) this.collapsedBounds.top) + getCollapsedTextHeight();
    }

    private void calculateOffsets(float f2) {
        interpolateBounds(f2);
        this.currentDrawX = lerp(this.expandedDrawX, this.collapsedDrawX, f2, this.positionInterpolator);
        this.currentDrawY = lerp(this.expandedDrawY, this.collapsedDrawY, f2, this.positionInterpolator);
        setInterpolatedTextSize(lerp(this.expandedTextSize, this.collapsedTextSize, f2, this.textSizeInterpolator));
        if (this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(blendColors(getCurrentExpandedTextColor(), getCurrentCollapsedTextColor(), f2));
        } else {
            this.textPaint.setColor(getCurrentCollapsedTextColor());
        }
        this.textPaint.setShadowLayer(lerp(this.expandedShadowRadius, this.collapsedShadowRadius, f2, null), lerp(this.expandedShadowDx, this.collapsedShadowDx, f2, null), lerp(this.expandedShadowDy, this.collapsedShadowDy, f2, null), blendColors(this.expandedShadowColor, this.collapsedShadowColor, f2));
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void interpolateBounds(float f2) {
        this.currentBounds.left = lerp((float) this.expandedBounds.left, (float) this.collapsedBounds.left, f2, this.positionInterpolator);
        this.currentBounds.top = lerp(this.expandedDrawY, this.collapsedDrawY, f2, this.positionInterpolator);
        this.currentBounds.right = lerp((float) this.expandedBounds.right, (float) this.collapsedBounds.right, f2, this.positionInterpolator);
        this.currentBounds.bottom = lerp((float) this.expandedBounds.bottom, (float) this.collapsedBounds.bottom, f2, this.positionInterpolator);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        float f2;
        int save = canvas.save();
        if (this.textToDraw != null && this.drawTitle) {
            float f3 = this.currentDrawX;
            float f4 = this.currentDrawY;
            if (!this.useTexture || this.expandedTitleTexture == null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                f2 = this.textureAscent * this.scale;
            } else {
                this.textPaint.ascent();
                f2 = 0.0f;
                this.textPaint.descent();
            }
            if (z) {
                f4 += f2;
            }
            float f5 = f4;
            if (this.scale != 1.0f) {
                canvas.scale(this.scale, this.scale, f3, f5);
            }
            if (z) {
                canvas.drawBitmap(this.expandedTitleTexture, f3, f5, this.texturePaint);
            } else {
                canvas.drawText(this.textToDraw, 0, this.textToDraw.length(), f3, f5, this.textPaint);
            }
        }
        canvas.restoreToCount(save);
    }

    public final void setCollapsedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.view.getContext(), i, R$styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(3)) {
            this.collapsedTextColor = obtainStyledAttributes.getColorStateList(3);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.collapsedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.collapsedTextSize);
        }
        this.collapsedShadowColor = obtainStyledAttributes.getInt(6, 0);
        this.collapsedShadowDx = obtainStyledAttributes.getFloat(7, 0.0f);
        this.collapsedShadowDy = obtainStyledAttributes.getFloat(8, 0.0f);
        this.collapsedShadowRadius = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.collapsedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    public final void setExpandedTextAppearance(int i) {
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(this.view.getContext(), i, R$styleable.TextAppearance);
        if (obtainStyledAttributes.hasValue(3)) {
            this.expandedTextColor = obtainStyledAttributes.getColorStateList(3);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.expandedTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, (int) this.expandedTextSize);
        }
        this.expandedShadowColor = obtainStyledAttributes.getInt(6, 0);
        this.expandedShadowDx = obtainStyledAttributes.getFloat(7, 0.0f);
        this.expandedShadowDy = obtainStyledAttributes.getFloat(8, 0.0f);
        this.expandedShadowRadius = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT >= 16) {
            this.expandedTypeface = readFontFamilyTypeface(i);
        }
        recalculate();
    }

    private void calculateUsingTextSize(float f2) {
        boolean z;
        float f3;
        boolean z2;
        boolean z3;
        if (this.text != null) {
            float width = (float) this.collapsedBounds.width();
            float width2 = (float) this.expandedBounds.width();
            boolean z4 = true;
            if (isClose(f2, this.collapsedTextSize)) {
                float f4 = this.collapsedTextSize;
                this.scale = 1.0f;
                if (this.currentTypeface != this.collapsedTypeface) {
                    this.currentTypeface = this.collapsedTypeface;
                    z3 = true;
                } else {
                    z3 = false;
                }
                f3 = f4;
                z = z3;
            } else {
                f3 = this.expandedTextSize;
                if (this.currentTypeface != this.expandedTypeface) {
                    this.currentTypeface = this.expandedTypeface;
                    z = true;
                } else {
                    z = false;
                }
                if (isClose(f2, this.expandedTextSize)) {
                    this.scale = 1.0f;
                } else {
                    this.scale = f2 / this.expandedTextSize;
                }
                float f5 = this.collapsedTextSize / this.expandedTextSize;
                if (width2 * f5 > width) {
                    width = Math.min(width / f5, width2);
                } else {
                    width = width2;
                }
            }
            if (width > 0.0f) {
                if (this.currentTextSize != f3 || this.boundsChanged || z) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.currentTextSize = f3;
                this.boundsChanged = false;
            }
            if (this.textToDraw == null || z) {
                this.textPaint.setTextSize(this.currentTextSize);
                this.textPaint.setTypeface(this.currentTypeface);
                TextPaint textPaint2 = this.textPaint;
                if (this.scale == 1.0f) {
                    z4 = false;
                }
                textPaint2.setLinearText(z4);
                CharSequence ellipsize = TextUtils.ellipsize(this.text, this.textPaint, width, TextUtils.TruncateAt.END);
                if (!TextUtils.equals(ellipsize, this.textToDraw)) {
                    this.textToDraw = ellipsize;
                    this.isRtl = calculateIsRtl(this.textToDraw);
                }
            }
        }
    }

    private static boolean isClose(float f2, float f3) {
        if (Math.abs(f2 - f3) < 0.001f) {
            return true;
        }
        return false;
    }

    private static int blendColors(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((((float) Color.alpha(i)) * f3) + (((float) Color.alpha(i2)) * f2)), (int) ((((float) Color.red(i)) * f3) + (((float) Color.red(i2)) * f2)), (int) ((((float) Color.green(i)) * f3) + (((float) Color.green(i2)) * f2)), (int) ((((float) Color.blue(i)) * f3) + (((float) Color.blue(i2)) * f2)));
    }

    private static float lerp(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return AnimationUtils.lerp(f2, f3, f4);
    }

    public final void setCollapsedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.collapsedBounds, i, i2, i3, i4)) {
            this.collapsedBounds.set(i, i2, i3, i4);
            this.boundsChanged = true;
            onBoundsChanged();
        }
    }

    public final void setExpandedBounds(int i, int i2, int i3, int i4) {
        if (!rectEquals(this.expandedBounds, i, i2, i3, i4)) {
            this.expandedBounds.set(i, i2, i3, i4);
            this.boundsChanged = true;
            onBoundsChanged();
        }
    }

    private static boolean rectEquals(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }
}

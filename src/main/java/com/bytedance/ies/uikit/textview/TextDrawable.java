package com.bytedance.ies.uikit.textview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;

public class TextDrawable extends Drawable {
    private static final int[] appearanceAttributes = {16842901, 16842902, 16842903, 16842904};
    private static final int[] themeAttributes = {16842804};
    private Resources mResources;
    private CharSequence mText = "";
    private Layout.Alignment mTextAlignment = Layout.Alignment.ALIGN_NORMAL;
    private Rect mTextBounds;
    private ColorStateList mTextColors;
    private StaticLayout mTextLayout;
    private TextPaint mTextPaint;
    private Path mTextPath;

    public CharSequence getText() {
        return this.mText;
    }

    public Layout.Alignment getTextAlign() {
        return this.mTextAlignment;
    }

    public int getOpacity() {
        return this.mTextPaint.getAlpha();
    }

    public float getTextScaleX() {
        return this.mTextPaint.getTextScaleX();
    }

    public float getTextSize() {
        return this.mTextPaint.getTextSize();
    }

    public Typeface getTypeface() {
        return this.mTextPaint.getTypeface();
    }

    public boolean isStateful() {
        return this.mTextColors.isStateful();
    }

    public int getIntrinsicHeight() {
        if (this.mTextBounds.isEmpty()) {
            return -1;
        }
        return this.mTextBounds.bottom - this.mTextBounds.top;
    }

    public int getIntrinsicWidth() {
        if (this.mTextBounds.isEmpty()) {
            return -1;
        }
        return this.mTextBounds.right - this.mTextBounds.left;
    }

    private void measureContent() {
        if (this.mTextPath != null) {
            this.mTextLayout = null;
            this.mTextBounds.setEmpty();
        } else {
            StaticLayout staticLayout = new StaticLayout(this.mText, this.mTextPaint, (int) Math.ceil((double) Layout.getDesiredWidth(this.mText, this.mTextPaint)), this.mTextAlignment, 1.0f, 0.0f, true);
            this.mTextLayout = staticLayout;
            this.mTextBounds.set(0, 0, this.mTextLayout.getWidth(), this.mTextLayout.getHeight());
        }
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.mTextBounds.set(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        return updateTextColors(iArr);
    }

    public void setTextColor(int i) {
        setTextColor(ColorStateList.valueOf(i));
    }

    public void setTextSize(float f2) {
        setTextSize(2, f2);
    }

    public void setAlpha(int i) {
        if (this.mTextPaint.getAlpha() != i) {
            this.mTextPaint.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mTextPaint.getColorFilter() != colorFilter) {
            this.mTextPaint.setColorFilter(colorFilter);
        }
    }

    public void setText(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.mText = charSequence;
        measureContent();
    }

    public void setTextAlign(Layout.Alignment alignment) {
        if (this.mTextAlignment != alignment) {
            this.mTextAlignment = alignment;
            measureContent();
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.mTextColors = colorStateList;
        updateTextColors(getState());
    }

    public void setTextPath(Path path) {
        if (this.mTextPath != path) {
            this.mTextPath = path;
            measureContent();
        }
    }

    private void setRawTextSize(float f2) {
        if (f2 != this.mTextPaint.getTextSize()) {
            this.mTextPaint.setTextSize(f2);
            measureContent();
        }
    }

    private boolean updateTextColors(int[] iArr) {
        int colorForState = this.mTextColors.getColorForState(iArr, -1);
        if (this.mTextPaint.getColor() == colorForState) {
            return false;
        }
        this.mTextPaint.setColor(colorForState);
        return true;
    }

    public void setTextScaleX(float f2) {
        if (f2 != this.mTextPaint.getTextScaleX()) {
            this.mTextPaint.setTextScaleX(f2);
            measureContent();
        }
    }

    public void setTypeface(Typeface typeface) {
        if (this.mTextPaint.getTypeface() != typeface) {
            this.mTextPaint.setTypeface(typeface);
            measureContent();
        }
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        if (this.mTextPath == null) {
            this.mTextLayout.draw(canvas);
        } else {
            canvas.drawTextOnPath(this.mText.toString(), this.mTextPath, 0.0f, 0.0f, this.mTextPaint);
        }
        canvas.restoreToCount(save);
    }

    public TextDrawable(Context context) {
        TypedArray typedArray;
        int i;
        int i2;
        ColorStateList colorStateList;
        this.mResources = context.getResources();
        this.mTextBounds = new Rect();
        this.mTextPaint = new TextPaint(1);
        this.mTextPaint.density = this.mResources.getDisplayMetrics().density;
        this.mTextPaint.setDither(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(themeAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        Typeface typeface = null;
        if (resourceId != -1) {
            typedArray = context.obtainStyledAttributes(resourceId, appearanceAttributes);
        } else {
            typedArray = null;
        }
        int i3 = 15;
        if (typedArray != null) {
            colorStateList = null;
            i2 = -1;
            i = -1;
            for (int i4 = 0; i4 < typedArray.getIndexCount(); i4++) {
                int index = typedArray.getIndex(i4);
                switch (index) {
                    case 0:
                        i3 = obtainStyledAttributes.getDimensionPixelSize(index, i3);
                        break;
                    case 1:
                        i2 = obtainStyledAttributes.getInt(index, i2);
                        break;
                    case 2:
                        i = obtainStyledAttributes.getInt(index, i);
                        break;
                    case 3:
                        colorStateList = obtainStyledAttributes.getColorStateList(index);
                        break;
                }
            }
            typedArray.recycle();
        } else {
            colorStateList = null;
            i2 = -1;
            i = -1;
        }
        setTextColor(colorStateList == null ? ColorStateList.valueOf(-16777216) : colorStateList);
        setRawTextSize((float) i3);
        switch (i2) {
            case 1:
                typeface = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface = Typeface.SERIF;
                break;
            case 3:
                typeface = Typeface.MONOSPACE;
                break;
        }
        setTypeface(typeface, i);
    }

    public void setTextSize(int i, float f2) {
        setRawTextSize(TypedValue.applyDimension(i, f2, this.mResources.getDisplayMetrics()));
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        int i2;
        float f2 = 0.0f;
        boolean z = false;
        if (i > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i);
            } else {
                typeface2 = Typeface.create(typeface, i);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i2 = typeface2.getStyle();
            } else {
                i2 = 0;
            }
            int i3 = (i2 ^ -1) & i;
            TextPaint textPaint = this.mTextPaint;
            if ((i3 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.mTextPaint;
            if ((i3 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.mTextPaint.setFakeBoldText(false);
        this.mTextPaint.setTextSkewX(0.0f);
        setTypeface(typeface);
    }
}

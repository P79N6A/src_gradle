package android.support.design.card;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Dimension;
import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class MaterialCardViewHelper {
    private final MaterialCardView materialCardView;
    private int strokeColor;
    private int strokeWidth;

    /* access modifiers changed from: package-private */
    @ColorInt
    public int getStrokeColor() {
        return this.strokeColor;
    }

    /* access modifiers changed from: package-private */
    @Dimension
    public int getStrokeWidth() {
        return this.strokeWidth;
    }

    /* access modifiers changed from: package-private */
    public void updateForeground() {
        this.materialCardView.setForeground(createForegroundDrawable());
    }

    private Drawable createForegroundDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.materialCardView.getRadius());
        if (this.strokeColor != -1) {
            gradientDrawable.setStroke(this.strokeWidth, this.strokeColor);
        }
        return gradientDrawable;
    }

    private void adjustContentPadding() {
        this.materialCardView.setContentPadding(this.materialCardView.getContentPaddingLeft() + this.strokeWidth, this.materialCardView.getContentPaddingTop() + this.strokeWidth, this.materialCardView.getContentPaddingRight() + this.strokeWidth, this.materialCardView.getContentPaddingBottom() + this.strokeWidth);
    }

    public MaterialCardViewHelper(MaterialCardView materialCardView2) {
        this.materialCardView = materialCardView2;
    }

    /* access modifiers changed from: package-private */
    public void setStrokeColor(@ColorInt int i) {
        this.strokeColor = i;
        updateForeground();
    }

    /* access modifiers changed from: package-private */
    public void setStrokeWidth(@Dimension int i) {
        this.strokeWidth = i;
        updateForeground();
        adjustContentPadding();
    }

    public void loadFromAttributes(TypedArray typedArray) {
        this.strokeColor = typedArray.getColor(0, -1);
        this.strokeWidth = typedArray.getDimensionPixelSize(1, 0);
        updateForeground();
        adjustContentPadding();
    }
}

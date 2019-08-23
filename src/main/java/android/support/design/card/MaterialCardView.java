package android.support.design.card;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.ColorInt;
import android.support.annotation.Dimension;
import android.support.design.R$styleable;
import android.support.design.internal.ThemeEnforcement;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import com.ss.android.ugc.aweme.C0906R;

public class MaterialCardView extends CardView {
    private final MaterialCardViewHelper cardViewHelper;

    @ColorInt
    public int getStrokeColor() {
        return this.cardViewHelper.getStrokeColor();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.cardViewHelper.getStrokeWidth();
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public void setStrokeColor(@ColorInt int i) {
        this.cardViewHelper.setStrokeColor(i);
    }

    public void setStrokeWidth(@Dimension int i) {
        this.cardViewHelper.setStrokeWidth(i);
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        this.cardViewHelper.updateForeground();
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0906R.attr.ud);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R$styleable.MaterialCardView, i, C0906R.style.pk, new int[0]);
        this.cardViewHelper = new MaterialCardViewHelper(this);
        this.cardViewHelper.loadFromAttributes(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}

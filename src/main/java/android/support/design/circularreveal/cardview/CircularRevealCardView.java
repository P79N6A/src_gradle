package android.support.design.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.design.circularreveal.CircularRevealHelper;
import android.support.design.circularreveal.CircularRevealWidget;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;

public class CircularRevealCardView extends CardView implements CircularRevealWidget {
    private final CircularRevealHelper helper;

    public boolean actualIsOpaque() {
        return super.isOpaque();
    }

    public void buildCircularRevealCache() {
        this.helper.buildCircularRevealCache();
    }

    public void destroyCircularRevealCache() {
        this.helper.destroyCircularRevealCache();
    }

    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.helper.getCircularRevealOverlayDrawable();
    }

    public int getCircularRevealScrimColor() {
        return this.helper.getCircularRevealScrimColor();
    }

    @Nullable
    public CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.helper.getRevealInfo();
    }

    public boolean isOpaque() {
        if (this.helper != null) {
            return this.helper.isOpaque();
        }
        return super.isOpaque();
    }

    public void actualDraw(Canvas canvas) {
        super.draw(canvas);
    }

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.helper.setCircularRevealOverlayDrawable(drawable);
    }

    public void setCircularRevealScrimColor(@ColorInt int i) {
        this.helper.setCircularRevealScrimColor(i);
    }

    public void setRevealInfo(@Nullable CircularRevealWidget.RevealInfo revealInfo) {
        this.helper.setRevealInfo(revealInfo);
    }

    public void draw(Canvas canvas) {
        if (this.helper != null) {
            this.helper.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new CircularRevealHelper(this);
    }
}

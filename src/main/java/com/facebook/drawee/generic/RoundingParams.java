package com.facebook.drawee.generic;

import android.support.annotation.ColorInt;
import com.facebook.common.internal.Preconditions;
import java.util.Arrays;
import javax.annotation.Nullable;

public class RoundingParams {
    private int mBorderColor;
    private float mBorderWidth;
    private float[] mCornersRadii;
    private int mOverlayColor;
    private float mPadding;
    private boolean mRoundAsCircle;
    private RoundingMethod mRoundingMethod = RoundingMethod.BITMAP_ONLY;
    private boolean mScaleDownInsideBorders;

    public enum RoundingMethod {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public int getBorderColor() {
        return this.mBorderColor;
    }

    public float getBorderWidth() {
        return this.mBorderWidth;
    }

    public float[] getCornersRadii() {
        return this.mCornersRadii;
    }

    public int getOverlayColor() {
        return this.mOverlayColor;
    }

    public float getPadding() {
        return this.mPadding;
    }

    public boolean getRoundAsCircle() {
        return this.mRoundAsCircle;
    }

    public RoundingMethod getRoundingMethod() {
        return this.mRoundingMethod;
    }

    public boolean getScaleDownInsideBorders() {
        return this.mScaleDownInsideBorders;
    }

    public static RoundingParams asCircle() {
        return new RoundingParams().setRoundAsCircle(true);
    }

    private float[] getOrCreateRoundedCornersRadii() {
        if (this.mCornersRadii == null) {
            this.mCornersRadii = new float[8];
        }
        return this.mCornersRadii;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.mRoundingMethod != null) {
            i = this.mRoundingMethod.hashCode();
        } else {
            i = 0;
        }
        int i5 = ((i * 31) + (this.mRoundAsCircle ? 1 : 0)) * 31;
        if (this.mCornersRadii != null) {
            i2 = Arrays.hashCode(this.mCornersRadii);
        } else {
            i2 = 0;
        }
        int i6 = (((i5 + i2) * 31) + this.mOverlayColor) * 31;
        if (this.mBorderWidth != 0.0f) {
            i3 = Float.floatToIntBits(this.mBorderWidth);
        } else {
            i3 = 0;
        }
        int i7 = (((i6 + i3) * 31) + this.mBorderColor) * 31;
        if (this.mPadding != 0.0f) {
            i4 = Float.floatToIntBits(this.mPadding);
        }
        return ((i7 + i4) * 31) + (this.mScaleDownInsideBorders ? 1 : 0);
    }

    public RoundingParams setBorderColor(@ColorInt int i) {
        this.mBorderColor = i;
        return this;
    }

    public RoundingParams setRoundAsCircle(boolean z) {
        this.mRoundAsCircle = z;
        return this;
    }

    public RoundingParams setRoundingMethod(RoundingMethod roundingMethod) {
        this.mRoundingMethod = roundingMethod;
        return this;
    }

    public RoundingParams setScaleDownInsideBorders(boolean z) {
        this.mScaleDownInsideBorders = z;
        return this;
    }

    public RoundingParams setCornersRadius(float f2) {
        Arrays.fill(getOrCreateRoundedCornersRadii(), f2);
        return this;
    }

    public RoundingParams setOverlayColor(@ColorInt int i) {
        this.mOverlayColor = i;
        this.mRoundingMethod = RoundingMethod.OVERLAY_COLOR;
        return this;
    }

    public static RoundingParams fromCornersRadius(float f2) {
        return new RoundingParams().setCornersRadius(f2);
    }

    public RoundingParams setBorderWidth(float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "the border width cannot be < 0");
        this.mBorderWidth = f2;
        return this;
    }

    public RoundingParams setPadding(float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "the padding cannot be < 0");
        this.mPadding = f2;
        return this;
    }

    public static RoundingParams fromCornersRadii(float[] fArr) {
        return new RoundingParams().setCornersRadii(fArr);
    }

    public RoundingParams setCornersRadii(float[] fArr) {
        boolean z;
        Preconditions.checkNotNull(fArr);
        if (fArr.length == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, getOrCreateRoundedCornersRadii(), 0, 8);
        return this;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.mRoundAsCircle == roundingParams.mRoundAsCircle && this.mOverlayColor == roundingParams.mOverlayColor && Float.compare(roundingParams.mBorderWidth, this.mBorderWidth) == 0 && this.mBorderColor == roundingParams.mBorderColor && Float.compare(roundingParams.mPadding, this.mPadding) == 0 && this.mRoundingMethod == roundingParams.mRoundingMethod && this.mScaleDownInsideBorders == roundingParams.mScaleDownInsideBorders) {
            return Arrays.equals(this.mCornersRadii, roundingParams.mCornersRadii);
        }
        return false;
    }

    public RoundingParams setBorder(@ColorInt int i, float f2) {
        boolean z;
        if (f2 >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "the border width cannot be < 0");
        this.mBorderWidth = f2;
        this.mBorderColor = i;
        return this;
    }

    public static RoundingParams fromCornersRadii(float f2, float f3, float f4, float f5) {
        return new RoundingParams().setCornersRadii(f2, f3, f4, f5);
    }

    public RoundingParams setCornersRadii(float f2, float f3, float f4, float f5) {
        float[] orCreateRoundedCornersRadii = getOrCreateRoundedCornersRadii();
        orCreateRoundedCornersRadii[1] = f2;
        orCreateRoundedCornersRadii[0] = f2;
        orCreateRoundedCornersRadii[3] = f3;
        orCreateRoundedCornersRadii[2] = f3;
        orCreateRoundedCornersRadii[5] = f4;
        orCreateRoundedCornersRadii[4] = f4;
        orCreateRoundedCornersRadii[7] = f5;
        orCreateRoundedCornersRadii[6] = f5;
        return this;
    }
}

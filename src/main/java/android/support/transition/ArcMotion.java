package android.support.transition;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.support.v4.content.res.TypedArrayUtils;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

public class ArcMotion extends PathMotion {
    private static final float DEFAULT_MAX_TANGENT = ((float) Math.tan(Math.toRadians(35.0d)));
    private float mMaximumAngle = 70.0f;
    private float mMaximumTangent = DEFAULT_MAX_TANGENT;
    private float mMinimumHorizontalAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalAngle;
    private float mMinimumVerticalTangent;

    public float getMaximumAngle() {
        return this.mMaximumAngle;
    }

    public float getMinimumHorizontalAngle() {
        return this.mMinimumHorizontalAngle;
    }

    public float getMinimumVerticalAngle() {
        return this.mMinimumVerticalAngle;
    }

    public ArcMotion() {
    }

    public void setMaximumAngle(float f2) {
        this.mMaximumAngle = f2;
        this.mMaximumTangent = toTangent(f2);
    }

    public void setMinimumHorizontalAngle(float f2) {
        this.mMinimumHorizontalAngle = f2;
        this.mMinimumHorizontalTangent = toTangent(f2);
    }

    public void setMinimumVerticalAngle(float f2) {
        this.mMinimumVerticalAngle = f2;
        this.mMinimumVerticalTangent = toTangent(f2);
    }

    private static float toTangent(float f2) {
        if (f2 >= 0.0f && f2 <= 90.0f) {
            return (float) Math.tan(Math.toRadians((double) (f2 / 2.0f)));
        }
        throw new IllegalArgumentException("Arc must be between 0 and 90 degrees");
    }

    public ArcMotion(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.ARC_MOTION);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        setMinimumVerticalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumVerticalAngle", 1, 0.0f));
        setMinimumHorizontalAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "minimumHorizontalAngle", 0, 0.0f));
        setMaximumAngle(TypedArrayUtils.getNamedFloat(obtainStyledAttributes, xmlPullParser, "maximumAngle", 2, 70.0f));
        obtainStyledAttributes.recycle();
    }

    public Path getPath(float f2, float f3, float f4, float f5) {
        boolean z;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Path path = new Path();
        path.moveTo(f2, f3);
        float f11 = f4 - f2;
        float f12 = f5 - f3;
        float f13 = (f11 * f11) + (f12 * f12);
        float f14 = (f2 + f4) / 2.0f;
        float f15 = (f3 + f5) / 2.0f;
        float f16 = 0.25f * f13;
        if (f3 > f5) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs(f11) < Math.abs(f12)) {
            float abs = Math.abs(f13 / (f12 * 2.0f));
            if (z) {
                f7 = abs + f5;
                f8 = f4;
            } else {
                f7 = abs + f3;
                f8 = f2;
            }
            f6 = this.mMinimumVerticalTangent * f16 * this.mMinimumVerticalTangent;
        } else {
            float f17 = f13 / (f11 * 2.0f);
            if (z) {
                f10 = f3;
                f9 = f17 + f2;
            } else {
                f9 = f4 - f17;
                f10 = f5;
            }
            f6 = this.mMinimumHorizontalTangent * f16 * this.mMinimumHorizontalTangent;
        }
        float f18 = f14 - f8;
        float f19 = f15 - f7;
        float f20 = (f18 * f18) + (f19 * f19);
        float f21 = f16 * this.mMaximumTangent * this.mMaximumTangent;
        if (f20 >= f6) {
            if (f20 > f21) {
                f6 = f21;
            } else {
                f6 = 0.0f;
            }
        }
        if (f6 != 0.0f) {
            float sqrt = (float) Math.sqrt((double) (f6 / f20));
            f8 = ((f8 - f14) * sqrt) + f14;
            f7 = f15 + (sqrt * (f7 - f15));
        }
        float f22 = (f8 + f4) / 2.0f;
        float f23 = (f7 + f5) / 2.0f;
        path.cubicTo((f2 + f8) / 2.0f, (f3 + f7) / 2.0f, f22, f23, f4, f5);
        return path;
    }
}

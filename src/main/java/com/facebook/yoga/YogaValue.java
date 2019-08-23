package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public class YogaValue {
    static final YogaValue AUTO = new YogaValue(1.0E21f, YogaUnit.AUTO);
    static final YogaValue UNDEFINED = new YogaValue(1.0E21f, YogaUnit.UNDEFINED);
    static final YogaValue ZERO = new YogaValue(0.0f, YogaUnit.POINT);
    public final YogaUnit unit;
    public final float value;

    public int hashCode() {
        return Float.floatToIntBits(this.value) + this.unit.intValue();
    }

    public String toString() {
        switch (this.unit) {
            case UNDEFINED:
                return "undefined";
            case POINT:
                return Float.toString(this.value);
            case PERCENT:
                return this.value + "%";
            case AUTO:
                return "auto";
            default:
                throw new IllegalStateException();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            if (this.unit == yogaValue.unit) {
                if (this.unit == YogaUnit.UNDEFINED || Float.compare(this.value, yogaValue.value) == 0) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static YogaValue parse(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return UNDEFINED;
        }
        if ("auto".equals(str)) {
            return AUTO;
        }
        if (str.endsWith("%")) {
            return new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), YogaUnit.PERCENT);
        }
        return new YogaValue(Float.parseFloat(str), YogaUnit.POINT);
    }

    @DoNotStrip
    YogaValue(float f2, int i) {
        this(f2, YogaUnit.fromInt(i));
    }

    public YogaValue(float f2, YogaUnit yogaUnit) {
        this.value = f2;
        this.unit = yogaUnit;
    }
}
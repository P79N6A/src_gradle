package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaDirection {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaDirection fromInt(int i) {
        switch (i) {
            case 0:
                return INHERIT;
            case 1:
                return LTR;
            case 2:
                return RTL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    private YogaDirection(int i) {
        this.mIntValue = i;
    }
}

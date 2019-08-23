package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;

@DoNotStrip
public enum YogaNodeType {
    DEFAULT(0),
    TEXT(1);
    
    private final int mIntValue;

    public final int intValue() {
        return this.mIntValue;
    }

    public static YogaNodeType fromInt(int i) {
        switch (i) {
            case 0:
                return DEFAULT;
            case 1:
                return TEXT;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i);
        }
    }

    private YogaNodeType(int i) {
        this.mIntValue = i;
    }
}

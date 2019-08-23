package com.facebook.react.uimanager.layoutanimation;

public enum AnimatedPropertyType {
    OPACITY("opacity"),
    SCALE_XY("scaleXY");
    
    private final String mName;

    public final String toString() {
        return this.mName;
    }

    public static AnimatedPropertyType fromString(String str) {
        for (AnimatedPropertyType animatedPropertyType : values()) {
            if (animatedPropertyType.toString().equalsIgnoreCase(str)) {
                return animatedPropertyType;
            }
        }
        throw new IllegalArgumentException("Unsupported animated property : " + str);
    }

    private AnimatedPropertyType(String str) {
        this.mName = str;
    }
}

package com.facebook.react.uimanager.layoutanimation;

public enum InterpolatorType {
    LINEAR("linear"),
    EASE_IN("easeIn"),
    EASE_OUT("easeOut"),
    EASE_IN_EASE_OUT("easeInEaseOut"),
    SPRING("spring");
    
    private final String mName;

    public final String toString() {
        return this.mName;
    }

    public static InterpolatorType fromString(String str) {
        for (InterpolatorType interpolatorType : values()) {
            if (interpolatorType.toString().equalsIgnoreCase(str)) {
                return interpolatorType;
            }
        }
        throw new IllegalArgumentException("Unsupported interpolation type : " + str);
    }

    private InterpolatorType(String str) {
        this.mName = str;
    }
}

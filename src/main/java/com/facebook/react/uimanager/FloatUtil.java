package com.facebook.react.uimanager;

public class FloatUtil {
    public static boolean floatsEqual(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            if (!Float.isNaN(f2) || !Float.isNaN(f3)) {
                return false;
            }
            return true;
        } else if (Math.abs(f3 - f2) < 1.0E-5f) {
            return true;
        } else {
            return false;
        }
    }
}

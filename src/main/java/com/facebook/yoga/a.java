package com.facebook.yoga;

public final class a {
    public static boolean a(float f2) {
        if (Float.compare(f2, 1.0E9f) >= 0 || Float.compare(f2, -1.0E9f) <= 0) {
            return true;
        }
        return false;
    }
}

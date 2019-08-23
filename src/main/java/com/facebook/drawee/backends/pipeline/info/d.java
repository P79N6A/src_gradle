package com.facebook.drawee.backends.pipeline.info;

public final class d {
    public static String a(int i) {
        switch (i) {
            case 2:
                return "network";
            case 3:
                return "disk";
            case 4:
                return "memory_encoded";
            case 5:
                return "memory_bitmap";
            case 6:
                return "local";
            default:
                return "unknown";
        }
    }
}

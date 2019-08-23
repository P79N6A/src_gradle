package com.bumptech.glide.util.pool;

public final class GlideTrace {
    public static void beginSection(String str) {
    }

    public static void beginSectionFormat(String str, Object obj) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2) {
    }

    public static void beginSectionFormat(String str, Object obj, Object obj2, Object obj3) {
    }

    public static void endSection() {
    }

    private GlideTrace() {
    }

    private static String truncateTag(String str) {
        if (str.length() > 127) {
            return str.substring(0, 126);
        }
        return str;
    }
}

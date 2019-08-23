package com.tencent.mm.opensdk.constants;

public final class Build {
    public static final int SDK_INT = 620823552;

    private Build() {
        throw new RuntimeException(getClass().getSimpleName() + " should not be instantiated");
    }

    public static int getMajorVersion() {
        return 5;
    }

    public static int getMinorVersion() {
        return 1;
    }
}

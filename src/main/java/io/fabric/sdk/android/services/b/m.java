package io.fabric.sdk.android.services.b;

public enum m {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    
    private final int id;

    public final int getId() {
        return this.id;
    }

    public final String toString() {
        return Integer.toString(this.id);
    }

    public static m determineFrom(String str) {
        if ("io.crash.air".equals(str)) {
            return TEST_DISTRIBUTION;
        }
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    private m(int i) {
        this.id = i;
    }
}

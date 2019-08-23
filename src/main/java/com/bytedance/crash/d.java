package com.bytedance.crash;

public enum d {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    CUSTOM_JAVA("custom_java"),
    ALL("all");
    
    private String mName;

    public final String getName() {
        return this.mName;
    }

    private d(String str) {
        this.mName = str;
    }
}

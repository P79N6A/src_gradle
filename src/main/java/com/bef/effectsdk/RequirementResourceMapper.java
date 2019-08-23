package com.bef.effectsdk;

public final class RequirementResourceMapper {
    private static native String[] nativePeekResourcesNeededByRequirements(String[] strArr);

    private RequirementResourceMapper() {
    }

    public static String[] a(String[] strArr) {
        return nativePeekResourcesNeededByRequirements(strArr);
    }
}

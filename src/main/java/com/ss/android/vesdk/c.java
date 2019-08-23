package com.ss.android.vesdk;

public enum c {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;

    public static int[] toIntArray(c[] cVarArr) {
        if (cVarArr == null) {
            return null;
        }
        int length = cVarArr.length;
        int[] iArr = new int[cVarArr.length];
        for (int i = 0; i < length; i++) {
            iArr[i] = cVarArr[i].ordinal();
        }
        return iArr;
    }
}

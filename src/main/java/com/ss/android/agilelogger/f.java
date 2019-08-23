package com.ss.android.agilelogger;

import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class f {
    public static String a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            default:
                if (i < 2) {
                    return "V-" + (2 - i);
                }
                return "E+" + (i - 6);
        }
    }
}

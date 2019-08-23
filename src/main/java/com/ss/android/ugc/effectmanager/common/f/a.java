package com.ss.android.ugc.effectmanager.common.f;

import android.support.annotation.RestrictTo;
import java.io.File;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {
    public static String a(String str) {
        return str + File.separator + "effect_version";
    }

    public static String b(String str, String str2) {
        return str2 + File.separator + "effectchannel" + str;
    }

    public static String c(String str, String str2) {
        return str + File.separator + "category_version" + str2;
    }

    public static String a(String str, String str2) {
        return "effectchannel" + str2 + str;
    }

    public static String a(String str, String str2, int i, int i2, int i3) {
        return str + File.separator + "effectchannel" + str2 + i + "_" + i2 + "_" + i3;
    }
}

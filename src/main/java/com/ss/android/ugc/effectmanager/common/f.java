package com.ss.android.ugc.effectmanager.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class f {
    public static int a(String str, String str2) {
        Matcher matcher = Pattern.compile(str2).matcher(str);
        int i = -1;
        while (matcher.find()) {
            i = matcher.start();
        }
        return i;
    }
}

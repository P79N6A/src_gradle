package com.mapbox.a.c;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public final class a {
    public static boolean a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return true;
        }
        return false;
    }

    public static String a(double d2) {
        DecimalFormat decimalFormat = new DecimalFormat("0.######", new DecimalFormatSymbols(Locale.US));
        return String.format(Locale.US, "%s", new Object[]{decimalFormat.format(d2)});
    }

    public static String a(CharSequence charSequence, Object[] objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Object obj : objArr) {
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(obj);
        }
        return sb.toString();
    }
}

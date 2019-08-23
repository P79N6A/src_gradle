package com.ss.android.agilelogger.b.a;

import com.ss.android.agilelogger.f.l;

public final class b implements a {
    private static String a(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 10);
        String[] split = str.split(l.f27926a);
        int length = split.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(l.f27926a);
            }
            String str2 = split[i];
            sb.append(9553);
            sb.append(str2);
        }
        return sb.toString();
    }

    public final /* synthetic */ String a(Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        for (String str : strArr) {
            if (str != null) {
                strArr2[i] = str;
                i++;
            }
        }
        if (i == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("╔═══════════════════════════════════════════════════════════════════════════════════════════════════");
        sb.append(l.f27926a);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(a(strArr2[i2]));
            if (i2 != i - 1) {
                sb.append(l.f27926a);
                sb.append("╟───────────────────────────────────────────────────────────────────────────────────────────────────");
                sb.append(l.f27926a);
            } else {
                sb.append(l.f27926a);
                sb.append("╚═══════════════════════════════════════════════════════════════════════════════════════════════════");
            }
        }
        return sb.toString();
    }
}

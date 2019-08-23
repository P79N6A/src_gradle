package com.ali.auth.third.core.cookies;

import android.text.format.Time;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f4914a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f4915b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f4916a;

        /* renamed from: b  reason: collision with root package name */
        int f4917b;

        /* renamed from: c  reason: collision with root package name */
        int f4918c;

        a(int i, int i2, int i3) {
            this.f4916a = i;
            this.f4917b = i2;
            this.f4918c = i3;
        }
    }

    public static long a(String str) throws IllegalArgumentException {
        int i;
        int i2;
        int i3;
        a aVar;
        int i4;
        int i5;
        int i6;
        Matcher matcher = f4914a.matcher(str);
        if (matcher.find()) {
            int b2 = b(matcher.group(1));
            int c2 = c(matcher.group(2));
            int d2 = d(matcher.group(3));
            aVar = e(matcher.group(4));
            i2 = c2;
            i3 = b2;
            i = d2;
        } else {
            Matcher matcher2 = f4915b.matcher(str);
            if (matcher2.find()) {
                int c3 = c(matcher2.group(1));
                int b3 = b(matcher2.group(2));
                a e2 = e(matcher2.group(3));
                i = d(matcher2.group(4));
                i2 = c3;
                i3 = b3;
                aVar = e2;
            } else {
                throw new IllegalArgumentException();
            }
        }
        if (i >= 2038) {
            i6 = 1;
            i5 = 0;
            i4 = 2038;
        } else {
            i4 = i;
            i6 = i3;
            i5 = i2;
        }
        Time time = new Time("UTC");
        time.set(aVar.f4918c, aVar.f4917b, aVar.f4916a, i6, i5, i4);
        return time.toMillis(false);
    }

    private static int b(String str) {
        return str.length() == 2 ? ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0') : str.charAt(0) - '0';
    }

    private static int c(String str) {
        int lowerCase = ((Character.toLowerCase(str.charAt(0)) + Character.toLowerCase(str.charAt(1))) + Character.toLowerCase(str.charAt(2))) - 291;
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 9:
                return 11;
            case 10:
                return 1;
            default:
                switch (lowerCase) {
                    case 35:
                        return 9;
                    case 36:
                        return 4;
                    case 37:
                        return 8;
                    default:
                        throw new IllegalArgumentException();
                }
        }
    }

    private static int d(String str) {
        if (str.length() == 2) {
            int charAt = ((str.charAt(0) - '0') * 10) + (str.charAt(1) - '0');
            return charAt >= 70 ? charAt + 1900 : charAt + 2000;
        } else if (str.length() == 3) {
            return ((str.charAt(0) - '0') * 100) + ((str.charAt(1) - '0') * 10) + (str.charAt(2) - '0') + 1900;
        } else {
            if (str.length() == 4) {
                return ((str.charAt(0) - '0') * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
            }
            return 1970;
        }
    }

    private static a e(String str) {
        int i;
        int charAt = str.charAt(0) - '0';
        if (str.charAt(1) != ':') {
            i = 2;
            charAt = (charAt * 10) + (str.charAt(1) - '0');
        } else {
            i = 1;
        }
        int i2 = i + 1 + 1 + 1 + 1;
        return new a(charAt, ((str.charAt(r2) - '0') * 10) + (str.charAt(r3) - '0'), ((str.charAt(i2) - '0') * 10) + (str.charAt(i2 + 1) - '0'));
    }
}

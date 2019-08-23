package com.umeng.analytics.pro;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class q {
    public static long c(long j) {
        return a(j, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
    }

    public static long d(long j) {
        return a(j, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
    }

    private static int e(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance.get(5);
    }

    public static String a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return String.valueOf((b(j) * 240) + ((long) (((instance.get(11) * 10) + ((instance.get(12) / 6) + 1)) - 1)));
    }

    public static long b(long j) {
        long j2 = 0;
        try {
            long time = j - new SimpleDateFormat("yyyy", Locale.getDefault()).parse("1970").getTime();
            long j3 = time / 86400000;
            if (time % 86400000 > 0) {
                j2 = 1;
            }
            return j3 + j2;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static boolean a(long j, long j2) {
        if (e(j) == e(j2)) {
            return true;
        }
        return false;
    }

    private static long a(long j, int i) {
        int i2;
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i3 = (instance.get(11) * 10) + (instance.get(12) / 6) + 1;
        int i4 = instance.get(13);
        if (i == 1002) {
            i2 = 360 - (((instance.get(12) % 6) * 60) + i4);
        } else if (i == 1001) {
            int i5 = 60 - (i4 % 60);
            if (i3 % 6 == 0) {
                i2 = i5 + 60;
            } else {
                i2 = i5;
            }
        } else {
            i2 = 0;
        }
        return (long) (i2 * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
    }
}

package com.bytedance.common.utility.date;

import android.content.Context;
import com.ss.android.ugc.aweme.C0906R;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtils implements DateDef {
    private static final SimpleDateFormat DAY_FORMAT = new SimpleDateFormat("MM-dd HH:mm");
    private static final SimpleDateFormat YEAR_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private DateUtils() {
    }

    public static boolean isCurrentYear(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(1);
        instance.setTimeInMillis(System.currentTimeMillis());
        if (i == instance.get(1)) {
            return true;
        }
        return false;
    }

    public static String getDateString(Context context, long j) {
        if (!isCurrentYear(j)) {
            return YEAR_FORMAT.format(Long.valueOf(j));
        }
        if (!android.text.format.DateUtils.isToday(j)) {
            return DAY_FORMAT.format(Long.valueOf(j));
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= 3600000) {
            return context.getString(C0906R.string.an2, new Object[]{Long.valueOf(currentTimeMillis / 3600000)});
        } else if (currentTimeMillis < 60000) {
            return context.getString(C0906R.string.b41);
        } else {
            return context.getString(C0906R.string.bbu, new Object[]{Long.valueOf(currentTimeMillis / 60000)});
        }
    }
}

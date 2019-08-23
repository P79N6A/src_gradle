package com.xiaomi.push;

import android.app.ActivityManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.util.Calendar;
import java.util.List;

public class fb extends ex {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f82005a;

    public fb(Context context, int i) {
        super(context, i);
        this.f82005a = c.a(context, "mipush_extra", 0);
    }

    public int a() {
        return 9;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m221a() {
        return im.TopApp;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m222a() {
        String str;
        try {
            ActivityManager activityManager = (ActivityManager) this.f321a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (Build.VERSION.SDK_INT < 21) {
                str = activityManager.getRunningTasks(1).get(0).topActivity.getPackageName();
            } else {
                Calendar instance = Calendar.getInstance();
                instance.add(5, -1);
                long timeInMillis = instance.getTimeInMillis();
                instance.add(5, 1);
                List<UsageStats> queryUsageStats = ((UsageStatsManager) this.f321a.getSystemService("usagestats")).queryUsageStats(0, timeInMillis, instance.getTimeInMillis());
                if (ae.a(queryUsageStats)) {
                    return null;
                }
                long j = 0;
                String str2 = "";
                for (int i = 0; i < queryUsageStats.size(); i++) {
                    UsageStats usageStats = queryUsageStats.get(i);
                    if (usageStats.getLastTimeStamp() > j) {
                        j = usageStats.getLastTimeStamp();
                        str2 = usageStats.getPackageName();
                    }
                }
                str = str2;
            }
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.equals(str, this.f82005a.getString("ltapn", null))) {
            return "^";
        }
        this.f82005a.edit().putString("ltapn", str).commit();
        return str;
    }
}

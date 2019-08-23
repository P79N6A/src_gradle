package com.umeng.analytics.game;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.analytics.MobclickAgent;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.social.UMPlatformData;
import com.umeng.analytics.social.UMSocialService;
import com.umeng.analytics.social.d;

public class UMGameAgent extends MobclickAgent {

    /* renamed from: e  reason: collision with root package name */
    private static final c f80309e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static Context f80310f;

    public static void setTraceSleepTime(boolean z) {
        f80309e.a(z);
    }

    public static void init(Context context) {
        f80309e.a(context);
        f80310f = context.getApplicationContext();
    }

    public static void setPlayerLevel(int i) {
        f80309e.a(String.valueOf(i));
    }

    private static boolean a(String str) {
        if (str != null && str.trim().length() > 0) {
            return false;
        }
        return true;
    }

    public static void failLevel(String str) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (str.length() > 64) {
            by.e("Input string must be less than 64 chars");
        } else {
            f80309e.d(str);
        }
    }

    public static void finishLevel(String str) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (str.length() > 64) {
            by.e("Input string must be less than 64 chars");
        } else {
            f80309e.c(str);
        }
    }

    public static void startLevel(String str) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (str.length() > 64) {
            by.e("Input string must be less than 64 chars");
        } else {
            f80309e.b(str);
        }
    }

    public static void onEvent(String str, String str2) {
        onEvent(f80310f, str, str2);
    }

    public static void bonus(double d2, int i) {
        if (d2 < 0.0d) {
            by.e("Input value type is negative");
        } else if (i <= 0 || i >= 100) {
            by.e("The int value for 'Pay Channels' ranges between 1 ~ 99 ");
        } else {
            f80309e.a(d2, i);
        }
    }

    public static void onSocialEvent(Context context, UMPlatformData... uMPlatformDataArr) {
        if (context == null) {
            by.e("context is null in onShareEvent");
            return;
        }
        d.f80726d = PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION;
        UMSocialService.share(context, uMPlatformDataArr);
    }

    public static void onSocialEvent(Context context, String str, UMPlatformData... uMPlatformDataArr) {
        if (context == null) {
            by.e("context is null in onShareEvent");
            return;
        }
        d.f80726d = PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION;
        UMSocialService.share(context, str, uMPlatformDataArr);
    }

    public static void buy(String str, int i, double d2) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (i < 0 || d2 < 0.0d) {
            by.e("Input value type is negative");
        } else {
            f80309e.a(str, i, d2);
        }
    }

    public static void pay(double d2, double d3, int i) {
        if (i <= 0 || i >= 100) {
            by.e("The int value for 'Pay Channels' ranges between 1 ~ 99 ");
        } else if (d2 < 0.0d || d3 < 0.0d) {
            by.e("Input value type is negative");
        } else {
            f80309e.a(d2, d3, i);
        }
    }

    public static void use(String str, int i, double d2) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (i < 0 || d2 < 0.0d) {
            by.e("Input value type is negative");
        } else {
            f80309e.b(str, i, d2);
        }
    }

    public static void bonus(String str, int i, double d2, int i2) {
        if (a(str)) {
            by.e("Input string is null or empty");
        } else if (i < 0 || d2 < 0.0d) {
            by.e("Input value type is negative");
        } else if (i2 <= 0 || i2 >= 100) {
            by.e("The int value for 'Pay Channels' ranges between 1 ~ 99 ");
        } else {
            f80309e.a(str, i, d2, i2);
        }
    }

    public static void exchange(double d2, String str, double d3, int i, String str2) {
        if (d2 < 0.0d || d3 < 0.0d) {
            by.e("Input value type is negative");
        } else if (i <= 0 || i >= 100) {
            by.e("The int value for 'Pay Channels' ranges between 1 ~ 99 ");
        } else {
            f80309e.a(d2, str, d3, i, str2);
        }
    }

    public static void pay(double d2, String str, int i, double d3, int i2) {
        if (i2 <= 0 || i2 >= 100) {
            by.e("The int value for 'Pay Channels' ranges between 1 ~ 99 ");
        } else if (d2 < 0.0d || i < 0 || d3 < 0.0d) {
            by.e("Input value type is negative");
        } else if (a(str)) {
            by.e("Input string is null or empty");
        } else {
            f80309e.a(d2, str, i, d3, i2);
        }
    }
}

package com.bytedance.common.utility.android;

import android.app.Activity;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.Settings;
import android.view.WindowManager;

public class BrightnessUtil {
    public static void startAutoBrightness(Activity activity) {
        if (activity != null) {
            Settings.System.putInt(activity.getContentResolver(), "screen_brightness_mode", 1);
        }
    }

    public static void stopAutoBrightness(Activity activity) {
        Settings.System.putInt(activity.getContentResolver(), "screen_brightness_mode", 0);
    }

    public static int getBrightness(Activity activity) {
        int i;
        if (activity == null) {
            return 0;
        }
        try {
            i = Settings.System.getInt(activity.getContentResolver(), "screen_brightness");
        } catch (Exception unused) {
            i = 0;
        }
        return i;
    }

    public static float getScreenBrightness(Activity activity) {
        float f2;
        if (activity == null) {
            return 0.0f;
        }
        try {
            f2 = activity.getWindow().getAttributes().screenBrightness;
        } catch (Exception unused) {
            f2 = 0.0f;
        }
        return f2;
    }

    public static boolean isAutoBrightness(Activity activity) {
        boolean z = false;
        if (activity == null) {
            return false;
        }
        try {
            if (Settings.System.getInt(activity.getContentResolver(), "screen_brightness_mode") == 1) {
                z = true;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return z;
    }

    public static void saveBrightness(Activity activity, int i) {
        if (activity != null) {
            Uri uriFor = Settings.System.getUriFor("screen_brightness");
            ContentResolver contentResolver = activity.getContentResolver();
            Settings.System.putInt(contentResolver, "screen_brightness", i);
            contentResolver.notifyChange(uriFor, null);
        }
    }

    public static void setScreenBrightness(Activity activity, int i) {
        if (activity != null) {
            try {
                WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
                attributes.screenBrightness = ((float) i) * 0.003921569f;
                activity.getWindow().setAttributes(attributes);
            } catch (Exception unused) {
            }
        }
    }
}

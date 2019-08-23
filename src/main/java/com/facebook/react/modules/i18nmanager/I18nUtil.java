package com.facebook.react.modules.i18nmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.text.TextUtilsCompat;
import com.ss.android.ugc.aweme.q.c;
import java.util.Locale;

public class I18nUtil {
    private static I18nUtil sharedI18nUtilInstance;

    private I18nUtil() {
    }

    public static I18nUtil getInstance() {
        if (sharedI18nUtilInstance == null) {
            sharedI18nUtilInstance = new I18nUtil();
        }
        return sharedI18nUtilInstance;
    }

    private boolean isDevicePreferredLanguageRTL() {
        if (TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    private boolean isRTLAllowed(Context context) {
        return isPrefSet(context, "RCTI18nUtil_allowRTL", true);
    }

    private boolean isRTLForced(Context context) {
        return isPrefSet(context, "RCTI18nUtil_forceRTL", false);
    }

    public boolean doLeftAndRightSwapInRTL(Context context) {
        return isPrefSet(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", true);
    }

    public boolean isRTL(Context context) {
        if (isRTLForced(context)) {
            return true;
        }
        if (!isRTLAllowed(context) || !isDevicePreferredLanguageRTL()) {
            return false;
        }
        return true;
    }

    public void allowRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_allowRTL", z);
    }

    public void forceRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_forceRTL", z);
    }

    public void swapLeftAndRightInRTL(Context context, boolean z) {
        setPref(context, "RCTI18nUtil_makeRTLFlipLeftAndRightStyles", z);
    }

    private boolean isPrefSet(Context context, String str, boolean z) {
        return c.a(context, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean(str, z);
    }

    private void setPref(Context context, String str, boolean z) {
        SharedPreferences.Editor edit = c.a(context, "com.facebook.react.modules.i18nmanager.I18nUtil", 0).edit();
        edit.putBoolean(str, z);
        edit.apply();
    }
}

package com.bytedance.ies.uikit.base;

import android.app.Activity;

public class ActivityTransUtils {
    public static int SLIDE_IN_LEFT_NONE = 0;
    public static int SLIDE_IN_LEFT_NORMAL = 2130968710;
    public static int SLIDE_IN_LEFT_VIDEO = 2130968711;
    public static int SLIDE_IN_RIGHT_NONE = 0;
    public static int SLIDE_IN_RIGHT_NORAML = 2130968712;
    public static int SLIDE_IN_RIGHT_VIDEO = 2130968714;
    public static int SLIDE_OUT_LEFT_NONE = 0;
    public static int SLIDE_OUT_LEFT_NORMAL = 2130968721;
    public static int SLIDE_OUT_LEFT_VIDEO = 2130968723;
    public static int SLIDE_OUT_RIGHT_NONE = 0;
    public static int SLIDE_OUT_RIGHT_NORMAL = 2130968724;
    public static int SLIDE_OUT_RIGHT_VIDEO = 2130968725;

    public static void finishActivityAnim(Activity activity, int i) {
        int i2;
        int i3;
        if (activity != null) {
            switch (i) {
                case 0:
                    i2 = SLIDE_IN_LEFT_NORMAL;
                    i3 = SLIDE_OUT_RIGHT_NORMAL;
                    break;
                case 1:
                    i2 = SLIDE_IN_LEFT_NONE;
                    i3 = SLIDE_OUT_RIGHT_NONE;
                    break;
                case 2:
                    i2 = SLIDE_IN_LEFT_VIDEO;
                    i3 = SLIDE_OUT_RIGHT_VIDEO;
                    break;
                default:
                    i2 = SLIDE_IN_LEFT_NORMAL;
                    i3 = SLIDE_OUT_RIGHT_NORMAL;
                    break;
            }
            if (activity instanceof SSActivity) {
                ((SSActivity) activity).superOverridePendingTransition(i2, i3);
            } else {
                activity.overridePendingTransition(i2, i3);
            }
        }
    }

    public static void startActivityAnim(Activity activity, int i) {
        int i2;
        int i3;
        if (activity != null) {
            switch (i) {
                case 0:
                    i2 = SLIDE_IN_RIGHT_NORAML;
                    i3 = SLIDE_OUT_LEFT_NORMAL;
                    break;
                case 1:
                    i2 = SLIDE_IN_RIGHT_NONE;
                    i3 = SLIDE_OUT_LEFT_NONE;
                    break;
                case 2:
                    i2 = SLIDE_IN_RIGHT_VIDEO;
                    i3 = SLIDE_OUT_LEFT_VIDEO;
                    break;
                default:
                    i2 = SLIDE_IN_RIGHT_NORAML;
                    i3 = SLIDE_OUT_LEFT_NORMAL;
                    break;
            }
            if (activity instanceof SSActivity) {
                ((SSActivity) activity).superOverridePendingTransition(i2, i3);
            } else {
                activity.overridePendingTransition(i2, i3);
            }
        }
    }
}

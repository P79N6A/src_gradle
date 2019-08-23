package android.support.v4.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public final class AccessibilityServiceInfoCompat {
    @NonNull
    public static String capabilityToString(int i) {
        if (i == 4) {
            return "CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 8) {
            return "CAPABILITY_CAN_FILTER_KEY_EVENTS";
        }
        switch (i) {
            case 1:
                return "CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT";
            case 2:
                return "CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION";
            default:
                return "UNKNOWN";
        }
    }

    @Nullable
    public static String flagToString(int i) {
        if (i == 4) {
            return "FLAG_REQUEST_TOUCH_EXPLORATION_MODE";
        }
        if (i == 8) {
            return "FLAG_REQUEST_ENHANCED_WEB_ACCESSIBILITY";
        }
        if (i == 16) {
            return "FLAG_REPORT_VIEW_IDS";
        }
        if (i == 32) {
            return "FLAG_REQUEST_FILTER_KEY_EVENTS";
        }
        switch (i) {
            case 1:
                return "DEFAULT";
            case 2:
                return "FLAG_INCLUDE_NOT_IMPORTANT_VIEWS";
            default:
                return null;
        }
    }

    private AccessibilityServiceInfoCompat() {
    }

    public static int getCapabilities(@NonNull AccessibilityServiceInfo accessibilityServiceInfo) {
        if (Build.VERSION.SDK_INT >= 18) {
            return accessibilityServiceInfo.getCapabilities();
        }
        if (accessibilityServiceInfo.getCanRetrieveWindowContent()) {
            return 1;
        }
        return 0;
    }

    @NonNull
    public static String feedbackTypeToString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (i > 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(i);
            i &= numberOfTrailingZeros ^ -1;
            if (sb.length() > 1) {
                sb.append(", ");
            }
            if (numberOfTrailingZeros == 4) {
                sb.append("FEEDBACK_AUDIBLE");
            } else if (numberOfTrailingZeros == 8) {
                sb.append("FEEDBACK_VISUAL");
            } else if (numberOfTrailingZeros != 16) {
                switch (numberOfTrailingZeros) {
                    case 1:
                        sb.append("FEEDBACK_SPOKEN");
                        break;
                    case 2:
                        sb.append("FEEDBACK_HAPTIC");
                        break;
                }
            } else {
                sb.append("FEEDBACK_GENERIC");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Nullable
    public static String loadDescription(@NonNull AccessibilityServiceInfo accessibilityServiceInfo, @NonNull PackageManager packageManager) {
        if (Build.VERSION.SDK_INT >= 16) {
            return accessibilityServiceInfo.loadDescription(packageManager);
        }
        return accessibilityServiceInfo.getDescription();
    }
}

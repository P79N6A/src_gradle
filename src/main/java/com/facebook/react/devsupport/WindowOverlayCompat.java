package com.facebook.react.devsupport;

import android.os.Build;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class WindowOverlayCompat {
    static final int TYPE_SYSTEM_ALERT;
    static final int TYPE_SYSTEM_OVERLAY;

    WindowOverlayCompat() {
    }

    static {
        int i;
        int i2 = 2038;
        if (Build.VERSION.SDK_INT < 26) {
            i = PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE;
        } else {
            i = 2038;
        }
        TYPE_SYSTEM_ALERT = i;
        if (Build.VERSION.SDK_INT < 26) {
            i2 = 2006;
        }
        TYPE_SYSTEM_OVERLAY = i2;
    }
}

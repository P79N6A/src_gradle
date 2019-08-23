package com.xiaomi.push;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public class et extends ex {
    public et(Context context, int i) {
        super(context, i);
    }

    public int a() {
        return 5;
    }

    /* renamed from: a  reason: collision with other method in class */
    public im m205a() {
        return im.AppActiveList;
    }

    /* renamed from: a  reason: collision with other method in class */
    public String m206a() {
        StringBuilder sb = new StringBuilder();
        try {
            for (ActivityManager.RunningTaskInfo next : ((ActivityManager) this.f321a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(10)) {
                if (!(next == null || next.topActivity == null)) {
                    if (sb.length() > 0) {
                        sb.append(";");
                    }
                    sb.append(next.topActivity.getPackageName());
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(sb)) {
            return null;
        }
        return sb.toString();
    }
}

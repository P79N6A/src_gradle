package com.vivo.push.c;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.util.o;
import java.util.List;

public final class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81575a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s f81576b;

    public final void run() {
        String packageName = this.f81575a.getPackageName();
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) this.f81575a.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getRunningTasks(100);
            if (runningTasks != null) {
                for (ActivityManager.RunningTaskInfo runningTaskInfo : runningTasks) {
                    ComponentName componentName = runningTaskInfo.topActivity;
                    if (componentName.getPackageName().equals(packageName)) {
                        o.d("OnNotificationClickTask", "topClassName=" + componentName.getClassName());
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        intent.setFlags(270532608);
                        this.f81575a.startActivity(intent);
                        return;
                    }
                }
            }
        } catch (Exception e2) {
            o.a("OnNotificationClickTask", "start recentIntent is error", e2);
        }
        Intent launchIntentForPackage = this.f81575a.getPackageManager().getLaunchIntentForPackage(this.f81575a.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(268435456);
            this.f81575a.startActivity(launchIntentForPackage);
            return;
        }
        o.a("OnNotificationClickTask", "LaunchIntent is null");
    }

    x(s sVar, Context context) {
        this.f81576b = sVar;
        this.f81575a = context;
    }
}

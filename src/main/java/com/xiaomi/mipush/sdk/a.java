package com.xiaomi.mipush.sdk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.xiaomi.push.fy;
import com.xiaomi.push.fz;
import java.util.HashSet;
import java.util.Set;

@TargetApi(14)
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private Set<String> f81742a = new HashSet();

    private static void a(Application application) {
        application.registerActivityLifecycleCallbacks(new a());
    }

    public static void a(Context context) {
        a((Application) context.getApplicationContext());
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        fz a2;
        String packageName;
        String a3;
        int i;
        String str;
        Intent intent = activity.getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("messageId");
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (!TextUtils.isEmpty(stringExtra) && intExtra > 0 && !this.f81742a.contains(stringExtra)) {
                this.f81742a.add(stringExtra);
                if (intExtra == 3000) {
                    a2 = fz.a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a3 = fy.a(intExtra);
                    i = 3008;
                    str = "App calls by business message is visiable";
                } else if (intExtra == 1000) {
                    a2 = fz.a(activity.getApplicationContext());
                    packageName = activity.getPackageName();
                    a3 = fy.a(intExtra);
                    i = 1008;
                    str = "app calls by notification message is visiable";
                }
                a2.a(packageName, a3, stringExtra, i, str);
            }
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}

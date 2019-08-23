package com.xiaomi.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.f;

public class fm implements fr {
    fm() {
    }

    private void a(Activity activity, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b2 = fj.b(stringExtra);
            if (!TextUtils.isEmpty(b2)) {
                fk.a(activity.getApplicationContext(), b2, 1007, "play with activity successfully");
            } else {
                fk.a(activity.getApplicationContext(), PushConstants.INTENT_ACTIVITY_NAME, 1008, "B get incorrect message");
            }
        } else {
            fk.a(activity.getApplicationContext(), PushConstants.INTENT_ACTIVITY_NAME, 1008, "B get incorrect message");
        }
    }

    private void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str3)) {
                fk.a(context, PushConstants.INTENT_ACTIVITY_NAME, 1008, "argument error");
            } else {
                fk.a(context, str3, 1008, "argument error");
            }
        } else if (!f.b(context, str, str2)) {
            fk.a(context, str3, 1003, "B is not ready");
        } else {
            fk.a(context, str3, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "B is ready");
            fk.a(context, str3, CrashModule.MODULE_ID, "A is ready");
            Intent intent = new Intent(str2);
            intent.setPackage(str);
            intent.putExtra("awake_info", fj.a(str3));
            intent.addFlags(276824064);
            intent.setAction(str2);
            try {
                context.startActivity(intent);
                fk.a(context, str3, 1005, "A is successful");
                fk.a(context, str3, 1006, "The job is finished");
            } catch (Exception e2) {
                b.a((Throwable) e2);
                fk.a(context, str3, 1008, "A meet a exception when help B's activity");
            }
        }
    }

    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Activity) || intent == null) {
            fk.a(context, PushConstants.INTENT_ACTIVITY_NAME, 1008, "B receive incorrect message");
        } else {
            a((Activity) context, intent);
        }
    }

    public void a(Context context, fn fnVar) {
        if (fnVar != null) {
            a(context, fnVar.a(), fnVar.b(), fnVar.d());
        } else {
            fk.a(context, PushConstants.INTENT_ACTIVITY_NAME, 1008, "A receive incorrect message");
        }
    }
}

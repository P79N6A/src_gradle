package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.f;

public class fv implements fr {
    fv() {
    }

    private void a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (TextUtils.isEmpty(stringExtra)) {
                fk.a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                String b2 = fj.b(stringExtra2);
                if (!TextUtils.isEmpty(b2)) {
                    fk.a(service.getApplicationContext(), b2, 1007, "old version message ");
                } else {
                    fk.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
                }
            } else {
                fk.a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
            }
        }
    }

    private void a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                fk.a(context, "service", 1008, "argument error");
            } else {
                fk.a(context, str3, 1008, "argument error");
            }
        } else if (!f.a(context, str)) {
            fk.a(context, str3, 1003, "B is not ready");
        } else {
            fk.a(context, str3, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "B is ready");
            fk.a(context, str3, CrashModule.MODULE_ID, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", context.getPackageName());
                intent.putExtra("awake_info", fj.a(str3));
                if (context.startService(intent) != null) {
                    fk.a(context, str3, 1005, "A is successful");
                    fk.a(context, str3, 1006, "The job is finished");
                    return;
                }
                fk.a(context, str3, 1008, "A is fail to help B's service");
            } catch (Exception e2) {
                b.a((Throwable) e2);
                fk.a(context, str3, 1008, "A meet a exception when help B's service");
            }
        }
    }

    public void a(Context context, Intent intent, String str) {
        if (context != null && (context instanceof Service)) {
            a((Service) context, intent);
        }
    }

    public void a(Context context, fn fnVar) {
        if (fnVar != null) {
            a(context, fnVar.a(), fnVar.c(), fnVar.d());
        }
    }
}

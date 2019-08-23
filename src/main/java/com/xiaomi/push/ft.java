package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.f;

public class ft implements fr {
    ft() {
    }

    private void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str) || context == null) {
                fk.a(context, "provider", 1008, "B get a incorrect message");
                return;
            }
            String[] split = str.split("/");
            if (split.length <= 0 || TextUtils.isEmpty(split[split.length - 1])) {
                fk.a(context, "provider", 1008, "B get a incorrect message");
                return;
            }
            String str2 = split[split.length - 1];
            if (TextUtils.isEmpty(str2)) {
                fk.a(context, "provider", 1008, "B get a incorrect message");
                return;
            }
            String decode = Uri.decode(str2);
            if (TextUtils.isEmpty(decode)) {
                fk.a(context, "provider", 1008, "B get a incorrect message");
                return;
            }
            String b2 = fj.b(decode);
            if (!TextUtils.isEmpty(b2)) {
                fk.a(context, b2, 1007, "play with provider successfully");
            } else {
                fk.a(context, "provider", 1008, "B get a incorrect message");
            }
        } catch (Exception e2) {
            fk.a(context, "provider", 1008, "B meet a exception" + e2.getMessage());
        }
    }

    private void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str2)) {
                fk.a(context, "provider", 1008, "argument error");
            } else {
                fk.a(context, str2, 1008, "argument error");
            }
        } else if (!f.b(context, str)) {
            fk.a(context, str2, 1003, "B is not ready");
        } else {
            fk.a(context, str2, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, "B is ready");
            fk.a(context, str2, CrashModule.MODULE_ID, "A is ready");
            String a2 = fj.a(str2);
            try {
                if (!TextUtils.isEmpty(a2)) {
                    String type = context.getContentResolver().getType(fj.a(str, a2));
                    if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                        fk.a(context, str2, 1008, "A is fail to help B's provider");
                        return;
                    }
                    fk.a(context, str2, 1005, "A is successful");
                    fk.a(context, str2, 1006, "The job is finished");
                    return;
                }
                fk.a(context, str2, 1008, "info is empty");
            } catch (Exception e2) {
                b.a((Throwable) e2);
                fk.a(context, str2, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    public void a(Context context, Intent intent, String str) {
        a(context, str);
    }

    public void a(Context context, fn fnVar) {
        if (fnVar != null) {
            a(context, fnVar.b(), fnVar.d());
        } else {
            fk.a(context, "provider", 1008, "A receive incorrect message");
        }
    }
}

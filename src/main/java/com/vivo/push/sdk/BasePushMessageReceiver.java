package com.vivo.push.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.model.UnvarnishedMessage;
import com.vivo.push.p;
import com.vivo.push.util.o;
import com.vivo.push.util.r;
import java.util.List;

public abstract class BasePushMessageReceiver extends BroadcastReceiver implements PushMessageCallback {
    public void onBind(Context context, int i, String str) {
    }

    public void onDelAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    public void onDelTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    public void onListTags(Context context, int i, List<String> list, String str) {
    }

    public void onLog(Context context, String str, int i, boolean z) {
    }

    public void onPublish(Context context, int i, String str) {
    }

    public void onSetAlias(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    public void onSetTags(Context context, int i, List<String> list, List<String> list2, String str) {
    }

    public void onTransmissionMessage(Context context, UnvarnishedMessage unvarnishedMessage) {
    }

    public void onUnBind(Context context, int i, String str) {
    }

    public boolean isAllowNet(Context context) {
        if (context == null) {
            o.a("PushMessageReceiver", "isAllowNet sContext is null");
            return false;
        }
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            o.a("PushMessageReceiver", "isAllowNet pkgName is null");
            return false;
        }
        Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
        intent.setPackage(packageName);
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 576);
        if (queryIntentServices != null && queryIntentServices.size() > 0) {
            return r.a(context, packageName);
        }
        o.a("PushMessageReceiver", "this is client sdk");
        return true;
    }

    public final void onReceive(Context context, Intent intent) {
        Context applicationContext = context.getApplicationContext();
        p.a().a(applicationContext);
        try {
            int intExtra = intent.getIntExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, -1);
            String stringExtra = intent.getStringExtra("req_id");
            o.d("PushMessageReceiver", "PushMessageReceiver " + applicationContext.getPackageName() + " ; type = " + intExtra + " ; requestId = " + stringExtra);
            try {
                p.a().a(intent, (PushMessageCallback) this);
            } catch (Exception e2) {
                a.b(e2);
            }
        } catch (Exception e3) {
            o.b("PushMessageReceiver", "get method error", e3);
        }
    }
}

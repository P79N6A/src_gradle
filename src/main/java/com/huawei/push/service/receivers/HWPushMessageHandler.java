package com.huawei.push.service.receivers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.android.pushagent.PushReceiver;
import com.huawei.android.pushagent.api.PushEventReceiver;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.thirdparty.ISendTokenCallBack;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

public class HWPushMessageHandler extends PushEventReceiver {
    private Context mContext;
    private Handler mHandler;

    static class HwHandler extends Handler {
        private final Context mContext;

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && this.mContext != null) {
                try {
                    final String str = (String) message.obj;
                    AnonymousClass1 r0 = new ISendTokenCallBack() {
                        public int getType() {
                            return 7;
                        }

                        public String getToken(Context context) {
                            return str;
                        }
                    };
                    HWPushMessageHandler.handleMessage(this.mContext, 0, str, 7);
                    PushDependManager.inst().sendToken(this.mContext, r0);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("label", "get_token");
                    jSONObject.put("type", 7);
                    jSONObject.put("token", str);
                    PushDependManager.inst().sendMonitor(this.mContext, "ss_push", jSONObject);
                } catch (Throwable unused) {
                }
            }
        }

        HwHandler(Looper looper, Context context) {
            super(looper);
            this.mContext = context;
        }
    }

    private Handler getHandler(Context context) {
        if (this.mHandler == null) {
            this.mHandler = new HwHandler(Looper.getMainLooper(), context);
        }
        return this.mHandler;
    }

    public void a(Context context, Intent intent) throws UnsupportedEncodingException {
        try {
            if (TextUtils.isEmpty(new String(intent.getByteArrayExtra("device_token"), "UTF-8"))) {
                this.mContext = context.getApplicationContext();
                handleMessage(this.mContext, 2, intent.toUri(0), 7);
                d.a(7, 102, PushConstants.PUSH_TYPE_NOTIFY, "token 返回为空");
            }
        } catch (Throwable unused) {
        }
        super.a(context, intent);
    }

    public void onToken(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                PushDependManager inst = PushDependManager.inst();
                inst.loggerD("HWPush", "getToken = " + str);
                this.mContext = context.getApplicationContext();
                Handler handler = getHandler(context);
                handler.sendMessage(handler.obtainMessage(1, str));
            } catch (Throwable unused) {
            }
        }
    }

    public void onEvent(Context context, PushReceiver.Event event, Bundle bundle) {
        try {
            if (!PushReceiver.Event.NOTIFICATION_OPENED.equals(event)) {
                if (!PushReceiver.Event.PLUGINRSP.equals(event)) {
                    PushReceiver.Event.NOTIFICATION_CLICK_BTN.equals(event);
                } else if (bundle != null && PushDependManager.inst().loggerDebug()) {
                    Object obj = bundle.get("isReportSuccess");
                    Object obj2 = bundle.get("isReportSuccess");
                    PushDependManager inst = PushDependManager.inst();
                    inst.loggerD("HWPush", obj.toString() + obj2);
                }
            }
            super.onEvent(context, event, bundle);
        } catch (Throwable unused) {
        }
    }

    public void onPushMsg(Context context, byte[] bArr, String str) {
        String str2;
        if (context != null && bArr != null) {
            try {
                String str3 = new String(bArr, "UTF-8");
                JSONObject message = PushDependManager.inst().getMessage(str3.getBytes(), false);
                if (message != null) {
                    str3 = message.toString();
                }
                if (PushDependManager.inst().loggerDebug()) {
                    PushDependManager inst = PushDependManager.inst();
                    if (("Get HW_PUSH Message " + str3) != null) {
                        str2 = str3;
                    } else {
                        str2 = String.valueOf(null);
                    }
                    inst.loggerD("HWPush", str2);
                }
                handleMessage(context, 1, str3, 7);
            } catch (Throwable unused) {
            }
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2) {
        try {
            Intent intent = new Intent("com.ss.android.hw.message");
            intent.setPackage(context.getPackageName());
            intent.putExtra("message_type", i);
            intent.putExtra("message_obj", str);
            intent.putExtra("message_from", i2);
            h.a(context, intent);
        } catch (Exception unused) {
        }
    }
}

package com.vivo;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.pushmanager.thirdparty.ISendTokenCallBack;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.vivo.push.util.VivoPushException;
import org.json.JSONObject;

public class VivoPushAdapter implements IPushAdapter {
    public final Handler mHandler = new Handler(Looper.getMainLooper());

    public void trackPush(Context context, int i, Object obj) {
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        try {
            PushClient.getInstance(context).checkManifest();
            return true;
        } catch (VivoPushException unused) {
            return false;
        }
    }

    public boolean isPushAvailable(Context context, int i) {
        return PushClient.getInstance(context.getApplicationContext()).isSupport();
    }

    public void unregisterPush(Context context, int i) {
        try {
            PushClient.getInstance(context).turnOffPush(new IPushActionListener() {
                public final void onStateChanged(int i) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    static void sendToken(Context context, final String str) {
        if (context != null) {
            try {
                AnonymousClass4 r0 = new ISendTokenCallBack() {
                    public final int getType() {
                        return 11;
                    }

                    public final String getToken(Context context) {
                        return str;
                    }
                };
                handleMessage(context, 0, str, 11, null);
                PushDependManager.inst().sendToken(context, r0);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("label", "get_token");
                jSONObject.put("type", 11);
                jSONObject.put("token", str);
                PushDependManager.inst().sendMonitor(context, "ss_push", jSONObject);
            } catch (Throwable unused) {
            }
        }
    }

    public void registerPush(final Context context, final int i) {
        try {
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("VivoPush", "registerVivoPush");
                PushClient.getInstance(context).checkManifest();
            }
            PushClient.getInstance(context.getApplicationContext()).initialize();
            PushClient.getInstance(context).turnOnPush(new IPushActionListener() {
                public final void onStateChanged(int i) {
                    String str;
                    if (i != 0) {
                        str = "打开push异常[" + i + "] ，请查看解决方案> https://dev.vivo.com.cn/documentCenter/doc/158";
                        d.a(i, 104, String.valueOf(i), "vivo 通道注册失败");
                    } else {
                        str = "打开push成功";
                    }
                    PushDependManager.inst().loggerD("VivoPush", str);
                    final String regId = PushClient.getInstance(context).getRegId();
                    PushDependManager.inst().loggerD("VivoPush", "token = " + regId);
                    if (!TextUtils.isEmpty(regId)) {
                        VivoPushAdapter.this.mHandler.post(new Runnable() {
                            public final void run() {
                                VivoPushAdapter.sendToken(context, regId);
                            }
                        });
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    public void setAlias(Context context, String str, int i) {
        try {
            PushClient.getInstance(context).bindAlias(str, new IPushActionListener() {
                public final void onStateChanged(int i) {
                }
            });
        } catch (Throwable unused) {
        }
    }

    private static void handleMessage(Context context, int i, String str, int i2, String str2) {
        try {
            Intent intent = new Intent("com.ss.android.vivo.message");
            intent.setPackage(context.getPackageName());
            intent.putExtra("message_type", i);
            intent.putExtra("message_obj", str);
            intent.putExtra("message_from", i2);
            if (str2 != null) {
                intent.putExtra("message_extra", str2);
            }
            h.a(context, intent);
        } catch (Exception unused) {
        }
    }
}

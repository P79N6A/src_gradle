package com.umeng;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.message.b.h;
import com.ss.android.push.PushDependManager;
import com.ss.android.push.b;
import com.ss.android.pushmanager.a.d;
import com.ss.android.pushmanager.f;
import com.ss.android.pushmanager.thirdparty.IPushAdapter;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.taobao.accs.client.GlobalConfig;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.message.IUmengCallback;
import com.umeng.message.IUmengRegisterCallback;
import com.umeng.message.PushAgent;
import com.umeng.message.UTrack;
import com.umeng.message.entity.UMessage;
import org.json.JSONObject;

public class UmengPushAdapter implements IPushAdapter {
    private IUmengRegisterCallback mUmengRegisterCallback;

    public boolean isPushAvailable(Context context, int i) {
        return true;
    }

    private void initUmeng(Context context) {
        b<String, String, String> e2 = f.a().e();
        String str = (String) e2.getRight();
        UMConfigure.setLogEnabled(PushDependManager.inst().loggerDebug());
        UMConfigure.setEncryptEnabled(false);
        UMConfigure.init(context, (String) e2.getLeft(), str, 1, (String) e2.getMiddle());
    }

    public boolean checkThirdPushConfig(String str, Context context) throws Exception {
        return ManifestChecker.checkManifest(str, context);
    }

    public void unregisterPush(Context context, int i) {
        if (context != null && i == 6) {
            try {
                if (PushDependManager.inst().loggerDebug()) {
                    PushDependManager.inst().loggerD("UmengPushAdapter", "unregisterPush");
                }
                initUmeng(context);
                PushAgent.getInstance(context).disable(new IUmengCallback() {
                    public void onSuccess() {
                        if (PushDependManager.inst().loggerDebug()) {
                            PushDependManager.inst().loggerD("UmengPushAdapter", "turnOffPush onSuccess ");
                        }
                    }

                    public void onFailure(String str, String str2) {
                        if (PushDependManager.inst().loggerDebug()) {
                            PushDependManager inst = PushDependManager.inst();
                            inst.loggerD("UmengPushAdapter", "turnOffPush onFailure " + str + " " + str2);
                        }
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }

    public void registerPush(final Context context, final int i) {
        String str;
        if (context == null || i != 6) {
            if (context == null) {
                str = "空 context";
            } else {
                str = "通道注册错误";
            }
            if (PushDependManager.inst().isMainProcess(context)) {
                d.a(i, BaseLoginOrRegisterActivity.o, PushConstants.PUSH_TYPE_NOTIFY, str);
            }
            return;
        }
        try {
            if (22 == Build.VERSION.SDK_INT && h.b()) {
                GlobalConfig.setEnableForground(context, false);
            }
            if (PushDependManager.inst().loggerDebug()) {
                PushDependManager.inst().loggerD("UmengPushAdapter", "registerUmengPush");
            }
            initUmeng(context);
            final PushAgent instance = PushAgent.getInstance(context);
            if (PushDependManager.inst().isMainProcess(context)) {
                instance.setPushIntentServiceClass(UmengMessageHandler.class);
            }
            this.mUmengRegisterCallback = new IUmengRegisterCallback() {
                public void onSuccess(String str) {
                    if (PushDependManager.inst().isMainProcess(context)) {
                        try {
                            instance.enable(new IUmengCallback() {
                                public void onSuccess() {
                                    if (PushDependManager.inst().loggerDebug()) {
                                        PushDependManager.inst().loggerD("UmengPushAdapter", "enable onSuccess ");
                                    }
                                }

                                public void onFailure(String str, String str2) {
                                    if (PushDependManager.inst().loggerDebug()) {
                                        PushDependManager inst = PushDependManager.inst();
                                        inst.loggerD("UmengPushAdapter", "enable onFailure " + str + " " + str2);
                                    }
                                    int i = i;
                                    d.a(i, 104, PushConstants.PUSH_TYPE_UPLOAD_LOG, "s = " + str + " ,s1 = " + str2);
                                }
                            });
                        } catch (Throwable th) {
                            d.a(i, 104, "3", Log.getStackTraceString(th));
                        }
                    }
                    try {
                        if (PushDependManager.inst().loggerDebug()) {
                            PushDependManager inst = PushDependManager.inst();
                            inst.loggerD("UmengPushAdapter", "register onSuccess " + str);
                        }
                        instance.onAppStart();
                        String registrationId = instance.getRegistrationId();
                        if (!TextUtils.isEmpty(registrationId)) {
                            UmengPushAdapter.handleMessage(context, 0, registrationId, 6, null);
                            return;
                        }
                        if (PushDependManager.inst().isMainProcess(context) && PushDependManager.inst().isMainProcess(context)) {
                            d.a(i, 102, PushConstants.PUSH_TYPE_NOTIFY, "token 为空");
                        }
                    } catch (Throwable th2) {
                        if (PushDependManager.inst().isMainProcess(context)) {
                            d.a(i, 104, PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION, Log.getStackTraceString(th2));
                        }
                    }
                }

                public void onFailure(String str, String str2) {
                    if (PushDependManager.inst().isMainProcess(context)) {
                        int i = i;
                        d.a(i, 104, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "s = " + str + " ,s1 = " + str2);
                    }
                    try {
                        if (PushDependManager.inst().loggerDebug()) {
                            PushDependManager inst = PushDependManager.inst();
                            inst.loggerD("UmengPushAdapter", "register onFailure " + str + " " + str2);
                        }
                        UmengPushAdapter.handleMessage(context, 2, str + " " + str2, 6, null);
                    } catch (Throwable unused) {
                    }
                }
            };
            instance.register(this.mUmengRegisterCallback);
        } catch (Throwable th) {
            if (PushDependManager.inst().isMainProcess(context)) {
                d.a(i, 104, PushConstants.PUSH_TYPE_NOTIFY, Log.getStackTraceString(th));
            }
        }
    }

    public void trackPush(Context context, int i, Object obj) {
        if (i == 6 && (obj instanceof String)) {
            try {
                UTrack.getInstance(context).trackMsgClick(new UMessage(new JSONObject((String) obj)));
            } catch (Throwable unused) {
            }
        }
    }

    public void setAlias(Context context, String str, final int i) {
        if (context != null && i == 6) {
            try {
                if (PushDependManager.inst().loggerDebug()) {
                    PushDependManager.inst().loggerD("UmengPushAdapter", "setAlias");
                }
                PushAgent instance = PushAgent.getInstance(context.getApplicationContext());
                if (instance != null) {
                    instance.addAlias(str, context.getPackageName(), new UTrack.ICallBack() {
                        public void onMessage(boolean z, String str) {
                            if (z) {
                                d.b(i);
                            } else {
                                d.a(i, 105, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, str);
                            }
                            if (PushDependManager.inst().loggerDebug()) {
                                PushDependManager inst = PushDependManager.inst();
                                inst.loggerD("UmengPushAdapter", "addAlias onMessage " + z + " " + str);
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                d.a(i, 105, PushConstants.PUSH_TYPE_NOTIFY, Log.getStackTraceString(th));
            }
        }
    }

    public static void handleMessage(Context context, int i, String str, int i2, String str2) {
        try {
            Intent intent = new Intent("com.ss.android.umeng.message");
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

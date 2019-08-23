package com.umeng.message;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.push.PushDependManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.message.common.d;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.h;
import com.umeng.message.provider.a;
import com.umeng.message.service.UMJobIntentService;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class UmengMessageCallbackHandlerService extends UMJobIntentService {
    public static final String TAG = "com.umeng.message.UmengMessageCallbackHandlerService";

    /* renamed from: a  reason: collision with root package name */
    public Context f81133a = this;

    public void onCreate() {
        try {
            super.onCreate();
            PushDependManager.inst().tryHookInit(this);
        } catch (Throwable unused) {
        }
    }

    private void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                        String optString = jSONObject.optString("msg_id");
                        int optInt = jSONObject.optInt("action_type");
                        String[] strArr = {optString, optInt};
                        a.a(this.f81133a);
                        arrayList.add(ContentProviderOperation.newDelete(a.f81332f).withSelection("MsgId=? And ActionType=?", strArr).build());
                        if (optInt != 0) {
                            a.a(this.f81133a);
                            arrayList.add(ContentProviderOperation.newDelete(a.g).withSelection("MsgId=?", new String[]{optString}).build());
                        }
                    }
                }
                ContentResolver contentResolver = this.f81133a.getContentResolver();
                a.a(this.f81133a);
                contentResolver.applyBatch(a.f81327a, arrayList);
            } catch (Exception e2) {
                String str = TAG;
                UMLog.mutlInfo(str, 2, "remove cache log:" + e2.getMessage());
            }
        }
    }

    public void a(Intent intent) {
        UHandler uHandler;
        String a2 = h.a(this.f81133a, Process.myPid());
        String str = TAG;
        UMLog.mutlInfo(str, 2, "进程名：" + a2);
        if (!(intent == null || intent.getAction() == null)) {
            if (intent.getAction().equals("com.umeng.messge.registercallback.action")) {
                MLog.i("wuchi", "--->>> UmengMessageCallbackHandlerService register callback");
                try {
                    final String stringExtra = intent.getStringExtra("registration_id");
                    boolean booleanExtra = intent.getBooleanExtra("status", false);
                    String str2 = TAG;
                    UMLog.mutlInfo(str2, 2, "注册：" + stringExtra + "，状态：" + booleanExtra);
                    IUmengRegisterCallback registerCallback = PushAgent.getInstance(this.f81133a).getRegisterCallback();
                    if (booleanExtra) {
                        d.a(new Runnable() {
                            public void run() {
                                try {
                                    String deviceToken = MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f81133a).getDeviceToken();
                                    if (!(stringExtra == null || deviceToken == null || stringExtra.equals(deviceToken))) {
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f81133a).setHasResgister(false);
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f81133a).setDeviceToken(stringExtra);
                                        UmengMessageCallbackHandlerService.this.a(UmengMessageCallbackHandlerService.this.f81133a, stringExtra);
                                        ContentResolver contentResolver = UmengMessageCallbackHandlerService.this.f81133a.getContentResolver();
                                        a.a(UmengMessageCallbackHandlerService.this.f81133a);
                                        contentResolver.delete(a.f81331e, null, null);
                                        MessageSharedPrefs.getInstance(UmengMessageCallbackHandlerService.this.f81133a).resetTags();
                                    }
                                } catch (Exception unused) {
                                }
                                UTrack.getInstance(UmengMessageCallbackHandlerService.this.f81133a).a();
                                PushAgent.getInstance(UmengMessageCallbackHandlerService.this.f81133a).onAppStart();
                            }
                        });
                        if (registerCallback != null) {
                            registerCallback.onSuccess(stringExtra);
                        }
                    } else if (registerCallback != null) {
                        registerCallback.onFailure(intent.getStringExtra(NotifyType.SOUND), intent.getStringExtra("s1"));
                    }
                } catch (Exception unused) {
                }
            } else if (intent.getAction().equals("com.umeng.message.enablecallback.action")) {
                MLog.i("wuchi", "--->>> UmengMessageCallbackHandlerService enable callback");
                try {
                    boolean booleanExtra2 = intent.getBooleanExtra("status", false);
                    IUmengCallback callback = PushAgent.getInstance(this.f81133a).getCallback();
                    String str3 = TAG;
                    UMLog.mutlInfo(str3, 2, "开启状态:" + booleanExtra2);
                    if (booleanExtra2) {
                        if (callback != null) {
                            callback.onSuccess();
                        }
                    } else if (callback != null) {
                        callback.onFailure(intent.getStringExtra(NotifyType.SOUND), intent.getStringExtra("s1"));
                    }
                } catch (Exception unused2) {
                }
            } else if (intent.getAction().equals("com.umeng.message.disablecallback.action")) {
                MLog.i("wuchi", "--->>> UmengMessageCallbackHandlerService disable callback");
                try {
                    boolean booleanExtra3 = intent.getBooleanExtra("status", false);
                    IUmengCallback callback2 = PushAgent.getInstance(this.f81133a).getCallback();
                    String str4 = TAG;
                    UMLog.mutlInfo(str4, 2, "关闭状态:" + booleanExtra3);
                    if (booleanExtra3) {
                        if (callback2 != null) {
                            callback2.onSuccess();
                        }
                    } else if (callback2 != null) {
                        callback2.onFailure(intent.getStringExtra(NotifyType.SOUND), intent.getStringExtra("s1"));
                    }
                } catch (Exception unused3) {
                }
            } else if (intent.getAction().equals("com.umeng.message.message.handler.action")) {
                MLog.i("wuchi", "--->>> UmengMessageCallbackHandlerService message callback");
                try {
                    UMessage uMessage = new UMessage(new JSONObject(intent.getStringExtra("body")));
                    uMessage.message_id = intent.getStringExtra("id");
                    uMessage.task_id = intent.getStringExtra(PushConstants.TASK_ID);
                    if ("notificationpullapp".equals(uMessage.display_type)) {
                        uHandler = PushAgent.getInstance(this.f81133a).getAdHandler();
                    } else {
                        uHandler = PushAgent.getInstance(this.f81133a).getMessageHandler();
                    }
                    if (uHandler != null) {
                        uHandler.handleMessage(this.f81133a, uMessage);
                    }
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        String str5 = TAG;
                        UMLog.mutlInfo(str5, 2, "MESSAGE_HANDLER_ACTION:" + e2.getMessage());
                    }
                }
            } else if (intent.getAction().equals("com.umeng.message.message.sendmessage.action")) {
                MLog.i("wuchi", "--->>> UmengMessageCallbackHandlerService send log callback");
                try {
                    String stringExtra2 = intent.getStringExtra("KEY_SENDMESSAGE");
                    String stringExtra3 = intent.getStringExtra("KEY_UMPX_PATH");
                    JSONObject jSONObject = new JSONObject(stringExtra2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("jsonHeader");
                    JSONObject jSONObject3 = jSONObject.getJSONObject("jsonBody");
                    JSONObject buildSLEnvelope = new UMSLEnvelopeBuild().buildSLEnvelope(this.f81133a, jSONObject2, jSONObject3, stringExtra3);
                    if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                        a(jSONObject3.getJSONArray("push"));
                    }
                } catch (Exception e3) {
                    if (e3.getMessage() != null) {
                        String str6 = TAG;
                        UMLog.mutlInfo(str6, 2, "MESSAGE_SEND_ACTION:" + e3.getMessage());
                    }
                }
            }
        }
    }

    public void a(Context context, String str) throws Exception {
        File file = new File(context.getExternalFilesDir(null).getPath() + "/deviceToken");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
    }
}

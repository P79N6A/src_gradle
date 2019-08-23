package com.umeng.message;

import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.taobao.agoo.TaobaoRegister;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.stateless.UMSLEnvelopeBuild;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.common.b;
import com.umeng.message.common.d;
import com.umeng.message.common.impl.json.JUtrack;
import com.umeng.message.common.inter.IUtrack;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.c;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.m;
import com.umeng.message.provider.a;
import com.umeng.message.service.UMJobIntentService;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UTrack {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f81070a = "com.umeng.message.UTrack";

    /* renamed from: d  reason: collision with root package name */
    private static UTrack f81071d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static IUtrack f81072e;
    /* access modifiers changed from: private */
    public static boolean i;
    /* access modifiers changed from: private */
    public static boolean j;
    /* access modifiers changed from: private */
    public static boolean k;

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f81073b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f81074c;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Context f81075f;
    private boolean g;
    private final String h = "appkey";

    public interface ICallBack {
        void onMessage(boolean z, String str);
    }

    enum SuccessState {
        SUCCESS_CACHE,
        SUCCESS,
        FAIL_REQUEST,
        FAIL_PARAM
    }

    public JSONObject getHeader() {
        return this.f81073b;
    }

    /* access modifiers changed from: package-private */
    public void a(UMessage uMessage) {
        b(uMessage.recall, 4, uMessage.random_min * 60000, uMessage.pulledWho);
    }

    public void sendAliasFailLog() {
        new Thread(new Runnable() {
            public void run() {
                try {
                    UTrack.f81072e.sendAliasFailLog(UTrack.this.h());
                } catch (JSONException unused) {
                }
            }
        }).start();
    }

    private boolean f() {
        if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(this.f81075f))) {
            UMLog.mutlInfo(f81070a, 0, "UTDID为空");
            return false;
        } else if (!TextUtils.isEmpty(MessageSharedPrefs.getInstance(this.f81075f).getDeviceToken())) {
            return true;
        } else {
            UMLog.mutlInfo(f81070a, 0, "Device token为空");
            return false;
        }
    }

    /* access modifiers changed from: private */
    public JSONObject h() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f81075f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f81075f);
        JSONObject jSONObject = new JSONObject();
        this.f81073b.put("umid", UmengMessageDeviceConfig.getUmid(this.f81075f));
        jSONObject.put("header", this.f81073b);
        jSONObject.put("utdid", utdid);
        jSONObject.put("device_token", deviceToken);
        return jSONObject;
    }

    private JSONObject i() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f81075f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f81075f);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.f81073b;
        jSONObject2.put("umid", UmengMessageDeviceConfig.getUmid(this.f81075f));
        jSONObject.put("header", jSONObject2);
        jSONObject.put("utdid", utdid);
        jSONObject.put("device_token", deviceToken);
        return jSONObject;
    }

    private JSONObject j() throws JSONException {
        String deviceToken = MessageSharedPrefs.getInstance(this.f81075f).getDeviceToken();
        String utdid = UmengMessageDeviceConfig.getUtdid(this.f81075f);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appkey", PushAgent.getInstance(this.f81075f).getMessageAppkey());
        jSONObject.put("utdid", utdid);
        jSONObject.put("device_token", deviceToken);
        return jSONObject;
    }

    private void e() {
        if (this.f81073b == null) {
            b bVar = new b();
            bVar.b(this.f81075f, new String[0]);
            bVar.a(this.f81075f, PushAgent.getInstance(this.f81075f).getMessageAppkey(), PushAgent.getInstance(this.f81075f).getMessageChannel());
            this.f81073b = new JSONObject();
            try {
                bVar.b(this.f81073b);
            } catch (Exception unused) {
            }
        }
        if (this.f81074c == null) {
            b bVar2 = new b();
            bVar2.c(this.f81075f, new String[0]);
            bVar2.a(this.f81075f, PushAgent.getInstance(this.f81075f).getMessageAppkey(), PushAgent.getInstance(this.f81075f).getMessageChannel());
            this.f81074c = new JSONObject();
            try {
                bVar2.c(this.f81074c);
            } catch (Exception unused2) {
            }
        }
    }

    public void updateHeader() {
        b bVar = new b();
        bVar.b(this.f81075f, new String[0]);
        bVar.a(this.f81075f, PushAgent.getInstance(this.f81075f).getMessageAppkey(), PushAgent.getInstance(this.f81075f).getMessageChannel());
        this.f81073b = new JSONObject();
        try {
            bVar.b(this.f81073b);
        } catch (Exception unused) {
        }
        b bVar2 = new b();
        bVar2.c(this.f81075f, new String[0]);
        bVar2.a(this.f81075f, PushAgent.getInstance(this.f81075f).getMessageAppkey(), PushAgent.getInstance(this.f81075f).getMessageChannel());
        this.f81074c = new JSONObject();
        try {
            bVar2.c(this.f81074c);
        } catch (Exception unused2) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0027 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray d() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            android.content.Context r1 = r5.f81075f
            com.umeng.message.MessageSharedPrefs r1 = com.umeng.message.MessageSharedPrefs.getInstance(r1)
            java.lang.String r1 = r1.getUcode()
            r2 = 0
            if (r1 == 0) goto L_0x0024
            java.lang.String r3 = ""
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0024
            java.util.List r1 = com.umeng.message.proguard.h.g(r1)     // Catch:{ Exception -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r1 = r2
        L_0x0025:
            if (r1 != 0) goto L_0x0028
            return r2
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r4 = r1.size()
            if (r3 >= r4) goto L_0x0078
            java.lang.String r4 = "{"
            r0.append(r4)
            java.lang.String r4 = "\"p\":"
            r0.append(r4)
            java.lang.String r4 = "\""
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            com.umeng.message.entity.Ucode r4 = (com.umeng.message.entity.Ucode) r4
            java.lang.String r4 = r4.p
            r0.append(r4)
            java.lang.String r4 = "\""
            r0.append(r4)
            java.lang.String r4 = ","
            r0.append(r4)
            java.lang.String r4 = "\"t\":"
            r0.append(r4)
            java.lang.Object r4 = r1.get(r3)
            com.umeng.message.entity.Ucode r4 = (com.umeng.message.entity.Ucode) r4
            boolean r4 = r4.f81174b
            r0.append(r4)
            java.lang.String r4 = "}"
            r0.append(r4)
            int r4 = r1.size()
            int r4 = r4 + -1
            if (r3 == r4) goto L_0x0075
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0078:
            java.lang.String r1 = "]"
            r0.append(r1)
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x0087 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0087 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0087 }
            goto L_0x0088
        L_0x0087:
            r1 = r2
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UTrack.d():org.json.JSONArray");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:22|(0)|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        if (r1 != null) goto L_0x007e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x008b */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0088 A[SYNTHETIC, Splitter:B:26:0x0088] */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String g() {
        /*
            r8 = this;
            r0 = 0
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{  }
            java.lang.String r2 = "mounted"
            boolean r1 = r1.equals(r2)     // Catch:{  }
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{  }
            java.lang.String r2 = r2.getPath()     // Catch:{  }
            r1.append(r2)     // Catch:{  }
            java.lang.String r2 = "/data/"
            r1.append(r2)     // Catch:{  }
            android.content.Context r2 = r8.f81075f     // Catch:{  }
            java.lang.String r2 = r2.getPackageName()     // Catch:{  }
            r1.append(r2)     // Catch:{  }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            java.lang.String r2 = f81070a     // Catch:{  }
            r3 = 2
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{  }
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
            java.lang.String r7 = "path="
            r6.<init>(r7)     // Catch:{  }
            r6.append(r1)     // Catch:{  }
            java.lang.String r6 = r6.toString()     // Catch:{  }
            r4[r5] = r6     // Catch:{  }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r2, (int) r3, (java.lang.String[]) r4)     // Catch:{  }
            java.io.File r2 = new java.io.File     // Catch:{  }
            java.lang.String r3 = "umeng-message.config"
            r2.<init>(r1, r3)     // Catch:{  }
            boolean r1 = r2.exists()     // Catch:{  }
            if (r1 != 0) goto L_0x005d
            return r0
        L_0x005d:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x008c, all -> 0x0084 }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x008c, all -> 0x0084 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x008c, all -> 0x0084 }
            r1.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0090, IOException -> 0x008c, all -> 0x0084 }
        L_0x0067:
            java.lang.String r2 = r1.readLine()     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x008d, all -> 0x0082 }
            if (r2 == 0) goto L_0x007e
            java.lang.String r3 = "sign="
            boolean r3 = r2.startsWith(r3)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x008d, all -> 0x0082 }
            if (r3 == 0) goto L_0x0067
            r3 = 5
            java.lang.String r2 = r2.substring(r3)     // Catch:{ FileNotFoundException -> 0x0091, IOException -> 0x008d, all -> 0x0082 }
            r1.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            return r2
        L_0x007e:
            r1.close()     // Catch:{ Exception -> 0x0094 }
            goto L_0x0094
        L_0x0082:
            r2 = move-exception
            goto L_0x0086
        L_0x0084:
            r2 = move-exception
            r1 = r0
        L_0x0086:
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            throw r2     // Catch:{  }
        L_0x008c:
            r1 = r0
        L_0x008d:
            if (r1 == 0) goto L_0x0094
            goto L_0x007e
        L_0x0090:
            r1 = r0
        L_0x0091:
            if (r1 == 0) goto L_0x0094
            goto L_0x007e
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UTrack.g():java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (!f() || MessageSharedPrefs.getInstance(this.f81075f).getHasRegister()) {
            return;
        }
        if (k) {
            UMLog.mutlInfo(f81070a, 2, "sendRegisterLog已经在队列里，忽略这次请求");
            return;
        }
        UMLog.mutlInfo(f81070a, 2, "trackRegisterLog开始, 设置registerSending标志位");
        k = true;
        AnonymousClass10 r0 = new Runnable() {
            public void run() {
                try {
                    JSONObject b2 = UTrack.this.h();
                    String b3 = UTrack.f81070a;
                    UMLog.mutlInfo(b3, 2, "trackRegister-->request:" + b2.toString());
                    String d2 = UTrack.this.g();
                    if (!h.d(d2)) {
                        String b4 = UTrack.f81070a;
                        UMLog.mutlInfo(b4, 2, "TestDevice sign =" + d2);
                        b2.put("TD", d2);
                    }
                    UTrack.f81072e.trackRegister(b2);
                } catch (Exception unused) {
                } finally {
                    boolean unused2 = UTrack.k = false;
                }
            }
        };
        UMLog.mutlInfo(f81070a, 2, String.format("trackRegister(delay=%d)", new Object[]{0}));
        d.a(r0, 0, TimeUnit.MILLISECONDS);
    }

    public void sendCachedMsgLog(long j2) {
        a(j2);
    }

    public void setClearPrevMessage(boolean z) {
        this.g = z;
    }

    public void sendRegisterLog(final String str) {
        new Thread(new Runnable() {
            public void run() {
                if (MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDaRegisterSendPolicy() == 1) {
                    UMLog.mutlInfo(UTrack.f81070a, 2, "da_register_policy=1, skip sending da_register info");
                    return;
                }
                try {
                    JSONObject b2 = UTrack.this.h();
                    b2.put("registerLog", str);
                    UTrack.f81072e.sendRegisterLog(b2);
                } catch (Exception unused) {
                }
            }
        }).start();
    }

    private UTrack(Context context) {
        this.f81075f = context.getApplicationContext();
        e();
    }

    public static synchronized UTrack getInstance(Context context) {
        UTrack uTrack;
        synchronized (UTrack.class) {
            if (f81071d == null) {
                f81071d = new UTrack(context);
                f81072e = new JUtrack(context);
            }
            uTrack = f81071d;
        }
        return uTrack;
    }

    public void trackMsgArrival(UMessage uMessage) {
        if (uMessage != null && uMessage.msg_id != null) {
            b(uMessage.msg_id, 0, 60000 * uMessage.random_min, uMessage.pulledWho);
        }
    }

    /* access modifiers changed from: package-private */
    public void b(UMessage uMessage) {
        b(uMessage.recall, 5, uMessage.random_min * 60000, uMessage.pulledWho);
    }

    public void trackAppLaunch(long j2) {
        if (f()) {
            if (MessageSharedPrefs.getInstance(this.f81075f).getAppLaunchLogSendPolicy() == 1) {
                UMLog.mutlInfo(f81070a, 2, "launch_policy=1, 跳过发送应用程序启动信息");
                return;
            }
            if (!MessageSharedPrefs.getInstance(this.f81075f).hasAppLaunchLogSentToday()) {
                b(j2);
            }
        }
    }

    private void b(long j2) {
        if (j) {
            UMLog.mutlInfo(f81070a, 2, "trackAppLaunch已经在队列里, 忽略这次请求");
            return;
        }
        UMLog.mutlInfo(f81070a, 2, "trackAppLaunch开始, 设置appLaunchSending标志位");
        j = true;
        AnonymousClass9 r0 = new Runnable() {
            public void run() {
                try {
                    JSONObject b2 = UTrack.this.h();
                    JSONArray c2 = UTrack.this.d();
                    if (c2 != null) {
                        b2.put("ucode", c.a(c2.toString()));
                    }
                    UTrack.f81072e.trackAppLaunch(b2);
                } catch (Exception unused) {
                } finally {
                    boolean unused2 = UTrack.j = false;
                }
            }
        };
        UMLog.mutlInfo(f81070a, 2, String.format("trackAppLaunch(delay=%d)", new Object[]{Long.valueOf(j2)}));
        d.a(r0, j2, TimeUnit.MILLISECONDS);
    }

    public void trackMiPushMsgClick(UMessage uMessage) {
        if (!(uMessage == null || uMessage.msg_id == null)) {
            b(uMessage.msg_id, 21, 60000 * uMessage.random_min, uMessage.pulledWho);
        }
        if (this.g) {
            if ("notificationpullapp".equals(uMessage.display_type)) {
                ((UmengAdHandler) PushAgent.getInstance(this.f81075f).getAdHandler()).setPrevMessage(null);
                return;
            }
            ((UmengMessageHandler) PushAgent.getInstance(this.f81075f).getMessageHandler()).setPrevMessage(null);
        }
    }

    public void trackMsgClick(UMessage uMessage) {
        if (!(uMessage == null || uMessage.msg_id == null)) {
            b(uMessage.msg_id, 1, 60000 * uMessage.random_min, uMessage.pulledWho);
        }
        if (!(uMessage == null || uMessage.message_id == null)) {
            a(uMessage.message_id, uMessage.task_id, "8");
        }
        if (this.g) {
            if ("notificationpullapp".equals(uMessage.display_type)) {
                ((UmengAdHandler) PushAgent.getInstance(this.f81075f).getAdHandler()).setPrevMessage(null);
                return;
            }
            ((UmengMessageHandler) PushAgent.getInstance(this.f81075f).getMessageHandler()).setPrevMessage(null);
        }
    }

    public void trackMsgDismissed(UMessage uMessage) {
        if (!(uMessage == null || uMessage.msg_id == null)) {
            b(uMessage.msg_id, 2, 60000 * uMessage.random_min, uMessage.pulledWho);
        }
        if (!(uMessage == null || uMessage.message_id == null)) {
            a(uMessage.message_id, uMessage.task_id, "9");
        }
        if ("notificationpullapp".equals(uMessage.display_type)) {
            ((UmengAdHandler) PushAgent.getInstance(this.f81075f).getAdHandler()).setPrevMessage(null);
        } else {
            ((UmengMessageHandler) PushAgent.getInstance(this.f81075f).getMessageHandler()).setPrevMessage(null);
        }
    }

    private void a(long j2) {
        if (f()) {
            if (i) {
                UMLog.mutlInfo(f81070a, 2, "appCachedPushlog已经在队列里, 忽略这次请求");
                return;
            }
            UMLog.mutlInfo(f81070a, 2, "appCachedPushlog开始, 设置appLaunchSending标志位");
            i = true;
            if (h.d(this.f81075f)) {
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            Thread.sleep(30000);
                            boolean unused = UTrack.i = false;
                        } catch (InterruptedException unused2) {
                        }
                    }
                }).start();
            }
            d.a(new Runnable() {
                public void run() {
                    try {
                        JSONArray jSONArray = new JSONArray();
                        ArrayList a2 = m.a(UTrack.this.f81075f).a();
                        if (a2 != null && a2.size() > 0) {
                            for (int i = 0; i < a2.size(); i++) {
                                m.a aVar = (m.a) a2.get(i);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, aVar.f81303b);
                                jSONObject.put("pa", aVar.f81305d);
                                jSONObject.put("device_token", MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDeviceToken());
                                jSONObject.put("msg_id", aVar.f81302a);
                                jSONObject.put("action_type", aVar.f81304c);
                                jSONArray.put(jSONObject);
                            }
                            UMSLEnvelopeBuild.mContext = UTrack.this.f81075f;
                            UMSLEnvelopeBuild uMSLEnvelopeBuild = new UMSLEnvelopeBuild();
                            JSONObject buildSLBaseHeader = uMSLEnvelopeBuild.buildSLBaseHeader(UTrack.this.f81075f);
                            JSONObject jSONObject2 = (JSONObject) buildSLBaseHeader.opt("header");
                            jSONObject2.put("din", UmengMessageDeviceConfig.getDINAes(UTrack.this.f81075f));
                            jSONObject2.put("p_sdk_v", "6.0.0.001");
                            jSONObject2.put("umid", UmengMessageDeviceConfig.getUmid(UTrack.this.f81075f));
                            buildSLBaseHeader.put("header", jSONObject2);
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("push", jSONArray);
                            if (h.d(UTrack.this.f81075f)) {
                                JSONObject buildSLEnvelope = uMSLEnvelopeBuild.buildSLEnvelope(UTrack.this.f81075f, buildSLBaseHeader, jSONObject3, "umpx_push_logs");
                                if (buildSLEnvelope != null && !buildSLEnvelope.has("exception")) {
                                    UTrack.this.a(jSONArray);
                                }
                                return;
                            }
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("jsonHeader", buildSLBaseHeader);
                            jSONObject4.put("jsonBody", jSONObject3);
                            Intent intent = new Intent();
                            intent.setPackage(UTrack.this.f81075f.getPackageName());
                            intent.setAction("com.umeng.message.message.sendmessage.action");
                            intent.putExtra("KEY_UMPX_PATH", "umpx_push_logs");
                            intent.putExtra("KEY_SENDMESSAGE", jSONObject4.toString());
                            UMJobIntentService.enqueueWork(UTrack.this.f81075f, UmengMessageCallbackHandlerService.class, intent);
                        }
                    } catch (JSONException unused) {
                    }
                }
            });
            d.a(new Runnable() {
                public void run() {
                    try {
                        ArrayList c2 = m.a(UTrack.this.f81075f).c();
                        for (int i = 0; i < c2.size(); i++) {
                            m.b bVar = (m.b) c2.get(i);
                            UTrack.this.sendMsgLogForAgoo(bVar.f81307a, bVar.f81308b, bVar.f81309c);
                        }
                    } catch (Throwable th) {
                        UMLog.mutlInfo(UTrack.f81070a, 2, th.toString());
                    }
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void a(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() > 0) {
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.get(i2);
                        String optString = jSONObject.optString("msg_id");
                        int optInt = jSONObject.optInt("action_type");
                        String[] strArr = {optString, optInt};
                        a.a(this.f81075f);
                        arrayList.add(ContentProviderOperation.newDelete(a.f81332f).withSelection("MsgId=? And ActionType=?", strArr).build());
                        if (optInt != 0) {
                            a.a(this.f81075f);
                            arrayList.add(ContentProviderOperation.newDelete(a.g).withSelection("MsgId=?", new String[]{optString}).build());
                        }
                    }
                }
                ContentResolver contentResolver = this.f81075f.getContentResolver();
                a.a(this.f81075f);
                contentResolver.applyBatch(a.f81327a, arrayList);
            } catch (Exception unused) {
            }
        }
    }

    public void trackMsgPulled(UMessage uMessage, int i2) {
        if (uMessage != null && uMessage.msg_id != null) {
            b(uMessage.msg_id, i2, uMessage.random_min * 60000, uMessage.pulledWho);
        }
    }

    public boolean addAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                SuccessState successState = null;
                try {
                    String str = MessageSharedPrefs.getInstance(UTrack.this.f81075f).get_addAliasInterval();
                    if (str == null || str.length() <= 0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    String a2 = UTrack.this.a(str, str2, jSONObject);
                    if (a2 != null && a2.length() > 0) {
                        iCallBack.onMessage(false, a2);
                        return;
                    }
                } catch (Exception unused) {
                }
                String str2 = "";
                String str3 = "" + "utdid:" + UmengMessageDeviceConfig.getUtdid(UTrack.this.f81075f) + ",deviceToken:" + MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDeviceToken() + ";";
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "addAlias: type或alias为空");
                    str3 = str3 + "addAlias: empty type or alias;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f81075f))) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "UTDID为空");
                    str3 = str3 + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDeviceToken())) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "Device token为空");
                    str3 = str3 + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (MessageSharedPrefs.getInstance(UTrack.this.f81075f).isAliasSet(0, str, str2)) {
                    UMLog.mutlInfo(UTrack.f81070a, 2, String.format("addAlias: <%s, %s> 已经同步至服务器，忽略该请求", new Object[]{str, str2}));
                    str2 = str2 + String.format("addAlias: <%s, %s> has been synced to the server before. Ingore this request;", new Object[]{str, str2});
                    successState = SuccessState.SUCCESS_CACHE;
                }
                try {
                    JSONObject b2 = UTrack.this.h();
                    if (successState == null) {
                        b2.put("alias", str);
                        b2.put("type", str2);
                        b2.put("last_alias", MessageSharedPrefs.getInstance(UTrack.this.f81075f).getLastAlias(0, str2));
                        b2.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        b2.put("fail", str3);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        b2.put("success", str2);
                    }
                    UTrack.f81072e.addAlias(str, str2, b2, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        iCallBack.onMessage(false, "alias:" + str + "添加失败:" + e2.getMessage());
                        MessageSharedPrefs.getInstance(UTrack.this.f81075f).addAlias(str, str2, 0, 1, e2.getMessage());
                        return;
                    }
                    iCallBack.onMessage(false, "alias:" + str + "添加失败");
                    MessageSharedPrefs.getInstance(UTrack.this.f81075f).addAlias(str, str2, 0, 1, "添加失败");
                }
            }
        }).start();
        return false;
    }

    public void deleteAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                SuccessState successState = null;
                try {
                    String str = MessageSharedPrefs.getInstance(UTrack.this.f81075f).get_deleteALiasInterval();
                    if (str == null || str.length() <= 0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    String a2 = UTrack.this.a(str, str2, jSONObject);
                    if (a2 != null && a2.length() > 0) {
                        iCallBack.onMessage(false, a2);
                        return;
                    }
                } catch (Exception unused) {
                }
                String str2 = "";
                if (TextUtils.isEmpty(str2)) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "removeAlias: type为空");
                    str2 = str2 + "removeAlias: empty type";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f81075f))) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "UTDID为空");
                    str2 = str2 + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDeviceToken())) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "Device token为空");
                    str2 = str2 + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                try {
                    JSONObject b2 = UTrack.this.h();
                    if (successState == null) {
                        b2.put("alias", str);
                        b2.put("type", str2);
                        b2.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        b2.put("fail", str2);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        b2.put("success", "");
                    }
                    UTrack.f81072e.deleteAlias(str, str2, b2, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        iCallBack.onMessage(false, "alias:" + str + "移除失败:" + e2.getMessage());
                        return;
                    }
                    iCallBack.onMessage(false, "alias:" + str + "移除失败");
                }
            }
        }).start();
    }

    public void setAlias(final String str, final String str2, final ICallBack iCallBack) {
        new Thread(new Runnable() {
            public void run() {
                JSONObject jSONObject;
                SuccessState successState = null;
                try {
                    String str = MessageSharedPrefs.getInstance(UTrack.this.f81075f).get_setAliasInterval();
                    if (str == null || str.length() <= 0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject(str);
                    }
                    String a2 = UTrack.this.a(str, str2, jSONObject);
                    if (a2 != null && a2.length() > 0) {
                        iCallBack.onMessage(false, a2);
                        return;
                    }
                } catch (Exception unused) {
                }
                String str2 = "";
                String str3 = "";
                if (TextUtils.isEmpty(str2)) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "addExclusiveAlias: type为空");
                    str2 = str2 + "addExclusiveAlias: empty type";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(UmengMessageDeviceConfig.getUtdid(UTrack.this.f81075f))) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "UTDID为空");
                    str2 = str2 + "UTDID is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (TextUtils.isEmpty(MessageSharedPrefs.getInstance(UTrack.this.f81075f).getDeviceToken())) {
                    UMLog.mutlInfo(UTrack.f81070a, 0, "Device token为空");
                    str2 = str2 + "RegistrationId is empty;";
                    successState = SuccessState.FAIL_PARAM;
                }
                if (MessageSharedPrefs.getInstance(UTrack.this.f81075f).isAliasSet(1, str, str2)) {
                    UMLog.mutlInfo(UTrack.f81070a, 2, String.format("addExclusiveAlias: <%s, %s> 已经同步至服务器，忽略该请求", new Object[]{str, str2}));
                    str3 = str3 + String.format("addExclusiveAlias: <%s, %s> has been synced to the server before. Ingore this request.", new Object[]{str, str2});
                    successState = SuccessState.SUCCESS_CACHE;
                }
                try {
                    JSONObject b2 = UTrack.this.h();
                    if (successState == null) {
                        b2.put("alias", str);
                        b2.put("type", str2);
                        b2.put("last_alias", MessageSharedPrefs.getInstance(UTrack.this.f81075f).getLastAlias(1, str2));
                        b2.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
                    } else if (successState == SuccessState.FAIL_PARAM) {
                        b2.put("fail", str2);
                    } else if (successState == SuccessState.SUCCESS_CACHE) {
                        b2.put("success", str3);
                    }
                    UTrack.f81072e.setAlias(str, str2, b2, iCallBack);
                } catch (Exception e2) {
                    if (e2.getMessage() != null) {
                        iCallBack.onMessage(false, "alias:" + str + "添加失败:" + e2.getMessage());
                        MessageSharedPrefs.getInstance(UTrack.this.f81075f).addAlias(str, str2, 1, 1, e2.getMessage());
                        return;
                    }
                    iCallBack.onMessage(false, "alias:" + str + "添加失败");
                    MessageSharedPrefs.getInstance(UTrack.this.f81075f).addAlias(str, str2, 1, 1, "添加失败");
                }
            }
        }).start();
    }

    private void a(final String str, final String str2, final String str3) {
        d.a(new Runnable() {
            public void run() {
                UTrack.this.sendMsgLogForAgoo(str, str2, str3);
            }
        });
    }

    /* access modifiers changed from: private */
    public String a(String str, String str2, JSONObject jSONObject) {
        boolean z;
        String str3 = null;
        try {
            byte[] bytes = str.getBytes("UTF-8");
            byte[] bytes2 = str2.getBytes("UTF-8");
            boolean z2 = true;
            if (bytes.length > 128 || bytes.length < 0) {
                z = false;
            } else {
                z = true;
            }
            if (bytes2.length > 64 || bytes2.length < 0) {
                z2 = false;
            }
            if (!z || !z2) {
                return "alias长度不在0~128之间或aliasType长度不在0~64之间";
            }
            if (jSONObject != null) {
                long optLong = jSONObject.optLong("interval", 0);
                long optLong2 = jSONObject.optLong("last_requestTime", 0);
                long currentTimeMillis = System.currentTimeMillis();
                if (optLong != 0 && (currentTimeMillis - optLong2) / 1000 < optLong) {
                    str3 = "interval限制";
                }
            }
            return str3;
        } catch (Exception unused) {
        }
    }

    public synchronized void sendMsgLogForAgoo(String str, String str2, String str3) {
        String str4 = f81070a;
        UMLog.mutlInfo(str4, 2, "sendMsgLogForAgoo-->msgId:" + str + ",taskId:" + str2);
        if (str3.equalsIgnoreCase("8")) {
            TaobaoRegister.clickMessage(this.f81075f, str, str2);
        } else {
            TaobaoRegister.dismissMessage(this.f81075f, str, str2);
        }
        m.a(this.f81075f).b(str, str3);
        if (!str3.equals("7")) {
            m.a(this.f81075f).d(str);
        }
    }

    private void b(String str, int i2, long j2, String str2) {
        a(str, i2, j2, str2);
    }

    /* access modifiers changed from: private */
    public synchronized void c(String str, int i2, long j2, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        try {
            JSONObject i3 = i();
            i3.put("msg_id", str);
            i3.put("action_type", i2);
            i3.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, j2);
            i3.put("pa", str2);
            f81072e.sendMsgLog(i3, str, i2);
        } catch (Exception unused) {
        }
    }

    private void a(String str, int i2, long j2, String str2) {
        int i3 = i2;
        if (f()) {
            if (TextUtils.isEmpty(str)) {
                UMLog.mutlInfo(f81070a, 0, "trackMsgLog: msgId为空");
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            try {
                m.a(this.f81075f).a(str, i2, currentTimeMillis, str2);
            } catch (Exception e2) {
                UMLog.mutlInfo(f81070a, 2, "trackMsgLog: ", e2.toString());
            }
            final String str3 = str;
            final int i4 = i2;
            final long j3 = currentTimeMillis;
            final String str4 = str2;
            AnonymousClass1 r1 = new Runnable() {
                public void run() {
                    UTrack.this.c(str3, i4, j3, str4);
                }
            };
            long j4 = 0;
            if (!(j2 <= 0 || i3 == 1 || i3 == 21)) {
                j4 = Math.abs(new Random().nextLong() % j2);
            }
            UMLog.mutlInfo(f81070a, 2, String.format("trackMsgLog(msgId=%s, actionType=%d, random=%d, delay=%d)", new Object[]{str, Integer.valueOf(i2), Long.valueOf(j2), Long.valueOf(j4)}));
            d.a(r1, j4, TimeUnit.MILLISECONDS);
        }
    }
}

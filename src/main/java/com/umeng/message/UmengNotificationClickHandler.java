package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.m;
import java.lang.reflect.Method;
import java.util.Map;

public class UmengNotificationClickHandler implements UHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81143a = "com.umeng.message.UmengNotificationClickHandler";

    public void dealWithCustomAction(Context context, UMessage uMessage) {
    }

    public void dismissNotification(Context context, UMessage uMessage) {
    }

    private Intent a(Intent intent, UMessage uMessage) {
        if (intent == null || uMessage == null || uMessage.extra == null) {
            return intent;
        }
        for (Map.Entry next : uMessage.extra.entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            if (str != null) {
                intent.putExtra(str, str2);
            }
        }
        return intent;
    }

    public void autoUpdate(Context context, UMessage uMessage) {
        try {
            Object g = m.a(context).g();
            Class<?> cls = Class.forName("com.umeng.update.UmengUpdateAgent");
            Class<?> cls2 = Class.forName("com.umeng.update.UpdateResponse");
            Method method = cls.getMethod("showUpdateDialog", new Class[]{Context.class, cls2});
            if (g != null) {
                method.invoke(cls, new Object[]{context, cls2.cast(g)});
            }
        } catch (Exception unused) {
        }
    }

    public void openActivity(Context context, UMessage uMessage) {
        if (uMessage.activity != null && !TextUtils.isEmpty(uMessage.activity.trim())) {
            Intent intent = new Intent();
            a(intent, uMessage);
            intent.setClassName(context, uMessage.activity);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public void launchApp(Context context, UMessage uMessage) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            String str = f81143a;
            UMLog.mutlInfo(str, 0, "找不到应用: " + context.getPackageName());
            return;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(268435456);
        a(launchIntentForPackage, uMessage);
        context.startActivity(launchIntentForPackage);
        String str2 = f81143a;
        UMLog.mutlInfo(str2, 0, "启动应用: " + context.getPackageName());
    }

    public void openUrl(Context context, UMessage uMessage) {
        if (uMessage.url != null && !TextUtils.isEmpty(uMessage.url.trim())) {
            String str = f81143a;
            UMLog.mutlInfo(str, 2, "打开链接: " + uMessage.url);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uMessage.url));
            a(intent, uMessage);
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
    }

    public void handleMessage(Context context, UMessage uMessage) {
        try {
            if (!uMessage.clickOrDismiss) {
                dismissNotification(context, uMessage);
            } else if (!TextUtils.equals("autoupdate", uMessage.display_type) || !PushAgent.getInstance(context).isIncludesUmengUpdateSDK()) {
                if (!TextUtils.isEmpty(uMessage.after_open)) {
                    if ("notificationpullapp".equals(uMessage.display_type)) {
                        if (TextUtils.equals("go_appurl", uMessage.after_open)) {
                            a(context, uMessage);
                            return;
                        }
                    } else if (TextUtils.equals("go_url", uMessage.after_open)) {
                        openUrl(context, uMessage);
                        return;
                    } else if (TextUtils.equals("go_activity", uMessage.after_open)) {
                        openActivity(context, uMessage);
                        return;
                    } else if (TextUtils.equals("go_custom", uMessage.after_open)) {
                        dealWithCustomAction(context, uMessage);
                        return;
                    } else if (TextUtils.equals("go_app", uMessage.after_open)) {
                        launchApp(context, uMessage);
                        return;
                    }
                }
                if (!"notificationpullapp".equals(uMessage.display_type)) {
                    if (uMessage.url != null && !TextUtils.isEmpty(uMessage.url.trim())) {
                        openUrl(context, uMessage);
                    } else if (uMessage.activity != null && !TextUtils.isEmpty(uMessage.activity.trim())) {
                        openActivity(context, uMessage);
                    } else if (uMessage.custom == null || TextUtils.isEmpty(uMessage.custom.trim())) {
                        launchApp(context, uMessage);
                    } else {
                        dealWithCustomAction(context, uMessage);
                    }
                }
            } else {
                autoUpdate(context, uMessage);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r14, com.umeng.message.entity.UMessage r15) {
        /*
            r13 = this;
            java.lang.String r0 = r15.custom     // Catch:{  }
            if (r0 == 0) goto L_0x014f
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x000e
            goto L_0x014f
        L_0x000e:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{  }
            r1.<init>(r0)     // Catch:{  }
            java.lang.String r0 = "p"
            java.lang.String r0 = r1.optString(r0)     // Catch:{  }
            java.lang.String r2 = "pu"
            java.lang.String r2 = r1.optString(r2)     // Catch:{  }
            java.lang.String r3 = "ju"
            java.lang.String r3 = r1.optString(r3)     // Catch:{  }
            java.lang.String r4 = "en"
            int r1 = r1.optInt(r4)     // Catch:{  }
            android.content.Intent r4 = new android.content.Intent     // Catch:{  }
            r4.<init>()     // Catch:{  }
            java.lang.String r5 = "://"
            java.lang.String[] r5 = r2.split(r5)     // Catch:{  }
            r6 = 2
            if (r5 == 0) goto L_0x003d
            int r7 = r5.length     // Catch:{  }
            if (r7 >= r6) goto L_0x003d
            return
        L_0x003d:
            r7 = 1
            r5 = r5[r7]     // Catch:{  }
            java.lang.String r8 = "/"
            java.lang.String[] r5 = r5.split(r8)     // Catch:{  }
            if (r5 == 0) goto L_0x004c
            int r8 = r5.length     // Catch:{  }
            if (r8 > 0) goto L_0x004c
            return
        L_0x004c:
            r8 = 0
            r5 = r5[r8]     // Catch:{  }
            java.lang.String r9 = ""
            if (r1 != r7) goto L_0x00d5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{  }
            r1.<init>()     // Catch:{  }
            r1.append(r5)     // Catch:{  }
            java.lang.String r10 = "/"
            r1.append(r10)     // Catch:{  }
            java.lang.String r1 = r1.toString()     // Catch:{  }
            java.lang.String[] r1 = r2.split(r1)     // Catch:{  }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
            r2.<init>()     // Catch:{ Exception -> 0x00bb }
            if (r1 == 0) goto L_0x0077
            int r10 = r1.length     // Catch:{ Exception -> 0x00bb }
            if (r10 < r6) goto L_0x0077
            r10 = r1[r7]     // Catch:{ Exception -> 0x00bb }
            r2.append(r10)     // Catch:{ Exception -> 0x00bb }
        L_0x0077:
            java.lang.String r10 = "&umessage="
            r2.append(r10)     // Catch:{ Exception -> 0x00bb }
            org.json.JSONObject r10 = r15.getRaw()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00bb }
            r2.append(r10)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = "&thirdkey="
            r2.append(r10)     // Catch:{ Exception -> 0x00bb }
            com.umeng.message.PushAgent r10 = com.umeng.message.PushAgent.getInstance(r14)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = r10.getMessageAppkey()     // Catch:{ Exception -> 0x00bb }
            r2.append(r10)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r10 = f81143a     // Catch:{ Exception -> 0x00bb }
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch:{ Exception -> 0x00bb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = "url:"
            r11.<init>(r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = r2.toString()     // Catch:{ Exception -> 0x00bb }
            r11.append(r12)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x00bb }
            r7[r8] = r11     // Catch:{ Exception -> 0x00bb }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r10, (int) r6, (java.lang.String[]) r7)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r2 = com.umeng.message.proguard.c.a((java.lang.String) r2)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00bc
        L_0x00bb:
            r2 = r9
        L_0x00bc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{  }
            r6.<init>()     // Catch:{  }
            r1 = r1[r8]     // Catch:{  }
            r6.append(r1)     // Catch:{  }
            r6.append(r5)     // Catch:{  }
            java.lang.String r1 = "/"
            r6.append(r1)     // Catch:{  }
            r6.append(r2)     // Catch:{  }
            java.lang.String r2 = r6.toString()     // Catch:{  }
        L_0x00d5:
            android.net.Uri r1 = android.net.Uri.parse(r2)     // Catch:{  }
            r4.setData(r1)     // Catch:{  }
            r4.setPackage(r0)     // Catch:{  }
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r4.addFlags(r1)     // Catch:{  }
            boolean r5 = com.umeng.message.common.UmengMessageDeviceConfig.getDataData(r0)     // Catch:{  }
            if (r5 == 0) goto L_0x0126
            boolean r0 = com.umeng.message.common.UmengMessageDeviceConfig.isIntentExist(r14, r2, r0)     // Catch:{ JSONException -> 0x0150 }
            if (r0 == 0) goto L_0x00fd
            com.umeng.message.UTrack r0 = com.umeng.message.UTrack.getInstance(r14)     // Catch:{ JSONException -> 0x0150 }
            r1 = 62
            r0.trackMsgPulled(r15, r1)     // Catch:{ JSONException -> 0x0150 }
            r14.startActivity(r4)     // Catch:{ JSONException -> 0x0150 }
            goto L_0x014d
        L_0x00fd:
            com.umeng.message.UTrack r0 = com.umeng.message.UTrack.getInstance(r14)     // Catch:{ JSONException -> 0x0150 }
            r2 = 61
            r0.trackMsgPulled(r15, r2)     // Catch:{ JSONException -> 0x0150 }
            if (r3 == 0) goto L_0x0125
            java.lang.String r15 = r3.trim()     // Catch:{ JSONException -> 0x0150 }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x0150 }
            if (r15 == 0) goto L_0x0113
            goto L_0x0125
        L_0x0113:
            android.content.Intent r15 = new android.content.Intent     // Catch:{ JSONException -> 0x0150 }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r3)     // Catch:{ JSONException -> 0x0150 }
            r15.<init>(r0, r2)     // Catch:{ JSONException -> 0x0150 }
            r15.addFlags(r1)     // Catch:{ JSONException -> 0x0150 }
            r14.startActivity(r15)     // Catch:{ JSONException -> 0x0150 }
            goto L_0x0150
        L_0x0125:
            return
        L_0x0126:
            com.umeng.message.UTrack r0 = com.umeng.message.UTrack.getInstance(r14)     // Catch:{  }
            r2 = 60
            r0.trackMsgPulled(r15, r2)     // Catch:{  }
            if (r3 == 0) goto L_0x014e
            java.lang.String r15 = r3.trim()     // Catch:{  }
            boolean r15 = android.text.TextUtils.isEmpty(r15)     // Catch:{  }
            if (r15 == 0) goto L_0x013c
            goto L_0x014e
        L_0x013c:
            android.content.Intent r15 = new android.content.Intent     // Catch:{  }
            java.lang.String r0 = "android.intent.action.VIEW"
            android.net.Uri r2 = android.net.Uri.parse(r3)     // Catch:{  }
            r15.<init>(r0, r2)     // Catch:{  }
            r15.addFlags(r1)     // Catch:{  }
            r14.startActivity(r15)     // Catch:{  }
        L_0x014d:
            return
        L_0x014e:
            return
        L_0x014f:
            return
        L_0x0150:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.UmengNotificationClickHandler.a(android.content.Context, com.umeng.message.entity.UMessage):void");
    }
}

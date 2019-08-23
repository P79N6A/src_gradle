package com.umeng.message;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.common.d;
import com.umeng.message.proguard.h;
import com.umeng.message.proguard.m;
import com.umeng.message.provider.a;
import java.util.Calendar;

public class MessageSharedPrefs {

    /* renamed from: a  reason: collision with root package name */
    private static final String f81055a = "com.umeng.message.MessageSharedPrefs";

    /* renamed from: c  reason: collision with root package name */
    private static MessageSharedPrefs f81056c;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Context f81057b;

    /* renamed from: f  reason: collision with root package name */
    private SharedPreferences f81058f;
    private int g;

    /* access modifiers changed from: package-private */
    public void e() {
        c("KEY_ENEABLED", "true");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        c("KEY_ENEABLED", "false");
    }

    public String getAddWeightedTagsInterval() {
        return b("addWeightedTags", null);
    }

    public String getDeleteWeightedTagsInterval() {
        return b("deleteWeightedTags", null);
    }

    public String getListWeightedTagsInterval() {
        return b("listWeightedTags", null);
    }

    public String get_addAliasInterval() {
        return b("addAlias", null);
    }

    public String get_addTagsInterval() {
        return b("addTags", null);
    }

    public String get_deleteALiasInterval() {
        return b("deleteAlias", null);
    }

    public String get_deleteTagsInterval() {
        return b("deleteTags", null);
    }

    public String get_getTagsInterval() {
        return b("getTags", null);
    }

    public String get_setAliasInterval() {
        return b("setAlias", null);
    }

    public boolean finishTransferedCacheFileDataToSQL() {
        return b("KEY_CACHE_FILE_TRANSFER_TO_SQL", "true").equalsIgnoreCase("true");
    }

    /* access modifiers changed from: package-private */
    public boolean g() {
        return b("KEY_ENEABLED", "false").equalsIgnoreCase("true");
    }

    public String getAppVersion() {
        return b("app_version", "");
    }

    public String getDeviceToken() {
        return b("device_token", "");
    }

    public boolean getHasRegister() {
        return b("has_register", "false").equalsIgnoreCase("true");
    }

    public String getLastMessageMsgID() {
        return b("last_msg_id", "");
    }

    public String getMessageAppKey() {
        return this.f81058f.getString("KEY_UMENG_MESSAGE_APP_KEY", "");
    }

    public String getMessageAppSecret() {
        return this.f81058f.getString("KEY_UMENG_MESSAGE_APP_SECRET", "");
    }

    public String getMessageChannel() {
        return this.f81058f.getString("KEY_UMENG_MESSAGE_APP_CHANNEL", "");
    }

    public boolean getNotificaitonOnForeground() {
        return b("KEY_SET_NOTIFICATION_ON_FOREGROUND", "true").equals("true");
    }

    public String getResourcePackageName() {
        return b("KEY_SET_RESOURCE_PACKAGENAME", "");
    }

    public String getUcode() {
        return getInstance(this.f81057b).b("ucode", "");
    }

    public String getUmid() {
        return this.f81058f.getString("KEY_SET_UMID", "");
    }

    /* access modifiers changed from: package-private */
    public String h() {
        return this.f81058f.getString("KEY_NOTIFICATION_CHANNEL", "");
    }

    public boolean hasTransferedCacheFileDataToSQL() {
        return b("KEY_CACHE_FILE_TRANSFER_TO_SQL", "false").equalsIgnoreCase("true");
    }

    public void removeMessageAppKey() {
        this.f81058f.edit().remove("KEY_UMENG_MESSAGE_APP_KEY").commit();
    }

    public void removeMessageAppSecret() {
        this.f81058f.edit().remove("KEY_UMENG_MESSAGE_APP_SECRET").commit();
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return Integer.valueOf(b("KEY_NO_DISTURB_START_MINUTE", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return Integer.valueOf(b("KEY_NO_DISTURB_END_HOUR", "7")).intValue();
    }

    /* access modifiers changed from: package-private */
    public int d() {
        return Integer.valueOf(b("KEY_NO_DISTURB_END_MINUTE", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public int getAppLaunchLogSendPolicy() {
        return Integer.valueOf(b("KEY_APP_LAUNCH_LOG_SEND_POLICY", "-1")).intValue();
    }

    public int getDaRegisterSendPolicy() {
        return Integer.valueOf(b("KEY_APP_DAREGISTER_LOG_SEND_POLICY", "-1")).intValue();
    }

    public int getDisplayNotificationNumber() {
        return Integer.valueOf(b("KEY_NOTIFICATION_NUMBER", PushConstants.PUSH_TYPE_THROUGH_MESSAGE)).intValue();
    }

    public int getLocationInterval() {
        return Integer.valueOf(b("interval", "600")).intValue();
    }

    public int getMuteDuration() {
        return Integer.valueOf(b("mute_duration", "60")).intValue();
    }

    public int getNotificationPlayLights() {
        return Integer.valueOf(b("KEY_SET_NOTIFICATION_PLAY_LIGHTS", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public int getNotificationPlaySound() {
        return Integer.valueOf(b("KEY_SET_NOTIFICATION_PLAY_SOUND", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public int getNotificationPlayVibrate() {
        return Integer.valueOf(b("KEY_SET_NOTIFICATION_PLAY_VIBRATE", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public String getPushIntentServiceClass() {
        String b2 = b("KEY_PUSH_INTENT_SERVICE_CLASSNAME", "");
        if (b2.equalsIgnoreCase("")) {
            b2 = "";
        } else {
            try {
                Class.forName(b2);
            } catch (ClassNotFoundException unused) {
                return "";
            }
        }
        return b2;
    }

    public int getRegisterTimes() {
        return Integer.valueOf(getInstance(this.f81057b).b("KEY_REGISTER_TIMES", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public int getSerialNo() {
        return Integer.valueOf(b("serial_no", PushConstants.PUSH_TYPE_THROUGH_MESSAGE)).intValue();
    }

    public int getTagCount() {
        return Integer.valueOf(b("UMENG_TAG_COUNT", PushConstants.PUSH_TYPE_NOTIFY)).intValue();
    }

    public int getTagRemain() {
        return Integer.valueOf(b("UMENG_TAG_REMAIN", "64")).intValue();
    }

    public int getTagSendPolicy() {
        return Integer.valueOf(b("KEY_TAG_SEND_POLICY", "-1")).intValue();
    }

    public boolean isEnabled() {
        String b2 = b("is_register", "");
        if (b2.equalsIgnoreCase("true") || b2.equalsIgnoreCase("")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return Integer.valueOf(b("KEY_NO_DISTURB_START_HOUR", "23")).intValue();
    }

    public boolean hasAppLaunchLogSentToday() {
        Calendar instance = Calendar.getInstance();
        try {
            instance.setTimeInMillis(m.a(this.f81057b).f());
        } catch (Exception unused) {
        }
        Calendar instance2 = Calendar.getInstance();
        if (instance.get(6) == instance2.get(6) && instance.get(1) == instance2.get(1)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resetTags() {
        /*
            r9 = this;
            r0 = 0
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            r1.<init>()     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            android.content.Context r2 = r9.f81057b     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            android.content.ContentResolver r3 = r2.getContentResolver()     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            android.content.Context r2 = r9.f81057b     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            com.umeng.message.provider.a.a(r2)     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0080, all -> 0x0077 }
            if (r2 == 0) goto L_0x0047
            int r0 = r2.getCount()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            if (r0 <= 0) goto L_0x0047
            r2.moveToFirst()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
        L_0x0026:
            boolean r0 = r2.isAfterLast()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "tempkey"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            java.lang.String r3 = "UMENG_TAG"
            boolean r3 = r0.contains(r3)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            if (r3 == 0) goto L_0x0041
            r1.add(r0)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
        L_0x0041:
            r2.moveToNext()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            goto L_0x0026
        L_0x0045:
            r0 = move-exception
            goto L_0x007a
        L_0x0047:
            r0 = 0
            r3 = 0
        L_0x0049:
            int r4 = r1.size()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            if (r3 >= r4) goto L_0x006f
            java.lang.String r4 = "tempkey=?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            r5[r0] = r6     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            android.content.Context r6 = r9.f81057b     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            android.content.Context r7 = r9.f81057b     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            com.umeng.message.provider.a.a(r7)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            android.net.Uri r7 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            r6.delete(r7, r4, r5)     // Catch:{ Exception -> 0x0075, all -> 0x0045 }
            int r3 = r3 + 1
            goto L_0x0049
        L_0x006f:
            if (r2 == 0) goto L_0x0086
            r2.close()
            return
        L_0x0075:
            r0 = r2
            goto L_0x0080
        L_0x0077:
            r1 = move-exception
            r2 = r0
            r0 = r1
        L_0x007a:
            if (r2 == 0) goto L_0x007f
            r2.close()
        L_0x007f:
            throw r0
        L_0x0080:
            if (r0 == 0) goto L_0x0086
            r0.close()
            return
        L_0x0086:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.resetTags():void");
    }

    public void add_addAliasInterval(String str) {
        if (str != null) {
            c("addAlias", str);
        }
    }

    public void add_addTagsInterval(String str) {
        if (str != null) {
            c("addTags", str);
        }
    }

    public void add_deleteAliasInterval(String str) {
        if (str != null) {
            c("deleteAlias", str);
        }
    }

    public void add_deleteTagsInterval(String str) {
        if (str != null) {
            c("deleteTags", str);
        }
    }

    public void add_getTagsInteral(String str) {
        if (str != null) {
            c("getTags", str);
        }
    }

    public void add_setAliasInterval(String str) {
        if (str != null) {
            c("setAlias", str);
        }
    }

    public void setLastMessageMsgID(String str) {
        c("last_msg_id", str);
    }

    public void setResourcePackageName(String str) {
        c("KEY_SET_RESOURCE_PACKAGENAME", str);
    }

    public void setUcode(String str) {
        c("ucode", str);
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        return b("device_token", "").equalsIgnoreCase(str);
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        this.f81058f.edit().putString("KEY_NOTIFICATION_CHANNEL", str).apply();
    }

    public void removeKeyAndValue(final String str) {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r9 = this;
                    r0 = 0
                    android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1.<init>()     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1.put(r2, r3)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.MessageSharedPrefs r1 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.Context r1 = r1.f81057b     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.ContentResolver r2 = r1.getContentResolver()     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.MessageSharedPrefs r1 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.content.Context r1 = r1.f81057b     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    com.umeng.message.provider.a.a(r1)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r1 = 1
                    java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    java.lang.String r5 = "tempvalue"
                    r8 = 0
                    r4[r8] = r5     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
                    if (r2 == 0) goto L_0x005a
                    java.lang.String r0 = "tempkey=?"
                    java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    r1[r8] = r3     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.MessageSharedPrefs r3 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.Context r3 = r3.f81057b     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.MessageSharedPrefs r4 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.content.Context r4 = r4.f81057b     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    com.umeng.message.provider.a.a(r4)     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    r3.delete(r4, r0, r1)     // Catch:{ Exception -> 0x0058, all -> 0x0054 }
                    goto L_0x005a
                L_0x0054:
                    r0 = move-exception
                    r1 = r0
                    r0 = r2
                    goto L_0x0061
                L_0x0058:
                    r0 = r2
                    goto L_0x0067
                L_0x005a:
                    if (r2 == 0) goto L_0x006d
                    r2.close()
                    return
                L_0x0060:
                    r1 = move-exception
                L_0x0061:
                    if (r0 == 0) goto L_0x0066
                    r0.close()
                L_0x0066:
                    throw r1
                L_0x0067:
                    if (r0 == 0) goto L_0x006d
                    r0.close()
                    return
                L_0x006d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.AnonymousClass3.run():void");
            }
        });
    }

    public void setAddWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            c("addWeightedTags", str);
        }
    }

    public void setAppVersion(String str) {
        if (str == null) {
            removeKeyAndValue("app_version");
        } else {
            c("app_version", str);
        }
    }

    public void setDeleteWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            c("deleteWeightedTags", str);
        }
    }

    public void setDeviceToken(String str) {
        if (str == null) {
            removeKeyAndValue("device_token");
        } else {
            c("device_token", str);
        }
    }

    public void setHasResgister(boolean z) {
        c("has_register", String.valueOf(z));
    }

    public void setIsEnabled(boolean z) {
        c("is_register", String.valueOf(z));
    }

    public void setListWeightedTagsInterval(String str) {
        if (!TextUtils.isEmpty(str)) {
            c("listWeightedTags", str);
        }
    }

    public void setNotificaitonOnForeground(boolean z) {
        c("KEY_SET_NOTIFICATION_ON_FOREGROUND", String.valueOf(z));
    }

    public void setUmid(String str) {
        this.f81058f.edit().putString("KEY_SET_UMID", str).apply();
    }

    private MessageSharedPrefs(Context context) {
        this.f81057b = context;
        if (Build.VERSION.SDK_INT > 11) {
            this.g |= 4;
        }
        this.f81058f = c.a(context, "umeng_message_state", this.g);
    }

    public static synchronized MessageSharedPrefs getInstance(Context context) {
        MessageSharedPrefs messageSharedPrefs;
        synchronized (MessageSharedPrefs.class) {
            if (f81056c == null) {
                f81056c = new MessageSharedPrefs(context);
            }
            messageSharedPrefs = f81056c;
        }
        return messageSharedPrefs;
    }

    public boolean hasMessageResourceDownloaded(String str) {
        return b("KEY_MSG_RESOURCE_DOWNLOAD_PREFIX" + str, "false").equals("true");
    }

    public boolean isTagSet(String str) {
        return Boolean.valueOf(b(String.format("UMENG_TAG_%s", new Object[]{str}), "false")).booleanValue();
    }

    public void removeMessageResouceRecord(String str) {
        removeKeyAndValue("KEY_MSG_RESOURCE_DOWNLOAD_PREFIX" + str);
    }

    public void setAppLaunchLogSendPolicy(int i) {
        c("KEY_APP_LAUNCH_LOG_SEND_POLICY", i);
    }

    public void setDaRegisterSendPolicy(int i) {
        c("KEY_APP_DAREGISTER_LOG_SEND_POLICY", i);
    }

    public void setDisplayNotificationNumber(int i) {
        c("KEY_NOTIFICATION_NUMBER", i);
    }

    public void setMessageChannel(String str) {
        if (h.d(this.f81057b)) {
            this.f81058f.edit().putString("KEY_UMENG_MESSAGE_APP_CHANNEL", str).commit();
            d.a(new Runnable() {
                public void run() {
                    UTrack.getInstance(MessageSharedPrefs.this.f81057b).updateHeader();
                }
            });
        }
    }

    public void setMessageResourceDownloaded(String str) {
        c("KEY_MSG_RESOURCE_DOWNLOAD_PREFIX" + str, "true");
    }

    public void setMuteDuration(int i) {
        c("mute_duration", i);
    }

    public void setNotificationPlayLights(int i) {
        c("KEY_SET_NOTIFICATION_PLAY_LIGHTS", i);
    }

    public void setNotificationPlaySound(int i) {
        c("KEY_SET_NOTIFICATION_PLAY_SOUND", i);
    }

    public void setNotificationPlayVibrate(int i) {
        c("KEY_SET_NOTIFICATION_PLAY_VIBRATE", i);
    }

    public <U extends UmengMessageService> void setPushIntentServiceClass(Class<U> cls) {
        if (cls == null) {
            removeKeyAndValue("KEY_PUSH_INTENT_SERVICE_CLASSNAME");
        } else {
            c("KEY_PUSH_INTENT_SERVICE_CLASSNAME", cls.getName());
        }
    }

    public void setRegisterTimes(int i) {
        c("KEY_REGISTER_TIMES", i);
    }

    public void setSerialNo(int i) {
        c("serial_no", i);
    }

    public void setTagRemain(int i) {
        c("UMENG_TAG_REMAIN", i);
    }

    public void setTagSendPolicy(int i) {
        c("KEY_TAG_SEND_POLICY", i);
    }

    public void removeTags(String... strArr) {
        for (String str : strArr) {
            String format = String.format("UMENG_TAG_%s", new Object[]{str});
            if (Boolean.valueOf(b(format, "false")).booleanValue()) {
                removeKeyAndValue(format);
                c("UMENG_TAG_COUNT", (getTagCount() - 1));
            }
        }
    }

    public void setLocationInterval(int i) {
        if (i < 2 || i > 1800) {
            UMLog.mutlInfo("LBS", 2, "LBS的请求间隔应该在2至1800秒之间");
            return;
        }
        c("interval", i);
    }

    public void setMessageAppKey(String str) {
        if (h.d(this.f81057b)) {
            if (str == null || str.equals("")) {
                UMLog.mutlInfo(f81055a, 0, "appkey不能为null");
                return;
            }
            this.f81058f.edit().putString("KEY_UMENG_MESSAGE_APP_KEY", str).commit();
        }
    }

    public void setMessageAppSecret(String str) {
        if (h.d(this.f81057b)) {
            if (str == null || str.equals("")) {
                UMLog.mutlInfo(f81055a, 0, "appSecret不能为null");
                return;
            }
            this.f81058f.edit().putString("KEY_UMENG_MESSAGE_APP_SECRET", str).commit();
        }
    }

    public void addTags(String... strArr) {
        for (String str : strArr) {
            String format = String.format("UMENG_TAG_%s", new Object[]{str});
            if (!Boolean.valueOf(b(format, "false")).booleanValue()) {
                c(format, "true");
                c("UMENG_TAG_COUNT", (getTagCount() + 1));
            }
        }
    }

    private void c(final String str, final String str2) {
        ThreadPoolExecutorFactory.execute(new Runnable() {
            /* JADX WARNING: Removed duplicated region for block: B:20:0x00c4  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void run() {
                /*
                    r10 = this;
                    r0 = 0
                    java.lang.String r7 = "tempkey=?"
                    r1 = 1
                    java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String r2 = r2     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    r3 = 0
                    r8[r3] = r2     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.MessageSharedPrefs r2 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.Context r2 = r2.f81057b     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.MessageSharedPrefs r4 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.content.Context r4 = r4.f81057b     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    com.umeng.message.provider.a.a(r4)     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    java.lang.String r1 = "tempvalue"
                    r5[r3] = r1     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    r6 = 0
                    r1 = r2
                    r2 = r4
                    r3 = r5
                    r4 = r7
                    r5 = r8
                    android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00c8, all -> 0x00be }
                    if (r1 != 0) goto L_0x0060
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r2 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r3 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.insert(r3, r0)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    goto L_0x00b6
                L_0x005e:
                    r0 = move-exception
                    goto L_0x00c2
                L_0x0060:
                    boolean r0 = r1.moveToFirst()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    if (r0 == 0) goto L_0x008b
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r2 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r3 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.update(r3, r0, r7, r8)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    goto L_0x00b6
                L_0x008b:
                    android.content.ContentValues r0 = new android.content.ContentValues     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.<init>()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempkey"
                    java.lang.String r3 = r2     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    java.lang.String r2 = "tempvalue"
                    java.lang.String r3 = r3     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r0.put(r2, r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r2 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r2 = r2.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.MessageSharedPrefs r3 = com.umeng.message.MessageSharedPrefs.this     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.content.Context r3 = r3.f81057b     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    com.umeng.message.provider.a.a(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    android.net.Uri r3 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                    r2.insert(r3, r0)     // Catch:{ Exception -> 0x00bc, all -> 0x005e }
                L_0x00b6:
                    if (r1 == 0) goto L_0x00ce
                    r1.close()
                    return
                L_0x00bc:
                    r0 = r1
                    goto L_0x00c8
                L_0x00be:
                    r1 = move-exception
                    r9 = r1
                    r1 = r0
                    r0 = r9
                L_0x00c2:
                    if (r1 == 0) goto L_0x00c7
                    r1.close()
                L_0x00c7:
                    throw r0
                L_0x00c8:
                    if (r0 == 0) goto L_0x00ce
                    r0.close()
                    return
                L_0x00ce:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.AnonymousClass2.run():void");
            }
        });
    }

    private void a(String str, String str2) {
        String[] strArr = {str, str2};
        ContentResolver contentResolver = this.f81057b.getContentResolver();
        a.a(this.f81057b);
        contentResolver.delete(a.f81330d, "type=? and message=? ", strArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r10 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r10 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            r0 = 0
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r1.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r2 = "tempkey"
            r1.put(r2, r10)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r6 = "tempkey=?"
            r1 = 1
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r2 = 0
            r7[r2] = r10     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.Context r10 = r9.f81057b     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.content.Context r10 = r9.f81057b     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            com.umeng.message.provider.a.a(r10)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            android.net.Uri r4 = com.umeng.message.provider.a.f81329c     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String[] r5 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            java.lang.String r10 = "tempvalue"
            r5[r2] = r10     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0054, all -> 0x004d }
            if (r10 != 0) goto L_0x0033
            if (r10 == 0) goto L_0x0032
            r10.close()
        L_0x0032:
            return r11
        L_0x0033:
            boolean r0 = r10.moveToFirst()     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "tempvalue"
            int r0 = r10.getColumnIndex(r0)     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            java.lang.String r0 = r10.getString(r0)     // Catch:{ Exception -> 0x0055, all -> 0x004a }
            r11 = r0
        L_0x0044:
            if (r10 == 0) goto L_0x0058
        L_0x0046:
            r10.close()
            goto L_0x0058
        L_0x004a:
            r11 = move-exception
            r0 = r10
            goto L_0x004e
        L_0x004d:
            r11 = move-exception
        L_0x004e:
            if (r0 == 0) goto L_0x0053
            r0.close()
        L_0x0053:
            throw r11
        L_0x0054:
            r10 = r0
        L_0x0055:
            if (r10 == 0) goto L_0x0058
            goto L_0x0046
        L_0x0058:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.b(java.lang.String, java.lang.String):java.lang.String");
    }

    public String getLastAlias(int i, String str) {
        String str2 = "";
        try {
            String[] strArr = {str, i, PushConstants.PUSH_TYPE_NOTIFY, PushConstants.PUSH_TYPE_UPLOAD_LOG};
            ContentResolver contentResolver = this.f81057b.getContentResolver();
            a.a(this.f81057b);
            Cursor query = contentResolver.query(a.f81330d, new String[]{"alias"}, "type=? and exclusive=? and (error=? or error = ?)", strArr, "time desc");
            if (query != null && query.getCount() > 0) {
                query.moveToFirst();
                str2 = query.getString(query.getColumnIndex("alias"));
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception unused) {
        }
        return str2;
    }

    public void removeAlias(int i, String str, String str2) {
        try {
            String[] strArr = {str2, str, i};
            ContentResolver contentResolver = this.f81057b.getContentResolver();
            a.a(this.f81057b);
            contentResolver.delete(a.f81330d, "type=? and alias=? and exclusive=? ", strArr);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00de, code lost:
        if (r11 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00e0, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ec, code lost:
        if (r11 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ef, code lost:
        return r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isAliasSet(int r11, java.lang.String r12, java.lang.String r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.lang.String r5 = "type=? and alias=? and exclusive=? and (error=? or error = ?)"
            r2 = 5
            java.lang.String[] r6 = new java.lang.String[r2]     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r6[r0] = r13     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r8 = 1
            r6[r8] = r12     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r2.<init>()     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r2.append(r11)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r9 = 2
            r6[r9] = r2     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r2 = 3
            java.lang.String r3 = "0"
            r6[r2] = r3     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r2 = 4
            java.lang.String r3 = "2"
            r6[r2] = r3     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r2 = f81055a     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r7 = "type:"
            r4.<init>(r7)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r4.append(r13)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r7 = ",alias:"
            r4.append(r7)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r4.append(r12)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r7 = ",exclusive:"
            r4.append(r7)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r4.append(r11)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r11 = r4.toString()     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r3[r0] = r11     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r2, (int) r9, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            android.content.Context r11 = r10.f81057b     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            android.content.ContentResolver r2 = r11.getContentResolver()     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            android.content.Context r11 = r10.f81057b     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            com.umeng.message.provider.a.a(r11)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            android.net.Uri r3 = com.umeng.message.provider.a.f81330d     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String[] r4 = new java.lang.String[r9]     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r11 = "type"
            r4[r0] = r11     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            java.lang.String r11 = "alias"
            r4[r8] = r11     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00eb, all -> 0x00e4 }
            if (r11 == 0) goto L_0x00de
            int r1 = r11.getCount()     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r2 = f81055a     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r5 = "count:"
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r4.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r3[r0] = r4     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r2, (int) r9, (java.lang.String[]) r3)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            if (r1 <= 0) goto L_0x00de
            r11.moveToFirst()     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r1 = "type"
            int r1 = r11.getColumnIndex(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r2 = "alias"
            int r2 = r11.getColumnIndex(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r2 = r11.getString(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r3 = f81055a     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String[] r4 = new java.lang.String[r8]     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r6 = "typeTmp:"
            r5.<init>(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r5.append(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r6 = ",aliasTmp:"
            r5.append(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r5.append(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r6 = ",type:"
            r5.append(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r5.append(r13)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r6 = ",alis:"
            r5.append(r6)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r5.append(r12)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            r4[r0] = r5     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r3, (int) r9, (java.lang.String[]) r4)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            boolean r13 = r1.equalsIgnoreCase(r13)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            if (r13 == 0) goto L_0x00de
            boolean r12 = r2.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x00ec, all -> 0x00db }
            if (r12 == 0) goto L_0x00de
            r0 = 1
            goto L_0x00de
        L_0x00db:
            r12 = move-exception
            r1 = r11
            goto L_0x00e5
        L_0x00de:
            if (r11 == 0) goto L_0x00ef
        L_0x00e0:
            r11.close()
            goto L_0x00ef
        L_0x00e4:
            r12 = move-exception
        L_0x00e5:
            if (r1 == 0) goto L_0x00ea
            r1.close()
        L_0x00ea:
            throw r12
        L_0x00eb:
            r11 = r1
        L_0x00ec:
            if (r11 == 0) goto L_0x00ef
            goto L_0x00e0
        L_0x00ef:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.MessageSharedPrefs.isAliasSet(int, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: package-private */
    public void a(int i, int i2, int i3, int i4) {
        c("KEY_NO_DISTURB_START_HOUR", i);
        c("KEY_NO_DISTURB_START_HOUR", i2);
        c("KEY_NO_DISTURB_END_HOUR", i3);
        c("KEY_NO_DISTURB_END_MINUTE", i4);
    }

    public void addAlias(String str, String str2, int i, int i2, String str3) {
        try {
            a(str2, str3);
            String[] strArr = {str, str2, i};
            ContentResolver contentResolver = this.f81057b.getContentResolver();
            a.a(this.f81057b);
            Cursor query = contentResolver.query(a.f81330d, new String[]{"error"}, "alias=? and type=? and exclusive=?", strArr, "time desc");
            if (query == null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("type", str2);
                contentValues.put("alias", str);
                contentValues.put("exclusive", Integer.valueOf(i));
                contentValues.put("error", Integer.valueOf(i2));
                contentValues.put("message", str3);
                ContentResolver contentResolver2 = this.f81057b.getContentResolver();
                a.a(this.f81057b);
                contentResolver2.insert(a.f81330d, contentValues);
            } else if (query.getCount() > 0) {
                query.moveToFirst();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues2.put("type", str2);
                contentValues2.put("alias", str);
                contentValues2.put("exclusive", Integer.valueOf(i));
                contentValues2.put("error", Integer.valueOf(i2));
                contentValues2.put("message", str3);
                ContentResolver contentResolver3 = this.f81057b.getContentResolver();
                a.a(this.f81057b);
                contentResolver3.update(a.f81330d, contentValues2, "alias=? and type=? and exclusive=?", strArr);
            } else {
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("time", Long.valueOf(System.currentTimeMillis()));
                contentValues3.put("type", str2);
                contentValues3.put("alias", str);
                contentValues3.put("exclusive", Integer.valueOf(i));
                contentValues3.put("error", Integer.valueOf(i2));
                contentValues3.put("message", str3);
                ContentResolver contentResolver4 = this.f81057b.getContentResolver();
                a.a(this.f81057b);
                contentResolver4.insert(a.f81330d, contentValues3);
            }
            if (query != null) {
                query.close();
            }
        } catch (Exception unused) {
        }
    }
}

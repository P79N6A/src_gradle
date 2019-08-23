package com.coloros.mcssdk;

import android.content.Context;
import android.content.Intent;
import com.coloros.mcssdk.a.a;
import com.coloros.mcssdk.a.b;
import com.coloros.mcssdk.a.d;
import com.coloros.mcssdk.a.e;
import com.coloros.mcssdk.b.c;
import com.coloros.mcssdk.callback.PushCallback;
import com.coloros.mcssdk.mode.AppMessage;
import com.coloros.mcssdk.mode.CommandMessage;
import com.coloros.mcssdk.mode.SptDataMessage;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class PushManager {
    private static int count;
    private String mAppKey;
    private String mAppSecret;
    private Context mContext;
    private List<d> mParsers;
    private List<c> mProcessors;
    private PushCallback mPushCallback;
    private String mRegisterID;

    private PushManager() {
        this.mProcessors = new ArrayList();
        this.mParsers = new ArrayList();
        synchronized (PushManager.class) {
            if (count <= 0) {
                count++;
            } else {
                throw new RuntimeException("PushManager can't create again!");
            }
        }
        addParser(new a());
        addParser(new e());
        addParser(new b());
        addProcessor(new com.coloros.mcssdk.b.a());
        addProcessor(new com.coloros.mcssdk.b.d());
        addProcessor(new com.coloros.mcssdk.b.b());
    }

    private synchronized void addParser(d dVar) {
        if (dVar != null) {
            this.mParsers.add(dVar);
        }
    }

    private synchronized void addProcessor(c cVar) {
        if (cVar != null) {
            this.mProcessors.add(cVar);
        }
    }

    private void checkAll() {
        checkContext();
        checkRegisterID();
    }

    private void checkContext() {
        if (this.mContext == null) {
            throw new IllegalArgumentException("please call the register first!");
        }
    }

    private void checkRegisterID() {
        if (this.mRegisterID == null) {
            throw new IllegalArgumentException("please call the register until get the registerID!");
        }
    }

    public static PushManager getInstance() {
        return c.f23102a;
    }

    public static boolean isSupportPush(Context context) {
        return com.coloros.mcssdk.c.e.a(context, "com.coloros.mcs") && com.coloros.mcssdk.c.e.b(context, "com.coloros.mcs") >= 1012 && com.coloros.mcssdk.c.e.a(context, "com.coloros.mcs", "supportOpenPush");
    }

    private void startMcsService(int i) {
        startMcsService(i, "");
    }

    private void startMcsService(int i, String str) {
        Intent intent = new Intent();
        intent.setAction("com.coloros.mcssdk.action.RECEIVE_SDK_MESSAGE");
        intent.setPackage("com.coloros.mcs");
        intent.putExtra("type", i);
        intent.putExtra("params", str);
        intent.putExtra("appPackage", this.mContext.getPackageName());
        intent.putExtra("appKey", this.mAppKey);
        intent.putExtra("appSecret", this.mAppSecret);
        intent.putExtra("registerID", this.mRegisterID);
        intent.putExtra("sdkVersion", getSDKVersion());
        this.mContext.startService(intent);
    }

    public static void statisticMessage(Context context, AppMessage appMessage, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.coloros.mcssdk.action.RECEIVE_SDK_MESSAGE");
            intent.setPackage("com.coloros.mcs");
            intent.putExtra("type", 12291);
            intent.putExtra("taskID", appMessage.getTaskID());
            intent.putExtra("appPackage", appMessage.getAppPackage());
            intent.putExtra("messageID", appMessage.getMessageID());
            intent.putExtra("messageType", appMessage.getType());
            intent.putExtra("eventID", str);
            context.startService(intent);
        } catch (Exception e2) {
            com.coloros.mcssdk.c.d.b("statisticMessage--Exception" + e2.getMessage());
        }
    }

    public static void statisticMessage(Context context, SptDataMessage sptDataMessage, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("com.coloros.mcssdk.action.RECEIVE_SDK_MESSAGE");
            intent.setPackage("com.coloros.mcs");
            intent.putExtra("type", 12291);
            intent.putExtra("taskID", sptDataMessage.getTaskID());
            intent.putExtra("appPackage", sptDataMessage.getAppPackage());
            intent.putExtra("messageID", sptDataMessage.getMessageID());
            intent.putExtra("messageType", sptDataMessage.getType());
            intent.putExtra("eventID", str);
            context.startService(intent);
        } catch (Exception e2) {
            com.coloros.mcssdk.c.d.b("statisticMessage--Exception" + e2.getMessage());
        }
    }

    public void clearNotificationType() {
        checkAll();
        startMcsService(12308);
    }

    public void getAliases() {
        checkAll();
        startMcsService(12293);
    }

    public void getNotificationStatus() {
        checkAll();
        startMcsService(12309);
    }

    public List<d> getParsers() {
        return this.mParsers;
    }

    public List<c> getProcessors() {
        return this.mProcessors;
    }

    public PushCallback getPushCallback() {
        return this.mPushCallback;
    }

    public void getPushStatus() {
        checkAll();
        startMcsService(12306);
    }

    public void getPushTime() {
        checkAll();
        startMcsService(12298);
    }

    public int getPushVersionCode() {
        checkContext();
        return com.coloros.mcssdk.c.e.b(this.mContext, "com.coloros.mcs");
    }

    public String getPushVersionName() {
        checkContext();
        return com.coloros.mcssdk.c.e.c(this.mContext, "com.coloros.mcs");
    }

    public void getRegister() {
        checkContext();
        startMcsService(12289);
    }

    public String getRegisterID() {
        return this.mRegisterID;
    }

    public String getSDKVersion() {
        return "1.0.1";
    }

    public void getTags() {
        checkAll();
        startMcsService(12296);
    }

    public void getUserAccounts() {
        checkAll();
        startMcsService(12302);
    }

    public void openNotificationSettings() {
        checkAll();
        startMcsService(12310);
    }

    public void pausePush() {
        checkAll();
        startMcsService(12299);
    }

    public void register(Context context, String str, String str2, PushCallback pushCallback) {
        if (context == null) {
            throw new IllegalArgumentException("context is null !");
        } else if (isSupportPush(context)) {
            this.mAppKey = str;
            this.mAppSecret = str2;
            this.mContext = context.getApplicationContext();
            this.mPushCallback = pushCallback;
            startMcsService(12289);
        } else {
            throw new IllegalArgumentException("the phone is not support oppo push!");
        }
    }

    public void resumePush() {
        checkAll();
        startMcsService(12300);
    }

    public void setAliases(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12292, CommandMessage.parseToString(list));
        }
    }

    public void setAppKeySecret(String str, String str2) {
        this.mAppKey = str;
        this.mAppSecret = str2;
    }

    public void setNotificationType(int i) {
        checkAll();
        startMcsService(12307, String.valueOf(i));
    }

    public void setPushCallback(PushCallback pushCallback) {
        this.mPushCallback = pushCallback;
    }

    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        checkAll();
        if (list == null || list.size() <= 0 || i < 0 || i > 23 || i2 < 0 || i2 > 59 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
            throw new IllegalArgumentException("params are not all right,please check params");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("weekDays", CommandMessage.parseToString(list));
            jSONObject.put("startHour", i);
            jSONObject.put("startMin", i2);
            jSONObject.put("endHour", i3);
            jSONObject.put("endMin", i4);
            startMcsService(12298, jSONObject.toString());
        } catch (JSONException e2) {
            com.google.a.a.a.a.a.a.b(e2);
        }
    }

    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    public void setTags(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12295, CommandMessage.parseToString(list));
        }
    }

    public void setUserAccount(String str) {
        checkAll();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        setUserAccounts(arrayList);
    }

    @Deprecated
    public void setUserAccounts(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12301, CommandMessage.parseToString(list));
        }
    }

    public void unRegister() {
        checkAll();
        startMcsService(12290);
    }

    public void unsetAlias(String str) {
        checkAll();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        unsetAliases(arrayList);
    }

    @Deprecated
    public void unsetAliases(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12294, CommandMessage.parseToString(list));
        }
    }

    public void unsetTags(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12297, CommandMessage.parseToString(list));
        }
    }

    public void unsetUserAccounts(List<String> list) {
        checkAll();
        if (list != null && list.size() != 0) {
            startMcsService(12303, CommandMessage.parseToString(list));
        }
    }
}

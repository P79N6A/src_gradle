package com.meizu.cloud.pushsdk.handler;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.f.e;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageV3 implements Parcelable {
    public static final Parcelable.Creator<MessageV3> CREATOR = new Parcelable.Creator<MessageV3>() {
        /* renamed from: a */
        public final MessageV3 createFromParcel(Parcel parcel) {
            return new MessageV3(parcel);
        }

        /* renamed from: a */
        public final MessageV3[] newArray(int i) {
            return new MessageV3[i];
        }
    };
    private static final String TAG = "Message_V3";
    private String activity;
    private int clickType;
    private String content;
    private String deviceId;
    private boolean isDiscard;
    private AdvanceSetting mAdvanceSetting;
    private AppIconSetting mAppIconSetting;
    private NotificationStyle mNotificationStyle;
    private TimeDisplaySetting mTimeDisplaySetting;
    private String notificationMessage;
    private String packageName;
    private Map<String, String> paramsMap = new HashMap();
    private String pushTimestamp;
    private String seqId;
    private String taskId;
    private String throughMessage;
    private String title;
    private String uploadDataPackageName;
    private String uriPackageName;
    private String webUrl;

    public MessageV3() {
    }

    public MessageV3(Parcel parcel) {
        this.taskId = parcel.readString();
        this.seqId = parcel.readString();
        this.deviceId = parcel.readString();
        this.title = parcel.readString();
        this.content = parcel.readString();
        this.packageName = parcel.readString();
        this.clickType = parcel.readInt();
        this.isDiscard = parcel.readByte() != 0;
        this.activity = parcel.readString();
        this.webUrl = parcel.readString();
        this.uriPackageName = parcel.readString();
        this.uploadDataPackageName = parcel.readString();
        this.pushTimestamp = parcel.readString();
        this.paramsMap = parcel.readHashMap(getClass().getClassLoader());
        this.throughMessage = parcel.readString();
        this.notificationMessage = parcel.readString();
        this.mAdvanceSetting = (AdvanceSetting) parcel.readParcelable(AdvanceSetting.class.getClassLoader());
        this.mAppIconSetting = (AppIconSetting) parcel.readParcelable(AppIconSetting.class.getClassLoader());
        this.mNotificationStyle = (NotificationStyle) parcel.readParcelable(NotificationStyle.class.getClassLoader());
        this.mTimeDisplaySetting = (TimeDisplaySetting) parcel.readParcelable(TimeDisplaySetting.class.getClassLoader());
    }

    public static Map<String, String> getParamsMap(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException unused) {
        }
        return hashMap;
    }

    public static MessageV3 parse(String str, String str2, String str3, MPushMessage mPushMessage) {
        DebugLogger.e(TAG, "V2 message " + mPushMessage);
        MessageV3 messageV3 = new MessageV3();
        messageV3.setPackageName(str);
        messageV3.setUploadDataPackageName(str);
        messageV3.setDeviceId(str2);
        messageV3.setTaskId(str3);
        messageV3.setTitle(mPushMessage.getTitle());
        messageV3.setContent(mPushMessage.getContent());
        messageV3.setIsDiscard("true".equals(mPushMessage.getIsDiscard()));
        messageV3.setClickType(Integer.valueOf(mPushMessage.getClickType()).intValue());
        for (Map.Entry entry : mPushMessage.getExtra().entrySet()) {
            String str4 = (String) entry.getKey();
            String str5 = (String) entry.getValue();
            if (PushConstants.INTENT_ACTIVITY_NAME.equals(str4)) {
                messageV3.setActivity(str5);
            }
            if (PushConstants.WEB_URL.equals(str4)) {
                messageV3.setWebUrl(str5);
            }
            if (PushConstants.URI_PACKAGE_NAME.equals(str4)) {
                messageV3.setUriPackageName(str5);
            }
            if (NotificationStyle.NOTIFICATION_STYLE.equals(str4)) {
                messageV3.setmNotificationStyle(NotificationStyle.parse(str5));
            }
            if (AdvanceSetting.ADVANCE_SETTING.equals(str4)) {
                messageV3.setmAdvanceSetting(AdvanceSetting.parse(str5));
            }
            if ("is".equals(str4)) {
                messageV3.setmAppIconSetting(AppIconSetting.parse(str5));
            }
            if (TimeDisplaySetting.TIME_DISPLAY_SETTING.equals(str4)) {
                messageV3.setmTimeDisplaySetting(TimeDisplaySetting.parse(str5));
            }
        }
        messageV3.setParamsMap(mPushMessage.getParams());
        String jSONObject = e.a(mPushMessage.getExtra()).toString();
        DebugLogger.e(TAG, "MessageV2 extra json is " + jSONObject);
        if (!TextUtils.isEmpty(jSONObject)) {
            messageV3.setNotificationMessage(jSONObject);
        }
        DebugLogger.i(TAG, "parase V2 message to V3 message " + messageV3);
        return messageV3;
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4) {
        MessageV3 messageV3 = new MessageV3();
        messageV3.setNotificationMessage(str4);
        messageV3.setTaskId(str3);
        messageV3.setDeviceId(str2);
        messageV3.setPackageName(str);
        try {
            JSONObject jSONObject = new JSONObject(str4).getJSONObject("data");
            if (!jSONObject.isNull(PushConstants.TITLE)) {
                messageV3.setTitle(jSONObject.getString(PushConstants.TITLE));
            }
            if (!jSONObject.isNull(PushConstants.CONTENT)) {
                messageV3.setContent(jSONObject.getString(PushConstants.CONTENT));
            }
            if (!jSONObject.isNull(PushConstants.IS_DISCARD)) {
                messageV3.setIsDiscard(jSONObject.getBoolean(PushConstants.IS_DISCARD));
            }
            if (!jSONObject.isNull(PushConstants.CLICK_TYPE)) {
                messageV3.setClickType(jSONObject.getInt(PushConstants.CLICK_TYPE));
            }
            if (!jSONObject.isNull(PushConstants.EXTRA)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(PushConstants.EXTRA);
                if (!jSONObject2.isNull(NotificationStyle.NOTIFICATION_STYLE)) {
                    messageV3.setmNotificationStyle(NotificationStyle.parse(jSONObject2.getJSONObject(NotificationStyle.NOTIFICATION_STYLE)));
                }
                if (!jSONObject2.isNull("is")) {
                    messageV3.setmAppIconSetting(AppIconSetting.parse(jSONObject2.getJSONObject("is")));
                }
                if (!jSONObject2.isNull(AdvanceSetting.ADVANCE_SETTING)) {
                    messageV3.setmAdvanceSetting(AdvanceSetting.parse(jSONObject2.getJSONObject(AdvanceSetting.ADVANCE_SETTING)));
                }
                if (!jSONObject2.isNull(TimeDisplaySetting.TIME_DISPLAY_SETTING)) {
                    messageV3.setmTimeDisplaySetting(TimeDisplaySetting.parse(jSONObject2.getJSONObject(TimeDisplaySetting.TIME_DISPLAY_SETTING)));
                }
                if (!jSONObject2.isNull(PushConstants.INTENT_ACTIVITY_NAME)) {
                    messageV3.setActivity(jSONObject2.getString(PushConstants.INTENT_ACTIVITY_NAME));
                }
                if (!jSONObject2.isNull(PushConstants.WEB_URL)) {
                    messageV3.setWebUrl(jSONObject2.getString(PushConstants.WEB_URL));
                }
                if (!jSONObject2.isNull(PushConstants.TASK_ID) && TextUtils.isEmpty(str3)) {
                    DebugLogger.e(TAG, "Flyme 4 notification message by through message or taskId is null");
                    messageV3.setTaskId(jSONObject2.getString(PushConstants.TASK_ID));
                }
                if (!jSONObject2.isNull(PushConstants.URI_PACKAGE_NAME)) {
                    messageV3.setUriPackageName(jSONObject2.getString(PushConstants.URI_PACKAGE_NAME));
                }
                if (!jSONObject2.isNull(PushConstants.PARAMS)) {
                    messageV3.setParamsMap(getParamsMap(jSONObject2.getJSONObject(PushConstants.PARAMS)));
                }
            }
        } catch (JSONException e2) {
            DebugLogger.e(TAG, "parse message error " + e2.getMessage());
        }
        return messageV3;
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4, String str5) {
        MessageV3 parse = parse(str, str2, str3, str5);
        parse.setSeqId(str4);
        return parse;
    }

    public static MessageV3 parse(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        MessageV3 parse = parse(str, str4, str5, str6, str7);
        parse.setUploadDataPackageName(str2);
        parse.setPushTimestamp(str3);
        return parse;
    }

    public int describeContents() {
        return 0;
    }

    public String getActivity() {
        return this.activity;
    }

    public int getClickType() {
        return this.clickType;
    }

    public String getContent() {
        return this.content;
    }

    public String getDeviceId() {
        return this.deviceId;
    }

    public String getNotificationMessage() {
        return this.notificationMessage;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public Map<String, String> getParamsMap() {
        return this.paramsMap;
    }

    public String getPushTimestamp() {
        return this.pushTimestamp;
    }

    public String getSeqId() {
        return this.seqId;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getThroughMessage() {
        return this.throughMessage;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUploadDataPackageName() {
        return this.uploadDataPackageName;
    }

    public String getUriPackageName() {
        return this.uriPackageName;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public AdvanceSetting getmAdvanceSetting() {
        return this.mAdvanceSetting;
    }

    public AppIconSetting getmAppIconSetting() {
        return this.mAppIconSetting;
    }

    public NotificationStyle getmNotificationStyle() {
        return this.mNotificationStyle;
    }

    public TimeDisplaySetting getmTimeDisplaySetting() {
        return this.mTimeDisplaySetting;
    }

    public boolean isDiscard() {
        return this.isDiscard;
    }

    public void setActivity(String str) {
        this.activity = str;
    }

    public void setClickType(int i) {
        this.clickType = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDeviceId(String str) {
        this.deviceId = str;
    }

    public void setIsDiscard(boolean z) {
        this.isDiscard = z;
    }

    public void setNotificationMessage(String str) {
        this.notificationMessage = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setParamsMap(Map<String, String> map) {
        this.paramsMap = map;
    }

    public void setPushTimestamp(String str) {
        this.pushTimestamp = str;
    }

    public void setSeqId(String str) {
        this.seqId = str;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setThroughMessage(String str) {
        this.throughMessage = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUploadDataPackageName(String str) {
        this.uploadDataPackageName = str;
    }

    public void setUriPackageName(String str) {
        this.uriPackageName = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }

    public void setmAdvanceSetting(AdvanceSetting advanceSetting) {
        this.mAdvanceSetting = advanceSetting;
    }

    public void setmAppIconSetting(AppIconSetting appIconSetting) {
        this.mAppIconSetting = appIconSetting;
    }

    public void setmNotificationStyle(NotificationStyle notificationStyle) {
        this.mNotificationStyle = notificationStyle;
    }

    public void setmTimeDisplaySetting(TimeDisplaySetting timeDisplaySetting) {
        this.mTimeDisplaySetting = timeDisplaySetting;
    }

    public String toString() {
        return "MessageV3{taskId='" + this.taskId + '\'' + ", seqId='" + this.seqId + '\'' + ", deviceId='" + this.deviceId + '\'' + ", title='" + this.title + '\'' + ", content='" + this.content + '\'' + ", packageName='" + this.packageName + '\'' + ", clickType=" + this.clickType + ", isDiscard=" + this.isDiscard + ", activity='" + this.activity + '\'' + ", webUrl='" + this.webUrl + '\'' + ", uriPackageName='" + this.uriPackageName + '\'' + ", pushTimestamp='" + this.pushTimestamp + '\'' + ", uploadDataPackageName='" + this.uploadDataPackageName + '\'' + ", paramsMap=" + this.paramsMap + ", throughMessage='" + this.throughMessage + '\'' + ", notificationMessage='" + this.notificationMessage + '\'' + ", mAdvanceSetting=" + this.mAdvanceSetting + ", mAppIconSetting=" + this.mAppIconSetting + ", mNotificationStyle=" + this.mNotificationStyle + ", mTimeDisplaySetting=" + this.mTimeDisplaySetting + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.taskId);
        parcel.writeString(this.seqId);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.title);
        parcel.writeString(this.content);
        parcel.writeString(this.packageName);
        parcel.writeInt(this.clickType);
        parcel.writeByte(this.isDiscard ? (byte) 1 : 0);
        parcel.writeString(this.activity);
        parcel.writeString(this.webUrl);
        parcel.writeString(this.uriPackageName);
        parcel.writeString(this.uploadDataPackageName);
        parcel.writeString(this.pushTimestamp);
        parcel.writeMap(this.paramsMap);
        parcel.writeString(this.throughMessage);
        parcel.writeString(this.notificationMessage);
        parcel.writeParcelable(this.mAdvanceSetting, i);
        parcel.writeParcelable(this.mAppIconSetting, i);
        parcel.writeParcelable(this.mNotificationStyle, i);
        parcel.writeParcelable(this.mTimeDisplaySetting, i);
    }
}

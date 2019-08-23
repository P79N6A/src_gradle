package com.meizu.cloud.pushsdk.handler.a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.NotificationService;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.notification.a.d;
import com.meizu.cloud.pushsdk.notification.b.b;
import com.meizu.cloud.pushsdk.notification.model.styleenum.BaseStyleModel;
import com.meizu.cloud.pushsdk.notification.model.styleenum.InnerStyleLayout;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends a<MessageV3> {
    public c(Context context, a aVar) {
        super(context, aVar);
    }

    private String i(MessageV3 messageV3) {
        String selfDefineContentString = MzPushMessage.fromMessageV3(messageV3).getSelfDefineContentString();
        if (!TextUtils.isEmpty(selfDefineContentString)) {
            try {
                return new JSONObject(selfDefineContentString).getString("package_name");
            } catch (JSONException unused) {
                DebugLogger.e("AbstractMessageHandler", "no quick json message");
            }
        }
        return null;
    }

    public int a() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3, com.meizu.cloud.pushsdk.notification.c cVar) {
        if (cVar != null) {
            cVar.e(messageV3);
            b(messageV3);
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start MessageV3Handler match");
        if (!a(0, g(intent))) {
            return false;
        }
        if (PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(i(intent))) {
            return true;
        }
        if (TextUtils.isEmpty(i(intent))) {
            String stringExtra = intent.getStringExtra("message");
            if (!TextUtils.isEmpty(stringExtra) && a(stringExtra)) {
                DebugLogger.e("AbstractMessageHandler", "old cloud notification message");
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.c(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void c(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.a(c(), messageV3.getUploadDataPackageName(), messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public com.meizu.cloud.pushsdk.notification.c a(MessageV3 messageV3) {
        PushNotificationBuilder pushNotificationBuilder = new PushNotificationBuilder();
        pushNotificationBuilder.setClickPackageName(i(messageV3));
        b().a(pushNotificationBuilder);
        com.meizu.cloud.pushsdk.notification.c cVar = null;
        if (messageV3.getmNotificationStyle() != null) {
            int baseStyle = messageV3.getmNotificationStyle().getBaseStyle();
            if (BaseStyleModel.FLYME.getCode() == baseStyle) {
                int innerStyle = messageV3.getmNotificationStyle().getInnerStyle();
                if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable disable");
                    cVar = new com.meizu.cloud.pushsdk.notification.b.c(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Text");
                    cVar = new b(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Standard Notification with Expandable Picture");
                    cVar = new com.meizu.cloud.pushsdk.notification.b.a(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle) {
                    DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                    cVar = new d(c(), pushNotificationBuilder);
                }
            } else if (BaseStyleModel.PURE_PICTURE.getCode() == baseStyle) {
                cVar = new com.meizu.cloud.pushsdk.notification.b(c(), pushNotificationBuilder);
                DebugLogger.i("AbstractMessageHandler", "show Pure Picture Notification");
            } else if (BaseStyleModel.ANDROID.getCode() == baseStyle) {
                int innerStyle2 = messageV3.getmNotificationStyle().getInnerStyle();
                if (InnerStyleLayout.EXPANDABLE_STANDARD.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable disable");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.c(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_TEXT.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Text");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.b(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_PIC.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Android  Notification with Expandable Picture");
                    cVar = new com.meizu.cloud.pushsdk.notification.a.a(c(), pushNotificationBuilder);
                } else if (InnerStyleLayout.EXPANDABLE_VIDEO.getCode() == innerStyle2) {
                    DebugLogger.i("AbstractMessageHandler", "show Flyme Video notification");
                    cVar = new d(c(), pushNotificationBuilder);
                }
            }
        }
        if (cVar != null) {
            return cVar;
        }
        DebugLogger.e("AbstractMessageHandler", "use standard v2 notification");
        return new com.meizu.cloud.pushsdk.notification.d(c(), pushNotificationBuilder);
    }

    /* access modifiers changed from: protected */
    public boolean f(MessageV3 messageV3) {
        String uriPackageName = messageV3.getUriPackageName();
        if (!TextUtils.isEmpty(uriPackageName)) {
            return MzSystemUtils.isPackageInstalled(c(), uriPackageName);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int d(MessageV3 messageV3) {
        Context c2;
        String str;
        int i;
        int i2 = 0;
        if (messageV3.getmTimeDisplaySetting() != null && messageV3.getmTimeDisplaySetting().isTimeDisplay()) {
            if (System.currentTimeMillis() > Long.valueOf(messageV3.getmTimeDisplaySetting().getEndShowTime()).longValue()) {
                i2 = 1;
                c2 = c();
                str = "schedule notification expire";
                i = PushConstants.EXPIRE_NOTIFICATION;
            } else if (System.currentTimeMillis() > Long.valueOf(messageV3.getmTimeDisplaySetting().getStartShowTime()).longValue()) {
                i2 = 2;
                c2 = c();
                str = "schedule notification on time";
                i = PushConstants.ONTIME_NOTIFICATION;
            } else {
                i2 = 3;
                c2 = c();
                str = "schedule notification delay";
                i = PushConstants.DELAY_NOTIFICATION;
            }
            com.meizu.cloud.pushsdk.util.c.a(c2, str, i, messageV3.getTaskId(), messageV3.getDeviceId());
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void e(MessageV3 messageV3) {
        Context c2 = c();
        c();
        AlarmManager alarmManager = (AlarmManager) c2.getSystemService("alarm");
        Intent intent = new Intent(c(), NotificationService.class);
        intent.setPackage(messageV3.getPackageName());
        intent.addCategory(messageV3.getPackageName());
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra("command_type", "reflect_receiver");
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SCHEDULE_NOTIFICATION_MESSAGE, messageV3);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SCHEDULE_NOTIFICATION);
        PendingIntent service = PendingIntent.getService(c(), 0, intent, MinSdkChecker.isSupportSetDrawableSmallIcon() ? 67108864 : 1073741824);
        String startShowTime = messageV3.getmTimeDisplaySetting().getStartShowTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = null;
        if (!TextUtils.isEmpty(startShowTime)) {
            str = simpleDateFormat.format(new Date(Long.valueOf(startShowTime).longValue()));
        }
        long longValue = Long.valueOf(startShowTime).longValue() - System.currentTimeMillis();
        DebugLogger.i("AbstractMessageHandler", "after " + (longValue / 1000) + " seconds Notification AlarmManager execute At " + str);
        if (Build.VERSION.SDK_INT >= 19) {
            DebugLogger.i("AbstractMessageHandler", "setAlarmManager setWindow ELAPSED_REALTIME_WAKEUP");
            alarmManager.setExact(2, SystemClock.elapsedRealtime() + longValue, service);
            return;
        }
        alarmManager.set(2, SystemClock.elapsedRealtime() + longValue, service);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public MessageV3 c(Intent intent) {
        return MessageV3.parse(c().getPackageName(), g(intent), h(intent), d(intent), e(intent), f(intent), intent.getStringExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3.equals(i(intent)) ? PushConstants.MZ_PUSH_PRIVATE_MESSAGE : "message"));
    }
}

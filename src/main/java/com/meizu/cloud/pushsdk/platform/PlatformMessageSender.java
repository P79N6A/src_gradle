package com.meizu.cloud.pushsdk.platform;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.a.b.d;
import com.meizu.cloud.pushsdk.platform.message.BasicPushStatus;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.meizu.cloud.pushsdk.util.c;

public class PlatformMessageSender {

    interface a {
        String a();

        BasicPushStatus b();

        String c();
    }

    public static void a(Context context, int i, boolean z, String str) {
        String appVersionName = MzSystemUtils.getAppVersionName(context, "com.meizu.cloud");
        DebugLogger.i("PlatformMessageSender", context.getPackageName() + " switchPushMessageSetting cloudVersion_name " + appVersionName);
        if (!TextUtils.isEmpty(appVersionName) && appVersionName.startsWith("6")) {
            Intent intent = new Intent(PushConstants.MZ_PUSH_ON_MESSAGE_SWITCH_SETTING);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_TYPE, i);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_STATUS, z);
            intent.putExtra(PushConstants.EXTRA_APP_PUSH_SWITCH_SETTING_PACKAGE_NAME, str);
            intent.setClassName("com.meizu.cloud", "com.meizu.cloud.pushsdk.pushservice.MzPushService");
            context.startService(intent);
        }
    }

    private static void a(Context context, String str, a aVar) {
        Intent intent = new Intent();
        intent.addCategory(str);
        intent.setPackage(str);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, aVar.a());
        intent.putExtra(aVar.c(), aVar.b());
        MzSystemUtils.sendMessageFromBroadcast(context, intent, PushConstants.MZ_PUSH_ON_MESSAGE_ACTION, str);
        MzSystemUtils.sendMessageFromBroadcast(context, new Intent("com.meizu.cloud.pushservice.action.PUSH_SERVICE_START"), null, str);
    }

    public static void a(Context context, String str, final PushSwitchStatus pushSwitchStatus) {
        a(context, str, (a) new a() {
            public final String a() {
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS;
            }

            public final BasicPushStatus b() {
                return pushSwitchStatus;
            }

            public final String c() {
                return PushConstants.EXTRA_APP_PUSH_SWITCH_STATUS;
            }
        });
    }

    public static void a(Context context, String str, final RegisterStatus registerStatus) {
        a(context, str, (a) new a() {
            public final String a() {
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_REGISTER_STATUS;
            }

            public final BasicPushStatus b() {
                return registerStatus;
            }

            public final String c() {
                return PushConstants.EXTRA_APP_PUSH_REGISTER_STATUS;
            }
        });
    }

    public static void a(Context context, String str, final SubAliasStatus subAliasStatus) {
        a(context, str, (a) new a() {
            public final String a() {
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBALIAS_STATUS;
            }

            public final BasicPushStatus b() {
                return subAliasStatus;
            }

            public final String c() {
                return PushConstants.EXTRA_APP_PUSH_SUBALIAS_STATUS;
            }
        });
    }

    public static void a(Context context, String str, final SubTagsStatus subTagsStatus) {
        a(context, str, (a) new a() {
            public final String a() {
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_SUBTAGS_STATUS;
            }

            public final BasicPushStatus b() {
                return subTagsStatus;
            }

            public final String c() {
                return PushConstants.EXTRA_APP_PUSH_SUBTAGS_STATUS;
            }
        });
    }

    public static void a(Context context, String str, final UnRegisterStatus unRegisterStatus) {
        a(context, str, (a) new a() {
            public final String a() {
                return PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_UNREGISTER_STATUS;
            }

            public final BasicPushStatus b() {
                return unRegisterStatus;
            }

            public final String c() {
                return PushConstants.EXTRA_APP_PUSH_UNREGISTER_STATUS;
            }
        });
    }

    public static void launchStartActivity(Context context, String str, String str2, String str3) {
        d a2 = c.a(str3);
        MessageV3 parse = MessageV3.parse(str, str, a2.e(), a2.f(), a2.c(), a2.d(), str2);
        Intent intent = new Intent();
        intent.setData(Uri.parse("custom://" + System.currentTimeMillis()));
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, parse);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE);
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
            intent.setClassName(str, "com.meizu.cloud.pushsdk.NotificationService");
        }
        intent.putExtra("command_type", "reflect_receiver");
        DebugLogger.i("PlatformMessageSender", "start notification service " + parse);
        try {
            context.startService(intent);
        } catch (Exception e2) {
            DebugLogger.e("PlatformMessageSender", "launchStartActivity error " + e2.getMessage());
        }
    }

    public static void showQuickNotification(Context context, String str, String str2) {
        d a2 = c.a(str2);
        Intent intent = new Intent();
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SEQ_ID, a2.d());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_TASK_ID, a2.c());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_TASK_TIMES_TAMP, a2.e());
        intent.putExtra(PushConstants.EXTRA_APP_PUSH_SERVICE_DEFAULT_PACKAGE_NAME, context.getPackageName());
        intent.putExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE, str);
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY, a2.f());
        intent.putExtra(PushConstants.MZ_PUSH_MESSAGE_METHOD, PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_NOTIFICATION_SHOW_V3);
        intent.setAction(PushConstants.MZ_PUSH_ON_MESSAGE_ACTION);
        intent.setClassName(context.getPackageName(), "com.meizu.cloud.pushsdk.NotificationService");
        intent.putExtra("command_type", "reflect_receiver");
        try {
            DebugLogger.e("PlatformMessageSender", "start noficationservice to show notification");
            context.startService(intent);
        } catch (Exception e2) {
            DebugLogger.e("PlatformMessageSender", "showNotification error " + e2.getMessage());
        }
    }
}

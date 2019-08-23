package com.meizu.cloud.pushsdk.handler.a.c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.handler.a.a;
import com.meizu.cloud.pushsdk.handler.a.b.d;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.c;
import com.meizu.cloud.pushsdk.util.MinSdkChecker;
import java.util.Map;

public class b extends a<MessageV3> {
    public b(Context context, com.meizu.cloud.pushsdk.handler.a aVar) {
        super(context, aVar);
    }

    private Intent a(Context context, MessageV3 messageV3) {
        Intent intent;
        String uriPackageName = messageV3.getUriPackageName();
        if (TextUtils.isEmpty(uriPackageName)) {
            uriPackageName = messageV3.getUploadDataPackageName();
        }
        DebugLogger.i("AbstractMessageHandler", "openClassName is " + uriPackageName);
        if (messageV3.getClickType() == 0) {
            intent = context.getPackageManager().getLaunchIntentForPackage(uriPackageName);
            if (!(intent == null || messageV3.getParamsMap() == null)) {
                for (Map.Entry entry : messageV3.getParamsMap().entrySet()) {
                    DebugLogger.i("AbstractMessageHandler", " launcher activity key " + ((String) entry.getKey()) + " value " + ((String) entry.getValue()));
                    if (!TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                        intent.putExtra((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        } else if (1 == messageV3.getClickType()) {
            intent = new Intent();
            if (messageV3.getParamsMap() != null) {
                for (Map.Entry entry2 : messageV3.getParamsMap().entrySet()) {
                    DebugLogger.i("AbstractMessageHandler", " key " + ((String) entry2.getKey()) + " value " + ((String) entry2.getValue()));
                    if (!TextUtils.isEmpty((CharSequence) entry2.getKey()) && !TextUtils.isEmpty((CharSequence) entry2.getValue())) {
                        intent.putExtra((String) entry2.getKey(), (String) entry2.getValue());
                    }
                }
            }
            intent.setClassName(uriPackageName, messageV3.getActivity());
            DebugLogger.i("AbstractMessageHandler", intent.toUri(1));
        } else if (2 == messageV3.getClickType()) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(messageV3.getWebUrl()));
            String uriPackageName2 = messageV3.getUriPackageName();
            if (!TextUtils.isEmpty(uriPackageName2)) {
                intent2.setPackage(uriPackageName2);
                DebugLogger.i("AbstractMessageHandler", "set uri package " + uriPackageName2);
            }
            intent = intent2;
        } else {
            if (3 == messageV3.getClickType()) {
                DebugLogger.i("AbstractMessageHandler", "CLICK_TYPE_SELF_DEFINE_ACTION");
            }
            intent = null;
        }
        if (intent != null) {
            intent.putExtra(PushConstants.MZ_PUSH_PLATFROM_EXTRA, d.a().a(messageV3.getTaskId()).a().b());
        }
        return intent;
    }

    public int a() {
        return 64;
    }

    /* access modifiers changed from: protected */
    public void a(MessageV3 messageV3, c cVar) {
        com.meizu.cloud.pushsdk.util.b.a(c(), messageV3.getPackageName(), 0);
        Intent a2 = a(c(), messageV3);
        if (a2 != null) {
            a2.addFlags(268435456);
            try {
                c().startActivity(a2);
            } catch (Exception e2) {
                DebugLogger.e("AbstractMessageHandler", "Click message StartActivity error " + e2.getMessage());
            }
        }
        if (!TextUtils.isEmpty(messageV3.getTitle()) && !TextUtils.isEmpty(messageV3.getContent()) && b() != null) {
            b().a(c(), MzPushMessage.fromMessageV3(messageV3));
        }
        if (!MinSdkChecker.isSupportSetDrawableSmallIcon()) {
            a(messageV3);
            return;
        }
        com.meizu.cloud.pushsdk.notification.model.a a3 = com.meizu.cloud.pushsdk.notification.model.a.a(messageV3);
        if (a3 != null) {
            DebugLogger.e("AbstractMessageHandler", "delete notifyId " + a3.a() + " notifyKey " + a3.b());
            if (!TextUtils.isEmpty(a3.b())) {
                com.meizu.cloud.pushsdk.platform.a.b.a(c()).a(messageV3.getUploadDataPackageName(), a3.b());
                return;
            }
            com.meizu.cloud.pushsdk.platform.a.b.a(c()).a(messageV3.getUploadDataPackageName(), a3.a());
        }
    }

    public boolean a(Intent intent) {
        DebugLogger.i("AbstractMessageHandler", "start NotificationClickMessageHandler match");
        return PushConstants.MZ_PUSH_ON_MESSAGE_ACTION.equals(intent.getAction()) && PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PRIVATE.equals(i(intent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void b(MessageV3 messageV3) {
        com.meizu.cloud.pushsdk.util.c.e(c(), messageV3.getUploadDataPackageName(), TextUtils.isEmpty(messageV3.getDeviceId()) ? d((Intent) null) : messageV3.getDeviceId(), messageV3.getTaskId(), messageV3.getSeqId(), messageV3.getPushTimestamp());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public MessageV3 c(Intent intent) {
        try {
            DebugLogger.e("AbstractMessageHandler", "parse message V3");
            MessageV3 messageV3 = (MessageV3) intent.getParcelableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
            if (messageV3 != null) {
                return messageV3;
            }
        } catch (Exception unused) {
            DebugLogger.e("AbstractMessageHandler", "cannot get messageV3");
        } catch (Throwable th) {
            DebugLogger.e("AbstractMessageHandler", "parse MessageV2 to MessageV3");
            MPushMessage mPushMessage = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
            MessageV3.parse(g(intent), d(intent), mPushMessage.getTaskId(), mPushMessage);
            throw th;
        }
        DebugLogger.e("AbstractMessageHandler", "parse MessageV2 to MessageV3");
        MPushMessage mPushMessage2 = (MPushMessage) intent.getSerializableExtra(PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
        return MessageV3.parse(g(intent), d(intent), mPushMessage2.getTaskId(), mPushMessage2);
    }
}

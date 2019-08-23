package com.vivo.push;

import android.net.Uri;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final Uri f81713a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");

    /* renamed from: b  reason: collision with root package name */
    public static final Uri f81714b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* renamed from: c  reason: collision with root package name */
    public static final Uri f81715c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f81716d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    public static String a(int i) {
        switch (i) {
            case 2002:
                return "method_alias_bind";
            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE:
                return "method_alias_unbind";
            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR:
                return "method_tag_bind";
            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}

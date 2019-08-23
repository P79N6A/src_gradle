package com.ss.android.ugc.effectmanager.common;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;

public final class b {
    public static String a(int i) {
        if (i == 1) {
            return "未知错误";
        }
        if (i == 10014) {
            return "无效的effect id";
        }
        switch (i) {
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE:
                return "参数不合法（参数缺失或者错误）";
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST:
                return "access_key不合法";
            case PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR:
                return "app_version不合法";
            case 1003:
                return "sdk_version不合法";
            case CrashModule.MODULE_ID /*1004*/:
                return "device_id不合法";
            case 1005:
                return "device_platform不合法";
            case 1006:
                return "device_type不合法";
            case 1007:
                return "channel不合法";
            case 1008:
                return "app_channel不合法";
            default:
                switch (i) {
                    case 1100:
                        return "当前应用不是测试应用";
                    case 1101:
                        return "access_key不存在";
                    default:
                        switch (i) {
                            case 2001:
                                return "内容没有发生变化";
                            case 2002:
                                return "Effect已下线";
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE:
                                return "不支持当前设备";
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_ERROR:
                                return "当前特效id不存在";
                            case PushConstants.NOTIFICATIONSERVICE_SEND_MESSAGE_BROADCAST:
                                return "不在白名单";
                            case 2006:
                                return "需要更新app";
                            default:
                                switch (i) {
                                    case 10001:
                                        return "Cancel download";
                                    case 10002:
                                        return "Download error";
                                    case 10003:
                                        return "Sticker is null";
                                    case 10004:
                                        return "Invalid effect list cache !!!";
                                    case 10005:
                                        return "SDK error";
                                    case 10006:
                                        return "No Downloaded Effects";
                                    case 10007:
                                        return "panel is null";
                                    default:
                                        switch (i) {
                                            case 10009:
                                                return "没有本地 TAG 缓存";
                                            case 10010:
                                                return "MD5 error";
                                            case 10011:
                                                return "无网络";
                                            case 10012:
                                                return "io 错误";
                                            default:
                                                return "未知错误";
                                        }
                                }
                        }
                }
        }
    }
}

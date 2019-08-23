package com.tencent.wxop.stat.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.bugly.CrashModule;

public enum a {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE),
    ADDITION(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST),
    MONITOR_STAT(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR),
    MTA_GAME_USER(1003),
    NETWORK_MONITOR(CrashModule.MODULE_ID),
    NETWORK_DETECTOR(1005);
    

    /* renamed from: a  reason: collision with root package name */
    private int f79862a;

    private a(int i) {
        this.f79862a = i;
    }

    public final int a() {
        return this.f79862a;
    }
}

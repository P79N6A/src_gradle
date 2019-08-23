package com.xiaomi.push;

import com.meizu.cloud.pushsdk.constants.PushConstants;

public enum fq {
    ACTIVITY(PushConstants.INTENT_ACTIVITY_NAME),
    SERVICE_ACTION("service_action"),
    SERVICE_COMPONENT("service_component"),
    PROVIDER("provider");
    

    /* renamed from: a  reason: collision with other field name */
    public String f401a;

    private fq(String str) {
        this.f401a = str;
    }
}

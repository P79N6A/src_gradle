package com.bytedance.ad.symphony.model.config;

import com.bytedance.ad.symphony.provider.AbsNativeAdProvider;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class d extends AdConfig {
    public d() {
        this.f7655b = 3600000;
        this.f7654a = AbsNativeAdProvider.INHOUSE_PROVIDER_ID * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }
}

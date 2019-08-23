package com.bytedance.ad.symphony.a.a;

import com.bytedance.ad.symphony.a.d;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.ad.symphony.provider.InhouseAdProvider;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

public final class g extends a<INativeAd> implements d {
    public boolean j;

    /* access modifiers changed from: protected */
    public final String a() {
        return "NativeAdManager";
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f7552c.put(Integer.valueOf(AbsNativeAdProvider.INHOUSE_PROVIDER_ID * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE), new InhouseAdProvider(this.f7555f, new com.bytedance.ad.symphony.model.config.d(), this));
    }

    public final void a(List<AdConfig> list) {
        a(list, AbsNativeAdProvider.SUPPORT_NATIVE_AD_PROVIDERS, d.class);
    }

    public g(h hVar) {
        super(hVar, "sp_native_fill_strategy", "{\"display_sort\":[9000,1000,2000],\"preload_sort\":[[9000],[1000],[2000]]}");
        this.j = hVar.f7567e;
    }
}

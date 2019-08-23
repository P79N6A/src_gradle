package com.bytedance.ad.symphony.provider;

import com.bytedance.ad.symphony.ad.a;
import com.bytedance.ad.symphony.e.b;
import com.bytedance.ad.symphony.model.config.AdConfig;

public interface b<AD extends com.bytedance.ad.symphony.ad.a> {

    public interface a {
        void a(String str);

        void a(String str, String str2, int i, String str3, double d2);
    }

    AD getNextAd(String str);

    int getProviderId();

    boolean hasValidAd(String str);

    void setAdConfig(AdConfig adConfig);

    void tryPreloadAd(String str, com.bytedance.ad.symphony.f.a aVar, b.a aVar2);
}

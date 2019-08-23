package com.bytedance.ad.symphony.a.a;

import com.bytedance.ad.symphony.a.c;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.provider.AbsInterstitialAdProvider;
import java.util.List;

public final class e extends a<Object> implements c {
    /* access modifiers changed from: protected */
    public final String a() {
        return "InterstitialAdManager";
    }

    public e(f fVar) {
        super(fVar, "sp_interstitial_fill_strategy", "{\"display_sort\":[51000,52000],\"preload_sort\":[[51000],[52000],[5000]]}");
    }

    public final void a(List<AdConfig> list) {
        a(list, AbsInterstitialAdProvider.SUPPORT_INTERSTITIAL_AD_PROVIDERS, c.class);
    }
}

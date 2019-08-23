package com.bytedance.ad.symphony.a.a;

import com.bytedance.ad.symphony.a.b;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.provider.AbsBannerAdProvider;
import java.util.List;

public final class c extends a<Object> implements b {
    /* access modifiers changed from: protected */
    public final String a() {
        return "BannerAdManager";
    }

    public c(d dVar) {
        super(dVar, "sp_banner_fill_strategy", "{\"display_sort\":[101000,102000,103000],\"preload_sort\":[[101000],[102000],[103000]]}");
    }

    public final void a(List<AdConfig> list) {
        a(list, AbsBannerAdProvider.SUPPORT_BANNER_AD_PROVIDERS, b.class);
    }
}

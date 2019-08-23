package com.bytedance.ad.symphony.provider;

import android.content.Context;
import com.bytedance.ad.symphony.a.d;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.ad.symphony.ad.nativead.c;
import com.bytedance.ad.symphony.e.b;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.model.config.a;

public class InhouseAdProvider extends AbsNativeAdProvider {
    private static c sInhouseAdPlaceholder = new c();

    /* access modifiers changed from: protected */
    public String getTag() {
        return "InhouseAdProvider";
    }

    public boolean hasValidAd(String str) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        return true;
    }

    public INativeAd getNextAd(String str) {
        return sInhouseAdPlaceholder;
    }

    public InhouseAdProvider(Context context, AdConfig adConfig, d dVar) {
        super(context, adConfig, dVar);
    }

    /* access modifiers changed from: protected */
    public void loadAdAsync(String str, a aVar, com.bytedance.ad.symphony.f.a aVar2, final b.a aVar3) {
        runOnAdThread(new Runnable() {
            public final void run() {
                if (aVar3 != null) {
                    aVar3.a("", "Fake Inhouse Failed");
                }
            }
        });
    }
}

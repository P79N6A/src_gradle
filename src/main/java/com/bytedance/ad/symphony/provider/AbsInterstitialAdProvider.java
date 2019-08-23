package com.bytedance.ad.symphony.provider;

import android.content.Context;
import android.util.SparseArray;
import com.bytedance.ad.symphony.a.c;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.provider.a;

public abstract class AbsInterstitialAdProvider extends a<Object, c> {
    public static final int ADMOB_PROVIDER_ID = getInterstitialAdProviderId(2);
    public static final int FACEBOOK_PROVIDER_ID = getInterstitialAdProviderId(1);
    public static final SparseArray<a.C0060a> SUPPORT_INTERSTITIAL_AD_PROVIDERS = new SparseArray<>();

    public static int getInterstitialAdProviderId(int i) {
        return i + 50;
    }

    static {
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(FACEBOOK_PROVIDER_ID, new a.C0060a(FACEBOOK_PROVIDER_ID, "interstitial-facebook", "com.bytedance.ad.symphony.interstitial.fb.FbInterstitialAdProvider"));
        SUPPORT_INTERSTITIAL_AD_PROVIDERS.put(ADMOB_PROVIDER_ID, new a.C0060a(ADMOB_PROVIDER_ID, "interstitial-admob", "com.bytedance.ad.symphony.interstitial.admob.AdMobInterstitialAdProvider"));
    }

    public static boolean isAdMobInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == ADMOB_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public static boolean isFbInterstitialAdProvider(int i) {
        if (getRealProviderId(i) == FACEBOOK_PROVIDER_ID) {
            return true;
        }
        return false;
    }

    public AbsInterstitialAdProvider(Context context, AdConfig adConfig, c cVar) {
        super(context, adConfig, cVar);
    }
}

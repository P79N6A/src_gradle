package com.bytedance.ad.symphony.g;

import com.bytedance.ad.symphony.ad.a;
import com.bytedance.ad.symphony.provider.AbsInterstitialAdProvider;
import com.bytedance.ad.symphony.provider.AbsNativeAdProvider;

public final class b {
    public static boolean a(a aVar) {
        if (aVar.a() == null || aVar.a() == null || !AbsNativeAdProvider.isFbNativeAdProvider(aVar.a().f7647c)) {
            return false;
        }
        return true;
    }

    public static boolean b(a aVar) {
        if (aVar.a() == null || aVar.a() == null || !AbsNativeAdProvider.isFbNativeHbProvider(aVar.a().f7647c)) {
            return false;
        }
        return true;
    }

    public static boolean c(a aVar) {
        if (aVar.a() == null || aVar.a() == null || !AbsInterstitialAdProvider.isFbInterstitialAdProvider(aVar.a().f7647c)) {
            return false;
        }
        return true;
    }
}

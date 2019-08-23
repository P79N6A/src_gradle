package com.bytedance.ad.symphony.provider;

import android.content.Context;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.ad.symphony.ad.nativead.b;
import com.bytedance.ad.symphony.b.a;
import com.bytedance.ad.symphony.b.f;
import com.bytedance.ad.symphony.d;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.common.utility.StringUtils;
import java.util.HashMap;

public abstract class AbsHBAdProvider extends AbsNativeAdProvider {
    /* access modifiers changed from: protected */
    public void sendBidRequestEvent(String str) {
        sendEvent(new a.C0059a(str));
    }

    public String getBidId(String str) {
        INativeAd iNativeAd = (INativeAd) this.mAdPool.get(str);
        if (iNativeAd instanceof b) {
            return ((b) iNativeAd).k();
        }
        return "";
    }

    public double getMaxPrice(String str) {
        INativeAd iNativeAd = (INativeAd) this.mAdPool.get(str);
        if (!(iNativeAd instanceof b) || iNativeAd.b()) {
            return 0.0d;
        }
        return ((b) iNativeAd).j();
    }

    private void sendEvent(a aVar) {
        aVar.a();
        aVar.f7580e = getProviderId();
        aVar.f7578c = getPlacementId(aVar.f7579d);
        if (f.f7593a != null && (d.b() == null || d.b().f7668a)) {
            HashMap hashMap = new HashMap();
            if (!StringUtils.isEmpty(aVar.f7576a)) {
                hashMap.put("request_status", aVar.f7576a);
            }
            if (!StringUtils.isEmpty(aVar.f7577b)) {
                hashMap.put("error_message", aVar.f7577b);
            }
            if (!StringUtils.isEmpty(aVar.f7578c)) {
                hashMap.put("ad_placement_id", aVar.f7578c);
            }
            if (!StringUtils.isEmpty(aVar.f7579d)) {
                hashMap.put("ad_placement_type_prefix", com.bytedance.ad.symphony.model.config.a.a(aVar.f7579d));
                hashMap.put("ad_placement_type", aVar.f7579d);
            }
            if (aVar.f7580e != 0) {
                hashMap.put("ad_provider_id", Integer.valueOf(aVar.f7580e));
            }
            if (!StringUtils.isEmpty(aVar.f7581f)) {
                hashMap.put("bid_id", aVar.f7581f);
            }
            f.a(aVar.a(), "sdk_ad", 0, null, hashMap, true);
        }
    }

    /* access modifiers changed from: protected */
    public void sendCreativeRequestEvent(String str, String str2) {
        a.c cVar = new a.c(str);
        cVar.f7581f = str2;
        sendEvent(cVar);
    }

    /* access modifiers changed from: protected */
    public void sendLossNoticeEvent(String str, String str2) {
        a.e eVar = new a.e(str);
        eVar.f7581f = str2;
        sendEvent(eVar);
    }

    /* access modifiers changed from: protected */
    public void sendWinNoticeEvent(String str, String str2) {
        a.f fVar = new a.f(str);
        fVar.f7581f = str2;
        sendEvent(fVar);
    }

    public AbsHBAdProvider(Context context, AdConfig adConfig, com.bytedance.ad.symphony.a.d dVar) {
        super(context, adConfig, dVar);
    }

    /* access modifiers changed from: protected */
    public void sendBidResponseEvent(String str, String str2, String str3) {
        a.b bVar = new a.b(str);
        if (str2 != null) {
            bVar.f7577b = str2;
            bVar.f7576a = "failed";
        } else {
            bVar.f7576a = "succeed";
            bVar.f7581f = str3;
        }
        sendEvent(bVar);
    }

    /* access modifiers changed from: protected */
    public void sendCreativeResponseEvent(String str, String str2, String str3) {
        a.d dVar = new a.d(str);
        if (str2 != null) {
            dVar.f7577b = str2;
            dVar.f7576a = "failed";
        } else {
            dVar.f7576a = "succeed";
        }
        dVar.f7581f = str3;
        sendEvent(dVar);
    }
}

package com.bytedance.ad.symphony.provider;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ad.symphony.a.a;
import com.bytedance.ad.symphony.ad.a;
import com.bytedance.ad.symphony.ad.nativead.INativeAd;
import com.bytedance.ad.symphony.e.b;
import com.bytedance.ad.symphony.g.f;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class a<AD extends com.bytedance.ad.symphony.ad.a, AM extends com.bytedance.ad.symphony.a.a<? extends AD>> implements b<AD> {
    protected AdConfig mAdConfig;
    protected AM mAdManager;
    protected Map<String, AD> mAdPool = new ConcurrentHashMap();
    protected Context mContext;
    protected Handler mHandler = new Handler(com.bytedance.ad.symphony.g.a.a());
    public Map<String, Runnable> mRunnableMap = new ConcurrentHashMap();

    /* renamed from: com.bytedance.ad.symphony.provider.a$a  reason: collision with other inner class name */
    public static class C0060a {

        /* renamed from: a  reason: collision with root package name */
        public int f7677a;

        /* renamed from: b  reason: collision with root package name */
        public String f7678b;

        /* renamed from: c  reason: collision with root package name */
        public String f7679c;

        public C0060a(int i, String str, String str2) {
            this.f7677a = i;
            this.f7678b = str;
            this.f7679c = str2;
        }
    }

    public static boolean isInvalidAdProvider(int i) {
        return i == -1;
    }

    /* access modifiers changed from: protected */
    public abstract String getTag();

    /* access modifiers changed from: protected */
    public abstract void loadAdAsync(String str, com.bytedance.ad.symphony.model.config.a aVar, com.bytedance.ad.symphony.f.a aVar2, b.a aVar3);

    /* access modifiers changed from: protected */
    public void onAdFill(AD ad) {
    }

    public int getProviderId() {
        if (this.mAdConfig == null) {
            return 0;
        }
        return this.mAdConfig.f7654a;
    }

    public String toString() {
        try {
            return getTag() + ":" + this.mAdPool;
        } catch (Exception unused) {
            getTag();
            return getTag() + ":error";
        }
    }

    public static int getRealProviderId(int i) {
        return i / PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
    }

    public void setAdConfig(AdConfig adConfig) {
        if (adConfig != null) {
            this.mAdConfig = adConfig;
        }
    }

    public String getPlacementId(String str) {
        com.bytedance.ad.symphony.model.config.a a2 = this.mAdConfig.a(str);
        if (a2 == null) {
            return null;
        }
        return a2.f7660a;
    }

    /* access modifiers changed from: protected */
    public boolean needPreload(String str) {
        f.a();
        if (!hasValidAd(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void cancelTimeoutCheck(String str) {
        Runnable runnable = this.mRunnableMap.get(str);
        if (runnable != null) {
            this.mHandler.removeCallbacks(runnable);
            this.mRunnableMap.remove(runnable);
        }
    }

    public AD getNextAd(String str) {
        AD ad = (com.bytedance.ad.symphony.ad.a) this.mAdPool.get(str);
        if (ad != null) {
            this.mAdPool.remove(str);
            if (!ad.b()) {
                onAdFill(ad);
                return ad;
            }
        }
        return null;
    }

    public AD getNextAdWithoutFill(String str) {
        AD ad = (com.bytedance.ad.symphony.ad.a) this.mAdPool.get(str);
        if (ad == null || ad.b()) {
            return null;
        }
        return ad;
    }

    public boolean hasValidAd(String str) {
        com.bytedance.ad.symphony.ad.a aVar = (com.bytedance.ad.symphony.ad.a) this.mAdPool.get(str);
        if (aVar == null || aVar.b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void runOnAdThread(Runnable runnable) {
        if (Looper.myLooper() == com.bytedance.ad.symphony.g.a.a()) {
            runnable.run();
        } else {
            this.mHandler.post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void printAdMap(List<INativeAd> list) {
        int i = 0;
        for (INativeAd append : list) {
            getTag();
            StringBuilder sb = new StringBuilder("list[");
            sb.append(i);
            sb.append("]:");
            sb.append(append);
            i++;
        }
    }

    /* access modifiers changed from: protected */
    public void addToPool(String str, AD ad) {
        f.a();
        if (ad != null) {
            this.mAdPool.put(str, ad);
        }
    }

    /* access modifiers changed from: protected */
    public void startTimeoutCheck(final String str, final b.a aVar) {
        AnonymousClass1 r0 = new Runnable() {
            public final void run() {
                if (aVar != null) {
                    f.a();
                    a.this.getTag();
                    String str = "";
                    com.bytedance.ad.symphony.model.config.a a2 = a.this.mAdConfig.a(str);
                    if (a2 != null) {
                        str = a2.f7660a;
                    }
                    aVar.a(str, "Request Timeout");
                    a.this.mRunnableMap.remove(str);
                }
            }
        };
        this.mRunnableMap.put(str, r0);
        long j = this.mAdConfig.f7656c;
        if (j <= 0) {
            j = 3000;
        }
        this.mHandler.postDelayed(r0, j);
    }

    public a(Context context, AdConfig adConfig, AM am) {
        this.mContext = context;
        this.mAdConfig = adConfig;
        this.mAdManager = am;
    }

    public void tryPreloadAd(String str, com.bytedance.ad.symphony.f.a aVar, b.a aVar2) {
        getTag();
        new StringBuilder("config:").append(this.mAdConfig.toString());
        if (this.mAdConfig == null) {
            getTag();
            new StringBuilder("tryPreloadAdAsync, config is not valid, type:").append(str);
            if (aVar2 != null) {
                aVar2.a(null, "Config Invalid");
            }
        } else if (!needPreload(str)) {
            getTag();
            StringBuilder sb = new StringBuilder("tryPreloadAdAsync, type-->");
            sb.append(str);
            sb.append(", needPreload false");
            if (aVar2 != null) {
                aVar2.a(str);
            }
        } else {
            com.bytedance.ad.symphony.model.config.a a2 = this.mAdConfig.a(str);
            if (a2 == null || !a2.a()) {
                getTag();
                new StringBuilder("tryPreloadAdAsync, placementId invalid, type-->").append(str);
                if (aVar2 != null) {
                    aVar2.a(null, "Placement Invalid");
                }
                return;
            }
            getTag();
            StringBuilder sb2 = new StringBuilder("loadAdAsync start,placement type:");
            sb2.append(str);
            sb2.append(",placement config:");
            sb2.append(a2.toString());
            loadAdAsync(str, a2, aVar, aVar2);
        }
    }
}

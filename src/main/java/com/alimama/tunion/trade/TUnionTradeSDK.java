package com.alimama.tunion.trade;

import android.content.Context;
import android.text.TextUtils;
import com.alimama.tunion.trade.abtest.TUnionABTestService;
import com.alimama.tunion.trade.abtest.TUnionABTestValue;
import com.alimama.tunion.trade.base.ITUnionAppLink;
import com.alimama.tunion.trade.base.ITUnionCommon;
import com.alimama.tunion.trade.base.ITUnionCookie;
import com.alimama.tunion.trade.base.ITUnionNetwork;
import com.alimama.tunion.trade.base.ITUnionNetworkMtop;
import com.alimama.tunion.trade.base.ITUnionNetworkURL;
import com.alimama.tunion.trade.base.ITUnionUT;
import com.alimama.tunion.trade.base.ITUnionWebView;
import com.alimama.tunion.trade.convert.TUnionConvertCallback;
import com.alimama.tunion.trade.convert.TUnionConvertService;
import com.alimama.tunion.trade.convert.TUnionJumpType;
import com.alimama.tunion.trade.convert.TUnionMediaParams;
import java.util.HashMap;
import java.util.Map;

public final class TUnionTradeSDK {

    /* renamed from: e  reason: collision with root package name */
    private static TUnionTradeSDK f5190e;

    /* renamed from: f  reason: collision with root package name */
    private static Context f5191f;

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, Object> f5192a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f5193b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private String f5194c;

    /* renamed from: d  reason: collision with root package name */
    private String f5195d;

    public static Context getContext() {
        return f5191f;
    }

    public final String getAdzoneId() {
        return this.f5194c;
    }

    public final String getAppkey() {
        return this.f5195d;
    }

    private ITUnionNetworkURL a() {
        return (ITUnionNetworkURL) this.f5193b.get(ITUnionNetworkURL.class);
    }

    private ITUnionNetworkMtop b() {
        return (ITUnionNetworkMtop) this.f5193b.get(ITUnionNetworkMtop.class);
    }

    public final TUnionABTestService getABTestService() {
        return (TUnionABTestService) this.f5192a.get(TUnionABTestService.class);
    }

    public final TUnionConvertService getConvertService() {
        return (TUnionConvertService) this.f5192a.get(TUnionConvertService.class);
    }

    public final ITUnionAppLink getITUnionAppLink() {
        return (ITUnionAppLink) this.f5193b.get(ITUnionAppLink.class);
    }

    public final ITUnionCommon getTUnionCommon() {
        return (ITUnionCommon) this.f5193b.get(ITUnionCommon.class);
    }

    public final ITUnionCookie getTUnionCookie() {
        return (ITUnionCookie) this.f5193b.get(ITUnionCookie.class);
    }

    public final ITUnionUT getTUnionUT() {
        return (ITUnionUT) this.f5193b.get(ITUnionUT.class);
    }

    public final ITUnionWebView getTUnionWebView() {
        return (ITUnionWebView) this.f5193b.get(ITUnionWebView.class);
    }

    public final String getUA() {
        return String.format("AliApp(TUnionTradeSDK/%s)", new Object[]{BuildConfig.VERSION_NAME});
    }

    public final boolean isABTestEnabled() {
        TUnionABTestService aBTestService = getABTestService();
        if (aBTestService != null) {
            return aBTestService.isEnabled();
        }
        return false;
    }

    public static TUnionTradeSDK getInstance() {
        if (f5190e == null) {
            synchronized (TUnionTradeSDK.class) {
                if (f5190e == null) {
                    f5190e = new TUnionTradeSDK();
                }
            }
        }
        return f5190e;
    }

    public final ITUnionNetwork getTUnionNetwork() {
        ITUnionNetworkURL a2 = a();
        ITUnionNetworkMtop b2 = b();
        if (b2 == null || !b2.getMtopEnabled()) {
            return a2;
        }
        return b2;
    }

    public final TUnionABTestValue isJumpServiceOn() {
        TUnionABTestService aBTestService = getInstance().getABTestService();
        if (aBTestService != null) {
            return aBTestService.isJumpServiceOn();
        }
        return TUnionABTestValue.INVALID;
    }

    private TUnionTradeSDK() {
        a(TUnionABTestService.class, new TUnionABTestService());
        a(TUnionConvertService.class, new TUnionConvertService());
    }

    public final void enableABTest(boolean z) {
        TUnionABTestService aBTestService = getABTestService();
        if (aBTestService != null) {
            aBTestService.enable(z);
        }
    }

    public final <T> T getService(Class<T> cls) {
        T t = this.f5192a.get(cls);
        if (t != null) {
            return t;
        }
        return null;
    }

    public static void init(Context context) {
        if (context != null) {
            f5191f = context.getApplicationContext();
            return;
        }
        throw new RuntimeException("Context不能为空");
    }

    /* access modifiers changed from: package-private */
    public final <T> void a(Class<T> cls, T t) {
        this.f5192a.put(cls, t);
    }

    public final <T> void register(Class<T> cls, T t) {
        this.f5193b.put(cls, t);
        if (t != null) {
            if (t instanceof ITUnionCommon) {
                ITUnionCommon iTUnionCommon = (ITUnionCommon) t;
                if (TextUtils.isEmpty(iTUnionCommon.getAdzoneId()) || TextUtils.isEmpty(iTUnionCommon.getAppKey())) {
                    throw new RuntimeException("adzoneId，appKey 不能为空");
                }
                this.f5194c = iTUnionCommon.getAdzoneId();
                this.f5195d = iTUnionCommon.getAppKey();
                this.f5193b.put(ITUnionCommon.class, t);
            } else if (t instanceof ITUnionNetwork) {
                if (t instanceof ITUnionNetworkMtop) {
                    this.f5193b.put(ITUnionNetworkMtop.class, t);
                } else if (t instanceof ITUnionNetworkURL) {
                    this.f5193b.put(ITUnionNetworkURL.class, t);
                }
                getABTestService().startInitialFetch();
            }
        }
    }

    public final void convertURL(TUnionJumpType tUnionJumpType, ITUnionWebView iTUnionWebView, String str, TUnionMediaParams tUnionMediaParams, TUnionConvertCallback tUnionConvertCallback) {
        TUnionConvertService convertService = getConvertService();
        if (convertService != null) {
            convertService.convert(tUnionJumpType, iTUnionWebView, str, tUnionMediaParams, tUnionConvertCallback);
        }
    }
}

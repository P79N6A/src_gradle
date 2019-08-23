package com.alimama.tunion.sdk;

import android.content.Context;
import com.alimama.tunion.sdk.a.c;
import com.alimama.tunion.sdk.a.d;
import com.alimama.tunion.sdk.jump.a;
import com.alimama.tunion.sdk.login.TUnionLoginCallback;
import com.alimama.tunion.sdk.login.b;
import com.alimama.tunion.sdk.service.ITUnionJumpService;
import com.alimama.tunion.sdk.service.ITUnionLoginService;
import com.alimama.tunion.sdk.service.ITUnionService;
import com.alimama.tunion.trade.BuildConfig;
import com.alimama.tunion.trade.TUnionTradeSDK;
import com.alimama.tunion.trade.base.ITUnionAppLink;
import com.alimama.tunion.trade.base.ITUnionCommon;
import com.alimama.tunion.trade.base.ITUnionCookie;
import com.alimama.tunion.trade.base.ITUnionNetworkURL;
import com.alimama.tunion.utils.TULog;
import java.util.HashMap;
import java.util.Map;

public class TUnionSDK {

    /* renamed from: a  reason: collision with root package name */
    private static String f5143a = "TUnionSDK";

    /* renamed from: c  reason: collision with root package name */
    private static TUnionSDK f5144c;

    /* renamed from: b  reason: collision with root package name */
    private Map<Class<?>, Object> f5145b = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private Context f5146d;

    /* renamed from: e  reason: collision with root package name */
    private TUnionTradeSDK f5147e;

    /* renamed from: f  reason: collision with root package name */
    private b f5148f = new b();

    public static TUnionSDK getInstance() {
        if (f5144c == null) {
            f5144c = new TUnionSDK();
        }
        return f5144c;
    }

    public String getUA() {
        return String.format("AliApp(TUnionSDK/%s)", new Object[]{BuildConfig.VERSION_NAME});
    }

    private TUnionSDK() {
        a(ITUnionJumpService.class, new a());
        a(ITUnionLoginService.class, this.f5148f);
    }

    public void setDebug(boolean z) {
        TULog.enable(z);
    }

    public <T extends ITUnionService> T getService(Class<T> cls) {
        T t = this.f5145b.get(cls);
        if (t != null) {
            return (ITUnionService) t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public <T> void a(Class<T> cls, T t) {
        this.f5145b.put(cls, t);
    }

    public static void init(Context context, String str, String str2) {
        synchronized (TUnionSDK.class) {
            if (context != null) {
                try {
                    TUnionSDK instance = getInstance();
                    instance.f5146d = context.getApplicationContext();
                    TUnionTradeSDK.init(context);
                    instance.f5147e = TUnionTradeSDK.getInstance();
                    instance.f5147e.register(ITUnionCommon.class, new com.alimama.tunion.sdk.a.b(context, str, str2));
                    instance.f5147e.register(ITUnionCookie.class, new c(context));
                    instance.f5147e.register(ITUnionNetworkURL.class, new d());
                    instance.f5147e.register(ITUnionAppLink.class, new com.alimama.tunion.sdk.a.a(context, str, ""));
                    if (instance.f5148f != null) {
                        instance.f5148f.a(context, new TUnionLoginCallback() {
                            public final void onSuccess() {
                                TULog.i("loginService init success", new Object[0]);
                            }

                            public final void onFailure(int i, String str) {
                                TULog.e("loginService init failure code is " + i + " , msg :" + str, new Object[0]);
                            }
                        });
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new RuntimeException("SDK init fail,context is cannot null");
            }
        }
    }
}

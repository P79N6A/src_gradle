package com.ss.android.ugc.aweme.fe.registry.rn;

import android.app.Activity;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.fe.b.e;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.framework.bridge.b;
import com.ss.android.ugc.aweme.g.a;

public class AmeRNBridgeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getName() {
        return "RNBridge";
    }

    public AmeRNBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$call$0$AmeRNBridgeModule(String str, ReadableMap readableMap, Callback callback) {
        try {
            b.a(getReactApplicationContext()).a(str, readableMap, callback);
        } catch (Exception e2) {
            workaroundForDevMode(e2, str, readableMap, callback);
            e.f44417b.a(e2);
        }
    }

    @ReactMethod
    public void call(String str, ReadableMap readableMap, Callback callback) {
        String str2 = str;
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap2, callback2}, this, changeQuickRedirect, false, 39872, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, readableMap2, callback2}, this, changeQuickRedirect, false, 39872, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            UiThreadUtil.runOnUiThread(new a(this, str2, readableMap2, callback2));
        }
    }

    private void workaroundForDevMode(Exception exc, String str, ReadableMap readableMap, Callback callback) {
        String str2 = str;
        ReadableMap readableMap2 = readableMap;
        Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{exc, str2, readableMap2, callback2}, this, changeQuickRedirect, false, 39873, new Class[]{Exception.class, String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            Object[] objArr = {exc, str2, readableMap2, callback2};
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, 39873, new Class[]{Exception.class, String.class, ReadableMap.class, Callback.class}, Void.TYPE);
            return;
        }
        if (a.a() && ReactInstance.isDev && exc.getMessage().contains("is not added")) {
            Activity f2 = AwemeAppData.p().f();
            if (f2 != null) {
                new b(getReactApplicationContext()).a(f2);
            }
            try {
                b.a(getReactApplicationContext()).a(str2, readableMap2, callback2);
            } catch (Exception unused) {
            }
        }
    }
}

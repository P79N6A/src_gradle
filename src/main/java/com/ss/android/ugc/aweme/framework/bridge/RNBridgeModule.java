package com.ss.android.ugc.aweme.framework.bridge;

import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@ReactModule(name = "aweme-bridge")
public class RNBridgeModule extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public String getName() {
        return "aweme-bridge";
    }

    public RNBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void call(String str, ReadableMap readableMap, Callback callback) {
        final String str2 = str;
        final ReadableMap readableMap2 = readableMap;
        final Callback callback2 = callback;
        if (PatchProxy.isSupport(new Object[]{str2, readableMap2, callback2}, this, changeQuickRedirect, false, 45887, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, readableMap2, callback2}, this, changeQuickRedirect, false, 45887, new Class[]{String.class, ReadableMap.class, Callback.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            UiThreadUtil.runOnUiThread(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f48468a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f48468a, false, 45888, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f48468a, false, 45888, new Class[0], Void.TYPE);
                        return;
                    }
                    b.a(RNBridgeModule.this.getReactApplicationContext()).a(str2, readableMap2, callback2);
                }
            });
        }
    }
}

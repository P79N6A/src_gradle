package com.ss.android.ugc.aweme.framework;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48483a;

    public static void a(String str, @Nullable WritableMap writableMap) {
        String str2 = str;
        WritableMap writableMap2 = writableMap;
        if (PatchProxy.isSupport(new Object[]{str2, writableMap2}, null, f48483a, true, 45832, new Class[]{String.class, WritableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, writableMap2}, null, f48483a, true, 45832, new Class[]{String.class, WritableMap.class}, Void.TYPE);
            return;
        }
        for (a reactInstanceManager : ReactInstance.getHostMap().values()) {
            WritableMap createMap = Arguments.createMap();
            createMap.merge(writableMap2);
            ReactContext currentReactContext = reactInstanceManager.getReactInstanceManager().getCurrentReactContext();
            if (currentReactContext != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) currentReactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str2, createMap);
            }
        }
    }

    public static void a(ReactContext reactContext, String str, @Nullable WritableMap writableMap) {
        ReactContext reactContext2 = reactContext;
        String str2 = str;
        WritableMap writableMap2 = writableMap;
        if (PatchProxy.isSupport(new Object[]{reactContext2, str2, writableMap2}, null, f48483a, true, 45833, new Class[]{ReactContext.class, String.class, WritableMap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactContext2, str2, writableMap2}, null, f48483a, true, 45833, new Class[]{ReactContext.class, String.class, WritableMap.class}, Void.TYPE);
            return;
        }
        if (reactContext2 != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext2.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str2, writableMap2);
        }
    }
}

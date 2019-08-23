package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.DisplayMetricsHolder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "DeviceInfo")
public class DeviceInfoModule extends BaseJavaModule implements LifecycleEventListener {
    private float mFontScale;
    @Nullable
    private ReactApplicationContext mReactApplicationContext;

    public String getName() {
        return "DeviceInfo";
    }

    public void onHostDestroy() {
    }

    public void onHostPause() {
    }

    public void emitUpdateDimensionsEvent() {
        if (this.mReactApplicationContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", DisplayMetricsHolder.getDisplayMetricsMap((double) this.mFontScale));
        }
    }

    @Nullable
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("Dimensions", DisplayMetricsHolder.getDisplayMetricsMap((double) this.mFontScale));
        return hashMap;
    }

    public void onHostResume() {
        if (this.mReactApplicationContext != null) {
            float f2 = this.mReactApplicationContext.getResources().getConfiguration().fontScale;
            if (this.mFontScale != f2) {
                this.mFontScale = f2;
                emitUpdateDimensionsEvent();
            }
        }
    }

    public DeviceInfoModule(ReactApplicationContext reactApplicationContext) {
        this((Context) reactApplicationContext);
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactApplicationContext.addLifecycleEventListener(this);
    }

    public DeviceInfoModule(Context context) {
        DisplayMetricsHolder.initDisplayMetricsIfNotInitialized(context);
        this.mFontScale = context.getResources().getConfiguration().fontScale;
    }
}

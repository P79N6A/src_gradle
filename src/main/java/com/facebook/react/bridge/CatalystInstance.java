package com.facebook.react.bridge;

import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.annotations.VisibleForTesting;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

@DoNotStrip
public interface CatalystInstance extends JSInstance, MemoryPressureListener {
    void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void addJSIModules(List<JSIModuleHolder> list);

    @DoNotStrip
    void callFunction(String str, String str2, NativeArray nativeArray);

    void destroy();

    void extendNativeModules(NativeModuleRegistry nativeModuleRegistry);

    JSBundleLoader getJSBundleLoader();

    <T extends JSIModule> T getJSIModule(Class<T> cls);

    <T extends JavaScriptModule> T getJSModule(Class<T> cls);

    JavaScriptContextHolder getJavaScriptContextHolder();

    String getMainJsBundlePath();

    <T extends NativeModule> T getNativeModule(Class<T> cls);

    Collection<NativeModule> getNativeModules();

    ReactQueueConfiguration getReactQueueConfiguration();

    @Nullable
    String getSourceURL();

    <T extends NativeModule> boolean hasNativeModule(Class<T> cls);

    boolean hasRunJSBundle();

    @VisibleForTesting
    void initialize();

    @DoNotStrip
    void invokeCallback(int i, NativeArray nativeArray);

    @DoNotStrip
    void invokeCallbackDirect(long j, NativeArray nativeArray);

    boolean isDestroyed();

    boolean isFirstDrawn();

    void loadJavaScript(String str, String str2, boolean z);

    void onPageFinished();

    void registerSegment(int i, String str);

    void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener);

    void runJSBundle();

    void setFirstDraw(long j);

    void setFirstScreenPaintFinished(long j);

    @VisibleForTesting
    void setGlobalVariable(String str, String str2);

    void setPageFinishListener(PageFinishedListener pageFinishedListener);

    void setRootView(WeakReference<ReactRootView> weakReference);

    void setStartLoad(long j);

    void startFirstDraw();

    void updateLayout();
}

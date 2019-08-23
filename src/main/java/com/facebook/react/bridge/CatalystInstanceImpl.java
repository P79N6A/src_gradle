package com.facebook.react.bridge;

import android.content.res.AssetManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.common.logging.FLog;
import com.facebook.e.b;
import com.facebook.infer.annotation.a;
import com.facebook.jni.HybridData;
import com.facebook.proguard.annotations.DoNotStrip;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.RNJavaScriptRuntime;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.bridge.queue.ReactQueueConfigurationImpl;
import com.facebook.react.bridge.queue.ReactQueueConfigurationSpec;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.util.RNVersionUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.dexposed.ClassUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nullable;
import org.json.JSONObject;

@DoNotStrip
public class CatalystInstanceImpl implements CatalystInstance {
    private static final AtomicInteger sNextInstanceIdForTrace = new AtomicInteger(1);
    private volatile boolean mAcceptCalls;
    public final CopyOnWriteArrayList<NotThreadSafeBridgeIdleDebugListener> mBridgeIdleListeners;
    private volatile boolean mDestroyed;
    private long mFirstDrawTime;
    private boolean mFirstDrawn;
    private long mFirstScreenTime;
    public final HybridData mHybridData;
    private boolean mInitialized;
    private boolean mJSBundleHasLoaded;
    private final JSBundleLoader mJSBundleLoader;
    private final ArrayList<PendingJSCall> mJSCallsPendingInit;
    private final Object mJSCallsPendingInitLock;
    private final JSIModuleRegistry mJSIModuleRegistry;
    private final JavaScriptModuleRegistry mJSModuleRegistry;
    public JavaScriptContextHolder mJavaScriptContextHolder;
    private final String mJsPendingCallsTitleForTrace;
    private String mMainJsBudlePath;
    private final NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    public final NativeModuleRegistry mNativeModuleRegistry;
    private final MessageQueueThread mNativeModulesQueueThread;
    public volatile long mPageFinishedTime;
    private long mPageStartTime;
    public final AtomicInteger mPendingJSCalls;
    private PageFinishedListener mPerfListener;
    public long mPreviousPageTime;
    private final ReactQueueConfigurationImpl mReactQueueConfiguration;
    private long mReadyRuntime;
    private WeakReference<ReactRootView> mRootViewWeakReference;
    @Nullable
    private String mSourceURL;
    private long mStartLoadTime;
    private final b mTraceListener;
    public boolean mUpdateLayoutStarted;

    static class BridgeCallback implements ReactCallback {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public void decrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.decrementPendingJSCalls();
            }
        }

        public void incrementPendingJSCalls() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.incrementPendingJSCalls();
            }
        }

        public void onBatchComplete() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                catalystInstanceImpl.mNativeModuleRegistry.onBatchComplete();
            }
        }

        BridgeCallback(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }
    }

    public static class Builder {
        @Nullable
        private JSBundleLoader mJSBundleLoader;
        @Nullable
        private JavaScriptExecutor mJSExecutor;
        @Nullable
        private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
        @Nullable
        private ReactQueueConfigurationSpec mReactQueueConfigurationSpec;
        @Nullable
        private NativeModuleRegistry mRegistry;

        public CatalystInstanceImpl build() {
            CatalystInstanceImpl catalystInstanceImpl = new CatalystInstanceImpl((ReactQueueConfigurationSpec) a.b(this.mReactQueueConfigurationSpec), (JavaScriptExecutor) a.b(this.mJSExecutor), (NativeModuleRegistry) a.b(this.mRegistry), this.mJSBundleLoader, (NativeModuleCallExceptionHandler) a.b(this.mNativeModuleCallExceptionHandler));
            return catalystInstanceImpl;
        }

        public Builder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
            this.mJSBundleLoader = jSBundleLoader;
            return this;
        }

        public Builder setJSExecutor(JavaScriptExecutor javaScriptExecutor) {
            this.mJSExecutor = javaScriptExecutor;
            return this;
        }

        public Builder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
            this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
            return this;
        }

        public Builder setReactQueueConfigurationSpec(ReactQueueConfigurationSpec reactQueueConfigurationSpec) {
            this.mReactQueueConfigurationSpec = reactQueueConfigurationSpec;
            return this;
        }

        public Builder setRegistry(NativeModuleRegistry nativeModuleRegistry) {
            this.mRegistry = nativeModuleRegistry;
            return this;
        }
    }

    static class JSProfilerTraceListener implements b {
        private final WeakReference<CatalystInstanceImpl> mOuter;

        public void onTraceStarted() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(true);
            }
        }

        public void onTraceStopped() {
            CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) this.mOuter.get();
            if (catalystInstanceImpl != null) {
                ((Systrace) catalystInstanceImpl.getJSModule(Systrace.class)).setEnabled(false);
            }
        }

        public JSProfilerTraceListener(CatalystInstanceImpl catalystInstanceImpl) {
            this.mOuter = new WeakReference<>(catalystInstanceImpl);
        }
    }

    class NativeExceptionHandler implements QueueThreadExceptionHandler {
        private NativeExceptionHandler() {
        }

        public void handleException(Exception exc) {
            CatalystInstanceImpl.this.onNativeException(exc);
        }
    }

    public static class PendingJSCall {
        @Nullable
        public NativeArray mArguments;
        public String mMethod;
        public String mModule;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mModule);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(this.mMethod);
            sb.append("(");
            if (this.mArguments == null) {
                str = "";
            } else {
                str = this.mArguments.toString();
            }
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        public void call(CatalystInstanceImpl catalystInstanceImpl) {
            NativeArray nativeArray;
            if (this.mArguments != null) {
                nativeArray = this.mArguments;
            } else {
                nativeArray = new WritableNativeArray();
            }
            catalystInstanceImpl.jniCallJSFunction(this.mModule, this.mMethod, nativeArray);
        }

        public PendingJSCall(String str, String str2, @Nullable NativeArray nativeArray) {
            this.mModule = str;
            this.mMethod = str2;
            this.mArguments = nativeArray;
        }
    }

    private native long getJavaScriptContext();

    private static native HybridData initHybrid();

    private native void initializeBridgeCommonJsf(ReactCallback reactCallback, JavaScriptExecutor javaScriptExecutor, MessageQueueThread messageQueueThread, MessageQueueThread messageQueueThread2, Thread thread, Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2, Collection<String> collection3, int i, AssetManager assetManager, String str, String str2, String str3);

    private native void jniCallJSCallback(int i, NativeArray nativeArray);

    private native void jniCallJSCallbackDirect(long j, NativeArray nativeArray);

    private native void jniExtendNativeModules(Collection<JavaModuleWrapper> collection, Collection<ModuleHolder> collection2);

    private native void jniHandleMemoryPressure(int i);

    private native void jniLoadScript(String str, String str2, boolean z);

    private native void jniLoadScriptFromAssets(AssetManager assetManager, String str, boolean z);

    private native void jniLoadScriptFromFile(String str, String str2, boolean z);

    private native void jniRegisterSegment(int i, String str);

    private native void jniSetSourceURL(String str);

    public native void jniCallJSFunction(String str, String str2, NativeArray nativeArray);

    public native void setGlobalVariable(String str, String str2);

    public void startFirstDraw() {
        this.mFirstDrawn = false;
    }

    public JSBundleLoader getJSBundleLoader() {
        return this.mJSBundleLoader;
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mJavaScriptContextHolder;
    }

    public String getMainJsBundlePath() {
        return this.mMainJsBudlePath;
    }

    public ReactQueueConfiguration getReactQueueConfiguration() {
        return this.mReactQueueConfiguration;
    }

    @Nullable
    public String getSourceURL() {
        return this.mSourceURL;
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public boolean isFirstDrawn() {
        return this.mFirstDrawn;
    }

    public Collection<NativeModule> getNativeModules() {
        return this.mNativeModuleRegistry.getAllModules();
    }

    static {
        try {
            ReactBridge.staticInit(null);
        } catch (Throwable unused) {
        }
    }

    public void onPageFinished() {
        if (this.mFirstScreenTime == 0) {
            this.mFirstScreenTime = this.mPageFinishedTime;
        }
        uploadPageFinishPerf();
    }

    public void updateLayout() {
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            public void run() {
                CatalystInstanceImpl.this.mPageFinishedTime = System.currentTimeMillis();
                if (!CatalystInstanceImpl.this.mUpdateLayoutStarted) {
                    final Handler handler = new Handler();
                    CatalystInstanceImpl.this.mUpdateLayoutStarted = true;
                    handler.postDelayed(new Runnable() {
                        public void run() {
                            if (CatalystInstanceImpl.this.mPageFinishedTime == CatalystInstanceImpl.this.mPreviousPageTime) {
                                CatalystInstanceImpl.this.onPageFinished();
                                handler.removeCallbacks(this);
                                return;
                            }
                            CatalystInstanceImpl.this.mPreviousPageTime = CatalystInstanceImpl.this.mPageFinishedTime;
                            handler.postDelayed(this, 500);
                        }
                    }, 500);
                }
            }
        });
    }

    public void decrementPendingJSCalls() {
        boolean z;
        if (this.mPendingJSCalls.decrementAndGet() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    Iterator<NotThreadSafeBridgeIdleDebugListener> it2 = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionToBridgeIdle();
                    }
                }
            });
        }
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        if (!this.mDestroyed) {
            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_START);
            this.mDestroyed = true;
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceDestroy();
                    boolean z = false;
                    if (CatalystInstanceImpl.this.mPendingJSCalls.getAndSet(0) == 0) {
                        z = true;
                    }
                    if (!z && !CatalystInstanceImpl.this.mBridgeIdleListeners.isEmpty()) {
                        Iterator<NotThreadSafeBridgeIdleDebugListener> it2 = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                        while (it2.hasNext()) {
                            it2.next().onTransitionToBridgeIdle();
                        }
                    }
                    new Thread() {
                        public void run() {
                            CatalystInstanceImpl.this.mJavaScriptContextHolder.clear();
                            CatalystInstanceImpl.this.mHybridData.resetNative();
                            CatalystInstanceImpl.this.getReactQueueConfiguration().destroy();
                            ReactMarker.logMarker(ReactMarkerConstants.DESTROY_CATALYST_INSTANCE_END);
                        }
                    }.start();
                }
            });
        }
    }

    public boolean hasRunJSBundle() {
        boolean z;
        synchronized (this.mJSCallsPendingInitLock) {
            if (!this.mJSBundleHasLoaded || !this.mAcceptCalls) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }

    public void incrementPendingJSCalls() {
        boolean z;
        if (this.mPendingJSCalls.getAndIncrement() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !this.mBridgeIdleListeners.isEmpty()) {
            this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
                public void run() {
                    Iterator<NotThreadSafeBridgeIdleDebugListener> it2 = CatalystInstanceImpl.this.mBridgeIdleListeners.iterator();
                    while (it2.hasNext()) {
                        it2.next().onTransitionToBridgeBusy();
                    }
                }
            });
        }
    }

    @VisibleForTesting
    public void initialize() {
        a.a(!this.mInitialized, "This catalyst instance has already been initialized");
        a.a(this.mAcceptCalls, "RunJSBundle hasn't completed.");
        this.mInitialized = true;
        this.mNativeModulesQueueThread.runOnQueue(new Runnable() {
            public void run() {
                CatalystInstanceImpl.this.mNativeModuleRegistry.notifyJSInstanceInitialized();
            }
        });
    }

    public void runJSBundle() {
        a.a(!this.mJSBundleHasLoaded, "JS bundle was already loaded!");
        if (this.mJSBundleLoader != null) {
            this.mJSBundleLoader.loadScript(this);
        }
        synchronized (this.mJSCallsPendingInitLock) {
            this.mAcceptCalls = true;
            Iterator<PendingJSCall> it2 = this.mJSCallsPendingInit.iterator();
            while (it2.hasNext()) {
                it2.next().call(this);
            }
            this.mJSCallsPendingInit.clear();
            this.mJSBundleHasLoaded = true;
        }
    }

    public void uploadPageFinishPerf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Version", RNVersionUtils.getVersion());
            jSONObject.put(PushConstants.WEB_URL, this.mSourceURL);
            jSONObject.put("StartLoadTime", this.mStartLoadTime);
            jSONObject.put("PageStartTime", this.mPageStartTime);
            jSONObject.put("FirstDrawTime", this.mFirstDrawTime);
            jSONObject.put("FirstScreenTime", this.mFirstScreenTime);
            jSONObject.put("PageFinishedTime", this.mPageFinishedTime);
            jSONObject.put("PageFirstDraw", (this.mFirstDrawTime - this.mPageStartTime));
            jSONObject.put("PageFirstScreen", (this.mFirstScreenTime - this.mPageStartTime));
            jSONObject.put("PageFinish", (this.mPageFinishedTime - this.mPageStartTime));
        } catch (Exception unused) {
        }
        ReactBridge.uploadPageFinishPerf(jSONObject);
        if (this.mPerfListener != null) {
            this.mPerfListener.upLoad(jSONObject);
        }
    }

    public void setFirstDraw(long j) {
        this.mFirstDrawTime = j;
    }

    public void setFirstScreenPaintFinished(long j) {
        this.mFirstScreenTime = j;
    }

    public void setMainJsBundlePath(String str) {
        this.mMainJsBudlePath = str;
    }

    public void setRootView(WeakReference<ReactRootView> weakReference) {
        this.mRootViewWeakReference = weakReference;
    }

    public void setStartLoad(long j) {
        this.mStartLoadTime = j;
    }

    public void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.add(notThreadSafeBridgeIdleDebugListener);
    }

    public void addJSIModules(List<JSIModuleHolder> list) {
        this.mJSIModuleRegistry.registerModules(list);
    }

    public <T extends JSIModule> T getJSIModule(Class<T> cls) {
        return this.mJSIModuleRegistry.getModule(cls);
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        return this.mJSModuleRegistry.getJavaScriptModule(this, cls);
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.getModule(cls);
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        return this.mNativeModuleRegistry.hasModule(cls);
    }

    public void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleListeners.remove(notThreadSafeBridgeIdleDebugListener);
    }

    public void setPageFinishListener(PageFinishedListener pageFinishedListener) {
        if (pageFinishedListener != null) {
            this.mPerfListener = pageFinishedListener;
        }
    }

    public void handleMemoryPressure(int i) {
        if (!this.mDestroyed) {
            jniHandleMemoryPressure(i);
        }
    }

    public void extendNativeModules(NativeModuleRegistry nativeModuleRegistry) {
        this.mNativeModuleRegistry.registerModules(nativeModuleRegistry);
        jniExtendNativeModules(nativeModuleRegistry.getJavaModules(this), nativeModuleRegistry.getCxxModules());
    }

    public void onNativeException(Exception exc) {
        this.mNativeModuleCallExceptionHandler.handleException(exc);
        this.mReactQueueConfiguration.getUIQueueThread().runOnQueue(new Runnable() {
            public void run() {
                CatalystInstanceImpl.this.destroy();
            }
        });
    }

    public void setMainJsBundlePathFromFile(String str) {
        if (str != null) {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf > 0) {
                setMainJsBundlePath(str.substring(0, lastIndexOf + 1));
            }
        }
    }

    public void callFunction(PendingJSCall pendingJSCall) {
        if (this.mDestroyed) {
            String pendingJSCall2 = pendingJSCall.toString();
            FLog.w("ReactNative", "Calling JS function after bridge has been destroyed: " + pendingJSCall2);
            return;
        }
        if (!this.mAcceptCalls) {
            synchronized (this.mJSCallsPendingInitLock) {
                if (!this.mAcceptCalls) {
                    this.mJSCallsPendingInit.add(pendingJSCall);
                    return;
                }
            }
        }
        pendingJSCall.call(this);
    }

    public void registerSegment(int i, String str) {
        jniRegisterSegment(i, str);
    }

    public void invokeCallbackDirect(long j, NativeArray nativeArray) {
        try {
            jniCallJSCallbackDirect(j, nativeArray);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void setSourceURLs(String str, String str2) {
        this.mSourceURL = str;
        jniSetSourceURL(str2);
    }

    private RNJavaScriptRuntime.SplitCommonType useCommonSplit(JavaScriptExecutor javaScriptExecutor, JSBundleLoader jSBundleLoader) {
        if (jSBundleLoader != null) {
            return jSBundleLoader.mUseCommonSplit;
        }
        if (javaScriptExecutor != null) {
            return javaScriptExecutor.getCommonSplit();
        }
        return RNJavaScriptRuntime.SplitCommonType.NONE;
    }

    public void invokeCallback(int i, NativeArray nativeArray) {
        if (this.mDestroyed) {
            FLog.w("ReactNative", "Invoking JS callback after bridge has been destroyed.");
            return;
        }
        try {
            jniCallJSCallback(i, nativeArray);
        } catch (Exception unused) {
        }
    }

    public void loadJavaScript(String str, String str2, boolean z) {
        jniLoadScript(str, str2, z);
    }

    public void loadScriptFromAssets(AssetManager assetManager, String str, boolean z) {
        this.mSourceURL = str;
        jniLoadScriptFromAssets(assetManager, str, z);
    }

    public void loadScriptFromFile(String str, String str2, boolean z) {
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    public void callFunction(String str, String str2, NativeArray nativeArray) {
        callFunction(new PendingJSCall(str, str2, nativeArray));
    }

    public void loadScriptFromFile(String str, String str2, boolean z, boolean z2) {
        if (z2) {
            setMainJsBundlePathFromFile(str);
        }
        this.mSourceURL = str2;
        jniLoadScriptFromFile(str, str2, z);
    }

    private CatalystInstanceImpl(ReactQueueConfigurationSpec reactQueueConfigurationSpec, JavaScriptExecutor javaScriptExecutor, NativeModuleRegistry nativeModuleRegistry, JSBundleLoader jSBundleLoader, NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        int i;
        JSBundleLoader jSBundleLoader2 = jSBundleLoader;
        this.mPendingJSCalls = new AtomicInteger(0);
        this.mJsPendingCallsTitleForTrace = "pending_js_calls_instance" + sNextInstanceIdForTrace.getAndIncrement();
        this.mDestroyed = false;
        this.mJSCallsPendingInit = new ArrayList<>();
        this.mJSCallsPendingInitLock = new Object();
        this.mJSIModuleRegistry = new JSIModuleRegistry();
        this.mInitialized = false;
        this.mAcceptCalls = false;
        this.mFirstDrawn = true;
        this.mUpdateLayoutStarted = false;
        this.mPageStartTime = 0;
        this.mPageFinishedTime = 0;
        this.mPreviousPageTime = 0;
        this.mFirstScreenTime = 0;
        this.mFirstDrawTime = 0;
        this.mStartLoadTime = 0;
        this.mPageStartTime = System.currentTimeMillis();
        this.mHybridData = initHybrid();
        this.mReactQueueConfiguration = ReactQueueConfigurationImpl.create(reactQueueConfigurationSpec, new NativeExceptionHandler());
        this.mBridgeIdleListeners = new CopyOnWriteArrayList<>();
        this.mNativeModuleRegistry = nativeModuleRegistry;
        this.mJSModuleRegistry = new JavaScriptModuleRegistry();
        this.mJSBundleLoader = jSBundleLoader2;
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        this.mNativeModulesQueueThread = this.mReactQueueConfiguration.getNativeModulesQueueThread();
        this.mTraceListener = new JSProfilerTraceListener(this);
        RNJavaScriptRuntime.SplitCommonType useCommonSplit = useCommonSplit(javaScriptExecutor, jSBundleLoader2);
        if (useCommonSplit == null) {
            i = 0;
        } else {
            i = useCommonSplit.ordinal();
        }
        initializeBridgeCommonJsf(new BridgeCallback(this), javaScriptExecutor, this.mReactQueueConfiguration.getJSQueueThread(), this.mNativeModulesQueueThread, (HandlerThread) ((MessageQueueThreadImpl) this.mReactQueueConfiguration.getLayoutThread()).getLooper().getThread(), this.mNativeModuleRegistry.getJavaModules(this), this.mNativeModuleRegistry.getCxxModules(), this.mNativeModuleRegistry.getCoreModules(), i, RNJavaScriptRuntime.getAssetManager(), RNJavaScriptRuntime.getCommonURL(), RNJavaScriptRuntime.getBaseJsURL(), RNJavaScriptRuntime.getSnapshotURL());
        this.mJavaScriptContextHolder = new JavaScriptContextHolder(getJavaScriptContext());
    }
}

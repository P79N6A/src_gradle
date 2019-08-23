package com.facebook.react;

import android.app.Activity;
import android.app.Application;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSCJavaScriptExecutorFactory;
import com.facebook.react.bridge.JSIModulesProvider;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.bridge.RNDegradeExceptionHandler;
import com.facebook.react.bridge.RNJavaScriptRuntime;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.uimanager.UIImplementationProvider;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

public class ReactInstanceManagerBuilder {
    @Nullable
    private Application mApplication;
    @Nullable
    private NotThreadSafeBridgeIdleDebugListener mBridgeIdleDebugListener;
    @Nullable
    private Activity mCurrentActivity;
    @Nullable
    private DefaultHardwareBackBtnHandler mDefaultHardwareBackBtnHandler;
    private RNDegradeExceptionHandler mDegradeExceptionHandler;
    private boolean mDelayViewManagerClassLoadsEnabled;
    @Nullable
    private DevBundleDownloadListener mDevBundleDownloadListener;
    @Nullable
    private LifecycleState mInitialLifecycleState;
    @Nullable
    private String mJSBundleAssetUrl;
    @Nullable
    private JSBundleLoader mJSBundleLoader;
    @Nullable
    private JSIModulesProvider mJSIModulesProvider;
    @Nullable
    private String mJSMainModulePath;
    @Nullable
    private JavaScriptExecutorFactory mJavaScriptExecutorFactory;
    private boolean mLazyNativeModulesEnabled;
    private boolean mLazyViewManagersEnabled;
    private int mMinNumShakes = 1;
    private int mMinTimeLeftInFrameForNonBatchedOperationMs = -1;
    @Nullable
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private final List<ReactPackage> mPackages = new ArrayList();
    @Nullable
    private RedBoxHandler mRedBoxHandler;
    private RNJavaScriptRuntime.SplitCommonType mSplitCommonType;
    @Nullable
    private UIImplementationProvider mUIImplementationProvider;
    private boolean mUseDeveloperSupport;

    ReactInstanceManagerBuilder() {
    }

    public ReactInstanceManager build() {
        boolean z;
        JSCJavaScriptExecutorFactory jSCJavaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader;
        a.a(this.mApplication, "Application property has not been set with this builder");
        boolean z2 = true;
        if (!this.mUseDeveloperSupport && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) {
            z = false;
        } else {
            z = true;
        }
        a.a(z, "JS Bundle File or Asset URL has to be provided when dev support is disabled");
        if (this.mJSMainModulePath == null && this.mJSBundleAssetUrl == null && this.mJSBundleLoader == null) {
            z2 = false;
        }
        a.a(z2, "Either MainModulePath or JS Bundle File needs to be provided");
        if (this.mUIImplementationProvider == null) {
            this.mUIImplementationProvider = new UIImplementationProvider();
        }
        String packageName = this.mApplication.getPackageName();
        String friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        Application application = this.mApplication;
        Activity activity = this.mCurrentActivity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultHardwareBackBtnHandler;
        if (this.mJavaScriptExecutorFactory == null) {
            jSCJavaScriptExecutorFactory = new JSCJavaScriptExecutorFactory(packageName, friendlyDeviceName, this.mSplitCommonType);
        } else {
            jSCJavaScriptExecutorFactory = this.mJavaScriptExecutorFactory;
        }
        if (this.mJSBundleLoader != null || this.mJSBundleAssetUrl == null) {
            jSBundleLoader = this.mJSBundleLoader;
        } else {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.mApplication, this.mJSBundleAssetUrl, false, this.mSplitCommonType);
        }
        ReactInstanceManager reactInstanceManager = new ReactInstanceManager(application, activity, defaultHardwareBackBtnHandler, jSCJavaScriptExecutorFactory, jSBundleLoader, this.mJSMainModulePath, this.mPackages, this.mUseDeveloperSupport, this.mBridgeIdleDebugListener, (LifecycleState) a.a(this.mInitialLifecycleState, "Initial lifecycle state was not set"), this.mUIImplementationProvider, this.mNativeModuleCallExceptionHandler, this.mRedBoxHandler, this.mLazyNativeModulesEnabled, this.mLazyViewManagersEnabled, this.mDelayViewManagerClassLoadsEnabled, this.mDevBundleDownloadListener, this.mMinNumShakes, this.mMinTimeLeftInFrameForNonBatchedOperationMs, this.mJSIModulesProvider, this.mDegradeExceptionHandler);
        return reactInstanceManager;
    }

    public ReactInstanceManager prebuild() {
        JSCJavaScriptExecutorFactory jSCJavaScriptExecutorFactory;
        JSBundleLoader jSBundleLoader;
        a.a(this.mApplication, "Application property has not been set with this builder");
        if (this.mUIImplementationProvider == null) {
            this.mUIImplementationProvider = new UIImplementationProvider();
        }
        String packageName = this.mApplication.getPackageName();
        String friendlyDeviceName = AndroidInfoHelpers.getFriendlyDeviceName();
        Application application = this.mApplication;
        Activity activity = this.mCurrentActivity;
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler = this.mDefaultHardwareBackBtnHandler;
        if (this.mJavaScriptExecutorFactory == null) {
            jSCJavaScriptExecutorFactory = new JSCJavaScriptExecutorFactory(packageName, friendlyDeviceName, this.mSplitCommonType);
        } else {
            jSCJavaScriptExecutorFactory = this.mJavaScriptExecutorFactory;
        }
        if (this.mJSBundleLoader != null || this.mJSBundleAssetUrl == null) {
            jSBundleLoader = this.mJSBundleLoader;
        } else {
            jSBundleLoader = JSBundleLoader.createAssetLoader(this.mApplication, this.mJSBundleAssetUrl, false, this.mSplitCommonType);
        }
        ReactInstanceManager reactInstanceManager = new ReactInstanceManager(application, activity, defaultHardwareBackBtnHandler, jSCJavaScriptExecutorFactory, jSBundleLoader, this.mJSMainModulePath, this.mPackages, this.mUseDeveloperSupport, this.mBridgeIdleDebugListener, (LifecycleState) a.a(this.mInitialLifecycleState, "Initial lifecycle state was not set"), this.mUIImplementationProvider, this.mNativeModuleCallExceptionHandler, this.mRedBoxHandler, this.mLazyNativeModulesEnabled, this.mLazyViewManagersEnabled, this.mDelayViewManagerClassLoadsEnabled, this.mDevBundleDownloadListener, this.mMinNumShakes, this.mMinTimeLeftInFrameForNonBatchedOperationMs, this.mJSIModulesProvider, this.mDegradeExceptionHandler);
        return reactInstanceManager;
    }

    public ReactInstanceManagerBuilder setBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener) {
        this.mBridgeIdleDebugListener = notThreadSafeBridgeIdleDebugListener;
        return this;
    }

    public ReactInstanceManagerBuilder setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
        return this;
    }

    public ReactInstanceManagerBuilder setDefaultHardwareBackBtnHandler(DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        this.mDefaultHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setDegradeExceptionHandler(@Nullable RNDegradeExceptionHandler rNDegradeExceptionHandler) {
        this.mDegradeExceptionHandler = rNDegradeExceptionHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setDelayViewManagerClassLoadsEnabled(boolean z) {
        this.mDelayViewManagerClassLoadsEnabled = z;
        return this;
    }

    public ReactInstanceManagerBuilder setDevBundleDownloadListener(@Nullable DevBundleDownloadListener devBundleDownloadListener) {
        this.mDevBundleDownloadListener = devBundleDownloadListener;
        return this;
    }

    public ReactInstanceManagerBuilder setInitialLifecycleState(LifecycleState lifecycleState) {
        this.mInitialLifecycleState = lifecycleState;
        return this;
    }

    public ReactInstanceManagerBuilder setJSIModulesProvider(@Nullable JSIModulesProvider jSIModulesProvider) {
        this.mJSIModulesProvider = jSIModulesProvider;
        return this;
    }

    public ReactInstanceManagerBuilder setJSMainModulePath(String str) {
        this.mJSMainModulePath = str;
        return this;
    }

    public ReactInstanceManagerBuilder setJavaScriptExecutorFactory(@Nullable JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.mJavaScriptExecutorFactory = javaScriptExecutorFactory;
        return this;
    }

    public ReactInstanceManagerBuilder setLazyNativeModulesEnabled(boolean z) {
        this.mLazyNativeModulesEnabled = z;
        return this;
    }

    public ReactInstanceManagerBuilder setLazyViewManagersEnabled(boolean z) {
        this.mLazyViewManagersEnabled = z;
        return this;
    }

    public ReactInstanceManagerBuilder setMinNumShakes(int i) {
        this.mMinNumShakes = i;
        return this;
    }

    public ReactInstanceManagerBuilder setMinTimeLeftInFrameForNonBatchedOperationMs(int i) {
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
        return this;
    }

    public ReactInstanceManagerBuilder setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setRedBoxHandler(@Nullable RedBoxHandler redBoxHandler) {
        this.mRedBoxHandler = redBoxHandler;
        return this;
    }

    public ReactInstanceManagerBuilder setSplitCommonType(RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        this.mSplitCommonType = splitCommonType;
        return this;
    }

    public ReactInstanceManagerBuilder setUIImplementationProvider(@Nullable UIImplementationProvider uIImplementationProvider) {
        this.mUIImplementationProvider = uIImplementationProvider;
        return this;
    }

    public ReactInstanceManagerBuilder setUseDeveloperSupport(boolean z) {
        this.mUseDeveloperSupport = z;
        return this;
    }

    public ReactInstanceManagerBuilder addPackage(ReactPackage reactPackage) {
        this.mPackages.add(reactPackage);
        return this;
    }

    public ReactInstanceManagerBuilder addPackages(List<ReactPackage> list) {
        this.mPackages.addAll(list);
        return this;
    }

    public ReactInstanceManagerBuilder setApplication(Application application) {
        this.mApplication = application;
        RNJavaScriptRuntime.setApplication(application);
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleLoader(JSBundleLoader jSBundleLoader) {
        this.mJSBundleLoader = jSBundleLoader;
        this.mJSBundleAssetUrl = null;
        return this;
    }

    public ReactInstanceManagerBuilder setBundleAssetName(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.mJSBundleAssetUrl = str2;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleFile(String str) {
        if (!str.startsWith("assets://")) {
            return setJSBundleLoader(JSBundleLoader.createFileLoader(str));
        }
        this.mJSBundleAssetUrl = str;
        this.mJSBundleLoader = null;
        return this;
    }

    public ReactInstanceManagerBuilder setSplitCommonBundleFile(String str, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        if (splitCommonType == RNJavaScriptRuntime.SplitCommonType.SPLIT_COMMONJS) {
            RNJavaScriptRuntime.setCommonJsBundle(str);
        } else if (splitCommonType == RNJavaScriptRuntime.SplitCommonType.SPLIT_SNAPSHOT) {
            RNJavaScriptRuntime.setSnapSHotBundle(str);
        }
        this.mSplitCommonType = splitCommonType;
        return this;
    }

    public ReactInstanceManagerBuilder setBundleAssetName(String str, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = "assets://" + str;
        }
        this.mJSBundleAssetUrl = str2;
        this.mJSBundleLoader = null;
        this.mSplitCommonType = splitCommonType;
        return this;
    }

    public ReactInstanceManagerBuilder setJSBundleFile(String str, RNJavaScriptRuntime.SplitCommonType splitCommonType) {
        if (!str.startsWith("assets://")) {
            return setJSBundleLoader(JSBundleLoader.createFileLoader(str, splitCommonType));
        }
        this.mJSBundleAssetUrl = str;
        this.mJSBundleLoader = null;
        this.mSplitCommonType = splitCommonType;
        return this;
    }
}
package com.facebook.react;

import com.facebook.e.a;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.Timing;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIImplementationProvider;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

public class CoreModulesPackage extends LazyReactPackage implements ReactPackageLogger {
    public final DefaultHardwareBackBtnHandler mHardwareBackBtnHandler;
    private final boolean mLazyViewManagersEnabled;
    private final int mMinTimeLeftInFrameForNonBatchedOperationMs;
    public final ReactInstanceManager mReactInstanceManager;
    private final UIImplementationProvider mUIImplementationProvider;

    public void endProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return LazyReactPackage.getReactModuleInfoProviderViaReflection(this);
    }

    public void startProcessPackage() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    public UIManagerModule createUIManager(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        a.a("createUIManagerModule");
        try {
            if (this.mLazyViewManagersEnabled) {
                UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, (UIManagerModule.ViewManagerResolver) new UIManagerModule.ViewManagerResolver() {
                    public List<String> getViewManagerNames() {
                        return CoreModulesPackage.this.mReactInstanceManager.getViewManagerNames();
                    }

                    @Nullable
                    public ViewManager getViewManager(String str) {
                        return CoreModulesPackage.this.mReactInstanceManager.createViewManager(str);
                    }
                }, this.mUIImplementationProvider, this.mMinTimeLeftInFrameForNonBatchedOperationMs);
                return uIManagerModule;
            }
            UIManagerModule uIManagerModule2 = new UIManagerModule(reactApplicationContext, this.mReactInstanceManager.getOrCreateViewManagers(reactApplicationContext), this.mUIImplementationProvider, this.mMinTimeLeftInFrameForNonBatchedOperationMs);
            a.a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule2;
        } finally {
            a.a();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    public List<ModuleSpec> getNativeModules(final ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new ModuleSpec[]{ModuleSpec.nativeModuleSpec(AndroidInfoModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new AndroidInfoModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(DeviceEventManagerModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new DeviceEventManagerModule(reactApplicationContext, CoreModulesPackage.this.mHardwareBackBtnHandler);
            }
        }), ModuleSpec.nativeModuleSpec(ExceptionsManagerModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new ExceptionsManagerModule(CoreModulesPackage.this.mReactInstanceManager.getDevSupportManager());
            }
        }), ModuleSpec.nativeModuleSpec(HeadlessJsTaskSupportModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(SourceCodeModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new SourceCodeModule(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(Timing.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new Timing(reactApplicationContext, CoreModulesPackage.this.mReactInstanceManager.getDevSupportManager());
            }
        }), ModuleSpec.nativeModuleSpec(UIManagerModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return CoreModulesPackage.this.createUIManager(reactApplicationContext);
            }
        }), ModuleSpec.nativeModuleSpec(DeviceInfoModule.class, new javax.inject.a<NativeModule>() {
            public NativeModule get() {
                return new DeviceInfoModule(reactApplicationContext);
            }
        })});
    }

    CoreModulesPackage(ReactInstanceManager reactInstanceManager, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler, UIImplementationProvider uIImplementationProvider, boolean z, int i) {
        this.mReactInstanceManager = reactInstanceManager;
        this.mHardwareBackBtnHandler = defaultHardwareBackBtnHandler;
        this.mUIImplementationProvider = uIImplementationProvider;
        this.mLazyViewManagersEnabled = z;
        this.mMinTimeLeftInFrameForNonBatchedOperationMs = i;
    }
}

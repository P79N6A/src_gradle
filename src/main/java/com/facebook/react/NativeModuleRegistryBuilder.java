package com.facebook.react;

import com.facebook.common.logging.FLog;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.OnBatchCompleteListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NativeModuleRegistryBuilder {
    private final List<Class<? extends NativeModule>> mCoreModules = new ArrayList();
    private final boolean mLazyNativeModulesEnabled;
    private final Map<Class<? extends NativeModule>, ModuleHolder> mModules = new HashMap();
    private final ReactApplicationContext mReactApplicationContext;
    private final ReactInstanceManager mReactInstanceManager;
    private final Map<String, Class<? extends NativeModule>> namesToType = new HashMap();

    public NativeModuleRegistry build() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mModules.entrySet()) {
            if (OnBatchCompleteListener.class.isAssignableFrom((Class) next.getKey())) {
                arrayList.add(next.getValue());
            }
        }
        return new NativeModuleRegistry(this.mReactApplicationContext, this.mModules, this.mCoreModules, arrayList);
    }

    public void addNativeModule(NativeModule nativeModule) {
        String name = nativeModule.getName();
        Class<?> cls = nativeModule.getClass();
        if (this.namesToType.containsKey(name)) {
            Class cls2 = this.namesToType.get(name);
            if (nativeModule.canOverrideExistingModule()) {
                this.mModules.remove(cls2);
            } else {
                throw new IllegalStateException("Native module " + cls.getSimpleName() + " tried to override " + cls2.getSimpleName() + " for module name " + name + ". If this was your intention, set canOverrideExistingModule=true");
            }
        }
        this.namesToType.put(name, cls);
        this.mModules.put(cls, new ModuleHolder(nativeModule));
    }

    /* JADX INFO: finally extract failed */
    public void processPackage(ReactPackage reactPackage) {
        List<NativeModule> list;
        ModuleHolder moduleHolder;
        if (!this.mLazyNativeModulesEnabled) {
            FLog.d("ReactNative", reactPackage.getClass().getSimpleName() + " is not a LazyReactPackage, falling back to old version.");
            if (reactPackage instanceof ReactInstancePackage) {
                list = ((ReactInstancePackage) reactPackage).createNativeModules(this.mReactApplicationContext, this.mReactInstanceManager);
            } else {
                list = reactPackage.createNativeModules(this.mReactApplicationContext);
            }
            for (NativeModule addNativeModule : list) {
                addNativeModule(addNativeModule);
            }
        } else if (reactPackage instanceof LazyReactPackage) {
            LazyReactPackage lazyReactPackage = (LazyReactPackage) reactPackage;
            List<ModuleSpec> nativeModules = lazyReactPackage.getNativeModules(this.mReactApplicationContext);
            Map<Class, ReactModuleInfo> reactModuleInfos = lazyReactPackage.getReactModuleInfoProvider().getReactModuleInfos();
            for (ModuleSpec next : nativeModules) {
                Class<? extends NativeModule> type = next.getType();
                ReactModuleInfo reactModuleInfo = reactModuleInfos.get(type);
                if (reactModuleInfo != null) {
                    moduleHolder = new ModuleHolder(reactModuleInfo, next.getProvider());
                } else if (!BaseJavaModule.class.isAssignableFrom(type)) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, next.getType().getName());
                    try {
                        NativeModule nativeModule = (NativeModule) next.getProvider().get();
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        moduleHolder = new ModuleHolder(nativeModule);
                    } catch (Throwable th) {
                        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("Native Java module " + type.getSimpleName() + " should be annotated with @ReactModule and added to a @ReactModuleList.");
                }
                String name = moduleHolder.getName();
                if (this.namesToType.containsKey(name)) {
                    Class cls = this.namesToType.get(name);
                    if (moduleHolder.getCanOverrideExistingModule()) {
                        this.mModules.remove(cls);
                    } else {
                        throw new IllegalStateException("Native module " + type.getSimpleName() + " tried to override " + cls.getSimpleName() + " for module name " + name + ". If this was your intention, set canOverrideExistingModule=true");
                    }
                }
                this.namesToType.put(name, type);
                this.mModules.put(type, moduleHolder);
            }
        } else {
            throw new IllegalStateException("Lazy native modules requires all ReactPackage to inherit from LazyReactPackage");
        }
    }

    public void addCorePackages(List<LazyReactPackage> list, ReactApplicationContext reactApplicationContext) {
        for (LazyReactPackage nativeModules : list) {
            for (ModuleSpec type : nativeModules.getNativeModules(reactApplicationContext)) {
                this.mCoreModules.add(type.getType());
            }
        }
    }

    public NativeModuleRegistryBuilder(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager, boolean z) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mReactInstanceManager = reactInstanceManager;
        this.mLazyNativeModulesEnabled = z;
    }
}

package com.facebook.react.bridge;

import com.facebook.e.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class NativeModuleRegistry {
    private final ArrayList<ModuleHolder> mBatchCompleteListenerModules;
    private final List<Class<? extends NativeModule>> mCoreModules;
    private final Map<Class<? extends NativeModule>, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    private ArrayList<ModuleHolder> getBatchCompleteListenerModules() {
        return this.mBatchCompleteListenerModules;
    }

    private Map<Class<? extends NativeModule>, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder module : this.mModules.values()) {
            arrayList.add(module.getModule());
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Collection<String> getCoreModules() {
        ArrayList arrayList = new ArrayList();
        for (Class next : this.mCoreModules) {
            if (this.mModules.get(next) != null) {
                arrayList.add(this.mModules.get(next).getName());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mModules.entrySet()) {
            if (CxxModuleWrapperBase.class.isAssignableFrom((Class) next.getKey())) {
                arrayList.add(next.getValue());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        a.a("NativeModuleRegistry_notifyJSInstanceDestroy");
        try {
            for (ModuleHolder destroy : this.mModules.values()) {
                destroy.destroy();
            }
        } finally {
            a.a();
        }
    }

    /* access modifiers changed from: package-private */
    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread("From version React Native v0.44, native modules are explicitly not initialized on the UI thread. See https://github.com/facebook/react-native/wiki/Breaking-Changes#d4611211-reactnativeandroidbreaking-move-nativemodule-initialization-off-ui-thread---aaachiuuu  for more details.");
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        a.a("NativeModuleRegistry_notifyJSInstanceInitialized");
        try {
            for (ModuleHolder markInitializable : this.mModules.values()) {
                markInitializable.markInitializable();
            }
        } finally {
            a.a();
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        Iterator<ModuleHolder> it2 = this.mBatchCompleteListenerModules.iterator();
        while (it2.hasNext()) {
            ModuleHolder next = it2.next();
            if (next.hasInstance()) {
                ((OnBatchCompleteListener) next.getModule()).onBatchComplete();
            }
        }
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(cls);
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        return ((ModuleHolder) com.facebook.infer.annotation.a.b(this.mModules.get(cls))).getModule();
    }

    /* access modifiers changed from: package-private */
    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.mModules.entrySet()) {
            Class cls = (Class) next.getKey();
            if (!CxxModuleWrapperBase.class.isAssignableFrom(cls)) {
                arrayList.add(new JavaModuleWrapper(jSInstance, cls, (ModuleHolder) next.getValue()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        com.facebook.infer.annotation.a.a(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), "Extending native modules with non-matching application contexts.");
        Map<Class<? extends NativeModule>, ModuleHolder> moduleMap = nativeModuleRegistry.getModuleMap();
        ArrayList<ModuleHolder> batchCompleteListenerModules = nativeModuleRegistry.getBatchCompleteListenerModules();
        for (Map.Entry next : moduleMap.entrySet()) {
            Class cls = (Class) next.getKey();
            if (!this.mModules.containsKey(cls)) {
                ModuleHolder moduleHolder = (ModuleHolder) next.getValue();
                if (batchCompleteListenerModules.contains(moduleHolder)) {
                    this.mBatchCompleteListenerModules.add(moduleHolder);
                }
                this.mModules.put(cls, moduleHolder);
            }
        }
    }

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<Class<? extends NativeModule>, ModuleHolder> map, List<Class<? extends NativeModule>> list, ArrayList<ModuleHolder> arrayList) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
        this.mBatchCompleteListenerModules = arrayList;
        this.mCoreModules = list;
    }
}

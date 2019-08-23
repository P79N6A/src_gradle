package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import javax.annotation.Nullable;

public class CompositeReactPackage extends ReactInstancePackage implements ViewManagerOnDemandReactPackage {
    private final List<ReactPackage> mChildReactPackages = new ArrayList();

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        for (ReactPackage createNativeModules : this.mChildReactPackages) {
            for (NativeModule next : createNativeModules.createNativeModules(reactApplicationContext)) {
                hashMap.put(next.getName(), next);
            }
        }
        return new ArrayList(hashMap.values());
    }

    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        HashMap hashMap = new HashMap();
        for (ReactPackage createViewManagers : this.mChildReactPackages) {
            for (ViewManager next : createViewManagers.createViewManagers(reactApplicationContext)) {
                hashMap.put(next.getName(), next);
            }
        }
        return new ArrayList(hashMap.values());
    }

    public List<String> getViewManagerNames(ReactApplicationContext reactApplicationContext, boolean z) {
        HashSet hashSet = new HashSet();
        for (ReactPackage next : this.mChildReactPackages) {
            if (next instanceof ViewManagerOnDemandReactPackage) {
                List viewManagerNames = ((ViewManagerOnDemandReactPackage) next).getViewManagerNames(reactApplicationContext, z);
                if (viewManagerNames != null) {
                    hashSet.addAll(viewManagerNames);
                }
            }
        }
        return new ArrayList(hashSet);
    }

    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext, ReactInstanceManager reactInstanceManager) {
        List<NativeModule> list;
        HashMap hashMap = new HashMap();
        for (ReactPackage next : this.mChildReactPackages) {
            if (next instanceof ReactInstancePackage) {
                list = ((ReactInstancePackage) next).createNativeModules(reactApplicationContext, reactInstanceManager);
            } else {
                list = next.createNativeModules(reactApplicationContext);
            }
            for (NativeModule next2 : list) {
                hashMap.put(next2.getName(), next2);
            }
        }
        return new ArrayList(hashMap.values());
    }

    public CompositeReactPackage(ReactPackage reactPackage, ReactPackage reactPackage2, ReactPackage... reactPackageArr) {
        this.mChildReactPackages.add(reactPackage);
        this.mChildReactPackages.add(reactPackage2);
        Collections.addAll(this.mChildReactPackages, reactPackageArr);
    }

    @Nullable
    public ViewManager createViewManager(ReactApplicationContext reactApplicationContext, String str, boolean z) {
        ListIterator<ReactPackage> listIterator = this.mChildReactPackages.listIterator(this.mChildReactPackages.size());
        while (listIterator.hasPrevious()) {
            ReactPackage previous = listIterator.previous();
            if (previous instanceof ViewManagerOnDemandReactPackage) {
                ViewManager createViewManager = ((ViewManagerOnDemandReactPackage) previous).createViewManager(reactApplicationContext, str, z);
                if (createViewManager != null) {
                    return createViewManager;
                }
            }
        }
        return null;
    }
}

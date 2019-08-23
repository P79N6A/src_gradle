package com.facebook.react.bridge;

import com.facebook.infer.annotation.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSIModuleRegistry {
    private final Map<Class, JSIModule> mModules = new HashMap();

    public <T extends JSIModule> T getModule(Class<T> cls) {
        return (JSIModule) a.b(this.mModules.get(cls));
    }

    public void registerModules(List<JSIModuleHolder> list) {
        for (JSIModuleHolder next : list) {
            this.mModules.put(next.getJSIModuleClass(), next.getJSIModule());
        }
    }
}

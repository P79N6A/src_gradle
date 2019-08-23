package com.facebook.react;

import com.facebook.react.bridge.NativeModule;
import javax.inject.a;

public class EagerModuleProvider implements a<NativeModule> {
    private final NativeModule mModule;

    public NativeModule get() {
        return this.mModule;
    }

    public EagerModuleProvider(NativeModule nativeModule) {
        this.mModule = nativeModule;
    }
}

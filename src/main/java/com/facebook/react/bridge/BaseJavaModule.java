package com.facebook.react.bridge;

import java.util.Map;
import javax.annotation.Nullable;

public abstract class BaseJavaModule implements NativeModule {
    public boolean canOverrideExistingModule() {
        return false;
    }

    @Nullable
    public Map<String, Object> getConstants() {
        return null;
    }

    public boolean hasConstants() {
        return false;
    }

    public void initialize() {
    }

    public void onCatalystInstanceDestroy() {
    }
}

package com.swmansion.gesturehandler.react;

import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.Map;
import javax.annotation.Nullable;

@ReactModule(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
    public String getName() {
        return "GestureHandlerRootView";
    }

    @Nullable
    public Map getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.of("onGestureHandlerEvent", MapBuilder.of("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", MapBuilder.of("registrationName", "onGestureHandlerStateChange"));
    }

    /* access modifiers changed from: protected */
    public h createViewInstance(ThemedReactContext themedReactContext) {
        return new h(themedReactContext);
    }

    public void onDropViewInstance(h hVar) {
        if (hVar.f78828a != null) {
            hVar.f78828a.a();
        }
    }
}

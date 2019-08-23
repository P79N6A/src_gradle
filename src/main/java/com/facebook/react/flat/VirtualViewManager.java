package com.facebook.react.flat;

import android.view.View;
import com.facebook.react.flat.FlatShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManager;

public abstract class VirtualViewManager<C extends FlatShadowNode> extends ViewManager<View, C> {
    public void updateExtraData(View view, Object obj) {
    }

    VirtualViewManager() {
    }

    public View createViewInstance(ThemedReactContext themedReactContext) {
        throw new RuntimeException(getName() + " doesn't map to a View");
    }
}

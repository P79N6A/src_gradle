package com.facebook.react.flat;

import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;

public abstract class FlatViewManager extends ViewGroupManager<FlatViewGroup> {
    public void setBackgroundColor(FlatViewGroup flatViewGroup, int i) {
    }

    FlatViewManager() {
    }

    public void removeAllViews(FlatViewGroup flatViewGroup) {
        flatViewGroup.removeAllViewsInLayout();
    }

    /* access modifiers changed from: protected */
    public FlatViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new FlatViewGroup(themedReactContext);
    }
}

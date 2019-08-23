package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, LayoutShadowNode> {
    public void updateExtraData(T t, Object obj) {
    }

    public Class<LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }
}

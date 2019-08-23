package com.facebook.react.flat;

public final class FlatRootShadowNode extends FlatShadowNode {
    FlatRootShadowNode() {
        forceMountToView();
        signalBackingViewIsCreated();
    }
}

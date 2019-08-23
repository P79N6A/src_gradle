package com.facebook.react.views.text;

public class ReactVirtualTextShadowNode extends ReactBaseTextShadowNode {
    public boolean isVirtual() {
        return true;
    }

    public ReactVirtualTextShadowNode() {
    }

    public ReactVirtualTextShadowNode mutableCopy() {
        return new ReactVirtualTextShadowNode(this);
    }

    private ReactVirtualTextShadowNode(ReactVirtualTextShadowNode reactVirtualTextShadowNode) {
        super(reactVirtualTextShadowNode);
    }
}

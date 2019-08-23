package com.facebook.react.views.text;

import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public class ReactRawTextShadowNode extends ReactShadowNodeImpl {
    @Nullable
    private String mText;

    public boolean isVirtual() {
        return true;
    }

    public ReactRawTextShadowNode() {
    }

    @Nullable
    public String getText() {
        return this.mText;
    }

    public ReactShadowNodeImpl mutableCopy() {
        return new ReactRawTextShadowNode(this);
    }

    public String toString() {
        return getViewClass() + " [text: " + this.mText + "]";
    }

    private ReactRawTextShadowNode(ReactRawTextShadowNode reactRawTextShadowNode) {
        super(reactRawTextShadowNode);
        this.mText = reactRawTextShadowNode.mText;
    }

    @ReactProp(name = "text")
    public void setText(@Nullable String str) {
        this.mText = str;
        markUpdated();
    }
}

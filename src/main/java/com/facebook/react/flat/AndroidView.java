package com.facebook.react.flat;

public interface AndroidView {
    float getPadding(int i);

    boolean isPaddingChanged();

    boolean needsCustomLayoutForChildren();

    void resetPaddingChanged();
}

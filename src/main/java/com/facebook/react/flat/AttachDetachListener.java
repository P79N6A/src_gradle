package com.facebook.react.flat;

import com.facebook.react.flat.FlatViewGroup;

public interface AttachDetachListener {
    public static final AttachDetachListener[] EMPTY_ARRAY = new AttachDetachListener[0];

    void onAttached(FlatViewGroup.InvalidateCallback invalidateCallback);

    void onDetached();
}

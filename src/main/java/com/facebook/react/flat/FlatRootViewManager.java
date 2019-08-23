package com.facebook.react.flat;

import android.view.ViewGroup;
import com.facebook.react.uimanager.RootViewManager;

public class FlatRootViewManager extends RootViewManager {
    FlatRootViewManager() {
    }

    public void removeAllViews(ViewGroup viewGroup) {
        viewGroup.removeAllViewsInLayout();
    }
}
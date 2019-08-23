package com.bytedance.scene.b;

import android.support.annotation.RequiresApi;
import android.support.annotation.RestrictTo;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

@RequiresApi(api = 21)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class d implements View.OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets2);
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}

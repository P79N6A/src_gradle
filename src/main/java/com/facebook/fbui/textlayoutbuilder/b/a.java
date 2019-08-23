package com.facebook.fbui.textlayoutbuilder.b;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;

public final class a {
    public static int a(Layout layout) {
        int i = 0;
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            float lineDescent = (float) (layout.getLineDescent(layout.getLineCount() - 1) - layout.getLineAscent(layout.getLineCount() - 1));
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            if (spacingAdd >= 0.0f) {
                double d2 = (double) spacingAdd;
                Double.isNaN(d2);
                i = (int) (d2 + 0.5d);
            } else {
                double d3 = (double) (-spacingAdd);
                Double.isNaN(d3);
                i = -((int) (d3 + 0.5d));
            }
        }
        return layout.getHeight() - i;
    }
}

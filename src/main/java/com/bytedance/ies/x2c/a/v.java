package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class v implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        DmtTextView dmtTextView = new DmtTextView(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        dmtTextView.setId(C0906R.id.dgg);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2) && Build.VERSION.SDK_INT >= 17) {
            a2.setMarginStart((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 16;
        }
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(C0906R.color.mc));
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setTextSize(2, 15.0f);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.nc));
        dmtTextView.setIncludeFontPadding(false);
        if (viewGroup != null) {
            dmtTextView.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(dmtTextView);
            }
        }
        a.a(dmtTextView);
        return dmtTextView;
    }
}

package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class z implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        linearLayout.setBackgroundColor(resources.getColor(C0906R.color.v));
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        imageView.setImageResource(2130838915);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            linearLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.dhq);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setText(C0906R.string.ae2);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView.setMaxLines(2);
        dmtTextView.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        a.a(dmtTextView);
        return linearLayout;
    }
}

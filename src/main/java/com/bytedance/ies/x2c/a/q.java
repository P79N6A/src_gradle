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
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public final class q implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        relativeLayout.setBackgroundColor(resources.getColor(C0906R.color.a39));
        if (viewGroup != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(relativeLayout);
            }
        }
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.aq8);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        imageView.setImageResource(2130839303);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            relativeLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, C0906R.id.aq8);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(1, C0906R.id.aq8);
        }
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setText(C0906R.string.als);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.ak6));
        dmtTextView.setId(C0906R.id.cpd);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(0, C0906R.id.a_a);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(16, C0906R.id.a_a);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setMaxLines(1);
        dmtTextView.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            relativeLayout.addView(dmtTextView);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        autoRTLImageView.setScaleType(ImageView.ScaleType.CENTER);
        autoRTLImageView.setImageResource(2130839304);
        autoRTLImageView.setId(C0906R.id.a_a);
        autoRTLImageView.setLayoutParams(layoutParams3);
        if (autoRTLImageView.getParent() == null) {
            relativeLayout.addView(autoRTLImageView);
        }
        a.a(dmtTextView);
        a.a(autoRTLImageView);
        return relativeLayout;
    }
}

package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.ss.android.ugc.aweme.C0906R;

public final class c implements com.bytedance.ies.x2c.c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        relativeLayout.setBackgroundColor(resources.getColor(C0906R.color.a2p));
        if (viewGroup != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(relativeLayout);
            }
        }
        ImageView imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.aq8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        imageView.setImageResource(2130839435);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            relativeLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setText(C0906R.string.jt);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(1, C0906R.id.aq8);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(17, C0906R.id.aq8);
        }
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setTextSize(2, 13.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            relativeLayout.addView(dmtTextView);
        }
        ImageView imageView2 = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setImageResource(2130838779);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(11, -1);
        }
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(21, -1);
        }
        imageView2.setLayoutParams(layoutParams3);
        if (imageView2.getParent() == null) {
            relativeLayout.addView(imageView2);
        }
        a.a(dmtTextView);
        return relativeLayout;
    }
}

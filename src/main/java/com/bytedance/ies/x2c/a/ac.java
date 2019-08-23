package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class ac implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -2);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(resources.getColor(C0906R.color.h7));
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.b6h);
        imageView.setImageResource(2130838915);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            linearLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setId(C0906R.id.d9g);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.weight = 1.0f;
        }
        dmtTextView.setGravity(19);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(2, 4.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setMaxLines(2);
        dmtTextView.setPadding(dmtTextView.getPaddingLeft(), (int) TypedValue.applyDimension(2, 4.0f, resources.getDisplayMetrics()), dmtTextView.getPaddingRight(), dmtTextView.getPaddingBottom());
        dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), dmtTextView.getPaddingRight(), (int) TypedValue.applyDimension(2, 4.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((FrameLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        dmtTextView.setText(C0906R.string.bsg);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.g));
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        AutoRTLImageView autoRTLImageView = new AutoRTLImageView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        autoRTLImageView.setId(C0906R.id.b0z);
        autoRTLImageView.setImageResource(2130838780);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((FrameLayout.LayoutParams) layoutParams3).gravity = 16;
        }
        autoRTLImageView.setScaleType(ImageView.ScaleType.CENTER);
        autoRTLImageView.setLayoutParams(layoutParams3);
        if (autoRTLImageView.getParent() == null) {
            linearLayout.addView(autoRTLImageView);
        }
        a.a(dmtTextView);
        a.a(autoRTLImageView);
        return linearLayout;
    }
}

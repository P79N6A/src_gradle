package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class d implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        float f2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -2);
        linearLayout.setBackgroundColor(resources.getColor(C0906R.color.a1k));
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.dll);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setCompoundDrawables(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130838915), dmtTextView.getCompoundDrawables()[1], dmtTextView.getCompoundDrawables()[2], dmtTextView.getCompoundDrawables()[3]);
        dmtTextView.setCompoundDrawablePadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        dmtTextView.setCompoundDrawablesRelative(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130838915), dmtTextView.getCompoundDrawablesRelative()[1], dmtTextView.getCompoundDrawablesRelative()[2], dmtTextView.getCompoundDrawablesRelative()[3]);
        dmtTextView.setText(C0906R.string.dso);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a11));
        dmtTextView.setLayoutParams(layoutParams);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams2);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setId(C0906R.id.a5c);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.weight = 1.0f;
        }
        dmtTextView2.setBackgroundResource(2130838159);
        dmtTextView2.setGravity(17);
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
        dmtTextView2.setText(C0906R.string.a5w);
        dmtTextView2.setTextColor(resources.getColorStateList(C0906R.color.a71));
        dmtTextView2.setTextSize(2, 15.0f);
        dmtTextView2.setLayoutParams(layoutParams3);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView3.setId(C0906R.id.ej);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            f2 = 1.0f;
            layoutParams4.weight = 1.0f;
        } else {
            f2 = 1.0f;
        }
        dmtTextView3.setBackgroundResource(2130838159);
        dmtTextView3.setGravity(17);
        dmtTextView3.setIncludeFontPadding(false);
        dmtTextView3.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), f2);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), dmtTextView3.getPaddingRight(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()));
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), (int) TypedValue.applyDimension(1, 6.5f, resources.getDisplayMetrics()), dmtTextView3.getPaddingRight(), dmtTextView3.getPaddingBottom());
        dmtTextView3.setText(C0906R.string.ei);
        dmtTextView3.setTextColor(resources.getColorStateList(C0906R.color.a71));
        dmtTextView3.setTextSize(2, 15.0f);
        dmtTextView3.setLayoutParams(layoutParams4);
        if (dmtTextView3.getParent() == null) {
            linearLayout2.addView(dmtTextView3);
        }
        a.a(dmtTextView);
        a.a(dmtTextView2);
        a.a(dmtTextView3);
        return linearLayout;
    }
}

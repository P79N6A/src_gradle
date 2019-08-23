package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class ae implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, (int) TypedValue.applyDimension(1, 32.0f, resources.getDisplayMetrics()));
        relativeLayout.setBackgroundColor(Color.parseColor("#573A3A3A"));
        relativeLayout.setVisibility(8);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setId(C0906R.id.baw);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(15, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(9, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(20, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) resources.getDimension(C0906R.dimen.rd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(layoutParams);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.dd4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        ImageView imageView = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.aq8);
        imageView.setImageResource(2130839426);
        imageView.setLayoutParams(layoutParams3);
        if (imageView.getParent() == null) {
            linearLayout.addView(imageView);
        }
        ImageView imageView2 = new ImageView(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        imageView2.setId(C0906R.id.b0z);
        imageView2.setImageResource(2130838782);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.rightMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(11, -1);
        }
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(21, -1);
        }
        imageView2.setLayoutParams(layoutParams4);
        if (imageView2.getParent() == null) {
            relativeLayout.addView(imageView2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(17, C0906R.id.baw);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(1, C0906R.id.baw);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(16, C0906R.id.b0z);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(0, C0906R.id.b0z);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(15, -1);
        }
        linearLayout2.setLayoutParams(layoutParams5);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams6);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), -2);
        dmtTextView2.setTextSize(1, 13.0f);
        dmtTextView2.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView2.setId(C0906R.id.da0);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.weight = 1.0f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        dmtTextView2.setText(C0906R.string.ds9);
        dmtTextView2.setTypeface(Typeface.DEFAULT_BOLD);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView2.setTextColor(resources.getColorStateList(C0906R.color.s_));
        dmtTextView2.setIncludeFontPadding(false);
        dmtTextView2.setLayoutParams(layoutParams7);
        if (dmtTextView2.getParent() == null) {
            linearLayout3.addView(dmtTextView2);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView3.setTextSize(1, 13.0f);
        dmtTextView3.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView3.setId(C0906R.id.dd0);
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        dmtTextView3.setPadding(dmtTextView3.getPaddingLeft(), dmtTextView3.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), dmtTextView3.getPaddingBottom());
        dmtTextView3.setText(" | 热度35.2w");
        dmtTextView3.setTypeface(Typeface.DEFAULT_BOLD);
        dmtTextView3.setMaxLines(1);
        dmtTextView3.setTextColor(resources.getColorStateList(C0906R.color.s_));
        dmtTextView3.setIncludeFontPadding(false);
        dmtTextView3.setLayoutParams(layoutParams8);
        if (dmtTextView3.getParent() == null) {
            linearLayout3.addView(dmtTextView3);
        }
        a.a(dmtTextView);
        a.a(dmtTextView2);
        a.a(dmtTextView3);
        return relativeLayout;
    }
}

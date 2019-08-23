package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class p implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        relativeLayout.setId(C0906R.id.cz2);
        relativeLayout.setClipChildren(false);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        relativeLayout2.setId(C0906R.id.z1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(13, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 16;
        }
        relativeLayout2.setGravity(17);
        relativeLayout2.setLayoutParams(layoutParams);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setId(C0906R.id.cz7);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(13, -1);
        }
        dmtTextView.setAlpha(0.6f);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a08));
        dmtTextView.setTypeface(Typeface.DEFAULT_BOLD);
        dmtTextView.setFontType("bold");
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            relativeLayout2.addView(dmtTextView);
        }
        ImageView imageView = new ImageView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        imageView.setId(C0906R.id.cz1);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.addRule(13, -1);
        }
        imageView.setImageResource(2130839264);
        imageView.setVisibility(4);
        imageView.setLayoutParams(layoutParams3);
        if (imageView.getParent() == null) {
            relativeLayout2.addView(imageView);
        }
        View view = new View(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.cz0);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(14, -1);
        }
        view.setBackgroundResource(2130840230);
        view.setTranslationY((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        view.setLayoutParams(layoutParams4);
        if (view.getParent() == null) {
            relativeLayout2.addView(view);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(1, C0906R.id.z1);
        }
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams5);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        ImageView imageView2 = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        imageView2.setId(C0906R.id.cyq);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        imageView2.setImageResource(2130840255);
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams6);
        if (imageView2.getParent() == null) {
            linearLayout.addView(imageView2);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        dmtTextView2.setTextSize(1, 12.0f);
        dmtTextView2.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView2.setId(C0906R.id.cyr);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, -4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        dmtTextView2.setBackgroundResource(2130838296);
        dmtTextView2.setGravity(17);
        dmtTextView2.setMinWidth((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        dmtTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
        dmtTextView2.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), dmtTextView2.getPaddingBottom());
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingBottom());
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView2.getPaddingBottom());
        dmtTextView2.setPadding(dmtTextView2.getPaddingLeft(), dmtTextView2.getPaddingTop(), dmtTextView2.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        dmtTextView2.setTextColor(resources.getColorStateList(C0906R.color.i0));
        dmtTextView2.setVisibility(8);
        dmtTextView2.setLayoutParams(layoutParams7);
        if (dmtTextView2.getParent() == null) {
            linearLayout.addView(dmtTextView2);
        }
        a.a(dmtTextView);
        a.a(dmtTextView2);
        return relativeLayout;
    }
}

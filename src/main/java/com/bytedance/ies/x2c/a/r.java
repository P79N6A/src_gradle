package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class r implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        linearLayout.setId(C0906R.id.vs);
        linearLayout.setOrientation(1);
        linearLayout.setFocusable(true);
        linearLayout.setFocusableInTouchMode(true);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) resources.getDimension(C0906R.dimen.g6), (int) resources.getDimension(C0906R.dimen.g3));
        frameLayout.setBackgroundResource(2130837953);
        frameLayout.setPadding((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        frameLayout.setId(C0906R.id.v3);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        frameLayout.setFocusable(false);
        frameLayout.setFocusableInTouchMode(false);
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        imageView.setId(C0906R.id.va);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 17;
        }
        imageView.setImageResource(2130838956);
        imageView.setFocusable(false);
        imageView.setFocusableInTouchMode(false);
        imageView.setLayoutParams(layoutParams2);
        if (imageView.getParent() == null) {
            frameLayout.addView(imageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView.setTextSize(1, 12.0f);
        dmtTextView.setShadowLayer(2.0f, dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), dmtTextView.getShadowColor());
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), 2.0f, dmtTextView.getShadowColor());
        dmtTextView.setGravity(17);
        dmtTextView.setIncludeFontPadding(false);
        dmtTextView.setShadowLayer(dmtTextView.getShadowRadius(), dmtTextView.getShadowDx(), dmtTextView.getShadowDy(), resources.getColor(C0906R.color.mc));
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView.setId(C0906R.id.v4);
        dmtTextView.setGravity(1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, -3.4f, resources.getDisplayMetrics());
        }
        dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), dmtTextView.getPaddingRight(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        dmtTextView.setVisibility(0);
        dmtTextView.setFocusable(false);
        dmtTextView.setFocusableInTouchMode(false);
        dmtTextView.setImportantForAccessibility(2);
        dmtTextView.setLayoutParams(layoutParams3);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        a.a(dmtTextView);
        return linearLayout;
    }
}

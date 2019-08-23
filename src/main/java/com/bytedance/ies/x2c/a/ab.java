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
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public final class ab implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        linearLayout.setId(C0906R.id.dr0);
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2) && Build.VERSION.SDK_INT >= 17) {
            a2.setMarginStart((int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.leftMargin = (int) TypedValue.applyDimension(1, 15.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(a2)) {
            a2.bottomMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundResource(2130838271);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(8);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        RemoteImageView remoteImageView = new RemoteImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 13.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(C0906R.id.dr1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 3.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        ((GenericDraweeHierarchy) remoteImageView.getHierarchy()).setFailureImage(2130841689);
        ((GenericDraweeHierarchy) remoteImageView.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        remoteImageView.setLayoutParams(layoutParams);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView = new DmtTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.dr2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setTextSize(1, 13.0f);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.i4));
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(2, 3.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setLayoutParams(layoutParams2);
        if (dmtTextView.getParent() == null) {
            linearLayout.addView(dmtTextView);
        }
        a.a(remoteImageView);
        a.a(dmtTextView);
        return linearLayout;
    }
}

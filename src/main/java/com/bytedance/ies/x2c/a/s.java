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
import android.widget.RelativeLayout;
import com.bytedance.ies.x2c.c;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;
import com.ss.android.ugc.aweme.feed.widget.PeriscopeLayout;

public final class s implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -2);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        PeriscopeLayout periscopeLayout = new PeriscopeLayout(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        periscopeLayout.setId(C0906R.id.brf);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(2, C0906R.id.m0);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.addRule(11, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, -22.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginEnd((int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.rightMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        }
        periscopeLayout.setBackgroundResource(0);
        periscopeLayout.setLayoutParams(layoutParams);
        if (periscopeLayout.getParent() == null) {
            relativeLayout.addView(periscopeLayout);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        frameLayout.setId(C0906R.id.bob);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(2, C0906R.id.m0);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(12, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.addRule(11, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginEnd((int) resources.getDimension(C0906R.dimen.g4));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.rightMargin = (int) resources.getDimension(C0906R.dimen.g4);
        }
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(true);
        frameLayout.setLayoutParams(layoutParams2);
        if (frameLayout.getParent() == null) {
            relativeLayout.addView(frameLayout);
        }
        CircleImageView circleImageView = new CircleImageView(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) resources.getDimension(C0906R.dimen.g5), (int) resources.getDimension(C0906R.dimen.g5));
        circleImageView.setId(C0906R.id.boa);
        ((GenericDraweeHierarchy) circleImageView.getHierarchy()).setPlaceholderImage(2130839026);
        circleImageView.setFocusable(false);
        circleImageView.setFocusableInTouchMode(false);
        circleImageView.setLayoutParams(layoutParams3);
        if (circleImageView.getParent() == null) {
            frameLayout.addView(circleImageView);
        }
        CircleImageView circleImageView2 = new CircleImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 27.0f, resources.getDisplayMetrics()));
        circleImageView2.setId(C0906R.id.bvc);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = i;
        }
        circleImageView2.setVisibility(8);
        circleImageView2.setFocusable(false);
        circleImageView2.setFocusableInTouchMode(false);
        circleImageView2.setLayoutParams(layoutParams4);
        if (circleImageView2.getParent() == null) {
            frameLayout.addView(circleImageView2);
        }
        a.a(periscopeLayout);
        a.a(circleImageView);
        a.a(circleImageView2);
        return relativeLayout;
    }
}

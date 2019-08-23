package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class e implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        frameLayout.setId(C0906R.id.acz);
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        View a3 = new f().a(context, frameLayout, false);
        if (!(a3 == null || a3 == frameLayout)) {
            a3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a3.getParent() == null) {
                frameLayout.addView(a3);
            }
        }
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        constraintLayout.setId(C0906R.id.a4h);
        constraintLayout.setLayoutParams(layoutParams);
        if (constraintLayout.getParent() == null) {
            frameLayout.addView(constraintLayout);
        }
        View a4 = new o().a(context, frameLayout, false);
        if (!(a4 == null || a4 == frameLayout)) {
            a4.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a4.getParent() == null) {
                frameLayout.addView(a4);
            }
        }
        ViewStub viewStub = new ViewStub(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(C0906R.id.cwu);
        viewStub.setInflatedId(C0906R.id.bqf);
        viewStub.setLayoutResource(C0906R.layout.a6u);
        viewStub.setLayoutParams(layoutParams2);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        frameLayout2.setId(C0906R.id.dsh);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 180.0f, resources.getDisplayMetrics()), -2);
        frameLayout3.setId(C0906R.id.dsi);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) resources.getDimension(C0906R.dimen.rd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        frameLayout3.setLayoutParams(layoutParams4);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        return frameLayout;
    }
}

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
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;

public final class g implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        if (viewGroup != null) {
            LinearLayout linearLayout = new LinearLayout(context);
            ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout.setId(C0906R.id.d5_);
            if (LinearLayout.LayoutParams.class.isInstance(a2)) {
                ((LinearLayout.LayoutParams) a2).gravity = 48;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a2)) {
                ((FrameLayout.LayoutParams) a2).gravity = 48;
            }
            linearLayout.setOrientation(1);
            if (viewGroup != null) {
                linearLayout.setLayoutParams(a2);
                viewGroup.addView(linearLayout);
            }
            View view = new View(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view.setId(C0906R.id.d59);
            view.setBackgroundColor(resources.getColor(C0906R.color.h7));
            view.setLayoutParams(layoutParams);
            if (view.getParent() == null) {
                linearLayout.addView(view);
            }
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (frameLayout.getParent() == null) {
                linearLayout.addView(frameLayout);
            }
            ImageView imageView = new ImageView(context);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 51;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
                layoutParams2.gravity = 51;
            }
            imageView.setImageResource(2130838863);
            imageView.setLayoutParams(layoutParams2);
            if (imageView.getParent() == null) {
                frameLayout.addView(imageView);
            }
            ImageView imageView2 = new ImageView(context);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
                ((LinearLayout.LayoutParams) layoutParams3).gravity = 53;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
                layoutParams3.gravity = 53;
            }
            imageView2.setImageResource(2130838864);
            imageView2.setLayoutParams(layoutParams3);
            if (imageView2.getParent() == null) {
                frameLayout.addView(imageView2);
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            ViewGroup.MarginLayoutParams a3 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            linearLayout2.setId(C0906R.id.md);
            if (LinearLayout.LayoutParams.class.isInstance(a3)) {
                ((LinearLayout.LayoutParams) a3).gravity = 80;
            }
            if (FrameLayout.LayoutParams.class.isInstance(a3)) {
                ((FrameLayout.LayoutParams) a3).gravity = 80;
            }
            linearLayout2.setOrientation(1);
            if (viewGroup != null) {
                linearLayout2.setLayoutParams(a3);
                viewGroup.addView(linearLayout2);
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            if (frameLayout2.getParent() == null) {
                linearLayout2.addView(frameLayout2);
            }
            ImageView imageView3 = new ImageView(context);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
                ((LinearLayout.LayoutParams) layoutParams4).gravity = 83;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
                layoutParams4.gravity = 83;
            }
            imageView3.setImageResource(2130838865);
            imageView3.setLayoutParams(layoutParams4);
            if (imageView3.getParent() == null) {
                frameLayout2.addView(imageView3);
            }
            ImageView imageView4 = new ImageView(context);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
            if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
                ((LinearLayout.LayoutParams) layoutParams5).gravity = 85;
            }
            if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
                layoutParams5.gravity = 85;
            }
            imageView4.setImageResource(2130838866);
            imageView4.setLayoutParams(layoutParams5);
            if (imageView4.getParent() == null) {
                frameLayout2.addView(imageView4);
            }
            View view2 = new View(context);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(0, 0.0f, resources.getDisplayMetrics()));
            view2.setId(C0906R.id.mc);
            view2.setBackgroundColor(resources.getColor(C0906R.color.h7));
            view2.setLayoutParams(layoutParams6);
            if (view2.getParent() == null) {
                linearLayout2.addView(view2);
            }
            return viewGroup;
        }
        throw new IllegalStateException("merge标签 container不得为null attach不得为false");
    }
}

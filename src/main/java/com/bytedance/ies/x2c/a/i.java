package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.main.base.HomeViewPager;

public final class i implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        frameLayout.setId(C0906R.id.ag1);
        frameLayout.setBackgroundColor(resources.getColor(C0906R.color.d5));
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        HomeViewPager homeViewPager = new HomeViewPager(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        homeViewPager.setId(C0906R.id.duu);
        homeViewPager.setBackgroundColor(resources.getColor(C0906R.color.d5));
        homeViewPager.setLayoutParams(layoutParams);
        if (homeViewPager.getParent() == null) {
            frameLayout.addView(homeViewPager);
        }
        View view = new View(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.am_);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()));
        }
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            frameLayout.addView(view);
        }
        a.a(homeViewPager);
        return frameLayout;
    }
}

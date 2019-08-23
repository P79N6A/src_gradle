package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.widget.DiggLayout;
import com.ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;

public final class f implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FeedSwipeRefreshLayout feedSwipeRefreshLayout = new FeedSwipeRefreshLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, -1);
        feedSwipeRefreshLayout.setId(C0906R.id.ccw);
        feedSwipeRefreshLayout.setKeepScreenOn(true);
        if (viewGroup != null) {
            feedSwipeRefreshLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(feedSwipeRefreshLayout);
            }
        }
        LoadMoreFrameLayout loadMoreFrameLayout = new LoadMoreFrameLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        loadMoreFrameLayout.setId(C0906R.id.bjm);
        loadMoreFrameLayout.setLayoutParams(layoutParams);
        if (loadMoreFrameLayout.getParent() == null) {
            feedSwipeRefreshLayout.addView(loadMoreFrameLayout);
        }
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams2);
        if (linearLayout.getParent() == null) {
            loadMoreFrameLayout.addView(linearLayout);
        }
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.d5u);
        view.setBackgroundColor(resources.getColor(C0906R.color.h7));
        view.setLayoutParams(layoutParams3);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        VerticalViewPager verticalViewPager = new VerticalViewPager(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        verticalViewPager.setId(C0906R.id.duu);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 48;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((FrameLayout.LayoutParams) layoutParams4).gravity = 48;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.weight = 1.0f;
        }
        verticalViewPager.setLayoutParams(layoutParams4);
        if (verticalViewPager.getParent() == null) {
            linearLayout.addView(verticalViewPager);
        }
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view2.setId(C0906R.id.ms);
        view2.setBackgroundColor(resources.getColor(C0906R.color.h7));
        view2.setLayoutParams(layoutParams5);
        if (view2.getParent() == null) {
            linearLayout.addView(view2);
        }
        View a3 = new g().a(context, loadMoreFrameLayout, false);
        if (!(a3 == null || a3 == loadMoreFrameLayout)) {
            a3.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            if (a3.getParent() == null) {
                loadMoreFrameLayout.addView(a3);
            }
        }
        DiggLayout diggLayout = new DiggLayout(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        diggLayout.setId(C0906R.id.a51);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((RelativeLayout.LayoutParams) layoutParams6).addRule(13, -1);
        }
        diggLayout.setLayoutParams(layoutParams6);
        if (diggLayout.getParent() == null) {
            loadMoreFrameLayout.addView(diggLayout);
        }
        a.a(verticalViewPager);
        a.a(diggLayout);
        a.a(loadMoreFrameLayout);
        a.a(feedSwipeRefreshLayout);
        return feedSwipeRefreshLayout;
    }
}

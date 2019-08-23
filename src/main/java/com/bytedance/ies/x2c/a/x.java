package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.FeedTagLayout;
import com.ss.android.ugc.aweme.base.ui.FeedTagLayout2;
import com.ss.android.ugc.aweme.festival.christmas.view.FeedStickerTagView;

public final class x implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -2, -2);
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(linearLayout);
            }
        }
        FeedTagLayout feedTagLayout = new FeedTagLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        feedTagLayout.setId(C0906R.id.ad1);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        feedTagLayout.setVisibility(8);
        feedTagLayout.setLayoutParams(layoutParams);
        if (feedTagLayout.getParent() == null) {
            linearLayout.addView(feedTagLayout);
        }
        FeedTagLayout2 feedTagLayout2 = new FeedTagLayout2(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        feedTagLayout2.setId(C0906R.id.ad2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        feedTagLayout2.setVisibility(8);
        feedTagLayout2.setLayoutParams(layoutParams2);
        if (feedTagLayout2.getParent() == null) {
            linearLayout.addView(feedTagLayout2);
        }
        FeedStickerTagView feedStickerTagView = new FeedStickerTagView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        feedStickerTagView.setId(C0906R.id.dtx);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        feedStickerTagView.setVisibility(8);
        feedStickerTagView.setLayoutParams(layoutParams3);
        if (feedStickerTagView.getParent() == null) {
            linearLayout.addView(feedStickerTagView);
        }
        a.a(feedTagLayout);
        a.a(feedTagLayout2);
        a.a(feedStickerTagView);
        return linearLayout;
    }
}

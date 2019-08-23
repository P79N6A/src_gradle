package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout;
import com.ss.android.ugc.aweme.main.base.mainpage.view.ScrollableViewPager;

public final class a implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        ViewGroup.MarginLayoutParams a2 = android.view.a.a(viewGroup2, -1, -1);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        ScrollableViewPager scrollableViewPager = new ScrollableViewPager(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        scrollableViewPager.setId(C0906R.id.duu);
        scrollableViewPager.setLayoutParams(layoutParams);
        if (scrollableViewPager.getParent() == null) {
            frameLayout.addView(scrollableViewPager);
        }
        DisLikeAwemeLayout disLikeAwemeLayout = new DisLikeAwemeLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        disLikeAwemeLayout.setId(C0906R.id.a5m);
        disLikeAwemeLayout.setVisibility(8);
        disLikeAwemeLayout.setLayoutParams(layoutParams2);
        if (disLikeAwemeLayout.getParent() == null) {
            frameLayout.addView(disLikeAwemeLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        frameLayout2.setId(C0906R.id.cws);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 8388659;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 8388659;
        }
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingTop(), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setPadding(frameLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 30.0f, resources.getDisplayMetrics()), frameLayout2.getPaddingRight(), frameLayout2.getPaddingBottom());
        frameLayout2.setLayoutParams(layoutParams3);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        ImageView imageView = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 51;
        }
        imageView.setImageResource(2130838863);
        imageView.setLayoutParams(layoutParams4);
        if (imageView.getParent() == null) {
            frameLayout.addView(imageView);
        }
        ImageView imageView2 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 53;
        }
        imageView2.setImageResource(2130838864);
        imageView2.setLayoutParams(layoutParams5);
        if (imageView2.getParent() == null) {
            frameLayout.addView(imageView2);
        }
        ImageView imageView3 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 83;
        }
        imageView3.setImageResource(2130838865);
        imageView3.setLayoutParams(layoutParams6);
        if (imageView3.getParent() == null) {
            frameLayout.addView(imageView3);
        }
        ImageView imageView4 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams7)) {
            ((LinearLayout.LayoutParams) layoutParams7).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.gravity = 85;
        }
        imageView4.setImageResource(2130838866);
        imageView4.setLayoutParams(layoutParams7);
        if (imageView4.getParent() == null) {
            frameLayout.addView(imageView4);
        }
        AvatarWithBorderView avatarWithBorderView = new AvatarWithBorderView(context2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 48.0f, resources.getDisplayMetrics()));
        avatarWithBorderView.setId(C0906R.id.dp6);
        avatarWithBorderView.setBackgroundColor(resources.getColor(C0906R.color.hl));
        avatarWithBorderView.setVisibility(8);
        avatarWithBorderView.setLayoutParams(layoutParams8);
        if (avatarWithBorderView.getParent() == null) {
            frameLayout.addView(avatarWithBorderView);
        }
        ImageView imageView5 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 133.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        imageView5.setId(C0906R.id.tw);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.leftMargin = (int) TypedValue.applyDimension(1, -133.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9) && Build.VERSION.SDK_INT >= 17) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, -133.0f, resources.getDisplayMetrics()));
        }
        imageView5.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView5.setVisibility(4);
        imageView5.setLayoutParams(layoutParams9);
        if (imageView5.getParent() == null) {
            frameLayout.addView(imageView5);
        }
        ImageView imageView6 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 125.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        imageView6.setId(C0906R.id.tx);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 8388613;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = 8388613;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, -125.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.rightMargin = (int) TypedValue.applyDimension(1, -125.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.topMargin = (int) TypedValue.applyDimension(1, 46.0f, resources.getDisplayMetrics());
        }
        imageView6.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView6.setVisibility(4);
        imageView6.setLayoutParams(layoutParams10);
        if (imageView6.getParent() == null) {
            frameLayout.addView(imageView6);
        }
        ImageView imageView7 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 60.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        imageView7.setId(C0906R.id.che);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = 1;
        }
        imageView7.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView7.setVisibility(4);
        imageView7.setLayoutParams(layoutParams11);
        if (imageView7.getParent() == null) {
            frameLayout.addView(imageView7);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout3.setId(C0906R.id.ct6);
        frameLayout3.setVisibility(8);
        frameLayout3.setLayoutParams(layoutParams12);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        FrameLayout frameLayout4 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout4.setId(C0906R.id.akx);
        frameLayout4.setLayoutParams(layoutParams13);
        if (frameLayout4.getParent() == null) {
            frameLayout.addView(frameLayout4);
        }
        BlackMaskLayer blackMaskLayer = new BlackMaskLayer(context2);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -1);
        blackMaskLayer.setId(C0906R.id.d9);
        blackMaskLayer.setVisibility(8);
        blackMaskLayer.setLayoutParams(layoutParams14);
        if (blackMaskLayer.getParent() == null) {
            frameLayout.addView(blackMaskLayer);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context2);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 295.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(C0906R.id.d8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((LinearLayout.LayoutParams) layoutParams15).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.bottomMargin = (int) TypedValue.applyDimension(1, -300.0f, resources.getDisplayMetrics());
        }
        adHalfWebPageContainer.setLayoutParams(layoutParams15);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout.addView(adHalfWebPageContainer);
        }
        android.view.a.a(scrollableViewPager);
        android.view.a.a(disLikeAwemeLayout);
        android.view.a.a(avatarWithBorderView);
        android.view.a.a(blackMaskLayer);
        android.view.a.a(adHalfWebPageContainer);
        return frameLayout;
    }
}

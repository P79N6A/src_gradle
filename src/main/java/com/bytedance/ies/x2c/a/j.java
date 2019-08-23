package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.SwipeRefreshLayout;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.common.widget.FlippableViewPager;
import com.ss.android.ugc.aweme.common.widget.MainTabStrip;
import com.ss.android.ugc.aweme.feed.ui.CustomInterceptTouchEventFrameLayout;
import com.ss.android.ugc.aweme.views.HotRightSearchGuideView;

public final class j implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        SwipeRefreshLayout swipeRefreshLayout;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        frameLayout.setId(C0906R.id.ag1);
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        SwipeRefreshLayout swipeRefreshLayout2 = new SwipeRefreshLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        swipeRefreshLayout2.setId(C0906R.id.ctx);
        swipeRefreshLayout2.setLayoutParams(layoutParams);
        if (swipeRefreshLayout2.getParent() == null) {
            frameLayout.addView(swipeRefreshLayout2);
        }
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout = new CustomInterceptTouchEventFrameLayout(context2);
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-1, -1);
        customInterceptTouchEventFrameLayout.setId(C0906R.id.afe);
        customInterceptTouchEventFrameLayout.setLayoutParams(layoutParams2);
        if (customInterceptTouchEventFrameLayout.getParent() == null) {
            swipeRefreshLayout2.addView(customInterceptTouchEventFrameLayout);
        }
        FlippableViewPager flippableViewPager = new FlippableViewPager(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        flippableViewPager.setId(C0906R.id.duu);
        flippableViewPager.setLayoutParams(layoutParams3);
        if (flippableViewPager.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(flippableViewPager);
        }
        ImageView imageView = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        imageView.setId(C0906R.id.d3y);
        imageView.setImageResource(2130838251);
        imageView.setVisibility(0);
        imageView.setLayoutParams(layoutParams4);
        if (imageView.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(imageView);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams5);
        if (linearLayout.getParent() == null) {
            customInterceptTouchEventFrameLayout.addView(linearLayout);
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.cv0);
        view.setLayoutParams(layoutParams6);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        frameLayout2.setId(C0906R.id.d3n);
        frameLayout2.setLayoutParams(layoutParams7);
        if (frameLayout2.getParent() == null) {
            linearLayout.addView(frameLayout2);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        relativeLayout.setId(C0906R.id.xv);
        relativeLayout.setGravity(16);
        relativeLayout.setVisibility(8);
        relativeLayout.setLayoutParams(layoutParams8);
        if (relativeLayout.getParent() == null) {
            frameLayout2.addView(relativeLayout);
        }
        MainTabStrip mainTabStrip = new MainTabStrip(context2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        mainTabStrip.setId(C0906R.id.bw7);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(14, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(15, -1);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((LinearLayout.LayoutParams) layoutParams9).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = 17;
        }
        mainTabStrip.setBackgroundColor(resources.getColor(C0906R.color.ano));
        mainTabStrip.setGravity(16);
        mainTabStrip.setLayoutParams(layoutParams9);
        if (mainTabStrip.getParent() == null) {
            relativeLayout.addView(mainTabStrip);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        linearLayout2.setId(C0906R.id.afo);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(21, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, 11.0f, resources.getDisplayMetrics()));
        }
        linearLayout2.setGravity(16);
        linearLayout2.setVisibility(8);
        linearLayout2.setLayoutParams(layoutParams10);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        ImageView imageView2 = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        imageView2.setId(C0906R.id.azc);
        imageView2.setAlpha(0.6f);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setImageResource(2130838971);
        imageView2.setLayoutParams(layoutParams11);
        if (imageView2.getParent() == null) {
            linearLayout2.addView(imageView2);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.di0);
        dmtTextView.setAlpha(0.6f);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.hx));
        dmtTextView.setTypeface(Typeface.DEFAULT_BOLD);
        dmtTextView.setGravity(17);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setVisibility(8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            swipeRefreshLayout = swipeRefreshLayout2;
            layoutParams12.bottomMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        } else {
            swipeRefreshLayout = swipeRefreshLayout2;
        }
        dmtTextView.setText(C0906R.string.c1z);
        dmtTextView.setLayoutParams(layoutParams12);
        if (dmtTextView.getParent() == null) {
            linearLayout2.addView(dmtTextView);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        linearLayout3.setId(C0906R.id.biu);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            i = C0906R.id.afo;
            layoutParams13.addRule(0, C0906R.id.afo);
        } else {
            i = C0906R.id.afo;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(16, i);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.addRule(15, -1);
        }
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams13);
        if (linearLayout3.getParent() == null) {
            relativeLayout.addView(linearLayout3);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        CustomInterceptTouchEventFrameLayout customInterceptTouchEventFrameLayout2 = customInterceptTouchEventFrameLayout;
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        animationImageView.setId(C0906R.id.azf);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            i2 = 16;
            layoutParams14.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = i2;
        }
        DmtTextView dmtTextView2 = dmtTextView;
        MainTabStrip mainTabStrip2 = mainTabStrip;
        animationImageView.setPadding((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        animationImageView.setImageResource(2130838960);
        animationImageView.setLayoutParams(layoutParams14);
        if (animationImageView.getParent() == null) {
            linearLayout3.addView(animationImageView);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView3.setId(C0906R.id.ddt);
        dmtTextView3.setAlpha(0.6f);
        dmtTextView3.setTextColor(resources.getColorStateList(C0906R.color.hx));
        dmtTextView3.setTypeface(Typeface.DEFAULT_BOLD);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i3 = 16;
            layoutParams15.gravity = 16;
        } else {
            i3 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            ((FrameLayout.LayoutParams) layoutParams15).gravity = i3;
        }
        dmtTextView3.setGravity(17);
        dmtTextView3.setTextSize(1, 15.0f);
        dmtTextView3.setVisibility(8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15) && Build.VERSION.SDK_INT >= 17) {
            layoutParams15.setMarginStart((int) resources.getDimension(C0906R.dimen.hy));
        }
        dmtTextView3.setText(C0906R.string.b65);
        dmtTextView3.setLayoutParams(layoutParams15);
        if (dmtTextView3.getParent() == null) {
            linearLayout3.addView(dmtTextView3);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -1);
        linearLayout4.setId(C0906R.id.cfe);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16) && Build.VERSION.SDK_INT >= 17) {
            layoutParams16.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout4.setGravity(16);
        linearLayout4.setOrientation(0);
        linearLayout4.setLayoutParams(layoutParams16);
        if (linearLayout4.getParent() == null) {
            relativeLayout.addView(linearLayout4);
        }
        ImageView imageView3 = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        imageView3.setId(C0906R.id.aze);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            i4 = 16;
            layoutParams17.gravity = 16;
        } else {
            i4 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((FrameLayout.LayoutParams) layoutParams17).gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17) && Build.VERSION.SDK_INT >= 17) {
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        imageView3.setAlpha(0.6f);
        imageView3.setImageResource(2130839858);
        imageView3.setLayoutParams(layoutParams17);
        if (imageView3.getParent() == null) {
            linearLayout4.addView(imageView3);
        }
        TextView textView = new TextView(context2);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
        textView.setId(C0906R.id.d9q);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i5 = 16;
            layoutParams18.gravity = 16;
        } else {
            i5 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = i5;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            i6 = 17;
            if (Build.VERSION.SDK_INT >= 17) {
                layoutParams18.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
            }
        } else {
            i6 = 17;
        }
        textView.setAlpha(0.6f);
        textView.setGravity(i6);
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), resources.getColor(C0906R.color.mc));
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), 2.0f, textView.getShadowColor());
        textView.setShadowLayer(2.0f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
        textView.setText(C0906R.string.b9p);
        DmtTextView dmtTextView4 = dmtTextView3;
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        textView.setTextColor(resources.getColorStateList(C0906R.color.ao4));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 15.0f);
        textView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        textView.setLayoutParams(layoutParams18);
        if (textView.getParent() == null) {
            linearLayout4.addView(textView);
        }
        HotRightSearchGuideView hotRightSearchGuideView = new HotRightSearchGuideView(context2);
        FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics()));
        hotRightSearchGuideView.setId(C0906R.id.dvu);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((LinearLayout.LayoutParams) layoutParams19).gravity = 8388629;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.gravity = 8388629;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19) && Build.VERSION.SDK_INT >= 17) {
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        hotRightSearchGuideView.setBackgroundResource(2130838021);
        hotRightSearchGuideView.setVisibility(8);
        hotRightSearchGuideView.setLayoutParams(layoutParams19);
        if (hotRightSearchGuideView.getParent() == null) {
            frameLayout2.addView(hotRightSearchGuideView);
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        viewStub.setId(C0906R.id.czy);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams20)) {
            i7 = 17;
            ((LinearLayout.LayoutParams) layoutParams20).gravity = 17;
        } else {
            i7 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.gravity = i7;
        }
        viewStub.setInflatedId(C0906R.id.czw);
        viewStub.setLayoutResource(C0906R.layout.as2);
        viewStub.setLayoutParams(layoutParams20);
        if (viewStub.getParent() == null) {
            frameLayout2.addView(viewStub);
        }
        LinearLayout linearLayout5 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout5.setId(C0906R.id.bgo);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        linearLayout5.setBackgroundResource(2130838163);
        linearLayout5.setAlpha(0.0f);
        linearLayout5.setVisibility(8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams21)) {
            layoutParams21.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams21)) {
            ((FrameLayout.LayoutParams) layoutParams21).gravity = 1;
        }
        linearLayout5.setGravity(16);
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(layoutParams21);
        if (linearLayout5.getParent() == null) {
            linearLayout.addView(linearLayout5);
        }
        ImageView imageView4 = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.leftMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22) && Build.VERSION.SDK_INT >= 17) {
            layoutParams22.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22) && Build.VERSION.SDK_INT >= 17) {
            layoutParams22.setMarginEnd((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.rightMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.topMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        imageView4.setImageResource(2130839263);
        imageView4.setLayoutParams(layoutParams22);
        if (imageView4.getParent() == null) {
            linearLayout5.addView(imageView4);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-2, -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams23) && Build.VERSION.SDK_INT >= 17) {
            layoutParams23.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        dmtTextView5.setTextSize(2, 14.0f);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i8 = 16;
            layoutParams23.gravity = 16;
        } else {
            i8 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i8;
        }
        dmtTextView5.setTextColor(resources.getColorStateList(C0906R.color.aod));
        dmtTextView5.setText(C0906R.string.bgs);
        dmtTextView5.setLayoutParams(layoutParams23);
        if (dmtTextView5.getParent() == null) {
            linearLayout5.addView(dmtTextView5);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -2);
        frameLayout3.setId(C0906R.id.afc);
        frameLayout3.setLayoutParams(layoutParams24);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        View view2 = new View(context2);
        FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.lw));
        view2.setId(C0906R.id.dqw);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((LinearLayout.LayoutParams) layoutParams25).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.gravity = 80;
        }
        view2.setBackgroundColor(resources.getColor(C0906R.color.a2t));
        view2.setVisibility(4);
        view2.setLayoutParams(layoutParams25);
        if (view2.getParent() == null) {
            frameLayout.addView(view2);
        }
        a.a(flippableViewPager);
        a.a(mainTabStrip2);
        a.a(dmtTextView2);
        a.a(animationImageView);
        a.a(dmtTextView4);
        a.a(hotRightSearchGuideView);
        a.a(dmtTextView5);
        a.a(customInterceptTouchEventFrameLayout2);
        a.a(swipeRefreshLayout);
        return frameLayout;
    }
}

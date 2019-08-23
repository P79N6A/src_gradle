package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.main.base.FriendTabStrip;
import com.ss.android.ugc.aweme.newfollow.ui.FriendTabViewPager;

public final class h implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        linearLayout.setBackgroundColor(resources.getColor(C0906R.color.bn));
        linearLayout.setOrientation(1);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        View view = new View(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.cv0);
        view.setBackgroundColor(resources.getColor(C0906R.color.bn));
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            linearLayout.addView(view);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        if (frameLayout.getParent() == null) {
            linearLayout.addView(frameLayout);
        }
        FriendTabViewPager friendTabViewPager = new FriendTabViewPager(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        friendTabViewPager.setId(C0906R.id.duu);
        friendTabViewPager.setLayoutParams(layoutParams2);
        if (friendTabViewPager.getParent() == null) {
            frameLayout.addView(friendTabViewPager);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        relativeLayout.setId(C0906R.id.d3v);
        relativeLayout.setBackgroundColor(resources.getColor(C0906R.color.bn));
        relativeLayout.setVisibility(0);
        relativeLayout.setLayoutParams(layoutParams3);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout);
        }
        FriendTabStrip friendTabStrip = new FriendTabStrip(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        friendTabStrip.setId(C0906R.id.aiu);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.addRule(13, -1);
        }
        friendTabStrip.setLayoutParams(layoutParams4);
        if (friendTabStrip.getParent() == null) {
            relativeLayout.addView(friendTabStrip);
        }
        View view2 = new View(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        view2.setId(C0906R.id.air);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.addRule(19, C0906R.id.aiu);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5) && Build.VERSION.SDK_INT >= 17) {
            layoutParams5.setMarginEnd((int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        view2.setBackgroundResource(2130837854);
        view2.setVisibility(8);
        view2.setLayoutParams(layoutParams5);
        if (view2.getParent() == null) {
            relativeLayout.addView(view2);
        }
        View view3 = new View(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics()));
        view3.setId(C0906R.id.ah9);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.addRule(18, C0906R.id.aiu);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6) && Build.VERSION.SDK_INT >= 17) {
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 53.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 14.0f, resources.getDisplayMetrics());
        }
        view3.setBackgroundResource(2130837854);
        view3.setVisibility(8);
        view3.setLayoutParams(layoutParams6);
        if (view3.getParent() == null) {
            relativeLayout.addView(view3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -1);
        linearLayout2.setId(C0906R.id.bi6);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(15, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(layoutParams7);
        if (linearLayout2.getParent() == null) {
            relativeLayout.addView(linearLayout2);
        }
        ImageView imageView = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        imageView.setId(C0906R.id.b5m);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.leftMargin = (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8) && Build.VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        }
        imageView.setAlpha(0.6f);
        imageView.setImageResource(2130839858);
        imageView.setLayoutParams(layoutParams8);
        if (imageView.getParent() == null) {
            linearLayout2.addView(imageView);
        }
        TextView textView = new TextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        textView.setId(C0906R.id.djy);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams9)) {
            ((FrameLayout.LayoutParams) layoutParams9).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.leftMargin = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams9) && Build.VERSION.SDK_INT >= 17) {
            layoutParams9.setMarginStart((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()));
        }
        textView.setAlpha(0.6f);
        textView.setGravity(17);
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), textView.getShadowDy(), resources.getColor(C0906R.color.mc));
        textView.setShadowLayer(textView.getShadowRadius(), textView.getShadowDx(), 2.0f, textView.getShadowColor());
        textView.setShadowLayer(2.0f, textView.getShadowDx(), textView.getShadowDy(), textView.getShadowColor());
        textView.setText(C0906R.string.b9p);
        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        textView.setTextColor(resources.getColorStateList(C0906R.color.ao4));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setTextSize(1, 15.0f);
        textView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        textView.setLayoutParams(layoutParams9);
        if (textView.getParent() == null) {
            linearLayout2.addView(textView);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -1);
        dmtTextView.setTextSize(1, 15.0f);
        dmtTextView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView.setId(C0906R.id.dc3);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i = -1;
            layoutParams10.addRule(21, -1);
        } else {
            i = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.addRule(15, i);
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i2 = 16;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            ((FrameLayout.LayoutParams) layoutParams10).gravity = i2;
        }
        dmtTextView.setGravity(i2);
        dmtTextView.setPadding(dmtTextView.getPaddingLeft(), dmtTextView.getPaddingTop(), (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()), dmtTextView.getPaddingBottom());
        dmtTextView.setText(C0906R.string.ai_);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a0b));
        dmtTextView.setLayoutParams(layoutParams10);
        if (dmtTextView.getParent() == null) {
            relativeLayout.addView(dmtTextView);
        }
        View view4 = new View(context2);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.addRule(12, -1);
        }
        view4.setBackgroundColor(resources.getColor(C0906R.color.zf));
        view4.setLayoutParams(layoutParams11);
        if (view4.getParent() == null) {
            relativeLayout.addView(view4);
        }
        a.a(friendTabViewPager);
        a.a(friendTabStrip);
        a.a(dmtTextView);
        return linearLayout;
    }
}

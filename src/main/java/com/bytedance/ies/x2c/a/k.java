package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBar;
import com.ss.android.ugc.aweme.main.base.MainBottomTabView;
import com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast;

public final class k implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FragmentTabHost fragmentTabHost = new FragmentTabHost(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        fragmentTabHost.setId(C0906R.id.bl4);
        if (viewGroup2 != null) {
            fragmentTabHost.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(fragmentTabHost);
            }
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        frameLayout.setBackgroundResource(0);
        frameLayout.setId(C0906R.id.bl1);
        frameLayout.setLayoutParams(layoutParams);
        if (frameLayout.getParent() == null) {
            fragmentTabHost.addView(frameLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(C0906R.id.cyo);
        frameLayout2.setLayoutParams(layoutParams2);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.mt);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams3)) {
            ((LinearLayout.LayoutParams) layoutParams3).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 47.0f, resources.getDisplayMetrics());
        }
        view.setBackgroundColor(resources.getColor(C0906R.color.v5));
        view.setLayoutParams(layoutParams3);
        if (view.getParent() == null) {
            frameLayout.addView(view);
        }
        MainBottomTabView mainBottomTabView = new MainBottomTabView(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.lw));
        mainBottomTabView.setViewMode("mode_text");
        mainBottomTabView.setId(C0906R.id.bl0);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 80;
        }
        mainBottomTabView.setLayoutParams(layoutParams4);
        if (mainBottomTabView.getParent() == null) {
            frameLayout.addView(mainBottomTabView);
        }
        VideoSeekBar videoSeekBar = new VideoSeekBar(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 18.0f, resources.getDisplayMetrics()));
        videoSeekBar.setId(C0906R.id.dsu);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams5)) {
            ((LinearLayout.LayoutParams) layoutParams5).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 36.0f, resources.getDisplayMetrics());
        }
        videoSeekBar.setVisibility(8);
        videoSeekBar.setLayoutParams(layoutParams5);
        if (videoSeekBar.getParent() == null) {
            frameLayout.addView(videoSeekBar);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        linearLayout.setId(C0906R.id.dsv);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams6)) {
            ((LinearLayout.LayoutParams) layoutParams6).gravity = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.gravity = 81;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.bottomMargin = (int) TypedValue.applyDimension(1, 116.0f, resources.getDisplayMetrics());
        }
        linearLayout.setOrientation(0);
        linearLayout.setVisibility(8);
        linearLayout.setLayoutParams(layoutParams6);
        if (linearLayout.getParent() == null) {
            frameLayout.addView(linearLayout);
        }
        TextView textView = new TextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        textView.setId(C0906R.id.a1y);
        textView.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        textView.setTextColor(resources.getColorStateList(C0906R.color.aod));
        textView.setTextSize(1, 24.0f);
        textView.setLayoutParams(layoutParams7);
        if (textView.getParent() == null) {
            linearLayout.addView(textView);
        }
        ImageView imageView = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.5f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.gravity = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams8)) {
            ((FrameLayout.LayoutParams) layoutParams8).gravity = 16;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8) && Build.VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginStart((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8) && Build.VERSION.SDK_INT >= 17) {
            layoutParams8.setMarginEnd((int) TypedValue.applyDimension(1, 11.5f, resources.getDisplayMetrics()));
        }
        imageView.setImageResource(2130839399);
        imageView.setLayoutParams(layoutParams8);
        if (imageView.getParent() == null) {
            linearLayout.addView(imageView);
        }
        TextView textView2 = new TextView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        textView2.setId(C0906R.id.d66);
        textView2.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        textView2.setTextColor(resources.getColorStateList(C0906R.color.ao8));
        textView2.setTextSize(1, 24.0f);
        textView2.setLayoutParams(layoutParams9);
        if (textView2.getParent() == null) {
            linearLayout.addView(textView2);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.lw));
        linearLayout2.setId(C0906R.id.aav);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i = 80;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 80;
        } else {
            i = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i;
        }
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setGravity(17);
        linearLayout2.setOrientation(0);
        linearLayout2.setVisibility(8);
        linearLayout2.setLayoutParams(layoutParams10);
        if (linearLayout2.getParent() == null) {
            frameLayout.addView(linearLayout2);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams11);
        if (linearLayout3.getParent() == null) {
            linearLayout2.addView(linearLayout3);
        }
        ImageView imageView2 = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        imageView2.setId(C0906R.id.aaw);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams12)) {
            i2 = 16;
            layoutParams12.gravity = 16;
        } else {
            i2 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams12)) {
            ((FrameLayout.LayoutParams) layoutParams12).gravity = i2;
        }
        imageView2.setImageResource(2130839648);
        imageView2.setLayoutParams(layoutParams12);
        if (imageView2.getParent() == null) {
            linearLayout3.addView(imageView2);
        }
        DmtTextView dmtTextView = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView.setId(C0906R.id.aax);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13) && Build.VERSION.SDK_INT >= 17) {
            layoutParams13.setMarginStart((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.leftMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        }
        dmtTextView.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView.setSingleLine(true);
        dmtTextView.setText(C0906R.string.tj);
        dmtTextView.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView.setTextSize(2, 16.0f);
        dmtTextView.setLayoutParams(layoutParams13);
        if (dmtTextView.getParent() == null) {
            linearLayout3.addView(dmtTextView);
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -1);
        viewStub.setId(C0906R.id.cx3);
        viewStub.setInflatedId(C0906R.id.b4r);
        viewStub.setLayoutResource(C0906R.layout.m6);
        viewStub.setLayoutParams(layoutParams14);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        View view2 = new View(context2);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 178.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 127.5f, resources.getDisplayMetrics()));
        view2.setId(C0906R.id.bd8);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams15)) {
            i3 = 81;
            ((LinearLayout.LayoutParams) layoutParams15).gravity = 81;
        } else {
            i3 = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.gravity = i3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.bottomMargin = (int) resources.getDimension(C0906R.dimen.lv);
        }
        view2.setVisibility(8);
        view2.setLayoutParams(layoutParams15);
        if (view2.getParent() == null) {
            frameLayout.addView(view2);
        }
        ViewStub viewStub2 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-2, -2);
        viewStub2.setId(C0906R.id.pd);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams16)) {
            i4 = 81;
            ((LinearLayout.LayoutParams) layoutParams16).gravity = 81;
        } else {
            i4 = 81;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.gravity = i4;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub2.setLayoutResource(C0906R.layout.abm);
        viewStub2.setLayoutParams(layoutParams16);
        if (viewStub2.getParent() == null) {
            frameLayout.addView(viewStub2);
        }
        ViewStub viewStub3 = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-2, -2);
        viewStub3.setId(C0906R.id.pc);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams17)) {
            ((LinearLayout.LayoutParams) layoutParams17).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.gravity = 8388691;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17) && Build.VERSION.SDK_INT >= 17) {
            layoutParams17.setMarginStart((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.leftMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.bottomMargin = (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics());
        }
        viewStub3.setLayoutResource(C0906R.layout.abp);
        viewStub3.setLayoutParams(layoutParams17);
        if (viewStub3.getParent() == null) {
            frameLayout.addView(viewStub3);
        }
        PolicyNoticeToast policyNoticeToast = new PolicyNoticeToast(context2);
        FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -2);
        policyNoticeToast.setId(C0906R.id.c4a);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i5 = 80;
            ((LinearLayout.LayoutParams) layoutParams18).gravity = 80;
        } else {
            i5 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.gravity = i5;
        }
        policyNoticeToast.setVisibility(8);
        policyNoticeToast.setLayoutParams(layoutParams18);
        if (policyNoticeToast.getParent() == null) {
            frameLayout.addView(policyNoticeToast);
        }
        View view3 = new View(context2);
        FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
        view3.setId(C0906R.id.dw7);
        view3.setAlpha(0.0f);
        view3.setBackgroundColor(Color.parseColor("#111111"));
        view3.setVisibility(8);
        view3.setLayoutParams(layoutParams19);
        if (view3.getParent() == null) {
            fragmentTabHost.addView(view3);
        }
        a.a(mainBottomTabView);
        a.a(videoSeekBar);
        a.a(dmtTextView);
        a.a(policyNoticeToast);
        a.a(fragmentTabHost);
        return fragmentTabHost;
    }
}

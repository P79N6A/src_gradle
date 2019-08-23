package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.commercialize.ad.AdRatingView;
import com.ss.android.ugc.aweme.commercialize.ad.AdTagGroup;
import com.ss.android.ugc.aweme.commercialize.ad.DescTextView;

public final class m implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        RoundingParams roundingParams;
        RoundingParams roundingParams2;
        DescTextView descTextView;
        float f2;
        DmtTextView dmtTextView;
        DmtTextView dmtTextView2;
        DmtTextView dmtTextView3;
        int i;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        LinearLayout linearLayout = new LinearLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        linearLayout.setId(C0906R.id.acr);
        linearLayout.setBackgroundColor(resources.getColor(C0906R.color.f4488b));
        linearLayout.setGravity(17);
        linearLayout.setOrientation(1);
        linearLayout.setPadding((int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom());
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()), linearLayout.getPaddingBottom());
        linearLayout.setVisibility(8);
        if (viewGroup2 != null) {
            linearLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(linearLayout);
            }
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 64.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(C0906R.id.c6);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) remoteImageView.getHierarchy();
        RoundingParams roundingParams3 = genericDraweeHierarchy.getRoundingParams();
        if (roundingParams3 == null) {
            roundingParams = RoundingParams.fromCornersRadius((float) ((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics())));
        } else {
            roundingParams = roundingParams3.setCornersRadius((float) ((int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics())));
        }
        genericDraweeHierarchy.setRoundingParams(roundingParams);
        remoteImageView.setLayoutParams(layoutParams);
        if (remoteImageView.getParent() == null) {
            linearLayout.addView(remoteImageView);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView4.setId(C0906R.id.cf);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        dmtTextView4.setGravity(17);
        dmtTextView4.setTextColor(resources.getColorStateList(C0906R.color.a0a));
        dmtTextView4.setTextSize(2, 20.0f);
        dmtTextView4.setLayoutParams(layoutParams2);
        if (dmtTextView4.getParent() == null) {
            linearLayout.addView(dmtTextView4);
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 120.0f, resources.getDisplayMetrics()));
        remoteImageView2.setId(C0906R.id.c9);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.bottomMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        remoteImageView2.setBackgroundResource(2130837802);
        remoteImageView2.setLayoutParams(layoutParams3);
        if (remoteImageView2.getParent() == null) {
            linearLayout.addView(remoteImageView2);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 220.0f, resources.getDisplayMetrics()));
        remoteImageView3.setId(C0906R.id.d_);
        remoteImageView3.setBackgroundResource(2130837952);
        remoteImageView3.setVisibility(8);
        GenericDraweeHierarchy genericDraweeHierarchy2 = (GenericDraweeHierarchy) remoteImageView3.getHierarchy();
        RoundingParams roundingParams4 = genericDraweeHierarchy2.getRoundingParams();
        if (roundingParams4 == null) {
            roundingParams2 = RoundingParams.fromCornersRadius((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        } else {
            roundingParams2 = roundingParams4.setCornersRadius((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())));
        }
        genericDraweeHierarchy2.setRoundingParams(roundingParams2);
        remoteImageView3.setLayoutParams(layoutParams4);
        if (remoteImageView3.getParent() == null) {
            linearLayout.addView(remoteImageView3);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout2.setId(C0906R.id.d7);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.bottomMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        linearLayout2.setGravity(17);
        linearLayout2.setLayoutParams(layoutParams5);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView5.setId(C0906R.id.cb);
        dmtTextView5.setBackgroundResource(2130837806);
        dmtTextView5.setGravity(17);
        dmtTextView5.setMaxLines(1);
        dmtTextView5.setPadding(dmtTextView5.getPaddingLeft(), dmtTextView5.getPaddingTop(), dmtTextView5.getPaddingRight(), (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        dmtTextView5.setPadding((int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView5.getPaddingTop(), dmtTextView5.getPaddingRight(), dmtTextView5.getPaddingBottom());
        dmtTextView5.setPadding(dmtTextView5.getPaddingLeft(), dmtTextView5.getPaddingTop(), (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()), dmtTextView5.getPaddingBottom());
        dmtTextView5.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView5.setTextSize(2, 12.0f);
        dmtTextView5.setLayoutParams(layoutParams6);
        if (dmtTextView5.getParent() == null) {
            linearLayout2.addView(dmtTextView5);
        }
        DmtTextView dmtTextView6 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView6.setId(C0906R.id.d6);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        dmtTextView6.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView6.setMaxLines(1);
        dmtTextView6.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView6.setTextSize(2, 15.0f);
        dmtTextView6.setLayoutParams(layoutParams7);
        if (dmtTextView6.getParent() == null) {
            linearLayout2.addView(dmtTextView6);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout3.setId(C0906R.id.cd);
        linearLayout3.setGravity(16);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams8);
        if (linearLayout3.getParent() == null) {
            linearLayout.addView(linearLayout3);
        }
        AdRatingView adRatingView = new AdRatingView(context2);
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        adRatingView.setId(C0906R.id.cp);
        adRatingView.setRatingDivide((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        adRatingView.setRatingImage(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840571));
        adRatingView.setRatingStarNumber(5);
        adRatingView.setRatingUnImage(com.ss.android.ugc.bytex.a.a.a.a(context.getResources(), 2130840572));
        adRatingView.setLayoutParams(layoutParams9);
        if (adRatingView.getParent() == null) {
            linearLayout3.addView(adRatingView);
        }
        View view = new View(context2);
        AdRatingView adRatingView2 = adRatingView;
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.cc);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginEnd((int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.rightMargin = (int) TypedValue.applyDimension(1, 10.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginStart((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        }
        view.setBackgroundColor(resources.getColor(C0906R.color.a0s));
        view.setLayoutParams(layoutParams10);
        if (view.getParent() == null) {
            linearLayout3.addView(view);
        }
        DmtTextView dmtTextView7 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView7.setId(C0906R.id.be);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        }
        dmtTextView7.setTextColor(resources.getColorStateList(C0906R.color.a1b));
        dmtTextView7.setTextSize(2, 12.0f);
        dmtTextView7.setLayoutParams(layoutParams11);
        if (dmtTextView7.getParent() == null) {
            linearLayout3.addView(dmtTextView7);
        }
        DescTextView descTextView2 = new DescTextView(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        descTextView2.setId(C0906R.id.br);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        descTextView2.setGravity(1);
        descTextView2.setMaxLines(3);
        descTextView2.setTextColor(resources.getColorStateList(C0906R.color.a1b));
        descTextView2.setTextSize(2, 14.0f);
        descTextView2.setLayoutParams(layoutParams12);
        if (descTextView2.getParent() == null) {
            linearLayout.addView(descTextView2);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-1, -2);
        linearLayout4.setId(C0906R.id.co);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            descTextView = descTextView2;
            f2 = 8.5f;
            layoutParams13.bottomMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        } else {
            descTextView = descTextView2;
            f2 = 8.5f;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.topMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        linearLayout4.setGravity(17);
        linearLayout4.setLayoutParams(layoutParams13);
        if (linearLayout4.getParent() == null) {
            linearLayout.addView(linearLayout4);
        }
        DmtTextView dmtTextView8 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams14)) {
            layoutParams14.gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams14)) {
            ((FrameLayout.LayoutParams) layoutParams14).gravity = 80;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams14)) {
            dmtTextView = dmtTextView7;
            layoutParams14.bottomMargin = (int) TypedValue.applyDimension(1, 0.5f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView7;
        }
        dmtTextView8.setGravity(17);
        dmtTextView8.setText(C0906R.string.c0e);
        dmtTextView8.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView8.setTextSize(2, 11.0f);
        dmtTextView8.setLayoutParams(layoutParams14);
        if (dmtTextView8.getParent() == null) {
            linearLayout4.addView(dmtTextView8);
        }
        DmtTextView dmtTextView9 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView9.setId(C0906R.id.f4424cn);
        dmtTextView9.setGravity(17);
        dmtTextView9.setTextColor(resources.getColorStateList(C0906R.color.a09));
        dmtTextView9.setTextSize(2, 15.0f);
        dmtTextView9.setLayoutParams(layoutParams15);
        if (dmtTextView9.getParent() == null) {
            linearLayout4.addView(dmtTextView9);
        }
        DmtTextView dmtTextView10 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView10.setId(C0906R.id.cs);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            dmtTextView3 = dmtTextView9;
            dmtTextView2 = dmtTextView8;
            layoutParams16.leftMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView3 = dmtTextView9;
            dmtTextView2 = dmtTextView8;
        }
        dmtTextView10.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView10.setMaxLines(1);
        dmtTextView10.setTextColor(resources.getColorStateList(C0906R.color.a1b));
        dmtTextView10.setTextSize(2, 12.0f);
        dmtTextView10.setLayoutParams(layoutParams16);
        if (dmtTextView10.getParent() == null) {
            linearLayout4.addView(dmtTextView10);
        }
        AdTagGroup adTagGroup = new AdTagGroup(context2);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        adTagGroup.setId(C0906R.id.d5);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.topMargin = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
        }
        adTagGroup.setLayoutParams(layoutParams17);
        if (adTagGroup.getParent() == null) {
            linearLayout.addView(adTagGroup);
        }
        Space space = new Space(context2);
        AdTagGroup adTagGroup2 = adTagGroup;
        space.setLayoutParams(new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 0.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 28.0f, resources.getDisplayMetrics())));
        if (space.getParent() == null) {
            linearLayout.addView(space);
        }
        DmtTextView dmtTextView11 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView11.setId(C0906R.id.acq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams18)) {
            i = 17;
            layoutParams18.gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams18)) {
            ((FrameLayout.LayoutParams) layoutParams18).gravity = i;
        }
        dmtTextView11.setBackgroundResource(2130837799);
        dmtTextView11.setGravity(i);
        DmtTextView dmtTextView12 = dmtTextView10;
        DmtTextView dmtTextView13 = dmtTextView6;
        dmtTextView11.setPadding(dmtTextView11.getPaddingLeft(), dmtTextView11.getPaddingTop(), dmtTextView11.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        dmtTextView11.setPadding(dmtTextView11.getPaddingLeft(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()), dmtTextView11.getPaddingRight(), dmtTextView11.getPaddingBottom());
        dmtTextView11.setText(C0906R.string.ae1);
        dmtTextView11.setTextColor(resources.getColorStateList(C0906R.color.anp));
        dmtTextView11.setTextSize(2, 15.0f);
        dmtTextView11.setLayoutParams(layoutParams18);
        if (dmtTextView11.getParent() == null) {
            linearLayout.addView(dmtTextView11);
        }
        DmtTextView dmtTextView14 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, -2);
        dmtTextView14.setId(C0906R.id.acs);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams19)) {
            i2 = 17;
            layoutParams19.gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams19)) {
            ((FrameLayout.LayoutParams) layoutParams19).gravity = i2;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.topMargin = (int) TypedValue.applyDimension(1, 22.5f, resources.getDisplayMetrics());
        }
        dmtTextView14.setGravity(17);
        dmtTextView14.setPadding(dmtTextView14.getPaddingLeft(), dmtTextView14.getPaddingTop(), dmtTextView14.getPaddingRight(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()));
        dmtTextView14.setPadding(dmtTextView14.getPaddingLeft(), (int) TypedValue.applyDimension(1, 9.5f, resources.getDisplayMetrics()), dmtTextView14.getPaddingRight(), dmtTextView14.getPaddingBottom());
        dmtTextView14.setText(C0906R.string.ae3);
        dmtTextView14.setTextColor(resources.getColorStateList(C0906R.color.anp));
        dmtTextView14.setTextSize(2, 15.0f);
        dmtTextView14.setLayoutParams(layoutParams19);
        if (dmtTextView14.getParent() == null) {
            linearLayout.addView(dmtTextView14);
        }
        a.a(remoteImageView);
        a.a(dmtTextView4);
        a.a(remoteImageView2);
        a.a(remoteImageView3);
        a.a(dmtTextView5);
        a.a(dmtTextView13);
        a.a(adRatingView2);
        a.a(dmtTextView);
        a.a(descTextView);
        a.a(dmtTextView2);
        a.a(dmtTextView3);
        a.a(dmtTextView12);
        a.a(adTagGroup2);
        a.a(dmtTextView11);
        a.a(dmtTextView14);
        return linearLayout;
    }
}

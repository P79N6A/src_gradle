package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
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
import android.widget.RelativeLayout;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.bytedance.ies.x2c.c;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.CommerceTag;
import com.ss.android.ugc.aweme.base.ui.PoiCardWebPageContainer;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.commerce.card.CommerceGoodHalfCardContainer;
import com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.ss.android.ugc.aweme.commercialize.views.BlackMaskLayer;
import com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.ss.android.ugc.aweme.commercialize.views.StripAdBottomLabelView;
import com.ss.android.ugc.aweme.feed.ui.DebugInfoView;
import com.ss.android.ugc.aweme.feed.ui.LongPressLayout;
import com.ss.android.ugc.aweme.feed.ui.VideoBottomButton;
import com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard;
import com.ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.ss.android.ugc.aweme.setting.ui.RestrictTextView;

public final class l implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        int i;
        int i2;
        RemoteImageView remoteImageView;
        int i3;
        float f2;
        int i4;
        int i5;
        CommerceMicroTagLayout commerceMicroTagLayout;
        int i6;
        float f3;
        int i7;
        CommerceTagLayout commerceTagLayout;
        int i8;
        float f4;
        DouPlusTagLayout douPlusTagLayout;
        int i9;
        int i10;
        float f5;
        int i11;
        int i12;
        int i13;
        int i14;
        DmtTextView dmtTextView;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        VideoBottomButton videoBottomButton;
        StripAdBottomLabelView stripAdBottomLabelView;
        int i21;
        float f6;
        int i22;
        int i23;
        DebugInfoView debugInfoView;
        int i24;
        VideoFloatingCard videoFloatingCard;
        int i25;
        int i26;
        float f7;
        int i27;
        int i28;
        int i29;
        float f8;
        int i30;
        int i31;
        PoiCardWebPageContainer poiCardWebPageContainer;
        int i32;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, -1, -1);
        frameLayout.setId(C0906R.id.duj);
        frameLayout.setBackgroundColor(resources.getColor(C0906R.color.bq));
        if (viewGroup2 != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(frameLayout);
            }
        }
        RemoteImageView remoteImageView2 = new RemoteImageView(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        remoteImageView2.setId(C0906R.id.a1a);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 17;
        }
        remoteImageView2.setBackgroundResource(2130839430);
        remoteImageView2.setVisibility(8);
        remoteImageView2.setLayoutParams(layoutParams);
        if (remoteImageView2.getParent() == null) {
            frameLayout.addView(remoteImageView2);
        }
        View view = new View(context2);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        view.setId(C0906R.id.alf);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams2)) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.gravity = 80;
        }
        view.setBackgroundResource(2130838005);
        view.setLayoutParams(layoutParams2);
        if (view.getParent() == null) {
            frameLayout.addView(view);
        }
        LongPressLayout longPressLayout = new LongPressLayout(context2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        longPressLayout.setId(C0906R.id.bkq);
        longPressLayout.setLayoutParams(layoutParams3);
        if (longPressLayout.getParent() == null) {
            frameLayout.addView(longPressLayout);
        }
        FrameLayout frameLayout2 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout2.setId(C0906R.id.av6);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams4)) {
            ((LinearLayout.LayoutParams) layoutParams4).gravity = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.gravity = 17;
        }
        frameLayout2.setLayoutParams(layoutParams4);
        if (frameLayout2.getParent() == null) {
            frameLayout.addView(frameLayout2);
        }
        FrameLayout frameLayout3 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 300.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 500.0f, resources.getDisplayMetrics()));
        frameLayout3.setId(C0906R.id.apf);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        frameLayout3.setPadding((int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics()));
        frameLayout3.setVisibility(8);
        frameLayout3.setLayoutParams(layoutParams5);
        if (frameLayout3.getParent() == null) {
            frameLayout.addView(frameLayout3);
        }
        RemoteImageView remoteImageView3 = new RemoteImageView(context2);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        remoteImageView3.setId(C0906R.id.dy4);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics());
        }
        remoteImageView3.setVisibility(8);
        ((GenericDraweeHierarchy) remoteImageView3.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        remoteImageView3.setLayoutParams(layoutParams6);
        if (remoteImageView3.getParent() == null) {
            frameLayout.addView(remoteImageView3);
        }
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
        relativeLayout.setId(C0906R.id.dxn);
        relativeLayout.setLayoutParams(layoutParams7);
        if (relativeLayout.getParent() == null) {
            frameLayout.addView(relativeLayout);
        }
        FrameLayout frameLayout4 = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 95.0f, resources.getDisplayMetrics()));
        frameLayout4.setId(C0906R.id.dtc);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.addRule(2, C0906R.id.m0);
        }
        frameLayout4.setLayoutParams(layoutParams8);
        if (frameLayout4.getParent() == null) {
            relativeLayout.addView(frameLayout4);
        }
        LinearLayout linearLayout = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        linearLayout.setId(C0906R.id.im);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(2, C0906R.id.m0);
        }
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams9);
        if (linearLayout.getParent() == null) {
            relativeLayout.addView(linearLayout);
        }
        LinearLayout linearLayout2 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        linearLayout2.setId(C0906R.id.c1h);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10) && Build.VERSION.SDK_INT >= 17) {
            layoutParams10.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.leftMargin = (int) resources.getDimension(C0906R.dimen.rd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.bottomMargin = (int) TypedValue.applyDimension(1, 8.0f, resources.getDisplayMetrics());
        }
        linearLayout2.setBackgroundResource(2130837955);
        linearLayout2.setGravity(16);
        linearLayout2.setOrientation(0);
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding((int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()), linearLayout2.getPaddingRight(), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), linearLayout2.getPaddingBottom());
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), linearLayout2.getPaddingTop(), linearLayout2.getPaddingRight(), (int) TypedValue.applyDimension(1, 2.5f, resources.getDisplayMetrics()));
        linearLayout2.setVisibility(8);
        linearLayout2.setLayoutParams(layoutParams10);
        if (linearLayout2.getParent() == null) {
            linearLayout.addView(linearLayout2);
        }
        ImageView imageView = new ImageView(context2);
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics()));
        imageView.setImageResource(2130839741);
        imageView.setLayoutParams(layoutParams11);
        if (imageView.getParent() == null) {
            linearLayout2.addView(imageView);
        }
        DmtTextView dmtTextView2 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView2.setTextSize(1, 12.0f);
        dmtTextView2.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView2.setId(C0906R.id.c1g);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams12)) {
            layoutParams12.leftMargin = (int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
        }
        dmtTextView2.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView2.setMaxLines(1);
        dmtTextView2.setTextColor(resources.getColorStateList(C0906R.color.ao4));
        dmtTextView2.setLayoutParams(layoutParams12);
        if (dmtTextView2.getParent() == null) {
            linearLayout2.addView(dmtTextView2);
        }
        RemoteImageView remoteImageView4 = new RemoteImageView(context2);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 76.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 80.0f, resources.getDisplayMetrics()));
        remoteImageView4.setId(C0906R.id.cq);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13) || Build.VERSION.SDK_INT < 17) {
            i = C0906R.dimen.rd;
        } else {
            i = C0906R.dimen.rd;
            layoutParams13.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.leftMargin = (int) resources.getDimension(i);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams13)) {
            layoutParams13.bottomMargin = (int) TypedValue.applyDimension(1, 7.0f, resources.getDisplayMetrics());
        }
        remoteImageView4.setVisibility(8);
        ((GenericDraweeHierarchy) remoteImageView4.getHierarchy()).setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
        remoteImageView4.setLayoutParams(layoutParams13);
        if (remoteImageView4.getParent() == null) {
            linearLayout.addView(remoteImageView4);
        }
        View a3 = new ab().a(context2, linearLayout, false);
        if (!(a3 == null || a3 == linearLayout)) {
            a3.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics())));
            if (a3.getParent() == null) {
                linearLayout.addView(a3);
            }
        }
        FrameLayout frameLayout5 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
        frameLayout5.setId(C0906R.id.dsz);
        frameLayout5.setClipChildren(false);
        frameLayout5.setClipToPadding(false);
        frameLayout5.setLayoutParams(layoutParams14);
        if (frameLayout5.getParent() == null) {
            linearLayout.addView(frameLayout5);
        }
        TagLayout tagLayout = new TagLayout(context2);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics()));
        tagLayout.setId(C0906R.id.dt0);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15) || Build.VERSION.SDK_INT < 17) {
            i2 = C0906R.dimen.rd;
        } else {
            i2 = C0906R.dimen.rd;
            layoutParams15.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            layoutParams15.leftMargin = (int) resources.getDimension(i2);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams15)) {
            remoteImageView = remoteImageView4;
            layoutParams15.bottomMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        } else {
            remoteImageView = remoteImageView4;
        }
        tagLayout.setLayoutParams(layoutParams15);
        if (tagLayout.getParent() == null) {
            frameLayout5.addView(tagLayout);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        TagLayout tagLayout2 = tagLayout;
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 88.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 66.0f, resources.getDisplayMetrics()));
        animationImageView.setId(C0906R.id.dss);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams16)) {
            layoutParams16.bottomMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        animationImageView.setLayoutParams(layoutParams16);
        if (animationImageView.getParent() == null) {
            frameLayout5.addView(animationImageView);
        }
        CommerceMicroTagLayout commerceMicroTagLayout2 = new CommerceMicroTagLayout(context2);
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-2, -2);
        commerceMicroTagLayout2.setId(C0906R.id.bn1);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17) || Build.VERSION.SDK_INT < 17) {
            i3 = C0906R.dimen.rd;
        } else {
            i3 = C0906R.dimen.rd;
            layoutParams17.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.leftMargin = (int) resources.getDimension(i3);
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17) || Build.VERSION.SDK_INT < 17) {
            i4 = 1;
            f2 = 100.0f;
        } else {
            i4 = 1;
            f2 = 100.0f;
            layoutParams17.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.rightMargin = (int) TypedValue.applyDimension(i4, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams17)) {
            layoutParams17.bottomMargin = (int) TypedValue.applyDimension(i4, 3.0f, resources.getDisplayMetrics());
        }
        commerceMicroTagLayout2.setVisibility(8);
        commerceMicroTagLayout2.setLayoutParams(layoutParams17);
        if (commerceMicroTagLayout2.getParent() == null) {
            linearLayout.addView(commerceMicroTagLayout2);
        }
        CommerceTagLayout commerceTagLayout2 = new CommerceTagLayout(context2);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-2, -2);
        commerceTagLayout2.setId(C0906R.id.bci);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18) || Build.VERSION.SDK_INT < 17) {
            i5 = C0906R.dimen.rd;
        } else {
            i5 = C0906R.dimen.rd;
            layoutParams18.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.leftMargin = (int) resources.getDimension(i5);
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18) || Build.VERSION.SDK_INT < 17) {
            commerceMicroTagLayout = commerceMicroTagLayout2;
            f3 = 100.0f;
            i6 = 1;
        } else {
            commerceMicroTagLayout = commerceMicroTagLayout2;
            f3 = 100.0f;
            i6 = 1;
            layoutParams18.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.rightMargin = (int) TypedValue.applyDimension(i6, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams18)) {
            layoutParams18.bottomMargin = (int) TypedValue.applyDimension(i6, 3.0f, resources.getDisplayMetrics());
        }
        commerceTagLayout2.setVisibility(8);
        commerceTagLayout2.setLayoutParams(layoutParams18);
        if (commerceTagLayout2.getParent() == null) {
            linearLayout.addView(commerceTagLayout2);
        }
        DouPlusTagLayout douPlusTagLayout2 = new DouPlusTagLayout(context2);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-2, -2);
        douPlusTagLayout2.setId(C0906R.id.a6i);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19) || Build.VERSION.SDK_INT < 17) {
            i7 = C0906R.dimen.rd;
        } else {
            i7 = C0906R.dimen.rd;
            layoutParams19.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.leftMargin = (int) resources.getDimension(i7);
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19) || Build.VERSION.SDK_INT < 17) {
            commerceTagLayout = commerceTagLayout2;
            f4 = 100.0f;
            i8 = 1;
        } else {
            commerceTagLayout = commerceTagLayout2;
            f4 = 100.0f;
            i8 = 1;
            layoutParams19.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.rightMargin = (int) TypedValue.applyDimension(i8, f4, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams19)) {
            layoutParams19.bottomMargin = (int) TypedValue.applyDimension(i8, 3.0f, resources.getDisplayMetrics());
        }
        douPlusTagLayout2.setVisibility(8);
        douPlusTagLayout2.setLayoutParams(layoutParams19);
        if (douPlusTagLayout2.getParent() == null) {
            linearLayout.addView(douPlusTagLayout2);
        }
        CommerceTag commerceTag = new CommerceTag(context2);
        LinearLayout.LayoutParams layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
        commerceTag.setId(C0906R.id.xl);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20) || Build.VERSION.SDK_INT < 17) {
            douPlusTagLayout = douPlusTagLayout2;
            i9 = 1;
        } else {
            douPlusTagLayout = douPlusTagLayout2;
            i9 = 1;
            layoutParams20.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.leftMargin = (int) TypedValue.applyDimension(i9, 10.0f, resources.getDisplayMetrics());
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20) || Build.VERSION.SDK_INT < 17) {
            f5 = 100.0f;
            i10 = 1;
        } else {
            f5 = 100.0f;
            i10 = 1;
            layoutParams20.setMarginEnd((int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.rightMargin = (int) TypedValue.applyDimension(i10, f5, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams20)) {
            layoutParams20.bottomMargin = (int) TypedValue.applyDimension(i10, 9.0f, resources.getDisplayMetrics());
        }
        commerceTag.setVisibility(8);
        commerceTag.setLayoutParams(layoutParams20);
        if (commerceTag.getParent() == null) {
            linearLayout.addView(commerceTag);
        }
        FrameLayout frameLayout6 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams21 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout6.setId(C0906R.id.ad1);
        frameLayout6.setLayoutParams(layoutParams21);
        if (frameLayout6.getParent() == null) {
            linearLayout.addView(frameLayout6);
        }
        LinearLayout linearLayout3 = new LinearLayout(context2);
        LinearLayout.LayoutParams layoutParams22 = new LinearLayout.LayoutParams(-2, -2);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22) || Build.VERSION.SDK_INT < 17) {
            i11 = C0906R.dimen.rd;
        } else {
            i11 = C0906R.dimen.rd;
            layoutParams22.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.leftMargin = (int) resources.getDimension(i11);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22) && Build.VERSION.SDK_INT >= 17) {
            layoutParams22.setMarginEnd((int) resources.getDimension(C0906R.dimen.re));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams22)) {
            layoutParams22.rightMargin = (int) resources.getDimension(C0906R.dimen.re);
        }
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(layoutParams22);
        if (linearLayout3.getParent() == null) {
            linearLayout.addView(linearLayout3);
        }
        DmtTextView dmtTextView3 = new DmtTextView(context2);
        LinearLayout.LayoutParams layoutParams23 = new LinearLayout.LayoutParams(-2, -2);
        dmtTextView3.setId(C0906R.id.title);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            i12 = 16;
            layoutParams23.gravity = 16;
        } else {
            i12 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams23)) {
            ((FrameLayout.LayoutParams) layoutParams23).gravity = i12;
        }
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams23)) {
            layoutParams23.weight = 1.0f;
        }
        dmtTextView3.setEllipsize(TextUtils.TruncateAt.END);
        dmtTextView3.setGravity(17);
        dmtTextView3.setIncludeFontPadding(false);
        CommerceTag commerceTag2 = commerceTag;
        dmtTextView3.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView3.setMaxLines(1);
        dmtTextView3.setMinHeight((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()));
        AnimationImageView animationImageView2 = animationImageView;
        dmtTextView3.setShadowLayer(dmtTextView3.getShadowRadius(), dmtTextView3.getShadowDx(), dmtTextView3.getShadowDy(), resources.getColor(C0906R.color.mc));
        dmtTextView3.setShadowLayer(dmtTextView3.getShadowRadius(), dmtTextView3.getShadowDx(), 1.0f, dmtTextView3.getShadowColor());
        dmtTextView3.setShadowLayer(1.0f, dmtTextView3.getShadowDx(), dmtTextView3.getShadowDy(), dmtTextView3.getShadowColor());
        dmtTextView3.setTextColor(resources.getColorStateList(C0906R.color.a08));
        dmtTextView3.setTextSize(2, 15.0f);
        dmtTextView3.setLayoutParams(layoutParams23);
        if (dmtTextView3.getParent() == null) {
            linearLayout3.addView(dmtTextView3);
        }
        FrameLayout frameLayout7 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout7.setId(C0906R.id.dsp);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams24)) {
            i13 = 16;
            layoutParams24.gravity = 16;
        } else {
            i13 = 16;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams24)) {
            ((FrameLayout.LayoutParams) layoutParams24).gravity = i13;
        }
        frameLayout7.setLayoutParams(layoutParams24);
        if (frameLayout7.getParent() == null) {
            linearLayout3.addView(frameLayout7);
        }
        FrameLayout frameLayout8 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams25 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout8.setId(C0906R.id.dta);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams25)) {
            ((RelativeLayout.LayoutParams) layoutParams25).addRule(2, C0906R.id.dtd);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams25)) {
            layoutParams25.bottomMargin = (int) TypedValue.applyDimension(1, 6.0f, resources.getDisplayMetrics());
        }
        frameLayout8.setLayoutParams(layoutParams25);
        if (frameLayout8.getParent() == null) {
            linearLayout.addView(frameLayout8);
        }
        FrameLayout frameLayout9 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams26 = new LinearLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams26)) {
            ((RelativeLayout.LayoutParams) layoutParams26).addRule(2, C0906R.id.bq7);
        }
        frameLayout9.setLayoutParams(layoutParams26);
        if (frameLayout9.getParent() == null) {
            linearLayout.addView(frameLayout9);
        }
        FrameLayout frameLayout10 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams((int) resources.getDimension(C0906R.dimen.k5), -2);
        frameLayout10.setId(C0906R.id.dtd);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27) || Build.VERSION.SDK_INT < 17) {
            i14 = C0906R.dimen.rd;
        } else {
            i14 = C0906R.dimen.rd;
            layoutParams27.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.leftMargin = (int) resources.getDimension(i14);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            dmtTextView = dmtTextView3;
            layoutParams27.topMargin = (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics());
        } else {
            dmtTextView = dmtTextView3;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27) && Build.VERSION.SDK_INT >= 17) {
            layoutParams27.setMarginEnd((int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            i15 = 1;
            layoutParams27.rightMargin = (int) TypedValue.applyDimension(1, 90.0f, resources.getDisplayMetrics());
        } else {
            i15 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams27)) {
            layoutParams27.bottomMargin = (int) TypedValue.applyDimension(i15, 1.0f, resources.getDisplayMetrics());
        }
        frameLayout10.setPadding(frameLayout10.getPaddingLeft(), (int) TypedValue.applyDimension(i15, 2.0f, resources.getDisplayMetrics()), frameLayout10.getPaddingRight(), frameLayout10.getPaddingBottom());
        frameLayout10.setLayoutParams(layoutParams27);
        if (frameLayout10.getParent() == null) {
            frameLayout9.addView(frameLayout10);
        }
        FrameLayout frameLayout11 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout11.setId(C0906R.id.bq7);
        frameLayout11.setLayoutParams(layoutParams28);
        if (frameLayout11.getParent() == null) {
            linearLayout.addView(frameLayout11);
        }
        ButtonAdBottomLabelView buttonAdBottomLabelView = new ButtonAdBottomLabelView(context2);
        FrameLayout.LayoutParams layoutParams29 = new FrameLayout.LayoutParams(-2, -2);
        buttonAdBottomLabelView.setId(C0906R.id.bq8);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29) || Build.VERSION.SDK_INT < 17) {
            i16 = C0906R.dimen.rd;
        } else {
            i16 = C0906R.dimen.rd;
            layoutParams29.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.leftMargin = (int) resources.getDimension(i16);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams29)) {
            layoutParams29.bottomMargin = (int) resources.getDimension(C0906R.dimen.k7);
        }
        buttonAdBottomLabelView.setLayoutParams(layoutParams29);
        if (buttonAdBottomLabelView.getParent() == null) {
            frameLayout11.addView(buttonAdBottomLabelView);
        }
        VideoBottomButton videoBottomButton2 = new VideoBottomButton(context2);
        LinearLayout.LayoutParams layoutParams30 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 34.0f, resources.getDisplayMetrics()));
        videoBottomButton2.setId(C0906R.id.drt);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams30) || Build.VERSION.SDK_INT < 17) {
            i17 = C0906R.dimen.rd;
        } else {
            i17 = C0906R.dimen.rd;
            layoutParams30.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.leftMargin = (int) resources.getDimension(i17);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams30)) {
            layoutParams30.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        videoBottomButton2.setVisibility(8);
        videoBottomButton2.setLayoutParams(layoutParams30);
        if (videoBottomButton2.getParent() == null) {
            linearLayout.addView(videoBottomButton2);
        }
        FrameLayout frameLayout12 = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams31 = new RelativeLayout.LayoutParams(-1, -2);
        frameLayout12.setId(C0906R.id.m0);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.addRule(12, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            i18 = 1;
            layoutParams31.topMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        } else {
            i18 = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams31)) {
            layoutParams31.bottomMargin = (int) TypedValue.applyDimension(i18, 47.0f, resources.getDisplayMetrics());
        }
        frameLayout12.setLayoutParams(layoutParams31);
        if (frameLayout12.getParent() == null) {
            relativeLayout.addView(frameLayout12);
        }
        View view2 = new View(context2);
        FrameLayout.LayoutParams layoutParams32 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.bh));
        view2.setId(C0906R.id.m3);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams32)) {
            i19 = 80;
            ((LinearLayout.LayoutParams) layoutParams32).gravity = 80;
        } else {
            i19 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams32)) {
            layoutParams32.gravity = i19;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams32)) {
            layoutParams32.bottomMargin = (int) resources.getDimension(C0906R.dimen.bk);
        }
        view2.setLayoutParams(layoutParams32);
        if (view2.getParent() == null) {
            frameLayout12.addView(view2);
        }
        StripAdBottomLabelView stripAdBottomLabelView2 = new StripAdBottomLabelView(context2);
        FrameLayout.LayoutParams layoutParams33 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.bh));
        stripAdBottomLabelView2.setId(C0906R.id.bug);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams33)) {
            i20 = 80;
            ((LinearLayout.LayoutParams) layoutParams33).gravity = 80;
        } else {
            i20 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.gravity = i20;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams33)) {
            layoutParams33.bottomMargin = (int) resources.getDimension(C0906R.dimen.bk);
        }
        stripAdBottomLabelView2.setLayoutParams(layoutParams33);
        if (stripAdBottomLabelView2.getParent() == null) {
            frameLayout12.addView(stripAdBottomLabelView2);
        }
        View a4 = new d().a(context2, frameLayout12, false);
        if (a4 == null || a4 == frameLayout12) {
            videoBottomButton = videoBottomButton2;
            stripAdBottomLabelView = stripAdBottomLabelView2;
        } else {
            FrameLayout.LayoutParams layoutParams34 = new FrameLayout.LayoutParams(-1, -2);
            a4.setId(C0906R.id.acx);
            if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams34)) {
                stripAdBottomLabelView = stripAdBottomLabelView2;
                videoBottomButton = videoBottomButton2;
                layoutParams34.bottomMargin = (int) TypedValue.applyDimension(1, -83.0f, resources.getDisplayMetrics());
            } else {
                videoBottomButton = videoBottomButton2;
                stripAdBottomLabelView = stripAdBottomLabelView2;
            }
            a4.setLayoutParams(layoutParams34);
            if (a4.getParent() == null) {
                frameLayout12.addView(a4);
            }
        }
        View a5 = new z().a(context2, frameLayout12, false);
        if (!(a5 == null || a5 == frameLayout12)) {
            FrameLayout.LayoutParams layoutParams35 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.bh));
            a5.setId(C0906R.id.acy);
            a5.setLayoutParams(layoutParams35);
            if (a5.getParent() == null) {
                frameLayout12.addView(a5);
            }
        }
        View a6 = new c().a(context2, frameLayout12, false);
        if (!(a6 == null || a6 == frameLayout12)) {
            FrameLayout.LayoutParams layoutParams36 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.bh));
            a6.setId(C0906R.id.il);
            a6.setVisibility(8);
            a6.setLayoutParams(layoutParams36);
            if (a6.getParent() == null) {
                frameLayout12.addView(a6);
            }
        }
        View a7 = new q().a(context2, frameLayout12, false);
        if (!(a7 == null || a7 == frameLayout12)) {
            FrameLayout.LayoutParams layoutParams37 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.l5));
            a7.setId(C0906R.id.cpc);
            a7.setVisibility(8);
            a7.setLayoutParams(layoutParams37);
            if (a7.getParent() == null) {
                frameLayout12.addView(a7);
            }
        }
        View a8 = new aa().a(context2, frameLayout12, false);
        if (!(a8 == null || a8 == frameLayout12)) {
            FrameLayout.LayoutParams layoutParams38 = new FrameLayout.LayoutParams(-1, (int) resources.getDimension(C0906R.dimen.bh));
            a8.setId(C0906R.id.ad0);
            a8.setVisibility(8);
            a8.setLayoutParams(layoutParams38);
            if (a8.getParent() == null) {
                frameLayout12.addView(a8);
            }
        }
        VideoFloatingCard videoFloatingCard2 = new VideoFloatingCard(context2);
        RelativeLayout.LayoutParams layoutParams39 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        videoFloatingCard2.setId(C0906R.id.ds5);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams39)) {
            layoutParams39.addRule(2, C0906R.id.m0);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams39) && Build.VERSION.SDK_INT >= 17) {
            layoutParams39.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        videoFloatingCard2.setVisibility(8);
        videoFloatingCard2.setLayoutParams(layoutParams39);
        if (videoFloatingCard2.getParent() == null) {
            relativeLayout.addView(videoFloatingCard2);
        }
        DebugInfoView debugInfoView2 = new DebugInfoView(context2);
        RelativeLayout.LayoutParams layoutParams40 = new RelativeLayout.LayoutParams(-1, -2);
        debugInfoView2.setId(C0906R.id.a2p);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40) || Build.VERSION.SDK_INT < 17) {
            i21 = C0906R.dimen.rd;
        } else {
            i21 = C0906R.dimen.rd;
            layoutParams40.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.leftMargin = (int) resources.getDimension(i21);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40) || Build.VERSION.SDK_INT < 17) {
            i22 = 1;
            f6 = 10.0f;
        } else {
            i22 = 1;
            f6 = 10.0f;
            layoutParams40.setMarginEnd((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.rightMargin = (int) TypedValue.applyDimension(i22, f6, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams40)) {
            layoutParams40.bottomMargin = (int) TypedValue.applyDimension(i22, 210.0f, resources.getDisplayMetrics());
        }
        debugInfoView2.setLayoutParams(layoutParams40);
        if (debugInfoView2.getParent() == null) {
            relativeLayout.addView(debugInfoView2);
        }
        RestrictTextView restrictTextView = new RestrictTextView(context2);
        RelativeLayout.LayoutParams layoutParams41 = new RelativeLayout.LayoutParams(-2, -2);
        restrictTextView.setId(C0906R.id.dhh);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41) || Build.VERSION.SDK_INT < 17) {
            i23 = C0906R.dimen.rd;
        } else {
            i23 = C0906R.dimen.rd;
            layoutParams41.setMarginStart((int) resources.getDimension(C0906R.dimen.rd));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            layoutParams41.leftMargin = (int) resources.getDimension(i23);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams41)) {
            debugInfoView = debugInfoView2;
            layoutParams41.topMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        } else {
            debugInfoView = debugInfoView2;
        }
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), resources.getColor(C0906R.color.a25));
        restrictTextView.setShadowLayer(restrictTextView.getShadowRadius(), restrictTextView.getShadowDx(), 1.0f, restrictTextView.getShadowColor());
        restrictTextView.setShadowLayer(1.0f, restrictTextView.getShadowDx(), restrictTextView.getShadowDy(), restrictTextView.getShadowColor());
        restrictTextView.setTextColor(resources.getColorStateList(C0906R.color.a09));
        restrictTextView.setTextSize(2, 16.0f);
        restrictTextView.setVisibility(8);
        restrictTextView.setLayoutParams(layoutParams41);
        if (restrictTextView.getParent() == null) {
            relativeLayout.addView(restrictTextView);
        }
        LinearLayout linearLayout4 = new LinearLayout(context2);
        RelativeLayout.LayoutParams layoutParams42 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), -2);
        linearLayout4.setId(C0906R.id.ceq);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.addRule(2, C0906R.id.dtc);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            i24 = -1;
            layoutParams42.addRule(21, -1);
        } else {
            i24 = -1;
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams42)) {
            layoutParams42.addRule(11, i24);
        }
        linearLayout4.setGravity(1);
        linearLayout4.setOrientation(1);
        linearLayout4.setLayoutParams(layoutParams42);
        if (linearLayout4.getParent() == null) {
            relativeLayout.addView(linearLayout4);
        }
        FrameLayout frameLayout13 = new FrameLayout(context2);
        RestrictTextView restrictTextView2 = restrictTextView;
        LinearLayout.LayoutParams layoutParams43 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), -2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams43)) {
            videoFloatingCard = videoFloatingCard2;
            layoutParams43.bottomMargin = (int) TypedValue.applyDimension(1, 21.0f, resources.getDisplayMetrics());
        } else {
            videoFloatingCard = videoFloatingCard2;
        }
        frameLayout13.setLayoutParams(layoutParams43);
        if (frameLayout13.getParent() == null) {
            linearLayout4.addView(frameLayout13);
        }
        ImageView imageView2 = new ImageView(context2);
        ButtonAdBottomLabelView buttonAdBottomLabelView2 = buttonAdBottomLabelView;
        FrameLayout.LayoutParams layoutParams44 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        imageView2.setId(C0906R.id.dqd);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams44)) {
            i25 = 17;
            ((LinearLayout.LayoutParams) layoutParams44).gravity = 17;
        } else {
            i25 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams44)) {
            layoutParams44.gravity = i25;
        }
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams44);
        if (imageView2.getParent() == null) {
            frameLayout13.addView(imageView2);
        }
        CircleWaveLayout circleWaveLayout = new CircleWaveLayout(context2);
        LinearLayout.LayoutParams layoutParams45 = new LinearLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()));
        circleWaveLayout.setId(C0906R.id.bn);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.gravity = 1;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams45)) {
            ((FrameLayout.LayoutParams) layoutParams45).gravity = 1;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams45)) {
            layoutParams45.bottomMargin = (int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics());
        }
        circleWaveLayout.setVisibility(8);
        circleWaveLayout.setLayoutParams(layoutParams45);
        if (circleWaveLayout.getParent() == null) {
            linearLayout4.addView(circleWaveLayout);
        }
        FrameLayout frameLayout14 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams46 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout14.setId(C0906R.id.i5);
        frameLayout14.setLayoutParams(layoutParams46);
        if (frameLayout14.getParent() == null) {
            linearLayout4.addView(frameLayout14);
        }
        FrameLayout frameLayout15 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams47 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout15.setId(C0906R.id.a51);
        frameLayout15.setLayoutParams(layoutParams47);
        if (frameLayout15.getParent() == null) {
            linearLayout4.addView(frameLayout15);
        }
        FrameLayout frameLayout16 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams48 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout16.setId(C0906R.id.vd);
        frameLayout16.setLayoutParams(layoutParams48);
        if (frameLayout16.getParent() == null) {
            linearLayout4.addView(frameLayout16);
        }
        FrameLayout frameLayout17 = new FrameLayout(context2);
        LinearLayout.LayoutParams layoutParams49 = new LinearLayout.LayoutParams(-2, -2);
        frameLayout17.setId(C0906R.id.cpx);
        frameLayout17.setLayoutParams(layoutParams49);
        if (frameLayout17.getParent() == null) {
            linearLayout4.addView(frameLayout17);
        }
        ImageView imageView3 = new ImageView(context2);
        RelativeLayout.LayoutParams layoutParams50 = new RelativeLayout.LayoutParams(-2, (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        imageView3.setId(C0906R.id.b16);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.addRule(8, C0906R.id.ceq);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50) && Build.VERSION.SDK_INT >= 17) {
            layoutParams50.setMarginEnd((int) TypedValue.applyDimension(1, -17.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.bottomMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams50)) {
            layoutParams50.addRule(16, C0906R.id.ceq);
        }
        imageView3.setVisibility(8);
        imageView3.setLayoutParams(layoutParams50);
        if (imageView3.getParent() == null) {
            relativeLayout.addView(imageView3);
        }
        DmtTextView dmtTextView4 = new DmtTextView(context2);
        RelativeLayout.LayoutParams layoutParams51 = new RelativeLayout.LayoutParams(-2, -2);
        dmtTextView4.setTextSize(2, 14.0f);
        dmtTextView4.setLineSpacing((float) ((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics())), 1.0f);
        dmtTextView4.setId(C0906R.id.dnf);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams51)) {
            layoutParams51.addRule(13, -1);
        }
        dmtTextView4.setText(C0906R.string.drx);
        dmtTextView4.setTextColor(resources.getColorStateList(C0906R.color.i4));
        dmtTextView4.setVisibility(8);
        dmtTextView4.setLayoutParams(layoutParams51);
        if (dmtTextView4.getParent() == null) {
            relativeLayout.addView(dmtTextView4);
        }
        BlackMaskLayer blackMaskLayer = new BlackMaskLayer(context2);
        FrameLayout.LayoutParams layoutParams52 = new FrameLayout.LayoutParams(-1, -1);
        blackMaskLayer.setId(C0906R.id.li);
        blackMaskLayer.setVisibility(8);
        blackMaskLayer.setLayoutParams(layoutParams52);
        if (blackMaskLayer.getParent() == null) {
            frameLayout.addView(blackMaskLayer);
        }
        AdHalfWebPageContainer adHalfWebPageContainer = new AdHalfWebPageContainer(context2);
        FrameLayout.LayoutParams layoutParams53 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 270.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 138.0f, resources.getDisplayMetrics()));
        adHalfWebPageContainer.setId(C0906R.id.c1);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams53)) {
            ((LinearLayout.LayoutParams) layoutParams53).gravity = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.gravity = 8388691;
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams53) || Build.VERSION.SDK_INT < 17) {
            f7 = 10.0f;
            i26 = 1;
        } else {
            f7 = 10.0f;
            i26 = 1;
            layoutParams53.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.leftMargin = (int) TypedValue.applyDimension(i26, f7, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams53)) {
            layoutParams53.bottomMargin = (int) resources.getDimension(C0906R.dimen.bj);
        }
        adHalfWebPageContainer.setLayoutParams(layoutParams53);
        if (adHalfWebPageContainer.getParent() == null) {
            frameLayout.addView(adHalfWebPageContainer);
        }
        MicroAppVideoCardView microAppVideoCardView = new MicroAppVideoCardView(context2);
        AdHalfWebPageContainer adHalfWebPageContainer2 = adHalfWebPageContainer;
        FrameLayout.LayoutParams layoutParams54 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 256.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 108.0f, resources.getDisplayMetrics()));
        microAppVideoCardView.setId(C0906R.id.bn0);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams54)) {
            i27 = 8388691;
            ((LinearLayout.LayoutParams) layoutParams54).gravity = 8388691;
        } else {
            i27 = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.gravity = i27;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams54) && Build.VERSION.SDK_INT >= 17) {
            layoutParams54.setMarginStart((int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        microAppVideoCardView.setVisibility(8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams54)) {
            layoutParams54.bottomMargin = (int) TypedValue.applyDimension(1, 58.0f, resources.getDisplayMetrics());
        }
        microAppVideoCardView.setLayoutParams(layoutParams54);
        if (microAppVideoCardView.getParent() == null) {
            frameLayout.addView(microAppVideoCardView);
        }
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer = new CommerceGoodHalfCardContainer(context2);
        MicroAppVideoCardView microAppVideoCardView2 = microAppVideoCardView;
        FrameLayout.LayoutParams layoutParams55 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 272.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 139.0f, resources.getDisplayMetrics()));
        commerceGoodHalfCardContainer.setId(C0906R.id.wt);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams55)) {
            i28 = 8388691;
            ((LinearLayout.LayoutParams) layoutParams55).gravity = 8388691;
        } else {
            i28 = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams55)) {
            layoutParams55.gravity = i28;
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams55)) {
            layoutParams55.bottomMargin = (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics());
        }
        commerceGoodHalfCardContainer.setVisibility(8);
        commerceGoodHalfCardContainer.setLayoutParams(layoutParams55);
        if (commerceGoodHalfCardContainer.getParent() == null) {
            frameLayout.addView(commerceGoodHalfCardContainer);
        }
        PoiCardWebPageContainer poiCardWebPageContainer2 = new PoiCardWebPageContainer(context2);
        CommerceGoodHalfCardContainer commerceGoodHalfCardContainer2 = commerceGoodHalfCardContainer;
        FrameLayout.LayoutParams layoutParams56 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 255.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 130.0f, resources.getDisplayMetrics()));
        poiCardWebPageContainer2.setId(C0906R.id.bze);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams56)) {
            i29 = 8388691;
            ((LinearLayout.LayoutParams) layoutParams56).gravity = 8388691;
        } else {
            i29 = 8388691;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.gravity = i29;
        }
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams56) || Build.VERSION.SDK_INT < 17) {
            i30 = 1;
            f8 = 10.0f;
        } else {
            i30 = 1;
            f8 = 10.0f;
            layoutParams56.setMarginStart((int) TypedValue.applyDimension(1, 10.0f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.leftMargin = (int) TypedValue.applyDimension(i30, f8, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams56)) {
            layoutParams56.bottomMargin = (int) resources.getDimension(C0906R.dimen.bj);
        }
        poiCardWebPageContainer2.setTranslationX((float) ((int) TypedValue.applyDimension(1, -285.0f, resources.getDisplayMetrics())));
        poiCardWebPageContainer2.setLayoutParams(layoutParams56);
        if (poiCardWebPageContainer2.getParent() == null) {
            frameLayout.addView(poiCardWebPageContainer2);
        }
        FrameLayout frameLayout18 = new FrameLayout(context2);
        FrameLayout.LayoutParams layoutParams57 = new FrameLayout.LayoutParams(-1, -1);
        frameLayout18.setId(C0906R.id.c0);
        frameLayout18.setLayoutParams(layoutParams57);
        if (frameLayout18.getParent() == null) {
            frameLayout.addView(frameLayout18);
        }
        View a9 = new m().a(context2, frameLayout18, false);
        if (!(a9 == null || a9 == frameLayout18)) {
            a9.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a9.getParent() == null) {
                frameLayout18.addView(a9);
            }
        }
        ViewStub viewStub = new ViewStub(context2);
        FrameLayout.LayoutParams layoutParams58 = new FrameLayout.LayoutParams(-1, -2);
        viewStub.setId(C0906R.id.bo5);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams58)) {
            i31 = 80;
            ((LinearLayout.LayoutParams) layoutParams58).gravity = 80;
        } else {
            i31 = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams58)) {
            layoutParams58.gravity = i31;
        }
        viewStub.setLayoutParams(layoutParams58);
        if (viewStub.getParent() == null) {
            frameLayout.addView(viewStub);
        }
        DmtTextView dmtTextView5 = new DmtTextView(context2);
        FrameLayout.LayoutParams layoutParams59 = new FrameLayout.LayoutParams(-2, -2);
        dmtTextView5.setId(C0906R.id.dno);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams59)) {
            poiCardWebPageContainer = poiCardWebPageContainer2;
            i32 = 1;
            layoutParams59.topMargin = (int) TypedValue.applyDimension(1, 100.0f, resources.getDisplayMetrics());
        } else {
            poiCardWebPageContainer = poiCardWebPageContainer2;
            i32 = 1;
        }
        dmtTextView5.setBackgroundColor(resources.getColor(C0906R.color.ao4));
        BlackMaskLayer blackMaskLayer2 = blackMaskLayer;
        dmtTextView5.setPadding((int) TypedValue.applyDimension(i32, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i32, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i32, 4.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(i32, 4.0f, resources.getDisplayMetrics()));
        dmtTextView5.setText(C0906R.string.aeh);
        dmtTextView5.setTextSize(2, 12.0f);
        dmtTextView5.setVisibility(8);
        dmtTextView5.setLayoutParams(layoutParams59);
        if (dmtTextView5.getParent() == null) {
            frameLayout.addView(dmtTextView5);
        }
        CommerceLikeLayout commerceLikeLayout = new CommerceLikeLayout(context2);
        FrameLayout.LayoutParams layoutParams60 = new FrameLayout.LayoutParams(-1, -1);
        commerceLikeLayout.setId(C0906R.id.bs);
        commerceLikeLayout.setLayoutParams(layoutParams60);
        if (commerceLikeLayout.getParent() == null) {
            frameLayout.addView(commerceLikeLayout);
        }
        ImageView imageView4 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams61 = new FrameLayout.LayoutParams(-2, -2);
        imageView4.setId(C0906R.id.a04);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams61)) {
            ((LinearLayout.LayoutParams) layoutParams61).gravity = 51;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams61)) {
            layoutParams61.gravity = 51;
        }
        imageView4.setImageResource(2130838863);
        imageView4.setLayoutParams(layoutParams61);
        if (imageView4.getParent() == null) {
            frameLayout.addView(imageView4);
        }
        ImageView imageView5 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams62 = new FrameLayout.LayoutParams(-2, -2);
        imageView5.setId(C0906R.id.a05);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams62)) {
            ((LinearLayout.LayoutParams) layoutParams62).gravity = 53;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams62)) {
            layoutParams62.gravity = 53;
        }
        imageView5.setImageResource(2130838864);
        imageView5.setLayoutParams(layoutParams62);
        if (imageView5.getParent() == null) {
            frameLayout.addView(imageView5);
        }
        ImageView imageView6 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams63 = new FrameLayout.LayoutParams(-2, -2);
        imageView6.setId(C0906R.id.a00);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams63)) {
            ((LinearLayout.LayoutParams) layoutParams63).gravity = 83;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams63)) {
            layoutParams63.gravity = 83;
        }
        imageView6.setImageResource(2130838865);
        imageView6.setLayoutParams(layoutParams63);
        if (imageView6.getParent() == null) {
            frameLayout.addView(imageView6);
        }
        ImageView imageView7 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams64 = new FrameLayout.LayoutParams(-2, -2);
        imageView7.setId(C0906R.id.a01);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams64)) {
            ((LinearLayout.LayoutParams) layoutParams64).gravity = 85;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams64)) {
            layoutParams64.gravity = 85;
        }
        imageView7.setImageResource(2130838866);
        imageView7.setLayoutParams(layoutParams64);
        if (imageView7.getParent() == null) {
            frameLayout.addView(imageView7);
        }
        a.a(remoteImageView2);
        a.a(longPressLayout);
        a.a(remoteImageView3);
        a.a(dmtTextView2);
        a.a(remoteImageView);
        a.a(tagLayout2);
        a.a(animationImageView2);
        a.a(commerceMicroTagLayout);
        a.a(commerceTagLayout);
        a.a(douPlusTagLayout);
        a.a(commerceTag2);
        a.a(dmtTextView);
        a.a(buttonAdBottomLabelView2);
        a.a(videoBottomButton);
        a.a(stripAdBottomLabelView);
        a.a(videoFloatingCard);
        a.a(debugInfoView);
        a.a(restrictTextView2);
        a.a(circleWaveLayout);
        a.a(dmtTextView4);
        a.a(blackMaskLayer2);
        a.a(adHalfWebPageContainer2);
        a.a(microAppVideoCardView2);
        a.a(commerceGoodHalfCardContainer2);
        a.a(poiCardWebPageContainer);
        a.a(dmtTextView5);
        a.a(commerceLikeLayout);
        return frameLayout;
    }
}

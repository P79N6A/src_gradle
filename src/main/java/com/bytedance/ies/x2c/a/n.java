package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.C0907R$drawable;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.ui.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.StoryCircleView;

public final class n implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        float f2;
        float f3;
        int i;
        int i2;
        Context context2 = context;
        ViewGroup viewGroup2 = viewGroup;
        Resources resources = context.getResources();
        RelativeLayout relativeLayout = new RelativeLayout(context2);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup2, (int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), -2);
        if (viewGroup2 != null) {
            relativeLayout.setLayoutParams(a2);
            if (z) {
                viewGroup2.addView(relativeLayout);
            }
        }
        AvatarWithBorderView avatarWithBorderView = new AvatarWithBorderView(context2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 49.0f, resources.getDisplayMetrics()));
        avatarWithBorderView.setId(C0906R.id.dp2);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams) && Build.VERSION.SDK_INT >= 17) {
            layoutParams.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.leftMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams)) {
            layoutParams.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        avatarWithBorderView.setVisibility(0);
        avatarWithBorderView.setLayoutParams(layoutParams);
        if (avatarWithBorderView.getParent() == null) {
            relativeLayout.addView(avatarWithBorderView);
        }
        StoryCircleView storyCircleView = new StoryCircleView(context2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        storyCircleView.setId(C0906R.id.cw5);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2) && Build.VERSION.SDK_INT >= 17) {
            layoutParams2.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.leftMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams2)) {
            layoutParams2.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        storyCircleView.setStrokeWidth((int) TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics()));
        storyCircleView.setVisibility(8);
        storyCircleView.setLayoutParams(layoutParams2);
        if (storyCircleView.getParent() == null) {
            relativeLayout.addView(storyCircleView);
        }
        AnimationImageView animationImageView = new AnimationImageView(context2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 52.0f, resources.getDisplayMetrics()));
        animationImageView.setId(C0906R.id.i8);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3) && Build.VERSION.SDK_INT >= 17) {
            layoutParams3.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.leftMargin = (int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams3)) {
            layoutParams3.topMargin = (int) TypedValue.applyDimension(1, 16.0f, resources.getDisplayMetrics());
        }
        animationImageView.setVisibility(8);
        animationImageView.setLayoutParams(layoutParams3);
        if (animationImageView.getParent() == null) {
            relativeLayout.addView(animationImageView);
        }
        AvatarImageWithLive avatarImageWithLive = new AvatarImageWithLive(context2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 44.0f, resources.getDisplayMetrics()));
        avatarImageWithLive.setId(C0906R.id.dp9);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4) && Build.VERSION.SDK_INT >= 17) {
            layoutParams4.setMarginStart((int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.leftMargin = (int) TypedValue.applyDimension(1, 8.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams4)) {
            layoutParams4.topMargin = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
        }
        avatarImageWithLive.setVisibility(4);
        avatarImageWithLive.setLayoutParams(layoutParams4);
        if (avatarImageWithLive.getParent() == null) {
            relativeLayout.addView(avatarImageWithLive);
        }
        LiveCircleView liveCircleView = new LiveCircleView(context2);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 50.5f, resources.getDisplayMetrics()));
        liveCircleView.setId(C0906R.id.dp4);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5) || Build.VERSION.SDK_INT < 17) {
            f2 = 5.5f;
        } else {
            f2 = 5.5f;
            layoutParams5.setMarginStart((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.leftMargin = (int) TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams5)) {
            layoutParams5.topMargin = (int) TypedValue.applyDimension(1, 17.0f, resources.getDisplayMetrics());
        }
        liveCircleView.setPadding((int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics()));
        liveCircleView.setVisibility(8);
        liveCircleView.setStrokeWidth((int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics()));
        liveCircleView.setLayoutParams(layoutParams5);
        if (liveCircleView.getParent() == null) {
            relativeLayout.addView(liveCircleView);
        }
        RemoteImageView remoteImageView = new RemoteImageView(context2);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 51.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 45.0f, resources.getDisplayMetrics()));
        remoteImageView.setId(C0906R.id.hu);
        if (!ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6) || Build.VERSION.SDK_INT < 17) {
            f3 = 4.5f;
        } else {
            f3 = 4.5f;
            layoutParams6.setMarginStart((int) TypedValue.applyDimension(1, 4.5f, resources.getDisplayMetrics()));
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.leftMargin = (int) TypedValue.applyDimension(1, f3, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams6)) {
            layoutParams6.topMargin = (int) TypedValue.applyDimension(1, 1.5f, resources.getDisplayMetrics());
        }
        remoteImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        remoteImageView.setImageResource(C0907R$drawable.icon);
        remoteImageView.setVisibility(8);
        remoteImageView.setLayoutParams(layoutParams6);
        if (remoteImageView.getParent() == null) {
            relativeLayout.addView(remoteImageView);
        }
        ImageView imageView = new ImageView(context2);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 25.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 22.0f, resources.getDisplayMetrics()));
        imageView.setId(C0906R.id.b17);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(11, -1);
        }
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.addRule(21, -1);
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.topMargin = (int) TypedValue.applyDimension(1, 9.0f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7)) {
            layoutParams7.rightMargin = (int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics());
        }
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams7) && Build.VERSION.SDK_INT >= 17) {
            layoutParams7.setMarginEnd((int) TypedValue.applyDimension(1, 5.5f, resources.getDisplayMetrics()));
        }
        imageView.setVisibility(8);
        imageView.setLayoutParams(layoutParams7);
        if (imageView.getParent() == null) {
            relativeLayout.addView(imageView);
        }
        RelativeLayout relativeLayout2 = new RelativeLayout(context2);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams((int) TypedValue.applyDimension(1, 61.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 40.0f, resources.getDisplayMetrics()));
        relativeLayout2.setId(C0906R.id.agt);
        if (ViewGroup.MarginLayoutParams.class.isInstance(layoutParams8)) {
            layoutParams8.topMargin = (int) TypedValue.applyDimension(1, 56.0f, resources.getDisplayMetrics());
        }
        relativeLayout2.setLayoutParams(layoutParams8);
        if (relativeLayout2.getParent() == null) {
            relativeLayout.addView(relativeLayout2);
        }
        FrameLayout frameLayout = new FrameLayout(context2);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        if (RelativeLayout.LayoutParams.class.isInstance(layoutParams9)) {
            layoutParams9.addRule(14, -1);
        }
        frameLayout.setLayoutParams(layoutParams9);
        if (frameLayout.getParent() == null) {
            relativeLayout2.addView(frameLayout);
        }
        ImageView imageView2 = new ImageView(context2);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        imageView2.setId(C0906R.id.ce);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams10)) {
            i = 17;
            ((LinearLayout.LayoutParams) layoutParams10).gravity = 17;
        } else {
            i = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams10)) {
            layoutParams10.gravity = i;
        }
        imageView2.setImageResource(2130839661);
        imageView2.setVisibility(8);
        imageView2.setLayoutParams(layoutParams10);
        if (imageView2.getParent() == null) {
            frameLayout.addView(imageView2);
        }
        AnimationImageView animationImageView2 = new AnimationImageView(context2);
        FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams((int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()), (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        animationImageView2.setId(C0906R.id.agq);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams11)) {
            i2 = 17;
            ((LinearLayout.LayoutParams) layoutParams11).gravity = 17;
        } else {
            i2 = 17;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams11)) {
            layoutParams11.gravity = i2;
        }
        animationImageView2.setLayoutParams(layoutParams11);
        if (animationImageView2.getParent() == null) {
            frameLayout.addView(animationImageView2);
        }
        a.a(avatarWithBorderView);
        a.a(storyCircleView);
        a.a(animationImageView);
        a.a(avatarImageWithLive);
        a.a(liveCircleView);
        a.a(remoteImageView);
        a.a(animationImageView2);
        return relativeLayout;
    }
}

package com.bytedance.ies.x2c.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.ies.x2c.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AudioControlView;
import com.ss.android.ugc.aweme.feed.widget.LineProgressBar;
import com.ss.android.ugc.aweme.shortvideo.ui.NewVideoPlayerProgressbar;

public final class af implements c {
    public final View a(Context context, ViewGroup viewGroup, boolean z) throws Exception {
        Resources resources = context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a2 = a.a(viewGroup, -1, (int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics()));
        if (LinearLayout.LayoutParams.class.isInstance(a2)) {
            ((LinearLayout.LayoutParams) a2).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(a2)) {
            ((FrameLayout.LayoutParams) a2).gravity = 80;
        }
        if (viewGroup != null) {
            frameLayout.setLayoutParams(a2);
            if (z) {
                viewGroup.addView(frameLayout);
            }
        }
        AudioControlView audioControlView = new AudioControlView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        audioControlView.setId(C0906R.id.gk);
        if (LinearLayout.LayoutParams.class.isInstance(layoutParams)) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
        }
        if (FrameLayout.LayoutParams.class.isInstance(layoutParams)) {
            layoutParams.gravity = 80;
        }
        audioControlView.setAlpha(0.0f);
        audioControlView.setForegroundColor(resources.getColor(C0906R.color.a1s));
        audioControlView.setLayoutParams(layoutParams);
        if (audioControlView.getParent() == null) {
            frameLayout.addView(audioControlView);
        }
        LineProgressBar lineProgressBar = new LineProgressBar(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        lineProgressBar.setId(C0906R.id.bbu);
        lineProgressBar.setLayoutParams(layoutParams2);
        if (lineProgressBar.getParent() == null) {
            frameLayout.addView(lineProgressBar);
        }
        NewVideoPlayerProgressbar newVideoPlayerProgressbar = new NewVideoPlayerProgressbar(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        newVideoPlayerProgressbar.setId(C0906R.id.dsn);
        newVideoPlayerProgressbar.setReachedBarColor(resources.getColor(C0906R.color.a09));
        newVideoPlayerProgressbar.setReachedProgressBarHeight((float) ((int) TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics())));
        newVideoPlayerProgressbar.setLayoutParams(layoutParams3);
        if (newVideoPlayerProgressbar.getParent() == null) {
            frameLayout.addView(newVideoPlayerProgressbar);
        }
        a.a(audioControlView);
        a.a(lineProgressBar);
        a.a(newVideoPlayerProgressbar);
        return frameLayout;
    }
}

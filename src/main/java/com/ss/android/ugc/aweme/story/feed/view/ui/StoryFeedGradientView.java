package com.ss.android.ugc.aweme.story.feed.view.ui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.C0906R;

public class StoryFeedGradientView extends FrameLayout {
    public StoryFeedGradientView(@NonNull Context context) {
        this(context, null);
    }

    public StoryFeedGradientView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StoryFeedGradientView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C0906R.layout.a90, this, true);
    }
}

package com.ss.android.ugc.aweme.base.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.GenericDraweeHierarchy;

public class SquareImageView extends AnimatedImageView {
    public SquareImageView(Context context) {
        super(context);
        setAspectRatio(1.0f);
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAspectRatio(1.0f);
    }

    public SquareImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
        setAspectRatio(1.0f);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAspectRatio(1.0f);
    }
}

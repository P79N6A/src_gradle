package com.facebook.react.views.text;

import android.text.Spannable;

public class ReactTextUpdate {
    private final boolean mContainsImages;
    private final int mJsEventCounter;
    private final float mPaddingBottom;
    private final float mPaddingLeft;
    private final float mPaddingRight;
    private final float mPaddingTop;
    private final Spannable mText;
    private final int mTextAlign;
    private final int mTextBreakStrategy;

    public boolean containsImages() {
        return this.mContainsImages;
    }

    public int getJsEventCounter() {
        return this.mJsEventCounter;
    }

    public float getPaddingBottom() {
        return this.mPaddingBottom;
    }

    public float getPaddingLeft() {
        return this.mPaddingLeft;
    }

    public float getPaddingRight() {
        return this.mPaddingRight;
    }

    public float getPaddingTop() {
        return this.mPaddingTop;
    }

    public Spannable getText() {
        return this.mText;
    }

    public int getTextAlign() {
        return this.mTextAlign;
    }

    public int getTextBreakStrategy() {
        return this.mTextBreakStrategy;
    }

    @Deprecated
    public ReactTextUpdate(Spannable spannable, int i, boolean z, float f2, float f3, float f4, float f5, int i2) {
        this(spannable, i, z, f2, f3, f4, f5, i2, 1);
    }

    public ReactTextUpdate(Spannable spannable, int i, boolean z, float f2, float f3, float f4, float f5, int i2, int i3) {
        this.mText = spannable;
        this.mJsEventCounter = i;
        this.mContainsImages = z;
        this.mPaddingLeft = f2;
        this.mPaddingTop = f3;
        this.mPaddingRight = f4;
        this.mPaddingBottom = f5;
        this.mTextAlign = i2;
        this.mTextBreakStrategy = i3;
    }
}

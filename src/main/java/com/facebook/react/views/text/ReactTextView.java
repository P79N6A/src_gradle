package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.views.view.ReactViewBackgroundManager;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import javax.annotation.Nullable;

public class ReactTextView extends TextView implements ReactCompoundView {
    private static final ViewGroup.LayoutParams EMPTY_LAYOUT_PARAMS = new ViewGroup.LayoutParams(0, 0);
    private boolean mContainsImages;
    private int mDefaultGravityHorizontal = (getGravity() & 8388615);
    private int mDefaultGravityVertical = (getGravity() & SearchJediMixFeedAdapter.f42516e);
    private TextUtils.TruncateAt mEllipsizeLocation = TextUtils.TruncateAt.END;
    private float mLineHeight = Float.NaN;
    private int mNumberOfLines = Integer.MAX_VALUE;
    private ReactViewBackgroundManager mReactBackgroundManager = new ReactViewBackgroundManager(this);
    private int mTextAlign;
    private boolean mTextIsSelectable;

    public void updateView() {
        TextUtils.TruncateAt truncateAt;
        if (this.mNumberOfLines == Integer.MAX_VALUE) {
            truncateAt = null;
        } else {
            truncateAt = this.mEllipsizeLocation;
        }
        setEllipsize(truncateAt);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan onAttachedToWindow : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                onAttachedToWindow.onAttachedToWindow();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan onDetachedFromWindow : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                onDetachedFromWindow.onDetachedFromWindow();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan onFinishTemporaryDetach : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                onFinishTemporaryDetach.onFinishTemporaryDetach();
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan onStartTemporaryDetach : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                onStartTemporaryDetach.onStartTemporaryDetach();
            }
        }
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.mEllipsizeLocation = truncateAt;
    }

    public void setBackgroundColor(int i) {
        this.mReactBackgroundManager.setBackgroundColor(i);
    }

    public void setBorderRadius(float f2) {
        this.mReactBackgroundManager.setBorderRadius(f2);
    }

    public void setBorderStyle(@Nullable String str) {
        this.mReactBackgroundManager.setBorderStyle(str);
    }

    public void setTextIsSelectable(boolean z) {
        this.mTextIsSelectable = z;
        super.setTextIsSelectable(z);
    }

    /* access modifiers changed from: package-private */
    public void setGravityVertical(int i) {
        if (i == 0) {
            i = this.mDefaultGravityVertical;
        }
        setGravity(i | (getGravity() & -113));
    }

    /* access modifiers changed from: package-private */
    public void setGravityHorizontal(int i) {
        if (i == 0) {
            i = this.mDefaultGravityHorizontal;
        }
        setGravity(i | (getGravity() & -8 & -8388616));
    }

    public void setNumberOfLines(int i) {
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        this.mNumberOfLines = i;
        boolean z = true;
        if (this.mNumberOfLines != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.mNumberOfLines);
    }

    public ReactTextView(Context context) {
        super(context);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan drawable2 : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (drawable2.getDrawable() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        if (this.mContainsImages && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (TextInlineImageSpan drawable2 : (TextInlineImageSpan[]) spanned.getSpans(0, spanned.length(), TextInlineImageSpan.class)) {
                if (drawable2.getDrawable() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }

    public void setText(ReactTextUpdate reactTextUpdate) {
        this.mContainsImages = reactTextUpdate.containsImages();
        if (getLayoutParams() == null) {
            setLayoutParams(EMPTY_LAYOUT_PARAMS);
        }
        setText(reactTextUpdate.getText());
        setPadding((int) Math.floor((double) reactTextUpdate.getPaddingLeft()), (int) Math.floor((double) reactTextUpdate.getPaddingTop()), (int) Math.floor((double) reactTextUpdate.getPaddingRight()), (int) Math.floor((double) reactTextUpdate.getPaddingBottom()));
        int textAlign = reactTextUpdate.getTextAlign();
        if (this.mTextAlign != textAlign) {
            this.mTextAlign = textAlign;
        }
        setGravityHorizontal(this.mTextAlign);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != reactTextUpdate.getTextBreakStrategy()) {
            setBreakStrategy(reactTextUpdate.getTextBreakStrategy());
        }
    }

    public void setBorderWidth(int i, float f2) {
        this.mReactBackgroundManager.setBorderWidth(i, f2);
    }

    public void setBorderRadius(float f2, int i) {
        this.mReactBackgroundManager.setBorderRadius(f2, i);
    }

    public int reactTagForTouch(float f2, float f3) {
        CharSequence text = getText();
        int id = getId();
        int i = (int) f2;
        int i2 = (int) f3;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i2);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i >= lineLeft && i <= lineRight) {
            Spanned spanned = (Spanned) text;
            int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i);
            ReactTagSpan[] reactTagSpanArr = (ReactTagSpan[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, ReactTagSpan.class);
            if (reactTagSpanArr != null) {
                int length = text.length();
                for (int i3 = 0; i3 < reactTagSpanArr.length; i3++) {
                    int spanStart = spanned.getSpanStart(reactTagSpanArr[i3]);
                    int spanEnd = spanned.getSpanEnd(reactTagSpanArr[i3]);
                    if (spanEnd > offsetForHorizontal) {
                        int i4 = spanEnd - spanStart;
                        if (i4 <= length) {
                            id = reactTagSpanArr[i3].getReactTag();
                            length = i4;
                        }
                    }
                }
            }
        }
        return id;
    }

    public void setBorderColor(int i, float f2, float f3) {
        this.mReactBackgroundManager.setBorderColor(i, f2, f3);
    }
}

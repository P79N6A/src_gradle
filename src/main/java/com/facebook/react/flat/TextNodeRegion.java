package com.facebook.react.flat;

import android.text.Layout;
import android.text.Spanned;
import javax.annotation.Nullable;

public final class TextNodeRegion extends NodeRegion {
    @Nullable
    private Layout mLayout;

    /* access modifiers changed from: package-private */
    @Nullable
    public final Layout getLayout() {
        return this.mLayout;
    }

    public final void setLayout(Layout layout) {
        this.mLayout = layout;
    }

    /* access modifiers changed from: package-private */
    public final boolean matchesTag(int i) {
        if (super.matchesTag(i)) {
            return true;
        }
        if (this.mLayout != null) {
            CharSequence text = this.mLayout.getText();
            if (text instanceof Spanned) {
                for (RCTRawText reactTag : (RCTRawText[]) ((Spanned) text).getSpans(0, text.length(), RCTRawText.class)) {
                    if (reactTag.getReactTag() == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int getReactTag(float f2, float f3) {
        if (this.mLayout != null) {
            CharSequence text = this.mLayout.getText();
            if (text instanceof Spanned) {
                int round = Math.round(f3 - getTop());
                if (round >= this.mLayout.getLineTop(0) && round < this.mLayout.getLineBottom(this.mLayout.getLineCount() - 1)) {
                    float round2 = (float) Math.round(f2 - getLeft());
                    int lineForVertical = this.mLayout.getLineForVertical(round);
                    if (this.mLayout.getLineLeft(lineForVertical) <= round2 && round2 <= this.mLayout.getLineRight(lineForVertical)) {
                        int offsetForHorizontal = this.mLayout.getOffsetForHorizontal(lineForVertical, round2);
                        RCTRawText[] rCTRawTextArr = (RCTRawText[]) ((Spanned) text).getSpans(offsetForHorizontal, offsetForHorizontal, RCTRawText.class);
                        if (rCTRawTextArr.length != 0) {
                            return rCTRawTextArr[0].getReactTag();
                        }
                    }
                }
            }
        }
        return super.getReactTag(f2, f3);
    }

    TextNodeRegion(float f2, float f3, float f4, float f5, int i, boolean z, @Nullable Layout layout) {
        super(f2, f3, f4, f5, i, z);
        this.mLayout = layout;
    }
}

package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import com.facebook.react.uimanager.annotations.ReactProp;
import javax.annotation.Nullable;

public final class RCTRawText extends FlatTextShadowNode {
    @Nullable
    private String mText;

    /* access modifiers changed from: protected */
    public final void performCollectAttachDetachListeners(StateBuilder stateBuilder) {
    }

    RCTRawText() {
    }

    @ReactProp(name = "text")
    public final void setText(@Nullable String str) {
        this.mText = str;
        notifyChanged(true);
    }

    /* access modifiers changed from: protected */
    public final void performCollectText(SpannableStringBuilder spannableStringBuilder) {
        if (this.mText != null) {
            spannableStringBuilder.append(this.mText);
        }
    }

    /* access modifiers changed from: protected */
    public final void performApplySpans(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        spannableStringBuilder.setSpan(this, i, i2, 17);
    }
}

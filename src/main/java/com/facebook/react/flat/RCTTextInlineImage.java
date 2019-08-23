package com.facebook.react.flat;

import android.text.SpannableStringBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.imagehelper.ImageSource;
import javax.annotation.Nullable;

public class RCTTextInlineImage extends FlatTextShadowNode {
    private InlineImageSpanWithPipeline mInlineImageSpan = new InlineImageSpanWithPipeline();

    RCTTextInlineImage() {
    }

    private InlineImageSpanWithPipeline getMutableSpan() {
        if (this.mInlineImageSpan.isFrozen()) {
            this.mInlineImageSpan = this.mInlineImageSpan.mutableCopy();
        }
        return this.mInlineImageSpan;
    }

    /* access modifiers changed from: protected */
    public void performCollectAttachDetachListeners(StateBuilder stateBuilder) {
        stateBuilder.addAttachDetachListener(this.mInlineImageSpan);
    }

    /* access modifiers changed from: protected */
    public void performCollectText(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append("I");
    }

    public void setStyleHeight(float f2) {
        super.setStyleHeight(f2);
        if (this.mInlineImageSpan.getHeight() != f2) {
            getMutableSpan().setHeight(f2);
            notifyChanged(true);
        }
    }

    public void setStyleWidth(float f2) {
        super.setStyleWidth(f2);
        if (this.mInlineImageSpan.getWidth() != f2) {
            getMutableSpan().setWidth(f2);
            notifyChanged(true);
        }
    }

    @ReactProp(name = "src")
    public void setSource(@Nullable ReadableArray readableArray) {
        String str;
        ImageSource imageSource;
        ImageRequest imageRequest = null;
        if (readableArray == null || readableArray.size() == 0) {
            str = null;
        } else {
            str = readableArray.getMap(0).getString("uri");
        }
        if (str == null) {
            imageSource = null;
        } else {
            imageSource = new ImageSource(getThemedContext(), str);
        }
        InlineImageSpanWithPipeline mutableSpan = getMutableSpan();
        if (imageSource != null) {
            imageRequest = ImageRequestBuilder.newBuilderWithSource(imageSource.getUri()).build();
        }
        mutableSpan.setImageRequest(imageRequest);
    }

    /* access modifiers changed from: protected */
    public void performApplySpans(SpannableStringBuilder spannableStringBuilder, int i, int i2, boolean z) {
        this.mInlineImageSpan.freeze();
        spannableStringBuilder.setSpan(this.mInlineImageSpan, i, i2, 17);
    }
}

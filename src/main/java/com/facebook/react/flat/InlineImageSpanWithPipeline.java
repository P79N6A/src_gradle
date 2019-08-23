package com.facebook.react.flat;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.annotation.a;
import com.facebook.react.flat.FlatViewGroup;
import javax.annotation.Nullable;

public final class InlineImageSpanWithPipeline extends ReplacementSpan implements AttachDetachListener, BitmapUpdateListener {
    private static final RectF TMP_RECT = new RectF();
    @Nullable
    private FlatViewGroup.InvalidateCallback mCallback;
    private boolean mFrozen;
    private float mHeight;
    @Nullable
    private PipelineRequestHelper mRequestHelper;
    private float mWidth;

    /* access modifiers changed from: package-private */
    public final void freeze() {
        this.mFrozen = true;
    }

    public final void onImageLoadEvent(int i) {
    }

    /* access modifiers changed from: package-private */
    public final float getHeight() {
        return this.mHeight;
    }

    /* access modifiers changed from: package-private */
    public final float getWidth() {
        return this.mWidth;
    }

    /* access modifiers changed from: package-private */
    public final boolean isFrozen() {
        return this.mFrozen;
    }

    InlineImageSpanWithPipeline() {
        this(null, Float.NaN, Float.NaN);
    }

    /* access modifiers changed from: package-private */
    public final boolean hasImageRequest() {
        if (this.mRequestHelper != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final InlineImageSpanWithPipeline mutableCopy() {
        return new InlineImageSpanWithPipeline(this.mRequestHelper, this.mWidth, this.mHeight);
    }

    public final void onDetached() {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.detach();
            if (this.mRequestHelper.isDetached()) {
                this.mCallback = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setHeight(float f2) {
        this.mHeight = f2;
    }

    /* access modifiers changed from: package-private */
    public final void setWidth(float f2) {
        this.mWidth = f2;
    }

    public final void onAttached(FlatViewGroup.InvalidateCallback invalidateCallback) {
        this.mCallback = invalidateCallback;
        if (this.mRequestHelper != null) {
            this.mRequestHelper.attach(this);
        }
    }

    public final void onBitmapReady(Bitmap bitmap) {
        ((FlatViewGroup.InvalidateCallback) a.a(this.mCallback)).invalidate();
    }

    public final void onSecondaryAttach(Bitmap bitmap) {
        ((FlatViewGroup.InvalidateCallback) a.a(this.mCallback)).invalidate();
    }

    /* access modifiers changed from: package-private */
    public final void setImageRequest(@Nullable ImageRequest imageRequest) {
        if (imageRequest == null) {
            this.mRequestHelper = null;
        } else {
            this.mRequestHelper = new PipelineRequestHelper(imageRequest);
        }
    }

    private InlineImageSpanWithPipeline(@Nullable PipelineRequestHelper pipelineRequestHelper, float f2, float f3) {
        this.mRequestHelper = pipelineRequestHelper;
        this.mWidth = f2;
        this.mHeight = f3;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -Math.round(this.mHeight);
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return Math.round(this.mWidth);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (this.mRequestHelper != null) {
            Bitmap bitmap = this.mRequestHelper.getBitmap();
            if (bitmap != null) {
                float f3 = ((float) i5) - ((float) paint.getFontMetricsInt().descent);
                TMP_RECT.set(f2, f3 - this.mHeight, this.mWidth + f2, f3);
                canvas.drawBitmap(bitmap, null, TMP_RECT, paint);
            }
        }
    }
}

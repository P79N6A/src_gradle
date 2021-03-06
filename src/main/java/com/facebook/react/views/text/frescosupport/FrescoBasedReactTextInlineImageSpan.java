package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.views.text.TextInlineImageSpan;
import javax.annotation.Nullable;

public class FrescoBasedReactTextInlineImageSpan extends TextInlineImageSpan {
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private Drawable mDrawable;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private final DraweeHolder<GenericDraweeHierarchy> mDraweeHolder;
    private ReadableMap mHeaders;
    private int mHeight;
    @Nullable
    private TextView mTextView;
    private Uri mUri;
    private int mWidth;

    @Nullable
    public Drawable getDrawable() {
        return this.mDrawable;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void onAttachedToWindow() {
        this.mDraweeHolder.onAttach();
    }

    public void onDetachedFromWindow() {
        this.mDraweeHolder.onDetach();
    }

    public void onFinishTemporaryDetach() {
        this.mDraweeHolder.onAttach();
    }

    public void onStartTemporaryDetach() {
        this.mDraweeHolder.onDetach();
    }

    public void setTextView(TextView textView) {
        this.mTextView = textView;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = -this.mHeight;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.mWidth;
    }

    public FrescoBasedReactTextInlineImageSpan(Resources resources, int i, int i2, @Nullable Uri uri, ReadableMap readableMap, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable Object obj) {
        this.mDraweeHolder = new DraweeHolder<>(GenericDraweeHierarchyBuilder.newInstance(resources).build());
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mCallerContext = obj;
        this.mHeight = i;
        this.mWidth = i2;
        this.mUri = uri == null ? Uri.EMPTY : uri;
        this.mHeaders = readableMap;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f2, int i3, int i4, int i5, Paint paint) {
        if (this.mDrawable == null) {
            this.mDraweeHolder.setController(this.mDraweeControllerBuilder.reset().setOldController(this.mDraweeHolder.getController()).setCallerContext(this.mCallerContext).setImageRequest(ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.newBuilderWithSource(this.mUri), this.mHeaders)).build());
            this.mDraweeControllerBuilder.reset();
            this.mDrawable = this.mDraweeHolder.getTopLevelDrawable();
            this.mDrawable.setBounds(0, 0, this.mWidth, this.mHeight);
            this.mDrawable.setCallback(this.mTextView);
        }
        canvas.save();
        canvas.translate(f2, (float) (i4 - this.mDrawable.getBounds().bottom));
        this.mDrawable.draw(canvas);
        canvas.restore();
    }
}

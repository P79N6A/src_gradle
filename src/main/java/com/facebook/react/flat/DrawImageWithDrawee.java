package com.facebook.react.flat;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.infer.annotation.a;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.flat.FlatViewGroup;
import com.facebook.react.views.image.GlobalImageLoadListener;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public final class DrawImageWithDrawee extends AbstractDrawCommand implements ControllerListener, DrawImage {
    private int mBorderColor;
    private float mBorderRadius;
    private float mBorderWidth;
    @Nullable
    private FlatViewGroup.InvalidateCallback mCallback;
    @Nullable
    private PorterDuffColorFilter mColorFilter;
    private int mFadeDuration = c.f69428f;
    @Nullable
    private final GlobalImageLoadListener mGlobalImageLoadListener;
    private boolean mProgressiveRenderingEnabled;
    private int mReactTag;
    @Nullable
    private DraweeRequestHelper mRequestHelper;
    private ScalingUtils.ScaleType mScaleType = ImageResizeMode.defaultValue();
    private final List<ImageSource> mSources = new LinkedList();

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final void onIntermediateImageSet(String str, @Nullable Object obj) {
    }

    public final void onRelease(String str) {
    }

    public final int getBorderColor() {
        return this.mBorderColor;
    }

    public final float getBorderRadius() {
        return this.mBorderRadius;
    }

    public final float getBorderWidth() {
        return this.mBorderWidth;
    }

    public final ScalingUtils.ScaleType getScaleType() {
        return this.mScaleType;
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChanged() {
        super.onBoundsChanged();
        computeRequestHelper();
    }

    public final boolean hasImageRequest() {
        if (!this.mSources.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void onDetached() {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.detach();
        }
    }

    private boolean shouldDisplayBorder() {
        if (this.mBorderColor != 0 || this.mBorderRadius >= 0.5f) {
            return true;
        }
        return false;
    }

    private void computeRequestHelper() {
        ResizeOptions resizeOptions;
        MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(Math.round(getRight() - getLeft()), Math.round(getBottom() - getTop()), this.mSources);
        ImageSource bestResult = bestSourceForSize.getBestResult();
        ImageSource bestResultInCache = bestSourceForSize.getBestResultInCache();
        ImageRequest imageRequest = null;
        if (bestResult == null) {
            this.mRequestHelper = null;
            return;
        }
        if (shouldResize(bestResult)) {
            resizeOptions = new ResizeOptions((int) (getRight() - getLeft()), (int) (getBottom() - getTop()));
        } else {
            resizeOptions = null;
        }
        ImageRequest build = ImageRequestBuilder.newBuilderWithSource(bestResult.getUri()).setResizeOptions(resizeOptions).setProgressiveRenderingEnabled(this.mProgressiveRenderingEnabled).build();
        if (this.mGlobalImageLoadListener != null) {
            this.mGlobalImageLoadListener.onLoadAttempt(bestResult.getUri());
        }
        if (bestResultInCache != null) {
            imageRequest = ImageRequestBuilder.newBuilderWithSource(bestResultInCache.getUri()).setResizeOptions(resizeOptions).setProgressiveRenderingEnabled(this.mProgressiveRenderingEnabled).build();
        }
        this.mRequestHelper = new DraweeRequestHelper((ImageRequest) a.b(build), imageRequest, this);
    }

    public final void setBorderColor(int i) {
        this.mBorderColor = i;
    }

    public final void setBorderRadius(float f2) {
        this.mBorderRadius = f2;
    }

    public final void setBorderWidth(float f2) {
        this.mBorderWidth = f2;
    }

    public final void setFadeDuration(int i) {
        this.mFadeDuration = i;
    }

    public final void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public final void setReactTag(int i) {
        this.mReactTag = i;
    }

    public final void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.mScaleType = scaleType;
    }

    /* access modifiers changed from: protected */
    public final void onDebugDrawHighlight(Canvas canvas) {
        if (this.mCallback != null) {
            debugDrawCautionHighlight(canvas, "Invalidate Drawee");
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.mRequestHelper != null) {
            this.mRequestHelper.getDrawable().draw(canvas);
        }
    }

    public final void setTintColor(int i) {
        if (i == 0) {
            this.mColorFilter = null;
        } else {
            this.mColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
    }

    public DrawImageWithDrawee(@Nullable GlobalImageLoadListener globalImageLoadListener) {
        this.mGlobalImageLoadListener = globalImageLoadListener;
    }

    private static boolean shouldResize(ImageSource imageSource) {
        String str;
        Uri uri = imageSource.getUri();
        if (uri == null) {
            str = null;
        } else {
            str = uri.getScheme();
        }
        if ("file".equals(str) || PushConstants.CONTENT.equals(str)) {
            return true;
        }
        return false;
    }

    public final void onAttached(FlatViewGroup.InvalidateCallback invalidateCallback) {
        this.mCallback = invalidateCallback;
        if (this.mRequestHelper != null) {
            GenericDraweeHierarchy hierarchy = this.mRequestHelper.getHierarchy();
            RoundingParams roundingParams = hierarchy.getRoundingParams();
            if (shouldDisplayBorder()) {
                if (roundingParams == null) {
                    roundingParams = new RoundingParams();
                }
                roundingParams.setBorder(this.mBorderColor, this.mBorderWidth);
                roundingParams.setCornersRadius(this.mBorderRadius);
                hierarchy.setRoundingParams(roundingParams);
            } else if (roundingParams != null) {
                hierarchy.setRoundingParams(null);
            }
            hierarchy.setActualImageScaleType(this.mScaleType);
            hierarchy.setActualImageColorFilter(this.mColorFilter);
            hierarchy.setFadeDuration(this.mFadeDuration);
            hierarchy.getTopLevelDrawable().setBounds(Math.round(getLeft()), Math.round(getTop()), Math.round(getRight()), Math.round(getBottom()));
            this.mRequestHelper.attach(invalidateCallback);
            return;
        }
        throw new RuntimeException("No DraweeRequestHelper - width: " + (getRight() - getLeft()) + " - height: " + (getBottom() - getTop()) + " - number of sources: " + this.mSources.size());
    }

    public final void onFailure(String str, Throwable th) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 1);
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 3);
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 4);
        }
    }

    public final void setSource(Context context, @Nullable ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                this.mSources.add(new ImageSource(context, readableArray.getMap(0).getString("uri")));
                return;
            }
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                List<ImageSource> list = this.mSources;
                ImageSource imageSource = new ImageSource(context, map.getString("uri"), map.getDouble("width"), map.getDouble("height"));
                list.add(imageSource);
            }
        }
    }

    public final void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        if (this.mCallback != null && this.mReactTag != 0) {
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 2);
            this.mCallback.dispatchImageLoadEvent(this.mReactTag, 3);
        }
    }
}

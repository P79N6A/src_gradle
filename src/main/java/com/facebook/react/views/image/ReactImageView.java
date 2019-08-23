package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.common.f.f;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.drawable.b;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.c;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.d.a;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.BasePostprocessor;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.imagehelper.ImageSource;
import com.facebook.react.views.imagehelper.MultiSourceHelper;
import com.facebook.react.views.imagehelper.ResourceDrawableIdHelper;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.Nullable;

public class ReactImageView extends c {
    public static float[] sComputedCornerRadii = new float[4];
    public static final Matrix sInverse = new Matrix();
    public static final Matrix sMatrix = new Matrix();
    private int mBorderColor;
    @Nullable
    private float[] mBorderCornerRadii;
    private float mBorderRadius = 1.0E21f;
    private float mBorderWidth;
    @Nullable
    private ImageSource mCachedImageSource;
    @Nullable
    private final Object mCallerContext;
    @Nullable
    private ControllerListener mControllerForTesting;
    @Nullable
    private ControllerListener mControllerListener;
    private final AbstractDraweeControllerBuilder mDraweeControllerBuilder;
    private int mFadeDurationMs = -1;
    @Nullable
    private GlobalImageLoadListener mGlobalImageLoadListener;
    private ReadableMap mHeaders;
    @Nullable
    public ImageSource mImageSource;
    private boolean mIsDirty;
    @Nullable
    private a mIterativeBoxBlurPostProcessor;
    @Nullable
    private Drawable mLoadingImageDrawable;
    private int mOverlayColor;
    private boolean mProgressiveRenderingEnabled;
    private ImageResizeMethod mResizeMethod = ImageResizeMethod.AUTO;
    private final RoundedCornerPostprocessor mRoundedCornerPostprocessor;
    public ScalingUtils.ScaleType mScaleType = ImageResizeMode.defaultValue();
    private final List<ImageSource> mSources;

    class RoundedCornerPostprocessor extends BasePostprocessor {
        private RoundedCornerPostprocessor() {
        }

        public void process(Bitmap bitmap, Bitmap bitmap2) {
            ReactImageView.this.cornerRadii(ReactImageView.sComputedCornerRadii);
            bitmap.setHasAlpha(true);
            if (!FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[0], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[1], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[2], 0.0f) || !FloatUtil.floatsEqual(ReactImageView.sComputedCornerRadii[3], 0.0f)) {
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                Canvas canvas = new Canvas(bitmap);
                float[] fArr = new float[8];
                getRadii(bitmap2, ReactImageView.sComputedCornerRadii, fArr);
                Path path = new Path();
                path.addRoundRect(new RectF(0.0f, 0.0f, (float) bitmap2.getWidth(), (float) bitmap2.getHeight()), fArr, Path.Direction.CW);
                canvas.drawPath(path, paint);
                return;
            }
            super.process(bitmap, bitmap2);
        }

        /* access modifiers changed from: package-private */
        public void getRadii(Bitmap bitmap, float[] fArr, float[] fArr2) {
            ReactImageView.this.mScaleType.getTransform(ReactImageView.sMatrix, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), 0.0f, 0.0f);
            ReactImageView.sMatrix.invert(ReactImageView.sInverse);
            fArr2[0] = ReactImageView.sInverse.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = ReactImageView.sInverse.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = ReactImageView.sInverse.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = ReactImageView.sInverse.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }
    }

    private void warnImageSource(String str) {
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    private boolean hasMultipleSources() {
        if (this.mSources.size() > 1) {
            return true;
        }
        return false;
    }

    private void setSourceImage() {
        this.mImageSource = null;
        if (!this.mSources.isEmpty()) {
            if (hasMultipleSources()) {
                MultiSourceHelper.MultiSourceResult bestSourceForSize = MultiSourceHelper.getBestSourceForSize(getWidth(), getHeight(), this.mSources);
                this.mImageSource = bestSourceForSize.getBestResult();
                this.mCachedImageSource = bestSourceForSize.getBestResultInCache();
                return;
            }
            this.mImageSource = this.mSources.get(0);
        }
    }

    public void maybeUpdateView() {
        boolean z;
        int i;
        Postprocessor postprocessor;
        if (this.mIsDirty) {
            if (!hasMultipleSources() || (getWidth() > 0 && getHeight() > 0)) {
                setSourceImage();
                if (this.mImageSource != null) {
                    boolean shouldResize = shouldResize(this.mImageSource);
                    if (!shouldResize || (getWidth() > 0 && getHeight() > 0)) {
                        GenericDraweeHierarchy genericDraweeHierarchy = (GenericDraweeHierarchy) getHierarchy();
                        genericDraweeHierarchy.setActualImageScaleType(this.mScaleType);
                        if (this.mLoadingImageDrawable != null) {
                            genericDraweeHierarchy.setPlaceholderImage(this.mLoadingImageDrawable, ScalingUtils.ScaleType.CENTER);
                        }
                        if (this.mScaleType == ScalingUtils.ScaleType.CENTER_CROP || this.mScaleType == ScalingUtils.ScaleType.FOCUS_CROP) {
                            z = false;
                        } else {
                            z = true;
                        }
                        RoundingParams roundingParams = genericDraweeHierarchy.getRoundingParams();
                        if (z) {
                            roundingParams.setCornersRadius(0.0f);
                        } else {
                            cornerRadii(sComputedCornerRadii);
                            roundingParams.setCornersRadii(sComputedCornerRadii[0], sComputedCornerRadii[1], sComputedCornerRadii[2], sComputedCornerRadii[3]);
                        }
                        roundingParams.setBorder(this.mBorderColor, this.mBorderWidth);
                        if (this.mOverlayColor != 0) {
                            roundingParams.setOverlayColor(this.mOverlayColor);
                        } else {
                            roundingParams.setRoundingMethod(RoundingParams.RoundingMethod.BITMAP_ONLY);
                        }
                        genericDraweeHierarchy.setRoundingParams(roundingParams);
                        if (this.mFadeDurationMs >= 0) {
                            i = this.mFadeDurationMs;
                        } else if (this.mImageSource.isResource()) {
                            i = 0;
                        } else {
                            i = com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f;
                        }
                        genericDraweeHierarchy.setFadeDuration(i);
                        ResizeOptions resizeOptions = null;
                        if (z) {
                            postprocessor = this.mRoundedCornerPostprocessor;
                        } else if (this.mIterativeBoxBlurPostProcessor != null) {
                            postprocessor = this.mIterativeBoxBlurPostProcessor;
                        } else {
                            postprocessor = null;
                        }
                        if (shouldResize) {
                            resizeOptions = new ResizeOptions(getWidth(), getHeight());
                        }
                        ReactNetworkImageRequest fromBuilderWithHeaders = ReactNetworkImageRequest.fromBuilderWithHeaders(ImageRequestBuilder.newBuilderWithSource(this.mImageSource.getUri()).setPostprocessor(postprocessor).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.mProgressiveRenderingEnabled), this.mHeaders);
                        if (this.mGlobalImageLoadListener != null) {
                            this.mGlobalImageLoadListener.onLoadAttempt(this.mImageSource.getUri());
                        }
                        this.mDraweeControllerBuilder.reset();
                        this.mDraweeControllerBuilder.setAutoPlayAnimations(true).setCallerContext(this.mCallerContext).setOldController(getController()).setImageRequest(fromBuilderWithHeaders);
                        if (this.mCachedImageSource != null) {
                            this.mDraweeControllerBuilder.setLowResImageRequest(ImageRequestBuilder.newBuilderWithSource(this.mCachedImageSource.getUri()).setPostprocessor(postprocessor).setResizeOptions(resizeOptions).setAutoRotateEnabled(true).setProgressiveRenderingEnabled(this.mProgressiveRenderingEnabled).build());
                        }
                        if (this.mControllerListener != null && this.mControllerForTesting != null) {
                            com.facebook.drawee.controller.c cVar = new com.facebook.drawee.controller.c();
                            cVar.a(this.mControllerListener);
                            cVar.a(this.mControllerForTesting);
                            this.mDraweeControllerBuilder.setControllerListener(cVar);
                        } else if (this.mControllerForTesting != null) {
                            this.mDraweeControllerBuilder.setControllerListener(this.mControllerForTesting);
                        } else if (this.mControllerListener != null) {
                            this.mDraweeControllerBuilder.setControllerListener(this.mControllerListener);
                        }
                        setController(this.mDraweeControllerBuilder.build());
                        this.mIsDirty = false;
                        this.mDraweeControllerBuilder.reset();
                    }
                }
            }
        }
    }

    public void setFadeDuration(int i) {
        this.mFadeDurationMs = i;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.mHeaders = readableMap;
    }

    public void setProgressiveRenderingEnabled(boolean z) {
        this.mProgressiveRenderingEnabled = z;
    }

    public void setBorderColor(int i) {
        this.mBorderColor = i;
        this.mIsDirty = true;
    }

    public void setOverlayColor(int i) {
        this.mOverlayColor = i;
        this.mIsDirty = true;
    }

    public void setResizeMethod(ImageResizeMethod imageResizeMethod) {
        this.mResizeMethod = imageResizeMethod;
        this.mIsDirty = true;
    }

    public void setScaleType(ScalingUtils.ScaleType scaleType) {
        this.mScaleType = scaleType;
        this.mIsDirty = true;
    }

    public void setBorderRadius(float f2) {
        if (!FloatUtil.floatsEqual(this.mBorderRadius, f2)) {
            this.mBorderRadius = f2;
            this.mIsDirty = true;
        }
    }

    public void setBorderWidth(float f2) {
        this.mBorderWidth = PixelUtil.toPixelFromDIP(f2);
        this.mIsDirty = true;
    }

    public void setControllerListener(ControllerListener controllerListener) {
        this.mControllerForTesting = controllerListener;
        this.mIsDirty = true;
        maybeUpdateView();
    }

    private static GenericDraweeHierarchy buildHierarchy(Context context) {
        return new GenericDraweeHierarchyBuilder(context.getResources()).setRoundingParams(RoundingParams.fromCornersRadius(0.0f)).build();
    }

    public void setBlurRadius(float f2) {
        int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(f2);
        if (pixelFromDIP == 0) {
            this.mIterativeBoxBlurPostProcessor = null;
        } else {
            this.mIterativeBoxBlurPostProcessor = new a(pixelFromDIP);
        }
        this.mIsDirty = true;
    }

    public void setLoadingIndicatorSource(@Nullable String str) {
        b bVar;
        Drawable resourceDrawable = ResourceDrawableIdHelper.getInstance().getResourceDrawable(getContext(), str);
        if (resourceDrawable != null) {
            bVar = new b(resourceDrawable, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        } else {
            bVar = null;
        }
        this.mLoadingImageDrawable = bVar;
        this.mIsDirty = true;
    }

    private boolean shouldResize(ImageSource imageSource) {
        if (this.mResizeMethod == ImageResizeMethod.AUTO) {
            if (f.d(imageSource.getUri()) || f.c(imageSource.getUri())) {
                return true;
            }
            return false;
        } else if (this.mResizeMethod == ImageResizeMethod.RESIZE) {
            return true;
        } else {
            return false;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z) {
        if (!z) {
            this.mControllerListener = null;
        } else {
            final EventDispatcher eventDispatcher = ((UIManagerModule) ((ReactContext) getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher();
            this.mControllerListener = new BaseControllerListener<ImageInfo>() {
                public void onSubmit(String str, Object obj) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 4));
                }

                public void onFailure(String str, Throwable th) {
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 1));
                    eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 3));
                }

                public void onFinalImageSet(String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
                    if (imageInfo != null) {
                        EventDispatcher eventDispatcher = eventDispatcher;
                        ImageLoadEvent imageLoadEvent = new ImageLoadEvent(ReactImageView.this.getId(), 2, ReactImageView.this.mImageSource.getSource(), imageInfo.getWidth(), imageInfo.getHeight());
                        eventDispatcher.dispatchEvent(imageLoadEvent);
                        eventDispatcher.dispatchEvent(new ImageLoadEvent(ReactImageView.this.getId(), 3));
                    }
                }
            };
        }
        this.mIsDirty = true;
    }

    public void cornerRadii(float[] fArr) {
        float f2;
        float f3;
        float f4;
        float f5;
        if (!com.facebook.yoga.a.a(this.mBorderRadius)) {
            f2 = this.mBorderRadius;
        } else {
            f2 = 0.0f;
        }
        if (this.mBorderCornerRadii == null || com.facebook.yoga.a.a(this.mBorderCornerRadii[0])) {
            f3 = f2;
        } else {
            f3 = this.mBorderCornerRadii[0];
        }
        fArr[0] = f3;
        if (this.mBorderCornerRadii == null || com.facebook.yoga.a.a(this.mBorderCornerRadii[1])) {
            f4 = f2;
        } else {
            f4 = this.mBorderCornerRadii[1];
        }
        fArr[1] = f4;
        if (this.mBorderCornerRadii == null || com.facebook.yoga.a.a(this.mBorderCornerRadii[2])) {
            f5 = f2;
        } else {
            f5 = this.mBorderCornerRadii[2];
        }
        fArr[2] = f5;
        if (this.mBorderCornerRadii != null && !com.facebook.yoga.a.a(this.mBorderCornerRadii[3])) {
            f2 = this.mBorderCornerRadii[3];
        }
        fArr[3] = f2;
    }

    public void setSource(@Nullable ReadableArray readableArray) {
        this.mSources.clear();
        if (!(readableArray == null || readableArray.size() == 0)) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                ImageSource imageSource = new ImageSource(getContext(), string);
                this.mSources.add(imageSource);
                if (Uri.EMPTY.equals(imageSource.getUri())) {
                    warnImageSource(string);
                }
            } else {
                for (int i = 0; i < readableArray.size(); i++) {
                    ReadableMap map = readableArray.getMap(i);
                    String string2 = map.getString("uri");
                    ImageSource imageSource2 = new ImageSource(getContext(), string2, map.getDouble("width"), map.getDouble("height"));
                    this.mSources.add(imageSource2);
                    if (Uri.EMPTY.equals(imageSource2.getUri())) {
                        warnImageSource(string2);
                    }
                }
            }
        }
        this.mIsDirty = true;
    }

    public void setBorderRadius(float f2, int i) {
        if (this.mBorderCornerRadii == null) {
            this.mBorderCornerRadii = new float[4];
            Arrays.fill(this.mBorderCornerRadii, 1.0E21f);
        }
        if (!FloatUtil.floatsEqual(this.mBorderCornerRadii[i], f2)) {
            this.mBorderCornerRadii[i] = f2;
            this.mIsDirty = true;
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        boolean z;
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            if (this.mIsDirty || hasMultipleSources()) {
                z = true;
            } else {
                z = false;
            }
            this.mIsDirty = z;
            maybeUpdateView();
        }
    }

    public ReactImageView(Context context, AbstractDraweeControllerBuilder abstractDraweeControllerBuilder, @Nullable GlobalImageLoadListener globalImageLoadListener, @Nullable Object obj) {
        super(context, buildHierarchy(context));
        this.mDraweeControllerBuilder = abstractDraweeControllerBuilder;
        this.mRoundedCornerPostprocessor = new RoundedCornerPostprocessor();
        this.mGlobalImageLoadListener = globalImageLoadListener;
        this.mCallerContext = obj;
        this.mSources = new LinkedList();
    }
}

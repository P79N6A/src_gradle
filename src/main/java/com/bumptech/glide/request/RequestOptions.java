package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.FloatRange;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Map;

public class RequestOptions implements Cloneable {
    @Nullable
    private static RequestOptions centerCropOptions;
    @Nullable
    private static RequestOptions centerInsideOptions;
    @Nullable
    private static RequestOptions circleCropOptions;
    @Nullable
    private static RequestOptions fitCenterOptions;
    @Nullable
    private static RequestOptions noAnimationOptions;
    @Nullable
    private static RequestOptions noTransformOptions;
    @Nullable
    private static RequestOptions skipMemoryCacheFalseOptions;
    @Nullable
    private static RequestOptions skipMemoryCacheTrueOptions;
    @NonNull
    private DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;
    private int errorId;
    @Nullable
    private Drawable errorPlaceholder;
    @Nullable
    private Drawable fallbackDrawable;
    private int fallbackId;
    private int fields;
    private boolean isAutoCloneEnabled;
    private boolean isCacheable = true;
    private boolean isLocked;
    private boolean isScaleOnlyOrNoTransform = true;
    private boolean isTransformationAllowed = true;
    private boolean isTransformationRequired;
    private boolean onlyRetrieveFromCache;
    @NonNull
    private Options options = new Options();
    private int overrideHeight = -1;
    private int overrideWidth = -1;
    @Nullable
    private Drawable placeholderDrawable;
    private int placeholderId;
    @NonNull
    private Priority priority = Priority.NORMAL;
    @NonNull
    private Class<?> resourceClass = Object.class;
    @NonNull
    private Key signature = EmptySignature.obtain();
    private float sizeMultiplier = 1.0f;
    @Nullable
    private Resources.Theme theme;
    @NonNull
    private Map<Class<?>, Transformation<?>> transformations = new CachedHashCodeArrayMap();
    private boolean useAnimationPool;
    private boolean useUnlimitedSourceGeneratorsPool;

    private static boolean isSet(int i, int i2) {
        return (i & i2) != 0;
    }

    @NonNull
    public RequestOptions lock() {
        this.isLocked = true;
        return this;
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }

    @NonNull
    public final Options getOptions() {
        return this.options;
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @NonNull
    public final Priority getPriority() {
        return this.priority;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final Key getSignature() {
        return this.signature;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.theme;
    }

    @NonNull
    public final Map<Class<?>, Transformation<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    /* access modifiers changed from: protected */
    public boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    /* access modifiers changed from: package-private */
    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    @NonNull
    private RequestOptions selfOrThrowIfLocked() {
        if (!this.isLocked) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked RequestOptions, consider clone()");
    }

    @CheckResult
    @NonNull
    public RequestOptions centerCrop() {
        return transform(DownsampleStrategy.CENTER_OUTSIDE, (Transformation<Bitmap>) new CenterCrop<Bitmap>());
    }

    @CheckResult
    @NonNull
    public RequestOptions centerInside() {
        return scaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @CheckResult
    @NonNull
    public RequestOptions circleCrop() {
        return transform(DownsampleStrategy.CENTER_INSIDE, (Transformation<Bitmap>) new CircleCrop<Bitmap>());
    }

    @CheckResult
    @NonNull
    public RequestOptions disallowHardwareConfig() {
        return set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @CheckResult
    @NonNull
    public RequestOptions dontAnimate() {
        return set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @CheckResult
    @NonNull
    public RequestOptions fitCenter() {
        return scaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.overrideWidth, this.overrideHeight);
    }

    @CheckResult
    @NonNull
    public RequestOptions optionalCenterCrop() {
        return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, (Transformation<Bitmap>) new CenterCrop<Bitmap>());
    }

    @CheckResult
    @NonNull
    public RequestOptions optionalCenterInside() {
        return optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @CheckResult
    @NonNull
    public RequestOptions optionalCircleCrop() {
        return optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, (Transformation<Bitmap>) new CircleCrop<Bitmap>());
    }

    @CheckResult
    @NonNull
    public RequestOptions optionalFitCenter() {
        return optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @CheckResult
    @NonNull
    public static RequestOptions centerCropTransform() {
        if (centerCropOptions == null) {
            centerCropOptions = new RequestOptions().centerCrop().autoClone();
        }
        return centerCropOptions;
    }

    @CheckResult
    @NonNull
    public static RequestOptions centerInsideTransform() {
        if (centerInsideOptions == null) {
            centerInsideOptions = new RequestOptions().centerInside().autoClone();
        }
        return centerInsideOptions;
    }

    @CheckResult
    @NonNull
    public static RequestOptions circleCropTransform() {
        if (circleCropOptions == null) {
            circleCropOptions = new RequestOptions().circleCrop().autoClone();
        }
        return circleCropOptions;
    }

    @CheckResult
    @NonNull
    public static RequestOptions fitCenterTransform() {
        if (fitCenterOptions == null) {
            fitCenterOptions = new RequestOptions().fitCenter().autoClone();
        }
        return fitCenterOptions;
    }

    @CheckResult
    @NonNull
    public static RequestOptions noAnimation() {
        if (noAnimationOptions == null) {
            noAnimationOptions = new RequestOptions().dontAnimate().autoClone();
        }
        return noAnimationOptions;
    }

    @CheckResult
    @NonNull
    public static RequestOptions noTransformation() {
        if (noTransformOptions == null) {
            noTransformOptions = new RequestOptions().dontTransform().autoClone();
        }
        return noTransformOptions;
    }

    @NonNull
    public RequestOptions autoClone() {
        if (!this.isLocked || this.isAutoCloneEnabled) {
            this.isAutoCloneEnabled = true;
            return lock();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    @CheckResult
    public RequestOptions clone() {
        try {
            RequestOptions requestOptions = (RequestOptions) super.clone();
            requestOptions.options = new Options();
            requestOptions.options.putAll(this.options);
            requestOptions.transformations = new CachedHashCodeArrayMap();
            requestOptions.transformations.putAll(this.transformations);
            requestOptions.isLocked = false;
            requestOptions.isAutoCloneEnabled = false;
            return requestOptions;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    @CheckResult
    @NonNull
    public RequestOptions dontTransform() {
        if (this.isAutoCloneEnabled) {
            return clone().dontTransform();
        }
        this.transformations.clear();
        this.fields &= -2049;
        this.isTransformationRequired = false;
        this.fields &= -131073;
        this.isTransformationAllowed = false;
        this.fields |= 65536;
        this.isScaleOnlyOrNoTransform = true;
        return selfOrThrowIfLocked();
    }

    public int hashCode() {
        return Util.hashCode((Object) this.theme, Util.hashCode((Object) this.signature, Util.hashCode((Object) this.resourceClass, Util.hashCode((Object) this.transformations, Util.hashCode((Object) this.options, Util.hashCode((Object) this.priority, Util.hashCode((Object) this.diskCacheStrategy, Util.hashCode(this.onlyRetrieveFromCache, Util.hashCode(this.useUnlimitedSourceGeneratorsPool, Util.hashCode(this.isTransformationAllowed, Util.hashCode(this.isTransformationRequired, Util.hashCode(this.overrideWidth, Util.hashCode(this.overrideHeight, Util.hashCode(this.isCacheable, Util.hashCode((Object) this.fallbackDrawable, Util.hashCode(this.fallbackId, Util.hashCode((Object) this.placeholderDrawable, Util.hashCode(this.placeholderId, Util.hashCode((Object) this.errorPlaceholder, Util.hashCode(this.errorId, Util.hashCode(this.sizeMultiplier)))))))))))))))))))));
    }

    private boolean isSet(int i) {
        return isSet(this.fields, i);
    }

    @CheckResult
    @NonNull
    public static RequestOptions overrideOf(@IntRange(from = 0) int i) {
        return overrideOf(i, i);
    }

    @CheckResult
    @NonNull
    public RequestOptions optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return transform(transformation, false);
    }

    @CheckResult
    @NonNull
    public RequestOptions override(int i) {
        return override(i, i);
    }

    @CheckResult
    @NonNull
    public RequestOptions transform(@NonNull Transformation<Bitmap> transformation) {
        return transform(transformation, true);
    }

    @CheckResult
    @NonNull
    public static RequestOptions bitmapTransform(@NonNull Transformation<Bitmap> transformation) {
        return new RequestOptions().transform(transformation);
    }

    @CheckResult
    @NonNull
    public static RequestOptions decodeTypeOf(@NonNull Class<?> cls) {
        return new RequestOptions().decode(cls);
    }

    @CheckResult
    @NonNull
    public static RequestOptions diskCacheStrategyOf(@NonNull DiskCacheStrategy diskCacheStrategy2) {
        return new RequestOptions().diskCacheStrategy(diskCacheStrategy2);
    }

    @CheckResult
    @NonNull
    public static RequestOptions downsampleOf(@NonNull DownsampleStrategy downsampleStrategy) {
        return new RequestOptions().downsample(downsampleStrategy);
    }

    @CheckResult
    @NonNull
    public static RequestOptions encodeFormatOf(@NonNull Bitmap.CompressFormat compressFormat) {
        return new RequestOptions().encodeFormat(compressFormat);
    }

    @CheckResult
    @NonNull
    public static RequestOptions encodeQualityOf(@IntRange(from = 0, to = 100) int i) {
        return new RequestOptions().encodeQuality(i);
    }

    @CheckResult
    @NonNull
    public static RequestOptions errorOf(@DrawableRes int i) {
        return new RequestOptions().error(i);
    }

    @CheckResult
    @NonNull
    public static RequestOptions formatOf(@NonNull DecodeFormat decodeFormat) {
        return new RequestOptions().format(decodeFormat);
    }

    @CheckResult
    @NonNull
    public static RequestOptions frameOf(@IntRange(from = 0) long j) {
        return new RequestOptions().frame(j);
    }

    @CheckResult
    @NonNull
    public static RequestOptions placeholderOf(@DrawableRes int i) {
        return new RequestOptions().placeholder(i);
    }

    @CheckResult
    @NonNull
    public static RequestOptions priorityOf(@NonNull Priority priority2) {
        return new RequestOptions().priority(priority2);
    }

    @CheckResult
    @NonNull
    public static RequestOptions signatureOf(@NonNull Key key) {
        return new RequestOptions().signature(key);
    }

    @CheckResult
    @NonNull
    public static RequestOptions sizeMultiplierOf(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return new RequestOptions().sizeMultiplier(f2);
    }

    @CheckResult
    @NonNull
    public static RequestOptions timeoutOf(@IntRange(from = 0) int i) {
        return new RequestOptions().timeout(i);
    }

    @CheckResult
    @NonNull
    public RequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(downsampleStrategy));
    }

    @CheckResult
    @NonNull
    public RequestOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(compressFormat));
    }

    @CheckResult
    @NonNull
    public RequestOptions encodeQuality(@IntRange(from = 0, to = 100) int i) {
        return set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(i));
    }

    @CheckResult
    @NonNull
    public RequestOptions format(@NonNull DecodeFormat decodeFormat) {
        Preconditions.checkNotNull(decodeFormat);
        return set(Downsampler.DECODE_FORMAT, decodeFormat).set(GifOptions.DECODE_FORMAT, decodeFormat);
    }

    @CheckResult
    @NonNull
    public RequestOptions frame(@IntRange(from = 0) long j) {
        return set(VideoDecoder.TARGET_FRAME, Long.valueOf(j));
    }

    @CheckResult
    @NonNull
    public RequestOptions timeout(@IntRange(from = 0) int i) {
        return set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(i));
    }

    @CheckResult
    @NonNull
    public RequestOptions transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return transform((Transformation<Bitmap>) new MultiTransformation<Bitmap>((Transformation<T>[]) transformationArr), true);
    }

    @CheckResult
    @NonNull
    public static RequestOptions errorOf(@Nullable Drawable drawable) {
        return new RequestOptions().error(drawable);
    }

    @CheckResult
    @NonNull
    public static RequestOptions placeholderOf(@Nullable Drawable drawable) {
        return new RequestOptions().placeholder(drawable);
    }

    @CheckResult
    @NonNull
    public RequestOptions decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return clone().decode(cls);
        }
        this.resourceClass = (Class) Preconditions.checkNotNull(cls);
        this.fields |= 4096;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy2) {
        if (this.isAutoCloneEnabled) {
            return clone().diskCacheStrategy(diskCacheStrategy2);
        }
        this.diskCacheStrategy = (DiskCacheStrategy) Preconditions.checkNotNull(diskCacheStrategy2);
        this.fields |= 4;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions onlyRetrieveFromCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().onlyRetrieveFromCache(z);
        }
        this.onlyRetrieveFromCache = z;
        this.fields |= 524288;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions priority(@NonNull Priority priority2) {
        if (this.isAutoCloneEnabled) {
            return clone().priority(priority2);
        }
        this.priority = (Priority) Preconditions.checkNotNull(priority2);
        this.fields |= 8;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions signature(@NonNull Key key) {
        if (this.isAutoCloneEnabled) {
            return clone().signature(key);
        }
        this.signature = (Key) Preconditions.checkNotNull(key);
        this.fields |= 1024;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions skipMemoryCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().skipMemoryCache(true);
        }
        this.isCacheable = !z;
        this.fields |= 256;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions theme(@Nullable Resources.Theme theme2) {
        if (this.isAutoCloneEnabled) {
            return clone().theme(theme2);
        }
        this.theme = theme2;
        this.fields |= 32768;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions useAnimationPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().useAnimationPool(z);
        }
        this.useAnimationPool = z;
        this.fields |= 1048576;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.useUnlimitedSourceGeneratorsPool = z;
        this.fields |= 262144;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public static RequestOptions skipMemoryCacheOf(boolean z) {
        if (z) {
            if (skipMemoryCacheTrueOptions == null) {
                skipMemoryCacheTrueOptions = new RequestOptions().skipMemoryCache(true).autoClone();
            }
            return skipMemoryCacheTrueOptions;
        }
        if (skipMemoryCacheFalseOptions == null) {
            skipMemoryCacheFalseOptions = new RequestOptions().skipMemoryCache(false).autoClone();
        }
        return skipMemoryCacheFalseOptions;
    }

    @CheckResult
    @NonNull
    public RequestOptions error(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().error(i);
        }
        this.errorId = i;
        this.fields |= 32;
        this.errorPlaceholder = null;
        this.fields &= -17;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions fallback(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(i);
        }
        this.fallbackId = i;
        this.fields |= 16384;
        this.fallbackDrawable = null;
        this.fields &= -8193;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions placeholder(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(i);
        }
        this.placeholderId = i;
        this.fields |= SearchJediMixFeedAdapter.f42517f;
        this.placeholderDrawable = null;
        this.fields &= -65;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (this.isAutoCloneEnabled) {
            return clone().sizeMultiplier(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f2;
        this.fields |= 2;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions error(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        this.fields |= 16;
        this.errorId = 0;
        this.fields &= -33;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions fallback(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        this.fields |= 8192;
        this.fallbackId = 0;
        this.fields &= -16385;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public RequestOptions placeholder(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        this.fields |= 64;
        this.placeholderId = 0;
        this.fields &= -129;
        return selfOrThrowIfLocked();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof RequestOptions)) {
            return false;
        }
        RequestOptions requestOptions = (RequestOptions) obj;
        if (Float.compare(requestOptions.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == requestOptions.errorId && Util.bothNullOrEqual(this.errorPlaceholder, requestOptions.errorPlaceholder) && this.placeholderId == requestOptions.placeholderId && Util.bothNullOrEqual(this.placeholderDrawable, requestOptions.placeholderDrawable) && this.fallbackId == requestOptions.fallbackId && Util.bothNullOrEqual(this.fallbackDrawable, requestOptions.fallbackDrawable) && this.isCacheable == requestOptions.isCacheable && this.overrideHeight == requestOptions.overrideHeight && this.overrideWidth == requestOptions.overrideWidth && this.isTransformationRequired == requestOptions.isTransformationRequired && this.isTransformationAllowed == requestOptions.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == requestOptions.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == requestOptions.onlyRetrieveFromCache && this.diskCacheStrategy.equals(requestOptions.diskCacheStrategy) && this.priority == requestOptions.priority && this.options.equals(requestOptions.options) && this.transformations.equals(requestOptions.transformations) && this.resourceClass.equals(requestOptions.resourceClass) && Util.bothNullOrEqual(this.signature, requestOptions.signature) && Util.bothNullOrEqual(this.theme, requestOptions.theme)) {
            return true;
        }
        return false;
    }

    @CheckResult
    @NonNull
    public RequestOptions apply(@NonNull RequestOptions requestOptions) {
        if (this.isAutoCloneEnabled) {
            return clone().apply(requestOptions);
        }
        if (isSet(requestOptions.fields, 2)) {
            this.sizeMultiplier = requestOptions.sizeMultiplier;
        }
        if (isSet(requestOptions.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = requestOptions.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(requestOptions.fields, 1048576)) {
            this.useAnimationPool = requestOptions.useAnimationPool;
        }
        if (isSet(requestOptions.fields, 4)) {
            this.diskCacheStrategy = requestOptions.diskCacheStrategy;
        }
        if (isSet(requestOptions.fields, 8)) {
            this.priority = requestOptions.priority;
        }
        if (isSet(requestOptions.fields, 16)) {
            this.errorPlaceholder = requestOptions.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(requestOptions.fields, 32)) {
            this.errorId = requestOptions.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(requestOptions.fields, 64)) {
            this.placeholderDrawable = requestOptions.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(requestOptions.fields, SearchJediMixFeedAdapter.f42517f)) {
            this.placeholderId = requestOptions.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(requestOptions.fields, 256)) {
            this.isCacheable = requestOptions.isCacheable;
        }
        if (isSet(requestOptions.fields, 512)) {
            this.overrideWidth = requestOptions.overrideWidth;
            this.overrideHeight = requestOptions.overrideHeight;
        }
        if (isSet(requestOptions.fields, 1024)) {
            this.signature = requestOptions.signature;
        }
        if (isSet(requestOptions.fields, 4096)) {
            this.resourceClass = requestOptions.resourceClass;
        }
        if (isSet(requestOptions.fields, 8192)) {
            this.fallbackDrawable = requestOptions.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(requestOptions.fields, 16384)) {
            this.fallbackId = requestOptions.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(requestOptions.fields, 32768)) {
            this.theme = requestOptions.theme;
        }
        if (isSet(requestOptions.fields, 65536)) {
            this.isTransformationAllowed = requestOptions.isTransformationAllowed;
        }
        if (isSet(requestOptions.fields, 131072)) {
            this.isTransformationRequired = requestOptions.isTransformationRequired;
        }
        if (isSet(requestOptions.fields, 2048)) {
            this.transformations.putAll(requestOptions.transformations);
            this.isScaleOnlyOrNoTransform = requestOptions.isScaleOnlyOrNoTransform;
        }
        if (isSet(requestOptions.fields, 524288)) {
            this.onlyRetrieveFromCache = requestOptions.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            this.fields &= -2049;
            this.isTransformationRequired = false;
            this.fields &= -131073;
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= requestOptions.fields;
        this.options.putAll(requestOptions.options);
        return selfOrThrowIfLocked();
    }

    @NonNull
    private RequestOptions optionalScaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return scaleOnlyTransform(downsampleStrategy, transformation, false);
    }

    @NonNull
    private RequestOptions scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return scaleOnlyTransform(downsampleStrategy, transformation, true);
    }

    @CheckResult
    @NonNull
    public static <T> RequestOptions option(@NonNull Option<T> option, @NonNull T t) {
        return new RequestOptions().set(option, t);
    }

    @CheckResult
    @NonNull
    public static RequestOptions overrideOf(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return new RequestOptions().override(i, i2);
    }

    @CheckResult
    @NonNull
    public <T> RequestOptions optionalTransform(@NonNull Class<T> cls, @NonNull Transformation<T> transformation) {
        return transform(cls, transformation, false);
    }

    @CheckResult
    @NonNull
    public <T> RequestOptions transform(@NonNull Class<T> cls, @NonNull Transformation<T> transformation) {
        return transform(cls, transformation, true);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public final RequestOptions optionalTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        RequestOptions requestOptions = this;
        while (requestOptions.isAutoCloneEnabled) {
            requestOptions = requestOptions.clone();
        }
        requestOptions.downsample(downsampleStrategy);
        return requestOptions.transform(transformation, false);
    }

    @CheckResult
    @NonNull
    public RequestOptions override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= 512;
        return selfOrThrowIfLocked();
    }

    @CheckResult
    @NonNull
    public <T> RequestOptions set(@NonNull Option<T> option, @NonNull T t) {
        if (this.isAutoCloneEnabled) {
            return clone().set(option, t);
        }
        Preconditions.checkNotNull(option);
        Preconditions.checkNotNull(t);
        this.options.set(option, t);
        return selfOrThrowIfLocked();
    }

    /* access modifiers changed from: package-private */
    @CheckResult
    @NonNull
    public final RequestOptions transform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        RequestOptions requestOptions = this;
        while (requestOptions.isAutoCloneEnabled) {
            requestOptions = requestOptions.clone();
        }
        requestOptions.downsample(downsampleStrategy);
        return requestOptions.transform(transformation);
    }

    @NonNull
    private RequestOptions transform(@NonNull Transformation<Bitmap> transformation, boolean z) {
        RequestOptions requestOptions = this;
        while (requestOptions.isAutoCloneEnabled) {
            requestOptions = requestOptions.clone();
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        requestOptions.transform(Bitmap.class, transformation, z);
        requestOptions.transform(Drawable.class, drawableTransformation, z);
        requestOptions.transform(BitmapDrawable.class, drawableTransformation.asBitmapDrawable(), z);
        requestOptions.transform(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        return requestOptions.selfOrThrowIfLocked();
    }

    @NonNull
    private RequestOptions scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation, boolean z) {
        RequestOptions requestOptions;
        if (z) {
            requestOptions = transform(downsampleStrategy, transformation);
        } else {
            requestOptions = optionalTransform(downsampleStrategy, transformation);
        }
        requestOptions.isScaleOnlyOrNoTransform = true;
        return requestOptions;
    }

    @NonNull
    private <T> RequestOptions transform(@NonNull Class<T> cls, @NonNull Transformation<T> transformation, boolean z) {
        RequestOptions requestOptions = this;
        while (requestOptions.isAutoCloneEnabled) {
            requestOptions = requestOptions.clone();
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(transformation);
        requestOptions.transformations.put(cls, transformation);
        requestOptions.fields |= 2048;
        requestOptions.isTransformationAllowed = true;
        requestOptions.fields |= 65536;
        requestOptions.isScaleOnlyOrNoTransform = false;
        if (z) {
            requestOptions.fields |= 131072;
            requestOptions.isTransformationRequired = true;
        }
        return requestOptions.selfOrThrowIfLocked();
    }
}

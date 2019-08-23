package com.dylanvann.fastimage1;

import android.content.res.Resources;
import android.graphics.Bitmap;
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
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.request.RequestOptions;

public final class h extends RequestOptions implements Cloneable {
    /* access modifiers changed from: private */
    @CheckResult
    /* renamed from: a */
    public h clone() {
        return (h) super.clone();
    }

    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions autoClone() {
        return (h) super.autoClone();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions centerCrop() {
        return (h) super.centerCrop();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions centerInside() {
        return (h) super.centerInside();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions circleCrop() {
        return (h) super.circleCrop();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions disallowHardwareConfig() {
        return (h) super.disallowHardwareConfig();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions dontAnimate() {
        return (h) super.dontAnimate();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions dontTransform() {
        return (h) super.dontTransform();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions fitCenter() {
        return (h) super.fitCenter();
    }

    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions lock() {
        return (h) super.lock();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalCenterCrop() {
        return (h) super.optionalCenterCrop();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalCenterInside() {
        return (h) super.optionalCenterInside();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalCircleCrop() {
        return (h) super.optionalCircleCrop();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalFitCenter() {
        return (h) super.optionalFitCenter();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions decode(@NonNull Class cls) {
        return (h) super.decode(cls);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        return (h) super.diskCacheStrategy(diskCacheStrategy);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return (h) super.downsample(downsampleStrategy);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (h) super.encodeFormat(compressFormat);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions encodeQuality(@IntRange(from = 0, to = 100) int i) {
        return (h) super.encodeQuality(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions error(@DrawableRes int i) {
        return (h) super.error(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions fallback(@DrawableRes int i) {
        return (h) super.fallback(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions format(@NonNull DecodeFormat decodeFormat) {
        return (h) super.format(decodeFormat);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions frame(@IntRange(from = 0) long j) {
        return (h) super.frame(j);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions onlyRetrieveFromCache(boolean z) {
        return (h) super.onlyRetrieveFromCache(z);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalTransform(@NonNull Transformation transformation) {
        return (h) super.optionalTransform(transformation);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions override(int i) {
        return (h) super.override(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions placeholder(@DrawableRes int i) {
        return (h) super.placeholder(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions priority(@NonNull Priority priority) {
        return (h) super.priority(priority);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions signature(@NonNull Key key) {
        return (h) super.signature(key);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions sizeMultiplier(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        return (h) super.sizeMultiplier(f2);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions skipMemoryCache(boolean z) {
        return (h) super.skipMemoryCache(z);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions theme(@Nullable Resources.Theme theme) {
        return (h) super.theme(theme);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions timeout(@IntRange(from = 0) int i) {
        return (h) super.timeout(i);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions transform(@NonNull Transformation transformation) {
        return (h) super.transform(transformation);
    }

    @SafeVarargs
    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions transforms(@NonNull Transformation[] transformationArr) {
        return (h) super.transforms(transformationArr);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions useAnimationPool(boolean z) {
        return (h) super.useAnimationPool(z);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions useUnlimitedSourceGeneratorsPool(boolean z) {
        return (h) super.useUnlimitedSourceGeneratorsPool(z);
    }

    @CheckResult
    @NonNull
    /* renamed from: a */
    public final h apply(@NonNull RequestOptions requestOptions) {
        return (h) super.apply(requestOptions);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions error(@Nullable Drawable drawable) {
        return (h) super.error(drawable);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions fallback(@Nullable Drawable drawable) {
        return (h) super.fallback(drawable);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions placeholder(@Nullable Drawable drawable) {
        return (h) super.placeholder(drawable);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions set(@NonNull Option option, @NonNull Object obj) {
        return (h) super.set(option, obj);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions optionalTransform(@NonNull Class cls, @NonNull Transformation transformation) {
        return (h) super.optionalTransform(cls, transformation);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions override(int i, int i2) {
        return (h) super.override(i, i2);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestOptions transform(@NonNull Class cls, @NonNull Transformation transformation) {
        return (h) super.transform(cls, transformation);
    }
}

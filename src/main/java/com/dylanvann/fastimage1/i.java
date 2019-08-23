package com.dylanvann.fastimage1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.CheckResult;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RawRes;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.TransitionOptions;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;

public final class i<TranscodeType> extends RequestBuilder<TranscodeType> implements Cloneable {
    /* access modifiers changed from: private */
    @Deprecated
    @CheckResult
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable URL url) {
        return (i) super.load(url);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable byte[] bArr) {
        return (i) super.load(bArr);
    }

    /* access modifiers changed from: private */
    @CheckResult
    /* renamed from: a */
    public i<TranscodeType> clone() {
        return (i) super.clone();
    }

    @CheckResult
    @NonNull
    public final /* synthetic */ RequestBuilder getDownloadOnlyRequest() {
        return new i(File.class, this).apply(DOWNLOAD_ONLY_OPTIONS);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder addListener(@Nullable RequestListener requestListener) {
        return (i) super.addListener(requestListener);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder error(@Nullable RequestBuilder requestBuilder) {
        return (i) super.error(requestBuilder);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder listener(@Nullable RequestListener requestListener) {
        return (i) super.listener(requestListener);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder thumbnail(float f2) {
        return (i) super.thumbnail(f2);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder transition(@NonNull TransitionOptions transitionOptions) {
        return (i) super.transition(transitionOptions);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable Bitmap bitmap) {
        return (i) super.load(bitmap);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder thumbnail(@Nullable RequestBuilder requestBuilder) {
        return (i) super.thumbnail(requestBuilder);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable Drawable drawable) {
        return (i) super.load(drawable);
    }

    @SafeVarargs
    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder thumbnail(@Nullable RequestBuilder[] requestBuilderArr) {
        return (i) super.thumbnail((RequestBuilder<TranscodeType>[]) requestBuilderArr);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable Uri uri) {
        return (i) super.load(uri);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> apply(@NonNull RequestOptions requestOptions) {
        return (i) super.apply(requestOptions);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable File file) {
        return (i) super.load(file);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable @RawRes @DrawableRes Integer num) {
        return (i) super.load(num);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable Object obj) {
        return (i) super.load(obj);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<TranscodeType> load(@Nullable String str) {
        return (i) super.load(str);
    }

    private i(@NonNull Class<TranscodeType> cls, @NonNull RequestBuilder<?> requestBuilder) {
        super(cls, requestBuilder);
    }

    i(@NonNull Glide glide, @NonNull RequestManager requestManager, @NonNull Class<TranscodeType> cls, @NonNull Context context) {
        super(glide, requestManager, cls, context);
    }
}

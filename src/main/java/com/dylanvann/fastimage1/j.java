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
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.request.RequestOptions;
import java.io.File;
import java.net.URL;

public final class j extends RequestManager {
    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder asBitmap() {
        return (i) super.asBitmap();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder asDrawable() {
        return (i) super.asDrawable();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder asFile() {
        return (i) super.asFile();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder asGif() {
        return (i) super.asGif();
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder downloadOnly() {
        return (i) super.downloadOnly();
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable Bitmap bitmap) {
        return (i) super.load(bitmap);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ RequestManager applyDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        return (j) super.applyDefaultRequestOptions(requestOptions);
    }

    @CheckResult
    @NonNull
    public final /* bridge */ /* synthetic */ RequestBuilder download(@Nullable Object obj) {
        return (i) super.download(obj);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ RequestManager setDefaultRequestOptions(@NonNull RequestOptions requestOptions) {
        return (j) super.setDefaultRequestOptions(requestOptions);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable Drawable drawable) {
        return (i) super.load(drawable);
    }

    @CheckResult
    @NonNull
    public final /* synthetic */ RequestBuilder as(@NonNull Class cls) {
        return new i(this.glide, this, cls, this.context);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable Uri uri) {
        return (i) super.load(uri);
    }

    public final void setRequestOptions(@NonNull RequestOptions requestOptions) {
        if (requestOptions instanceof h) {
            super.setRequestOptions(requestOptions);
        } else {
            super.setRequestOptions(new h().apply(requestOptions));
        }
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable File file) {
        return (i) super.load(file);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable @RawRes @DrawableRes Integer num) {
        return (i) super.load(num);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable Object obj) {
        return (i) super.load(obj);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable String str) {
        return (i) super.load(str);
    }

    /* access modifiers changed from: private */
    @Deprecated
    @CheckResult
    /* renamed from: a */
    public i<Drawable> load(@Nullable URL url) {
        return (i) super.load(url);
    }

    /* access modifiers changed from: private */
    @CheckResult
    @NonNull
    /* renamed from: a */
    public i<Drawable> load(@Nullable byte[] bArr) {
        return (i) super.load(bArr);
    }

    public j(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        super(glide, lifecycle, requestManagerTreeNode, context);
    }
}

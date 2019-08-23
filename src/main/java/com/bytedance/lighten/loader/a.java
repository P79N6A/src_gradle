package com.bytedance.lighten.loader;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.view.View;
import com.bytedance.lighten.core.b.g;
import com.bytedance.lighten.core.i;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.view.c;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.ImageInfo;
import java.lang.ref.WeakReference;

public final class a extends BaseControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public CloseableAnimatedImage f21800a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<c> f21801b;

    /* renamed from: c  reason: collision with root package name */
    private g f21802c;

    /* renamed from: d  reason: collision with root package name */
    private Uri f21803d;

    public final void onFailure(String str, Throwable th) {
        if (this.f21802c != null) {
            this.f21802c.a(this.f21803d, (View) this.f21801b.get(), th);
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (this.f21802c != null) {
            this.f21802c.a(this.f21803d, (View) this.f21801b.get());
        }
    }

    a(c cVar, g gVar, Uri uri) {
        this.f21801b = new WeakReference<>(cVar);
        this.f21802c = gVar;
        this.f21803d = uri;
    }

    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (imageInfo != null) {
            if (imageInfo instanceof CloseableAnimatedImage) {
                this.f21800a = (CloseableAnimatedImage) imageInfo;
            }
            if (this.f21802c != null) {
                this.f21802c.a(this.f21803d, (View) this.f21801b.get(), new i(imageInfo.getWidth(), imageInfo.getHeight()), animatable);
            }
        }
    }
}

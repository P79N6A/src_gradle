package com.ss.android.ugc.aweme.feed.listener;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.c;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import javax.annotation.Nullable;

public final class f implements ControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45615a;

    /* renamed from: b  reason: collision with root package name */
    private VideoViewHolder f45616b;

    /* renamed from: c  reason: collision with root package name */
    private Aweme f45617c = this.f45616b.d();

    /* renamed from: d  reason: collision with root package name */
    private Video f45618d;

    /* renamed from: e  reason: collision with root package name */
    private long f45619e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f45620f;

    public final void onIntermediateImageFailed(String str, Throwable th) {
    }

    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
    }

    private boolean a() {
        if (this.f45616b == null || this.f45617c == null || this.f45618d == null) {
            return true;
        }
        return false;
    }

    public final void onRelease(String str) {
        this.f45616b = null;
        this.f45617c = null;
        this.f45618d = null;
    }

    public f(VideoViewHolder videoViewHolder) {
        this.f45616b = videoViewHolder;
    }

    public final void onFailure(String str, Throwable th) {
        if (PatchProxy.isSupport(new Object[]{str, th}, this, f45615a, false, 41360, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, th}, this, f45615a, false, 41360, new Class[]{String.class, Throwable.class}, Void.TYPE);
        } else if (!a()) {
        }
    }

    public final void onSubmit(String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{str, obj}, this, f45615a, false, 41358, new Class[]{String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, obj}, this, f45615a, false, 41358, new Class[]{String.class, Object.class}, Void.TYPE);
        } else if (!a()) {
            this.f45619e = System.currentTimeMillis();
            this.f45620f = c.a(Uri.parse(this.f45618d.getOriginCover().getUrlList().get(0)));
        }
    }

    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        ImageInfo imageInfo = (ImageInfo) obj;
        if (PatchProxy.isSupport(new Object[]{str, imageInfo, animatable}, this, f45615a, false, 41359, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, imageInfo, animatable}, this, f45615a, false, 41359, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
            return;
        }
        ag.i().d();
        a();
    }
}

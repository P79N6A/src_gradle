package com.facebook.drawee.backends.pipeline.info.a;

import android.graphics.drawable.Animatable;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.time.b;
import com.facebook.drawee.backends.pipeline.info.g;
import com.facebook.drawee.backends.pipeline.info.h;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.imagepipeline.image.ImageInfo;
import javax.annotation.Nullable;

public final class a extends BaseControllerListener<ImageInfo> {

    /* renamed from: a  reason: collision with root package name */
    private final b f23653a;

    /* renamed from: b  reason: collision with root package name */
    private final h f23654b;

    /* renamed from: c  reason: collision with root package name */
    private final g f23655c;

    @VisibleForTesting
    private void a(long j) {
        this.f23654b.a(false);
        this.f23654b.t = j;
        this.f23655c.b(this.f23654b, 2);
    }

    public final void onRelease(String str) {
        super.onRelease(str);
        long now = this.f23653a.now();
        int i = this.f23654b.q;
        if (!(i == 3 || i == 5)) {
            this.f23654b.j = now;
            this.f23654b.f23674a = str;
            this.f23655c.a(this.f23654b, 4);
        }
        a(now);
    }

    public final void onFailure(String str, Throwable th) {
        long now = this.f23653a.now();
        this.f23654b.i = now;
        this.f23654b.f23674a = str;
        this.f23655c.a(this.f23654b, 5);
        a(now);
    }

    public final /* synthetic */ void onIntermediateImageSet(String str, @Nullable Object obj) {
        this.f23654b.g = this.f23653a.now();
        this.f23654b.f23674a = str;
        this.f23654b.f23678e = (ImageInfo) obj;
        this.f23655c.a(this.f23654b, 2);
    }

    public final void onSubmit(String str, Object obj) {
        long now = this.f23653a.now();
        this.f23654b.f23679f = now;
        this.f23654b.f23674a = str;
        this.f23654b.f23677d = obj;
        this.f23655c.a(this.f23654b, 0);
        this.f23654b.a(true);
        this.f23654b.s = now;
        this.f23655c.b(this.f23654b, 1);
    }

    public a(b bVar, h hVar, g gVar) {
        this.f23653a = bVar;
        this.f23654b = hVar;
        this.f23655c = gVar;
    }

    public final /* synthetic */ void onFinalImageSet(String str, @Nullable Object obj, @Nullable Animatable animatable) {
        long now = this.f23653a.now();
        this.f23654b.h = now;
        this.f23654b.l = now;
        this.f23654b.f23674a = str;
        this.f23654b.f23678e = (ImageInfo) obj;
        this.f23655c.a(this.f23654b, 3);
    }
}

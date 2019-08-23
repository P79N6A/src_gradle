package com.facebook.drawee.backends.pipeline.info.a;

import com.facebook.common.time.b;
import com.facebook.drawee.backends.pipeline.info.h;
import com.facebook.imagepipeline.listener.a;
import com.facebook.imagepipeline.request.ImageRequest;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private final b f23658a;

    /* renamed from: b  reason: collision with root package name */
    private final h f23659b;

    public final void onRequestCancellation(String str) {
        this.f23659b.l = this.f23658a.now();
        this.f23659b.f23675b = str;
    }

    public c(b bVar, h hVar) {
        this.f23658a = bVar;
        this.f23659b = hVar;
    }

    public final void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        this.f23659b.l = this.f23658a.now();
        this.f23659b.f23676c = imageRequest;
        this.f23659b.f23675b = str;
        this.f23659b.n = z;
    }

    public final void onRequestFailure(ImageRequest imageRequest, String str, Throwable th, boolean z) {
        this.f23659b.l = this.f23658a.now();
        this.f23659b.f23676c = imageRequest;
        this.f23659b.f23675b = str;
        this.f23659b.n = z;
    }

    public final void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f23659b.k = this.f23658a.now();
        this.f23659b.f23676c = imageRequest;
        this.f23659b.f23677d = obj;
        this.f23659b.f23675b = str;
        this.f23659b.n = z;
    }
}

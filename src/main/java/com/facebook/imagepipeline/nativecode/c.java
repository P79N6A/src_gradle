package com.facebook.imagepipeline.nativecode;

import android.support.annotation.Nullable;
import com.facebook.imagepipeline.transcoder.b;

public final class c implements com.facebook.imagepipeline.transcoder.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f23997a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f23998b;

    public c(int i, boolean z) {
        this.f23997a = i;
        this.f23998b = z;
    }

    @Nullable
    public final b createImageTranscoder(com.facebook.b.c cVar, boolean z) {
        if (cVar != com.facebook.b.b.f23288a) {
            return null;
        }
        return new NativeJpegTranscoder(z, this.f23997a, this.f23998b);
    }
}

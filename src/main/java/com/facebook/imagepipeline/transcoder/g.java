package com.facebook.imagepipeline.transcoder;

import com.facebook.b.c;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final int f24227a;

    public g(int i) {
        this.f24227a = i;
    }

    public final b createImageTranscoder(c cVar, boolean z) {
        return new f(z, this.f24227a);
    }
}

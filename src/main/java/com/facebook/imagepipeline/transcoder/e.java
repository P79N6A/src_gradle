package com.facebook.imagepipeline.transcoder;

import com.facebook.b.c;
import javax.annotation.Nullable;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final int f24221a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f24222b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private final c f24223c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    private final Integer f24224d;

    @Nullable
    private b a(c cVar, boolean z) {
        return new com.facebook.imagepipeline.nativecode.c(this.f24221a, this.f24222b).createImageTranscoder(cVar, z);
    }

    private b b(c cVar, boolean z) {
        return new g(this.f24221a).createImageTranscoder(cVar, z);
    }

    public final b createImageTranscoder(c cVar, boolean z) {
        b bVar;
        b bVar2 = null;
        if (this.f24223c == null) {
            bVar = null;
        } else {
            bVar = this.f24223c.createImageTranscoder(cVar, z);
        }
        if (bVar == null) {
            if (this.f24224d != null) {
                switch (this.f24224d.intValue()) {
                    case 0:
                        bVar2 = a(cVar, z);
                        break;
                    case 1:
                        bVar2 = b(cVar, z);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid ImageTranscoderType");
                }
            }
            bVar = bVar2;
        }
        if (bVar == null) {
            bVar = a(cVar, z);
        }
        if (bVar == null) {
            return b(cVar, z);
        }
        return bVar;
    }

    public e(int i, boolean z, @Nullable c cVar, @Nullable Integer num) {
        this.f24221a = i;
        this.f24222b = z;
        this.f24223c = cVar;
        this.f24224d = num;
    }
}

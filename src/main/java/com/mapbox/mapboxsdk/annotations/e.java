package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f26435a;

    /* renamed from: b  reason: collision with root package name */
    private Bitmap f26436b;

    public final Bitmap a() {
        if (!(this.f26436b == null || this.f26436b.getConfig() == Bitmap.Config.ARGB_8888)) {
            this.f26436b = this.f26436b.copy(Bitmap.Config.ARGB_8888, false);
        }
        return this.f26436b;
    }

    public final float b() {
        if (this.f26436b != null) {
            float density = (float) this.f26436b.getDensity();
            if (density == 0.0f) {
                density = 160.0f;
            }
            return density / 160.0f;
        }
        throw new IllegalStateException("Required to set a Icon before calling getScale");
    }

    public final int hashCode() {
        int i;
        if (this.f26436b != null) {
            i = this.f26436b.hashCode();
        } else {
            i = 0;
        }
        if (this.f26435a != null) {
            return (i * 31) + this.f26435a.hashCode();
        }
        return i;
    }

    public final byte[] c() {
        if (this.f26436b != null) {
            ByteBuffer allocate = ByteBuffer.allocate(this.f26436b.getRowBytes() * this.f26436b.getHeight());
            this.f26436b.copyPixelsToBuffer(allocate);
            return allocate.array();
        }
        throw new IllegalStateException("Required to set a Icon before calling toBytes");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f26436b.equals(eVar.f26436b) || !this.f26435a.equals(eVar.f26435a)) {
            return false;
        }
        return true;
    }

    e(String str, Bitmap bitmap) {
        this.f26435a = str;
        this.f26436b = bitmap;
    }
}

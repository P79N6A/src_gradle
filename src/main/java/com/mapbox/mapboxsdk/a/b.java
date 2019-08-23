package com.mapbox.mapboxsdk.a;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.support.annotation.Nullable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Bitmap f26383a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f26384b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26385c;

    public final int hashCode() {
        int i;
        int i2 = 0;
        if (this.f26383a != null) {
            i = this.f26383a.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        if (this.f26384b != null) {
            i2 = this.f26384b.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "AttributionLayout{logo=" + this.f26383a + ", anchorPoint=" + this.f26384b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f26383a == null ? bVar.f26383a != null : !this.f26383a.equals(bVar.f26383a)) {
            return false;
        }
        if (this.f26384b != null) {
            return this.f26384b.equals(bVar.f26384b);
        }
        if (bVar.f26384b == null) {
            return true;
        }
        return false;
    }

    public b(@Nullable Bitmap bitmap, @Nullable PointF pointF, boolean z) {
        this.f26383a = bitmap;
        this.f26384b = pointF;
        this.f26385c = z;
    }
}

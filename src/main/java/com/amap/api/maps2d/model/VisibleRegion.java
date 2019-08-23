package com.amap.api.maps2d.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cm;

public final class VisibleRegion implements Parcelable {
    public static final l CREATOR = new l();

    /* renamed from: a  reason: collision with root package name */
    private final int f6417a;
    public final LatLng farLeft;
    public final LatLng farRight;
    public final LatLngBounds latLngBounds;
    public final LatLng nearLeft;
    public final LatLng nearRight;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.f6417a;
    }

    public final int hashCode() {
        return cm.a(new Object[]{this.nearLeft, this.nearRight, this.farLeft, this.farRight, this.latLngBounds});
    }

    public final String toString() {
        return cm.a(cm.a("nearLeft", (Object) this.nearLeft), cm.a("nearRight", (Object) this.nearRight), cm.a("farLeft", (Object) this.farLeft), cm.a("farRight", (Object) this.farRight), cm.a("latLngBounds", (Object) this.latLngBounds));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (!this.nearLeft.equals(visibleRegion.nearLeft) || !this.nearRight.equals(visibleRegion.nearRight) || !this.farLeft.equals(visibleRegion.farLeft) || !this.farRight.equals(visibleRegion.farRight) || !this.latLngBounds.equals(visibleRegion.latLngBounds)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        l.a(this, parcel, i);
    }

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this(1, latLng, latLng2, latLng3, latLng4, latLngBounds2);
    }

    VisibleRegion(int i, LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds2) {
        this.f6417a = i;
        this.nearLeft = latLng;
        this.nearRight = latLng2;
        this.farLeft = latLng3;
        this.farRight = latLng4;
        this.latLngBounds = latLngBounds2;
    }
}

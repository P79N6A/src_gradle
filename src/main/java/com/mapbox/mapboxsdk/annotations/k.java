package com.mapbox.mapboxsdk.annotations;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.geometry.LatLng;
import java.util.ArrayList;
import java.util.List;

public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new k[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new k(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public Polyline f26461a;

    public final int describeContents() {
        return 0;
    }

    private float a() {
        return this.f26461a.alpha;
    }

    private int b() {
        return this.f26461a.color;
    }

    private float c() {
        return this.f26461a.width;
    }

    private List<LatLng> d() {
        return this.f26461a.b();
    }

    public k() {
        this.f26461a = new Polyline();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (a() != 0.0f) {
            i = Float.floatToIntBits(a());
        } else {
            i = 0;
        }
        int b2 = (((i + 31) * 31) + b()) * 31;
        if (c() != 0.0f) {
            i2 = Float.floatToIntBits(c());
        } else {
            i2 = 0;
        }
        int i4 = (b2 + i2) * 31;
        if (d() != null) {
            i3 = d().hashCode();
        }
        return i4 + i3;
    }

    public final k a(float f2) {
        this.f26461a.a(f2);
        return this;
    }

    private k a(Iterable<LatLng> iterable) {
        for (LatLng a2 : iterable) {
            a(a2);
        }
        return this;
    }

    private k(Parcel parcel) {
        this.f26461a = new Polyline();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, LatLng.class.getClassLoader());
        a((Iterable<LatLng>) arrayList);
        float readFloat = parcel.readFloat();
        Polyline polyline = this.f26461a;
        polyline.alpha = readFloat;
        polyline.c();
        a(parcel.readInt());
        a(parcel.readFloat());
    }

    public final k a(int i) {
        this.f26461a.a(i);
        return this;
    }

    public final k a(LatLng latLng) {
        Polyline polyline = this.f26461a;
        polyline.points.add(latLng);
        polyline.c();
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (Float.compare(kVar.a(), a()) != 0 || b() != kVar.b() || Float.compare(kVar.c(), c()) != 0) {
            return false;
        }
        if (d() == null ? kVar.d() != null : !d().equals(kVar.d())) {
            return false;
        }
        return true;
    }

    /* synthetic */ k(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(d());
        parcel.writeFloat(a());
        parcel.writeInt(b());
        parcel.writeFloat(c());
    }
}

package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f26491a;

    /* renamed from: b  reason: collision with root package name */
    public final LatLng f26492b;

    /* renamed from: c  reason: collision with root package name */
    public final LatLng f26493c;

    /* renamed from: d  reason: collision with root package name */
    public final LatLng f26494d;

    /* renamed from: e  reason: collision with root package name */
    public final LatLngBounds f26495e;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return this.f26491a.hashCode() + 90 + ((this.f26492b.hashCode() + 90) * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE) + ((this.f26493c.hashCode() + 180) * 1000000) + ((this.f26494d.hashCode() + 180) * 1000000000);
    }

    public final String toString() {
        return "[farLeft [" + this.f26491a + "], farRight [" + this.f26492b + "], nearLeft [" + this.f26493c + "], nearRight [" + this.f26494d + "], latLngBounds [" + this.f26495e + "]]";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        b bVar = (b) obj;
        if (!this.f26491a.equals(bVar.f26491a) || !this.f26492b.equals(bVar.f26492b) || !this.f26493c.equals(bVar.f26493c) || !this.f26494d.equals(bVar.f26494d) || !this.f26495e.equals(bVar.f26495e)) {
            return false;
        }
        return true;
    }

    private b(Parcel parcel) {
        this.f26491a = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f26492b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f26493c = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f26494d = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f26495e = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
    }

    /* synthetic */ b(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f26491a, i);
        parcel.writeParcelable(this.f26492b, i);
        parcel.writeParcelable(this.f26493c, i);
        parcel.writeParcelable(this.f26494d, i);
        parcel.writeParcelable(this.f26495e, i);
    }

    public b(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.f26491a = latLng;
        this.f26492b = latLng2;
        this.f26493c = latLng3;
        this.f26494d = latLng4;
        this.f26495e = latLngBounds;
    }
}

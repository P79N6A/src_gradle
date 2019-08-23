package com.mapbox.mapboxsdk.annotations;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.mapboxsdk.b.c;
import com.mapbox.mapboxsdk.geometry.LatLng;

public final class h extends c<Marker, h> implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new h[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new h(parcel);
        }
    };

    public final /* bridge */ /* synthetic */ c a() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public h() {
    }

    public final Marker b() {
        if (this.f26425a != null) {
            return new Marker(this.f26425a, this.f26428d, this.f26427c, this.f26426b);
        }
        throw new c();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (this.f26425a != null) {
            i = this.f26425a.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i + 31) * 31;
        if (this.f26426b != null) {
            i2 = this.f26426b.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f26428d != null) {
            i3 = this.f26428d.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        if (this.f26427c != null) {
            i4 = this.f26427c.hashCode();
        }
        return i7 + i4;
    }

    protected h(Parcel parcel) {
        a((LatLng) parcel.readParcelable(LatLng.class.getClassLoader()));
        this.f26426b = parcel.readString();
        a();
        this.f26427c = parcel.readString();
        a();
        if (parcel.readByte() != 0) {
            a(new e(parcel.readString(), (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader())));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f26425a == null ? hVar.f26425a != null : !this.f26425a.equals(hVar.f26425a)) {
            return false;
        }
        if (this.f26426b == null ? hVar.f26426b != null : !this.f26426b.equals(hVar.f26426b)) {
            return false;
        }
        if (this.f26428d == null ? hVar.f26428d != null : !this.f26428d.equals(hVar.f26428d)) {
            return false;
        }
        if (this.f26427c == null ? hVar.f26427c != null : !this.f26427c.equals(hVar.f26427c)) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeParcelable(this.f26425a, i);
        parcel.writeString(this.f26426b);
        parcel.writeString(this.f26427c);
        e eVar = this.f26428d;
        if (eVar != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeByte((byte) i2);
        if (eVar != null) {
            parcel.writeString(this.f26428d.f26435a);
            parcel.writeParcelable(this.f26428d.a(), i);
        }
    }
}

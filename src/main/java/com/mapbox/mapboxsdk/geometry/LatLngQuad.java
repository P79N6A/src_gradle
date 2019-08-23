package com.mapbox.mapboxsdk.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

public class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator<LatLngQuad> CREATOR = new Parcelable.Creator<LatLngQuad>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LatLngQuad[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return LatLngQuad.a(parcel);
        }
    };
    @Keep
    public final LatLng bottomLeft;
    @Keep
    public final LatLng bottomRight;
    @Keep
    public final LatLng topLeft;
    @Keep
    public final LatLng topRight;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int hashCode = this.topLeft.hashCode();
        int hashCode2 = (hashCode ^ (hashCode >>> 31)) + this.topRight.hashCode();
        int hashCode3 = (hashCode2 ^ (hashCode2 >>> 31)) + this.bottomRight.hashCode();
        return (hashCode3 ^ (hashCode3 >>> 31)) + this.bottomLeft.hashCode();
    }

    public static LatLngQuad a(Parcel parcel) {
        return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
    }

    public void writeToParcel(Parcel parcel, int i) {
        this.topLeft.writeToParcel(parcel, i);
        this.topRight.writeToParcel(parcel, i);
        this.bottomRight.writeToParcel(parcel, i);
        this.bottomLeft.writeToParcel(parcel, i);
    }

    @Keep
    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }
}

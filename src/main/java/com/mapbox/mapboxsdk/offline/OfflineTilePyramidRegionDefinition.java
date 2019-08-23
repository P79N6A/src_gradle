package com.mapbox.mapboxsdk.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.geometry.LatLng;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;

public class OfflineTilePyramidRegionDefinition implements Parcelable, OfflineRegionDefinition {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OfflineTilePyramidRegionDefinition[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new OfflineTilePyramidRegionDefinition(parcel);
        }
    };
    @Keep
    private LatLngBounds bounds;
    @Keep
    public double maxZoom;
    @Keep
    public double minZoom;
    @Keep
    public float pixelRatio;
    @Keep
    public String styleURL;

    public int describeContents() {
        return 0;
    }

    public LatLngBounds getBounds() {
        return this.bounds;
    }

    public OfflineTilePyramidRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        this.bounds = new LatLngBounds.a().a(new LatLng(parcel.readDouble(), parcel.readDouble())).a(new LatLng(parcel.readDouble(), parcel.readDouble())).a();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleURL);
        parcel.writeDouble(this.bounds.latitudeNorth);
        parcel.writeDouble(this.bounds.longitudeEast);
        parcel.writeDouble(this.bounds.latitudeSouth);
        parcel.writeDouble(this.bounds.longitudeWest);
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
    }

    @Keep
    public OfflineTilePyramidRegionDefinition(String str, LatLngBounds latLngBounds, double d2, double d3, float f2) {
        this.styleURL = str;
        this.bounds = latLngBounds;
        this.minZoom = d2;
        this.maxZoom = d3;
        this.pixelRatio = f2;
    }
}

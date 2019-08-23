package com.mapbox.mapboxsdk.offline;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.Geometry;
import com.mapbox.mapboxsdk.geometry.LatLngBounds;
import com.mapbox.turf.a;

public class OfflineGeometryRegionDefinition implements Parcelable, OfflineRegionDefinition {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new OfflineGeometryRegionDefinition[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new OfflineGeometryRegionDefinition(parcel);
        }
    };
    @Keep
    public Geometry geometry;
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
        if (this.geometry == null) {
            return null;
        }
        double[] a2 = a.a(this.geometry);
        return LatLngBounds.a(a2[3], a2[2], a2[1], a2[0]);
    }

    public OfflineGeometryRegionDefinition(Parcel parcel) {
        this.styleURL = parcel.readString();
        this.geometry = Feature.fromJson(parcel.readString()).geometry();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.styleURL);
        parcel.writeString(Feature.fromGeometry(this.geometry).toJson());
        parcel.writeDouble(this.minZoom);
        parcel.writeDouble(this.maxZoom);
        parcel.writeFloat(this.pixelRatio);
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry2, double d2, double d3, float f2) {
        this.styleURL = str;
        this.geometry = geometry2;
        this.minZoom = d2;
        this.maxZoom = d3;
        this.pixelRatio = f2;
    }
}

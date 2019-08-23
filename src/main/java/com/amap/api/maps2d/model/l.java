package com.amap.api.maps2d.model;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.mapcore2d.cm;

public class l implements Parcelable.Creator<VisibleRegion> {
    l() {
    }

    /* renamed from: a */
    public VisibleRegion[] newArray(int i) {
        return new VisibleRegion[i];
    }

    /* renamed from: a */
    public VisibleRegion createFromParcel(Parcel parcel) {
        LatLngBounds latLngBounds;
        LatLng latLng;
        LatLng latLng2;
        LatLng latLng3;
        LatLng latLng4;
        int readInt = parcel.readInt();
        try {
            latLng4 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            try {
                latLng3 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
            } catch (BadParcelableException e2) {
                e = e2;
                latLng3 = null;
                latLng2 = latLng3;
                latLng = latLng2;
                cm.a(e, "VisibleRegionCreator", "createFromParcel");
                latLngBounds = null;
                VisibleRegion visibleRegion = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
                return visibleRegion;
            }
            try {
                latLng2 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                try {
                    latLng = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
                } catch (BadParcelableException e3) {
                    e = e3;
                    latLng = null;
                    cm.a(e, "VisibleRegionCreator", "createFromParcel");
                    latLngBounds = null;
                    VisibleRegion visibleRegion2 = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
                    return visibleRegion2;
                }
            } catch (BadParcelableException e4) {
                e = e4;
                latLng2 = null;
                latLng = latLng2;
                cm.a(e, "VisibleRegionCreator", "createFromParcel");
                latLngBounds = null;
                VisibleRegion visibleRegion22 = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
                return visibleRegion22;
            }
            try {
                latLngBounds = (LatLngBounds) parcel.readParcelable(LatLngBounds.class.getClassLoader());
            } catch (BadParcelableException e5) {
                e = e5;
                cm.a(e, "VisibleRegionCreator", "createFromParcel");
                latLngBounds = null;
                VisibleRegion visibleRegion222 = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
                return visibleRegion222;
            }
        } catch (BadParcelableException e6) {
            e = e6;
            latLng4 = null;
            latLng3 = null;
            latLng2 = latLng3;
            latLng = latLng2;
            cm.a(e, "VisibleRegionCreator", "createFromParcel");
            latLngBounds = null;
            VisibleRegion visibleRegion2222 = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
            return visibleRegion2222;
        }
        VisibleRegion visibleRegion22222 = new VisibleRegion(readInt, latLng4, latLng3, latLng2, latLng, latLngBounds);
        return visibleRegion22222;
    }

    static void a(VisibleRegion visibleRegion, Parcel parcel, int i) {
        parcel.writeInt(visibleRegion.a());
        parcel.writeParcelable(visibleRegion.nearLeft, i);
        parcel.writeParcelable(visibleRegion.nearRight, i);
        parcel.writeParcelable(visibleRegion.farLeft, i);
        parcel.writeParcelable(visibleRegion.farRight, i);
        parcel.writeParcelable(visibleRegion.latLngBounds, i);
    }
}

package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

public class PoiItemExtension implements Parcelable {
    public static final Parcelable.Creator<PoiItemExtension> CREATOR = new Parcelable.Creator<PoiItemExtension>() {
        /* renamed from: a */
        public final PoiItemExtension[] newArray(int i) {
            return new PoiItemExtension[i];
        }

        /* renamed from: a */
        public final PoiItemExtension createFromParcel(Parcel parcel) {
            return new PoiItemExtension(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7093a;

    /* renamed from: b  reason: collision with root package name */
    private String f7094b;

    public int describeContents() {
        return 0;
    }

    public String getOpentime() {
        return this.f7093a;
    }

    public String getmRating() {
        return this.f7094b;
    }

    protected PoiItemExtension(Parcel parcel) {
        this.f7093a = parcel.readString();
        this.f7094b = parcel.readString();
    }

    public PoiItemExtension(String str, String str2) {
        this.f7093a = str;
        this.f7094b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7093a);
        parcel.writeString(this.f7094b);
    }
}

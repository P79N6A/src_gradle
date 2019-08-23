package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

public class Railway implements Parcelable {
    public static final Parcelable.Creator<Railway> CREATOR = new Parcelable.Creator<Railway>() {
        /* renamed from: a */
        public final Railway[] newArray(int i) {
            return new Railway[i];
        }

        /* renamed from: a */
        public final Railway createFromParcel(Parcel parcel) {
            return new Railway(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7179a;

    /* renamed from: b  reason: collision with root package name */
    private String f7180b;

    public int describeContents() {
        return 0;
    }

    public Railway() {
    }

    public String getID() {
        return this.f7179a;
    }

    public String getName() {
        return this.f7180b;
    }

    public void setID(String str) {
        this.f7179a = str;
    }

    public void setName(String str) {
        this.f7180b = str;
    }

    protected Railway(Parcel parcel) {
        this.f7179a = parcel.readString();
        this.f7180b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7179a);
        parcel.writeString(this.f7180b);
    }
}

package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;

public class CloudImage implements Parcelable {
    public static final Parcelable.Creator<CloudImage> CREATOR = new Parcelable.Creator<CloudImage>() {
        /* renamed from: a */
        public final CloudImage[] newArray(int i) {
            return new CloudImage[i];
        }

        /* renamed from: a */
        public final CloudImage createFromParcel(Parcel parcel) {
            return new CloudImage(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f6946a;

    /* renamed from: b  reason: collision with root package name */
    private String f6947b;

    /* renamed from: c  reason: collision with root package name */
    private String f6948c;

    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f6946a;
    }

    public String getPreurl() {
        return this.f6947b;
    }

    public String getUrl() {
        return this.f6948c;
    }

    public void setId(String str) {
        this.f6946a = str;
    }

    public void setPreurl(String str) {
        this.f6947b = str;
    }

    public void setUrl(String str) {
        this.f6948c = str;
    }

    public CloudImage(Parcel parcel) {
        this.f6946a = parcel.readString();
        this.f6947b = parcel.readString();
        this.f6948c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6946a);
        parcel.writeString(this.f6947b);
        parcel.writeString(this.f6948c);
    }

    public CloudImage(String str, String str2, String str3) {
        this.f6946a = str;
        this.f6947b = str2;
        this.f6948c = str3;
    }
}

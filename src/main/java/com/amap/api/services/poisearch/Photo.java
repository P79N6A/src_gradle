package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

public final class Photo implements Parcelable {
    public static final Parcelable.Creator<Photo> CREATOR = new Parcelable.Creator<Photo>() {
        /* renamed from: a */
        public final Photo[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final Photo createFromParcel(Parcel parcel) {
            return new Photo(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7091a;

    /* renamed from: b  reason: collision with root package name */
    private String f7092b;

    public final int describeContents() {
        return 0;
    }

    public Photo() {
    }

    public final String getTitle() {
        return this.f7091a;
    }

    public final String getUrl() {
        return this.f7092b;
    }

    public final void setTitle(String str) {
        this.f7091a = str;
    }

    public final void setUrl(String str) {
        this.f7092b = str;
    }

    public Photo(Parcel parcel) {
        this.f7091a = parcel.readString();
        this.f7092b = parcel.readString();
    }

    public Photo(String str, String str2) {
        this.f7091a = str;
        this.f7092b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7091a);
        parcel.writeString(this.f7092b);
    }
}

package com.ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;

public class HttpHeader implements Parcelable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new Parcelable.Creator<HttpHeader>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new HttpHeader[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new HttpHeader(parcel);
        }
    };
    private final String name;
    private final String value;

    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    protected HttpHeader(Parcel parcel) {
        this.name = parcel.readString();
        this.value = parcel.readString();
    }

    public HttpHeader(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.value);
    }
}

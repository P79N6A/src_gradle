package com.ss.android.ugc.effectmanager.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class UrlModel implements Parcelable {
    public static final Parcelable.Creator<UrlModel> CREATOR = new Parcelable.Creator<UrlModel>() {
        public final UrlModel[] newArray(int i) {
            return new UrlModel[i];
        }

        public final UrlModel createFromParcel(Parcel parcel) {
            return new UrlModel(parcel);
        }
    };
    public String uri;
    public List<String> url_list;

    public int describeContents() {
        return 0;
    }

    public UrlModel() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.url_list != null) {
            for (String append : this.url_list) {
                sb.append(" [");
                sb.append(append);
                sb.append("] ");
            }
        }
        return "UrlModel{url_list=" + sb.toString() + ", uri='" + this.uri + '\'' + '}';
    }

    private UrlModel(Parcel parcel) {
        this.url_list = parcel.createStringArrayList();
        this.uri = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.url_list);
        parcel.writeString(this.uri);
    }
}

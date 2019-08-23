package com.bytedance.wttsharesdk.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;

@Keep
public class RepostEntity extends a {
    public static final Parcelable.Creator<RepostEntity> CREATOR = new Parcelable.Creator<RepostEntity>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new RepostEntity[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new RepostEntity(parcel);
        }
    };
    public String cover_url;
    public boolean is_video;
    public String schema;
    public String title;
    public String url;

    public RepostEntity() {
    }

    public int describeContents() {
        return super.describeContents();
    }

    protected RepostEntity(Parcel parcel) {
        super(parcel);
        boolean z;
        this.title = parcel.readString();
        this.cover_url = parcel.readString();
        this.schema = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_video = z;
        this.url = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.title);
        parcel.writeString(this.cover_url);
        parcel.writeString(this.schema);
        parcel.writeByte(this.is_video ? (byte) 1 : 0);
        parcel.writeString(this.url);
    }
}

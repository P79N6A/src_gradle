package com.tt.miniapphost.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.tt.miniapphost.process.annotation.AnyProcess;

@AnyProcess
public class MediaEntity implements Parcelable {
    public static final Parcelable.Creator<MediaEntity> CREATOR = new Parcelable.Creator<MediaEntity>() {
        public final MediaEntity[] newArray(int i) {
            return new MediaEntity[i];
        }

        public final MediaEntity createFromParcel(Parcel parcel) {
            return new MediaEntity(parcel);
        }
    };
    public int id;
    public int mediaType;
    public String name;
    public String parentDir;
    public String path;
    public long size;
    public long time;

    public int describeContents() {
        return 0;
    }

    protected MediaEntity(Parcel parcel) {
        this.path = parcel.readString();
        this.name = parcel.readString();
        this.time = parcel.readLong();
        this.mediaType = parcel.readInt();
        this.size = parcel.readLong();
        this.id = parcel.readInt();
        this.parentDir = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.path);
        parcel.writeString(this.name);
        parcel.writeLong(this.time);
        parcel.writeInt(this.mediaType);
        parcel.writeLong(this.size);
        parcel.writeInt(this.id);
        parcel.writeString(this.parentDir);
    }

    @AnyProcess
    public MediaEntity(String str, String str2, long j, int i, long j2, int i2, String str3) {
        this.path = str;
        this.name = str2;
        this.time = j;
        this.mediaType = i;
        this.size = j2;
        this.id = i2;
        this.parentDir = str3;
    }
}

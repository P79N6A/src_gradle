package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new Parcelable.Creator<PlugInBean>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new PlugInBean[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new PlugInBean(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f79271a;

    /* renamed from: b  reason: collision with root package name */
    public final String f79272b;

    /* renamed from: c  reason: collision with root package name */
    public final String f79273c;

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f79271a + " plV:" + this.f79272b + " plUUID:" + this.f79273c;
    }

    public PlugInBean(Parcel parcel) {
        this.f79271a = parcel.readString();
        this.f79272b = parcel.readString();
        this.f79273c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f79271a);
        parcel.writeString(this.f79272b);
        parcel.writeString(this.f79273c);
    }

    public PlugInBean(String str, String str2, String str3) {
        this.f79271a = str;
        this.f79272b = str2;
        this.f79273c = str3;
    }
}

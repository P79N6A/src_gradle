package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    int f22146a;

    /* renamed from: b  reason: collision with root package name */
    int f22147b;

    /* renamed from: c  reason: collision with root package name */
    int f22148c;

    /* renamed from: d  reason: collision with root package name */
    int f22149d;

    /* renamed from: e  reason: collision with root package name */
    int f22150e;

    /* renamed from: f  reason: collision with root package name */
    int f22151f;

    public int describeContents() {
        return 0;
    }

    a() {
    }

    protected a(Parcel parcel) {
        this.f22146a = parcel.readInt();
        this.f22147b = parcel.readInt();
        this.f22148c = parcel.readInt();
        this.f22149d = parcel.readInt();
        this.f22150e = parcel.readInt();
        this.f22151f = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22146a);
        parcel.writeInt(this.f22147b);
        parcel.writeInt(this.f22148c);
        parcel.writeInt(this.f22149d);
        parcel.writeInt(this.f22150e);
        parcel.writeInt(this.f22151f);
    }
}

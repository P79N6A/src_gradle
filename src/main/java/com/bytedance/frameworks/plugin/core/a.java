package com.bytedance.frameworks.plugin.core;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f2191a;

    public final int describeContents() {
        return 0;
    }

    a(IBinder iBinder) {
        this.f2191a = iBinder;
    }

    a(Parcel parcel) {
        this.f2191a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f2191a);
    }
}

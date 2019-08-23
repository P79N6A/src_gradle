package com.bytedance.wttsharesdk.entity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[0];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<Uri> f22936a;

    public c() {
    }

    public final int describeContents() {
        return super.describeContents();
    }

    protected c(Parcel parcel) {
        super(parcel);
        this.f22936a = parcel.createTypedArrayList(Uri.CREATOR);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f22936a);
    }
}

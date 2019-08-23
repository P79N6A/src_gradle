package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;

public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new e[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new e(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public String f18944a;

    /* renamed from: b  reason: collision with root package name */
    public Object f18945b;

    public final int describeContents() {
        return 0;
    }

    protected e(Parcel parcel) {
        this.f18944a = parcel.readString();
        this.f18945b = parcel.readValue(getClass().getClassLoader());
    }

    public e(String str, Object obj) {
        this.f18944a = str;
        this.f18945b = obj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18944a);
        parcel.writeValue(this.f18945b);
    }
}

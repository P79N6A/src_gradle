package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class aq extends r implements Parcelable {
    public static final Parcelable.Creator<aq> CREATOR = new Parcelable.Creator<aq>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new aq[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new aq(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26016a;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public au f26017e;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.NAV_DEPART;
    }

    private aq(Parcel parcel) {
        this.f26016a = parcel.readString();
        this.f26017e = (au) parcel.readParcelable(au.class.getClassLoader());
    }

    /* synthetic */ aq(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26016a);
        parcel.writeParcelable(this.f26017e, i);
    }
}

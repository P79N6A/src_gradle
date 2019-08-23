package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class ar extends r implements Parcelable {
    public static final Parcelable.Creator<ar> CREATOR = new Parcelable.Creator<ar>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ar[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ar(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26018a;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public au f26019e;
    @JsonAdapter(NewDataSerializer.class)

    /* renamed from: f  reason: collision with root package name */
    public av f26020f;
    public ay g;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.NAV_FASTER_ROUTE;
    }

    private ar(Parcel parcel) {
        this.f26018a = parcel.readString();
        this.f26020f = (av) parcel.readParcelable(av.class.getClassLoader());
        this.g = (ay) parcel.readParcelable(ay.class.getClassLoader());
        this.f26019e = (au) parcel.readParcelable(au.class.getClassLoader());
    }

    /* synthetic */ ar(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26018a);
        parcel.writeParcelable(this.f26020f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.f26019e, i);
    }
}

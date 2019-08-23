package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class ax extends r implements Parcelable {
    public static final Parcelable.Creator<ax> CREATOR = new Parcelable.Creator<ax>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ax[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ax(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26037a;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public au f26038e;
    @JsonAdapter(RerouteDataSerializer.class)

    /* renamed from: f  reason: collision with root package name */
    public aw f26039f;
    @JsonAdapter(LocationDataSerializer.class)
    public at g;
    @JsonAdapter(FeedbackDataSerializer.class)
    public v h;
    public ay i;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.NAV_REROUTE;
    }

    private ax(Parcel parcel) {
        this.f26037a = parcel.readString();
        this.f26038e = (au) parcel.readParcelable(au.class.getClassLoader());
        this.g = (at) parcel.readParcelable(at.class.getClassLoader());
        this.h = (v) parcel.readParcelable(v.class.getClassLoader());
        this.i = (ay) parcel.readParcelable(ay.class.getClassLoader());
    }

    /* synthetic */ ax(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26037a);
        parcel.writeParcelable(this.f26038e, i2);
        parcel.writeParcelable(this.g, i2);
        parcel.writeParcelable(this.h, i2);
        parcel.writeParcelable(this.i, i2);
    }
}

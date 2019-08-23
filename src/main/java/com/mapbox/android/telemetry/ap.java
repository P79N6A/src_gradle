package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class ap extends r implements Parcelable {
    public static final Parcelable.Creator<ap> CREATOR = new Parcelable.Creator<ap>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ap[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ap(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26013a;
    @JsonAdapter(CancelDataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public ao f26014e;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: f  reason: collision with root package name */
    public au f26015f;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.NAV_CANCEL;
    }

    private ap(Parcel parcel) {
        this.f26013a = parcel.readString();
        this.f26014e = (ao) parcel.readParcelable(ao.class.getClassLoader());
        this.f26015f = (au) parcel.readParcelable(au.class.getClassLoader());
    }

    /* synthetic */ ap(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26013a);
        parcel.writeParcelable(this.f26014e, i);
        parcel.writeParcelable(this.f26015f, i);
    }
}

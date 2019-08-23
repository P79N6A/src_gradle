package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class an extends r implements Parcelable {
    public static final Parcelable.Creator<an> CREATOR = new Parcelable.Creator<an>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new an[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new an(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26008a;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public au f26009e;

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.NAV_ARRIVE;
    }

    private an(Parcel parcel) {
        this.f26008a = parcel.readString();
        this.f26009e = (au) parcel.readParcelable(au.class.getClassLoader());
    }

    /* synthetic */ an(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26008a);
        parcel.writeParcelable(this.f26009e, i);
    }
}

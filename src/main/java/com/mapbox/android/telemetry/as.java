package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.JsonAdapter;
import com.mapbox.android.telemetry.r;

public class as extends r implements Parcelable {
    public static final Parcelable.Creator<as> CREATOR = new Parcelable.Creator<as>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new as[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new as(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f26021a;
    @JsonAdapter(NavigationMetadataSerializer.class)

    /* renamed from: e  reason: collision with root package name */
    public au f26022e;
    @JsonAdapter(FeedbackEventDataSerializer.class)

    /* renamed from: f  reason: collision with root package name */
    public w f26023f;
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
        return r.a.NAV_FEEDBACK;
    }

    private as(Parcel parcel) {
        this.f26021a = parcel.readString();
        this.f26022e = (au) parcel.readValue(au.class.getClassLoader());
        this.f26023f = (w) parcel.readValue(w.class.getClassLoader());
        this.g = (at) parcel.readValue(at.class.getClassLoader());
        this.h = (v) parcel.readValue(v.class.getClassLoader());
        this.i = (ay) parcel.readValue(ay.class.getClassLoader());
    }

    /* synthetic */ as(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26021a);
        parcel.writeValue(this.f26022e);
        parcel.writeValue(this.f26023f);
        parcel.writeValue(this.g);
        parcel.writeValue(this.h);
        parcel.writeValue(this.i);
    }
}

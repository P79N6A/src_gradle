package com.mapbox.android.telemetry;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;
import java.util.ArrayList;
import java.util.List;

public final class c extends r implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new c(parcel);
        }
    };
    @SerializedName("files")

    /* renamed from: a  reason: collision with root package name */
    public List<x> f26103a;
    @SerializedName("event")

    /* renamed from: e  reason: collision with root package name */
    private final String f26104e;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.VIS_ATTACHMENT;
    }

    c() {
        this.f26104e = "vis.attachment";
        this.f26103a = new ArrayList();
    }

    protected c(Parcel parcel) {
        this.f26104e = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26104e);
    }
}

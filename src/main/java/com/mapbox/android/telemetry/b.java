package com.mapbox.android.telemetry;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.mapbox.android.telemetry.r;

public final class b extends r implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private static final String f26050a = ("Android - " + Build.VERSION.RELEASE);
    @SerializedName("event")

    /* renamed from: e  reason: collision with root package name */
    private final String f26051e;
    @SerializedName("created")

    /* renamed from: f  reason: collision with root package name */
    private final String f26052f;
    @SerializedName("userId")
    private final String g;
    @SerializedName("enabled.telemetry")
    private final boolean h;
    @SerializedName("device")
    private final String i;
    @SerializedName("sdkIdentifier")
    private final String j;
    @SerializedName("sdkVersion")
    private final String k;
    @SerializedName("model")
    private String l;
    @SerializedName("operatingSystem")
    private String m;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final r.a a() {
        return r.a.TURNSTILE;
    }

    private b(Parcel parcel) {
        boolean z;
        this.f26051e = parcel.readString();
        this.f26052f = parcel.readString();
        this.g = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
    }

    /* synthetic */ b(Parcel parcel, byte b2) {
        this(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f26051e);
        parcel.writeString(this.f26052f);
        parcel.writeString(this.g);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }

    public b(String str, String str2) {
        if (MapboxTelemetry.g != null) {
            this.f26051e = "appUserTurnstile";
            this.f26052f = bp.b();
            this.g = bp.c();
            this.h = bn.f26093a.get(new bn(true).b()).booleanValue();
            this.i = Build.DEVICE;
            this.j = str;
            this.k = str2;
            this.l = Build.MODEL;
            this.m = f26050a;
            return;
        }
        throw new IllegalStateException("Create a MapboxTelemetry instance before calling this method.");
    }
}

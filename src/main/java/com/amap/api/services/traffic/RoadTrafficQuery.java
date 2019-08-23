package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.a.j;

public class RoadTrafficQuery extends a implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RoadTrafficQuery> CREATOR = new Parcelable.Creator<RoadTrafficQuery>() {
        /* renamed from: a */
        public final RoadTrafficQuery[] newArray(int i) {
            return new RoadTrafficQuery[i];
        }

        /* renamed from: a */
        public final RoadTrafficQuery createFromParcel(Parcel parcel) {
            return new RoadTrafficQuery(parcel);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    private String f7309b;

    /* renamed from: c  reason: collision with root package name */
    private String f7310c;

    public int describeContents() {
        return 0;
    }

    public String getAdCode() {
        return this.f7310c;
    }

    public String getName() {
        return this.f7309b;
    }

    public /* bridge */ /* synthetic */ int getLevel() {
        return super.getLevel();
    }

    public RoadTrafficQuery clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e2) {
            j.a(e2, "RoadTrafficQuery", "RoadTrafficQueryClone");
        }
        return new RoadTrafficQuery(this.f7309b, this.f7310c, this.f7327a);
    }

    public void setAdCode(String str) {
        this.f7310c = str;
    }

    public /* bridge */ /* synthetic */ void setLevel(int i) {
        super.setLevel(i);
    }

    public void setName(String str) {
        this.f7309b = str;
    }

    protected RoadTrafficQuery(Parcel parcel) {
        this.f7309b = parcel.readString();
        this.f7310c = parcel.readString();
        this.f7327a = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7309b);
        parcel.writeString(this.f7310c);
        parcel.writeInt(this.f7327a);
    }

    public RoadTrafficQuery(String str, String str2, int i) {
        this.f7309b = str;
        this.f7310c = str2;
        this.f7327a = i;
    }
}

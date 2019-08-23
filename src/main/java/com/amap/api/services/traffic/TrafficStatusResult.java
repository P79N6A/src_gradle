package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class TrafficStatusResult implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusResult> CREATOR = new Parcelable.Creator<TrafficStatusResult>() {
        /* renamed from: a */
        public final TrafficStatusResult[] newArray(int i) {
            return new TrafficStatusResult[i];
        }

        /* renamed from: a */
        public final TrafficStatusResult createFromParcel(Parcel parcel) {
            return new TrafficStatusResult(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7324a;

    /* renamed from: b  reason: collision with root package name */
    private TrafficStatusEvaluation f7325b;

    /* renamed from: c  reason: collision with root package name */
    private List<TrafficStatusInfo> f7326c;

    public int describeContents() {
        return 0;
    }

    public TrafficStatusResult() {
    }

    public String getDescription() {
        return this.f7324a;
    }

    public TrafficStatusEvaluation getEvaluation() {
        return this.f7325b;
    }

    public List<TrafficStatusInfo> getRoads() {
        return this.f7326c;
    }

    public void setDescription(String str) {
        this.f7324a = str;
    }

    public void setEvaluation(TrafficStatusEvaluation trafficStatusEvaluation) {
        this.f7325b = trafficStatusEvaluation;
    }

    public void setRoads(List<TrafficStatusInfo> list) {
        this.f7326c = list;
    }

    protected TrafficStatusResult(Parcel parcel) {
        this.f7324a = parcel.readString();
        this.f7325b = (TrafficStatusEvaluation) parcel.readParcelable(TrafficStatusEvaluation.class.getClassLoader());
        this.f7326c = parcel.createTypedArrayList(TrafficStatusInfo.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7324a);
        parcel.writeParcelable(this.f7325b, i);
        parcel.writeTypedList(this.f7326c);
    }
}

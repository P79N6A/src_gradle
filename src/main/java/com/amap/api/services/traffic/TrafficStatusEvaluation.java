package com.amap.api.services.traffic;

import android.os.Parcel;
import android.os.Parcelable;

public class TrafficStatusEvaluation implements Parcelable {
    public static final Parcelable.Creator<TrafficStatusEvaluation> CREATOR = new Parcelable.Creator<TrafficStatusEvaluation>() {
        /* renamed from: a */
        public final TrafficStatusEvaluation[] newArray(int i) {
            return new TrafficStatusEvaluation[i];
        }

        /* renamed from: a */
        public final TrafficStatusEvaluation createFromParcel(Parcel parcel) {
            return new TrafficStatusEvaluation(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f7312a;

    /* renamed from: b  reason: collision with root package name */
    private String f7313b;

    /* renamed from: c  reason: collision with root package name */
    private String f7314c;

    /* renamed from: d  reason: collision with root package name */
    private String f7315d;

    /* renamed from: e  reason: collision with root package name */
    private String f7316e;

    /* renamed from: f  reason: collision with root package name */
    private String f7317f;

    public int describeContents() {
        return 0;
    }

    public TrafficStatusEvaluation() {
    }

    public String getBlocked() {
        return this.f7314c;
    }

    public String getCongested() {
        return this.f7313b;
    }

    public String getDescription() {
        return this.f7317f;
    }

    public String getExpedite() {
        return this.f7312a;
    }

    public String getStatus() {
        return this.f7316e;
    }

    public String getUnknown() {
        return this.f7315d;
    }

    public void setBlocked(String str) {
        this.f7314c = str;
    }

    public void setCongested(String str) {
        this.f7313b = str;
    }

    public void setDescription(String str) {
        this.f7317f = str;
    }

    public void setExpedite(String str) {
        this.f7312a = str;
    }

    public void setStatus(String str) {
        this.f7316e = str;
    }

    public void setUnknown(String str) {
        this.f7315d = str;
    }

    protected TrafficStatusEvaluation(Parcel parcel) {
        this.f7312a = parcel.readString();
        this.f7313b = parcel.readString();
        this.f7314c = parcel.readString();
        this.f7315d = parcel.readString();
        this.f7316e = parcel.readString();
        this.f7317f = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7312a);
        parcel.writeString(this.f7313b);
        parcel.writeString(this.f7314c);
        parcel.writeString(this.f7315d);
        parcel.writeString(this.f7316e);
        parcel.writeString(this.f7317f);
    }
}

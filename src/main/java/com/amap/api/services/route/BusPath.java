package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public class BusPath extends Path implements Parcelable {
    public static final Parcelable.Creator<BusPath> CREATOR = new Parcelable.Creator<BusPath>() {
        /* renamed from: a */
        public final BusPath[] newArray(int i) {
            return null;
        }

        /* renamed from: a */
        public final BusPath createFromParcel(Parcel parcel) {
            return new BusPath(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private float f7132a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7133b;

    /* renamed from: c  reason: collision with root package name */
    private float f7134c;

    /* renamed from: d  reason: collision with root package name */
    private float f7135d;

    /* renamed from: e  reason: collision with root package name */
    private List<BusStep> f7136e = new ArrayList();

    public int describeContents() {
        return 0;
    }

    public float getBusDistance() {
        return this.f7135d;
    }

    public float getCost() {
        return this.f7132a;
    }

    public List<BusStep> getSteps() {
        return this.f7136e;
    }

    public float getWalkDistance() {
        return this.f7134c;
    }

    public boolean isNightBus() {
        return this.f7133b;
    }

    public BusPath() {
    }

    public void setBusDistance(float f2) {
        this.f7135d = f2;
    }

    public void setCost(float f2) {
        this.f7132a = f2;
    }

    public void setNightBus(boolean z) {
        this.f7133b = z;
    }

    public void setSteps(List<BusStep> list) {
        this.f7136e = list;
    }

    public void setWalkDistance(float f2) {
        this.f7134c = f2;
    }

    public BusPath(Parcel parcel) {
        super(parcel);
        this.f7132a = parcel.readFloat();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f7133b = zArr[0];
        this.f7134c = parcel.readFloat();
        this.f7135d = parcel.readFloat();
        this.f7136e = parcel.createTypedArrayList(BusStep.CREATOR);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f7132a);
        parcel.writeBooleanArray(new boolean[]{this.f7133b});
        parcel.writeFloat(this.f7134c);
        parcel.writeFloat(this.f7135d);
        parcel.writeTypedList(this.f7136e);
    }
}

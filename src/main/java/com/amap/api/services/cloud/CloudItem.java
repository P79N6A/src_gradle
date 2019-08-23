package com.amap.api.services.cloud;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloudItem implements Parcelable {
    public static final Parcelable.Creator<CloudItem> CREATOR = new Parcelable.Creator<CloudItem>() {
        /* renamed from: a */
        public final CloudItem[] newArray(int i) {
            return new CloudItem[i];
        }

        /* renamed from: a */
        public final CloudItem createFromParcel(Parcel parcel) {
            return new CloudItem(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f6949a;

    /* renamed from: b  reason: collision with root package name */
    private int f6950b = -1;

    /* renamed from: c  reason: collision with root package name */
    private String f6951c;

    /* renamed from: d  reason: collision with root package name */
    private String f6952d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, String> f6953e;

    /* renamed from: f  reason: collision with root package name */
    private List<CloudImage> f6954f;
    protected final LatLonPoint mPoint;
    protected final String mSnippet;
    protected final String mTitle;

    public int describeContents() {
        return 0;
    }

    public List<CloudImage> getCloudImage() {
        return this.f6954f;
    }

    public String getCreatetime() {
        return this.f6951c;
    }

    public HashMap<String, String> getCustomfield() {
        return this.f6953e;
    }

    public int getDistance() {
        return this.f6950b;
    }

    public String getID() {
        return this.f6949a;
    }

    public LatLonPoint getLatLonPoint() {
        return this.mPoint;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUpdatetime() {
        return this.f6952d;
    }

    public String toString() {
        return this.mTitle;
    }

    public int hashCode() {
        int i;
        if (this.f6949a == null) {
            i = 0;
        } else {
            i = this.f6949a.hashCode();
        }
        return i + 31;
    }

    public void setCreatetime(String str) {
        this.f6951c = str;
    }

    public void setCustomfield(HashMap<String, String> hashMap) {
        this.f6953e = hashMap;
    }

    public void setDistance(int i) {
        this.f6950b = i;
    }

    public void setUpdatetime(String str) {
        this.f6952d = str;
    }

    public void setmCloudImage(List<CloudImage> list) {
        this.f6954f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CloudItem)) {
            return false;
        }
        CloudItem cloudItem = (CloudItem) obj;
        if (this.f6949a == null) {
            if (cloudItem.f6949a != null) {
                return false;
            }
        } else if (!this.f6949a.equals(cloudItem.f6949a)) {
            return false;
        }
        return true;
    }

    protected CloudItem(Parcel parcel) {
        this.f6949a = parcel.readString();
        this.f6950b = parcel.readInt();
        this.mPoint = (LatLonPoint) parcel.readValue(LatLonPoint.class.getClassLoader());
        this.mTitle = parcel.readString();
        this.mSnippet = parcel.readString();
        this.f6951c = parcel.readString();
        this.f6952d = parcel.readString();
        this.f6953e = new HashMap<>();
        parcel.readMap(this.f6953e, HashMap.class.getClassLoader());
        this.f6954f = new ArrayList();
        parcel.readList(this.f6954f, getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6949a);
        parcel.writeInt(this.f6950b);
        parcel.writeValue(this.mPoint);
        parcel.writeString(this.mTitle);
        parcel.writeString(this.mSnippet);
        parcel.writeString(this.f6951c);
        parcel.writeString(this.f6952d);
        parcel.writeMap(this.f6953e);
        parcel.writeList(this.f6954f);
    }

    public CloudItem(String str, LatLonPoint latLonPoint, String str2, String str3) {
        this.f6949a = str;
        this.mPoint = latLonPoint;
        this.mTitle = str2;
        this.mSnippet = str3;
    }
}

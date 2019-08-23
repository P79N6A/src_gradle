package com.bytedance.scene.group;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.bytedance.scene.e;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    int f22105a = -1;

    /* renamed from: b  reason: collision with root package name */
    e f22106b;

    /* renamed from: c  reason: collision with root package name */
    String f22107c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22108d;

    /* renamed from: e  reason: collision with root package name */
    boolean f22109e;

    /* renamed from: f  reason: collision with root package name */
    String f22110f;
    @Nullable
    Bundle g;

    public final int describeContents() {
        return 0;
    }

    public a() {
    }

    protected a(Parcel parcel) {
        boolean z;
        this.f22105a = parcel.readInt();
        this.f22107c = parcel.readString();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22108d = z;
        this.f22109e = parcel.readByte() != 0 ? true : z2;
        this.f22110f = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f22105a);
        parcel.writeString(this.f22107c);
        parcel.writeByte(this.f22108d ? (byte) 1 : 0);
        parcel.writeByte(this.f22109e ? (byte) 1 : 0);
        parcel.writeString(this.f22106b.getClass().getName());
    }
}

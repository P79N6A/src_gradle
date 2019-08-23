package com.bytedance.scene.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.scene.a.d;
import com.bytedance.scene.animation.c;
import com.bytedance.scene.e;

public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new Parcelable.Creator<i>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new i[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new i(parcel);
        }
    };
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    e f22190a;

    /* renamed from: b  reason: collision with root package name */
    boolean f22191b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    a f22192c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    c f22193d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    Object f22194e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    d f22195f;
    String g;

    public final int describeContents() {
        return 0;
    }

    public i() {
    }

    protected i(Parcel parcel) {
        boolean z;
        this.f22192c = (a) parcel.readParcelable(a.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22191b = z;
        this.g = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f22192c, i);
        parcel.writeByte(this.f22191b ? (byte) 1 : 0);
        parcel.writeString(this.f22190a.getClass().getName());
    }
}

package com.ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f71645a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f71645a, false, 81979, new Class[]{Parcel.class}, c.class)) {
                return new c(parcel2);
            }
            return (c) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f71645a, false, 81979, new Class[]{Parcel.class}, c.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71640a;
    @SerializedName("commerce_sticker_web_url")

    /* renamed from: b  reason: collision with root package name */
    public String f71641b;
    @SerializedName("commerce_sticker_open_url")

    /* renamed from: c  reason: collision with root package name */
    public String f71642c;
    @SerializedName("commerce_sticker_buy_text")

    /* renamed from: d  reason: collision with root package name */
    public String f71643d;
    @SerializedName("commerce_sticker_type")

    /* renamed from: e  reason: collision with root package name */
    public int f71644e;

    public int describeContents() {
        return 0;
    }

    public c(Parcel parcel) {
        this.f71641b = parcel.readString();
        this.f71642c = parcel.readString();
        this.f71643d = parcel.readString();
        this.f71644e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f71640a, false, 81978, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f71640a, false, 81978, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f71641b);
        parcel.writeString(this.f71642c);
        parcel.writeString(this.f71643d);
        parcel.writeInt(this.f71644e);
    }
}

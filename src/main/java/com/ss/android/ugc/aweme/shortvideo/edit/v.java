package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class v implements Parcelable, Serializable {
    public static final Parcelable.Creator<v> CREATOR = new Parcelable.Creator<v>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f67493a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new v[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f67493a, false, 76309, new Class[]{Parcel.class}, v.class)) {
                return new v(parcel2);
            }
            return (v) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f67493a, false, 76309, new Class[]{Parcel.class}, v.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    ShopOrderShareStruct shopOrderShareStruct;
    String title;

    public int describeContents() {
        return 0;
    }

    public v() {
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.shopOrderShareStruct;
    }

    public String getTitle() {
        return this.title;
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct2) {
        this.shopOrderShareStruct = shopOrderShareStruct2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public v(Parcel parcel) {
        this.shopOrderShareStruct = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.title = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76308, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76308, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeParcelable(this.shopOrderShareStruct, i);
        parcel.writeString(this.title);
    }
}

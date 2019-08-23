package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

@Keep
public class ShopOrderShareStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStruct> CREATOR = new Parcelable.Creator<ShopOrderShareStruct>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66881a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ShopOrderShareStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f66881a, false, 76307, new Class[]{Parcel.class}, ShopOrderShareStruct.class)) {
                return new ShopOrderShareStruct(parcel2);
            }
            return (ShopOrderShareStruct) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f66881a, false, 76307, new Class[]{Parcel.class}, ShopOrderShareStruct.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("origin_item_id")
    private String originItemId;
    @SerializedName("origin_user_id")
    private String originUserId;
    @SerializedName("promotion_id")
    private String promotionId;

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStruct() {
    }

    public String getOriginItemId() {
        return this.originItemId;
    }

    public String getOriginUserId() {
        return this.originUserId;
    }

    public String getPromotionId() {
        return this.promotionId;
    }

    public void setOriginItemId(String str) {
        this.originItemId = str;
    }

    public void setOriginUserId(String str) {
        this.originUserId = str;
    }

    public void setPromotionId(String str) {
        this.promotionId = str;
    }

    public ShopOrderShareStruct(Parcel parcel) {
        this.originUserId = parcel.readString();
        this.originItemId = parcel.readString();
        this.promotionId = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76306, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 76306, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.originUserId);
        parcel.writeString(this.originItemId);
        parcel.writeString(this.promotionId);
    }
}

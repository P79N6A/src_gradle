package com.ss.android.ugc.aweme.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

@Keep
public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<NewUserCount> CREATOR = new Parcelable.Creator<NewUserCount>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final NewUserCount[] newArray(int i) {
            return new NewUserCount[i];
        }

        public final NewUserCount createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 67484, new Class[]{Parcel.class}, NewUserCount.class)) {
                return new NewUserCount(parcel2);
            }
            return (NewUserCount) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 67484, new Class[]{Parcel.class}, NewUserCount.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    public int count;

    public int describeContents() {
        return 0;
    }

    public NewUserCount() {
    }

    public NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Parcel parcel2 = parcel;
        if (PatchProxy.isSupport(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67483, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel2, Integer.valueOf(i)}, this, changeQuickRedirect, false, 67483, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel2.writeInt(this.count);
    }
}

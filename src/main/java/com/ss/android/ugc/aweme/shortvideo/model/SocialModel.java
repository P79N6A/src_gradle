package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import java.util.List;

public class SocialModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SocialModel> CREATOR = new Parcelable.Creator<SocialModel>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final SocialModel[] newArray(int i) {
            return new SocialModel[i];
        }

        public final SocialModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77672, new Class[]{Parcel.class}, SocialModel.class)) {
                return new SocialModel(parcel2);
            }
            return (SocialModel) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77672, new Class[]{Parcel.class}, SocialModel.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("friends")
    public List<String> friends;
    @SerializedName("rec_users")
    public List<String> recUsers;
    @SerializedName("recommend")
    public int recommend;

    public int describeContents() {
        return 0;
    }

    public SocialModel() {
    }

    public String getFriends() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77669, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77669, new Class[0], String.class);
        } else if (this.friends == null || this.friends.size() == 0) {
            return null;
        } else {
            return TextUtils.join(",", this.friends);
        }
    }

    public String getRecUsers() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77670, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77670, new Class[0], String.class);
        } else if (this.recUsers == null || this.recUsers.size() == 0) {
            return null;
        } else {
            return TextUtils.join(",", this.recUsers);
        }
    }

    public SocialModel(Parcel parcel) {
        this.recommend = parcel.readInt();
        this.friends = parcel.createStringArrayList();
        this.recUsers = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77671, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77671, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.recommend);
        parcel.writeStringList(this.friends);
        parcel.writeStringList(this.recUsers);
    }
}

package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class AVTextExtraStruct implements Parcelable, Serializable {
    public static final Parcelable.Creator<AVTextExtraStruct> CREATOR = new Parcelable.Creator<AVTextExtraStruct>() {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final AVTextExtraStruct[] newArray(int i) {
            return new AVTextExtraStruct[i];
        }

        public final AVTextExtraStruct createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, changeQuickRedirect, false, 77614, new Class[]{Parcel.class}, AVTextExtraStruct.class)) {
                return new AVTextExtraStruct(parcel2);
            }
            return (AVTextExtraStruct) PatchProxy.accessDispatch(new Object[]{parcel2}, this, changeQuickRedirect, false, 77614, new Class[]{Parcel.class}, AVTextExtraStruct.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("at_user_type")
    String atUserType;
    @SerializedName("aweme_id")
    String awemeId;
    String cid;
    @SerializedName("end")
    int end;
    @SerializedName("hashtag_name")
    String hashTagName;
    boolean isStarAtlasTag;
    @SerializedName("start")
    int start;
    @SerializedName("type")
    int type;
    @SerializedName("user_id")
    String userId;

    public int describeContents() {
        return 0;
    }

    public AVTextExtraStruct() {
    }

    public String getAtUserType() {
        return this.atUserType;
    }

    public String getAwemeId() {
        return this.awemeId;
    }

    public String getCid() {
        return this.cid;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public int getStart() {
        return this.start;
    }

    public int getType() {
        return this.type;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isStarAtlasTag() {
        return this.isStarAtlasTag;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77613, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77613, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.userId != null) {
            i = this.userId.hashCode();
        } else {
            i = 0;
        }
        int i4 = (((i + 0) * 31) + this.type) * 31;
        if (this.atUserType != null) {
            i2 = this.atUserType.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.hashTagName != null) {
            i3 = this.hashTagName.hashCode();
        }
        return i5 + i3;
    }

    public void setAtUserType(String str) {
        this.atUserType = str;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setStarAtlasTag(boolean z) {
        this.isStarAtlasTag = z;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public AVTextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 77612, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 77612, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof AVTextExtraStruct)) {
                return false;
            }
            AVTextExtraStruct aVTextExtraStruct = (AVTextExtraStruct) obj;
            if (this.type != aVTextExtraStruct.type) {
                return false;
            }
            if (this.userId == null ? aVTextExtraStruct.userId != null : !this.userId.equals(aVTextExtraStruct.userId)) {
                return false;
            }
            if (!TextUtils.equals(this.hashTagName, aVTextExtraStruct.hashTagName)) {
                return false;
            }
            if (this.atUserType != null) {
                return this.atUserType.equals(aVTextExtraStruct.atUserType);
            }
            if (aVTextExtraStruct.atUserType == null) {
                return true;
            }
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77611, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 77611, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
    }
}

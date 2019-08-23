package com.ss.android.ugc.aweme.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

@Keep
public class TextExtraStruct implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56114a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f56114a, false, 59744, new Class[]{Parcel.class}, TextExtraStruct.class)) {
                return new TextExtraStruct(parcel2);
            }
            return (TextExtraStruct) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f56114a, false, 59744, new Class[]{Parcel.class}, TextExtraStruct.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("at_user_type")
    public String atUserType;
    @SerializedName("aweme_id")
    public String awemeId;
    public boolean boldText;
    @SerializedName("hashtag_id")
    public String cid;
    @SerializedName("color")
    public int color;
    public Object customSpan;
    @SerializedName("end")
    public int end;
    @SerializedName("hashtag_name")
    public String hashTagName;
    public boolean isClickable = true;
    @SerializedName("is_commerce")
    public boolean isCommerce;
    @SerializedName("sec_uid")
    public String mSecUid;
    @SerializedName("star_atlas_tag")
    public boolean starAtlasTag;
    @SerializedName("start")
    public int start;
    @SerializedName("type")
    public int type;
    @SerializedName("user_id")
    public String userId;

    public int describeContents() {
        return 0;
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

    public int getColor() {
        return this.color;
    }

    public Object getCustomSpan() {
        return this.customSpan;
    }

    public int getEnd() {
        return this.end;
    }

    public String getHashTagName() {
        return this.hashTagName;
    }

    public String getSecUid() {
        return this.mSecUid;
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

    public boolean isBoldText() {
        return this.boldText;
    }

    public boolean isClickable() {
        return this.isClickable;
    }

    public boolean isCommerce() {
        return this.isCommerce;
    }

    public boolean isStarAtlasTag() {
        return this.starAtlasTag;
    }

    public TextExtraStruct() {
    }

    public TextExtraStruct clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 59743, new Class[0], TextExtraStruct.class)) {
            return (TextExtraStruct) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 59743, new Class[0], TextExtraStruct.class);
        }
        try {
            return (TextExtraStruct) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 59742, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 59742, new Class[0], Integer.TYPE)).intValue();
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

    public void setBoldText(boolean z) {
        this.boldText = z;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setClickable(boolean z) {
        this.isClickable = z;
    }

    public void setColor(int i) {
        this.color = i;
    }

    public void setCommerce(boolean z) {
        this.isCommerce = z;
    }

    public void setCustomSpan(Object obj) {
        this.customSpan = obj;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setHashTagName(String str) {
        this.hashTagName = str;
    }

    public void setSecUid(String str) {
        this.mSecUid = str;
    }

    public void setStarAtlasTag(boolean z) {
        this.starAtlasTag = z;
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

    public TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readString();
        this.mSecUid = parcel.readString();
        this.type = parcel.readInt();
        this.atUserType = parcel.readString();
        this.hashTagName = parcel.readString();
        this.awemeId = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 59741, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 59741, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof TextExtraStruct)) {
                return false;
            }
            TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
            if (this.type != textExtraStruct.type) {
                return false;
            }
            if (this.userId == null ? textExtraStruct.userId != null : !this.userId.equals(textExtraStruct.userId)) {
                return false;
            }
            if (!TextUtils.equals(this.hashTagName, textExtraStruct.hashTagName)) {
                return false;
            }
            if (this.atUserType != null) {
                return this.atUserType.equals(textExtraStruct.atUserType);
            }
            if (textExtraStruct.atUserType == null) {
                return true;
            }
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 59740, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 59740, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeString(this.userId);
        parcel.writeString(this.mSecUid);
        parcel.writeInt(this.type);
        parcel.writeString(this.atUserType);
        parcel.writeString(this.hashTagName);
        parcel.writeString(this.awemeId);
    }
}

package com.ss.android.ugc.aweme.n;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class b implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f56810a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f56810a, false, 54490, new Class[]{Parcel.class}, b.class)) {
                return new b(parcel2);
            }
            return (b) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f56810a, false, 54490, new Class[]{Parcel.class}, b.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("current_offsetX")
    public float currentOffsetX = 0.5f;
    @SerializedName("current_offsetY")
    public float currentOffsetY = 0.5f;
    @SerializedName("end_time")
    public int endTime;
    @SerializedName("extra")
    public String extra;
    public transient int id;
    @SerializedName("init_height")
    public float initHeight;
    @SerializedName("init_width")
    public float initWidth;
    @SerializedName("isAnimate")
    public boolean isAnimate;
    public boolean isImageStickerLayer;
    @SerializedName("layer_weight")
    public int layerWeight;
    @SerializedName("path")
    public String path;
    @SerializedName("angle")
    public float rotateAngle;
    @SerializedName("scale")
    public float scale = 1.0f;
    @SerializedName("start_time")
    public int startTime;
    @SerializedName("sticker_id")
    public String stickerId;
    public int type;

    public int describeContents() {
        return 0;
    }

    public boolean isInfoSticker() {
        if (this.type == 1 || this.type == 2) {
            return false;
        }
        return true;
    }

    public b clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54489, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54489, new Class[0], b.class);
        }
        b bVar = null;
        try {
            bVar = (b) super.clone();
        } catch (CloneNotSupportedException unused) {
        }
        return bVar;
    }

    public int hashCode() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54486, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54486, new Class[0], Integer.TYPE)).intValue();
        }
        int hashCode = ((((this.id * 31) + this.stickerId.hashCode()) * 31) + this.path.hashCode()) * 31;
        if (this.extra != null) {
            i = this.extra.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 54488, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 54488, new Class[0], String.class);
        }
        return "StickerItemModel{id=" + this.id + ", stickerId='" + this.stickerId + '\'' + ", path='" + this.path + '\'' + ", extra='" + this.extra + '\'' + ", scale=" + this.scale + ", rotateAngle=" + this.rotateAngle + ", layerWeight=" + this.layerWeight + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", initWidth=" + this.initWidth + ", initHeight=" + this.initHeight + ", currentOffsetX=" + this.currentOffsetX + ", currentOffsetY=" + this.currentOffsetY + '}';
    }

    public void updateLayerWeight(int i) {
        this.layerWeight = i;
    }

    public b(Parcel parcel) {
        boolean z;
        this.stickerId = parcel.readString();
        this.path = parcel.readString();
        this.extra = parcel.readString();
        this.scale = parcel.readFloat();
        this.rotateAngle = parcel.readFloat();
        this.layerWeight = parcel.readInt();
        this.startTime = parcel.readInt();
        this.endTime = parcel.readInt();
        this.initWidth = parcel.readFloat();
        this.initHeight = parcel.readFloat();
        this.currentOffsetX = parcel.readFloat();
        this.currentOffsetY = parcel.readFloat();
        boolean z2 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isAnimate = z;
        this.isImageStickerLayer = parcel.readByte() != 0 ? true : z2;
        this.type = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, changeQuickRedirect, false, 54485, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, changeQuickRedirect, false, 54485, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.id != bVar.id || !this.path.equals(bVar.path) || !this.stickerId.equals(bVar.stickerId)) {
                return false;
            }
            if (this.extra != null) {
                return this.extra.equals(bVar.extra);
            }
            if (bVar.extra == null) {
                return true;
            }
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 54487, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 54487, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.stickerId);
        parcel.writeString(this.path);
        parcel.writeString(this.extra);
        parcel.writeFloat(this.scale);
        parcel.writeFloat(this.rotateAngle);
        parcel.writeInt(this.layerWeight);
        parcel.writeInt(this.startTime);
        parcel.writeInt(this.endTime);
        parcel.writeFloat(this.initWidth);
        parcel.writeFloat(this.initHeight);
        parcel.writeFloat(this.currentOffsetX);
        parcel.writeFloat(this.currentOffsetY);
        parcel.writeByte(this.isAnimate ? (byte) 1 : 0);
        parcel.writeByte(this.isImageStickerLayer ? (byte) 1 : 0);
        parcel.writeInt(this.type);
    }

    public b(String str, String str2, String str3, int i, boolean z, int i2, int i3) {
        this.stickerId = str;
        this.path = str2;
        this.extra = str3;
        this.layerWeight = i;
        this.isAnimate = z;
        this.startTime = i2;
        this.endTime = i3;
    }
}

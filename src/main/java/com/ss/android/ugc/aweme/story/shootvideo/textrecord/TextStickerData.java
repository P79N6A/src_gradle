package com.ss.android.ugc.aweme.story.shootvideo.textrecord;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.a.a;

@Keep
public class TextStickerData implements Parcelable, a, Cloneable {
    public static final Parcelable.Creator<TextStickerData> CREATOR = new Parcelable.Creator<TextStickerData>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74224a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextStickerData[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f74224a, false, 86246, new Class[]{Parcel.class}, TextStickerData.class)) {
                return new TextStickerData(parcel2);
            }
            return (TextStickerData) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f74224a, false, 86246, new Class[]{Parcel.class}, TextStickerData.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("align")
    public int mAlign;
    @SerializedName("bg_mode")
    public int mBgMode;
    @SerializedName("color")
    public int mColor;
    @SerializedName("edit_center_point")
    public Point mEditCenterPoint;
    public int mEndTime;
    @SerializedName("font_type")
    public String mFontType;
    public int mStartTime;
    @SerializedName("text_str")
    public String mTextStr;
    @SerializedName("text_str_ary")
    public String[] mTextStrAry;
    @SerializedName("r")
    public float rotation;
    @SerializedName("s")
    public float scale;
    public float x;
    public float y;

    public int describeContents() {
        return 0;
    }

    public boolean hasTimeData() {
        if (this.mEndTime != 0) {
            return true;
        }
        return false;
    }

    public boolean hasPositionData() {
        if (this.scale != 0.0f) {
            return true;
        }
        return false;
    }

    public TextStickerData clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 86245, new Class[0], TextStickerData.class)) {
            return (TextStickerData) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 86245, new Class[0], TextStickerData.class);
        }
        try {
            return (TextStickerData) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public TextStickerData(Parcel parcel) {
        this.mTextStr = parcel.readString();
        this.mTextStrAry = parcel.createStringArray();
        this.mBgMode = parcel.readInt();
        this.mColor = parcel.readInt();
        this.mAlign = parcel.readInt();
        this.mFontType = parcel.readString();
        this.mEditCenterPoint = (Point) parcel.readParcelable(Point.class.getClassLoader());
        this.mStartTime = parcel.readInt();
        this.mEndTime = parcel.readInt();
        this.x = parcel.readFloat();
        this.y = parcel.readFloat();
        this.rotation = parcel.readFloat();
        this.scale = parcel.readFloat();
    }

    public boolean isVisibleWhen(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 86244, new Class[]{Long.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 86244, new Class[]{Long.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!hasTimeData()) {
            return true;
        } else {
            if (((long) this.mStartTime) > j || j > ((long) this.mEndTime)) {
                return false;
            }
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 86243, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 86243, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.mTextStr);
        parcel.writeStringArray(this.mTextStrAry);
        parcel.writeInt(this.mBgMode);
        parcel.writeInt(this.mColor);
        parcel.writeInt(this.mAlign);
        parcel.writeString(this.mFontType);
        parcel.writeParcelable(this.mEditCenterPoint, i);
        parcel.writeInt(this.mStartTime);
        parcel.writeInt(this.mEndTime);
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
        parcel.writeFloat(this.rotation);
        parcel.writeFloat(this.scale);
    }

    public TextStickerData(String str, int i, int i2, int i3, String str2) {
        this.mTextStr = str;
        this.mBgMode = i;
        this.mColor = i2;
        this.mAlign = i3;
        this.mFontType = str2;
        this.mEditCenterPoint = new Point();
    }
}

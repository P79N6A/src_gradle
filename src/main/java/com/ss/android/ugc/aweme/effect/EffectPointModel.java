package com.ss.android.ugc.aweme.effect;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;

public class EffectPointModel implements Parcelable, Serializable, Cloneable {
    public static final Parcelable.Creator<EffectPointModel> CREATOR = new Parcelable.Creator<EffectPointModel>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43521a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new EffectPointModel[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f43521a, false, 38576, new Class[]{Parcel.class}, EffectPointModel.class)) {
                return new EffectPointModel(parcel2);
            }
            return (EffectPointModel) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f43521a, false, 38576, new Class[]{Parcel.class}, EffectPointModel.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    private String category = "filter";
    private int duration;
    private int endPoint;
    private int index;
    private boolean isFromEnd;
    private String key = PushConstants.PUSH_TYPE_NOTIFY;
    private String name;
    private String resDir;
    private int selectColor;
    private int startPoint;
    private int type;

    public int describeContents() {
        return 0;
    }

    public String getCategory() {
        return this.category;
    }

    public int getDuration() {
        return this.duration;
    }

    public int getEndPoint() {
        return this.endPoint;
    }

    public int getIndex() {
        return this.index;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getResDir() {
        return this.resDir;
    }

    public int getSelectColor() {
        return this.selectColor;
    }

    public int getStartPoint() {
        return this.startPoint;
    }

    public int getType() {
        return this.type;
    }

    public boolean isFromEnd() {
        return this.isFromEnd;
    }

    public EffectPointModel() {
    }

    public EffectPointModel clone() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38575, new Class[0], EffectPointModel.class)) {
            return (EffectPointModel) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38575, new Class[0], EffectPointModel.class);
        }
        try {
            return (EffectPointModel) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 38573, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 38573, new Class[0], String.class);
        }
        return "key : " + this.key + " reaDir : " + this.resDir + " start: " + this.startPoint + ", end: " + this.endPoint + ", isFromEnd: " + this.isFromEnd;
    }

    public void setCategory(String str) {
        this.category = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setEndPoint(int i) {
        this.endPoint = i;
    }

    public void setFromEnd(boolean z) {
        this.isFromEnd = z;
    }

    public EffectPointModel setIndex(int i) {
        this.index = i;
        return this;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setResDir(String str) {
        this.resDir = str;
    }

    public void setSelectColor(int i) {
        this.selectColor = i;
    }

    public void setStartPoint(int i) {
        this.startPoint = i;
    }

    public void setType(int i) {
        this.type = i;
    }

    public EffectPointModel(Parcel parcel) {
        boolean z;
        this.startPoint = parcel.readInt();
        this.endPoint = parcel.readInt();
        this.selectColor = parcel.readInt();
        this.key = parcel.readString();
        this.type = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.isFromEnd = z;
        this.resDir = parcel.readString();
        this.name = parcel.readString();
        this.category = parcel.readString();
        this.duration = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38574, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 38574, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.startPoint);
        parcel.writeInt(this.endPoint);
        parcel.writeInt(this.selectColor);
        parcel.writeString(this.key);
        parcel.writeInt(this.type);
        parcel.writeByte(this.isFromEnd ? (byte) 1 : 0);
        parcel.writeString(this.resDir);
        parcel.writeString(this.name);
        parcel.writeString(this.category);
        parcel.writeInt(this.duration);
    }
}

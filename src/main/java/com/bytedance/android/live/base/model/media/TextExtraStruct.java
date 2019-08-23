package com.bytedance.android.live.base.model.media;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

@Keep
public class TextExtraStruct implements Parcelable {
    public static final Parcelable.Creator<TextExtraStruct> CREATOR = new Parcelable.Creator<TextExtraStruct>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7724a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new TextExtraStruct[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f7724a, false, 67, new Class[]{Parcel.class}, TextExtraStruct.class)) {
                return new TextExtraStruct(parcel2);
            }
            return (TextExtraStruct) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f7724a, false, 67, new Class[]{Parcel.class}, TextExtraStruct.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("end")
    private int end;
    private transient boolean isAddPosition;
    @SerializedName("start")
    private int start;
    @SerializedName("user_id")
    private long userId;

    public int describeContents() {
        return 0;
    }

    public TextExtraStruct() {
    }

    public int getEnd() {
        return this.end;
    }

    public int getStart() {
        return this.start;
    }

    public long getUserId() {
        return this.userId;
    }

    public boolean isAddPosition() {
        return this.isAddPosition;
    }

    public void setAddPosition(boolean z) {
        this.isAddPosition = z;
    }

    public void setEnd(int i) {
        this.end = i;
    }

    public void setStart(int i) {
        this.start = i;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public TextExtraStruct(Parcel parcel) {
        this.start = parcel.readInt();
        this.end = parcel.readInt();
        this.userId = parcel.readLong();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 66, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.start);
        parcel.writeInt(this.end);
        parcel.writeLong(this.userId);
    }
}

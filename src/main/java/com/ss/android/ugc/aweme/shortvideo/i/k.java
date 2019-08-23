package com.ss.android.ugc.aweme.shortvideo.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;

public class k implements Parcelable, Serializable {
    public static final Parcelable.Creator<k> CREATOR = new Parcelable.Creator<k>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68210a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new k[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f68210a, false, 78306, new Class[]{Parcel.class}, k.class)) {
                return new k(parcel2);
            }
            return (k) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f68210a, false, 78306, new Class[]{Parcel.class}, k.class);
        }
    };
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("react_angle")
    public float angle;
    @SerializedName("react_height")
    public int height;
    @SerializedName("react_type")
    public int type;
    @SerializedName("react_width")
    public int width;

    public int describeContents() {
        return 0;
    }

    public k(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
        this.angle = parcel.readFloat();
        this.type = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78305, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, changeQuickRedirect, false, 78305, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.angle);
        parcel.writeInt(this.type);
    }

    public k(int i, int i2, float f2, int i3) {
        this.width = i;
        this.height = i2;
        this.angle = f2;
        this.type = i3;
    }
}

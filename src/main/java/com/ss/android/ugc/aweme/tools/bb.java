package com.ss.android.ugc.aweme.tools;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public class bb implements Parcelable {
    public static final Parcelable.Creator<bb> CREATOR = new Parcelable.Creator<bb>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74654a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new bb[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f74654a, false, 87002, new Class[]{Parcel.class}, bb.class)) {
                return new bb(parcel2);
            }
            return (bb) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f74654a, false, 87002, new Class[]{Parcel.class}, bb.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74651a;
    @SerializedName("uri")

    /* renamed from: b  reason: collision with root package name */
    public String f74652b;
    @SerializedName("url_list")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f74653c;

    public int describeContents() {
        return 0;
    }

    public bb() {
    }

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f74651a, false, 87000, new Class[0], Integer.TYPE)) {
            return (this.f74652b.hashCode() * 31) + this.f74653c.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74651a, false, 87000, new Class[0], Integer.TYPE)).intValue();
    }

    public bb(Parcel parcel) {
        this.f74652b = parcel.readString();
        this.f74653c = parcel.createStringArrayList();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f74651a, false, 86999, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f74651a, false, 86999, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            bb bbVar = (bb) obj;
            if (!this.f74652b.equals(bbVar.f74652b)) {
                return false;
            }
            return this.f74653c.equals(bbVar.f74653c);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f74651a, false, 87001, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f74651a, false, 87001, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f74652b);
        parcel.writeStringList(this.f74653c);
    }
}

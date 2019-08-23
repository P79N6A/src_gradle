package dmt.av.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new Parcelable.Creator<t>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f83069a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new t[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f83069a, false, 92020, new Class[]{Parcel.class}, t.class)) {
                return new t(parcel2);
            }
            return (t) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f83069a, false, 92020, new Class[]{Parcel.class}, t.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f83063a;

    /* renamed from: b  reason: collision with root package name */
    public String f83064b;

    /* renamed from: c  reason: collision with root package name */
    public int f83065c;

    /* renamed from: d  reason: collision with root package name */
    public int f83066d;

    /* renamed from: e  reason: collision with root package name */
    public float f83067e;

    /* renamed from: f  reason: collision with root package name */
    public String f83068f;
    public int g;

    public int describeContents() {
        return 0;
    }

    public t() {
        this.g = 1;
        this.f83067e = 1.0f;
    }

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f83063a, false, 92018, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f83063a, false, 92018, new Class[0], String.class);
        }
        return "VEPreviewMusicParams{mPath='" + this.f83064b + '\'' + ", mInPoint=" + this.f83065c + ", mDuration=" + this.f83066d + ", mVolume=" + this.f83067e + '}';
    }

    public t(Parcel parcel) {
        this.g = 1;
        this.f83064b = parcel.readString();
        this.f83065c = parcel.readInt();
        this.f83066d = parcel.readInt();
        this.f83067e = parcel.readFloat();
        this.f83068f = parcel.readString();
        this.g = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f83063a, false, 92019, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f83063a, false, 92019, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f83064b);
        parcel.writeInt(this.f83065c);
        parcel.writeInt(this.f83066d);
        parcel.writeFloat(this.f83067e);
        parcel.writeString(this.f83068f);
        parcel.writeInt(this.g);
    }
}

package com.bytedance.android.live.base.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f7689a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new a[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f7689a, false, 19, new Class[]{Parcel.class}, a.class)) {
                return new a(parcel2);
            }
            return (a) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f7689a, false, 19, new Class[]{Parcel.class}, a.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7684a;

    /* renamed from: b  reason: collision with root package name */
    public long f7685b;

    /* renamed from: c  reason: collision with root package name */
    public long f7686c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7687d;

    /* renamed from: e  reason: collision with root package name */
    public int f7688e;

    public int describeContents() {
        return 0;
    }

    public a() {
    }

    public a(Parcel parcel) {
        boolean z;
        this.f7685b = parcel.readLong();
        this.f7686c = parcel.readLong();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f7687d = z;
        this.f7688e = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f7684a, false, 18, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f7684a, false, 18, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeLong(this.f7685b);
        parcel.writeLong(this.f7686c);
        parcel.writeByte(this.f7687d ? (byte) 1 : 0);
        parcel.writeInt(this.f7688e);
    }
}

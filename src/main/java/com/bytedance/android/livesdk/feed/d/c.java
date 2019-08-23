package com.bytedance.android.livesdk.feed.d;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14077a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new c[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (PatchProxy.isSupport(new Object[]{parcel}, this, f14077a, false, 8599, new Class[]{Parcel.class}, c.class)) {
                return (c) PatchProxy.accessDispatch(new Object[]{parcel}, this, f14077a, false, 8599, new Class[]{Parcel.class}, c.class);
            }
            c cVar = new c(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), (byte) 0);
            return cVar;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14071a;

    /* renamed from: e  reason: collision with root package name */
    private static final Integer f14072e = 1;

    /* renamed from: f  reason: collision with root package name */
    private static final Integer f14073f = 0;
    private static final Integer g = 31;

    /* renamed from: b  reason: collision with root package name */
    public String f14074b;

    /* renamed from: c  reason: collision with root package name */
    public String f14075c;

    /* renamed from: d  reason: collision with root package name */
    public long f14076d;
    private int h;

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[0], this, f14071a, false, 8592, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14071a, false, 8592, new Class[0], Integer.TYPE)).intValue();
        }
        int intValue = g.intValue();
        if (this.f14075c != null) {
            i = this.f14075c.hashCode();
        } else {
            i = 0;
        }
        int intValue2 = g.intValue() * (intValue + i);
        if (this.f14074b != null) {
            i2 = this.f14074b.hashCode();
        }
        return (g.intValue() * (intValue2 + i2)) + Long.valueOf(this.f14076d).hashCode();
    }

    public String toString() {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[0], this, f14071a, false, 8593, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f14071a, false, 8593, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder("label: ");
        if (this.f14075c == null) {
            str = "null";
        } else {
            str = this.f14075c;
        }
        sb.append(str);
        sb.append("; url: ");
        if (this.f14074b == null) {
            str2 = "null";
        } else {
            str2 = this.f14074b;
        }
        sb.append(str2);
        sb.append("; id: ");
        sb.append(this.f14076d);
        sb.append("; repeatCheck: ");
        sb.append(this.h);
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f14071a, false, 8591, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f14071a, false, 8591, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (obj == null || !(obj instanceof c)) {
            return false;
        } else {
            c cVar = (c) obj;
            if (!TextUtils.equals(this.f14075c, cVar.f14075c) || !TextUtils.equals(this.f14074b, cVar.f14074b) || this.f14076d != cVar.f14076d) {
                return false;
            }
            return true;
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f14071a, false, 8594, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f14071a, false, 8594, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f14075c);
        parcel.writeString(this.f14074b);
        parcel.writeLong(this.f14076d);
        parcel.writeInt(this.h);
    }

    public static c a(@NonNull String str, String str2, long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2)}, null, f14071a, true, 8589, new Class[]{String.class, String.class, Long.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2)}, null, f14071a, true, 8589, new Class[]{String.class, String.class, Long.TYPE}, c.class);
        }
        int intValue = f14072e.intValue();
        if (PatchProxy.isSupport(new Object[]{str, str2, new Long(j2), Integer.valueOf(intValue)}, null, f14071a, true, 8590, new Class[]{String.class, String.class, Long.TYPE, Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str, str2, new Long(j2), Integer.valueOf(intValue)}, null, f14071a, true, 8590, new Class[]{String.class, String.class, Long.TYPE, Integer.TYPE}, c.class);
        } else if (!TextUtils.isEmpty(str)) {
            c cVar = new c(str, str2, j, intValue);
            return cVar;
        } else {
            throw new IllegalArgumentException("label must not be null or empty");
        }
    }

    private c(String str, String str2, long j, int i) {
        this.f14074b = "";
        this.f14075c = "";
        this.f14076d = Long.MIN_VALUE;
        this.h = f14072e.intValue();
        this.f14075c = str;
        this.f14074b = str2;
        this.f14076d = j;
        this.h = i;
    }

    /* synthetic */ c(String str, String str2, long j, int i, byte b2) {
        this(str, str2, j, i);
    }
}

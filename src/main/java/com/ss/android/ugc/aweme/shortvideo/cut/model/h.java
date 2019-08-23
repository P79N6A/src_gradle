package com.ss.android.ugc.aweme.shortvideo.cut.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.music.b.a.a;
import com.ss.android.ugc.aweme.tools.am;
import com.ss.android.ugc.aweme.tools.b.c;

public class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f66500a;

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new h[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f66500a, false, 75861, new Class[]{Parcel.class}, h.class)) {
                return new h(parcel2);
            }
            return (h) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f66500a, false, 75861, new Class[]{Parcel.class}, h.class);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66494a;

    /* renamed from: b  reason: collision with root package name */
    public String f66495b;

    /* renamed from: c  reason: collision with root package name */
    public long f66496c;

    /* renamed from: d  reason: collision with root package name */
    public long f66497d;

    /* renamed from: e  reason: collision with root package name */
    public long f66498e;

    /* renamed from: f  reason: collision with root package name */
    public float f66499f;
    public int g;
    public int h;
    public String i;
    public boolean j;
    public int k;
    public float l = 1.0f;
    public float m = 1.0f;
    public String n;
    public String o;
    private int p;
    private int q;
    private int r;
    private int s;

    public int describeContents() {
        return 0;
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f66494a, false, 75854, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66494a, false, 75854, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.p == 0) {
            e();
        }
        return this.p;
    }

    public final int b() {
        if (PatchProxy.isSupport(new Object[0], this, f66494a, false, 75855, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66494a, false, 75855, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.r == 0) {
            e();
        }
        return this.r;
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f66494a, false, 75856, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66494a, false, 75856, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.s == 0) {
            e();
        }
        return this.s;
    }

    public final int d() {
        if (PatchProxy.isSupport(new Object[0], this, f66494a, false, 75857, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66494a, false, 75857, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.q == 0) {
            e();
        }
        return this.q;
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f66494a, false, 75860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66494a, false, 75860, new Class[0], Void.TYPE);
            return;
        }
        int[] iArr = new int[10];
        if (c.a(this.f66495b, iArr) == 0) {
            this.g = iArr[0];
            this.h = iArr[1];
            this.p = iArr[7];
            this.s = iArr[8];
            this.q = iArr[6];
            this.r = iArr[9];
        }
    }

    public h(a aVar) {
        this.f66495b = aVar.f56315e;
        this.g = aVar.l;
        this.h = aVar.m;
        this.i = aVar.k;
        this.f66496c = aVar.h;
        this.f66497d = 0;
        this.f66498e = this.f66496c;
        this.f66499f = am.NORMAL.value();
        this.n = aVar.a();
    }

    public h(Parcel parcel) {
        boolean z;
        this.f66495b = parcel.readString();
        this.f66496c = parcel.readLong();
        this.f66497d = parcel.readLong();
        this.f66498e = parcel.readLong();
        this.f66499f = parcel.readFloat();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.j = z;
        this.k = parcel.readInt();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.l = parcel.readFloat();
        this.m = parcel.readFloat();
    }

    public boolean equals(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66494a, false, 75858, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f66494a, false, 75858, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (this.f66496c == hVar.f66496c && this.f66497d == hVar.f66497d && this.f66498e == hVar.f66498e && Float.compare(hVar.f66499f, this.f66499f) == 0 && this.g == hVar.g && this.h == hVar.h && this.j == hVar.j && ((this.f66495b == hVar.f66495b || (this.f66495b != null && this.f66495b.equals(hVar.f66495b))) && ((this.i == hVar.i || (this.i != null && this.i.equals(hVar.i))) && ((this.n == hVar.n || (this.n != null && this.n.equals(hVar.n))) && (this.o == hVar.o || (this.o != null && this.o.equals(hVar.o))))))) {
                return true;
            }
            return false;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i2)}, this, f66494a, false, 75859, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i2)}, this, f66494a, false, 75859, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        parcel.writeString(this.f66495b);
        parcel.writeLong(this.f66496c);
        parcel.writeLong(this.f66497d);
        parcel.writeLong(this.f66498e);
        parcel.writeFloat(this.f66499f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeString(this.i);
        parcel.writeByte(this.j ? (byte) 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeFloat(this.l);
        parcel.writeFloat(this.m);
    }

    public h(String str, int i2, int i3, int i4) {
        this.f66495b = str;
        this.g = i2;
        this.h = i3;
        this.i = "";
        long j2 = (long) i4;
        this.f66496c = j2;
        this.f66498e = j2;
        this.f66499f = am.NORMAL.value();
    }
}

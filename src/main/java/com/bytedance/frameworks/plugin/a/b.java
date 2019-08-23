package com.bytedance.frameworks.plugin.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new b[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* renamed from: e  reason: collision with root package name */
    public String f2149e;

    /* renamed from: f  reason: collision with root package name */
    public int f2150f;
    public boolean g;
    public boolean h;
    public String i;
    public List<String> j;
    public int k;
    public int l;
    public String m;
    public int n;
    public volatile a o;
    public String p;
    public String q;
    public C0011b r;
    public AtomicInteger s;
    public AtomicInteger t;
    public boolean u;

    public enum a {
        PENDING(1),
        INSTALLING(2),
        INSTALL_FAILED(3),
        INSTALLED(4),
        RESOLVING(5),
        RESOLVE_FAILED(6),
        RESOLVED(7),
        ACTIVED(8);
        
        private int mIndex;

        public final int getIndex() {
            return this.mIndex;
        }

        private a(int i) {
            this.mIndex = i;
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.a.b$b  reason: collision with other inner class name */
    public enum C0011b {
        LAZY,
        RIGHTNOW
    }

    public final int describeContents() {
        return 0;
    }

    public b() {
        this.g = true;
        this.j = new ArrayList();
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        this.m = null;
        this.o = a.PENDING;
        this.r = C0011b.LAZY;
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = false;
    }

    public final String toString() {
        return "PluginAttribute{mPackageName=" + this.f2145a + ", mPluginType=" + this.f2150f + ", mStandalone=" + this.h + ", mLifeCycle=" + this.o + '}';
    }

    protected b(Parcel parcel) {
        super(parcel);
        a aVar;
        boolean z = true;
        this.g = true;
        this.j = new ArrayList();
        this.k = 0;
        this.l = Integer.MAX_VALUE;
        C0011b bVar = null;
        this.m = null;
        this.o = a.PENDING;
        this.r = C0011b.LAZY;
        this.s = new AtomicInteger(0);
        this.t = new AtomicInteger(0);
        this.u = false;
        this.f2149e = parcel.readString();
        this.f2150f = parcel.readInt();
        this.h = parcel.readByte() == 0 ? false : z;
        this.j = parcel.createStringArrayList();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt == -1) {
            aVar = null;
        } else {
            aVar = a.values()[readInt];
        }
        this.o = aVar;
        this.p = parcel.readString();
        this.q = parcel.readString();
        int readInt2 = parcel.readInt();
        this.r = readInt2 != -1 ? C0011b.values()[readInt2] : bVar;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.f2149e);
        parcel.writeInt(this.f2150f);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeStringList(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        int i4 = -1;
        if (this.o == null) {
            i3 = -1;
        } else {
            i3 = this.o.ordinal();
        }
        parcel.writeInt(i3);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
        if (this.r != null) {
            i4 = this.r.ordinal();
        }
        parcel.writeInt(i4);
    }
}

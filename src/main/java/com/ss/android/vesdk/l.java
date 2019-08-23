package com.ss.android.vesdk;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new Parcelable.Creator<l>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new l[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new l(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final String f78023a = "l";

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f78024d = {"auto", "action", "barcode", "beach", "candlelight", "fireworks", "hdr", "landscape", "night", "night-portrait", "party", "portrait", "snow", "sports", "steadyphoto", "sunset", "theatre"};

    /* renamed from: b  reason: collision with root package name */
    int[] f78025b;

    /* renamed from: c  reason: collision with root package name */
    int[] f78026c;

    /* renamed from: e  reason: collision with root package name */
    public int f78027e;

    /* renamed from: f  reason: collision with root package name */
    public aj f78028f;
    public int[] g;
    public d h;
    public f i;
    public b j;
    public String k;
    public boolean l;
    public byte m;
    public aj n;
    public e o;
    public boolean p;
    public Bundle q;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public l f78029a;

        public a() {
            this.f78029a = new l((byte) 0);
        }

        public a(l lVar) {
            this.f78029a = lVar;
        }

        public final a a(int i) {
            this.f78029a.f78027e = i;
            return this;
        }

        public final a a(Bundle bundle) {
            this.f78029a.q = bundle;
            return this;
        }

        public final a a(@NonNull b bVar) {
            this.f78029a.j = bVar;
            return this;
        }

        public final a a(@NonNull boolean z) {
            this.f78029a.l = z;
            return this;
        }
    }

    public enum b implements Parcelable {
        FACING_BACK,
        FACING_FRONT,
        FACING_WIDE_ANGLE,
        FACING_3RD;
        
        public static final Parcelable.Creator<b> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<b>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new b[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return b.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum c implements Parcelable {
        CAMERA_FLASH_OFF,
        CAMERA_FLASH_ON,
        CAMERA_FLASH_TORCH,
        CAMERA_FLASH_AUTO,
        CAMERA_FLASH_RED_EYE;
        
        public static final Parcelable.Creator<c> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<c>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new c[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return c.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum d implements Parcelable {
        CAMERA_HW_LEVEL_LEGACY,
        CAMERA_HW_LEVEL_LIMITED,
        CAMERA_HW_LEVEL_FULL,
        CAMERA_HW_LEVEL_LEVEL_3;
        
        public static final Parcelable.Creator<d> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<d>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new d[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return d.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum e implements Parcelable {
        SURFACE,
        FRAME;
        
        public static final Parcelable.Creator<e> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<e>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new e[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return e.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public enum f implements Parcelable {
        NULL,
        TYPE1,
        TYPE2,
        TYPE_HuaWei,
        TYPE_Mi,
        TYPE_Oppo;
        
        public static final Parcelable.Creator<f> CREATOR = null;

        public final int describeContents() {
            return 0;
        }

        static {
            CREATOR = new Parcelable.Creator<f>() {
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new f[i];
                }

                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return f.values()[parcel.readInt()];
                }
            };
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(ordinal());
        }
    }

    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public int f78030a = 1;

        public g(int i) {
        }
    }

    public int describeContents() {
        return 0;
    }

    private l() {
        this.f78025b = new int[]{2, 0, 1, 3};
        this.f78026c = new int[]{1, 2, 0, 3};
        this.f78027e = 30;
        this.f78028f = new aj(720, 1280);
        this.g = new int[]{7, 30};
        this.h = d.CAMERA_HW_LEVEL_LEGACY;
        this.i = f.TYPE1;
        this.j = b.FACING_FRONT;
        this.k = "auto";
        this.l = false;
        this.m = 1;
        this.n = new aj(-1, -1);
        this.o = e.SURFACE;
        this.p = true;
        this.i = f.TYPE1;
        this.j = b.FACING_FRONT;
        this.f78027e = 30;
        this.f78028f.f77890a = 720;
        this.f78028f.f77891b = 1280;
    }

    /* synthetic */ l(byte b2) {
        this();
    }

    protected l(Parcel parcel) {
        boolean z;
        this.f78025b = new int[]{2, 0, 1, 3};
        this.f78026c = new int[]{1, 2, 0, 3};
        this.f78027e = 30;
        this.f78028f = new aj(720, 1280);
        this.g = new int[]{7, 30};
        this.h = d.CAMERA_HW_LEVEL_LEGACY;
        this.i = f.TYPE1;
        this.j = b.FACING_FRONT;
        this.k = "auto";
        boolean z2 = false;
        this.l = false;
        this.m = 1;
        this.n = new aj(-1, -1);
        this.o = e.SURFACE;
        this.p = true;
        this.f78025b = parcel.createIntArray();
        this.f78026c = parcel.createIntArray();
        this.f78027e = parcel.readInt();
        this.f78028f = (aj) parcel.readParcelable(aj.class.getClassLoader());
        this.g = parcel.createIntArray();
        this.h = (d) parcel.readParcelable(d.class.getClassLoader());
        this.i = (f) parcel.readParcelable(f.class.getClassLoader());
        this.j = (b) parcel.readParcelable(b.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.k = parcel.readString();
        this.m = parcel.readByte();
        this.n = (aj) parcel.readParcelable(aj.class.getClassLoader());
        this.o = (e) parcel.readParcelable(e.class.getClassLoader());
        this.q = parcel.readBundle();
        this.p = parcel.readByte() != 0 ? true : z2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f78025b);
        parcel.writeIntArray(this.f78026c);
        parcel.writeInt(this.f78027e);
        parcel.writeParcelable(this.f78028f, i2);
        parcel.writeIntArray(this.g);
        parcel.writeParcelable(this.h, i2);
        parcel.writeParcelable(this.i, i2);
        parcel.writeParcelable(this.j, i2);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeString(this.k);
        parcel.writeByte(this.m);
        parcel.writeParcelable(this.n, i2);
        parcel.writeParcelable(this.o, i2);
        parcel.writeBundle(this.q);
        parcel.writeByte(this.p ? (byte) 1 : 0);
    }
}

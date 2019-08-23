package com.mapbox.mapboxsdk.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.Arrays;

public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new p[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            Integer num;
            Integer num2;
            Integer num3;
            Integer num4;
            Integer num5;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float readFloat = parcel.readFloat();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str = parcel.readString();
            } else {
                str = null;
            }
            int readInt3 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str2 = parcel.readString();
            } else {
                str2 = null;
            }
            int readInt4 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str3 = parcel.readString();
            } else {
                str3 = null;
            }
            int readInt5 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str4 = parcel.readString();
            } else {
                str4 = null;
            }
            int readInt6 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str5 = parcel.readString();
            } else {
                str5 = null;
            }
            int readInt7 = parcel.readInt();
            if (parcel.readInt() == 0) {
                str6 = parcel.readString();
            } else {
                str6 = null;
            }
            if (parcel.readInt() == 0) {
                num = Integer.valueOf(parcel.readInt());
            } else {
                num = null;
            }
            if (parcel.readInt() == 0) {
                num2 = Integer.valueOf(parcel.readInt());
            } else {
                num2 = null;
            }
            if (parcel.readInt() == 0) {
                num3 = Integer.valueOf(parcel.readInt());
            } else {
                num3 = null;
            }
            if (parcel.readInt() == 0) {
                num4 = Integer.valueOf(parcel.readInt());
            } else {
                num4 = null;
            }
            if (parcel.readInt() == 0) {
                num5 = Integer.valueOf(parcel.readInt());
            } else {
                num5 = null;
            }
            float readFloat2 = parcel.readFloat();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            long readLong = parcel.readLong();
            int[] createIntArray = parcel.createIntArray();
            double readDouble = parcel.readDouble();
            double readDouble2 = parcel.readDouble();
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            float readFloat5 = parcel.readFloat();
            float readFloat6 = parcel.readFloat();
            String readString = parcel.readString();
            float readFloat7 = parcel.readFloat();
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            p pVar = new p(readFloat, readInt, readInt2, str, readInt3, str2, readInt4, str3, readInt5, str4, readInt6, str5, readInt7, str6, num, num2, num3, num4, num5, readFloat2, z, readLong, createIntArray, readDouble, readDouble2, readFloat3, readFloat4, z2, readFloat5, readFloat6, readString, readFloat7, z3, z4);
            return pVar;
        }
    };
    private static final int[] I = {0, 0, 0, 0};
    public float A;
    public boolean B;
    public float C;
    public float D;
    public String E;
    public float F;
    public boolean G;
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    public float f26529a;

    /* renamed from: b  reason: collision with root package name */
    public int f26530b;

    /* renamed from: c  reason: collision with root package name */
    public int f26531c;

    /* renamed from: d  reason: collision with root package name */
    public String f26532d;

    /* renamed from: e  reason: collision with root package name */
    public int f26533e;

    /* renamed from: f  reason: collision with root package name */
    public String f26534f;
    public int g;
    public String h;
    public int i;
    public String j;
    public int k;
    public String l;
    public int m;
    public String n;
    public Integer o;
    public Integer p;
    public Integer q;
    public Integer r;
    public Integer s;
    public float t;
    public boolean u;
    public long v;
    public int[] w;
    public double x;
    public double y;
    public float z;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int floatToIntBits = (((((Float.floatToIntBits(this.f26529a) ^ 1000003) * 1000003) ^ this.f26530b) * 1000003) ^ this.f26531c) * 1000003;
        int i15 = 0;
        if (this.f26532d == null) {
            i2 = 0;
        } else {
            i2 = this.f26532d.hashCode();
        }
        int i16 = (((floatToIntBits ^ i2) * 1000003) ^ this.f26533e) * 1000003;
        if (this.f26534f == null) {
            i3 = 0;
        } else {
            i3 = this.f26534f.hashCode();
        }
        int i17 = (((i16 ^ i3) * 1000003) ^ this.g) * 1000003;
        if (this.h == null) {
            i4 = 0;
        } else {
            i4 = this.h.hashCode();
        }
        int i18 = (((i17 ^ i4) * 1000003) ^ this.i) * 1000003;
        if (this.j == null) {
            i5 = 0;
        } else {
            i5 = this.j.hashCode();
        }
        int i19 = (((i18 ^ i5) * 1000003) ^ this.k) * 1000003;
        if (this.l == null) {
            i6 = 0;
        } else {
            i6 = this.l.hashCode();
        }
        int i20 = (((i19 ^ i6) * 1000003) ^ this.m) * 1000003;
        if (this.n == null) {
            i7 = 0;
        } else {
            i7 = this.n.hashCode();
        }
        int i21 = (i20 ^ i7) * 1000003;
        if (this.o == null) {
            i8 = 0;
        } else {
            i8 = this.o.hashCode();
        }
        int i22 = (i21 ^ i8) * 1000003;
        if (this.p == null) {
            i9 = 0;
        } else {
            i9 = this.p.hashCode();
        }
        int i23 = (i22 ^ i9) * 1000003;
        if (this.q == null) {
            i10 = 0;
        } else {
            i10 = this.q.hashCode();
        }
        int i24 = (i23 ^ i10) * 1000003;
        if (this.r == null) {
            i11 = 0;
        } else {
            i11 = this.r.hashCode();
        }
        int i25 = (i24 ^ i11) * 1000003;
        if (this.s != null) {
            i15 = this.s.hashCode();
        }
        int floatToIntBits2 = (((i25 ^ i15) * 1000003) ^ Float.floatToIntBits(this.t)) * 1000003;
        int i26 = 1237;
        if (this.u) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int hashCode = (((((((((((((floatToIntBits2 ^ i12) * 1000003) ^ ((int) ((this.v >>> 32) ^ this.v))) * 1000003) ^ Arrays.hashCode(this.w)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.x) >>> 32) ^ Double.doubleToLongBits(this.x)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.y) >>> 32) ^ Double.doubleToLongBits(this.y)))) * 1000003) ^ Float.floatToIntBits(this.z)) * 1000003) ^ Float.floatToIntBits(this.A)) * 1000003;
        if (this.B) {
            i13 = 1231;
        } else {
            i13 = 1237;
        }
        int floatToIntBits3 = (((((((hashCode ^ i13) * 1000003) ^ Float.floatToIntBits(this.C)) * 1000003) ^ Float.floatToIntBits(this.D)) * 1000003) ^ Float.floatToIntBits(this.F)) * 1000003;
        if (this.G) {
            i14 = 1231;
        } else {
            i14 = 1237;
        }
        int i27 = (floatToIntBits3 ^ i14) * 1000003;
        if (this.H) {
            i26 = 1231;
        }
        return i27 ^ i26;
    }

    @NonNull
    public final String toString() {
        return "LocationComponentOptions{accuracyAlpha=" + this.f26529a + ", accuracyColor=" + this.f26530b + ", backgroundDrawableStale=" + this.f26531c + ", backgroundStaleName=" + this.f26532d + ", foregroundDrawableStale=" + this.f26533e + ", foregroundStaleName=" + this.f26534f + ", gpsDrawable=" + this.g + ", gpsName=" + this.h + ", foregroundDrawable=" + this.i + ", foregroundName=" + this.j + ", backgroundDrawable=" + this.k + ", backgroundName=" + this.l + ", bearingDrawable=" + this.m + ", bearingName=" + this.n + ", bearingTintColor=" + this.o + ", foregroundTintColor=" + this.p + ", backgroundTintColor=" + this.q + ", foregroundStaleTintColor=" + this.r + ", backgroundStaleTintColor=" + this.s + ", elevation=" + this.t + ", enableStaleState=" + this.u + ", staleStateTimeout=" + this.v + ", padding=" + Arrays.toString(this.w) + ", maxZoom=" + this.x + ", minZoom=" + this.y + ", maxZoomIconScale=" + this.z + ", minZoomIconScale=" + this.A + ", trackingGesturesManagement=" + this.B + ", trackingInitialMoveThreshold=" + this.C + ", trackingMultiFingerMoveThreshold=" + this.D + ", layerBelow=" + this.E + "trackingAnimationDurationMultiplier=" + this.F + "}";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.floatToIntBits(this.f26529a) == Float.floatToIntBits(pVar.f26529a) && this.f26530b == pVar.f26530b && this.f26531c == pVar.f26531c && (this.f26532d != null ? this.f26532d.equals(pVar.f26532d) : pVar.f26532d == null) && this.f26533e == pVar.f26533e && (this.f26534f != null ? this.f26534f.equals(pVar.f26534f) : pVar.f26534f == null) && this.g == pVar.g && (this.h != null ? this.h.equals(pVar.h) : pVar.h == null) && this.i == pVar.i && (this.j != null ? this.j.equals(pVar.j) : pVar.j == null) && this.k == pVar.k && (this.l != null ? this.l.equals(pVar.l) : pVar.l == null) && this.m == pVar.m && (this.n != null ? this.n.equals(pVar.n) : pVar.n == null) && (this.o != null ? this.o.equals(pVar.o) : pVar.o == null) && (this.p != null ? this.p.equals(pVar.p) : pVar.p == null) && (this.q != null ? this.q.equals(pVar.q) : pVar.q == null) && (this.r != null ? this.r.equals(pVar.r) : pVar.r == null) && (this.s != null ? this.s.equals(pVar.s) : pVar.s == null) && Float.floatToIntBits(this.t) == Float.floatToIntBits(pVar.t) && this.u == pVar.u && this.v == pVar.v && Arrays.equals(this.w, pVar.w) && Double.doubleToLongBits(this.x) == Double.doubleToLongBits(pVar.x) && Double.doubleToLongBits(this.y) == Double.doubleToLongBits(pVar.y) && Float.floatToIntBits(this.z) == Float.floatToIntBits(pVar.z) && Float.floatToIntBits(this.A) == Float.floatToIntBits(pVar.A) && this.B == pVar.B && Float.floatToIntBits(this.C) == Float.floatToIntBits(pVar.C) && Float.floatToIntBits(this.D) == Float.floatToIntBits(pVar.D) && this.E.equals(pVar.E) && Float.floatToIntBits(this.F) == Float.floatToIntBits(pVar.F)) {
            return true;
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.f26529a);
        parcel.writeInt(this.f26530b);
        parcel.writeInt(this.f26531c);
        if (this.f26532d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f26532d);
        }
        parcel.writeInt(this.f26533e);
        if (this.f26534f == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.f26534f);
        }
        parcel.writeInt(this.g);
        if (this.h == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.h);
        }
        parcel.writeInt(this.i);
        if (this.j == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.j);
        }
        parcel.writeInt(this.k);
        if (this.l == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.l);
        }
        parcel.writeInt(this.m);
        if (this.n == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(this.n);
        }
        if (this.o == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.o.intValue());
        }
        if (this.p == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.p.intValue());
        }
        if (this.q == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.q.intValue());
        }
        if (this.r == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.r.intValue());
        }
        if (this.s == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(this.s.intValue());
        }
        parcel.writeFloat(this.t);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeLong(this.v);
        parcel.writeIntArray(this.w);
        parcel.writeDouble(this.x);
        parcel.writeDouble(this.y);
        parcel.writeFloat(this.z);
        parcel.writeFloat(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeFloat(this.C);
        parcel.writeFloat(this.D);
        parcel.writeString(this.E);
        parcel.writeFloat(this.F);
        parcel.writeInt(this.G ? 1 : 0);
        parcel.writeInt(this.H ? 1 : 0);
    }

    public p(float f2, int i2, int i3, @Nullable String str, int i4, @Nullable String str2, int i5, @Nullable String str3, int i6, @Nullable String str4, int i7, @Nullable String str5, int i8, @Nullable String str6, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, float f3, boolean z2, long j2, int[] iArr, double d2, double d3, float f4, float f5, boolean z3, float f6, float f7, String str7, float f8, boolean z4, boolean z5) {
        int[] iArr2 = iArr;
        this.f26529a = f2;
        this.f26530b = i2;
        this.f26531c = i3;
        this.f26532d = str;
        this.f26533e = i4;
        this.f26534f = str2;
        this.g = i5;
        this.h = str3;
        this.i = i6;
        this.j = str4;
        this.k = i7;
        this.l = str5;
        this.m = i8;
        this.n = str6;
        this.o = num;
        this.p = num2;
        this.q = num3;
        this.r = num4;
        this.s = num5;
        this.t = f3;
        this.u = z2;
        this.v = j2;
        if (iArr2 != null) {
            this.w = iArr2;
            this.x = d2;
            this.y = d3;
            this.z = f4;
            this.A = f5;
            this.B = z3;
            this.C = f6;
            this.D = f7;
            this.E = str7;
            this.F = f8;
            this.G = z4;
            this.H = z5;
            return;
        }
        throw new NullPointerException("Null padding");
    }
}

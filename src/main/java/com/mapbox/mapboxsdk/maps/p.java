package com.mapbox.mapboxsdk.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.ColorInt;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import com.mapbox.mapboxsdk.R$styleable;
import com.mapbox.mapboxsdk.camera.CameraPosition;
import com.mapbox.mapboxsdk.utils.a;
import java.util.Arrays;

public class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new p[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new p(parcel, (byte) 0);
        }
    };
    public boolean A;
    public boolean B;
    @ColorInt
    public int C;
    public String D;
    public String E;
    public float F;
    public boolean G;

    /* renamed from: a  reason: collision with root package name */
    public CameraPosition f26704a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f26705b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f26706c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f26707d;

    /* renamed from: e  reason: collision with root package name */
    public int f26708e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f26709f;
    public Drawable g;
    public boolean h;
    public int i;
    public int[] j;
    @ColorInt
    public int k;
    public boolean l;
    public int m;
    public int[] n;
    public double o;
    public double p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public String y;
    public String z;

    public int describeContents() {
        return 0;
    }

    public p() {
        this.f26706c = true;
        this.f26707d = true;
        this.f26708e = 8388661;
        this.h = true;
        this.i = 8388691;
        this.k = -1;
        this.l = true;
        this.m = 8388691;
        this.p = 25.5d;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.v = true;
        this.w = true;
        this.G = true;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (this.f26704a != null) {
            i2 = this.f26704a.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = ((((((((i2 * 31) + (this.f26705b ? 1 : 0)) * 31) + (this.f26706c ? 1 : 0)) * 31) + (this.f26707d ? 1 : 0)) * 31) + this.f26708e) * 31;
        if (this.g != null) {
            i3 = this.g.hashCode();
        } else {
            i3 = 0;
        }
        int hashCode = ((((((((((((((((i8 + i3) * 31) + Arrays.hashCode(this.f26709f)) * 31) + (this.h ? 1 : 0)) * 31) + this.i) * 31) + Arrays.hashCode(this.j)) * 31) + this.k) * 31) + (this.l ? 1 : 0)) * 31) + this.m) * 31) + Arrays.hashCode(this.n);
        long doubleToLongBits = Double.doubleToLongBits(this.o);
        int i9 = (hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        long doubleToLongBits2 = Double.doubleToLongBits(this.p);
        int i10 = ((((((((((((((i9 * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31;
        if (this.z != null) {
            i4 = this.z.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (((((i10 + i4) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31;
        if (this.D != null) {
            i5 = this.D.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        if (this.E != null) {
            i6 = this.E.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (((((i12 + i6) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31;
        if (this.y != null) {
            i7 = this.y.hashCode();
        }
        return ((((i13 + i7) * 31) + ((int) this.F)) * 31) + (this.G ? 1 : 0);
    }

    public final p a(double d2) {
        this.o = d2;
        return this;
    }

    public final p b(double d2) {
        this.p = d2;
        return this;
    }

    public final p c(String str) {
        this.y = str;
        return this;
    }

    public final p a(Drawable drawable) {
        this.g = drawable;
        return this;
    }

    public final p b(String str) {
        this.D = str;
        return this;
    }

    public final p a(CameraPosition cameraPosition) {
        this.f26704a = cameraPosition;
        return this;
    }

    public final p a(String str) {
        this.z = str;
        return this;
    }

    private p(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17 = true;
        this.f26706c = true;
        this.f26707d = true;
        this.f26708e = 8388661;
        this.h = true;
        this.i = 8388691;
        this.k = -1;
        this.l = true;
        this.m = 8388691;
        this.p = 25.5d;
        this.q = true;
        this.r = true;
        this.s = true;
        this.t = true;
        this.v = true;
        this.w = true;
        this.G = true;
        this.f26704a = (CameraPosition) parcel.readParcelable(CameraPosition.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f26705b = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f26706c = z3;
        this.f26708e = parcel.readInt();
        this.f26709f = parcel.createIntArray();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f26707d = z4;
        Bitmap bitmap = (Bitmap) parcel.readParcelable(getClass().getClassLoader());
        if (bitmap != null) {
            this.g = new BitmapDrawable(bitmap);
        }
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.h = z5;
        this.i = parcel.readInt();
        this.j = parcel.createIntArray();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.l = z6;
        this.m = parcel.readInt();
        this.n = parcel.createIntArray();
        this.k = parcel.readInt();
        this.o = parcel.readDouble();
        this.p = parcel.readDouble();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.q = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.r = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.s = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.u = z10;
        if (parcel.readByte() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.t = z11;
        if (parcel.readByte() != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.v = z12;
        this.D = parcel.readString();
        this.E = parcel.readString();
        this.z = parcel.readString();
        if (parcel.readByte() != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.A = z13;
        if (parcel.readByte() != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        this.B = z14;
        if (parcel.readByte() != 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        this.w = z15;
        if (parcel.readByte() != 0) {
            z16 = true;
        } else {
            z16 = false;
        }
        this.x = z16;
        this.y = parcel.readString();
        this.F = parcel.readFloat();
        this.C = parcel.readInt();
        this.G = parcel.readByte() == 0 ? false : z17;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f26705b != pVar.f26705b || this.f26706c != pVar.f26706c || this.f26707d != pVar.f26707d) {
            return false;
        }
        if (this.g == null ? pVar.g != null : !this.g.equals(pVar.g)) {
            return false;
        }
        if (this.f26708e != pVar.f26708e || this.h != pVar.h || this.i != pVar.i || this.k != pVar.k || this.l != pVar.l || this.m != pVar.m || Double.compare(pVar.o, this.o) != 0 || Double.compare(pVar.p, this.p) != 0 || this.q != pVar.q || this.r != pVar.r || this.s != pVar.s || this.t != pVar.t || this.u != pVar.u || this.v != pVar.v) {
            return false;
        }
        if (this.f26704a == null ? pVar.f26704a != null : !this.f26704a.equals(pVar.f26704a)) {
            return false;
        }
        if (!Arrays.equals(this.f26709f, pVar.f26709f) || !Arrays.equals(this.j, pVar.j) || !Arrays.equals(this.n, pVar.n)) {
            return false;
        }
        if (this.D == null ? pVar.D != null : !this.D.equals(pVar.D)) {
            return false;
        }
        if (this.E == null ? pVar.E != null : !this.E.equals(pVar.E)) {
            return false;
        }
        if (this.z == null ? pVar.z == null : this.z.equals(pVar.z)) {
            return (this.w == pVar.w && this.x == pVar.x && this.y.equals(pVar.y) && this.F == pVar.F && this.G != pVar.G) ? false : false;
        }
        return false;
    }

    /* synthetic */ p(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Bitmap bitmap;
        parcel.writeParcelable(this.f26704a, i2);
        parcel.writeByte(this.f26705b ? (byte) 1 : 0);
        parcel.writeByte(this.f26706c ? (byte) 1 : 0);
        parcel.writeInt(this.f26708e);
        parcel.writeIntArray(this.f26709f);
        parcel.writeByte(this.f26707d ? (byte) 1 : 0);
        if (this.g != null) {
            bitmap = a.a(this.g);
        } else {
            bitmap = null;
        }
        parcel.writeParcelable(bitmap, i2);
        parcel.writeByte(this.h ? (byte) 1 : 0);
        parcel.writeInt(this.i);
        parcel.writeIntArray(this.j);
        parcel.writeByte(this.l ? (byte) 1 : 0);
        parcel.writeInt(this.m);
        parcel.writeIntArray(this.n);
        parcel.writeInt(this.k);
        parcel.writeDouble(this.o);
        parcel.writeDouble(this.p);
        parcel.writeByte(this.q ? (byte) 1 : 0);
        parcel.writeByte(this.r ? (byte) 1 : 0);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeByte(this.u ? (byte) 1 : 0);
        parcel.writeByte(this.t ? (byte) 1 : 0);
        parcel.writeByte(this.v ? (byte) 1 : 0);
        parcel.writeString(this.D);
        parcel.writeString(this.E);
        parcel.writeString(this.z);
        parcel.writeByte(this.A ? (byte) 1 : 0);
        parcel.writeByte(this.B ? (byte) 1 : 0);
        parcel.writeByte(this.w ? (byte) 1 : 0);
        parcel.writeByte(this.x ? (byte) 1 : 0);
        parcel.writeString(this.y);
        parcel.writeFloat(this.F);
        parcel.writeInt(this.C);
        parcel.writeByte(this.G ? (byte) 1 : 0);
    }

    public static p a(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        p pVar = new p();
        float f2 = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.mapbox_MapView, 0, 0);
        try {
            pVar.a(new CameraPosition.a(obtainStyledAttributes).a());
            pVar.b(obtainStyledAttributes.getString(17));
            pVar.E = obtainStyledAttributes.getString(16);
            pVar.a(obtainStyledAttributes.getString(0));
            pVar.t = obtainStyledAttributes.getBoolean(44, true);
            pVar.r = obtainStyledAttributes.getBoolean(41, true);
            pVar.q = obtainStyledAttributes.getBoolean(40, true);
            pVar.s = obtainStyledAttributes.getBoolean(42, true);
            pVar.u = obtainStyledAttributes.getBoolean(43, false);
            pVar.v = obtainStyledAttributes.getBoolean(33, true);
            pVar.b((double) obtainStyledAttributes.getFloat(6, 25.5f));
            pVar.a((double) obtainStyledAttributes.getFloat(7, 0.0f));
            pVar.f26706c = obtainStyledAttributes.getBoolean(25, true);
            pVar.f26708e = obtainStyledAttributes.getInt(28, 8388661);
            float f3 = 4.0f * f2;
            pVar.f26709f = new int[]{(int) obtainStyledAttributes.getDimension(30, f3), (int) obtainStyledAttributes.getDimension(32, f3), (int) obtainStyledAttributes.getDimension(31, f3), (int) obtainStyledAttributes.getDimension(29, f3)};
            pVar.f26707d = obtainStyledAttributes.getBoolean(27, true);
            Drawable drawable = obtainStyledAttributes.getDrawable(26);
            if (drawable == null) {
                drawable = ResourcesCompat.getDrawable(context.getResources(), 2130840256, null);
            }
            pVar.a(drawable);
            pVar.h = obtainStyledAttributes.getBoolean(34, true);
            pVar.i = obtainStyledAttributes.getInt(35, 8388691);
            pVar.j = new int[]{(int) obtainStyledAttributes.getDimension(37, f3), (int) obtainStyledAttributes.getDimension(39, f3), (int) obtainStyledAttributes.getDimension(38, f3), (int) obtainStyledAttributes.getDimension(36, f3)};
            pVar.k = obtainStyledAttributes.getColor(24, -1);
            pVar.l = obtainStyledAttributes.getBoolean(18, true);
            pVar.m = obtainStyledAttributes.getInt(19, 8388691);
            pVar.n = new int[]{(int) obtainStyledAttributes.getDimension(21, f2 * 92.0f), (int) obtainStyledAttributes.getDimension(23, f3), (int) obtainStyledAttributes.getDimension(22, f3), (int) obtainStyledAttributes.getDimension(20, f3)};
            pVar.A = obtainStyledAttributes.getBoolean(14, false);
            pVar.B = obtainStyledAttributes.getBoolean(15, false);
            pVar.w = obtainStyledAttributes.getBoolean(9, true);
            pVar.x = obtainStyledAttributes.getBoolean(10, false);
            pVar.c(obtainStyledAttributes.getString(12));
            pVar.F = obtainStyledAttributes.getFloat(13, 0.0f);
            pVar.C = obtainStyledAttributes.getInt(11, -988703);
            pVar.G = obtainStyledAttributes.getBoolean(8, true);
            return pVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

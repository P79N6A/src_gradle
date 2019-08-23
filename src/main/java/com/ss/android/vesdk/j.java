package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new Parcelable.Creator<j>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new j[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new j(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public b f78002a;

    /* renamed from: b  reason: collision with root package name */
    public int f78003b;

    /* renamed from: c  reason: collision with root package name */
    public int f78004c;

    /* renamed from: d  reason: collision with root package name */
    public int f78005d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f78006e;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public b f78007a = b.ENCODE_STANDARD_WAV;

        /* renamed from: b  reason: collision with root package name */
        public int f78008b = 44100;

        /* renamed from: c  reason: collision with root package name */
        public int f78009c = 131072;

        /* renamed from: d  reason: collision with root package name */
        public int f78010d = 2;

        /* renamed from: e  reason: collision with root package name */
        public boolean f78011e;

        public final j a() {
            return new j(this, (byte) 0);
        }
    }

    public enum b implements Parcelable {
        ENCODE_STANDARD_WAV,
        ENCODE_STANDARD_PCM,
        ENCODE_STANDARD_AAC;
        
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

    public int describeContents() {
        return 0;
    }

    @Deprecated
    public j() {
        this.f78003b = 44100;
        this.f78004c = 131072;
        this.f78005d = 2;
        this.f78003b = 44100;
        this.f78004c = 131072;
        this.f78005d = 2;
    }

    protected j(Parcel parcel) {
        boolean z;
        this.f78003b = 44100;
        this.f78004c = 131072;
        this.f78005d = 2;
        this.f78002a = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f78003b = parcel.readInt();
        this.f78004c = parcel.readInt();
        this.f78005d = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f78006e = z;
    }

    private j(a aVar) {
        this.f78003b = 44100;
        this.f78004c = 131072;
        this.f78005d = 2;
        this.f78002a = aVar.f78007a;
        this.f78003b = aVar.f78008b;
        this.f78004c = aVar.f78009c;
        this.f78005d = aVar.f78010d;
        this.f78006e = aVar.f78011e;
    }

    /* synthetic */ j(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f78002a, i);
        parcel.writeInt(this.f78003b);
        parcel.writeInt(this.f78004c);
        parcel.writeInt(this.f78005d);
        parcel.writeByte(this.f78006e ? (byte) 1 : 0);
    }
}

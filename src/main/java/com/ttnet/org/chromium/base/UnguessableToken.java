package com.ttnet.org.chromium.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.ttnet.org.chromium.base.annotations.CalledByNative;

public class UnguessableToken implements Parcelable {
    public static final Parcelable.Creator<UnguessableToken> CREATOR = new Parcelable.Creator<UnguessableToken>() {
        public final UnguessableToken[] newArray(int i) {
            return new UnguessableToken[i];
        }

        public final UnguessableToken createFromParcel(Parcel parcel) {
            long readLong = parcel.readLong();
            long readLong2 = parcel.readLong();
            if (readLong == 0 || readLong2 == 0) {
                return null;
            }
            UnguessableToken unguessableToken = new UnguessableToken(readLong, readLong2);
            return unguessableToken;
        }
    };
    private final long mHigh;
    private final long mLow;

    public int describeContents() {
        return 0;
    }

    @CalledByNative
    private long getHighForSerialization() {
        return this.mHigh;
    }

    @CalledByNative
    private long getLowForSerialization() {
        return this.mLow;
    }

    @CalledByNative
    private UnguessableToken parcelAndUnparcelForTesting() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        UnguessableToken createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    private UnguessableToken(long j, long j2) {
        this.mHigh = j;
        this.mLow = j2;
    }

    @CalledByNative
    private static UnguessableToken create(long j, long j2) {
        return new UnguessableToken(j, j2);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mHigh);
        parcel.writeLong(this.mLow);
    }
}

package android.rms.iaware;

import android.os.Parcel;

public class IAwareSdkCore {
    public static boolean handleEvent(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public static boolean handleEvent(int i, Parcel parcel, Parcel parcel2) {
        return handleEvent(i, parcel, parcel2, -1);
    }
}

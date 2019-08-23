package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public final class d implements Parcelable.Creator<ParcelableHeader> {
    d() {
    }

    /* renamed from: a */
    public final ParcelableHeader[] newArray(int i) {
        return new ParcelableHeader[i];
    }

    /* renamed from: a */
    public final ParcelableHeader createFromParcel(Parcel parcel) {
        return ParcelableHeader.a(parcel);
    }
}

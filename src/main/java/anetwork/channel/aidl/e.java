package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public final class e implements Parcelable.Creator<ParcelableRequest> {
    e() {
    }

    /* renamed from: a */
    public final ParcelableRequest[] newArray(int i) {
        return new ParcelableRequest[i];
    }

    /* renamed from: a */
    public final ParcelableRequest createFromParcel(Parcel parcel) {
        return ParcelableRequest.readFromParcel(parcel);
    }
}

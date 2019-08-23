package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public final class c implements Parcelable.Creator<NetworkResponse> {
    c() {
    }

    /* renamed from: a */
    public final NetworkResponse[] newArray(int i) {
        return new NetworkResponse[i];
    }

    /* renamed from: a */
    public final NetworkResponse createFromParcel(Parcel parcel) {
        return NetworkResponse.readFromParcel(parcel);
    }
}

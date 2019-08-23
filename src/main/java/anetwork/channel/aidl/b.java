package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator<DefaultProgressEvent> {
    b() {
    }

    /* renamed from: a */
    public final DefaultProgressEvent[] newArray(int i) {
        return new DefaultProgressEvent[i];
    }

    /* renamed from: a */
    public final DefaultProgressEvent createFromParcel(Parcel parcel) {
        return DefaultProgressEvent.readFromParcel(parcel);
    }
}

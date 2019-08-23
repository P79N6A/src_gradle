package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable.Creator<DefaultFinishEvent> {
    a() {
    }

    /* renamed from: a */
    public final DefaultFinishEvent[] newArray(int i) {
        return new DefaultFinishEvent[i];
    }

    /* renamed from: a */
    public final DefaultFinishEvent createFromParcel(Parcel parcel) {
        return DefaultFinishEvent.a(parcel);
    }
}

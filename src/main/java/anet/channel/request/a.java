package anet.channel.request;

import android.os.Parcel;
import android.os.Parcelable;

public final class a implements Parcelable.Creator<ByteArrayEntry> {
    a() {
    }

    /* renamed from: a */
    public final ByteArrayEntry[] newArray(int i) {
        return new ByteArrayEntry[i];
    }

    /* renamed from: a */
    public final ByteArrayEntry createFromParcel(Parcel parcel) {
        ByteArrayEntry byteArrayEntry = new ByteArrayEntry((a) null);
        byteArrayEntry.bytes = new byte[parcel.readInt()];
        parcel.readByteArray(byteArrayEntry.bytes);
        byteArrayEntry.offset = parcel.readInt();
        byteArrayEntry.count = parcel.readInt();
        return byteArrayEntry;
    }
}

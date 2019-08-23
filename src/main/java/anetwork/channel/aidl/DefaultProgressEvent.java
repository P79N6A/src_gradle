package anetwork.channel.aidl;

import android.os.Parcel;
import android.os.Parcelable;
import anetwork.channel.NetworkEvent;

public class DefaultProgressEvent implements Parcelable, NetworkEvent.ProgressEvent {
    public static final Parcelable.Creator<DefaultProgressEvent> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    int f1461a;

    /* renamed from: b  reason: collision with root package name */
    int f1462b;

    /* renamed from: c  reason: collision with root package name */
    int f1463c;

    /* renamed from: d  reason: collision with root package name */
    Object f1464d;

    /* renamed from: e  reason: collision with root package name */
    byte[] f1465e;

    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return "";
    }

    public DefaultProgressEvent() {
    }

    public byte[] getBytedata() {
        return this.f1465e;
    }

    public Object getContext() {
        return this.f1464d;
    }

    public int getIndex() {
        return this.f1461a;
    }

    public int getSize() {
        return this.f1462b;
    }

    public int getTotal() {
        return this.f1463c;
    }

    public String toString() {
        return "DefaultProgressEvent [index=" + this.f1461a + ", size=" + this.f1462b + ", total=" + this.f1463c + "]";
    }

    public void setContext(Object obj) {
        this.f1464d = obj;
    }

    public static DefaultProgressEvent readFromParcel(Parcel parcel) {
        DefaultProgressEvent defaultProgressEvent = new DefaultProgressEvent();
        try {
            defaultProgressEvent.f1461a = parcel.readInt();
            defaultProgressEvent.f1462b = parcel.readInt();
            defaultProgressEvent.f1463c = parcel.readInt();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                parcel.readByteArray(bArr);
                defaultProgressEvent.f1465e = bArr;
            }
        } catch (Exception unused) {
        }
        return defaultProgressEvent;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f1461a);
        parcel.writeInt(this.f1462b);
        parcel.writeInt(this.f1463c);
        if (this.f1465e != null) {
            i2 = this.f1465e.length;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        parcel.writeByteArray(this.f1465e);
    }

    public DefaultProgressEvent(int i, int i2, int i3, byte[] bArr) {
        this.f1461a = i;
        this.f1462b = i2;
        this.f1463c = i3;
        this.f1465e = bArr;
    }
}

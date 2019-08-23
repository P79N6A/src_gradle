package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.handler.MessageV3;

public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>() {
        /* renamed from: a */
        public final c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        /* renamed from: a */
        public final c[] newArray(int i) {
            return new c[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private MessageV3 f27202a;

    /* renamed from: b  reason: collision with root package name */
    private String f27203b;

    /* renamed from: c  reason: collision with root package name */
    private int f27204c;

    /* renamed from: d  reason: collision with root package name */
    private int f27205d;

    protected c(Parcel parcel) {
        this.f27202a = (MessageV3) parcel.readParcelable(MessageV3.class.getClassLoader());
        this.f27203b = parcel.readString();
        this.f27204c = parcel.readInt();
        this.f27205d = parcel.readInt();
    }

    public c(MessageV3 messageV3) {
        this.f27202a = messageV3;
    }

    public MessageV3 a() {
        return this.f27202a;
    }

    public void a(int i) {
        this.f27204c = i;
    }

    public void a(String str) {
        this.f27203b = str;
    }

    public int b() {
        return this.f27204c;
    }

    public void b(int i) {
        this.f27205d = i;
    }

    public int c() {
        return this.f27205d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotificationState{messageV3=" + this.f27202a + ", notificationPkg='" + this.f27203b + '\'' + ", notificationId='" + this.f27204c + '\'' + ", state='" + this.f27205d + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f27202a, i);
        parcel.writeString(this.f27203b);
        parcel.writeInt(this.f27204c);
        parcel.writeInt(this.f27205d);
    }
}

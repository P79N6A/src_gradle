package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() {
        /* renamed from: a */
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel);
        }

        /* renamed from: a */
        public final g[] newArray(int i) {
            return new g[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private b f27224a;

    /* renamed from: b  reason: collision with root package name */
    private String f27225b;

    /* renamed from: c  reason: collision with root package name */
    private int f27226c;

    protected g(Parcel parcel) {
        this.f27224a = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f27225b = parcel.readString();
        this.f27226c = parcel.readInt();
    }

    public g(String str, String str2, String str3, String str4, String str5) {
        this.f27225b = str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("notifyId")) {
                this.f27226c = jSONObject.getInt("notifyId");
            }
        } catch (JSONException e2) {
            DebugLogger.e("WithDrawMessage", "parse WithDrawMessage error " + e2.getMessage());
        }
        this.f27224a = new b(str3, str4, str5);
    }

    public b a() {
        return this.f27224a;
    }

    public int b() {
        return this.f27226c;
    }

    public String c() {
        return this.f27225b;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "WithDrawMessage{controlMessage=" + this.f27224a + ", revokePackageName='" + this.f27225b + '\'' + ", notifyId=" + this.f27226c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f27224a, i);
        parcel.writeString(this.f27225b);
        parcel.writeInt(this.f27226c);
    }
}

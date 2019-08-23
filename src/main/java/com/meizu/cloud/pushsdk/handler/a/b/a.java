package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() {
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        /* renamed from: a */
        public final a[] newArray(int i) {
            return new a[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private int f27196a;

    /* renamed from: b  reason: collision with root package name */
    private int f27197b;

    /* renamed from: c  reason: collision with root package name */
    private int f27198c;

    public a() {
    }

    protected a(Parcel parcel) {
        this.f27196a = parcel.readInt();
        this.f27197b = parcel.readInt();
        this.f27198c = parcel.readInt();
    }

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("pushType")) {
                    aVar.a(jSONObject.getInt("pushType"));
                }
                if (!jSONObject.isNull("cached")) {
                    aVar.b(jSONObject.getInt("cached"));
                }
                if (!jSONObject.isNull("cacheNum")) {
                    aVar.c(jSONObject.getInt("cacheNum"));
                }
            } catch (JSONException e2) {
                DebugLogger.e("ctl", " parse control message error " + e2.getMessage());
            }
        } else {
            DebugLogger.e("ctl", "no control message can parse ");
        }
        return aVar;
    }

    public int a() {
        return this.f27196a;
    }

    public void a(int i) {
        this.f27196a = i;
    }

    public void b(int i) {
        this.f27197b = i;
    }

    public void c(int i) {
        this.f27198c = i;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Control{pushType=" + this.f27196a + ", cached=" + this.f27197b + ", cacheNum=" + this.f27198c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27196a);
        parcel.writeInt(this.f27197b);
        parcel.writeInt(this.f27198c);
    }
}

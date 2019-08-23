package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new Parcelable.Creator<e>() {
        /* renamed from: a */
        public final e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        /* renamed from: a */
        public final e[] newArray(int i) {
            return new e[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f27214a;

    /* renamed from: b  reason: collision with root package name */
    private String f27215b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27216c;

    /* renamed from: d  reason: collision with root package name */
    private String f27217d;

    /* renamed from: e  reason: collision with root package name */
    private String f27218e;

    public e() {
    }

    protected e(Parcel parcel) {
        this.f27214a = parcel.readString();
        this.f27215b = parcel.readString();
        this.f27216c = parcel.readByte() != 0;
        this.f27217d = parcel.readString();
        this.f27218e = parcel.readString();
    }

    public static e a(JSONObject jSONObject) {
        e eVar = new e();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("taskId")) {
                    eVar.a(jSONObject.getString("taskId"));
                }
                if (!jSONObject.isNull("time")) {
                    eVar.b(jSONObject.getString("time"));
                }
                if (!jSONObject.isNull("pushExtra")) {
                    eVar.a(jSONObject.getInt("pushExtra") != 0);
                }
            } catch (JSONException e2) {
                DebugLogger.e("statics", " parse statics message error " + e2.getMessage());
            }
        } else {
            DebugLogger.e("statics", "no control statics can parse ");
        }
        return eVar;
    }

    public String a() {
        return this.f27214a;
    }

    public void a(String str) {
        this.f27214a = str;
    }

    public void a(boolean z) {
        this.f27216c = z;
    }

    public String b() {
        return this.f27215b;
    }

    public void b(String str) {
        this.f27215b = str;
    }

    public void c(String str) {
        this.f27217d = str;
    }

    public boolean c() {
        return this.f27216c;
    }

    public String d() {
        return this.f27217d;
    }

    public void d(String str) {
        this.f27218e = str;
    }

    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f27218e;
    }

    public String toString() {
        return "Statics{taskId='" + this.f27214a + '\'' + ", time='" + this.f27215b + '\'' + ", pushExtra=" + this.f27216c + ", deviceId='" + this.f27217d + '\'' + ", seqId='" + this.f27218e + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27214a);
        parcel.writeString(this.f27215b);
        parcel.writeByte(this.f27216c ? (byte) 1 : 0);
        parcel.writeString(this.f27217d);
        parcel.writeString(this.f27218e);
    }
}

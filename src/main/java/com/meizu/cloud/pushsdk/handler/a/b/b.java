package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() {
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        /* renamed from: a */
        public final b[] newArray(int i) {
            return new b[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private String f27199a;

    /* renamed from: b  reason: collision with root package name */
    private a f27200b;

    /* renamed from: c  reason: collision with root package name */
    private e f27201c;

    public b() {
    }

    protected b(Parcel parcel) {
        this.f27199a = parcel.readString();
        this.f27200b = (a) parcel.readParcelable(a.class.getClassLoader());
        this.f27201c = (e) parcel.readParcelable(e.class.getClassLoader());
    }

    public b(String str, String str2, String str3) {
        this.f27199a = str;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f27200b = a.a(jSONObject.getJSONObject("ctl"));
                this.f27201c = e.a(jSONObject.getJSONObject("statics"));
                this.f27201c.c(str2);
                this.f27201c.d(str3);
            } catch (JSONException e2) {
                this.f27200b = new a();
                this.f27201c = new e();
                DebugLogger.e("ControlMessage", "parse control message error " + e2.getMessage());
            }
        } else {
            this.f27200b = new a();
            this.f27201c = new e();
        }
    }

    public static b a(String str) {
        b bVar = new b();
        try {
            JSONObject jSONObject = new JSONObject(str);
            bVar.a(a.a(jSONObject.getJSONObject("ctl")));
            bVar.a(e.a(jSONObject.getJSONObject("statics")));
        } catch (Exception e2) {
            DebugLogger.e("ControlMessage", "parse control message error " + e2.getMessage());
            bVar.a(new e());
            bVar.a(new a());
        }
        return bVar;
    }

    public a a() {
        return this.f27200b;
    }

    public void a(a aVar) {
        this.f27200b = aVar;
    }

    public void a(e eVar) {
        this.f27201c = eVar;
    }

    public e b() {
        return this.f27201c;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ControlMessage{controlMessage='" + this.f27199a + '\'' + ", control=" + this.f27200b + ", statics=" + this.f27201c + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27199a);
        parcel.writeParcelable(this.f27200b, i);
        parcel.writeParcelable(this.f27201c, i);
    }
}

package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.handler.MessageV3;
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
    private int f27249a;

    /* renamed from: b  reason: collision with root package name */
    private String f27250b;

    public a() {
    }

    protected a(Parcel parcel) {
        this.f27249a = parcel.readInt();
        this.f27250b = parcel.readString();
    }

    public static a a(MessageV3 messageV3) {
        a aVar;
        try {
            aVar = !TextUtils.isEmpty(messageV3.getNotificationMessage()) ? a(new JSONObject(messageV3.getNotificationMessage()).getJSONObject("data").getJSONObject(PushConstants.EXTRA).getJSONObject("no")) : null;
        } catch (Exception e2) {
            DebugLogger.e("NotifyOption", "parse flyme NotifyOption setting error " + e2.getMessage() + " so get from notificationMessage");
            aVar = c(messageV3.getNotificationMessage());
        }
        DebugLogger.i("NotifyOption", "current notify option is " + aVar);
        return aVar;
    }

    public static a a(JSONObject jSONObject) {
        a aVar = new a();
        if (jSONObject != null) {
            try {
                if (!jSONObject.isNull("ni")) {
                    aVar.a(jSONObject.getInt("ni"));
                }
                if (!jSONObject.isNull("nk")) {
                    aVar.a(jSONObject.getString("nk"));
                }
            } catch (JSONException e2) {
                DebugLogger.e("NotifyOption", "parse json obj error " + e2.getMessage());
            }
        } else {
            DebugLogger.e("NotifyOption", "no such tag NotifyOption");
        }
        return aVar;
    }

    public static int b(MessageV3 messageV3) {
        a a2 = a(messageV3);
        if (a2 != null) {
            return a2.a();
        }
        return 0;
    }

    public static a b(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e2) {
                DebugLogger.e("NotifyOption", "parse json string error " + e2.getMessage());
            }
            return a(jSONObject);
        }
        jSONObject = null;
        return a(jSONObject);
    }

    private static a c(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return b(new JSONObject(str).getString("no"));
            }
            return null;
        } catch (JSONException e2) {
            DebugLogger.e("NotifyOption", "parse notificationMessage error " + e2.getMessage());
            return null;
        }
    }

    public int a() {
        return this.f27249a;
    }

    public void a(int i) {
        this.f27249a = i;
    }

    public void a(String str) {
        this.f27250b = str;
    }

    public String b() {
        return this.f27250b;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "NotifyOption{notifyId=" + this.f27249a + ", notifyKey='" + this.f27250b + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27249a);
        parcel.writeString(this.f27250b);
    }
}

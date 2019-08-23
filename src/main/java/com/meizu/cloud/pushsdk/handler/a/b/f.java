package com.meizu.cloud.pushsdk.handler.a.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() {
        /* renamed from: a */
        public final f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        /* renamed from: a */
        public final f[] newArray(int i) {
            return new f[i];
        }
    };

    /* renamed from: a  reason: collision with root package name */
    private int f27219a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f27220b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f27221c;

    /* renamed from: d  reason: collision with root package name */
    private b f27222d;

    /* renamed from: e  reason: collision with root package name */
    private String f27223e;

    protected f(Parcel parcel) {
        this.f27219a = parcel.readInt();
        this.f27220b = parcel.readByte() != 0;
        this.f27221c = parcel.createStringArrayList();
        this.f27222d = (b) parcel.readParcelable(b.class.getClassLoader());
        this.f27223e = parcel.readString();
    }

    public f(String str, String str2, String str3, String str4) {
        this.f27223e = str;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.isNull("max_size")) {
                this.f27219a = jSONObject.getInt("max_size");
            }
            if (!jSONObject.isNull("wifi_upload")) {
                this.f27220b = jSONObject.getBoolean("wifi_upload");
            }
            if (!jSONObject.isNull("upload_files")) {
                JSONArray jSONArray = jSONObject.getJSONArray("upload_files");
                this.f27221c = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    this.f27221c.add(jSONArray.getString(i));
                }
            }
        } catch (JSONException e2) {
            DebugLogger.e("UploadLogMessage", "parse upload message error " + e2.getMessage());
        }
        this.f27222d = new b(str2, str3, str4);
    }

    public int a() {
        return this.f27219a;
    }

    public boolean b() {
        return this.f27220b;
    }

    public List<String> c() {
        return this.f27221c;
    }

    public b d() {
        return this.f27222d;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "UploadLogMessage{maxSize=" + this.f27219a + ", wifiUpload=" + this.f27220b + ", fileList=" + this.f27221c + ", controlMessage=" + this.f27222d + ", uploadMessage='" + this.f27223e + '\'' + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27219a);
        parcel.writeByte(this.f27220b ? (byte) 1 : 0);
        parcel.writeStringList(this.f27221c);
        parcel.writeParcelable(this.f27222d, i);
        parcel.writeString(this.f27223e);
    }
}

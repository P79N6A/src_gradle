package com.meizu.cloud.pushsdk.notification.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import org.json.JSONException;
import org.json.JSONObject;

public class NotifyType implements Parcelable {
    public static final Parcelable.Creator<NotifyType> CREATOR = new Parcelable.Creator<NotifyType>() {
        /* renamed from: a */
        public final NotifyType createFromParcel(Parcel parcel) {
            return new NotifyType(parcel);
        }

        /* renamed from: a */
        public final NotifyType[] newArray(int i) {
            return new NotifyType[i];
        }
    };
    public static final String LIGHTS = "l";
    public static final String NOTIFY_TYPE = "nt";
    public static final String SOUND = "s";
    public static final String TAG = "notify_type";
    public static final String VIBRATE = "v";
    boolean lights;
    boolean sound;
    boolean vibrate;

    public NotifyType() {
    }

    public NotifyType(Parcel parcel) {
        boolean z = false;
        this.vibrate = parcel.readByte() != 0;
        this.lights = parcel.readByte() != 0;
        this.sound = parcel.readByte() != 0 ? true : z;
    }

    public static NotifyType parse(String str) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException e2) {
                DebugLogger.e("notify_type", "parse json string error " + e2.getMessage());
            }
            return parse(jSONObject);
        }
        jSONObject = null;
        return parse(jSONObject);
    }

    public static NotifyType parse(JSONObject jSONObject) {
        NotifyType notifyType = new NotifyType();
        if (jSONObject != null) {
            try {
                boolean z = false;
                if (!jSONObject.isNull(VIBRATE)) {
                    notifyType.setVibrate(jSONObject.getInt(VIBRATE) != 0);
                }
                if (!jSONObject.isNull("l")) {
                    notifyType.setLights(jSONObject.getInt("l") != 0);
                }
                if (!jSONObject.isNull(SOUND)) {
                    if (jSONObject.getInt(SOUND) != 0) {
                        z = true;
                    }
                    notifyType.setSound(z);
                }
            } catch (JSONException e2) {
                DebugLogger.e("notify_type", "parse json obj error " + e2.getMessage());
            }
        } else {
            DebugLogger.e("notify_type", "no such tag notify_type");
        }
        return notifyType;
    }

    public int describeContents() {
        return 0;
    }

    public boolean isLights() {
        return this.lights;
    }

    public boolean isSound() {
        return this.sound;
    }

    public boolean isVibrate() {
        return this.vibrate;
    }

    public void setLights(boolean z) {
        this.lights = z;
    }

    public void setSound(boolean z) {
        this.sound = z;
    }

    public void setVibrate(boolean z) {
        this.vibrate = z;
    }

    public String toString() {
        return "NotifyType{vibrate=" + this.vibrate + ", lights=" + this.lights + ", sound=" + this.sound + '}';
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.vibrate ? (byte) 1 : 0);
        parcel.writeByte(this.lights ? (byte) 1 : 0);
        parcel.writeByte(this.sound ? (byte) 1 : 0);
    }
}

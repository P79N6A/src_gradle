package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class WsApi implements Parcelable {
    public static final Parcelable.Creator<WsApi> CREATOR = new Parcelable.Creator<WsApi>() {
        public final WsApi[] newArray(int i) {
            return new WsApi[i];
        }

        public final WsApi createFromParcel(Parcel parcel) {
            WsApi wsApi = new WsApi();
            wsApi.service = parcel.readInt();
            wsApi.method = parcel.readInt();
            return wsApi;
        }
    };
    int method;
    int service;

    public int describeContents() {
        return 0;
    }

    public int getMethod() {
        return this.method;
    }

    public int getService() {
        return this.service;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("service", this.service);
        jSONObject.put(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.method);
        return jSONObject;
    }

    public void setMethod(int i) {
        this.method = i;
    }

    public void setService(int i) {
        this.service = i;
    }

    public void parseFromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.service = jSONObject.optInt("service");
            this.method = jSONObject.optInt(PushConstants.MZ_PUSH_MESSAGE_METHOD);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.service);
        parcel.writeInt(this.method);
    }
}

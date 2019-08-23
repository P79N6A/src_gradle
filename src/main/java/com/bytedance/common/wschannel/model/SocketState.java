package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.wschannel.event.ChannelType;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public class SocketState implements Parcelable {
    public static final Parcelable.Creator<SocketState> CREATOR = new Parcelable.Creator<SocketState>() {
        public final SocketState[] newArray(int i) {
            return new SocketState[i];
        }

        public final SocketState createFromParcel(Parcel parcel) {
            return new SocketState(parcel);
        }
    };
    public int channelId;
    public int channelType;
    public int connectionState;
    public int connectionType;
    public String connectionUrl;
    public String error;
    public int errorCode;

    public int describeContents() {
        return 0;
    }

    public SocketState() {
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getConnectionState() {
        return this.connectionState;
    }

    public int getConnectionType() {
        return this.connectionType;
    }

    public String getConnectionUrl() {
        return this.connectionUrl;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public ChannelType getChannelType() {
        return ChannelType.of(this.channelType);
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("channel_id", this.channelId);
            jSONObject.put("type", this.connectionType);
            jSONObject.put("state", this.connectionState);
            jSONObject.put(PushConstants.WEB_URL, this.connectionUrl);
            jSONObject.put("channel_type", this.channelType);
            jSONObject.put("error", this.error);
            jSONObject.put("error_code", this.errorCode);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public String toString() {
        return "SocketState{connectionType=" + this.connectionType + ", connectionState=" + this.connectionState + ", connectionUrl='" + this.connectionUrl + '\'' + ", channelId=" + this.channelId + ", channelType=" + this.channelType + ", error='" + this.error + '\'' + '}';
    }

    public void setChannelId(int i) {
        this.channelId = i;
    }

    public void setConnectionState(int i) {
        this.connectionState = i;
    }

    public void setConnectionType(int i) {
        this.connectionType = i;
    }

    public void setConnectionUrl(String str) {
        this.connectionUrl = str;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    protected SocketState(Parcel parcel) {
        this.connectionType = parcel.readInt();
        this.connectionState = parcel.readInt();
        this.connectionUrl = parcel.readString();
        this.channelId = parcel.readInt();
        this.channelType = parcel.readInt();
        this.error = parcel.readString();
        this.errorCode = parcel.readInt();
    }

    public static SocketState fromJson(JSONObject jSONObject) {
        SocketState socketState = new SocketState();
        socketState.channelId = jSONObject.optInt("channel_id", Integer.MIN_VALUE);
        socketState.connectionType = jSONObject.optInt("type", -1);
        socketState.connectionState = jSONObject.optInt("state", -1);
        socketState.connectionUrl = jSONObject.optString(PushConstants.WEB_URL, "");
        socketState.channelType = jSONObject.optInt("channel_type");
        socketState.error = jSONObject.optString("error", "");
        socketState.errorCode = jSONObject.optInt("error_code");
        return socketState;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.connectionType);
        parcel.writeInt(this.connectionState);
        parcel.writeString(this.connectionUrl);
        parcel.writeInt(this.channelId);
        parcel.writeInt(this.channelType);
        parcel.writeString(this.error);
        parcel.writeInt(this.errorCode);
    }
}

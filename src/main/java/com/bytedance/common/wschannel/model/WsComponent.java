package com.bytedance.common.wschannel.model;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WsComponent implements Parcelable {
    public static final Parcelable.Creator<WsComponent> CREATOR = new Parcelable.Creator<WsComponent>() {
        public final WsComponent[] newArray(int i) {
            return new WsComponent[i];
        }

        public final WsComponent createFromParcel(Parcel parcel) {
            WsComponent wsComponent = new WsComponent();
            wsComponent.componentName = (ComponentName) parcel.readParcelable(getClass().getClassLoader());
            wsComponent.acceptApis = parcel.createTypedArrayList(WsApi.CREATOR);
            return wsComponent;
        }
    };
    List<WsApi> acceptApis;
    ComponentName componentName;

    public int describeContents() {
        return 0;
    }

    public List<WsApi> getAcceptApis() {
        return this.acceptApis;
    }

    public ComponentName getComponentName() {
        return this.componentName;
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (this.componentName != null) {
            jSONObject.put("package_name", this.componentName.getPackageName());
            jSONObject.put("class_name", this.componentName.getClassName());
        }
        if (this.acceptApis != null && this.acceptApis.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (WsApi json : this.acceptApis) {
                jSONArray.put(json.toJson());
            }
            jSONObject.put("accept_services", jSONArray);
        }
        return jSONObject;
    }

    public void setAcceptApis(List<WsApi> list) {
        this.acceptApis = list;
    }

    public void setComponentName(ComponentName componentName2) {
        this.componentName = componentName2;
    }

    public void parseFromJson(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("package_name");
            String optString2 = jSONObject.optString("class_name");
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                this.componentName = new ComponentName(optString, optString2);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("accept_services");
            if (optJSONArray != null) {
                this.acceptApis = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    WsApi wsApi = new WsApi();
                    wsApi.parseFromJson(optJSONArray.optJSONObject(i));
                    this.acceptApis.add(wsApi);
                }
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.componentName, i);
        parcel.writeTypedList(this.acceptApis);
    }
}

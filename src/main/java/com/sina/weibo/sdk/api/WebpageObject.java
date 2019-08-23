package com.sina.weibo.sdk.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class WebpageObject extends BaseMediaObject {
    public static final Parcelable.Creator<WebpageObject> CREATOR = new Parcelable.Creator<WebpageObject>() {
        public WebpageObject[] newArray(int i) {
            return new WebpageObject[i];
        }

        public WebpageObject createFromParcel(Parcel parcel) {
            return new WebpageObject(parcel);
        }
    };
    public String defaultText;

    public int getObjType() {
        return 5;
    }

    public WebpageObject() {
    }

    public boolean checkArgs() {
        if (!super.checkArgs()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public String toExtraMediaString() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(this.defaultText)) {
                jSONObject.put("extra_key_defaulttext", this.defaultText);
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public WebpageObject(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public BaseMediaObject toExtraMediaObject(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.defaultText = new JSONObject(str).optString("extra_key_defaulttext");
            } catch (JSONException unused) {
            }
        }
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }
}

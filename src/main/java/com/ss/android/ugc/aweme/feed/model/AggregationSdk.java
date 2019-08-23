package com.ss.android.ugc.aweme.feed.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class AggregationSdk implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("common_data")
    private Object commonData;

    public JSONObject getCommonData() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 41367, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 41367, new Class[0], JSONObject.class);
        }
        try {
            return new JSONObject(new Gson().toJson(this.commonData));
        } catch (JSONException unused) {
            return null;
        }
    }
}

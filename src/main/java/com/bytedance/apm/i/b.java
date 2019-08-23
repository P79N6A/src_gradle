package com.bytedance.apm.i;

import android.text.TextUtils;
import com.bytedance.apm.f.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    public static JSONObject a(JSONObject jSONObject, f fVar) throws JSONException {
        if (fVar == null) {
            return jSONObject;
        }
        if (!TextUtils.isEmpty(fVar.f1990b)) {
            jSONObject.put("version_code", fVar.f1990b);
        }
        if (!TextUtils.isEmpty(fVar.f1991c)) {
            jSONObject.put("version_name", fVar.f1991c);
        }
        if (!TextUtils.isEmpty(fVar.f1992d)) {
            jSONObject.put("manifest_version_code", fVar.f1992d);
        }
        if (!TextUtils.isEmpty(fVar.f1993e)) {
            jSONObject.put("update_version_code", fVar.f1993e);
        }
        if (!TextUtils.isEmpty(fVar.f1994f)) {
            jSONObject.put("app_version", fVar.f1994f);
        }
        return jSONObject;
    }
}

package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.cloud.CloudImage;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class f<T, V> extends b<T, V> {
    public Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Search 6.1.0");
        hashMap.put("X-INFO", bi.a(this.f6444d));
        hashMap.put("platinfo", String.format("platform=Android&sdkversion=%s&product=%s", new Object[]{"6.1.0", "cloud"}));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public boolean e(String str) {
        if (str == null || str.equals("") || str.equals("[]")) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public CloudItemDetail a(JSONObject jSONObject) throws JSONException {
        CloudItemDetail cloudItemDetail = new CloudItemDetail(p.a(jSONObject, "_id"), p.b(jSONObject, "_location"), p.a(jSONObject, "_name"), p.a(jSONObject, "_address"));
        cloudItemDetail.setCreatetime(p.a(jSONObject, "_createtime"));
        cloudItemDetail.setUpdatetime(p.a(jSONObject, "_updatetime"));
        if (jSONObject.has("_distance")) {
            String optString = jSONObject.optString("_distance");
            if (!e(optString)) {
                cloudItemDetail.setDistance(Integer.parseInt(optString));
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("_image");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            cloudItemDetail.setmCloudImage(arrayList);
            return cloudItemDetail;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            arrayList.add(new CloudImage(p.a(jSONObject2, "_id"), p.a(jSONObject2, "_preurl"), p.a(jSONObject2, "_url")));
        }
        cloudItemDetail.setmCloudImage(arrayList);
        return cloudItemDetail;
    }

    public f(Context context, T t) {
        super(context, t);
    }

    /* access modifiers changed from: protected */
    public void a(CloudItem cloudItem, JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        if (keys != null) {
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !next.toString().startsWith("_")) {
                    hashMap.put(next.toString(), jSONObject.optString(next.toString()));
                }
            }
            cloudItem.setCustomfield(hashMap);
        }
    }
}

package com.bytedance.im.core.b.e;

import android.text.TextUtils;
import com.bytedance.im.core.d.n;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static n a(n nVar) {
        JSONObject jSONObject;
        if (nVar == null || nVar.getAttachments() == null || nVar.getAttachments().isEmpty()) {
            return nVar;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (com.bytedance.im.core.d.a next : nVar.getAttachments()) {
            if (!TextUtils.isEmpty(next.getDisplayType())) {
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("length", next.getLength());
                    jSONObject3.put("md5", next.getHash());
                    jSONObject3.put("mime", next.getMimeType());
                    jSONObject3.put("remoteURL", next.getRemoteUrl());
                    jSONObject3.put("displayType", next.getDisplayType());
                    jSONObject3.put("type", next.getType());
                    jSONObject3.put("ext", b.b(next.getExt()));
                    jSONObject2.put(next.getDisplayType(), jSONObject3);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            if (TextUtils.isEmpty(nVar.getContent())) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(nVar.getContent());
            }
            jSONObject.put("__files", jSONObject2);
            nVar.setContent(jSONObject.toString());
        } catch (JSONException unused2) {
        }
        return nVar;
    }

    public static n b(n nVar) {
        if (TextUtils.isEmpty(nVar.getContent())) {
            return nVar;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject optJSONObject = new JSONObject(nVar.getContent()).optJSONObject("__files");
            if (optJSONObject == null) {
                return nVar;
            }
            Iterator<String> keys = optJSONObject.keys();
            int i = 0;
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject jSONObject = optJSONObject.getJSONObject(next);
                com.bytedance.im.core.d.a aVar = new com.bytedance.im.core.d.a();
                aVar.setMsgUuid(nVar.getUuid());
                aVar.setDisplayType(next);
                aVar.setLength(jSONObject.optLong("length"));
                aVar.setHash(jSONObject.optString("md5"));
                aVar.setMimeType(jSONObject.optString("mime"));
                aVar.setRemoteUrl(jSONObject.optString("remoteURL"));
                aVar.setType(jSONObject.optString("type"));
                aVar.setIndex(i);
                aVar.setStatus(1);
                aVar.setExt(b.a(optJSONObject.optJSONObject("ext")));
                arrayList.add(aVar);
                i++;
            }
            if (!arrayList.isEmpty()) {
                nVar.setAttachments(arrayList);
            }
            return nVar;
        } catch (JSONException unused) {
        }
    }
}

package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class ag extends a<String, String> {
    private String i;

    public String i() {
        return i.d();
    }

    public Map<String, String> d() {
        byte[] bArr;
        StringBuilder sb = new StringBuilder();
        sb.append("channel=open_api&flag=1");
        sb.append("&address=" + URLEncoder.encode(this.i));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("open_api1");
        stringBuffer.append(this.i);
        stringBuffer.append("@8UbJH6N2szojnTHONAWzB6K7N1kaj7Y0iUMarxac");
        String b2 = bl.b(stringBuffer.toString());
        sb.append("&sign=");
        sb.append(b2.toUpperCase(Locale.US));
        sb.append("&output=json");
        try {
            bArr = ao.a(sb.toString().getBytes("utf-8"), "Yaynpa84IKOfasFx".substring(0, 16).getBytes("utf-8"));
        } catch (UnsupportedEncodingException e2) {
            j.a(e2, "ShareUrlSearchHandler", "getParams");
            bArr = null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ent", PushConstants.PUSH_TYPE_UPLOAD_LOG);
        hashMap.put("in", bk.b(bArr));
        hashMap.put("keyt", "openapi");
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String a(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String a2 = p.a(jSONObject, "code");
            String a3 = p.a(jSONObject, "message");
            if (PushConstants.PUSH_TYPE_THROUGH_MESSAGE.equals(a2)) {
                return p.a(jSONObject, "transfer_url");
            }
            if (PushConstants.PUSH_TYPE_NOTIFY.equals(a2)) {
                throw new AMapException("其他未知错误", 0, a3);
            } else if (PushConstants.PUSH_TYPE_UPLOAD_LOG.equals(a2)) {
                throw new AMapException("短串请求失败", 0, a3);
            } else if ("3".equals(a2)) {
                throw new AMapException("请求参数非法", 0, a3);
            } else if (PushConstants.PUSH_TYPE_WITHDRAW_NOTIFICATION.equals(a2)) {
                throw new AMapException("用户签名未通过", 0, a3);
            } else if (!"5".equals(a2)) {
                return null;
            } else {
                throw new AMapException("短串分享认证失败", 0, a3);
            }
        } catch (JSONException e2) {
            j.a(e2, "ShareUrlSearchHandler", "paseJSON");
        }
    }

    public ag(Context context, String str) {
        super(context, str);
        this.i = str;
    }

    /* access modifiers changed from: protected */
    public byte[] a(int i2, df dfVar, dg dgVar) throws be {
        if (i2 == 1) {
            return dfVar.d(dgVar);
        }
        if (i2 == 2) {
            return dfVar.e(dgVar);
        }
        return null;
    }
}

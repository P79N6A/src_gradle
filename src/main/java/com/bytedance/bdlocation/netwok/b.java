package com.bytedance.bdlocation.netwok;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.google.gson.JsonObject;

public final class b {
    public static String a() {
        String baseUrl = BDLocationConfig.getBaseUrl();
        if (!TextUtils.isEmpty(baseUrl)) {
            return baseUrl;
        }
        return "http://i.snssdk.com";
    }

    public static String a(JsonObject jsonObject) {
        try {
            byte[] bytes = jsonObject.toString().getBytes("utf-8");
            int length = bytes.length;
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (bytes[i] ^ -99);
            }
            return Base64.encodeToString(bytes, 10);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public static String a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            byte[] decode = Base64.decode(str, 2);
            int length = decode.length;
            for (int i = 0; i < length; i++) {
                decode[i] = (byte) (decode[i] ^ -99);
            }
            return new String(decode);
        } catch (Exception unused) {
            return null;
        }
    }
}

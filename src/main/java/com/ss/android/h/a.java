package com.ss.android.h;

import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;
import org.json.JSONObject;

public interface a {
    String a(int i, String str, byte[] bArr, NetworkUtils.CompressType compressType, String str2) throws Exception;

    String a(String str, boolean z);

    boolean a(JSONObject jSONObject) throws JSONException;
}

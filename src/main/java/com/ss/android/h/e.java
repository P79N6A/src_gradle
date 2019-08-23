package com.ss.android.h;

import com.bytedance.common.utility.NetworkUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements a {

    /* renamed from: b  reason: collision with root package name */
    private static e f29121b = new e();

    /* renamed from: a  reason: collision with root package name */
    public a f29122a;

    public static e a() {
        return f29121b;
    }

    public final boolean a(JSONObject jSONObject) throws JSONException {
        if (this.f29122a != null) {
            return this.f29122a.a(jSONObject);
        }
        return false;
    }

    public final String a(String str, boolean z) {
        if (this.f29122a != null) {
            return this.f29122a.a(str, z);
        }
        return null;
    }

    public final String a(int i, String str, byte[] bArr, NetworkUtils.CompressType compressType, String str2) throws Exception {
        if (this.f29122a != null) {
            return this.f29122a.a(i, str, bArr, compressType, str2);
        }
        return null;
    }
}

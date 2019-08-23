package com.amap.api.mapcore2d;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class df extends ev {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f5944a;

    /* renamed from: b  reason: collision with root package name */
    private String f5945b = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;

    public Map<String, String> f() {
        return null;
    }

    public byte[] a_() {
        return this.f5944a;
    }

    private String b() {
        byte[] a2 = cz.a(db.f5921a);
        byte[] bArr = new byte[(a2.length + 50)];
        System.arraycopy(this.f5944a, 0, bArr, 0, 50);
        System.arraycopy(a2, 0, bArr, 50, a2.length);
        return cv.a(bArr);
    }

    public Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f5944a.length));
        return hashMap;
    }

    public String g() {
        return String.format(db.f5922b, new Object[]{PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.f5945b, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "open", b()});
    }

    public df(byte[] bArr) {
        this.f5944a = (byte[]) bArr.clone();
    }

    public df(byte[] bArr, String str) {
        this.f5944a = (byte[]) bArr.clone();
        this.f5945b = str;
    }
}

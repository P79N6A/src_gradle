package com.amap.api.services.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public class bz extends dg {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f6675a;

    /* renamed from: b  reason: collision with root package name */
    private String f6676b = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;

    public Map<String, String> d() {
        return null;
    }

    public byte[] h() {
        return this.f6675a;
    }

    private String a() {
        byte[] a2 = bo.a(bv.f6659b);
        byte[] bArr = new byte[(a2.length + 50)];
        System.arraycopy(this.f6675a, 0, bArr, 0, 50);
        System.arraycopy(a2, 0, bArr, 50, a2.length);
        return bl.a(bArr);
    }

    public Map<String, String> e() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f6675a.length));
        return hashMap;
    }

    public String i() {
        return String.format(bo.c(bv.f6660c), new Object[]{PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.f6676b, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "open", a()});
    }

    public bz(byte[] bArr, String str) {
        this.f6675a = (byte[]) bArr.clone();
        this.f6676b = str;
    }
}

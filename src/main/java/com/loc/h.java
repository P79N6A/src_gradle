package com.loc;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;

public final class h extends al {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f25826a;

    /* renamed from: b  reason: collision with root package name */
    private String f25827b = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;

    public h(byte[] bArr, String str) {
        this.f25826a = (byte[]) bArr.clone();
        this.f25827b = str;
    }

    public final Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put("Content-Type", "application/zip");
        hashMap.put("Content-Length", String.valueOf(this.f25826a.length));
        return hashMap;
    }

    public final Map<String, String> b() {
        return null;
    }

    public final String c() {
        String c2 = di.c(d.f25770c);
        byte[] a2 = di.a(d.f25769b);
        byte[] bArr = new byte[(a2.length + 50)];
        System.arraycopy(this.f25826a, 0, bArr, 0, 50);
        System.arraycopy(a2, 0, bArr, 50, a2.length);
        return String.format(c2, new Object[]{PushConstants.PUSH_TYPE_THROUGH_MESSAGE, this.f25827b, PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "open", de.a(bArr)});
    }

    public final byte[] d() {
        return this.f25826a;
    }
}

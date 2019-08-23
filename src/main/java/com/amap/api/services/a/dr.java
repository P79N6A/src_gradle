package com.amap.api.services.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class dr extends dx {

    /* renamed from: a  reason: collision with root package name */
    ByteArrayOutputStream f6844a = new ByteArrayOutputStream();

    public dr() {
    }

    public void b(byte[] bArr) {
        try {
            this.f6844a.write(bArr);
        } catch (Throwable unused) {
        }
    }

    public dr(dx dxVar) {
        super(dxVar);
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) {
        this.f6844a.toByteArray();
        try {
            this.f6844a.close();
        } catch (IOException unused) {
        }
        this.f6844a = new ByteArrayOutputStream();
        return new byte[0];
    }
}

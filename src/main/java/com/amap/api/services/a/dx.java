package com.amap.api.services.a;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public abstract class dx {

    /* renamed from: c  reason: collision with root package name */
    dx f6855c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f6856d;

    /* access modifiers changed from: protected */
    public abstract byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

    public void b(byte[] bArr) {
    }

    dx() {
    }

    public byte[] a() throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        byte[] a2 = a(this.f6856d);
        if (this.f6855c == null) {
            return a2;
        }
        this.f6855c.c(a2);
        return this.f6855c.a();
    }

    /* access modifiers changed from: package-private */
    public void c(byte[] bArr) {
        this.f6856d = bArr;
    }

    dx(dx dxVar) {
        this.f6855c = dxVar;
    }
}

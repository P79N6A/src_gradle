package com.tencent.bugly.proguard;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public final class af implements ag {

    /* renamed from: a  reason: collision with root package name */
    private String f79405a;

    public final void a(String str) {
        if (str != null) {
            this.f79405a = str;
        }
    }

    public final byte[] a(byte[] bArr) throws Exception {
        if (this.f79405a == null || bArr == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        instance.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f79405a.getBytes("UTF-8"))), new IvParameterSpec(this.f79405a.getBytes("UTF-8")));
        return instance.doFinal(bArr);
    }

    public final byte[] b(byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (this.f79405a == null || bArr == null) {
            return null;
        }
        Cipher instance = Cipher.getInstance("DES/CBC/PKCS5Padding");
        instance.init(1, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f79405a.getBytes("UTF-8"))), new IvParameterSpec(this.f79405a.getBytes("UTF-8")));
        return instance.doFinal(bArr);
    }
}

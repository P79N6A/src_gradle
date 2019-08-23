package com.loc;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public abstract class bd {

    /* renamed from: c  reason: collision with root package name */
    bd f25517c;

    /* renamed from: d  reason: collision with root package name */
    byte[] f25518d;

    bd() {
    }

    bd(bd bdVar) {
        this.f25517c = bdVar;
    }

    public final byte[] a() throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        bd bdVar = this;
        while (true) {
            byte[] a2 = bdVar.a(bdVar.f25518d);
            if (bdVar.f25517c == null) {
                return a2;
            }
            bdVar.f25517c.f25518d = a2;
            bdVar = bdVar.f25517c;
        }
    }

    /* access modifiers changed from: protected */
    public abstract byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException;

    public void b(byte[] bArr) {
    }
}

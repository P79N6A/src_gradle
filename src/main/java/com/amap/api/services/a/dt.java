package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class dt extends dx {

    /* renamed from: a  reason: collision with root package name */
    private Context f6846a;

    /* renamed from: b  reason: collision with root package name */
    private String f6847b;

    /* renamed from: e  reason: collision with root package name */
    private br f6848e;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f6849f;

    private String a(Context context) {
        try {
            return String.format(bo.c(this.f6847b), this.f6849f);
        } catch (Throwable th) {
            ca.c(th, "ofm", "gpj");
            return "";
        }
    }

    private String b(Context context) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        return bo.a(this.f6848e.b(bo.a(a(context))));
    }

    /* access modifiers changed from: protected */
    public byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        String a2 = bo.a(bArr);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String b2 = b(this.f6846a);
        return bo.a("{\"pinfo\":\"" + b2 + "\",\"els\":[" + a2 + "]}");
    }

    public dt(Context context, dx dxVar, br brVar, String str, Object... objArr) {
        super(dxVar);
        this.f6846a = context;
        this.f6847b = str;
        this.f6848e = brVar;
        this.f6849f = objArr;
    }
}

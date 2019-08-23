package com.loc;

import android.content.Context;
import android.text.TextUtils;
import com.google.a.a.a.a.a.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public final class az extends bd {

    /* renamed from: a  reason: collision with root package name */
    private Context f25508a;

    /* renamed from: b  reason: collision with root package name */
    private String f25509b;

    /* renamed from: e  reason: collision with root package name */
    private dm f25510e;

    /* renamed from: f  reason: collision with root package name */
    private Object[] f25511f;

    public az(Context context, bd bdVar, dm dmVar, String str, Object... objArr) {
        super(bdVar);
        this.f25508a = context;
        this.f25509b = str;
        this.f25510e = dmVar;
        this.f25511f = objArr;
    }

    private String b() {
        try {
            return String.format(di.c(this.f25509b), this.f25511f);
        } catch (Throwable th) {
            a.b(th);
            i.b(th, "ofm", "gpj");
            return "";
        }
    }

    /* access modifiers changed from: protected */
    public final byte[] a(byte[] bArr) throws CertificateException, NoSuchAlgorithmException, IOException, BadPaddingException, IllegalBlockSizeException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException {
        String a2 = di.a(bArr);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        String a3 = di.a(this.f25510e.b(di.a(b())));
        return di.a("{\"pinfo\":\"" + a3 + "\",\"els\":[" + a2 + "]}");
    }
}

package com.cmic.sso.sdk.d;

import com.cmic.sso.sdk.d.a.a;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23079a = "l";

    /* renamed from: d  reason: collision with root package name */
    private static l f23080d;

    /* renamed from: b  reason: collision with root package name */
    private PublicKey f23081b;

    /* renamed from: c  reason: collision with root package name */
    private PrivateKey f23082c;

    public static l a() {
        if (f23080d == null) {
            f23080d = new l();
        }
        return f23080d;
    }

    private l() {
        try {
            if (this.f23081b == null) {
                b();
            }
            if (this.f23082c == null) {
                c();
            }
        } catch (Exception unused) {
        }
    }

    private void b() throws Exception {
        try {
            this.f23081b = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(new a().a("MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC/YHP9utFGOhGk7Xf5L7jOgQz5\nv2JKxdrIE3yzYsHoZJwzKC7Ttx380UZmBFzr5I1k6FFMn/YGXd4ts6UHT/nzsCIc\ngZlTTem7Pjdm1V9bJgQ6iQvFHsvT+vNgJ3wAIRd+iCMXm8y96yZhD2+SH5odBYS2\nZzwTYXBQDvB/rTfdjwIDAQAB")));
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }

    private void c() throws Exception {
        try {
            this.f23082c = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(new a().a("MIICXgIBAAKBgQCkzAyTd86uiPMkvwGPevdr77TnoCAfpuruO5c6XnbcbaMevG3r\nPN6Dzx4OXVx7wYXoXG4rnjD8/qoIutmpS71CuafyhqGhqdsTMKKL7njWvn0KWbdL\nBl6croB68tFbAnIU8Nf95bHm1MW366riPKiN4yOgI+ig9qa4/lFFgH1RjQIDAQAB\nAoGBAIC5wrkORKug3gw+BwIEk3AEddLYCT+wKqKceaxmTYIxQdGoblPp4AYlqtyd\noLgqmma+jHAVyT5VzouzKIJNXy+WqahMN3vmLIt7ois7Vpt6131eI5uapWVNUN7+\nYv+u4FlvGiJIlKsmLJweIbAqVNOCOmJzP6ycgpxR8qDUSwYBAkEA1USGJq/3CLE4\ncXV6QraWWdHiwo6xk/8E6M+xv3IyMG8CdycgCl2Het/XAFdng1sX1P1ezIGrHVz1\nBhyt+7imnQJBAMXRPuX3Tov/esVZSBeGxKWLOoZ4mmpoPAY603Ir680rzAbvY7Q/\nq6s7XEjpZC4iyQhwZ0d4FW7LnyQY+UJg67ECQQCDPKS03+nLnorWPu2aahOBeEfr\nY7XhFbhmr5B4+APsjBNfUWNFHaMGOQJsQlz/lynGNpiEjnLHIfHh7foegdV9AkEA\nqDETE6BELpBYKHeS7j3t8PsCFddxI0vgzUMzCP4DDX1Rigv8cAM6yOo9utiGDxwQ\nZZZ8ma2mO3/xnVWGiUOy4QJAO3undOfAICj7yg0L/SqlXZ5VgeYr0mP1Y+yn5Ng3\ne6AxVJJ6wXQRkLEhmVTogfJFmQKXYeAoqNoMHkxtwJCTOQ==\n")));
        } catch (IOException unused) {
            throw new Exception("公钥数据流读取错误");
        } catch (NullPointerException unused2) {
            throw new Exception("公钥输入流为空");
        }
    }

    public String a(String str) {
        if (this.f23081b == null) {
            f.a(f23079a, "mServerPublicKey == null");
            return null;
        }
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, this.f23081b);
            return p.a(instance.doFinal(str.getBytes("UTF-8")));
        } catch (Exception unused) {
            return null;
        }
    }
}

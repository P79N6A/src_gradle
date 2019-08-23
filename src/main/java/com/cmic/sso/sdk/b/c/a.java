package com.cmic.sso.sdk.b.c;

import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;

public class a {

    /* renamed from: c  reason: collision with root package name */
    private static String f23033c = "";

    /* renamed from: a  reason: collision with root package name */
    private X509Certificate f23034a;

    /* renamed from: b  reason: collision with root package name */
    private SSLContext f23035b;

    public SSLContext a() {
        return this.f23035b;
    }

    public a() {
        b();
        try {
            KeyStore instance = KeyStore.getInstance(KeyStore.getDefaultType());
            instance.load(null, null);
            instance.setCertificateEntry("cert", this.f23034a);
            TrustManagerFactory instance2 = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance2.init(instance);
            this.f23035b = SSLContext.getInstance("SSL");
            this.f23035b.init(null, instance2.getTrustManagers(), null);
        } catch (IOException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031 A[SYNTHETIC, Splitter:B:18:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037 A[SYNTHETIC, Splitter:B:24:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b() {
        /*
            r5 = this;
            java.security.cert.X509Certificate r0 = r5.f23034a
            if (r0 != 0) goto L_0x003b
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = f23033c     // Catch:{ CertificateException -> 0x0035, all -> 0x002b }
            byte[] r2 = r2.getBytes()     // Catch:{ CertificateException -> 0x0035, all -> 0x002b }
            r3 = 0
            byte[] r2 = android.util.Base64.decode(r2, r3)     // Catch:{ CertificateException -> 0x0035, all -> 0x002b }
            r1.<init>(r2)     // Catch:{ CertificateException -> 0x0035, all -> 0x002b }
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch:{ CertificateException -> 0x0029, all -> 0x0027 }
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch:{ CertificateException -> 0x0029, all -> 0x0027 }
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0     // Catch:{ CertificateException -> 0x0029, all -> 0x0027 }
            r5.f23034a = r0     // Catch:{ CertificateException -> 0x0029, all -> 0x0027 }
            r1.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            return
        L_0x0027:
            r0 = move-exception
            goto L_0x002f
        L_0x0029:
            r0 = r1
            goto L_0x0035
        L_0x002b:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ IOException -> 0x0034 }
        L_0x0034:
            throw r0
        L_0x0035:
            if (r0 == 0) goto L_0x003b
            r0.close()     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            return
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmic.sso.sdk.b.c.a.b():void");
    }

    public static void a(String str) {
        f23033c = str;
    }
}

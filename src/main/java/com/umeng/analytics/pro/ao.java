package com.umeng.analytics.pro;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public class ao implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    X509TrustManager f80373a;

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.f80373a.getAcceptedIssuers();
    }

    public ao() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            for (int i = 0; i < trustManagers.length; i++) {
                if (trustManagers[i] instanceof X509TrustManager) {
                    this.f80373a = (X509TrustManager) trustManagers[i];
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        try {
            this.f80373a.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException unused) {
        }
    }
}

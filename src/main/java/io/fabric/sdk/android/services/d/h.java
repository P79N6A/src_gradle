package io.fabric.sdk.android.services.d;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    final KeyStore f83289a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Principal, X509Certificate> f83290b;

    public final boolean a(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = this.f83290b.get(x509Certificate.getSubjectX500Principal());
        if (x509Certificate2 == null || !x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey())) {
            return false;
        }
        return true;
    }

    public final X509Certificate b(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = this.f83290b.get(x509Certificate.getIssuerX500Principal());
        if (x509Certificate2 == null || x509Certificate2.getSubjectX500Principal().equals(x509Certificate.getSubjectX500Principal())) {
            return null;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return x509Certificate2;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static HashMap<Principal, X509Certificate> a(KeyStore keyStore) {
        try {
            HashMap<Principal, X509Certificate> hashMap = new HashMap<>();
            Enumeration<String> aliases = keyStore.aliases();
            while (aliases.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) keyStore.getCertificate(aliases.nextElement());
                if (x509Certificate != null) {
                    hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                }
            }
            return hashMap;
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public h(InputStream inputStream, String str) {
        KeyStore a2 = a(inputStream, str);
        this.f83290b = a(a2);
        this.f83289a = a2;
    }

    private static KeyStore a(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        try {
            KeyStore instance = KeyStore.getInstance("BKS");
            bufferedInputStream = new BufferedInputStream(inputStream);
            instance.load(bufferedInputStream, str.toCharArray());
            bufferedInputStream.close();
            return instance;
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        } catch (CertificateException e4) {
            throw new AssertionError(e4);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }
}

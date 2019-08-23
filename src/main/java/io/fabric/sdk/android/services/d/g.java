package io.fabric.sdk.android.services.d;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class g implements X509TrustManager {

    /* renamed from: a  reason: collision with root package name */
    private static final X509Certificate[] f83283a = new X509Certificate[0];

    /* renamed from: b  reason: collision with root package name */
    private final TrustManager[] f83284b;

    /* renamed from: c  reason: collision with root package name */
    private final h f83285c;

    /* renamed from: d  reason: collision with root package name */
    private final long f83286d;

    /* renamed from: e  reason: collision with root package name */
    private final List<byte[]> f83287e = new LinkedList();

    /* renamed from: f  reason: collision with root package name */
    private final Set<X509Certificate> f83288f = Collections.synchronizedSet(new HashSet());

    public final X509Certificate[] getAcceptedIssuers() {
        return f83283a;
    }

    private static TrustManager[] a(h hVar) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(hVar.f83289a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (KeyStoreException e3) {
            throw new AssertionError(e3);
        }
    }

    private boolean a(X509Certificate x509Certificate) throws CertificateException {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.f83287e) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (NoSuchAlgorithmException e2) {
            throw new CertificateException(e2);
        }
    }

    private static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        throw new CertificateException("Client certificates not supported!");
    }

    public g(h hVar, f fVar) {
        this.f83284b = a(hVar);
        this.f83285c = hVar;
        this.f83286d = fVar.getPinCreationTimeInMillis();
        for (String a2 : fVar.getPins()) {
            this.f83287e.add(a(a2));
        }
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        if (!this.f83288f.contains(x509CertificateArr[0])) {
            for (TrustManager trustManager : this.f83284b) {
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
            }
            if (this.f83286d == -1 || System.currentTimeMillis() - this.f83286d <= 15552000000L) {
                X509Certificate[] a2 = a.a(x509CertificateArr, this.f83285c);
                int length = a2.length;
                int i = 0;
                while (i < length) {
                    if (!a(a2[i])) {
                        i++;
                    }
                }
                throw new CertificateException("No valid pins found in chain!");
            }
            StringBuilder sb = new StringBuilder("Certificate pins are stale, (");
            sb.append(System.currentTimeMillis() - this.f83286d);
            sb.append(" millis vs 15552000000");
            sb.append(" millis) falling back to system trust.");
            this.f83288f.add(x509CertificateArr[0]);
        }
    }
}

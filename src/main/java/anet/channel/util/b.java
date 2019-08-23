package anet.channel.util;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class b {
    public static final HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new a();
    public static final SSLSocketFactory TRUST_ALL_SSL_SOCKET_FACTORY = C0002b.a();

    /* renamed from: a  reason: collision with root package name */
    static SSLSocketFactory f1435a;

    /* renamed from: b  reason: collision with root package name */
    static HostnameVerifier f1436b;

    static class a implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }

        private a() {
        }
    }

    /* renamed from: anet.channel.util.b$b  reason: collision with other inner class name */
    static class C0002b {

        /* renamed from: anet.channel.util.b$b$a */
        static class a implements X509TrustManager {
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            private a() {
            }
        }

        private C0002b() {
        }

        public static SSLSocketFactory a() {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init(null, new TrustManager[]{new a()}, null);
                return instance.getSocketFactory();
            } catch (Throwable th) {
                ALog.w("awcn.SSLTrustAllSocketFactory", "getSocketFactory error :" + th.getMessage(), null, new Object[0]);
                return null;
            }
        }
    }

    public static SSLSocketFactory a() {
        return f1435a;
    }

    public static HostnameVerifier b() {
        return f1436b;
    }

    public static void a(HostnameVerifier hostnameVerifier) {
        f1436b = hostnameVerifier;
    }

    public static void a(SSLSocketFactory sSLSocketFactory) {
        f1435a = sSLSocketFactory;
    }
}

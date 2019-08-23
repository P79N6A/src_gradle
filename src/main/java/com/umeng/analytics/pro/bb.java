package com.umeng.analytics.pro;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.ssl.SSLSocketFactory;

public class bb extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    SSLContext f80420a = SSLContext.getInstance("TLS");

    public Socket createSocket() throws IOException {
        return this.f80420a.getSocketFactory().createSocket();
    }

    public bb(KeyStore keyStore) throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException {
        super(keyStore);
        try {
            AnonymousClass1 r4 = new ao() {
            };
            this.f80420a.init(null, new TrustManager[]{r4}, null);
        } catch (Throwable unused) {
        }
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException, UnknownHostException {
        return this.f80420a.getSocketFactory().createSocket(socket, str, i, z);
    }
}

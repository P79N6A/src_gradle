package com.meizu.cloud.pushsdk.b.h;

import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Environment;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.base.a.d;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class a extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private String f27030a = "TlsSessionTicket";

    /* renamed from: b  reason: collision with root package name */
    private SSLSocketFactory f27031b;

    public a(Context context) {
        SSLSessionCache sSLSessionCache;
        try {
            SSLContext sSLContext = SSLContext.getDefault();
            try {
                sSLSessionCache = new SSLSessionCache(new File(Environment.getExternalStorageDirectory(), "sslCache"));
            } catch (IOException e2) {
                DebugLogger.e(this.f27030a, e2.getMessage());
                sSLSessionCache = new SSLSessionCache(context);
            }
            d a2 = com.meizu.cloud.pushsdk.base.a.a.a((Object) sSLSessionCache).a("install", SSLSessionCache.class, SSLContext.class).a((Object) sSLSessionCache, sSLSessionCache, sSLContext);
            String str = this.f27030a;
            DebugLogger.i(str, "install tls session cache " + a2.f27048a);
            this.f27031b = sSLContext.getSocketFactory();
        } catch (Exception e3) {
            DebugLogger.e(this.f27030a, e3.getMessage());
            this.f27031b = (SSLSocketFactory) SSLSocketFactory.getDefault();
        }
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            d a2 = com.meizu.cloud.pushsdk.base.a.a.a((Object) socket).a("setUseSessionTickets", Boolean.TYPE).a((Object) socket, Boolean.TRUE);
            String str = this.f27030a;
            DebugLogger.i(str, "set ssl session ticket support " + a2.f27048a);
        }
        return socket;
    }

    public Socket createSocket(String str, int i) throws IOException {
        return a(this.f27031b.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return a(this.f27031b.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return a(this.f27031b.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return a(this.f27031b.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return a(this.f27031b.createSocket(socket, str, i, z));
    }

    public String[] getDefaultCipherSuites() {
        return this.f27031b.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f27031b.getSupportedCipherSuites();
    }
}
